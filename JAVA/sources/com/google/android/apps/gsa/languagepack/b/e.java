package com.google.android.apps.gsa.languagepack.b;

import android.os.Build;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.as;
import com.google.android.apps.gsa.speech.o.i;
import com.google.android.libraries.mdi.download.n;
import com.google.android.libraries.mdi.download.t;
import com.google.ap.e.c.b.aa;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/languagepack/b/e.class */
public final class e implements e.c.d {
    public static n b() {
        n a2 = d.a();
        a2.getClass();
        return a2;
    }

    public static Optional c() {
        return Optional.of(Build.FINGERPRINT);
    }

    public static Map d(boolean z, i iVar) {
        HashMap hashMap = new HashMap();
        if (z) {
            for (aa aaVar : iVar.a().p) {
                String str = aaVar.b;
                t tVar = aaVar.c;
                t tVar2 = tVar;
                if (tVar == null) {
                    tVar2 = t.f3288a;
                }
                hashMap.put(str, tVar2);
            }
        }
        return hashMap;
    }

    public static boolean e(p pVar) {
        return pVar.w(as.f1404a);
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
