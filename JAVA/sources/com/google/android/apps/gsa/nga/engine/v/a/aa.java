package com.google.android.apps.gsa.nga.engine.v.a;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.apps.gsa.nga.engine.an.ab;
import com.google.android.apps.gsa.nga.engine.education.pie.d;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.o.q;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.b;
import com.google.android.apps.gsa.nga.shared.q.d.am;
import com.google.android.apps.gsa.nga.shared.q.d.at;
import com.google.android.apps.gsa.nga.shared.q.d.az;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.android.apps.gsa.nga.shared.q.d.bz;
import com.google.android.apps.gsa.nga.shared.q.d.ca;
import com.google.android.apps.gsa.nga.shared.q.d.cr;
import com.google.android.apps.gsa.nga.shared.q.d.cs;
import com.google.android.apps.gsa.nga.shared.q.d.ct;
import com.google.android.apps.gsa.nga.shared.q.d.cu;
import com.google.android.apps.gsa.nga.shared.q.d.cz;
import com.google.android.apps.gsa.nga.shared.q.d.de;
import com.google.android.apps.gsa.nga.shared.q.g;
import com.google.android.apps.gsa.nga.shared.q.r;
import com.google.android.apps.gsa.nga.shared.u.f.o;
import com.google.android.apps.gsa.nga.shared.u.f.s;
import com.google.android.apps.gsa.nga.shared.u.j.b.f;
import com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.l;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.libraries.assistant.p.b.k;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.t.c.u;
import com.google.android.libraries.search.t.d.c;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.oo;
import com.google.common.f.a.e;
import com.google.common.o.ew;
import com.google.common.o.fp;
import com.google.common.o.fq;
import com.google.common.o.hb;
import com.google.common.o.kn;
import com.google.common.o.kp;
import com.google.common.o.kq;
import com.google.common.o.kr;
import com.google.common.o.ks;
import com.google.common.o.ku;
import com.google.common.o.kw;
import com.google.common.o.kx;
import com.google.common.o.ky;
import com.google.common.o.kz;
import com.google.common.o.la;
import com.google.common.o.lb;
import com.google.common.o.lc;
import com.google.common.o.ld;
import com.google.common.o.le;
import com.google.common.o.lf;
import com.google.common.o.lj;
import com.google.common.o.lk;
import com.google.common.o.lp;
import com.google.common.o.lr;
import com.google.common.o.ob;
import com.google.common.o.qn;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.br;
import com.google.protobuf.bs;
import com.google.protobuf.bu;
import com.google.protobuf.cb;
import com.google.protobuf.v;
import com.google.speech.i.bh;
import e.a;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/aa.class */
public class aa implements b, r, l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f804a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.v.a.aa");
    public final a b;
    public final a c;
    public final com.google.android.apps.gsa.shared.util.q.a d;
    public final a e;
    public final a f;
    public final q g;
    public final h h;
    public final h i;
    public final Context j;
    public final boolean k;
    public final g l;
    public final k.a.a m;
    public final com.google.android.apps.gsa.nga.shared.q.h n;
    public final y o;
    public final ag p;
    public final x q;
    public final com.google.android.libraries.search.account.y r;
    private final a s;
    private final ab t;
    private final a u;
    private final c v;
    private final com.google.android.apps.gsa.nga.shared.f.a.ap w;
    private final u x;

    public aa(c cVar, u uVar, a aVar, a aVar2, a aVar3, com.google.android.apps.gsa.shared.util.q.a aVar4, a aVar5, h hVar, h hVar2, y yVar, ag agVar, Context context, boolean z, a aVar6, ab abVar, x xVar, a aVar7, g gVar, q qVar, com.google.android.apps.gsa.nga.shared.f.a.ap apVar, k.a.a aVar8, com.google.android.apps.gsa.nga.shared.q.h hVar3, com.google.android.libraries.search.account.y yVar2) {
        this.v = cVar;
        this.x = uVar;
        this.b = aVar;
        this.c = aVar2;
        this.s = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.h = hVar;
        this.i = hVar2;
        this.o = yVar;
        this.p = agVar;
        this.j = context;
        this.k = z;
        this.f = aVar6;
        this.t = abVar;
        this.u = aVar7;
        this.q = xVar;
        this.l = gVar;
        this.g = qVar;
        this.w = apVar;
        this.m = aVar8;
        this.n = hVar3;
        this.r = yVar2;
    }

    private final void A(y yVar) {
        if (this.d.i(eu.ge)) {
            qn qnVar = yVar.l;
            lk a2 = ((d) this.u.a()).a();
            qnVar.copyOnWrite();
            lr lrVar = qnVar.instance;
            lr lrVar2 = lr.a;
            a2.getClass();
            lrVar.s = a2;
            lrVar.b |= 8192;
        }
    }

    private final boolean B() {
        return this.p.q(this.o.c().c);
    }

    private final int C() {
        int ordinal = this.p.c().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3) {
            return 4;
        }
        throw new AssertionError();
    }

    private static int D(as asVar) {
        Iterator it = asVar.v.iterator();
        while (it.hasNext()) {
            bj bjVar = ((bl) it.next()).e;
            bj bjVar2 = bjVar;
            if (bjVar == null) {
                bjVar2 = bj.a;
            }
            com.google.android.apps.gsa.nga.shared.u.j.b.a a2 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a((bjVar2.b == 1 ? (f) bjVar2.c : f.a).h);
            com.google.android.apps.gsa.nga.shared.u.j.b.a aVar = a2;
            if (a2 == null) {
                aVar = com.google.android.apps.gsa.nga.shared.u.j.b.a.o;
            }
            switch (aVar.ordinal()) {
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 9;
                case 8:
                    return 8;
            }
        }
        return 1;
    }

    private final int E() {
        if ("userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE)) {
            return 2;
        }
        return this.d.i(eu.jj) ? 3 : 4;
    }

    private static int F(com.google.android.apps.gsa.nga.shared.q.d.c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 1 : 3;
        }
        return 2;
    }

    private static boolean G(int i, com.google.android.apps.gsa.nga.shared.u.m.d dVar) {
        return i == 2 && dVar == com.google.android.apps.gsa.nga.shared.u.m.d.b;
    }

    private final void H(bc bcVar, int i) {
        int i2;
        int i3;
        if (this.d.i(eu.lg)) {
            com.google.android.libraries.assistant.p.b.g gVar = bcVar.instance.m;
            com.google.android.libraries.assistant.p.b.g gVar2 = gVar;
            if (gVar == null) {
                gVar2 = com.google.android.libraries.assistant.p.b.g.a;
            }
            ba builder = (gVar2.c == 3 ? (com.google.android.libraries.assistant.p.b.l) gVar2.d : com.google.android.libraries.assistant.p.b.l.a).toBuilder();
            if (i == 1388) {
                i2 = 2;
                i3 = 2;
            } else if (i != 1389) {
                com.google.common.f.h f = f804a.f();
                f.aj(e.a, "SessionDataLogger");
                f.ak(3551);
                f.q("Not covered event type %d, preserving default values", i);
                i3 = 1;
                i2 = 2;
            } else {
                i2 = 3;
                i3 = 1;
            }
            k kVar = builder.instance.c;
            k kVar2 = kVar;
            if (kVar == null) {
                kVar2 = k.a;
            }
            ba builder2 = kVar2.toBuilder();
            builder2.copyOnWrite();
            k kVar3 = builder2.instance;
            kVar3.e = i3 - 1;
            kVar3.b |= 1;
            builder.copyOnWrite();
            com.google.android.libraries.assistant.p.b.l lVar = builder.instance;
            lVar.d = i2 - 1;
            lVar.b |= 2;
            builder.copyOnWrite();
            com.google.android.libraries.assistant.p.b.l lVar2 = builder.instance;
            k build = builder2.build();
            build.getClass();
            lVar2.c = build;
            lVar2.b |= 1;
            ba builder3 = gVar2.toBuilder();
            builder3.copyOnWrite();
            com.google.android.libraries.assistant.p.b.g gVar3 = builder3.instance;
            com.google.android.libraries.assistant.p.b.l build2 = builder.build();
            build2.getClass();
            gVar3.d = build2;
            gVar3.c = 3;
            bcVar.copyOnWrite();
            com.google.android.libraries.assistant.p.b.h hVar = bcVar.instance;
            com.google.android.libraries.assistant.p.b.g build3 = builder3.build();
            build3.getClass();
            hVar.m = build3;
            hVar.b |= 1024;
        }
    }

    private static void I(as asVar, bc bcVar) {
        gy gyVar = new gy();
        String str = asVar.f;
        for (bl blVar : asVar.E) {
            ah ahVar = blVar.h;
            ah ahVar2 = ahVar;
            if (ahVar == null) {
                ahVar2 = ah.a;
            }
            if (str.equals(ahVar2.c)) {
                bj bjVar = blVar.e;
                bj bjVar2 = bjVar;
                if (bjVar == null) {
                    bjVar2 = bj.a;
                }
                gyVar.h(bjVar2.b == 78 ? (com.google.bw.c.a.f) bjVar2.c : com.google.bw.c.a.f.a);
            }
        }
        ha g = gyVar.g();
        if (g.isEmpty()) {
            return;
        }
        com.google.android.libraries.assistant.p.b.g gVar = bcVar.instance.m;
        com.google.android.libraries.assistant.p.b.g gVar2 = gVar;
        if (gVar == null) {
            gVar2 = com.google.android.libraries.assistant.p.b.g.a;
        }
        ba builder = gVar2.toBuilder();
        ba builder2 = (gVar2.c == 3 ? (com.google.android.libraries.assistant.p.b.l) gVar2.d : com.google.android.libraries.assistant.p.b.l.a).toBuilder();
        builder2.copyOnWrite();
        com.google.android.libraries.assistant.p.b.l lVar = builder2.instance;
        cb cbVar = lVar.e;
        if (!cbVar.c()) {
            lVar.e = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(g, lVar.e);
        builder.copyOnWrite();
        com.google.android.libraries.assistant.p.b.g gVar3 = builder.instance;
        com.google.android.libraries.assistant.p.b.l build = builder2.build();
        build.getClass();
        gVar3.d = build;
        gVar3.c = 3;
        bcVar.copyOnWrite();
        com.google.android.libraries.assistant.p.b.h hVar = bcVar.instance;
        com.google.android.libraries.assistant.p.b.g build2 = builder.build();
        build2.getClass();
        hVar.m = build2;
        hVar.b |= 1024;
    }

    private static void J(qn qnVar, com.google.android.apps.gsa.nga.shared.q.d.ak akVar, am amVar) {
        for (int i = 0; i < qnVar.instance.d.size(); i++) {
            ku kuVar = (ku) qnVar.instance.d.get(i);
            com.google.android.apps.gsa.nga.shared.q.d.ak a2 = com.google.android.apps.gsa.nga.shared.q.d.ak.a(kuVar.c);
            com.google.android.apps.gsa.nga.shared.q.d.ak akVar2 = a2;
            if (a2 == null) {
                akVar2 = com.google.android.apps.gsa.nga.shared.q.d.ak.a;
            }
            if (akVar2.equals(akVar)) {
                qn builder = kuVar.toBuilder();
                builder.I(amVar);
                qnVar.copyOnWrite();
                kw kwVar = qnVar.instance;
                ku build = builder.build();
                build.getClass();
                kwVar.a();
                kwVar.d.set(i, build);
                return;
            }
        }
        qn createBuilder = ku.a.createBuilder();
        createBuilder.copyOnWrite();
        ku kuVar2 = createBuilder.instance;
        kuVar2.c = akVar.aL;
        kuVar2.b |= 1;
        createBuilder.I(amVar);
        qnVar.copyOnWrite();
        kw kwVar2 = qnVar.instance;
        ku build2 = createBuilder.build();
        build2.getClass();
        kwVar2.a();
        kwVar2.d.add(build2);
    }

    private static void K(at atVar, qn qnVar) {
        com.google.android.apps.gsa.nga.shared.u.f.h hVar = atVar.d;
        com.google.android.apps.gsa.nga.shared.u.f.h hVar2 = hVar;
        if (hVar == null) {
            hVar2 = com.google.android.apps.gsa.nga.shared.u.f.h.a;
        }
        com.google.android.apps.gsa.nga.shared.u.f.g gVar = atVar.c;
        com.google.android.apps.gsa.nga.shared.u.f.g gVar2 = gVar;
        if (gVar == null) {
            gVar2 = com.google.android.apps.gsa.nga.shared.u.f.g.a;
        }
        le leVar = qnVar.instance.h;
        le leVar2 = leVar;
        if (leVar == null) {
            leVar2 = le.a;
        }
        qn builder = leVar2.toBuilder();
        for (com.google.android.apps.gsa.nga.shared.u.f.q qVar : hVar2.c) {
            ba createBuilder = ld.a.createBuilder();
            createBuilder.copyOnWrite();
            ld ldVar = createBuilder.instance;
            ldVar.c = 1;
            ldVar.b |= 1;
            String str = qVar.c;
            createBuilder.copyOnWrite();
            ld ldVar2 = createBuilder.instance;
            str.getClass();
            ldVar2.b |= 2;
            ldVar2.d = str;
            ba createBuilder2 = lc.a.createBuilder();
            com.google.android.apps.gsa.nga.shared.u.f.c cVar = qVar.f;
            com.google.android.apps.gsa.nga.shared.u.f.c cVar2 = cVar;
            if (cVar == null) {
                cVar2 = com.google.android.apps.gsa.nga.shared.u.f.c.c;
            }
            float f = cVar2.e;
            createBuilder2.copyOnWrite();
            lc lcVar = createBuilder2.instance;
            lcVar.b = 1 | lcVar.b;
            lcVar.d = f;
            com.google.android.apps.gsa.nga.shared.u.f.c cVar3 = qVar.f;
            com.google.android.apps.gsa.nga.shared.u.f.c cVar4 = cVar3;
            if (cVar3 == null) {
                cVar4 = com.google.android.apps.gsa.nga.shared.u.f.c.c;
            }
            bu buVar = new bu(cVar4.f, com.google.android.apps.gsa.nga.shared.u.f.c.b);
            createBuilder2.copyOnWrite();
            lc lcVar2 = createBuilder2.instance;
            bs bsVar = lcVar2.e;
            if (!bsVar.c()) {
                lcVar2.e = bi.mutableCopy(bsVar);
            }
            Iterator it = buVar.iterator();
            while (it.hasNext()) {
                lcVar2.e.g(((com.google.android.apps.gsa.nga.shared.u.f.a) it.next()).f);
            }
            com.google.android.apps.gsa.nga.shared.u.f.c cVar5 = qVar.f;
            com.google.android.apps.gsa.nga.shared.u.f.c cVar6 = cVar5;
            if (cVar5 == null) {
                cVar6 = com.google.android.apps.gsa.nga.shared.u.f.c.c;
            }
            bu buVar2 = new bu(cVar6.d, com.google.android.apps.gsa.nga.shared.u.f.c.a);
            createBuilder2.copyOnWrite();
            lc lcVar3 = createBuilder2.instance;
            bs bsVar2 = lcVar3.c;
            if (!bsVar2.c()) {
                lcVar3.c = bi.mutableCopy(bsVar2);
            }
            Iterator it2 = buVar2.iterator();
            while (it2.hasNext()) {
                lcVar3.c.g(((com.google.bt.f.b.b) it2.next()).getNumber());
            }
            createBuilder.copyOnWrite();
            ld ldVar3 = createBuilder.instance;
            lc build = createBuilder2.build();
            build.getClass();
            ldVar3.e = build;
            ldVar3.b |= 4;
            builder.H(createBuilder);
        }
        kz kzVar = builder.instance.e;
        kz kzVar2 = kzVar;
        if (kzVar == null) {
            kzVar2 = kz.a;
        }
        ba builder2 = kzVar2.toBuilder();
        com.google.android.apps.gsa.nga.shared.u.f.j a2 = com.google.android.apps.gsa.nga.shared.u.f.j.a(gVar2.g);
        com.google.android.apps.gsa.nga.shared.u.f.j jVar = a2;
        if (a2 == null) {
            jVar = com.google.android.apps.gsa.nga.shared.u.f.j.a;
        }
        if (jVar == com.google.android.apps.gsa.nga.shared.u.f.j.c) {
            com.google.android.apps.gsa.nga.shared.u.f.l lVar = hVar2.e;
            com.google.android.apps.gsa.nga.shared.u.f.l lVar2 = lVar;
            if (lVar == null) {
                lVar2 = com.google.android.apps.gsa.nga.shared.u.f.l.a;
            }
            com.google.android.apps.gsa.nga.shared.u.f.k a3 = com.google.android.apps.gsa.nga.shared.u.f.k.a(lVar2.e);
            com.google.android.apps.gsa.nga.shared.u.f.k kVar = a3;
            if (a3 == null) {
                kVar = com.google.android.apps.gsa.nga.shared.u.f.k.a;
            }
            boolean z = kVar == com.google.android.apps.gsa.nga.shared.u.f.k.b;
            builder2.copyOnWrite();
            kz kzVar3 = builder2.instance;
            kzVar3.b |= 2;
            kzVar3.d = z;
        } else {
            com.google.android.apps.gsa.nga.shared.u.f.f fVar = gVar2.e;
            com.google.android.apps.gsa.nga.shared.u.f.f fVar2 = fVar;
            if (fVar == null) {
                fVar2 = com.google.android.apps.gsa.nga.shared.u.f.f.a;
            }
            int size = fVar2.d.size();
            builder2.copyOnWrite();
            kz kzVar4 = builder2.instance;
            kzVar4.b |= 1;
            kzVar4.c = size;
            com.google.android.apps.gsa.nga.shared.u.f.f fVar3 = gVar2.e;
            com.google.android.apps.gsa.nga.shared.u.f.f fVar4 = fVar3;
            if (fVar3 == null) {
                fVar4 = com.google.android.apps.gsa.nga.shared.u.f.f.a;
            }
            s sVar = fVar4.e;
            s sVar2 = sVar;
            if (sVar == null) {
                sVar2 = s.a;
            }
            boolean isEmpty = sVar2.c.isEmpty();
            builder2.copyOnWrite();
            kz kzVar5 = builder2.instance;
            kzVar5.b |= 4;
            kzVar5.e = !isEmpty;
            com.google.android.apps.gsa.nga.shared.u.f.f fVar5 = gVar2.e;
            com.google.android.apps.gsa.nga.shared.u.f.f fVar6 = fVar5;
            if (fVar5 == null) {
                fVar6 = com.google.android.apps.gsa.nga.shared.u.f.f.a;
            }
            if (fVar6.c.size() > 0) {
                com.google.android.apps.gsa.nga.shared.u.f.f fVar7 = gVar2.e;
                com.google.android.apps.gsa.nga.shared.u.f.f fVar8 = fVar7;
                if (fVar7 == null) {
                    fVar8 = com.google.android.apps.gsa.nga.shared.u.f.f.a;
                }
                boolean z2 = (((o) fVar8.c.get(0)).c & 16) != 0;
                builder2.copyOnWrite();
                kz kzVar6 = builder2.instance;
                kzVar6.b |= 8;
                kzVar6.f = z2;
            }
            com.google.android.apps.gsa.nga.shared.u.f.l lVar3 = hVar2.e;
            com.google.android.apps.gsa.nga.shared.u.f.l lVar4 = lVar3;
            if (lVar3 == null) {
                lVar4 = com.google.android.apps.gsa.nga.shared.u.f.l.a;
            }
            boolean z3 = lVar4.c;
            builder2.copyOnWrite();
            kz kzVar7 = builder2.instance;
            kzVar7.b |= 32;
            kzVar7.h = z3;
        }
        int i = builder2.instance.g;
        com.google.android.apps.gsa.nga.shared.u.f.e eVar = hVar2.d;
        com.google.android.apps.gsa.nga.shared.u.f.e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = com.google.android.apps.gsa.nga.shared.u.f.e.a;
        }
        int size2 = eVar2.b.size();
        builder2.copyOnWrite();
        kz kzVar8 = builder2.instance;
        kzVar8.b |= 16;
        kzVar8.g = i + size2;
        builder.copyOnWrite();
        le leVar3 = builder.instance;
        kz build2 = builder2.build();
        build2.getClass();
        leVar3.e = build2;
        leVar3.b |= 1;
        qnVar.copyOnWrite();
        lf lfVar = qnVar.instance;
        le build3 = builder.build();
        build3.getClass();
        lfVar.h = build3;
        lfVar.b |= 64;
    }

    private static void L(com.google.android.apps.gsa.nga.shared.q.d.ba baVar, qn qnVar) {
        le leVar = qnVar.instance.h;
        le leVar2 = leVar;
        if (leVar == null) {
            leVar2 = le.a;
        }
        qn builder = leVar2.toBuilder();
        for (az azVar : baVar.b) {
            ba createBuilder = lb.a.createBuilder();
            String str = azVar.c;
            createBuilder.copyOnWrite();
            lb lbVar = createBuilder.instance;
            str.getClass();
            lbVar.b |= 1;
            lbVar.c = str;
            boolean z = azVar.d;
            createBuilder.copyOnWrite();
            lb lbVar2 = createBuilder.instance;
            lbVar2.b |= 2;
            lbVar2.d = z;
            com.google.android.apps.gsa.nga.shared.u.m.a aVar = azVar.e;
            com.google.android.apps.gsa.nga.shared.u.m.a aVar2 = aVar;
            if (aVar == null) {
                aVar2 = com.google.android.apps.gsa.nga.shared.u.m.a.a;
            }
            float f = aVar2.e;
            createBuilder.copyOnWrite();
            lb lbVar3 = createBuilder.instance;
            lbVar3.b |= 4;
            lbVar3.e = f;
            com.google.android.apps.gsa.nga.shared.u.m.a aVar3 = azVar.e;
            com.google.android.apps.gsa.nga.shared.u.m.a aVar4 = aVar3;
            if (aVar3 == null) {
                aVar4 = com.google.android.apps.gsa.nga.shared.u.m.a.a;
            }
            com.google.knowledge.a.a.e eVar = aVar4.c;
            com.google.knowledge.a.a.e eVar2 = eVar;
            if (eVar == null) {
                eVar2 = com.google.knowledge.a.a.e.a;
            }
            com.google.be.c.a.a.b i = i(eVar2);
            createBuilder.copyOnWrite();
            lb lbVar4 = createBuilder.instance;
            i.getClass();
            lbVar4.f = i;
            lbVar4.b |= 8;
            la a2 = la.a(azVar.f);
            la laVar = a2;
            if (a2 == null) {
                laVar = la.a;
            }
            createBuilder.copyOnWrite();
            lb lbVar5 = createBuilder.instance;
            lbVar5.g = laVar.g;
            lbVar5.b |= 16;
            com.google.android.apps.gsa.nga.shared.u.m.a aVar5 = azVar.e;
            com.google.android.apps.gsa.nga.shared.u.m.a aVar6 = aVar5;
            if (aVar5 == null) {
                aVar6 = com.google.android.apps.gsa.nga.shared.u.m.a.a;
            }
            com.google.android.apps.gsa.nga.shared.u.m.b a3 = com.google.android.apps.gsa.nga.shared.u.m.b.a(aVar6.f);
            com.google.android.apps.gsa.nga.shared.u.m.b bVar = a3;
            if (a3 == null) {
                bVar = com.google.android.apps.gsa.nga.shared.u.m.b.l;
            }
            createBuilder.copyOnWrite();
            lb lbVar6 = createBuilder.instance;
            lbVar6.h = bVar.getNumber();
            lbVar6.b |= 32;
            builder.copyOnWrite();
            le leVar3 = builder.instance;
            lb build = createBuilder.build();
            build.getClass();
            cb cbVar = leVar3.d;
            if (!cbVar.c()) {
                leVar3.d = bi.mutableCopy(cbVar);
            }
            leVar3.d.add(build);
        }
        qnVar.copyOnWrite();
        lf lfVar = qnVar.instance;
        le build2 = builder.build();
        build2.getClass();
        lfVar.h = build2;
        lfVar.b |= 64;
    }

    private static void M(f fVar, qn qnVar) {
        com.google.android.apps.gsa.nga.shared.u.j.b.b a2 = com.google.android.apps.gsa.nga.shared.u.j.b.b.a(fVar.f);
        com.google.android.apps.gsa.nga.shared.u.j.b.b bVar = a2;
        if (a2 == null) {
            bVar = com.google.android.apps.gsa.nga.shared.u.j.b.b.e;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            qnVar.copyOnWrite();
            lf lfVar = qnVar.instance;
            lf lfVar2 = lf.a;
            lfVar.k = 1;
            lfVar.b |= 1024;
        } else if (ordinal == 2) {
            qnVar.copyOnWrite();
            lf lfVar3 = qnVar.instance;
            lf lfVar4 = lf.a;
            lfVar3.k = 2;
            lfVar3.b |= 1024;
        } else if (ordinal == 3) {
            qnVar.copyOnWrite();
            lf lfVar5 = qnVar.instance;
            lf lfVar6 = lf.a;
            lfVar5.k = 3;
            lfVar5.b |= 1024;
            qnVar.copyOnWrite();
            lf lfVar7 = qnVar.instance;
            lfVar7.b |= 2;
            lfVar7.d = true;
        }
        ba createBuilder = ky.a.createBuilder();
        ba createBuilder2 = kx.a.createBuilder();
        String str = fVar.c;
        createBuilder2.copyOnWrite();
        kx kxVar = createBuilder2.instance;
        str.getClass();
        kxVar.b |= 1;
        kxVar.c = str;
        kx build = createBuilder2.build();
        createBuilder.copyOnWrite();
        ky kyVar = createBuilder.instance;
        build.getClass();
        kyVar.c = build;
        kyVar.b |= 1;
        for (com.google.android.apps.gsa.nga.shared.u.j.b.e eVar : fVar.g) {
            if (!eVar.b.equals(fVar.c)) {
                ba createBuilder3 = kx.a.createBuilder();
                String str2 = eVar.b;
                createBuilder3.copyOnWrite();
                kx kxVar2 = createBuilder3.instance;
                str2.getClass();
                kxVar2.b |= 1;
                kxVar2.c = str2;
                kx build2 = createBuilder3.build();
                createBuilder.copyOnWrite();
                ky kyVar2 = createBuilder.instance;
                build2.getClass();
                cb cbVar = kyVar2.d;
                if (!cbVar.c()) {
                    kyVar2.d = bi.mutableCopy(cbVar);
                }
                kyVar2.d.add(build2);
            }
        }
        long j = fVar.d;
        createBuilder.copyOnWrite();
        ky kyVar3 = createBuilder.instance;
        kyVar3.b = 2 | kyVar3.b;
        kyVar3.e = j;
        qnVar.copyOnWrite();
        lf lfVar8 = qnVar.instance;
        ky build3 = createBuilder.build();
        lf lfVar9 = lf.a;
        build3.getClass();
        lfVar8.f = build3;
        lfVar8.b |= 4;
    }

    public static bl b(as asVar) {
        return asVar.l.size() > 0 ? (bl) asVar.l.get(0) : bl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.apps.gsa.nga.shared.u.m.a c(bl blVar, as asVar) {
        bj bjVar = blVar.e;
        bj bjVar2 = bjVar;
        if (bjVar == null) {
            bjVar2 = bj.a;
        }
        com.google.android.apps.gsa.nga.shared.q.d.ah ahVar = bjVar2.b == 29 ? (com.google.android.apps.gsa.nga.shared.q.d.ah) bjVar2.c : com.google.android.apps.gsa.nga.shared.q.d.ah.a;
        com.google.android.apps.gsa.nga.shared.q.d.ak a2 = com.google.android.apps.gsa.nga.shared.q.d.ak.a(ahVar.h);
        com.google.android.apps.gsa.nga.shared.q.d.ak akVar = a2;
        if (a2 == null) {
            akVar = com.google.android.apps.gsa.nga.shared.q.d.ak.a;
        }
        if (akVar.equals(com.google.android.apps.gsa.nga.shared.q.d.ak.F)) {
            ah ahVar2 = blVar.h;
            ah ahVar3 = ahVar2;
            if (ahVar2 == null) {
                ahVar3 = ah.a;
            }
            Optional j = j(asVar, ahVar3.c);
            if (j.isPresent()) {
                com.google.android.apps.gsa.nga.shared.u.m.a aVar = ((com.google.android.apps.gsa.nga.shared.q.d.cb) j.get()).d;
                com.google.android.apps.gsa.nga.shared.u.m.a aVar2 = aVar;
                if (aVar == null) {
                    aVar2 = com.google.android.apps.gsa.nga.shared.u.m.a.a;
                }
                return aVar2;
            }
            com.google.common.f.h e = f804a.e();
            e.ak(3543);
            e.p("No interpretation for POP execution");
        }
        if ((ahVar.b & 2) == 0) {
            if (u(asVar)) {
                ba createBuilder = com.google.android.apps.gsa.nga.shared.u.m.a.a.createBuilder();
                com.google.android.apps.gsa.nga.shared.u.m.b bVar = com.google.android.apps.gsa.nga.shared.u.m.b.k;
                createBuilder.copyOnWrite();
                createBuilder.instance.f = bVar.getNumber();
                return createBuilder.build();
            }
            com.google.common.f.h e2 = f804a.e();
            e2.ak(3542);
            e2.p("No interpretation for non-POP execution");
        }
        com.google.android.apps.gsa.nga.shared.u.m.a aVar3 = ahVar.d;
        com.google.android.apps.gsa.nga.shared.u.m.a aVar4 = aVar3;
        if (aVar3 == null) {
            aVar4 = com.google.android.apps.gsa.nga.shared.u.m.a.a;
        }
        return aVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.apps.gsa.shared.logger.b.f d(as asVar) {
        bl blVar;
        long j;
        fp fpVar;
        fp fpVar2 = fp.a;
        if ((asVar.b & 512) != 0) {
            bl blVar2 = asVar.y;
            bl blVar3 = blVar2;
            if (blVar2 == null) {
                blVar3 = bl.a;
            }
            bj bjVar = blVar3.e;
            bj bjVar2 = bjVar;
            if (bjVar == null) {
                bjVar2 = bj.a;
            }
            long j2 = (bjVar2.b == 49 ? (com.google.android.apps.gsa.nga.shared.q.d.ad) bjVar2.c : com.google.android.apps.gsa.nga.shared.q.d.ad.a).d;
            bj bjVar3 = blVar3.e;
            bj bjVar4 = bjVar3 == null ? bj.a : bjVar3;
            com.google.android.apps.gsa.nga.shared.q.d.ad adVar = bjVar4.b == 49 ? (com.google.android.apps.gsa.nga.shared.q.d.ad) bjVar4.c : com.google.android.apps.gsa.nga.shared.q.d.ad.a;
            fpVar = fpVar2;
            j = j2;
            if ((adVar.b & 4) != 0) {
                bj bjVar5 = bjVar3;
                if (bjVar3 == null) {
                    bjVar5 = bj.a;
                }
                fq fqVar = (bjVar5.b == 49 ? (com.google.android.apps.gsa.nga.shared.q.d.ad) bjVar5.c : com.google.android.apps.gsa.nga.shared.q.d.ad.a).e;
                fq fqVar2 = fqVar;
                if (fqVar == null) {
                    fqVar2 = fq.a;
                }
                fp a2 = fp.a(fqVar2.d);
                fpVar = a2;
                j = j2;
                if (a2 == null) {
                    fpVar = fp.a;
                    j = j2;
                }
            }
        } else {
            loop0: while (true) {
                blVar = null;
                for (bl blVar4 : asVar.m) {
                    bj bjVar6 = blVar4.e;
                    bj bjVar7 = bjVar6;
                    if (bjVar6 == null) {
                        bjVar7 = bj.a;
                    }
                    ct a3 = ct.a((bjVar7.b == 13 ? (cu) bjVar7.c : cu.a).c);
                    ct ctVar = a3;
                    if (a3 == null) {
                        ctVar = ct.a;
                    }
                    int ordinal = ctVar.ordinal();
                    if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                        bj bjVar8 = blVar4.e;
                        bj bjVar9 = bjVar8 == null ? bj.a : bjVar8;
                        if (!(bjVar9.b == 13 ? (cu) bjVar9.c : cu.a).i) {
                            bj bjVar10 = bjVar8;
                            if (bjVar8 == null) {
                                bjVar10 = bj.a;
                            }
                            ct a4 = ct.a((bjVar10.b == 13 ? (cu) bjVar10.c : cu.a).c);
                            ct ctVar2 = a4;
                            if (a4 == null) {
                                ctVar2 = ct.a;
                            }
                            if (ctVar2 == ct.f) {
                                break;
                            }
                        } else {
                            blVar = blVar4;
                        }
                    }
                }
            }
            if (blVar != null) {
                j = blVar.j;
                bj bjVar11 = blVar.e;
                bj bjVar12 = bjVar11;
                if (bjVar11 == null) {
                    bjVar12 = bj.a;
                }
                com.google.android.apps.gsa.nga.shared.u.j.b.a a5 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a((bjVar12.b == 13 ? (cu) bjVar12.c : cu.a).f);
                com.google.android.apps.gsa.nga.shared.u.j.b.a aVar = a5;
                if (a5 == null) {
                    aVar = com.google.android.apps.gsa.nga.shared.u.j.b.a.a;
                }
                int ordinal2 = aVar.ordinal();
                fpVar = ordinal2 != 2 ? ordinal2 != 8 ? fpVar2 : fp.d : fp.f;
            } else {
                j = 0;
                fpVar = fpVar2;
            }
        }
        if (j == 0) {
            return null;
        }
        com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
        eVar.a = w.ESTIMATED_END_OF_SPEECH;
        eVar.c = j;
        qn createBuilder = com.google.common.o.r.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar = createBuilder.instance;
        rVar.ae = fpVar.l;
        rVar.d |= 1024;
        eVar.b = createBuilder.build();
        return eVar.a();
    }

    public static com.google.android.apps.gsa.shared.logger.b.f e(bl blVar) {
        bj bjVar = blVar.e;
        bj bjVar2 = bjVar;
        if (bjVar == null) {
            bjVar2 = bj.a;
        }
        if (!(bjVar2.b == 13 ? (cu) bjVar2.c : cu.a).i) {
            return null;
        }
        com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
        eVar.a = w.FINAL_RECOGNIZED_TEXT_RECEIVED;
        eVar.c = blVar.j;
        return eVar.a();
    }

    public static com.google.android.apps.gsa.shared.logger.b.f f(cu cuVar) {
        com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
        eVar.a = w.TRUE_END_OF_QUERY;
        eVar.c = cuVar.h;
        qn createBuilder = com.google.common.o.r.a.createBuilder();
        com.google.android.apps.gsa.nga.shared.u.j.b.a a2 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a(cuVar.f);
        com.google.android.apps.gsa.nga.shared.u.j.b.a aVar = a2;
        if (a2 == null) {
            aVar = com.google.android.apps.gsa.nga.shared.u.j.b.a.a;
        }
        String name = aVar.name();
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar = createBuilder.instance;
        name.getClass();
        rVar.d |= 8;
        rVar.Y = name;
        eVar.b = createBuilder.build();
        return eVar.a();
    }

    public static com.google.be.c.a.a.b i(com.google.knowledge.a.a.e eVar) {
        com.google.be.c.a.a.a createBuilder = com.google.be.c.a.a.b.a.createBuilder();
        if (eVar.c.equals("ShowEntity")) {
            ba createBuilder2 = com.google.be.c.a.a.d.a.createBuilder();
            createBuilder2.copyOnWrite();
            com.google.be.c.a.a.d dVar = createBuilder2.instance;
            dVar.c = 1;
            dVar.b = 1;
            createBuilder.q(createBuilder2);
        } else {
            ba createBuilder3 = com.google.be.c.a.a.d.a.createBuilder();
            createBuilder3.copyOnWrite();
            com.google.be.c.a.a.d dVar2 = createBuilder3.instance;
            dVar2.c = 0;
            dVar2.b = 1;
            String str = eVar.c;
            createBuilder3.copyOnWrite();
            com.google.be.c.a.a.d dVar3 = createBuilder3.instance;
            str.getClass();
            dVar3.b = 2;
            dVar3.c = str;
            createBuilder.q(createBuilder3);
        }
        return createBuilder.build();
    }

    public static Optional j(as asVar, String str) {
        Optional empty = Optional.empty();
        Optional optional = empty;
        for (bl blVar : asVar.F) {
            ah ahVar = blVar.h;
            ah ahVar2 = ahVar;
            if (ahVar == null) {
                ahVar2 = ah.a;
            }
            if (ahVar2.c.equals(str)) {
                if (optional.isPresent()) {
                    com.google.common.f.h e = f804a.e();
                    e.ak(3547);
                    e.s("Multiple POP executions for the same final candidate %s.", str);
                }
                bj bjVar = blVar.e;
                bj bjVar2 = bjVar;
                if (bjVar == null) {
                    bjVar2 = bj.a;
                }
                optional = Optional.of(bjVar2.b == 96 ? (com.google.android.apps.gsa.nga.shared.q.d.cb) bjVar2.c : com.google.android.apps.gsa.nga.shared.q.d.cb.a);
            }
        }
        return optional;
    }

    public static void l(y yVar, bl blVar) {
        yVar.d = blVar.i;
        yVar.e = blVar.j;
        yVar.c = blVar.d;
    }

    public static void q(y yVar) {
        ba createBuilder = com.google.protos.f.a.a.a.createBuilder();
        com.google.be.c.a.a.b bVar = yVar.j.instance.f;
        com.google.be.c.a.a.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = com.google.be.c.a.a.b.a;
        }
        bc bcVar = yVar.k;
        createBuilder.copyOnWrite();
        com.google.protos.f.a.a aVar = createBuilder.instance;
        bVar2.getClass();
        aVar.c = bVar2;
        aVar.b |= 1;
        v byteString = createBuilder.build().toByteString();
        bcVar.copyOnWrite();
        bh bhVar = bcVar.instance;
        bh bhVar2 = bh.a;
        byteString.getClass();
        bhVar.b |= 64;
        bhVar.l = byteString;
    }

    public static boolean r(as asVar) {
        return asVar.l.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(com.google.android.apps.gsa.nga.shared.q.d.ah ahVar) {
        de deVar = ahVar.c;
        de deVar2 = deVar;
        if (deVar == null) {
            deVar2 = de.a;
        }
        com.google.android.apps.gsa.nga.shared.u.e.h hVar = deVar2.y;
        com.google.android.apps.gsa.nga.shared.u.e.h hVar2 = hVar;
        if (hVar == null) {
            hVar2 = com.google.android.apps.gsa.nga.shared.u.e.h.a;
        }
        return com.google.android.apps.gsa.nga.shared.k.f.i(hVar2).isPresent();
    }

    public static boolean t(com.google.android.apps.gsa.nga.shared.q.d.ah ahVar) {
        com.google.android.apps.gsa.nga.shared.q.d.ak a2 = com.google.android.apps.gsa.nga.shared.q.d.ak.a(ahVar.h);
        com.google.android.apps.gsa.nga.shared.q.d.ak akVar = a2;
        if (a2 == null) {
            akVar = com.google.android.apps.gsa.nga.shared.q.d.ak.a;
        }
        return akVar.equals(com.google.android.apps.gsa.nga.shared.q.d.ak.F);
    }

    public static boolean u(as asVar) {
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar = asVar.g;
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar2 = buVar;
        if (buVar == null) {
            buVar2 = com.google.android.apps.gsa.nga.shared.q.d.bu.f984a;
        }
        com.google.android.apps.gsa.assistant.shared.k.c a2 = com.google.android.apps.gsa.assistant.shared.k.c.a(buVar2.c);
        com.google.android.apps.gsa.assistant.shared.k.c cVar = a2;
        if (a2 == null) {
            cVar = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
        }
        return cVar.equals(com.google.android.apps.gsa.assistant.shared.k.c.NGA_WARM_ACTIONS);
    }

    private static lp v(bl blVar) {
        ba createBuilder = lp.a.createBuilder();
        bj bjVar = blVar.e;
        bj bjVar2 = bjVar;
        if (bjVar == null) {
            bjVar2 = bj.a;
        }
        int a2 = bz.a((bjVar2.b == 3 ? (ca) bjVar2.c : ca.a).c);
        int i = a2;
        if (a2 == 0) {
            i = 1;
        }
        createBuilder.copyOnWrite();
        lp lpVar = createBuilder.instance;
        lpVar.b |= 2;
        lpVar.d = i - 1;
        bk a3 = bk.a(blVar.c);
        bk bkVar = a3;
        if (a3 == null) {
            bkVar = bk.UNKNOWN;
        }
        createBuilder.copyOnWrite();
        lp lpVar2 = createBuilder.instance;
        lpVar2.b = 1 | lpVar2.b;
        lpVar2.c = bkVar.be;
        long j = blVar.f;
        createBuilder.copyOnWrite();
        lp lpVar3 = createBuilder.instance;
        lpVar3.b |= 8;
        lpVar3.f = j * 1000000;
        long j2 = blVar.j;
        createBuilder.copyOnWrite();
        lp lpVar4 = createBuilder.instance;
        lpVar4.b |= 4;
        lpVar4.e = j2;
        return createBuilder.build();
    }

    private final ob w() {
        ba createBuilder = ob.a.createBuilder();
        PowerManager powerManager = (PowerManager) this.j.getSystemService(PowerManager.class);
        if (powerManager != null) {
            boolean isPowerSaveMode = powerManager.isPowerSaveMode();
            createBuilder.copyOnWrite();
            ob obVar = createBuilder.instance;
            obVar.b |= 1;
            obVar.c = isPowerSaveMode;
        }
        return createBuilder.build();
    }

    private static Optional x(as asVar) {
        if (asVar.K.size() <= 0) {
            return Optional.empty();
        }
        ba createBuilder = kn.a.createBuilder();
        Stream map = Collection._EL.stream(asVar.K).map(new d(6));
        int i = fl.e;
        Iterable iterable = (Iterable) map.collect(com.google.common.b.bs.a);
        createBuilder.copyOnWrite();
        kn knVar = createBuilder.instance;
        cb cbVar = knVar.b;
        if (!cbVar.c()) {
            knVar.b = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(iterable, knVar.b);
        return Optional.of(createBuilder.build());
    }

    private final void y(as asVar, y yVar) {
        com.google.android.apps.gsa.nga.shared.q.d.w wVar;
        String str = asVar.f;
        Iterator it = asVar.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                wVar = null;
                break;
            }
            bj bjVar = ((bl) it.next()).e;
            bj bjVar2 = bjVar;
            if (bjVar == null) {
                bjVar2 = bj.a;
            }
            wVar = bjVar2.b == 5 ? (com.google.android.apps.gsa.nga.shared.q.d.w) bjVar2.c : com.google.android.apps.gsa.nga.shared.q.d.w.a;
            if (wVar.v) {
                break;
            }
        }
        for (bl blVar : asVar.j) {
            bj bjVar3 = blVar.e;
            bj bjVar4 = bjVar3;
            if (bjVar3 == null) {
                bjVar4 = bj.a;
            }
            com.google.android.apps.gsa.nga.shared.q.d.w wVar2 = bjVar4.b == 5 ? (com.google.android.apps.gsa.nga.shared.q.d.w) bjVar4.c : com.google.android.apps.gsa.nga.shared.q.d.w.a;
            ah ahVar = blVar.h;
            ah ahVar2 = ahVar;
            if (ahVar == null) {
                ahVar2 = ah.a;
            }
            com.google.android.apps.gsa.nga.shared.q.d.w wVar3 = wVar2;
            if (ahVar2.c.equals(str)) {
                wVar3 = wVar2;
                if (wVar != null) {
                    wVar3 = wVar;
                }
            }
            qn a2 = yVar.a(blVar);
            if ((wVar3.b & 4) != 0) {
                ba createBuilder = ks.a.createBuilder();
                boolean z = wVar3.e;
                createBuilder.copyOnWrite();
                ks ksVar = createBuilder.instance;
                ksVar.b |= 1;
                ksVar.c = z;
                double d = wVar3.f;
                createBuilder.copyOnWrite();
                ks ksVar2 = createBuilder.instance;
                ksVar2.b |= 2;
                ksVar2.d = d;
                double d2 = wVar3.g;
                createBuilder.copyOnWrite();
                ks ksVar3 = createBuilder.instance;
                ksVar3.b |= 4;
                ksVar3.e = d2;
                boolean z2 = wVar3.B;
                createBuilder.copyOnWrite();
                ks ksVar4 = createBuilder.instance;
                ksVar4.b |= 16384;
                ksVar4.m = z2;
                double d3 = wVar3.z;
                createBuilder.copyOnWrite();
                ks ksVar5 = createBuilder.instance;
                ksVar5.b |= 32768;
                ksVar5.n = d3;
                double d4 = wVar3.A;
                createBuilder.copyOnWrite();
                ks ksVar6 = createBuilder.instance;
                ksVar6.b |= 65536;
                ksVar6.o = d4;
                String str2 = wVar3.o;
                createBuilder.copyOnWrite();
                ks ksVar7 = createBuilder.instance;
                str2.getClass();
                ksVar7.b |= 4096;
                ksVar7.k = str2;
                String str3 = wVar3.i;
                createBuilder.copyOnWrite();
                ks ksVar8 = createBuilder.instance;
                str3.getClass();
                ksVar8.b |= 32;
                ksVar8.f = str3;
                double d5 = wVar3.q;
                createBuilder.copyOnWrite();
                ks ksVar9 = createBuilder.instance;
                ksVar9.b |= 64;
                ksVar9.g = d5;
                double d6 = wVar3.r;
                createBuilder.copyOnWrite();
                ks ksVar10 = createBuilder.instance;
                ksVar10.b |= 128;
                ksVar10.h = d6;
                double d7 = wVar3.m;
                createBuilder.copyOnWrite();
                ks ksVar11 = createBuilder.instance;
                ksVar11.b |= 1024;
                ksVar11.i = d7;
                cs csVar = wVar3.u;
                cs csVar2 = csVar;
                if (csVar == null) {
                    csVar2 = cs.a;
                }
                cr a3 = cr.a(csVar2.d);
                cr crVar = a3;
                if (a3 == null) {
                    crVar = cr.a;
                }
                createBuilder.copyOnWrite();
                ks ksVar12 = createBuilder.instance;
                ksVar12.b |= 2048;
                ksVar12.j = crVar.f;
                if ((wVar3.b & 4194304) != 0) {
                    ba createBuilder2 = kp.a.createBuilder();
                    long j = wVar3.w;
                    createBuilder2.copyOnWrite();
                    kp kpVar = createBuilder2.instance;
                    kpVar.b |= 1;
                    kpVar.c = j;
                    double d8 = wVar3.x;
                    createBuilder2.copyOnWrite();
                    kp kpVar2 = createBuilder2.instance;
                    kpVar2.b |= 2;
                    kpVar2.d = d8;
                    double d9 = wVar3.y;
                    createBuilder2.copyOnWrite();
                    kp kpVar3 = createBuilder2.instance;
                    kpVar3.b |= 4;
                    kpVar3.e = d9;
                    kp build = createBuilder2.build();
                    createBuilder.copyOnWrite();
                    ks ksVar13 = createBuilder.instance;
                    build.getClass();
                    cb cbVar = ksVar13.l;
                    if (!cbVar.c()) {
                        ksVar13.l = bi.mutableCopy(cbVar);
                    }
                    ksVar13.l.add(build);
                }
                if (this.d.i(eu.aj)) {
                    ba createBuilder3 = kr.a.createBuilder();
                    double d10 = wVar3.C;
                    createBuilder3.copyOnWrite();
                    kr krVar = createBuilder3.instance;
                    krVar.b |= 1;
                    krVar.c = d10;
                    int i = wVar3.D;
                    createBuilder3.copyOnWrite();
                    kr krVar2 = createBuilder3.instance;
                    krVar2.b |= 2;
                    krVar2.d = i;
                    int i2 = wVar3.E;
                    createBuilder3.copyOnWrite();
                    kr krVar3 = createBuilder3.instance;
                    krVar3.b |= 4;
                    krVar3.e = i2;
                    if (this.d.i(eu.ai)) {
                        br brVar = wVar3.F;
                        createBuilder3.copyOnWrite();
                        kr krVar4 = createBuilder3.instance;
                        br brVar2 = krVar4.f;
                        if (!brVar2.c()) {
                            krVar4.f = bi.mutableCopy(brVar2);
                        }
                        com.google.protobuf.c.addAll(brVar, krVar4.f);
                    }
                    createBuilder.copyOnWrite();
                    ks ksVar14 = createBuilder.instance;
                    kr build2 = createBuilder3.build();
                    build2.getClass();
                    ksVar14.p = build2;
                    ksVar14.b |= 131072;
                }
                ba createBuilder4 = kq.a.createBuilder();
                com.google.android.apps.gsa.nga.shared.q.d.v vVar = wVar3.G;
                com.google.android.apps.gsa.nga.shared.q.d.v vVar2 = vVar;
                if (vVar == null) {
                    vVar2 = com.google.android.apps.gsa.nga.shared.q.d.v.a;
                }
                boolean z3 = vVar2.b;
                createBuilder4.copyOnWrite();
                kq kqVar = createBuilder4.instance;
                kqVar.b |= 1;
                kqVar.c = z3;
                com.google.android.apps.gsa.nga.shared.q.d.v vVar3 = wVar3.G;
                com.google.android.apps.gsa.nga.shared.q.d.v vVar4 = vVar3;
                if (vVar3 == null) {
                    vVar4 = com.google.android.apps.gsa.nga.shared.q.d.v.a;
                }
                String str4 = vVar4.c;
                createBuilder4.copyOnWrite();
                kq kqVar2 = createBuilder4.instance;
                str4.getClass();
                kqVar2.b |= 2;
                kqVar2.d = str4;
                kq build3 = createBuilder4.build();
                createBuilder.copyOnWrite();
                ks ksVar15 = createBuilder.instance;
                build3.getClass();
                ksVar15.q = build3;
                ksVar15.b |= 262144;
                a2.copyOnWrite();
                lf lfVar = a2.instance;
                ks build4 = createBuilder.build();
                lf lfVar2 = lf.a;
                build4.getClass();
                lfVar.g = build4;
                lfVar.b |= 32;
            }
        }
    }

    private final void z(y yVar) {
        if (this.d.i(eu.cq)) {
            fl flVar = (fl) this.t.f462a.get();
            int size = flVar.size();
            for (int i = 0; i < size; i++) {
                com.google.android.apps.gsa.nga.engine.an.y yVar2 = (com.google.android.apps.gsa.nga.engine.an.y) flVar.get(i);
                ba createBuilder = lj.a.createBuilder();
                String str = yVar2.c;
                createBuilder.copyOnWrite();
                lj ljVar = createBuilder.instance;
                str.getClass();
                ljVar.b |= 8;
                ljVar.e = str;
                yVar2.b.ifPresent(new c(createBuilder, 17));
                int ordinal = yVar2.a.ordinal();
                if (ordinal == 0) {
                    createBuilder.copyOnWrite();
                    lj ljVar2 = createBuilder.instance;
                    ljVar2.d = 0;
                    ljVar2.b |= 4;
                } else if (ordinal == 1) {
                    createBuilder.copyOnWrite();
                    lj ljVar3 = createBuilder.instance;
                    ljVar3.d = 1;
                    ljVar3.b |= 4;
                } else if (ordinal == 2) {
                    createBuilder.copyOnWrite();
                    lj ljVar4 = createBuilder.instance;
                    ljVar4.d = 2;
                    ljVar4.b |= 4;
                } else if (ordinal == 3) {
                    createBuilder.copyOnWrite();
                    lj ljVar5 = createBuilder.instance;
                    ljVar5.d = 3;
                    ljVar5.b |= 4;
                } else if (ordinal == 4) {
                    createBuilder.copyOnWrite();
                    lj ljVar6 = createBuilder.instance;
                    ljVar6.d = 4;
                    ljVar6.b |= 4;
                }
                qn qnVar = yVar.l;
                lj build = createBuilder.build();
                qnVar.copyOnWrite();
                lr lrVar = qnVar.instance;
                lr lrVar2 = lr.a;
                build.getClass();
                cb cbVar = lrVar.q;
                if (!cbVar.c()) {
                    lrVar.q = bi.mutableCopy(cbVar);
                }
                lrVar.q.add(build);
            }
            boolean i2 = this.d.i(eu.mF);
            boolean i3 = this.d.i(eu.mI);
            if (this.d.i(eu.mH)) {
                yVar.l.N(2);
            }
            if (i3) {
                yVar.l.N(3);
            } else if (i2) {
                yVar.l.N(4);
            } else {
                yVar.l.N(5);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.r
    public final void a(bl blVar) {
        int[] iArr = w.a;
        bk a2 = bk.a(blVar.c);
        bk bkVar = a2;
        if (a2 == null) {
            bkVar = bk.UNKNOWN;
        }
        int i = iArr[bkVar.ordinal()];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fg g(as asVar, String str, String str2) {
        w wVar;
        long nanos;
        boolean z = false;
        androidx.compose.ui.l.f.e((asVar.b & 8) != 0);
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar = asVar.g;
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar2 = buVar;
        if (buVar == null) {
            buVar2 = com.google.android.apps.gsa.nga.shared.q.d.bu.f984a;
        }
        androidx.compose.ui.l.f.e((buVar2.b & 8) != 0);
        com.google.android.apps.gsa.assistant.shared.k.c a2 = com.google.android.apps.gsa.assistant.shared.k.c.a(buVar2.c);
        com.google.android.apps.gsa.assistant.shared.k.c cVar = a2;
        if (a2 == null) {
            cVar = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
        }
        switch (cVar.ordinal()) {
            case 5:
                wVar = w.OPA_MIC_OPEN_FOR_FOLLOW_ON;
                break;
            case 7:
                wVar = w.OPA_INLINE_REFINEMENT;
                break;
            case 28:
            case 35:
            case 38:
            case 39:
            case 45:
                wVar = w.OPA_SUGGESTION_CHIP_TAP;
                break;
            case 46:
                wVar = w.OPA_TEXT_QUERY_UNKNOWN;
                break;
            case 66:
            case 152:
                wVar = w.OPA_ANDROID_STARTUP_HEADSET;
                break;
            case 68:
            case 79:
            case 80:
            case 134:
                wVar = w.OPA_ANDROID_STARTUP_ASSIST_GESTURE;
                break;
            case 107:
            case 119:
                wVar = w.OPA_ANDROID_STARTUP_HOTWORD;
                break;
            case 109:
                wVar = w.OPA_MIC_TAP;
                break;
            case 110:
                wVar = w.APP_INTEGRATION_MIC_TAP;
                break;
            case 126:
            case 127:
            case 129:
            case 132:
                wVar = w.OPA_ANDROID_STARTUP_LOCKSCREEN;
                break;
            case 139:
                wVar = w.SEARCH_WIDGET_MIC_TAP;
                break;
            default:
                wVar = w.OPA_ANDROID_STARTUP_OTHER;
                break;
        }
        qn createBuilder = com.google.common.o.r.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar = createBuilder.instance;
        rVar.c |= 33554432;
        rVar.Q = true;
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar2 = createBuilder.instance;
        str.getClass();
        rVar2.b |= 4;
        rVar2.i = str;
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar3 = createBuilder.instance;
        str2.getClass();
        rVar3.d |= 8;
        rVar3.Y = str2;
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar4 = createBuilder.instance;
        rVar4.C = cVar.cF;
        rVar4.c |= 32;
        com.google.common.o.a.j a3 = com.google.common.o.a.j.a(buVar2.e);
        com.google.common.o.a.j jVar = a3;
        if (a3 == null) {
            jVar = com.google.common.o.a.j.a;
        }
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar5 = createBuilder.instance;
        rVar5.ax = jVar.e;
        rVar5.e |= 32768;
        com.google.g.z.w.l b = this.l.b();
        createBuilder.copyOnWrite();
        com.google.common.o.r rVar6 = createBuilder.instance;
        b.getClass();
        rVar6.R = b;
        rVar6.c |= 67108864;
        if ((buVar2.b & 512) != 0) {
            String str3 = buVar2.l;
            createBuilder.copyOnWrite();
            com.google.common.o.r rVar7 = createBuilder.instance;
            str3.getClass();
            rVar7.c |= 1048576;
            rVar7.L = str3;
            float f = buVar2.m;
            createBuilder.copyOnWrite();
            com.google.common.o.r rVar8 = createBuilder.instance;
            rVar8.c |= 2097152;
            rVar8.M = f;
            float f2 = buVar2.n;
            createBuilder.copyOnWrite();
            com.google.common.o.r rVar9 = createBuilder.instance;
            rVar9.c |= 4194304;
            rVar9.N = f2;
        }
        if ((asVar.b & 65536) != 0) {
            long j = asVar.M;
            createBuilder.copyOnWrite();
            com.google.common.o.r rVar10 = createBuilder.instance;
            rVar10.e |= 134217728;
            rVar10.aD = j;
        }
        fg fgVar = new fg(4);
        com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
        eVar.a = wVar;
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar3 = asVar.g;
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar4 = buVar3;
        if (buVar3 == null) {
            buVar4 = com.google.android.apps.gsa.nga.shared.q.d.bu.f984a;
        }
        com.google.android.apps.gsa.assistant.shared.k.c a4 = com.google.android.apps.gsa.assistant.shared.k.c.a(buVar4.c);
        com.google.android.apps.gsa.assistant.shared.k.c cVar2 = a4;
        if (a4 == null) {
            cVar2 = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
        }
        if (cVar2.equals(com.google.android.apps.gsa.assistant.shared.k.c.NGA_WARM_ACTIONS)) {
            bl blVar = asVar.y;
            bl blVar2 = blVar;
            if (blVar == null) {
                blVar2 = bl.a;
            }
            bj bjVar = blVar2.e;
            bj bjVar2 = bjVar;
            if (bjVar == null) {
                bjVar2 = bj.a;
            }
            nanos = (bjVar2.b == 49 ? (com.google.android.apps.gsa.nga.shared.q.d.ad) bjVar2.c : com.google.android.apps.gsa.nga.shared.q.d.ad.a).d;
        } else {
            nanos = TimeUnit.MILLISECONDS.toNanos(buVar4.f);
        }
        eVar.c = nanos;
        eVar.b = createBuilder.build();
        fgVar.h(eVar.a());
        if ((buVar2.b & 64) != 0) {
            com.google.android.apps.gsa.shared.logger.b.e eVar2 = new com.google.android.apps.gsa.shared.logger.b.e();
            eVar2.a = w.OPA_ANDROID_STARTUP_ON_SHOW;
            eVar2.c = TimeUnit.MILLISECONDS.toNanos(buVar2.i);
            fgVar.h(eVar2.a());
        }
        if ((asVar.b & 4096) != 0) {
            com.google.android.apps.gsa.shared.logger.b.e eVar3 = new com.google.android.apps.gsa.shared.logger.b.e();
            eVar3.a = w.SPEECH_RETRY_RECEIVED;
            bl blVar3 = asVar.C;
            bl blVar4 = blVar3;
            if (blVar3 == null) {
                blVar4 = bl.a;
            }
            eVar3.c = blVar4.j;
            fgVar.h(eVar3.a());
        }
        boolean z2 = false;
        for (bl blVar5 : asVar.m) {
            bj bjVar3 = blVar5.e;
            bj bjVar4 = bjVar3;
            if (bjVar3 == null) {
                bjVar4 = bj.a;
            }
            cu cuVar = bjVar4.b == 13 ? (cu) bjVar4.c : cu.a;
            ct a5 = ct.a(cuVar.c);
            ct ctVar = a5;
            if (a5 == null) {
                ctVar = ct.a;
            }
            switch (ctVar.ordinal()) {
                case 1:
                    qn createBuilder2 = com.google.common.o.r.a.createBuilder();
                    com.google.android.apps.gsa.nga.shared.u.j.b.a a6 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a(cuVar.f);
                    com.google.android.apps.gsa.nga.shared.u.j.b.a aVar = a6;
                    if (a6 == null) {
                        aVar = com.google.android.apps.gsa.nga.shared.u.j.b.a.a;
                    }
                    String name = aVar.name();
                    createBuilder2.copyOnWrite();
                    com.google.common.o.r rVar11 = createBuilder2.instance;
                    name.getClass();
                    rVar11.d |= 8;
                    rVar11.Y = name;
                    if ((cuVar.b & 32) != 0) {
                        long j2 = cuVar.g;
                        createBuilder2.copyOnWrite();
                        com.google.common.o.r rVar12 = createBuilder2.instance;
                        rVar12.e |= 1;
                        rVar12.ao = j2;
                    }
                    com.google.android.apps.gsa.shared.logger.b.e eVar4 = new com.google.android.apps.gsa.shared.logger.b.e();
                    eVar4.a = w.SPEECH_START_RECEIVED;
                    eVar4.c = blVar5.j;
                    eVar4.b = createBuilder2.build();
                    fgVar.h(eVar4.a());
                    z = true;
                    continue;
                case 2:
                    if (z) {
                        com.google.android.apps.gsa.shared.logger.b.e eVar5 = new com.google.android.apps.gsa.shared.logger.b.e();
                        eVar5.a = w.SPEECH_END_RECEIVED;
                        eVar5.c = blVar5.j;
                        fgVar.h(eVar5.a());
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    com.google.android.apps.gsa.shared.logger.b.f e = e(blVar5);
                    if (e != null) {
                        fgVar.h(e);
                        break;
                    }
                    break;
                case 7:
                    com.google.android.apps.gsa.shared.logger.b.e eVar6 = new com.google.android.apps.gsa.shared.logger.b.e();
                    eVar6.a = w.AUDIO_LISTENING_SUCCESS;
                    long j3 = cuVar.h;
                    if (j3 == 0) {
                        j3 = blVar5.j;
                    }
                    eVar6.c = j3;
                    qn createBuilder3 = com.google.common.o.r.a.createBuilder();
                    com.google.android.apps.gsa.nga.shared.u.j.b.a a7 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a(cuVar.f);
                    com.google.android.apps.gsa.nga.shared.u.j.b.a aVar2 = a7;
                    if (a7 == null) {
                        aVar2 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a;
                    }
                    String name2 = aVar2.name();
                    createBuilder3.copyOnWrite();
                    com.google.common.o.r rVar13 = createBuilder3.instance;
                    name2.getClass();
                    rVar13.d |= 8;
                    rVar13.Y = name2;
                    eVar6.b = createBuilder3.build();
                    fgVar.h(eVar6.a());
                    continue;
                case 8:
                    fgVar.h(f(cuVar));
                    continue;
                case 9:
                    com.google.android.apps.gsa.shared.logger.b.e eVar7 = new com.google.android.apps.gsa.shared.logger.b.e();
                    eVar7.a = w.FIRST_AUDIO_PROGRESS_RECEIVED;
                    eVar7.c = blVar5.j;
                    fgVar.h(eVar7.a());
                    continue;
            }
            if (!z2 && cuVar.i) {
                com.google.android.apps.gsa.shared.logger.b.e eVar8 = new com.google.android.apps.gsa.shared.logger.b.e();
                eVar8.a = w.FIRST_RECOGNIZED_TEXT_RECEIVED;
                eVar8.c = blVar5.j;
                fgVar.h(eVar8.a());
                z2 = true;
            }
        }
        if ((asVar.b & 256) != 0) {
            bl blVar6 = asVar.x;
            bl blVar7 = blVar6;
            if (blVar6 == null) {
                blVar7 = bl.a;
            }
            bj bjVar5 = blVar7.e;
            bj bjVar6 = bjVar5;
            if (bjVar5 == null) {
                bjVar6 = bj.a;
            }
            cz czVar = bjVar6.b == 76 ? (cz) bjVar6.c : cz.a;
            com.google.android.apps.gsa.shared.logger.b.e eVar9 = new com.google.android.apps.gsa.shared.logger.b.e();
            eVar9.a = w.ESTIMATED_START_OF_SPEECH;
            eVar9.c = czVar.c;
            fgVar.h(eVar9.a());
        }
        for (bl blVar8 : asVar.H) {
            bj bjVar7 = blVar8.e;
            bj bjVar8 = bjVar7;
            if (bjVar7 == null) {
                bjVar8 = bj.a;
            }
            com.google.android.apps.gsa.nga.shared.q.d.l a8 = com.google.android.apps.gsa.nga.shared.q.d.l.a((bjVar8.b == 6 ? (com.google.android.apps.gsa.nga.shared.q.d.d) bjVar8.c : com.google.android.apps.gsa.nga.shared.q.d.d.a).f);
            com.google.android.apps.gsa.nga.shared.q.d.l lVar = a8;
            if (a8 == null) {
                lVar = com.google.android.apps.gsa.nga.shared.q.d.l.UNKNOWN;
            }
            if (lVar.equals(com.google.android.apps.gsa.nga.shared.q.d.l.MANUAL_ENDPOINT)) {
                com.google.android.apps.gsa.shared.logger.b.e eVar10 = new com.google.android.apps.gsa.shared.logger.b.e();
                eVar10.a = w.OPA_STOP_RECORDING_CLICKED;
                eVar10.c = blVar8.j;
                fgVar.h(eVar10.a());
            }
        }
        if (!asVar.e.isEmpty()) {
            bl blVar9 = (bl) oo.ay(asVar.e);
            bj bjVar9 = blVar9.e;
            bj bjVar10 = bjVar9;
            if (bjVar9 == null) {
                bjVar10 = bj.a;
            }
            if (s(bjVar10.b == 29 ? (com.google.android.apps.gsa.nga.shared.q.d.ah) bjVar10.c : com.google.android.apps.gsa.nga.shared.q.d.ah.a)) {
                com.google.android.apps.gsa.shared.logger.b.e eVar11 = new com.google.android.apps.gsa.shared.logger.b.e();
                eVar11.a = w.NGA_CLOUD_HANDOVER;
                eVar11.c = blVar9.j;
                fgVar.h(eVar11.a());
            }
        }
        return fgVar;
    }

    public final cn h(y yVar, Optional optional) {
        bc createBuilder = hb.a.createBuilder();
        com.google.android.apps.gsa.nga.shared.q.d.bu buVar = yVar.h;
        if (buVar != null) {
            if ((buVar.b & 8) != 0) {
                ba createBuilder2 = com.google.common.o.a.k.a.createBuilder();
                com.google.common.o.a.j a2 = com.google.common.o.a.j.a(buVar.e);
                com.google.common.o.a.j jVar = a2;
                if (a2 == null) {
                    jVar = com.google.common.o.a.j.a;
                }
                createBuilder2.copyOnWrite();
                com.google.common.o.a.k kVar = createBuilder2.instance;
                kVar.d = jVar.e;
                kVar.b |= 4;
                long j = buVar.f;
                createBuilder2.copyOnWrite();
                com.google.common.o.a.k kVar2 = createBuilder2.instance;
                kVar2.b |= 8;
                kVar2.e = j;
                com.google.android.apps.gsa.assistant.shared.k.c a3 = com.google.android.apps.gsa.assistant.shared.k.c.a(buVar.c);
                com.google.android.apps.gsa.assistant.shared.k.c cVar = a3;
                if (a3 == null) {
                    cVar = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
                }
                createBuilder2.copyOnWrite();
                com.google.common.o.a.k kVar3 = createBuilder2.instance;
                kVar3.c = cVar.cF;
                kVar3.b |= 2;
                int aA = a.a.aA(buVar.h);
                int i = aA;
                if (aA == 0) {
                    i = 1;
                }
                createBuilder2.copyOnWrite();
                com.google.common.o.a.k kVar4 = createBuilder2.instance;
                kVar4.f = i - 1;
                kVar4.b |= 16;
                createBuilder.copyOnWrite();
                hb hbVar = createBuilder.instance;
                com.google.common.o.a.k build = createBuilder2.build();
                build.getClass();
                hbVar.aD = build;
                hbVar.g |= 67108864;
            }
            if ((buVar.b & 16) != 0) {
                long j2 = buVar.g;
                createBuilder.copyOnWrite();
                hb hbVar2 = createBuilder.instance;
                hbVar2.b |= 16;
                hbVar2.q = j2;
            }
        }
        String str = yVar.g;
        createBuilder.copyOnWrite();
        hb hbVar3 = createBuilder.instance;
        str.getClass();
        hbVar3.e |= 128;
        hbVar3.Z = str;
        String str2 = yVar.a;
        createBuilder.copyOnWrite();
        hb hbVar4 = createBuilder.instance;
        str2.getClass();
        hbVar4.b |= 4;
        hbVar4.o = str2;
        int i2 = yVar.f;
        createBuilder.copyOnWrite();
        hb hbVar5 = createBuilder.instance;
        hbVar5.b |= 2;
        hbVar5.n = i2;
        long j3 = yVar.d;
        createBuilder.copyOnWrite();
        hb hbVar6 = createBuilder.instance;
        hbVar6.f |= 32;
        hbVar6.ag = j3;
        long j4 = yVar.e;
        createBuilder.copyOnWrite();
        hb hbVar7 = createBuilder.instance;
        hbVar7.f |= 8192;
        hbVar7.ak = j4;
        long j5 = yVar.c;
        createBuilder.copyOnWrite();
        hb hbVar8 = createBuilder.instance;
        hbVar8.b = 1 | hbVar8.b;
        hbVar8.m = j5;
        qn qnVar = yVar.l;
        createBuilder.copyOnWrite();
        hb hbVar9 = createBuilder.instance;
        lr build2 = qnVar.build();
        build2.getClass();
        hbVar9.bj = build2;
        hbVar9.k |= 128;
        return this.i.k(this.v.a(createBuilder.build(), this.x), "[NGA] buildGsaClientLog", new n(this, yVar.j.build(), optional));
    }

    /* JADX WARN: Code restructure failed: missing block: B:329:0x1152, code lost:
    
        if (r8.equals(com.google.android.apps.gsa.nga.shared.q.d.ak.F) == false) goto L301;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.apps.gsa.nga.engine.v.a.y r7, java.lang.String r8, com.google.android.apps.gsa.nga.engine.v.a.as r9, java.util.List r10, com.google.common.o.o.p r11) {
        /*
            Method dump skipped, instructions count: 5218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.v.a.aa.k(com.google.android.apps.gsa.nga.engine.v.a.y, java.lang.String, com.google.android.apps.gsa.nga.engine.v.a.as, java.util.List, com.google.common.o.o.p):void");
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.b
    public final void m(hb hbVar) {
        n(hbVar, null);
    }

    public final void n(hb hbVar, ew ewVar) {
        this.i.m(this.v.a(hbVar, this.x), "[NGA] logClientEventWithVE", new v(this, ewVar));
    }

    @Override // com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.l
    public final void o(ew ewVar) {
        p(ewVar, Optional.empty());
    }

    public final void p(ew ewVar, Optional optional) {
        this.i.n("[NGA] logVeEvent", new q(this, optional, ewVar));
    }
}
