package com.google.android.apps.gsa.nga.engine.t;

import android.os.Build;
import androidx.core.d.i$;
import com.google.android.apps.gsa.nga.engine.g.a;
import com.google.android.apps.gsa.nga.engine.t.a.h;
import com.google.android.apps.gsa.nga.engine.t.a.j;
import com.google.android.apps.gsa.nga.engine.t.a.k;
import com.google.android.apps.gsa.nga.engine.t.a.l;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.util.ai;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Collection;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/t/i.class */
public abstract class i implements a {
    private final ha b;
    private final n f;
    private final Object aaW = new Object();
    private cn c = null;
    private boolean d = false;
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(n nVar, ha haVar) {
        this.f = nVar;
        this.b = haVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public /* synthetic */ void O() {
        throw null;
    }

    protected abstract cn Q();

    protected abstract boolean R();

    public final cn T(cn cnVar) {
        synchronized (this.aaW) {
            if (this.d) {
                l();
                return U();
            }
            this.e = false;
            l();
            return cnVar;
        }
    }

    public final cn U() {
        cn h;
        synchronized (this.aaW) {
            this.d = false;
            if (Build.VERSION.SDK_INT >= 29) {
                i$.ExternalSyntheticApiModelOutline0.m(W(), 0);
            }
            h = com.google.common.util.concurrent.i.h(com.google.common.util.concurrent.c.h(cf.i(Q()), Throwable.class, new a(this, 3), ay.a), new a(this, 4), ay.a);
        }
        return h;
    }

    public final cn V() {
        cn b;
        l();
        synchronized (this.aaW) {
            if (this.e || R()) {
                if (this.e) {
                    b = this.c;
                    if (b != null) {
                        this.d = true;
                    }
                }
                this.e = true;
                n nVar = this.f;
                h hVar = new h(this);
                synchronized (nVar.i) {
                    if (nVar.j.isEmpty()) {
                        ((com.google.android.apps.gsa.nga.engine.v.i) nVar.e.a()).b(w.NGA_LIFECYCLE_START);
                        nVar.n = new ai(nVar.f);
                        nVar.l = new SettableFuture();
                        SettableFuture settableFuture = nVar.l;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i$.ExternalSyntheticApiModelOutline0.m("NgaLifecycle", 0);
                            dl.y(settableFuture, new l(), ay.a);
                        }
                        nVar.m = com.google.android.apps.gsa.v.c.b;
                        nVar.p.d(new com.google.android.apps.gsa.nga.engine.t.a.d());
                    }
                    if (nVar.j.containsKey(this)) {
                        l();
                        nVar.k.remove(nVar.j.get(this));
                    }
                    if (!nVar.g && nVar.c.i(eu.eg) && ((fl) nVar.d.a()).contains(this)) {
                        nVar.m = nVar.b.l(com.google.common.util.concurrent.c.g(cf.i(dl.o(nVar.m)), Exception.class, new h(), ay.a), "[NGA] NgaLifecycleManager.component.chain", new com.google.android.apps.gsa.nga.engine.t.a.i(nVar, this, hVar));
                        b = nVar.m;
                    } else {
                        b = nVar.b(this, hVar);
                    }
                    nVar.j.put(this, b);
                    nVar.k.add(b);
                    b.b(new j(nVar, b), new k(nVar));
                }
                this.c = b;
            } else {
                l();
                b = com.google.android.apps.gsa.v.c.b;
            }
        }
        return b;
    }

    public final String W() {
        return String.valueOf(l()).concat("#lifecycle");
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public void gX(final ha haVar) {
        Stream stream = Collection._EL.stream(this.b);
        haVar.getClass();
        if (stream.anyMatch(new Predicate(haVar) { // from class: com.google.android.apps.gsa.nga.engine.t.g

            /* renamed from: a, reason: collision with root package name */
            public final ha f681a;

            {
                this.f681a = haVar;
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate._CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate negate() {
                return Predicate._CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                return Predicate._CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f681a.contains((Integer) obj);
            }
        })) {
            V();
        }
    }
}
