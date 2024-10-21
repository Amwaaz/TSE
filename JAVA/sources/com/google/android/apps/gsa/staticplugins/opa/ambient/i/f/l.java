package com.google.android.apps.gsa.staticplugins.opa.ambient.i.f;

import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.util.q.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/i/f/l.class */
public final class l {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? "ERROR" : "VALUE";
    }

    public static boolean b(c cVar) {
        return d(cVar.w(bc.r), cVar.t(bc.s));
    }

    public static boolean c(a aVar) {
        return d(aVar.i(bc.r), aVar.h(bc.s));
    }

    public static boolean d(boolean z, String str) {
        return z && str != null && str.startsWith("1efd4ccd4f61g3ff3c2b3254b99abfx6_$_");
    }
}
