package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.util.concurrent.cr;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final cr f1529a;
    public final cr b;
    public final cr c;
    public final cr d;
    private final com.google.android.apps.gsa.shared.o.a.a e;

    public g(cr crVar, cr crVar2, cr crVar3, cr crVar4, com.google.android.apps.gsa.shared.o.a.a aVar) {
        this.f1529a = crVar;
        this.b = crVar2;
        this.c = crVar3;
        this.d = crVar4;
        this.e = aVar;
    }

    public final cr a(String str, cr crVar) {
        return this.e.b() ? new f(str, crVar, this.e) : crVar;
    }
}
