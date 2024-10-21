package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.service.d.a.a;
import com.google.android.apps.gsa.search.shared.service.d.a.b;
import com.google.android.libraries.gsa.h.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bp.class */
final class bp extends b {
    final bq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(final bq bqVar, h hVar) {
        super(new a(bqVar) { // from class: com.google.android.apps.gsa.search.core.state.bo

            /* renamed from: a, reason: collision with root package name */
            public final bq f1252a;

            {
                this.f1252a = bqVar;
            }

            @Override // com.google.android.apps.gsa.search.shared.service.d.a.a
            public final int a() {
                return this.f1252a.k;
            }
        }, hVar);
        this.b = bqVar;
    }

    @Override // com.google.android.apps.gsa.search.shared.service.d.a.b, com.google.android.apps.gsa.p.e
    public final boolean c() {
        return !((com.google.android.apps.gsa.search.core.state.d.ai) this.b.e.a()).k;
    }
}
