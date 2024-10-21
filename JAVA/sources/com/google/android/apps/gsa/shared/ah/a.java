package com.google.android.apps.gsa.shared.ah;

import android.content.Context;
import android.content.res.Resources;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ah/a.class */
public class a {

    /* renamed from: a */
    private static final j f1369a = j.i("com.google.android.apps.gsa.shared.ah.a");
    private final Context b;

    public a(Context context) {
        this.b = context;
    }

    public final int a() {
        int identifier = Resources.getSystem().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier == 0) {
            return -1;
        }
        try {
            return this.b.getResources().getInteger(identifier);
        } catch (Resources.NotFoundException e) {
            aus.b(f1369a.f(), "Failed to get system integer resource ID for %s.", "config_navBarInteractionMode", (char) 9126, e);
            return -1;
        }
    }
}
