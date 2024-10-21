package com.google.android.apps.gsa.nga.engine.b.f.a;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.shared.s.b;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.d;
import com.google.common.v.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/b/f/a/r.class */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final d f508a = d.j();
    public final h b;
    public final x c;
    public final f d;

    public r(h hVar, x xVar, f fVar) {
        this.b = hVar;
        this.c = xVar;
        this.d = fVar;
        e eVar = xVar.b;
        int i = o.f507a;
        new b(((i) eVar).c, eVar);
    }

    public final void a(v vVar) {
        synchronized (this) {
            this.b.n("[NGA] onCancelled", new m(this, vVar, 0));
        }
    }
}
