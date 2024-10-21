package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.base.ca;
import com.google.common.base.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/c.class */
public final class c extends AbstractExecutorService implements cq, com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final ap f1527a;
    private final ExecutorService b;

    public c(ExecutorService executorService, ap apVar) {
        this.b = executorService;
        this.f1527a = apVar;
    }

    private static ca e(Object obj) {
        return obj instanceof com.google.android.apps.gsa.shared.util.c.k ? ((com.google.android.apps.gsa.shared.util.c.k) obj).gl() : new cf(obj.toString());
    }

    public final cn a(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    public final cn b(Callable callable) {
        return super.submit(callable);
    }

    public final cn c(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (!(runnable instanceof b)) {
            runnable2 = newTaskFor(runnable, null);
        }
        this.b.execute(runnable2);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        this.f1527a.hq(fVar);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new b(this, new ai(runnable, obj), this.f1527a.a(e(runnable), 0L));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new b(this, new ai(callable), this.f1527a.a(e(callable), 0L));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return super.submit(callable);
    }
}
