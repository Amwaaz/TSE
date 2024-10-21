package androidx.work.impl;

import androidx.work.impl.b.bb;
import androidx.work.impl.b.v;
import androidx.work.impl.b.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/WorkDatabase_Impl.class */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile androidx.work.impl.b.ad m;
    private volatile androidx.work.impl.b.a n;
    private volatile androidx.work.impl.b.ay o;
    private volatile androidx.work.impl.b.l p;
    private volatile androidx.work.impl.b.s q;
    private volatile v r;
    private volatile androidx.work.impl.b.e s;
    private volatile androidx.work.impl.b.h t;

    @Override // androidx.room.ao
    public final List A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aj());
        arrayList.add(new ak());
        arrayList.add(new al());
        arrayList.add(new am());
        arrayList.add(new an());
        arrayList.add(new ao());
        arrayList.add(new ap());
        arrayList.add(new aq());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.a D() {
        androidx.work.impl.b.a aVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new androidx.work.impl.b.c(this);
            }
            aVar = this.n;
        }
        return aVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.e E() {
        androidx.work.impl.b.e eVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new androidx.work.impl.b.g(this);
            }
            eVar = this.s;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.h F() {
        androidx.work.impl.b.h hVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new androidx.work.impl.b.j(this);
            }
            hVar = this.t;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.l G() {
        androidx.work.impl.b.l lVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new androidx.work.impl.b.p(this);
            }
            lVar = this.p;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.s H() {
        androidx.work.impl.b.s sVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new androidx.work.impl.b.u(this);
            }
            sVar = this.q;
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v I() {
        v vVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new z(this);
            }
            vVar = this.r;
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.ad J() {
        androidx.work.impl.b.ad adVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new androidx.work.impl.b.aw(this);
            }
            adVar = this.m;
        }
        return adVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.b.ay K() {
        androidx.work.impl.b.ay ayVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new bb(this);
            }
            ayVar = this.o;
        }
        return ayVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.ao
    public final androidx.u.a.g O(androidx.room.c cVar) {
        return cVar.c.a(androidx.u.a.d.a(cVar.f108a, cVar.b, new androidx.room.ay(cVar, new ar(this)), false, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.ao
    public final androidx.room.u a() {
        return new androidx.room.u(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.ao
    protected final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(androidx.work.impl.b.ad.class, Collections.emptyList());
        hashMap.put(androidx.work.impl.b.a.class, Collections.emptyList());
        hashMap.put(androidx.work.impl.b.ay.class, Collections.emptyList());
        hashMap.put(androidx.work.impl.b.l.class, Collections.emptyList());
        hashMap.put(androidx.work.impl.b.s.class, Collections.emptyList());
        hashMap.put(v.class, Collections.emptyList());
        hashMap.put(androidx.work.impl.b.e.class, Collections.emptyList());
        hashMap.put(androidx.work.impl.b.h.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.room.ao
    public final Set l() {
        return new HashSet();
    }
}
