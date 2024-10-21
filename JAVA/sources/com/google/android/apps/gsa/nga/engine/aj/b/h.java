package com.google.android.apps.gsa.nga.engine.aj.b;

import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.ae.ap;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.c;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/aj/b/h.class */
public final class h extends f implements com.google.android.apps.gsa.nga.engine.ao.h, ap, c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f415a = d.j();
    public final e b;
    public final AtomicBoolean c;
    private final com.google.android.libraries.gsa.h.h d;
    private final com.google.android.apps.gsa.shared.util.q.a e;
    private final ag f;
    private final ad g;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d h;

    public h(aw awVar, ag agVar, ad adVar, e eVar, com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, y yVar, n nVar) {
        super(nVar, yVar, ha.s(Integer.valueOf(eu.cj.f1434a), Integer.valueOf(eu.aj.f1434a)));
        this.c = new AtomicBoolean(false);
        this.d = awVar.a(g.class);
        this.f = agVar;
        this.g = adVar;
        this.b = eVar;
        this.e = aVar;
        this.h = dVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(t tVar) {
        if (t.a.equals(tVar)) {
            V();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
        V();
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.d.a("[NGA] SensorRegistryState.initialize", new f(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.ap
    public final void hn(boolean z) {
        V();
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.d.a("[NGA] SensorRegistryState.uninitialize", new f(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "SensorRegistryState";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 43;
    }
}
