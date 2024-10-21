package com.google.android.apps.gsa.nga.engine.ac.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.b;
import com.google.android.apps.gsa.nga.engine.ui.e.n.a.e;
import com.google.android.apps.gsa.nga.engine.ui.e.n.a.i;
import com.google.android.apps.gsa.nga.shared.ad.a.d;
import com.google.android.libraries.logging.j;
import com.google.android.libraries.logging.k;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.o.ew;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/ag.class */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public final z f387a;
    public final com.google.android.apps.gsa.shared.util.q.a b;
    public final d c;
    public final Context d;
    public boolean e;
    public final y f;
    public final ad g;
    public final b h;
    private final e.a i;
    private final com.google.android.apps.gsa.nga.engine.v.a.aa j;

    public ag(z zVar, com.google.android.apps.gsa.shared.util.q.a aVar, y yVar, e.a aVar2, ad adVar, b bVar, d dVar, Context context, com.google.android.apps.gsa.nga.engine.v.a.aa aaVar) {
        this.f387a = zVar;
        this.b = aVar;
        this.f = yVar;
        this.g = adVar;
        this.h = bVar;
        this.i = aVar2;
        this.c = dVar;
        this.d = context;
        this.j = aaVar;
    }

    public final void a() {
        b();
        if (this.h.a()) {
            i iVar = (i) this.i.a();
            iVar.b.n("[NGA] activeNotListening", new e(iVar, 5));
        }
    }

    public final void b() {
        j jVar = new j(121241);
        jVar.i(1);
        int i = fl.e;
        ew c = com.google.android.libraries.logging.c.c(k.d(jVar, ni.a), 121241);
        if (c != null) {
            this.j.p(c, Optional.empty());
        }
    }
}
