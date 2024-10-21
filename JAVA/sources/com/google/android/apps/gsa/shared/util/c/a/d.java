package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/d.class */
public class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ap f1528a;
    private final Executor b;

    public d(Executor executor, ap apVar) {
        this.b = executor;
        this.f1528a = apVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.m
    public final void a(ca caVar, Runnable runnable) {
        this.b.execute(new t(this, this.f1528a.a(caVar, 0L), runnable, 1));
    }
}
