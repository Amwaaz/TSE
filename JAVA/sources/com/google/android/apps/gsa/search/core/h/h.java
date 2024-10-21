package com.google.android.apps.gsa.search.core.h;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.common.f.ab;
import com.google.common.o.or;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/h.class */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1122a = TimeUnit.MINUTES.toMillis(2);
    private final s b;
    private final com.google.android.apps.gsa.search.shared.service.e.e c;

    public h(s sVar, com.google.android.apps.gsa.search.shared.service.e.e eVar) {
        this.b = sVar;
        this.c = eVar;
        ab abVar = com.google.common.f.a.e.a;
    }

    public final cn a() {
        if (this.b.f1127a.d().getBoolean("remove_experiment_overrides", false)) {
            ab abVar = com.google.common.f.a.e.a;
            return com.google.android.apps.gsa.v.c.b;
        }
        ab abVar2 = com.google.common.f.a.e.a;
        ClientEventData d = new ae(ac.UPDATE_GSA_CONFIGS).d();
        com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
        dVar.c = or.E;
        dVar.d = "forwarding";
        return this.c.b(new ClientConfig(dVar), d, f1122a);
    }
}
