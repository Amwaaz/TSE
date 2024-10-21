package com.google.android.apps.gsa.shared.util.d;

import android.os.Build;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/d/b.class */
public final class b {
    public static int a() {
        return Build.VERSION.SDK_INT >= 29 ? -1 : 1;
    }
}
