package com.google.android.apps.gsa.nga.engine.ar.b.b;

import com.google.android.apps.gsa.nga.engine.ar.b.f;
import com.google.android.apps.gsa.nga.engine.bisto.b;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.d.dl;
import com.google.common.f.a.a;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/b/m.class */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f480a = com.google.common.f.a.d.j();
    static final Duration b = Duration.ofSeconds(10);
    public final f c;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d d;
    private final h e;
    private final com.google.android.apps.gsa.nga.shared.ad.a.d f;

    public m(com.google.android.apps.gsa.nga.engine.ar.b.d dVar, h hVar, com.google.android.apps.gsa.nga.shared.ad.a.d dVar2, f fVar) {
        this.d = dVar;
        this.e = hVar;
        this.f = dVar2;
        this.c = fVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.bisto.b
    public final void a(dl dlVar) {
        com.google.android.apps.gsa.nga.engine.ar.aj a2 = this.d.a();
        Optional d = this.f.d(a2.c());
        Optional optional = a2.b;
        if (!d.equals(Optional.of(dlVar))) {
            a d2 = f480a.d();
            d2.ak(4445);
            d2.p("Not scheduling manual endpoint timeout. InvocationToken mismatch");
        } else if (!a2.f473a.a()) {
            a d3 = f480a.d();
            d3.ak(4444);
            d3.p("Not scheduling manual endpoint timeout. Not listening state");
        } else {
            if (!optional.isEmpty()) {
                this.e.p("[NGA] ManualEndpointRequestListenerImpl.onManualEndpointRequest", Duration.ofMillis(b.toMillis()), new l(this, optional, 0));
                return;
            }
            a d4 = f480a.d();
            d4.ak(4443);
            d4.p("Not scheduling manual endpoint timeout. Missing UtteranceId");
        }
    }
}
