package com.google.android.apps.gsa.search.core.ae.bi.a;

import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.shared.aq.b;
import com.google.common.util.concurrent.cn;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bi/a/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f1072a;

    public d(a aVar) {
        this.f1072a = aVar;
    }

    public final cn a(b bVar, long j) {
        g aVar = new a(bVar, j);
        ((h) this.f1072a.a()).c(aVar);
        return aVar;
    }

    public final cn b(b bVar) {
        g bVar2 = new b(bVar);
        ((h) this.f1072a.a()).c(bVar2);
        return bVar2;
    }

    public final cn c(b bVar, long j) {
        g cVar = new c(bVar, j);
        ((h) this.f1072a.a()).c(cVar);
        return cVar;
    }
}
