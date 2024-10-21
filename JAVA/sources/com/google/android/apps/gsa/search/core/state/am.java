package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.d.h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.ssb.d;
import com.google.common.o.hb;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.bc;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/am.class */
public final class am implements cs {

    /* renamed from: a, reason: collision with root package name */
    private final w f1237a;
    private final int b;
    private final Object c;
    private final Object d;

    public am(ae aeVar, a aVar, a aVar2, int i) {
        this.b = i;
        this.c = aeVar;
        this.d = new w(aVar);
        this.f1237a = new w(aVar2);
    }

    public am(i iVar, a aVar, a aVar2, int i) {
        this.b = i;
        this.d = iVar;
        this.c = new w(aVar);
        this.f1237a = new w(aVar2);
    }

    @Override // com.google.android.apps.gsa.search.core.state.cs
    public final /* synthetic */ cq a() {
        Object obj;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                obj = this.d;
                return (cq) obj;
            }
            if (i != 2) {
            }
        }
        obj = this.c;
        return (cq) obj;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cs
    public final void b(cl clVar) {
        Query query;
        boolean z;
        int i = this.b;
        boolean z2 = false;
        boolean z3 = false;
        if (i == 0) {
            ((w) this.d).b(clVar);
            this.f1237a.b(clVar);
            w wVar = (w) this.d;
            boolean z4 = wVar.f1313a;
            if (z4 || this.f1237a.f1313a) {
                Object obj = this.c;
                w wVar2 = this.f1237a;
                if (z4) {
                    z2 = ((com.google.android.apps.gsa.search.core.state.d.ae) obj).D((h) wVar.a());
                }
                boolean z5 = z2;
                if (wVar2.f1313a) {
                    z5 = z2 | ((com.google.android.apps.gsa.search.core.state.d.ae) obj).f.c(4L, 0L);
                }
                if (z5) {
                    ((cq) this.c).an();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            ((w) this.c).b(clVar);
            this.f1237a.b(clVar);
            w wVar3 = (w) this.c;
            if (wVar3.f1313a || this.f1237a.f1313a) {
                Object obj2 = this.d;
                w wVar4 = this.f1237a;
                boolean z6 = false;
                if (wVar4.f1313a) {
                    long j = ((j) wVar4.a()).b;
                    i iVar = (i) obj2;
                    if (iVar.b != j) {
                        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                        long j2 = iVar.b;
                        iVar.e.b();
                        iVar.f.c();
                        iVar.b = j;
                    }
                    z6 = iVar.b();
                }
                if (wVar3.f1313a) {
                    Query query2 = ((bk) wVar3.a()).m;
                    boolean bJ = query2.bJ();
                    i iVar2 = (i) obj2;
                    iVar2.d = bJ;
                    if (query2.br()) {
                        Long valueOf = Long.valueOf(query2.G);
                        if (!h.a.a.p.b.a.f.f(valueOf, iVar2.c)) {
                            iVar2.c = valueOf;
                            iVar2.e.a(iVar2.c.longValue());
                        }
                    }
                }
                if (z6) {
                    ((cq) this.d).an();
                    return;
                }
                return;
            }
            return;
        }
        int i2 = 2;
        if (i == 2) {
            ((w) this.d).b(clVar);
            this.f1237a.b(clVar);
            boolean z7 = ((w) this.d).f1313a;
            if (z7 || this.f1237a.f1313a) {
                Object obj3 = this.c;
                w wVar5 = this.f1237a;
                if (z7 || wVar5.f1313a) {
                    Query query3 = ((bk) wVar5.a()).m;
                    ba baVar = (ba) obj3;
                    if (baVar.e.co(query3)) {
                        return;
                    }
                    baVar.e = Query.b;
                    baVar.f = null;
                    if (((bk) baVar.b.a()).m.dg()) {
                        query = null;
                    } else {
                        Query query4 = ((bk) baVar.b.a()).m;
                        query = null;
                        if (!baVar.e.co(query4)) {
                            query = null;
                            if (baVar.f(query4)) {
                                baVar.e = query4;
                                baVar.f = null;
                                query = baVar.e;
                            }
                        }
                    }
                    if (query != null) {
                        baVar.c.m(dl.n(com.google.common.base.a.a), "Pumpkin producer graph callback", new aw((ae) obj3, query, 2));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != 3) {
            ((w) this.d).b(clVar);
            this.f1237a.b(clVar);
            w wVar6 = (w) this.d;
            if (wVar6.f1313a || this.f1237a.f1313a) {
                Object obj4 = this.c;
                w wVar7 = this.f1237a;
                d f = com.google.android.apps.gsa.search.core.state.d.aj.f((h) wVar6.a(), (com.google.android.apps.gsa.search.core.state.d.ah) wVar7.a());
                com.google.android.apps.gsa.search.core.state.d.aj ajVar = (com.google.android.apps.gsa.search.core.state.d.aj) obj4;
                if (f != ajVar.b) {
                    ajVar.b = f;
                    ajVar.f1280a.c(f);
                    z = true;
                } else {
                    z = false;
                }
                h hVar = (h) wVar6.a();
                com.google.android.apps.gsa.search.core.state.d.ah ahVar = (com.google.android.apps.gsa.search.core.state.d.ah) wVar7.a();
                d f2 = com.google.android.apps.gsa.search.core.state.d.aj.f(hVar, ahVar);
                if (f2 != d.e) {
                    i2 = (ahVar.f1278a == 2 || f2 == d.c) ? 0 : 1;
                }
                if (i2 != ajVar.c) {
                    ajVar.c = i2;
                    ajVar.f1280a.a(i2);
                    z3 = true;
                }
                if (z || z3) {
                    ((cq) this.c).an();
                    return;
                }
                return;
            }
            return;
        }
        ((w) this.d).b(clVar);
        this.f1237a.b(clVar);
        w wVar8 = (w) this.d;
        if (wVar8.f1313a || this.f1237a.f1313a) {
            Object obj5 = this.c;
            w wVar9 = this.f1237a;
            if (wVar9.f1313a) {
                ((bm) obj5).b = ((bk) wVar9.a()).m;
            }
            if (wVar8.f1313a) {
                f fVar = (f) wVar8.a();
                boolean M = fVar.Y() ? false : fVar.M();
                bm bmVar = (bm) obj5;
                if (bmVar.f1250a.h(1L, M)) {
                    if (M) {
                        bc createBuilder = hb.a.createBuilder();
                        createBuilder.copyOnWrite();
                        hb hbVar = createBuilder.instance;
                        hbVar.b |= 2;
                        hbVar.n = 170;
                        String b = com.google.android.libraries.search.t.k.a.b(bmVar.b.E);
                        createBuilder.copyOnWrite();
                        hb hbVar2 = createBuilder.instance;
                        b.getClass();
                        hbVar2.b |= 4;
                        hbVar2.o = b;
                        com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
                    }
                    ((cq) this.c).an();
                }
            }
        }
    }
}
