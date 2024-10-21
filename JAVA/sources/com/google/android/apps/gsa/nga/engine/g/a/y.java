package com.google.android.apps.gsa.nga.engine.g.a;

import android.content.Context;
import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.engine.ao.h;
import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.engine.v.u;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.search.account.a;
import com.google.android.libraries.search.account.k;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.f.am;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/a/y.class */
public final class y implements h, a, i, com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f615a = com.google.common.f.a.d.j();
    private cn A;
    private final ag B;
    private final ap C;
    private final com.google.android.apps.gsa.nga.shared.n.c D;
    public final Context c;
    public final com.google.android.libraries.gsa.h.h d;
    public final com.google.android.libraries.search.account.d.d e;
    public final af f;
    public final dj g;
    public final Executor h;
    public final AtomicReference l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public boolean o;
    public Optional p;
    public final k q;
    public final n r;
    public final k s;
    public final com.google.android.apps.gsa.nga.shared.n.c t;
    private final com.google.android.apps.gsa.shared.util.q.a v;
    private final com.google.android.libraries.gsa.h.h w;
    private final e.a x;
    private final com.google.android.apps.gsa.nga.shared.q.a z;
    public final Object b = new Object();
    private final bj u = new bj();
    private Optional y = Optional.empty();
    public final AtomicReference i = new AtomicReference(new x(Optional.empty(), Optional.empty()));
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean k = new AtomicBoolean(false);

    public y(Context context, k kVar, ag agVar, n nVar, com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, com.google.android.apps.gsa.nga.shared.n.k kVar2, e.a aVar2, com.google.android.apps.gsa.nga.shared.q.a aVar3, ap apVar, k kVar3, com.google.android.libraries.search.account.d.d dVar, dj djVar, Executor executor, af afVar) {
        com.google.android.apps.gsa.nga.engine.g.b a2 = com.google.android.apps.gsa.nga.engine.g.c.a();
        a2.c(false);
        a2.d(false);
        a2.e(Locale.getDefault());
        a2.b(fl.p(Locale.getDefault()));
        a2.f617a = Optional.empty();
        a2.b = new com.google.android.apps.gsa.nga.engine.at.e.c();
        this.l = new AtomicReference(a2.a());
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.A = null;
        this.o = false;
        this.p = Optional.empty();
        this.c = context;
        this.q = kVar;
        this.B = agVar;
        this.r = nVar;
        this.v = aVar;
        this.d = hVar;
        this.w = hVar2;
        this.x = aVar2;
        this.z = aVar3;
        this.D = kVar2.d(new n(0));
        this.t = kVar2.d(new n(2));
        this.C = apVar;
        this.s = kVar3;
        this.e = dVar;
        this.g = djVar;
        this.h = executor;
        this.f = afVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(t tVar) {
        if (tVar != t.a) {
            return;
        }
        j(new l(2));
    }

    public final com.google.android.apps.gsa.nga.engine.g.c b() {
        boolean z = this.j.get();
        Optional optional = ((x) this.i.get()).b;
        com.google.android.apps.gsa.nga.engine.at.e.b bVar = (com.google.android.apps.gsa.nga.engine.at.e.b) ((x) this.i.get()).f614a.map(new h(this, 1)).orElseGet(new l(1));
        fl e = e(optional);
        boolean z2 = true;
        if (bVar.d()) {
            z2 = h.a.a.p.b.a.f.h(this.f.b.get(), ad.a);
        }
        com.google.common.f.a.a d = f615a.d();
        d.ak(2774);
        d.s("Nga on-device enabled based on TNG:MA active state: %b", Boolean.valueOf(z2));
        l();
        ag agVar = this.B;
        agVar.getClass();
        Locale locale = (Locale) optional.flatMap(new h(agVar, 0)).orElse(this.B.m());
        com.google.android.apps.gsa.nga.engine.g.b a2 = com.google.android.apps.gsa.nga.engine.g.c.a();
        a2.c(z);
        a2.f617a = optional;
        if (bVar == null) {
            throw new NullPointerException("Null tngFlags");
        }
        a2.b = bVar;
        a2.b(e);
        a2.e(locale);
        a2.d(false);
        return a2.a();
    }

    public final com.google.android.apps.gsa.nga.engine.g.c c() {
        if (!this.m.get()) {
            com.google.common.f.a.a e = f615a.e();
            e.al(am.b);
            e.ak(2775);
            e.p("Calling getConfiguration() before NgaConfigurationManager is initialized.");
        }
        return (com.google.android.apps.gsa.nga.engine.g.c) this.l.get();
    }

    public final fl e(Optional optional) {
        ag agVar = this.B;
        agVar.getClass();
        fl flVar = (fl) optional.flatMap(new h(agVar, 2)).map(new n(3)).orElse(fl.p(this.B.m()));
        fl flVar2 = flVar;
        if (flVar.isEmpty()) {
            flVar2 = fl.p(Locale.getDefault());
        }
        return flVar2;
    }

    public final fl f() {
        fl flVar;
        synchronized (this) {
            if (this.y.isEmpty()) {
                u a2 = this.C.a(81, ah.a);
                try {
                    this.y = Optional.of((fl) this.x.a());
                    a2.a();
                } finally {
                }
            }
            flVar = (fl) this.y.get();
        }
        return flVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
    }

    public final cn h() {
        return this.u.b(new w(this), ay.a);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("NGA Configuration");
        fVar.a("NGA enabled components").a(new com.google.android.apps.gsa.shared.util.b.d((String) Collection._EL.stream((fl) this.x.a()).filter(new i()).map(new n(1)).collect(Collectors.joining(",")), false));
        fVar.a("NGA primary locale").a(new com.google.android.apps.gsa.shared.util.b.d(((com.google.android.apps.gsa.nga.engine.g.c) this.l.get()).d, false));
        fVar.a("NGA locales").a(new com.google.android.apps.gsa.shared.util.b.d(((com.google.android.apps.gsa.nga.engine.g.c) this.l.get()).f, false));
    }

    public final cn i(boolean z) {
        this.n.set(z);
        return j(new o(this, 3));
    }

    @Override // com.google.android.libraries.search.account.a
    public final void is() {
        j(new o(this, 0));
    }

    public final cn j(Supplier supplier) {
        cn cnVar;
        this.z.a(new o(this, 2));
        synchronized (this.b) {
            if (this.A == null) {
                this.q.j(this);
                this.A = com.google.common.util.concurrent.i.g(com.google.common.util.concurrent.c.g(cf.i(com.google.android.apps.gsa.v.c.a(fl.q(h(), this.D.b()))), Exception.class, new r(0), ay.a), new s(this), ay.a);
            }
            cnVar = this.A;
        }
        cn l = cnVar.isDone() ? (cn) e$.ExternalSyntheticApiModelOutline0.m(supplier) : this.d.l(cnVar, "[NGA] NgaConfigurationManager.initializeAndThen", new j(supplier, 3));
        new com.google.android.apps.gsa.shared.util.c.ae(l, this.d, "[NGA] NgaConfigurationManager.updateInternalConfiguration.log").a(new t(1)).a(new t(0));
        return this.d.l(l, "[NGA] NgaConfigurationManager.updateInternalConfiguration", new j(this, 4));
    }

    public final void k() {
        this.w.n("[NGA] NgaConfigurationManager.updateConfiguration", new u(this, 1));
    }

    public final void l() {
        if (this.j.get()) {
            this.v.h(eu.kh);
        }
    }
}
