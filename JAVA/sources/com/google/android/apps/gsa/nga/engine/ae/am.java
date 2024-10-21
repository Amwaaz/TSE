package com.google.android.apps.gsa.nga.engine.ae;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.common.base.ca;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/am.class */
final class am implements ca {

    /* renamed from: a */
    final Context f407a;

    public am(Context context) {
        this.f407a = context;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return (KeyguardManager) this.f407a.getSystemService("keyguard");
    }
}
