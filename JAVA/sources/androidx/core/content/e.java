package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.core.app.f;
import androidx.core.d.i$;
import j$.util.Objects;

/* loaded from: classes-dex2jar.jar:androidx/core/content/e.class */
public final class e {
    public static int a(Context context, String str) {
        int f;
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            i = -1;
        } else {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp == null) {
                i = 0;
            } else {
                String str2 = packageName;
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    i = -1;
                    if (packagesForUid != null) {
                        if (packagesForUid.length <= 0) {
                            i = -1;
                        } else {
                            str2 = packagesForUid[0];
                        }
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, str2)) {
                    f = f.f(context, permissionToOp, str2);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    f = f.g(appOpsManager, permissionToOp, Binder.getCallingUid(), str2);
                    if (f == 0) {
                        f = f.g(appOpsManager, permissionToOp, myUid, i$.ExternalSyntheticApiModelOutline0.m(context));
                    }
                } else {
                    f = f.f(context, permissionToOp, str2);
                }
                if (f == 0) {
                    return 0;
                }
                i = -2;
            }
        }
        return i;
    }
}
