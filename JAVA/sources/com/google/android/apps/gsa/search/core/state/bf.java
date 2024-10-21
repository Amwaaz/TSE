package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.m.c.b;
import com.google.android.apps.gsa.search.core.service.e.c;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.g.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.dk;
import com.google.common.b.pq;
import com.google.common.base.at;
import com.google.common.o.gv;
import com.google.common.o.gy;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bf.class */
public final class bf extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1245a;
    public final e.a b;
    final Queue c;
    public be d;
    public long e;
    private final e.a f;
    private final com.google.android.apps.gsa.search.core.h.p g;
    private final h h;
    private final b i;

    public bf(e.a aVar, e.a aVar2, e.a aVar3, a aVar4, com.google.android.apps.gsa.search.core.h.p pVar, h hVar, b bVar) {
        super(aVar, 60);
        this.c = new pq(new dk(10));
        this.b = aVar2;
        this.f = aVar3;
        this.f1245a = aVar4;
        this.g = pVar;
        this.h = hVar;
        this.i = bVar;
    }

    public static boolean p(be beVar) {
        return (beVar == null || beVar.d) ? false : true;
    }

    private static boolean q(long j, long j2) {
        return j > 0 && j <= j2;
    }

    public final be a(Query query) {
        long j;
        if (!query.db()) {
            return null;
        }
        long j2 = query.E;
        if (j2 == this.e) {
            return null;
        }
        long a2 = this.f1245a.a();
        this.e = j2;
        com.google.android.apps.gsa.search.core.m.c.a a3 = this.i.a();
        be beVar = new be(a3);
        beVar.b = query;
        beVar.d = query.dc();
        a3.c(gv.a, a2);
        long j3 = query.C;
        if (j3 != 0) {
            a3.c(gv.i, j3);
            j = Math.min(j3, a2);
        } else {
            j = a2;
        }
        LatencyEvents latencyEvents = query.B;
        long j4 = latencyEvents.f1469a;
        long j5 = j;
        if (q(j4, a2)) {
            a3.c(gv.d, j4);
            j5 = Math.min(latencyEvents.f1469a, j);
        }
        long j6 = latencyEvents.b;
        long j7 = j5;
        if (q(j6, a2)) {
            a3.c(gv.f, j6);
            j7 = Math.min(latencyEvents.b, j5);
        }
        long j8 = latencyEvents.d;
        long j9 = j7;
        if (q(j8, a2)) {
            a3.c(gv.e, j8);
            j9 = Math.min(latencyEvents.d, j7);
        }
        long j10 = latencyEvents.e;
        long j11 = j9;
        if (q(j10, a2)) {
            a3.c(gv.g, j10);
            j11 = Math.min(latencyEvents.e, j9);
        }
        long j12 = latencyEvents.c;
        long j13 = j11;
        if (q(j12, a2)) {
            a3.c(gv.j, j12);
            j13 = Math.min(latencyEvents.c, j11);
        }
        a3.c(gv.h, j13);
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        return beVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Query query, gy gyVar) {
        i(query, 465, gyVar, com.google.common.base.a.a);
    }

    public final void f(be beVar, int i, gy gyVar) {
        this.h.n("Log endstate", new bc(this, beVar, i, gyVar));
        this.d = null;
        ci ciVar = (ci) this.f.a();
        if (com.google.android.apps.gsa.search.core.service.e.a.g.contains(ciVar.c.f1188a.f1184a)) {
            c cVar = ciVar.c;
            com.google.android.apps.gsa.search.core.service.e.a aVar = com.google.android.apps.gsa.search.core.service.e.a.IDLE;
            com.google.android.apps.gsa.search.core.service.e.a aVar2 = cVar.f1188a.f1184a;
            if (aVar != aVar2) {
                if (aVar2 == com.google.android.apps.gsa.search.core.service.e.a.IDLE) {
                    ciVar.d = ciVar.f1264a.b();
                } else {
                    com.google.android.apps.gsa.s.c cVar2 = aVar2.i;
                    if (cVar2 != com.google.android.apps.gsa.s.c.UNKNOWN_WORKLOAD) {
                        com.google.android.apps.gsa.w.b.b(ciVar.b.f(com.google.android.apps.gsa.s.a.WORKER_LATENCY_MICROS, cVar2), ciVar.d);
                    }
                }
                ciVar.c.a(new com.google.android.apps.gsa.search.core.service.e.b(aVar, ciVar.f1264a.a()));
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("QueryCompletionState");
        if (o()) {
            be beVar = this.d;
            beVar.getClass();
            fVar.s("Pending query: %s", new com.google.android.apps.gsa.shared.util.b.e[]{new d(Long.valueOf(beVar.b.E), false)});
        }
        com.google.android.apps.gsa.shared.util.debug.a.f d = fVar.d((Object) null);
        d.q("Recent Logged Events");
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                d.r(new d(((bd) it.next()).toString(), false));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.apps.gsa.shared.m.c] */
    public final void i(Query query, int i, gy gyVar, at atVar) {
        if (o()) {
            long j = query.E;
            be beVar = this.d;
            beVar.getClass();
            if (beVar.b.E == j) {
                com.google.common.base.cl.u(beVar.d);
                if (atVar.h()) {
                    beVar.c = atVar.c();
                }
                f(beVar, i, gyVar);
                an();
            }
        }
    }

    public final void k(Query query, gy gyVar) {
        if (o()) {
            long j = query.E;
            be beVar = this.d;
            beVar.getClass();
            if (beVar.b.E == j) {
                com.google.common.base.cl.u(!beVar.d);
                f(beVar, 463, gyVar);
                an();
            }
        }
    }

    public final void l(SearchError searchError) {
        be beVar = this.d;
        beVar.getClass();
        beVar.c = searchError.f;
        int N = searchError.N();
        if (N != 211) {
            if (N == 212) {
                f(beVar, 464, gy.b);
                return;
            } else if (N != 216) {
                f(beVar, 464, gy.j);
                return;
            } else {
                f(beVar, 464, gy.d);
                return;
            }
        }
        switch (searchError.M()) {
            case 65562:
            case 262160:
                f(beVar, 464, gy.g);
                return;
            case 262170:
                if (this.g.y(searchError.l)) {
                    f(beVar, 464, gy.h);
                    return;
                }
                break;
            case 524293:
                f(beVar, 464, gy.f);
                return;
        }
        f(beVar, 464, gy.i);
    }

    public final void m(Query query) {
        i(query, 463, gy.p, com.google.common.base.a.a);
    }

    public final void n(com.google.android.apps.gsa.shared.logger.c.c cVar, long j) {
        be beVar = this.d;
        if (beVar == null || j != beVar.b.E) {
            return;
        }
        beVar.a.a = cVar;
    }

    public final boolean o() {
        return this.d != null;
    }
}
