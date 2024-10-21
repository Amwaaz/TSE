package com.google.android.apps.gsa.search.core.af;

import com.google.android.apps.gsa.search.core.service.f.b.a;
import com.google.android.apps.gsa.search.core.state.cl;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.w.a.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/af/c.class */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private final a f1096a;
    private final e b;

    public c(a aVar, e eVar) {
        super(aVar.d, aVar.e);
        this.f1096a = aVar;
        this.b = eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b.a
    public final void a(cl clVar) {
        a aVar = this.f1096a;
        long a2 = this.b.a();
        aVar.a(clVar);
        com.google.android.apps.gsa.w.b.b(this.b, a2);
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final boolean e() {
        return this.f1096a.e();
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b.a
    public final /* synthetic */ com.google.android.apps.gsa.search.core.service.f.b f() {
        return this.f1096a;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b.a
    public final void g(cl clVar) {
        a aVar = this.f1096a;
        long a2 = this.b.a();
        aVar.g(clVar);
        com.google.android.apps.gsa.w.b.b(this.b, a2);
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.search.core.service.f.b
    public final void gR() {
        a aVar = this.f1096a;
        long a2 = this.b.a();
        aVar.gR();
        com.google.android.apps.gsa.w.b.b(this.b, a2);
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        this.f1096a.hq(fVar);
    }
}
