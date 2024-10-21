package com.google.android.apps.gsa.search.core.ae.am.a;

import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/am/a/b.class */
public final class b implements com.google.android.apps.gsa.search.core.ae.am.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1061a;

    public b(e.a aVar) {
        this.f1061a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final cn a(HotwordDetectedEventData hotwordDetectedEventData) {
        g dVar = new d(hotwordDetectedEventData);
        ((h) this.f1061a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final cn c() {
        g fVar = new f();
        ((h) this.f1061a.a()).c(fVar);
        return fVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final cn f(HotwordResult hotwordResult, long j) {
        g gVar = new g(hotwordResult, j);
        ((h) this.f1061a.a()).c(gVar);
        return gVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void g(int i) {
        ((h) this.f1061a.a()).c(new a(i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void h(HotwordResult hotwordResult) {
        ((h) this.f1061a.a()).c(new e(hotwordResult));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void i(boolean z) {
        ((h) this.f1061a.a()).c(new h(z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void j(boolean z) {
        ((h) this.f1061a.a()).c(new i(z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void k() {
        ((h) this.f1061a.a()).c(new j());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void l() {
        ((h) this.f1061a.a()).c(new k());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void m() {
        ((h) this.f1061a.a()).c(new c());
    }
}
