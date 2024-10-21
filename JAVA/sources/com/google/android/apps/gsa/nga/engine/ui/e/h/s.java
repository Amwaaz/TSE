package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.common.b.ha;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protos.o.b.m;
import com.google.protos.o.b.v;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/s.class */
public class s implements com.google.android.apps.gsa.nga.engine.g.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f760a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.h.s");
    private final com.google.android.libraries.gsa.h.h c;
    private final com.google.android.apps.gsa.l.g.f d;
    private final com.google.android.apps.gsa.nga.engine.g.a.y f;
    private cn e = dl.l();
    public String b = "";

    public s(com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar, com.google.android.apps.gsa.l.g.f fVar) {
        this.c = hVar;
        this.f = yVar;
        this.d = fVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final void O() {
        Optional optional = this.f.c().c;
        if (optional.isEmpty()) {
            return;
        }
        if (!this.e.isDone() || !this.e.isCancelled()) {
            this.e.cancel(true);
        }
        cn k = this.c.k(this.d.c((String) optional.get(), v.W, null, com.google.protos.ap.a.a.s.a, m.a), "[NGA] Read Assistant user display name from Geller", new q());
        this.e = k;
        new ae(k, this.c, "Parse user name from Geller response").a(new z(this, 1)).a(new r());
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final /* synthetic */ void gX(ha haVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NavBar assistant username observer";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 70;
    }
}
