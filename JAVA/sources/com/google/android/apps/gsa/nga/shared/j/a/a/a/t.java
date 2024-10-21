package com.google.android.apps.gsa.nga.shared.j.a.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/t.class */
final class t extends m.c.b.a.h implements m.h.a.l {

    /* renamed from: a, reason: collision with root package name */
    final w f929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, m.c.g gVar) {
        super(1, gVar);
        this.f929a = wVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new t(this.f929a, (m.c.g) obj).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        return new Integer(this.f929a.f931a.incrementAndGet());
    }
}
