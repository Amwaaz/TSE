package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.f.b;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.dc;

/* loaded from: classes-dex2jar.jar:androidx/room/u.class */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ao f137a;
    public final String[] b;
    public final by c;
    public final Map d;
    public final ReentrantLock e;
    public b f;
    public final m.h.a.a g;
    public final m.h.a.a h;
    public p i;
    public y j;
    public final Object k;
    private final Map l;
    private final Map m;

    public u(ao aoVar, Map map, Map map2, String... strArr) {
        this.f137a = aoVar;
        this.l = map;
        this.m = map2;
        this.b = strArr;
        by byVar = new by(aoVar, map, map2, strArr, new r(this));
        this.c = byVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.g = new s(this, 2);
        this.h = new s(this, 0);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.k = new Object();
        byVar.d = new s(this, 1);
    }

    public final Object a(m.c.g gVar) {
        Object e;
        return ((!this.f137a.x() || this.f137a.z()) && (e = this.c.e(gVar)) == m.c.a.a.a) ? e : m.w.a;
    }

    public final void b() {
        this.c.g(this.g, this.h);
    }

    public final void c() {
        y yVar = this.j;
        if (yVar != null && yVar.e.compareAndSet(false, true)) {
            u uVar = yVar.b;
            w wVar = yVar.h;
            wVar.getClass();
            ReentrantLock reentrantLock = uVar.e;
            reentrantLock.lock();
            try {
                ae aeVar = (ae) uVar.d.remove(wVar);
                if (aeVar != null && uVar.c.b.b(aeVar.b)) {
                    dc.Q(m.c.o.a, new bl(uVar, (m.c.g) null, 1));
                }
                try {
                    o oVar = yVar.g;
                    if (oVar != null) {
                        oVar.c(yVar.i, yVar.f);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                yVar.c.unbindService(yVar.j);
            } finally {
                reentrantLock.unlock();
            }
        }
        this.j = null;
    }
}
