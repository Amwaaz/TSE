package com.google.android.apps.gsa.nga.engine.ar.b;

import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.ai;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.ak;
import com.google.android.apps.gsa.nga.engine.ar.i;
import com.google.android.apps.gsa.nga.engine.ar.j;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.ac;
import com.google.android.apps.gsa.nga.engine.recognition.c.b;
import com.google.android.apps.gsa.nga.engine.recognition.m;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.shared.permissions.PermissionsRequestActivity;
import com.google.android.apps.gsa.nga.shared.q.d.bu;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.u;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.qk;
import com.google.common.f.a.a;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final l f483a;
    public final Optional b;
    public final com.google.android.apps.gsa.nga.shared.q.a.x c;
    public final n d;
    private final com.google.common.f.a.d e = com.google.common.f.a.d.j();
    private final h f;
    private final com.google.android.apps.gsa.nga.engine.ar.b.a.d g;
    private final r h;
    private final x i;

    public f(h hVar, l lVar, com.google.android.apps.gsa.nga.engine.ar.b.a.d dVar, r rVar, com.google.android.apps.gsa.nga.shared.q.a.x xVar, n nVar, Optional optional, x xVar2) {
        this.f = hVar;
        this.f483a = lVar;
        this.g = dVar;
        this.h = rVar;
        this.c = xVar;
        this.d = nVar;
        this.b = optional;
        this.i = xVar2;
    }

    public final void a(Duration duration, boolean z) {
        l lVar = this.f483a;
        if (((aj) lVar.c.c).f473a.a()) {
            aj ajVar = (aj) lVar.c.c;
            ah ahVar = ajVar.f473a;
            duration.toMillis();
            if (ahVar == ah.HALF_LISTENING) {
                lVar.c.f(duration.toMillis(), aj.a(com.google.android.apps.gsa.shared.logger.b.w.NGA_PAUSED_INACTIVITY_TIMEOUT, com.google.android.apps.gsa.nga.shared.q.d.l.EXTEND_STATE_END).a());
                return;
            }
            if (ajVar.b.isEmpty()) {
                a e = lVar.f485a.e();
                e.ak(4399);
                e.s("Listening state without UtteranceIdentifier: %s", ajVar);
            } else {
                v vVar = (v) ajVar.b.get();
                Duration b = ((b) lVar.d.a()).b(vVar, duration, z);
                if (b.isZero()) {
                    return;
                }
                lVar.c.d(b, new h(lVar, vVar, 1));
            }
        }
    }

    public final boolean b(bu buVar, ac acVar, com.google.android.apps.gsa.nga.shared.q.d.l lVar, Optional optional) {
        if (!this.g.a()) {
            if (!this.g.a()) {
                com.google.android.apps.gsa.nga.engine.ar.b.a.d dVar = this.g;
                dVar.f.e(PermissionsRequestActivity.b(dVar.b, new String[]{"android.permission.RECORD_AUDIO"}).putExtra("invocation_source", buVar.d));
            }
            c(com.google.android.apps.gsa.shared.logger.b.w.NGA_PAUSED_UNKNOWN_REASON, lVar);
            return false;
        }
        this.f.n("[NGA] AttentionHandler.logLifecycleStatusWhenFullListening", new e(this));
        ac acVar2 = acVar;
        if (((com.google.android.apps.gsa.shared.util.q.a) this.i.f490a).i(eu.im)) {
            acVar2 = acVar;
            if (acVar.g()) {
                c cVar = c.BLUETOOTH;
                c a2 = c.a(buVar.c);
                c cVar2 = a2;
                if (a2 == null) {
                    cVar2 = c.UNKNOWN;
                }
                acVar2 = acVar;
                if (!cVar.equals(cVar2)) {
                    c cVar3 = c.WIRED_HEADSET;
                    c a3 = c.a(buVar.c);
                    c cVar4 = a3;
                    if (a3 == null) {
                        cVar4 = c.UNKNOWN;
                    }
                    if (cVar3.equals(cVar4)) {
                        acVar2 = acVar;
                    } else {
                        c cVar5 = c.FOLLOW_ON;
                        c a4 = c.a(buVar.c);
                        c cVar6 = a4;
                        if (a4 == null) {
                            cVar6 = c.UNKNOWN;
                        }
                        acVar2 = acVar;
                        if (!cVar5.equals(cVar6)) {
                            a d = this.e.d();
                            d.ak(4378);
                            d.p("Enabling zero latency mic for FullListening");
                            com.google.android.apps.gsa.nga.engine.recognition.g gVar = new com.google.android.apps.gsa.nga.engine.recognition.g(acVar);
                            gVar.d(16000);
                            gVar.c(true);
                            acVar2 = gVar.a();
                        }
                    }
                }
            }
        }
        l lVar2 = this.f483a;
        com.google.android.apps.gsa.nga.engine.ak.y.a a5 = com.google.android.apps.gsa.nga.engine.ak.y.b.a();
        c cVar7 = c.BLUETOOTH;
        c a6 = c.a(buVar.c);
        c cVar8 = a6;
        if (a6 == null) {
            cVar8 = c.UNKNOWN;
        }
        if (cVar7.equals(cVar8)) {
            a5.f448a.d(ak.a, true);
        } else {
            c cVar9 = c.WIRED_HEADSET;
            c a7 = c.a(buVar.c);
            c cVar10 = a7;
            if (a7 == null) {
                cVar10 = c.UNKNOWN;
            }
            if (cVar9.equals(cVar10)) {
                a5.f448a.d(ak.c, true);
            } else if (acVar2 != null && (acVar2.a() == m.e || acVar2.a() == m.d)) {
                a5.f448a.d(ak.b, true);
            }
        }
        c cVar11 = c.FOLLOW_ON;
        c a8 = c.a(buVar.c);
        c cVar12 = a8;
        if (a8 == null) {
            cVar12 = c.UNKNOWN;
        }
        if (cVar11.equals(cVar12)) {
            lVar2.f(a5);
            a5.f448a.d(ak.d, true);
        }
        if (optional.isPresent()) {
            a5.f448a.d(i.a, optional.get());
            a5.f448a.d(i.b, true);
        } else {
            c a9 = c.a(buVar.c);
            c cVar13 = a9;
            if (a9 == null) {
                cVar13 = c.UNKNOWN;
            }
            if (cVar13.equals(c.FOLLOW_ON) || lVar.equals(com.google.android.apps.gsa.nga.shared.q.d.l.RETRY)) {
                lVar2.b(a5);
            }
        }
        v a10 = lVar2.e.a();
        ai b = aj.b();
        b.d(ah.FULL_LISTENING);
        b.f472a = Optional.ofNullable(a10);
        b.c(buVar);
        b.c = Optional.of(acVar2);
        b.b(lVar);
        b.d = a5.a();
        aj a11 = b.a();
        lVar2.e(a11);
        Duration b2 = ((b) lVar2.d.a()).b(a10, lVar2.b.a(a11, eu.iy), false);
        if (b2.isZero()) {
            return true;
        }
        lVar2.c.d(b2, new h(lVar2, a10, 0));
        return true;
    }

    public final void c(com.google.android.apps.gsa.shared.logger.b.w wVar, com.google.android.apps.gsa.nga.shared.q.d.l lVar) {
        a d = this.e.d();
        d.ak(4384);
        d.H("stopListening(%s, %s)", wVar.name(), lVar.name());
        this.f483a.c(wVar, lVar);
    }

    public final void d(com.google.android.apps.gsa.nga.shared.q.d.l lVar, v vVar, com.google.android.apps.gsa.nga.engine.ak.y.b bVar) {
        l lVar2 = this.f483a;
        lVar2.e(lVar2.a(lVar, vVar, bVar));
    }

    public final boolean e(com.google.android.apps.gsa.nga.shared.q.d.l lVar) {
        com.google.android.apps.gsa.nga.engine.ar.b.a.d dVar = this.g;
        if (dVar.g.n() && !dVar.e.e() && !u.c(dVar.e.f644a)) {
            ad adVar = dVar.h;
            Optional empty = Optional.empty();
            if (adVar.d()) {
                if (dVar.h.c()) {
                    ha haVar = com.google.android.apps.gsa.nga.engine.ar.b.a.d.f474a;
                    haVar.getClass();
                    ((Boolean) empty.map(new com.google.android.apps.gsa.nga.engine.ar.b.a.c(haVar)).orElse(false)).booleanValue();
                }
                if (dVar.a()) {
                    j jVar = dVar.c;
                    if (jVar.c.c().f619a) {
                        fl flVar = jVar.c.c().f;
                        jVar.f492a.i(eu.cx);
                        jVar.f492a.h(eu.kh);
                        jVar.f492a.h(eu.ay);
                        jVar.f492a.h(eu.aw);
                    }
                    qk D = jVar.b.g().D(0);
                    while (D.hasNext()) {
                        ((com.google.android.apps.gsa.nga.engine.ak.i.i) D.next()).a();
                    }
                }
            }
        }
        c(com.google.android.apps.gsa.shared.logger.b.w.NGA_PAUSED_NO_CC, lVar);
        return false;
    }
}
