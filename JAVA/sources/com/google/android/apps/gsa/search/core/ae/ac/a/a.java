package com.google.android.apps.gsa.search.core.ae.ac.a;

import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.c.bk;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/ac/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.ac.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1057a;

    public a(e.a aVar) {
        this.f1057a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ac.a
    public final cn a(bk bkVar) {
        g bVar = new b(bkVar);
        ((h) this.f1057a.a()).c(bVar);
        return bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ac.a
    public final void b(long j, boolean z) {
        ((h) this.f1057a.a()).c(new c(j, z));
    }
}
