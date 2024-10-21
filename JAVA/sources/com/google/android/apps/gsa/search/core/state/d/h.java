package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.core.ae.j.b;
import com.google.android.apps.gsa.search.core.state.ap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/h.class */
public class h extends com.google.android.apps.gsa.search.core.state.ae implements ap {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1284a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.h");
    public boolean b;
    public boolean c;
    public final Set d;
    public boolean e;
    public boolean f;
    public int g;
    private final b h;
    private final com.google.android.apps.gsa.search.core.ae.bt.b i;

    public h(e.a aVar, b bVar, com.google.android.apps.gsa.search.core.ae.bt.b bVar2) {
        super(aVar, 0);
        this.d = new HashSet();
        this.g = 1;
        this.h = bVar;
        this.i = bVar2;
    }

    public final void c() {
        if (k()) {
            return;
        }
        this.h.g();
    }

    public final void f() {
        if (!this.e) {
            com.google.common.f.h f = f1284a.f();
            f.ak(7937);
            f.p("Tts is already done");
        }
        this.e = false;
        l(1);
        an();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("AudioState");
        ArrayList arrayList = new ArrayList();
        if (this.b) {
            arrayList.add("need_audio_for_pending_beeps");
        }
        if (this.c) {
            arrayList.add("need_audio_for_pending_beeps_sync");
        }
        if (this.f) {
            arrayList.add("system_spoken_feedback_enabled");
        }
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d(arrayList.toString(), false));
        fVar.b("Sessions using audio:").a(new com.google.android.apps.gsa.shared.util.b.d(this.d, false));
    }

    public final void i() {
        if (this.e) {
            this.i.c();
        }
        l(1);
    }

    public final boolean k() {
        return this.b || this.c || !this.d.isEmpty();
    }

    public final void l(int i) {
        int i2 = i;
        if (!this.e) {
            i2 = i;
            if (i != 1) {
                com.google.common.f.h e = f1284a.e();
                e.ak(7941);
                e.p("Trying to set status when tts is not available");
                i2 = 1;
            }
        }
        if (this.g == i2) {
            return;
        }
        this.g = i2;
        an();
    }

    public final String toString() {
        return "AudioState[" + (true != this.b ? "" : "need_audio_for_pending_beeps, ") + (true == this.f ? "system_spoken_feedback_enabled, " : "") + "]";
    }
}
