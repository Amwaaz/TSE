package com.google.android.apps.gsa.search.core.ae.af.a;

import com.google.android.apps.gsa.search.core.ae.af.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/af/a/c.class */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1059a;

    public c(e.a aVar) {
        this.f1059a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.af.a
    public final cn a(long j) {
        g bVar = new b(j);
        ((h) this.f1059a.a()).c(bVar);
        return bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.af.a
    public final void b() {
        ((h) this.f1059a.a()).c(new a());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.af.a
    public final void c() {
        ((h) this.f1059a.a()).c(new e());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.af.a
    public final void d() {
        ((h) this.f1059a.a()).c(new d());
    }
}
