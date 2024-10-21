package com.google.android.apps.gsa.nga.shared.j.a.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/f.class */
final class f extends m.h.b.n implements m.h.a.l {
    private final int d;
    public static final f c = new f(2);
    public static final f b = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public static final f f920a = new f(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i) {
        super(1);
        this.d = i;
    }

    public final /* synthetic */ Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            Throwable th = (Throwable) obj;
            th.getClass();
            com.google.common.f.h f = i.f923a.f();
            f.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
            com.google.common.f.h g = f.g(th);
            g.ak(5155);
            g.p("Failure while starting task to notify Bisto.");
            return m.w.a;
        }
        if (i != 1) {
            n nVar = (n) obj;
            nVar.getClass();
            return Boolean.valueOf(nVar.f927a);
        }
        Throwable th2 = (Throwable) obj;
        th2.getClass();
        com.google.common.f.h e = i.f923a.e();
        e.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
        com.google.common.f.h g2 = e.g(th2);
        g2.ak(5152);
        g2.p("Task to notify Bisto has failed.");
        return m.w.a;
    }
}
