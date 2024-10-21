package com.google.android.apps.gsa.search.core.service.e.a;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.em;
import com.google.common.b.dk;
import com.google.common.b.pq;
import com.google.common.base.cl;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a/k.class */
public final class k implements com.google.android.apps.gsa.shared.util.debug.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f1183a;

    public k(p pVar) {
        int i = (int) pVar.i(em.b);
        cl.w(i > 0, "maxSize {%} must be > 0.", i);
        this.f1183a = new pq(new dk(i));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkHistory");
        fVar.b("WorkHistory_Length").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.f1183a.size()), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Enqueue time: +delegation (ms), +completion (ms), status, name", false));
        Iterator it = this.f1183a.iterator();
        while (it.hasNext()) {
            fVar.k((com.google.android.apps.gsa.search.core.service.e.f) it.next());
        }
    }
}
