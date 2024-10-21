package com.google.android.apps.gsa.nga.engine.ae;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.bs;
import com.google.common.b.dh;
import com.google.common.b.fu;
import com.google.common.b.gl;
import com.google.common.b.ha;
import com.google.common.b.nn;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/q.class */
public final class q extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f410a = d.j();
    public static final Drawable b = new ColorDrawable(0);
    public final Context c;
    public final h d;
    public final com.google.android.apps.gsa.nga.shared.n.e e;
    public final com.google.android.apps.gsa.nga.shared.n.e f;
    public final AtomicReference g;
    public volatile gl h;
    public volatile fu i;
    public volatile fu j;
    public final Object k;
    public boolean l;
    public boolean m;
    public final af n;
    private final BroadcastReceiver o;

    public q(Context context, aw awVar, af afVar, com.google.android.apps.gsa.nga.shared.n.k kVar, com.google.android.apps.gsa.nga.shared.n.k kVar2, y yVar, n nVar, a aVar) {
        super(nVar, yVar);
        this.g = new AtomicReference();
        this.h = dh.a;
        this.i = nn.a;
        this.j = nn.a;
        this.k = new Object();
        this.l = false;
        this.m = false;
        this.c = context;
        this.n = afVar;
        h a2 = awVar.a(k.class);
        this.d = a2;
        this.e = kVar.a(a2, new d());
        this.f = kVar2.a(a2, new aj(1));
        this.o = new com.google.android.apps.gsa.nga.shared.android.m(new ak(this, 1), aVar, eu.bK);
    }

    public static void k() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }

    private final void p(cn cnVar) {
        cn cnVar2 = (cn) this.g.getAndSet(cnVar);
        if (cnVar2 != null) {
            cnVar2.cancel(true);
        }
    }

    public final ha a(String str) {
        return (ha) Collection._EL.stream(new h(this, 3).a.h.map.v()).flatMap(new v(com.google.android.apps.gsa.nga.shared.ag.a.a(str), 1)).collect(bs.b);
    }

    public final Optional c(String str) {
        return Optional.ofNullable((j) new h(this, 4).a.i.get(str)).map(new i());
    }

    public final Optional e(String str) {
        return Optional.ofNullable((j) new h(this, 2).a.i.get(str));
    }

    public final String f(String str) {
        String str2 = str;
        if (str == null) {
            str2 = "<app-unknown>";
        }
        return str2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        this.c.registerReceiver(this.o, intentFilter);
        return this.d.b("[NGA] AppPackageCache.initialize", new g(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.c.unregisterReceiver(this.o);
        p(null);
        return this.d.a("[NGA] AppPackageCache.destroy", new g(this, 0));
    }

    public final void j() {
        cn a2 = this.d.a("[NGA] AppPackageCacheUpdater.scheduleRefreshTask", new p(this));
        p(a2);
        new ae(a2, this.d, "[NGA] AppPackageCacheUpdater.checkRefresh").a(new c(this, a2, 1)).a(new c(this, a2, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "AppPackageCache";
    }

    public final boolean m(String str) {
        return new h(this, 1).a.i.containsKey(str);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 33;
    }

    public final boolean o(String str, long j) {
        return ((Boolean) e(str).map(new f(j)).orElse(false)).booleanValue();
    }
}
