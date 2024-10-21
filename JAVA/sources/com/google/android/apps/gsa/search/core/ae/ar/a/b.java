package com.google.android.apps.gsa.search.core.ae.ar.a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.ae.ar.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/ar/a/b.class */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1068a;

    public b(e.a aVar) {
        this.f1068a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ar.a
    public final cn a(Intent intent) {
        g aVar = new a(intent);
        ((h) this.f1068a.a()).c(aVar);
        return aVar;
    }
}
