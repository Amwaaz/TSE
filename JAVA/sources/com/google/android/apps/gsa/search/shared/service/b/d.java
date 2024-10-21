package com.google.android.apps.gsa.search.shared.service.b;

import com.google.android.apps.gsa.search.core.service.ad;
import com.google.android.apps.gsa.search.core.service.af;
import com.google.android.apps.gsa.search.core.service.z;
import com.google.android.apps.gsa.search.shared.service.y;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/b/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f1336a;
    public int b;
    public af c;
    private final k.a.a d;
    private final h e;

    public d(k.a.a aVar, h hVar) {
        this.d = aVar;
        this.e = hVar;
    }

    public final void a() {
        int i = this.f1336a;
        if (i > 0) {
            int i2 = i - 1;
            this.f1336a = i2;
            if (i2 == 0) {
                this.c.getClass();
                final int i3 = this.b + 1;
                this.b = i3;
                this.e.o("disposeSingleton", y.b, new f(this, i3) { // from class: com.google.android.apps.gsa.search.shared.service.b.c

                    /* renamed from: a, reason: collision with root package name */
                    public final d f1335a;
                    public final int b;

                    {
                        this.f1335a = this;
                        this.b = i3;
                    }

                    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                    public final void run() {
                        af afVar;
                        d dVar = this.f1335a;
                        if (dVar.f1336a == 0 && this.b == dVar.b && (afVar = dVar.c) != null) {
                            ab abVar = e.a;
                            afVar.d.n("SearchServiceCore [disposeEventBus]", new com.google.android.apps.gsa.search.core.service.ab(afVar, 1));
                            afVar.f.edit().putBoolean("service_created", false).apply();
                            afVar.g.b(afVar.h);
                            com.google.android.apps.gsa.search.core.service.c.b bVar = afVar.h;
                            synchronized (bVar.f1160a) {
                                bVar.f1160a.remove(afVar);
                            }
                            k.f(553);
                            com.google.android.apps.gsa.w.a.e f = afVar.u.f(com.google.android.apps.gsa.s.a.SEARCH_SERVICE_LIFETIME_SECS, com.google.android.apps.gsa.s.c.SEARCH_SERVICE_LIFETIME);
                            long j = afVar.y;
                            int i4 = com.google.android.apps.gsa.w.b.f1848a;
                            long a2 = f.a() - j;
                            if (com.google.android.apps.gsa.w.b.a(a2)) {
                                f.g(TimeUnit.NANOSECONDS.toSeconds(a2));
                            }
                            ((com.google.android.apps.gsa.search.core.u.a.b) afVar.n.a()).c();
                            dVar.c = null;
                        }
                    }
                });
            }
        }
    }

    public final af b() {
        if (this.f1336a == 0 && this.c == null) {
            af afVar = (af) this.d.a();
            afVar.getClass();
            this.c = afVar;
            dl.y(((com.google.android.apps.gsa.search.core.service.g.b.b) afVar.t.a()).b("service"), new ad(afVar), ay.a);
            afVar.y = afVar.u.f(com.google.android.apps.gsa.s.a.SEARCH_SERVICE_LIFETIME_SECS, com.google.android.apps.gsa.s.c.SEARCH_SERVICE_LIFETIME).a();
            if (afVar.f.getBoolean("service_created", false)) {
                com.google.common.f.h d = af.f1150a.d();
                d.aj(e.a, "SearchServiceCore");
                com.google.common.f.h hVar = d;
                hVar.ak(7286);
                hVar.p("We were killed and are starting back!");
                k.f(257);
            }
            afVar.f.edit().putBoolean("service_created", true).apply();
            afVar.g.a(afVar.h);
            afVar.h.b(afVar);
            afVar.d.n("SearchServiceCore [onCreateEventBus]", new z(afVar, 1));
            afVar.e.n("Maybe Reset Consecutive Crash Count", new z(afVar, 0));
        }
        this.f1336a++;
        af afVar2 = this.c;
        afVar2.getClass();
        return afVar2;
    }
}
