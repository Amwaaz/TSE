package com.google.android.apps.gsa.nga.engine.ak.p;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.slice.o$;
import com.google.android.apps.gsa.n.b.a;
import com.google.android.apps.gsa.nga.api.ar;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.cf;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.search.x.b.b;
import com.google.common.util.concurrent.cr;
import j$.util.Optional;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/p/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f436a;
    public final Context b;
    public final cr c;
    public final a d;
    private final com.google.android.apps.gsa.shared.util.q.a e;
    private final e f;
    private final x g;

    public f(Context context, x xVar, com.google.android.apps.gsa.shared.util.q.a aVar, a aVar2, cr crVar, com.google.android.libraries.g.a aVar3) {
        Context a2 = com.google.android.libraries.search.x.d.a.a(context, b.TAG_CLASSIC_ASSISTANT_NGA);
        this.b = a2;
        Object systemService = a2.getSystemService("location");
        systemService.getClass();
        this.f436a = (LocationManager) systemService;
        this.g = xVar;
        this.e = aVar;
        this.d = aVar2;
        this.c = crVar;
        this.f = new e(aVar3);
    }

    public final void a(d dVar) {
        d dVar2 = d.a;
        String str = dVar.g;
        if (str == null) {
            throw new NullPointerException("Null callingComponentName");
        }
        this.g.b(new cf("NGA_LOCATION_API", str));
    }

    public final boolean b() {
        ar arVar;
        if (this.b.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 || this.b.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        long c = this.e.c("GsaPrefs.nga_location_access", ar.UNKNOWN.d);
        ar[] values = ar.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                arVar = ar.UNKNOWN;
                break;
            }
            arVar = values[i];
            if (arVar.d == c) {
                break;
            }
            i++;
        }
        if (!arVar.equals(ar.ALLOWED)) {
            return false;
        }
        LocationManager locationManager = this.f436a;
        int i2 = androidx.core.b.b.a;
        return o$.ExternalSyntheticApiModelOutline1.m(locationManager);
    }

    public final Optional c(d dVar) {
        Location location;
        if (!b()) {
            return Optional.empty();
        }
        long d = this.e.d(eu.jv);
        e eVar = this.f;
        synchronized (eVar.f435a) {
            long a2 = eVar.b.a();
            Location location2 = eVar.c;
            location = (location2 == null || a2 - eVar.d > d) ? null : new Location(location2);
        }
        if (location != null) {
            return Optional.of(location);
        }
        Iterator<String> it = this.f436a.getProviders(true).iterator();
        Location location3 = null;
        while (it.hasNext()) {
            Location lastKnownLocation = this.f436a.getLastKnownLocation(it.next());
            a(dVar);
            if (lastKnownLocation != null && (location3 == null || lastKnownLocation.getAccuracy() < location3.getAccuracy())) {
                location3 = lastKnownLocation;
            }
        }
        if (location3 != null) {
            location3.toString();
        }
        if (location3 != null) {
            e eVar2 = this.f;
            synchronized (eVar2.f435a) {
                if (location3.hasAccuracy()) {
                    eVar2.c = location3;
                    eVar2.d = eVar2.b.a();
                }
            }
        }
        return Optional.ofNullable(location3);
    }
}
