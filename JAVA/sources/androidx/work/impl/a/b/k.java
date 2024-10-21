package androidx.work.impl.a.b;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.af;
import java.util.Objects;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/k.class */
public final class k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final l f172a;

    public k(l lVar) {
        this.f172a = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        af a2 = af.a();
        String str = m.a;
        Objects.toString(networkCapabilities);
        a2.c(str, "Network capabilities changed: ".concat(networkCapabilities.toString()));
        this.f172a.f(new androidx.work.impl.a.i(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        af.a().c(m.a, "Network connection lost");
        l lVar = this.f172a;
        lVar.f(m.a(lVar.e));
    }
}
