package com.google.android.apps.gsa.search.core.service;

import android.os.RemoteException;
import com.google.android.apps.gsa.search.core.service.a.a;
import com.google.android.apps.gsa.search.core.service.d.a.c;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.shared.util.ae;
import com.google.android.libraries.gsa.h.i;
import com.google.common.f.a.e;
import com.google.common.f.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/k.class */
public final class k implements ae, com.google.android.apps.gsa.search.shared.service.ad {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.search.shared.service.n f1216a;
    final o b;
    private boolean c = true;

    public k(o oVar, com.google.android.apps.gsa.search.shared.service.n nVar) {
        this.b = oVar;
        this.f1216a = nVar;
        nVar.asBinder().linkToDeath(oVar.b, 0);
    }

    private final void f(String str, Exception exc) {
        h e = o.f1218a.e();
        e.aj(e.a, "AttachedClient");
        h g = e.g(exc);
        g.ak(7209);
        g.H("%s: failed callback %s", this.b, str);
        this.b.j();
    }

    public final void a(ServiceEventData serviceEventData) {
        o oVar = this.b;
        if (oVar.w) {
            oVar.x.n("onGenericEventSync", new aq(this, serviceEventData, 1));
        } else {
            b(serviceEventData);
        }
    }

    public final void b(ServiceEventData serviceEventData) {
        com.google.android.apps.gsa.search.core.service.d.e eVar = this.b.s;
        if (eVar != null) {
            eVar.a("#onSendServiceEvent");
            eVar.b("#onSendServiceEvent");
            hf a2 = hf.a(serviceEventData.f1330a.c);
            hf hfVar = a2;
            if (a2 == null) {
                hfVar = hf.ATTACH_WEBVIEW;
            }
            c cVar = eVar.d;
            if (cVar.f1162a.get(hfVar) != null) {
                if (i.d(a.class)) {
                    cVar.a(serviceEventData);
                } else {
                    cVar.b.n("#onSendServiceEvent for ServiceEventSnooper listeners", new com.google.android.apps.gsa.search.core.service.d.a.a(cVar, serviceEventData));
                }
            }
        }
        try {
            this.f1216a.a(serviceEventData);
        } catch (RemoteException e) {
            f("onGenericEvent()", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.c) {
            this.c = false;
            this.f1216a.asBinder().unlinkToDeath(this.b.b, 0);
            return;
        }
        h e = o.f1218a.e();
        e.aj(e.a, "AttachedClient");
        h hVar = e;
        hVar.ak(7210);
        hVar.p("AttachedClientUiAdapter#unlinkToDeath called multiple times.");
        ((com.google.android.apps.gsa.shared.logger.e) this.b.g.a()).c(null, 26636648);
    }

    @Override // com.google.android.apps.gsa.search.shared.service.ad
    public final void gm(ServiceEventData serviceEventData) {
        a(serviceEventData);
    }

    @Override // com.google.android.apps.gsa.shared.util.ae
    public final void gn(int i) {
        try {
            this.f1216a.b(i);
        } catch (RemoteException e) {
            f("updateSpeechLevel()", e);
        }
    }
}
