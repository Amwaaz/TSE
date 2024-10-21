package com.google.android.apps.gsa.search.core.ae.j.a;

import com.google.android.apps.gsa.search.core.ae.j.b;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.d.e;
import com.google.android.libraries.search.d.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/j/a/a.class */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1086a;

    public a(e.a aVar) {
        this.f1086a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void a() {
        ((h) this.f1086a.a()).c(new b());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void c(long j) {
        ((h) this.f1086a.a()).c(new c(j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void f(long j) {
        ((h) this.f1086a.a()).c(new d(j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void g() {
        ((h) this.f1086a.a()).c(new e());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void h(boolean z) {
        ((h) this.f1086a.a()).c(new f(z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void i(Query query) {
        ((h) this.f1086a.a()).c(new g(query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void j(f fVar, e eVar, com.google.android.apps.gsa.search.core.ae.j.a aVar, boolean z) {
        ((h) this.f1086a.a()).c(new h(fVar, eVar, aVar, z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.j.b
    public final void k() {
        ((h) this.f1086a.a()).c(new i());
    }
}
