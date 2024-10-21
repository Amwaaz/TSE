package com.google.android.apps.gsa.search.core.ae.aq.b;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.ae.aq.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;
import com.google.g.af.a.e.f;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/aq/b/aq.class */
public final class aq implements h {

    /* renamed from: a, reason: collision with root package name */
    private final a f1067a;

    public aq(a aVar) {
        this.f1067a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.h
    public final cn a(Intent intent) {
        g rVar = new r(intent);
        ((com.google.android.apps.gsa.search.core.service.e.a.h) this.f1067a.a()).c(rVar);
        return rVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.h
    public final cn b(f fVar) {
        g sVar = new s(fVar);
        ((com.google.android.apps.gsa.search.core.service.e.a.h) this.f1067a.a()).c(sVar);
        return sVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.h
    public final cn c(byte[] bArr) {
        g tVar = new t(bArr);
        ((com.google.android.apps.gsa.search.core.service.e.a.h) this.f1067a.a()).c(tVar);
        return tVar;
    }
}
