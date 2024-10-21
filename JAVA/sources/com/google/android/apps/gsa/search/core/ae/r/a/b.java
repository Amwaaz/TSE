package com.google.android.apps.gsa.search.core.ae.r.a;

import com.google.android.apps.gsa.search.core.ae.r.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/r/a/b.class */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1089a;

    public b(e.a aVar) {
        this.f1089a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.r.a
    public final cn a(long j) {
        g aVar = new a(j);
        ((h) this.f1089a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.r.a
    public final cn b(long j) {
        g cVar = new c(j);
        ((h) this.f1089a.a()).c(cVar);
        return cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.r.a
    public final cn c(long j) {
        g dVar = new d(j);
        ((h) this.f1089a.a()).c(dVar);
        return dVar;
    }
}
