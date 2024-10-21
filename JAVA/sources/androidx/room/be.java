package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import m.c.j;

/* loaded from: classes-dex2jar.jar:androidx/room/be.class */
public final class be implements m.c.k {

    /* renamed from: a */
    public static final bd f96a = new bd();
    public final m.c.i b;
    public final AtomicInteger c = new AtomicInteger(0);

    public be(m.c.i iVar) {
        this.b = iVar;
    }

    public final void a() {
        if (this.c.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    public final Object fold(Object obj, m.h.a.p pVar) {
        return j.a(this, obj, pVar);
    }

    public final m.c.k get(m.c.l lVar) {
        return j.b(this, lVar);
    }

    public final m.c.l getKey() {
        return f96a;
    }

    public final m.c.n minusKey(m.c.l lVar) {
        return j.c(this, lVar);
    }

    public final m.c.n plus(m.c.n nVar) {
        nVar.getClass();
        return j.d(this, nVar);
    }
}
