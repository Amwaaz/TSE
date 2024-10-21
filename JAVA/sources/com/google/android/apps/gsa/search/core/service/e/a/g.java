package com.google.android.apps.gsa.search.core.service.e.a;

import com.google.common.util.concurrent.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a/g.class */
final class g implements bq {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.apps.gsa.search.core.service.e.g f1179a;
    final com.google.android.apps.gsa.search.core.service.f.b b;
    final h c;

    public g(h hVar, com.google.android.apps.gsa.search.core.service.e.g gVar, com.google.android.apps.gsa.search.core.service.f.b bVar) {
        this.f1179a = gVar;
        this.b = bVar;
        this.c = hVar;
    }

    public final void gJ(Throwable th) {
        this.f1179a.b.f(this.c.g.f().toEpochMilli(), com.google.android.apps.gsa.search.core.service.e.e.FAILED);
        this.c.f(this.b);
        if (this.f1179a.e() == com.google.android.apps.gsa.search.core.service.e.h.CONTROLLED_BY_USER) {
            return;
        }
        AssertionError assertionError = new AssertionError("Work requests returning `void` should never fail or throw any exceptions.");
        assertionError.initCause(th);
        throw assertionError;
    }

    public final void gK(Object obj) {
        this.f1179a.b.f(this.c.g.f().toEpochMilli(), com.google.android.apps.gsa.search.core.service.e.e.SUCCESS);
        this.c.f(this.b);
    }
}
