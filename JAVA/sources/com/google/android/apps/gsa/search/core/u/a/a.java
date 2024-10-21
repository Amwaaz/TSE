package com.google.android.apps.gsa.search.core.u.a;

import com.google.android.apps.gsa.shared.util.c.aj;
import com.google.android.apps.gsa.v.c;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/u/a/a.class */
final class a extends aj {

    /* renamed from: a, reason: collision with root package name */
    final b f1316a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super("Forced telemetry persistence", 2, 8);
        this.f1316a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f1316a.f1317a.b();
        return c.f1836a;
    }
}
