package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/aa.class */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1509a;
    public final Object b;
    public final Object c;

    public aa(com.google.android.apps.gsa.shared.util.debug.d dVar, com.google.android.libraries.g.a aVar, aw awVar) {
        this.f1509a = dVar;
        this.b = aVar;
        this.c = awVar;
    }

    public aa(k.a.a aVar, k.a.a aVar2, k.a.a aVar3) {
        aVar.getClass();
        this.f1509a = aVar;
        aVar2.getClass();
        this.c = aVar2;
        aVar3.getClass();
        this.b = aVar3;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.libraries.g.a, java.lang.Object] */
    public final au a(String str, int i) {
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i(str, i));
        cr d = dl.d(scheduledThreadPoolExecutor);
        ap apVar = new ap(str, new aq(scheduledThreadPoolExecutor), true, this.b);
        ((com.google.android.apps.gsa.shared.util.debug.d) this.f1509a).a(apVar);
        return new au(((aw) this.c).b(new z(d, apVar)), scheduledThreadPoolExecutor, 1);
    }
}
