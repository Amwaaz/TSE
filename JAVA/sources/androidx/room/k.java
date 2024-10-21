package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import kotlinx.coroutines.dc;

/* loaded from: classes-dex2jar.jar:androidx/room/k.class */
public final class k extends Binder implements l {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    final y f131a;

    public k() {
        attachInterface(this, c);
    }

    public k(y yVar) {
        this.f131a = yVar;
        attachInterface(this, c);
    }

    @Override // androidx.room.l
    public final void a(String[] strArr) {
        strArr.getClass();
        y yVar = this.f131a;
        dc.P(yVar.d, (m.c.n) null, 0, new v(yVar, strArr, (m.c.g) null), 3);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = c;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a(parcel.createStringArray());
        return true;
    }
}
