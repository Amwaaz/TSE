package com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.k;

import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.staticplugins.ba.ag;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g;
import com.google.android.apps.search.assistant.platform.pcp.api.m;
import com.google.apps.tiktok.concurrent.k;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import e.a;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/d/k/f.class */
public final class f implements g, m {

    /* renamed from: a, reason: collision with root package name */
    private final d f1743a;
    private final a b;
    private final c c;
    private e d;

    public f(com.google.android.apps.gsa.opa.a.a.a aVar, a aVar2, c cVar) {
        this.f1743a = aVar.a("AA.Context");
        this.b = aVar2;
        this.c = cVar;
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.api.m
    public final com.google.g.q.b.d a() {
        return com.google.g.q.b.d.z;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d b() {
        return com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.c;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final cn c(e eVar) {
        if (!this.c.w(bc.aj)) {
            return com.google.android.apps.gsa.v.c.b;
        }
        this.d = eVar;
        ((ag) this.b.a()).o.add(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final cn e() {
        if (this.d != null) {
            ((ag) this.b.a()).o.remove(this);
            this.d = null;
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.api.m
    public final /* synthetic */ Optional f() {
        return Optional.empty();
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.api.m
    public final void g() {
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.a aVar;
        com.google.common.f.a.a e = this.f1743a.e();
        e.ak(16103);
        e.p("PCP update");
        if (!this.c.w(bc.aj) || (aVar = this.d) == null) {
            return;
        }
        k.d(aVar.a.c(b.a), "Error calling trigger listener.", new Object[0]);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("PcpTriggerSource");
        e eVar = this.d;
        StringBuilder sb = new StringBuilder("hasListener? ");
        sb.append(eVar != null);
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d(sb.toString(), false));
    }
}
