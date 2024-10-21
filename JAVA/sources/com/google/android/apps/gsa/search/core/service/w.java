package com.google.android.apps.gsa.search.core.service;

import com.google.android.libraries.gsa.h.f;
import com.google.common.f.h;
import com.google.common.util.concurrent.bq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/w.class */
public final class w implements bq {

    /* renamed from: a, reason: collision with root package name */
    final long f1223a;
    final long b;
    final x c;

    public w(x xVar, long j, long j2) {
        this.f1223a = j;
        this.b = j2;
        this.c = xVar;
    }

    public final void gJ(Throwable th) {
        h g = x.f1224a.f().g(th);
        g.ak(7239);
        g.r("Requesting client %d to unbind immediately as the original task failed", this.f1223a);
        this.c.e.n("Request client to unbind", new ar(this, this.f1223a, 1));
    }

    public final void gK(Object obj) {
        final long j = this.f1223a;
        this.c.e.o("Request client to unbind", this.b, new f(this, j) { // from class: com.google.android.apps.gsa.search.core.service.v

            /* renamed from: a, reason: collision with root package name */
            public final w f1222a;
            public final long b;

            {
                this.f1222a = this;
                this.b = j;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                this.f1222a.c.j(this.b);
            }
        });
    }
}
