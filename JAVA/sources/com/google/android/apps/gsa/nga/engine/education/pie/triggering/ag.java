package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.v.c;
import com.google.common.util.concurrent.cn;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/ag.class */
public final class ag implements com.google.android.apps.gsa.nga.engine.education.pie.d.b {
    private static final Duration b = Duration.ofSeconds(10);

    /* renamed from: a, reason: collision with root package name */
    public final y f595a;
    private final com.google.android.libraries.gsa.h.h c;
    private final a d;

    public ag(y yVar, com.google.android.libraries.gsa.h.h hVar, a aVar) {
        this.f595a = yVar;
        this.c = hVar;
        this.d = aVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        if (this.d.i(eu.gh)) {
            this.c.p("[NGA] SimpleAppOpenTrigger", Duration.ofMillis(b.toMillis()), new af(this));
        }
        return c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
    }
}
