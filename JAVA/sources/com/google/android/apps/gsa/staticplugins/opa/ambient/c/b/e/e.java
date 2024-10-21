package com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.e;

import com.google.android.apps.gsa.opa.smartspace.p;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/b/e/e.class */
public final class e extends c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final cq f1751a;
    public final p b;
    public final com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a.e c;
    private final com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a d = new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a();

    public e(com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a.e eVar, cq cqVar, p pVar) {
        this.c = eVar;
        this.f1751a = cqVar;
        this.b = pVar;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.a
    public final cn a() {
        return (cn) this.d.a(new c(this));
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c
    public final void b(v vVar) {
        if (vVar == v.ar) {
            this.d.b(new c(this));
        }
    }
}
