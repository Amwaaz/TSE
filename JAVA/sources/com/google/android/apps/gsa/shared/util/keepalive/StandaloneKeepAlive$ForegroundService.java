package com.google.android.apps.gsa.shared.util.keepalive;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.d.e;
import com.google.common.base.cl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/keepalive/StandaloneKeepAlive$ForegroundService.class */
public final class StandaloneKeepAlive$ForegroundService extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f1559a;
    public d b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.apps.gsa.shared.util.keepalive.b, android.app.Service
    public final void onCreate() {
        e.h(38);
        super.onCreate();
        cl.u(this.b instanceof d);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d dVar = this.b;
        synchronized (dVar.f1563a) {
            if (dVar.c == this) {
                dVar.c = null;
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        d dVar = this.b;
        synchronized (dVar.f1563a) {
            dVar.b = false;
            dVar.c = this;
            dVar.d = i2;
            dVar.d(this);
        }
        return 2;
    }
}
