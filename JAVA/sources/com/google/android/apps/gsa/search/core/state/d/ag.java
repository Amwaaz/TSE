package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.core.h.s;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/ag.class */
public final class ag extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f1277a;
    public final com.google.android.apps.gsa.search.core.ae.ao.a b;
    public final com.google.android.apps.gsa.search.core.ae.aq.f c;
    public cn d;
    public cn e;
    public cn f;
    private final com.google.android.apps.gsa.search.core.h.p g;
    private final com.google.android.apps.gsa.search.core.ae.bk.a h;
    private final s i;
    private int j;

    public ag(e.a aVar, e.a aVar2, com.google.android.apps.gsa.search.core.h.p pVar, s sVar, com.google.android.apps.gsa.search.core.ae.ao.a aVar3, com.google.android.apps.gsa.search.core.ae.aq.f fVar, com.google.android.apps.gsa.search.core.ae.bk.a aVar4) {
        super(aVar, 18);
        this.j = 0;
        this.f1277a = aVar2;
        this.g = pVar;
        this.i = sVar;
        this.b = aVar3;
        this.c = fVar;
        this.h = aVar4;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS};
    }

    public final void c(ai aiVar) {
        int i = 1;
        if (!aiVar.o()) {
            int i2 = this.i.f1127a.d().getInt("hands_free_hotword_retraining_notification_state", 1) != 2 ? 0 : 2;
            int i3 = i2;
            if (this.i.f1127a.d().getInt("opa_upgrade_promo_notification_state", 1) == 2) {
                i3 = i2 | 32;
            }
            i = this.i.f1127a.d().getInt("assistant_language_reconfiguring_notification_state", 1) == 2 ? i3 | 128 : i3;
        }
        if (i != this.j) {
            this.j = i;
            if (aiVar.k) {
                return;
            }
            this.h.m(this.j);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        c((ai) this.f1277a.a());
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"hands_free_hotword_retraining_notification_state", "opa_upgrade_promo_notification_state", "assistant_language_reconfiguring_notification_state"};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar.ordinal() == 87 && this.g.w(az.dN)) {
            this.b.p();
            an();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("NotificationState");
        fVar.b("mNotificationFlags").a(e.c(Long.toHexString(this.j)));
    }
}
