package androidx.work.impl.a.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.core.d.e$;
import androidx.work.af;
import androidx.work.impl.utils.b.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/l.class */
public final class l extends i {
    public final ConnectivityManager e;
    private final k f;

    public l(Context context, b bVar) {
        super(context, bVar);
        Object systemService = this.f171a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new k(this);
    }

    @Override // androidx.work.impl.a.b.i
    public final /* synthetic */ Object b() {
        return m.a(this.e);
    }

    @Override // androidx.work.impl.a.b.i
    public final void d() {
        try {
            af.a().c(m.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.e;
            k kVar = this.f;
            kVar.getClass();
            e$.ExternalSyntheticApiModelOutline0.m(connectivityManager, kVar);
        } catch (IllegalArgumentException e) {
            af.a();
            Log.e(m.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            af.a();
            Log.e(m.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.a.b.i
    public final void e() {
        try {
            af.a().c(m.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.e;
            k kVar = this.f;
            kVar.getClass();
            connectivityManager.unregisterNetworkCallback(kVar);
        } catch (IllegalArgumentException e) {
            af.a();
            Log.e(m.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            af.a();
            Log.e(m.a, "Received exception while unregistering network callback", e2);
        }
    }
}
