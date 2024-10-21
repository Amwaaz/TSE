package com.google.android.apps.gsa.shared.util.c;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/an.class */
final class an extends al {

    /* renamed from: a, reason: collision with root package name */
    final SettableFuture f1549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(SettableFuture settableFuture) {
        super("Future timeout callback", 1, 0);
        this.f1549a = settableFuture;
    }

    public final void gJ(Throwable th) {
        this.f1549a.o(th);
    }

    public final void gK(Object obj) {
        this.f1549a.n(obj);
    }
}
