package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.apps.gsa.search.core.service.SearchService;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/j.class */
public final class j extends b implements k {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.search.core.service.af f1352a;

    public j() {
        throw null;
    }

    public j(com.google.android.apps.gsa.search.core.service.af afVar) {
        super("com.google.android.apps.gsa.search.shared.service.ISearchServiceBinder");
        this.f1352a = afVar;
    }

    public final AttachClientResponse a(long j, n nVar, ClientConfig clientConfig, long j2) {
        try {
            return this.f1352a.b(j, nVar, clientConfig, j2);
        } catch (RuntimeException e) {
            com.google.common.f.h g = SearchService.f1147a.f().g(e);
            g.ak(7255);
            g.r("#attachClient: clientId=%d", j);
            throw e;
        }
    }

    public final void b(long j, boolean z) {
        try {
            this.f1352a.f(j, z);
        } catch (RuntimeException e) {
            com.google.common.f.h g = SearchService.f1147a.f().g(e);
            g.ak(7256);
            g.r("#detachClient: clientId=%d", j);
            throw e;
        }
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        n lVar;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            long readLong = parcel.readLong();
            boolean g = com.google.android.a.c.g(parcel);
            enforceNoDataAvail(parcel);
            b(readLong, g);
            parcel2.writeNoException();
            return true;
        }
        long readLong2 = parcel.readLong();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.search.shared.service.ISearchServiceUiCallback");
            lVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(readStrongBinder);
        }
        ClientConfig clientConfig = (ClientConfig) com.google.android.a.c.a(parcel, ClientConfig.CREATOR);
        long readLong3 = parcel.readLong();
        enforceNoDataAvail(parcel);
        AttachClientResponse a2 = a(readLong2, lVar, clientConfig, readLong3);
        parcel2.writeNoException();
        com.google.android.a.c.e(parcel2, a2);
        return true;
    }
}
