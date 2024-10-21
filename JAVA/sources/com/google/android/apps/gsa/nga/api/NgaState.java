package com.google.android.apps.gsa.nga.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/api/NgaState.class */
public enum NgaState implements Parcelable {
    ENABLED_IN_PAUSED_MODE,
    ENABLED,
    DISABLED;

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.google.android.apps.gsa.nga.api.as
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return NgaState.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new NgaState[i];
        }
    };

    public final boolean a() {
        return this == ENABLED;
    }

    public final boolean b() {
        return this == ENABLED_IN_PAUSED_MODE || this == ENABLED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
