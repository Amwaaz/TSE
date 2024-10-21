package com.google.android.apps.gsa.nga.shared.q.a;

import com.google.android.apps.gsa.nga.shared.e.a;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.common.b.bs;
import com.google.common.b.fl;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/aa.class */
public final class aa implements com.google.android.apps.gsa.nga.shared.q.i {

    /* renamed from: a, reason: collision with root package name */
    public static final Duration f974a = Duration.ofSeconds(90);
    private static final Duration b = Duration.ofMinutes(15);
    private final com.google.common.v.f c;
    private Instant d = Instant.MIN;
    private final a e = new a(1000);

    public aa(com.google.common.v.f fVar) {
        this.c = fVar;
    }

    public static boolean c(Instant instant, bl blVar, Duration duration) {
        return Duration.between(Instant.ofEpochMilli(blVar.d), instant).compareTo(duration) > 0;
    }

    private final void d(Instant instant) {
        synchronized (this) {
            Iterator it = this.e.iterator();
            while (it.hasNext() && c(instant, (bl) it.next(), b)) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.i
    public final fl a(boolean z) {
        fl flVar;
        synchronized (this) {
            Instant a2 = this.c.a();
            d(a2);
            Stream filter = Collection._EL.stream(this.e).filter(new z(z, a2));
            int i = fl.e;
            flVar = (fl) filter.collect(bs.a);
        }
        return flVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.i
    public final void b(bl blVar) {
        synchronized (this) {
            Instant a2 = this.c.a();
            if (this.d.isBefore(a2)) {
                d(a2);
                this.d = a2.plus(f974a);
            }
            this.e.add(blVar);
        }
    }
}
