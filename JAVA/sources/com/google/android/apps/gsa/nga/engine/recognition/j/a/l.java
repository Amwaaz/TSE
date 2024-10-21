package com.google.android.apps.gsa.nga.engine.recognition.j.a;

import com.google.android.apps.gsa.nga.api.a.ai;
import com.google.android.apps.gsa.nga.api.a.am;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.bisto.b.e;
import com.google.android.apps.gsa.nga.engine.bisto.b.f;
import com.google.android.apps.gsa.nga.engine.recognition.aa;
import com.google.android.apps.gsa.nga.engine.recognition.ac;
import com.google.android.apps.gsa.nga.engine.recognition.d.a;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.libraries.assistant.soda.t;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.d.dl;
import com.google.common.base.ci;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import e.c.c;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/j/a/l.class */
public final class l implements aa {

    /* renamed from: a, reason: collision with root package name */
    public static final d f653a = d.j();
    public final h b;
    public final a c;
    public a d = null;
    private final b e;
    private final com.google.android.apps.gsa.nga.engine.ar.c.a f;
    private final f g;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d h;

    public l(h hVar, b bVar, com.google.android.apps.gsa.nga.engine.ar.c.a aVar, f fVar, a aVar2, com.google.android.apps.gsa.nga.engine.ar.b.d dVar) {
        this.b = hVar;
        this.e = bVar;
        this.f = aVar;
        this.g = fVar;
        this.c = aVar2;
        this.h = dVar;
    }

    private final void i(ac acVar) {
        if (acVar.e.isPresent()) {
            this.f.c((HotwordResult) acVar.e.get());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final void a(v vVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean c(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        i(acVar);
        this.b.n("[NGA] RohanSpeechRecognizer.reset", new d(this, acVar, dVar, 3));
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean d(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar) {
        if (!acVar.g.isEmpty()) {
            i(acVar);
            this.b.n("[NGA] RohanSpeechRecognizer.start", new d(this, acVar, dVar, 4));
            return true;
        }
        com.google.common.f.a.a f = f653a.f();
        f.ak(3888);
        f.p("SpeechSessionParams don't have invocation token!");
        this.c.b(acVar);
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean e() {
        this.b.n("[NGA] RohanSpeechRecognizer.stop", new k(this, this.h.a().f.equals(com.google.android.apps.gsa.nga.shared.q.d.l.SESSION_CANCELLATION)));
        return true;
    }

    public final void f(ac acVar, com.google.android.apps.gsa.nga.engine.v.d dVar, Optional optional) {
        if (this.d != null) {
            return;
        }
        if (optional.isEmpty()) {
            Optional optional2 = acVar.g;
            f fVar = this.g;
            dl dlVar = (dl) optional2.get();
            new ae(fVar.b.a("[NGA] QueryStatusDispatcherImpl#onRohanFollowOn", new e(fVar, dlVar)), this.b, "[NGA] RohanSpeechRecognizer.start").a(new h(this, acVar, dVar, dlVar)).a(new i(this, dlVar, acVar));
            return;
        }
        com.google.common.f.a.a d = f653a.d();
        d.ak(3880);
        d.H("Starting Rohan session with utterance id %s and %s", dVar.a.d(), com.google.android.apps.gsa.nga.shared.d.d.d.a((am) optional.get()));
        b bVar = this.e;
        am amVar = (am) optional.get();
        e.a b = c.b(bVar.f652a.a);
        b.getClass();
        e.a b2 = c.b(bVar.b.a);
        b2.getClass();
        ci ciVar = (ci) bVar.c.a();
        ciVar.getClass();
        a aVar = new a(dVar, amVar, acVar, b, b2, ciVar);
        g gVar = (g) aVar.d.a();
        com.google.android.apps.gsa.nga.engine.v.d dVar2 = aVar.f;
        dVar2.a.d();
        gVar.k.set(dVar2);
        h.a.a.p.b.a.f.J(gVar.j, dVar2);
        ((com.google.android.apps.gsa.nga.api.b.a) aVar.b.a()).a((t) aVar.d.a(), aVar.c);
        com.google.common.f.a.a d2 = a.a.d();
        d2.ak(3862);
        am amVar2 = aVar.c;
        d2.H("Starting Rohan session %s for utteranceid %s", com.google.android.apps.gsa.nga.shared.d.d.d.a(amVar2), aVar.g);
        this.d = aVar;
    }

    public final void g() {
        a aVar = this.d;
        this.d = null;
        if (aVar != null) {
            com.google.common.f.a.a d = f653a.d();
            d.ak(3881);
            d.s("Stopping Rohan session %s", aVar.f.a);
            ((com.google.android.apps.gsa.nga.api.b.a) aVar.b.a()).b(aVar.c);
            com.google.common.f.a.a d2 = a.a.d();
            d2.ak(3863);
            d2.H("Stopped Rohan session %s for utteranceid %s", com.google.android.apps.gsa.nga.shared.d.d.d.a(aVar.c), aVar.g);
            long a2 = aVar.e.a(TimeUnit.MILLISECONDS);
            com.google.common.f.a.a d3 = a.a.d();
            d3.ak(3861);
            d3.N("Rohan session %s for utteranceid %s duration is %d ms", com.google.android.apps.gsa.nga.shared.d.d.d.a(aVar.c), aVar.g, Long.valueOf(a2));
        }
    }

    public final void h(ac acVar, int i) {
        ba createBuilder = ai.a.createBuilder();
        Object obj = acVar.g.get();
        createBuilder.copyOnWrite();
        ai aiVar = createBuilder.instance;
        aiVar.c = (dl) obj;
        aiVar.b |= 1;
        createBuilder.copyOnWrite();
        createBuilder.instance.d = i - 2;
        this.g.h(createBuilder.build());
    }
}
