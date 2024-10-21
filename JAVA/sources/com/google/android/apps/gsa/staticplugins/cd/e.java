package com.google.android.apps.gsa.staticplugins.cd;

import com.google.android.apps.gsa.search.core.preferences.i;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/cd/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1641a = j.i("com.google.android.apps.gsa.staticplugins.cd.e");
    public static final int[] b = {22, 6, 13, 9, 41, 8, 1, 5, 16, 7, 20, 2, 35, 19, 17, 38, 11, 3, 30, 32, 46, 14, 31, 29, 24, 18};

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= '!' && c <= '~') {
                charArray[i] = (char) (((c + 14) % 94) + 33);
            }
        }
        return new String(charArray);
    }

    static String b(String str) {
        return "\"" + str.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    static String c(String str) {
        String str2 = str;
        if (str.length() >= 2) {
            str2 = str;
            if (str.charAt(0) == '\"') {
                str2 = str.charAt(str.length() - 1) != '\"' ? str : str.substring(1, str.length() - 1).replace("\\\"", "\"").replace("\\\\", "\\");
            }
        }
        return str2;
    }

    static void d(n nVar) {
        i f = nVar.f();
        f.h("vic_last_vehicle_mac_address");
        f.h("vic_last_vehicle_info");
        f.b(true);
    }

    static boolean e(n nVar) {
        return nVar.getBoolean("vic_dialog_presented", false);
    }

    static void f(n nVar) {
        i f = nVar.f();
        f.a("bluetoothHeadset", true);
        f.b(true);
    }
}
