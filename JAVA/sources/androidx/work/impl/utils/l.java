package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/l.class */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f223a = new ArrayDeque();
    public final Object b = new Object();
    private final Executor c;
    private Runnable d;

    public l(Executor executor) {
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Runnable runnable = (Runnable) this.f223a.poll();
        this.d = runnable;
        if (runnable != null) {
            this.c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.f223a.add(new k(this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }
}
