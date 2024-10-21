package com.google.android.apps.gsa.nga.engine.ar.b;

import com.google.android.apps.gsa.nga.engine.ak.y.b;
import com.google.android.apps.gsa.nga.engine.ak.y.c;
import com.google.android.apps.gsa.nga.engine.ar.ag;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.ai;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.ak;
import com.google.android.apps.gsa.nga.engine.ar.b.a.e;
import com.google.android.apps.gsa.nga.engine.ar.i;
import com.google.android.apps.gsa.nga.engine.at.b.h;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import e.a;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/l.class */
public final class l {
    public final e b;
    public final h c;
    public final a d;
    public final com.google.android.apps.gsa.nga.engine.v.e e;
    public final w f;
    private final com.google.android.libraries.gsa.h.h h;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.f.a.d f485a = com.google.common.f.a.d.c("NgaStateMachine");
    public boolean g = false;

    public l(final d dVar, e eVar, com.google.android.libraries.gsa.h.h hVar, final x xVar, a aVar, com.google.android.apps.gsa.nga.engine.v.e eVar2, w wVar) {
        this.b = eVar;
        this.h = hVar;
        this.d = aVar;
        this.e = eVar2;
        this.f = wVar;
        this.c = new h(hVar, "AttentionHandler", aj.a(com.google.android.apps.gsa.shared.logger.b.w.NGA_PAUSED_UNKNOWN_REASON, com.google.android.apps.gsa.nga.shared.q.d.l.NGA_CREATE).a(), new com.google.android.apps.gsa.nga.engine.at.b.g(xVar, dVar) { // from class: com.google.android.apps.gsa.nga.engine.ar.b.g

            /* renamed from: a, reason: collision with root package name */
            public final d f484a;
            public final x b;

            {
                this.b = xVar;
                this.f484a = dVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x02f6, code lost:
            
                if (r0.f.equals(com.google.android.apps.gsa.nga.shared.q.d.l.RETRY) != false) goto L137;
             */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0375  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x03a2  */
            /* JADX WARN: Type inference failed for: r0v116, types: [com.google.android.apps.gsa.nga.engine.v.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.google.android.apps.gsa.nga.engine.v.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v55, types: [com.google.android.apps.gsa.nga.engine.v.i, java.lang.Object] */
            @Override // com.google.android.apps.gsa.nga.engine.at.b.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r9, java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 2142
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.ar.b.g.a(java.lang.Object, java.lang.Object):void");
            }
        });
    }

    public final aj a(com.google.android.apps.gsa.nga.shared.q.d.l lVar, v vVar, b bVar) {
        com.google.android.apps.gsa.nga.engine.ak.y.a b = bVar.b();
        f(b);
        b(b);
        ai b2 = aj.b();
        b2.d(ah.EXECUTING);
        b2.f472a = Optional.of(vVar);
        b2.b(lVar);
        b2.d = b.a();
        ag agVar = (ag) bVar.b.b(ak.e);
        if (agVar != null) {
            b2.e(agVar.d);
        }
        return b2.a();
    }

    public final void b(com.google.android.apps.gsa.nga.engine.ak.y.a aVar) {
        com.google.android.apps.gsa.nga.shared.ad.a.b bVar = (com.google.android.apps.gsa.nga.shared.ad.a.b) ((aj) this.c.c).g.b.b(i.a);
        if (bVar != null) {
            aVar.f448a.d(i.a, bVar);
            aVar.f448a.d(i.b, false);
        }
    }

    public final void c(com.google.android.apps.gsa.shared.logger.b.w wVar, com.google.android.apps.gsa.nga.shared.q.d.l lVar) {
        e(aj.a(wVar, lVar).a());
    }

    public final void d(aj ajVar, Duration duration, aj ajVar2) {
        if (e(ajVar)) {
            this.c.c(this.h.e("[NGA] state timeout", Duration.ofMillis(duration.toMillis()), new i()), new k(this, ajVar2, ajVar));
        }
    }

    public final boolean e(aj ajVar) {
        aj ajVar2 = (aj) this.c.c;
        if (this.g) {
            ah ahVar = ajVar2.f473a;
            return false;
        }
        if (ajVar2.k() && ajVar.k()) {
            this.c.a();
            return false;
        }
        this.c.b(ajVar);
        return true;
    }

    public final void f(com.google.android.apps.gsa.nga.engine.ak.y.a aVar) {
        b bVar = ((aj) this.c.c).g;
        com.google.android.apps.gsa.nga.engine.ak.y.f fVar = bVar.b;
        c cVar = ak.a;
        aVar.f448a.d(cVar, (Boolean) fVar.c(cVar, false));
        com.google.android.apps.gsa.nga.engine.ak.y.f fVar2 = bVar.b;
        c cVar2 = ak.c;
        aVar.f448a.d(cVar2, (Boolean) fVar2.c(cVar2, false));
        com.google.android.apps.gsa.nga.engine.ak.y.f fVar3 = bVar.b;
        c cVar3 = ak.b;
        aVar.f448a.d(cVar3, (Boolean) fVar3.c(cVar3, false));
        com.google.android.apps.gsa.nga.engine.ak.y.f fVar4 = bVar.b;
        c cVar4 = ak.d;
        aVar.f448a.d(cVar4, (Boolean) fVar4.c(cVar4, false));
    }
}
