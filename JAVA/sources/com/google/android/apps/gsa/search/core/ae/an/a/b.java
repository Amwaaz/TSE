package com.google.android.apps.gsa.search.core.ae.an.a;

import com.google.android.apps.gsa.search.core.ae.an.a;
import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.b.fl;
import com.google.common.util.concurrent.cn;
import com.google.protos.o.b.ad;
import com.google.protos.o.b.bi;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/an/a/b.class */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1062a;

    public b(e.a aVar) {
        this.f1062a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.an.a
    public final cn a(bi biVar, String str) {
        g aVar = new a(biVar, str);
        ((h) this.f1062a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.an.a
    public final cn b(Query query, c cVar, ClientConfig clientConfig) {
        g dVar = new d(query, cVar, clientConfig);
        ((h) this.f1062a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.an.a
    public final cn c(String str, int i) {
        g eVar = new e(str, i);
        ((h) this.f1062a.a()).c(eVar);
        return eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.an.a
    public final cn d(v vVar, ad adVar, boolean z) {
        g fVar = new f(vVar, adVar, z);
        ((h) this.f1062a.a()).c(fVar);
        return fVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.an.a
    public final void f(com.google.android.apps.gsa.nga.shared.u.a aVar, fl flVar) {
        ((h) this.f1062a.a()).c(new c(aVar, flVar));
    }
}
