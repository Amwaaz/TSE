package com.google.android.apps.gsa.search.core.u;

import com.google.android.apps.gsa.search.core.h.r;
import com.google.android.apps.gsa.shared.logger.b.o;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.w.a;
import e.c.d;
import java.util.Random;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/u/c.class */
public final class c implements d {
    public static a b(o oVar, e.a aVar, com.google.android.libraries.g.a aVar2, com.google.android.apps.gsa.shared.util.m.b bVar) {
        a bVar2 = new com.google.android.apps.gsa.w.a.b(aVar, aVar2, bVar);
        a aVar3 = bVar2;
        if (new Random().nextDouble() < 0.01d) {
            aVar3 = new a(bVar2);
            oVar.a(aVar3);
        }
        k.a().i = aVar3.f(com.google.android.apps.gsa.s.a.EVENT_LOGGER_RECORD_MICROS, com.google.android.apps.gsa.s.c.EVENT_LOGGER);
        r.e = aVar3;
        return aVar3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
