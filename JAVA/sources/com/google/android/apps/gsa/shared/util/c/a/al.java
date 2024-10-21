package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.apps.gsa.shared.util.c.bp;
import com.google.android.apps.gsa.shared.util.c.bq;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/al.class */
public final class al implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final bq f1513a;
    private final ao b;

    public al(ao aoVar, bq bqVar) {
        this.b = aoVar;
        this.f1513a = bqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable instanceof bp) {
            this.b.f1515a.post((bp) runnable);
        } else {
            ao aoVar = this.b;
            aoVar.f1515a.post(new ak(this, runnable));
        }
    }
}
