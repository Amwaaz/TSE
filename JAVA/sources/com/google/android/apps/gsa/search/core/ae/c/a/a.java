package com.google.android.apps.gsa.search.core.ae.c.a;

import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/c/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1083a;

    public a(e.a aVar) {
        this.f1083a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.c.a
    public final void a(long j) {
        ((h) this.f1083a.a()).c(new b(j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.c.a
    public final void b() {
        ((h) this.f1083a.a()).c(new d());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.c.a
    public final cn c(ba baVar) {
        g eVar = new e(baVar);
        ((h) this.f1083a.a()).c(eVar);
        return eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.c.a
    public final void d(ba baVar) {
        ((h) this.f1083a.a()).c(new c(baVar));
    }
}
