package com.google.android.apps.gsa.nga.engine.v;

import com.google.android.apps.gsa.nga.engine.b.g.a;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.common.v.f;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/e.class */
public final class e {

    /* renamed from: a */
    private final AtomicLong f813a;

    public e(f fVar) {
        this.f813a = new AtomicLong(fVar.a().toEpochMilli());
    }

    public final v a() {
        return new a(this.f813a.getAndIncrement());
    }
}
