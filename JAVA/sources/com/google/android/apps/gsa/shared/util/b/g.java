package com.google.android.apps.gsa.shared.util.b;

import android.os.Build;
import com.google.android.apps.gsa.shared.o.a.a.b;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/b/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1506a;
    public static volatile com.google.android.apps.gsa.shared.o.a.a b;
    private static final boolean c;

    static {
        boolean z = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        c = z;
        boolean z2 = true;
        if (!"goldfish".equals(Build.HARDWARE)) {
            z2 = "ranchu".equals(Build.HARDWARE);
        }
        f1506a = false;
        b = (z || z2) ? new com.google.android.apps.gsa.shared.o.a.a.a() : new b();
    }
}
