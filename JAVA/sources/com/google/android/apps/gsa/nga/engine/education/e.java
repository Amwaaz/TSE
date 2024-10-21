package com.google.android.apps.gsa.nga.engine.education;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.libraries.gsa.h.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.f.a.a;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.a.d f567a = com.google.common.f.a.d.j();
    private final ConnectivityManager b;
    private final h c;

    public e(Context context, h hVar) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = hVar;
        hVar.b("[NGA] warmup TSIP network monitor", new c(this) { // from class: com.google.android.apps.gsa.nga.engine.education.d

            /* renamed from: a, reason: collision with root package name */
            public final e f566a;

            {
                this.f566a = this;
            }

            @Override // com.google.android.libraries.gsa.h.c
            public final Object a() {
                this.f566a.a();
                return dl.n(true);
            }
        });
    }

    public final Boolean a() {
        ConnectivityManager connectivityManager = this.b;
        boolean z = false;
        if (connectivityManager == null) {
            a d = f567a.d();
            d.ak(2893);
            d.p("connectivityManager is null. Returning false for isNetworkAvailable");
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            a d2 = f567a.d();
            d2.ak(2892);
            d2.p("No active network");
            return false;
        }
        ConnectivityManager connectivityManager2 = this.b;
        long networkHandle = activeNetwork.getNetworkHandle();
        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            qj j = ha.t(21, 16, 12).j();
            while (true) {
                if (!j.hasNext()) {
                    z = true;
                    break;
                }
                Integer num = (Integer) j.next();
                if (!networkCapabilities.hasCapability(num.intValue())) {
                    a d3 = f567a.d();
                    d3.ak(2894);
                    d3.N("Capability not met: %s, Network: %s, NetworkCapabilities: %s", num, Long.valueOf(networkHandle), networkCapabilities);
                    break;
                }
            }
        } else {
            a d4 = f567a.d();
            d4.ak(2895);
            d4.r("No network capabilities for network: %s", networkHandle);
        }
        return Boolean.valueOf(z);
    }
}
