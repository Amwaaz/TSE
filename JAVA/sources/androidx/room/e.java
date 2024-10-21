package androidx.room;

import androidx.room.c.j;
import androidx.u.b;

/* loaded from: classes-dex2jar.jar:androidx/room/e.class */
public abstract class e {
    public abstract String a();

    public abstract void b(b bVar, Object obj);

    public final int c(androidx.room.c.c cVar, Iterable iterable) {
        cVar.getClass();
        int i = 0;
        if (iterable == null) {
            return 0;
        }
        j a2 = cVar.a(a());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    b(a2, obj);
                    a2.n();
                    a2.l();
                    i += androidx.room.g.u.k(cVar);
                }
            }
            a2.k();
            return i;
        } catch (Throwable th) {
            a2.k();
            throw th;
        }
    }

    public final void d(androidx.room.c.c cVar, Object obj) {
        cVar.getClass();
        if (obj == null) {
            return;
        }
        j a2 = cVar.a(a());
        try {
            b(a2, obj);
            a2.n();
            a2.k();
            androidx.room.g.u.k(cVar);
        } catch (Throwable th) {
            a2.k();
            throw th;
        }
    }
}
