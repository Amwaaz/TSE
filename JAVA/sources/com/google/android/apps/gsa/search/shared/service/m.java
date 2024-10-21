package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/m.class */
public final class m extends b implements n {

    /* renamed from: a, reason: collision with root package name */
    public volatile ad f1353a;
    public volatile com.google.android.apps.gsa.shared.util.ae b;
    public volatile com.google.android.libraries.gsa.h.h c;
    protected final EnumMap d;

    public m() {
        throw null;
    }

    public m(byte[] bArr) {
        super("com.google.android.apps.gsa.search.shared.service.ISearchServiceUiCallback");
        this.d = new EnumMap(hf.class);
    }

    @Override // com.google.android.apps.gsa.search.shared.service.n
    public final void a(final ServiceEventData serviceEventData) {
        hf a2 = hf.a(serviceEventData.f1330a.c);
        hf hfVar = a2;
        if (a2 == null) {
            hfVar = hf.ATTACH_WEBVIEW;
        }
        String str = "onGenericEvent[ServiceEvent = " + hfVar.cx + "]";
        com.google.android.libraries.gsa.h.f fVar = new com.google.android.libraries.gsa.h.f(this, serviceEventData) { // from class: com.google.android.apps.gsa.search.shared.service.s

            /* renamed from: a, reason: collision with root package name */
            public final ServiceEventData f1357a;
            public final m b;

            {
                this.b = this;
                this.f1357a = serviceEventData;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                ServiceEventData serviceEventData2 = this.f1357a;
                m mVar = this.b;
                if (mVar.f1353a != null) {
                    mVar.f1353a.gm(serviceEventData2);
                }
                EnumMap enumMap = mVar.d;
                hf a3 = hf.a(serviceEventData2.f1330a.c);
                hf hfVar2 = a3;
                if (a3 == null) {
                    hfVar2 = hf.ATTACH_WEBVIEW;
                }
                Set set = (Set) enumMap.get(hfVar2);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((ad) it.next()).gm(serviceEventData2);
                    }
                }
            }
        };
        com.google.android.libraries.gsa.h.h hVar = this.c;
        String concat = "UiCallbackStub-".concat(str);
        if (hVar != null) {
            hVar.n(concat, fVar);
            return;
        }
        com.google.common.f.h f = t.f1358a.f();
        f.ak(8336);
        f.s("%s task was not run. Callback from Service received after client was disposed.", concat);
    }

    @Override // com.google.android.apps.gsa.search.shared.service.n
    public final void b(int i) {
        com.google.android.apps.gsa.shared.util.ae aeVar = this.b;
        if (aeVar != null) {
            aeVar.gn(i);
        }
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ServiceEventData serviceEventData = (ServiceEventData) com.google.android.a.c.a(parcel, ServiceEventData.CREATOR);
            enforceNoDataAvail(parcel);
            a(serviceEventData);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        b(readInt);
        return true;
    }
}
