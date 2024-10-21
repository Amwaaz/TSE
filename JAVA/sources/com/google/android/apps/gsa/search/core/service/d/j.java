package com.google.android.apps.gsa.search.core.service.d;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.service.z;
import com.google.android.apps.gsa.shared.k.cy;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1167a;

    public j(p pVar) {
        this.f1167a = ha.o(pVar.m(cy.d));
    }

    public j(e.a aVar) {
        this.f1167a = aVar;
    }

    public final boolean a(String str) {
        return ((ha) this.f1167a).contains(str) || z.d.contains(str);
    }
}
