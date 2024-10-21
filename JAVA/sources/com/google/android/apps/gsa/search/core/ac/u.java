package com.google.android.apps.gsa.search.core.ac;

import com.google.android.apps.gsa.shared.k.d;
import com.google.android.apps.gsa.shared.k.e;
import com.google.android.apps.gsa.shared.k.f;
import com.google.android.apps.gsa.shared.k.g;
import com.google.android.apps.gsa.shared.k.h;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.ha;
import com.google.common.b.qj;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ac/u.class */
public final /* synthetic */ class u {
    public static fu a(ha haVar) {
        fq fqVar = new fq(4);
        qj j = haVar.j();
        while (j.hasNext()) {
            Object next = j.next();
            if (next instanceof d) {
                fqVar.i(Integer.valueOf(((d) next).f1434a), next);
            } else if (next instanceof f) {
                fqVar.i(Integer.valueOf(((f) next).f1451a), next);
            } else if (next instanceof e) {
                fqVar.i(Integer.valueOf(((e) next).f1441a), next);
            } else if (next instanceof h) {
                fqVar.i(Integer.valueOf(((h) next).f1453a), next);
            } else {
                if (!(next instanceof g)) {
                    throw new AssertionError("Incompatible param: ".concat(String.valueOf(String.valueOf(next))));
                }
                fqVar.i(Integer.valueOf(((g) next).f1452a), next);
            }
        }
        return fqVar.h(false);
    }
}
