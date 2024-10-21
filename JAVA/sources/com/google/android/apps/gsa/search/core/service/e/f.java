package com.google.android.apps.gsa.search.core.service.e;

import com.google.common.b.ha;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.j;
import java.util.Date;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/f.class */
public final class f implements com.google.android.apps.gsa.shared.util.debug.a.a {
    private static final j b = j.i("com.google.android.apps.gsa.search.core.service.e.f");

    /* renamed from: a, reason: collision with root package name */
    public final d f1191a;
    private at c;
    private at d;
    private at e;
    private at f;

    public f(String str, String str2, h hVar, ha haVar) {
        com.google.common.base.a aVar = com.google.common.base.a.a;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.f1191a = new d(str, str2, hVar, haVar);
    }

    public final long a() {
        long longValue;
        synchronized (this) {
            longValue = ((Long) this.e.e(0L)).longValue();
        }
        return longValue;
    }

    public final long b() {
        long longValue;
        synchronized (this) {
            longValue = ((Long) this.d.e(0L)).longValue();
        }
        return longValue;
    }

    public final long c() {
        long longValue;
        synchronized (this) {
            longValue = ((Long) this.c.e(0L)).longValue();
        }
        return longValue;
    }

    public final e e() {
        e eVar;
        synchronized (this) {
            eVar = (e) this.f.e(e.UNDEFINED);
        }
        return eVar;
    }

    public final void f(long j, e eVar) {
        synchronized (this) {
            cl.v(this.d.h(), "Delegation time has not been set, so completion time cannot be set");
            if (j < b()) {
                com.google.common.f.h e = b.e();
                e.ak(7354);
                e.N("Completion time %d is less than Delegation time %d for worker %s", Long.valueOf(j), Long.valueOf(b()), this.f1191a.b);
            }
            if (this.e.h()) {
                com.google.common.f.h e2 = b.e();
                e2.ak(7353);
                e2.p("Attempt to overwrite completionTime");
            } else {
                this.e = at.k(Long.valueOf(j));
            }
            if (!this.f.h()) {
                this.f = at.k(eVar);
                return;
            }
            com.google.common.f.h e3 = b.e();
            e3.ak(7358);
            e3.p("Attempt to overwrite workProxyEndState");
        }
    }

    public final void g(long j) {
        synchronized (this) {
            cl.v(this.c.h(), "Enqueue time has not been set, so delegation time cannot be set");
            if (j < c()) {
                com.google.common.f.h e = b.e();
                e.ak(7356);
                e.N("Delegation time %d is less than Enqueue time %d for worker %s", Long.valueOf(j), Long.valueOf(c()), this.f1191a.b);
            }
            if (!this.d.h()) {
                this.d = at.k(Long.valueOf(j));
                return;
            }
            com.google.common.f.h e2 = b.e();
            e2.ak(7355);
            e2.p("Attempt to overwrite delegationTime");
        }
    }

    public final void h(long j) {
        synchronized (this) {
            if (!this.c.h()) {
                this.c = at.k(Long.valueOf(j));
                return;
            }
            com.google.common.f.h e = b.e();
            e.ak(7357);
            e.p("Attempt to overwrite enqueueTime");
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.s("%18s: +%5s, +%5s, %9s, %s", new com.google.android.apps.gsa.shared.util.b.e[]{new com.google.android.apps.gsa.shared.util.b.d(com.google.android.apps.gsa.shared.util.b.f.f(new Date(c())), false), new com.google.android.apps.gsa.shared.util.b.d(Long.valueOf(b() - c()), false), new com.google.android.apps.gsa.shared.util.b.d(Long.valueOf(a() - b()), false), new com.google.android.apps.gsa.shared.util.b.d(e(), false), new com.google.android.apps.gsa.shared.util.b.d(this.f1191a.b, false)});
    }
}
