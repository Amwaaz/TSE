package com.google.android.apps.gsa.search.core.service.g.b.a.a;

import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.common.base.cl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.r;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a/a/g.class */
public final class g implements b {
    private static final com.google.common.f.j c = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.service.g.b.a.a.g");

    /* renamed from: a, reason: collision with root package name */
    public final String f1209a;
    public final e.a b;
    private final cn d;
    private final e.a e;
    private boolean f;

    public g(String str, cn cnVar, e.a aVar, e.a aVar2) {
        this.f1209a = str;
        this.d = cnVar;
        this.b = aVar;
        this.e = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.service.b.a
    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
    }

    @Override // com.google.android.apps.gsa.search.core.service.g.b.a.a.b
    public final a b() {
        cl.v(!this.f, "acquireWorker() called after disposal");
        cn h = com.google.common.util.concurrent.i.h(this.d, new r(this) { // from class: com.google.android.apps.gsa.search.core.service.g.b.a.a.f

            /* renamed from: a, reason: collision with root package name */
            public final g f1208a;

            {
                this.f1208a = this;
            }

            public final cn apply(Object obj) {
                g gVar = this.f1208a;
                return ((com.google.android.apps.gsa.search.core.service.f.a.e) gVar.b.a()).a(gVar.f1209a);
            }
        }, ay.a);
        e eVar = (e) this.e.a();
        e.a b = e.c.c.b(eVar.f1207a.a);
        b.getClass();
        e.a b2 = e.c.c.b(eVar.b.a);
        b2.getClass();
        com.google.android.apps.gsa.search.core.service.g.b.a aVar = (com.google.android.apps.gsa.search.core.service.g.b.a) eVar.c.a();
        aVar.getClass();
        return new d(this.f1209a, h, b, b2, aVar).b();
    }

    @Override // com.google.android.apps.gsa.search.core.service.g.b.a.a.b
    public final b c() {
        cl.v(!this.f, "unloadWorkerIfDisused() called after disposal");
        return this;
    }

    @Override // com.google.android.apps.gsa.search.core.service.g.b.a.a.b
    public final void e() {
        com.google.common.f.h e = c.e();
        e.ak(7420);
        e.s("Attempt to release a not loaded worker [%s]", this.f1209a);
        throw new AssertionError();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkerNotLoaded");
        fVar.b("unloading future").a(new com.google.android.apps.gsa.shared.util.b.d(ag.l(this.d), false));
    }
}
