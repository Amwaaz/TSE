package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/n.class */
public final /* synthetic */ class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ca f1534a;
    public final Object b;
    private final int c;

    public /* synthetic */ n(Object obj, ca caVar, int i) {
        this.c = i;
        this.b = obj;
        this.f1534a = caVar;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.apps.gsa.shared.util.c.a.m, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        if (i == 0) {
            ((p) this.b).f1535a.a(this.f1534a, runnable);
            return;
        }
        if (i == 1) {
            ca caVar = this.f1534a;
            ((p) this.b).f1535a.a(caVar, new bb(runnable, caVar));
            return;
        }
        if (i == 2) {
            ((p) this.b).f1535a.a(this.f1534a, runnable);
            return;
        }
        if (i == 3) {
            ((p) this.b).f1535a.a(this.f1534a, runnable);
        } else if (i != 4) {
            ca caVar2 = this.f1534a;
            ((ba) this.b).f1523a.a(caVar2, new bb(runnable, caVar2));
        } else {
            ai aiVar = new ai(runnable, null);
            this.b.a(this.f1534a, aiVar);
        }
    }
}
