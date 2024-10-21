package com.google.android.apps.gsa.search.core.service.a.a;

import android.os.Build;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.ae;
import com.google.android.apps.gsa.shared.util.c.a.q;
import com.google.android.apps.gsa.shared.util.c.a.w;
import com.google.android.apps.gsa.shared.util.c.a.x;
import com.google.android.libraries.gsa.h.h;
import e.c.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/a/a/e.class */
public final class e implements d {
    public static q b(x xVar, q qVar, p pVar) {
        int i = Build.VERSION.SDK_INT;
        int i2 = (int) pVar.i(ae.b);
        int i3 = (int) pVar.i(ae.f1399a);
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) xVar.f1540a.a();
        aVar.getClass();
        q qVar2 = (q) xVar.b.a();
        qVar2.getClass();
        qVar.getClass();
        return new w(aVar, qVar2, qVar, i2, i3, i < 34);
    }

    public static h c(e.a aVar) {
        return new com.google.android.apps.gsa.shared.util.c.a.p(com.google.android.apps.gsa.search.core.service.a.a.class, (q) aVar.a());
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
