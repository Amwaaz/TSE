package com.google.android.apps.gsa.nga.shared.q.a;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.apps.gsa.nga.shared.q.ad;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.as;
import com.google.common.b.ha;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.o.ki;
import com.google.common.o.kk;
import com.google.protobuf.bc;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/x.class */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final d f982a = d.j();
    private final a b;
    private final ca c;
    private final ca d;
    private final ca e;
    private final a f;
    private final a g;
    private ha h;

    public x(a aVar, final Context context, final com.google.android.apps.gsa.shared.o.a.a aVar2, a aVar3, a aVar4) {
        this.b = aVar;
        final int i = 1;
        this.c = cl.d(new ca(context, i) { // from class: com.google.android.apps.gsa.nga.shared.q.a.w

            /* renamed from: a, reason: collision with root package name */
            public final Object f981a;
            private final int b;

            {
                this.b = i;
                this.f981a = context;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
            public final Object a() {
                int i2 = this.b;
                if (i2 == 0) {
                    return this.f981a.a();
                }
                if (i2 == 1) {
                    return as.b((Context) this.f981a);
                }
                ActivityManager activityManager = (ActivityManager) ((Context) this.f981a).getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                Object obj = "undefined";
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    long j = memoryInfo.totalMem;
                    if (j <= 1073741824) {
                        obj = "1";
                    } else if (j <= 2147483648L) {
                        obj = "2";
                    } else if (j <= 3221225472L) {
                        obj = "3";
                    } else if (j <= 4294967296L) {
                        obj = "4";
                    } else if (j <= 6442450944L) {
                        obj = "6";
                    } else if (j <= 8589934592L) {
                        obj = "8";
                    } else if (j <= 17179869184L) {
                        obj = "16";
                    }
                }
                return obj;
            }
        });
        aVar2.getClass();
        final int i2 = 0;
        this.d = cl.d(new ca(aVar2, i2) { // from class: com.google.android.apps.gsa.nga.shared.q.a.w

            /* renamed from: a, reason: collision with root package name */
            public final Object f981a;
            private final int b;

            {
                this.b = i2;
                this.f981a = aVar2;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
            public final Object a() {
                int i22 = this.b;
                if (i22 == 0) {
                    return this.f981a.a();
                }
                if (i22 == 1) {
                    return as.b((Context) this.f981a);
                }
                ActivityManager activityManager = (ActivityManager) ((Context) this.f981a).getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                Object obj = "undefined";
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    long j = memoryInfo.totalMem;
                    if (j <= 1073741824) {
                        obj = "1";
                    } else if (j <= 2147483648L) {
                        obj = "2";
                    } else if (j <= 3221225472L) {
                        obj = "3";
                    } else if (j <= 4294967296L) {
                        obj = "4";
                    } else if (j <= 6442450944L) {
                        obj = "6";
                    } else if (j <= 8589934592L) {
                        obj = "8";
                    } else if (j <= 17179869184L) {
                        obj = "16";
                    }
                }
                return obj;
            }
        });
        final int i3 = 2;
        this.e = cl.d(new ca(context, i3) { // from class: com.google.android.apps.gsa.nga.shared.q.a.w

            /* renamed from: a, reason: collision with root package name */
            public final Object f981a;
            private final int b;

            {
                this.b = i3;
                this.f981a = context;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.apps.gsa.shared.o.a.a, java.lang.Object] */
            public final Object a() {
                int i22 = this.b;
                if (i22 == 0) {
                    return this.f981a.a();
                }
                if (i22 == 1) {
                    return as.b((Context) this.f981a);
                }
                ActivityManager activityManager = (ActivityManager) ((Context) this.f981a).getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                Object obj = "undefined";
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    long j = memoryInfo.totalMem;
                    if (j <= 1073741824) {
                        obj = "1";
                    } else if (j <= 2147483648L) {
                        obj = "2";
                    } else if (j <= 3221225472L) {
                        obj = "3";
                    } else if (j <= 4294967296L) {
                        obj = "4";
                    } else if (j <= 6442450944L) {
                        obj = "6";
                    } else if (j <= 8589934592L) {
                        obj = "8";
                    } else if (j <= 17179869184L) {
                        obj = "16";
                    }
                }
                return obj;
            }
        });
        this.g = aVar4;
        this.f = aVar3;
    }

    public final String a() {
        return (String) this.e.a();
    }

    public final void b(com.google.android.apps.gsa.nga.shared.q.c.ae aeVar) {
        ki kiVar = ki.a;
        if (((com.google.android.apps.gsa.shared.util.q.a) this.f.a()).i(eu.ji)) {
            com.google.common.f.a.a d = f982a.d();
            d.ak(5247);
            d.p("Monitor event not recorded for internal testing traffic.");
            return;
        }
        aeVar.b((String) this.c.a(), (String) this.d.a(), (ad) this.b.a());
        if (((com.google.android.apps.gsa.shared.util.q.a) this.f.a()).i(eu.jH)) {
            boolean i = ((com.google.android.apps.gsa.shared.util.q.a) this.f.a()).i(eu.jN);
            if (this.h == null) {
                this.h = ha.o(b.d(((com.google.android.apps.gsa.shared.util.q.a) this.f.a()).h(eu.jI)));
            }
            ha haVar = this.h;
            if (i || haVar.contains(aeVar.c())) {
                v vVar = (v) this.g.a();
                bc builder = kiVar.toBuilder();
                kk a2 = aeVar.a();
                builder.copyOnWrite();
                ki kiVar2 = builder.instance;
                a2.getClass();
                kiVar2.c = a2;
                kiVar2.b |= 1;
                vVar.b.n("[NGA] Monitoring event collect", new t(vVar, builder.build(), 0));
            }
        }
    }
}
