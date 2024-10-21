package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.core.state.ap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/l.class */
public final class l extends com.google.android.apps.gsa.search.core.state.ae implements ap {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.apps.gsa.shared.v.n f1288a;

    public l(e.a aVar) {
        super(aVar, 1);
        this.f1288a = com.google.android.apps.gsa.shared.v.n.f1578a;
    }

    public final void c(com.google.android.apps.gsa.shared.v.n nVar) {
        if (this.f1288a.equals(nVar)) {
            return;
        }
        this.f1288a = nVar;
        an();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ConnectivityState");
        fVar.n("connectivityInfo", this.f1288a);
    }
}
