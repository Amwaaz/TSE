package com.google.android.apps.gsa.shared.util.c;

import com.google.common.f.h;
import java.util.concurrent.Future;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/am.class */
final class am extends aq {

    /* renamed from: a, reason: collision with root package name */
    final Future f1548a;
    final long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(Future future, long j) {
        super("Guard future timeout", 1, 0);
        this.f1548a = future;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1548a.cancel(true)) {
            h f = ao.f1550a.f();
            f.aj(com.google.common.f.a.e.a, "NamedFutures");
            h hVar = f;
            hVar.ak(9332);
            hVar.r("Timeout future task has been cancelled: %d milliseconds", this.b);
        }
    }
}
