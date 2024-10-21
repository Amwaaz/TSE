package com.google.android.apps.gsa.search.core.ac;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.PowerManager;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.common.f.a.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ac/t.class */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1052a;
    public final KeyguardManager b;
    private final PowerManager c;
    private final DisplayManager d;

    public t(Context context) {
        this.f1052a = context;
        this.c = (PowerManager) context.getSystemService("power");
        this.b = (KeyguardManager) context.getSystemService("keyguard");
        this.d = (DisplayManager) context.getSystemService("display");
    }

    public final int a() {
        if (!this.b.isKeyguardLocked()) {
            return 0;
        }
        a aVar = d.f1553a;
        return this.b.isKeyguardSecure() ? 2 : 1;
    }

    public final boolean b() {
        int a2 = a();
        com.google.common.f.ab abVar = e.a;
        return a2 != 0;
    }

    public final boolean c() {
        boolean z = true;
        if (d()) {
            z = b();
        }
        com.google.common.f.ab abVar = e.a;
        return z;
    }

    public final boolean d() {
        DisplayManager displayManager = this.d;
        boolean z = true;
        if (displayManager != null && displayManager.getDisplay(0).getState() != 2) {
            z = false;
        }
        com.google.common.f.ab abVar = e.a;
        return z;
    }

    public final void e(int i) {
        PowerManager powerManager = this.c;
        if (powerManager != null) {
            powerManager.newWakeLock(i, "ScreenStateHelper").acquire(1500L);
        }
    }

    public final int f() {
        PowerManager powerManager = this.c;
        int i = 4;
        if (powerManager != null) {
            i = 4;
            if (powerManager.isScreenOn()) {
                if (this.b.isKeyguardLocked()) {
                    a aVar = d.f1553a;
                    if (this.b.isKeyguardSecure()) {
                        return 3;
                    }
                    i = 2;
                } else {
                    i = 1;
                }
            }
        }
        return i;
    }
}
