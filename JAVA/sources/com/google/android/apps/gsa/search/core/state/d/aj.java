package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.core.state.ap;
import com.google.android.apps.gsa.shared.util.debug.a.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/aj.class */
public final class aj extends com.google.android.apps.gsa.search.core.state.ae implements ap {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.search.core.ae.bq.a f1280a;
    public com.google.android.ssb.d b;
    public int c;

    public aj(e.a aVar, com.google.android.apps.gsa.search.core.ae.bq.a aVar2) {
        super(aVar, 13);
        this.c = 1;
        this.f1280a = aVar2;
    }

    public static com.google.android.ssb.d f(h hVar, ah ahVar) {
        com.google.android.ssb.d dVar;
        if (hVar.e) {
            return com.google.android.ssb.d.e;
        }
        int i = ahVar.f1278a;
        if (i == 1 || i == 2) {
            dVar = com.google.android.ssb.d.b;
        } else {
            if (i != 3) {
                if (i == 4) {
                    dVar = com.google.android.ssb.d.d;
                } else if (i != 10) {
                    dVar = com.google.android.ssb.d.a;
                }
            }
            dVar = com.google.android.ssb.d.c;
        }
        return (dVar == com.google.android.ssb.d.a && hVar.k()) ? com.google.android.ssb.d.d : dVar;
    }

    public final com.google.android.ssb.d c() {
        com.google.android.ssb.d dVar = this.b;
        com.google.android.ssb.d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = com.google.android.ssb.d.a;
        }
        return dVar2;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.b("ssb audio state").a(new com.google.android.apps.gsa.shared.util.b.d(this.b, false));
        e b = fVar.b("voice dialog state");
        int i = this.c;
        b.a(new com.google.android.apps.gsa.shared.util.b.d(i != 0 ? i != 1 ? "SPEAKING" : "PROCESSING" : "LISTENING", false));
    }
}
