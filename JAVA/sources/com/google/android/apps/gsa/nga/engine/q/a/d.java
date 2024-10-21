package com.google.android.apps.gsa.nga.engine.q.a;

import com.google.android.apps.gsa.nga.engine.understanding.c.g;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.u.e.h;
import com.google.android.apps.gsa.nga.shared.u.f.o;
import com.google.common.b.fl;
import com.google.common.b.nb;
import com.google.common.b.ni;
import com.google.common.base.ci;
import com.google.common.f.a.a;
import com.google.common.v.f;
import com.google.g.e.i.ce;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToLongFunction;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/q/a/d.class */
public final class d implements com.google.android.apps.gsa.nga.engine.q.c {

    /* renamed from: a, reason: collision with root package name */
    static final Duration f639a = Duration.ofSeconds(2);
    private static final nb b = nb.d(Comparator._EL.reversed(Comparator._CC.comparingLong(new ToLongFunction() { // from class: com.google.android.apps.gsa.nga.engine.q.a.c
        @Override // java.util.function.ToLongFunction
        public final long applyAsLong(Object obj) {
            return ((o) obj).g;
        }
    })));
    private final com.google.common.f.a.d c;
    private final Map d;
    private String e;
    private List f;
    private long g;
    private Optional h;
    private final Object i;
    private final com.google.android.apps.gsa.nga.engine.ak.e.b j;
    private final com.google.android.apps.gsa.nga.engine.ak.e.b k;
    private final f l;

    public d(f fVar) {
        ci ciVar = com.google.common.android.a.c.a;
        this.c = com.google.common.f.a.d.j();
        this.d = new HashMap();
        this.e = "";
        int i = fl.e;
        this.f = ni.a;
        this.g = 1L;
        this.h = Optional.empty();
        this.i = new Object();
        Duration duration = f639a;
        this.j = new com.google.android.apps.gsa.nga.engine.ak.e.b(ciVar, duration);
        this.k = new com.google.android.apps.gsa.nga.engine.ak.e.b(ciVar, duration);
        this.l = fVar;
    }

    private final o j(o oVar) {
        if ((oVar.c & 1) != 0 && !oVar.d.isEmpty()) {
            return oVar;
        }
        ba builder = oVar.toBuilder();
        long j = this.g;
        this.g = 1 + j;
        String str = "HistoryId_" + j;
        builder.copyOnWrite();
        o oVar2 = builder.instance;
        oVar2.c |= 1;
        oVar2.d = str;
        return builder.build();
    }

    private final List k() {
        return fl.C(b, this.d.values());
    }

    private final void l(o oVar) {
        this.d.put(oVar.d, oVar);
        List k = k();
        for (int i = 10; i < k.size(); i++) {
            this.d.remove(((o) k.get(i)).d);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void a(o oVar) {
        synchronized (this.i) {
            if ((oVar.c & 1) == 0 || oVar.d.isEmpty()) {
                a f = this.c.f();
                f.ak(3495);
                f.s("Received a clientQuery without a QueryId: [%s]. This works but it is not expected. Please verify that the usage makes sense.", oVar.e);
            }
            o j = j(oVar);
            l(g.c(j, (o) this.d.get(j.d)));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void b(o oVar) {
        if (oVar.e.isEmpty()) {
            return;
        }
        synchronized (this.i) {
            o j = j(oVar);
            l(g.c((o) this.d.get(j.d), j));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void c() {
        synchronized (this.i) {
            this.h = Optional.empty();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void d() {
        this.j.b();
        this.k.b();
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void e(ce ceVar) {
        this.k.a(ceVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void f(h hVar) {
        this.j.a(hVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.c
    public final void g() {
        synchronized (this.i) {
            this.h = Optional.of(this.l.a());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.e
    public final Optional h() {
        Optional optional;
        synchronized (this.i) {
            optional = this.h;
        }
        return optional;
    }

    @Override // com.google.android.apps.gsa.nga.engine.q.e
    public final List i(ah ahVar) {
        List list;
        synchronized (this.i) {
            if (!ahVar.d.equals(this.e)) {
                this.e = ahVar.d;
                this.f = k();
            }
            list = this.f;
        }
        return list;
    }
}
