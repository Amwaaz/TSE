package com.google.android.apps.gsa.publicsearch;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.smartspace.c.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/publicsearch/PublicSearchService.class */
public final class PublicSearchService extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1033a = com.google.common.f.j.i("com.google.android.apps.gsa.publicsearch.PublicSearchService");
    public k b;
    public e.a c;
    public com.google.android.apps.search.lens.e.j d;
    public e e;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new c(this);
    }

    @Override // com.google.android.apps.gsa.publicsearch.a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new k(getApplicationContext());
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
