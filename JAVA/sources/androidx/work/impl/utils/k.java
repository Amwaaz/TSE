package androidx.work.impl.utils;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/k.class */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final l f222a;
    final Runnable b;

    public k(l lVar, Runnable runnable) {
        this.f222a = lVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
            synchronized (this.f222a.b) {
                this.f222a.a();
            }
        } catch (Throwable th) {
            synchronized (this.f222a.b) {
                this.f222a.a();
                throw th;
            }
        }
    }
}
