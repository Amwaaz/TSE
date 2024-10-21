package com.google.android.apps.gsa.nga.shared.q.e;

import com.google.android.apps.gsa.nga.shared.q.d.ao;
import com.google.android.apps.gsa.nga.shared.q.d.ar;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.e.a.d;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/h.class */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f994a;
    private final int b;

    public h(Object obj, int i) {
        this.b = i;
        this.f994a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.function.Function] */
    @Override // com.google.android.apps.gsa.nga.shared.q.e.c
    public final void a(bj bjVar, ba baVar) {
        int i = this.b;
        if (i == 0) {
            ar apply = ((d) this.f994a).apply(bjVar.b == 2 ? (ar) bjVar.c : ar.a);
            baVar.copyOnWrite();
            bj bjVar2 = baVar.instance;
            apply.getClass();
            bjVar2.c = apply;
            bjVar2.b = 2;
            return;
        }
        if (i != 1) {
            com.google.android.apps.gsa.nga.shared.q.d.ba baVar2 = bjVar.b == 26 ? (com.google.android.apps.gsa.nga.shared.q.d.ba) bjVar.c : com.google.android.apps.gsa.nga.shared.q.d.ba.a;
            ba createBuilder = com.google.android.apps.gsa.nga.shared.q.d.ba.a.createBuilder();
            Stream map = Collection._EL.stream(baVar2.b).map(new j(this, 4));
            int i2 = fl.e;
            Iterable iterable = (Iterable) map.collect(bs.a);
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.q.d.ba baVar3 = createBuilder.instance;
            baVar3.a();
            com.google.protobuf.c.addAll(iterable, baVar3.b);
            com.google.android.apps.gsa.nga.shared.q.d.ba build = createBuilder.build();
            baVar.copyOnWrite();
            bj bjVar3 = baVar.instance;
            build.getClass();
            bjVar3.c = build;
            bjVar3.b = 26;
            return;
        }
        ao aoVar = bjVar.b == 21 ? (ao) bjVar.c : ao.a;
        ba createBuilder2 = ao.a.createBuilder();
        Stream map2 = Collection._EL.stream(aoVar.b).map((Function) this.f994a);
        int i3 = fl.e;
        Iterable iterable2 = (Iterable) map2.collect(bs.a);
        createBuilder2.copyOnWrite();
        ao aoVar2 = createBuilder2.instance;
        aoVar2.a();
        com.google.protobuf.c.addAll(iterable2, aoVar2.b);
        ao build2 = createBuilder2.build();
        baVar.copyOnWrite();
        bj bjVar4 = baVar.instance;
        build2.getClass();
        bjVar4.c = build2;
        bjVar4.b = 21;
    }
}
