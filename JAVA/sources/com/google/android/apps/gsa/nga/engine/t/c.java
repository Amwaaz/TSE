package com.google.android.apps.gsa.nga.engine.t;

import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/t/c.class */
public abstract class c extends i {
    public static final com.google.common.f.a.d D = com.google.common.f.a.d.j();
    public final Object E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f679a;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(n nVar) {
        super(nVar, nr.a);
        this.E = new Object();
        this.F = false;
        this.f679a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(n nVar, ha haVar) {
        super(nVar, haVar);
        this.E = new Object();
        this.F = false;
        this.f679a = new AtomicBoolean(false);
    }

    private final int a() {
        synchronized (this.E) {
            int i = 1;
            if (!gV()) {
                if (true == this.F) {
                    i = 3;
                }
                return i;
            }
            if (!this.F) {
                return 2;
            }
            if (!this.f679a.get() && !gW()) {
                return 1;
            }
            return 4;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i, com.google.android.apps.gsa.nga.engine.g.a
    public final void O() {
        V();
    }

    public final cn P() {
        return com.google.common.util.concurrent.c.h(cf.i(h()), Throwable.class, new a(this, 2), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i
    protected final cn Q() {
        AtomicBoolean atomicBoolean = this.f679a;
        int a2 = a();
        atomicBoolean.set(false);
        int i = a2 - 1;
        synchronized (this.E) {
            if (i == 0) {
                return com.google.android.apps.gsa.v.c.b;
            }
            if (i != 2) {
                return com.google.common.util.concurrent.i.g(cf.i(a2 == 2 ? P() : com.google.common.util.concurrent.i.h(cf.i(i()), new a(this, 0), ay.a)), new b(this, 0), ay.a);
            }
            this.F = false;
            return i();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i
    protected final boolean R() {
        return a() != 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        this.f679a.set(true);
        V();
    }

    protected boolean gW() {
        return false;
    }

    protected abstract cn h();

    protected abstract cn i();
}
