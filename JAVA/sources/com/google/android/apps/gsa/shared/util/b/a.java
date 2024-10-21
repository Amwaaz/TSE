package com.google.android.apps.gsa.shared.util.b;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/b/a.class */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1504a = j.i("com.google.android.apps.gsa.shared.util.b.a");

    public static String a(String str) {
        String str2;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Error | Exception e) {
            aus.b(f1504a.e(), "Unable to read property %s.", str, (char) 9318, e);
            str2 = null;
        }
        return str2;
    }

    public static boolean b() {
        boolean z;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Boolean bool = (Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, "ro.opa.eligible_device", false);
            bool.getClass();
            z = bool.booleanValue();
        } catch (Error | Exception e) {
            aus.b(f1504a.e(), "Unable to read property %s.", "ro.opa.eligible_device", (char) 9319, e);
            z = false;
        }
        return z;
    }
}
