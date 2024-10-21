package com.google.android.apps.gsa.shared.util.c.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/as.class */
public class as implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1519a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.c.a.as");
    private final Executor b;
    private final Object c = new Object();
    private int d = 0;
    private final Queue e = new ArrayDeque();

    public as(Executor executor) {
        this.b = executor;
    }

    public final void a() {
        synchronized (this.c) {
            Runnable runnable = (Runnable) this.e.poll();
            if (runnable == null) {
                this.d--;
                return;
            }
            try {
                this.b.execute(new ar(this, runnable));
            } catch (Throwable th) {
                aus.b(f1519a.e(), "Task submission failed: %s", runnable, (char) 9353, th);
                synchronized (this.c) {
                    this.d--;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.c) {
            int i = this.d;
            if (i >= 25) {
                this.e.add(runnable);
                return;
            }
            this.d = i + 1;
            try {
                this.b.execute(new ar(this, runnable));
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.d--;
                    throw th;
                }
            }
        }
    }
}
