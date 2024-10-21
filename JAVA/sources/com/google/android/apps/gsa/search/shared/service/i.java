package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/i.class */
public final class i extends a implements k {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.service.ISearchServiceBinder");
    }

    public final AttachClientResponse a(long j, n nVar, ClientConfig clientConfig, long j2) {
        Parcel Z = Z();
        Z.writeLong(j);
        com.google.android.a.c.f(Z, nVar);
        com.google.android.a.c.d(Z, clientConfig);
        Z.writeLong(j2);
        Parcel aa = aa(1, Z);
        AttachClientResponse attachClientResponse = (AttachClientResponse) com.google.android.a.c.a(aa, AttachClientResponse.CREATOR);
        aa.recycle();
        return attachClientResponse;
    }

    public final void b(long j, boolean z) {
        Parcel Z = Z();
        Z.writeLong(j);
        ClassLoader classLoader = com.google.android.a.c.f231a;
        Z.writeInt(z ? 1 : 0);
        ab(2, Z);
    }
}
