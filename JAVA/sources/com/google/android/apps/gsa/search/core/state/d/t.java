package com.google.android.apps.gsa.search.core.state.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/t.class */
public final class t extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f1293a;
    public final com.google.android.libraries.g.a b;
    public final e.a c;
    public final com.google.android.apps.gsa.shared.r.a d;
    public final com.google.android.apps.gsa.search.core.ae.aq.f e;
    public final Map f;

    public t(e.a aVar, e.a aVar2, e.a aVar3, com.google.android.apps.gsa.shared.r.a aVar4, com.google.android.apps.gsa.search.core.ae.aq.f fVar, com.google.android.libraries.g.a aVar5) {
        super(aVar, 5);
        this.f = new HashMap();
        this.f1293a = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = fVar;
        this.b = aVar5;
    }

    public final boolean c() {
        for (s sVar : this.f.values()) {
            if (sVar.a && sVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        for (s sVar : this.f.values()) {
            if (sVar.b && sVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("GmmNavigationState");
        for (String str : this.f.keySet()) {
            s sVar = (s) this.f.get(str);
            fVar.b("gmmPackage").a(new com.google.android.apps.gsa.shared.util.b.d(str, false));
            fVar.b("isNavigating").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(sVar.b), false));
            fVar.b("isFreenav").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(sVar.a), false));
            fVar.b("useAssistant").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(sVar.d), false));
            fVar.b("mAssumeForegroundedUntilMsec").a(new com.google.android.apps.gsa.shared.util.b.d(Long.valueOf(sVar.e), false));
        }
        fVar.b("isGmmNavigatingInTheForeground").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(f()), false));
        fVar.b("isGmmFreenavInTheForeground").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(c()), false));
    }

    public final boolean i() {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            if (((s) it.next()).d) {
                return true;
            }
        }
        return false;
    }
}
