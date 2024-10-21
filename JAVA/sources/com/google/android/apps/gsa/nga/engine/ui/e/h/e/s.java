package com.google.android.apps.gsa.nga.engine.ui.e.h.e;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.ak.e;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.libraries.gsa.h.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/e/s.class */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f751a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.h.e.s");
    public final h b;
    public final h c;
    public final e d;
    public final com.google.android.apps.gsa.nga.engine.ui.e.c.a.e e;
    public final j f;
    public final com.google.android.apps.gsa.nga.shared.s.e g = new i(r.a(), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final y h;
    public final ag i;

    public s(h hVar, h hVar2, y yVar, e eVar, com.google.android.apps.gsa.nga.engine.ui.e.c.a.e eVar2, ag agVar, j jVar) {
        this.b = hVar;
        this.c = hVar2;
        this.h = yVar;
        this.d = eVar;
        this.e = eVar2;
        this.i = agVar;
        this.f = jVar;
    }

    public final void a() {
        ((r) ((i) this.g).b.get()).b.cancel(false);
        this.g.b(r.a());
    }
}
