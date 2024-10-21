package com.google.android.apps.gsa.shared.util.keepalive;

import com.google.android.apps.gsa.binaries.velvet.app.os;
import e.b.a.c.b.l;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/keepalive/b.class */
abstract class b extends com.google.android.apps.gsa.shared.ai.b implements e.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private volatile l f1561a;
    private final Object b = new Object();
    private boolean c = false;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l gU() {
        if (this.f1561a == null) {
            synchronized (this.b) {
                if (this.f1561a == null) {
                    this.f1561a = new l(this);
                }
            }
        }
        return this.f1561a;
    }

    public final Object jJ() {
        return gU().jJ();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ((StandaloneKeepAlive$ForegroundService) this).b = (d) ((os) gU().jJ()).b.f319a.gf.a();
        }
        super.onCreate();
    }
}
