package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.ni;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/i.class */
public final /* synthetic */ class i implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final k f754a;
    public final Object b;
    private final int c;

    public /* synthetic */ i(k kVar, Object obj, int i) {
        this.c = i;
        this.f754a = kVar;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        fl flVar;
        if (this.c != 0) {
            return Boolean.valueOf(this.f754a.b.i((com.google.android.apps.gsa.shared.k.d) this.b));
        }
        String h = this.f754a.b.h((com.google.android.apps.gsa.shared.k.h) this.b);
        com.google.common.f.j jVar = l.f757a;
        if (h == null) {
            int i = fl.e;
            flVar = ni.a;
        } else {
            Stream map = Collection._EL.stream(l.b.j(h)).map(new e(0)).filter(new Predicate() { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.f
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
                    return ((Optional) obj).isPresent();
                }
            }).map(new e(2));
            int i2 = fl.e;
            flVar = (fl) map.collect(bs.a);
        }
        return flVar;
    }
}
