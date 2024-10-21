package com.google.android.apps.gsa.nga.engine.x;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.af;
import com.google.android.apps.gsa.nga.engine.recognition.f;
import com.google.android.apps.gsa.nga.engine.recognition.r;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.engine.t.e;
import com.google.android.apps.gsa.nga.shared.q.a.am;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ad;
import com.google.android.apps.gsa.nga.shared.q.c.dv;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/x/j.class */
public final class j implements e, r {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f831a = new AtomicReference(i.NOT_IN_LIFECYCLE);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference c = new AtomicReference("UNKNOWN");
    private final x d;
    private final am e;

    public j(am amVar, x xVar) {
        this.e = amVar;
        this.d = xVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void c(com.google.android.apps.gsa.nga.engine.recognition.j jVar) {
        this.c.set(jVar.a.name());
        this.f831a.set(this.b.get() ? i.IN_LIFECYCLE : i.NOT_IN_LIFECYCLE);
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void e(af afVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.e
    public final void f(boolean z) {
        this.b.set(false);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [e.a, java.lang.Object] */
    public final void g(com.google.android.apps.gsa.nga.engine.recognition.a aVar) {
        String str = (String) this.c.get();
        if (str == null) {
            throw new NullPointerException("Null speechRecognizer");
        }
        String name = ((i) this.f831a.get()).name();
        if (name == null) {
            throw new NullPointerException("Null lifecycleStateOnInvocation");
        }
        String name2 = aVar.name();
        if (name2 == null) {
            throw new NullPointerException("Null timeoutType");
        }
        this.d.b(new dv("NGA_SPEECH_NOT_RECOGNIZED2", str, name, name2));
        am amVar = this.e;
        ((com.google.android.libraries.ax.h) ((ad) amVar.c.a()).k.a()).b(1L, amVar.b, amVar.f976a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.d
    public final void gZ(f fVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.e
    public final void h() {
        this.b.set(true);
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final /* synthetic */ void ha(com.google.speech.recognizer.a.f fVar, v vVar, boolean z) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void hg(u uVar) {
    }
}
