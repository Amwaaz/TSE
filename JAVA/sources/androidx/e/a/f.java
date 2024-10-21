package androidx.e.a;

import androidx.e.a.a;
import com.google.common.util.concurrent.cn;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:androidx/e/a/f.class */
public final class f implements cn {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f62a;
    public final a b = new e(this);

    public f(b bVar) {
        this.f62a = new WeakReference(bVar);
    }

    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        b bVar = (b) this.f62a.get();
        boolean cancel = this.b.cancel(z);
        boolean z2 = cancel;
        if (cancel) {
            z2 = cancel;
            if (bVar != null) {
                bVar.f61a = null;
                bVar.b = null;
                bVar.c.f(null);
                z2 = true;
            }
        }
        return z2;
    }

    public final Object get() {
        return this.b.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.b.value instanceof a.b;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }
}
