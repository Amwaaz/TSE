package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.ui.answer.g;
import com.google.android.apps.gsa.nga.engine.ui.answer.h;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.common.o.ew;
import com.google.common.o.qn;
import com.google.common.o.qp;
import com.google.common.o.qs;
import com.google.protobuf.bc;
import j$.util.Optional;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/ab.class */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f385a;
    private final e.a b;
    private final boolean c;
    private final com.google.android.apps.gsa.nga.engine.v.a.aa d;
    private final y e;

    public ab(e.a aVar, e.a aVar2, com.google.android.apps.gsa.nga.engine.v.a.aa aaVar, y yVar, boolean z) {
        this.f385a = aVar;
        this.b = aVar2;
        this.d = aaVar;
        this.e = yVar;
        this.c = z;
    }

    private final String b(int i) {
        return ((b) this.b.a()).a(this.e.c().d).getString(i, new Object[0]);
    }

    final void a() {
        qn createBuilder = ew.a.createBuilder();
        com.google.common.o.o.p a2 = com.google.android.libraries.logging.b.a();
        createBuilder.copyOnWrite();
        ew ewVar = createBuilder.instance;
        a2.getClass();
        ewVar.c = a2;
        ewVar.b |= 1;
        bc createBuilder2 = qp.a.createBuilder();
        createBuilder2.copyOnWrite();
        qp qpVar = createBuilder2.instance;
        qpVar.b |= 4;
        qpVar.e = 98957;
        createBuilder.copyOnWrite();
        ew ewVar2 = createBuilder.instance;
        qp build = createBuilder2.build();
        build.getClass();
        ewVar2.f = build;
        ewVar2.b |= 16;
        bc createBuilder3 = qs.a.createBuilder();
        createBuilder3.copyOnWrite();
        qs qsVar = createBuilder3.instance;
        qsVar.b |= 1;
        qsVar.c = 98845;
        createBuilder.U(createBuilder3);
        this.d.p(createBuilder.build(), Optional.empty());
        com.google.android.apps.gsa.nga.engine.ui.a aVar = (com.google.android.apps.gsa.nga.engine.ui.a) this.f385a.a();
        String b = this.c ? b(2132092902) : b(2132092901);
        g d = h.d();
        d.e(b);
        d.d(true);
        aVar.f(d.a());
    }
}
