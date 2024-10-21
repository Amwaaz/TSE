package com.google.android.apps.gsa.binaries.b;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.slice.o$;
import com.google.android.apps.gsa.binaries.b.d;
import com.google.android.apps.gsa.binaries.velvet.app.jo;
import com.google.android.apps.gsa.binaries.velvet.app.jy;
import com.google.android.apps.gsa.binaries.velvet.app.oa;
import com.google.android.apps.gsa.shared.o.a.a.b;
import com.google.android.gms.clearcut.o;
import com.google.android.gms.clearcut.r;
import com.google.android.libraries.ao.g;
import com.google.android.libraries.gsa.h.i;
import com.google.android.libraries.performance.primes.metrics.b.q;
import com.google.android.libraries.performance.primes.metrics.crash.v;
import com.google.android.libraries.performance.primes.metrics.i.k;
import com.google.android.libraries.performance.primes.metrics.i.l;
import com.google.android.play.core.e.p;
import com.google.apps.tiktok.i.x;
import com.google.apps.tiktok.tracing.bc;
import com.google.apps.tiktok.tracing.bf;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ft;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.util.concurrent.cn;
import com.google.cs.a.c.a.a.s;
import j$.time.Duration;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/b/d.class */
public abstract class d extends com.google.android.apps.gsa.binaries.a.c implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final Duration f289a = Duration.ofNanos(com.google.android.libraries.g.a.d.a());
    private final ca d = cl.d(new ca(this) { // from class: com.google.android.apps.gsa.binaries.b.a

        /* renamed from: a, reason: collision with root package name */
        public final d f286a;

        {
            this.f286a = this;
        }

        public final Object a() {
            cl.v(d.i(), "Cannot perform injections in non-TikTok processes. Guard your injections behind isTikTokRunningProcess().");
            return ((d.a) x.c(this.f286a, d.a.class)).g();
        }
    });
    private final ca e = cl.d(new b(this));

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/b/d$a.class */
    public interface a {
        e g();
    }

    static {
        l lVar = l.f3499a;
        if (lVar.g == null) {
            lVar.g = q.b();
        }
    }

    public d() {
        if (i()) {
            String str = ((s) com.google.bs.a.a.a.a.b.get()).w;
            cl.u(v.f3456a == null);
            v.f3456a = new v(this, str, Thread.getDefaultUncaughtExceptionHandler());
            Thread.setDefaultUncaughtExceptionHandler(v.f3456a);
            super.b();
            super.b();
            com.google.android.apps.gsa.shared.util.debug.b.d.f1553a = new b();
            super.b();
            b bVar = new b();
            super.b();
            com.google.android.apps.gsa.shared.logger.o.f1472a = new com.google.android.apps.gsa.shared.logger.o(this, bVar, new com.google.android.apps.gsa.shared.o.c.a.a());
            c cVar = new c(this);
            com.google.android.apps.gsa.shared.util.l.a.f1564a = this;
            com.google.android.apps.gsa.shared.util.l.a.b = cVar;
            com.google.android.apps.gsa.velvet.a.a aVar = new com.google.android.apps.gsa.velvet.a.a(this, 1);
            com.google.android.apps.gsa.velvet.a.a aVar2 = new com.google.android.apps.gsa.velvet.a.a(this, 0);
            if (com.google.android.apps.gsa.velvet.a.b.f1837a == null) {
                com.google.android.apps.gsa.velvet.a.b.f1837a = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new com.google.android.apps.gsa.velvet.a.b(this, aVar, aVar2));
                ab abVar = com.google.common.f.a.e.a;
            }
            i.b(androidx.annotation.a.class);
        }
    }

    @Override // com.google.apps.tiktok.i.b.b, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (i()) {
            p.c(this, false);
        }
    }

    @Override // com.google.android.gms.clearcut.o
    public final r c() {
        return null;
    }

    @Override // com.google.android.gms.clearcut.o
    public final cn f() {
        return ((com.google.android.libraries.search.trust.a.a) ((e) this.e.a()).f.a()).f();
    }

    @Override // com.google.android.apps.gsa.binaries.a.c, com.google.apps.tiktok.i.b.b, android.app.Application
    public final void onCreate() {
        if (!i()) {
            super.onCreate();
            return;
        }
        a.b.au(this instanceof oa, "'%s' is not a custom inject application. Check that you have annotated the application with both @HiltAndroidApp and @CustomInject.", new Object[]{getClass()});
        oa oaVar = (oa) this;
        if (!oaVar.f328a) {
            oaVar.f328a = true;
            jy jyVar = ((jo) oaVar.g().jJ()).e.f319a;
            oaVar.b = (dj) jyVar.f326a.bK.a();
            oaVar.c = jyVar.bi;
        }
        e eVar = (e) this.d.a();
        com.google.android.libraries.web.n.c cVar = (com.google.android.libraries.web.n.c) eVar.d.a();
        for (String str : cVar.c) {
            if (!m.p.s.U(str, ':')) {
                throw new IllegalStateException(a.a.dC(str, "@WebViewDisabledProcesses must start with ':', found '", "'"));
            }
        }
        Context context = cVar.f5619a;
        String b = g.b();
        String str2 = b;
        if (b == null) {
            str2 = "";
        }
        Set set = cVar.c;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (m.p.s.l(str2, (String) it.next(), false)) {
                    o$.ExternalSyntheticApiModelOutline1.m();
                    break;
                }
            }
        }
        cVar.b.a();
        ((com.google.android.libraries.performance.primes.o) eVar.f290a.a()).f3519a.c();
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        super.onCreate();
        final l lVar = l.f3499a;
        if (com.google.android.libraries.aw.e.e.d(Thread.currentThread()) && lVar.h == null) {
            lVar.h = q.b();
            final int i = 1;
            com.google.android.libraries.aw.e.e.a().post(new Runnable(lVar, i) { // from class: com.google.android.libraries.performance.primes.metrics.i.e

                /* renamed from: a, reason: collision with root package name */
                public final l f3496a;
                private final int b;

                {
                    this.b = i;
                    this.f3496a = lVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = this.b;
                    boolean z = false;
                    if (i2 == 0) {
                        l lVar2 = this.f3496a;
                        boolean z2 = false;
                        if (lVar2.s.b != null) {
                            z2 = true;
                        }
                        lVar2.c = z2;
                        return;
                    }
                    if (i2 == 1) {
                        l lVar3 = this.f3496a;
                        boolean z3 = false;
                        if (lVar3.s.b != null) {
                            z3 = true;
                        }
                        lVar3.b = z3;
                        return;
                    }
                    if (i2 == 2) {
                        l lVar4 = this.f3496a;
                        boolean z4 = false;
                        if (lVar4.s.b != null) {
                            z4 = true;
                        }
                        lVar4.d = z4;
                        return;
                    }
                    if (i2 == 3) {
                        l lVar5 = this.f3496a;
                        if (lVar5.s.b != null) {
                            z = true;
                        }
                        lVar5.e = z;
                        return;
                    }
                    l lVar6 = this.f3496a;
                    boolean z5 = false;
                    if (lVar6.s.b != null) {
                        z5 = true;
                    }
                    lVar6.f = z5;
                }
            });
            final int i2 = 0;
            com.google.android.libraries.aw.e.e.a().postDelayed(new Runnable(lVar, i2) { // from class: com.google.android.libraries.performance.primes.metrics.i.e

                /* renamed from: a, reason: collision with root package name */
                public final l f3496a;
                private final int b;

                {
                    this.b = i2;
                    this.f3496a = lVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = this.b;
                    boolean z = false;
                    if (i22 == 0) {
                        l lVar2 = this.f3496a;
                        boolean z2 = false;
                        if (lVar2.s.b != null) {
                            z2 = true;
                        }
                        lVar2.c = z2;
                        return;
                    }
                    if (i22 == 1) {
                        l lVar3 = this.f3496a;
                        boolean z3 = false;
                        if (lVar3.s.b != null) {
                            z3 = true;
                        }
                        lVar3.b = z3;
                        return;
                    }
                    if (i22 == 2) {
                        l lVar4 = this.f3496a;
                        boolean z4 = false;
                        if (lVar4.s.b != null) {
                            z4 = true;
                        }
                        lVar4.d = z4;
                        return;
                    }
                    if (i22 == 3) {
                        l lVar5 = this.f3496a;
                        if (lVar5.s.b != null) {
                            z = true;
                        }
                        lVar5.e = z;
                        return;
                    }
                    l lVar6 = this.f3496a;
                    boolean z5 = false;
                    if (lVar6.s.b != null) {
                        z5 = true;
                    }
                    lVar6.f = z5;
                }
            }, 10L);
            final int i3 = 2;
            com.google.android.libraries.aw.e.e.a().postDelayed(new Runnable(lVar, i3) { // from class: com.google.android.libraries.performance.primes.metrics.i.e

                /* renamed from: a, reason: collision with root package name */
                public final l f3496a;
                private final int b;

                {
                    this.b = i3;
                    this.f3496a = lVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = this.b;
                    boolean z = false;
                    if (i22 == 0) {
                        l lVar2 = this.f3496a;
                        boolean z2 = false;
                        if (lVar2.s.b != null) {
                            z2 = true;
                        }
                        lVar2.c = z2;
                        return;
                    }
                    if (i22 == 1) {
                        l lVar3 = this.f3496a;
                        boolean z3 = false;
                        if (lVar3.s.b != null) {
                            z3 = true;
                        }
                        lVar3.b = z3;
                        return;
                    }
                    if (i22 == 2) {
                        l lVar4 = this.f3496a;
                        boolean z4 = false;
                        if (lVar4.s.b != null) {
                            z4 = true;
                        }
                        lVar4.d = z4;
                        return;
                    }
                    if (i22 == 3) {
                        l lVar5 = this.f3496a;
                        if (lVar5.s.b != null) {
                            z = true;
                        }
                        lVar5.e = z;
                        return;
                    }
                    l lVar6 = this.f3496a;
                    boolean z5 = false;
                    if (lVar6.s.b != null) {
                        z5 = true;
                    }
                    lVar6.f = z5;
                }
            }, 100L);
            final int i4 = 3;
            com.google.android.libraries.aw.e.e.a().postDelayed(new Runnable(lVar, i4) { // from class: com.google.android.libraries.performance.primes.metrics.i.e

                /* renamed from: a, reason: collision with root package name */
                public final l f3496a;
                private final int b;

                {
                    this.b = i4;
                    this.f3496a = lVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = this.b;
                    boolean z = false;
                    if (i22 == 0) {
                        l lVar2 = this.f3496a;
                        boolean z2 = false;
                        if (lVar2.s.b != null) {
                            z2 = true;
                        }
                        lVar2.c = z2;
                        return;
                    }
                    if (i22 == 1) {
                        l lVar3 = this.f3496a;
                        boolean z3 = false;
                        if (lVar3.s.b != null) {
                            z3 = true;
                        }
                        lVar3.b = z3;
                        return;
                    }
                    if (i22 == 2) {
                        l lVar4 = this.f3496a;
                        boolean z4 = false;
                        if (lVar4.s.b != null) {
                            z4 = true;
                        }
                        lVar4.d = z4;
                        return;
                    }
                    if (i22 == 3) {
                        l lVar5 = this.f3496a;
                        if (lVar5.s.b != null) {
                            z = true;
                        }
                        lVar5.e = z;
                        return;
                    }
                    l lVar6 = this.f3496a;
                    boolean z5 = false;
                    if (lVar6.s.b != null) {
                        z5 = true;
                    }
                    lVar6.f = z5;
                }
            }, 250L);
            final int i5 = 4;
            com.google.android.libraries.aw.e.e.a().postDelayed(new Runnable(lVar, i5) { // from class: com.google.android.libraries.performance.primes.metrics.i.e

                /* renamed from: a, reason: collision with root package name */
                public final l f3496a;
                private final int b;

                {
                    this.b = i5;
                    this.f3496a = lVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = this.b;
                    boolean z = false;
                    if (i22 == 0) {
                        l lVar2 = this.f3496a;
                        boolean z2 = false;
                        if (lVar2.s.b != null) {
                            z2 = true;
                        }
                        lVar2.c = z2;
                        return;
                    }
                    if (i22 == 1) {
                        l lVar3 = this.f3496a;
                        boolean z3 = false;
                        if (lVar3.s.b != null) {
                            z3 = true;
                        }
                        lVar3.b = z3;
                        return;
                    }
                    if (i22 == 2) {
                        l lVar4 = this.f3496a;
                        boolean z4 = false;
                        if (lVar4.s.b != null) {
                            z4 = true;
                        }
                        lVar4.d = z4;
                        return;
                    }
                    if (i22 == 3) {
                        l lVar5 = this.f3496a;
                        if (lVar5.s.b != null) {
                            z = true;
                        }
                        lVar5.e = z;
                        return;
                    }
                    l lVar6 = this.f3496a;
                    boolean z5 = false;
                    if (lVar6.s.b != null) {
                        z5 = true;
                    }
                    lVar6.f = z5;
                }
            }, 500L);
            if (Build.VERSION.SDK_INT >= 34) {
                com.google.android.libraries.aw.e.e.a().post(new com.google.android.libraries.performance.primes.metrics.i.g(lVar, 1));
            }
            registerActivityLifecycleCallbacks(new k(lVar, this));
        }
        bc d = ft.d("Collecting application create", bf.f5910a, true);
        try {
            ((com.google.android.libraries.search.t.a.a.a.e) eVar.c.a()).f(f289a, this);
            d.close();
            if (com.google.android.libraries.search.z.a.a(this, new com.google.android.libraries.search.z.b[]{com.google.android.libraries.search.z.b.f5428a, com.google.android.libraries.search.z.b.b}) && !((Boolean) eVar.e.a()).booleanValue()) {
                Application.ActivityLifecycleCallbacks x = com.google.android.libraries.notifications.platform.i.a.a(this).x();
                unregisterActivityLifecycleCallbacks(x);
                registerActivityLifecycleCallbacks(x);
            }
            d = ft.d("Initialising GMS Compliance Helper", bf.f5910a, true);
            try {
                com.google.android.libraries.w.a.a.g gVar = (com.google.android.libraries.w.a.a.g) eVar.b.a();
                h d2 = com.google.android.libraries.w.a.a.h.f5610a.d();
                d2.ak(50720);
                d2.p("Initializing GMS Compliance Client Library...");
                registerActivityLifecycleCallbacks(new com.google.android.libraries.w.a.a.d(gVar));
                gVar.a(com.google.android.libraries.w.a.a.e.b, com.google.android.libraries.w.a.a.e.f5607a);
                h d3 = com.google.android.libraries.w.a.a.h.f5610a.d();
                d3.ak(50721);
                d3.p("Completed library init.");
                d.close();
            } finally {
            }
        } finally {
        }
    }
}
