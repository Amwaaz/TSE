package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.eu;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.apps.gsa.search.shared.service.c.ew;
import com.google.android.apps.gsa.search.shared.service.c.fo;
import com.google.android.apps.gsa.search.shared.service.c.fp;
import com.google.android.apps.gsa.search.shared.service.c.fw;
import com.google.android.apps.gsa.search.shared.service.c.fx;
import com.google.android.apps.gsa.search.shared.service.c.fy;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.hw;
import com.google.android.apps.gsa.search.shared.service.c.hx;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.m.c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.at;
import com.google.common.o.gy;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.dl;
import com.google.g.e.e.a.d;
import com.google.protobuf.bd;
import com.google.protobuf.bi;
import e.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ay.class */
public class ay extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1242a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.ay");
    public boolean B;
    public boolean C;
    int D;
    public int E;
    private final a H;
    private final a I;
    private final a J;
    private final a K;
    private final a L;
    private boolean M;
    private final List N;
    private com.google.common.util.concurrent.cn O;
    public final com.google.android.apps.gsa.search.core.h.p b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final com.google.android.apps.gsa.search.core.ae.aq.f h;
    public final com.google.android.apps.gsa.search.core.ae.au.a i;
    public final h j;
    public final Queue k;
    public d l;
    public c m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public Query s;
    public com.google.android.apps.gsa.search.core.l.f t;
    public boolean u;
    public Query v;
    public com.google.common.util.concurrent.cn w;
    public final List x;

    public ay(a aVar, com.google.android.apps.gsa.search.core.h.p pVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, com.google.android.apps.gsa.search.core.ae.aq.f fVar, com.google.android.apps.gsa.search.core.ae.au.a aVar10, h hVar, a aVar11, a aVar12) {
        super(aVar, 67);
        this.k = new ArrayDeque();
        this.D = 1;
        this.p = true;
        this.s = Query.b;
        this.v = Query.b;
        this.w = dl.n(com.google.android.apps.gsa.v.c.f1836a);
        this.x = new ArrayList();
        this.N = new ArrayList();
        this.b = pVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.H = aVar5;
        this.f = aVar6;
        this.I = aVar7;
        this.J = aVar8;
        this.g = aVar9;
        this.h = fVar;
        this.i = aVar10;
        this.j = hVar;
        this.K = aVar11;
        this.L = aVar12;
    }

    private final void p(Query query, com.google.android.libraries.gsa.h.f fVar, com.google.android.apps.gsa.search.core.l.f fVar2) {
        if (this.b.w(com.google.android.apps.gsa.shared.k.az.dn) && query.aZ("android.opa.extra.BLOCK_RESPONSE_EXECUTION_ON_UI") && !this.n) {
            this.N.add(new ax(query, fVar, fVar2));
        } else {
            q(query, fVar, fVar2);
        }
    }

    private final void q(Query query, com.google.android.libraries.gsa.h.f fVar, com.google.android.apps.gsa.search.core.l.f fVar2) {
        if (n(query)) {
            new com.google.android.apps.gsa.shared.util.c.ae(com.google.common.util.concurrent.i.g(fVar2.k, new com.google.android.apps.gsa.search.core.l.d(), com.google.common.util.concurrent.ay.a), this.j, "boolean future in dispatchAssistantResult").a(new at(this, query, fVar, 2)).a(new at(this, query, fVar, 0));
        } else {
            com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
            fVar.run();
        }
    }

    private final void r(Query query, d dVar) {
        com.google.common.util.concurrent.cn cnVar;
        this.D = 3;
        an();
        if (this.t != null) {
            if ((dVar.b & 128) == 0) {
                this.h.H(dVar);
                com.google.protobuf.ba createBuilder = hx.a.createBuilder();
                createBuilder.copyOnWrite();
                hx hxVar = createBuilder.instance;
                hxVar.c = dVar;
                hxVar.b |= 1;
                hx build = createBuilder.build();
                com.google.android.apps.gsa.search.shared.service.ae aeVar = new com.google.android.apps.gsa.search.shared.service.ae(hf.SHOW_ASSISTANT_RESPONSE);
                aeVar.b(hw.a, build);
                aeVar.c(query);
                this.h.B(aeVar.a());
            } else {
                m(true);
                com.google.android.apps.gsa.search.shared.service.ae aeVar2 = new com.google.android.apps.gsa.search.shared.service.ae(hf.ASSISTANT_REQUEST_ID);
                aeVar2.c(query);
                this.h.B(aeVar2.a());
                ((com.google.android.apps.gsa.shared.logger.b.h) this.L.a()).b(com.google.android.apps.gsa.shared.logger.b.w.OPA_STATE_CCL_ASSISTANT_REQUEST_ID);
                com.google.android.apps.gsa.search.core.ae.aq.f fVar = this.h;
                at k = at.k(dVar);
                TtsState ttsState = (TtsState) this.d.a();
                Query query2 = ((bk) this.c.a()).m;
                if (!((bk) ttsState.f1226a.a()).m.co(query2)) {
                    cnVar = dl.n(com.google.common.base.a.a);
                } else if (((bk) ttsState.f1226a.a()).A(query2)) {
                    com.google.protobuf.v vVar = ttsState.h;
                    cnVar = vVar != null ? dl.n(at.k(vVar)) : dl.n(com.google.common.base.a.a);
                    ttsState.m();
                } else {
                    com.google.protobuf.v vVar2 = ttsState.h;
                    if (vVar2 != null) {
                        cnVar = dl.n(at.k(vVar2));
                        ttsState.m();
                    } else {
                        com.google.common.util.concurrent.cn settableFuture = new SettableFuture();
                        ttsState.i = settableFuture;
                        cnVar = settableFuture;
                        if (ttsState.w()) {
                            ttsState.an();
                            cnVar = settableFuture;
                        }
                    }
                }
                com.google.android.apps.gsa.search.core.l.f fVar2 = this.t;
                fVar2.getClass();
                this.w = fVar.g(k, query, cnVar, fVar2);
            }
            if (!this.r) {
                this.r = true;
                an();
            }
        }
        bf bfVar = (bf) this.e.a();
        if (query.cS()) {
            bfVar.k(query, gy.r);
        } else if (query.cx()) {
            bfVar.k(query, gy.L);
        }
    }

    private final boolean s() {
        if (this.t != null) {
            return false;
        }
        this.t = new com.google.android.apps.gsa.search.core.l.f();
        this.u = true;
        return true;
    }

    public final void a(Query query, com.google.android.apps.gsa.search.core.l.f fVar, com.google.android.apps.gsa.search.core.l.aj ajVar) {
        this.E = 3;
        if (fVar != null && query.bJ() && !query.bE()) {
            new com.google.android.apps.gsa.shared.util.c.ae(fVar.b, this.j, "assistantResponseFuture").a(new b(this, query, 3)).a(new b(this, query, 4));
        }
        ((bs) this.K.a()).a(query, ajVar);
        if (ajVar instanceof com.google.android.apps.gsa.search.core.l.l) {
            SettableFuture settableFuture = ((com.google.android.apps.gsa.search.core.l.l) ajVar).d.a;
            if (this.b.w(dj.am)) {
                new com.google.android.apps.gsa.shared.util.c.ae(settableFuture, this.j, "isAssistantOfflineFuture").a(new c(this, 4)).a(new a(12));
            }
        }
        if (query.cy()) {
            ((bx) this.I.a()).c(((bk) this.c.a()).l);
            this.j.m(ajVar.r(), "Maybe update zero typing suggest", new aw(this, ajVar, 1));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.OPA_INPUT_MODE, com.google.android.apps.gsa.search.shared.service.c.ac.OPA_UI_MODE, com.google.android.apps.gsa.search.shared.service.c.ac.OPA_ACTIVITY_LIFECYCLE_STATE};
    }

    public final void c(Query query) {
        if (this.l == null || this.D != 2) {
            return;
        }
        if (((f) this.H.a()).T() && ((f) this.H.a()).J(query)) {
            if (((f) this.H.a()).H(query)) {
                this.D = 4;
                an();
                return;
            } else {
                d dVar = this.l;
                dVar.getClass();
                r(query, dVar);
                return;
            }
        }
        d dVar2 = this.l;
        if (dVar2 != null && (dVar2.b & 1) == 0 && query.bS() && this.b.w(dj.X)) {
            d dVar3 = this.l;
            dVar3.getClass();
            r(query, dVar3);
        }
    }

    public final void f(Query query, SearchError searchError) {
        if (((bk) this.c.a()).m.co(query)) {
            if (s()) {
                an();
            }
            com.google.android.apps.gsa.search.core.l.f fVar = this.t;
            fVar.getClass();
            if (n(query)) {
                if (fVar.g.isDone()) {
                    com.google.common.f.h e = com.google.android.apps.gsa.search.core.l.f.a.e();
                    e.ak(6735);
                    e.p("searchErrorFuture is already set.");
                } else {
                    fVar.g.n(at.k(searchError));
                }
            }
            this.m = searchError.f;
            p(query, new m(this, query, searchError, 3), fVar);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        this.h.v();
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"opa_tooltip_promo_notification_state", "opa_welcome_promo_notification_state", "opa_multi_day_upgrade_promo_notification_state"};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal == 53) {
            com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
            com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(fw.a);
            adVar.d(bgVar);
            if (((bd) adVar).br.o(bgVar.d)) {
                com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
                com.google.protobuf.bg bgVar2 = bi.-$$Nest$smcheckIsLite(fw.a);
                adVar2.d(bgVar2);
                Object l = ((bd) adVar2).br.l(bgVar2.d);
                fx a3 = fx.a(((fy) (l == null ? bgVar2.b : bgVar2.c(l))).c);
                fx fxVar = a3;
                if (a3 == null) {
                    fxVar = fx.a;
                }
                this.M = fxVar == fx.b;
            }
            ((bq) this.J.a()).n = true;
            return;
        }
        if (ordinal == 66) {
            com.google.android.apps.gsa.search.shared.service.c.ad adVar3 = clientEventData.f1328a;
            com.google.protobuf.bg bgVar3 = bi.-$$Nest$smcheckIsLite(fo.a);
            adVar3.d(bgVar3);
            if (((bd) adVar3).br.o(bgVar3.d)) {
                com.google.android.apps.gsa.search.shared.service.c.ad adVar4 = clientEventData.f1328a;
                com.google.protobuf.bg bgVar4 = bi.-$$Nest$smcheckIsLite(fo.a);
                adVar4.d(bgVar4);
                Object l2 = ((bd) adVar4).br.l(bgVar4.d);
                Object c = l2 == null ? bgVar4.b : bgVar4.c(l2);
                com.google.android.apps.gsa.search.core.ae.aq.f fVar = this.h;
                fp fpVar = (fp) c;
                int cJ = a.a.cJ(fpVar.c);
                int i = cJ;
                if (cJ == 0) {
                    i = 1;
                }
                fVar.G(i - 1);
                boolean z = this.p;
                int cJ2 = a.a.cJ(fpVar.c);
                boolean z2 = cJ2 == 0 || cJ2 == 1;
                this.p = z2;
                if (!z || z2) {
                    return;
                }
                this.q = true;
                an();
                return;
            }
            return;
        }
        if (ordinal != 86) {
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar5 = clientEventData.f1328a;
        com.google.protobuf.bg bgVar5 = bi.-$$Nest$smcheckIsLite(eu.a);
        adVar5.d(bgVar5);
        if (!((bd) adVar5).br.o(bgVar5.d)) {
            this.n = false;
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar6 = clientEventData.f1328a;
        com.google.protobuf.bg bgVar6 = bi.-$$Nest$smcheckIsLite(eu.a);
        adVar6.d(bgVar6);
        Object l3 = ((bd) adVar6).br.l(bgVar6.d);
        ev a4 = ev.a(((ew) (l3 == null ? bgVar6.b : bgVar6.c(l3))).c);
        ev evVar = a4;
        if (a4 == null) {
            evVar = ev.UNKNOWN;
        }
        boolean z3 = evVar == ev.RESUMED;
        this.n = z3;
        if (z3) {
            for (ax axVar : this.N) {
                if (((bk) this.c.a()).m.co(axVar.a)) {
                    q(axVar.a, axVar.b, axVar.c);
                }
            }
            this.N.clear();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("OpaState");
        fVar.b("IsOpaChatUiMode").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.M), false));
        fVar.b("IsOpaVoiceInputMode").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.p), false));
        fVar.b("UnHandledGcmMessages").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.k.size()), false));
    }

    public final void i(Query query, com.google.android.apps.gsa.search.core.l.aj ajVar) {
        if (((bk) this.c.a()).m.co(query)) {
            if (!(ajVar instanceof com.google.android.apps.gsa.search.core.l.l)) {
                a(query, null, ajVar);
                return;
            }
            if (s()) {
                an();
            }
            com.google.android.apps.gsa.search.core.l.f fVar = this.t;
            fVar.getClass();
            fVar.d(ajVar);
            p(query, new av(this, query, fVar, ajVar), fVar);
        }
    }

    public final void k(Query query, com.google.android.apps.gsa.shared.speech.i iVar) {
        if (((bk) this.c.a()).m.co(query)) {
            if (s()) {
                an();
            }
            com.google.android.apps.gsa.search.core.l.f fVar = this.t;
            fVar.getClass();
            if (n(query)) {
                if (fVar.f.isDone()) {
                    com.google.common.f.h e = com.google.android.apps.gsa.search.core.l.f.a.e();
                    e.ak(6734);
                    e.p("ttsOptionalFuture is already set.");
                } else {
                    fVar.f.n(at.k(iVar));
                }
            }
            p(query, new m(this, query, iVar, 4), fVar);
        }
    }

    public final void l(Query query) {
        if (((bk) this.c.a()).m.co(query)) {
            if (s()) {
                an();
            }
            com.google.android.apps.gsa.search.core.l.f fVar = this.t;
            fVar.getClass();
            fVar.b();
            fVar.c();
            p(query, new n(this, query, 2), fVar);
        }
    }

    public final void m(boolean z) {
        if (o(z)) {
            an();
        }
    }

    public final boolean n(Query query) {
        return query.bJ() && !query.bE() && ((j) this.f.a()).f1303a.e.equals("opa");
    }

    public final boolean o(boolean z) {
        com.google.common.util.concurrent.cn cnVar = this.O;
        if (cnVar != null) {
            cnVar.cancel(true);
        }
        if (z) {
            this.O = this.j.i("reset needAudioForCcl", this.b.i(com.google.android.apps.gsa.shared.k.az.ig), new au(this));
        }
        if (this.C == z) {
            return false;
        }
        this.C = z;
        return true;
    }
}
