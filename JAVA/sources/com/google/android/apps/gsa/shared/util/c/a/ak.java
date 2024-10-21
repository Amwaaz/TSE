package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.apps.gsa.shared.util.c.bp;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/ak.class */
final class ak implements bp {

    /* renamed from: a, reason: collision with root package name */
    final Runnable f1512a;
    final al b;

    public ak(al alVar, Runnable runnable) {
        this.f1512a = runnable;
        this.b = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1512a.run();
    }

    public final String toString() {
        return this.b.f1513a.toString();
    }
}
