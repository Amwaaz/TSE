package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.v.n;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/an.class */
public final class an extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1238a;
    public final com.google.android.apps.gsa.search.core.ae.s.a b;
    public boolean c;
    public long d;
    public long e;
    public n f;

    public an(a aVar, a aVar2, com.google.android.apps.gsa.search.core.ae.s.a aVar3) {
        super(aVar, 70);
        this.e = 0L;
        this.f = n.f1578a;
        this.f1238a = aVar2;
        this.b = aVar3;
    }

    public final void a() {
        this.b.c();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("NetworkMonitoringState");
        fVar.b("shouldBeMonitoring").a(new d(Boolean.valueOf(this.c), false));
        fVar.b("sessionIdForMonitoring").a(new d(Long.valueOf(this.d), false));
    }
}
