package com.google.android.apps.gsa.nga.shared.s;

import com.google.android.apps.gsa.shared.util.c.be;
import com.google.common.f.a.d;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final d f1004a = d.j();
    private final Object b = new Object();
    private final Queue c = new ArrayDeque();

    public final void a() {
        synchronized (this.b) {
            if (this.c.isEmpty()) {
                com.google.common.f.a.a f = f1004a.f();
                f.ak(5422);
                f.p("Disposing empty manager. Did you forgot to subscribe observables?");
            }
            while (!this.c.isEmpty()) {
                j jVar = (j) this.c.remove();
                jVar.a.e(jVar.b);
            }
        }
    }

    public final void b(f fVar, be beVar) {
        synchronized (this.b) {
            fVar.d(beVar);
            this.c.add(new j(fVar, beVar));
        }
    }

    public final void c(f fVar, be beVar) {
        synchronized (this.b) {
            ad.d(fVar, beVar);
            this.c.add(new j(fVar, beVar));
        }
    }
}
