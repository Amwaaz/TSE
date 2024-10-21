package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.state.ae;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.libraries.gsa.h.f;
import com.google.common.b.gl;
import com.google.common.b.qj;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/t.class */
public final /* synthetic */ class t implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1221a;
    public final Object b;
    private final int c;

    public /* synthetic */ t(af afVar, o oVar, int i) {
        this.c = i;
        this.b = afVar;
        this.f1221a = oVar;
    }

    public /* synthetic */ t(Object obj, Object obj2, int i) {
        this.c = i;
        this.f1221a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((af) this.b).e((o) this.f1221a, true, true);
                return;
            } else {
                ((o) this.f1221a).f((ClientEventData) this.b);
                return;
            }
        }
        x xVar = (x) this.f1221a;
        if (xVar.h) {
            return;
        }
        Object obj = this.b;
        qj j = ((gl) xVar.j.a()).a(obj).j();
        while (j.hasNext()) {
            ((ae) j.next()).hF((String) obj);
        }
    }
}
