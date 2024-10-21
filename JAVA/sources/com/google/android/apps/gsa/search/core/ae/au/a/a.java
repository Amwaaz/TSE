package com.google.android.apps.gsa.search.core.ae.au.a;

import com.google.android.apps.gsa.search.core.l.aj;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/au/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.au.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1069a;

    public a(e.a aVar) {
        this.f1069a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.au.a
    public final cn a(long j, aj ajVar, Query query) {
        g dVar = new d(j, ajVar, query);
        ((h) this.f1069a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.au.a
    public final void b() {
        ((h) this.f1069a.a()).c(new b());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.au.a
    public final void c() {
        ((h) this.f1069a.a()).c(new c());
    }
}
