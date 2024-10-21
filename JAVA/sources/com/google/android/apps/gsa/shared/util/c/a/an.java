package com.google.android.apps.gsa.shared.util.c.a;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.shared.util.c.av;
import com.google.android.apps.gsa.shared.util.c.ax;
import com.google.android.apps.gsa.shared.util.c.ay;
import com.google.android.apps.gsa.shared.util.c.bo;
import com.google.common.base.ca;
import com.google.common.base.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/an.class */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1514a;
    private final Object b;

    public an(MessageQueue messageQueue, cr crVar) {
        this.f1514a = new ao(new Handler(Looper.getMainLooper()), messageQueue);
        this.b = new aj(new s(crVar), 0);
    }

    public an(ao aoVar, com.google.common.base.ah ahVar) {
        this.f1514a = aoVar;
        this.b = ahVar;
    }

    public an(com.google.android.libraries.g.a aVar, e.a aVar2) {
        this.f1514a = aVar;
        this.b = aVar2;
    }

    private static ca l(Object obj) {
        return obj instanceof com.google.android.apps.gsa.shared.util.c.k ? ((com.google.android.apps.gsa.shared.util.c.k) obj).gl() : new cf(obj.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final cn a(com.google.android.apps.gsa.shared.util.c.aw awVar, long j) {
        q qVar = (q) this.b.apply(awVar);
        ca l = l(awVar);
        ai aiVar = new ai(awVar);
        qVar.b(l, aiVar, j);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return aiVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final cn b(ay ayVar, long j) {
        q qVar = (q) this.b.apply(ayVar);
        ca l = l(ayVar);
        ai aiVar = new ai(ayVar, null);
        qVar.b(l, aiVar, j);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return aiVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final cn c(com.google.android.apps.gsa.shared.util.c.aw awVar) {
        q qVar = (q) this.b.apply(awVar);
        ca l = l(awVar);
        ai aiVar = new ai(awVar);
        qVar.a(l, aiVar);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return aiVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final cn d(ay ayVar) {
        q qVar = (q) this.b.apply(ayVar);
        ca l = l(ayVar);
        ai aiVar = new ai(ayVar, null);
        qVar.a(l, aiVar);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return aiVar;
    }

    public final cn e(bo boVar, long j) {
        Runnable amVar = new am(this, boVar);
        ((ao) this.f1514a).f1515a.postDelayed(amVar, j);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return amVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final cn f(cn cnVar, av avVar) {
        cn h = com.google.common.util.concurrent.i.h(cnVar, avVar, new n((q) this.b.apply(avVar), l(avVar), 4));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return h;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final cn g(cn cnVar, ax axVar) {
        cn g = com.google.common.util.concurrent.i.g(cnVar, axVar, new n((q) this.b.apply(axVar), l(axVar), 4));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return g;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final void h(cn cnVar, com.google.android.apps.gsa.shared.util.c.al alVar) {
        dl.y(cnVar, alVar, new n((q) this.b.apply(alVar), l(alVar), 4));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.common.base.ah] */
    public final void i(cn cnVar, ay ayVar) {
        cnVar.b(ayVar, new n((q) this.b.apply(ayVar), l(ayVar), 4));
    }

    public final void j(cn cnVar, com.google.android.apps.gsa.shared.util.c.as asVar) {
        dl.y(cnVar, asVar, new al((ao) this.f1514a, asVar));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.libraries.g.a, java.lang.Object] */
    public final cq k(String str) {
        f.e(!TextUtils.isEmpty(str));
        ?? r0 = this.f1514a;
        r0.getClass();
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, TimeUnit.MINUTES.toSeconds(5L), TimeUnit.SECONDS, new LinkedBlockingQueue(), new i(str, 0));
        c cVar = new c(threadPoolExecutor, new ap(str, new aq(threadPoolExecutor), false, r0));
        ?? r02 = this.b;
        if (r02 != 0) {
            ((com.google.android.apps.gsa.shared.util.debug.d) r02.a()).a(cVar);
        }
        return cVar;
    }
}
