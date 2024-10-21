package com.google.android.apps.gsa.search.core.service;

import a.a;
import com.google.android.apps.gsa.search.core.service.g.b.b;
import com.google.common.f.a.e;
import com.google.common.f.y;
import com.google.common.util.concurrent.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/ad.class */
public final class ad implements bq {

    /* renamed from: a, reason: collision with root package name */
    final af f1149a;

    public ad(af afVar) {
        this.f1149a = afVar;
    }

    public final void gJ(Throwable th) {
        y e = af.f1150a.e();
        e.aj(e.a, "SearchServiceCore");
        a.dB(e, "Could not initialize ServiceWorker", (char) 7262, th);
    }

    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        ((b) this.f1149a.t.a()).c((com.google.android.apps.gsa.search.core.service.f.b) obj);
    }
}
