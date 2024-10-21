package com.google.android.apps.gsa.search.shared.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Trace;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.hn;
import com.google.android.apps.gsa.search.shared.service.c.ho;
import com.google.android.apps.gsa.search.shared.service.c.iq;
import com.google.android.apps.gsa.search.shared.service.c.ir;
import com.google.android.apps.gsa.search.shared.service.c.is;
import com.google.android.apps.gsa.search.shared.service.c.it;
import com.google.android.apps.gsa.search.shared.service.c.u;
import com.google.android.apps.gsa.search.shared.service.c.v;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.s.a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.common.b.ha;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.am;
import com.google.protobuf.ba;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/t.class */
public class t implements ac, b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1358a = com.google.common.f.j.i("com.google.android.apps.gsa.search.shared.service.t");
    private static final a v = new a(new com.google.android.libraries.g.a.e());
    private long A;
    private final e.a B;
    public final Context b;
    public final r c;
    public final com.google.android.apps.gsa.shared.o.a.a d;
    public final e.a e;
    public final long f;
    public final boolean g;
    public final List h;
    public final at i;
    ad j;
    com.google.android.apps.gsa.shared.util.ae k;
    public k l;
    public h m;
    public boolean n;
    public boolean o;
    public ClientEventData p;
    public af q;
    public long r;
    public boolean s;
    public com.google.android.apps.gsa.search.core.service.af t;
    protected final m u;
    private final com.google.android.libraries.gsa.h.h w;
    private boolean x;
    private boolean y;
    private final ClientConfig z;

    @Deprecated
    public t(Context context, ClientConfig clientConfig, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.shared.o.a.a aVar, boolean z) {
        this(context, null, null, clientConfig, hVar, aVar, new q(), com.google.common.base.a.a, null, z);
    }

    public t(Context context, ad adVar, com.google.android.apps.gsa.shared.util.ae aeVar, ClientConfig clientConfig, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.shared.o.a.a aVar, e.a aVar2, at atVar, e.a aVar3, boolean z) {
        this.A = 0L;
        this.s = true;
        this.b = context.getApplicationContext();
        this.d = aVar;
        this.w = hVar;
        this.j = adVar;
        this.k = aeVar;
        this.e = aVar2;
        this.i = atVar;
        this.z = clientConfig;
        this.B = aVar3;
        this.g = z;
        m mVar = new m(null);
        this.u = mVar;
        mVar.c = null;
        mVar.f1353a = null;
        mVar.b = null;
        this.c = new r(this, mVar, clientConfig);
        this.h = new ArrayList();
        this.q = new af(0L, false);
        this.f = y();
        this.r = y();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(long r6, android.os.Bundle r8, com.google.android.apps.gsa.search.shared.service.d.b.u r9) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.service.t.A(long, android.os.Bundle, com.google.android.apps.gsa.search.shared.service.d.b.u):void");
    }

    private final boolean B() {
        return (this.m == null || this.l == null) ? false : true;
    }

    private final boolean C() {
        return (this.m == null || this.t == null) ? false : true;
    }

    private static long y() {
        long incrementAndGet;
        do {
            incrementAndGet = v.f1477a.incrementAndGet();
        } while (!com.google.android.apps.gsa.shared.aj.a.a.a(incrementAndGet));
        return incrementAndGet;
    }

    private final void z() {
        cl.v(!this.x, "SearchServiceClient disposed and cannot be reused.");
    }

    public final void a() {
        if (this.g) {
            return;
        }
        ae aeVar = new ae(com.google.android.apps.gsa.search.shared.service.c.ac.CANCEL);
        bg bgVar = u.a;
        ba createBuilder = v.a.createBuilder();
        createBuilder.copyOnWrite();
        v vVar = createBuilder.instance;
        vVar.b |= 1;
        vVar.c = false;
        aeVar.e(bgVar, createBuilder.build());
        h(aeVar.d());
    }

    public final void b(Query query) {
        if (this.g) {
            return;
        }
        ae aeVar = new ae(com.google.android.apps.gsa.search.shared.service.c.ac.QUERY_COMMIT);
        aeVar.f(query);
        h(aeVar.d());
    }

    public final void c() {
        if (this.g) {
            return;
        }
        am.d.getClass();
        com.google.android.libraries.gsa.h.i.c(androidx.annotation.b.class);
        z();
        if (this.n) {
            return;
        }
        this.n = true;
        m mVar = this.u;
        com.google.android.libraries.gsa.h.h hVar = this.w;
        ad adVar = this.j;
        com.google.android.apps.gsa.shared.util.ae aeVar = this.k;
        mVar.c = hVar;
        mVar.f1353a = adVar;
        mVar.b = aeVar;
        if (((Boolean) this.e.a()).booleanValue()) {
            cl.u(this.i.h());
            this.w.n("connect", new com.google.android.libraries.gsa.h.f(this) { // from class: com.google.android.apps.gsa.search.shared.service.p

                /* renamed from: a, reason: collision with root package name */
                public final t f1355a;

                {
                    this.f1355a = this;
                }

                @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                public final void run() {
                    t tVar = this.f1355a;
                    if (tVar.d.b()) {
                        Trace.beginSection("SearchServiceConnect");
                    }
                    r rVar = tVar.c;
                    am.d.getClass();
                    com.google.android.libraries.gsa.h.i.c(androidx.annotation.b.class);
                    t tVar2 = rVar.f1356a;
                    if (tVar2.n) {
                        if (tVar2.d.b()) {
                            com.google.android.apps.gsa.shared.util.debug.h.a("SearchService.connectViaSingletonManager", rVar.f1356a.d);
                        }
                        t tVar3 = rVar.f1356a;
                        if (tVar3.t == null) {
                            tVar3.t = ((com.google.android.apps.gsa.search.shared.service.b.d) tVar3.i.c()).b();
                        }
                        rVar.a();
                        if (rVar.f1356a.d.b()) {
                            com.google.android.apps.gsa.shared.util.debug.h.b(rVar.f1356a.d);
                        }
                    }
                    if (tVar.d.b()) {
                        Trace.endSection();
                    }
                }
            });
            return;
        }
        if (this.d.b()) {
            Trace.beginSection("SearchServiceNonLazyConnect");
        }
        Intent intent = new Intent();
        intent.setClassName(this.b, "com.google.android.apps.gsa.search.core.service.SearchService");
        if (!this.b.bindService(intent, this.c, 1 | (Build.VERSION.SDK_INT >= 30 ? 4096 : 0))) {
            com.google.common.f.h f = f1358a.f();
            f.ak(8340);
            f.p("Unable to bind to the search service");
            this.n = false;
            try {
                this.b.unbindService(this.c);
            } catch (IllegalArgumentException e) {
                a.a.dB(f1358a.f(), "unbindService failed after failed bindService", (char) 8341, e);
            }
            g();
        }
        if (this.d.b()) {
            Trace.endSection();
        }
    }

    public final void e() {
        if (this.g) {
            return;
        }
        am.d.getClass();
        com.google.android.libraries.gsa.h.i.c(androidx.annotation.b.class);
        if (this.n) {
            if (v()) {
                try {
                    if (C()) {
                        this.t.f(this.f, this.y);
                    } else if (B()) {
                        this.l.b(this.f, this.y);
                    }
                    this.y = false;
                } catch (RemoteException e) {
                    a.a.dB(f1358a.f(), "detachClient failed", (char) 8344, e);
                }
            }
            if (!((Boolean) this.e.a()).booleanValue()) {
                try {
                    this.b.unbindService(this.c);
                } catch (IllegalArgumentException e2) {
                    a.a.dB(f1358a.f(), "IllegalArgumentException when unbinding.", (char) 8343, e2);
                }
            } else if (this.t != null) {
                ((com.google.android.apps.gsa.search.shared.service.b.d) this.i.c()).a();
                this.t = null;
            }
            this.m = null;
            this.l = null;
            this.n = false;
        }
    }

    public final void f() {
        e();
        this.x = true;
        m mVar = this.u;
        mVar.d.clear();
        mVar.f1353a = null;
        mVar.b = null;
        mVar.c = null;
        this.j = null;
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.u.a(new ae(hf.ON_SERVICE_DISCONNECTED).a());
    }

    @Override // com.google.android.apps.gsa.search.shared.service.ac
    public final void h(ClientEventData clientEventData) {
        e.a aVar;
        e.a aVar2;
        if (this.g) {
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        int ordinal = acVar.ordinal();
        if (ordinal != 46) {
            if (ordinal != 47) {
                if (!w()) {
                    this.h.add(clientEventData);
                    com.google.android.apps.gsa.search.shared.service.c.ac a3 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
                    com.google.android.apps.gsa.search.shared.service.c.ac acVar2 = a3;
                    if (a3 == null) {
                        acVar2 = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
                    }
                    if (acVar2 != com.google.android.apps.gsa.search.shared.service.c.ac.HOTWORD_DETECTED_IN_INTERACTOR || (aVar = this.B) == null) {
                        return;
                    }
                    ((com.google.android.apps.gsa.shared.logger.b.h) aVar.a()).b(w.SEARCHSERVICE_RECEIVED_HOTWORD_FROM_INTERACTOR_PENDING);
                    return;
                }
                com.google.android.apps.gsa.search.shared.service.c.ac a4 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
                com.google.android.apps.gsa.search.shared.service.c.ac acVar3 = a4;
                if (a4 == null) {
                    acVar3 = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
                }
                if (acVar3 == com.google.android.apps.gsa.search.shared.service.c.ac.HOTWORD_DETECTED_IN_INTERACTOR && (aVar2 = this.B) != null) {
                    ((com.google.android.apps.gsa.shared.logger.b.h) aVar2.a()).b(w.SEARCHSERVICE_RECEIVED_HOTWORD_FROM_INTERACTOR);
                }
            } else {
                if (this.p == null) {
                    return;
                }
                this.p = null;
                if (!w()) {
                    return;
                }
            }
        } else {
            if (this.p != null) {
                return;
            }
            this.p = clientEventData;
            com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
            bg bgVar = bi.-$$Nest$smcheckIsLite(iq.a);
            adVar.d(bgVar);
            Object l = ((bd) adVar).br.l(bgVar.d);
            this.A = ((ir) (l == null ? bgVar.b : bgVar.c(l))).d;
            if (!w()) {
                return;
            } else {
                this.s = false;
            }
        }
        h hVar = this.m;
        if (hVar != null) {
            try {
                hVar.h(clientEventData);
            } catch (RemoteException e) {
                a.a.dB(f1358a.e(), "onGenericClientEvent() failed", (char) 8347, e);
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("SearchServiceClient");
        fVar.b("ID").a(new com.google.android.apps.gsa.shared.util.b.d(Long.valueOf(this.f), false));
        fVar.b("Connected").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(v()), false));
        fVar.b("Started").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(x()), false));
        fVar.b("Disposed").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.x), false));
    }

    public final void i(boolean z) {
        if (!this.g && z) {
            h(new ae(com.google.android.apps.gsa.search.shared.service.c.ac.TOP_RESUMED_ACTIVTIY).d());
        }
    }

    @Override // com.google.android.apps.gsa.search.shared.service.ac
    public final void j(ad adVar, hf... hfVarArr) {
        if (this.g) {
            return;
        }
        for (hf hfVar : hfVarArr) {
            m mVar = this.u;
            Set set = (Set) mVar.d.get(hfVar);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.add(adVar);
                mVar.d.put((EnumMap) hfVar, (hf) ha.o(hashSet));
            } else {
                HashSet hashSet2 = new HashSet();
                hashSet2.add(adVar);
                mVar.d.put((EnumMap) hfVar, (hf) ha.o(hashSet2));
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.shared.service.ac
    public final void k(ad adVar, hf... hfVarArr) {
        if (this.g) {
            return;
        }
        for (hf hfVar : hfVarArr) {
            m mVar = this.u;
            Set set = (Set) mVar.d.get(hfVar);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.remove(adVar);
                mVar.d.put((EnumMap) hfVar, (hf) ha.o(hashSet));
                if (hashSet.isEmpty()) {
                    mVar.d.remove(hfVar);
                }
            }
        }
    }

    public final void l(Bundle bundle) {
        long j = this.A;
        long j2 = this.q.f1332a;
        long j3 = this.f;
        if (j != 100 && j != 0) {
            j3 = j;
            if (j == 1) {
                j3 = j2;
            }
        }
        bundle.putLong("HandoverId", j3);
    }

    public final void m(boolean z) {
        if (this.g) {
            return;
        }
        ae aeVar = new ae(com.google.android.apps.gsa.search.shared.service.c.ac.SET_HOTWORD_DETECTION_ENABLED);
        bg bgVar = hn.a;
        ba createBuilder = ho.a.createBuilder();
        createBuilder.copyOnWrite();
        ho hoVar = createBuilder.instance;
        hoVar.b |= 1;
        hoVar.c = z;
        aeVar.e(bgVar, createBuilder.build());
        h(aeVar.d());
    }

    @Deprecated
    public final void n() {
        if (this.g) {
            return;
        }
        A(0L, null, com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a);
    }

    @Deprecated
    public final void o(Bundle bundle) {
        if (this.g) {
            return;
        }
        A(bundle.containsKey("HandoverId") ? bundle.getLong("HandoverId") : 0L, null, com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a);
    }

    public final void p(long j) {
        if (this.g) {
            return;
        }
        A(j, null, com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a);
    }

    public final void q(Bundle bundle) {
        if (this.g) {
            return;
        }
        A(1L, bundle, com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a);
    }

    public final void r() {
        if (this.g) {
            return;
        }
        s(false);
    }

    public final void s(boolean z) {
        this.y = z;
        ae aeVar = new ae(com.google.android.apps.gsa.search.shared.service.c.ac.STOP_CLIENT);
        bg bgVar = is.a;
        ba createBuilder = it.a.createBuilder();
        createBuilder.copyOnWrite();
        it itVar = createBuilder.instance;
        itVar.b |= 1;
        itVar.c = this.f;
        createBuilder.copyOnWrite();
        it itVar2 = createBuilder.instance;
        itVar2.b |= 2;
        itVar2.d = z;
        aeVar.e(bgVar, createBuilder.build());
        h(aeVar.d());
    }

    public final void t() {
        if (this.g) {
            return;
        }
        h(new ae(com.google.android.apps.gsa.search.shared.service.c.ac.STOP_LISTENING).d());
    }

    public final void u() {
        if (this.g) {
            return;
        }
        h(new ae(com.google.android.apps.gsa.search.shared.service.c.ac.STOP_SPEAKING).d());
    }

    public final boolean v() {
        return B() || C();
    }

    final boolean w() {
        if (!this.x) {
            return v();
        }
        com.google.common.f.h e = f1358a.e();
        e.ak(8354);
        e.p("SearchServiceClient disposed and cannot be reused.");
        return false;
    }

    public final boolean x() {
        return this.p != null;
    }
}
