package com.google.android.apps.gsa.d;

import com.google.android.apps.gsa.s.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f339a = true;
    public static volatile com.google.android.apps.gsa.w.a b;
    public static final List c = new ArrayList(20);

    public static void a(f fVar) {
        if (f339a) {
            if (b != null) {
                b(b, fVar);
                return;
            }
            List list = c;
            synchronized (list) {
                if (list.size() < 20) {
                    list.add(fVar);
                }
            }
        }
    }

    public static void b(com.google.android.apps.gsa.w.a aVar, f fVar) {
        int i = fVar.aj;
        com.google.android.apps.gsa.s.a aVar2 = com.google.android.apps.gsa.s.a.ACTIVITY_ONCREATE_COUNT;
        c cVar = c.CLASSIC_USAGE_ANALYSIS;
        aVar.h(aVar2, cVar, cVar, i).g(1L);
    }
}
