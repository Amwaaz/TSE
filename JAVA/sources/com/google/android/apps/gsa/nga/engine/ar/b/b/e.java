package com.google.android.apps.gsa.nga.engine.ar.b.b;

import com.google.android.apps.gsa.nga.engine.ar.b.f;
import com.google.android.apps.gsa.nga.engine.bisto.a;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.d.dl;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/b/e.class */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final f f479a;
    public final com.google.android.apps.gsa.nga.shared.ad.a.d b;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d c;
    private final h d;

    static {
        Duration.ofMillis(100L);
        Duration.ofSeconds(2L);
    }

    public e(f fVar, h hVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, com.google.android.apps.gsa.nga.shared.ad.a.d dVar2) {
        this.f479a = fVar;
        this.d = hVar;
        this.c = dVar;
        this.b = dVar2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.bisto.a
    public final void a(dl dlVar) {
        this.d.n("[NGA] onCancelInvocation", new l(this, dlVar, 1));
    }
}
