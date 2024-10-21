package com.google.android.apps.gsa.d.a;

import com.google.android.apps.gsa.s.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/a/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f340a = true;
    public static volatile com.google.android.apps.gsa.w.a b;
    public static final List c = new ArrayList(100);

    public static void a(b bVar) {
        if (f340a) {
            if (b != null) {
                b(b, bVar);
                return;
            }
            List list = c;
            synchronized (list) {
                if (list.size() < 100) {
                    list.add(bVar);
                }
            }
        }
    }

    public static void b(com.google.android.apps.gsa.w.a aVar, b bVar) {
        int i = bVar.bw;
        com.google.android.apps.gsa.s.a aVar2 = com.google.android.apps.gsa.s.a.MONET_FEATURE_ONCREATE_COUNT;
        c cVar = c.CLASSIC_USAGE_ANALYSIS;
        aVar.h(aVar2, cVar, cVar, i).g(1L);
    }
}
