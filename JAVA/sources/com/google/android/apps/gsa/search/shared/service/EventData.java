package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.cl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/EventData.class */
public abstract class EventData implements Parcelable {

    /* renamed from: a */
    private final Parcelable f1329a;

    public EventData(Parcelable parcelable) {
        c(parcelable);
        this.f1329a = parcelable;
    }

    public static void c(Parcelable parcelable) {
        Class<?> cls;
        if (parcelable == null) {
            return;
        }
        String name = parcelable.getClass().getName();
        boolean z = false;
        try {
            cls = Class.forName(name, false, EventData.class.getClassLoader());
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls == parcelable.getClass()) {
            z = true;
        }
        cl.l(z, "%s is not available in the main apk classloader", name);
    }

    public abstract byte[] a();

    public final Parcelable b(Class cls) {
        Parcelable parcelable = this.f1329a;
        parcelable.getClass();
        return (Parcelable) cls.cast(parcelable);
    }

    public final boolean d(Class cls) {
        Parcelable parcelable = this.f1329a;
        return parcelable != null && cls.isInstance(parcelable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(a());
        parcel.writeParcelable(this.f1329a, 0);
    }
}
