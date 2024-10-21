package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/z.class */
final class z extends d implements q {
    private final ScheduledExecutorService b;
    private final ap c;

    public z(ScheduledExecutorService scheduledExecutorService, ap apVar) {
        super(scheduledExecutorService, apVar);
        this.b = scheduledExecutorService;
        this.c = apVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.q
    public final void b(ca caVar, Runnable runnable, long j) {
        this.b.schedule(new t(this, this.c.a(caVar, j), runnable, 1), j, TimeUnit.MILLISECONDS);
    }
}
