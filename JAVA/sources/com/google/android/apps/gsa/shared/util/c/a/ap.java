package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.b.fl;
import com.google.common.b.mw;
import com.google.common.b.nx;
import com.google.common.b.oo;
import com.google.common.base.at;
import com.google.common.base.ca;
import com.google.common.o.bl;
import com.google.common.o.br;
import com.google.common.o.cc;
import com.google.common.o.qn;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/ap.class */
public final class ap implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1516a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.c.a.ap");
    private final com.google.android.libraries.g.a b;
    private final String c;
    private final String d;
    private final at e;
    private final ca f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final Object k;
    private final Set l;
    private final ah[] m;
    private int n;
    private long o;
    private long p;
    private int q;
    private int r;
    private int s;

    public ap(com.google.android.libraries.g.a aVar, at atVar) {
        this.k = new Object();
        this.l = Collections.newSetFromMap(new IdentityHashMap());
        this.m = new ah[100];
        this.n = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.c = "User-Facing Blocking";
        this.d = "UserFacingBlocking";
        this.b = aVar;
        this.h = false;
        this.i = 5;
        this.j = 25;
        this.e = atVar;
        this.g = false;
        this.f = null;
    }

    public ap(String str, ca caVar, boolean z, com.google.android.libraries.g.a aVar) {
        this.k = new Object();
        this.l = Collections.newSetFromMap(new IdentityHashMap());
        this.m = new ah[100];
        this.n = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.c = str;
        this.e = at.k(1);
        this.f = caVar;
        this.g = z;
        this.b = aVar;
        this.h = true;
        this.i = 10;
        this.j = 50;
        this.d = null;
    }

    private static cc e(ah ahVar, long j, long j2) {
        com.google.protobuf.ba createBuilder = cc.a.createBuilder();
        String a2 = ahVar.a();
        createBuilder.copyOnWrite();
        cc ccVar = createBuilder.instance;
        a2.getClass();
        ccVar.b |= 16;
        ccVar.g = a2;
        long j3 = ahVar.d;
        createBuilder.copyOnWrite();
        cc ccVar2 = createBuilder.instance;
        ccVar2.b |= 1;
        ccVar2.c = j + j3;
        long j4 = ahVar.e;
        if (j4 != 0) {
            createBuilder.copyOnWrite();
            cc ccVar3 = createBuilder.instance;
            ccVar3.b |= 2;
            ccVar3.d = j4;
        }
        if (ahVar.g != -1) {
            long j5 = ahVar.f;
            long j6 = ahVar.d;
            createBuilder.copyOnWrite();
            cc ccVar4 = createBuilder.instance;
            ccVar4.b |= 4;
            ccVar4.e = j5 - j6;
            long j7 = ahVar.g;
            long j8 = ahVar.f;
            createBuilder.copyOnWrite();
            cc ccVar5 = createBuilder.instance;
            ccVar5.b |= 8;
            ccVar5.f = j7 - j8;
        } else if (ahVar.f != -1) {
            long j9 = ahVar.f;
            long j10 = ahVar.d;
            createBuilder.copyOnWrite();
            cc ccVar6 = createBuilder.instance;
            ccVar6.b |= 4;
            ccVar6.e = j9 - j10;
            long j11 = ahVar.f;
            createBuilder.copyOnWrite();
            cc ccVar7 = createBuilder.instance;
            ccVar7.b |= 8;
            ccVar7.f = j2 - j11;
        } else {
            long j12 = ahVar.d;
            createBuilder.copyOnWrite();
            cc ccVar8 = createBuilder.instance;
            ccVar8.b |= 4;
            ccVar8.e = j2 - j12;
        }
        return createBuilder.build();
    }

    private final void f() {
        int i = this.q + this.r;
        if (i > this.s) {
            this.s = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ah a(ca caVar, long j) {
        ah ahVar = new ah(caVar, j, this.b.e().toMillis());
        synchronized (this.k) {
            this.l.add(ahVar);
            if (ahVar.e == 0) {
                this.q++;
                f();
            }
            int i = this.q;
            int i2 = this.i;
            if (i > i2) {
                if (i > i2) {
                    long millis = this.b.e().toMillis();
                    if (millis > this.o + 5000) {
                        this.o = millis;
                        com.google.common.f.h b = f1516a.b(i > this.j ? Level.SEVERE : Level.WARNING);
                        b.ak(9352);
                        b.F("Queue length for executor %s is now %d. Perhaps some tasks are too long, or the pool is too small.", this.c, i);
                    }
                }
            }
        }
        return ahVar;
    }

    public final void b(ah ahVar) {
        long millis = this.b.e().toMillis();
        ahVar.g = millis;
        synchronized (this.k) {
            this.l.remove(ahVar);
            ah[] ahVarArr = this.m;
            int i = this.n;
            ahVarArr[i] = ahVar;
            this.n = (i + 1) % 100;
            this.r--;
        }
        if (!this.h || millis - ahVar.f <= 300000) {
            return;
        }
        com.google.common.f.h f = f1516a.f();
        f.ak(9349);
        f.N("Task %s took %dms, which is over the %dms threshold", ahVar.a(), Long.valueOf(millis - ahVar.f), 300000L);
    }

    public final void c(ah ahVar) {
        boolean z;
        long millis = this.b.e().toMillis();
        ahVar.f = millis;
        synchronized (this.k) {
            z = false;
            if (millis > this.p + 5000) {
                z = false;
                if (millis > ahVar.d + ahVar.e + 1000) {
                    this.p = millis;
                    z = true;
                }
            }
            if (ahVar.e == 0) {
                this.q--;
            }
            this.r++;
            f();
        }
        if (z) {
            com.google.common.f.h f = f1516a.f();
            f.ak(9351);
            f.N("Task %s was queued for %dms before starting on executor %s", ahVar.a(), Long.valueOf((millis - ahVar.d) - ahVar.e), this.c);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fl m;
        ah[] ahVarArr;
        ah ahVar;
        com.google.protobuf.ba createBuilder = br.a.createBuilder();
        createBuilder.copyOnWrite();
        br brVar = createBuilder.instance;
        brVar.b |= 1;
        brVar.c = this.c;
        String str = this.d;
        if (str != null) {
            createBuilder.copyOnWrite();
            br brVar2 = createBuilder.instance;
            brVar2.b |= 32;
            brVar2.k = str;
        }
        createBuilder.copyOnWrite();
        br brVar3 = createBuilder.instance;
        brVar3.b |= 64;
        brVar3.l = false;
        boolean z = this.g;
        createBuilder.copyOnWrite();
        br brVar4 = createBuilder.instance;
        brVar4.b |= 16;
        brVar4.j = z;
        at atVar = this.e;
        if (atVar.h()) {
            ((Integer) atVar.c()).intValue();
            createBuilder.copyOnWrite();
            br brVar5 = createBuilder.instance;
            brVar5.b |= 4;
            brVar5.e = 1;
        }
        ca caVar = this.f;
        if (caVar != null) {
            int intValue = ((aq) caVar).a().intValue();
            createBuilder.copyOnWrite();
            br brVar6 = createBuilder.instance;
            brVar6.b |= 2;
            brVar6.d = intValue;
        }
        synchronized (this.k) {
            int i = this.s;
            createBuilder.copyOnWrite();
            br brVar7 = createBuilder.instance;
            brVar7.b |= 8;
            brVar7.i = i;
            m = fl.m(this.l);
            ahVarArr = (ah[]) this.m.clone();
        }
        long millis = this.b.e().toMillis();
        long epochMilli = this.b.f().toEpochMilli() - millis;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = m.size();
        for (int i2 = 0; i2 < size; i2++) {
            ah ahVar2 = (ah) m.get(i2);
            if (ahVar2.f == -1) {
                arrayList.add(ahVar2);
            } else {
                arrayList2.add(ahVar2);
            }
        }
        Collections.sort(arrayList, ah.f1510a);
        ArrayList arrayList3 = new ArrayList(50);
        Iterator it = oo.ar(arrayList, 50).iterator();
        while (it.hasNext()) {
            arrayList3.add(e((ah) it.next(), epochMilli, millis));
        }
        Collections.sort(arrayList2, ah.b);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList4.add(e((ah) arrayList2.get(i3), epochMilli, millis));
        }
        Arrays.sort(ahVarArr, new mw(new nx(ah.c)));
        ArrayList arrayList5 = new ArrayList();
        int length = ahVarArr.length;
        for (int i4 = 0; i4 < length && (ahVar = ahVarArr[i4]) != null; i4++) {
            arrayList5.add(e(ahVar, epochMilli, millis));
        }
        createBuilder.copyOnWrite();
        createBuilder.instance.g = br.emptyProtobufList();
        createBuilder.copyOnWrite();
        br brVar8 = createBuilder.instance;
        cb cbVar = brVar8.g;
        if (!cbVar.c()) {
            brVar8.g = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(arrayList3, brVar8.g);
        createBuilder.copyOnWrite();
        createBuilder.instance.f = br.emptyProtobufList();
        createBuilder.copyOnWrite();
        br brVar9 = createBuilder.instance;
        cb cbVar2 = brVar9.f;
        if (!cbVar2.c()) {
            brVar9.f = bi.mutableCopy(cbVar2);
        }
        com.google.protobuf.c.addAll(arrayList4, brVar9.f);
        createBuilder.copyOnWrite();
        createBuilder.instance.h = br.emptyProtobufList();
        createBuilder.copyOnWrite();
        br brVar10 = createBuilder.instance;
        cb cbVar3 = brVar10.h;
        if (!cbVar3.c()) {
            brVar10.h = bi.mutableCopy(cbVar3);
        }
        com.google.protobuf.c.addAll(arrayList5, brVar10.h);
        qn qnVar = fVar.c;
        qnVar.copyOnWrite();
        bl blVar = qnVar.instance;
        br build = createBuilder.build();
        bl blVar2 = bl.a;
        build.getClass();
        blVar.a();
        blVar.g.add(build);
    }
}
