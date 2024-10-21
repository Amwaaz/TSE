package com.google.android.apps.gsa.shared.logger.b;

import com.google.common.b.qj;
import com.google.common.base.ah;
import com.google.common.o.qn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/b/r.class */
final class r implements ah {
    public static final com.google.common.o.w a(d dVar) {
        qn createBuilder = com.google.common.o.w.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.common.o.w wVar = createBuilder.instance;
        int i = dVar.e;
        if (i == 0) {
            throw null;
        }
        wVar.c = i - 1;
        wVar.b |= 1;
        qj j = dVar.d.A().j();
        while (j.hasNext()) {
            createBuilder.ad(((com.google.android.libraries.gsa.e.a.a) j.next()).c());
        }
        y yVar = dVar.a;
        createBuilder.copyOnWrite();
        com.google.common.o.w wVar2 = createBuilder.instance;
        wVar2.e = yVar.ff;
        wVar2.b |= 2;
        com.google.android.libraries.gsa.e.a.a aVar = dVar.b;
        if (aVar != null) {
            createBuilder.copyOnWrite();
            com.google.common.o.w wVar3 = createBuilder.instance;
            wVar3.f = aVar.a.aaF;
            wVar3.b |= 4;
        }
        w wVar4 = dVar.c.a;
        createBuilder.copyOnWrite();
        com.google.common.o.w wVar5 = createBuilder.instance;
        wVar5.g = wVar4.aaF;
        wVar5.b |= 8;
        return createBuilder.build();
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        throw null;
    }
}
