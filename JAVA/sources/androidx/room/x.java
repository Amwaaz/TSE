package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes-dex2jar.jar:androidx/room/x.class */
public final class x implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final y f138a;

    public x(y yVar) {
        this.f138a = yVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        m queryLocalInterface = iBinder.queryLocalInterface(n.b);
        o mVar = (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new m(iBinder) : (o) queryLocalInterface;
        y yVar = this.f138a;
        yVar.g = mVar;
        try {
            o oVar = yVar.g;
            if (oVar != null) {
                yVar.f = oVar.a(yVar.i, yVar.f139a);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.f138a.g = null;
    }
}
