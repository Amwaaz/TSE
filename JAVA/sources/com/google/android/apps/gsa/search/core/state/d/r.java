package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.core.service.an;
import com.google.android.apps.gsa.search.core.service.ao;
import com.google.android.apps.gsa.search.core.state.cp;
import com.google.common.b.hn;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/r.class */
public final class r extends cp {
    private final e.a g;

    public r(com.google.android.libraries.g.a aVar, com.google.android.apps.gsa.search.core.h.p pVar, hn hnVar, e.a aVar2, e.a aVar3, com.google.android.apps.gsa.shared.o.a.a aVar4, com.google.android.apps.gsa.shared.o.b.a.a aVar5) {
        super(pVar, hnVar, aVar2, com.google.android.apps.gsa.search.core.state.ae.z, com.google.android.apps.gsa.search.core.state.ae.z, aVar4, aVar5, "GlobalEventBus");
        this.g = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cp
    public final void o(int i) {
        super.o(i);
        if (this.e.isEmpty()) {
            ((ao) this.g.a()).a();
            ao aoVar = (ao) this.g.a();
            com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
            boolean r = ((ai) aoVar.d.a()).r(1);
            ab abVar = e.a;
            if (r) {
                int i2 = aoVar.f;
                an anVar = new an(aoVar, i2, 0);
                an anVar2 = new an(aoVar, i2, 1);
                com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) aoVar.e.a();
                ao.b.longValue();
                hVar.p("SearchService shutdownLikely", Duration.ofMillis(5000L), anVar2);
                com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) aoVar.e.a();
                ao.b.longValue();
                hVar2.p("SearchService stop", Duration.ofMillis(10000L), anVar);
            }
        }
    }
}
