package com.google.android.apps.gsa.n;

import android.content.Context;
import android.location.Location;
import com.google.android.apps.gsa.search.core.google.gaia.b.a.c;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.libraries.search.account.l;
import com.google.android.libraries.search.location.compliance.t;
import com.google.android.libraries.search.location.o;
import com.google.android.libraries.search.location.q;
import com.google.android.libraries.search.location.r;
import com.google.common.base.at;
import com.google.common.base.bd;
import com.google.common.f.a.e;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/n/h.class */
public class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f375a = j.i("com.google.android.apps.gsa.n.h");
    public final Context b;
    public final t c;
    public final c d;
    private final o e;
    private final at f;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public h(Context context, c cVar, o oVar, at atVar, t tVar) {
        this.b = context;
        this.d = cVar;
        this.e = oVar;
        this.c = tVar;
        this.f = atVar;
    }

    @Deprecated
    public final Location a() {
        Location c;
        if (this.g.compareAndSet(false, true)) {
            bd bdVar = this.f;
            o oVar = this.e;
            oVar.getClass();
            ((com.google.android.libraries.search.location.compliance.b.h) bdVar.a).b(new f(oVar));
        }
        o oVar2 = this.e;
        Object obj = oVar2.b;
        Duration ofDays = Duration.ofDays(1L);
        synchronized (obj) {
            c = !oVar2.f5311a ? null : oVar2.c(1, ofDays);
        }
        if (c == null) {
            com.google.common.f.h d = f375a.d();
            d.aj(e.a, "LocationOracle");
            com.google.common.f.h hVar = d;
            hVar.ak(2328);
            hVar.p("getCachedLocation(): no location is available");
        }
        return c;
    }

    public final cn b() {
        return this.b.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == -1 ? dl.n(false) : com.google.apps.tiktok.tracing.contrib.c.e.g(this.d.b()).i(new d(this, 1), ay.a).f(l.class, new d(this, 0), ay.a);
    }

    public final cn c(r rVar) {
        return com.google.apps.tiktok.tracing.contrib.c.e.g(this.d.b()).i(new e(this, rVar), ay.a);
    }

    public final /* synthetic */ cn e(com.google.android.libraries.search.x.b.b bVar) {
        q a2 = r.a(bVar);
        a2.c(Duration.ofMillis(0L));
        return c(a2.a());
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("LocationOracle");
    }
}
