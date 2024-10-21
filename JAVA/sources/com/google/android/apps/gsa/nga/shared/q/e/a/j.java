package com.google.android.apps.gsa.nga.shared.q.e.a;

import a.a;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/a/j.class */
public final class j implements Function {

    /* renamed from: a, reason: collision with root package name */
    private final g f992a;

    public j(g gVar) {
        this.f992a = gVar;
    }

    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.apps.gsa.nga.shared.u.e.h apply(com.google.android.apps.gsa.nga.shared.u.e.h hVar) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.e.h.a.createBuilder();
        Stream map = Collection._EL.stream(hVar.c).map(this.f992a);
        int i = fl.e;
        createBuilder.bA((Iterable) map.collect(bs.a));
        createBuilder.bz((Iterable) Collection._EL.stream(hVar.d).map(new f(4)).collect(bs.a));
        createBuilder.bB(hVar.e);
        boolean z = hVar.h;
        createBuilder.copyOnWrite();
        createBuilder.instance.h = z;
        int cp = a.cp(hVar.i);
        int i2 = cp;
        if (cp == 0) {
            i2 = 1;
        }
        createBuilder.copyOnWrite();
        createBuilder.instance.i = a.db(i2);
        l.b(1 == (hVar.b & 1), new i(1), new b(createBuilder, 18));
        l.b((hVar.b & 2) != 0, new i(0), new b(createBuilder, 19));
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar.f).entrySet()) {
            createBuilder.bE((String) entry.getKey(), apply((com.google.android.apps.gsa.nga.shared.u.e.h) entry.getValue()));
        }
        return createBuilder.build();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function._CC.$default$compose(this, function);
    }
}
