package com.google.android.apps.gsa.nga.engine.ak.c.a;

import com.google.android.apps.gsa.nga.engine.ae.q;
import com.google.android.apps.gsa.nga.engine.ak.c.s;
import com.google.android.apps.gsa.nga.engine.ak.c.u;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.co;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/c/a/j.class */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final d f419a = d.j();
    public final q b;
    public final x c;
    public final ca d;
    public final ca e;
    public final x f;
    private final a g;

    public j(final ap apVar, q qVar, final h hVar, final com.google.android.apps.gsa.nga.engine.ak.c.n nVar, x xVar, x xVar2, a aVar) {
        this.b = qVar;
        this.f = xVar;
        this.c = xVar2;
        this.g = aVar;
        final int i = 1;
        this.d = cl.d(new ca(apVar, nVar, i) { // from class: com.google.android.apps.gsa.nga.engine.ak.c.a.i

            /* renamed from: a, reason: collision with root package name */
            public final Object f418a;
            public final Object b;
            private final int c;

            {
                this.c = i;
                this.f418a = apVar;
                this.b = nVar;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.android.libraries.gsa.h.h] */
            public final Object a() {
                if (this.c != 0) {
                    return new co(new h((ap) this.f418a, (com.google.android.apps.gsa.nga.engine.ak.c.n) this.b));
                }
                ca caVar = ((j) this.f418a).d;
                co coVar = (co) caVar.a();
                coVar.getClass();
                this.b.n("[NGA] ClockInfoState.getMonitoredClockInfoBackground", new f(coVar));
                return (cn) caVar.a();
            }
        });
        final int i2 = 0;
        this.e = cl.d(new ca(this, hVar, i2) { // from class: com.google.android.apps.gsa.nga.engine.ak.c.a.i

            /* renamed from: a, reason: collision with root package name */
            public final Object f418a;
            public final Object b;
            private final int c;

            {
                this.c = i2;
                this.f418a = this;
                this.b = hVar;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.android.libraries.gsa.h.h] */
            public final Object a() {
                if (this.c != 0) {
                    return new co(new h((ap) this.f418a, (com.google.android.apps.gsa.nga.engine.ak.c.n) this.b));
                }
                ca caVar = ((j) this.f418a).d;
                co coVar = (co) caVar.a();
                coVar.getClass();
                this.b.n("[NGA] ClockInfoState.getMonitoredClockInfoBackground", new f(coVar));
                return (cn) caVar.a();
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.c.s
    public final cn a() {
        throw null;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.c.s
    public final boolean b() {
        return ((u) this.g.a()).d.c && ((Boolean) this.b.e("com.google.android.deskclock").map(new g(2)).orElse(false)).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.c.s
    public final boolean c() {
        throw null;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.c.s
    public final boolean d() {
        throw null;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.c.s
    public final boolean e() {
        throw null;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.c.s
    public final boolean f() {
        throw null;
    }
}
