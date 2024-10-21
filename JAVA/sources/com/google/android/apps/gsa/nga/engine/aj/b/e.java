package com.google.android.apps.gsa.nga.engine.aj.b;

import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.ToLongFunction;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/aj/b/e.class */
public final class e {

    /* renamed from: a */
    public static final d f414a = d.j();
    public final fl b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public e(Set set) {
        Stream sorted = Collection._EL.stream(set).sorted(Comparator._CC.comparingLong(new ToLongFunction() { // from class: com.google.android.apps.gsa.nga.engine.aj.b.a
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return 1L;
            }
        }));
        int i = fl.e;
        this.b = (fl) sorted.collect(bs.a);
    }

    public final fl a(Class cls) {
        return (fl) Collection._EL.stream(this.b).filter(new b(cls)).findFirst().map(new c(1)).map(new c(0)).orElseGet(new d());
    }
}
