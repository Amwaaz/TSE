package com.google.android.apps.gsa.shared.util.c.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.f.a.e;
import java.lang.Thread;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/be.class */
abstract class be implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1526a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.c.a.be");

    public abstract String a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Error | RuntimeException e) {
            String format = String.format("Unchecked exception happened while running task: %s", a());
            com.google.common.f.y e2 = f1526a.e();
            e2.aj(e.a, "ExceptionReporter");
            aus.b(e2, "%s", format, (char) 9354, e);
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            e.addSuppressed(new bd(format));
            if (uncaughtExceptionHandler == null) {
                throw e;
            }
            uncaughtExceptionHandler.uncaughtException(currentThread, e);
        }
    }
}
