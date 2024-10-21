package com.google.android.apps.gsa.nga.engine.v.a;

import com.google.android.apps.gsa.nga.engine.v.u;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.shared.o.b.a.a;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.performance.primes.m;
import com.google.android.libraries.performance.primes.o;
import com.google.common.base.ci;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/ap.class */
public final class ap {
    private static final m d = new m("NGA_EVENT_TYPE_ENUM");

    /* renamed from: a, reason: collision with root package name */
    public final ci f810a;
    public final af b;
    public final a c;
    private final o e;
    private final h f;

    public ap(ci ciVar, af afVar, o oVar, h hVar, a aVar) {
        this.f810a = ciVar;
        this.b = afVar;
        this.e = oVar;
        this.f = hVar;
        this.c = aVar;
    }

    public final u a(int i, ah ahVar) {
        return new ar(this.e, this.f810a, this.b, this.f, d, ahVar, i, this.c);
    }

    public final /* synthetic */ void b(int i, ah ahVar, cn cnVar) {
        u a2 = a(i, ahVar);
        try {
            a2.b(cnVar);
            a2.a();
        } catch (Throwable th) {
            try {
                a2.a();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
