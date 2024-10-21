package androidx.room.f;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.dc;
import m.h.a.l;

/* loaded from: classes-dex2jar.jar:androidx/room/f/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public androidx.u.a.g f120a;
    public ag b;
    public m.h.a.a c;
    public final long e;
    public androidx.u.a.b h;
    private boolean i;
    private bo j;
    public final Object d = new Object();
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicLong g = new AtomicLong(SystemClock.uptimeMillis());

    public b(long j, TimeUnit timeUnit) {
        this.e = timeUnit.toMillis(j);
    }

    public final androidx.u.a.b a() {
        bo boVar = this.j;
        androidx.u.a.g gVar = null;
        if (boVar != null) {
            boVar.m((CancellationException) null);
        }
        this.j = null;
        this.f.incrementAndGet();
        if (this.i) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.d) {
            androidx.u.a.b bVar = this.h;
            if (bVar != null && bVar.m()) {
                return bVar;
            }
            androidx.u.a.g gVar2 = this.f120a;
            if (gVar2 == null) {
                m.h.b.m.b("delegateOpenHelper");
            } else {
                gVar = gVar2;
            }
            androidx.u.a.b b = gVar.b();
            this.h = b;
            return b;
        }
    }

    public final Object b(l lVar) {
        try {
            return lVar.a(a());
        } finally {
            d();
        }
    }

    public final void c() {
        synchronized (this.d) {
            this.i = true;
            bo boVar = this.j;
            if (boVar != null) {
                boVar.m((CancellationException) null);
            }
            this.j = null;
            androidx.u.a.b bVar = this.h;
            if (bVar != null) {
                bVar.close();
            }
            this.h = null;
        }
    }

    public final void d() {
        int decrementAndGet = this.f.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.g.set(SystemClock.uptimeMillis());
        if (decrementAndGet == 0) {
            ag agVar = this.b;
            ag agVar2 = agVar;
            if (agVar == null) {
                m.h.b.m.b("coroutineScope");
                agVar2 = null;
            }
            this.j = dc.P(agVar2, (m.c.n) null, 0, new a(this, null), 3);
        }
    }
}
