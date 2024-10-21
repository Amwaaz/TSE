package com.google.android.apps.gsa.nga.engine.education.pie.e.a;

import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.shared.logger.b.e;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.common.o.a.aa;
import com.google.common.o.a.ag;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/e/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i f591a;
    public int c = 1;
    public Optional b = Optional.empty();

    public b(i iVar) {
        this.f591a = iVar;
    }

    public final void a(w wVar) {
        int intValue = ((Integer) this.b.map(new a()).orElse(0)).intValue();
        e eVar = new e();
        eVar.a = wVar;
        qn createBuilder = r.a.createBuilder();
        ba createBuilder2 = aa.a.createBuilder();
        ba createBuilder3 = ag.a.createBuilder();
        createBuilder3.copyOnWrite();
        ag agVar = createBuilder3.instance;
        agVar.b |= 128;
        agVar.m = intValue;
        ag build = createBuilder3.build();
        createBuilder2.copyOnWrite();
        aa aaVar = createBuilder2.instance;
        build.getClass();
        aaVar.c = build;
        aaVar.b = 1;
        aa build2 = createBuilder2.build();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        build2.getClass();
        rVar.ap = build2;
        rVar.e |= 16;
        eVar.b = createBuilder.build();
        this.f591a.a(eVar.a());
        this.b = Optional.empty();
        this.c = 1;
    }

    public final void b() {
        if (c()) {
            return;
        }
        a(w.MULTI_STEP_TRY_SAYING_FLOW_QUERY_MISMATCH);
    }

    public final boolean c() {
        return this.c == 1;
    }
}
