package com.google.android.apps.gsa.nga.engine.ad.a;

import com.google.android.apps.gsa.nga.engine.ak.v.a.e;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.o.b;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.apps.gsa.nga.shared.u.m;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ad/a/a.class */
public final class a extends c implements com.google.android.apps.gsa.nga.engine.ad.a, com.google.android.apps.gsa.nga.engine.ak.v.a, com.google.android.apps.gsa.nga.shared.o.a, b {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f399a;
    private final AtomicBoolean b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;
    private final y e;
    private final e f;

    static {
        d.c("OpaVisibility");
    }

    public a(e.a aVar, n nVar, y yVar, e eVar) {
        super(nVar);
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.f399a = aVar;
        this.e = yVar;
        this.f = eVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final /* synthetic */ void a(ev evVar) {
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final void b(boolean z) {
        this.d.get();
        if (z) {
            this.c.set(true);
        }
        this.d.set(z);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final /* synthetic */ void c() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ad.a
    public final cn d() {
        cn cnVar;
        if (this.b.get()) {
            g gVar = (g) this.f399a.a();
            ba createBuilder = aa.a.createBuilder();
            ba createBuilder2 = m.a.createBuilder();
            createBuilder2.copyOnWrite();
            m mVar = createBuilder2.instance;
            mVar.b |= 1;
            mVar.c = true;
            m build = createBuilder2.build();
            createBuilder.copyOnWrite();
            aa aaVar = createBuilder.instance;
            build.getClass();
            aaVar.c = build;
            aaVar.b = 5;
            cnVar = com.google.android.apps.gsa.v.c.b(gVar.c((aa) createBuilder.build(), Optional.empty()));
        } else {
            this.b.get();
            this.c.get();
            cnVar = com.google.android.apps.gsa.v.c.b;
        }
        return cnVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final void e() {
        this.b.set(false);
        this.c.set(false);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ad.a
    public final boolean f() {
        return this.b.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.e.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        this.f.a(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.a
    public final void hj(boolean z) {
        this.b.get();
        this.b.set(z);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.f.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "OpaVisibilityMonitor";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 32;
    }
}
