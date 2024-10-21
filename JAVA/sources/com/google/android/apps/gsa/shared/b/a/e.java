package com.google.android.apps.gsa.shared.b.a;

import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.db;
import kotlinx.coroutines.b.dc;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/e.class */
final class e extends m.h.b.n implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    final u f1374a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u uVar) {
        super(0);
        this.f1374a = uVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        kotlinx.coroutines.b.d dVar = new kotlinx.coroutines.b.d(new d(this.f1374a, null));
        int i = dc.a;
        return cp.e(dVar, this.f1374a.j, db.b, 1);
    }
}
