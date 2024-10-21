package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/bx.class */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    public final ag f74a;
    private final Handler b = new Handler();
    private bw c;

    public bx(ae aeVar) {
        this.f74a = new ag(aeVar);
    }

    public final void a(u uVar) {
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.run();
        }
        bw bwVar2 = new bw(this.f74a, uVar);
        this.c = bwVar2;
        this.b.postAtFrontOfQueue(bwVar2);
    }
}
