package com.google.android.apps.gsa.search.core.service.g.b.a.a;

import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a/a/d.class */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f1206a;
    private final cn b;
    private final k c;
    private final e.a d;
    private boolean e;

    public d(String str, cn cnVar, e.a aVar, e.a aVar2, com.google.android.apps.gsa.search.core.service.g.b.a aVar3) {
        this.b = cnVar;
        this.c = new k(str, cnVar, aVar3);
        this.f1206a = aVar;
        this.d = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.service.b.a
    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        dl.y(this.b, new c(this), ay.a);
    }

    @Override // com.google.android.apps.gsa.search.core.service.g.b.a.a.b
    public final a b() {
        cl.v(!this.e, "acquireWorker() called after disposal");
        k kVar = this.c;
        kVar.c.f1202a.incrementAndGet();
        ab abVar = com.google.common.f.a.e.a;
        kVar.d++;
        return new a(kVar.b, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.common.util.concurrent.cn, java.lang.Object] */
    @Override // com.google.android.apps.gsa.search.core.service.g.b.a.a.b
    public final b c() {
        cl.v(!this.e, "unloadWorkerIfDisused() called after disposal");
        if (ag.p(this.b) && this.c.d == 0) {
            com.google.android.apps.gsa.search.core.service.f.b bVar = (com.google.android.apps.gsa.search.core.service.f.b) ag.i(this.b);
            j jVar = (j) this.f1206a.a();
            at k = jVar.c(bVar) ? at.k(jVar.a(bVar, true)) : com.google.common.base.a.a;
            if (k.h()) {
                return ((h) this.d.a()).a(this.c.f1213a, k.c());
            }
        }
        return this;
    }

    @Override // com.google.android.apps.gsa.search.core.service.g.b.a.a.b
    public final void e() {
        cl.v(!this.e, "releaseWorker() called after disposal");
        if (!ag.p(this.b)) {
            throw new AssertionError(String.format("Tried to release worker when it has not been successfully loaded: [%s]", this.c.f1213a));
        }
        k kVar = this.c;
        cl.y(kVar.d > 0, "Tried to release a worker with no usages: [%s]", kVar.f1213a);
        com.google.android.apps.gsa.search.core.service.g.b.a aVar = kVar.c;
        cl.v(aVar.f1202a.get() > 0, "Tried to decrement the global worker usage counter when there was no usages");
        aVar.f1202a.decrementAndGet();
        ab abVar = com.google.common.f.a.e.a;
        kVar.d--;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkerLoaded");
        fVar.b("worker future").a(new com.google.android.apps.gsa.shared.util.b.d(ag.l(this.b), false));
        if (ag.n(this.b)) {
            return;
        }
        fVar.k(this.c);
    }
}
