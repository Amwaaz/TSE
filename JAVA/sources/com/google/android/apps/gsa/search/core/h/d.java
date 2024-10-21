package com.google.android.apps.gsa.search.core.h;

import com.google.android.apps.gsa.shared.k.eo;
import com.google.ap.e.c.b.g;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/d.class */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.apps.gsa.shared.logger.s f1119a;

    public d(com.google.android.apps.gsa.shared.logger.s sVar) {
        this.f1119a = sVar;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, i iVar) {
        g q = pVar.q(eo.b, g.a.getParserForType());
        this.f1119a.e = q != null ? q.b : new ArrayList();
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(p pVar) {
        a(pVar, i.f1123a);
    }
}
