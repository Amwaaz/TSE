package com.google.android.apps.gsa.nga.engine.education.pie.b;

import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.education.pie.d.b;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.ac;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.libraries.g.a;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/b/af.class */
public final class af implements b, com.google.android.apps.gsa.nga.engine.education.pie.a.k, com.google.android.apps.gsa.nga.engine.ar.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f576a = d.j();
    public final com.google.android.apps.gsa.nga.shared.i.a.i b;
    private final com.google.android.libraries.gsa.h.h c;
    private final a d;
    private final com.google.android.apps.gsa.shared.util.q.a e;
    private Optional f = Optional.empty();
    private final com.google.android.apps.gsa.nga.engine.ar.b.d g;
    private final j h;

    public af(com.google.android.apps.gsa.nga.engine.ar.b.d dVar, j jVar, com.google.android.apps.gsa.nga.shared.i.a.i iVar, com.google.android.libraries.gsa.h.h hVar, a aVar, com.google.android.apps.gsa.shared.util.q.a aVar2) {
        this.g = dVar;
        this.h = jVar;
        this.b = iVar;
        this.c = hVar;
        this.d = aVar;
        this.e = aVar2;
    }

    private final void c(l lVar, boolean z) {
        if (this.h.f() && this.e.i(eu.fV)) {
            ac b = new ae(this.b.d(this.d.f(), lVar, z), this.c, "[NGA] PieOndeviceActionLoggerImpl.recordFlowCompletion").b(new ad(0));
            b.b(IllegalStateException.class, new a(6));
            b.a(new a(7));
        }
    }

    private final void g(boolean z) {
        synchronized (this) {
            ac a2 = new ae(this.c.b("[NGA] PieOndeviceActionLoggerImpl.onActiveStateChangeEvent", new ac(this, this.f, z, this.d.f())), this.c, "[NGA] PieOndeviceActionLoggerImpl.onActiveStateChangeEvent.record").a(new a(3));
            a2.b(IllegalStateException.class, new a(4));
            a2.a(new a(5));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.g.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(com.google.android.apps.gsa.nga.engine.ar.ah ahVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void d(com.google.android.apps.gsa.nga.engine.education.pie.a.l lVar, int i, com.google.android.apps.gsa.nga.shared.u.d.a.j jVar) {
        c(lVar.i(), false);
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void e(com.google.android.apps.gsa.nga.engine.education.pie.a.l lVar, int i, com.google.android.apps.gsa.nga.engine.education.pie.f.h hVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void f(com.google.android.apps.gsa.nga.engine.education.pie.a.l lVar) {
        c(lVar.i(), true);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        synchronized (this) {
            if (this.h.f() && this.e.i(eu.fR)) {
                if (ajVar.g()) {
                    g(false);
                }
                if (!ajVar.h()) {
                    this.f = Optional.empty();
                } else {
                    this.f = ajVar.e();
                    g(true);
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.g.d(this);
    }
}
