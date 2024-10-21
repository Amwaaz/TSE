package androidx.e.a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/e/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    Object f61a;
    f b;
    public k c = new k();
    private boolean d;

    private final void e() {
        this.f61a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        k kVar = this.c;
        if (kVar != null) {
            kVar.b(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        boolean z = true;
        this.d = true;
        f fVar = this.b;
        if (fVar == null || !fVar.b.f(obj)) {
            z = false;
        }
        if (z) {
            e();
        }
        return z;
    }

    public final boolean c() {
        boolean z = true;
        this.d = true;
        f fVar = this.b;
        if (fVar == null || !fVar.b.cancel(true)) {
            z = false;
        }
        if (z) {
            e();
        }
        return z;
    }

    public final boolean d(Throwable th) {
        boolean z = true;
        this.d = true;
        f fVar = this.b;
        if (fVar == null || !fVar.b.g(th)) {
            z = false;
        }
        if (z) {
            e();
        }
        return z;
    }

    protected final void finalize() {
        k kVar;
        f fVar = this.b;
        if (fVar != null && !fVar.b.isDone()) {
            Object obj = this.f61a;
            Objects.toString(obj);
            fVar.b.g(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (kVar = this.c) == null) {
            return;
        }
        kVar.f(null);
    }
}
