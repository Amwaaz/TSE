package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import com.google.common.util.concurrent.db;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/au.class */
public final class au implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1520a;
    private final int b;
    private final Object c;

    public au(q qVar, ExecutorService executorService, int i) {
        this.b = i;
        this.f1520a = qVar;
        this.c = executorService;
    }

    public au(e.a aVar, m mVar, int i) {
        this.b = i;
        this.c = aVar;
        this.f1520a = mVar;
    }

    public au(ScheduledExecutorService scheduledExecutorService, int i) {
        this.b = i;
        this.c = scheduledExecutorService;
        this.f1520a = new db(scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(Runnable runnable) {
        try {
            runnable.run();
        } catch (Error | RuntimeException e) {
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, e);
            }
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.apps.gsa.shared.util.c.a.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.apps.gsa.shared.util.c.a.q, java.lang.Object] */
    @Override // com.google.android.apps.gsa.shared.util.c.a.m
    public final void a(ca caVar, Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            this.f1520a.execute(runnable);
        } else if (i != 1) {
            this.f1520a.a(caVar, runnable);
        } else {
            this.f1520a.a(caVar, new y(runnable, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.apps.gsa.shared.util.c.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // com.google.android.apps.gsa.shared.util.c.a.q
    public final void b(ca caVar, Runnable runnable, long j) {
        int i = this.b;
        if (i == 0) {
            this.c.schedule(new at(this, runnable, 0), j, TimeUnit.MILLISECONDS);
        } else if (i != 1) {
            ((q) this.c.a()).b(new av(caVar), new ac(this, caVar, runnable, 2), j);
        } else {
            this.f1520a.b(caVar, new y(runnable, 0), j);
        }
    }
}
