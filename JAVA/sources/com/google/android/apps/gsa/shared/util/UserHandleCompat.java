package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserHandle;
import h.a.a.p.b.a.f;
import java.util.Arrays;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/UserHandleCompat.class */
public class UserHandleCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ap(0);

    /* renamed from: a, reason: collision with root package name */
    public final UserHandle f1498a;

    public UserHandleCompat(UserHandle userHandle) {
        this.f1498a = userHandle;
    }

    public static UserHandleCompat a() {
        return new UserHandleCompat(Process.myUserHandle());
    }

    public final boolean b() {
        UserHandle userHandle = this.f1498a;
        if (userHandle == null) {
            return false;
        }
        try {
            Boolean bool = (Boolean) userHandle.getClass().getMethod("isOwner", null).invoke(this.f1498a, null);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UserHandleCompat) {
            return f.f(this.f1498a, ((UserHandleCompat) obj).f1498a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1498a});
    }

    public final String toString() {
        UserHandle userHandle = this.f1498a;
        return userHandle != null ? userHandle.toString() : "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1498a, 0);
    }
}
