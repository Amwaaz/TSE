package com.google.android.apps.gsa.nga.engine.ar.b.a;

import com.google.android.apps.gsa.nga.engine.ak.y.b;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.i;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.k.f;
import com.google.android.apps.gsa.shared.util.q.a;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/a/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f475a;
    private final com.google.android.apps.gsa.nga.shared.ad.a.d b;

    public e(a aVar, com.google.android.apps.gsa.nga.shared.ad.a.d dVar) {
        this.f475a = aVar;
        this.b = dVar;
    }

    public final Duration a(aj ajVar, f fVar) {
        f fVar2 = fVar;
        if (this.b.h(ajVar.c())) {
            b bVar = ajVar.g;
            fVar2 = fVar;
            if (((Boolean) bVar.b.c(i.b, false)).booleanValue()) {
                fVar2 = eu.e;
            }
        }
        return Duration.ofSeconds(this.f475a.d(fVar2));
    }
}
