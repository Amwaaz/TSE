package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import com.google.android.a.b;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/g.class */
public abstract class g extends b implements h {
    public g() {
        super("com.google.android.apps.gsa.search.shared.service.ISearchService");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ClientEventData clientEventData = (ClientEventData) com.google.android.a.c.a(parcel, ClientEventData.CREATOR);
        enforceNoDataAvail(parcel);
        h(clientEventData);
        return true;
    }
}
