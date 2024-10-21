package com.google.android.apps.gsa.nga.engine.recognition.h.a;

import android.util.Base64;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.recognition.k;
import com.google.android.apps.gsa.nga.engine.recognition.m;
import com.google.android.apps.gsa.nga.shared.z.a.a;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.libraries.search.d.br;
import com.google.android.libraries.search.d.bt;
import com.google.common.a.j;
import com.google.common.base.ci;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/h/a/c.class */
public final class c implements k, b {

    /* renamed from: a, reason: collision with root package name */
    private static final d f650a = d.j();
    private final com.google.common.a.c b;

    public c(ci ciVar) {
        j jVar = new j();
        jVar.g(10L);
        jVar.h(ciVar);
        jVar.e(24L, TimeUnit.HOURS);
        this.b = jVar.a();
    }

    private final void a(com.google.android.apps.gsa.nga.shared.z.a.c cVar, Function function) {
        try {
            DesugarAtomicReference.updateAndGet((AtomicReference) this.b.b(cVar, new d(cVar, 1)), new e(function, 1));
        } catch (ExecutionException e) {
            aus.f(f650a.f(), "Failed updating audio report cache", (char) 3853, e);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final /* synthetic */ void f(m mVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final void g(com.google.android.apps.gsa.nga.shared.z.a.c cVar, br brVar) {
        a(cVar, new b(brVar, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final /* synthetic */ void h(Optional optional) {
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        if (fVar.u()) {
            return;
        }
        fVar.q("APA Speech");
        ba createBuilder = com.google.android.apps.gsa.nga.shared.z.a.b.a.createBuilder();
        Iterator it = this.b.a.values().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((AtomicReference) it.next()).get();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.z.a.b bVar = createBuilder.instance;
            aVar.getClass();
            cb cbVar = bVar.b;
            if (!cbVar.c()) {
                bVar.b = bi.mutableCopy(cbVar);
            }
            bVar.b.add(aVar);
        }
        fVar.s("audio_reports(%s)", new e[]{new com.google.android.apps.gsa.shared.util.b.d(Base64.encodeToString(createBuilder.build().toByteArray(), 2), false)});
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final void i(com.google.android.apps.gsa.nga.shared.z.a.c cVar, bt btVar) {
        a(cVar, new b(btVar, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final void j(com.google.android.apps.gsa.nga.shared.z.a.c cVar, int i) {
        a(cVar, new a(i));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final /* synthetic */ void k(m mVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.k
    public final /* synthetic */ void l(m mVar) {
    }
}
