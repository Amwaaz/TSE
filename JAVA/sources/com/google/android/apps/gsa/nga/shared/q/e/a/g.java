package com.google.android.apps.gsa.nga.shared.q.e.a;

import com.google.android.apps.gsa.nga.shared.u.e.c;
import com.google.android.apps.gsa.nga.shared.u.f.o;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.knowledge.a.a.a;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/a/g.class */
public final class g implements Function {

    /* renamed from: a */
    private final int f990a;

    public g(int i) {
        this.f990a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.f990a;
        if (i != 0 && i != 1 && i == 2) {
            return Function._CC.$default$andThen(this, function);
        }
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.f990a;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                c cVar = (c) obj;
                ba createBuilder = c.a.createBuilder();
                int i2 = cVar.b;
                cVar.getClass();
                a aVar = new a(cVar, 1);
                createBuilder.getClass();
                l.d(i2 == 1, aVar, new b(createBuilder, 1), new f(1));
                int i3 = cVar.b;
                a aVar2 = new a(cVar, 0);
                b bVar = new b(createBuilder, 0);
                c cVar2 = new c();
                boolean z2 = false;
                if (i3 == 2) {
                    z2 = true;
                }
                l.d(z2, aVar2, bVar, cVar2);
                return createBuilder.build();
            }
            if (i == 2) {
                bc createBuilder2 = a.a.createBuilder();
                String str = ((a) obj).e;
                createBuilder2.copyOnWrite();
                a aVar3 = createBuilder2.instance;
                str.getClass();
                aVar3.b = 2 | aVar3.b;
                aVar3.e = str;
                return createBuilder2.build();
            }
            o oVar = (o) obj;
            ba createBuilder3 = o.b.createBuilder();
            Stream map = Collection._EL.stream(oVar.f).map(new f(3));
            int i4 = fl.e;
            createBuilder3.bJ((Iterable) map.collect(bs.a));
            int i5 = oVar.c;
            oVar.getClass();
            a aVar4 = new a(oVar, 17);
            b bVar2 = new b(createBuilder3, 17);
            if ((2 & i5) != 0) {
                z = true;
            }
            l.c(z, aVar4, bVar2);
            return createBuilder3.build();
        }
        com.google.nlp.b.a.d dVar = (com.google.nlp.b.a.d) obj;
        ba createBuilder4 = com.google.nlp.b.a.d.a.createBuilder();
        boolean z3 = 1 == (dVar.b & 1);
        dVar.getClass();
        a aVar5 = new a(dVar, 11);
        createBuilder4.getClass();
        l.b(z3, aVar5, new b(createBuilder4, 13));
        l.b((dVar.b & 2) != 0, new a(dVar, 14), new b(createBuilder4, 14));
        l.b((dVar.b & 4) != 0, new a(dVar, 8), new b(createBuilder4, 8));
        l.b((dVar.b & 8) != 0, new a(dVar, 9), new b(createBuilder4, 9));
        l.b((dVar.b & 16) != 0, new a(dVar, 10), new b(createBuilder4, 10));
        l.b((dVar.b & 32) != 0, new a(dVar, 12), new b(createBuilder4, 11));
        int i6 = dVar.b;
        a aVar6 = new a(dVar, 13);
        b bVar3 = new b(createBuilder4, 12);
        boolean z4 = false;
        if ((i6 & 64) != 0) {
            z4 = true;
        }
        l.b(z4, aVar6, bVar3);
        Stream map2 = Collection._EL.stream(dVar.g).map(new f(2));
        int i7 = fl.e;
        Iterable iterable = (Iterable) map2.collect(bs.a);
        createBuilder4.copyOnWrite();
        com.google.nlp.b.a.d dVar2 = createBuilder4.instance;
        cb cbVar = dVar2.g;
        if (!cbVar.c()) {
            dVar2.g = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(iterable, dVar2.g);
        return createBuilder4.build();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.f990a;
        if (i != 0 && i != 1 && i == 2) {
            return Function._CC.$default$compose(this, function);
        }
        return Function._CC.$default$compose(this, function);
    }
}
