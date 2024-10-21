package com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.d;

import com.google.android.apps.gsa.opa.smartspace.p;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c;
import com.google.android.apps.search.assistant.verticals.ambient.n.r;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.i;
import com.google.common.v.f;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/b/d/g.class */
public final class g extends c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final cq f1750a;
    public final p b;
    public final r c;
    public final f d;
    public final e e;
    private final com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a f = new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a();

    public g(e eVar, cq cqVar, p pVar, r rVar, f fVar) {
        this.e = eVar;
        this.f1750a = cqVar;
        this.b = pVar;
        this.c = rVar;
        this.d = fVar;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.a
    public final cn a() {
        return i.g((cn) this.f.a(new c(this)), ex.b(new a()), this.f1750a);
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c
    public final void b(v vVar) {
        if (vVar == v.ar) {
            this.f.b(new c(this));
        }
    }
}
