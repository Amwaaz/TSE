package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/f.class */
public final class f extends a implements h {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.service.ISearchService");
    }

    @Override // com.google.android.apps.gsa.search.shared.service.h
    public final void h(ClientEventData clientEventData) {
        Parcel Z = Z();
        com.google.android.a.c.d(Z, clientEventData);
        ac(1, Z);
    }
}
