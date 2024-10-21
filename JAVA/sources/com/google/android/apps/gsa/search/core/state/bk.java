package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.a.b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.c.c;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.k.bd;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.dk;
import com.google.common.b.ha;
import com.google.common.b.oo;
import com.google.common.b.pq;
import com.google.common.base.at;
import com.google.common.base.aw;
import com.google.common.o.gy;
import com.google.common.o.hb;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bk.class */
public class bk extends ae implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1248a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.bk");
    private static final ha x = ha.t("debug_search_scheme_override", "debug_search_domain_override", "google_account");
    private final a B;
    private final a C;
    private final a D;
    private final a E;
    private final a H;
    private final a I;
    private final a J;
    private final a K;
    private final a L;
    private final a M;
    private final a N;
    private final c O;
    private final com.google.android.apps.gsa.shared.logger.a.a P;
    private final a Q;
    private final h R;
    private final at S;
    private final com.google.android.apps.gsa.search.core.ae.bk.a T;
    private final com.google.android.apps.gsa.search.core.ae.bg.a U;
    private Query V;
    private boolean W;
    private final Queue X;
    private final Query Y;
    private final com.google.android.libraries.g.a Z;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final com.google.android.apps.gsa.search.core.h.p i;
    public long j;
    public boolean k;
    public Query l;
    public Query m;
    public Query n;
    public Query o;
    public boolean p;
    final List q;
    public Bundle r;
    public final bj s;
    public boolean t;
    public boolean u;
    public boolean v;
    public at w;

    public bk(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, a aVar18, com.google.android.apps.gsa.search.core.h.p pVar, c cVar, com.google.android.apps.gsa.shared.logger.a.a aVar19, com.google.android.apps.gsa.search.core.ae.bk.a aVar20, com.google.android.apps.gsa.search.core.ae.bg.a aVar21, a aVar22, h hVar, at atVar, Query query, com.google.android.libraries.g.a aVar23) {
        super(aVar, 50);
        Query query2 = Query.b;
        this.V = Query.b;
        this.q = new ArrayList();
        this.X = new pq(new dk(3));
        this.w = com.google.common.base.a.a;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.B = aVar;
        this.C = aVar2;
        this.b = aVar3;
        this.c = aVar4;
        this.D = aVar5;
        this.E = aVar6;
        this.H = aVar7;
        this.I = aVar8;
        this.J = aVar9;
        this.d = aVar10;
        this.e = aVar11;
        this.K = aVar12;
        this.N = aVar15;
        this.L = aVar13;
        this.M = aVar14;
        this.f = aVar16;
        this.g = aVar17;
        this.h = aVar18;
        this.i = pVar;
        this.O = cVar;
        Query q = Query.b.I().q();
        this.m = q;
        this.l = q.L();
        this.n = Query.b;
        this.o = Query.b;
        this.s = new bj(aVar6);
        this.P = aVar19;
        this.T = aVar20;
        this.U = aVar21;
        this.Q = aVar22;
        this.R = hVar;
        this.S = atVar;
        this.Y = query;
        this.Z = aVar23;
    }

    public static ActionData a(Bundle bundle) {
        return bundle.getParcelable("velvet:query_state:action_data");
    }

    private final Query ac(Query query) {
        return query.aG(bt.a(query));
    }

    private static void ad(com.google.android.apps.gsa.shared.util.debug.a.f fVar, String str, Query query) {
        if (query.equals(Query.b)) {
            fVar.b(str).a(new d("EMPTY", false));
        } else {
            fVar.n(str, query);
        }
    }

    private static void ae(Collection collection, boolean z, Object obj) {
        if (z) {
            collection.add(obj);
        }
    }

    private final void af() {
        ag(false, this.q);
        this.n = Query.b;
    }

    private final void ag(boolean z, List list) {
        boolean z2;
        f fVar = (f) this.b.a();
        if (this.m.cS() || this.m.ca()) {
            ActionData actionData = fVar.i;
            if (!this.m.cw() && !this.m.cc() && ((!fVar.J(this.m) || (actionData != null && actionData.i())) && !z)) {
                z2 = false;
                boolean z3 = (this.m.cS() || this.m.cw()) ? z2 & (!this.m.bj()) : false;
                if (ao(this.m) && z3) {
                    com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                    list.add(((com.google.android.apps.gsa.search.core.state.b.a) this.B.a()).j(this.m));
                }
                return;
            }
        }
        z2 = true;
        if (this.m.cS()) {
        }
        if (ao(this.m)) {
            return;
        }
        com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
        list.add(((com.google.android.apps.gsa.search.core.state.b.a) this.B.a()).j(this.m));
    }

    private static boolean ao(Query query) {
        return query.df() && !query.bJ() && query.bz();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [e.a, java.lang.Object] */
    private final boolean ap(Query query) {
        int a2;
        boolean z = true;
        boolean z2 = query.cy() && ((a2 = query.a("android.opa.extra.TRIGGERED_BY")) == 54 || a2 == 48);
        boolean z3 = this.i.w(bd.a) && query.aZ("android.opa.extra.HANDOVER_FROM_APA");
        if (!this.i.w(com.google.android.apps.gsa.shared.k.az.gt) || !((com.google.android.apps.gsa.staticplugins.nga.a.a.bg) this.S.a.a()).a().a() || query.aZ("android.opa.extra.QUERY_INITIATED_BY_NGA") || ((!z2 && !query.cU()) || z3 || !((j) this.c.a()).f1303a.e.equals("opa"))) {
            z = false;
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        return z;
    }

    public static Query l(Bundle bundle) {
        return (Query) bundle.getParcelable("velvet:query_state:query");
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final boolean A(Query query) {
        return this.s.h(query) && this.s.e;
    }

    public final boolean B(Query query) {
        if (query.bx() && this.l.cq() && this.l.aZ("android.opa.extra.RECOGNITION_CANCEL_BY_NGA")) {
            return false;
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.common.f.am.d.getClass();
        T(query);
        Query dq = this.l.dq();
        this.l = dq;
        Query ar = dq.ar(this.i.w(com.google.android.apps.gsa.shared.k.az.lp));
        this.l = ar;
        if (!this.W) {
            this.l = ar.av().ak();
        }
        if (this.l.cS() || this.l.ca()) {
            this.l = this.l.m(new LatencyEvents(0L, 0L, 0L, 0L, 0L));
        }
        if (TextUtils.isEmpty(this.l.aR())) {
            Query query2 = this.l;
            com.google.android.apps.gsa.shared.logger.a.a aVar = this.P;
            String str = aVar.f1460a;
            this.l = query2.at(aVar.f1460a);
        }
        if (ap(this.l)) {
            this.w = at.k(this.l);
            return true;
        }
        if (!this.l.aX()) {
            return false;
        }
        af();
        Query as = this.l.as(((j) this.c.a()).f1303a.e);
        this.l = as;
        Query q = as.q();
        x(q);
        this.l = q;
        if (q.cx()) {
            this.X.add(this.l.g.toString());
        }
        this.v = true;
        this.O.p(this.m);
        this.u = false;
        if (this.p) {
            this.p = false;
        }
        P();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C() {
        bj bjVar = this.s;
        return bjVar.h(this.m) && bjVar.f1247a == 4;
    }

    public final boolean D() {
        return !this.n.equals(Query.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E() {
        f fVar = (f) this.b.a();
        ActionData actionData = fVar.i;
        return this.m.ca() && fVar.J(this.m) && actionData != null && !actionData.i();
    }

    public final boolean F() {
        if (this.m.cq()) {
            return false;
        }
        if (this.m.co(this.s.b)) {
            return this.s.g(this.m);
        }
        return true;
    }

    public final boolean G() {
        return !this.m.co(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final boolean H() {
        return k() == null && this.l.cq();
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final boolean I() {
        return ((z) this.D.a()).c();
    }

    public final boolean J(Query query) {
        return this.s.i(query) || K(query);
    }

    public final boolean K(Query query) {
        bj bjVar = this.s;
        if (bjVar.h(query) && bjVar.f1247a == 5) {
            return true;
        }
        SearchError a2 = ((ab) this.E.a()).a(query);
        return this.m.co(query) && (a2 != null && a2.h == 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L() {
        return this.m.cq() && !((j) this.c.a()).f1303a.j();
    }

    public final boolean M(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        return !this.o.equals(Query.b) && this.o.co(query);
    }

    public final boolean N() {
        return this.l.g.toString().isEmpty();
    }

    public final boolean O() {
        f fVar = (f) this.b.a();
        boolean v = ((TtsState) this.e.a()).v(fVar.g());
        boolean z = fVar.T() || this.m.cf();
        boolean G = G();
        if (this.n.equals(Query.b) || !v || !z || G) {
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            return false;
        }
        if (ap(this.n)) {
            com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
            this.w = at.k(this.n);
            this.n = Query.b;
            return true;
        }
        com.google.common.base.cl.u(fVar.J(this.m));
        Query query = this.n;
        af();
        x(query.m(new LatencyEvents(0L, 0L, 0L, 0L, 0L)).q());
        this.v = true;
        this.l = this.l.l(this.m);
        com.google.common.f.ab abVar3 = com.google.common.f.a.e.a;
        return true;
    }

    public final boolean P() {
        boolean cY;
        if (this.t || this.m.cq() || this.m.equals(Query.b)) {
            return false;
        }
        if (this.m.cZ() && this.m.cY()) {
            this.t = true;
            Y((j) this.c.a());
            return true;
        }
        f fVar = (f) this.b.a();
        if (!fVar.J(this.m) || !fVar.T()) {
            return false;
        }
        if (fVar.M()) {
            cY = this.m.cZ();
            this.t = cY;
        } else {
            cY = this.m.cY();
            this.t = cY;
        }
        if (cY) {
            Y((j) this.c.a());
        }
        return this.t;
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final boolean Q() {
        return (this.m.cS() && !this.m.bE() && this.m.i.isEmpty()) || this.m.ca();
    }

    public final boolean R(Query query, boolean z, boolean z2, boolean z3) {
        boolean z4 = this.m.co(query) && this.s.g(query);
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (!z4) {
            return false;
        }
        if (query.cS() || query.ca()) {
            bm bmVar = (bm) this.J.a();
            boolean z5 = false;
            if (!((j) this.c.a()).f1303a.p()) {
                z5 = false;
                if (bmVar.a()) {
                    z5 = true;
                }
            }
            if ((z2 || z3 || !query.bx()) && (z || z5)) {
                VoiceAction f = ((f) this.b.a()).f();
                if (f != null) {
                    bc createBuilder = hb.a.createBuilder();
                    createBuilder.copyOnWrite();
                    hb hbVar = createBuilder.instance;
                    hbVar.b |= 2;
                    hbVar.n = 159;
                    int i = f.g().cP;
                    createBuilder.copyOnWrite();
                    hb hbVar2 = createBuilder.instance;
                    hbVar2.b |= 256;
                    hbVar2.s = i;
                    com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
                }
                S(true);
            } else if (z2) {
                this.s.e(6);
            } else {
                this.s.e(5);
                f fVar = (f) this.b.a();
                fVar.C();
                fVar.x = query;
                fVar.af(true);
                fVar.an();
            }
        } else {
            this.s.c();
        }
        if (!z) {
            query = Query.b;
        }
        this.V = query;
        return true;
    }

    public final boolean S(boolean z) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        f fVar = (f) this.b.a();
        ActionData actionData = fVar.J(this.m) ? fVar.i : null;
        bi biVar = new bi();
        if (actionData != null && (actionData.a() > 0 || actionData.i > 0)) {
            aa(biVar);
            List list = this.q;
            ActionData a2 = a((Bundle) list.get(list.size() - 1));
            if (!this.q.isEmpty() && a2 != null && a2.j()) {
                List list2 = this.q;
                list2.remove(list2.size() - 1);
            }
        }
        aa(biVar);
        int size = this.q.size() - 1;
        if (size < 0) {
            ((com.google.android.apps.gsa.search.core.state.b.a) this.B.a()).c(null);
            return false;
        }
        Bundle bundle = (Bundle) this.q.remove(size);
        com.google.android.apps.gsa.shared.logger.k.h(new com.google.android.apps.gsa.shared.logger.w(-1, true, (String) null, (Integer) null, (com.google.android.apps.gsa.shared.logger.b) null, (com.google.android.apps.gsa.shared.logger.t) null));
        Query l = l(bundle);
        Query C = z ? l.C() : l.u();
        Query query = C;
        if (this.t) {
            query = C.av().ak();
        }
        Query query2 = query;
        if (this.k) {
            query2 = query.w();
        }
        x(query2);
        this.l = query2;
        bj bjVar = this.s;
        bjVar.e = true;
        bjVar.c();
        ActionData a3 = a(bundle);
        if (a3 != null) {
            ba baVar = (ba) this.H.a();
            baVar.e = this.m;
            ActionData actionData2 = a3;
            if (!a3.m()) {
                actionData2 = ActionData.a;
            }
            baVar.f = actionData2;
        }
        this.v = true;
        this.r = bundle;
        return true;
    }

    public final boolean T(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (query == this.l) {
            return false;
        }
        this.l = ac(query);
        return true;
    }

    public final boolean U(Query query) {
        com.google.common.base.cl.u(!query.cq());
        if (!this.m.co(query)) {
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            return true;
        }
        if (this.V.r != query.r) {
            com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
            return false;
        }
        this.V = Query.b;
        com.google.common.f.ab abVar3 = com.google.common.f.a.e.a;
        return true;
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final boolean V() {
        return ((cg) this.K.a()).i();
    }

    public final boolean W() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (G()) {
            return false;
        }
        if (((f) this.b.a()).K()) {
            Query p = this.l.p();
            this.l = p;
            this.l = ac(p);
        }
        this.l = this.l.L().n().m(new LatencyEvents(0L, 0L, 0L, 0L, 0L));
        return true;
    }

    public final boolean X(Query query) {
        if (this.p || !this.m.co(query) || this.m.cw() || ((f) this.b.a()).J(this.m)) {
            return false;
        }
        this.p = true;
        return true;
    }

    public final boolean Y(j jVar) {
        boolean z = jVar.f1303a.E() && !this.t;
        if (z == this.W) {
            return false;
        }
        this.W = z;
        return true;
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final void Z() {
        boolean z;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.common.f.am.d.getClass();
        if (!G() || z()) {
            f fVar = (f) this.b.a();
            VoiceAction f = fVar.f();
            ActionData actionData = fVar.i;
            if (actionData != null && f != null && !f.A()) {
                ((com.google.android.apps.gsa.search.core.state.d.w) fVar.e.a()).c(actionData, 32);
            }
            this.n = Query.b;
            Query query = this.m;
            z = false;
            if (S(false)) {
                bn bnVar = (bn) this.I.a();
                ((bf) bnVar.f1251a.a()).c(bnVar.c, gy.M);
                bnVar.b.a();
                this.j = query.E;
            }
            if (z || L()) {
                this.T.f();
                an();
            }
            dl.n(Boolean.valueOf(z));
        }
        if (this.l.cp()) {
            this.l = this.l.k(this.m);
        } else {
            this.l = this.m;
        }
        an();
        z = true;
        if (z) {
        }
        this.T.f();
        an();
        dl.n(Boolean.valueOf(z));
    }

    public final void aa(aw awVar) {
        int size = this.q.size();
        while (true) {
            size--;
            if (size <= 0 || awVar.a(this.q.get(size))) {
                return;
            } else {
                this.q.remove(size);
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.UNDOABLE_INTERACTION_NOT_HANDLED, com.google.android.apps.gsa.search.shared.service.c.ac.STOP_LISTENING, com.google.android.apps.gsa.search.shared.service.c.ac.QUERY_SET, com.google.android.apps.gsa.search.shared.service.c.ac.QUERY_EDIT, com.google.android.apps.gsa.search.shared.service.c.ac.CANCEL, com.google.android.apps.gsa.search.shared.service.c.ac.GO_BACK, com.google.android.apps.gsa.search.shared.service.c.ac.QUERY_COMMIT};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ActionData c() {
        Query query = this.m;
        bj bjVar = this.s;
        ActionData actionData = bjVar.d;
        if (actionData == null || bjVar.b.r != query.r) {
            return null;
        }
        return actionData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SearchError f() {
        return this.s.a(this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hG(Query query, Bundle bundle) {
        bundle.putParcelable("velvet:query_state:query", this.m);
        f fVar = (f) this.b.a();
        bundle.putParcelable("velvet:query_state:action_data", fVar.i);
        List list = fVar.j;
        if (list != null) {
            bundle.putParcelableArrayList("velvet:query_state:voice_actions", new ArrayList<>(list));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return (String[]) x.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hJ(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
        com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.core.state.g.a.b);
        vVar.d(bgVar);
        Object l = ((com.google.protobuf.bd) vVar).br.l(bgVar.d);
        com.google.android.apps.gsa.search.core.state.g.a aVar = (com.google.android.apps.gsa.search.core.state.g.a) (l == null ? bgVar.b : bgVar.c(l));
        this.n = Query.b;
        this.q.clear();
        com.google.android.apps.gsa.shared.search.a.b bVar = aVar.d;
        com.google.android.apps.gsa.shared.search.a.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = com.google.android.apps.gsa.shared.search.a.b.f1481a;
        }
        Query b = com.google.android.apps.gsa.shared.search.c.b(bVar2, i);
        if (i == 1) {
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            for (com.google.protobuf.v vVar2 : aVar.e) {
                Parcelable.Creator creator = Bundle.CREATOR;
                com.google.common.f.j jVar = com.google.android.apps.gsa.shared.util.ar.f1501a;
                Bundle bundle = (Bundle) com.google.android.apps.gsa.shared.util.ar.e(vVar2.E(), creator);
                if (bundle != null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                    this.q.add(bundle);
                }
            }
        } else {
            com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
            Query q = Query.b.I().q();
            for (int i2 = 0; i2 < 2; i2++) {
                Query query = new Query[]{q, b}[i2];
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("velvet:query_state:query", query);
                bundle2.setClassLoader(getClass().getClassLoader());
                this.q.add(bundle2);
            }
        }
        S(false);
        if (!ao(b)) {
            this.l = b;
        }
        this.t = aVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hK(bc bcVar) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        ArrayList arrayList = new ArrayList(this.q);
        ag(true, arrayList);
        com.google.protobuf.ba createBuilder = com.google.android.apps.gsa.search.core.state.g.a.a.createBuilder();
        boolean z = this.t;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.core.state.g.a aVar = createBuilder.instance;
        aVar.c |= 2;
        aVar.f = z;
        Query query = this.l;
        if (query != null) {
            com.google.android.apps.gsa.shared.search.a.b a2 = com.google.android.apps.gsa.shared.search.c.a(query);
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.core.state.g.a aVar2 = createBuilder.instance;
            a2.getClass();
            aVar2.d = a2;
            aVar2.c = 1 | aVar2.c;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            createBuilder.bY(com.google.android.apps.gsa.shared.util.ar.f((Bundle) arrayList.get(i)));
        }
        bcVar.w(com.google.android.apps.gsa.search.core.state.g.a.b, createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        boolean S;
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal == 18) {
            S = S(false);
        } else {
            if (ordinal != 27) {
                if (ordinal != 29) {
                    if (ordinal != 37) {
                        switch (ordinal) {
                            case 33:
                                Query k = ((Query) clientEventData.b(Query.class)).k(this.l);
                                com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                                if (T(k)) {
                                    an();
                                    return;
                                }
                                return;
                            case 34:
                                Query query = (Query) clientEventData.b(Query.class);
                                com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
                                if (T(query.k(this.l).o()) && W()) {
                                    an();
                                    return;
                                }
                                return;
                            case 35:
                                Query query2 = (Query) clientEventData.b(Query.class);
                                if (((j) this.c.a()).f1303a.a() && query2.cx()) {
                                    com.google.android.apps.gsa.shared.util.c.ac a3 = new com.google.android.apps.gsa.shared.util.c.ae(this.U.a(query2), this.R, "SearchboxWork.fillRootStatsAndAddProtoToQuery").a(new c(this, 5));
                                    a3.b(com.google.android.apps.gsa.search.core.service.g.a.a.class, new b(this, query2, 5));
                                    a3.a(new b(this, query2, 6));
                                    an();
                                    return;
                                }
                                long i = this.i.i(com.google.android.apps.gsa.shared.k.ap.c);
                                Bundle bundle = query2.w;
                                long j2 = bundle == null ? 0L : bundle.getLong("on_show_time");
                                long b = this.Z.b();
                                com.google.common.f.ab abVar3 = com.google.common.f.a.e.a;
                                if (i <= 0 || j2 <= 0 || (b - j2) / 1000000 <= i) {
                                    p(query2);
                                    return;
                                }
                                com.google.common.f.h d = f1248a.d();
                                d.aj(com.google.common.f.a.e.a, "QueryState");
                                com.google.common.f.h hVar = d;
                                hVar.ak(7641);
                                hVar.p("#non-network-failure: Query took too long to reach commit.");
                                p(this.Y.I().z(true));
                                ((com.google.android.apps.gsa.shared.logger.b.h) this.g.a()).b(com.google.android.apps.gsa.shared.logger.b.w.OPA_ENDSTATE_QUERY_COMMIT_TIMEOUT);
                                return;
                            default:
                                return;
                        }
                    }
                    com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
                    com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.u.a);
                    adVar.d(bgVar);
                    boolean z = false;
                    if (((com.google.protobuf.bd) adVar).br.o(bgVar.d)) {
                        com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
                        com.google.protobuf.bg bgVar2 = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.u.a);
                        adVar2.d(bgVar2);
                        Object l = ((com.google.protobuf.bd) adVar2).br.l(bgVar2.d);
                        z = false;
                        if (((com.google.android.apps.gsa.search.shared.service.c.v) (l == null ? bgVar2.b : bgVar2.c(l))).c) {
                            z = true;
                        }
                    }
                    com.google.common.f.ab abVar4 = com.google.common.f.a.e.a;
                    if (z) {
                        return;
                    }
                }
                Z();
                return;
            }
            S = X(this.m);
        }
        if (S) {
            an();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("QueryState");
        ArrayList arrayList = new ArrayList();
        ae(arrayList, this.p, "stop-listening-pending");
        ae(arrayList, this.t, "session-solidified");
        ae(arrayList, this.u, "recognition-paused-on-demand");
        if (!arrayList.isEmpty()) {
            fVar.r(new d(new com.google.common.base.ap(", ").d(arrayList), false));
        }
        ad(fVar, "Query", this.l);
        ad(fVar, "Committed query", this.m);
        ad(fVar, "Pending follow-on query", this.n);
        ad(fVar, "Cancel recognition pending query", this.V);
        Query query = this.l;
        if (query != null) {
            if (query.cx()) {
                fVar.a("How text was entered").a(new d("text", false));
            } else if (query.cS()) {
                fVar.a("How text was entered").a(new d("voice", false));
            }
            fVar.a("Last text entered").a(com.google.android.apps.gsa.shared.util.b.e.c(this.l.g));
            fVar.a("Last 3 queries").a(com.google.android.apps.gsa.shared.util.b.e.c(this.X.toString()));
            if (this.l.di()) {
                fVar.j("Last query native", "true");
            } else {
                fVar.j("Last query native", "false");
            }
        }
        fVar.p("Network action state", this.s);
        com.google.android.apps.gsa.shared.util.debug.a.f d = fVar.d((Object) null);
        d.q("Backstack");
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Bundle bundle = (Bundle) this.q.get(size);
            com.google.android.apps.gsa.shared.util.debug.a.f d2 = d.d((Object) null);
            d2.q(String.valueOf(size));
            d2.k(l(bundle));
            d2.k(a(bundle));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final Query i() {
        return this.m;
    }

    public final Query k() {
        Bundle bundle = (Bundle) oo.az(this.q, (Object) null);
        if (bundle != null) {
            return l(bundle);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.gsa.shared.search.Query m(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.cP()
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L1b
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.bj()
            if (r0 == 0) goto L2a
        L1b:
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.cf()
            if (r0 != 0) goto L2a
            r0 = 1
            r5 = r0
            goto L2c
        L2a:
            r0 = 0
            r5 = r0
        L2c:
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L89
            r0 = r5
            r6 = r0
            r0 = r4
            java.lang.String r1 = "voicesearch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            r0 = r5
            r6 = r0
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.cu()
            if (r0 != 0) goto L4c
            r0 = 0
            r6 = r0
        L4c:
            r0 = r4
            java.lang.String r1 = "assistanttextsearch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            r0 = r7
            r5 = r0
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.bJ()
            if (r0 == 0) goto L7f
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.cx()
            if (r0 != 0) goto L7d
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            boolean r0 = r0.cq()
            if (r0 != 0) goto L7d
            r0 = r7
            r5 = r0
            goto L7f
        L7d:
            r0 = r6
            r5 = r0
        L7f:
            r0 = r5
            if (r0 != 0) goto L87
            com.google.common.f.ab r0 = com.google.common.f.a.e.a
            r4 = r0
        L87:
            r0 = r5
            r6 = r0
        L89:
            com.google.common.f.ab r0 = com.google.common.f.a.e.a
            r4 = r0
            r0 = r6
            if (r0 == 0) goto Lbd
            r0 = r3
            com.google.android.apps.gsa.search.core.state.bj r0 = r0.s
            com.google.android.apps.gsa.shared.search.Query r0 = r0.b
            r4 = r0
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            r1 = r4
            boolean r0 = r0.co(r1)
            if (r0 != 0) goto Lbd
            com.google.common.f.am r0 = com.google.common.f.am.d
            java.lang.Class r0 = r0.getClass()
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            r4 = r0
            r0 = r3
            com.google.android.apps.gsa.search.core.state.bj r0 = r0.s
            r1 = r4
            r0.b(r1)
            r0 = r3
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            return r0
        Lbd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.bk.m(java.lang.String):com.google.android.apps.gsa.shared.search.Query");
    }

    public final Query n(Query query) {
        Query query2 = query;
        if (query.cx()) {
            query2 = query;
            if (!((com.google.android.apps.gsa.search.core.state.d.l) this.N.a()).f1288a.a()) {
                query2 = query.v();
            }
        }
        return query2;
    }

    public final List o(ActionData actionData) {
        Bundle bundle = this.r;
        ArrayList arrayList = null;
        if (bundle != null) {
            arrayList = null;
            if (actionData.equals(a(bundle))) {
                Bundle bundle2 = this.r;
                a aVar = this.Q;
                try {
                    arrayList = bundle2.getParcelableArrayList("velvet:query_state:voice_actions");
                } catch (Exception e) {
                    ((com.google.android.apps.gsa.shared.logger.e) aVar.a()).c(null, 27243104);
                    arrayList = null;
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final void p(Query query) {
        if (B(query)) {
            an();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.b
    public final void q() {
        an();
    }

    public final void r(Query query, SearchError searchError) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (this.m.co(query)) {
            s(searchError);
            an();
        }
    }

    public final void s(SearchError searchError) {
        com.google.android.apps.gsa.search.core.state.f.c.c(searchError, this.m, ((com.google.android.apps.gsa.search.core.state.d.l) this.N.a()).f1288a);
        if (!searchError.Q(1L) || this.m.da()) {
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            bj bjVar = this.s;
            SearchError searchError2 = bjVar.c;
            if (searchError2 != null) {
                if (searchError2.f.equals(searchError.f) && bjVar.f1247a == 4) {
                    return;
                }
            }
            bjVar.c = searchError;
            bjVar.e(4);
            return;
        }
        if (!this.m.cw()) {
            com.google.common.f.h f = f1248a.f();
            f.aj(com.google.common.f.a.e.a, "QueryState");
            com.google.common.f.h hVar = f;
            hVar.ak(7657);
            hVar.p("SRP Auth failure for search type without SRP.");
        }
        bc createBuilder = hb.a.createBuilder();
        createBuilder.copyOnWrite();
        hb hbVar = createBuilder.instance;
        hbVar.b |= 2;
        hbVar.n = 203;
        String b = com.google.android.libraries.search.t.k.a.b(this.m.E);
        createBuilder.copyOnWrite();
        hb hbVar2 = createBuilder.instance;
        b.getClass();
        hbVar2.b = 4 | hbVar2.b;
        hbVar2.o = b;
        com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
        Query t = this.m.t();
        com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
        this.m = n(t);
        this.l = t;
        this.v = true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.l);
        String valueOf2 = String.valueOf(this.m);
        List list = this.q;
        return "QS[\n\t\tQ:" + valueOf + "\n\t\tCQ:" + valueOf2 + "\n\t\tAS:" + this.s.toString() + "\n\t\tBS:" + list.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        this.n = Query.b;
        x(Query.b.I().q());
        T(this.m);
        this.q.clear();
        this.t = false;
        this.r = null;
    }

    public final void v(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (this.m.co(query)) {
            com.google.android.apps.gsa.search.core.state.f.c.d(query, this.g, this.i);
            bj bjVar = this.s;
            if (bjVar.f()) {
                return;
            }
            bjVar.e = true;
            an();
        }
    }

    public final void w(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        androidx.compose.ui.l.f.e(query.cP());
        if (this.m.co(query)) {
            x(query.q());
            this.l = this.m;
            this.v = true;
            an();
        }
    }

    public final void x(Query query) {
        long j = query.E;
        if (j == 0 || j == this.m.E) {
            com.google.common.f.h f = f1248a.f();
            f.aj(com.google.common.f.a.e.a, "QueryState");
            com.google.common.f.h hVar = f;
            hVar.ak(7660);
            hVar.p("Commit without new request id. This shouldn't happen.");
        }
        if (!query.cq()) {
            com.google.android.apps.gsa.search.core.state.f.c.e(query, ((com.google.android.apps.gsa.search.core.state.d.q) this.C.a()).f1292a, this.M, this.N, this.g, this.h, this.i);
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.m = n(query);
    }

    public final void y(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        Query n = n(query);
        this.m = n;
        this.l = n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean z() {
        f fVar = (f) this.b.a();
        return this.m.cP() && fVar.T() && !fVar.M() && ((ab) this.E.a()).d == null && !this.m.dg() && E();
    }
}
