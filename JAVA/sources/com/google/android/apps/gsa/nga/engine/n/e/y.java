package com.google.android.apps.gsa.nga.engine.n.e;

import com.google.android.apps.gsa.nga.engine.ak.r.k;
import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.a.c;
import com.google.common.a.j;
import com.google.common.b.ha;
import com.google.common.base.ci;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/e/y.class */
public final class y implements i {

    /* renamed from: a, reason: collision with root package name */
    public final k f629a;
    public c b;
    private final ci c;
    private final com.google.android.apps.gsa.shared.util.q.a d;

    public y(ci ciVar, com.google.android.apps.gsa.shared.util.q.a aVar, k kVar) {
        this.c = ciVar;
        this.d = aVar;
        this.f629a = kVar;
        a();
    }

    private final void a() {
        Duration ofSeconds = Duration.ofSeconds(Math.max(0L, this.d.d(eu.lq)));
        j jVar = new j();
        jVar.f(ofSeconds.toMillis(), TimeUnit.MILLISECONDS);
        jVar.h(this.c);
        this.b = jVar.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        if (haVar.contains(Integer.valueOf(eu.lq.f1451a))) {
            a();
        }
    }
}
