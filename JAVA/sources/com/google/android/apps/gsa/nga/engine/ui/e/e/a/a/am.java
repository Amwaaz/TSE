package com.google.android.apps.gsa.nga.engine.ui.e.e.a.a;

import com.google.android.apps.gsa.nga.engine.ui.e.e.a;
import com.google.android.apps.gsa.nga.engine.ui.e.i;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.f;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/e/a/a/am.class */
public final class am implements i {
    private final h b;
    private final f c;

    /* renamed from: a, reason: collision with root package name */
    public a f709a = a.f705a;
    private final e d = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    private final k e = new k();

    public am(h hVar, f fVar) {
        this.b = hVar;
        this.c = fVar;
    }

    public final void a(fl flVar, com.google.android.apps.gsa.nga.shared.aa.a.a aVar) {
        this.b.n("[NGA] setSuggestionsAvailableFlags", new al(this, flVar, aVar));
    }

    public final void b() {
        this.d.b(Boolean.valueOf(!this.f709a.c.isEmpty()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void h() {
        this.e.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void hm() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void i() {
        this.e.c(this.c, new ak(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void k() {
    }
}
