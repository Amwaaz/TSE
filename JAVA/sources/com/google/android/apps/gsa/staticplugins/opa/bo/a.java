package com.google.android.apps.gsa.staticplugins.opa.bo;

import android.util.Pair;
import c.b.b.a.d;
import com.google.g.z.ai;
import com.google.knowledge.b.s;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/bo/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f1763a;
    public d e;
    public List f;
    public final com.google.android.libraries.g.a g;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private String p;
    private boolean q;
    private boolean r;
    private int j = 0;
    public int b = 0;
    public com.google.g.e.f.d c = com.google.g.e.f.d.a;
    public final AtomicReference d = new AtomicReference(null);
    public long h = 0;
    public ai i = ai.a;

    public a(e.a aVar, com.google.android.libraries.g.a aVar2) {
        this.f1763a = aVar;
        this.g = aVar2;
    }

    public final int a() {
        int i;
        synchronized (this) {
            i = this.j;
        }
        return i;
    }

    public final Pair b() {
        Pair create;
        synchronized (this) {
            create = Pair.create(Integer.valueOf(this.n), Integer.valueOf(this.o));
        }
        return create;
    }

    public final s c() {
        return (s) this.d.get();
    }

    public final String d() {
        String str;
        synchronized (this) {
            str = this.p;
        }
        return str;
    }

    public final void e(int i, int i2) {
        synchronized (this) {
            this.n = i;
            this.o = i2;
        }
    }

    public final void f(boolean z) {
        synchronized (this) {
            this.m = z;
        }
    }

    public final void g(String str) {
        synchronized (this) {
            this.p = str;
        }
    }

    public final void h(int i) {
        synchronized (this) {
            this.j = i;
        }
    }

    public final void i(boolean z) {
        synchronized (this) {
            this.r = z;
        }
    }

    public final void j(boolean z) {
        synchronized (this) {
            this.q = z;
        }
    }

    public final void k(boolean z) {
        synchronized (this) {
            this.k = z;
        }
    }

    public final void l(boolean z) {
        synchronized (this) {
            this.l = z;
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this) {
            z = this.r;
        }
        return z;
    }

    public final boolean n() {
        boolean z;
        synchronized (this) {
            z = this.q;
        }
        return z;
    }

    public final boolean o() {
        boolean z;
        synchronized (this) {
            z = this.k;
        }
        return z;
    }

    public final boolean p() {
        boolean z;
        synchronized (this) {
            z = this.l;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this) {
            z = this.m;
        }
        return z;
    }
}
