package com.google.android.apps.gsa.search.core.ae.o.a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/o/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.o.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1088a;

    public a(e.a aVar) {
        this.f1088a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn a(String str) {
        g bVar = new b(str);
        ((h) this.f1088a.a()).c(bVar);
        return bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn b() {
        d dVar = new d();
        ((h) this.f1088a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn c() {
        g fVar = new f();
        ((h) this.f1088a.a()).c(fVar);
        return fVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn f() {
        g gVar = new g();
        ((h) this.f1088a.a()).c(gVar);
        return gVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void g(Intent intent) {
        ((h) this.f1088a.a()).c(new c(intent));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void h() {
        ((h) this.f1088a.a()).c(new e());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void i(String str, String str2, Bundle bundle) {
        ((h) this.f1088a.a()).c(new h(str, str2, bundle));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void j() {
        ((h) this.f1088a.a()).c(new i());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void k() {
        ((h) this.f1088a.a()).c(new j());
    }
}
