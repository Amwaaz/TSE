package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/w.class */
public class w implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1539a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.c.a.w");
    public final long b;
    public final com.google.android.libraries.g.a c;
    private final boolean h;
    private final long i;
    private final q j;
    private final q k;
    public final Object e = new Object();
    public volatile v d = null;
    public int f = 0;
    boolean g = false;

    public w(com.google.android.libraries.g.a aVar, q qVar, q qVar2, int i, int i2, boolean z) {
        this.i = i;
        this.b = i2;
        this.h = z;
        this.c = aVar;
        this.k = qVar;
        this.j = qVar2;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.m
    public final void a(ca caVar, Runnable runnable) {
        boolean z;
        if (this.h) {
            synchronized (this.e) {
                z = true;
                this.f++;
                if (this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                c();
            }
        }
        this.j.a(caVar, new t(this, caVar, runnable, 0));
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.q
    public final void b(ca caVar, Runnable runnable, long j) {
        boolean z;
        if (this.h) {
            synchronized (this.e) {
                z = true;
                this.f++;
                if (this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                c();
            }
        }
        this.j.b(caVar, new t(this, caVar, runnable, 0), j);
    }

    public final void c() {
        ab abVar = e.a;
        this.k.b(new ca() { // from class: com.google.android.apps.gsa.shared.util.c.a.u
            public final Object a() {
                return "Watchdog";
            }
        }, new y(this, 1), this.i);
    }

    public final void d() {
        this.d = null;
        synchronized (this.e) {
            this.f--;
        }
    }
}
