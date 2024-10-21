package com.google.android.apps.gsa.search.core.google.gaia.b.a;

import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.libraries.search.account.d.d;
import com.google.android.libraries.search.account.k;
import com.google.apps.tiktok.tracing.contrib.c.e;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.r;
import e.a;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/b/a/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f1107a;
    private final d b;
    private final a c;
    private final a d;
    private final Executor e;
    private final a f;

    public c(a aVar, d dVar, a aVar2, a aVar3, Executor executor, a aVar4) {
        this.f1107a = aVar;
        this.b = dVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = executor;
        this.f = aVar4;
    }

    public final cn a() {
        return e.g(b()).h(new a(), this.e);
    }

    public final cn b() {
        if (((p) this.d.a()).w(en.X)) {
            return ((k) this.c.a()).d();
        }
        e g = e.g(((an) this.f1107a.a()).o());
        final d dVar = this.b;
        return g.i(new r(dVar) { // from class: com.google.android.apps.gsa.search.core.google.gaia.b.a.b

            /* renamed from: a, reason: collision with root package name */
            public final d f1106a;

            {
                this.f1106a = dVar;
            }

            public final cn apply(Object obj) {
                return this.f1106a.a((String) obj);
            }
        }, this.e);
    }
}
