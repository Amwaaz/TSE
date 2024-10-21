package androidx.room;

import androidx.u.a.j;

@m.a
/* loaded from: classes-dex2jar.jar:androidx/room/h.class */
public abstract class h extends bc {
    public h(ao aoVar) {
        super(aoVar);
    }

    protected abstract void a(j jVar, Object obj);

    public final void b(Object obj) {
        j c = c();
        try {
            a(c, obj);
            c.g();
        } finally {
            f(c);
        }
    }
}
