package com.google.android.apps.gsa.nga.shared.i.a.b;

import com.google.android.apps.gsa.nga.shared.i.a.e;
import com.google.android.apps.gsa.nga.shared.i.a.i;
import com.google.android.apps.gsa.nga.shared.i.a.j;
import com.google.android.apps.gsa.nga.shared.i.a.k;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.nga.shared.u.d.a.w;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.DesugarArrays;
import java.util.HashMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/i/a/b/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f883a = com.google.common.f.a.d.j();
    public final i b;
    private final a c;

    public d(i iVar, a aVar) {
        this.b = iVar;
        this.c = aVar;
    }

    public final void a(l lVar, int i, boolean z, e eVar) {
        if (eVar.d() != w.PIE_ELIGIBLE) {
            j d = k.d();
            d.c(lVar);
            d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_PIE_NOT_ELIGIBLE);
            d.d(i);
            throw d.a();
        }
        if (i == 0) {
            throw null;
        }
        if (i == 12) {
            HashMap hashMap = new HashMap();
            DesugarArrays.stream(l.values()).forEach(new b(this, z, hashMap, 0));
            if (ChronoUnit.SECONDS.between((Instant) Collection._EL.stream(hashMap.values()).max(new a()).orElse(Instant.EPOCH), Instant.now()) < this.c.d(eu.kG)) {
                j d2 = k.d();
                d2.c(lVar);
                d2.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_RATE_LIMITED_GLOBALLY);
                d2.d(12);
                throw d2.a();
            }
        } else {
            a aVar = this.c;
            Instant now = Instant.now();
            if (this.b.h().plus(Duration.ofHours(aVar.d(eu.kz))).isAfter(now)) {
                j d3 = k.d();
                d3.c(lVar);
                d3.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_INIT_DELAY);
                d3.d(i);
                throw d3.a();
            }
            HashMap hashMap2 = new HashMap();
            DesugarArrays.stream(l.values()).forEach(new b(this, z, hashMap2, 1));
            Instant instant = (Instant) Collection._EL.stream(this.b.i(lVar)).max(new a()).orElse(Instant.EPOCH);
            Instant instant2 = (Instant) hashMap2.get(lVar);
            instant2.getClass();
            Instant instant3 = (Instant) Collection._EL.stream(hashMap2.values()).max(new a()).orElse(Instant.EPOCH);
            long between = ChronoUnit.SECONDS.between(instant2, now);
            long between2 = ChronoUnit.SECONDS.between(instant3, now);
            long between3 = ChronoUnit.SECONDS.between(instant, now);
            long d4 = this.c.d(eu.kF);
            long d5 = this.c.d(eu.kH);
            if (between3 < this.c.d(eu.kE)) {
                j d6 = k.d();
                d6.c(lVar);
                d6.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW_SUCCESS);
                d6.d(i);
                throw d6.a();
            }
            if (between < d5) {
                j d7 = k.d();
                d7.c(lVar);
                d7.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_RATE_LIMITED_PER_FLOW);
                d7.d(i);
                throw d7.a();
            }
            if (between2 < d4) {
                j d8 = k.d();
                d8.c(lVar);
                d8.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_RATE_LIMITED_GLOBALLY);
                d8.d(i);
                throw d8.a();
            }
            if (this.b.a(lVar, z).size() >= this.c.d(eu.kD)) {
                j d9 = k.d();
                d9.c(lVar);
                d9.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_MAXIMUM_PER_FLOW);
                d9.d(i);
                throw d9.a();
            }
        }
        dl.y(this.b.g(Instant.now(), lVar, z), new c(), ay.a);
    }
}
