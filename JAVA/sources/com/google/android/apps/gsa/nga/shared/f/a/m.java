package com.google.android.apps.gsa.nga.shared.f.a;

import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.shared.f.ak;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.gf;
import com.google.common.b.gl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.cb;
import com.google.protobuf.cu;
import e.a;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f864a;
    public final h b;
    public final cg c;

    public m(a aVar, cg cgVar, h hVar) {
        this.f864a = aVar;
        this.c = cgVar;
        this.b = hVar;
    }

    public static com.google.android.apps.gsa.nga.shared.f.ap c(com.google.android.apps.gsa.nga.shared.f.ap apVar, com.google.android.apps.gsa.nga.shared.f.ao aoVar) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.f.ap.a.createBuilder();
        createBuilder.bu(f.am(apVar.b, aoVar));
        return createBuilder.build();
    }

    public final int a(String str) {
        com.google.android.apps.gsa.nga.shared.f.m b = b();
        com.google.android.apps.gsa.nga.shared.f.ap apVar = com.google.android.apps.gsa.nga.shared.f.ap.a;
        str.getClass();
        cu cuVar = b.d;
        if (cuVar.containsKey(str)) {
            apVar = (com.google.android.apps.gsa.nga.shared.f.ap) cuVar.get(str);
        }
        int size = apVar.b.size();
        str.getClass();
        cu cuVar2 = b.h;
        return size + (cuVar2.containsKey(str) ? ((Integer) cuVar2.get(str)).intValue() : 0);
    }

    public final com.google.android.apps.gsa.nga.shared.f.m b() {
        return ((aa) this.f864a.a()).a();
    }

    public final fl d() {
        return fl.m(b().q);
    }

    public final fl e(int i, boolean z) {
        cb cbVar;
        if (z) {
            com.google.android.apps.gsa.nga.shared.f.an anVar = b().n;
            com.google.android.apps.gsa.nga.shared.f.an anVar2 = anVar;
            if (anVar == null) {
                anVar2 = com.google.android.apps.gsa.nga.shared.f.an.a;
            }
            cbVar = anVar2.c;
        } else {
            com.google.android.apps.gsa.nga.shared.f.an anVar3 = b().n;
            com.google.android.apps.gsa.nga.shared.f.an anVar4 = anVar3;
            if (anVar3 == null) {
                anVar4 = com.google.android.apps.gsa.nga.shared.f.an.a;
            }
            cbVar = anVar4.b;
        }
        Stream map = Collection._EL.stream(cbVar).filter(new g(i, 1)).map(new f(0)).map(new f(5));
        int i2 = fl.e;
        return (fl) map.collect(bs.a);
    }

    public final fl f() {
        Stream map = Collection._EL.stream(b().k).map(new f(6));
        int i = fl.e;
        return (fl) map.collect(bs.a);
    }

    public final gl g(boolean z) {
        cb<ak> cbVar;
        gf gfVar = new gf();
        if (z) {
            com.google.android.apps.gsa.nga.shared.f.al alVar = b().o;
            com.google.android.apps.gsa.nga.shared.f.al alVar2 = alVar;
            if (alVar == null) {
                alVar2 = com.google.android.apps.gsa.nga.shared.f.al.a;
            }
            cbVar = alVar2.b;
        } else {
            com.google.android.apps.gsa.nga.shared.f.al alVar3 = b().o;
            com.google.android.apps.gsa.nga.shared.f.al alVar4 = alVar3;
            if (alVar3 == null) {
                alVar4 = com.google.android.apps.gsa.nga.shared.f.al.a;
            }
            cbVar = alVar4.c;
        }
        for (ak akVar : cbVar) {
            c a2 = c.a(akVar.d);
            c cVar = a2;
            if (a2 == null) {
                cVar = c.UNKNOWN;
            }
            gfVar.l(cVar, Instant.ofEpochMilli(akVar.c));
        }
        return gfVar.i();
    }

    public final cn h(Instant instant, c cVar, boolean z) {
        instant.getEpochSecond();
        ba createBuilder = ak.a.createBuilder();
        long epochMilli = instant.toEpochMilli();
        createBuilder.copyOnWrite();
        ak akVar = createBuilder.instance;
        akVar.b |= 1;
        akVar.c = epochMilli;
        createBuilder.copyOnWrite();
        ak akVar2 = createBuilder.instance;
        akVar2.d = cVar.cF;
        akVar2.b |= 2;
        ak build = createBuilder.build();
        return z ? this.b.l(this.c.a(new b(build, 1), ay.a), "[NGA] EducationPreferences.recordPieInvocation", new a(this, 2)) : this.b.l(this.c.a(new b(build, 0), ay.a), "[NGA] EducationPreferences.recordPieInvocation", new a(this, 3));
    }
}
