package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.shared.q.d.bs;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/a.class */
final class a extends com.google.common.base.ab {
    protected final /* synthetic */ Object a(Object obj) {
        bs bsVar;
        com.google.common.o.p pVar = (com.google.common.o.p) obj;
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            bsVar = bs.a;
        } else if (ordinal == 1) {
            bsVar = bs.b;
        } else if (ordinal == 2) {
            bsVar = bs.c;
        } else if (ordinal == 3) {
            bsVar = bs.d;
        } else if (ordinal == 4) {
            bsVar = bs.e;
        } else {
            if (ordinal != 5) {
                throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(pVar.g)));
            }
            bsVar = bs.f;
        }
        return bsVar;
    }

    protected final /* synthetic */ Object b(Object obj) {
        com.google.common.o.p pVar;
        bs bsVar = (bs) obj;
        int ordinal = bsVar.ordinal();
        if (ordinal == 0) {
            pVar = com.google.common.o.p.a;
        } else if (ordinal == 1) {
            pVar = com.google.common.o.p.b;
        } else if (ordinal == 2) {
            pVar = com.google.common.o.p.c;
        } else if (ordinal == 3) {
            pVar = com.google.common.o.p.d;
        } else if (ordinal == 4) {
            pVar = com.google.common.o.p.e;
        } else {
            if (ordinal != 5) {
                throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(bsVar.g)));
            }
            pVar = com.google.common.o.p.f;
        }
        return pVar;
    }
}
