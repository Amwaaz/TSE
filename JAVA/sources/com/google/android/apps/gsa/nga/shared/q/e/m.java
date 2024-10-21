package com.google.android.apps.gsa.nga.shared.q.e;

import com.google.android.apps.gsa.nga.shared.q.d.ah;
import com.google.android.apps.gsa.nga.shared.q.d.at;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.e.a.l;
import com.google.protobuf.ba;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/m.class */
public final class m implements c {

    /* renamed from: a */
    public final Object f995a;
    public final Object b;
    private final int c;

    public m(Object obj, Object obj2, int i) {
        this.c = i;
        this.f995a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.function.Function] */
    @Override // com.google.android.apps.gsa.nga.shared.q.e.c
    public final void a(bj bjVar, ba baVar) {
        if (this.c == 0) {
            at atVar = bjVar.b == 11 ? (at) bjVar.c : at.a;
            ba createBuilder = at.a.createBuilder();
            boolean z = 1 == (atVar.b & 1);
            atVar.getClass();
            f fVar = new f(atVar, 9);
            createBuilder.getClass();
            l.d(z, fVar, new g(createBuilder, 13), new j(this, 0));
            boolean z2 = false;
            if ((atVar.b & 2) != 0) {
                z2 = true;
            }
            l.d(z2, new f(atVar, 19), new l(createBuilder, 2), new j(this, 2));
            baVar.copyOnWrite();
            bj bjVar2 = baVar.instance;
            at build = createBuilder.build();
            build.getClass();
            bjVar2.c = build;
            bjVar2.b = 11;
            return;
        }
        ah ahVar = bjVar.b == 29 ? (ah) bjVar.c : ah.a;
        ba createBuilder2 = ah.a.createBuilder();
        boolean z3 = 1 == (ahVar.b & 1);
        ahVar.getClass();
        f fVar2 = new f(ahVar, 1);
        createBuilder2.getClass();
        l.d(z3, fVar2, new g(createBuilder2, 4), (Function) this.f995a);
        l.d((ahVar.b & 2) != 0, new f(ahVar, 5), new g(createBuilder2, 5), (Function) this.b);
        l.c((ahVar.b & 4) != 0, new f(ahVar, 6), new g(createBuilder2, 6));
        l.c((ahVar.b & 8) != 0, new f(ahVar, 0), new g(createBuilder2, 1));
        l.b((ahVar.b & 16) != 0, new f(ahVar, 2), new g(createBuilder2, 0));
        l.b((ahVar.b & 32) != 0, new f(ahVar, 3), new g(createBuilder2, 2));
        boolean z4 = false;
        if ((ahVar.b & 64) != 0) {
            z4 = true;
        }
        l.b(z4, new f(ahVar, 4), new g(createBuilder2, 3));
        ah build2 = createBuilder2.build();
        baVar.copyOnWrite();
        bj bjVar3 = baVar.instance;
        build2.getClass();
        bjVar3.c = build2;
        bjVar3.b = 29;
    }
}
