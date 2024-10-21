package com.google.android.apps.gsa.search.core.state.c.a;

import com.google.android.apps.gsa.search.core.m.a.a.a;
import com.google.android.apps.gsa.search.core.state.bk;
import com.google.android.apps.gsa.search.core.state.f;
import com.google.android.apps.gsa.shared.search.Query;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/c/a/b.class */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final k.a.a f1258a;
    private final k.a.a b;

    public b(k.a.a aVar, k.a.a aVar2) {
        this.f1258a = aVar;
        this.b = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.m.a.a.a
    public final /* bridge */ /* synthetic */ com.google.android.apps.gsa.search.core.m.a.a.b a(Query query) {
        query.getClass();
        f fVar = (f) this.f1258a.a();
        fVar.getClass();
        bk bkVar = (bk) this.b.a();
        bkVar.getClass();
        return new a(query, fVar, bkVar);
    }
}
