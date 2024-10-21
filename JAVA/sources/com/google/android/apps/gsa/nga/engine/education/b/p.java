package com.google.android.apps.gsa.nga.engine.education.b;

import com.google.android.apps.gsa.nga.engine.ao.h;
import com.google.android.apps.gsa.nga.engine.g.a;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.aa.c;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/b/p.class */
public final class p implements c, h, a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.a.d f564a = com.google.common.f.a.d.j();
    private final com.google.android.apps.gsa.shared.util.q.a b;
    private final AtomicReference c;
    private final y d;

    public p(y yVar, com.google.android.apps.gsa.shared.util.q.a aVar) {
        int i = fl.e;
        fl flVar = ni.a;
        this.c = new AtomicReference(Optional.empty());
        this.d = yVar;
        this.b = aVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(t tVar) {
        if (tVar.equals(t.f) && this.b.i(eu.bX)) {
            int i = fl.e;
            fl flVar = ni.a;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final void O() {
        if (this.b.i(eu.bX)) {
            Locale locale = this.d.c().d;
            if (((Optional) this.c.get()).equals(Optional.of(locale))) {
                return;
            }
            com.google.common.f.a.a d = f564a.d();
            d.ak(2985);
            d.H("Language changed from %s to %s. Clearing Quick Actions from Chalkboard.", this.c, locale);
            this.c.set(Optional.of(locale));
            int i = fl.e;
            fl flVar = ni.a;
        }
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
        return "QuickActionsChalkboardSuggestionProvider";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 13;
    }
}
