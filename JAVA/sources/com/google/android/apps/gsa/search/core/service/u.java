package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.service.f.b;
import com.google.android.apps.gsa.search.core.service.f.b.a;
import com.google.android.apps.gsa.search.core.service.f.c;
import com.google.android.apps.gsa.search.core.state.ae;
import com.google.android.apps.gsa.search.core.state.cm;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/u.class */
final class u implements c {
    @Override // com.google.android.apps.gsa.search.core.service.f.c
    public final void a(b bVar) {
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            cm cmVar = new cm(null, ae.y);
            aVar.g(cmVar);
            aVar.a(cmVar);
        }
    }
}
