package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.engine.at.b.g;
import com.google.android.apps.gsa.nga.engine.at.b.h;
import com.google.android.apps.gsa.nga.engine.ui.d.e.j;
import com.google.android.apps.gsa.nga.engine.ui.e.h.ad;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.ak;
import com.google.android.apps.gsa.nga.shared.q.d.bv;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.common.f.a.d;
import com.google.common.v.f;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/ba.class */
public final class ba {
    public final h b;
    public final av c;
    public final c d;
    public final com.google.android.apps.gsa.shared.util.q.a e;
    public final f f;
    public com.google.android.apps.gsa.nga.engine.ac.f g;
    public final x i;

    /* renamed from: a, reason: collision with root package name */
    public final d f392a = d.c("OpaStateMachine");
    public Optional h = Optional.empty();

    public ba(com.google.android.libraries.gsa.h.h hVar, final af afVar, av avVar, c cVar, com.google.android.apps.gsa.shared.util.q.a aVar, x xVar, f fVar) {
        this.c = avVar;
        this.d = cVar;
        this.e = aVar;
        this.i = xVar;
        this.f = fVar;
        this.b = new h(hVar, "QueryState", com.google.android.apps.gsa.nga.engine.ac.c.IDLE, new g(this, afVar) { // from class: com.google.android.apps.gsa.nga.engine.ac.a.ax

            /* renamed from: a, reason: collision with root package name */
            public final ba f391a;
            public final af b;

            {
                this.f391a = this;
                this.b = afVar;
            }

            /* JADX WARN: Type inference failed for: r0v102, types: [e.a, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v87, types: [e.a, java.lang.Object] */
            @Override // com.google.android.apps.gsa.nga.engine.at.b.g
            public final void a(Object obj, Object obj2) {
                int i;
                com.google.android.apps.gsa.nga.engine.ac.c cVar2 = (com.google.android.apps.gsa.nga.engine.ac.c) obj2;
                ba baVar = this.f391a;
                com.google.common.f.a.a d = baVar.f392a.d();
                d.ak(3678);
                d.s("Entered state %s", cVar2);
                com.google.android.apps.gsa.nga.engine.ac.f fVar2 = baVar.g;
                af afVar2 = this.b;
                boolean a2 = ((com.google.android.apps.gsa.nga.engine.ac.c) afVar2.f386a.get()).a();
                boolean a3 = cVar2.a();
                afVar2.f386a.set(cVar2);
                afVar2.b.b(cVar2);
                com.google.android.apps.gsa.nga.shared.q.a.af afVar3 = afVar2.g;
                com.google.android.apps.gsa.nga.shared.q.d.bk bkVar = com.google.android.apps.gsa.nga.shared.q.d.bk.OPA_STATE_CHANGED;
                com.google.protobuf.ba createBuilder = com.google.android.apps.gsa.nga.shared.q.d.bj.a.createBuilder();
                com.google.protobuf.ba createBuilder2 = bv.a.createBuilder();
                int ordinal = cVar2.ordinal();
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal != 1) {
                    i = 4;
                    if (ordinal != 2) {
                        i = ordinal != 3 ? ordinal != 4 ? 1 : 6 : 5;
                    }
                } else {
                    i = 3;
                }
                createBuilder2.copyOnWrite();
                bv bvVar = createBuilder2.instance;
                bvVar.c = i - 1;
                bvVar.b |= 1;
                String str = (String) Optional.ofNullable(fVar2).map(new e(3)).orElse("");
                createBuilder2.copyOnWrite();
                bv bvVar2 = createBuilder2.instance;
                str.getClass();
                bvVar2.b = 2 | bvVar2.b;
                bvVar2.d = str;
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.nga.shared.q.d.bj bjVar = createBuilder.instance;
                bv build = createBuilder2.build();
                build.getClass();
                bjVar.c = build;
                bjVar.b = 63;
                afVar3.b(bkVar, (com.google.android.apps.gsa.nga.shared.q.d.bj) createBuilder.build(), com.google.android.apps.gsa.nga.shared.q.ah.a);
                if (cVar2 == com.google.android.apps.gsa.nga.engine.ac.c.IDLE) {
                    z zVar = afVar2.d;
                    if (zVar.e) {
                        zVar.d.cancel(false);
                        zVar.d = zVar.b.j("[NGA] destroy OPA connection", Duration.ofMillis(10000L), new y(zVar));
                    }
                    zVar.e = false;
                }
                if (a2 != a3) {
                    if (a3) {
                        ad adVar = afVar2.e;
                        for (com.google.android.apps.gsa.nga.engine.ui.e.a.a.f fVar3 : (Set) adVar.f741a.a()) {
                            fVar3.a.n("[NGA] send onTtsStarted change", new com.google.android.apps.gsa.nga.engine.ui.e.a.a.d(fVar3, 0));
                        }
                        j jVar = (j) adVar.b;
                        if (jVar.c.f473a.equals(com.google.android.apps.gsa.nga.engine.ar.ah.EXECUTING)) {
                            com.google.android.apps.gsa.nga.shared.s.ad.b(jVar.b, jVar.f687a, true, "ttsIsPlaying");
                        }
                    } else {
                        for (com.google.android.apps.gsa.nga.engine.ui.e.a.a.f fVar4 : (Set) afVar2.e.f741a.a()) {
                            fVar4.a.n("[NGA] send onTtsFinished change", new com.google.android.apps.gsa.nga.engine.ui.e.a.a.d(fVar4, 1));
                        }
                    }
                }
                afVar2.f.set(com.google.android.apps.gsa.nga.engine.ac.c.IDLE.equals(cVar2) ? Optional.empty() : Optional.ofNullable(fVar2));
                if (cVar2 == com.google.android.apps.gsa.nga.engine.ac.c.IDLE) {
                    baVar.g = null;
                }
                if (cVar2.a()) {
                    return;
                }
                baVar.h = Optional.empty();
            }
        });
    }

    public final Optional a() {
        Instant a2 = this.f.a();
        return this.h.filter(new aw(a2)).map(new aq(a2, 2));
    }

    final void b(boolean z) {
        c cVar = this.d;
        b bVar = (b) cVar.d.getAndSet(null);
        if (bVar == null) {
            com.google.common.f.a.a f = c.f394a.f();
            f.ak(3600);
            f.p("Received done event for non-tracked query.");
        } else {
            long j = bVar.c.get();
            cVar.e.b(new ak("NGA_CLIENT_CONVERSATION_DONE_DELAY", Double.valueOf(cVar.c.a() - bVar.b), (int) j, j >= 0));
            cVar.b.g(w.NGA_CLIENT_CONVERSATION_DONE, bVar.a.d.b());
        }
        c(!z);
    }

    public final void c(boolean z) {
        int ordinal = ((com.google.android.apps.gsa.nga.engine.ac.c) this.b.c).ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                this.b.b(com.google.android.apps.gsa.nga.engine.ac.c.IDLE);
                return;
            }
            return;
        }
        if (!z) {
            this.b.b(com.google.android.apps.gsa.nga.engine.ac.c.IDLE);
            return;
        }
        com.google.common.f.a.a f = this.f392a.f();
        f.ak(3682);
        f.s("Received 'OPA conversation_done/deactivated' signal in the %s state.", this.b.c);
    }

    final void d(com.google.android.apps.gsa.nga.engine.ac.f fVar) {
        this.g = fVar;
        this.b.b(com.google.android.apps.gsa.nga.engine.ac.c.PROCESSING_RESPONSE);
        c cVar = this.d;
        cVar.d.set(new b(cVar, fVar));
        f(az.a, 0L);
    }

    public final void e(com.google.android.apps.gsa.nga.engine.ac.f fVar) {
        this.g = fVar;
        this.b.b(com.google.android.apps.gsa.nga.engine.ac.c.PREFETCHING);
    }

    public final void f(az azVar, long j) {
        az azVar2 = az.a;
        long d = this.e.d(azVar.g);
        if (d < 0) {
            return;
        }
        long max = Math.max(d, j);
        this.b.e(max, new ay(this, azVar, max));
    }
}
