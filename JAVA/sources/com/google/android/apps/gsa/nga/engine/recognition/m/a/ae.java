package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.android.apps.gsa.nga.engine.d.a.bb;
import com.google.android.apps.gsa.nga.engine.s.c;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import com.google.speech.i.di;
import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/ae.class */
public final class ae extends com.google.android.apps.gsa.nga.engine.t.f implements com.google.android.apps.gsa.nga.engine.ao.h {

    /* renamed from: a, reason: collision with root package name */
    public static final d f659a = d.j();
    static final Duration b = Duration.ofSeconds(20);
    public final bb c;
    public final ao d;
    public final k e;
    public final com.google.android.libraries.gsa.h.h f;
    public final a g;
    public final i h;
    public final s i;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d j;
    public final com.google.android.apps.gsa.nga.engine.v.a.ap k;
    private final com.google.android.libraries.gsa.h.h l;
    private final c m;

    public ae(s sVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, a aVar, i iVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar, n nVar, bb bbVar, com.google.android.apps.gsa.nga.engine.v.a.ap apVar, ao aoVar, k kVar, c cVar) {
        super(nVar, yVar, ha.u(Integer.valueOf(eu.lW.f1453a), Integer.valueOf(eu.ju.f1453a), Integer.valueOf(eu.bA.f1434a), Integer.valueOf(eu.da.f1434a)));
        this.i = sVar;
        this.l = hVar;
        this.f = hVar2;
        this.j = dVar;
        this.g = aVar;
        this.h = iVar;
        this.c = bbVar;
        this.k = apVar;
        this.d = aoVar;
        this.e = kVar;
        this.m = cVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(t tVar) {
        if (tVar.equals(t.a)) {
            V();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        return !Objects.equals((di) this.e.j.get(), this.i.a());
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        com.google.common.f.a.a d = f659a.d();
        d.ak(3965);
        d.p("SodaLifecycleHandler.initialize()");
        c cVar = this.m;
        if (cVar != null) {
            cVar.a();
        }
        this.h.b(w.NGA_SODA_INITIALIZATION_START);
        return com.google.common.util.concurrent.i.g(com.google.common.util.concurrent.c.h(cf.i(this.l.l(this.l.b("[NGA] GetSodaCoreConfig", new z(this)), "[NGA] SodaLifecycleHandler.initialize", new aa(this))), Throwable.class, new ab(this), ay.a), new ac(this), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        return com.google.android.apps.gsa.v.c.b(this.l.h("[NGA] SodaLifecycleHandler.uninitialize", new ad(this)));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "SodaLifecycleHandler";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 41;
    }
}
