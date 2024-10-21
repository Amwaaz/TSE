package com.google.android.apps.gsa.nga.engine.education.pie.b;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.a.l;
import com.google.android.apps.gsa.nga.engine.education.pie.d.b;
import com.google.android.apps.gsa.nga.shared.u.d.a.ar;
import com.google.android.apps.gsa.nga.shared.u.d.a.e;
import com.google.common.b.fu;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import e.a;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/b/ah.class */
public final class ah implements b, com.google.android.apps.gsa.nga.engine.education.pie.c, com.google.android.apps.gsa.nga.engine.education.pie.a.k {
    private static final d b = d.j();
    private static final fu c;
    private final a d;
    private final com.google.android.apps.gsa.nga.engine.education.pie.d e;
    private final y g;

    /* renamed from: a, reason: collision with root package name */
    public Optional f577a = Optional.empty();
    private int f = 0;

    static {
        com.google.android.apps.gsa.nga.shared.u.d.a.j jVar = com.google.android.apps.gsa.nga.shared.u.d.a.j.SWIPE_INVOCATION_DISMISSED;
        ba createBuilder = ar.f1006a.createBuilder();
        createBuilder.copyOnWrite();
        ar arVar = (ar) createBuilder.instance;
        arVar.c = 3;
        arVar.b |= 1;
        ar arVar2 = (ar) createBuilder.build();
        com.google.android.apps.gsa.nga.shared.u.d.a.j jVar2 = com.google.android.apps.gsa.nga.shared.u.d.a.j.LIGHTWEIGHT_SWIPE_INVOCATION_DISMISSED;
        ba createBuilder2 = ar.f1006a.createBuilder();
        createBuilder2.copyOnWrite();
        ar arVar3 = (ar) createBuilder2.instance;
        arVar3.c = 8;
        arVar3.b |= 1;
        ar arVar4 = (ar) createBuilder2.build();
        com.google.android.apps.gsa.nga.shared.u.d.a.j jVar3 = com.google.android.apps.gsa.nga.shared.u.d.a.j.LIGHTWEIGHT_LONG_PRESS_HOME_INVOCATION_DISMISSED;
        ba createBuilder3 = ar.f1006a.createBuilder();
        createBuilder3.copyOnWrite();
        ar arVar5 = (ar) createBuilder3.instance;
        arVar5.c = 9;
        arVar5.b |= 1;
        c = fu.o(jVar, arVar2, jVar2, arVar4, jVar3, (ar) createBuilder3.build());
    }

    public ah(a aVar, y yVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar) {
        this.d = aVar;
        this.g = yVar;
        this.e = dVar;
    }

    private final void g(ar arVar) {
        v vVar = (v) this.d.a();
        ba createBuilder = e.a.createBuilder();
        createBuilder.copyOnWrite();
        e eVar = createBuilder.instance;
        arVar.getClass();
        eVar.c = arVar;
        eVar.b = 1;
        vVar.g((e) createBuilder.build());
    }

    private final void h(int i) {
        try {
            ((v) this.d.a()).h((Bundle) this.f577a.get(), com.google.android.apps.gsa.nga.engine.education.pie.f.a(i).a());
        } catch (com.google.android.apps.gsa.nga.shared.i.a.k e) {
            g(ar.f1006a);
            this.e.b(e, true);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.g.f589a.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(com.google.android.apps.gsa.nga.shared.u.d.a.x xVar) {
        if (xVar.b == 2) {
            if (this.f577a.isEmpty()) {
                com.google.common.f.a.a e = b.e();
                e.ak(3039);
                e.p("Last flow bundle not set, cannot retry");
                g(ar.f1006a);
                return;
            }
            int i = 1;
            if (xVar.b == 2) {
                i = a.a.bb(((Integer) xVar.c).intValue());
                if (i == 0) {
                    i = 1;
                }
            }
            h(i);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void d(l lVar, int i, com.google.android.apps.gsa.nga.shared.u.d.a.j jVar) {
        if (lVar.d() != 3) {
            this.f = 0;
            return;
        }
        fu fuVar = c;
        if (!fuVar.containsKey(jVar)) {
            g(ar.f1006a);
            this.f = 0;
            return;
        }
        int i2 = this.f;
        if (i2 < 2) {
            this.f = i2 + 1;
            h(7);
        } else {
            this.f = 0;
            ar arVar = (ar) fuVar.get(jVar);
            arVar.getClass();
            g(arVar);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void e(l lVar, int i, com.google.android.apps.gsa.nga.engine.education.pie.f.h hVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.a.k
    public final void f(l lVar) {
        this.f = 0;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.g.f589a.c(this);
    }
}
