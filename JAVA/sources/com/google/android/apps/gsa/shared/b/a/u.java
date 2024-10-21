package com.google.android.apps.gsa.shared.b.a;

import android.content.Context;
import com.google.android.libraries.search.assistant.r.v;
import com.google.common.b.fl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ao;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.b.aj;
import kotlinx.coroutines.b.aq;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.ct;
import kotlinx.coroutines.b.dc;
import kotlinx.coroutines.b.di;
import m.a.an;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/u.class */
public final class u implements com.google.android.libraries.ao.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1390a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.b.a.u");
    public static final Set b;
    public static final Set c;
    public static final Set d;
    public final e.a e;
    public final e.a f;
    public final e.a g;
    public final e.a h;
    public final Context i;
    public final ag j;
    public final Executor k;
    private final e.a l;
    private final ao m;
    private final ag n;
    private final cr o;
    private final com.google.android.libraries.search.assistant.r.b.b p;
    private final AtomicBoolean q;
    private final m.e r;

    static {
        fl flVar = com.google.android.apps.gsa.shared.util.p.c;
        flVar.getClass();
        fl flVar2 = com.google.android.apps.gsa.shared.util.p.g;
        flVar2.getClass();
        b = m.a.t.W(m.a.t.E(flVar, flVar2));
        c = an.bT(new String[]{"android.car.projection.extra.ACTION_BEGIN_PROJECTION", "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STARTED"});
        d = an.bT(new String[]{"android.car.projection.extra.ACTION_END_PROJECTION", "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STOPPED"});
    }

    public u(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4, e.a aVar5, ao aoVar, Context context, ag agVar, ag agVar2, cr crVar, Executor executor) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        context.getClass();
        agVar.getClass();
        agVar2.getClass();
        crVar.getClass();
        executor.getClass();
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        this.l = aVar4;
        this.h = aVar5;
        this.m = aoVar;
        this.i = context;
        this.n = agVar;
        this.j = agVar2;
        this.o = crVar;
        this.k = executor;
        this.p = new com.google.android.libraries.search.assistant.r.b.b(agVar);
        this.q = new AtomicBoolean(false);
        this.r = new m.m(new e(this));
    }

    public final kotlinx.coroutines.b.m a(androidx.lifecycle.an anVar, String str, m.h.a.a aVar) {
        kotlinx.coroutines.b.d dVar = new kotlinx.coroutines.b.d(new t(aVar, this, str, anVar, null));
        int i = dc.a;
        return cp.e(dVar, this.n, new di(5000L, 0L), 1);
    }

    public final ct b() {
        return (ct) this.r.b();
    }

    @Override // com.google.android.libraries.ao.c.a
    public final void c() {
        com.google.apps.tiktok.concurrent.k.d(this.o.d(new Runnable(this) { // from class: com.google.android.apps.gsa.shared.b.a.a

            /* renamed from: a, reason: collision with root package name */
            public final u f1370a;

            {
                this.f1370a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1370a.d();
            }
        }, com.google.protobuf.b.a.a.c(this.m).toMillis(), TimeUnit.MILLISECONDS), "Failed to start: legacy special assistant experience won't be propagated!", new Object[0]);
        com.google.apps.tiktok.concurrent.k.d(kotlinx.coroutines.c.i.e(this.j, (m.c.n) null, 0, new g(this, null), 3), "Failed to start: legacy special assistant experience may be delayed!", new Object[0]);
    }

    public final void d() {
        if (this.q.getAndSet(true)) {
            return;
        }
        androidx.lifecycle.an a2 = ((com.google.android.apps.gsa.assistant.shared.c) this.l.a()).a();
        a2.getClass();
        kotlinx.coroutines.b.m a3 = a(a2, "activeClientPackageName", new j(this, 1));
        androidx.lifecycle.an b2 = ((com.google.android.apps.gsa.assistant.shared.c) this.l.a()).b();
        b2.getClass();
        kotlinx.coroutines.b.m a4 = a(b2, "navigationClientState", k.b);
        com.google.android.apps.gsa.assistant.shared.b bVar = ((com.google.android.apps.gsa.assistant.shared.u) this.g.a()).s() ? com.google.android.apps.gsa.assistant.shared.b.CONNECTED : com.google.android.apps.gsa.assistant.shared.b.NOT_CONNECTED;
        androidx.lifecycle.an c2 = ((com.google.android.apps.gsa.assistant.shared.c) this.l.a()).c();
        c2.getClass();
        cp.x(new aq(aj.a(cp.r(cp.b(a3, a4, a(c2, "navigationClientStatus", new j(bVar, 0)), new kotlinx.coroutines.b.d(new l(this, null)), new h(this, null)))), new i(this, null), 5), this.j);
    }

    public final void e(String str, m.h.a.l lVar) {
        v.f(this.p.a(new o(lVar, (m.c.g) null, 0)), ay.a, new p(str));
    }
}
