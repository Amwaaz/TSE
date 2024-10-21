package com.google.android.apps.gsa.publicsearch;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/publicsearch/b.class */
public final class b extends com.google.android.a.a implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchService");
    }

    public final IBinder a(String str, IBinder iBinder, Bundle bundle) {
        Parcel Z = Z();
        Z.writeString(str);
        Z.writeStrongBinder(iBinder);
        com.google.android.a.c.d(Z, bundle);
        Parcel aa = aa(2, Z);
        IBinder readStrongBinder = aa.readStrongBinder();
        aa.recycle();
        return readStrongBinder;
    }
}
