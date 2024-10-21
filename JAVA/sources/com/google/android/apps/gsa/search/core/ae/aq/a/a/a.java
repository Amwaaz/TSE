package com.google.android.apps.gsa.search.core.ae.aq.a.a;

import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/aq/a/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.aq.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1064a;

    public a(e.a aVar) {
        this.f1064a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.a.a
    public final cn a(Query query, c cVar) {
        g bVar = new b(query, cVar);
        ((h) this.f1064a.a()).c(bVar);
        return bVar;
    }
}
