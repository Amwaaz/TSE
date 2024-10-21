package com.google.android.apps.gsa.search.core.state.e;

import com.google.android.apps.gsa.search.core.state.aa;
import com.google.android.apps.gsa.search.core.state.cr;
import com.google.android.apps.gsa.search.core.state.q;
import com.google.android.apps.gsa.shared.util.debug.h;
import com.google.common.b.hl;
import com.google.common.b.hn;
import e.c.d;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/e/a.class */
public final class a implements d {
    public static hn b(Set set, com.google.android.apps.gsa.shared.o.a.a aVar) {
        if (aVar.b()) {
            h.a("VelvetEventBus.sortGlobalStateList", aVar);
        }
        hl hlVar = new hl(new cr());
        hlVar.o(set);
        hn l = hlVar.l();
        if (aVar.b()) {
            h.b(aVar);
        }
        l.getClass();
        return l;
    }

    public static hn c(Set set, com.google.android.apps.gsa.shared.o.a.a aVar) {
        if (aVar.b()) {
            h.a("VelvetEventBus.sortLegacySessionStateList", aVar);
        }
        hl hlVar = new hl(new cr());
        hlVar.o(set);
        hn l = hlVar.l();
        if (aVar.b()) {
            h.b(aVar);
        }
        l.getClass();
        return l;
    }

    public static Set d(aa aaVar) {
        Set singleton = Collections.singleton(aaVar);
        singleton.getClass();
        return singleton;
    }

    public static Set e(q qVar) {
        Set singleton = Collections.singleton(qVar);
        singleton.getClass();
        return singleton;
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
