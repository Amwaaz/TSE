package com.google.android.apps.gsa.shared.util.c.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.util.concurrent.cn;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/ai.class */
public class ai extends FutureTask implements cn {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1511a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.c.a.ai");
    private final Object b;
    private final com.google.common.util.concurrent.bc c;

    public ai(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.c = new com.google.common.util.concurrent.bc();
        this.b = runnable;
    }

    public ai(Callable callable) {
        super(callable);
        this.c = new com.google.common.util.concurrent.bc();
        this.b = callable;
    }

    public final void b(Runnable runnable, Executor executor) {
        this.c.a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.c.b();
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        if ((th instanceof RuntimeException) || (th instanceof Error)) {
            String obj = this.b.toString();
            aus.b(f1511a.e(), "Unchecked exception running task: %s", obj, (char) 9348, th);
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, new RuntimeException("Unchecked exception running task: ".concat(String.valueOf(obj)), th));
            }
        }
        super.setException(th);
    }

    @Override // java.util.concurrent.FutureTask
    public final String toString() {
        return "TaskRunnerFutureTask[" + String.valueOf(this.b) + "]";
    }
}
