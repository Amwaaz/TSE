package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes-dex2jar.jar:androidx/room/n.class */
public final class n extends Binder implements o {

    /* renamed from: a, reason: collision with root package name */
    final MultiInstanceInvalidationService f132a;

    public n() {
        attachInterface(this, b);
    }

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f132a = multiInstanceInvalidationService;
        attachInterface(this, b);
    }

    @Override // androidx.room.o
    public final int a(l lVar, String str) {
        int i;
        lVar.getClass();
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f132a;
        synchronized (multiInstanceInvalidationService.c) {
            i = multiInstanceInvalidationService.f79a + 1;
            multiInstanceInvalidationService.f79a = i;
            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
            Integer valueOf = Integer.valueOf(i);
            if (remoteCallbackList.register(lVar, valueOf)) {
                multiInstanceInvalidationService.b.put(valueOf, str);
            } else {
                multiInstanceInvalidationService.f79a--;
                i = 0;
            }
        }
        return i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // androidx.room.o
    public final void b(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f132a;
        synchronized (multiInstanceInvalidationService.c) {
            String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.c.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.b.get(num);
                    if (i != intValue && h.a.a.p.b.a.f.h(str, str2)) {
                        try {
                            ((l) multiInstanceInvalidationService.c.getBroadcastItem(i2)).a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.c.finishBroadcast();
                }
            }
        }
    }

    @Override // androidx.room.o
    public final void c(l lVar, int i) {
        lVar.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f132a;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(lVar);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        l jVar;
        String str = b;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        l lVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            int i3 = k.b;
            if (readStrongBinder == null) {
                jVar = null;
            } else {
                j queryLocalInterface = readStrongBinder.queryLocalInterface(k.c);
                jVar = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new j(readStrongBinder) : (l) queryLocalInterface;
            }
            int a2 = a(jVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(a2);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            b(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        int i4 = k.b;
        if (readStrongBinder2 != null) {
            j queryLocalInterface2 = readStrongBinder2.queryLocalInterface(k.c);
            lVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof l)) ? new j(readStrongBinder2) : (l) queryLocalInterface2;
        }
        c(lVar, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
