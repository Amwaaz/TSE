package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.apps.gsa.shared.util.debug.a.b;
import j$.time.Instant;
import j$.util.DesugarDate;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/am.class */
abstract class am implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Instant f1104a = Instant.now();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a() {
        return com.google.android.apps.gsa.shared.util.b.f.f(DesugarDate.from(this.f1104a));
    }
}
