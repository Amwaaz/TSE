package com.google.android.apps.gsa.staticplugins.opa.j.a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.aa.a.a;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.i.f.l;
import com.google.android.libraries.k.x;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.concurrent.k;
import com.google.apps.tiktok.tracing.au;
import com.google.apps.tiktok.tracing.contrib.c.e;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.bs;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.bo;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/j/a/s.class */
public final class s extends a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f1770a;
    public final Context b;
    public final ActivityManager c;
    public final com.google.android.apps.gsa.staticplugins.opa.j.m d;
    public final ca e;
    public final Optional f;
    public final com.google.android.apps.gsa.shared.util.q.a g;
    public final cr h;
    public final com.google.android.libraries.g.a i;
    private final e.a k;
    private final dj m;
    private final bj l = new bj();
    public final ba j = h.f1747a.createBuilder();

    public s(Context context, ActivityManager activityManager, e.a aVar, com.google.android.apps.gsa.staticplugins.opa.j.m mVar, final Set set, Optional optional, com.google.android.apps.gsa.shared.util.q.a aVar2, com.google.android.apps.gsa.shared.util.debug.d dVar, cr crVar, dj djVar, com.google.android.libraries.g.a aVar3, com.google.android.apps.gsa.opa.a.a.a aVar4) {
        this.b = context;
        this.c = activityManager;
        this.k = aVar;
        this.d = mVar;
        this.f = optional;
        this.g = aVar2;
        this.h = x.b(crVar);
        this.m = djVar;
        this.i = aVar3;
        d a2 = aVar4.a("AmbBrdcstRcvrServClient");
        this.f1770a = a2;
        this.e = cl.d(new ca(this, set) { // from class: com.google.android.apps.gsa.staticplugins.opa.j.a.m

            /* renamed from: a, reason: collision with root package name */
            public final s f1768a;
            public final Set b;

            {
                this.f1768a = this;
                this.b = set;
            }

            public final Object a() {
                Stream stream = Collection._EL.stream(this.b);
                s sVar = this.f1768a;
                ha haVar = (ha) stream.peek(new f(sVar, 2)).map(new l(sVar)).collect(bs.b);
                com.google.common.f.a.a d = sVar.f1770a.d();
                d.ak(16683);
                d.q("created monitors of size %d", haVar.size());
                return haVar;
            }
        });
        dVar.a(this);
        com.google.common.f.a.a d = a2.d();
        d.ak(16693);
        d.p("constructed!");
    }

    @Override // com.google.android.apps.gsa.shared.aa.a.a
    public final void a(Context context) {
        k.d(this.l.b(new o(this, context, 0), this.h), "connect(): failed", new Object[0]);
    }

    @Override // com.google.android.apps.gsa.shared.aa.a.a
    public final void b() {
        k.d(this.l.b(new k(this, 0), this.h), "disconnect(): failed", new Object[0]);
    }

    @Override // com.google.android.apps.gsa.shared.aa.a.a
    public final boolean c() {
        return this.g.i(bc.u);
    }

    public final cn e(Context context) {
        return dl.s(ex.d(new o(this, context, 1)), this.h);
    }

    public final cn f() {
        return c.g(dl.s(ex.d(new k(this, 1)), this.h), RuntimeException.class, ex.b(new e(this)), this.h);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("AmbientBroadcastReceiverServiceClientImpl");
        dl.y(((bo) e.g(((cg) this.k.a()).d())).b, ex.h(new p(fVar)), this.h);
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("AA flag enabled? " + this.g.i(bc.r), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("AA unlocked enabled? " + l.c(this.g), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("AA TNG flag enabled? " + this.g.i(bc.aw), false));
        com.google.android.apps.gsa.shared.util.q.a aVar = this.g;
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("AA TNG unlocked enabled? " + l.d(aVar.i(bc.aw), aVar.h(bc.s)), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Context aggregator enabled? " + this.g.i(bc.x), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Enable dynamic mendel flag updates enabled? " + this.g.i(bc.ae), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Is Blue Chip Smartspace Enabled? " + this.g.i(bc.as), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d(a.a.dS(com.google.android.apps.gsa.opa.smartspace.d.w(this.b), "Is widget installed? "), false));
        qj j = ((ha) this.e.a()).j();
        while (j.hasNext()) {
            ((r) j.next()).hq(fVar);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.i(5);
        au e = this.m.e("AmbientBroadcastReceiverServiceClientImpl#onReceive");
        try {
            cn a2 = this.d.a(intent);
            if ("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH".equals(intent.getAction())) {
                com.google.common.f.a.a d = this.f1770a.d();
                d.ak(16697);
                d.s("handleRefreshAction(): handling %s", intent.getAction());
                k.d(this.l.b(new n(this, a2, context), this.h), "maybeRefreshAction(): failed", new Object[0]);
            } else {
                com.google.common.f.a.a d2 = this.f1770a.d();
                d2.ak(16698);
                d2.s("handleRefreshAction(): not handling %s", intent.getAction());
            }
            String action = intent.getAction();
            String str = action;
            if (action == null) {
                str = "null";
            }
            k.d(a2, "onReceive(): failed action %s", str);
            if (e != null) {
                e.close();
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
