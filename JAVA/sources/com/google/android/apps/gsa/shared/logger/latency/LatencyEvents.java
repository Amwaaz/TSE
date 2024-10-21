package com.google.android.apps.gsa.shared.logger.latency;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/latency/LatencyEvents.class */
public class LatencyEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f1469a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public LatencyEvents(long j, long j2, long j3, long j4, long j5) {
        this.f1469a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.c = j5;
    }

    public final LatencyEvents a(long j) {
        return new LatencyEvents(this.f1469a, this.b, this.d, this.e, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatencyEvents latencyEvents = (LatencyEvents) obj;
        return this.f1469a == latencyEvents.f1469a && this.b == latencyEvents.b && this.d == latencyEvents.d && this.e == latencyEvents.e && this.c == latencyEvents.c;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.f1469a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.e;
        long j4 = this.d;
        long j5 = this.b;
        return (((((((i * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "LatencyEvents{applicationCreate=" + this.f1469a + ", newSearchIntent=" + this.b + ", activityCreate=" + this.d + ", queryEntryBegin=" + this.e + ", externalSearchIntent=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1469a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.c);
    }
}
