package com.google.android.apps.gsa.nga.engine.at.b;

import com.google.android.libraries.gsa.h.c;
import com.google.android.libraries.gsa.h.f;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/at/b/h.class */
public final class h {
    public final String b;
    public Object c;
    private final com.google.android.libraries.gsa.h.h e;
    private final g f;

    /* renamed from: a, reason: collision with root package name */
    public final d f499a = d.c("StateController");
    private cn g = dl.l();
    public long d = 0;

    public h(com.google.android.libraries.gsa.h.h hVar, String str, Object obj, g gVar) {
        this.e = hVar;
        this.b = str;
        this.c = obj;
        this.f = gVar;
    }

    public final void a() {
        this.d++;
        this.g.cancel(false);
    }

    public final void b(Object obj) {
        a();
        Object obj2 = this.c;
        this.c = obj;
        this.f.a(obj2, obj);
    }

    public final void c(cn cnVar, f fVar) {
        a();
        long j = this.d;
        this.g = cnVar;
        this.e.m(cnVar, "[NGA] StateMachine task callback: ".concat(this.b), new d(this, j, fVar));
    }

    public final void d(Duration duration, c cVar) {
        c(this.e.e("[NGA] state timeout", Duration.ofMillis(duration.toMillis()), new b()), new e(this, cVar));
    }

    public final void e(long j, f fVar) {
        d(Duration.ofMillis(j), new c(fVar));
    }

    public final void f(long j, Object obj) {
        e(j, new a(this, obj));
    }
}
