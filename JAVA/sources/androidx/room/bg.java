package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/room/bg.class */
public final class bg implements Executor {

    /* renamed from: a */
    private final Executor f97a;
    private final ArrayDeque b;
    private Runnable c;
    private final Object d;

    public bg(Executor executor) {
        executor.getClass();
        this.f97a = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        synchronized (this.d) {
            Object poll = this.b.poll();
            Runnable runnable = (Runnable) poll;
            this.c = runnable;
            if (poll != null) {
                this.f97a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.b.offer(new bf(runnable, this));
            if (this.c == null) {
                a();
            }
        }
    }
}
