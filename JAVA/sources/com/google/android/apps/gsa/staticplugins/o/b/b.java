package com.google.android.apps.gsa.staticplugins.o.b;

import android.content.Intent;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.ae.af.a;
import com.google.android.apps.gsa.search.core.ae.aq.f;
import com.google.android.apps.gsa.search.core.ae.aq.h;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.service.d.g;
import com.google.android.apps.gsa.search.core.service.o;
import com.google.android.apps.gsa.search.core.service.x;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.d.b.u;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.k.cy;
import com.google.android.apps.gsa.shared.util.c.a.an;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.apps.gsa.shared.util.c.ao;
import com.google.android.apps.gsa.smartspace.k;
import com.google.common.b.ha;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/o/b/b.class */
public class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1730a = j.i("com.google.android.apps.gsa.staticplugins.o.b.b");
    private final x c;
    private final com.google.android.apps.gsa.search.core.ae.bo.b d;
    private final a e;
    private final com.google.android.apps.gsa.search.core.ae.bv.a f;
    private final f g;
    private final e h;
    private final c i;
    private final p j;
    private final com.google.android.apps.gsa.search.core.ae.aq.e k;
    private final com.google.android.apps.gsa.search.core.ae.ar.a l;
    private final com.google.android.apps.gsa.search.core.ae.x.a m;
    private final h n;
    private final an o;

    public b(x xVar, com.google.android.apps.gsa.search.core.ae.bo.b bVar, a aVar, com.google.android.apps.gsa.search.core.ae.bv.a aVar2, f fVar, e eVar, c cVar, p pVar, an anVar, com.google.android.apps.gsa.search.core.ae.aq.e eVar2, com.google.android.apps.gsa.search.core.ae.ar.a aVar3, com.google.android.apps.gsa.search.core.ae.x.a aVar4, h hVar) {
        this.c = xVar;
        this.d = bVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = fVar;
        this.h = eVar;
        this.i = cVar;
        this.j = pVar;
        this.o = anVar;
        this.k = eVar2;
        this.l = aVar3;
        this.m = aVar4;
        this.n = hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final /* synthetic */ com.google.android.apps.gsa.search.core.service.e.c a(com.google.android.libraries.g.a aVar) {
        return com.google.android.apps.gsa.search.core.service.d.f.a(aVar);
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final /* synthetic */ ha e() {
        return g.b;
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final void f(long j, ClientEventData clientEventData, com.google.android.apps.gsa.search.core.service.d.c cVar) {
        cn a2;
        ac a3 = ac.a(clientEventData.f1328a.c);
        ac acVar = a3;
        if (a3 == null) {
            acVar = ac.UNKNOWN;
        }
        ab abVar = com.google.common.f.a.e.a;
        if (acVar != ac.COMMON_BROADCAST_MESSAGE_RECEIVED || !clientEventData.d(Intent.class)) {
            this.c.f(com.google.android.apps.gsa.v.c.b, j, 0L);
            return;
        }
        Intent intent = (Intent) clientEventData.b(Intent.class);
        String action = intent.getAction();
        if (action == null) {
            a2 = com.google.android.apps.gsa.v.c.b;
        } else {
            ArrayList arrayList = new ArrayList();
            String action2 = intent.getAction();
            action2.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (k.f1586a.contains(intent.getAction()) | ("android.intent.action.PACKAGES_SUSPENDED".equals(intent.getAction()) || "android.intent.action.PACKAGES_UNSUSPENDED".equals(intent.getAction()))) {
                com.google.android.apps.gsa.d.e.d(3);
                arrayList2.add(this.d.a(intent));
            }
            if (com.google.android.apps.gsa.opa.smartspace.c.b.contains(intent.getAction())) {
                com.google.android.apps.gsa.d.e.d(4);
                arrayList2.add(this.k.a(intent));
            }
            if ("android.intent.action.USER_PRESENT".equals(action2)) {
                com.google.android.apps.gsa.d.e.d(5);
            }
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(action2) && intent.hasExtra("extra_download_id")) {
                long longExtra = intent.getLongExtra("extra_download_id", Long.MAX_VALUE);
                long i = this.i.i(cy.f1433a);
                com.google.android.apps.gsa.d.e.d(6);
                e eVar = this.h;
                SettableFuture settableFuture = new SettableFuture();
                eVar.b.n("CompleteDownloadRequest", new d(eVar, longExtra, new c(settableFuture)));
                ao.b(settableFuture, i, this.o);
                arrayList2.add(settableFuture);
                com.google.android.apps.gsa.d.e.d(7);
                cn a4 = this.e.a(longExtra);
                ao.b(a4, i, this.o);
                arrayList2.add(a4);
            }
            if ("com.google.android.googlequicksearchbox.AWARENESS_OPA_NOTIFICATION_TRIGGER".equals(action2)) {
                com.google.android.apps.gsa.d.e.d(8);
                arrayList2.add(this.g.f(intent));
            }
            if ("com.google.android.googlequicksearchbox.OPA_DISMISS_CLIENT_NOTIFICATION".equals(action2)) {
                com.google.android.apps.gsa.d.e.d(9);
                arrayList2.add(this.g.c(intent));
            }
            if ("com.google.android.googlequicksearchbox.OPA_TRIGGER_CLIENT_NOTIFICATION".equals(action2)) {
                com.google.android.apps.gsa.d.e.d(10);
                arrayList2.add(this.g.k(intent));
            }
            if ("com.google.android.googlequicksearchbox.OPA_TRIGGER_DELAYED_NOTIFICATION".equals(action2)) {
                com.google.android.apps.gsa.d.e.d(11);
                arrayList2.add(this.g.l(intent));
            }
            if (com.google.android.apps.gsa.opa.g.a.b.contains(intent.getAction())) {
                com.google.android.apps.gsa.d.e.d(12);
                arrayList2.add(this.n.a(intent));
            }
            if ("android.intent.action.PACKAGE_ADDED".equals(action2) || "android.intent.action.PACKAGE_CHANGED".equals(action2) || "android.intent.action.PACKAGE_REMOVED".equals(action2)) {
                com.google.android.apps.gsa.d.e.d(13);
                arrayList2.add(this.m.b());
            }
            arrayList.addAll(arrayList2);
            String action3 = intent.getAction();
            action3.getClass();
            ArrayList arrayList3 = new ArrayList();
            j jVar = com.google.android.apps.gsa.staticplugins.cd.e.f1641a;
            String action4 = intent.getAction();
            if ("com.google.android.apps.gsa.handsfree.ACTION_DEVICE_CONNECTED".equals(action4) || "android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT".equals(action4)) {
                com.google.android.apps.gsa.d.e.d(18);
                arrayList3.add(this.f.a(intent));
            }
            if (!this.j.w(az.aF) && ("android.intent.action.ACTION_POWER_CONNECTED".equals(action3) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action3))) {
                com.google.android.apps.gsa.d.e.d(27);
                arrayList3.add(this.l.a(intent));
            }
            arrayList.addAll(arrayList3);
            if (arrayList.isEmpty()) {
                a2 = com.google.android.apps.gsa.v.c.b;
            } else if (arrayList.size() == 1) {
                cn cnVar = (cn) arrayList.get(0);
                a2 = cnVar;
                if (!cnVar.isCancelled()) {
                    a2 = cnVar;
                    if (ag.o(cnVar, Throwable.class)) {
                        y e = f1730a.e();
                        e.aj(com.google.common.f.a.e.a, "BcastRcvrSessionCntrl");
                        aus.b(e, "Broadcast handler failed for intent action: %s", action, (char) 13622, ag.m(cnVar, Throwable.class));
                        a2 = cnVar;
                    }
                }
            } else {
                a2 = dl.f(arrayList).a(new a(arrayList), ay.a);
            }
        }
        this.c.f(a2, j, 0L);
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final void h() {
        ab abVar = com.google.common.f.a.e.a;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q(getClass().getName());
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final /* synthetic */ boolean i(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return true;
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final void j(o oVar) {
        ab abVar = com.google.common.f.a.e.a;
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // com.google.android.apps.gsa.search.core.service.d.g
    public final void l(long j, u uVar) {
        ab abVar = com.google.common.f.a.e.a;
    }
}
