package com.google.android.apps.gsa.nga.shared.q.f.a;

import com.google.android.apps.gsa.nga.shared.q.f.a;
import com.google.common.base.ab;
import com.google.g.z.w.k;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/f/a/c.class */
final class c extends ab {
    protected final /* synthetic */ Object a(Object obj) {
        k kVar;
        a aVar = (a) obj;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            kVar = k.a;
        } else if (ordinal == 1) {
            kVar = k.b;
        } else {
            if (ordinal != 3) {
                throw new IllegalArgumentException("unknown enum value: ".concat(aVar.e));
            }
            kVar = k.c;
        }
        return kVar;
    }

    protected final /* synthetic */ Object b(Object obj) {
        a aVar;
        k kVar = (k) obj;
        a aVar2 = a.a;
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            aVar = a.a;
        } else if (ordinal == 1) {
            aVar = a.b;
        } else {
            if (ordinal != 2) {
                throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(kVar.d)));
            }
            aVar = a.d;
        }
        return aVar;
    }
}
