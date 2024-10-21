package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.b.f;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.engine.education.pie.c;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.i.a.k;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.nga.shared.u.d.a.x;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/e.class */
public final class e implements c, com.google.android.apps.gsa.nga.engine.education.pie.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.nga.engine.education.pie.d f600a;
    private final a b;
    private final y c;
    private final t d;
    private final f e;

    public e(y yVar, t tVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, a aVar, f fVar) {
        this.c = yVar;
        this.d = tVar;
        this.f600a = dVar;
        this.b = aVar;
        this.e = fVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.c.f589a.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(x xVar) {
        if (xVar.b == 4) {
            try {
                ha a2 = this.e.a();
                if ((!this.b.i(eu.gd) || !a2.contains(com.google.android.apps.gsa.nga.shared.u.d.a.c.d)) && (!this.b.i(eu.gc) || !a2.contains(com.google.android.apps.gsa.nga.shared.u.d.a.c.e))) {
                    com.google.android.apps.gsa.nga.shared.i.a.j d = k.d();
                    d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.ASSISTANT_TRIGGER_NOT_AVAILABLE);
                    d.c(l.APP_OPEN);
                    d.d(9);
                    throw d.a();
                }
                if (!a2.contains(com.google.android.apps.gsa.nga.shared.u.d.a.c.b) && (this.b.i(eu.kJ) || this.b.i(eu.kN))) {
                    com.google.android.apps.gsa.nga.shared.i.a.j d2 = k.d();
                    d2.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_OPEN_APP_HOTWORD_NOT_ENABLED);
                    d2.c(l.APP_OPEN);
                    d2.d(9);
                    throw d2.a();
                }
                if (!this.b.i(eu.kT)) {
                    com.google.android.apps.gsa.nga.shared.i.a.j d3 = k.d();
                    d3.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_UI_NOT_SUPPORTED);
                    d3.c(l.APP_OPEN);
                    d3.d(9);
                    throw d3.a();
                }
                com.google.android.apps.gsa.nga.shared.u.d.a.ai aiVar = xVar.b == 4 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ai) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ai.a;
                int i = true != this.b.i(eu.kM) ? 1 : 2;
                if (true == this.b.i(eu.kJ)) {
                    i = 3;
                }
                Bundle bundle = new Bundle();
                g.c(bundle, l.APP_OPEN);
                String str = aiVar.c;
                String str2 = aiVar.d;
                int i2 = com.google.android.apps.gsa.nga.engine.education.pie.a.c.a;
                bundle.putString("APP_NAME", str);
                bundle.putString("APP_PACKAGE", str2);
                bundle.putInt("INVOCATION_MODE", i - 1);
                com.google.android.apps.gsa.nga.shared.i.a.a a3 = com.google.android.apps.gsa.nga.shared.i.a.f.a();
                a3.a = bundle;
                a3.g(2132093045);
                a3.c(2132093044);
                a3.f(fl.p(aiVar.c));
                a3.c = 9;
                a3.d(this.b.i(eu.fT));
                int d4 = (int) this.b.d(eu.kL);
                int i3 = 1;
                if (d4 >= 0) {
                    a.a.m0do();
                    i3 = 1;
                    if (d4 < 3) {
                        i3 = a.a.m0do()[d4];
                    }
                }
                this.d.a(a3.a(), i3);
            } catch (k e) {
                this.f600a.b(e, false);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.c.f589a.c(this);
    }
}
