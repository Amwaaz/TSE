package com.google.android.apps.gsa.nga.engine.au.c;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.an.ap;
import com.google.android.apps.gsa.nga.shared.ab.j;
import com.google.android.apps.gsa.nga.shared.al.b.a;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.v.c;
import com.google.common.b.bs;
import com.google.common.b.fd;
import com.google.common.b.fu;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/au/c/o.class */
public final class o implements b, h {
    public static final int b = 0;
    private static final d c = d.j();
    private static final ha d = fd.b(EnumSet.of(j.WARMACTIONS, new j[0]));
    private static final ha e = ha.s(g.CONFIG_FILE, g.HOTWORD_DATA);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.libraries.storage.a.j f504a;
    private final AtomicReference f = new AtomicReference((fu) Collection._EL.stream(e).collect(bs.e(Function._CC.identity(), new java.util.function.Function() { // from class: com.google.android.apps.gsa.nga.engine.au.c.k
        @Override // java.util.function.Function
        public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
            return Function._CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            g gVar = (g) obj;
            Optional empty = Optional.empty();
            if (gVar != null) {
                return m.a(gVar, empty);
            }
            throw new NullPointerException("Null resource");
        }

        @Override // java.util.function.Function
        public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
            return Function._CC.$default$compose(this, function);
        }
    }, new BinaryOperator() { // from class: com.google.android.apps.gsa.nga.engine.au.c.l
        @Override // java.util.function.BiFunction
        public final /* synthetic */ BiFunction andThen(java.util.function.Function function) {
            return BiFunction._CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            n nVar = (n) obj;
            int i = o.b;
            return nVar;
        }
    })));
    private final a g;

    public o(com.google.android.libraries.storage.a.j jVar, a aVar) {
        this.f504a = jVar;
        this.g = aVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final w a() {
        return w.NGA_WARMACTIONS_RESOURCE_INITIALIZATION_FAILURE;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final w b() {
        return w.NGA_WARMACTIONS_RESOURCE_INITIALIZATION_START;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final w c() {
        return w.NGA_WARMACTIONS_RESOURCE_INITIALIZATION_SUCCESS;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final ha d() {
        return d;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final /* synthetic */ cn e() {
        return c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final cn f(fu fuVar) {
        qj j = d.j();
        while (j.hasNext()) {
            Optional d2 = ap.d(fuVar, (j) j.next());
            if (!d2.isEmpty()) {
                DesugarAtomicReference.getAndUpdate(this.f, new i(d2));
            }
        }
        return c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final /* synthetic */ String g() {
        return ap.f(this);
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final /* synthetic */ EnumSet h() {
        return EnumSet.noneOf(j.class);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("MWW MDD resources presence");
        qj j = ((fu) this.f.get()).g().j();
        while (j.hasNext()) {
            n nVar = (n) j.next();
            fVar.a(nVar.f503a.c).a(new com.google.android.apps.gsa.shared.util.b.d(nVar.b, false));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.an.ak
    public final /* synthetic */ boolean i(ha haVar) {
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.au.c.h
    public final Optional j(g gVar, com.google.android.libraries.storage.a.g gVar2) {
        Optional empty;
        n nVar = (n) ((fu) this.f.get()).get(gVar);
        nVar.getClass();
        Optional optional = nVar.b;
        boolean isPresent = optional.isPresent();
        a aVar = this.g;
        String str = gVar.c;
        aVar.b(str, isPresent);
        if (optional.isEmpty()) {
            com.google.common.f.a.a f = c.f();
            f.ak(5064);
            f.s("#MWW Missing uri for resource: %s", str);
            return Optional.empty();
        }
        Object obj = optional.get();
        try {
            empty = Optional.of(this.f504a.c((Uri) obj, gVar2));
        } catch (IOException e2) {
            aus.i(c.f(), "#MWW Failed to open uri: %s", obj, (char) 5065, e2);
            empty = Optional.empty();
        }
        this.g.a(str, empty.isPresent());
        return empty;
    }

    @Override // com.google.android.apps.gsa.nga.engine.au.c.h
    public final boolean k(g gVar) {
        n nVar = (n) ((fu) this.f.get()).get(gVar);
        nVar.getClass();
        return ((Boolean) nVar.b.map(new j(this, 1)).orElse(false)).booleanValue();
    }
}
