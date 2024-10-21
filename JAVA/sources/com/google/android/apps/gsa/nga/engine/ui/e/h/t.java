package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.common.b.ha;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/t.class */
public final class t implements com.google.android.apps.gsa.nga.engine.g.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.s.e f761a = new com.google.android.apps.gsa.nga.shared.s.i(Locale.getDefault(), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    private final com.google.android.libraries.gsa.h.h b;
    private final com.google.android.apps.gsa.nga.engine.g.a.y c;

    public t(com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar) {
        this.b = hVar;
        this.c = yVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final void O() {
        com.google.android.apps.gsa.nga.shared.s.ad.b(this.b, this.f761a, this.c.c().d, "locale");
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
        return "NavBar global locale observer";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 56;
    }
}
