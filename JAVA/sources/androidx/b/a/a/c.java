package androidx.b.a.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:androidx/b/a/a/c.class */
final class c implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f38a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f38a.getAndIncrement());
        return thread;
    }
}
