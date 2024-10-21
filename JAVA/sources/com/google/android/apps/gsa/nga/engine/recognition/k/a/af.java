package com.google.android.apps.gsa.nga.engine.recognition.k.a;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.recognition.aa;
import com.google.android.apps.gsa.nga.engine.recognition.ac;
import com.google.android.apps.gsa.nga.engine.recognition.d.a;
import com.google.android.apps.gsa.nga.engine.recognition.o;
import com.google.android.apps.gsa.nga.engine.recognition.p;
import com.google.android.apps.gsa.nga.engine.recognition.q;
import com.google.android.apps.gsa.nga.engine.recognition.s;
import com.google.android.apps.gsa.nga.engine.recognition.t;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.f.am;
import com.google.speech.i.fk;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/k/a/af.class */
public final class af implements aa {

    /* renamed from: a, reason: collision with root package name */
    public static final d f655a = d.j();
    public final h b;
    public final a c;
    public u d;
    private final x e;
    private final com.google.android.apps.gsa.nga.engine.recognition.l.a f;
    private final com.google.android.apps.gsa.shared.util.q.a g;
    private final com.google.android.apps.gsa.nga.shared.ad.a.d h;
    private final y i;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d j;
    private final ae k = new ae(this);

    public af(h hVar, x xVar, a aVar, com.google.android.apps.gsa.nga.engine.recognition.l.a aVar2, y yVar, com.google.android.apps.gsa.shared.util.q.a aVar3, com.google.android.apps.gsa.nga.shared.ad.a.d dVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar2) {
        this.b = hVar;
        this.e = xVar;
        this.c = aVar;
        this.f = aVar2;
        this.i = yVar;
        this.g = aVar3;
        this.h = dVar;
        this.j = dVar2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final void a(v vVar) {
        if (b()) {
            this.f.c(w.NGA_SPEECH_HANDLER_MANUAL_ENDPOINT, com.google.android.apps.gsa.nga.engine.recognition.h.h);
            this.b.n("[NGA] S3 Manual Endpoint", new ad(this, vVar));
        } else {
            com.google.common.f.a.a f = f655a.f();
            f.ak(3922);
            f.p("Not closing audio session because manual endpointing is not allowed");
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean b() {
        boolean z = this.i.c().b;
        if (this.g.i(eu.aP)) {
            return true;
        }
        return this.h.h(this.j.a().c());
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean c(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        this.f.c(w.NGA_SPEECH_HANDLER_RESET, com.google.android.apps.gsa.nga.engine.recognition.h.h);
        this.b.n("[NGA] S3 Reset", new ab(this, acVar, dVar, 1));
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean d(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        this.f.c(w.NGA_SPEECH_HANDLER_RESUME, com.google.android.apps.gsa.nga.engine.recognition.h.h);
        this.b.n("[NGA] S3 Start", new ab(this, acVar, dVar, 0));
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean e() {
        this.f.c(w.NGA_SPEECH_HANDLER_PAUSE, com.google.android.apps.gsa.nga.engine.recognition.h.h);
        this.b.n("[NGA] S3 Stop", new ac(this, 0));
        return true;
    }

    public final void f() {
        am.b.getClass();
        u uVar = this.d;
        this.d = null;
        if (uVar != null) {
            com.google.common.f.a.a d = f655a.d();
            d.ak(3918);
            d.s("Stopping S3 session with utterance id %s", uVar.e.a.d());
            synchronized (uVar.c) {
                uVar.a();
                com.google.android.apps.gsa.nga.engine.recognition.l.a.d dVar = uVar.q;
                if (dVar != null) {
                    dVar.a();
                    uVar.q = null;
                }
                uVar.p = true;
                uVar.t.a = null;
            }
            uVar.m.a();
        }
    }

    public final boolean g(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        am.b.getClass();
        if (this.d != null) {
            return false;
        }
        com.google.common.f.a.a d = f655a.d();
        d.ak(3924);
        int i = acVar.l;
        if (i == 0) {
            throw null;
        }
        d.H("Starting S3 session %s with utterance id %s", com.google.android.apps.gsa.nga.engine.recognition.ae.a(i), dVar.a.d());
        x xVar = this.e;
        ae aeVar = this.k;
        aeVar.getClass();
        h hVar = (h) xVar.f656a.a();
        hVar.getClass();
        h hVar2 = (h) xVar.b.a();
        hVar2.getClass();
        h hVar3 = (h) xVar.c.a();
        hVar3.getClass();
        k kVar = (k) xVar.d.a();
        kVar.getClass();
        a aVar = (a) xVar.e.a();
        aVar.getClass();
        l lVar = (l) xVar.f.a();
        lVar.getClass();
        com.google.android.apps.gsa.nga.engine.ar.c.a aVar2 = (com.google.android.apps.gsa.nga.engine.ar.c.a) xVar.g.a();
        aVar2.getClass();
        z zVar = (z) xVar.h.a();
        zVar.getClass();
        r rVar = (r) xVar.i.a();
        rVar.getClass();
        w wVar = (w) xVar.j.a();
        wVar.getClass();
        u uVar = new u(acVar, aeVar, dVar, hVar, hVar2, hVar3, kVar, aVar, lVar, aVar2, zVar, rVar, wVar);
        this.d = uVar;
        ac acVar2 = uVar.d;
        uVar.e.a.d();
        if (uVar.r != null) {
            com.google.common.f.a.a f = u.a.f();
            f.ak(3911);
            f.p("Mic already opened running");
            if (uVar.d.h()) {
                uVar.i.b(uVar.d);
            }
        } else {
            uVar.r = uVar.n.a();
            uVar.h.m(uVar.r, "[NGA] audio capture callback", new t(uVar));
        }
        r rVar2 = uVar.m;
        long d2 = rVar2.b.d(eu.lA);
        if (rVar2.d != null) {
            com.google.common.f.a.a f2 = r.a.f();
            f2.ak(3900);
            f2.p("Network timeout future already set.");
        } else if (d2 > 0) {
            rVar2.d = rVar2.c.j("[NGA] S3NetworkTimeoutFuture.start", Duration.ofMillis(d2), new q(rVar2.e));
        }
        if (uVar.d.e.isPresent()) {
            uVar.k.c((HotwordResult) uVar.d.e.get());
        }
        k kVar2 = uVar.j;
        long j = kVar2.i;
        kVar2.i = 1 + j;
        com.google.android.apps.gsa.nga.engine.b.c.a a2 = kVar2.d.a();
        o oVar = new o((byte[]) null);
        oVar.a = "";
        oVar.d(p.i);
        q a3 = oVar.a();
        s sVar = new s((byte[]) null);
        sVar.b(com.google.android.apps.gsa.nga.engine.recognition.h.h);
        sVar.h = a2;
        sVar.e(kVar2.c.a());
        sVar.d(true);
        sVar.g();
        sVar.c(t.a);
        sVar.c = fl.m(fl.p(a3));
        sVar.f(kVar2.b.a(a2.a.d(), com.google.android.apps.gsa.nga.engine.recognition.h.h, fk.a));
        kVar2.m.c(sVar.a(), String.valueOf(j));
        return true;
    }
}
