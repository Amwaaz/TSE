package androidx.u.a.a;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/h.class */
final class h extends RuntimeException {

    /* renamed from: a */
    public final Throwable f149a;
    public final int b;

    public h(int i, Throwable th) {
        super(th);
        this.b = i;
        this.f149a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f149a;
    }
}
