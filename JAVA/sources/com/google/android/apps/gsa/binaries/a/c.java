package com.google.android.apps.gsa.binaries.a;

import com.google.android.apps.gsa.shared.o.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/a/c.class */
public abstract class c extends com.google.apps.tiktok.i.b.b implements a {
    private final Object aaU = new Object();
    private volatile b aaV;

    @Override // com.google.android.apps.gsa.shared.o.a
    public final void a() {
        b();
    }

    public final void b() {
        if (this.aaV == null) {
            synchronized (this.aaU) {
                if (this.aaV == null) {
                    this.aaV = new b();
                }
            }
        }
    }

    @Override // com.google.apps.tiktok.i.b.b, android.app.Application
    public void onCreate() {
        if (i()) {
            super.onCreate();
        } else {
            super.onCreate();
        }
    }
}
