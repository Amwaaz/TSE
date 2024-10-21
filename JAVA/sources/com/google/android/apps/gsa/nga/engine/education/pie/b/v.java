package com.google.android.apps.gsa.nga.engine.education.pie.b;

import android.os.Bundle;
import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.engine.education.pie.a;
import com.google.android.apps.gsa.nga.engine.education.pie.a.l;
import com.google.android.apps.gsa.nga.engine.education.pie.a.n;
import com.google.android.apps.gsa.nga.engine.education.pie.d.b;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.shared.k.br;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.o.a.ag;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/b/v.class */
public final class v implements b, com.google.android.apps.gsa.nga.engine.education.pie.a.k {

    /* renamed from: a, reason: collision with root package name */
    public static final d f586a = d.j();
    public final com.google.android.libraries.gsa.h.h b;
    public final com.google.android.apps.gsa.nga.engine.v.i c;
    public Optional d = Optional.empty();
    public final e e = new com.google.android.apps.gsa.nga.shared.s.i(a.FLOW_NOT_IN_PROGRESS, com.google.android.libraries.gsa.h.b.c.class);
    public final com.google.android.apps.gsa.nga.shared.s.k f = new com.google.android.apps.gsa.nga.shared.s.k();
    public final ak g;
    public final j h;
    private final n i;
    private final ah j;
    private final ca k;
    private final com.google.android.apps.gsa.shared.util.q.a l;

    public v(n nVar, ak akVar, ah ahVar, j jVar, e.a aVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.shared.util.q.a aVar2, com.google.android.apps.gsa.nga.engine.v.i iVar) {
        this.i = nVar;
        this.g = akVar;
        this.j = ahVar;
        this.h = jVar;
        this.k = cl.d(new p(aVar));
        this.b = hVar;
        this.l = aVar2;
        this.c = iVar;
    }

    public static com.google.android.apps.gsa.shared.logger.b.f c(com.google.android.apps.gsa.shared.logger.b.w wVar, com.google.android.apps.gsa.nga.shared.u.d.a.w wVar2) {
        com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
        eVar.a = wVar;
        qn createBuilder = r.a.createBuilder();
        ba createBuilder2 = com.google.common.o.a.aa.a.createBuilder();
        ba createBuilder3 = ag.a.createBuilder();
        createBuilder3.copyOnWrite();
        ag agVar = createBuilder3.instance;
        agVar.g = wVar2.m;
        agVar.b |= 4;
        ag build = createBuilder3.build();
        createBuilder2.copyOnWrite();
        com.google.common.o.a.aa aaVar = createBuilder2.instance;
        build.getClass();
        aaVar.c = build;
        aaVar.b = 1;
        com.google.common.o.a.aa build2 = createBuilder2.build();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        build2.getClass();
        rVar.ap = build2;
        rVar.e |= 16;
        eVar.b = createBuilder.build();
        return eVar.a();
    }

    private final void j(a aVar) {
        this.b.n("[NGA] PieImpl.setGreeting", new r(this, aVar, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.b.e("[NGA] PieImpl.initialize", Duration.ofMillis(this.l.d(br.bg)), new u(this, 0));
        return dl.n(com.google.android.apps.gsa.v.c.f1836a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void d(l lVar, int i, com.google.android.apps.gsa.nga.shared.u.d.a.j jVar) {
        synchronized (this) {
            this.d = Optional.empty();
            j(a.FLOW_NOT_IN_PROGRESS);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void e(l lVar, int i, com.google.android.apps.gsa.nga.engine.education.pie.f.h hVar) {
        synchronized (this) {
            if (i == 0) {
                this.d = Optional.of(lVar);
                j(lVar.a());
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void f(l lVar) {
        synchronized (this) {
            this.d = Optional.empty();
            j(a.FLOW_NOT_IN_PROGRESS);
        }
    }

    public final void g(com.google.android.apps.gsa.nga.shared.u.d.a.e eVar) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.d.a.y.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.d.a.y yVar = createBuilder.instance;
        eVar.getClass();
        yVar.c = eVar;
        yVar.b = 1;
        cn a2 = this.g.a(createBuilder.build());
        a2.b(new o(this, a2, 0), ay.a);
    }

    public final void h(Bundle bundle, com.google.android.apps.gsa.nga.engine.education.pie.f fVar) {
        synchronized (this) {
            if (fVar.e == 0) {
                throw null;
            }
            com.google.android.apps.gsa.nga.shared.u.d.a.l a2 = g.a(bundle);
            if (((com.google.android.apps.gsa.nga.shared.s.i) this.h.d).b.get() != com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_ELIGIBLE) {
                com.google.common.f.a.a e = f586a.e();
                e.ak(3016);
                e.p("Not triggering new flow, Pie is not eligible");
                com.google.android.apps.gsa.nga.shared.i.a.j d = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                d.c(a2);
                d.d(fVar.e);
                d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_PIE_NOT_ELIGIBLE);
                throw d.a();
            }
            if (i()) {
                com.google.common.f.a.a e2 = f586a.e();
                e2.ak(3015);
                e2.p("Not triggering new flow, one is already in progress");
                com.google.android.apps.gsa.nga.shared.i.a.j d2 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                d2.c(a2);
                d2.d(fVar.e);
                d2.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_FLOW_IN_PROGRESS);
                throw d2.a();
            }
            n nVar = this.i;
            com.google.android.apps.gsa.nga.shared.u.d.a.l a3 = g.a(bundle);
            a3.name();
            Function m = e$.ExternalSyntheticApiModelOutline0.m(nVar.b.get(a3));
            if (m == null) {
                com.google.common.f.a.a e3 = n.f573a.e();
                e3.ak(2997);
                e3.s("Could not find flow for ID \"%s\"", a3.name());
                com.google.android.apps.gsa.nga.shared.i.a.j d3 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                d3.c(a3);
                d3.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_FLOW_CREATION_FAILED);
                d3.d(fVar.e);
                throw d3.a();
            }
            l lVar = (l) e$.ExternalSyntheticApiModelOutline0.m(m, bundle);
            lVar.l(fVar);
            this.j.f577a = Optional.of(bundle);
            qj j = ((ha) this.k.a()).j();
            while (j.hasNext()) {
                lVar.k((com.google.android.apps.gsa.nga.engine.education.pie.a.k) j.next());
            }
            lVar.k(this);
            lVar.m();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.f.a();
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.d.a.e.a.createBuilder();
        com.google.android.apps.gsa.nga.shared.u.d.a.w wVar = com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_INELIGIBLE_UNINITIALIZED;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.d.a.e eVar = createBuilder.instance;
        eVar.c = Integer.valueOf(wVar.m);
        eVar.b = 2;
        g((com.google.android.apps.gsa.nga.shared.u.d.a.e) createBuilder.build());
    }

    final boolean i() {
        synchronized (this) {
            if (((com.google.android.apps.gsa.nga.shared.s.i) this.h.d).b.get() == com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_ELIGIBLE) {
                final int i = 0;
                if (((Boolean) this.d.map(new Function(i) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.b.q

                    /* renamed from: a, reason: collision with root package name */
                    private final int f585a;

                    {
                        this.f585a = i;
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return this.f585a != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f585a != 0 ? Locale.forLanguageTag((String) obj) : Boolean.valueOf(((l) obj).n());
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return this.f585a != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
    }
}
