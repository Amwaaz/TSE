package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/AttachClientResponse.class */
public class AttachClientResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final h f1326a;
    public final af b;

    public AttachClientResponse(h hVar, af afVar) {
        this.f1326a = hVar;
        this.b = afVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f1326a.asBinder());
        parcel.writeLong(this.b.f1332a);
        parcel.writeInt(this.b.b ? 1 : 0);
    }
}
