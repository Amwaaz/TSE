package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.ae.j.b;
import com.google.android.apps.gsa.search.core.state.d.h;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.common.base.at;
import e.a;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/s.class */
public class s extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1309a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.s");
    public final a b;
    public final a c;
    public final b d;
    public final com.google.android.apps.gsa.search.core.h.p e;
    public final at f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public com.google.android.libraries.search.d.f k;
    public com.google.android.libraries.search.d.e l;
    public boolean m;
    public long n;
    public long o;
    private final a p;
    private final a q;

    public s(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, b bVar, com.google.android.apps.gsa.search.core.h.p pVar, at atVar) {
        super(aVar, 71);
        this.j = -1L;
        this.m = false;
        this.n = 0L;
        this.b = aVar2;
        this.p = aVar3;
        this.q = aVar4;
        this.c = aVar5;
        this.d = bVar;
        this.e = pVar;
        this.f = atVar;
    }

    public final void a() {
        if (((h) this.p.a()).e) {
            ((h) this.q.a()).i();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.TTS_STOP_SPEAKING};
    }

    public final boolean b() {
        return this.h || this.g;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar == com.google.android.apps.gsa.search.shared.service.c.ac.TTS_STOP_SPEAKING) {
            a();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("AudioSessionState");
        ArrayList arrayList = new ArrayList();
        if (this.g) {
            arrayList.add("need_audio_for_query");
        }
        if (this.h) {
            arrayList.add("need_audio_for_tts");
        }
        fVar.r(new d(arrayList.toString(), false));
        fVar.b("session id when last requesting audio").a(new d(Long.valueOf(this.o), false));
    }

    public final String toString() {
        return "AudioSessionState[" + (true != this.g ? "" : "need_audio_for_query, ") + (true == this.h ? "need_audio_for_tts, " : "") + "]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        if (this.e.w(dj.c)) {
            this.g = false;
            this.h = false;
        }
    }
}
