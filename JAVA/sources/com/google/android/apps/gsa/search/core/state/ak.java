package com.google.android.apps.gsa.search.core.state;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.b.d;
import e.a;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ak.class */
public final class ak extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1235a;
    public final BitFlags b;
    public final com.google.android.apps.gsa.search.core.ae.am.a c;
    public final com.google.android.apps.gsa.search.core.ae.bl.a d;
    boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final a m;
    private final a n;
    private final SharedPreferences o;
    private boolean p;
    private long q;

    public ak(a aVar, a aVar2, a aVar3, a aVar4, SharedPreferences sharedPreferences, com.google.android.apps.gsa.search.core.ae.am.a aVar5, com.google.android.apps.gsa.search.core.ae.bl.a aVar6) {
        super(aVar, 65);
        this.b = new BitFlags(getClass(), "FLAG_", 0L);
        this.q = -1L;
        this.i = -1L;
        this.m = aVar2;
        this.f1235a = aVar3;
        this.n = aVar4;
        this.o = sharedPreferences;
        this.c = aVar5;
        this.d = aVar6;
    }

    public final void a(boolean z) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.common.f.am.d.getClass();
        long j = ((j) this.m.a()).b;
        boolean p = ((j) this.m.a()).f1303a.p();
        if (j != this.q) {
            this.q = j;
            com.google.android.apps.gsa.search.core.ae.bl.a aVar = this.d;
            boolean z2 = false;
            if (p) {
                z2 = false;
                if (z) {
                    z2 = true;
                }
            }
            aVar.g(z2);
        }
        if (this.b.h(1L, z)) {
            this.d.d(z);
        }
    }

    public final boolean c(j jVar, TtsState ttsState) {
        SharedPreferences sharedPreferences = this.o;
        boolean z = this.p;
        boolean z2 = sharedPreferences.getBoolean("always_on_hotword_suppressed", false) && jVar.f1303a.i() && !ttsState.y();
        this.p = z2;
        if (!z && z2) {
            this.c.k();
        }
        return z != this.p;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        if ("always_on_hotword_suppressed".equals(str) && c((j) this.m.a(), (TtsState) this.n.a())) {
            an();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"always_on_hotword_suppressed"};
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("MicroDetectionSessionState");
        fVar.b("flags").a(new d(this.b.b(), false));
        ArrayList arrayList = new ArrayList();
        if (this.e) {
            arrayList.add("active assistant interaction");
        }
        fVar.r(new d(arrayList.toString(), false));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("mIsActiveAssistantInteraction=" + this.e);
        arrayList.add("mUnenrollAlwaysOn=" + this.p);
        return "MicroDetectionSessionState(state=" + arrayList.toString() + ", flags=" + this.b.b() + ")";
    }
}
