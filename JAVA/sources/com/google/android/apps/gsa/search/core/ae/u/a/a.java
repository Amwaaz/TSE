package com.google.android.apps.gsa.search.core.ae.u.a;

import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.shared.service.c.ji;
import com.google.android.apps.gsa.shared.search.Query;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/u/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.u.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1092a;

    public a(e.a aVar) {
        this.f1092a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.u.a
    public final void a(ji jiVar) {
        ((h) this.f1092a.a()).c(new b(jiVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.u.a
    public final void b() {
        ((h) this.f1092a.a()).c(new c());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.u.a
    public final void c() {
        ((h) this.f1092a.a()).c(new d());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.u.a
    public final void d() {
        ((h) this.f1092a.a()).c(new e());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.u.a
    public final void f(Query query) {
        ((h) this.f1092a.a()).c(new f(query));
    }
}
