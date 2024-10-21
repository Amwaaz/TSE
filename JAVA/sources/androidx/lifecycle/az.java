package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/az.class */
public final class az implements ae {

    /* renamed from: a, reason: collision with root package name */
    public static final az f72a = new az();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final ag f = new ag(this);
    public final Runnable g = new au(this, 0);
    final av h = new av(this);

    private az() {
    }

    final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.e(u.ON_RESUME);
                this.d = false;
            }
        }
    }

    final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.f.e(u.ON_START);
            this.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(u.ON_STOP);
            this.i = true;
        }
    }

    @Override // androidx.lifecycle.ae
    public final w getLifecycle() {
        return this.f;
    }
}
