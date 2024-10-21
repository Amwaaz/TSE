package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.kf;
import com.google.android.apps.gsa.search.shared.service.c.kg;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/u.class */
public class u extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1294a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.u");
    public final BitFlags b;
    public final com.google.android.apps.gsa.search.core.ae.ae.a c;
    public cn d;
    private final com.google.android.libraries.gsa.h.h e;

    public u(e.a aVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.search.core.ae.ae.a aVar2) {
        super(aVar, 22);
        this.b = new BitFlags(getClass(), "FLAG_", 0L);
        this.e = hVar;
        this.c = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.VOICE_SEARCH_HANDS_FREE};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar.ordinal() != 56) {
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
        bg bgVar = bi.-$$Nest$smcheckIsLite(kf.a);
        adVar.d(bgVar);
        if (!((bd) adVar).br.o(bgVar.d)) {
            com.google.common.f.h e = f1294a.e();
            e.ak(7961);
            e.p("handleVSHFEvent(): No event data");
            return;
        }
        com.google.android.apps.gsa.search.core.ae.ae.a aVar = this.c;
        com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
        bg bgVar2 = bi.-$$Nest$smcheckIsLite(kf.a);
        adVar2.d(bgVar2);
        Object l = ((bd) adVar2).br.l(bgVar2.d);
        cn a3 = aVar.a((kg) (l == null ? bgVar2.b : bgVar2.c(l)));
        this.d = a3;
        new com.google.android.apps.gsa.shared.util.c.ae(a3, this.e, "handle voice search hands free").b(new z(this, 1)).a(new b(this, 2));
        an();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("HandsFreeState");
        fVar.b("Flags").a(new com.google.android.apps.gsa.shared.util.b.d(this.b.b(), false));
    }

    public final String toString() {
        return String.format("HandsFreeState: flags: %s", this.b.b());
    }
}
