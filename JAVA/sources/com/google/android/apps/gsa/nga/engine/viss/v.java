package com.google.android.apps.gsa.nga.engine.viss;

import android.os.IBinder;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/viss/v.class */
public final class v {

    /* renamed from: a */
    private IBinder f818a;

    public final void a(IBinder iBinder) {
        synchronized (this) {
            this.f818a = iBinder;
        }
    }

    public final void b() {
        synchronized (this) {
            this.f818a = null;
        }
    }

    public final boolean c() {
        synchronized (this) {
            IBinder iBinder = this.f818a;
            if (iBinder == null) {
                return false;
            }
            return iBinder.isBinderAlive();
        }
    }
}
