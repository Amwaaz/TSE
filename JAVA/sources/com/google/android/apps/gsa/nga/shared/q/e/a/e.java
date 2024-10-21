package com.google.android.apps.gsa.nga.shared.q.e.a;

import com.google.android.apps.gsa.nga.shared.q.d.an;
import com.google.android.apps.gsa.nga.shared.q.d.bz;
import com.google.android.apps.gsa.nga.shared.q.d.de;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/a/e.class */
public final class e implements Function {

    /* renamed from: a */
    private final int f989a;
    private final Object b;

    public e(Object obj, int i) {
        this.f989a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.f989a;
        if (i != 0 && i == 1) {
            return Function._CC.$default$andThen(this, function);
        }
        return Function._CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.f989a;
        if (i == 0) {
            com.google.knowledge.a.a.e eVar = (com.google.knowledge.a.a.e) obj;
            bc createBuilder = com.google.knowledge.a.a.e.a.createBuilder();
            String str = eVar.c;
            createBuilder.copyOnWrite();
            com.google.knowledge.a.a.e eVar2 = createBuilder.instance;
            str.getClass();
            eVar2.b = 4 | eVar2.b;
            eVar2.c = str;
            Stream map = Collection._EL.stream(eVar.d).map((java.util.function.Function) this.b);
            int i2 = fl.e;
            createBuilder.S((Iterable) map.collect(bs.a));
            return createBuilder.build();
        }
        boolean z = false;
        if (i != 1) {
            de deVar = (de) obj;
            ba createBuilder2 = de.a.createBuilder();
            int i3 = deVar.c;
            deVar.getClass();
            a aVar = new a(deVar, 18);
            createBuilder2.getClass();
            b bVar = new b(createBuilder2, 20);
            ?? r0 = this.b;
            if ((i3 & 512) != 0) {
                z = true;
            }
            l.d(z, aVar, bVar, (java.util.function.Function) r0);
            return createBuilder2.build();
        }
        an anVar = (an) obj;
        ba createBuilder3 = an.a.createBuilder();
        if ((anVar.b & 1) != 0) {
            int a2 = bz.a(anVar.c);
            int i4 = a2;
            if (a2 == 0) {
                i4 = 1;
            }
            createBuilder3.copyOnWrite();
            an anVar2 = createBuilder3.instance;
            anVar2.c = i4 - 1;
            anVar2.b |= 1;
        }
        if ((anVar.b & 2) != 0) {
            int a3 = bz.a(anVar.d);
            int i5 = a3;
            if (a3 == 0) {
                i5 = 1;
            }
            createBuilder3.copyOnWrite();
            an anVar3 = createBuilder3.instance;
            anVar3.d = i5 - 1;
            anVar3.b |= 2;
        }
        boolean z2 = (anVar.b & 4) != 0;
        anVar.getClass();
        a aVar2 = new a(anVar, 2);
        createBuilder3.getClass();
        l.b(z2, aVar2, new b(createBuilder3, 2));
        l.b((anVar.b & 8) != 0, new a(anVar, 3), new b(createBuilder3, 3));
        boolean z3 = false;
        if ((anVar.b & 32) != 0) {
            z3 = true;
        }
        l.d(z3, new a(anVar, 4), new b(createBuilder3, 4), (java.util.function.Function) this.b);
        return createBuilder3.build();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.f989a;
        if (i != 0 && i == 1) {
            return Function._CC.$default$compose(this, function);
        }
        return Function._CC.$default$compose(this, function);
    }
}
