package com.google.android.apps.gsa.search.core.ae.ae.a;

import com.google.android.apps.gsa.search.core.ae.ae.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.c.kg;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/ae/a/b.class */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1058a;

    public b(e.a aVar) {
        this.f1058a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ae.a
    public final cn a(kg kgVar) {
        g aVar = new a(kgVar);
        ((h) this.f1058a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ae.a
    public final void b() {
        ((h) this.f1058a.a()).c(new c());
    }
}
