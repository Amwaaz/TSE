package com.google.android.apps.gsa.shared.util.c.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/aw.class */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1521a;

    public aw(Object obj) {
        this.f1521a = obj;
    }

    public aw(k.a.a aVar) {
        this.f1521a = aVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final com.google.android.libraries.gsa.h.h a(Class cls) {
        return new p(cls, new au(this.f1521a, 0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
    public final q b(q qVar) {
        return this.f1521a.b() ? new ad(qVar, (com.google.android.apps.gsa.shared.o.a.a) this.f1521a) : qVar;
    }
}
