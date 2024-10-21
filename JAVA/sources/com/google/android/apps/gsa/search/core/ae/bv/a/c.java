package com.google.android.apps.gsa.search.core.ae.bv.a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.ae.bv.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bv/a/c.class */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1081a;

    public c(e.a aVar) {
        this.f1081a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bv.a
    public final cn a(Intent intent) {
        g aVar = new a(intent);
        ((h) this.f1081a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bv.a
    public final cn b(int i) {
        g bVar = new b(i);
        ((h) this.f1081a.a()).c(bVar);
        return bVar;
    }
}
