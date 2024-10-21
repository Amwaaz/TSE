package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.o.gv;
import com.google.common.o.gy;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bg.class */
public final class bg implements cs {

    /* renamed from: a, reason: collision with root package name */
    private final bf f1246a;
    private final w b;
    private final w c;
    private final w d;
    private final w e;
    private final w f;

    public bg(bf bfVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f1246a = bfVar;
        this.b = new w(aVar);
        this.c = new w(aVar2);
        this.d = new w(aVar3);
        this.e = new w(aVar4);
        this.f = new w(aVar5);
    }

    @Override // com.google.android.apps.gsa.search.core.state.cs
    public final /* synthetic */ cq a() {
        return this.f1246a;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cs
    public final void b(cl clVar) {
        this.b.b(clVar);
        this.c.b(clVar);
        this.d.b(clVar);
        this.e.b(clVar);
        this.f.b(clVar);
        w wVar = this.b;
        if (wVar.f1313a || this.c.f1313a || this.d.f1313a || this.e.f1313a || this.f.f1313a) {
            bf bfVar = this.f1246a;
            w wVar2 = this.c;
            w wVar3 = this.d;
            w wVar4 = this.e;
            w wVar5 = this.f;
            bk bkVar = (bk) wVar3.a();
            Query query = bkVar.m;
            f fVar = (f) wVar.a();
            be beVar = bfVar.d;
            if (bfVar.o()) {
                long j = bkVar.j;
                be beVar2 = bfVar.d;
                beVar2.getClass();
                if (j == beVar2.b.E) {
                    beVar2.getClass();
                    bfVar.f(beVar2, 465, gy.M);
                }
            }
            if (bfVar.o()) {
                be beVar3 = bfVar.d;
                beVar3.getClass();
                if (beVar3.b.E != query.E) {
                    if (query.cK() && !query.bE()) {
                        bfVar.f(beVar3, 463, gy.S);
                    } else if (query.cR() && !query.bE()) {
                        bfVar.f(beVar3, 463, gy.T);
                    } else if (query.bG()) {
                        bfVar.f(beVar3, 463, gy.W);
                    } else {
                        gy a2 = com.google.android.apps.gsa.shared.logger.c.a.a(query);
                        beVar3.a.b = query.cI();
                        bfVar.f(beVar3, 465, a2);
                    }
                }
            }
            if (bfVar.d == null) {
                bfVar.d = bfVar.a(query);
            }
            long j2 = fVar.h.E;
            if (wVar4.f1313a) {
                int i = ((bq) wVar4.a()).k;
                if (bfVar.o() && (i == 4 || i == 9)) {
                    be beVar4 = bfVar.d;
                    beVar4.getClass();
                    beVar4.a.c(gv.b, bfVar.f1245a.a());
                }
            }
            if (bfVar.o() && wVar3.f1313a) {
                be beVar5 = bfVar.d;
                beVar5.getClass();
                if (query.D > 0) {
                    com.google.android.apps.gsa.search.core.m.c.a aVar = beVar5.a;
                    aVar.c(gv.c, aVar.a(gv.a) + query.D);
                }
                Query query2 = beVar5.b;
                if (query2 != query) {
                    com.google.common.base.cl.u(query2.E == query.E);
                    beVar5.b = query;
                }
            }
            if (wVar2.f1313a) {
                SearchError searchError = ((ab) wVar2.a()).d;
                if (bf.p(bfVar.d) && searchError != null) {
                    bfVar.l(searchError);
                }
            }
            if (bfVar.o()) {
                be beVar6 = bfVar.d;
                beVar6.getClass();
                if (bkVar.K(beVar6.b) && bfVar.o()) {
                    be beVar7 = bfVar.d;
                    beVar7.getClass();
                    beVar7.c = new com.google.android.apps.gsa.shared.m.a(211, 524292);
                    bfVar.f(beVar7, 464, gy.e);
                }
            }
            if (wVar.f1313a && bf.p(bfVar.d) && bfVar.o()) {
                be beVar8 = bfVar.d;
                beVar8.getClass();
                if (beVar8.b.E == j2) {
                    beVar8.getClass();
                    if (fVar.J(fVar.h) && fVar.L(fVar.i)) {
                        bfVar.f(beVar8, 463, gy.l);
                    }
                }
            }
            if (wVar5.f1313a && bf.p(bfVar.d) && ((TtsState) wVar5.a()).y()) {
                be beVar9 = bfVar.d;
                beVar9.getClass();
                bfVar.f(beVar9, 463, gy.m);
            }
            if (bfVar.o()) {
                be beVar10 = bfVar.d;
                beVar10.getClass();
                if (beVar10.b.bG()) {
                    bfVar.f(beVar10, 463, gy.Y);
                }
            }
            if (beVar != bfVar.d) {
                this.f1246a.an();
            }
        }
    }
}
