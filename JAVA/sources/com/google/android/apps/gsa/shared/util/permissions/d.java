package com.google.android.apps.gsa.shared.util.permissions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Process;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.permissions.a.a;
import com.google.common.base.ap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/permissions/d.class */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final a f1573a;
    private final Context b;

    public d(Context context, com.google.android.apps.gsa.shared.util.debug.d dVar, a aVar) {
        this.b = context;
        this.f1573a = aVar;
        dVar.a(this);
    }

    public static boolean a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (RuntimeException e) {
            return false;
        }
    }

    public final boolean b(String str) {
        return !this.f1573a.a(str);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("PermissionsManager");
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 4096);
            ArrayList arrayList = null;
            int i = 0;
            while (i < packageInfo.requestedPermissions.length) {
                ArrayList arrayList2 = arrayList;
                if ((packageInfo.requestedPermissionsFlags[i] & 2) == 0) {
                    String str = packageInfo.requestedPermissions[i];
                    try {
                        PermissionInfo permissionInfo = this.b.getPackageManager().getPermissionInfo(str, 0);
                        arrayList2 = arrayList;
                        if (permissionInfo != null) {
                            arrayList2 = arrayList;
                            if (permissionInfo.protectionLevel == 1) {
                                arrayList2 = arrayList;
                                if (arrayList == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(str);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        arrayList2 = arrayList;
                    }
                }
                i++;
                arrayList = arrayList2;
            }
            List list = arrayList;
            if (arrayList == null) {
                list = Collections.emptyList();
            }
            if (list.isEmpty()) {
                return;
            }
            Collections.sort(list);
            f d = fVar.d((Object) null);
            d.q("Denied");
            d.r(new com.google.android.apps.gsa.shared.util.b.d(ap.c(',').d(list), false));
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }
}
