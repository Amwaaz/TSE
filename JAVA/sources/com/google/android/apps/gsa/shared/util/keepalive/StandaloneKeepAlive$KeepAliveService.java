package com.google.android.apps.gsa.shared.util.keepalive;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.d.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/keepalive/StandaloneKeepAlive$KeepAliveService.class */
public final class StandaloneKeepAlive$KeepAliveService extends c {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.apps.gsa.shared.util.keepalive.c, android.app.Service
    public final void onCreate() {
        e.h(39);
        super.onCreate();
    }
}
