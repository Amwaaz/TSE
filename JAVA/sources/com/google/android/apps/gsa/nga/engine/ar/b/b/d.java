package com.google.android.apps.gsa.nga.engine.ar.b.b;

import com.google.android.apps.gsa.nga.engine.ar.b.f;
import com.google.android.apps.gsa.nga.engine.q.a.b;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.libraries.gsa.h.h;
import e.a;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/b/d.class */
public final class d implements com.google.android.apps.gsa.nga.engine.ar.c {
    private static final com.google.common.f.a.d g = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final f f478a;
    public final h b;
    public final a c;
    public final com.google.common.v.f d;
    public final com.google.android.apps.gsa.nga.shared.n.e f;
    private final com.google.android.apps.gsa.shared.util.q.a h;
    private final AtomicReference i = new AtomicReference();
    public final AtomicReference e = new AtomicReference(true);

    public d(f fVar, a aVar, com.google.common.v.f fVar2, h hVar, h hVar2, k kVar, com.google.android.apps.gsa.shared.util.q.a aVar2) {
        this.f478a = fVar;
        this.c = aVar;
        this.d = fVar2;
        this.b = hVar2;
        this.f = kVar.c(hVar, new be() { // from class: com.google.android.apps.gsa.nga.engine.ar.b.b.c
            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                ((b) obj).g();
            }
        });
        this.h = aVar2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(com.google.android.apps.gsa.nga.engine.ar.ah ahVar) {
    }

    public final void c() {
        this.i.set(this.d.a());
        com.google.common.f.a.a d = g.d();
        d.ak(4421);
        d.s("ignoreNextImplicitDismissGesture. Time: %s", this.i.get());
    }

    public final void d() {
        this.b.n("[NGA] onAssistantExplicitDismissGesture", new b(this, 0));
    }

    public final boolean e() {
        return ((Boolean) Optional.ofNullable((Instant) this.i.get()).map(new a(Duration.ofMillis(this.h.d(eu.aV)), 1)).map(new a(this, 0)).orElse(false)).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(com.google.android.apps.gsa.nga.engine.ar.aj ajVar, com.google.android.apps.gsa.nga.engine.ar.aj ajVar2) {
        this.e.set(Boolean.valueOf(ajVar.k()));
        if (ajVar.h()) {
            c();
        }
    }
}
