package com.google.android.apps.gsa.nga.engine.p;

import com.google.android.apps.gsa.nga.engine.ak.v.a.e;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.b.b.b;
import com.google.android.apps.gsa.nga.engine.ar.b.b.s;
import com.google.android.apps.gsa.nga.engine.ar.d;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.recognition.c.i;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.common.f.ab;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/p/a.class */
public final class a extends c implements d, com.google.android.apps.gsa.nga.engine.ak.v.a {
    private static final com.google.common.f.a.d b = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final i f637a;
    private final s c;
    private final e d;
    private final y e;

    public a(s sVar, e eVar, y yVar, n nVar, i iVar) {
        super(nVar);
        this.c = sVar;
        this.d = eVar;
        this.e = yVar;
        this.f637a = iVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
        if (ahVar == ah.FULL_LISTENING) {
            com.google.common.f.a.a d = b.d();
            d.ak(3490);
            d.p("NGA starts FULL_LISTENING");
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final void c() {
        i iVar = this.f637a;
        if (iVar.e.get()) {
            iVar.f646a.n("[NGA] NgaHandler.onSearchProcessAlive", new com.google.android.apps.gsa.nga.engine.recognition.c.d(iVar, 1));
        }
        iVar.e.set(false);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final void e() {
        this.f637a.e.set(false);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.e.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        ab abVar = com.google.common.f.a.e.a;
        s sVar = this.c;
        sVar.b.a(l.NGA_CREATE, com.google.android.apps.gsa.nga.shared.q.ah.a);
        sVar.c.n("[NGA] onNgaCreate", new b(sVar, 10));
        this.d.a(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        this.f637a.hc(ajVar, ajVar2);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.d.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NgaHandlerSwitcher";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 23;
    }
}
