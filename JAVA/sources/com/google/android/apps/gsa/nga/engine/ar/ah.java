package com.google.android.apps.gsa.nga.engine.ar;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/ah.class */
public enum ah {
    FULL_LISTENING,
    HALF_LISTENING,
    IDLE,
    EXECUTING;

    public final boolean a() {
        return equals(FULL_LISTENING) || equals(HALF_LISTENING);
    }
}
