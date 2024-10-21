package com.google.android.apps.gsa.binaries.velvet.app;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.help.i;
import com.google.android.apps.gsa.assistant.settings.shared.u;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.ae.aq.f;
import com.google.android.apps.gsa.search.core.ae.o.a;
import com.google.android.apps.gsa.search.core.ae.w.a.b;
import com.google.android.apps.gsa.search.core.ae.w.a.g;
import com.google.android.apps.gsa.search.core.ae.w.a.j;
import com.google.android.apps.gsa.search.core.ae.w.a.k;
import com.google.android.apps.gsa.search.core.ae.w.a.l;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.service.x;
import com.google.android.apps.gsa.shared.t.ac;
import com.google.android.apps.gsa.staticplugins.deeplink.b.d;
import com.google.android.apps.gsa.staticplugins.mediabrowser.MediaBrowserSessionController;
import com.google.android.apps.gsa.staticplugins.opa.util.bn;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.v;
import com.google.android.libraries.search.t.i.y;
import com.google.apps.tiktok.experiments.e;
import e.c.c;
import e.c.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/cl.class */
public final class cl implements h {

    /* renamed from: a, reason: collision with root package name */
    private final jo f295a;
    private final int b;
    private final Object c;

    public cl(jo joVar, Object obj, int i) {
        this.b = i;
        this.f295a = joVar;
        this.c = obj;
    }

    public final Object a() {
        int i = this.b;
        if (i == 0) {
            x xVar = (x) ((ds) this.c).p.a();
            jo joVar = this.f295a;
            a G = ((ds) this.c).G();
            return new com.google.android.apps.gsa.staticplugins.bu.b.a(xVar, G);
        }
        if (i == 1) {
            g gVar = new g(c.b(((ds) this.c).f));
            f fVar = (f) ((ds) this.c).j.a();
            com.google.android.apps.gsa.search.core.ae.w.a.a aVar = new com.google.android.apps.gsa.search.core.ae.w.a.a(c.b(((ds) this.c).f));
            b bVar = new b(c.b(((ds) this.c).f));
            k kVar = new k(c.b(((ds) this.c).f));
            j jVar = new j(c.b(((ds) this.c).f));
            l lVar = new l(c.b(((ds) this.c).f));
            ds dsVar = (ds) this.c;
            com.google.android.apps.gsa.search.core.ae.aq.a Z = dsVar.Z();
            com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) dsVar.b.a();
            y yVar = (y) this.f295a.W.a();
            Context context = (Context) this.f295a.f.a();
            bn bnVar = (bn) this.f295a.f319a.V.a();
            com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) this.f295a.gv.a();
            boolean f = ((e) new h.a.a.d.a.a.g(this.f295a.f319a.f326a.V).a.a()).a("com.google.android.apps.search.assistant.mobile.device 45477077").f();
            boolean f2 = ((e) new h.a.a.d.a.a.g(this.f295a.f319a.f326a.V).a.a()).a("com.google.android.apps.search.assistant.mobile.device 45477350").f();
            boolean f3 = ((e) new h.a.a.d.a.a.g(this.f295a.f319a.f326a.V).a.a()).a("com.google.android.apps.search.assistant.mobile.device 45477351").f();
            boolean f4 = ((e) new h.a.a.d.a.a.g(this.f295a.f319a.f326a.V).a.a()).a("com.google.android.apps.search.assistant.mobile.device 45477510").f();
            jy jyVar = this.f295a.f319a;
            return new d(gVar, fVar, aVar, bVar, kVar, jVar, lVar, Z, hVar, yVar, context, bnVar, hVar2, f, f2, f3, f4, jyVar.hX, jyVar.hY);
        }
        if (i == 2) {
            com.google.android.apps.gsa.assistant.settings.shared.f fVar2 = (com.google.android.apps.gsa.assistant.settings.shared.f) this.f295a.nE.a();
            ac acVar = (ac) this.f295a.oo.a();
            dt dtVar = (dt) this.c;
            z zVar = (z) dtVar.a.gt.a();
            Context context2 = (Context) dtVar.a.f.a();
            jo joVar2 = dtVar.a;
            com.google.android.apps.gsa.assistant.settings.features.help.k b = dtVar.b();
            com.google.android.apps.gsa.assistant.settings.features.help.f fVar3 = new com.google.android.apps.gsa.assistant.settings.features.help.f(fVar2, acVar, new i(zVar, context2, b, c.b(dtVar.a.xx), dtVar.a.O()), ((dt) this.c).b());
            dt dtVar2 = (dt) this.c;
            ((com.google.android.apps.gsa.assistant.settings.base.g) fVar3).b = dtVar2.a.f319a.v();
            ((com.google.android.apps.gsa.assistant.settings.base.g) fVar3).h = (u) dtVar2.a.f319a.b.a();
            ((com.google.android.apps.gsa.assistant.settings.base.g) fVar3).c = (Context) dtVar2.a.f.a();
            return fVar3;
        }
        if (i == 3) {
            com.google.android.apps.gsa.search.core.ae.ag.a.g gVar2 = new com.google.android.apps.gsa.search.core.ae.ag.a.g(c.b(((ds) this.c).f));
            x xVar2 = (x) ((ds) this.c).p.a();
            com.google.android.libraries.gsa.h.h hVar3 = (com.google.android.libraries.gsa.h.h) ((ds) this.c).b.a();
            return new com.google.android.apps.gsa.staticplugins.al.b.e(gVar2, xVar2, hVar3);
        }
        if (i == 4) {
            return new MediaBrowserSessionController((Context) this.f295a.f.a(), (com.google.android.libraries.gsa.h.h) this.f295a.gv.a(), (com.google.android.libraries.gsa.h.h) ((ds) this.c).b.a(), ((ds) this.c).F());
        }
        if (i != 5) {
            x xVar3 = (x) ((ds) this.c).p.a();
            jo joVar3 = this.f295a;
            ds dsVar2 = (ds) this.c;
            return new com.google.android.apps.gsa.staticplugins.smartspace.g.a(xVar3, dsVar2.ao(), dsVar2.ac(), (p) joVar3.gq.a(), (v) this.f295a.uN.a(), new com.google.android.apps.search.assistant.verticals.ambient.smartspace.f(), this.f295a.fm());
        }
        return new com.google.android.apps.gsa.staticplugins.opa.morris2.g.b((Context) this.f295a.f.a(), (x) ((ds) this.c).p.a(), ((ds) this.c).X(), (com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.b) this.f295a.ng.a(), (p) this.f295a.gq.a(), (com.google.android.apps.gsa.shared.notificationlistening.collection.a.z) this.f295a.pz.a());
    }
}
