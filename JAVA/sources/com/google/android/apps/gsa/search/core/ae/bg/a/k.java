package com.google.android.apps.gsa.search.core.ae.bg.a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.ae.bg.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.c.iv;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.ap.g.a.ae;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bg/a/k.class */
public final class k implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1071a;

    public k(e.a aVar) {
        this.f1071a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final cn a(Query query) {
        g eVar = new e(query);
        ((h) this.f1071a.a()).c(eVar);
        return eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final cn c(Query query, ae aeVar) {
        g hVar = new h(query, aeVar);
        ((h) this.f1071a.a()).c(hVar);
        return hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final cn f(Suggestion suggestion) {
        g jVar = new j(suggestion);
        ((h) this.f1071a.a()).c(jVar);
        return jVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final cn g(long j, boolean z, Bundle bundle) {
        g lVar = new l(j, z, bundle);
        ((h) this.f1071a.a()).c(lVar);
        return lVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final cn h() {
        g mVar = new m();
        ((h) this.f1071a.a()).c(mVar);
        return mVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final cn i(long j) {
        g nVar = new n(j);
        ((h) this.f1071a.a()).c(nVar);
        return nVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void j(int i) {
        ((h) this.f1071a.a()).c(new a(i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void k() {
        ((h) this.f1071a.a()).c(new b());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void l() {
        ((h) this.f1071a.a()).c(new d());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void m(Response response, iv ivVar, Query query) {
        ((h) this.f1071a.a()).c(new f(response, ivVar, query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void n(Query query, boolean z) {
        ((h) this.f1071a.a()).c(new g(query, z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void o() {
        ((h) this.f1071a.a()).c(new i());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void p(ClientConfig clientConfig, String str) {
        ((h) this.f1071a.a()).c(new o(clientConfig, str));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void q(Bundle bundle) {
        ((h) this.f1071a.a()).c(new p(bundle));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bg.a
    public final void r(Query query, int i, Query query2, Query query3) {
        ((h) this.f1071a.a()).c(new c(query, i, query2, query3));
    }
}
