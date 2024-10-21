package com.google.android.apps.gsa.nga.shared.j.a.a.b;

import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/b/o.class */
final class o extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f946a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m.c.g gVar, int i) {
        super(2, gVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m.c.g gVar, int i, byte[] bArr) {
        super(2, gVar);
        this.b = i;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.b != 0) {
            return c((Throwable) obj, (m.c.g) obj2).b(w.a);
        }
        return c((Throwable) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        if (this.b != 0) {
            m.k.b(obj);
            Throwable th = (Throwable) this.f946a;
            com.google.common.f.h f = i.f941a.f();
            f.aj(com.google.common.f.a.e.a, "TRG.HotwordConsumer");
            com.google.common.f.h g = f.g(th);
            g.ak(5177);
            g.p("Retrying legacy external hotword consumer flow after failure.");
            return w.a;
        }
        m.k.b(obj);
        Throwable th2 = (Throwable) this.f946a;
        com.google.common.f.h f2 = q.f948a.f();
        f2.aj(com.google.common.f.a.e.a, "TRG.HotwordConsumer");
        com.google.common.f.h g2 = f2.g(th2);
        g2.ak(5178);
        g2.p("Retrying legacy on-device hotword consumer flow after failure.");
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        if (this.b != 0) {
            o oVar = new o(gVar, 1, null);
            oVar.f946a = obj;
            return oVar;
        }
        o oVar2 = new o(gVar, 0);
        oVar2.f946a = obj;
        return oVar2;
    }
}
