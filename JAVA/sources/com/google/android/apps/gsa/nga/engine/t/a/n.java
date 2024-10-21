package com.google.android.apps.gsa.nga.engine.t.a;

import com.google.android.apps.gsa.nga.shared.n.j;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.ao;
import com.google.android.apps.gsa.nga.shared.q.c.ap;
import com.google.android.apps.gsa.shared.util.ai;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/t/a/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final d f678a = d.j();
    public final h b;
    public final com.google.android.apps.gsa.shared.util.q.a c;
    public final e.a d;
    public final e.a e;
    public final com.google.android.libraries.g.a f;
    public final boolean g;
    public final x o;
    public final j p;
    private final Set q = new HashSet();
    public final AtomicBoolean h = new AtomicBoolean(true);
    public final Object i = new Object();
    public final IdentityHashMap j = new IdentityHashMap();
    public final Set k = Collections.newSetFromMap(new IdentityHashMap());
    public SettableFuture l = null;
    public cn m = c.b;
    public ai n = ai.b();

    public n(h hVar, com.google.android.apps.gsa.shared.util.q.a aVar, j jVar, e.a aVar2, e.a aVar3, x xVar, com.google.android.libraries.g.a aVar4, boolean z) {
        this.b = hVar;
        this.c = aVar;
        this.p = jVar;
        this.d = aVar2;
        this.e = aVar3;
        this.o = xVar;
        this.f = aVar4;
        this.g = z;
    }

    public final cn a() {
        cn cnVar;
        synchronized (this.i) {
            cnVar = this.j.isEmpty() ? c.b : this.l;
        }
        return cnVar;
    }

    public final cn b(com.google.android.apps.gsa.nga.engine.g.a aVar, Supplier supplier) {
        aVar.l();
        ai aiVar = new ai(this.f);
        return i.g(com.google.common.util.concurrent.c.h(cf.i(((com.google.android.apps.gsa.nga.engine.t.h) supplier).a.U()), Throwable.class, new f(this, aVar, aiVar), ay.a), new g(this, aVar, aiVar), ay.a);
    }

    public final void c(boolean z, com.google.android.apps.gsa.nga.engine.g.a aVar, long j) {
        aVar.l();
        String l = aVar.l();
        if (l == null) {
            throw new NullPointerException("Null component");
        }
        this.o.b(new ap("NGA_COMPONENT_LIFECYCLE_STATUS", l, z));
        x xVar = this.o;
        String l2 = aVar.l();
        if (l2 == null) {
            throw new NullPointerException("Null componentName");
        }
        xVar.b(new ao("NGA_COMPONENT_LIFECYCLE_LATENCY", Double.valueOf(j), l2, this.q.add(aVar.l()), z));
    }

    public final boolean d() {
        boolean isEmpty;
        synchronized (this.i) {
            isEmpty = this.j.isEmpty();
        }
        return !isEmpty;
    }
}
