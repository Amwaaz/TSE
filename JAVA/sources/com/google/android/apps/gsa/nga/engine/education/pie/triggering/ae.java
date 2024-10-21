package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.b.ak;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.engine.education.pie.c;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/ae.class */
public abstract class ae implements com.google.android.apps.gsa.nga.engine.education.pie.d.b, c {

    /* renamed from: a, reason: collision with root package name */
    private final y f594a;
    private final ak b;

    public ae(y yVar, ak akVar) {
        this.f594a = yVar;
        this.b = akVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.f594a.f589a.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    protected final cn e(at atVar, com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar, com.google.android.apps.gsa.nga.shared.u.d.a.ae aeVar) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.d.a.y.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.u.d.a.h.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.d.a.h hVar = createBuilder2.instance;
        acVar.getClass();
        hVar.c = acVar;
        hVar.b |= 1;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.d.a.h hVar2 = createBuilder2.instance;
        hVar2.e = atVar.g;
        hVar2.b |= 4;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.d.a.h hVar3 = createBuilder2.instance;
        aeVar.getClass();
        hVar3.d = aeVar;
        hVar3.b |= 2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.d.a.y yVar = createBuilder.instance;
        com.google.android.apps.gsa.nga.shared.u.d.a.h build = createBuilder2.build();
        build.getClass();
        yVar.c = build;
        yVar.b = 3;
        return this.b.a(createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.f594a.f589a.c(this);
    }
}
