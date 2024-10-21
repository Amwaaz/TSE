package com.google.android.apps.gsa.nga.engine.ae;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/ab.class */
public final class ab {

    /* renamed from: a */
    public final PowerManager f402a;
    public final KeyguardManager b;

    public ab(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        powerManager.getClass();
        this.f402a = powerManager;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        keyguardManager.getClass();
        this.b = keyguardManager;
    }
}
