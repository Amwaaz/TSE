package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.b.oo;
import com.google.common.base.bu;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/as.class */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private static final d f1502a = d.j();
    private static final bu b = bu.f(cl.I("\\."));

    public static String a(Context context) {
        return context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionName;
    }

    public static String b(Context context) {
        try {
            String a2 = a(context);
            bu buVar = b;
            return String.format("%s.%s", Integer.valueOf(Integer.parseInt((String) oo.av(buVar.h(a2), 0))), Integer.valueOf(Integer.parseInt((String) oo.av(buVar.h(a2), 1))));
        } catch (PackageManager.NameNotFoundException e) {
            aus.f(f1502a.f(), "AppVersion not found, returning 0.0.", (char) 9310, e);
            return "0.0";
        }
    }

    public static boolean c(String str, String str2) {
        int intValue;
        int intValue2;
        List d = d(str);
        List d2 = d(str2);
        for (int i = 0; i < d.size() && i < d2.size() && (intValue = ((Integer) d.get(i)).intValue()) <= (intValue2 = ((Integer) d2.get(i)).intValue()); i++) {
            if (intValue < intValue2) {
                return false;
            }
        }
        return true;
    }

    private static List d(String str) {
        Iterable h = b.h(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return arrayList;
    }
}
