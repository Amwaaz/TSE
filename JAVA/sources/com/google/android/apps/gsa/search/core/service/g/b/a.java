package com.google.android.apps.gsa.search.core.service.g.b;

import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a.class */
public final class a implements com.google.android.apps.gsa.shared.util.debug.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1202a = new AtomicInteger();

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.b("global usage count").a(new d(Integer.valueOf(this.f1202a.get()), false));
    }
}
