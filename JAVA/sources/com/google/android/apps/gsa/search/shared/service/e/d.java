package com.google.android.apps.gsa.search.shared.service.e;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.t;
import com.google.android.apps.gsa.shared.util.c.as;
import com.google.common.f.h;
import com.google.common.util.concurrent.SettableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/e/d.class */
public final class d extends as {

    /* renamed from: a, reason: collision with root package name */
    final ClientEventData f1350a;
    final t b;
    final SettableFuture c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ClientEventData clientEventData, t tVar, SettableFuture settableFuture) {
        super("Disconnect from SearchService");
        this.f1350a = clientEventData;
        this.b = tVar;
        this.c = settableFuture;
    }

    public final void gJ(Throwable th) {
        h g = e.f1351a.e().g(th);
        g.ak(8373);
        ac a2 = ac.a(this.f1350a.f1328a.c);
        ac acVar = a2;
        if (a2 == null) {
            acVar = ac.UNKNOWN;
        }
        g.G("Task %s failed or timed out. Client %d disconnecting from SearchService!", acVar, this.b.f);
        this.c.cancel(true);
        this.b.e();
    }

    public final void gK(Object obj) {
        this.b.e();
    }
}
