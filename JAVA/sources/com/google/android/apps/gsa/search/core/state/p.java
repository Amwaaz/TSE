package com.google.android.apps.gsa.search.core.state;

import com.google.android.libraries.gsa.h.h;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/p.class */
public final class p extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1307a;
    public final com.google.android.apps.gsa.search.core.ae.i.a b;
    public long c;
    public final o d;

    public p(a aVar, a aVar2, a aVar3, com.google.android.apps.gsa.search.core.ae.i.a aVar4, h hVar) {
        super(aVar, 73);
        this.f1307a = aVar3;
        this.b = aVar4;
        this.d = new o(aVar2, hVar);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("AssistantTextSearchState");
    }
}
