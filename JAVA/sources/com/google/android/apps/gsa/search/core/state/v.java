package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.ae.o.a;
import com.google.android.apps.gsa.shared.util.b.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/v.class */
public final class v extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1312a;
    public com.google.common.util.concurrent.cn b;

    public v(e.a aVar, a aVar2) {
        super(aVar, 64);
        this.f1312a = aVar2;
    }

    public final boolean a() {
        com.google.common.util.concurrent.cn cnVar = this.b;
        return (cnVar == null || cnVar.isDone()) ? false : true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.b("Requesting client follow on").a(new d(true != a() ? "false" : "true", false));
    }
}
