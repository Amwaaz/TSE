package com.google.android.apps.gsa.nga.engine.c.d.a;

import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.apps.gsa.nga.shared.u.c;
import com.google.android.apps.gsa.search.shared.service.c.m;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/d/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g f527a;

    public b(g gVar) {
        this.f527a = gVar;
    }

    public static aa a(m mVar, int i) {
        ba createBuilder = aa.a.createBuilder();
        ba createBuilder2 = c.a.createBuilder();
        createBuilder2.copyOnWrite();
        c cVar = createBuilder2.instance;
        mVar.getClass();
        cVar.c = mVar;
        cVar.b |= 1;
        createBuilder2.copyOnWrite();
        c cVar2 = createBuilder2.instance;
        cVar2.d = i - 1;
        cVar2.b |= 2;
        c build = createBuilder2.build();
        createBuilder.copyOnWrite();
        aa aaVar = createBuilder.instance;
        build.getClass();
        aaVar.c = build;
        aaVar.b = 24;
        return createBuilder.build();
    }
}
