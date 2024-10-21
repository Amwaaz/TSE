package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.gsa.h.h;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bq.class */
public class bq extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1253a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.bq");
    private final bp B;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final com.google.android.apps.gsa.search.core.ae.bj.a f;
    public int g;
    public int h;
    public int i;
    public ClientConfig j;
    public int k;
    public Query l;
    public boolean m;
    public boolean n;
    public String o;
    public String p;
    public long q;
    public boolean r;
    public String s;
    public String t;
    public SearchError u;
    private final a v;
    private final a w;
    private Query x;

    public bq(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, com.google.android.apps.gsa.search.core.ae.bj.a aVar8, h hVar) {
        super(aVar, 54);
        this.k = 0;
        this.q = 0L;
        this.v = aVar2;
        this.b = aVar3;
        this.c = aVar4;
        this.w = aVar6;
        this.d = aVar5;
        this.e = aVar7;
        this.l = Query.b;
        this.f = aVar8;
        this.o = "";
        this.p = "";
        this.s = "";
        this.t = "";
        bp bpVar = new bp(this, hVar);
        this.B = bpVar;
        bpVar.d();
    }

    public static boolean l(bk bkVar, TtsState ttsState, f fVar, Query query) {
        boolean z = false;
        if (query.cw()) {
            z = false;
            if (!query.bE()) {
                bj bjVar = bkVar.s;
                if ((!bjVar.h(query) || bjVar.f1247a != 3) && (!bkVar.C() || !query.bs() || !fVar.J(query))) {
                    z = true;
                } else {
                    if (ttsState.w()) {
                        return true;
                    }
                    z = false;
                }
            }
        }
        return z;
    }

    public final void a() {
        this.o = "";
        this.p = "";
        this.m = false;
    }

    public final void c(int i) {
        if (this.k != i) {
            this.k = i;
            this.f.f(i);
        }
    }

    public final void f(boolean z) {
        Query query;
        f fVar = (f) this.v.a();
        bk bkVar = (bk) this.d.a();
        if (fVar.K() && !bkVar.G()) {
            query = Query.b;
        } else if (bkVar.G() || !bkVar.L()) {
            query = bkVar.l;
            if (query.cS() && fVar.T() && !fVar.M()) {
                query = query.aA();
            }
        } else {
            query = null;
        }
        if (query == null) {
            return;
        }
        if (z || this.x != query) {
            if (!((j) this.b.a()).f1303a.e.equals("search")) {
                this.f.i(query);
            }
            this.x = query;
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("SearchPlateState");
        fVar.b("mode").a(new d(com.google.android.apps.gsa.searchplate.c.a.a(this.h) + "/" + this.i, false));
        fVar.b("ext").a(new d(Integer.valueOf(this.g), false));
        fVar.b("rec state").a(new d(Integer.valueOf(this.k), false));
    }

    public final boolean i(Query query) {
        return (((bm) this.w.a()).a() && ((f) this.v.a()).M()) || ((bk) this.d.a()).l.co(query);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Query query) {
        return (this.h == 4 && query.cS()) || this.h == 5;
    }

    public final String toString() {
        return "SearchPlateState[Mode:" + com.google.android.apps.gsa.searchplate.c.a.a(this.h) + "/" + this.i + " Ext:" + this.g + " Rec state:" + this.k + "%]";
    }
}
