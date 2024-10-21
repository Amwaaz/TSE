package com.google.android.apps.gsa.search.core.ae.bu.a;

import com.google.android.apps.gsa.search.core.ae.bu.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bu/a/d.class */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1080a;

    public d(e.a aVar) {
        this.f1080a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bu.a
    public final cn a(ClientConfig clientConfig, int i, Query query, long j, boolean z) {
        g aVar = new a(clientConfig, i, query, j, z);
        ((h) this.f1080a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bu.a
    public final void b(int i, Query query, long j) {
        ((h) this.f1080a.a()).c(new b(i, query, j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bu.a
    public final void c() {
        ((h) this.f1080a.a()).c(new c());
    }
}
