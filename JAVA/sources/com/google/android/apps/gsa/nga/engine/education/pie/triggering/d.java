package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.nga.engine.education.pie.b.f;
import com.google.android.apps.gsa.nga.shared.f.a.m;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.v.c;
import com.google.common.b.ha;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.util.concurrent.cn;
import j$.time.Duration;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/d.class */
public final class d implements com.google.android.apps.gsa.nga.engine.education.pie.d.b, i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f599a = com.google.common.f.a.d.j();
    private static final Duration i = Duration.ofMinutes(30);
    public final com.google.android.apps.gsa.nga.engine.education.pie.d b;
    public final a c;
    public final com.google.android.libraries.g.a d;
    public final t f;
    public final m g;
    public final f h;
    private final com.google.android.libraries.gsa.h.h j;
    private final AtomicReference k = new AtomicReference(c.b);
    public final ca e = cl.d(new ca() { // from class: com.google.android.apps.gsa.nga.engine.education.pie.triggering.b
        public final Object a() {
            return new Random();
        }
    });

    public d(com.google.android.libraries.gsa.h.h hVar, t tVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, m mVar, a aVar, com.google.android.libraries.g.a aVar2, f fVar) {
        this.j = hVar;
        this.f = tVar;
        this.b = dVar;
        this.g = mVar;
        this.c = aVar;
        this.d = aVar2;
        this.h = fVar;
    }

    private final void e(cn cnVar) {
        ((cn) this.k.getAndSet(cnVar)).cancel(false);
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        c();
        return c.b;
    }

    public final void c() {
        if (d()) {
            e(this.j.e("[NGA] AggressiveTrigger.trySchedule", Duration.ofMillis(i.toMillis()), new a(this)));
        } else {
            e(c.b);
        }
    }

    public final boolean d() {
        return this.c.i(eu.fN);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        if (haVar.contains(Integer.valueOf(eu.fN.f1434a))) {
            c();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        e(c.b);
    }
}
