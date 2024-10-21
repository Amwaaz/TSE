package com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a;

import androidx.work.WorkerParameters;
import androidx.work.ac;
import androidx.work.r;
import com.bumptech.glide.h.h;
import com.google.android.apps.search.assistant.verticals.ambient.p.a.a;
import com.google.apps.tiktok.contrib.work.c;
import com.google.apps.tiktok.contrib.work.l;
import com.google.apps.tiktok.tracing.contrib.c.e;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.c.a.m;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/a/a/z.class */
public final class z implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1737a = r.KEEP;
    public final d b;
    private final com.google.android.apps.gsa.opa.smartspace.d c;
    private final a d;
    private final v e;
    private final com.google.android.apps.gsa.search.core.aa.a.c f;

    public z(com.google.android.apps.gsa.opa.a.a.a aVar, com.google.android.apps.gsa.opa.smartspace.d dVar, v vVar, a aVar2, com.google.android.apps.gsa.search.core.aa.a.c cVar) {
        this.b = aVar.a("AppUsageWorker");
        this.c = dVar;
        this.e = vVar;
        this.d = aVar2;
        this.f = cVar;
    }

    @Override // com.google.apps.tiktok.contrib.work.m
    public final /* synthetic */ cn a(WorkerParameters workerParameters) {
        return l.a();
    }

    @Override // com.google.apps.tiktok.contrib.work.c, com.google.apps.tiktok.contrib.work.m
    public final cn b(WorkerParameters workerParameters) {
        if (this.f.h) {
            com.google.common.f.a.a d = this.b.d();
            d.ak(16067);
            d.p("A similar task is enabled in TNG. Exiting this worker.");
            return dl.n(new ac(androidx.work.l.f224a));
        }
        com.google.common.f.a.a d2 = this.b.d();
        d2.ak(16066);
        d2.s("Start App usage model generation task. PeriodicTaskPolicy: %s", f1737a);
        if (!this.c.j()) {
            return dl.n(new ac(androidx.work.l.f224a));
        }
        v vVar = this.e;
        m mVar = this.d.a().c;
        m mVar2 = mVar;
        if (mVar == null) {
            mVar2 = m.a;
        }
        return e.g(vVar.b(mVar2)).h(new y(this, 0), h.b).e(Throwable.class, new y(this, 2), h.b);
    }
}
