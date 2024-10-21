package androidx.room;

import androidx.room.c.j;
import androidx.u.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:androidx/room/g.class */
public abstract class g {
    public abstract String a();

    public abstract void b(b bVar, Object obj);

    public final long c(androidx.room.c.c cVar, Object obj) {
        cVar.getClass();
        if (obj == null) {
            return -1L;
        }
        j a2 = cVar.a(a());
        try {
            b(a2, obj);
            a2.n();
            a2.k();
            return androidx.room.g.u.l(cVar);
        } catch (Throwable th) {
            a2.k();
            throw th;
        }
    }

    public final List d(androidx.room.c.c cVar, Collection collection) {
        cVar.getClass();
        if (collection == null) {
            return m.a.y.a;
        }
        m.a.a.e eVar = new m.a.a.e(10);
        j a2 = cVar.a(a());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    b(a2, obj);
                    a2.n();
                    a2.l();
                    eVar.add(Long.valueOf(androidx.room.g.u.l(cVar)));
                } else {
                    eVar.add(-1L);
                }
            }
            a2.k();
            return m.a.t.aK(eVar);
        } catch (Throwable th) {
            a2.k();
            throw th;
        }
    }

    public final void e(androidx.room.c.c cVar, Iterable iterable) {
        cVar.getClass();
        if (iterable == null) {
            return;
        }
        j a2 = cVar.a(a());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    b(a2, obj);
                    a2.n();
                    a2.l();
                }
            }
        } finally {
            a2.k();
        }
    }

    public final void f(androidx.room.c.c cVar, Object obj) {
        cVar.getClass();
        if (obj == null) {
            return;
        }
        j a2 = cVar.a(a());
        try {
            b(a2, obj);
            a2.n();
        } finally {
            a2.k();
        }
    }

    public final void g(androidx.room.c.c cVar, Object[] objArr) {
        cVar.getClass();
        j a2 = cVar.a(a());
        try {
            Iterator a3 = m.h.b.h.a(objArr);
            while (a3.hasNext()) {
                Object next = a3.next();
                if (next != null) {
                    b(a2, next);
                    a2.n();
                    a2.l();
                }
            }
        } finally {
            a2.k();
        }
    }
}
