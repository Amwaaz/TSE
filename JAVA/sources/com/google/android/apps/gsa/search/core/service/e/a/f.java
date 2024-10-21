package com.google.android.apps.gsa.search.core.service.e.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.apps.tiktok.tracing.au;
import com.google.common.b.fg;
import com.google.common.b.ni;
import com.google.common.b.oo;
import com.google.common.base.aw;
import com.google.common.f.ab;
import com.google.common.f.y;
import com.google.common.util.concurrent.bq;
import j$.util.DesugarCollections;
import java.util.Collection;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a/f.class */
final class f implements bq {

    /* renamed from: a, reason: collision with root package name */
    final String f1178a;
    final h b;

    public f(h hVar, String str) {
        this.f1178a = str;
        this.b = hVar;
    }

    public final void gJ(Throwable th) {
        this.b.h.remove(this.f1178a);
        boolean z = th instanceof com.google.android.apps.gsa.search.core.service.g.a.a;
        String str = this.f1178a;
        if (z) {
            com.google.common.f.h f = h.f1180a.f();
            f.aj(com.google.common.f.a.e.a, "WorkController");
            com.google.common.f.h hVar = f;
            hVar.ak(7365);
            hVar.s("Loading failed for worker [%s]: worker not found", str);
        } else if (th instanceof com.google.android.apps.gsa.search.core.service.b.b) {
            com.google.common.f.h d = h.f1180a.d();
            d.aj(com.google.common.f.a.e.a, "WorkController");
            com.google.common.f.h hVar2 = d;
            hVar2.ak(7364);
            hVar2.s("Worker [%s] was not acquired because WorkerManager is disposed", str);
        } else {
            y e = h.f1180a.e();
            e.aj(com.google.common.f.a.e.a, "WorkController");
            aus.b(e, "Loading failed for worker [%s]", str, (char) 7363, th);
        }
        h hVar3 = this.b;
        fg fgVar = new fg(4);
        j jVar = hVar3.b;
        for (com.google.android.apps.gsa.search.core.service.e.g gVar : DesugarCollections.unmodifiableCollection(jVar.b.b)) {
            if (gVar.i().equals(str) && jVar.c(gVar)) {
                fgVar.h(gVar);
            }
        }
        ni g = fgVar.g();
        int i = g.d;
        for (int i2 = 0; i2 < i; i2++) {
            ((com.google.android.apps.gsa.search.core.service.e.g) g.get(i2)).o(th);
        }
    }

    public final /* synthetic */ void gK(Object obj) {
        final com.google.android.apps.gsa.search.core.service.f.b bVar = (com.google.android.apps.gsa.search.core.service.f.b) obj;
        au e = this.b.i.e("WorkController:performQueuedWork");
        try {
            ab abVar = com.google.common.f.a.e.a;
            this.b.h.remove(this.f1178a);
            final h hVar = this.b;
            hVar.e("Perform work for worker [" + bVar.id() + "]", new com.google.android.libraries.gsa.h.f(hVar, bVar) { // from class: com.google.android.apps.gsa.search.core.service.e.a.e

                /* renamed from: a, reason: collision with root package name */
                public final h f1177a;
                public final com.google.android.apps.gsa.search.core.service.f.b b;

                {
                    this.f1177a = hVar;
                    this.b = bVar;
                }

                @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                public final void run() {
                    h hVar2 = this.f1177a;
                    com.google.android.apps.gsa.search.core.service.f.b bVar2 = this.b;
                    try {
                        j jVar = hVar2.b;
                        final String id = bVar2.id();
                        Collection<com.google.android.apps.gsa.search.core.service.e.g> be = oo.be(jVar.b(), new aw(id) { // from class: com.google.android.apps.gsa.search.core.service.e.a.i

                            /* renamed from: a, reason: collision with root package name */
                            public final String f1181a;

                            {
                                this.f1181a = id;
                            }

                            public final boolean a(Object obj2) {
                                return ((com.google.android.apps.gsa.search.core.service.e.g) obj2).i().equals(this.f1181a);
                            }
                        });
                        ab abVar2 = com.google.common.f.a.e.a;
                        for (com.google.android.apps.gsa.search.core.service.e.g gVar : be) {
                            if (!ag.o(((com.google.android.apps.gsa.search.core.service.g.b.b) hVar2.d.a()).b(gVar.i()), Throwable.class)) {
                                hVar2.h(gVar, bVar2);
                            }
                        }
                    } finally {
                        ((com.google.android.apps.gsa.search.core.service.g.b.b) hVar2.d.a()).c(bVar2);
                    }
                }
            });
            if (e != null) {
                e.close();
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
