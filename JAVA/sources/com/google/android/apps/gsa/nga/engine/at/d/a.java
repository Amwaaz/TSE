package com.google.android.apps.gsa.nga.engine.at.d;

import com.google.common.base.ci;
import com.google.common.v.f;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/at/d/a.class */
public final class a {

    /* renamed from: a */
    private final ci f500a;
    private final f b;

    public a(ci ciVar, f fVar) {
        this.f500a = ciVar;
        this.b = fVar;
    }

    public final long a(long j) {
        return this.b.a().toEpochMilli() - Duration.ofNanos(this.f500a.a() - j).toMillis();
    }
}
