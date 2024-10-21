package com.google.android.apps.gsa.shared.util.c.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/ar.class */
public final class ar implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final as f1518a;
    private final Runnable b;

    public ar(as asVar, Runnable runnable) {
        this.f1518a = asVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.f1518a.a();
        }
    }
}
