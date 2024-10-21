package com.google.android.apps.gsa.search.core.ae.v.a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/v/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.v.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1093a;

    public a(e.a aVar) {
        this.f1093a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.v.a
    public final cn a() {
        g cVar = new c();
        ((h) this.f1093a.a()).c(cVar);
        return cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.v.a
    public final void b(Intent intent) {
        ((h) this.f1093a.a()).c(new b(intent));
    }
}
