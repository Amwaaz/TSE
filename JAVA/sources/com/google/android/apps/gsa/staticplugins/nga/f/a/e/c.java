package com.google.android.apps.gsa.staticplugins.nga.f.a.e;

import androidx.work.WorkerParameters;
import androidx.work.ac;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.fg;
import com.google.android.apps.gsa.nga.shared.q.c.fh;
import com.google.android.apps.gsa.nga.shared.u.d.a.w;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.apps.tiktok.contrib.work.l;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/f/a/e/c.class */
public final class c implements com.google.apps.tiktok.contrib.work.c {

    /* renamed from: a, reason: collision with root package name */
    private final p f1683a;
    private final e.a b;
    private final com.google.android.apps.gsa.staticplugins.nga.f.a.a.c c;
    private final x d;

    public c(p pVar, e.a aVar, com.google.android.apps.gsa.staticplugins.nga.f.a.a.c cVar, x xVar) {
        this.f1683a = pVar;
        this.b = aVar;
        this.c = cVar;
        this.d = xVar;
    }

    @Override // com.google.apps.tiktok.contrib.work.m
    public final /* synthetic */ cn a(WorkerParameters workerParameters) {
        return l.a();
    }

    @Override // com.google.apps.tiktok.contrib.work.c, com.google.apps.tiktok.contrib.work.m
    public final cn b(WorkerParameters workerParameters) {
        fg d = fh.d();
        d.b = "TRIGGERING_WORKER_START_WORK";
        this.d.b(d.a());
        if (this.c.d() != w.PIE_ELIGIBLE) {
            x xVar = this.d;
            fg d2 = fh.d();
            d2.b = "TRIGGERING_WORKER_PIE_INELIGIBLE_NOT_SETTING_UP_SIGNAL_TRACKING";
            xVar.b(d2.a());
            return dl.n(new ac(androidx.work.l.f224a));
        }
        if (this.f1683a.w(eu.gk)) {
            x xVar2 = this.d;
            fg d3 = fh.d();
            d3.b = "TRIGGERING_WORKER_SETTING_UP_SIGNAL_TRACKING";
            xVar2.b(d3.a());
            ((com.google.android.apps.gsa.staticplugins.nga.f.a.c.a) this.b.a()).b();
        } else {
            x xVar3 = this.d;
            fg d4 = fh.d();
            d4.b = "TRIGGERING_WORKER_DISABLED_NOT_SETTING_UP_SIGNAL_TRACKING";
            xVar3.b(d4.a());
        }
        return dl.n(new ac(androidx.work.l.f224a));
    }
}
