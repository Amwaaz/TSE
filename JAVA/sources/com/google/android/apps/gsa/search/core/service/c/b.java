package com.google.android.apps.gsa.search.core.service.c;

import android.os.StrictMode;
import com.google.android.apps.gsa.search.core.service.a.a;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.g;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.gsa.h.i;
import com.google.common.b.fl;
import com.google.common.b.qk;
import com.google.common.f.a.e;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import j$.time.Duration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/c/b.class */
public class b implements com.google.android.apps.gsa.shared.util.debug.a.b {
    private static final j b = j.i("com.google.android.apps.gsa.search.core.service.c.b");
    private static final Duration c = Duration.ofSeconds(3);

    /* renamed from: a, reason: collision with root package name */
    public final Set f1160a = Collections.newSetFromMap(new WeakHashMap());
    private final h d;

    public b(h hVar) {
        this.d = hVar;
    }

    public final void a(f fVar) {
        fl m;
        d.a();
        StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        synchronized (this.f1160a) {
            m = fl.m(this.f1160a);
        }
        qk D = m.D(0);
        while (D.hasNext()) {
            fVar.m((g) D.next());
        }
    }

    public final void b(g gVar) {
        synchronized (this.f1160a) {
            this.f1160a.add(gVar);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        if (i.d(a.class)) {
            a(fVar);
            return;
        }
        d.a();
        cn h = this.d.h("Dump EventBusDumpables", new a(this, fVar));
        try {
            ag.h(h, c);
        } catch (InterruptedException e) {
            h.cancel(false);
            Thread.currentThread().interrupt();
            com.google.common.f.h e2 = b.e();
            e2.aj(e.a, "EventBusDumpableReg");
            com.google.common.f.h g = e2.g(e);
            g.ak(7342);
            g.p("Dumping EventBusDumpables was interrupted.");
        } catch (CancellationException e3) {
            throw new Error("Dumping EventBusDumpables was cancelled unexpectedly.");
        } catch (ExecutionException e4) {
            com.google.common.f.h e5 = b.e();
            e5.aj(e.a, "EventBusDumpableReg");
            com.google.common.f.h g2 = e5.g(e4);
            g2.ak(7343);
            g2.p("Dumping EventBusDumpables failed.");
        } catch (TimeoutException e6) {
            h.cancel(false);
            com.google.common.f.h e7 = b.e();
            e7.aj(e.a, "EventBusDumpableReg");
            com.google.common.f.h hVar = e7;
            hVar.ak(7344);
            hVar.p("Dumping EventBusDumpables timed out.");
        }
    }
}
