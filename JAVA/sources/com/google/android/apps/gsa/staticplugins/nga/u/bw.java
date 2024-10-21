package com.google.android.apps.gsa.staticplugins.nga.u;

import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.bz;
import com.google.common.base.ca;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/bw.class */
public final /* synthetic */ class bw implements ca {

    /* renamed from: a, reason: collision with root package name */
    public final a f1719a;
    private final int b;

    public /* synthetic */ bw(a aVar, int i) {
        this.b = i;
        this.f1719a = aVar;
    }

    public final Object a() {
        if (this.b != 0) {
            return Boolean.valueOf(((SharedPreferences) this.f1719a.a()).getLong("update_consent_timestamp", 0L) > 0);
        }
        return (bz) this.f1719a.a();
    }
}
