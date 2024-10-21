package com.google.android.apps.gsa.nga.engine.ar.b.b;

import com.google.android.apps.gsa.nga.engine.ac.a.bj;
import com.google.android.apps.gsa.nga.engine.ar.b.f;
import com.google.android.apps.gsa.nga.engine.ar.b.t;
import com.google.android.apps.gsa.nga.engine.ar.b.w;
import com.google.android.apps.gsa.nga.engine.recognition.c.i;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/b/s.class */
public final class s implements com.google.android.apps.gsa.nga.engine.ui.e.c.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f481a;
    public final w b;
    public final h c;
    public final com.google.android.apps.gsa.nga.engine.ar.b.a.d d;
    public final com.google.android.apps.gsa.nga.engine.ar.b.a.e e;
    public final t f;
    public final com.google.android.apps.gsa.nga.shared.ad.a.d g;
    public final a h;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d i;
    public final bj j;
    private final e.a k;

    public s(f fVar, w wVar, h hVar, com.google.android.apps.gsa.nga.engine.ar.b.a.d dVar, com.google.android.apps.gsa.nga.engine.ar.b.a.e eVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar2, t tVar, com.google.android.apps.gsa.nga.shared.ad.a.d dVar3, bj bjVar, e.a aVar, a aVar2) {
        this.f481a = fVar;
        this.b = wVar;
        this.c = hVar;
        this.d = dVar;
        this.e = eVar;
        this.i = dVar2;
        this.f = tVar;
        this.g = dVar3;
        this.j = bjVar;
        this.k = aVar;
        this.h = aVar2;
    }

    public final void a(com.google.android.apps.gsa.shared.logger.b.w wVar, l lVar) {
        ab abVar = com.google.common.f.a.e.a;
        this.c.n("[NGA] onCancelProcessing", new q(this, wVar, lVar, 2));
    }

    public final void b() {
        ab abVar = com.google.common.f.a.e.a;
        this.b.a(l.SESSION_CANCELLATION, com.google.android.apps.gsa.nga.shared.q.ah.a);
        this.c.n("[NGA] onCancellation", new b(this, 13));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void c() {
        i iVar = ((com.google.android.apps.gsa.nga.engine.p.a) this.k.a()).f637a;
        if (iVar.c.i(eu.ip) && iVar.j()) {
            iVar.f646a.n("[NGA] NgaHandler.onCancelClicked", new com.google.android.apps.gsa.nga.engine.recognition.c.d(iVar, 0));
        } else {
            iVar.q.b();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void d() {
        ab abVar = com.google.common.f.a.e.a;
        this.b.a(l.OPENING_TYPING_MODE, com.google.android.apps.gsa.nga.shared.q.ah.a);
        this.c.n("[NGA] onOpeningOpaInKeyboardInput", new b(this, 14));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void e(com.google.android.apps.gsa.nga.api.a.ab abVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void f() {
        ab abVar = com.google.common.f.a.e.a;
        b();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void g() {
        ab abVar = com.google.common.f.a.e.a;
        this.b.a(l.OPENING_ZEROSTATE, com.google.android.apps.gsa.nga.shared.q.ah.a);
        this.c.n("[NGA] onOpeningZeroState", new b(this, 18));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void h() {
        ab abVar = com.google.common.f.a.e.a;
        b();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void i() {
        ab abVar = com.google.common.f.a.e.a;
        b();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void j() {
        ab abVar = com.google.common.f.a.e.a;
        this.c.n("[NGA] OpaMicRequestListenerImpl.startFullListening", new b(this, 11));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void k() {
        ab abVar = com.google.common.f.a.e.a;
        this.c.n("[NGA] onTouchOutside", new b(this, 17));
    }
}
