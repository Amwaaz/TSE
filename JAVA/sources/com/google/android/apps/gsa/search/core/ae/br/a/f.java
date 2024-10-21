package com.google.android.apps.gsa.search.core.ae.br.a;

import com.google.android.apps.gsa.search.core.ae.br.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.c.iy;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/br/a/f.class */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1078a;

    public f(e.a aVar) {
        this.f1078a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.br.a
    public final cn a() {
        g aVar = new a();
        ((h) this.f1078a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.br.a
    public final cn c() {
        g bVar = new b();
        ((h) this.f1078a.a()).c(bVar);
        return bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.br.a
    public final cn d() {
        g cVar = new c();
        ((h) this.f1078a.a()).c(cVar);
        return cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.br.a
    public final cn f(iy iyVar) {
        g dVar = new d(iyVar);
        ((h) this.f1078a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.br.a
    public final cn g(boolean z) {
        g eVar = new e(z);
        ((h) this.f1078a.a()).c(eVar);
        return eVar;
    }
}
