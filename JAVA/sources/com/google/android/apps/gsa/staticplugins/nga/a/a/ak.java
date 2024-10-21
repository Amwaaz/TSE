package com.google.android.apps.gsa.staticplugins.nga.a.a;

import com.google.android.apps.gsa.search.core.ac.af;
import com.google.android.apps.gsa.staticplugins.nga.k.n;
import com.google.common.f.a.e;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/ak.class */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1648a = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.nga.a.a.ak");
    public final Executor b;
    public final Optional c;
    public final Optional d;
    private final com.google.android.apps.gsa.search.core.ac.ae e;
    private final n f;

    public ak(com.google.android.apps.gsa.search.core.ac.ae aeVar, Executor executor, n nVar, Optional optional, Optional optional2) {
        this.e = aeVar;
        this.b = executor;
        this.f = nVar;
        this.c = optional;
        this.d = optional2;
    }

    public final void a(boolean z) {
        com.google.common.f.ab abVar = e.a;
        com.google.android.apps.gsa.nga.api.ar arVar = z ? com.google.android.apps.gsa.nga.api.ar.ALLOWED : com.google.android.apps.gsa.nga.api.ar.DENIED;
        if (this.e.c("GsaPrefs.nga_location_access", com.google.android.apps.gsa.nga.api.ar.UNKNOWN.d) != arVar.d) {
            af b = this.e.b();
            b.d("GsaPrefs.nga_location_access", arVar.d);
            b.b();
            this.f.f1687a.b(new com.google.android.apps.gsa.staticplugins.nga.k.g(0));
        }
    }
}
