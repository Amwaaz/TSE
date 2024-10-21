package com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/b/c/f.class */
public final class f extends c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final cq f1749a;
    public final d b;
    public final e c;
    private final com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a d = new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a();

    public f(e eVar, com.google.android.apps.gsa.opa.a.a.a aVar, cq cqVar) {
        this.c = eVar;
        this.f1749a = cqVar;
        this.b = aVar.b(this);
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.a
    public final cn a() {
        return (cn) this.d.a(new a(this));
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c
    public final void b(v vVar) {
        if (vVar == v.T) {
            this.d.b(new a(this));
        }
    }
}
