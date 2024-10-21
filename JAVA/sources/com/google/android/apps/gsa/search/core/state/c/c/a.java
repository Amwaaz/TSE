package com.google.android.apps.gsa.search.core.state.c.c;

import com.google.android.apps.gsa.search.core.state.bk;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/c/c/a.class */
public final class a extends com.google.android.apps.gsa.search.core.m.a.a implements com.google.android.apps.gsa.search.core.m.a.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk f1259a;

    public a(bk bkVar) {
        this.f1259a = bkVar;
    }

    @Override // com.google.android.apps.gsa.search.core.m.a.c.a
    public final void a(Query query) {
        bk bkVar = this.f1259a;
        if (bkVar.m.co(query)) {
            Query av = bkVar.m.av();
            ab abVar = e.a;
            bkVar.m = bkVar.n(av);
        }
    }
}
