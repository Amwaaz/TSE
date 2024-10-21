package com.google.android.apps.gsa.nga.engine.ui.d.e;

import com.google.android.apps.gsa.nga.engine.ui.d.a.c;
import com.google.android.apps.gsa.nga.engine.ui.d.b.a;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.common.v.f;
import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/d/e/b.class */
public final class b implements c, a {

    /* renamed from: a, reason: collision with root package name */
    private static final Duration f684a = Duration.ofMillis(100);
    private final com.google.android.libraries.gsa.h.h c;
    private final f e;
    private Instant f;
    private final com.google.android.apps.gsa.nga.shared.s.e b = new i(Float.valueOf(0.0f), com.google.android.apps.gsa.nga.engine.ui.d.a.a.class);
    private final Object d = new Object();

    public b(f fVar, com.google.android.libraries.gsa.h.h hVar) {
        this.e = fVar;
        this.c = hVar;
        this.f = fVar.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.d.a.c
    public final com.google.android.apps.gsa.nga.shared.s.f a() {
        return this.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.d.b.a
    public final void b(float f) {
        Instant a2 = this.e.a();
        synchronized (this.d) {
            if (this.f.plus(f684a).isBefore(a2)) {
                ad.b(this.c, this.b, Float.valueOf(f), "audioLevel");
                this.f = a2;
            }
        }
    }
}
