package com.google.android.apps.gsa.shared.b.a;

import kotlinx.coroutines.a.ae;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/b.class */
final class b extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a */
    int f1371a;
    Object b;
    final ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ae aeVar, m.c.g gVar) {
        super(2, gVar);
        this.c = aeVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((String) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f1371a;
        m.k.b(obj);
        if (i == 0) {
            String str = (String) this.b;
            ae aeVar = this.c;
            this.f1371a = 1;
            if (aeVar.a(str, this) == aVar) {
                return aVar;
            }
        }
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        b bVar = new b(this.c, gVar);
        bVar.b = obj;
        return bVar;
    }
}
