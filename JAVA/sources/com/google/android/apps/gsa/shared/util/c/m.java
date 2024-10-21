package com.google.android.apps.gsa.shared.util.c;

import com.google.common.base.cl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/m.class */
public final class m extends n {
    private final Object c = new Object();
    private final Thread d;
    private boolean e;
    private boolean f;

    public m(Thread thread) {
        this.d = thread;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.n
    public final void a() {
        synchronized (this.c) {
            if (this.f) {
                cl.u(Thread.currentThread() == this.d);
                Thread.interrupted();
                this.f = false;
            }
            this.e = true;
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.c.n
    public final void b() {
        synchronized (this.c) {
            if (!this.e) {
                if (!this.d.isInterrupted()) {
                    this.d.interrupt();
                    this.f = true;
                }
                this.e = true;
            }
        }
    }
}
