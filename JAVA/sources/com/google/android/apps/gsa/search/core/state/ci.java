package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.service.e.b;
import com.google.android.apps.gsa.search.core.service.e.c;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.g.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ci.class */
public final class ci extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1264a;
    public final com.google.android.apps.gsa.w.a b;
    public final c c;
    public long d;

    public ci(e.a aVar, a aVar2, com.google.android.apps.gsa.w.a aVar3) {
        super(aVar, 68);
        this.c = new c(new b(com.google.android.apps.gsa.search.core.service.e.a.IDLE, 0L));
        this.f1264a = aVar2;
        this.b = aVar3;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("UserAdvocateState");
        fVar.b("lastObservedUserScenario").a(new d(this.c.f1188a, false));
    }
}
