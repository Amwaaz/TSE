package com.google.android.apps.gsa.nga.shared.i.a;

import com.google.android.apps.gsa.nga.shared.u.d.a.j;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/i/a/k.class */
public abstract class k extends Exception {
    public static j d() {
        j jVar = new j();
        jVar.c(l.FLOW_ID_UNKNOWN);
        jVar.d(1);
        jVar.b(j.FAILURE_CAUSE_UNKNOWN);
        return jVar;
    }

    public abstract j a();

    public abstract l b();

    public abstract int c();

    @Override // java.lang.Throwable
    public final String getMessage() {
        l b = b();
        int c = c();
        return String.format("Triggering failed: %s - %s - %s", b, c != 0 ? Integer.toString(c - 1) : "null", a());
    }
}
