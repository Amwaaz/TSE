package com.google.android.apps.gsa.staticplugins.nga.k;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/k/t.class */
public final class t implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final u f1690a;

    public t(u uVar) {
        this.f1690a = uVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1690a.b.n("[NGA] process messages after connection", new r(this, iBinder, 2));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1690a.b.n("[NGA] NgaInteractorConnection::onServiceDisconnected", new w(this, 1));
    }
}
