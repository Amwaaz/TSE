package com.google.android.apps.gsa.search.core.aa;

import com.google.android.apps.gsa.search.core.aa.a.c;
import m.h.b.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/aa/a.class */
final class a extends n implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    final c f1043a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(0);
        this.b = i;
        this.f1043a = cVar;
    }

    public final /* synthetic */ Object a() {
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            com.google.android.apps.gsa.search.core.aa.a.b a2 = this.f1043a.a();
            return Boolean.valueOf(a2 != null && a2.vf());
        }
        if (i == 1) {
            com.google.android.apps.gsa.search.core.aa.a.b a3 = this.f1043a.a();
            return Boolean.valueOf(a3 != null && a3.ve());
        }
        if (i == 2) {
            com.google.android.apps.gsa.search.core.aa.a.b a4 = this.f1043a.a();
            return Boolean.valueOf(a4 != null && a4.sH());
        }
        com.google.android.apps.gsa.search.core.aa.a.b a5 = this.f1043a.a();
        if (a5 == null || !a5.vd()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
