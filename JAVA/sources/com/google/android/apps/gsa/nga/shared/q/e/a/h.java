package com.google.android.apps.gsa.nga.shared.q.e.a;

import com.google.android.apps.gsa.nga.shared.u.m.a;
import com.google.android.apps.gsa.nga.shared.u.m.b;
import com.google.protobuf.ba;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/a/h.class */
public final class h implements Function {

    /* renamed from: a, reason: collision with root package name */
    private final e f991a;
    private final g b;

    public h(e eVar, g gVar) {
        this.f991a = eVar;
        this.b = gVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        a aVar = (a) obj;
        ba createBuilder = a.a.createBuilder();
        float f = aVar.e;
        createBuilder.copyOnWrite();
        createBuilder.instance.e = f;
        b a2 = b.a(aVar.f);
        b bVar = a2;
        if (a2 == null) {
            bVar = b.l;
        }
        createBuilder.copyOnWrite();
        createBuilder.instance.f = bVar.getNumber();
        boolean z = 1 == (aVar.b & 1);
        aVar.getClass();
        l.d(z, new a(aVar, 15), new b(createBuilder, 15), this.f991a);
        l.d((aVar.b & 2) != 0, new a(aVar, 16), new b(createBuilder, 16), this.b);
        return createBuilder.build();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function._CC.$default$compose(this, function);
    }
}
