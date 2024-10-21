package com.google.android.apps.gsa.search.core.ae.bw.a;

import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.core.ae.bw.d;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.aq.b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.at;
import com.google.common.util.concurrent.cn;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bw/a/f.class */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f1082a;

    public f(a aVar) {
        this.f1082a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.d
    public final cn a(Query query, ClientConfig clientConfig, c cVar, com.google.android.apps.gsa.search.core.m.i.a aVar, b bVar, at atVar, cn cnVar) {
        g cVar2 = new c(query, clientConfig, cVar, aVar, bVar, atVar, cnVar);
        ((h) this.f1082a.a()).c(cVar2);
        return cVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.d
    public final cn c(Query query, c cVar) {
        g dVar = new d(query, cVar);
        ((h) this.f1082a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.d
    public final void f(Query query) {
        ((h) this.f1082a.a()).c(new a(query));
    }
}
