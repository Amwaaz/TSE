package com.google.android.apps.gsa.nga.shared.j.a.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ar.class */
final class ar extends m.h.b.n implements m.h.a.l {
    private final int e;
    public static final ar d = new ar(3);
    public static final ar c = new ar(2);
    public static final ar b = new ar(1);

    /* renamed from: a, reason: collision with root package name */
    public static final ar f904a = new ar(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(int i) {
        super(1);
        this.e = i;
    }

    public final /* synthetic */ Object a(Object obj) {
        int i = this.e;
        if (i == 0) {
            o oVar = (o) obj;
            oVar.getClass();
            return oVar.f928a;
        }
        if (i != 1) {
            if (i != 2) {
                o oVar2 = (o) obj;
                oVar2.getClass();
                return oVar2.b.b;
            }
            o oVar3 = (o) obj;
            oVar3.getClass();
            return oVar3.b.f926a;
        }
        Throwable th = (Throwable) obj;
        th.getClass();
        com.google.common.f.h e = y.f932a.e();
        e.aj(com.google.common.f.a.e.a, "TRG.HotwordServiceHelper");
        com.google.common.f.h g = e.g(th);
        g.ak(5166);
        g.p("Task to notify Bisto has failed.");
        return m.w.a;
    }
}
