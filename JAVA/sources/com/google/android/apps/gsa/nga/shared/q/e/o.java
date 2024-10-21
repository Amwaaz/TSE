package com.google.android.apps.gsa.nga.shared.q.e;

import com.google.android.apps.gsa.nga.shared.q.d.al;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bx;
import com.google.android.apps.gsa.nga.shared.q.e.a.l;
import com.google.android.apps.gsa.nga.shared.u.j.b.b;
import com.google.android.apps.gsa.nga.shared.u.j.b.d;
import com.google.android.apps.gsa.nga.shared.u.j.b.f;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/o.class */
public final class o implements c {

    /* renamed from: a */
    private final int f996a;

    public o(int i) {
        this.f996a = i;
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.e.c
    public final void a(bj bjVar, ba baVar) {
        int i = this.f996a;
        if (i == 0) {
            bx bxVar = bjVar.b == 37 ? (bx) bjVar.c : bx.a;
            ba createBuilder = bx.a.createBuilder();
            boolean z = 1 == (bxVar.b & 1);
            bxVar.getClass();
            n nVar = new n(bxVar, 6);
            createBuilder.getClass();
            l.b(z, nVar, new l(createBuilder, 9));
            l.b((bxVar.b & 2) != 0, new n(bxVar, 7), new l(createBuilder, 10));
            l.b((bxVar.b & 4) != 0, new n(bxVar, 8), new l(createBuilder, 11));
            bx build = createBuilder.build();
            baVar.copyOnWrite();
            bj bjVar2 = baVar.instance;
            build.getClass();
            bjVar2.c = build;
            bjVar2.b = 37;
            return;
        }
        if (i == 1) {
            al alVar = bjVar.b == 35 ? (al) bjVar.c : al.a;
            ba createBuilder2 = al.a.createBuilder();
            boolean z2 = 1 == (alVar.b & 1);
            alVar.getClass();
            f fVar = new f(alVar, 7);
            createBuilder2.getClass();
            l.b(z2, fVar, new g(createBuilder2, 7));
            l.b((alVar.b & 2) != 0, new f(alVar, 8), new g(createBuilder2, 8));
            baVar.copyOnWrite();
            bj bjVar3 = baVar.instance;
            al build2 = createBuilder2.build();
            build2.getClass();
            bjVar3.c = build2;
            bjVar3.b = 35;
            return;
        }
        f fVar2 = bjVar.b == 1 ? (f) bjVar.c : f.a;
        ba createBuilder3 = f.a.createBuilder();
        long j = fVar2.d;
        createBuilder3.copyOnWrite();
        createBuilder3.instance.d = j;
        b a2 = b.a(fVar2.f);
        b bVar = a2;
        if (a2 == null) {
            bVar = b.e;
        }
        createBuilder3.copyOnWrite();
        createBuilder3.instance.f = bVar.getNumber();
        com.google.android.apps.gsa.nga.shared.u.j.b.a a3 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a(fVar2.h);
        com.google.android.apps.gsa.nga.shared.u.j.b.a aVar = a3;
        if (a3 == null) {
            aVar = com.google.android.apps.gsa.nga.shared.u.j.b.a.o;
        }
        createBuilder3.copyOnWrite();
        createBuilder3.instance.h = aVar.getNumber();
        String str = fVar2.i;
        createBuilder3.copyOnWrite();
        f fVar3 = createBuilder3.instance;
        str.getClass();
        fVar3.i = str;
        String a4 = l.a(fVar2.c);
        createBuilder3.copyOnWrite();
        f fVar4 = createBuilder3.instance;
        a4.getClass();
        fVar4.c = a4;
        for (com.google.android.apps.gsa.nga.shared.u.j.b.e eVar : fVar2.g) {
            ba createBuilder4 = com.google.android.apps.gsa.nga.shared.u.j.b.e.a.createBuilder();
            int b = d.b(eVar.c);
            int i2 = b;
            if (b == 0) {
                i2 = d.s;
            }
            createBuilder4.copyOnWrite();
            createBuilder4.instance.c = d.getNumber$ar$edu$89378c00_0(i2);
            int i3 = eVar.d;
            createBuilder4.copyOnWrite();
            createBuilder4.instance.d = i3;
            String a5 = l.a(eVar.b);
            createBuilder4.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.u.j.b.e eVar2 = createBuilder4.instance;
            a5.getClass();
            eVar2.b = a5;
            com.google.android.apps.gsa.nga.shared.u.j.b.e build3 = createBuilder4.build();
            createBuilder3.copyOnWrite();
            f fVar5 = createBuilder3.instance;
            build3.getClass();
            fVar5.a();
            fVar5.g.add(build3);
        }
        baVar.copyOnWrite();
        bj bjVar4 = baVar.instance;
        f build4 = createBuilder3.build();
        build4.getClass();
        bjVar4.c = build4;
        bjVar4.b = 1;
    }
}
