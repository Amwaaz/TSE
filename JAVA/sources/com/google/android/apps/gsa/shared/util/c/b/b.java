package com.google.android.apps.gsa.shared.util.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.apps.gsa.shared.util.c.a.aa;
import com.google.android.apps.gsa.shared.util.c.a.ab;
import com.google.android.apps.gsa.shared.util.c.a.ap;
import com.google.android.apps.gsa.shared.util.c.a.as;
import com.google.android.apps.gsa.shared.util.c.a.au;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.c.a.j;
import com.google.android.apps.gsa.shared.util.c.a.k;
import com.google.android.apps.gsa.shared.util.c.a.m;
import com.google.android.apps.gsa.shared.util.c.a.q;
import com.google.common.base.at;
import e.c.c;
import e.c.d;
import e.c.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/b/b.class */
public final class b implements d {
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
    public static m b(j jVar) {
        a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        k kVar = jVar.c;
        com.google.android.apps.gsa.shared.util.c.a.d dVar = new com.google.android.apps.gsa.shared.util.c.a.d(jVar.f1532a, jVar.b);
        aw awVar = kVar.f;
        return awVar.f1521a.b() ? new ab(dVar, (a) awVar.f1521a) : dVar;
    }

    public static q c(aa aaVar) {
        return aaVar.a("TimerThread", 0);
    }

    public static j d(k kVar) {
        String str = kVar.b;
        com.google.android.libraries.g.a aVar = kVar.f1533a;
        com.google.common.base.a aVar2 = com.google.common.base.a.a;
        a aVar3 = kVar.d;
        ap apVar = new ap(aVar, aVar2);
        synchronized (kVar.e) {
            kVar.e.add(apVar);
        }
        return new j(kVar, new as(kVar.c), apVar);
    }

    public static q e(aw awVar, m mVar) {
        e.a b = c.b(((i) awVar.f1521a).a);
        b.getClass();
        mVar.getClass();
        return new au(b, mVar, 2);
    }

    public static MessageQueue f() {
        MessageQueue queue = Looper.getMainLooper().getQueue();
        queue.getClass();
        return queue;
    }

    public static at g() {
        return com.google.common.base.a.a;
    }

    public static Handler h(Looper looper, at atVar) {
        if (!atVar.h()) {
            return new Handler(looper);
        }
        throw null;
    }

    public static Looper i() {
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        return mainLooper;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k.a.a] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, k.a.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k.a.a] */
    public static k j(aa aaVar, com.google.android.apps.gsa.shared.util.debug.d dVar) {
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) aaVar.f1509a.a();
        aVar.getClass();
        a aVar2 = (a) aaVar.c.a();
        aVar2.getClass();
        aw awVar = (aw) aaVar.b.a();
        awVar.getClass();
        k kVar = new k(aVar, aVar2, awVar);
        dVar.a(kVar);
        return kVar;
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
