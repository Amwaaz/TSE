package com.google.android.apps.gsa.shared.util.debug.b;

import android.os.StrictMode;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/debug/b/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static com.google.android.apps.gsa.shared.o.a.a f1553a;
    public static final c b = new c();
    public static final ThreadLocal c;

    static {
        new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().penaltyDeath().build();
        c = new b();
    }

    public static void a() {
    }
}
