package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.b.v;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.engine.education.pie.c;
import com.google.android.apps.gsa.nga.engine.education.pie.f;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.i.a.k;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.nga.shared.u.d.a.x;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/r.class */
public final class r implements c, com.google.android.apps.gsa.nga.engine.education.pie.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.nga.engine.education.pie.d f605a;
    private final y b;
    private final v c;

    public r(y yVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, v vVar) {
        this.b = yVar;
        this.c = vVar;
        this.f605a = dVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.b.f589a.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(x xVar) {
        if (xVar.b == 5) {
            Bundle bundle = new Bundle();
            try {
                int i = (xVar.b == 5 ? (com.google.android.apps.gsa.nga.shared.u.d.a.v) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.v.a).b;
                int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    g.c(bundle, l.SWIPE_EDUCATION);
                } else if (i3 == 1) {
                    g.c(bundle, l.GENERIC_TRY_SAYING);
                    com.google.android.apps.gsa.nga.shared.u.d.a.v vVar = xVar.b == 5 ? (com.google.android.apps.gsa.nga.shared.u.d.a.v) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.v.a;
                    com.google.android.apps.gsa.nga.engine.education.pie.a.e.e(bundle, vVar.b == 2 ? (String) vVar.c : "", 1);
                } else if (i3 == 2) {
                    com.google.android.apps.gsa.nga.shared.i.a.j d = k.d();
                    d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.NGA_OPA_PROMO_NOTIFICATION_FLOW_NOT_SPECIFIED);
                    d.d(8);
                    throw d.a();
                }
                this.c.h(bundle, f.a(8).a());
            } catch (k e) {
                this.f605a.b(e, true);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.b.f589a.c(this);
    }
}
