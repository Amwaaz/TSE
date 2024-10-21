package com.google.android.apps.gsa.nga.engine.as;

import com.google.android.apps.gsa.nga.shared.ah.a.y;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/as/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    static final Duration f498a = Duration.ofSeconds(1);
    public static final com.google.common.f.a.d b = com.google.common.f.a.d.j();
    private final f c;
    private final h d;
    private cn e = null;
    private final g f;

    public j(g gVar, f fVar, h hVar) {
        this.f = gVar;
        this.c = fVar;
        this.d = hVar;
    }

    public final cn a() {
        synchronized (this) {
            cn cnVar = this.e;
            if (cnVar != null) {
                return cnVar;
            }
            h hVar = this.d;
            y iVar = new i(this.c, 1);
            g gVar = this.f;
            gVar.getClass();
            cn d = z.d(hVar, "[NGA] load UI screenshot", fl.o(new y[]{iVar, new i(gVar, 0)}));
            this.e = d;
            return d;
        }
    }

    public final cn b() {
        cn f;
        synchronized (this) {
            f = this.d.f(ag.e(dl.o(a()), Duration.ofMillis(f498a.toMillis()), this.d), "[NGA] catching timed out screenshot", TimeoutException.class, new h());
        }
        return f;
    }

    public final void c() {
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            this.e = null;
        }
    }
}
