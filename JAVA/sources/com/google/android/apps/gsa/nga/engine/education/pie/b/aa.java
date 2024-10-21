package com.google.android.apps.gsa.nga.engine.education.pie.b;

import com.google.android.apps.gsa.nga.engine.education.pie.a.l;
import com.google.android.apps.gsa.nga.engine.education.pie.d;
import com.google.android.apps.gsa.nga.shared.q.c.dc;
import com.google.android.apps.gsa.nga.shared.q.c.dd;
import com.google.android.apps.gsa.nga.shared.q.c.de;
import com.google.android.apps.gsa.nga.shared.q.c.df;
import com.google.android.apps.gsa.nga.shared.u.d.a.ap;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.e;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.o.a.ab;
import com.google.common.o.a.ac;
import com.google.common.o.a.ae;
import com.google.common.o.a.ag;
import com.google.common.o.lk;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.cb;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/b/aa.class */
public final class aa implements com.google.android.apps.gsa.nga.engine.education.pie.a.k, d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.a.d f575a = com.google.common.f.a.d.j();
    private static final Duration b = Duration.ofSeconds(30);
    private final com.google.android.apps.gsa.nga.engine.v.i c;
    private final a d;
    private final com.google.android.libraries.g.a e;
    private final com.google.android.apps.gsa.nga.shared.i.a.i f;
    private final ArrayList g = new ArrayList();
    private String h = "";
    private Instant i = Instant.EPOCH;
    private boolean j = false;
    private final AtomicReference k = new AtomicReference(ae.a);
    private final j l;
    private final com.google.android.apps.gsa.nga.shared.q.a.x m;
    private final f n;

    public aa(j jVar, com.google.android.apps.gsa.nga.engine.v.i iVar, a aVar, com.google.android.libraries.g.a aVar2, com.google.android.apps.gsa.nga.shared.q.a.x xVar, com.google.android.apps.gsa.nga.shared.i.a.i iVar2, f fVar) {
        this.l = jVar;
        this.c = iVar;
        this.d = aVar;
        this.e = aVar2;
        this.m = xVar;
        this.f = iVar2;
        this.n = fVar;
    }

    private final void c(e eVar, boolean z) {
        if (z) {
            if (!this.d.i(eu.gl)) {
                com.google.common.f.a.a f = f575a.f();
                f.ak(3025);
                f.p("Not logging Pie event due to user action logging being disabled");
                return;
            }
        } else if (!this.d.i(eu.fS)) {
            com.google.common.f.a.a f2 = f575a.f();
            f2.ak(3026);
            f2.p("Not logging Pie event due to background action logging being disabled");
            return;
        }
        this.c.a(eVar.a());
    }

    private final ba g(l lVar) {
        ba createBuilder;
        synchronized (this) {
            createBuilder = ag.a.createBuilder();
            com.google.android.apps.gsa.nga.shared.u.d.a.w wVar = (com.google.android.apps.gsa.nga.shared.u.d.a.w) ((com.google.android.apps.gsa.nga.shared.s.i) this.l.d).b.get();
            createBuilder.copyOnWrite();
            ag agVar = createBuilder.instance;
            agVar.g = wVar.m;
            agVar.b |= 4;
            com.google.android.apps.gsa.nga.shared.u.d.a.l i = lVar.i();
            createBuilder.copyOnWrite();
            ag agVar2 = createBuilder.instance;
            agVar2.e = i.g;
            agVar2.b |= 1;
            at atVar = lVar.h().d;
            createBuilder.copyOnWrite();
            ag agVar3 = createBuilder.instance;
            agVar3.f = atVar.g;
            agVar3.b |= 2;
            String j = lVar.j();
            createBuilder.copyOnWrite();
            ag agVar4 = createBuilder.instance;
            j.getClass();
            agVar4.b |= 32;
            agVar4.j = j;
            int i2 = lVar.h().e;
            createBuilder.copyOnWrite();
            ag agVar5 = createBuilder.instance;
            if (i2 == 0) {
                throw null;
            }
            agVar5.h = i2 - 1;
            agVar5.b |= 8;
            ba createBuilder2 = com.google.common.o.a.af.a.createBuilder();
            if (this.d.i(eu.ga)) {
                Optional optional = lVar.h().a;
                createBuilder2.getClass();
                optional.ifPresent(new z(createBuilder2, 1));
                lVar.h().b.ifPresent(new z(createBuilder2, 0));
            }
            String str = lVar.h().c;
            createBuilder2.copyOnWrite();
            com.google.common.o.a.af afVar = createBuilder2.instance;
            str.getClass();
            afVar.b |= 4;
            afVar.e = str;
            com.google.common.o.a.af build = createBuilder2.build();
            createBuilder.copyOnWrite();
            ag agVar6 = createBuilder.instance;
            build.getClass();
            agVar6.i = build;
            agVar6.b |= 16;
            ArrayList arrayList = this.g;
            createBuilder.copyOnWrite();
            ag agVar7 = createBuilder.instance;
            cb cbVar = agVar7.k;
            if (!cbVar.c()) {
                agVar7.k = bi.mutableCopy(cbVar);
            }
            com.google.protobuf.c.addAll(arrayList, agVar7.k);
            ae aeVar = (ae) this.k.get();
            createBuilder.copyOnWrite();
            ag agVar8 = createBuilder.instance;
            aeVar.getClass();
            agVar8.l = aeVar;
            agVar8.b |= 64;
        }
        return createBuilder;
    }

    private final void h(com.google.android.apps.gsa.shared.logger.b.w wVar, ba baVar, boolean z) {
        e eVar = new e();
        eVar.a = wVar;
        qn createBuilder = r.a.createBuilder();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        com.google.common.o.a.aa build = baVar.build();
        build.getClass();
        rVar.ap = build;
        rVar.e |= 16;
        eVar.b = createBuilder.build();
        c(eVar, z);
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d
    public final lk a() {
        lk build;
        synchronized (this) {
            ba createBuilder = lk.a.createBuilder();
            if (!this.h.isEmpty()) {
                Instant f = this.e.f();
                if (this.j || this.i.plus(b).isAfter(f)) {
                    String str = this.h;
                    createBuilder.copyOnWrite();
                    lk lkVar = createBuilder.instance;
                    str.getClass();
                    lkVar.b |= 1;
                    lkVar.c = str;
                }
            }
            build = createBuilder.build();
        }
        return build;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d
    public final void b(com.google.android.apps.gsa.nga.shared.i.a.k kVar, boolean z) {
        com.google.common.f.a.a g = f575a.d().g(kVar);
        g.ak(3024);
        g.s("Trigger failure, user action: %s", Boolean.valueOf(z));
        e eVar = new e();
        eVar.a = com.google.android.apps.gsa.shared.logger.b.w.PIE_FLOW_START;
        c(eVar, z);
        com.google.android.apps.gsa.shared.logger.b.w wVar = com.google.android.apps.gsa.shared.logger.b.w.PIE_FLOW_DONE;
        ba createBuilder = com.google.common.o.a.aa.a.createBuilder();
        ba createBuilder2 = ab.a.createBuilder();
        com.google.android.apps.gsa.nga.shared.u.d.a.l b2 = kVar.b();
        createBuilder2.copyOnWrite();
        ab abVar = createBuilder2.instance;
        abVar.c = b2.g;
        abVar.b |= 1;
        com.google.android.apps.gsa.nga.shared.u.d.a.w wVar2 = (com.google.android.apps.gsa.nga.shared.u.d.a.w) ((com.google.android.apps.gsa.nga.shared.s.i) this.l.d).b.get();
        createBuilder2.copyOnWrite();
        ab abVar2 = createBuilder2.instance;
        abVar2.d = wVar2.m;
        abVar2.b |= 4;
        com.google.android.apps.gsa.nga.shared.u.d.a.j a2 = kVar.a();
        createBuilder2.copyOnWrite();
        ab abVar3 = createBuilder2.instance;
        abVar3.e = a2.Y;
        abVar3.b |= 8;
        int c = kVar.c();
        createBuilder2.copyOnWrite();
        ab abVar4 = createBuilder2.instance;
        if (c == 0) {
            throw null;
        }
        abVar4.f = c - 1;
        abVar4.b |= 16;
        createBuilder.copyOnWrite();
        com.google.common.o.a.aa aaVar = createBuilder.instance;
        ab build = createBuilder2.build();
        build.getClass();
        aaVar.c = build;
        aaVar.b = 2;
        h(wVar, createBuilder, z);
        com.google.android.apps.gsa.nga.shared.q.a.x xVar = this.m;
        String name = kVar.a().name();
        if (name == null) {
            throw new NullPointerException("Null failureCause");
        }
        String name2 = kVar.b().name();
        if (name2 == null) {
            throw new NullPointerException("Null flowId");
        }
        int c2 = kVar.c();
        String a3 = ap.a(c2);
        if (c2 == 0) {
            throw null;
        }
        xVar.b(new df("NGA_PIE_TRIGGER_FAILURE", name, a3, name2));
        com.google.android.apps.gsa.nga.shared.q.a.x xVar2 = this.m;
        String name3 = ((com.google.android.apps.gsa.nga.shared.u.d.a.w) ((com.google.android.apps.gsa.nga.shared.s.i) this.l.d).b.get()).name();
        if (name3 == null) {
            throw new NullPointerException("Null eligibility");
        }
        xVar2.b(new de("NGA_PIE_TRIGGER_FAILURE_ELIGIBILITY", name3));
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void d(l lVar, int i, com.google.android.apps.gsa.nga.shared.u.d.a.j jVar) {
        synchronized (this) {
            lVar.i().name();
            jVar.name();
            this.i = this.e.f();
            this.j = false;
            com.google.android.apps.gsa.shared.logger.b.w wVar = com.google.android.apps.gsa.shared.logger.b.w.PIE_FLOW_DONE;
            ba createBuilder = com.google.common.o.a.aa.a.createBuilder();
            ba g = g(lVar);
            ba createBuilder2 = ac.a.createBuilder();
            createBuilder2.copyOnWrite();
            ac acVar = createBuilder2.instance;
            acVar.b |= 2;
            acVar.d = i;
            createBuilder2.copyOnWrite();
            ac acVar2 = createBuilder2.instance;
            acVar2.c = jVar.Y;
            acVar2.b |= 1;
            g.copyOnWrite();
            ag agVar = g.instance;
            ac build = createBuilder2.build();
            ag agVar2 = ag.a;
            build.getClass();
            agVar.d = build;
            agVar.c = 4;
            createBuilder.copyOnWrite();
            com.google.common.o.a.aa aaVar = createBuilder.instance;
            ag build2 = g.build();
            build2.getClass();
            aaVar.c = build2;
            aaVar.b = 1;
            h(wVar, createBuilder, true);
            String name = jVar.name();
            if (name == null) {
                throw new NullPointerException("Null failureCause");
            }
            String name2 = lVar.i().name();
            if (name2 == null) {
                throw new NullPointerException("Null flowId");
            }
            int i2 = lVar.h().e;
            String a2 = ap.a(i2);
            if (i2 == 0) {
                throw null;
            }
            this.m.b(new dc("NGA_PIE_FLOW_FAILURE", name, a2, name2, i));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void e(l lVar, int i, com.google.android.apps.gsa.nga.engine.education.pie.f.h hVar) {
        synchronized (this) {
            lVar.i().name();
            if (i == 0) {
                e eVar = new e();
                eVar.a = com.google.android.apps.gsa.shared.logger.b.w.PIE_FLOW_START;
                c(eVar, true);
                this.g.clear();
                this.j = true;
                this.h = lVar.j();
                AtomicReference atomicReference = this.k;
                ba createBuilder = ae.a.createBuilder();
                ha a2 = this.n.a();
                createBuilder.copyOnWrite();
                ae aeVar = createBuilder.instance;
                bs bsVar = aeVar.b;
                if (!bsVar.c()) {
                    aeVar.b = bi.mutableCopy(bsVar);
                }
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    aeVar.b.g(((com.google.android.apps.gsa.nga.shared.u.d.a.c) it.next()).g);
                }
                fl b2 = this.f.b();
                createBuilder.copyOnWrite();
                ae aeVar2 = createBuilder.instance;
                bs bsVar2 = aeVar2.c;
                if (!bsVar2.c()) {
                    aeVar2.c = bi.mutableCopy(bsVar2);
                }
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    aeVar2.c.g(((com.google.android.apps.gsa.nga.shared.u.d.a.c) it2.next()).g);
                }
                atomicReference.set(createBuilder.build());
            }
            this.g.add(hVar.g());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void f(l lVar) {
        synchronized (this) {
            lVar.i().name();
            this.i = this.e.f();
            this.j = false;
            com.google.android.apps.gsa.shared.logger.b.w wVar = com.google.android.apps.gsa.shared.logger.b.w.PIE_FLOW_DONE;
            ba createBuilder = com.google.common.o.a.aa.a.createBuilder();
            ba g = g(lVar);
            g.copyOnWrite();
            ag agVar = g.instance;
            ag agVar2 = ag.a;
            agVar.c = 3;
            agVar.d = true;
            createBuilder.copyOnWrite();
            com.google.common.o.a.aa aaVar = createBuilder.instance;
            ag build = g.build();
            build.getClass();
            aaVar.c = build;
            aaVar.b = 1;
            h(wVar, createBuilder, true);
            String name = lVar.i().name();
            if (name == null) {
                throw new NullPointerException("Null flowId");
            }
            int i = lVar.h().e;
            String a2 = ap.a(i);
            if (i == 0) {
                throw null;
            }
            this.m.b(new dd("NGA_PIE_FLOW_SUCCESS", a2, name));
        }
    }
}
