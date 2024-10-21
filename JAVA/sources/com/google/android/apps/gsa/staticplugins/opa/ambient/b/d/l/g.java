package com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l;

import com.google.android.apps.gsa.assistant.settings.features.d.w;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.a;
import com.google.apps.tiktok.tracing.contrib.c.h;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/d/l/g.class */
public final class g implements com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g {

    /* renamed from: a, reason: collision with root package name */
    public final d f1746a;
    public e b;
    public final w d;
    private final cr f;
    private final com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d h;
    private final e g = new e(this) { // from class: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.c

        /* renamed from: a, reason: collision with root package name */
        public final g f1744a;

        {
            this.f1744a = this;
        }

        @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e
        public final cn a(Object obj) {
            cn cnVar;
            a aVar = this.f1744a.b;
            if (aVar != null) {
                ba createBuilder = a.a.createBuilder();
                createBuilder.copyOnWrite();
                a aVar2 = createBuilder.instance;
                aVar2.b |= 4;
                aVar2.e = true;
                cnVar = com.google.android.apps.gsa.v.c.b(aVar.a.c((a) createBuilder.build()));
            } else {
                cnVar = com.google.android.apps.gsa.v.c.b;
            }
            return cnVar;
        }
    };
    boolean c = false;
    public final f e = new f(this);

    public g(com.google.android.apps.gsa.opa.a.a.a aVar, w wVar, com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d dVar, cr crVar) {
        this.f1746a = aVar.a("AA.Context");
        this.d = wVar;
        this.h = dVar;
        this.f = crVar;
    }

    public final cn a() {
        a aVar = this.b;
        if (aVar == null) {
            return com.google.android.apps.gsa.v.c.b;
        }
        ba createBuilder = a.a.createBuilder();
        createBuilder.copyOnWrite();
        a aVar2 = createBuilder.instance;
        aVar2.b |= 1;
        aVar2.c = true;
        return aVar.a.c((a) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d b() {
        return com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.b;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final cn c(e eVar) {
        this.d.h(this.e);
        this.c = true;
        this.b = eVar;
        return h.a(fl.p(this.h.b(this.g))).a(new e(), this.f);
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final cn e() {
        return h.a(fl.p(this.h.e(this.g))).a(new d(this), this.f);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ResetTriggerSource");
        e eVar = this.b;
        StringBuilder sb = new StringBuilder("hasListener? ");
        sb.append(eVar != null);
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d(sb.toString(), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("isRegistered? " + this.c, false));
    }
}
