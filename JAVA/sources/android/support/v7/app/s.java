package android.support.v7.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:android/support/v7/app/s.class */
final class s implements Executor {
    final Executor b;
    Runnable c;
    private final Object d = new Object();

    /* renamed from: a */
    final Queue f34a = new ArrayDeque();

    public s(Executor executor) {
        this.b = executor;
    }

    protected final void a() {
        synchronized (this.d) {
            Runnable runnable = (Runnable) this.f34a.poll();
            this.c = runnable;
            if (runnable != null) {
                this.b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.d) {
            this.f34a.add(new r(this, runnable));
            if (this.c == null) {
                a();
            }
        }
    }
}
