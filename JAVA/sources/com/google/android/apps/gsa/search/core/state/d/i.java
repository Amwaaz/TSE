package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.shared.v.s;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/i.class */
public final class i extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1285a;

    public i(e.a aVar, e.a aVar2) {
        super(aVar, 20);
        this.f1285a = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        ((s) this.f1285a.a()).b(false);
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"google_account"};
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("AuthState");
    }
}
