package com.google.android.apps.gsa.search.core.udc;

import com.google.android.apps.gsa.search.core.h.c;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.ee;
import com.google.android.apps.gsa.tasks.ar;
import com.google.android.apps.gsa.tasks.s;
import com.google.common.f.ab;
import com.google.protobuf.ba;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/udc/m.class */
public final class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final a f1322a;
    private final a b;

    public m(a aVar, a aVar2) {
        this.f1322a = aVar;
        this.b = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, i iVar) {
        boolean w = pVar.w(ee.m);
        if (w != ((com.google.android.apps.gsa.search.core.preferences.n) this.f1322a.a()).getBoolean("udc_cache_exp", false)) {
            ab abVar = com.google.common.f.a.e.a;
            com.google.android.apps.gsa.tasks.m mVar = (com.google.android.apps.gsa.tasks.m) this.b.a();
            ar arVar = ar.FETCH_OPT_IN_STATUSES;
            ba createBuilder = s.a.createBuilder();
            createBuilder.copyOnWrite();
            s sVar = createBuilder.instance;
            sVar.e = 1;
            sVar.b |= 4;
            mVar.f(arVar, (s) createBuilder.build());
            com.google.android.apps.gsa.search.core.preferences.i f = ((com.google.android.apps.gsa.search.core.preferences.n) this.f1322a.a()).f();
            if (w) {
                f.a("udc_cache_exp", true);
            } else {
                f.h("udc_cache_exp");
            }
            f.b(false);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final /* synthetic */ void iW(p pVar) {
    }
}
