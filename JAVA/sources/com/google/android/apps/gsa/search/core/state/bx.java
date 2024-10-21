package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.ae.bg.a;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.search.core.state.g.c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.h.h;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.bi;
import java.util.concurrent.CancellationException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bx.class */
public class bx extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1255a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.bx");
    public final a b;
    public final e.a c;
    public final e.a d;
    public final e.a e;
    public final h f;
    Bundle g;
    int h;
    long i;
    boolean j;
    boolean k;
    public Query l;
    public long m;
    Query n;
    public Query o;
    public final e.a p;
    private final com.google.android.libraries.g.a q;
    private final e.a r;

    public bx(e.a aVar, com.google.android.libraries.g.a aVar2, a aVar3, e.a aVar4, e.a aVar5, e.a aVar6, h hVar, e.a aVar7, e.a aVar8) {
        super(aVar, 57);
        this.h = 0;
        this.m = 0L;
        this.n = null;
        this.o = null;
        this.q = aVar2;
        this.i = aVar2.e().toMillis();
        this.b = aVar3;
        this.c = aVar4;
        this.d = aVar5;
        this.e = aVar6;
        this.f = hVar;
        this.p = aVar7;
        this.r = aVar8;
    }

    private final void m(Bundle bundle) {
        this.g = bundle;
        this.b.q(bundle);
    }

    public final void a(int i) {
        this.h = i;
        this.b.j(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Query query) {
        this.b.r(query, this.h, ((bk) this.c.a()).m, this.o);
        this.n = query;
    }

    public final void f(Query query) {
        int i;
        if (query.bE()) {
            this.o = null;
        }
        Query query2 = this.n;
        if (!((com.google.android.apps.gsa.search.core.h.p) this.e.a()).w(com.google.android.apps.gsa.shared.k.aa.d) && query != null && (i = this.h) != 0 && i != 4 && ((!TextUtils.isEmpty(query.aO()) || !((bk) this.c.a()).m.cy()) && (query2 == null || !Query.aY(query, query2)))) {
            c(query);
        }
        if (query.cn()) {
            return;
        }
        this.o = query;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        if (((com.google.android.apps.gsa.search.core.h.p) this.e.a()).w(com.google.android.apps.gsa.shared.k.aa.d)) {
            return;
        }
        if (str.equals("signed_out_search")) {
            this.b.k();
            n nVar = (n) this.r.a();
            if (nVar.contains("previous_query") && nVar.contains("previous_query_ms")) {
                com.google.android.apps.gsa.search.core.preferences.i f = nVar.f();
                f.h("previous_query");
                f.h("previous_query_ms");
                f.b(false);
            }
        }
        this.i = this.q.e().toMillis();
        if (this.g != null) {
            m(new Bundle());
        }
        this.b.o();
        an();
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"google_account", "signed_out_search"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hJ(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
        if (((com.google.android.apps.gsa.search.core.h.p) this.e.a()).w(com.google.android.apps.gsa.shared.k.aa.d)) {
            return;
        }
        com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(c.b);
        vVar.d(bgVar);
        Object l = ((bd) vVar).br.l(bgVar.d);
        c cVar = (c) (l == null ? bgVar.b : bgVar.c(l));
        if (i != 1 || (cVar.c & 1) == 0 || cVar.g <= this.i) {
            m(new Bundle());
        } else {
            com.google.protobuf.v vVar2 = cVar.d;
            Parcelable.Creator creator = Bundle.CREATOR;
            com.google.common.f.j jVar = com.google.android.apps.gsa.shared.util.ar.f1501a;
            m((Bundle) com.google.android.apps.gsa.shared.util.ar.e(vVar2.E(), creator));
        }
        a(cVar.e);
        an();
        this.j = cVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hK(bc bcVar) {
        if (((com.google.android.apps.gsa.search.core.h.p) this.e.a()).w(com.google.android.apps.gsa.shared.k.aa.d)) {
            return;
        }
        com.google.protobuf.ba createBuilder = c.a.createBuilder();
        int i = this.h;
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        cVar.c |= 2;
        cVar.e = i;
        boolean z = this.j;
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        cVar2.c |= 4;
        cVar2.f = z;
        long j = this.i;
        createBuilder.copyOnWrite();
        c cVar3 = createBuilder.instance;
        cVar3.c |= 8;
        cVar3.g = j;
        Bundle bundle = this.g;
        if (bundle != null) {
            com.google.protobuf.v f = com.google.android.apps.gsa.shared.util.ar.f(bundle);
            createBuilder.copyOnWrite();
            c cVar4 = createBuilder.instance;
            f.getClass();
            cVar4.c |= 1;
            cVar4.d = f;
        }
        bcVar.w(c.b, createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("SearchboxState");
    }

    public final void i(j jVar, long j) {
        if (j == 0 || !jVar.f1303a.a()) {
            return;
        }
        if (this.g == null) {
            com.google.common.f.h f = f1255a.f();
            f.ak(7738);
            f.p("Attempting to start searchbox component with uninitialized store.");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
        }
        a aVar = this.b;
        boolean l = l();
        Bundle bundle = this.g;
        bundle.getClass();
        com.google.android.apps.gsa.shared.util.c.ac a2 = new com.google.android.apps.gsa.shared.util.c.ae(aVar.g(j, l, bundle), this.f, "SearchboxWork start callback").a(new c(this, 6));
        a2.c(CancellationException.class, new bw(0));
        a2.a(new a(17));
    }

    public final void k() {
        if (this.h != 7) {
            return;
        }
        if (!l()) {
            f(((bk) this.c.a()).l);
            return;
        }
        this.n = null;
        a aVar = this.b;
        new com.google.android.apps.gsa.shared.util.c.ae(aVar.h(), this.f, "SearchboxState.fetchSuggestionsAfterSessionStart").b(new bv(this, 0)).a(new a(16));
    }

    final boolean l() {
        if (((com.google.android.apps.gsa.search.core.h.p) this.e.a()).w(com.google.android.apps.gsa.shared.k.aa.d) || !this.j) {
            return false;
        }
        this.j = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        if (((com.google.android.apps.gsa.search.core.h.p) this.e.a()).w(com.google.android.apps.gsa.shared.k.aa.d)) {
            return;
        }
        m(new Bundle());
        a(0);
        this.j = false;
        an();
    }
}
