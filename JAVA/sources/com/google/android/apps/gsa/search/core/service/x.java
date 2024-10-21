package com.google.android.apps.gsa.search.core.service;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.service.f.a.i;
import com.google.android.apps.gsa.search.core.service.f.c;
import com.google.android.apps.gsa.search.core.state.ae;
import com.google.android.apps.gsa.search.core.state.ah;
import com.google.android.apps.gsa.search.core.state.ai;
import com.google.android.apps.gsa.search.core.state.cc;
import com.google.android.apps.gsa.search.core.state.co;
import com.google.android.apps.gsa.search.core.state.cq;
import com.google.android.apps.gsa.search.core.state.d.r;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.shared.k.Cdo;
import com.google.android.apps.gsa.shared.logger.e;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.g;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.gf;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/x.class */
public class x implements SharedPreferences.OnSharedPreferenceChangeListener, co, g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1224a = j.i("com.google.android.apps.gsa.search.core.service.x");
    public final r b;
    public final ah c;
    public final com.google.android.apps.gsa.search.core.state.af d;
    public final h e;
    public final com.google.android.apps.gsa.search.core.h.s f;
    final c g;
    public boolean h;
    public volatile o i;
    public final ca j;
    public final i k;
    private final af l;
    private final a m;
    private final az n;
    private final p o;
    private final com.google.android.apps.gsa.w.a p;
    private o q;
    private final EnumMap r;
    private final EnumMap s;
    private final com.google.android.apps.gsa.search.core.state.d.q t;
    private final com.google.android.apps.gsa.search.core.state.d.h u;
    private final ai v;
    private final ai w;

    public x(af afVar, ai aiVar, ai aiVar2, r rVar, final ah ahVar, com.google.android.apps.gsa.search.core.state.d.q qVar, com.google.android.apps.gsa.search.core.state.d.h hVar, com.google.android.apps.gsa.search.core.state.af afVar2, h hVar2, com.google.android.apps.gsa.search.core.h.s sVar, com.google.android.apps.gsa.search.core.ab.c cVar, i iVar, a aVar, az azVar, p pVar, com.google.android.apps.gsa.w.a aVar2) {
        u uVar = new u();
        this.g = uVar;
        this.l = afVar;
        this.v = aiVar;
        this.w = aiVar2;
        this.n = azVar;
        this.e = hVar2;
        this.f = sVar;
        this.b = rVar;
        this.c = ahVar;
        this.t = qVar;
        this.u = hVar;
        this.d = afVar2;
        this.k = iVar;
        iVar.c(uVar);
        this.m = aVar;
        this.o = pVar;
        this.p = aVar2;
        cVar.a();
        this.j = cl.d(new ca(this, ahVar) { // from class: com.google.android.apps.gsa.search.core.service.s

            /* renamed from: a, reason: collision with root package name */
            public final x f1220a;
            public final ah b;

            {
                this.f1220a = this;
                this.b = ahVar;
            }

            public final Object a() {
                gf gfVar = new gf();
                gfVar.m(this.f1220a.b.k());
                gfVar.m(this.b.k());
                return gfVar.i();
            }
        });
        this.r = rVar.l();
        EnumMap l = ahVar.l();
        this.s = l;
        Iterator it = l.keySet().iterator();
        while (it.hasNext()) {
            cl.y(!this.r.containsKey(r0), "Multiple states for ClientEvent %s", (ac) it.next());
        }
        this.f.f1127a.a(this);
    }

    private final void l(o oVar, ac acVar, boolean z) {
        if (this.o.w(Cdo.e)) {
            ClientConfig clientConfig = oVar != null ? oVar.f : null;
            com.google.android.apps.gsa.w.a aVar = this.p;
            com.google.android.apps.gsa.s.a aVar2 = com.google.android.apps.gsa.s.a.SEARCH_CLIENT_EVENT_EMITTED_RATE;
            com.google.android.apps.gsa.s.c cVar = com.google.android.apps.gsa.s.c.SEARCH_CLIENT_EVENT;
            aVar.h(aVar2, cVar, cVar, com.google.android.apps.gsa.d.c.a.a(clientConfig, acVar)).g(true != z ? 0L : 1L);
        }
    }

    private final void m(o oVar, boolean z) {
        o oVar2 = this.i;
        oVar2.getClass();
        oVar2.g(false);
        if (oVar != null || z) {
            return;
        }
        this.q = this.i;
    }

    @Override // com.google.android.apps.gsa.search.core.state.co
    public final cc a() {
        return ae.y;
    }

    @Override // com.google.android.apps.gsa.search.core.state.co
    public final void b(com.google.android.apps.gsa.search.core.state.cl clVar) {
        Collection unmodifiableCollection = DesugarCollections.unmodifiableCollection(this.k.d.values());
        Iterator it = unmodifiableCollection.iterator();
        while (it.hasNext()) {
            ((com.google.android.apps.gsa.search.core.service.f.b.a) it.next()).g(clVar);
        }
        Iterator it2 = unmodifiableCollection.iterator();
        while (it2.hasNext()) {
            ((com.google.android.apps.gsa.search.core.service.f.b.a) it2.next()).a(clVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j, ClientEventData clientEventData) {
        ac a2 = ac.a(clientEventData.f1328a.c);
        ac acVar = a2;
        if (a2 == null) {
            acVar = ac.UNKNOWN;
        }
        if ((!this.b.r() || !this.c.r()) && (!this.r.containsKey(acVar) || !this.b.r())) {
            ((e) this.m.a()).c(null, 65587551);
        }
        cq cqVar = (cq) this.r.get(acVar);
        cq cqVar2 = cqVar;
        if (cqVar == null) {
            cqVar2 = (cq) this.s.get(acVar);
        }
        boolean z = false;
        try {
            if (cqVar2 != null) {
                cqVar2.hL(j, clientEventData);
                z = true;
            } else {
                com.google.common.f.h f = f1224a.f();
                f.ak(7244);
                f.s("unhandled event %s", acVar);
            }
            o oVar = this.i;
            ac a3 = ac.a(clientEventData.f1328a.c);
            ac acVar2 = a3;
            if (a3 == null) {
                acVar2 = ac.UNKNOWN;
            }
            l(oVar, acVar2, z);
        } catch (Throwable th) {
            o oVar2 = this.i;
            ac a4 = ac.a(clientEventData.f1328a.c);
            ac acVar3 = a4;
            if (a4 == null) {
                acVar3 = ac.UNKNOWN;
            }
            l(oVar2, acVar3, false);
            throw th;
        }
    }

    public final void e(ClientEventData clientEventData) {
        o oVar = this.i;
        if (oVar != null) {
            com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
            oVar.f(clientEventData);
        } else {
            com.google.common.f.h e = f1224a.e();
            e.ak(7245);
            e.p("Failed to handle generic client: no active attached client.");
        }
    }

    @Deprecated
    public final void f(cn cnVar, long j, long j2) {
        dl.y(cnVar, new w(this, j, j2), com.google.common.util.concurrent.ay.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.apps.gsa.search.core.service.o r8) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.x.g(com.google.android.apps.gsa.search.core.service.o):void");
    }

    @Deprecated
    public final boolean h() {
        return (this.i == null || this.i.o) ? false : true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("SearchController");
        fVar.m(this.b);
        fVar.m(this.k);
    }

    public final boolean i(long j, ServiceEventData serviceEventData) {
        com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        o oVar = (o) this.l.b.get(j);
        if (oVar == null) {
            return false;
        }
        oVar.e.a(serviceEventData);
        return true;
    }

    public final void j(long j) {
        i(j, new com.google.android.apps.gsa.search.shared.service.ae(hf.UNBIND_BACKGROUND_CLIENT).a());
    }

    @Deprecated
    public final void k(ServiceEventData serviceEventData) {
        if (h()) {
            this.i.e.a(serviceEventData);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.e.n("notify global states on preference changed", new t(this, str, 0));
    }
}
