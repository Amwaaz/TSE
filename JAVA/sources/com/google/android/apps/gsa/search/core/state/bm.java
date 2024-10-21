package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.b.d;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bm.class */
public final class bm extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final BitFlags f1250a;
    public Query b;

    public bm(a aVar) {
        super(aVar, 53);
        this.f1250a = new BitFlags(getClass(), "FLAG_", 0L);
        this.b = Query.b;
    }

    public final boolean a() {
        return BitFlags.f(this.f1250a.b, 1L);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ResultsUiState");
        fVar.b("flags").a(new d(this.f1250a.toString(), false));
    }

    public final String toString() {
        return "ResultsUiState[query=" + String.valueOf(this.b) + ", flags=" + this.f1250a.b() + "]";
    }
}
