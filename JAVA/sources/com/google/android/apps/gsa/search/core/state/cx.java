package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.s.c;
import com.google.android.apps.gsa.search.core.ae.bw.b;
import com.google.android.apps.gsa.search.core.ae.bw.d;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.at;
import com.google.common.o.gy;
import e.a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cx.class */
public class cx extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1271a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.cx");
    public final a b;
    public final a c;
    public final cu d;
    public final a e;
    public final a f;
    public final d g;
    public final com.google.android.apps.gsa.search.core.h.p h;
    public final com.google.android.apps.gsa.search.core.ae.an.a i;
    public final at j;
    public final boolean k;
    public final com.google.android.apps.gsa.search.core.ae.aq.a.a l;
    public final a m;
    public Query n;
    public boolean o;
    public b p;
    public com.google.common.util.concurrent.cn q;
    private final a r;
    private final com.google.android.apps.gsa.search.core.ae.aq.f s;
    private final a t;
    private final h u;
    private final h v;
    private final com.google.android.apps.gsa.search.core.ae.bi.a.d w;

    public cx(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, cu cuVar, d dVar, com.google.android.apps.gsa.search.core.ae.aq.f fVar, com.google.android.apps.gsa.search.core.ae.bi.a.d dVar2, a aVar7, h hVar, h hVar2, com.google.android.apps.gsa.search.core.h.p pVar, com.google.android.apps.gsa.search.core.ae.an.a aVar8, at atVar, boolean z, com.google.android.apps.gsa.search.core.ae.aq.a.a aVar9, a aVar10) {
        super(aVar, 66);
        this.b = aVar2;
        this.c = aVar3;
        this.r = aVar4;
        this.f = aVar5;
        this.e = aVar6;
        this.g = dVar;
        this.s = fVar;
        this.w = dVar2;
        this.t = aVar7;
        this.u = hVar;
        this.v = hVar2;
        this.h = pVar;
        this.d = cuVar;
        this.n = Query.b;
        this.i = aVar8;
        this.j = atVar;
        this.k = z;
        this.l = aVar9;
        this.m = aVar10;
    }

    public final void c(Query query, com.google.common.util.concurrent.cn cnVar) {
        at atVar;
        com.google.android.apps.gsa.shared.aq.b b = ((com.google.android.apps.gsa.search.core.y.a.a) this.t.a()).b("Voice search graph", query.cU() ? c.GRAPH_OPA_VOICE_SEARCH : c.GRAPH_VOICE_SEARCH, c.WORKER_VOICE_SEARCH);
        Query query2 = this.n;
        if (!query2.dg() || query2.bJ()) {
            atVar = com.google.common.base.a.a;
        } else {
            com.google.common.util.concurrent.cn b2 = this.w.b(b);
            com.google.common.util.concurrent.cn cnVar2 = b2;
            if (query2.df()) {
                cnVar2 = b2;
                if (!query2.bJ()) {
                    cnVar2 = this.s.a(new com.google.android.apps.gsa.search.core.m.s(b2), b, this.d);
                }
            }
            atVar = at.k(cnVar2);
        }
        f(this.g.a(this.n, ((j) this.e.a()).f1303a, this.d, (com.google.android.apps.gsa.search.core.m.i.a) this.r.a(), b, atVar, cnVar));
    }

    final void f(com.google.common.util.concurrent.cn cnVar) {
        this.q = cnVar;
        b bVar = this.p;
        if (bVar != null) {
            bVar.a(gy.n, false);
            this.p = null;
        }
        this.u.m(cnVar, "setControllerListenableFuture", new cw(this));
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hH() {
        if (this.o) {
            this.o = false;
            Query m = ((bk) this.c.a()).m("voicesearch");
            if (m != null) {
                n nVar = new n(this, m, 3);
                this.n = m;
                if (m.cm()) {
                    return;
                }
                com.google.common.util.concurrent.cn cnVar = this.q;
                if (cnVar != null && !cnVar.isDone() && this.q.cancel(false)) {
                    nVar.run();
                    return;
                }
                b bVar = this.p;
                if (bVar == null || bVar.d()) {
                    nVar.run();
                    return;
                }
                this.u.m(com.google.android.apps.gsa.shared.util.c.ag.f(this.p.a(com.google.android.apps.gsa.shared.logger.c.a.a(m), false), this.h.i(en.x), TimeUnit.MILLISECONDS, this.v), "Complete previous VoiceSearch", new cv(nVar));
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("VoiceSearchState");
    }
}
