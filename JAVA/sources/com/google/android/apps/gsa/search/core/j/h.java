package com.google.android.apps.gsa.search.core.j;

import android.app.ActivityManager;
import android.content.Context;
import androidx.webkit.k$;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/j/h.class */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1130a;
    private final ActivityManager b;

    public h(Context context, ActivityManager activityManager) {
        context.getClass();
        this.f1130a = context;
        context.getPackageManager();
        this.b = activityManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r4 = this;
            r0 = r4
            android.content.Context r0 = r0.f1130a
            java.lang.String r1 = "android.permission.GET_TASKS"
            boolean r0 = com.google.android.apps.gsa.shared.util.permissions.d.a(r0, r1)
            r6 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 != 0) goto L8b
            r0 = r4
            android.content.Context r0 = r0.f1130a
            java.lang.String r1 = "android.permission.REAL_GET_TASKS"
            boolean r0 = com.google.android.apps.gsa.shared.util.permissions.d.a(r0, r1)
            if (r0 == 0) goto L20
            goto L8b
        L20:
            r0 = r4
            android.app.ActivityManager r0 = r0.b
            java.util.List r0 = r0.getRunningAppProcesses()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L2e:
            r0 = r8
            r7 = r0
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L89
            r0 = r10
            java.lang.Object r0 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0
            r7 = r0
            r0 = r7
            int r0 = r0.importance
            r1 = 100
            if (r0 != r1) goto L2e
            r0 = r7
            java.lang.String r0 = r0.processName
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L5f
        L5a:
            r0 = 0
            r7 = r0
            goto L7d
        L5f:
            r0 = r9
            r1 = 58
            int r0 = r0.indexOf(r1)
            r5 = r0
            r0 = r9
            r7 = r0
            r0 = r5
            if (r0 < 0) goto L7d
            r0 = r5
            if (r0 != 0) goto L75
            goto L5a
        L75:
            r0 = r9
            r1 = 0
            r2 = r5
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
        L7d:
            r0 = r7
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2e
            com.google.common.f.ab r0 = com.google.common.f.a.e.a
            r8 = r0
        L89:
            r0 = r7
            return r0
        L8b:
            int r0 = androidx.core.d.a.f45a
            r5 = r0
            r0 = r4
            android.app.ActivityManager r0 = r0.b
            r1 = 1
            java.util.List r0 = r0.getRunningTasks(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lc9
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc9
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0
            android.content.ComponentName r0 = androidx.webkit.k$.ExternalSyntheticApiModelOutline0.m(r0)
            if (r0 != 0) goto Lb8
            goto Lc9
        Lb8:
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0
            android.content.ComponentName r0 = androidx.webkit.k$.ExternalSyntheticApiModelOutline0.m(r0)
            java.lang.String r0 = r0.getPackageName()
            return r0
        Lc9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.j.h.a():java.lang.String");
    }

    public final String b(String str) {
        List<ActivityManager.RunningTaskInfo> runningTasks = this.b.getRunningTasks(1);
        if (runningTasks == null || runningTasks.isEmpty()) {
            return null;
        }
        ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
        if (k$.ExternalSyntheticApiModelOutline0.m(runningTaskInfo) == null || !k$.ExternalSyntheticApiModelOutline0.m(runningTaskInfo).getPackageName().equals(str)) {
            return null;
        }
        return k$.ExternalSyntheticApiModelOutline0.m(runningTaskInfo).getClassName();
    }
}
