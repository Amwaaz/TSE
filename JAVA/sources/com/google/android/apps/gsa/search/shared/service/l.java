package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/l.class */
public final class l extends a implements n {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.service.ISearchServiceUiCallback");
    }

    @Override // com.google.android.apps.gsa.search.shared.service.n
    public final void a(ServiceEventData serviceEventData) {
        Parcel Z = Z();
        com.google.android.a.c.d(Z, serviceEventData);
        ac(1, Z);
    }

    @Override // com.google.android.apps.gsa.search.shared.service.n
    public final void b(int i) {
        Parcel Z = Z();
        Z.writeInt(i);
        ac(2, Z);
    }
}
