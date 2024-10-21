package com.google.android.apps.gsa.shared.util.c;

import com.google.common.f.j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.Future;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/ao.class */
public class ao {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1550a = j.i("com.google.android.apps.gsa.shared.util.c.ao");

    @Deprecated
    public static cn a(cn cnVar, long j, com.google.android.apps.gsa.shared.util.c.a.an anVar) {
        SettableFuture settableFuture = new SettableFuture();
        dl.y(cnVar, new an(settableFuture), com.google.common.util.concurrent.ay.a);
        b(settableFuture, j, anVar);
        return settableFuture;
    }

    @Deprecated
    public static void b(Future future, long j, com.google.android.apps.gsa.shared.util.c.a.an anVar) {
        anVar.b(new am(future, j), j);
    }
}
