package com.google.android.apps.gsa.nga.engine.ui.e.h.d;

import com.google.android.apps.gsa.assistant.shared.appactions.b.c;
import com.google.android.apps.gsa.assistant.shared.appactions.b.m;
import com.google.android.apps.gsa.assistant.shared.appactions.b.n;
import com.google.android.apps.gsa.l.g.f;
import com.google.android.apps.gsa.nga.engine.ar.b.b.d;
import com.google.android.apps.gsa.nga.engine.c.d.a.b;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.j;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/d/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f744a = j.i("com.google.android.apps.gsa.nga.engine.ui.e.h.d.e");
    public final h b;
    public final m c;
    public final b d;
    public final d e;
    private final com.google.android.apps.gsa.nga.shared.s.e f = new i(Optional.empty(), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    private final com.google.android.apps.gsa.nga.engine.ui.e.c.b g;

    public e(b bVar, d dVar, com.google.android.apps.gsa.nga.engine.ui.e.c.b bVar2, h hVar, c cVar, n nVar, f fVar) {
        this.d = bVar;
        this.e = dVar;
        this.g = bVar2;
        this.b = hVar;
        this.c = nVar.a(fVar, cVar);
    }

    public final com.google.android.apps.gsa.nga.shared.s.f a() {
        return ad.j(this.g.j(), this.f, new c());
    }

    public final void b() {
        if (d()) {
            c(Optional.empty());
        }
    }

    public final void c(Optional optional) {
        ad.b(this.b, this.f, optional, "shortcutContentObserver");
    }

    public final boolean d() {
        return ((Boolean) this.g.j().c()).booleanValue();
    }
}
