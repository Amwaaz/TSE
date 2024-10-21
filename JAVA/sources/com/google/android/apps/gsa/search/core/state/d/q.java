package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.core.state.ap;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.hn;
import com.google.android.apps.gsa.search.shared.service.c.ho;
import com.google.android.apps.gsa.search.shared.service.c.kj;
import com.google.android.apps.gsa.search.shared.service.c.kk;
import com.google.android.apps.gsa.search.shared.service.d.b;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/q.class */
public class q extends com.google.android.apps.gsa.search.core.state.ae implements ap {
    private static final com.google.common.f.j f = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.q");

    /* renamed from: a, reason: collision with root package name */
    public ClientConfig f1292a;
    public long b;
    public boolean c;
    public boolean d;
    public b e;
    private final e.a g;
    private final com.google.android.apps.gsa.search.core.ae.bk.a h;

    public q(e.a aVar, e.a aVar2, com.google.android.apps.gsa.search.core.ae.bk.a aVar3) {
        super(aVar, 21);
        this.f1292a = ClientConfig.f1327a;
        this.b = 0L;
        this.e = new b(0L, "none");
        this.g = aVar2;
        this.h = aVar3;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.WINDOW_FOCUS_CHANGED, com.google.android.apps.gsa.search.shared.service.c.ac.SET_HOTWORD_DETECTION_ENABLED};
    }

    public final void c(long j, ClientConfig clientConfig, boolean z) {
        ab abVar = e.a;
        if (clientConfig == this.f1292a && j == this.b) {
            if (z != this.d) {
                this.d = z;
                an();
                return;
            }
            return;
        }
        this.f1292a = clientConfig;
        this.d = z;
        this.b = j;
        if (((ai) this.g.a()).n() && BitFlags.f(this.f1292a.b.b, 274877906944L)) {
            this.h.c();
        }
        if (this.c) {
            this.c = false;
            this.h.a(this.e.f1345a);
        }
        an();
    }

    public final void f(b bVar) {
        ab abVar = e.a;
        b bVar2 = this.e;
        if (bVar2.f1345a != bVar.f1345a) {
            this.e = bVar;
            if (this.c) {
                com.google.common.f.h f2 = f.f();
                f2.aj(e.a, "GlobActiveClientState");
                com.google.common.f.h hVar = f2;
                hVar.ak(7959);
                hVar.p("Changing sessions while client is focused.");
                this.h.g(this.e.f1345a);
            }
            an();
            return;
        }
        if (bVar2.b.equals(bVar.b)) {
            return;
        }
        com.google.common.f.h f3 = f.f();
        f3.aj(e.a, "GlobActiveClientState");
        com.google.common.f.h hVar2 = f3;
        hVar2.ak(7958);
        hVar2.H("Changing session type from [%s] to [%s] with the same id", this.e.b, bVar.b);
        this.e = bVar;
        an();
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 32) {
                com.google.common.f.h f2 = f.f();
                f2.aj(e.a, "GlobActiveClientState");
                com.google.common.f.h hVar = f2;
                hVar.ak(7953);
                com.google.android.apps.gsa.search.shared.service.c.ac a3 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
                com.google.android.apps.gsa.search.shared.service.c.ac acVar2 = a3;
                if (a3 == null) {
                    acVar2 = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
                }
                hVar.s("Received unhandled client event %s", acVar2);
                return;
            }
            com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
            bg bgVar = bi.-$$Nest$smcheckIsLite(hn.a);
            adVar.d(bgVar);
            Object l = ((bd) adVar).br.l(bgVar.d);
            boolean z = ((ho) (l == null ? bgVar.b : bgVar.c(l))).c;
            if (z != this.d) {
                this.d = z;
                an();
                return;
            }
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
        bg bgVar2 = bi.-$$Nest$smcheckIsLite(kj.a);
        adVar2.d(bgVar2);
        Object l2 = ((bd) adVar2).br.l(bgVar2.d);
        kk kkVar = (kk) (l2 == null ? bgVar2.b : bgVar2.c(l2));
        if (kkVar == null) {
            com.google.common.f.h f3 = f.f();
            f3.aj(e.a, "GlobActiveClientState");
            com.google.common.f.h hVar2 = f3;
            hVar2.ak(7954);
            hVar2.p("handleGenericClientEvent: received null windowFocusChangedEventData");
            return;
        }
        boolean z2 = kkVar.c;
        if (this.c != z2) {
            if (j != this.b) {
                com.google.common.f.h f4 = f.f();
                f4.aj(e.a, "GlobActiveClientState");
                com.google.common.f.h hVar3 = f4;
                hVar3.ak(7955);
                hVar3.r("Received window focus change for inactive client %d.", j);
                int i = com.google.android.apps.gsa.shared.util.b.h.a;
            }
            this.c = z2;
            if (this.b == 0 || !z2) {
                this.h.a(this.e.f1345a);
            } else {
                this.h.g(this.e.f1345a);
            }
            an();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ActiveClientState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currentClientId", Long.valueOf(this.b));
        linkedHashMap.put("clientConfig", this.f1292a);
        linkedHashMap.put("hotwordDetectionEnabled", Boolean.valueOf(this.d));
        linkedHashMap.put("hasFocusedClient", Boolean.valueOf(this.c));
        linkedHashMap.put("currentSession", this.e);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
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
}
