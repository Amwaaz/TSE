package com.google.android.apps.gsa.shared.util.n;

import com.google.android.libraries.ao.g;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/n/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final AtomicReference f1566a = new AtomicReference(null);
    static final AtomicReference b = new AtomicReference(null);

    public static c a() {
        c cVar = (c) b.get();
        c cVar2 = cVar;
        if (cVar == null) {
            String str = (String) f1566a.get();
            String str2 = str;
            if (str == null) {
                str2 = g.b();
            }
            c cVar3 = c.DEFAULT;
            if (str2 != null) {
                for (c cVar4 : c.values()) {
                    if (cVar4.p.equals(str2)) {
                        cVar2 = cVar4;
                        break;
                    }
                }
            }
            cVar2 = null;
            b.set(cVar2);
        }
        cVar2.getClass();
        return cVar2;
    }
}
