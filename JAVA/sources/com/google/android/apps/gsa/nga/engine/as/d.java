package com.google.android.apps.gsa.nga.engine.as;

import com.google.android.apps.gsa.nga.shared.e.a;
import com.google.common.b.bs;
import com.google.common.b.fl;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/as/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Duration f494a = Duration.ofSeconds(90);
    private final a b = new a(3);
    private final com.google.android.apps.gsa.shared.util.q.a c;
    private final com.google.common.v.f d;

    public d(com.google.android.apps.gsa.shared.util.q.a aVar, com.google.common.v.f fVar) {
        this.c = aVar;
        this.d = fVar;
    }

    public final fl a() {
        fl flVar;
        synchronized (this) {
            Stream map = Collection._EL.stream(this.b).filter(new a(this.d.a())).map(new b());
            int i = fl.e;
            flVar = (fl) map.collect(bs.a);
            this.b.clear();
        }
        return flVar;
    }
}
