package com.google.android.a;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.IObjectWrapper;

/* loaded from: classes-dex2jar.jar:com/google/android/a/b.class */
public class b extends Binder implements IInterface, IObjectWrapper {
    private static d globalInterceptor;

    public b() {
        throw null;
    }

    public b(String str) {
        attachInterface(this, str);
    }

    static void installTransactionInterceptorPackagePrivate(d dVar) {
        synchronized (b.class) {
            try {
                if (dVar == null) {
                    throw new IllegalArgumentException("null interceptor");
                }
                if (globalInterceptor != null) {
                    throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
                }
                globalInterceptor = dVar;
            } finally {
            }
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public void enforceNoDataAvail(Parcel parcel) {
        d dVar = globalInterceptor;
        if (dVar != null) {
            dVar.a();
            return;
        }
        ClassLoader classLoader = c.f231a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        d dVar = globalInterceptor;
        return dVar == null ? dispatchTransaction(i, parcel, parcel2, i2) : dVar.b();
    }
}
