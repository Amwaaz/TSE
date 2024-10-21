package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes-dex2jar.jar:com/google/android/a/a.class */
public class a implements IInterface {

    /* renamed from: a */
    public final IBinder f230a;
    private final String b;

    public a(IBinder iBinder, String str) {
        this.f230a = iBinder;
        this.b = str;
    }

    public final Parcel Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final Parcel aa(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f230a.transact(i, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final void ab(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f230a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void ac(int i, Parcel parcel) {
        try {
            this.f230a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f230a;
    }
}
