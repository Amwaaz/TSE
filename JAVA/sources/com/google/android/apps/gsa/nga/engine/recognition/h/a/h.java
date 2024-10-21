package com.google.android.apps.gsa.nga.engine.recognition.h.a;

import android.util.Base64;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.g.a;
import com.google.android.apps.gsa.nga.engine.recognition.g.b;
import com.google.android.apps.gsa.nga.engine.recognition.g.d;
import com.google.android.apps.gsa.nga.engine.recognition.r;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.z.a.e;
import com.google.common.a.j;
import com.google.common.base.ci;
import com.google.common.v.f;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/h/a/h.class */
public final class h implements com.google.android.apps.gsa.nga.engine.ar.c, r, d, b, a, com.google.android.apps.gsa.shared.util.debug.a.b {
    public final f b;
    private final com.google.common.a.c d;
    private final af e;
    private static final com.google.common.f.a.d c = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f651a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    public h(ci ciVar, f fVar, af afVar) {
        j jVar = new j();
        jVar.g(10L);
        jVar.h(ciVar);
        jVar.e(12L, TimeUnit.HOURS);
        this.d = jVar.a();
        this.b = fVar;
        this.e = afVar;
    }

    private final void i(v vVar, Function function) {
        try {
            DesugarAtomicReference.updateAndGet((AtomicReference) this.d.b(vVar, new d(vVar, 0)), new e(function, 0));
        } catch (ExecutionException e) {
            aus.f(c.f(), "Failed updating utterance report cache", (char) 3854, e);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(ah ahVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final /* synthetic */ void c(com.google.android.apps.gsa.nga.engine.recognition.j jVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final /* synthetic */ void e(com.google.android.apps.gsa.nga.engine.recognition.af afVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.g.a
    public final void f(v vVar) {
        AtomicReference atomicReference = (AtomicReference) this.d.a.e(vVar);
        if (atomicReference == null) {
            return;
        }
        af afVar = this.e;
        bk bkVar = bk.UTTERANCE_REPORT;
        ba createBuilder = bj.a.createBuilder();
        com.google.android.apps.gsa.nga.shared.z.a.d dVar = (com.google.android.apps.gsa.nga.shared.z.a.d) atomicReference.get();
        createBuilder.copyOnWrite();
        bj bjVar = createBuilder.instance;
        dVar.getClass();
        bjVar.c = dVar;
        bjVar.b = 98;
        afVar.b(bkVar, (bj) createBuilder.build(), vVar.b());
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.g.b
    public final void g(v vVar) {
        i(vVar, new f(1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.d
    public final void gZ(com.google.android.apps.gsa.nga.engine.recognition.f fVar) {
        i(fVar.a, new b(fVar, 2));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.g.d
    public final void h(v vVar) {
        i(vVar, new f(0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void ha(com.google.speech.recognizer.a.f fVar, v vVar, boolean z) {
        i(vVar, new b(fVar, 6));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        Optional optional = ajVar.b;
        boolean isPresent = optional.isPresent();
        Optional optional2 = ajVar2.b;
        if (isPresent && !optional.equals(optional2)) {
            i((v) optional.get(), new b(this, 4));
        }
        if (!optional2.isPresent() || optional.equals(optional2)) {
            return;
        }
        i((v) optional2.get(), new b(this, 5));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void hg(u uVar) {
        i(uVar.j.a, new b(uVar, 3));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        if (fVar.u()) {
            return;
        }
        fVar.q("APA Speech");
        ba createBuilder = e.a.createBuilder();
        Iterator it = this.d.a.values().iterator();
        while (it.hasNext()) {
            com.google.android.apps.gsa.nga.shared.z.a.d dVar = (com.google.android.apps.gsa.nga.shared.z.a.d) ((AtomicReference) it.next()).get();
            createBuilder.copyOnWrite();
            e eVar = createBuilder.instance;
            dVar.getClass();
            cb cbVar = eVar.b;
            if (!cbVar.c()) {
                eVar.b = bi.mutableCopy(cbVar);
            }
            eVar.b.add(dVar);
        }
        fVar.s("utterance_reports(%s)", new com.google.android.apps.gsa.shared.util.b.e[]{new com.google.android.apps.gsa.shared.util.b.d(Base64.encodeToString(createBuilder.build().toByteArray(), 2), false)});
    }
}
