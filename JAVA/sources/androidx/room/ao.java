package androidx.room;

import android.content.Intent;
import androidx.room.c.j;
import androidx.u.a.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.dc;
import m.a.an;
import m.h.b.m;

/* loaded from: classes-dex2jar.jar:androidx/room/ao.class */
public abstract class ao {

    /* renamed from: a, reason: collision with root package name */
    public volatile b f91a;
    public kotlinx.coroutines.ag b;
    public m.c.n c;
    public Executor d;
    public Executor e;
    public u f;
    public boolean h;
    public androidx.room.f.b i;
    public a l;
    public final androidx.room.a.a g = new androidx.room.a.a(new am(this, 0));
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = new LinkedHashMap();

    @m.a
    public List A() {
        return m.a.y.a;
    }

    public final Object B(m.h.a.p pVar, m.c.g gVar) {
        a aVar = this.l;
        a aVar2 = aVar;
        if (aVar == null) {
            m.b("connectionManager");
            aVar2 = null;
        }
        return pVar.a((androidx.room.c.f) aVar2.e.b.b(), gVar);
    }

    public final void C(androidx.room.c.c cVar) {
        p pVar;
        ae aeVar;
        u N = N();
        by byVar = N.c;
        j a2 = cVar.a("PRAGMA query_only");
        try {
            a2.n();
            if (!a2.p()) {
                androidx.u.a.b(cVar, "PRAGMA temp_store = MEMORY");
                androidx.u.a.b(cVar, "PRAGMA recursive_triggers = 1");
                androidx.u.a.b(cVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                ab abVar = byVar.b;
                ReentrantLock reentrantLock = abVar.f83a;
                reentrantLock.lock();
                try {
                    abVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (N.k) {
                if (N.j == null && (pVar = N.i) != null) {
                    y yVar = new y(pVar.f133a, pVar.b, N);
                    Intent intent = pVar.c;
                    if (yVar.e.compareAndSet(true, false)) {
                        yVar.c.bindService(intent, yVar.j, 1);
                        u uVar = yVar.b;
                        w wVar = yVar.h;
                        wVar.getClass();
                        m.h f = uVar.c.f(wVar.f134a);
                        String[] strArr = (String[]) f.a;
                        int[] iArr = (int[]) f.b;
                        ae aeVar2 = new ae(wVar, iArr, strArr);
                        ReentrantLock reentrantLock2 = uVar.e;
                        reentrantLock2.lock();
                        try {
                            if (uVar.d.containsKey(wVar)) {
                                Map map = uVar.d;
                                map.getClass();
                                aeVar = (ae) an.ap(map, wVar);
                            } else {
                                aeVar = (ae) uVar.d.put(wVar, aeVar2);
                            }
                            reentrantLock2.unlock();
                            if (aeVar == null) {
                                by byVar2 = uVar.c;
                                iArr.getClass();
                                byVar2.b.a(iArr);
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    N.j = yVar;
                }
            }
        } finally {
            a2.k();
        }
    }

    public final u N() {
        u uVar = this.f;
        u uVar2 = uVar;
        if (uVar == null) {
            m.b("internalTracker");
            uVar2 = null;
        }
        return uVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m.a
    public androidx.u.a.g O(c cVar) {
        throw new m.g("An operation is not implemented.");
    }

    public final androidx.u.a.g P() {
        a aVar = this.l;
        a aVar2 = aVar;
        if (aVar == null) {
            m.b("connectionManager");
            aVar2 = null;
        }
        androidx.u.a.g a2 = aVar2.a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object Q(m.m.b bVar) {
        Object obj = this.k.get(bVar);
        obj.getClass();
        return obj;
    }

    public final Object R(Callable callable) {
        r();
        try {
            Object call = callable.call();
            w();
            return call;
        } finally {
            s();
        }
    }

    public List S(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(an.ar(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(m.h.a.a((m.m.b) entry.getKey()), entry.getValue());
        }
        return A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map T() {
        Set<Map.Entry> entrySet = j().entrySet();
        int ar = an.ar(m.a.t.aX(entrySet, 10));
        int i = ar;
        if (ar < 16) {
            i = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            int i2 = m.h.b.ab.a;
            m.h.b.f fVar = new m.h.b.f(cls);
            ArrayList arrayList = new ArrayList(m.a.t.aX(list, 10));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(new m.h.b.f(cls2));
            }
            m.h hVar = new m.h(fVar, arrayList);
            linkedHashMap.put(hVar.a, hVar.b);
        }
        return linkedHashMap;
    }

    public Set U() {
        Set<Class> l = l();
        ArrayList arrayList = new ArrayList(m.a.t.aX(l, 10));
        for (Class cls : l) {
            cls.getClass();
            int i = m.h.b.ab.a;
            arrayList.add(new m.h.b.f(cls));
        }
        return m.a.t.W(arrayList);
    }

    public final Executor V() {
        Executor executor = this.e;
        Executor executor2 = executor;
        if (executor == null) {
            m.b("internalTransactionExecutor");
            executor2 = null;
        }
        return executor2;
    }

    public final m.c.n W() {
        kotlinx.coroutines.d.e eVar = this.b;
        kotlinx.coroutines.d.e eVar2 = eVar;
        if (eVar == null) {
            m.b("coroutineScope");
            eVar2 = null;
        }
        return eVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract u a();

    /* JADX INFO: Access modifiers changed from: protected */
    public av c() {
        throw new m.g("An operation is not implemented.");
    }

    protected Map j() {
        return m.a.z.a;
    }

    @m.a
    public Set l() {
        return m.a.aa.a;
    }

    public final kotlinx.coroutines.ag o() {
        kotlinx.coroutines.ag agVar = this.b;
        kotlinx.coroutines.ag agVar2 = agVar;
        if (agVar == null) {
            m.b("coroutineScope");
            agVar2 = null;
        }
        return agVar2;
    }

    public final void p() {
        if (!this.h && h.a.a.p.b.a.f.r()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void q() {
        if (!y() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @m.a
    public final void r() {
        p();
        androidx.room.f.b bVar = this.i;
        if (bVar == null) {
            t();
        } else {
            bVar.b(new an(this, 1));
        }
    }

    @m.a
    public final void s() {
        androidx.room.f.b bVar = this.i;
        if (bVar == null) {
            u();
        } else {
            bVar.b(new an(this, 0));
        }
    }

    public final void t() {
        p();
        b b = P().b();
        if (!b.l()) {
            dc.Q(m.c.o.a, new t(N(), null));
        }
        if (b.n()) {
            b.g();
        } else {
            b.f();
        }
    }

    public final void u() {
        P().b().i();
        if (y()) {
            return;
        }
        u N = N();
        N.c.g(N.g, N.h);
    }

    public final void v(Runnable runnable) {
        r();
        try {
            runnable.run();
            w();
        } finally {
            s();
        }
    }

    @m.a
    public final void w() {
        P().b().k();
    }

    public final boolean x() {
        a aVar = this.l;
        a aVar2 = aVar;
        if (aVar == null) {
            m.b("connectionManager");
            aVar2 = null;
        }
        return aVar2.a() != null;
    }

    public final boolean y() {
        return P().b().l();
    }

    public final boolean z() {
        a aVar = this.l;
        a aVar2 = aVar;
        if (aVar == null) {
            m.b("connectionManager");
            aVar2 = null;
        }
        b bVar = aVar2.d;
        if (bVar != null) {
            return bVar.m();
        }
        return false;
    }
}
