package com.google.android.apps.gsa.nga.engine.recognition.c;

import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.b.b.q;
import com.google.android.apps.gsa.nga.engine.ar.b.b.s;
import com.google.android.apps.gsa.nga.engine.ar.b.w;
import com.google.android.apps.gsa.nga.engine.ar.d;
import com.google.android.apps.gsa.nga.engine.ar.o;
import com.google.android.apps.gsa.nga.engine.b.f.a.m;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.q.c;
import com.google.android.apps.gsa.nga.engine.recognition.aa;
import com.google.android.apps.gsa.nga.engine.recognition.af;
import com.google.android.apps.gsa.nga.engine.recognition.b;
import com.google.android.apps.gsa.nga.engine.recognition.b.e;
import com.google.android.apps.gsa.nga.engine.recognition.r;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.engine.ui.e.h.ad;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.engine.viss.v;
import com.google.android.apps.gsa.nga.engine.x.j;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.ca;
import com.google.android.apps.gsa.nga.shared.q.d.bu;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;
import com.google.common.f.ab;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/c/i.class */
public final class i implements r, d, b, com.google.android.apps.gsa.nga.engine.recognition.g.d {
    private static final com.google.common.f.a.d s = com.google.common.f.a.d.j();
    private static final ha t = ha.t(l.OFFLINE_SPEECH_ENDED, l.MANUAL_ENDPOINT, l.ENDPOINT_ON_TIMEOUT);
    private final com.google.android.apps.gsa.nga.engine.recognition.n.a.i A;
    private final com.google.android.apps.gsa.nga.engine.b.f.a.r B;
    private final x C;
    private final y D;
    private final ap E;
    private final ad F;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.libraries.gsa.h.h f646a;
    public final n b;
    public final a c;
    public final e f;
    public final j g;
    public final v h;
    public final e.a l;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d p;
    public final s q;
    public final com.google.android.apps.gsa.nga.engine.b.f.a.r r;
    private final e.a u;
    private final c v;
    private final o w;
    private final com.google.android.apps.gsa.x.a.e x;
    private final com.google.android.apps.gsa.nga.engine.e.b.a.i y;
    private final com.google.android.apps.gsa.nga.engine.x.a z;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public bu i = bu.f984a;
    public l j = l.UNKNOWN;
    public cn k = ci.a;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final AtomicReference o = new AtomicReference();

    public i(com.google.android.apps.gsa.nga.engine.ar.b.d dVar, s sVar, e.a aVar, c cVar, com.google.android.apps.gsa.nga.engine.b.f.a.r rVar, aw awVar, ap apVar, com.google.android.apps.gsa.nga.engine.recognition.n.a.i iVar, com.google.android.apps.gsa.nga.engine.b.f.a.r rVar2, o oVar, n nVar, ad adVar, a aVar2, com.google.android.apps.gsa.x.a.e eVar, com.google.android.apps.gsa.nga.engine.e.b.a.i iVar2, e eVar2, x xVar, j jVar, v vVar, y yVar, com.google.android.apps.gsa.nga.engine.x.a aVar3, e.a aVar4) {
        this.F = adVar;
        this.y = iVar2;
        this.p = dVar;
        this.q = sVar;
        this.u = aVar;
        this.v = cVar;
        this.r = rVar;
        this.f646a = awVar.a(h.class);
        this.E = apVar;
        this.A = iVar;
        this.B = rVar2;
        this.w = oVar;
        this.b = nVar;
        this.c = aVar2;
        this.x = eVar;
        this.f = eVar2;
        this.C = xVar;
        this.g = jVar;
        this.h = vVar;
        this.D = yVar;
        this.z = aVar3;
        this.l = aVar4;
    }

    private final void k(String str, l lVar) {
        String name = lVar.name();
        if (name == null) {
            throw new NullPointerException("Null attentionTrigger");
        }
        this.C.b(new ca("NGA_INVOCATION", str, name));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
        if (ahVar == ah.FULL_LISTENING) {
            com.google.common.f.a.a d = s.d();
            d.ak(3841);
            d.p("NGA starts FULL_LISTENING");
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void c(com.google.android.apps.gsa.nga.engine.recognition.j jVar) {
        ab abVar = com.google.common.f.a.e.a;
        this.q.b.a(l.INITIAL_RESULT, com.google.android.apps.gsa.nga.shared.q.ah.a);
        this.v.d();
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void e(af afVar) {
        com.google.android.apps.gsa.nga.engine.b.f.a.r rVar = this.B;
        rVar.b.n("[NGA] onTranscriptResult", new m(rVar, afVar, 3));
        boolean a2 = this.w.a(afVar.a());
        ab abVar = com.google.common.f.a.e.a;
        s sVar = this.q;
        sVar.c.n("[NGA] extendTimeoutOnUserSpeaks", new com.google.android.apps.gsa.nga.engine.ar.b.b.r(sVar, a2));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.b
    public final void f(com.google.android.apps.gsa.nga.engine.b.g.v vVar, com.google.android.apps.gsa.nga.engine.recognition.a aVar) {
        aVar.name();
        this.f646a.n("[NGA] NgaHandler.onListeningStateTimeout", new e(this, vVar, aVar, 1));
    }

    public final void g(com.google.android.apps.gsa.nga.engine.b.g.v vVar, l lVar) {
        f.e(t.contains(lVar));
        this.n.set(true);
        ab abVar = com.google.common.f.a.e.a;
        s sVar = this.q;
        sVar.c.n("[NGA] onEnterPendingExecutionState", new q(sVar, lVar, vVar, 0));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, com.google.android.apps.gsa.nga.engine.ui.d.b.a] */
    @Override // com.google.android.apps.gsa.nga.engine.recognition.d
    public final void gZ(com.google.android.apps.gsa.nga.engine.recognition.f fVar) {
        Optional optional = this.p.a().b;
        if (optional.isEmpty() || !((com.google.android.apps.gsa.nga.engine.b.g.v) optional.get()).equals(fVar.a)) {
            return;
        }
        ad adVar = this.F;
        float f = fVar.c;
        for (com.google.android.apps.gsa.nga.engine.ui.e.a.a.b bVar : adVar.f741a) {
            long millis = TimeUnit.NANOSECONDS.toMillis(bVar.f688a.a());
            synchronized (bVar.d) {
                com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) bVar.c.c();
                com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar2 = com.google.android.apps.gsa.nga.engine.ui.e.n.j.f787a;
                int i = iVar.b;
                if (i == 3 || i == 6) {
                    if (millis - bVar.e > 100) {
                        bVar.b.n("[NGA] setAudioInfo", new com.google.android.apps.gsa.nga.engine.ui.e.a.a.a(bVar, f));
                        bVar.e = millis;
                    }
                }
            }
        }
        adVar.b.b(f);
        if (this.c.i(eu.fn) && this.o.get() == com.google.android.apps.gsa.nga.shared.u.i.b.S3) {
            return;
        }
        e eVar = this.f;
        float f2 = fVar.c;
        synchronized (eVar) {
            if (eVar.f645a && eVar.b < f2) {
                eVar.b = f2;
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.g.d
    public final void h(com.google.android.apps.gsa.nga.engine.b.g.v vVar) {
        if (this.c.i(eu.fn)) {
            this.f.e.set(true);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void ha(com.google.speech.recognizer.a.f fVar, com.google.android.apps.gsa.nga.engine.b.g.v vVar, boolean z) {
        this.f646a.n("[NGA] NgaHandler.onEndpointerEvent", new c(this, fVar, z, vVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01b9 A[Catch: all -> 0x04d8, TRY_ENTER, TryCatch #2 {all -> 0x04d8, blocks: (B:8:0x0099, B:10:0x00ba, B:12:0x00c4, B:14:0x00f8, B:16:0x00fe, B:18:0x0107, B:20:0x0110, B:22:0x012f, B:24:0x0136, B:27:0x0146, B:29:0x0192, B:31:0x01b9, B:33:0x01d9, B:34:0x0200, B:39:0x017f, B:40:0x0264, B:42:0x0272, B:43:0x0294, B:45:0x029e, B:46:0x02c0, B:48:0x02e0, B:50:0x02ea, B:52:0x032c, B:54:0x0339, B:56:0x0345, B:58:0x034e, B:61:0x03d1, B:65:0x0434, B:66:0x0439, B:72:0x044f, B:78:0x0499, B:79:0x03e1, B:85:0x03fd, B:86:0x0410, B:87:0x0423, B:89:0x049b, B:91:0x04a1, B:93:0x04ab, B:94:0x04ca, B:95:0x0371, B:96:0x0340, B:97:0x030c, B:69:0x043b, B:70:0x044d), top: B:7:0x0099, inners: #1 }] */
    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void hc(com.google.android.apps.gsa.nga.engine.ar.aj r9, com.google.android.apps.gsa.nga.engine.ar.aj r10) {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.c.i.hc(com.google.android.apps.gsa.nga.engine.ar.aj, com.google.android.apps.gsa.nga.engine.ar.aj):void");
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void hg(u uVar) {
        boolean z;
        if (this.b.d(uVar)) {
            uVar.b();
            return;
        }
        this.b.c(uVar);
        if (uVar.l == com.google.android.apps.gsa.nga.engine.recognition.h.e) {
            s sVar = this.q;
            ab abVar = com.google.common.f.a.e.a;
            w wVar = sVar.b;
            l lVar = l.PROACTIVE_QUERY;
            com.google.android.apps.gsa.assistant.shared.k.c cVar = com.google.android.apps.gsa.assistant.shared.k.c.OPA_SUGGESTION_CHIP;
            ba createBuilder = com.google.android.apps.gsa.nga.shared.q.d.m.a.createBuilder();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.q.d.m mVar = createBuilder.instance;
            mVar.c = lVar.aO;
            mVar.b |= 1;
            ba createBuilder2 = bu.f984a.createBuilder();
            createBuilder2.copyOnWrite();
            bu buVar = (bu) createBuilder2.instance;
            buVar.c = cVar.cF;
            buVar.b |= 1;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.q.d.m mVar2 = createBuilder.instance;
            bu buVar2 = (bu) createBuilder2.build();
            buVar2.getClass();
            mVar2.d = buVar2;
            mVar2.b |= 4;
            wVar.b((com.google.android.apps.gsa.nga.shared.q.d.m) createBuilder.build(), com.google.android.apps.gsa.nga.shared.q.ah.a);
            sVar.c.n("[NGA] onProactiveQuery", new com.google.android.apps.gsa.nga.engine.ar.b.b.b(sVar, 15));
        }
        String b = com.google.android.apps.gsa.nga.shared.ag.a.b(uVar.b().trim(), this.D.c().d);
        com.google.android.apps.gsa.nga.engine.x.a aVar = this.z;
        com.google.android.apps.gsa.nga.engine.b.c.a aVar2 = uVar.j;
        Object obj = aVar.f827a;
        com.google.android.apps.gsa.nga.engine.b.g.v vVar = aVar2.a;
        synchronized (obj) {
            if (uVar.d()) {
                z = aVar.b.remove(vVar);
            } else {
                if (!b.isEmpty()) {
                    aVar.b.add(vVar);
                    while (aVar.b.size() > 8) {
                        aVar.b.pollFirst();
                    }
                }
                z = false;
            }
        }
        if (uVar.d()) {
            x xVar = aVar.c;
            String name = uVar.l.name();
            if (name == null) {
                throw new NullPointerException("Null speechRecognizer");
            }
            xVar.b(new com.google.android.apps.gsa.nga.shared.q.c.q("EMPTY_RECOGNITION", name, z, !b.isEmpty()));
        }
        this.f646a.n("[NGA] NgaHandler.onRecognitionResult", new e(this, b, uVar, 0));
    }

    public final void i(com.google.android.apps.gsa.nga.engine.b.g.v vVar, com.google.android.apps.gsa.shared.logger.b.w wVar, l lVar) {
        com.google.android.apps.gsa.nga.engine.b.f.a.r rVar = this.r;
        rVar.b.n("[NGA] onListeningTimeout", new m(rVar, vVar, 1));
        this.q.a(wVar, lVar);
    }

    public final boolean j() {
        return ((aa) this.u.a()).b();
    }
}
