package com.google.android.apps.gsa.search.shared.service.e;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.t;
import com.google.android.apps.gsa.shared.util.c.au;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/e/c.class */
public final class c extends au {

    /* renamed from: a, reason: collision with root package name */
    final t f1349a;
    final ClientEventData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, ClientEventData clientEventData) {
        super("Connect to SearchService and send generic client event");
        this.f1349a = tVar;
        this.b = clientEventData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1349a.c();
        this.f1349a.h(this.b);
    }
}
