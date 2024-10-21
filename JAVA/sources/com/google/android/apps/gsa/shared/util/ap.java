package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/ap.class */
final class ap implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final int f1500a;

    public ap(int i) {
        this.f1500a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        BitFlags bitFlags;
        if (this.f1500a == 0) {
            return new UserHandleCompat((UserHandle) parcel.readParcelable(UserHandle.class.getClassLoader()));
        }
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null) {
            try {
                bitFlags = new BitFlags(Class.forName(readString), "FLAG_", readLong);
            } catch (ClassNotFoundException e) {
            }
            return bitFlags;
        }
        bitFlags = new BitFlags(null, "FLAG_", readLong);
        return bitFlags;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return this.f1500a != 0 ? new BitFlags[i] : new UserHandleCompat[i];
    }
}
