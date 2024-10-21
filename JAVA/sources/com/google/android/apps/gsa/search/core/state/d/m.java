package com.google.android.apps.gsa.search.core.state.d;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.common.base.cl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/m.class */
public final class m extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.search.core.ae.v.a f1289a;

    public m(e.a aVar, com.google.android.apps.gsa.search.core.ae.v.a aVar2) {
        super(aVar, 14);
        this.f1289a = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar == com.google.android.apps.gsa.search.shared.service.c.ac.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT) {
            cl.v(clientEventData.d(Intent.class), "BROWSABLE_INTENT_LAUNCHED_IN_CLIENT should have an intent parcelable.");
            Intent intent = (Intent) clientEventData.b(Intent.class);
            if (intent != null) {
                this.f1289a.b(intent);
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
    }
}
