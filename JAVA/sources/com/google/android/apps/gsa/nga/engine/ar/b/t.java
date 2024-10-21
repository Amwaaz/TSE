package com.google.android.apps.gsa.nga.engine.ar.b;

import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.base.ci;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/t.class */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final ci f488a;
    private final a b;
    private long c = 0;

    public t(ci ciVar, a aVar) {
        this.f488a = ciVar;
        this.b = aVar;
    }

    private final long c() {
        return TimeUnit.MILLISECONDS.convert(this.f488a.a(), TimeUnit.NANOSECONDS);
    }

    private final long d() {
        return this.b.d(eu.lj);
    }

    public final void a() {
        synchronized (this) {
            this.c = c() + d();
        }
    }

    public final boolean b() {
        synchronized (this) {
            if (d() != 0) {
                if (c() < this.c) {
                    return false;
                }
            }
            return true;
        }
    }
}
