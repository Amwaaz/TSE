package com.google.android.apps.gsa.nga.engine.t.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/t/a/b.class */
public final class b {

    /* renamed from: a */
    public final Object f677a = new Object();
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;

    public final boolean a() {
        boolean z;
        synchronized (this.f677a) {
            z = false;
            if (this.b) {
                z = false;
                if (this.c) {
                    z = false;
                    if (!this.d) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
