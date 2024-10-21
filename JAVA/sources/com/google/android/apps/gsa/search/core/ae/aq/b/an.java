package com.google.android.apps.gsa.search.core.ae.aq.b;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.ae.aq.e;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.shared.service.c.ij;
import com.google.common.util.concurrent.cn;
import com.google.g.q.b.es;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/aq/b/an.class */
public final class an implements e {

    /* renamed from: a, reason: collision with root package name */
    private final a f1065a;

    public an(a aVar) {
        this.f1065a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.e
    public final cn a(Intent intent) {
        g kVar = new k(intent);
        ((h) this.f1065a.a()).c(kVar);
        return kVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.e
    public final cn b(ij ijVar) {
        g uVar = new u(ijVar);
        ((h) this.f1065a.a()).c(uVar);
        return uVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.e
    public final cn c(es esVar) {
        g atVar = new at(esVar);
        ((h) this.f1065a.a()).c(atVar);
        return atVar;
    }
}
