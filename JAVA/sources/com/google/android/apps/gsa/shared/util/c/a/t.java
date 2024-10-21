package com.google.android.apps.gsa.shared.util.c.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/t.class */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1537a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ t(Object obj, Object obj2, Runnable runnable, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.f1537a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.base.ca, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            d dVar = (d) this.b;
            ap apVar = dVar.f1528a;
            ah ahVar = (ah) this.c;
            apVar.c(ahVar);
            try {
                this.f1537a.run();
                return;
            } finally {
                dVar.f1528a.b(ahVar);
            }
        }
        Thread currentThread = Thread.currentThread();
        ?? r0 = this.c;
        w wVar = (w) this.b;
        wVar.d = new v(wVar, currentThread, r0);
        try {
            this.f1537a.run();
        } finally {
            wVar.d();
        }
    }
}
