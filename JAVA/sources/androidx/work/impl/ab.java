package androidx.work.impl;

import android.util.Log;
import kotlinx.coroutines.dc;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/ab.class */
final class ab extends m.c.b.a.h implements m.h.a.r {

    /* renamed from: a, reason: collision with root package name */
    int f177a;
    Object b;
    long c;

    public ab(m.c.g gVar) {
        super(4, gVar);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        ab abVar = new ab((m.c.g) obj4);
        abVar.b = (Throwable) obj2;
        abVar.c = longValue;
        return abVar.b(w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f177a;
        m.k.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            androidx.work.af.a();
            Log.e(ad.f179a, "Cannot check for unfinished work", (Throwable) obj2);
            long min = Math.min(j * 30000, ad.b);
            this.f177a = 1;
            if (dc.s(min, this) == aVar) {
                return aVar;
            }
        }
        return true;
    }
}
