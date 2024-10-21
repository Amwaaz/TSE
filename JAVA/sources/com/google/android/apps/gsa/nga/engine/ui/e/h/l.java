package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.be;
import com.google.android.apps.gsa.shared.k.bf;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.bt;
import com.google.android.apps.gsa.shared.k.ce;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.base.bu;
import com.google.common.base.u;
import j$.time.Duration;
import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/l.class */
public class l implements com.google.android.apps.gsa.nga.engine.ao.i, com.google.android.apps.gsa.nga.engine.ui.e.c.b {

    /* renamed from: a */
    public static final com.google.common.f.j f757a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.h.l");
    public static final bu b = bu.d(",").g(u.c).a();
    private final com.google.android.apps.gsa.nga.shared.s.f c;
    private final com.google.android.apps.gsa.nga.shared.s.f d;
    private final com.google.android.apps.gsa.nga.shared.s.f e;
    private final com.google.android.apps.gsa.nga.shared.s.f f;
    private final com.google.android.apps.gsa.nga.shared.s.f g;
    private final com.google.android.apps.gsa.nga.shared.s.f h;
    private final com.google.android.apps.gsa.nga.shared.s.f i;
    private final com.google.android.apps.gsa.nga.shared.s.f j;
    private final com.google.android.apps.gsa.nga.shared.s.f k;
    private final com.google.android.apps.gsa.nga.shared.s.f l;
    private final com.google.android.apps.gsa.nga.shared.s.f m;
    private final com.google.android.apps.gsa.nga.shared.s.f n;
    private final com.google.android.apps.gsa.nga.shared.s.f o;
    private final com.google.android.apps.gsa.shared.util.q.a p;
    private final com.google.android.apps.gsa.nga.engine.ao.i q;

    public l(com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.shared.util.q.a aVar) {
        this.p = aVar;
        k kVar = new k(aVar, hVar);
        kVar.a(bt.j);
        this.e = kVar.a(bt.k);
        this.c = com.google.android.apps.gsa.nga.shared.s.ad.j(kVar.a(az.di), kVar.a(az.eD), new BiFunction(1) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.b

            /* renamed from: a, reason: collision with root package name */
            private final int f742a;

            {
                this.f742a = r4;
            }

            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return this.f742a != 0 ? BiFunction._CC.$default$andThen(this, function) : BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f742a != 0 ? androidx.compose.ui.l.f.M((Boolean) obj, (Boolean) obj2) : androidx.compose.ui.l.f.M((Boolean) obj, (Boolean) obj2);
            }
        });
        this.d = kVar.a(be.r);
        this.f = kVar.a(br.bU);
        com.google.android.apps.gsa.shared.k.h hVar2 = br.bn;
        int i = e.f745a;
        this.g = kVar.b(hVar2.f1453a, new i(kVar, hVar2, 0));
        this.h = kVar.a(eu.hT);
        this.i = kVar.a(eu.eQ);
        com.google.android.apps.gsa.nga.shared.s.ad.j(kVar.a(bf.b), kVar.a(eu.dO), new java.util.function.BiFunction(0) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.b

            /* renamed from: a, reason: collision with root package name */
            private final int f742a;

            {
                this.f742a = r4;
            }

            @Override // java.util.function.BiFunction
            public final /* synthetic */ java.util.function.BiFunction andThen(Function function) {
                return this.f742a != 0 ? BiFunction._CC.$default$andThen(this, function) : BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f742a != 0 ? androidx.compose.ui.l.f.M((Boolean) obj, (Boolean) obj2) : androidx.compose.ui.l.f.M((Boolean) obj, (Boolean) obj2);
            }
        });
        this.q = new com.google.android.apps.gsa.nga.engine.ao.i(kVar) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.g

            /* renamed from: a, reason: collision with root package name */
            public final k f752a;

            {
                this.f752a = kVar;
            }

            @Override // com.google.android.apps.gsa.nga.engine.ao.i
            public final void gX(ha haVar) {
                qj j = haVar.j();
                while (j.hasNext()) {
                    k kVar2 = this.f752a;
                    Runnable runnable = (Runnable) kVar2.f756a.get((Integer) j.next());
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        };
        com.google.android.apps.gsa.nga.shared.s.f a2 = kVar.a(br.Q);
        this.k = a2;
        this.l = kVar.a(br.R);
        com.google.android.apps.gsa.nga.shared.s.f a3 = kVar.a(br.z);
        this.m = a3;
        com.google.android.apps.gsa.nga.shared.s.f a4 = kVar.a(br.t);
        this.n = a4;
        this.j = com.google.android.apps.gsa.nga.shared.s.ad.i(a2, a3, a4, new com.google.android.apps.gsa.nga.shared.s.y() { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.c
            @Override // com.google.android.apps.gsa.nga.shared.s.y
            public final Object a(Object obj, Object obj2, Object obj3) {
                return a.a.aX(obj, obj2, obj3);
            }
        });
        com.google.android.apps.gsa.nga.engine.ui.e.c.a[] values = com.google.android.apps.gsa.nga.engine.ui.e.c.a.values();
        com.google.android.apps.gsa.shared.k.f fVar = bt.v;
        this.o = kVar.b(fVar.f1451a, new Supplier(kVar, new d(values), fVar) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.h

            /* renamed from: a, reason: collision with root package name */
            public final k f753a;
            public final LongFunction b;
            public final com.google.android.apps.gsa.shared.k.f c;

            {
                this.f753a = kVar;
                this.b = r5;
                this.c = fVar;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                return l.y(((d) this.b).f743a, this.f753a.b.d(this.c));
            }
        });
    }

    public static /* synthetic */ com.google.android.apps.gsa.nga.engine.ui.e.c.a y(com.google.android.apps.gsa.nga.engine.ui.e.c.a[] aVarArr, long j) {
        return (j < 0 || j >= ((long) aVarArr.length)) ? com.google.android.apps.gsa.nga.engine.ui.e.c.a.DISABLED : aVarArr[(int) j];
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.engine.ui.e.c.a a() {
        return (com.google.android.apps.gsa.nga.engine.ui.e.c.a) ((com.google.android.apps.gsa.nga.shared.s.i) this.o).b.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f b() {
        return this.n;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f c() {
        return this.m;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f d() {
        return this.e;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f e() {
        return this.k;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f f() {
        return this.l;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        this.q.gX(haVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f h() {
        return this.i;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f i() {
        return this.c;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f j() {
        return this.d;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f k() {
        return this.f;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f l() {
        return this.j;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final com.google.android.apps.gsa.nga.shared.s.f m() {
        return this.h;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final fl n() {
        return (fl) ((com.google.android.apps.gsa.nga.shared.s.i) this.g).b.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final Duration o() {
        return Duration.ofMillis(this.p.d(bt.x));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final Duration p() {
        long d = this.p.d(bt.B);
        return d < 0 ? Duration.ZERO : Duration.ofSeconds(d);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final Duration q() {
        long d = this.p.d(be.x);
        return d < 0 ? Duration.ZERO : Duration.ofSeconds(d);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final boolean r() {
        return this.p.i(br.bJ);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final boolean s() {
        return this.p.i(br.Y);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final boolean t() {
        return this.p.i(bt.G);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final boolean u() {
        return this.p.i(br.bC);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final boolean v() {
        return this.p.i(ce.e);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final boolean w() {
        return this.p.i(br.bD);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.b
    public final int x() {
        int dh = a.a.dh((int) this.p.d(br.bo));
        int i = dh;
        if (dh == 0) {
            i = 1;
        }
        return i;
    }
}
