package com.google.android.apps.gsa.staticplugins.nga.u;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.staticplugins.nga.l.e;
import com.google.common.base.ca;
import com.google.common.base.cl;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/v.class */
public final class v implements e {

    /* renamed from: a, reason: collision with root package name */
    public final p f1723a;
    public final com.google.android.libraries.gsa.h.h b;
    public final ca c;
    public final com.google.android.libraries.gsa.c.a.a.t d;
    private final a e;
    private final Object f = new Object();
    private Boolean g = null;

    public v(com.google.android.libraries.gsa.c.a.a.t tVar, p pVar, com.google.android.libraries.gsa.h.h hVar, a aVar) {
        this.d = tVar;
        this.f1723a = pVar;
        this.b = hVar;
        this.e = aVar;
        this.c = cl.d(new bw(aVar, 1));
    }

    private final void b() {
        synchronized (this.f) {
            if (this.g != null) {
                return;
            }
            this.g = Boolean.valueOf(((SharedPreferences) this.e.a()).getBoolean("nga_setting_first_run", true));
            ((SharedPreferences) this.e.a()).edit().putBoolean("nga_setting_first_run", false).apply();
        }
    }

    final boolean a() {
        synchronized (this.f) {
            Boolean bool = this.g;
            if (bool != null) {
                return bool.booleanValue();
            }
            b();
            synchronized (this.f) {
                Boolean bool2 = this.g;
                if (bool2 == null) {
                    return false;
                }
                return bool2.booleanValue();
            }
        }
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.e
    public final void i() {
        b();
    }
}
