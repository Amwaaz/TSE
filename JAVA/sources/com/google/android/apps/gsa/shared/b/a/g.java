package com.google.android.apps.gsa.shared.b.a;

import kotlinx.coroutines.ag;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.ct;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/g.class */
final class g extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f1376a;
    final u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, m.c.g gVar) {
        super(2, gVar);
        this.b = uVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((ag) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f1376a;
        m.k.b(obj);
        if (i == 0) {
            ct b = this.b.b();
            f fVar = new f(null);
            this.f1376a = 1;
            if (cp.h(b, fVar, this) == aVar) {
                return aVar;
            }
        }
        this.b.d();
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        return new g(this.b, gVar);
    }
}
