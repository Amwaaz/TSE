package androidx.lifecycle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/bw.class */
public final class bw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final ag f73a;
    private final u b;
    private boolean c;

    public bw(ag agVar, u uVar) {
        uVar.getClass();
        this.f73a = agVar;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.f73a.e(this.b);
        this.c = true;
    }
}
