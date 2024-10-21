package com.google.android.apps.gsa.search.core.state.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/ah.class */
public final class ah extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public int f1278a;

    public ah(e.a aVar) {
        super(aVar, 12);
        this.f1278a = 0;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("RecognizerState");
        fVar.b("mRecognitionState").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.f1278a), false));
    }
}
