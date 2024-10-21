package com.google.android.apps.gsa.search.core.ae.bj.a;

import com.google.android.apps.gsa.search.core.ae.bj.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bj/a/b.class */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1073a;

    public b(e.a aVar) {
        this.f1073a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void a() {
        ((h) this.f1073a.a()).c(new a());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void b(String str, String str2) {
        ((h) this.f1073a.a()).c(new c(str, str2));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void c(SearchError searchError) {
        ((h) this.f1073a.a()).c(new d(searchError));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void f(int i) {
        ((h) this.f1073a.a()).c(new e(i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void g(int i, String str, String str2) {
        ((h) this.f1073a.a()).c(new f(i, str, str2));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void h(int i, int i2) {
        ((h) this.f1073a.a()).c(new g(i, i2));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void i(Query query) {
        ((h) this.f1073a.a()).c(new h(query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void j(String str, String str2, String str3) {
        ((h) this.f1073a.a()).c(new i(str, str2, str3));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void k() {
        ((h) this.f1073a.a()).c(new j());
    }
}
