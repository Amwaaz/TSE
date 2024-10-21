package com.google.android.apps.gsa.nga.shared.q.f.a;

import android.app.ActivityManager;
import android.content.Context;
import j$.util.Collection;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/f/a/b.class */
public final class b {

    /* renamed from: a */
    private final ActivityManager f997a;

    public b(Context context) {
        this.f997a = (ActivityManager) context.getSystemService("activity");
    }

    public final boolean a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f997a.getRunningAppProcesses();
        return runningAppProcesses != null && Collection._EL.stream(runningAppProcesses).anyMatch(new a());
    }
}
