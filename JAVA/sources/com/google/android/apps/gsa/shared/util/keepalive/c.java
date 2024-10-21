package com.google.android.apps.gsa.shared.util.keepalive;

import e.b.a.c.b.l;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/keepalive/c.class */
abstract class c extends com.google.android.apps.gsa.shared.ai.b implements e.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private volatile l f1562a;
    private final Object b = new Object();
    private boolean c = false;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l gU() {
        if (this.f1562a == null) {
            synchronized (this.b) {
                if (this.f1562a == null) {
                    this.f1562a = new l(this);
                }
            }
        }
        return this.f1562a;
    }

    public final Object jJ() {
        return gU().jJ();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            gU().jJ();
        }
        super.onCreate();
    }
}
