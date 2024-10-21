package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.m.b;
import com.google.android.apps.gsa.search.core.m.c;
import com.google.android.apps.gsa.search.core.m.i.a;
import com.google.android.apps.gsa.search.core.m.n;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.base.at;
import com.google.common.o.gy;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bn.class */
public final class bn extends ae implements b, com.google.android.apps.gsa.search.core.m.x, a {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f1251a;
    public final c b;
    public Query c;
    public SearchError d;
    public boolean e;
    private final e.a f;
    private final e.a g;
    private final com.google.android.apps.gsa.search.core.m.i.c h;
    private a i;

    public bn(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4, com.google.android.apps.gsa.search.core.m.i.c cVar) {
        super(aVar, 58);
        this.b = new c();
        this.c = Query.b;
        this.e = true;
        this.f = aVar2;
        this.f1251a = aVar3;
        this.g = aVar4;
        this.h = cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.m.b
    public final void a(Query query) {
        bf bfVar = (bf) this.f1251a.a();
        Query query2 = this.c;
        gy a2 = com.google.android.apps.gsa.shared.logger.c.a.a(query2);
        if (query2.cI() && bfVar.o()) {
            be beVar = bfVar.d;
            beVar.getClass();
            if (beVar.b.co(query)) {
                bfVar.d.a.b = true;
            }
        }
        bfVar.c(query, a2);
    }

    @Override // com.google.android.apps.gsa.search.core.m.b
    public final void b(Query query) {
        ((bf) this.f1251a.a()).i(query, 464, gy.o, at.k(new com.google.android.apps.gsa.shared.m.a(211, 917511)));
    }

    @Override // com.google.android.apps.gsa.search.core.m.b
    public final void c() {
        this.e = false;
        this.d = null;
        ((ab) this.g.a()).b(null);
    }

    @Override // com.google.android.apps.gsa.search.core.m.b
    public final void d(Query query) {
        this.c = query;
        bk bkVar = (bk) this.f.a();
        com.google.common.base.cl.u(query.dg());
        if (bkVar.m.co(query)) {
            if (bkVar.m.co(bkVar.s.b)) {
                return;
            }
            bkVar.s.b(query);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.m.b
    public final void e(SearchError searchError) {
        this.d = searchError;
        ((ab) this.g.a()).b(searchError);
        ((bk) this.f.a()).s(searchError);
        an();
    }

    @Override // com.google.android.apps.gsa.search.core.m.b
    public final void f(Query query) {
        if (this.e || !g(query)) {
            return;
        }
        this.e = true;
        an();
    }

    @Override // com.google.android.apps.gsa.search.core.m.x
    public final boolean g(Query query) {
        return this.c.co(query) && this.c.E == query.E;
    }

    @Override // com.google.android.apps.gsa.search.core.m.x
    @Deprecated
    public final boolean h(Query query) {
        return ((bk) this.f.a()).m.co(query);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hJ(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
        this.c = Query.b;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("SearchGraphState");
        fVar.n("foreground query", this.c);
        fVar.n("error", this.d);
    }

    @Override // com.google.android.apps.gsa.search.core.m.i.a
    public final n i(Query query, com.google.common.util.concurrent.cn cnVar, com.google.common.util.concurrent.cn cnVar2, com.google.android.apps.gsa.shared.aq.b bVar) {
        int i = fl.e;
        List list = ni.a;
        a aVar = this.i;
        if (aVar == null) {
            aVar = this.h.a(this.b, this, this);
            this.i = aVar;
        }
        return aVar.j(query, cnVar, cnVar2, list, bVar);
    }

    @Override // com.google.android.apps.gsa.search.core.m.i.a
    public final n j(Query query, com.google.common.util.concurrent.cn cnVar, com.google.common.util.concurrent.cn cnVar2, List list, com.google.android.apps.gsa.shared.aq.b bVar) {
        throw null;
    }

    public final String toString() {
        return "SearchGraphState";
    }
}
