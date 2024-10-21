package com.google.android.apps.gsa.l.f;

import com.google.android.apps.gsa.l.e.c;
import com.google.android.apps.gsa.l.e.d;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.be;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.apps.gsa.tasks.ar;
import com.google.android.apps.gsa.tasks.m;
import com.google.android.apps.gsa.tasks.s;
import com.google.android.apps.gsa.tasks.u;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.base.at;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/l/f/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final p f363a;
    private final at b;
    private final m c;

    public a(m mVar, p pVar, at atVar) {
        this.c = mVar;
        this.f363a = pVar;
        this.b = atVar;
    }

    public final boolean a() {
        fg fgVar = new fg(4);
        fgVar.a(new v[]{v.ap, v.cF}, 2);
        if (this.b.h()) {
            ((bg) this.b.c()).l();
        }
        if (this.f363a.w(be.t)) {
            fgVar.h(v.k);
        }
        fl g = fgVar.g();
        if (g.isEmpty()) {
            return true;
        }
        ba createBuilder = c.c.createBuilder();
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        cVar.i = 6;
        cVar.d |= 4;
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        cVar2.d = 2 | cVar2.d;
        cVar2.h = "agsa";
        createBuilder.aZ(g);
        c build = createBuilder.build();
        ba createBuilder2 = s.a.createBuilder();
        createBuilder2.copyOnWrite();
        s sVar = createBuilder2.instance;
        sVar.e = 1;
        sVar.b = 4 | sVar.b;
        bc createBuilder3 = u.a.createBuilder();
        createBuilder3.w(d.a, build);
        createBuilder2.copyOnWrite();
        s sVar2 = createBuilder2.instance;
        u build2 = createBuilder3.build();
        build2.getClass();
        sVar2.h = build2;
        sVar2.b |= 32;
        return this.c.f(ar.GELLER_OPA_REFRESH_TASK, createBuilder2.build());
    }
}
