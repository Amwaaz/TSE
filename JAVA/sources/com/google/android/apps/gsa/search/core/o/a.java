package com.google.android.apps.gsa.search.core.o;

import com.google.android.apps.gsa.search.core.preferences.i;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.common.f.a.e;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/o/a.class */
public class a {
    private static final j b = j.i("com.google.android.apps.gsa.search.core.o.a");

    /* renamed from: a, reason: collision with root package name */
    public final long f1135a;

    public a(n nVar) {
        try {
            long j = nVar.getLong("PersistenceBackedCounter", 0L) + 1;
            this.f1135a = j;
            i f = nVar.f();
            f.a("PersistenceBackedCounter", Long.valueOf(j));
            f.b(false);
        } catch (ClassCastException e) {
            Object obj = nVar.getAll().get("PersistenceBackedCounter");
            obj.getClass();
            h f2 = b.f();
            f2.aj(e.a, "PersistenceBackedCounte");
            h g = f2.g(e);
            g.ak(7150);
            g.H("Unexpected type of %s startup preference, expected Long, actual %s", "PersistenceBackedCounter", obj.getClass().getName());
            i f3 = nVar.f();
            f3.h("PersistenceBackedCounter");
            f3.b(false);
            this.f1135a = 0L;
        }
    }
}
