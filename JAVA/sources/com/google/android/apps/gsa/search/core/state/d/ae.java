package com.google.android.apps.gsa.search.core.state.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.ap;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.a.b.b;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.search.t.a.a.a.e;
import com.google.common.b.fl;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/ae.class */
public class ae extends com.google.android.apps.gsa.search.core.state.ae implements ap {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1275a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.ae");
    private final e.a B;
    private final e C;
    private final e.a D;
    private final e.a E;
    private boolean H;
    private boolean I;
    private com.google.android.apps.gsa.speech.k.b.a J;
    private boolean K;
    private boolean L;
    private cn M;
    private cn N;
    private boolean O;
    public final e.a b;
    public final e.a c;
    public final com.google.android.apps.gsa.search.core.h.p d;
    public final com.google.android.libraries.g.a e;
    public final BitFlags f;
    public final SharedPreferences g;
    public final e.a h;
    public final com.google.android.libraries.gsa.h.h i;
    public final com.google.android.apps.gsa.assist.a.k j;
    public final at k;
    public final Context l;
    public final com.google.android.apps.gsa.search.core.ae.am.a m;
    public com.google.android.apps.gsa.speech.k.d n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final BroadcastReceiver t;
    public final t u;
    private final e.a v;
    private final Set w;
    private final com.google.android.apps.gsa.search.core.ac.t x;

    public ae(e.a aVar, e.a aVar2, com.google.android.apps.gsa.search.core.h.p pVar, com.google.android.libraries.g.a aVar3, SharedPreferences sharedPreferences, e.a aVar4, e.a aVar5, com.google.android.apps.gsa.search.core.ae.am.a aVar6, com.google.android.apps.gsa.search.core.ac.t tVar, e.a aVar7, e.a aVar8, com.google.android.libraries.gsa.h.h hVar, e eVar, t tVar2, e.a aVar9, at atVar, Context context, e.a aVar10, com.google.android.apps.gsa.assist.a.k kVar) {
        super(aVar, 15);
        this.f = new BitFlags(getClass(), "FLAG_", 0L);
        this.H = false;
        this.J = com.google.android.apps.gsa.speech.k.b.a.f1598a;
        this.M = c.b;
        this.N = c.b;
        this.t = new ac(this);
        this.b = aVar2;
        this.d = pVar;
        this.e = aVar3;
        this.C = eVar;
        this.w = new HashSet();
        this.g = sharedPreferences;
        this.h = aVar4;
        this.n = new com.google.android.apps.gsa.speech.k.d();
        this.c = aVar5;
        this.m = aVar6;
        this.K = sharedPreferences.getBoolean("key_opa_eligible", false);
        this.L = sharedPreferences.getBoolean("opa_chat_ui_seen", false);
        this.x = tVar;
        this.u = tVar2;
        this.v = aVar7;
        this.B = aVar8;
        this.i = hVar;
        this.E = aVar9;
        this.k = atVar;
        this.l = context;
        this.D = aVar10;
        this.j = kVar;
        hVar.n("MicroDetectionState#registerBroadcastReceivers", new com.google.android.libraries.gsa.h.f(this) { // from class: com.google.android.apps.gsa.search.core.state.d.y

            /* renamed from: a, reason: collision with root package name */
            public final ae f1298a;

            {
                this.f1298a = this;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_FOREGROUND");
                intentFilter.addAction("android.intent.action.USER_BACKGROUND");
                ae aeVar = this.f1298a;
                androidx.core.content.a.f(aeVar.l, aeVar.t, intentFilter, null, 2);
            }
        });
    }

    private final void E() {
        ad.a(new aa(this));
    }

    private final void F(cn cnVar, String str) {
        if (cnVar.isDone()) {
            E();
            super.an();
        } else {
            new com.google.android.apps.gsa.shared.util.c.ae(cnVar, this.i, str).b(new z(this, 0)).a(new b(this, 3));
            E();
            super.an();
        }
    }

    private final boolean G() {
        return !this.N.isDone();
    }

    public final boolean A() {
        return this.f.e(14L);
    }

    public final boolean B() {
        if (!this.K) {
            return false;
        }
        if (this.d.w(az.fp)) {
            ab abVar = com.google.common.f.a.e.a;
            return false;
        }
        if (!this.d.w(az.fq)) {
            ab abVar2 = com.google.common.f.a.e.a;
            return true;
        }
        if (this.L) {
            ab abVar3 = com.google.common.f.a.e.a;
            return true;
        }
        ab abVar4 = com.google.common.f.a.e.a;
        return false;
    }

    public final boolean C() {
        if (!B()) {
            return !TextUtils.isEmpty(this.J.d);
        }
        ab abVar = com.google.common.f.a.e.a;
        return false;
    }

    public final boolean D(h hVar) {
        if (!this.I || !this.d.w(df.aI)) {
            return false;
        }
        boolean z = this.p;
        int i = hVar.g;
        if (!((h) this.b.a()).e || (i != 2 && i != 4)) {
            this.p = false;
        } else if (this.J.b()) {
            this.p = true;
        }
        ab abVar = com.google.common.f.a.e.a;
        return z != this.p;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.HOTWORD_DETECTED_IN_INTERACTOR, com.google.android.apps.gsa.search.shared.service.c.ac.VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void an() {
        E();
        super.an();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        ab abVar = com.google.common.f.a.e.a;
        int i = 0;
        boolean z = this.J.c == 0 && !this.o;
        boolean z2 = this.H;
        if (z2 || z) {
            int i2 = true != z2 ? 1 : 2;
            this.o = true;
            this.H = false;
            if (!w()) {
                E();
                super.an();
            }
            i = i2;
        }
        if (i == 0) {
            this.m.l();
        } else {
            this.m.g(i);
        }
    }

    public final void f(HotwordResult hotwordResult) {
        ab abVar = com.google.common.f.a.e.a;
        this.n.e();
        E();
        super.an();
        this.m.h(hotwordResult);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        boolean z;
        switch (str.hashCode()) {
            case -1674632771:
                if (str.equals("hotwordDetector")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case -574728546:
                if (str.equals("opa_chat_ui_seen")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 357273206:
                if (str.equals("key_opa_eligible")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 1567966759:
                if (str.equals("google_account")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        if (!z) {
            ((com.google.android.apps.gsa.search.core.ae.af.a) this.E.a()).b();
            return;
        }
        if (z) {
            ab abVar = com.google.common.f.a.e.a;
            this.K = this.g.getBoolean("key_opa_eligible", false);
            E();
            super.an();
            return;
        }
        if (z == 2) {
            ab abVar2 = com.google.common.f.a.e.a;
            this.L = this.g.getBoolean("opa_chat_ui_seen", false);
            E();
            super.an();
            return;
        }
        if (z != 3) {
            return;
        }
        ab abVar3 = com.google.common.f.a.e.a;
        E();
        super.an();
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"google_account", "always_on_hotword_suppressed", "hotwordDetector", "key_opa_eligible", "opa_chat_ui_seen"};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        ab abVar = com.google.common.f.a.e.a;
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal != 21) {
            if (ordinal != 55) {
                return;
            }
            cn c = this.m.c();
            this.M = c;
            F(c, "onVoiceAssistTriggerFromKeyguard");
            return;
        }
        ((com.google.android.apps.gsa.shared.logger.b.h) this.D.a()).b(com.google.android.apps.gsa.shared.logger.b.w.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR);
        this.C.i(Duration.ofNanos(this.e.b()));
        cn a3 = this.m.a(clientEventData.b(HotwordDetectedEventData.class));
        this.N = a3;
        F(a3, "onHotwordDetectedInInteractor");
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        String sb;
        fVar.q("MicroDetectionState");
        fVar.b("flags").a(new com.google.android.apps.gsa.shared.util.b.d(this.f.b(), false));
        ArrayList arrayList = new ArrayList();
        if (x()) {
            arrayList.add("active");
        }
        if (z()) {
            arrayList.add("enabled");
        }
        if (y()) {
            arrayList.add("available");
        }
        if (this.J.b()) {
            arrayList.add("availableForLocale");
        }
        if (this.H) {
            arrayList.add("force update data manager");
        }
        if (this.o) {
            arrayList.add("data manager initializing");
        }
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d(arrayList.toString(), false));
        fVar.b("Hotword Phrase").a(new com.google.android.apps.gsa.shared.util.b.d(((com.google.android.apps.gsa.speech.o.g) this.c.a()).r(), false));
        fVar.b("current detection mode").a(new com.google.android.apps.gsa.shared.util.b.d(String.valueOf(this.n), false));
        fVar.b("model info").a(new com.google.android.apps.gsa.shared.util.b.d(String.valueOf(this.J), false));
        fVar.b("hotword stats").a(new com.google.android.apps.gsa.shared.util.b.d(String.valueOf(this.h.a()), false));
        fVar.b("pausing packages").a(new com.google.android.apps.gsa.shared.util.b.d(String.valueOf(this.w), false));
        fVar.b("always_on_hotword_suppressed").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.g.getBoolean("always_on_hotword_suppressed", false)), false));
        if (G()) {
            fVar.r(new com.google.android.apps.gsa.shared.util.b.d("PendingHotwordEventData = true", false));
        }
        com.google.android.apps.gsa.shared.speech.a.k kVar = (com.google.android.apps.gsa.shared.speech.a.k) this.B.a();
        if (((com.google.android.apps.gsa.shared.k.c) kVar.b.a()).w(df.bt)) {
            com.google.android.apps.gsa.shared.util.debug.a.b.a aVar = kVar.a;
            com.google.android.apps.gsa.shared.util.debug.a.f d = fVar.d((Object) null);
            d.q("Voice Match Tracker Events:");
            fl b = aVar.c.b(aVar.b);
            int size = b.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) b.get(i2);
                i++;
                com.google.android.apps.gsa.shared.util.debug.a.f d2 = d.d((Object) null);
                d2.b("timestamp").a(com.google.android.apps.gsa.shared.util.b.e.b(new Date(bVar.c)));
                if (!bVar.d.isEmpty()) {
                    d2.b("label").a(new com.google.android.apps.gsa.shared.util.b.d(bVar.d, false));
                }
                bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.apps.gsa.shared.speech.a.b.a);
                bVar.d(bgVar);
                Object l = ((bd) bVar).br.l(bgVar.d);
                com.google.android.apps.gsa.shared.speech.a.a aVar2 = (com.google.android.apps.gsa.shared.speech.a.a) (l == null ? bgVar.b : bgVar.c(l));
                if (aVar2 != null) {
                    d2.b("Event").a(new com.google.android.apps.gsa.shared.util.b.d(aVar2.e, false));
                }
            }
            if (i == 0) {
                d.r(new com.google.android.apps.gsa.shared.util.b.d("none", false));
            }
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : kVar.c.entrySet()) {
                sb2.append((String) entry.getKey());
                sb2.append(": [");
                sb2.append(entry.getValue());
                sb2.append("]\n");
            }
            sb = sb2.toString();
        }
        fVar.a("\nTracker Events: ".concat(sb));
        com.google.android.apps.gsa.speech.o.g gVar = (com.google.android.apps.gsa.speech.o.g) this.c.a();
        fVar.b("Always On Enabled").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(gVar.X()), false));
        fVar.j("Hotword Phrase", gVar.r());
        com.google.android.apps.gsa.search.core.ac.t tVar = this.x;
        com.google.android.apps.gsa.shared.o.a.a aVar3 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        boolean isKeyguardSecure = tVar.b.isKeyguardSecure();
        ab abVar = com.google.common.f.a.e.a;
        fVar.j("Secure Keyguard Enabled", true != isKeyguardSecure ? "No" : "Yes");
        boolean am = ((com.google.android.apps.gsa.speech.o.g) this.c.a()).am();
        String string = this.g.getString("HotwordEverywhereEnabledAnytime", null);
        if (string != null) {
            fVar.j("HotwordEverywhereEnabledAnytime", string);
        }
        if (!am && !((com.google.android.apps.gsa.speech.o.g) this.c.a()).X()) {
            fVar.j("Hotword Running", true != x() ? "No" : "Yes");
        } else if (string == null) {
            Date date = new Date();
            this.g.edit().putString("HotwordEverywhereEnabledAnytime", date.toString()).apply();
            fVar.j("HotwordEverywhereEnabledAnytime", date.toString());
        }
        fVar.j("Hotword Detection Setting Enabled", String.valueOf(((com.google.android.apps.gsa.speech.o.g) this.c.a()).aa()));
    }

    public final void i(com.google.android.apps.gsa.speech.k.b.a aVar) {
        boolean z;
        ab abVar = com.google.common.f.a.e.a;
        if (aVar.equals(this.J)) {
            z = false;
        } else {
            this.J = aVar;
            z = true;
        }
        if (this.J.b() && this.o) {
            this.o = false;
        } else if (!z) {
            return;
        }
        E();
        super.an();
    }

    public final void k(boolean z) {
        ab abVar = com.google.common.f.a.e.a;
        if (this.f.h(2048L, !z)) {
            E();
            super.an();
        }
    }

    public final void l(boolean z) {
        this.I = z;
        D((h) this.b.a());
        E();
        super.an();
    }

    public final void m() {
        if (this.H) {
            return;
        }
        this.H = true;
        E();
        super.an();
    }

    public final void n(boolean z) {
        if (this.f.h(16L, !z)) {
            E();
            super.an();
        }
    }

    public final void o(boolean z) {
        if (this.f.h(2L, z)) {
            E();
            super.an();
        }
    }

    public final void p(boolean z) {
        if (this.f.h(8L, z)) {
            E();
            super.an();
        }
    }

    public final void q(boolean z) {
        this.s = z;
        E();
        super.an();
    }

    public final void r(boolean z) {
        this.r = z;
        E();
        super.an();
    }

    public final void s(boolean z) {
        if (this.f.h(4096L, !z)) {
            com.google.common.f.h d = f1275a.d();
            d.aj(com.google.common.f.a.e.a, "MicroDetectionState");
            com.google.common.f.h hVar = d;
            hVar.ak(7983);
            hVar.s("Updating hotword opa ineligibility to %b", Boolean.valueOf(z));
            E();
            super.an();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (x()) {
            arrayList.add("active");
        }
        if (z()) {
            arrayList.add("enabled");
        }
        if (y()) {
            arrayList.add("hotwordAvailable");
        }
        if (this.J.b()) {
            arrayList.add("hotwordAvailableForLocale");
        }
        arrayList.add("mCurrentDetectionMode=".concat(String.valueOf(String.valueOf(this.n))));
        arrayList.add("mHotwordStats=".concat(String.valueOf(String.valueOf(this.h.a()))));
        arrayList.add("mIsDataManagerInitializing=" + this.o);
        arrayList.add("mModelInfo=".concat(String.valueOf(String.valueOf(this.J))));
        arrayList.add("mHotwordStatsTotal=" + ((com.google.android.apps.gsa.speech.k.c) this.h.a()).a());
        arrayList.add("mPausingPackageNames=".concat(String.valueOf(String.valueOf(this.w))));
        arrayList.add("mForceUpdateDataManager=" + this.H);
        arrayList.add("mConnectedToCar=" + ((j) this.v.a()).f1286a);
        return "MicroDetectionState(state=" + arrayList.toString() + ", flags=" + this.f.b() + ")";
    }

    public final void v(boolean z) {
        if (this.O != z) {
            this.O = z;
            E();
            super.an();
        }
    }

    public final boolean w() {
        return this.H || G() || !this.M.isDone();
    }

    public final boolean x() {
        return BitFlags.f(this.f.b, 1L);
    }

    public final boolean y() {
        return !BitFlags.f(this.f.b, 16L) && this.J.b();
    }

    public final boolean z() {
        return !this.J.a();
    }
}
