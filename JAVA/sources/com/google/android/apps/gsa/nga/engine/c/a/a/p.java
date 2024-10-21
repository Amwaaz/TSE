package com.google.android.apps.gsa.nga.engine.c.a.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ae.b;
import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.d;
import com.google.android.apps.gsa.nga.engine.ar.o;
import com.google.android.apps.gsa.nga.engine.g.a;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.n.e.ac;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Optional;
import java.util.concurrent.CancellationException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/a/a/p.class */
public final class p extends f implements b, i, a, d {
    private static final com.google.common.f.a.d u = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final h f518a;
    public final h b;
    public final com.google.android.apps.gsa.shared.util.q.a c;
    public final o d;
    public final r e;
    public final e f;
    public final e g;
    public final e h;
    public final e i;
    public final e j;
    public final e k;
    public final e l;
    public final e m;
    public final e n;
    public final e o;
    public final k p;
    public final k q;
    public Optional r;
    public final e s;
    public final ac t;
    private final h v;
    private Optional w;

    public p(n nVar, y yVar, h hVar, h hVar2, h hVar3, ac acVar, com.google.android.apps.gsa.shared.util.q.a aVar, o oVar, r rVar) {
        super(nVar, yVar);
        this.f = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.g = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.h = new com.google.android.apps.gsa.nga.shared.s.i(ah.IDLE, com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.i = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.j = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.k = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.l = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.m = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.n = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.o = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.p = new k();
        this.q = new k();
        this.r = Optional.empty();
        this.w = Optional.empty();
        this.s = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.f518a = hVar;
        this.b = hVar2;
        this.v = hVar3;
        this.t = acVar;
        this.c = aVar;
        this.d = oVar;
        this.e = rVar;
    }

    public static cn c(cn cnVar) {
        return dl.o(c.h(cnVar, CancellationException.class, new l(), ay.a));
    }

    public static void e(Exception exc, String str) {
        if (exc instanceof CancellationException) {
            return;
        }
        aus.i(u.f(), "%s Failed", str, (char) 2515, exc);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
    }

    public final void f(Optional optional) {
        this.w.ifPresent(new k(1));
        if (optional.isEmpty()) {
            if (((Optional) ((com.google.android.apps.gsa.nga.shared.s.i) this.k).b.get()).isPresent()) {
                ((Optional) ((com.google.android.apps.gsa.nga.shared.s.i) this.g).b.get()).ifPresent(new a(this.e, 3));
            }
            this.k.b(Optional.empty());
            this.n.b(false);
            return;
        }
        com.google.android.libraries.assistant.g.d.f fVar = (com.google.android.libraries.assistant.g.d.f) optional.get();
        this.n.b(true);
        cn e = fVar.e();
        ((Optional) ((com.google.android.apps.gsa.nga.shared.s.i) this.g).b.get()).ifPresent(new a(this.e, 1));
        cn c = c(e);
        this.w = Optional.of(c);
        new ae(c, this.b, "[NGA] Fetch direct actions").a(new d(this, fVar, 2)).a(new h(this, 5));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i, com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return dl.i(new cn[]{this.v.a("[NGA] AppDataAccessorImpl.initialize didThread", new e(this, 1)), this.b.a("[NGA] AppDataAccessorImpl.initialize ngaStateThread", new e(this, 0))}).a(new f(), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        ad.b(this.b, this.g, ajVar.b, "updateUtteranceId");
        ad.b(this.b, this.h, ajVar.f473a, "updateState");
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.p.a();
        this.q.a();
        return dl.n(com.google.android.apps.gsa.v.c.f1836a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.b
    public final void j(Optional optional) {
        ad.b(this.b, this.f, optional, "updateComponent");
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "AppDataAccessorImpl";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 6;
    }
}
