package com.google.android.apps.gsa.nga.engine.education.b;

import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.nga.shared.f.a.c;
import com.google.android.apps.gsa.nga.shared.f.a.m;
import com.google.android.apps.gsa.shared.k.bt;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.b.oo;
import com.google.common.util.concurrent.ay;
import com.google.common.v.f;
import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/b/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f562a = com.google.common.f.a.d.j();
    private final a b;
    private final f c;
    private final m d;

    public d(m mVar, a aVar, f fVar) {
        this.d = mVar;
        this.b = aVar;
        this.c = fVar;
    }

    public final int a() {
        long d = this.b.d(eu.jz);
        int i = this.d.b().i;
        if (d > 0) {
            fl f = this.d.f();
            if (!f.isEmpty() && Duration.between((Instant) oo.ay(f), this.c.a()).toMillis() > Duration.ofDays(d).toMillis()) {
                m mVar = this.d;
                z.g(mVar.b.l(mVar.c.a(new c(2), ay.a), "[NGA] EducationPreferences.clearQueryExecutions", new com.google.android.apps.gsa.nga.shared.f.a.a(mVar, 7)), new b(2));
                return 0;
            }
        }
        return i;
    }

    public final boolean b() {
        return ((long) a()) < this.b.d(eu.bc) && ((long) this.d.b().j) < this.b.d(bt.c);
    }
}
