package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import m.h.a.p;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/at.class */
final class at extends m.c.b.a.h implements p {

    /* renamed from: a, reason: collision with root package name */
    int f906a;
    Object b;
    final kotlinx.coroutines.a.ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(kotlinx.coroutines.a.ae aeVar, m.c.g gVar) {
        super(2, gVar);
        this.c = aeVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((n) obj, (m.c.g) obj2).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f906a;
        m.k.b(obj);
        if (i == 0) {
            n nVar = (n) this.b;
            kotlinx.coroutines.a.ae aeVar = this.c;
            this.f906a = 1;
            if (aeVar.a(nVar, this) == aVar) {
                return aVar;
            }
        }
        return m.w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        at atVar = new at(this.c, gVar);
        atVar.b = obj;
        return atVar;
    }
}
