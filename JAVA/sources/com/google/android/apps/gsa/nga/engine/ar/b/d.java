package com.google.android.apps.gsa.nga.engine.ar.b;

import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.c;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.oo;
import e.a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f482a = com.google.common.f.a.d.j();
    public final com.google.android.libraries.search.assistant.invocation.c.a.a.c.g b;
    public final h c;
    public final a d;
    public final a f;
    public final com.google.android.apps.gsa.nga.engine.ad.a g;
    public final af j;
    public final Set e = oo.j();
    public final AtomicReference h = new AtomicReference(aj.a(com.google.android.apps.gsa.shared.logger.b.w.UNKNOWN_EVENT, com.google.android.apps.gsa.nga.shared.q.d.l.UNKNOWN).a());
    public final AtomicReference i = new AtomicReference(aj.a(com.google.android.apps.gsa.shared.logger.b.w.UNKNOWN_EVENT, com.google.android.apps.gsa.nga.shared.q.d.l.UNKNOWN).a());

    public d(af afVar, a aVar, a aVar2, h hVar, com.google.android.apps.gsa.nga.engine.ad.a aVar3, com.google.android.libraries.search.assistant.invocation.c.a.a.c.g gVar) {
        this.j = afVar;
        this.f = aVar2;
        this.g = aVar3;
        this.b = gVar;
        this.c = hVar;
        this.d = aVar;
    }

    public static void c(c cVar, com.google.android.apps.gsa.nga.engine.ar.a aVar) {
        ah ahVar = aVar.b.f473a;
        if (ahVar != aVar.a.f473a) {
            cVar.b(ahVar);
        }
        cVar.hc(aVar.b, aVar.a);
    }

    public final aj a() {
        return (aj) this.h.get();
    }

    public final void b(c cVar) {
        this.e.add(cVar);
        this.c.n("[NGA] ActiveStateImpl.addListener", new c(this, cVar, 1));
    }

    public final void d(c cVar) {
        this.e.remove(cVar);
    }
}
