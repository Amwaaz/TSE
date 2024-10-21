package com.google.android.apps.gsa.shared.logger.h;

import android.view.View;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.shared.util.o;
import com.google.android.apps.gsa.staticplugins.actions.t;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.o.o.bd;
import com.google.cs.a.c.a.a.v;
import com.google.cs.d.a;
import com.google.cs.d.c;
import com.google.cs.d.e;
import com.google.protobuf.ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/h/b.class */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1467a = j.i("com.google.android.apps.gsa.shared.logger.h.b");
    public static final d b = new d();
    public static final b c = new b();
    public boolean i;
    public String j;
    public boolean k;
    public t l;
    public final Object d = new Object();
    public final List e = new ArrayList();
    public List f = new ArrayList();
    public long g = -1;
    public boolean h = true;
    private boolean m = true;

    private b() {
    }

    public static a a(long j, long j2) {
        a createBuilder = c.a.createBuilder();
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        cVar.b |= 4;
        cVar.e = j;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        cVar2.b |= 2;
        cVar2.d = micros;
        if (j2 > -1) {
            createBuilder.copyOnWrite();
            c cVar3 = createBuilder.instance;
            cVar3.b |= 8;
            cVar3.f = j2;
        }
        return createBuilder;
    }

    public static final ba j(List list) {
        ba createBuilder = e.a.createBuilder();
        for (int i = 0; i < list.size(); i++) {
            a aVar = (a) list.get(i);
            createBuilder.copyOnWrite();
            e eVar = createBuilder.instance;
            c build = aVar.build();
            build.getClass();
            eVar.a();
            eVar.d.add(build);
        }
        return createBuilder;
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((v) it.next()).c);
            sb.append(' ');
        }
        return sb.toString();
    }

    public final void c(a aVar, boolean z) {
        if (z && !this.f.isEmpty()) {
            i(j(this.f));
            this.f = new ArrayList();
        }
        t tVar = this.l;
        if (!h() || tVar == null) {
            this.f.add(aVar);
            return;
        }
        Iterator it = this.f.iterator();
        boolean z2 = true;
        while (true) {
            boolean z3 = z2;
            if (!it.hasNext()) {
                this.f.clear();
                tVar.a(aVar.build(), z);
                return;
            } else {
                tVar.a(((a) it.next()).build(), z3);
                z2 = false;
            }
        }
    }

    public final void d(View view) {
        boolean z;
        if (h.a(view) == -1) {
            h.c(view, 6727);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.m;
        k.d(com.google.android.libraries.logging.c.b(view, true != z2 ? 647 : 472), !z2);
        if (z) {
            h.b(view);
        }
    }

    public final void e(List list, c cVar) {
        ba baVar;
        long b2 = o.f1569a.b();
        this.g = b2;
        this.m = cVar.m;
        this.i = cVar.o;
        a a2 = a(b2, -1L);
        int i = true != this.i ? 2 : 3;
        a2.copyOnWrite();
        c cVar2 = a2.instance;
        c cVar3 = c.a;
        cVar2.h = i - 1;
        cVar2.b |= 512;
        if (cVar == null) {
            baVar = com.google.cs.d.d.a.createBuilder();
        } else {
            ba createBuilder = com.google.cs.d.d.a.createBuilder();
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar = createBuilder.instance;
            dVar.l = cVar.j.g;
            dVar.b |= 4096;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar2 = createBuilder.instance;
            dVar2.b |= 1024;
            dVar2.j = cVar.h.cP;
            String b3 = com.google.android.libraries.search.t.k.a.b(cVar.a);
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar3 = createBuilder.instance;
            b3.getClass();
            dVar3.b |= 4;
            dVar3.e = b3;
            boolean z = cVar.b;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar4 = createBuilder.instance;
            dVar4.b |= 8;
            dVar4.f = !z;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar5 = createBuilder.instance;
            dVar5.b |= 16;
            dVar5.g = cVar.c;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar6 = createBuilder.instance;
            String str = cVar.d;
            str.getClass();
            dVar6.b = 2 | dVar6.b;
            dVar6.d = str;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar7 = createBuilder.instance;
            dVar7.b |= 2048;
            dVar7.k = cVar.i;
            boolean z2 = cVar.p;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar8 = createBuilder.instance;
            dVar8.b |= 16384;
            dVar8.n = z2;
            boolean z3 = cVar.q;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar9 = createBuilder.instance;
            dVar9.b |= 32768;
            dVar9.o = z3;
            boolean z4 = cVar.r;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar10 = createBuilder.instance;
            dVar10.b |= 65536;
            dVar10.p = z4;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar11 = createBuilder.instance;
            dVar11.b |= 1048576;
            dVar11.q = false;
            int i2 = cVar.k;
            createBuilder.copyOnWrite();
            com.google.cs.d.d dVar12 = createBuilder.instance;
            dVar12.b |= 8388608;
            dVar12.r = i2;
            int i3 = cVar.n;
            if (i3 != 0) {
                createBuilder.copyOnWrite();
                com.google.cs.d.d dVar13 = createBuilder.instance;
                dVar13.b |= 16777216;
                dVar13.s = i3;
            }
            com.google.bn.b.d.c cVar4 = cVar.l;
            if (cVar4 != null) {
                createBuilder.copyOnWrite();
                com.google.cs.d.d dVar14 = createBuilder.instance;
                dVar14.m = cVar4;
                dVar14.b |= 8192;
            }
            if (cVar.b) {
                String str2 = cVar.g;
                if (str2 != null) {
                    createBuilder.copyOnWrite();
                    com.google.cs.d.d dVar15 = createBuilder.instance;
                    dVar15.b |= 1;
                    dVar15.c = str2;
                } else {
                    h f = f1467a.f();
                    f.aj(com.google.common.f.a.e.a, "ActionCardEventLogger");
                    h hVar = f;
                    hVar.ak(8845);
                    hVar.p("Impression Data with null event id.");
                }
            }
            int i4 = cVar.e;
            if (i4 != 0) {
                createBuilder.copyOnWrite();
                com.google.cs.d.d dVar16 = createBuilder.instance;
                dVar16.b |= 256;
                dVar16.h = i4;
            }
            long j = cVar.f;
            if (j >= 0) {
                createBuilder.copyOnWrite();
                com.google.cs.d.d dVar17 = createBuilder.instance;
                dVar17.b |= 512;
                dVar17.i = (int) j;
            }
            baVar = createBuilder;
        }
        com.google.cs.d.d build = baVar.build();
        a2.copyOnWrite();
        c cVar5 = a2.instance;
        build.getClass();
        cVar5.c = build;
        cVar5.b |= 1;
        a2.q(list);
        c(a2, true);
        this.j = b(list);
        ab abVar = com.google.common.f.a.e.a;
    }

    public final void f(View view, bd bdVar) {
        int intValue;
        if (this.h) {
            int a2 = h.a(view);
            if (a2 < 0) {
                ab abVar = com.google.common.f.a.e.a;
                return;
            }
            Object tag = view.getTag(2131440758);
            f.f(tag == null || (tag instanceof Integer), "ve_index can only be an Integer.");
            if (tag == null) {
                h e = f1467a.e();
                e.aj(com.google.common.f.a.e.a, "ActionCardEventLogger");
                h hVar = e;
                hVar.ak(8852);
                hVar.p("Interaction on a VE with no ve_index.");
                intValue = -1;
            } else {
                intValue = ((Integer) tag).intValue();
            }
            g(a2, intValue, bdVar);
            k.d(com.google.android.libraries.logging.c.j(view, bdVar), !this.m);
        }
    }

    public final void g(int i, int i2, bd bdVar) {
        if (this.g == -1) {
            h e = f1467a.e();
            e.aj(com.google.common.f.a.e.a, "ActionCardEventLogger");
            h hVar = e;
            hVar.ak(8855);
            hVar.p("Interaction on a VE with no impression.");
        }
        a a2 = a(o.f1569a.b(), this.g);
        int i3 = bdVar.W;
        ba createBuilder = com.google.cs.a.c.a.a.t.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.cs.a.c.a.a.t tVar = createBuilder.instance;
        tVar.b |= 1;
        tVar.c = i;
        createBuilder.copyOnWrite();
        com.google.cs.a.c.a.a.t tVar2 = createBuilder.instance;
        int i4 = 2;
        tVar2.b |= 2;
        tVar2.d = i2;
        createBuilder.copyOnWrite();
        com.google.cs.a.c.a.a.t tVar3 = createBuilder.instance;
        tVar3.b |= 4;
        tVar3.e = i3;
        com.google.cs.a.c.a.a.t build = createBuilder.build();
        a2.copyOnWrite();
        c cVar = a2.instance;
        c cVar2 = c.a;
        build.getClass();
        cVar.i = build;
        cVar.b |= 1024;
        if (true == this.i) {
            i4 = 3;
        }
        a2.copyOnWrite();
        c cVar3 = a2.instance;
        cVar3.h = i4 - 1;
        cVar3.b |= 512;
        c(a2, false);
        this.j = null;
        ab abVar = com.google.common.f.a.e.a;
    }

    public final boolean h() {
        return this.k && this.l != null;
    }

    public final void i(ba baVar) {
        synchronized (this.d) {
            this.e.add(baVar);
        }
    }
}
