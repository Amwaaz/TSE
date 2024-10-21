package com.google.android.apps.gsa.shared.util.n;

import com.google.common.f.a.e;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/n/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1567a = j.i("com.google.android.apps.gsa.shared.util.n.b");

    public static void a(c cVar) {
        c cVar2 = (c) a.b.getAndSet(cVar);
        if (cVar2 == null || cVar2.equals(cVar)) {
            return;
        }
        h f = f1567a.f();
        f.aj(e.a, "MutableApplctnProcess");
        h hVar = f;
        hVar.ak(9392);
        hVar.H("Mismatched process initialization: [%s] vs [%s]", cVar2, cVar);
        int i = com.google.android.apps.gsa.shared.util.b.h.a;
    }
}
