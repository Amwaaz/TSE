package com.google.android.apps.gsa.nga.shared.x;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/x/a.class */
public final class a {

    /* renamed from: a */
    private final Context f1018a;

    public a(Context context) {
        this.f1018a = context;
    }

    public final boolean a() {
        boolean z = true;
        if (Settings.Secure.getInt(this.f1018a.getContentResolver(), "assist_structure_enabled") == 1) {
            return true;
        }
        z = false;
        return z;
    }
}
