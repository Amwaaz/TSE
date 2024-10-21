package com.google.android.apps.gsa.search.core.ae.bt.a;

import com.google.android.apps.gsa.search.core.ae.bt.b;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.i;
import com.google.common.util.concurrent.cn;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bt/a/e.class */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private final a f1079a;

    public e(a aVar) {
        this.f1079a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bt.b
    public final cn a(Query query) {
        g aVar = new a(query);
        ((h) this.f1079a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bt.b
    public final void b() {
        ((h) this.f1079a.a()).c(new b());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bt.b
    public final void c() {
        ((h) this.f1079a.a()).c(new d());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bt.b
    public final void d(int i, String str, Query query, i iVar, TtsRequest ttsRequest, boolean z, boolean z2, String str2, com.google.android.apps.gsa.search.core.ae.bt.a aVar) {
        ((h) this.f1079a.a()).c(new c(i, str, query, iVar, ttsRequest, z, z2, str2, aVar));
    }
}
