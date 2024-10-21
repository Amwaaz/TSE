package com.google.android.apps.gsa.search.core.service.g.b.a.a;

import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a/a/k.class */
final class k implements com.google.android.apps.gsa.shared.util.debug.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1213a;
    public final cn b;
    public final com.google.android.apps.gsa.search.core.service.g.b.a c;
    public int d;

    public k(String str, cn cnVar, com.google.android.apps.gsa.search.core.service.g.b.a aVar) {
        this.f1213a = str;
        this.b = cnVar;
        this.c = aVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.b("usage count").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.d), false));
    }
}
