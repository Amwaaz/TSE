package com.google.android.apps.gsa.staticplugins.al;

import androidx.annotation.b;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.ad;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.d;
import com.google.android.apps.gsa.search.shared.service.t;
import com.google.android.apps.gsa.search.shared.service.x;
import com.google.android.apps.gsa.shared.k.au;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.v.am;
import com.google.android.apps.gsa.shared.v.m;
import com.google.android.libraries.gsa.c.a.e;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.ah;
import com.google.common.base.at;
import com.google.common.base.ca;
import com.google.common.f.ab;
import com.google.common.f.y;
import com.google.common.o.or;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import e.a;
import io.grpc.cx;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/al/j.class */
public class j extends e implements ad {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1621a = 0;
    private static final com.google.common.f.j e = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.al.j");
    private static final ClientConfig f;
    private final h g;
    private final h h;
    private final p i;
    private final t j;
    private final AtomicInteger k;
    private final ConcurrentHashMap l;
    private cn m;
    private int n;

    static {
        d dVar = new d();
        dVar.c = or.V;
        dVar.d = "legacy_http_engine";
        f = new ClientConfig(dVar);
    }

    public j(ca caVar, a aVar, com.google.android.apps.gsa.shared.v.d dVar, h hVar, h hVar2, p pVar, x xVar) {
        super(at.k(caVar), aVar, dVar);
        this.k = new AtomicInteger(0);
        this.l = new ConcurrentHashMap();
        this.g = hVar;
        this.h = hVar2;
        this.i = pVar;
        this.j = xVar.a(this, null, f);
    }

    private final cn r(ac acVar, Object obj, ah ahVar) {
        cn settableFuture = new SettableFuture();
        int andIncrement = this.k.getAndIncrement();
        ae aeVar = new ae(acVar);
        aeVar.f(new DummyParcelable(new c(andIncrement, obj, at.k(settableFuture))));
        ClientEventData d = aeVar.d();
        cn h = i.h(settableFuture, new g(), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        cn e2 = ag.e(h, Duration.ofMillis(this.i.i(au.i)), this.h);
        this.h.m(settableFuture, "onResponseFutureDone", new i(this, andIncrement));
        this.l.put(Integer.valueOf(andIncrement), settableFuture);
        if (com.google.android.libraries.gsa.h.i.d(b.class)) {
            m(d);
        } else {
            this.g.n("connectToSearchServiceAndSendClientEvent", new h(this, d));
        }
        return c.g(e2, TimeoutException.class, ahVar, ay.a);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.k
    public final String D() {
        return "ProcessHttpEngine";
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final cn e(String str, int i, int i2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final cn f(am amVar, com.google.android.apps.gsa.shared.v.t tVar, m mVar) {
        ab abVar = com.google.common.f.a.e.a;
        URL url = amVar.f;
        return r(ac.HTTP_EXECUTE_REQUEST, new b(amVar, tVar, mVar), new e(4));
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final cn g(am amVar, com.google.android.apps.gsa.shared.v.t tVar, m mVar) {
        ab abVar = com.google.common.f.a.e.a;
        URL url = amVar.f;
        return r(ac.HTTP_EXECUTE_REQUEST_UNBUFFERED, new b(amVar, tVar, mVar), new e(1));
    }

    @Override // com.google.android.apps.gsa.search.shared.service.ad
    public final void gm(ServiceEventData serviceEventData) {
        ab abVar = com.google.common.f.a.e.a;
        hf a2 = hf.a(serviceEventData.f1330a.c);
        hf hfVar = a2;
        if (a2 == null) {
            hfVar = hf.ATTACH_WEBVIEW;
        }
        if (hfVar == hf.HTTP_SESSION_SERVICE_EVENT) {
            c cVar = (c) serviceEventData.b(DummyParcelable.class).a;
            SettableFuture settableFuture = (SettableFuture) this.l.get(Integer.valueOf(cVar.a));
            if (settableFuture != null) {
                settableFuture.n(cVar.b);
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final cn h(int i) {
        return r(ac.HTTP_GET_STATISTICS, Integer.valueOf(i), new e(3));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("ProcessHttpEngine");
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final void i(File file) {
        p(ac.HTTP_CAPTURE_NETLOG, file);
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final void j() {
        p(ac.HTTP_FORCE_START_NETLOG, com.google.common.base.a.a);
    }

    @Override // com.google.android.apps.gsa.shared.v.ae
    public final cn l(String str, int i, cx cxVar, String str2, int i2) {
        return r(ac.HTTP_CREATE_GRPC_CHANNEL, new a(str, i, cxVar, str2, i2), new e(2));
    }

    public final void m(ClientEventData clientEventData) {
        ab abVar = com.google.common.f.a.e.a;
        if (!this.j.v()) {
            this.j.c();
            this.j.q(null);
        }
        this.j.h(clientEventData);
    }

    public final void n(int i) {
        synchronized (this) {
            if (q() || i != this.n) {
                return;
            }
            ab abVar = com.google.common.f.a.e.a;
            this.j.e();
            this.m = null;
        }
    }

    public final void o(int i) {
        synchronized (this) {
            this.l.remove(Integer.valueOf(i));
            this.n = i;
            if (q()) {
                return;
            }
            cn cnVar = this.m;
            if (cnVar != null) {
                cnVar.cancel(true);
            }
            this.m = this.g.j("maybeDisconnectFromSearchService", Duration.ofMillis(60000L), new f(this, i));
        }
    }

    final void p(ac acVar, Object obj) {
        try {
            ag.g(r(acVar, obj, new e(0)));
        } catch (InterruptedException | ExecutionException e2) {
            y f2 = e.f();
            f2.aj(com.google.common.f.a.e.a, "ProcessHttpEngine");
            a.a.dB(f2, "Failed to process client event", (char) 14656, e2);
        }
    }

    final boolean q() {
        return !this.l.isEmpty();
    }
}
