package com.google.android.apps.gsa.search.shared.service;

import a.a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.common.f.am;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/r.class */
public final class r implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final t f1356a;
    private final ClientConfig b;
    private final m c;

    public r(t tVar, m mVar, ClientConfig clientConfig) {
        this.f1356a = tVar;
        this.c = mVar;
        this.b = clientConfig;
    }

    public final void a() {
        AttachClientResponse b;
        try {
            t tVar = this.f1356a;
            k kVar = tVar.l;
            if (kVar != null) {
                b = kVar.a(tVar.f, this.c, this.b, tVar.r);
            } else {
                com.google.android.apps.gsa.search.core.service.af afVar = tVar.t;
                if (afVar == null) {
                    return;
                } else {
                    b = afVar.b(tVar.f, this.c, this.b, tVar.r);
                }
            }
            t tVar2 = this.f1356a;
            tVar2.m = b.f1326a;
            tVar2.q = b.b;
            h hVar = tVar2.m;
            if (hVar == null) {
                com.google.common.f.h e = t.f1358a.e();
                e.ak(8331);
                e.p("Attach client call failed!");
                return;
            }
            try {
                Iterator it = tVar2.h.iterator();
                while (it.hasNext()) {
                    hVar.h((ClientEventData) it.next());
                }
                tVar2.h.clear();
                ClientEventData clientEventData = tVar2.p;
                if (clientEventData != null) {
                    tVar2.s = false;
                    hVar.h(clientEventData);
                }
                t tVar3 = this.f1356a;
                tVar3.u.a(new ae(hf.ON_SERVICE_CONNECTED).a());
                if (tVar3.o && tVar3.q.b) {
                    tVar3.q(null);
                }
            } catch (RemoteException e2) {
                com.google.common.f.h g = t.f1358a.e().g(e2);
                g.ak(8353);
                g.p("flushPendingItems failed");
            }
        } catch (RemoteException e3) {
            a.dB(t.f1358a.e(), "setSearchServiceUiCallback() failed", (char) 8330, e3);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.common.f.j jVar = t.f1358a;
        am.d.getClass();
        t tVar = this.f1356a;
        tVar.n = false;
        tVar.m = null;
        tVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.apps.gsa.search.shared.service.k] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i iVar;
        com.google.common.f.j jVar = t.f1358a;
        am.d.getClass();
        if (this.f1356a.d.b()) {
            com.google.android.apps.gsa.shared.util.debug.h.a("SearchService.onServiceConnected", this.f1356a.d);
        }
        t tVar = this.f1356a;
        if (iBinder == null) {
            iVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.search.shared.service.ISearchServiceBinder");
            iVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
        }
        tVar.l = iVar;
        a();
        if (this.f1356a.d.b()) {
            com.google.android.apps.gsa.shared.util.debug.h.b(this.f1356a.d);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.common.f.j jVar = t.f1358a;
        am.d.getClass();
        t tVar = this.f1356a;
        tVar.m = null;
        tVar.g();
    }
}
