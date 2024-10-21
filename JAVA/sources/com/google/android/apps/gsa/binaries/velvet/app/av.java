package com.google.android.apps.gsa.binaries.velvet.app;

import com.google.android.apps.gsa.search.core.ae.af.a;
import com.google.android.apps.gsa.search.core.ae.aq.f;
import com.google.android.apps.gsa.search.core.ae.bo.b;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.service.x;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.util.c.a.an;
import com.google.android.apps.gsa.staticplugins.o.b.e;
import com.google.common.b.op;
import e.c.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/av.class */
public final class av implements h {

    /* renamed from: a, reason: collision with root package name */
    private final jo f293a;
    private final ds b;
    private final aw c;

    public av(jo joVar, ds dsVar, aw awVar) {
        this.f293a = joVar;
        this.b = dsVar;
        this.c = awVar;
    }

    public final Object a() {
        x xVar = (x) this.b.p.a();
        ds dsVar = this.b;
        b ao = dsVar.ao();
        a aVar = (a) dsVar.l.a();
        ds dsVar2 = this.b;
        com.google.android.apps.gsa.search.core.ae.bv.a as = dsVar2.as();
        f fVar = (f) dsVar2.j.a();
        aw awVar = this.c;
        e eVar = new e(new op((com.google.android.apps.gsa.staticplugins.aa.b) awVar.f294a.lV.a()), (com.google.android.libraries.gsa.h.h) awVar.f294a.gz.a());
        c cVar = (c) this.f293a.gq.a();
        p pVar = (p) this.f293a.gq.a();
        an anVar = (an) this.f293a.gy.a();
        ds dsVar3 = this.b;
        com.google.android.apps.gsa.search.core.ae.aq.e ac = dsVar3.ac();
        com.google.android.apps.gsa.search.core.ae.ar.a.b bVar = new com.google.android.apps.gsa.search.core.ae.ar.a.b(e.c.c.b(dsVar3.f));
        ds dsVar4 = this.b;
        return new com.google.android.apps.gsa.staticplugins.o.b.b(xVar, ao, aVar, as, fVar, eVar, cVar, pVar, anVar, ac, bVar, dsVar4.M(), dsVar4.ae());
    }
}
