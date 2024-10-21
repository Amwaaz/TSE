package com.google.android.apps.gsa.search.core.state;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.ae.bt.b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.gsa.h.h;
import com.google.bf.a.dz;
import com.google.bf.a.ea;
import com.google.common.base.at;
import com.google.common.o.hb;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.bi;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/TtsState.class */
public class TtsState extends ae {
    private static final com.google.common.f.j k = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.TtsState");
    private final a B;
    private final a C;
    private final at D;
    private int E;
    private Query H;
    private CardDecision I;

    /* renamed from: a, reason: collision with root package name */
    public final a f1226a;
    public final Context b;
    public final boolean c;
    public final BitFlags d;
    public Query e;
    public CardDecision f;
    public TtsRequest g;
    public com.google.protobuf.v h;
    public SettableFuture i;
    public String j;
    private final a l;
    private final a m;
    private final a n;
    private final a o;
    private final a p;
    private final a q;
    private final a r;
    private final a s;
    private final com.google.android.apps.gsa.search.core.ac.t t;
    private final h u;
    private final b v;
    private final SharedPreferences w;
    private final c x;

    public TtsState(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, c cVar, a aVar9, a aVar10, com.google.android.apps.gsa.search.core.ac.t tVar, Context context, SharedPreferences sharedPreferences, h hVar, b bVar, at atVar, a aVar11, a aVar12) {
        super(aVar, 52);
        this.d = new BitFlags(this, getClass()) { // from class: com.google.android.apps.gsa.search.core.state.TtsState.1

            /* renamed from: a, reason: collision with root package name */
            final TtsState f1227a;

            {
                this.f1227a = this;
            }

            @Override // com.google.android.apps.gsa.shared.util.BitFlags
            protected final void a() {
                TtsState ttsState = this.f1227a;
                long j = ttsState.d.b;
                com.google.common.base.cl.v(!BitFlags.f(j, 96L) && (!BitFlags.f(j, 1L) || ttsState.h == null), "Illegal state: ".concat(String.valueOf(toString())));
                long j2 = this.f1227a.d.b;
                boolean z = false;
                if ((BitFlags.f(j2, 2L) ? 1 : 0) + (BitFlags.f(j2, 4L) ? 1 : 0) + (BitFlags.f(j2, 128L) ? 1 : 0) + (BitFlags.f(j2, 512L) ? 1 : 0) <= 1) {
                    z = true;
                }
                com.google.common.base.cl.y(z, "Illegal PLAY REQUESTED state: %s", toString());
            }
        };
        this.e = Query.b;
        this.E = -1;
        this.l = aVar2;
        this.m = aVar3;
        this.n = aVar4;
        this.o = aVar5;
        this.f1226a = aVar6;
        this.p = aVar7;
        this.q = aVar8;
        this.s = aVar10;
        this.r = aVar9;
        this.t = tVar;
        this.b = context;
        this.w = sharedPreferences;
        this.u = hVar;
        this.v = bVar;
        this.x = cVar;
        this.c = false;
        this.D = atVar;
        this.B = aVar11;
        this.C = aVar12;
    }

    private final String D() {
        dz dzVar;
        ActionData actionData = ((f) this.l.a()).i;
        if (actionData == null || (dzVar = actionData.b) == null) {
            return null;
        }
        ea eaVar = dzVar.c;
        ea eaVar2 = eaVar;
        if (eaVar == null) {
            eaVar2 = ea.a;
        }
        if ((eaVar2.b & 4) != 0) {
            return eaVar2.d;
        }
        return null;
    }

    private static boolean E(Query query, SearchError searchError) {
        return query.bs() && query.bw() && searchError != null && searchError.h == 7;
    }

    private final boolean F() {
        return !this.d.e(96L);
    }

    public final boolean A() {
        return BitFlags.f(this.d.b, 8L);
    }

    final boolean B(VoiceAction voiceAction, TtsRequest ttsRequest, boolean z, boolean z2) {
        String D;
        if (s()) {
            return false;
        }
        if (voiceAction != null && !z(voiceAction)) {
            return false;
        }
        if (this.d.e(646L)) {
            com.google.common.f.am.d.getClass();
            return false;
        }
        boolean z3 = (ttsRequest == null || (D = D()) == null || !D.equalsIgnoreCase(ttsRequest.toString()) || this.e.bp() || ttsRequest.b()) ? false : true;
        if (ttsRequest != null && !TtsRequest.c(ttsRequest) && !z3) {
            if (ttsRequest.b()) {
                this.d.c(0L, 512L);
            } else if (!z2 || ttsRequest.e) {
                this.d.c(0L, 2L);
            } else {
                this.d.c(0L, 128L);
            }
            this.g = ttsRequest;
            if (z) {
                this.d.c(0L, 8L);
            }
            i();
            return true;
        }
        if (!this.e.cq() && ((ag) this.p.a()).b == null) {
            if (((ab) this.n.a()).d == null) {
                return false;
            }
            m();
            return true;
        }
        if (!x()) {
            m();
            return true;
        }
        if (BitFlags.f(this.d.b, 1L)) {
            m();
            return true;
        }
        if (z3) {
            com.google.android.apps.gsa.shared.logger.k.f(434);
        }
        this.d.c(0L, 4L);
        if (z) {
            this.d.c(0L, 8L);
        }
        i();
        return true;
    }

    public final boolean C() {
        if (!((f) this.l.a()).J(((bk) this.f1226a.a()).m) || y()) {
            return false;
        }
        CardDecision g = ((f) this.l.a()).g();
        int a2 = ((f) this.l.a()).a();
        if (h.a.a.p.b.a.f.f(this.f, g) && this.E == a2) {
            return false;
        }
        this.f = g;
        this.E = a2;
        boolean z = true;
        boolean z2 = g.t.isEmpty() ? !TtsRequest.c(g.d) || (this.h != null && x()) : g.c(a2) != null;
        if (this.f == null || !s() || !g.f || !z2 || !this.d.g()) {
            z = false;
        }
        if (z) {
            c(((j) this.m.a()).f1303a, false);
            a();
        }
        return z;
    }

    public final void a() {
        Query query = ((bk) this.f1226a.a()).m;
        if ((!query.cf() && !query.bY()) || !r() || y() || s() || query == this.H) {
            return;
        }
        this.H = query;
        Bundle bundle = query.w;
        if (bundle != null) {
            TtsRequest ttsRequest = (TtsRequest) bundle.getParcelable("notification-message");
            boolean cd = query.cd();
            boolean z = false;
            if (query.bJ()) {
                z = false;
                if (query.cd()) {
                    z = true;
                }
            }
            B(null, ttsRequest, !z, cd);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.TTS_PLAYBACK_COMPLETE, com.google.android.apps.gsa.search.shared.service.c.ac.STOP_SPEAKING};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (E(r0, r0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.apps.gsa.search.shared.service.ClientConfig r9, boolean r10) {
        /*
            r8 = this;
            r0 = r8
            e.a r0 = r0.f1226a
            java.lang.Object r0 = r0.a()
            com.google.android.apps.gsa.search.core.state.bk r0 = (com.google.android.apps.gsa.search.core.state.bk) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.m
            r14 = r0
            r0 = r8
            e.a r0 = r0.n
            java.lang.Object r0 = r0.a()
            com.google.android.apps.gsa.search.core.state.ab r0 = (com.google.android.apps.gsa.search.core.state.ab) r0
            com.google.android.apps.gsa.search.shared.actions.SearchError r0 = r0.d
            r15 = r0
            r0 = r8
            java.lang.String r0 = r0.j
            r12 = r0
            r0 = 0
            r11 = r0
            r0 = r12
            if (r0 == 0) goto L34
            r0 = r11
            r10 = r0
            goto Lbc
        L34:
            r0 = 0
            r13 = r0
            r0 = r10
            if (r0 != 0) goto L4b
            r0 = r13
            r12 = r0
            r0 = r11
            r10 = r0
            r0 = r14
            r1 = r15
            boolean r0 = E(r0, r1)
            if (r0 == 0) goto Lbc
        L4b:
            r0 = r14
            boolean r0 = r0.bs()
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = r10
            if (r0 == 0) goto Lae
            r0 = r13
            r12 = r0
            r0 = r11
            r10 = r0
            r0 = r15
            if (r0 == 0) goto Lbc
            r0 = r15
            r1 = 2
            boolean r0 = r0.Q(r1)
            if (r0 != 0) goto L76
            r0 = r13
            r12 = r0
            r0 = r11
            r10 = r0
            goto Lbc
        L76:
            com.google.android.apps.gsa.shared.util.c.ae r0 = new com.google.android.apps.gsa.shared.util.c.ae
            r1 = r0
            r2 = r8
            com.google.android.apps.gsa.search.core.ae.bt.b r2 = r2.v
            r3 = r14
            com.google.common.util.concurrent.cn r2 = r2.a(r3)
            r3 = r8
            com.google.android.libraries.gsa.h.h r3 = r3.u
            java.lang.String r4 = "maybeRequestPlayTtsInternal"
            r1.<init>(r2, r3, r4)
            com.google.android.apps.gsa.search.core.state.at r1 = new com.google.android.apps.gsa.search.core.state.at
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r14
            r6 = 3
            r2.<init>(r3, r4, r5, r6)
            com.google.android.apps.gsa.shared.util.c.ac r0 = r0.a(r1)
            com.google.android.apps.gsa.search.core.state.at r1 = new com.google.android.apps.gsa.search.core.state.at
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r14
            r6 = 4
            r2.<init>(r3, r4, r5, r6)
            r0.a(r1)
            return
        Lae:
            r0 = r8
            android.content.Context r0 = r0.b
            r1 = 2132082809(0x7f150079, float:1.9805743E38)
            java.lang.String r0 = r0.getString(r1)
            r12 = r0
            r0 = r11
            r10 = r0
        Lbc:
            r0 = r8
            r1 = r9
            r2 = r14
            r3 = r12
            r4 = r10
            r0.f(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.TtsState.c(com.google.android.apps.gsa.search.shared.service.ClientConfig, boolean):void");
    }

    public final void f(ClientConfig clientConfig, Query query, String str, boolean z) {
        CardDecision cardDecision;
        com.google.common.util.concurrent.cn cnVar;
        if (str != null && ((clientConfig.C() || query.bw()) && query != this.H)) {
            this.H = query;
            B(null, new TtsRequest(str, false), true, false);
            if (z) {
                ((com.google.android.apps.gsa.shared.logger.e) this.s.a()).c(null, 21171471);
                return;
            }
            return;
        }
        if (((bk) this.f1226a.a()).J(query) && !E(query, ((ab) this.n.a()).d) && !((f) this.l.a()).U(query) && ((cnVar = ((f) this.l.a()).v) == null || cnVar.isDone())) {
            boolean K = ((bk) this.f1226a.a()).K(query);
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 1017;
            com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
            ((j) this.m.a()).c();
            if (K) {
                query.bo();
            }
            n(query);
        }
        if (!((f) this.l.a()).T() || ((f) this.l.a()).V()) {
            return;
        }
        VoiceAction f = ((f) this.l.a()).f();
        int a2 = ((f) this.l.a()).a();
        boolean c = ((f) this.l.a()).g.c(256L, 0L);
        if (f == null || (cardDecision = this.f) == null) {
            return;
        }
        if (cardDecision != this.I || c) {
            PromptSegment c2 = cardDecision.c(a2);
            TtsRequest ttsRequest = (c2 == null || TtsRequest.c(c2.b)) ? cardDecision.d : c2.b;
            if (cardDecision.f) {
                if (B(f, ttsRequest, cardDecision.g, true)) {
                    this.I = cardDecision;
                }
            } else {
                if (z(f) && !y()) {
                    m();
                }
                this.I = cardDecision;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hJ(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
        CardDecision cardDecision;
        com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.search.core.state.g.e.b);
        vVar.d(bgVar);
        Object l = ((bd) vVar).br.l(bgVar.d);
        com.google.android.apps.gsa.search.core.state.g.e eVar = (com.google.android.apps.gsa.search.core.state.g.e) (l == null ? bgVar.b : bgVar.c(l));
        this.h = (eVar.c & 1) != 0 ? eVar.d : null;
        BitFlags bitFlags = this.d;
        bitFlags.c(bitFlags.b, eVar.e);
        com.google.android.apps.gsa.shared.search.a.b bVar = eVar.f;
        com.google.android.apps.gsa.shared.search.a.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = com.google.android.apps.gsa.shared.search.a.b.f1481a;
        }
        this.e = com.google.android.apps.gsa.shared.search.c.b(bVar2, i);
        if (i != 1 || (eVar.c & 8) == 0) {
            cardDecision = null;
        } else {
            com.google.protobuf.v vVar2 = eVar.g;
            Parcelable.Creator creator = CardDecision.CREATOR;
            com.google.common.f.j jVar = com.google.android.apps.gsa.shared.util.ar.f1501a;
            cardDecision = (CardDecision) com.google.android.apps.gsa.shared.util.ar.e(vVar2.E(), creator);
        }
        this.f = cardDecision;
        TtsRequest ttsRequest = null;
        if (i == 1) {
            ttsRequest = null;
            if ((eVar.c & 16) != 0) {
                com.google.protobuf.v vVar3 = eVar.h;
                Parcelable.Creator creator2 = TtsRequest.CREATOR;
                com.google.common.f.j jVar2 = com.google.android.apps.gsa.shared.util.ar.f1501a;
                ttsRequest = (TtsRequest) com.google.android.apps.gsa.shared.util.ar.e(vVar3.E(), creator2);
            }
        }
        this.g = ttsRequest;
        if (y()) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hK(bc bcVar) {
        com.google.protobuf.ba createBuilder = com.google.android.apps.gsa.search.core.state.g.e.a.createBuilder();
        long j = this.d.b;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.core.state.g.e eVar = createBuilder.instance;
        eVar.c |= 2;
        eVar.e = j;
        com.google.android.apps.gsa.shared.search.a.b a2 = com.google.android.apps.gsa.shared.search.c.a(this.e);
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.core.state.g.e eVar2 = createBuilder.instance;
        a2.getClass();
        eVar2.f = a2;
        eVar2.c |= 4;
        com.google.protobuf.v vVar = this.h;
        if (vVar != null) {
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.core.state.g.e eVar3 = createBuilder.instance;
            eVar3.c |= 1;
            eVar3.d = vVar;
        }
        CardDecision cardDecision = this.f;
        if (cardDecision != null) {
            com.google.protobuf.v f = com.google.android.apps.gsa.shared.util.ar.f(cardDecision);
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.core.state.g.e eVar4 = createBuilder.instance;
            f.getClass();
            eVar4.c |= 8;
            eVar4.g = f;
        }
        TtsRequest ttsRequest = this.g;
        if (ttsRequest != null) {
            com.google.protobuf.v f2 = com.google.android.apps.gsa.shared.util.ar.f(ttsRequest);
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.core.state.g.e eVar5 = createBuilder.instance;
            f2.getClass();
            eVar5.c |= 16;
            eVar5.h = f2;
        }
        bcVar.w(com.google.android.apps.gsa.search.core.state.g.e.b, createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal == 23) {
            m();
            this.v.b();
        } else {
            if (ordinal != 28) {
                return;
            }
            f fVar = (f) this.l.a();
            if (y()) {
                l();
            }
            if (fVar.I()) {
                fVar.F();
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("TtsState");
        fVar.n("query", this.e);
        fVar.b("flags").a(new d(this.d.b(), false));
        fVar.b("network").a(new d(Boolean.valueOf(this.h != null), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x024a, code lost:
    
        if (com.google.android.apps.gsa.search.shared.actions.ActionData.a.equals(r0) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026f, code lost:
    
        if (com.google.android.apps.gsa.shared.util.BitFlags.f(r14.d.b, 4) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0287, code lost:
    
        if (r0 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x034e, code lost:
    
        if (android.text.TextUtils.isEmpty(r22) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f5, code lost:
    
        if (r0 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01fc, code lost:
    
        if (r17 == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.TtsState.i():void");
    }

    public final void k(Query query, com.google.protobuf.v vVar) {
        if (((bk) this.f1226a.a()).m.co(query) && !BitFlags.f(this.d.b, 1L) && this.h == null) {
            this.h = vVar;
            if (this.i == null) {
                i();
                return;
            }
            p(at.k(vVar));
            m();
            if (w()) {
                an();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        if (y()) {
            q();
        }
    }

    public final void m() {
        SettableFuture settableFuture = this.i;
        if (settableFuture != null && !settableFuture.isDone()) {
            p(com.google.common.base.a.a);
        }
        if (this.d.c(32L, 64L)) {
            C();
            an();
        }
    }

    public final void n(Query query) {
        if (((bk) this.f1226a.a()).m.co(query)) {
            m();
        }
    }

    public final void o() {
        if (!this.e.bw() || this.e.bJ()) {
            m();
            return;
        }
        com.google.common.f.h f = k.f();
        f.ak(7798);
        f.p("setDoneOrReportTtsMissing: Report missing TTS.");
        c(((j) this.m.a()).f1303a, true);
    }

    public final void p(at atVar) {
        SettableFuture settableFuture = this.i;
        if (settableFuture != null) {
            settableFuture.n(atVar);
            this.i = null;
        }
    }

    public final void q() {
        this.v.c();
    }

    public final boolean r() {
        bk bkVar = (bk) this.f1226a.a();
        return bkVar.m.co(this.e);
    }

    public final boolean s() {
        return BitFlags.f(this.d.b, 64L);
    }

    public final String toString() {
        String b = this.d.b();
        com.google.protobuf.v vVar = this.h;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder("TtsState(flags=");
        sb.append(b);
        sb.append(", available-network=");
        sb.append(vVar != null);
        sb.append(", query=");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final boolean v(CardDecision cardDecision) {
        return s() && h.a.a.p.b.a.f.f(this.f, cardDecision) && this.E == ((f) this.l.a()).a();
    }

    public final boolean w() {
        SettableFuture settableFuture = this.i;
        if (settableFuture != null && !settableFuture.isDone()) {
            return true;
        }
        if (s()) {
            return false;
        }
        bk bkVar = (bk) this.f1226a.a();
        Query query = bkVar.m;
        SearchError searchError = ((ab) this.n.a()).d;
        if (query.dd()) {
            if (bkVar.m.co(bkVar.s.b) && !bkVar.s.f() && (!bkVar.K(query) || query.bx())) {
                return true;
            }
            if (bkVar.s.h(query)) {
                ba baVar = (ba) this.o.a();
                Query query2 = ((bk) baVar.b.a()).m;
                if (baVar.i(query2) && !ActionData.a.equals(baVar.a(query2))) {
                    return true;
                }
            }
            if (query.br() && bkVar.m.co(query) && searchError == null) {
                return true;
            }
        }
        if (((f) this.l.a()).aa() || query.cf() || query.bY()) {
            return true;
        }
        ClientConfig clientConfig = ((j) this.m.a()).f1303a;
        if (bkVar.K(query)) {
            return true;
        }
        return (searchError == null || searchError.k == null || !clientConfig.C()) ? false : true;
    }

    public final boolean x() {
        if (this.e.cq() && this.e.ba("android.speech.extra.ACTION_DATA") && this.e.dd()) {
            return true;
        }
        ag agVar = (ag) this.p.a();
        Query query = this.e;
        com.google.android.apps.gsa.search.core.l.aq a2 = agVar.a();
        return agVar.f1232a.co(query) && a2 != null && a2.d.f;
    }

    public final boolean y() {
        return BitFlags.f(this.d.b, 32L);
    }

    final boolean z(VoiceAction voiceAction) {
        f fVar = (f) this.l.a();
        return voiceAction == fVar.f() && fVar.J(this.e) && fVar.L(fVar.i);
    }
}
