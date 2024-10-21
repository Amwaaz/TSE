package com.google.android.apps.gsa.shared.b.a;

import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/p.class */
final class p extends m.h.b.n implements m.h.a.l {

    /* renamed from: a, reason: collision with root package name */
    final String f1385a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(1);
        this.f1385a = str;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        com.google.common.f.h g = u.f1390a.e().g(th);
        g.ak(8622);
        g.s("Error while submitting: %s.", this.f1385a);
        return w.a;
    }
}
