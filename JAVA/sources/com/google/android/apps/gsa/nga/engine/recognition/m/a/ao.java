package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.d.a.bb;
import com.google.android.apps.gsa.nga.engine.recognition.aa;
import com.google.android.apps.gsa.nga.engine.recognition.ac;
import com.google.android.apps.gsa.nga.engine.recognition.l.a;
import com.google.android.apps.gsa.nga.engine.recognition.n.a.g;
import com.google.android.apps.gsa.nga.engine.v.b;
import com.google.android.apps.gsa.nga.engine.v.p;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.c.dt;
import com.google.android.apps.gsa.nga.shared.q.c.fu;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.cq;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.ak;
import com.google.common.f.a.d;
import com.google.common.o.ll;
import com.google.common.o.lm;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.speech.i.a.e;
import com.google.speech.i.a.m;
import com.google.speech.i.a.n;
import com.google.speech.i.av;
import com.google.speech.i.ea;
import com.google.speech.i.el;
import com.google.speech.i.en;
import com.google.speech.i.eo;
import com.google.speech.i.fa;
import com.google.speech.i.fe;
import com.google.speech.i.fk;
import com.google.speech.i.ge;
import com.google.speech.i.gw;
import j$.time.Duration;
import j$.util.Optional;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/ao.class */
public final class ao implements aa {

    /* renamed from: a, reason: collision with root package name */
    public static final d f662a = d.j();
    public final com.google.android.libraries.gsa.h.h b;
    public final a c;
    public al d;
    private final am e;
    private final com.google.android.apps.gsa.nga.engine.ar.c.a f;
    private final com.google.android.apps.gsa.nga.engine.recognition.d.a g;
    private final com.google.android.apps.gsa.shared.util.q.a h;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d i;

    public ao(com.google.android.libraries.gsa.h.h hVar, am amVar, a aVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, com.google.android.apps.gsa.nga.engine.ar.c.a aVar2, com.google.android.apps.gsa.nga.engine.recognition.d.a aVar3, com.google.android.apps.gsa.shared.util.q.a aVar4) {
        this.b = hVar;
        this.e = amVar;
        this.c = aVar;
        this.i = dVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = aVar4;
    }

    private final void h(ac acVar) {
        if (acVar.e.isPresent()) {
            this.f.c((HotwordResult) acVar.e.get());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final void a(com.google.android.apps.gsa.nga.engine.b.g.v vVar) {
        if (b()) {
            this.c.c(w.NGA_SPEECH_HANDLER_MANUAL_ENDPOINT, com.google.android.apps.gsa.nga.engine.recognition.h.b);
            this.b.n("[NGA] SodaSpeechRecognizer.ensureAudioSessionClosed", new ah(this, vVar, 2));
        } else {
            com.google.common.f.a.a f = f662a.f();
            f.ak(3985);
            f.p("Not closing audio session because manual endpointing is not allowed");
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean b() {
        return !this.h.i(eu.iQ);
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean c(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        this.c.c(w.NGA_SPEECH_HANDLER_RESET, com.google.android.apps.gsa.nga.engine.recognition.h.b);
        if (acVar.g() || acVar.e() || acVar.h()) {
            h(acVar);
            this.b.n("[NGA] SodaSpeechRecognizer.reset", new o(this, acVar, dVar, 4));
            return true;
        }
        com.google.common.f.a.a f = f662a.f();
        f.ak(3987);
        f.s("Soda can't reset with SpeechSessionParams %s", acVar);
        this.c.j(4);
        this.g.b(acVar);
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean d(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        this.c.c(w.NGA_SPEECH_HANDLER_RESUME, com.google.android.apps.gsa.nga.engine.recognition.h.b);
        if (acVar.g() || acVar.e() || acVar.h()) {
            h(acVar);
            this.b.n("[NGA] SodaSpeechRecognizer.start", new o(this, acVar, dVar, 5));
            return true;
        }
        com.google.common.f.a.a f = f662a.f();
        f.ak(3989);
        f.s("Soda can't start with SpeechSessionParams %s", acVar);
        this.c.j(1);
        this.g.b(acVar);
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean e() {
        this.c.c(w.NGA_SPEECH_HANDLER_PAUSE, com.google.android.apps.gsa.nga.engine.recognition.h.b);
        this.b.n("[NGA] SodaSpeechRecognizer.stop", new an(this, 0));
        return true;
    }

    final void f() {
        al alVar = this.d;
        this.d = null;
        if (alVar != null) {
            com.google.common.f.a.a d = f662a.d();
            d.ak(3982);
            d.s("Stopping Soda session %s", alVar.k.a);
            alVar.b();
        }
    }

    public final void g(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        InputStream inputStream;
        ag agVar;
        int i;
        com.google.android.apps.gsa.nga.engine.v.d dVar2;
        af afVar;
        bk bkVar;
        ba createBuilder;
        ba createBuilder2;
        cq cqVar;
        Lock readLock;
        int size;
        al alVar;
        gw gwVar;
        k kVar;
        aj a2 = this.i.a();
        al alVar2 = this.d;
        if (!acVar.e() && alVar2 != null && !alVar2.m.isDone() && !acVar.h()) {
            try {
                gwVar = a2.i() ? gw.e : gw.a;
                kVar = alVar2.b;
                readLock = kVar.k.readLock();
                readLock.lock();
            } catch (j e) {
                alVar2.h.j(8);
                com.google.common.f.a.a f = al.a.f();
                f.ak(3974);
                f.p("Trying to reset but there is no Soda instance");
                alVar2.b();
                alVar = null;
            }
            try {
                kVar.a().u(gwVar);
                readLock.unlock();
                ((q) alVar2.d.a()).f(dVar);
                ag agVar2 = alVar2.f;
                int i2 = alVar2.c.l;
                af afVar2 = agVar2.j;
                bk bkVar2 = bk.SODA_SESSION_EVENT;
                ba createBuilder3 = bj.a.createBuilder();
                ba createBuilder4 = cq.a.createBuilder();
                createBuilder4.copyOnWrite();
                cq cqVar2 = createBuilder4.instance;
                if (i2 == 0) {
                    throw null;
                }
                cqVar2.d = i2;
                cqVar2.b |= 2;
                createBuilder4.copyOnWrite();
                cq cqVar3 = createBuilder4.instance;
                cqVar3.c = 3;
                cqVar3.b |= 1;
                cq build = createBuilder4.build();
                createBuilder3.copyOnWrite();
                bj bjVar = createBuilder3.instance;
                build.getClass();
                bjVar.c = build;
                bjVar.b = 82;
                afVar2.b(bkVar2, (bj) createBuilder3.build(), dVar.a.b());
                alVar = alVar2.e.a(acVar, dVar, Optional.of(alVar2.m), Optional.ofNullable(alVar2.n));
                this.d = alVar;
                return;
            } finally {
            }
        }
        f();
        if (this.d != null) {
            return;
        }
        com.google.common.f.a.a d = f662a.d();
        d.ak(3981);
        d.s("Starting Soda session with utterance id %s", dVar.a.d());
        al a3 = this.e.a(acVar, dVar, Optional.empty(), Optional.empty());
        try {
            a3.n = a3.o.a(a3.c);
            inputStream = a3.n;
            ((q) a3.d.a()).f(a3.k);
            com.google.common.f.a.a d2 = al.a.d();
            d2.ak(3976);
            d2.s("Starting capturing for utteranceid %s", a3.l);
            a3.i.b(w.NGA_AUDIO_CAPTURE_STARTED);
            agVar = a3.f;
            i = a3.c.l;
            dVar2 = a3.k;
            afVar = agVar.j;
            bkVar = bk.SODA_SESSION_EVENT;
            createBuilder = bj.a.createBuilder();
            createBuilder2 = cq.a.createBuilder();
            createBuilder2.copyOnWrite();
            cqVar = createBuilder2.instance;
        } catch (j e2) {
            a3.h.j(6);
            aus.f(al.a.f(), "Trying to start but there is no Soda instance", (char) 3978, e2);
            a3.b();
            ae aeVar = a3.j;
            aeVar.f.p("[NGA] SodaLifecycleHandler.scheduleLifecycle", Duration.ofMillis(ae.b.toMillis()), new an(aeVar, 1));
        }
        if (i == 0) {
            throw null;
        }
        cqVar.d = i;
        cqVar.b |= 2;
        createBuilder2.copyOnWrite();
        cq cqVar4 = createBuilder2.instance;
        cqVar4.c = 1;
        cqVar4.b |= 1;
        com.google.speech.i.a.w wVar = agVar.d.h;
        b bVar = p.a;
        ba createBuilder5 = lm.a.createBuilder();
        for (n nVar : wVar.c) {
            int i3 = nVar.c;
            int at = a.a.at(i3);
            int i4 = at - 1;
            if (at == 0) {
                throw null;
            }
            if (i4 == 0) {
                size = (i3 == 2 ? (m) nVar.d : m.a).b.size();
            } else if (i4 != 1) {
                size = 0;
            } else {
                size = (i3 == 3 ? (com.google.speech.i.a.j) nVar.d : com.google.speech.i.a.j.a).d.size();
            }
            ba createBuilder6 = ll.a.createBuilder();
            String str = nVar.e;
            createBuilder6.copyOnWrite();
            ll llVar = createBuilder6.instance;
            str.getClass();
            llVar.b |= 1;
            llVar.c = str;
            createBuilder6.copyOnWrite();
            ll llVar2 = createBuilder6.instance;
            llVar2.b |= 2;
            llVar2.d = size;
            createBuilder5.copyOnWrite();
            lm lmVar = createBuilder5.instance;
            ll build2 = createBuilder6.build();
            build2.getClass();
            cb cbVar = lmVar.b;
            if (!cbVar.c()) {
                lmVar.b = bi.mutableCopy(cbVar);
            }
            lmVar.b.add(build2);
        }
        lm build3 = createBuilder5.build();
        createBuilder2.copyOnWrite();
        cq cqVar5 = createBuilder2.instance;
        build3.getClass();
        cqVar5.e = build3;
        cqVar5.b |= 4;
        cq build4 = createBuilder2.build();
        createBuilder.copyOnWrite();
        bj bjVar2 = createBuilder.instance;
        build4.getClass();
        bjVar2.c = build4;
        bjVar2.b = 82;
        afVar.b(bkVar, (bj) createBuilder.build(), dVar2.a.b());
        k kVar2 = a3.b;
        ac acVar2 = a3.c;
        r rVar = (r) kVar2.l.a();
        bc createBuilder7 = e.a.createBuilder();
        ak.j(createBuilder7, acVar2.b, Integer.bitCount(acVar2.c));
        createBuilder7.copyOnWrite();
        e eVar = createBuilder7.instance;
        eVar.b |= 1;
        eVar.c = true;
        if (rVar.c.a().i()) {
            gw gwVar2 = gw.e;
            createBuilder7.copyOnWrite();
            e eVar2 = createBuilder7.instance;
            eVar2.n = gwVar2.m;
            eVar2.b |= 32768;
        }
        if (rVar.a.i(eu.hm)) {
            com.google.android.apps.gsa.nga.engine.v.u a4 = rVar.e.a(14003, ah.a);
            try {
                bb bbVar = rVar.b;
                long b = bbVar.d.b();
                com.google.speech.i.a.w c = bbVar.c.c();
                com.google.speech.i.a.w wVar2 = c;
                if (bbVar.f.i(eu.lE)) {
                    com.google.speech.i.a.w wVar3 = bbVar.g.f534a;
                    bc builder = c.toBuilder();
                    builder.mergeFrom(wVar3);
                    wVar2 = (com.google.speech.i.a.w) builder.build();
                    bbVar.h = wVar2;
                }
                bbVar.b(wVar2, bk.SPEECH_RECOGNITION_CONTEXT);
                x xVar = bbVar.i;
                fu d3 = dt.d();
                d3.c = Double.valueOf(Duration.ofNanos(bbVar.d.b() - b).toMillis());
                d3.b = "START_CAPTURE_TOTAL";
                xVar.b(d3.d());
                createBuilder7.copyOnWrite();
                e eVar3 = createBuilder7.instance;
                wVar2.getClass();
                eVar3.h = wVar2;
                eVar3.b |= 32;
                a4.a();
            } finally {
            }
        }
        int i5 = fe.i((int) rVar.a.d(eu.lR));
        if (i5 == 0 || i5 == 1) {
            createBuilder7.copyOnWrite();
            e eVar4 = createBuilder7.instance;
            eVar4.l = null;
            eVar4.b &= -513;
        } else {
            int i6 = i5;
            if (i5 == 8) {
                g gVar = rVar.d;
                if (gVar.d.a() - gVar.e <= Duration.ofSeconds(gVar.a.d(eu.iP)).toNanos() && gVar.c.c() && gVar.b.d(false, false)) {
                    i6 = 3;
                }
                i6 = 1;
            }
            String h = rVar.a.h(eu.lS);
            bc createBuilder8 = av.a.createBuilder();
            createBuilder8.copyOnWrite();
            av avVar = createBuilder8.instance;
            avVar.c = i6 - 1;
            avVar.b |= 1;
            createBuilder8.copyOnWrite();
            av avVar2 = createBuilder8.instance;
            avVar2.d = 2;
            avVar2.b |= 2;
            createBuilder8.copyOnWrite();
            av avVar3 = createBuilder8.instance;
            h.getClass();
            avVar3.b |= 16;
            avVar3.f = h;
            av build5 = createBuilder8.build();
            createBuilder7.copyOnWrite();
            e eVar5 = createBuilder7.instance;
            build5.getClass();
            eVar5.l = build5;
            eVar5.b |= 512;
        }
        if (acVar2.e.isPresent()) {
            ba createBuilder9 = en.b.createBuilder();
            if (((HotwordResult) acVar2.e.get()).p().h()) {
                ba createBuilder10 = com.google.speech.i.h.a.createBuilder();
                byte[] bArr = (byte[]) ((HotwordResult) acVar2.e.get()).p().c();
                com.google.protobuf.v x = com.google.protobuf.v.x(bArr, 0, bArr.length);
                createBuilder10.copyOnWrite();
                com.google.speech.i.h hVar = createBuilder10.instance;
                hVar.b |= 1;
                hVar.c = x;
                ba createBuilder11 = com.google.speech.i.j.a.createBuilder();
                int i7 = acVar2.b;
                createBuilder11.copyOnWrite();
                com.google.speech.i.j jVar = createBuilder11.instance;
                jVar.b |= 2;
                jVar.d = i7;
                int bitCount = Integer.bitCount(acVar2.c);
                createBuilder11.copyOnWrite();
                com.google.speech.i.j jVar2 = createBuilder11.instance;
                jVar2.b |= 4;
                jVar2.e = bitCount;
                createBuilder10.copyOnWrite();
                com.google.speech.i.h hVar2 = createBuilder10.instance;
                com.google.speech.i.j build6 = createBuilder11.build();
                build6.getClass();
                hVar2.d = build6;
                hVar2.b |= 2;
                com.google.speech.i.h build7 = createBuilder10.build();
                ba createBuilder12 = fa.a.createBuilder();
                createBuilder12.copyOnWrite();
                fa faVar = createBuilder12.instance;
                build7.getClass();
                faVar.c = build7;
                faVar.b |= 1;
                int g = ((HotwordResult) acVar2.e.get()).g();
                createBuilder12.copyOnWrite();
                fa faVar2 = createBuilder12.instance;
                faVar2.b |= 4;
                faVar2.d = g;
                createBuilder9.copyOnWrite();
                en enVar = createBuilder9.instance;
                fa build8 = createBuilder12.build();
                build8.getClass();
                enVar.e = build8;
                enVar.c |= 2;
            }
            if (((HotwordResult) acVar2.e.get()).A()) {
                ba createBuilder13 = el.a.createBuilder();
                String x2 = ((HotwordResult) acVar2.e.get()).x();
                if (x2 != null) {
                    createBuilder13.copyOnWrite();
                    el elVar = createBuilder13.instance;
                    elVar.b |= 64;
                    elVar.h = x2;
                }
                String y = ((HotwordResult) acVar2.e.get()).y();
                if (y != null) {
                    createBuilder13.copyOnWrite();
                    el elVar2 = createBuilder13.instance;
                    elVar2.b |= 2;
                    elVar2.d = y;
                }
                float c2 = ((HotwordResult) acVar2.e.get()).c();
                createBuilder13.copyOnWrite();
                el elVar3 = createBuilder13.instance;
                elVar3.b |= 4;
                elVar3.e = c2;
                createBuilder9.copyOnWrite();
                en enVar2 = createBuilder9.instance;
                el build9 = createBuilder13.build();
                build9.getClass();
                enVar2.d = build9;
                enVar2.c |= 1;
                ge createBuilder14 = fk.a.createBuilder();
                float d4 = ((HotwordResult) acVar2.e.get()).d();
                createBuilder14.copyOnWrite();
                fk fkVar = createBuilder14.instance;
                fkVar.b |= 4;
                fkVar.e = d4;
                createBuilder9.copyOnWrite();
                en enVar3 = createBuilder9.instance;
                fk build10 = createBuilder14.build();
                build10.getClass();
                enVar3.f = build10;
                enVar3.c |= 4;
                ba createBuilder15 = eo.a.createBuilder();
                ba createBuilder16 = ea.a.createBuilder();
                float b2 = ((HotwordResult) acVar2.e.get()).b();
                createBuilder16.copyOnWrite();
                ea eaVar = createBuilder16.instance;
                eaVar.b |= 1;
                eaVar.c = b2;
                float a5 = ((HotwordResult) acVar2.e.get()).a();
                createBuilder16.copyOnWrite();
                ea eaVar2 = createBuilder16.instance;
                eaVar2.b |= 2;
                eaVar2.d = a5;
                createBuilder15.copyOnWrite();
                eo eoVar = createBuilder15.instance;
                ea build11 = createBuilder16.build();
                build11.getClass();
                eoVar.d = build11;
                eoVar.b |= 1;
                createBuilder9.copyOnWrite();
                en enVar4 = createBuilder9.instance;
                eo build12 = createBuilder15.build();
                build12.getClass();
                enVar4.g = build12;
                enVar4.c |= 8;
            }
            en build13 = createBuilder9.build();
            createBuilder7.copyOnWrite();
            e eVar6 = createBuilder7.instance;
            build13.getClass();
            eVar6.o = build13;
            eVar6.b |= 65536;
        }
        e eVar7 = (e) createBuilder7.build();
        bc builder2 = eVar7.toBuilder();
        com.google.speech.i.a.w wVar4 = com.google.speech.i.a.w.a;
        builder2.copyOnWrite();
        e eVar8 = builder2.instance;
        wVar4.getClass();
        eVar8.h = wVar4;
        eVar8.b |= 32;
        builder2.build();
        readLock = kVar2.k.readLock();
        readLock.lock();
        try {
            Soda a6 = kVar2.a();
            com.google.common.base.a aVar = com.google.common.base.a.a;
            cn f2 = a6.f(eVar7, inputStream, aVar, aVar);
            readLock.unlock();
            a3.m = f2;
            new com.google.android.apps.gsa.shared.util.c.ae(a3.m, a3.g, "[NGA] NgaSodaSession.captureFutureCallback").b(new ah(a3, inputStream, 0)).a(new ai(a3, inputStream));
            this.d = a3;
        } finally {
        }
    }
}
