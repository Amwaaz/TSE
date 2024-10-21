package com.google.android.a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes-dex2jar.jar:com/google/android/a/c.class */
public final class c {

    /* renamed from: a */
    public static final ClassLoader f231a = c.class.getClassLoader();

    private c() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static CharSequence b(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public static void c(Parcel parcel, CharSequence charSequence) {
        if (charSequence == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            TextUtils.writeToParcel(charSequence, parcel, 1);
        }
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static void f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
