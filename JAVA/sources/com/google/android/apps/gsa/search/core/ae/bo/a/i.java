package com.google.android.apps.gsa.search.core.ae.bo.a;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.ae.bo.b;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.common.util.concurrent.cn;
import com.google.g.e.i.lq;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bo/a/i.class */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    private final a f1076a;

    public i(a aVar) {
        this.f1076a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bo.b
    public final cn a(Intent intent) {
        g aVar = new a(intent);
        ((h) this.f1076a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bo.b
    public final cn b(byte[] bArr) {
        g bVar = new b(bArr);
        ((h) this.f1076a.a()).c(bVar);
        return bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bo.b
    public final cn c(byte[] bArr) {
        g dVar = new d(bArr);
        ((h) this.f1076a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bo.b
    public final cn f(lq lqVar) {
        g eVar = new e(lqVar);
        ((h) this.f1076a.a()).c(eVar);
        return eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bo.b
    public final cn g(Object obj) {
        g fVar = new f(obj);
        ((h) this.f1076a.a()).c(fVar);
        return fVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bo.b
    public final cn h(String str, boolean z) {
        g gVar = new g(str, z);
        ((h) this.f1076a.a()).c(gVar);
        return gVar;
    }
}
