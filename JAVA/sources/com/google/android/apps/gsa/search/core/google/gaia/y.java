package com.google.android.apps.gsa.search.core.google.gaia;

import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/y.class */
public final /* synthetic */ class y implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final an f1117a;
    private final int b;

    public /* synthetic */ y(an anVar, int i) {
        this.b = i;
        this.f1117a = anVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            runnable.getClass();
            this.f1117a.c.n("backgroundExecutor", new z(runnable));
            return;
        }
        if (i == 1) {
            runnable.getClass();
            this.f1117a.c.n("backgroundExecutor", new z(runnable));
        } else if (i == 2) {
            runnable.getClass();
            this.f1117a.e.n("LoginHelperImpl::sequenceBroadcasts", new z(runnable));
        } else if (i != 3) {
            runnable.getClass();
            this.f1117a.c.n("backgroundExecutor", new z(runnable));
        } else {
            runnable.getClass();
            this.f1117a.d.n("blockingExecutor", new z(runnable));
        }
    }
}
