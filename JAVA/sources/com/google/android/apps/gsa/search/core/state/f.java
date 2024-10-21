package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.ae.b.b;
import com.google.android.apps.gsa.search.shared.actions.AbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.a;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.PromoAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.c.c;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.gu;
import com.google.android.apps.gsa.search.shared.service.c.gv;
import com.google.android.apps.gsa.search.shared.service.c.gy;
import com.google.android.apps.gsa.search.shared.service.c.gz;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.bf.a.bh;
import com.google.bf.a.cd;
import com.google.bf.a.cy;
import com.google.bf.a.dk;
import com.google.bf.a.ec;
import com.google.bf.a.ef;
import com.google.bf.a.eg;
import com.google.bf.a.h;
import com.google.common.b.oo;
import com.google.common.base.at;
import com.google.common.o.hb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/f.class */
public class f extends ae implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1300a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.f");
    private final e.a B;
    private final e.a C;
    private final e.a D;
    private final e.a E;
    private final e.a H;
    private final e.a I;
    private final e.a J;
    private final e.a K;
    private final e L;
    private final com.google.android.apps.gsa.search.core.h.p M;
    private final com.google.android.apps.gsa.search.core.m.a.c.a N;
    private final com.google.android.apps.gsa.search.core.m.a.a.a O;
    private h P;
    private List Q;
    private VoiceAction R;
    private com.google.android.apps.gsa.search.shared.actions.e S;
    private com.google.common.util.concurrent.cn T;
    private com.google.android.apps.gsa.search.shared.actions.f U;
    public final e.a b;
    public final e.a c;
    public final e.a d;
    public final e.a e;
    public final e.a f;
    public final BitFlags g;
    public Query h;
    public ActionData i;
    public List j;
    public int k;
    public final Stack l;
    public Query m;
    public Query n;
    public CardDecision o;
    public int p;
    public boolean q;
    public long r;
    public final b s;
    public final com.google.android.libraries.gsa.h.h t;
    public VoiceAction u;
    public com.google.common.util.concurrent.cn v;
    public boolean w;
    public Query x;

    public f(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4, e.a aVar5, e.a aVar6, e.a aVar7, e.a aVar8, e.a aVar9, e.a aVar10, e.a aVar11, e.a aVar12, e.a aVar13, e.a aVar14, com.google.android.apps.gsa.search.core.h.p pVar, b bVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.search.core.m.a.c.a aVar15, com.google.android.apps.gsa.search.core.m.a.a.a aVar16) {
        super(aVar, 51);
        this.L = new e();
        BitFlags bitFlags = new BitFlags(getClass(), "FLAG_", 0L);
        this.g = bitFlags;
        this.h = Query.b;
        this.i = null;
        this.P = h.a;
        this.Q = new ArrayList();
        this.p = 0;
        this.q = true;
        this.u = null;
        this.x = null;
        this.b = aVar2;
        this.C = aVar3;
        this.B = aVar4;
        this.c = aVar5;
        this.I = aVar8;
        this.d = aVar9;
        this.D = aVar10;
        this.E = aVar11;
        this.e = aVar6;
        this.H = aVar7;
        this.f = aVar12;
        this.J = aVar13;
        this.K = aVar14;
        this.M = pVar;
        this.s = bVar;
        this.t = hVar;
        this.l = new Stack();
        bitFlags.c(0L, 128L);
        this.N = aVar15;
        this.O = aVar16;
    }

    public static boolean ad(Query query) {
        if (!query.dg() || query.cU()) {
            return false;
        }
        ActionData actionData = ActionData.a;
        return true;
    }

    private static Query ao(String str) {
        com.google.android.apps.gsa.shared.search.b j = Query.b.at(com.google.android.libraries.search.t.h.j.as.a()).M(true).m577do(str).j();
        j.d(0L, 4503599627370496L);
        j.d(0L, 1024L);
        return j.a();
    }

    private final void ap(VoiceAction voiceAction) {
        this.g.c(0L, 4L);
        if (e().e((voiceAction == null || !voiceAction.u()) ? 3 : 4)) {
            aq();
        }
        if (voiceAction != null) {
            this.s.u(voiceAction);
        }
    }

    private final void aq() {
        this.s.q(f(), this.i, g(), e(), ((bk) this.d.a()).m);
    }

    private final void ar(com.google.android.apps.gsa.search.shared.actions.e eVar) {
        int dq;
        if (eVar == null || (dq = a.a.dq(eVar.c)) == 0 || dq != 8) {
            this.S = eVar;
        }
    }

    private final boolean as(VoiceAction voiceAction, int i) {
        return this.L.a(voiceAction, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean at(int r8, int r9, com.google.android.apps.gsa.search.shared.actions.e r10) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.f.at(int, int, com.google.android.apps.gsa.search.shared.actions.e):boolean");
    }

    private final boolean au(ActionData actionData, Query query) {
        if (!h.a.a.p.b.a.f.f(actionData, this.i)) {
            return false;
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.m = query;
        return T();
    }

    private final boolean av(ActionData actionData) {
        if (!h.a.a.p.b.a.f.f(actionData, this.i)) {
            return false;
        }
        List list = this.j;
        if (list != null && list.isEmpty()) {
            return false;
        }
        this.j = Collections.emptyList();
        A(null, true);
        this.s.o((c) this.f.a());
        return true;
    }

    private final boolean aw(ActionData actionData, List list) {
        if (!h.a.a.p.b.a.f.f(actionData, this.i)) {
            return false;
        }
        com.google.android.apps.gsa.shared.util.b.f.e(list);
        this.j = list;
        A(null, true);
        this.g.c(0L, 4096L);
        E();
        ae();
        r();
        D();
        C();
        e().a(this.i, f(), this.h);
        q();
        return true;
    }

    private final void ax(ActionData actionData, List list) {
        if (aw(actionData, list)) {
            an();
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
    }

    public final void A(CardDecision cardDecision, boolean z) {
        this.o = cardDecision;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.common.f.am.d.getClass();
        if (z) {
            this.p = 0;
        }
        ae();
        if (g().h) {
            h().n();
        }
        if (this.w) {
            this.w = false;
            new com.google.android.apps.gsa.shared.util.c.ae(this.s.f(g(), b(), this.k, this.l.contains(1114113)), this.t, "Create ShowPromptEventData").a(new c(this, 0)).a(new a(3));
        }
    }

    public final void B(ActionData actionData) {
        if (av(actionData)) {
            E();
            ae();
            an();
        }
    }

    public final void C() {
        bk bkVar = (bk) this.d.a();
        com.google.common.util.concurrent.cn n = this.s.n(this.i, b(), this.k, aa(), bkVar.K(bkVar.m), h());
        this.v = n;
        new com.google.android.apps.gsa.shared.util.c.ae(n, this.t, "On actions errors updated").a(new c(this, 2)).a(new a(4));
    }

    public final void D() {
        c cVar = (c) this.f.a();
        ClientConfig clientConfig = ((j) this.C.a()).f1303a;
        Query query = ((bk) this.d.a()).m;
        ActionData actionData = this.i;
        VoiceAction f = f();
        CardDecision g = g();
        h hVar = this.P;
        this.P = h.a;
        this.s.z(cVar, clientConfig, query, actionData, f, g, hVar, ((bk) this.d.a()).K(((bk) this.d.a()).m));
    }

    public final void E() {
        VoiceAction promoAction;
        VoiceAction f;
        if (W()) {
            as(ButtonAction.f, 1);
        } else {
            this.L.a(null, 1);
        }
        ModularAction f2 = f();
        if ((f2 instanceof ModularAction) && f2.v()) {
            ModularAction modularAction = f2;
            com.google.bf.a.cq a2 = ((AbstractVoiceAction) modularAction).a.a(modularAction.Y());
            if (a2 != null) {
                for (eg egVar : a2.h) {
                    com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(cy.b);
                    egVar.d(bgVar);
                    Object l = ((bd) egVar).br.l(bgVar.d);
                    cy cyVar = (cy) (l == null ? bgVar.b : bgVar.c(l));
                    bh bhVar = egVar.c;
                    bh bhVar2 = bhVar;
                    if (bhVar == null) {
                        bhVar2 = bh.a;
                    }
                    if (!bhVar2.c.isEmpty() && cyVar.j.size() > 0 && !((bh) cyVar.j.get(0)).c.isEmpty() && !cyVar.g.isEmpty()) {
                        promoAction = new PromoAction(egVar);
                        break;
                    }
                }
            }
        }
        promoAction = null;
        if (promoAction != null && as(promoAction, 2) && (f = f()) != null) {
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 619;
            int i = f.g().cP;
            createBuilder.copyOnWrite();
            hb hbVar2 = createBuilder.instance;
            hbVar2.b |= 256;
            hbVar2.s = i;
            com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
        }
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        List list = this.j;
        if (list != null) {
            arrayList.addAll(list);
        }
        List list2 = this.Q;
        e eVar = this.L;
        ArrayList arrayList2 = new ArrayList();
        VoiceAction voiceAction = (VoiceAction) eVar.f1299a.get(1);
        if (voiceAction != null) {
            arrayList2.add(voiceAction);
        }
        VoiceAction voiceAction2 = (VoiceAction) eVar.f1299a.get(2);
        if (voiceAction2 != null) {
            arrayList2.add(voiceAction2);
        }
        list2.addAll(arrayList2);
        this.g.h(1024L, true ^ this.Q.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        boolean G = G(true);
        if (G) {
            E();
            D();
            an();
        }
        return G;
    }

    public final boolean G(boolean z) {
        VoiceAction f = f();
        if (f == null || !f.D()) {
            return false;
        }
        if (z) {
            ac();
        }
        this.g.c(0L, 8L);
        ap(f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H(Query query) {
        return J(query) && L(this.i) && f() != null;
    }

    public final boolean I() {
        boolean z;
        VoiceAction f = f();
        if (f == null) {
            return false;
        }
        if (this.R == null) {
            z = false;
            if (f.L()) {
                z = false;
                if (g().i) {
                    if (!f.z()) {
                        return false;
                    }
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public final boolean J(Query query) {
        return (this.i == null || query == null || !query.co(this.h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K() {
        ActionData actionData = this.i;
        return actionData != null && actionData.j() && this.i.a() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(ActionData actionData) {
        return actionData != null && h.a.a.p.b.a.f.f(actionData, this.i) && BitFlags.f(this.g.b, 4096L);
    }

    public final boolean M() {
        return BitFlags.f(this.g.b, 1024L);
    }

    public final boolean N() {
        int size;
        CardDecision cardDecision = this.o;
        return (cardDecision == null || (size = cardDecision.t.size()) == 0 || this.p != size - 1) ? false : true;
    }

    public final boolean O() {
        return BitFlags.f(this.g.b, 4294967296L);
    }

    public final boolean P() {
        return !Q();
    }

    public final boolean Q() {
        return !BitFlags.f(this.g.b, 128L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R() {
        return BitFlags.f(this.g.b, 4194304L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        Query query2 = this.n;
        return query2 != null && query2.co(query);
    }

    public final boolean T() {
        return BitFlags.f(this.g.b, 2L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(Query query) {
        Query query2;
        return this.i != null && (query2 = this.x) != null && query2.co(query) && this.l.size() > 0 && b() == 1114114;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V() {
        return BitFlags.f(this.g.b, 2048L);
    }

    final boolean W() {
        List list;
        ActionData actionData = this.i;
        return (actionData == null || actionData.j() || (list = this.j) == null || list.isEmpty() || BitFlags.f(this.g.b, 32768L) || ((bk) this.d.a()).m.bf() || this.h.ca() || this.h.br()) ? false : true;
    }

    public final boolean X() {
        CardDecision cardDecision = this.o;
        return (cardDecision == null || cardDecision.c(this.p) == null) ? false : true;
    }

    public final boolean Y() {
        ModularAction f = f();
        if (!(f instanceof ModularAction)) {
            return false;
        }
        ModularAction modularAction = f;
        boolean aj = modularAction.aj(((AbstractVoiceAction) modularAction).b.a);
        CardDecision cardDecision = this.o;
        return cardDecision != null && !f.C() && cardDecision.i && cardDecision.k == 0 && aj && modularAction.ak() && !this.h.cV() && !this.h.cN();
    }

    public final boolean Z() {
        VoiceAction f = f();
        boolean z = false;
        boolean z2 = f != null && (f.u() || f.v());
        int hN = f == null ? -1 : f.hN();
        Query query = ((bk) this.d.a()).m;
        if (!query.bw() && !Y() && hN != 101) {
            if (query.bJ()) {
                if (hN != 1 && !z2) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        CardDecision cardDecision;
        if (f() == null || (cardDecision = this.o) == null || cardDecision.c(this.p) == null) {
            return -1;
        }
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aa() {
        return BitFlags.f(this.g.b, 131072L);
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.CONTACT_SELECTED_EXTERNALLY, com.google.android.apps.gsa.search.shared.service.c.ac.ACTION_CHANGED_EXTERNALLY, com.google.android.apps.gsa.search.shared.service.c.ac.ACTION_COUNTDOWN_CANCELED, com.google.android.apps.gsa.search.shared.service.c.ac.ESCAPE_HATCH_CLICKED, com.google.android.apps.gsa.search.shared.service.c.ac.HANDLE_ACTIONS_BACK_PRESS, com.google.android.apps.gsa.search.shared.service.c.ac.SAVE_USER_INTERACTION, com.google.android.apps.gsa.search.shared.service.c.ac.ACTION_USER_INTERACTION, com.google.android.apps.gsa.search.shared.service.c.ac.REQUEST_EXECUTE_ACTION, com.google.android.apps.gsa.search.shared.service.c.ac.SAVE_RELATIONSHIP};
    }

    public final void ac() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (V()) {
            return;
        }
        VoiceAction f = f();
        ActionData actionData = this.i;
        if (f == null || actionData == null) {
            return;
        }
        com.google.android.apps.gsa.search.shared.actions.errors.a aVar = (b() == 0 || this.k <= 0) ? null : new com.google.android.apps.gsa.search.shared.actions.errors.a(b(), this.k, this.l.size());
        Query query = ((bk) this.d.a()).m;
        boolean z = (!((com.google.android.apps.gsa.search.core.state.d.ai) this.D.a()).g || query.cV() || query.bw() || query.aZ("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN")) ? false : true;
        boolean z2 = O() || actionData.o();
        b bVar = this.s;
        ClientConfig clientConfig = ((j) this.C.a()).f1303a;
        boolean Q = Q();
        long j = this.g.b;
        com.google.common.util.concurrent.cn C = bVar.C(f, actionData, query, aVar, clientConfig, Q, BitFlags.f(j, 4L), aa(), BitFlags.f(j, 134217728L), z, z2);
        this.g.c(0L, 2048L);
        new com.google.android.apps.gsa.shared.util.c.ae(C, this.t, String.format("[%s] On create cardDecision", "ActionState")).a(new b(this, f, 0)).a(new a(2));
    }

    public final void ae() {
        List list;
        ActionData actionData = this.i;
        if (actionData == null || (!actionData.i() && ((list = this.j) == null || (!list.isEmpty() && (!L(this.i) || this.o == null))))) {
            this.g.c(2L, 0L);
            return;
        }
        this.g.c(0L, 2L);
        ActionData actionData2 = this.i;
        Query query = ((bk) this.d.a()).m;
        if (query == null || actionData2 == null || !Z()) {
            return;
        }
        this.s.s(query, actionData2, f(), g(), (c) this.f.a(), (com.google.android.apps.gsa.search.core.ae.b.a) this.b.a());
    }

    public final void af(boolean z) {
        if (f() != null) {
            if (z) {
                this.g.c(0L, 16384L);
            }
            ac();
        }
    }

    public final boolean ag(ActionData actionData, com.google.android.apps.gsa.search.shared.actions.c cVar, MatchingProviderInfo matchingProviderInfo) {
        boolean z;
        dk dkVar;
        com.google.bf.a.co coVar;
        ClientConfig clientConfig = ((j) this.C.a()).f1303a;
        Query query = cVar.b;
        if (query != null && !clientConfig.t() && au(actionData, query)) {
            an();
        }
        List list = cVar.a;
        if (e().c(list == null || list.isEmpty() || (list.get(0) instanceof PuntAction))) {
            aq();
        }
        if (list == null) {
            B(actionData);
            return false;
        }
        if (list.isEmpty()) {
            ax(actionData, list);
            z = false;
        } else {
            ModularAction modularAction = (VoiceAction) list.get(0);
            if (matchingProviderInfo != null) {
                if (matchingProviderInfo.e() && this.M.w(dj.Z) && ((j) this.C.a()).f1303a.o() && (modularAction instanceof ModularAction) && (dkVar = (dk) oo.ax(modularAction.i.a, (Object) null)) != null && (coVar = (com.google.bf.a.co) oo.ax(dkVar.c, (Object) null)) != null) {
                    com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(cd.b);
                    coVar.d(bgVar);
                    if (((bd) coVar).br.o(bgVar.d)) {
                        com.google.protobuf.bg bgVar2 = bi.-$$Nest$smcheckIsLite(cd.b);
                        coVar.d(bgVar2);
                        Object l = ((bd) coVar).br.l(bgVar2.d);
                        cd cdVar = (cd) (l == null ? bgVar2.b : bgVar2.c(l));
                        int i = cdVar.d;
                        if ((i & 16) != 0 && (i & 8) != 0) {
                            bh bhVar = cdVar.j;
                            bh bhVar2 = bhVar;
                            if (bhVar == null) {
                                bhVar2 = bh.a;
                            }
                            if ((bhVar2.b & 1) != 0 && bhVar2.c.contains("maps.google.com")) {
                                bh bhVar3 = cdVar.h;
                                bh bhVar4 = bhVar3;
                                if (bhVar3 == null) {
                                    bhVar4 = bh.a;
                                }
                                if ((bhVar4.b & 1) != 0) {
                                    String str = bhVar4.c;
                                    bc createBuilder = ef.a.createBuilder();
                                    int i2 = coVar.c;
                                    createBuilder.copyOnWrite();
                                    ef efVar = createBuilder.instance;
                                    efVar.b |= 2;
                                    efVar.d = i2;
                                    bc createBuilder2 = ec.a.createBuilder();
                                    createBuilder2.copyOnWrite();
                                    ec ecVar = createBuilder2.instance;
                                    str.getClass();
                                    ecVar.c |= 1;
                                    ecVar.d = str;
                                    createBuilder.w(ec.b, createBuilder2.build());
                                    ef build = createBuilder.build();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(build);
                                    MatchingProviderInfo matchingProviderInfo2 = new MatchingProviderInfo(arrayList, build, false);
                                    com.google.bf.a.co coVar2 = (com.google.bf.a.co) oo.ax(dkVar.d, (Object) null);
                                    com.google.bf.a.cq cqVar = dkVar.g;
                                    com.google.bf.a.cq cqVar2 = cqVar;
                                    if (cqVar == null) {
                                        cqVar2 = com.google.bf.a.cq.a;
                                    }
                                    com.google.bf.a.co coVar3 = (com.google.bf.a.co) oo.ax(cqVar2.d, (Object) null);
                                    com.google.bf.a.cq cqVar3 = dkVar.e;
                                    com.google.bf.a.cq cqVar4 = cqVar3;
                                    if (cqVar3 == null) {
                                        cqVar4 = com.google.bf.a.cq.a;
                                    }
                                    com.google.bf.a.co coVar4 = (com.google.bf.a.co) oo.ax(cqVar4.d, (Object) null);
                                    com.google.bf.a.cq cqVar5 = dkVar.h;
                                    com.google.bf.a.cq cqVar6 = cqVar5;
                                    if (cqVar5 == null) {
                                        cqVar6 = com.google.bf.a.cq.a;
                                    }
                                    com.google.bf.a.co coVar5 = (com.google.bf.a.co) oo.ax(cqVar6.d, (Object) null);
                                    com.google.bf.a.cq cqVar7 = dkVar.f;
                                    com.google.bf.a.cq cqVar8 = cqVar7;
                                    if (cqVar7 == null) {
                                        cqVar8 = com.google.bf.a.cq.a;
                                    }
                                    modularAction.n(new ModularActionMatchingProviderInfo(matchingProviderInfo2, coVar, coVar2, coVar3, coVar4, coVar5, (com.google.bf.a.co) oo.ax(cqVar8.d, (Object) null)));
                                    ax(actionData, list);
                                    z = true;
                                }
                            }
                        }
                    }
                }
                modularAction.n(matchingProviderInfo);
            }
            ClientConfig clientConfig2 = ((j) this.C.a()).f1303a;
            if (matchingProviderInfo == null || !(!matchingProviderInfo.e() || clientConfig2.h() || actionData.h())) {
                com.google.common.f.h f = f1300a.f();
                f.aj(com.google.common.f.a.e.a, "ActionState");
                com.google.common.f.h hVar = f;
                hVar.ak(7499);
                hVar.s("Action suppressed due to no matching apps: %s", modularAction);
                if (e().c(true)) {
                    aq();
                }
                ax(actionData, new ArrayList());
                z = false;
            } else {
                ax(actionData, list);
                z = true;
            }
        }
        return z;
    }

    final int b() {
        if (this.l.isEmpty()) {
            return 0;
        }
        return ((Integer) this.l.peek()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.gsa.search.shared.actions.ActionData c(com.google.android.apps.gsa.search.core.state.ba r4, com.google.android.apps.gsa.search.core.state.bk r5) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.f.c(com.google.android.apps.gsa.search.core.state.ba, com.google.android.apps.gsa.search.core.state.bk):com.google.android.apps.gsa.search.shared.actions.ActionData");
    }

    public final com.google.android.apps.gsa.search.shared.actions.f e() {
        if (this.U == null) {
            this.U = new com.google.android.apps.gsa.search.shared.actions.f();
        }
        return this.U;
    }

    @Override // com.google.android.apps.gsa.search.shared.actions.a
    public final VoiceAction f() {
        List list = this.j;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (VoiceAction) this.j.get(0);
    }

    public final CardDecision g() {
        CardDecision cardDecision;
        return (f() == null || (cardDecision = this.o) == null) ? CardDecision.b : cardDecision;
    }

    @Deprecated
    public final c h() {
        return (c) this.f.a();
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        boolean z;
        boolean z2;
        boolean z3;
        com.google.android.apps.gsa.search.shared.actions.e eVar;
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal == 4) {
            VoiceAction f = f();
            ActionData actionData = this.i;
            if (f == null || actionData == null) {
                return;
            }
            com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
            com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.ae.a);
            adVar.d(bgVar);
            Object l = ((bd) adVar).br.l(bgVar.d);
            com.google.android.apps.gsa.search.shared.service.c.af afVar = (com.google.android.apps.gsa.search.shared.service.c.af) (l == null ? bgVar.b : bgVar.c(l));
            if (afVar != null) {
                if ((afVar.b & 1) != 0) {
                    com.google.android.apps.gsa.search.shared.actions.modular.arguments.i e = f.e();
                    if (e != null) {
                        new com.google.android.apps.gsa.shared.util.c.ae(this.s.i(actionData, afVar, e, ((bk) this.d.a()).m), this.t, "Handle contact selection").b(new bv(this, 1)).a(new a(6));
                        return;
                    }
                    return;
                }
                com.google.common.f.h e2 = f1300a.e();
                e2.aj(com.google.common.f.a.e.a, "ActionState");
                com.google.common.f.h hVar = e2;
                hVar.ak(7438);
                hVar.p("Event data for the CONTACT_SELECTED_EXTERNALLY event missing expected id.");
                return;
            }
            return;
        }
        if (ordinal == 6) {
            VoiceAction voiceAction = clientEventData.b(ParcelableVoiceAction.class).a;
            if (voiceAction == null) {
                com.google.common.f.h e3 = f1300a.e();
                e3.aj(com.google.common.f.a.e.a, "ActionState");
                com.google.common.f.h hVar2 = e3;
                hVar2.ak(7439);
                hVar2.p("handleGenericClientEvent(): Action changed externally, but none supplied");
                return;
            }
            com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
            com.google.protobuf.bg bgVar2 = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.a.a);
            adVar2.d(bgVar2);
            if (((bd) adVar2).br.o(bgVar2.d)) {
                com.google.android.apps.gsa.search.shared.service.c.ad adVar3 = clientEventData.f1328a;
                com.google.protobuf.bg bgVar3 = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.a.a);
                adVar3.d(bgVar3);
                Object l2 = ((bd) adVar3).br.l(bgVar3.d);
                com.google.android.apps.gsa.search.shared.service.c.b bVar = (com.google.android.apps.gsa.search.shared.service.c.b) (l2 == null ? bgVar3.b : bgVar3.c(l2));
                z = bVar.c;
                z2 = bVar.d;
                z3 = bVar.e;
            } else {
                z = false;
                z2 = false;
                z3 = false;
            }
            s(voiceAction, null, z, z2, z3);
            return;
        }
        if (ordinal == 19) {
            A(null, true);
            ModularAction f2 = f();
            if (f2 == null) {
                this.S = null;
                eVar = null;
            } else {
                if (!f2.o()) {
                    this.S = null;
                }
                com.google.android.apps.gsa.search.shared.actions.e eVar2 = this.S;
                boolean z4 = false;
                if (f2.t()) {
                    z4 = false;
                    if (f2.q) {
                        z4 = true;
                    }
                }
                if (eVar2 != null && !z4) {
                    if (Q()) {
                        this.l.clear();
                        this.l.push(1114113);
                        this.k = 1;
                        this.g.c(0L, 131072L);
                    }
                    int dq = a.a.dq(eVar2.c);
                    if (dq != 0 && dq == 9) {
                        this.S = null;
                        if (((s) this.B.a()).g) {
                            if (this.g.c(0L, 67108864L)) {
                                an();
                            }
                        } else if (this.g.c(0L, 33554432L)) {
                            an();
                        }
                    }
                } else if (this.h.bJ()) {
                    v(1, 4, null);
                    F();
                } else if (this.g.c(0L, 16777216L)) {
                    an();
                }
                eVar = this.S;
                this.S = null;
            }
            if (eVar != null) {
                this.s.p(eVar);
                return;
            }
            return;
        }
        if (ordinal == 38) {
            com.google.android.apps.gsa.search.shared.service.c.ad adVar4 = clientEventData.f1328a;
            com.google.protobuf.bg bgVar4 = bi.-$$Nest$smcheckIsLite(gu.a);
            adVar4.d(bgVar4);
            Object l3 = ((bd) adVar4).br.l(bgVar4.d);
            gv gvVar = (gv) (l3 == null ? bgVar4.b : bgVar4.c(l3));
            VoiceAction voiceAction2 = clientEventData.b(ParcelableVoiceAction.class).a;
            int i = gvVar.c;
            boolean z5 = gvVar.d;
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            BitFlags bitFlags = this.g;
            boolean c = bitFlags.c(4L, 0L) | bitFlags.c(0L, 4294967296L);
            if (e().b(!z5, this.o)) {
                aq();
            }
            if (z5) {
                boolean at = c | at(2, 3, null);
                c = at;
                if (voiceAction2 != null) {
                    w(voiceAction2, i);
                    m();
                    c = at;
                }
            } else {
                n();
            }
            if (c) {
                an();
                return;
            }
            return;
        }
        if (ordinal == 97) {
            this.s.w((PersonDisambiguation) clientEventData.b(PersonDisambiguation.class), ((bk) this.d.a()).m);
            return;
        }
        if (ordinal == 10) {
            ap(f());
            an();
            return;
        }
        if (ordinal == 11) {
            if (!W()) {
                F();
                return;
            }
            if (G(false) | av(this.i)) {
                E();
                ae();
                D();
                an();
            }
            bk bkVar = (bk) this.d.a();
            while (bkVar.m.i.isEmpty() && !bkVar.q.isEmpty()) {
                bkVar.S(false);
            }
            if (bkVar.m.i.isEmpty()) {
                return;
            }
            bkVar.w(bkVar.m.s());
            return;
        }
        if (ordinal != 14) {
            if (ordinal != 15) {
                return;
            }
            com.google.android.apps.gsa.search.shared.service.c.ad adVar5 = clientEventData.f1328a;
            com.google.protobuf.bg bgVar5 = bi.-$$Nest$smcheckIsLite(gy.a);
            adVar5.d(bgVar5);
            Object l4 = ((bd) adVar5).br.l(bgVar5.d);
            gz gzVar = (gz) (l4 == null ? bgVar5.b : bgVar5.c(l4));
            com.google.android.apps.gsa.search.shared.actions.e eVar3 = null;
            if ((gzVar.b & 1) != 0) {
                com.google.android.apps.gsa.search.shared.actions.e eVar4 = gzVar.c;
                eVar3 = eVar4;
                if (eVar4 == null) {
                    eVar3 = com.google.android.apps.gsa.search.shared.actions.e.a;
                }
            }
            ar(eVar3);
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar6 = clientEventData.f1328a;
        com.google.protobuf.bg bgVar6 = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.e.a);
        adVar6.d(bgVar6);
        if (!((bd) adVar6).br.o(bgVar6.d)) {
            com.google.common.f.h e4 = f1300a.e();
            e4.aj(com.google.common.f.a.e.a, "ActionState");
            com.google.common.f.h hVar3 = e4;
            hVar3.ak(7440);
            hVar3.p("ACTION_USER_INTERACTION event data without expected extension");
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar7 = clientEventData.f1328a;
        com.google.protobuf.bg bgVar7 = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.shared.service.c.e.a);
        adVar7.d(bgVar7);
        Object l5 = ((bd) adVar7).br.l(bgVar7.d);
        com.google.android.apps.gsa.search.shared.service.c.f fVar = (com.google.android.apps.gsa.search.shared.service.c.f) (l5 == null ? bgVar7.b : bgVar7.c(l5));
        this.g.c(0L, 8589934592L);
        int i2 = fVar.c;
        int i3 = fVar.d;
        com.google.android.apps.gsa.search.shared.actions.e eVar5 = null;
        if ((fVar.b & 4) != 0) {
            com.google.android.apps.gsa.search.shared.actions.e eVar6 = fVar.e;
            eVar5 = eVar6;
            if (eVar6 == null) {
                eVar5 = com.google.android.apps.gsa.search.shared.actions.e.a;
            }
        }
        v(i2, i3, eVar5);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ActionState");
        fVar.b("Flags").a(new d(this.g.b(), false));
        fVar.n("CurrentQuery", this.h);
        fVar.n("ActionData", this.i);
        ActionData actionData = this.i;
        if (actionData != null && (actionData.r() || this.i.c != null)) {
            com.google.android.apps.gsa.shared.util.debug.a.e a2 = fVar.a("Last card displayed");
            ModularAction f = f();
            String str = null;
            if (f instanceof ModularAction) {
                dk Y = f.Y();
                str = null;
                if ((Y.b & 256) != 0) {
                    bh bhVar = Y.k;
                    bh bhVar2 = bhVar;
                    if (bhVar == null) {
                        bhVar2 = bh.a;
                    }
                    str = bhVar2.c;
                }
            }
            String str2 = str;
            if (true == TextUtils.isEmpty(str)) {
                str2 = "UNKNOWN";
            }
            String str3 = str2;
            if (f != null) {
                str3 = str2 + "[" + f.g().cP + "]";
            }
            a2.a(new d(str3, false));
        }
        fVar.n("ModifiedCommit", this.m);
        fVar.n("VoiceQueryWithFollowOn", this.n);
        a.a.bU(fVar, this.j);
        fVar.n("Action to be executed", this.R);
        fVar.p("Extra cards state", this.L);
    }

    public final List i() {
        if (this.j == null && this.Q.isEmpty()) {
            return null;
        }
        return this.Q;
    }

    public final void k(Query query, ActionData actionData) {
        this.g.i(128L);
        this.j = null;
        A(null, true);
        this.l.clear();
        this.k = 0;
        y(actionData);
        this.h = query;
        this.m = null;
        this.x = null;
        this.n = null;
        this.S = null;
        if (actionData != null) {
            if (actionData.i()) {
                D();
            }
            p(actionData, query);
        }
    }

    public final void l(Query query) {
        if (J(query)) {
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 194;
            String b = com.google.android.libraries.search.t.k.a.b(this.h.E);
            createBuilder.copyOnWrite();
            hb hbVar2 = createBuilder.instance;
            b.getClass();
            hbVar2.b |= 4;
            hbVar2.o = b;
            com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
        }
    }

    public final void m() {
        VoiceAction voiceAction = this.R;
        if (voiceAction == null || !voiceAction.y() || BitFlags.f(this.g.b, 524288L)) {
            voiceAction = null;
        } else {
            voiceAction.G();
        }
        if (voiceAction == null) {
            return;
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        new com.google.android.apps.gsa.shared.util.c.ae(this.s.g(voiceAction, ((bk) this.d.a()).m, at.k(this)), this.t, "executionResult callback").a(new b(this, voiceAction, 1)).a(new a(0));
    }

    public final void n() {
        e.a aVar = this.C;
        VoiceAction f = f();
        CardDecision g = g();
        ClientConfig clientConfig = ((j) aVar.a()).f1303a;
        Query query = ((bk) this.d.a()).m;
        boolean z = clientConfig.f() && !O();
        boolean k = ((cg) this.K.a()).k(query);
        boolean z2 = false;
        if (!((TtsState) this.E.a()).v(g)) {
            z2 = false;
            if (!((TtsState) this.E.a()).A()) {
                z2 = true;
            }
        }
        if (clientConfig.t()) {
            return;
        }
        if ((Y() || !(k || z)) && !z2) {
            if (query.bw() || query.aZ("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN") || !((com.google.android.apps.gsa.search.core.ac.t) this.J.a()).b()) {
                if (f == null || !f.z() || !g.i || g.h) {
                    com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                    return;
                }
                com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
                ActionData actionData = this.i;
                ActionData actionData2 = actionData;
                if (actionData == null) {
                    actionData2 = ActionData.a;
                }
                f.hR(286, query != null ? Long.valueOf(query.E) : null, g, actionData2.f);
                int i = 1;
                if (f.t()) {
                    i = 1;
                    if (actionData2.g()) {
                        i = 101;
                    }
                }
                w(f, i);
                m();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0.u() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r7 = this;
            r0 = r7
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.o
            r11 = r0
            r0 = r11
            if (r0 != 0) goto Le
            goto Lc8
        Le:
            r0 = r11
            r1 = r7
            int r1 = r1.p
            com.google.android.apps.gsa.search.shared.actions.util.PromptSegment r0 = r0.c(r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Lc8
            r0 = r12
            java.lang.String r0 = r0.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L34
            r0 = r12
            com.google.android.apps.gsa.search.shared.actions.util.ImageInfo r0 = r0.c
            boolean r0 = com.google.android.apps.gsa.search.shared.actions.util.ImageInfo.a(r0)
            if (r0 != 0) goto Lb1
        L34:
            r0 = r7
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r0.i
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L49
            r0 = r11
            java.lang.String r0 = r0.h
            r11 = r0
            goto L4c
        L49:
            r0 = 0
            r11 = r0
        L4c:
            r0 = r7
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f()
            r13 = r0
            r0 = r7
            boolean r0 = r0.N()
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            if (r0 == 0) goto L7e
            r0 = r9
            r8 = r0
            r0 = r13
            if (r0 == 0) goto L7e
            r0 = r13
            boolean r0 = r0.v()
            if (r0 != 0) goto L7c
            r0 = r9
            r8 = r0
            r0 = r13
            boolean r0 = r0.u()
            if (r0 == 0) goto L7e
        L7c:
            r0 = 1
            r8 = r0
        L7e:
            com.google.android.apps.gsa.shared.util.c.ae r0 = new com.google.android.apps.gsa.shared.util.c.ae
            r1 = r0
            r2 = r7
            com.google.android.apps.gsa.search.core.ae.b.b r2 = r2.s
            r3 = r12
            r4 = r11
            r5 = r8
            com.google.common.util.concurrent.cn r2 = r2.c(r3, r4, r5)
            r3 = r7
            com.google.android.libraries.gsa.h.h r3 = r3.t
            java.lang.String r4 = "Create ShowDisplaySegmentEventData"
            r1.<init>(r2, r3, r4)
            com.google.android.apps.gsa.search.core.state.c r1 = new com.google.android.apps.gsa.search.core.state.c
            r2 = r1
            r3 = r7
            r4 = 1
            r2.<init>(r3, r4)
            com.google.android.apps.gsa.shared.util.c.ac r0 = r0.a(r1)
            com.google.android.apps.gsa.search.core.state.a r1 = new com.google.android.apps.gsa.search.core.state.a
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.a(r1)
        Lb1:
            r0 = r12
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r0 = r0.b
            boolean r0 = com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.c(r0)
            if (r0 != 0) goto Lc8
            r0 = r7
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r0.g
            r1 = 0
            r2 = 256(0x100, double:1.265E-321)
            boolean r0 = r0.c(r1, r2)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.f.o():void");
    }

    public final void p(ActionData actionData, Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.common.util.concurrent.cn cnVar = this.T;
        if ((cnVar != null && !cnVar.isDone()) || actionData.i() || ad(this.h)) {
            return;
        }
        l(query);
        if (query.dg() && !query.cU()) {
            b bVar = this.s;
            aj ajVar = (aj) this.H.a();
            PlaybackStatus playbackStatus = ajVar.e;
            ajVar.e = null;
            this.T = bVar.l(query, actionData, playbackStatus, this.O, this.N);
            return;
        }
        b bVar2 = this.s;
        aj ajVar2 = (aj) this.H.a();
        PlaybackStatus playbackStatus2 = ajVar2.e;
        ajVar2.e = null;
        com.google.common.util.concurrent.cn k = bVar2.k(query, actionData, playbackStatus2, this.O, this.N);
        new com.google.android.apps.gsa.shared.util.c.ae(k, this.t, "Handle action").a(new at(this, query, actionData, 1)).a(new a(1));
        this.T = com.google.android.apps.gsa.v.c.b(k);
    }

    public final void q() {
        ModularAction f = f();
        if (f == null || !f.t() || R()) {
            return;
        }
        List ab = f.ab();
        if (ab.isEmpty()) {
            return;
        }
        Argument argument = (Argument) ab.get(0);
        if (this.g.c(0L, 4194304L)) {
            an();
        }
        new com.google.android.apps.gsa.shared.util.c.ae(this.s.m(argument), this.t, "On top argument in ModularAction processed").b(new n(this, argument, 1)).a(new a(8));
    }

    public final void r() {
        CardDecision cardDecision;
        ClientConfig clientConfig = ((j) this.C.a()).f1303a;
        bk bkVar = (bk) this.d.a();
        if (this.h.aW() && g().h) {
            if ((N() || (cardDecision = this.o) == null || cardDecision.t.isEmpty()) && !bkVar.D() && this.h.co(bkVar.m)) {
                com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                if (this.h.dc()) {
                    ((bf) this.I.a()).m(this.h);
                }
                if (clientConfig.u()) {
                    this.n = this.h;
                    return;
                }
                ActionData actionData = this.i;
                if (actionData != null) {
                    au(actionData, this.h.Q());
                }
            }
        }
    }

    public final void s(VoiceAction voiceAction, com.google.android.apps.gsa.search.shared.actions.e eVar, boolean z, boolean z2, boolean z3) {
        ArrayList L;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        boolean z4 = false;
        if (z2) {
            z4 = false;
            if (voiceAction != null) {
                List list = this.j;
                if (list == null || list.isEmpty()) {
                    L = oo.L(new VoiceAction[]{voiceAction});
                } else {
                    L = oo.K(this.j);
                    L.set(0, voiceAction);
                }
                ActionData actionData = this.i;
                z4 = false;
                if (actionData != null) {
                    z4 = aw(actionData, L);
                }
            }
        }
        boolean z5 = z4;
        if (z3) {
            z5 = z4 | at(2, 3, eVar);
        }
        if (voiceAction != null && z) {
            x(voiceAction);
        }
        if (z5) {
            an();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(com.google.android.apps.gsa.search.shared.actions.VoiceAction r7, com.google.android.apps.gsa.search.shared.actions.d r8, int r9) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.f.t(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.d, int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action{");
        sb.append("Identity=" + System.identityHashCode(this) + " ");
        sb.append(" Flags=");
        sb.append(this.g.b());
        sb.append(" ActionDataQuery=");
        Query query = this.h;
        sb.append(query.aV(query.g));
        sb.append(" ExtraCards=");
        sb.append(this.L.toString());
        sb.append(" ");
        ActionData actionData = this.i;
        sb.append(actionData == null ? "null data" : actionData.toString());
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        k(Query.b, null);
        this.s.o((c) this.f.a());
    }

    final void v(int i, int i2, com.google.android.apps.gsa.search.shared.actions.e eVar) {
        if (at(i, i2, eVar)) {
            an();
        }
    }

    public final void w(VoiceAction voiceAction, int i) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.S = null;
        if (this.R != null) {
            com.google.common.f.h f = f1300a.f();
            f.aj(com.google.common.f.a.e.a, "ActionState");
            com.google.common.f.h hVar = f;
            hVar.ak(7475);
            hVar.p("requestActionToBeExecuted called when an action is already executing, return.");
            return;
        }
        if (!voiceAction.w() && !voiceAction.y()) {
            this.R = voiceAction;
            voiceAction.I(i);
            return;
        }
        com.google.common.f.h f2 = f1300a.f();
        f2.aj(com.google.common.f.a.e.a, "ActionState");
        com.google.common.f.h hVar2 = f2;
        hVar2.ak(7474);
        hVar2.p("requestActionToBeExecuted called on an already executing action.");
    }

    @Override // com.google.android.apps.gsa.search.shared.actions.a
    public final void x(VoiceAction voiceAction) {
        if (voiceAction != f() || voiceAction.f() == null) {
            return;
        }
        this.g.c(0L, 524288L);
        new com.google.android.apps.gsa.shared.util.c.ae(this.s.a(voiceAction, ((bk) this.d.a()).m), this.t, String.format("[%s] On matching provider info created", "ActionState")).a(new b(this, voiceAction, 2)).a(new a(10));
    }

    public final void y(ActionData actionData) {
        if (h.a.a.p.b.a.f.f(this.i, actionData)) {
            return;
        }
        this.i = actionData;
        b bVar = this.s;
        ActionData actionData2 = actionData;
        if (actionData == null) {
            actionData2 = ActionData.a;
        }
        bVar.x(actionData2);
    }

    public final void z(VoiceAction voiceAction, CardDecision cardDecision) {
        if (voiceAction == f()) {
            boolean c = this.g.c(2048L, 0L);
            if (!h.a.a.p.b.a.f.f(cardDecision, this.o) || this.g.c(8589934592L, 0L)) {
                CardDecision cardDecision2 = this.o;
                A(cardDecision, false);
                com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                if (cardDecision.j) {
                    voiceAction.D();
                }
                if (this.p == 0 && cardDecision2 == null) {
                    o();
                }
                if (!cardDecision.f && !cardDecision.h && !X() && !R() && !voiceAction.r() && !this.h.bY()) {
                    this.g.c(0L, 34359738368L);
                    this.g.c(0L, 128L);
                }
                r();
                c = true;
                if (e().d(cardDecision, f(), Q())) {
                    aq();
                    c = true;
                }
            }
            if (this.g.c(16384L, 0L) || c) {
                this.g.c(0L, 8L);
                an();
            }
        }
    }
}
