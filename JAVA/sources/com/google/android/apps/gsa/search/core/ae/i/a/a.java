package com.google.android.apps.gsa.search.core.ae.i.a;

import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.state.o;
import com.google.android.apps.gsa.shared.search.Query;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/i/a/a.class */
public final class a implements com.google.android.apps.gsa.search.core.ae.i.a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1085a;

    public a(e.a aVar) {
        this.f1085a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.i.a
    public final void a(Query query, o oVar) {
        ((h) this.f1085a.a()).c(new b(query, oVar));
    }
}
