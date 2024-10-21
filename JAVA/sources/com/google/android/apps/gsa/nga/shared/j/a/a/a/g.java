package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import m.h.a.q;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/g.class */
final class g extends m.c.b.a.h implements q {

    /* renamed from: a, reason: collision with root package name */
    int f921a;
    final h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, m.c.g gVar) {
        super(3, gVar);
        this.b = hVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new g(this.b, (m.c.g) obj3).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f921a;
        m.k.b(obj);
        if (i == 0) {
            h hVar = this.b;
            this.f921a = 1;
            if (hVar.c(null, this) == aVar) {
                return aVar;
            }
        }
        return m.w.a;
    }
}
