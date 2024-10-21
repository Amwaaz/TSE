package androidx.lifecycle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/au.class */
final class au implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final Object f69a;
    private final int b;

    public au(Object obj, int i) {
        this.b = i;
        this.f69a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        if (this.b == 0) {
            az azVar = (az) this.f69a;
            if (azVar.c == 0) {
                azVar.d = true;
                azVar.f.e(u.ON_PAUSE);
            }
            ((az) this.f69a).c();
            return;
        }
        synchronized (((an) this.f69a).c) {
            obj = ((an) this.f69a).f;
            ((an) this.f69a).f = an.b;
        }
        ((an) this.f69a).l(obj);
    }
}
