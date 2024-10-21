package com.google.android.apps.gsa.shared.b.a;

import m.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/f.class */
public final class f extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f1375a;

    public f(m.c.g gVar) {
        super(2, gVar);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((String) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        return Boolean.valueOf(u.c.contains((String) this.f1375a));
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        f fVar = new f(gVar);
        fVar.f1375a = obj;
        return fVar;
    }
}
