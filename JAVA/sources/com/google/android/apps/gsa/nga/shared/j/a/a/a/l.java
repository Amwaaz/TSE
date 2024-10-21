package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import m.h.a.q;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/l.class */
final class l extends m.c.b.a.h implements q {

    /* renamed from: a, reason: collision with root package name */
    Object f925a;
    final com.google.android.libraries.g.a b;
    final com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar, com.google.android.libraries.g.a aVar, m.c.g gVar) {
        super(3, gVar);
        this.c = cVar;
        this.b = aVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        l lVar = new l(this.c, this.b, (m.c.g) obj3);
        lVar.f925a = (n) obj2;
        return lVar.b(m.w.a);
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        Object obj2 = this.f925a;
        return new m((n) obj2, new n(this.c.p(), aq.b(this.b)));
    }
}
