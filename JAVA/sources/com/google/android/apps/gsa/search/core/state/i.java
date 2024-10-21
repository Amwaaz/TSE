package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.ae.b.a;
import com.google.android.apps.gsa.search.core.b.b;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.gsa.h.h;
import com.google.cs.d.c;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/i.class */
public final class i extends ae implements a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1302a;
    public long b;
    public Long c;
    public boolean d;
    public final com.google.android.apps.gsa.search.core.ae.c.a e;
    public final b f;
    private final h g;

    public i(e.a aVar, com.google.android.apps.gsa.search.core.ae.c.a aVar2, b bVar, h hVar) {
        super(aVar, 61);
        this.b = 0L;
        this.d = false;
        this.e = aVar2;
        this.f = bVar;
        this.g = hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.a
    public final void a(c cVar, boolean z) {
        com.google.android.libraries.gsa.h.f hVar = new h(this, cVar, z);
        if (com.google.android.libraries.gsa.h.i.d(com.google.android.apps.gsa.search.core.service.a.a.class)) {
            hVar.run();
        } else {
            this.g.n("notifyChanged on ActionCardLoggingEvent", hVar);
        }
    }

    public final boolean b() {
        boolean z = !this.f.d();
        if (this.f1302a == z) {
            return false;
        }
        this.f1302a = z;
        return true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ActionVeLoggingSessionState");
        fVar.b("HasPendingWork").a(new d(Boolean.valueOf(this.f1302a), false));
        fVar.b("PendingAcles").a(new d(Integer.valueOf(this.f.a()), false));
    }
}
