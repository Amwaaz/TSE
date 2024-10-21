package com.google.android.apps.gsa.search.core.state.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/j.class */
public final class j extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1286a;

    public j(e.a aVar) {
        super(aVar, 10);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("CarConnectionState");
        fVar.b("IsCarConnected").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.f1286a), false));
    }
}
