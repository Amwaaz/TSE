package com.google.android.apps.gsa.search.core.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.apps.gsa.search.core.service.d.c;
import com.google.android.apps.gsa.search.core.service.d.e;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.hn;
import com.google.android.apps.gsa.search.shared.service.c.ho;
import com.google.android.apps.gsa.search.shared.service.c.iq;
import com.google.android.apps.gsa.search.shared.service.c.ir;
import com.google.android.apps.gsa.search.shared.service.c.is;
import com.google.android.apps.gsa.search.shared.service.c.it;
import com.google.android.apps.gsa.search.shared.service.c.kj;
import com.google.android.apps.gsa.search.shared.service.c.kk;
import com.google.android.apps.gsa.search.shared.service.g;
import com.google.android.apps.gsa.shared.k.Cdo;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.gsa.h.i;
import com.google.common.b.ha;
import com.google.common.b.oo;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.o.or;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/o.class */
public class o extends g implements com.google.android.apps.gsa.shared.util.debug.a.g, c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1218a = j.i("com.google.android.apps.gsa.search.core.service.o");
    private final a A;
    public final long c;
    public final af d;
    public final k e;
    public final ClientConfig f;
    public final e.a g;
    public final long h;
    public Bundle l;
    public com.google.android.apps.gsa.search.shared.service.d.b.u m;
    public boolean n;
    public volatile boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public volatile e s;
    public ClientEventData t;
    public boolean u;
    public Query v;
    public final boolean w;
    public final h x;
    private final h y;
    public final IBinder.DeathRecipient b = new d(this);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public boolean i = false;
    public long j = 0;
    public volatile long k = 0;
    private final m B = new m(this);

    public o(long j, af afVar, com.google.android.apps.gsa.search.shared.service.n nVar, ClientConfig clientConfig, h hVar, aw awVar, e.a aVar, long j2, a aVar2) {
        this.c = j;
        this.d = afVar;
        this.f = clientConfig;
        this.y = hVar;
        this.g = aVar;
        this.h = j2;
        this.e = new k(this, nVar);
        this.A = aVar2;
        this.w = nVar instanceof com.google.android.a.a;
        this.x = awVar.a(n.class);
    }

    private final void n() {
        this.v = null;
        this.t = null;
        this.u = false;
    }

    private static boolean o(ClientEventData clientEventData) {
        ac a2 = ac.a(clientEventData.f1328a.c);
        ac acVar = a2;
        if (a2 == null) {
            acVar = ac.UNKNOWN;
        }
        return acVar == ac.START_CLIENT || acVar == ac.STOP_CLIENT || acVar == ac.TOP_RESUMED_ACTIVTIY;
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.c
    public final void a(ClientEventData clientEventData) {
        i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        cl.v(!o(clientEventData), "Lifecycle client events should be handled by {@link#handleLifecycleClientEvent(ClientEventData)}");
        ac a2 = ac.a(clientEventData.f1328a.c);
        ac acVar = a2;
        if (a2 == null) {
            acVar = ac.UNKNOWN;
        }
        switch (acVar.ordinal()) {
            case 28:
                this.d.h(new j(this, this, clientEventData));
                return;
            case 29:
            case 37:
                if (this.i) {
                    this.d.g(new h(this, this, clientEventData));
                    return;
                } else {
                    e();
                    return;
                }
            case 30:
            case 31:
            case 36:
            default:
                if (this.i || com.google.android.apps.gsa.search.shared.service.z.c.contains(acVar)) {
                    this.d.a().c(this.c, clientEventData);
                } else {
                    m mVar = this.B;
                    ab abVar = com.google.common.f.a.e.a;
                    mVar.b.add(clientEventData);
                }
                if (acVar == ac.WINDOW_FOCUS_CHANGED) {
                    com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
                    bg bgVar = bi.-$$Nest$smcheckIsLite(kj.a);
                    adVar.d(bgVar);
                    Object l = ((bd) adVar).br.l(bgVar.d);
                    kk kkVar = (kk) (l == null ? bgVar.b : bgVar.c(l));
                    boolean z = kkVar.c;
                    this.p = z;
                    if (z) {
                        this.q = kkVar.d;
                        return;
                    } else {
                        this.q = 0L;
                        return;
                    }
                }
                return;
            case 32:
                com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
                bg bgVar2 = bi.-$$Nest$smcheckIsLite(hn.a);
                adVar2.d(bgVar2);
                Object l2 = ((bd) adVar2).br.l(bgVar2.d);
                this.r = ((ho) (l2 == null ? bgVar2.b : bgVar2.c(l2))).c;
                if (this.i) {
                    this.d.h(new i(this, this, clientEventData));
                    return;
                }
                return;
            case 33:
                this.d.g(new e(this, this, (Query) clientEventData.b(Query.class), clientEventData));
                return;
            case 34:
                this.d.g(new g(this, this, (Query) clientEventData.b(Query.class), clientEventData));
                return;
            case 35:
                this.d.g(new f(this, this, clientEventData));
                return;
        }
    }

    public final long b() {
        i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        long j = this.j;
        this.j = 0L;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.search.shared.service.d.b.u c() {
        com.google.android.apps.gsa.search.shared.service.d.b.u uVar = this.m;
        this.m = com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a;
        return uVar;
    }

    public final void e() {
        ab abVar = com.google.common.f.a.e.a;
        n();
        oo.aL(this.B.b, new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
        ha haVar = com.google.android.apps.gsa.search.shared.service.z.c;
        ac a2 = ac.a(adVar.c);
        ac acVar = a2;
        if (a2 == null) {
            acVar = ac.UNKNOWN;
        }
        if (haVar.contains(acVar) && !this.d.n(this)) {
            this.d.j(this, false);
            i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
            i(clientEventData, this);
            return;
        }
        if (!o(clientEventData)) {
            if (this.n && !this.i && this.s != null) {
                ha e = this.s.f1165a.e();
                ac a3 = ac.a(clientEventData.f1328a.c);
                ac acVar2 = a3;
                if (a3 == null) {
                    acVar2 = ac.UNKNOWN;
                }
                if (e.contains(acVar2)) {
                    i.b(com.google.android.apps.gsa.search.core.service.a.a.class);
                    i(clientEventData, new c());
                    return;
                }
            }
            m mVar = this.B;
            int a4 = mVar.a() - 1;
            if (a4 == 0) {
                ab abVar = com.google.common.f.a.e.a;
                mVar.b.add(clientEventData);
                return;
            } else if (a4 != 1) {
                ab abVar2 = com.google.common.f.a.e.a;
                o oVar = mVar.c;
                oVar.i(clientEventData, oVar);
                return;
            } else {
                ab abVar3 = com.google.common.f.a.e.a;
                mVar.f1217a.add(clientEventData);
                mVar.c.d.k(new l(mVar));
                return;
            }
        }
        cl.u(o(clientEventData));
        ac a5 = ac.a(clientEventData.f1328a.c);
        ac acVar3 = a5;
        if (a5 == null) {
            acVar3 = ac.UNKNOWN;
        }
        int ordinal = acVar3.ordinal();
        if (ordinal != 46) {
            if (ordinal != 47) {
                if (ordinal == 151 && this.n && !this.i && !this.d.n(this)) {
                    this.d.c(this);
                    return;
                }
                return;
            }
            com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
            bg bgVar = bi.-$$Nest$smcheckIsLite(is.a);
            adVar2.d(bgVar);
            Object l = ((bd) adVar2).br.l(bgVar.d);
            it itVar = (it) (l == null ? bgVar.b : bgVar.c(l));
            long j = itVar.c;
            boolean z = itVar.d;
            af afVar = this.d;
            o oVar2 = (o) afVar.b.get(j);
            if (oVar2 != null) {
                oVar2.n = false;
                if (z) {
                    oVar2.k();
                }
                afVar.e(oVar2, false, !z);
                return;
            }
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar3 = clientEventData.f1328a;
        bg bgVar2 = bi.-$$Nest$smcheckIsLite(iq.a);
        adVar3.d(bgVar2);
        Object l2 = ((bd) adVar3).br.l(bgVar2.d);
        ir irVar = (ir) (l2 == null ? bgVar2.b : bgVar2.c(l2));
        this.k = irVar.f;
        long j2 = irVar.d;
        long j3 = irVar.c;
        Bundle bundle = (Bundle) clientEventData.b(Bundle.class);
        com.google.android.apps.gsa.search.shared.service.d.b.u uVar = irVar.e;
        com.google.android.apps.gsa.search.shared.service.d.b.u uVar2 = uVar;
        if (uVar == null) {
            uVar2 = com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a;
        }
        ab abVar4 = com.google.common.f.a.e.a;
        if (!this.f.e.equals("lens")) {
            this.d.m(j3, j2, bundle, uVar2);
            return;
        }
        try {
            this.d.m(j3, j2, bundle, uVar2);
        } catch (RuntimeException e2) {
            ((com.google.android.apps.gsa.shared.logger.e) this.g.a()).c(null, 123236020);
            com.google.common.f.h f = f1218a.f();
            f.aj(com.google.common.f.a.e.a, "AttachedClient");
            com.google.common.f.h g = f.g(e2);
            g.ak(7227);
            g.N("#startClient: clientId=%d, handoverId=%d, sessionContext=%s", Long.valueOf(j3), Long.valueOf(j2), bundle == null ? "null" : "non-null");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
        }
    }

    public final void g(boolean z) {
        i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        if (!z) {
            ab abVar = com.google.common.f.a.e.a;
            n();
            this.B.b.clear();
            return;
        }
        cl.v(this.i, "AttachedClient#flushPendingItems on inactive client");
        x a2 = this.d.a();
        ClientEventData clientEventData = this.t;
        if (clientEventData != null) {
            ab abVar2 = com.google.common.f.a.e.a;
            a2.c(this.c, clientEventData);
        }
        Query query = this.v;
        if (query != null) {
            if (this.u) {
                ab abVar3 = com.google.common.f.a.e.a;
                af afVar = this.d;
                long j = this.c;
                x a3 = afVar.a();
                ae aeVar = new ae(ac.QUERY_EDIT);
                aeVar.f(query);
                a3.c(j, aeVar.d());
            } else {
                ab abVar4 = com.google.common.f.a.e.a;
                af afVar2 = this.d;
                long j2 = this.c;
                x a4 = afVar2.a();
                ae aeVar2 = new ae(ac.QUERY_SET);
                aeVar2.f(query);
                a4.c(j2, aeVar2.d());
            }
        }
        cl.v(m(), "SessionContainer not set before flushing the events");
        m mVar = this.B;
        int size = mVar.b.size();
        mVar.f1217a.addAll(mVar.b);
        mVar.b.clear();
        for (int i = 0; i < size; i++) {
            mVar.c.d.k(new l(mVar));
        }
        n();
    }

    @Override // com.google.android.apps.gsa.search.shared.service.h
    public final void h(ClientEventData clientEventData) {
        try {
            if (this.A.b()) {
                ac a2 = ac.a(clientEventData.f1328a.c);
                ac acVar = a2;
                if (a2 == null) {
                    acVar = ac.UNKNOWN;
                }
                com.google.android.apps.gsa.shared.util.debug.h.a(a.a.eg(acVar, "AttachedClient.onGenericClientEvent-[ClientEvent = ", "]"), this.A);
            }
            this.y.n("AttachedClient [handleClientEvent]", new t(this, clientEventData, 1));
            if (this.A.b()) {
                com.google.android.apps.gsa.shared.util.debug.h.b(this.A);
            }
        } catch (Throwable th) {
            if (this.A.b()) {
                com.google.android.apps.gsa.shared.util.debug.h.b(this.A);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("AttachedClient");
        fVar.b("client ID").a(new com.google.android.apps.gsa.shared.util.b.d(Long.valueOf(this.c), false));
        fVar.b("handing over").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.o), false));
        fVar.m(this.B);
        fVar.k(this.f);
    }

    final void i(ClientEventData clientEventData, c cVar) {
        ClientConfig clientConfig;
        ClientConfig clientConfig2;
        ab abVar = com.google.common.f.a.e.a;
        if (this.s == null) {
            com.google.common.f.h e = f1218a.e();
            e.aj(com.google.common.f.a.e.a, "AttachedClient");
            com.google.common.f.h hVar = e;
            hVar.ak(7222);
            ac a2 = ac.a(clientEventData.f1328a.c);
            ac acVar = a2;
            if (a2 == null) {
                acVar = ac.UNKNOWN;
            }
            hVar.G("Dropping clientEvent = %s coming from client[%d]", acVar, this.c);
            return;
        }
        e eVar = this.s;
        long j = this.c;
        eVar.a("#handleGenericClientEvent");
        eVar.b("#handleGenericClientEvent");
        try {
            eVar.f1165a.f(j, clientEventData, cVar);
            if (eVar.j.w(Cdo.e)) {
                try {
                    clientConfig2 = eVar.b.a();
                } catch (IllegalStateException e2) {
                    clientConfig2 = null;
                }
                com.google.android.apps.gsa.w.a aVar = eVar.k;
                com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
                com.google.android.apps.gsa.s.a aVar2 = com.google.android.apps.gsa.s.a.CLIENT_EVENT_EMITTED_COUNT;
                com.google.android.apps.gsa.s.c cVar2 = com.google.android.apps.gsa.s.c.SESSION_CLIENT_EVENT;
                ac a3 = ac.a(adVar.c);
                ac acVar2 = a3;
                if (a3 == null) {
                    acVar2 = ac.UNKNOWN;
                }
                aVar.h(aVar2, cVar2, cVar2, com.google.android.apps.gsa.d.c.a.a(clientConfig2, acVar2)).g(1L);
                if (clientConfig2 == null || clientConfig2.d != or.F) {
                    return;
                }
                com.google.android.apps.gsa.d.e.g(11);
            }
        } catch (Throwable th) {
            if (eVar.j.w(Cdo.e)) {
                try {
                    clientConfig = eVar.b.a();
                } catch (IllegalStateException e3) {
                    clientConfig = null;
                }
                com.google.android.apps.gsa.w.a aVar3 = eVar.k;
                com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
                com.google.android.apps.gsa.s.a aVar4 = com.google.android.apps.gsa.s.a.CLIENT_EVENT_EMITTED_COUNT;
                com.google.android.apps.gsa.s.c cVar3 = com.google.android.apps.gsa.s.c.SESSION_CLIENT_EVENT;
                ac a4 = ac.a(adVar2.c);
                ac acVar3 = a4;
                if (a4 == null) {
                    acVar3 = ac.UNKNOWN;
                }
                aVar3.h(aVar4, cVar3, cVar3, com.google.android.apps.gsa.d.c.a.a(clientConfig, acVar3)).g(1L);
                if (clientConfig != null && clientConfig.d == or.F) {
                    com.google.android.apps.gsa.d.e.g(11);
                }
            }
            throw th;
        }
    }

    public final void j() {
        if (this.z.getAndSet(true)) {
            return;
        }
        af afVar = this.d;
        if (i.d(com.google.android.apps.gsa.search.core.service.a.a.class)) {
            afVar.e(this, true, true);
        } else {
            afVar.d.n("SearchServiceCore [onClientBinderFailed]", new t(afVar, this, 2));
        }
    }

    public final void k() {
        this.o = true;
        this.e.a(new ae(hf.HAND_OVER).a());
    }

    public final void l(Intent intent) {
        ae aeVar = new ae(hf.START_ACTIVITY);
        aeVar.c(intent);
        this.e.a(aeVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.s != null;
    }

    public final String toString() {
        return "AttachedClient[" + this.c + (true != this.o ? "" : " (HANDING OVER)") + ", " + String.valueOf(this.f) + "]";
    }
}
