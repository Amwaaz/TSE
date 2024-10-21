package com.google.android.apps.gsa.search.core.state.d;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.state.ap;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.ha;
import com.google.android.apps.gsa.search.shared.service.c.hb;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.base.at;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/ai.class */
public class ai extends com.google.android.apps.gsa.search.core.state.ae implements ap {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1279a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.ai");
    public final e.a b;
    public final e.a c;
    public final com.google.android.apps.gsa.shared.util.keepalive.a d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final BitFlags i;
    public volatile boolean j;
    public volatile boolean k;
    public Intent l;
    public final Set m;
    public at n;
    public int o;
    private final e.a p;
    private final e.a q;
    private final e.a r;
    private final com.google.android.apps.gsa.search.core.ac.t s;
    private boolean t;

    public ai(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4, e.a aVar5, e.a aVar6, com.google.android.apps.gsa.search.core.ac.t tVar, com.google.android.apps.gsa.shared.util.keepalive.a aVar7) {
        super(aVar, 16);
        this.e = false;
        this.o = 1;
        this.i = new BitFlags(getClass(), "FLAG_START_", 0L);
        this.n = com.google.common.base.a.a;
        this.p = aVar2;
        this.b = aVar3;
        this.q = aVar4;
        this.c = aVar5;
        this.r = aVar6;
        this.s = tVar;
        this.d = aVar7;
        boolean isDeviceLocked = tVar.b.isDeviceLocked();
        ab abVar = e.a;
        this.g = isDeviceLocked;
        this.t = tVar.d();
        this.f = this.g;
        this.m = new HashSet();
    }

    private final Map s() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.o;
        if (i == 0) {
            throw null;
        }
        linkedHashMap.put("mTakenStartedState", Integer.valueOf(i - 1));
        linkedHashMap.put("mLastReportedIsScreenOn", Boolean.valueOf(this.t));
        linkedHashMap.put("mLastReportedIsLocked", Boolean.valueOf(this.f));
        Intent intent = this.l;
        Object obj = intent;
        if (intent == null) {
            obj = "NULL";
        }
        linkedHashMap.put("mPendingServiceIntent", obj);
        linkedHashMap.put("mDeviceLocked", Boolean.valueOf(this.g));
        linkedHashMap.put("Flags", this.i.b());
        return linkedHashMap;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.REFRESH_SERVICE_STATE, com.google.android.apps.gsa.search.shared.service.c.ac.COMMON_BROADCAST_MESSAGE_RECEIVED, com.google.android.apps.gsa.search.shared.service.c.ac.SCREEN_STATE_CHANGE};
    }

    public final Intent c(String str) {
        Intent intent = this.l;
        if (intent == null || !str.equals(intent.getAction())) {
            return null;
        }
        Intent intent2 = this.l;
        this.l = null;
        this.i.c(64L, 0L);
        return intent2;
    }

    public final void f(boolean z) {
        if (this.g != z) {
            this.g = z;
            an();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal == 54) {
            l();
            return;
        }
        if (ordinal != 119) {
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
        bg bgVar = bi.-$$Nest$smcheckIsLite(ha.a);
        adVar.d(bgVar);
        Object l = ((bd) adVar).br.l(bgVar.d);
        i(((hb) (l == null ? bgVar.b : bgVar.c(l))).b);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ServiceState");
        for (Map.Entry entry : s().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.b((String) entry.getKey()).a(new com.google.android.apps.gsa.shared.util.b.d((Boolean) value, false));
            } else if (value instanceof Number) {
                fVar.b((String) entry.getKey()).a(new com.google.android.apps.gsa.shared.util.b.d((Number) value, false));
            } else {
                fVar.b((String) entry.getKey()).a(com.google.android.apps.gsa.shared.util.b.e.c(String.valueOf(value)));
            }
        }
    }

    public final void i(boolean z) {
        if (this.t != z) {
            this.t = z;
            l();
        }
    }

    public final void k(boolean z) {
        if (this.i.h(16L, z) || z) {
            if (z) {
                this.e = true;
            }
            an();
        }
    }

    public final void l() {
        if (m()) {
            an();
        }
    }

    public final boolean m() {
        cn cnVar;
        cn cnVar2;
        boolean h = this.i.h(256L, ((ae) this.b.a()).w());
        ag agVar = (ag) this.c.a();
        cn cnVar3 = agVar.e;
        boolean h2 = this.i.h(128L, ((cnVar3 == null || cnVar3.isDone()) && ((cnVar = agVar.d) == null || cnVar.isDone()) && ((cnVar2 = agVar.f) == null || cnVar2.isDone())) ? false : true);
        boolean h3 = this.i.h(512L, ((d) this.r.a()).e);
        BitFlags bitFlags = this.i;
        cn cnVar4 = ((u) this.p.a()).d;
        boolean z = false;
        if (cnVar4 != null) {
            z = false;
            if (!cnVar4.isDone()) {
                z = true;
            }
        }
        return h | h2 | h3 | bitFlags.h(8192L, z);
    }

    public final boolean n() {
        return !this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return BitFlags.f(this.i.b, 1L);
    }

    public final boolean p() {
        return (this.k || q() != 2 || this.o == 2) ? false : true;
    }

    public final int q() {
        if (this.i.e(56L) || o() || this.d.c.size() != 0 || this.j) {
            return 2;
        }
        boolean z = false;
        for (Integer num : ((af) this.q.a()).f1276a.values()) {
            if (num != null && (num.intValue() == 1 || num.intValue() == 2)) {
                z = true;
            }
        }
        return (z || this.i.e(13248L)) ? 2 : 1;
    }

    public final boolean r(int i) {
        if (this.k) {
            this.e = false;
            return false;
        }
        boolean z = q() == i && this.o != i;
        if (z) {
            this.o = i;
            this.e = false;
        }
        return z;
    }

    public final String toString() {
        return "ServiceState(state=" + s().toString() + ")";
    }
}
