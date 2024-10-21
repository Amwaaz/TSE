package com.google.android.apps.gsa.shared.logger;

import com.google.android.apps.gsa.shared.m.c;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1465a = j.i("com.google.android.apps.gsa.shared.logger.e");
    private final s b;

    public e(s sVar) {
        this.b = sVar;
    }

    @Deprecated
    public static void b(int i) {
        d dVar = new d(new com.google.android.apps.gsa.shared.m.a(29, 917507));
        dVar.b = i;
        dVar.c();
        dVar.b();
    }

    public final d a(c cVar) {
        return new c(cVar, this.b);
    }

    public final void c(Throwable th, int i) {
        d a2 = a(new com.google.android.apps.gsa.shared.m.a(th, 29, 917507));
        a2.b = i;
        a2.a();
    }
}
