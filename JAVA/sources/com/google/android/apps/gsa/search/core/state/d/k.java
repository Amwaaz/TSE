package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/k.class */
public final class k extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public int f1287a;
    private final com.google.android.apps.gsa.search.core.ae.r.a b;

    public k(e.a aVar, com.google.android.apps.gsa.search.core.ae.r.a aVar2) {
        super(aVar, 2);
        this.b = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.UPDATE_GSA_CONFIGS, com.google.android.apps.gsa.search.shared.service.c.ac.FETCH_CONFIGS_FROM_PHENOTYPE, com.google.android.apps.gsa.search.shared.service.c.ac.PROPERTIES_UPDATE_IN_PHENOTYPE};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal == 67) {
            this.b.c(j);
        } else if (ordinal == 68) {
            this.b.a(j);
        } else {
            if (ordinal != 78) {
                return;
            }
            this.b.b(j);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ConfigurationState");
    }
}
