package com.google.android.apps.gsa.nga.engine.ae;

import com.google.g.e.h.a.az;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/ad.class */
public final class ad {

    /* renamed from: a */
    private final ab f403a;

    public ad(ab abVar) {
        this.f403a = abVar;
    }

    public final /* synthetic */ az a() {
        return e() ? az.c : az.b;
    }

    public final boolean b() {
        return !this.f403a.b.isDeviceLocked();
    }

    public final /* synthetic */ boolean c() {
        return !e();
    }

    public final boolean d() {
        return this.f403a.f402a.isInteractive();
    }

    public final boolean e() {
        return this.f403a.f402a.isInteractive() && !this.f403a.b.isKeyguardLocked();
    }
}
