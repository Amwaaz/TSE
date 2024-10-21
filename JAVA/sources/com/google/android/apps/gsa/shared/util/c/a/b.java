package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.util.concurrent.bn;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/b.class */
final class b extends bn implements RunnableFuture {

    /* renamed from: a, reason: collision with root package name */
    final c f1522a;
    private final ai b;
    private final ah c;

    public b(c cVar, ai aiVar, ah ahVar) {
        this.f1522a = cVar;
        this.b = aiVar;
        this.c = ahVar;
    }

    protected final /* synthetic */ cn c() {
        return this.b;
    }

    protected final /* synthetic */ Future d() {
        return this.b;
    }

    protected final /* synthetic */ Object ia() {
        return this.b;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.f1522a.f1527a.c(this.c);
        try {
            this.b.run();
        } finally {
            c cVar = this.f1522a;
            cVar.f1527a.b(this.c);
        }
    }
}
