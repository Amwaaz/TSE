package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/bb.class */
final class bb extends be {

    /* renamed from: a, reason: collision with root package name */
    final Runnable f1524a;
    final ca b;

    public bb(Runnable runnable, ca caVar) {
        this.f1524a = runnable;
        this.b = caVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.be
    public final String a() {
        return (String) this.b.a();
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.be
    public final void b() {
        this.f1524a.run();
    }
}
