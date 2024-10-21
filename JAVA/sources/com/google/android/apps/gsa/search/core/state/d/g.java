package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.dd;
import com.google.android.apps.gsa.search.shared.service.c.de;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/g.class */
public final class g extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.search.core.ae.k.a f1283a;

    public g(e.a aVar, com.google.android.apps.gsa.search.core.ae.k.a aVar2) {
        super(aVar, 9);
        this.f1283a = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.EXECUTE_MEDIA};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar.ordinal() != 52) {
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
        bg bgVar = bi.-$$Nest$smcheckIsLite(dd.a);
        adVar.d(bgVar);
        Object l = ((bd) adVar).br.l(bgVar.d);
        de deVar = (de) (l == null ? bgVar.b : bgVar.c(l));
        int i = deVar.c;
        if (i == 5) {
            this.f1283a.b(deVar.d);
            return;
        }
        if (i == 6) {
            this.f1283a.a();
        } else if (i == 7) {
            this.f1283a.g();
        } else {
            if (i != 8) {
                return;
            }
            this.f1283a.h();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("AudioMessageState");
    }
}
