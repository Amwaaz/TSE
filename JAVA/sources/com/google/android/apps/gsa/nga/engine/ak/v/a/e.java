package com.google.android.apps.gsa.nga.engine.ak.v.a;

import android.util.ArraySet;
import com.google.android.apps.gsa.nga.engine.ak.v.a;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.libraries.gsa.h.h;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/v/a/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Set f447a = new ArraySet();
    public final h b;

    public e(aw awVar) {
        this.b = awVar.a(d.class);
    }

    public final void a(a aVar) {
        this.b.n("[NGA] add search process status listener", new c(this, aVar, 0));
    }

    public final void b(a aVar) {
        this.b.n("[NGA] remove search process status listener", new c(this, aVar, 1));
    }
}
