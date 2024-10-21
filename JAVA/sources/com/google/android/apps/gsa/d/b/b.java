package com.google.android.apps.gsa.d.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.slice.b$;
import com.google.android.libraries.ax.h;
import com.google.android.libraries.search.t.i.y;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/b/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f343a = true;
    public static volatile Map b = new ConcurrentHashMap();
    private static volatile y c;
    private static volatile PackageManager d;

    public static void a(y yVar, Context context) {
        if (d != null) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        c = yVar;
        d = packageManager;
        ArrayList arrayList = new ArrayList(b.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g(yVar, packageManager, (a) arrayList.get(i));
        }
    }

    public static void b(int i, int i2) {
        h(i - 1, 1, i2 - 1);
    }

    public static void c(int i) {
        h(i - 1, 2, 2);
    }

    public static void d(int i) {
        h(i - 1, 2, 3);
    }

    public static void e(int i) {
        h(i - 1, 2, 1);
    }

    public static void f(int i, int i2) {
        h(i - 1, 1, i2);
    }

    private static void g(y yVar, PackageManager packageManager, a aVar) {
        String[] packagesForUid;
        String str;
        if ((aVar.b != Process.myUid() || Math.random() >= 0.9d) && (packagesForUid = packageManager.getPackagesForUid(aVar.b)) != null && packagesForUid.length > 0) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packagesForUid[0], 0);
                str = (packageInfo.versionName == null || packageInfo.versionName.isEmpty()) ? String.valueOf(b$.ExternalSyntheticApiModelOutline0.m(packageInfo)) : packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                str = "unknown";
            }
            for (String str2 : packagesForUid) {
                if (aVar.d - 1 != 0) {
                    ((h) yVar.aG.a()).b(1L, str2, str, Integer.valueOf(aVar.f342a), Integer.valueOf(aVar.c));
                } else {
                    ((h) yVar.aH.a()).b(1L, str2, str, Integer.valueOf(aVar.f342a), Integer.valueOf(aVar.c));
                }
            }
        }
    }

    private static void h(int i, int i2, int i3) {
        if (f343a) {
            a aVar = new a(i, i2, Binder.getCallingUid(), i3);
            if (b.containsKey(aVar) || Map._EL.putIfAbsent(b, aVar, true) != null || c == null || d == null) {
                return;
            }
            g(c, d, aVar);
        }
    }
}
