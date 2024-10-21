package com.google.android.apps.gsa.nga.engine.o;

import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.bm;
import com.google.android.apps.gsa.nga.shared.q.c.bn;
import com.google.common.f.a.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/o/q.class */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final d f636a = d.j();
    public final e.a b;
    private final x c;

    public q(x xVar, e.a aVar) {
        this.c = xVar;
        this.b = aVar;
    }

    public final void a(String str) {
        this.c.b(new bm(str));
    }

    public final void b(int i) {
        this.c.b(new bn("NGA_GELLER_FOOTPRINTS_WRITE_COUNT", i));
    }
}
