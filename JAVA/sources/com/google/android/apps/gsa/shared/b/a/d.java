package com.google.android.apps.gsa.shared.b.a;

import android.content.IntentFilter;
import java.util.Iterator;
import kotlinx.coroutines.a.ac;
import kotlinx.coroutines.a.ae;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/d.class */
final class d extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f1373a;
    final u b;
    private Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u uVar, m.c.g gVar) {
        super(2, gVar);
        this.b = uVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((ae) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f1373a;
        m.k.b(obj);
        if (i == 0) {
            ae aeVar = (ae) this.c;
            u uVar = this.b;
            m mVar = new m(uVar, new b(aeVar, null));
            IntentFilter intentFilter = new IntentFilter();
            Iterator it = u.c.iterator();
            while (it.hasNext()) {
                intentFilter.addAction((String) it.next());
            }
            Iterator it2 = u.d.iterator();
            while (it2.hasNext()) {
                intentFilter.addAction((String) it2.next());
            }
            androidx.core.content.a.f(uVar.i, mVar, intentFilter, null, 2);
            c cVar = c.f1372a;
            this.f1373a = 1;
            if (ac.a(aeVar, cVar, this) == aVar) {
                return aVar;
            }
        }
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        d dVar = new d(this.b, gVar);
        dVar.c = obj;
        return dVar;
    }
}
