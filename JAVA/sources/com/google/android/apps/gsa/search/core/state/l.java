package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.util.b.d;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/l.class */
public final class l extends ae {

    /* renamed from: a, reason: collision with root package name */
    public long f1305a;
    private final a b;

    public l(a aVar, a aVar2) {
        super(aVar, 69);
        this.f1305a = 0L;
        this.b = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.f1305a == 100;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return ((com.google.android.apps.gsa.search.core.state.d.q) this.b.a()).e.b.equals("search");
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ActiveSessionState");
        fVar.b("Current client session ID").a(new d(Long.valueOf(this.f1305a), false));
    }
}
