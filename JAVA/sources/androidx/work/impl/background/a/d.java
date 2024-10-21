package androidx.work.impl.background.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.af;
import androidx.work.aq;
import androidx.work.as;
import androidx.work.au;
import androidx.work.g;
import androidx.work.impl.a.j;
import androidx.work.impl.a.o;
import androidx.work.impl.at;
import androidx.work.impl.b.ac;
import androidx.work.impl.b.bc;
import androidx.work.impl.bj;
import androidx.work.impl.p;
import androidx.work.impl.r;
import androidx.work.impl.utils.i;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.impl.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.bo;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/a/d.class */
public final class d implements r, j, androidx.work.impl.c {
    private static final String b = af.b("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    Boolean f202a;
    private final Context c;
    private final b e;
    private boolean f;
    private final p i;
    private final androidx.work.c j;
    private final o l;
    private final f m;
    private final at n;
    private final androidx.work.impl.utils.b.b o;
    private final Map d = new HashMap();
    private final Object g = new Object();
    private final x h = w.a(true);
    private final Map k = new HashMap();

    public d(Context context, androidx.work.c cVar, androidx.work.impl.a.b.p pVar, p pVar2, at atVar, androidx.work.impl.utils.b.b bVar) {
        this.c = context;
        aq aqVar = cVar.e;
        this.e = new b(this, aqVar);
        this.m = new f(aqVar, atVar);
        this.o = bVar;
        this.l = new o(pVar);
        this.j = cVar;
        this.i = pVar2;
        this.n = atVar;
    }

    private final void f() {
        this.f202a = Boolean.valueOf(i.a(this.c, this.j));
    }

    private final void g() {
        if (this.f) {
            return;
        }
        this.i.c(this);
        this.f = true;
    }

    @Override // androidx.work.impl.c
    public final void a(androidx.work.impl.b.r rVar, boolean z) {
        bo boVar;
        v a2 = this.h.a(rVar);
        if (a2 != null) {
            this.m.a(a2);
        }
        synchronized (this.g) {
            boVar = (bo) this.d.remove(rVar);
        }
        if (boVar != null) {
            af a3 = af.a();
            String str = b;
            Objects.toString(rVar);
            a3.c(str, "Stopping tracking for ".concat(rVar.toString()));
            boVar.m((CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.g) {
            this.k.remove(rVar);
        }
    }

    @Override // androidx.work.impl.r
    public final void b(String str) {
        Runnable runnable;
        if (this.f202a == null) {
            f();
        }
        if (!this.f202a.booleanValue()) {
            af.a();
            Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        af.a().c(b, "Cancelling work ID ".concat(String.valueOf(str)));
        b bVar = this.e;
        if (bVar != null && (runnable = (Runnable) bVar.d.remove(str)) != null) {
            bVar.c.a(runnable);
        }
        for (v vVar : this.h.d(str)) {
            this.m.a(vVar);
            bj.b(this.n, vVar);
        }
    }

    @Override // androidx.work.impl.r
    public final void c(ac... acVarArr) {
        long j;
        long max;
        if (this.f202a == null) {
            f();
        }
        if (!this.f202a.booleanValue()) {
            af.a();
            Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<ac> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ac acVar : acVarArr) {
            if (!this.h.e(bc.m(acVar))) {
                synchronized (this.g) {
                    androidx.work.impl.b.r m = bc.m(acVar);
                    c cVar = (c) this.k.get(m);
                    c cVar2 = cVar;
                    if (cVar == null) {
                        int i = acVar.l;
                        au auVar = this.j.k;
                        cVar2 = new c(i, System.currentTimeMillis());
                        this.k.put(m, cVar2);
                    }
                    j = cVar2.b;
                    max = Math.max((acVar.l - cVar2.f201a) - 5, 0);
                }
                long max2 = Math.max(acVar.a(), j + (max * 30000));
                au auVar2 = this.j.k;
                long currentTimeMillis = System.currentTimeMillis();
                if (acVar.c == as.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        b bVar = this.e;
                        if (bVar != null) {
                            Runnable runnable = (Runnable) bVar.d.remove(acVar.b);
                            if (runnable != null) {
                                bVar.c.a(runnable);
                            }
                            a aVar = new a(bVar, acVar);
                            bVar.d.put(acVar.b, aVar);
                            bVar.c.b(max2 - System.currentTimeMillis(), aVar);
                        }
                    } else if (acVar.d()) {
                        g gVar = acVar.k;
                        if (gVar.d) {
                            af.a().c(b, a.a.dI(acVar, "Ignoring ", ". Requires device idle."));
                        } else if (gVar.a()) {
                            af.a().c(b, a.a.dI(acVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(acVar);
                            hashSet2.add(acVar.b);
                        }
                    } else if (!this.h.e(bc.m(acVar))) {
                        af.a().c(b, "Starting work for ".concat(acVar.b));
                        v c = this.h.c(acVar);
                        this.m.b(c);
                        at atVar = this.n;
                        c.getClass();
                        atVar.a(c, null);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                af.a().c(b, a.a.dU(TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (ac acVar2 : hashSet) {
                    androidx.work.impl.b.r m2 = bc.m(acVar2);
                    if (!this.d.containsKey(m2)) {
                        this.d.put(m2, androidx.work.impl.a.r.a(this.l, acVar2, this.o.b, this));
                    }
                }
            }
        }
    }

    @Override // androidx.work.impl.r
    public final boolean d() {
        return false;
    }

    @Override // androidx.work.impl.a.j
    public final void e(ac acVar, androidx.work.impl.a.c cVar) {
        boolean z = cVar instanceof androidx.work.impl.a.a;
        androidx.work.impl.b.r m = bc.m(acVar);
        if (!z) {
            af a2 = af.a();
            String str = b;
            Objects.toString(m);
            a2.c(str, "Constraints not met: Cancelling work ID ".concat(m.toString()));
            v a3 = this.h.a(m);
            if (a3 != null) {
                this.m.a(a3);
                this.n.b(a3, ((androidx.work.impl.a.b) cVar).a);
                return;
            }
            return;
        }
        if (this.h.e(m)) {
            return;
        }
        af a4 = af.a();
        String str2 = b;
        Objects.toString(m);
        a4.c(str2, "Constraints met: Scheduling work ID ".concat(m.toString()));
        v b2 = this.h.b(m);
        this.m.b(b2);
        at atVar = this.n;
        b2.getClass();
        atVar.a(b2, null);
    }
}
