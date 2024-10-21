package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.a.b;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/af.class */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public b f1231a;
    private final a b;
    private final a c;

    public af(a aVar, a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    public final b a() {
        return b(((com.google.android.apps.gsa.search.core.state.d.q) this.c.a()).e.b);
    }

    public final b b(String str) {
        if (!str.equals("search")) {
            return (b) this.b.a();
        }
        b bVar = this.f1231a;
        bVar.getClass();
        return bVar;
    }
}
