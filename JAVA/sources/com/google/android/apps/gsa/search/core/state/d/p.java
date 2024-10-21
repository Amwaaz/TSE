package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.bk;
import com.google.common.f.a.e;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/p.class */
public class p extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1291a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.p");
    public final com.google.android.apps.gsa.search.core.ae.ac.a b;
    public final Map c;
    private final com.google.android.libraries.gsa.h.h d;

    public p(com.google.android.apps.gsa.search.core.ae.ac.a aVar, com.google.android.libraries.gsa.h.h hVar, e.a aVar2) {
        super(aVar2, 7);
        this.c = new HashMap();
        this.b = aVar;
        this.d = hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.GCM_MESSAGE_RECEIVED};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.common.f.j jVar = f1291a;
        com.google.common.f.h d = jVar.d();
        d.aj(e.a, "NotificationFullFlow");
        d.ak(7947);
        d.p("Step 2: GcsmState:handleClientEvent");
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(adVar.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar != com.google.android.apps.gsa.search.shared.service.c.ac.GCM_MESSAGE_RECEIVED) {
            com.google.common.f.h e = jVar.e();
            e.ak(7949);
            com.google.android.apps.gsa.search.shared.service.c.ac a3 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
            com.google.android.apps.gsa.search.shared.service.c.ac acVar2 = a3;
            if (a3 == null) {
                acVar2 = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
            }
            e.s("Unrecognized client event received: %s", acVar2);
            return;
        }
        bg bgVar = bi.-$$Nest$smcheckIsLite(bk.b);
        adVar.d(bgVar);
        if (!((bd) adVar).br.o(bgVar.d)) {
            com.google.common.f.h e2 = jVar.e();
            e2.ak(7948);
            e2.p("Client event missing extension");
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
        bg bgVar2 = bi.-$$Nest$smcheckIsLite(bk.b);
        adVar2.d(bgVar2);
        Object l = ((bd) adVar2).br.l(bgVar2.d);
        com.google.android.apps.gsa.shared.util.c.ac a4 = new com.google.android.apps.gsa.shared.util.c.ae(this.b.a((bk) (l == null ? bgVar2.b : bgVar2.c(l))), this.d, "GcmState.eventProcessed").a(new o(this, j, 1));
        a4.b(IllegalStateException.class, new o(this, j, 0));
        a4.b(NullPointerException.class, new o(this, j, 2));
        a4.a(new o(this, j, 3));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("GcmState");
    }
}
