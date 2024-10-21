package com.google.android.apps.gsa.search.core.h;

import com.google.common.b.ha;
import com.google.common.b.nr;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/i.class */
public final class i {

    /* renamed from: a */
    public static final i f1123a;
    public final ha b;
    public final ha c;

    static {
        nr nrVar = nr.a;
        f1123a = new i(nrVar, nrVar);
    }

    public i(ha haVar, ha haVar2) {
        this.b = haVar;
        this.c = haVar2;
    }

    public final boolean a(int i) {
        ha haVar = this.c;
        Integer valueOf = Integer.valueOf(i);
        return haVar.contains(valueOf) || this.b.contains(valueOf);
    }
}
