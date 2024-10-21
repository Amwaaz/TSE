package com.google.android.apps.gsa.eventlogger.a;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.af;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.util.s;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/eventlogger/a/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer f350a = 1000;
    public static volatile d b = new d();

    public static void a(p pVar) {
        synchronized (e.class) {
            try {
                d dVar = new d();
                dVar.f349a = ha.o(pVar.k(en.o));
                dVar.b = new s(",", ":").b(pVar.t(af.b));
                dVar.d = (int) pVar.i(af.f1400a);
                b = dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
