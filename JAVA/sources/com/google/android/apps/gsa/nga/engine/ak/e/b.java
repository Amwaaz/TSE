package com.google.android.apps.gsa.nga.engine.ak.e;

import com.google.common.base.ci;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/e/b.class */
public final class b {

    /* renamed from: a */
    private final ci f426a;
    private final long b;
    private List c = new ArrayList();

    public b(ci ciVar, Duration duration) {
        this.f426a = ciVar;
        this.b = duration.toNanos();
    }

    public final void a(Object obj) {
        synchronized (this) {
            this.c.add(new a(obj, this.f426a.a()));
        }
    }

    public final void b() {
        synchronized (this) {
            for (a aVar : this.c) {
                aVar.c = aVar.b + this.b;
            }
        }
    }
}
