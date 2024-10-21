package com.google.android.apps.gsa.shared.logger.latency;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/latency/a.class */
final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LatencyEvents(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatencyEvents[i];
    }
}
