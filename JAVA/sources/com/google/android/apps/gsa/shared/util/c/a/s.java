package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/s.class */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    private final cr f1536a;

    public s(cr crVar) {
        this.f1536a = crVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.m
    public final void a(ca caVar, Runnable runnable) {
        this.f1536a.execute(runnable);
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.q
    public final void b(ca caVar, Runnable runnable, long j) {
        dl.y(this.f1536a.d(runnable, j, TimeUnit.MILLISECONDS), new r(), ay.a);
    }
}
