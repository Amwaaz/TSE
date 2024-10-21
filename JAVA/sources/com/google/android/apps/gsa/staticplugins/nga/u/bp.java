package com.google.android.apps.gsa.staticplugins.nga.u;

import com.google.android.apps.gsa.nga.api.aq;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.staticplugins.nga.t.c;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/bp.class */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1716a;
    private final aq b;
    private final c c;
    private final p d;

    public bp(boolean z, aq aqVar, c cVar, p pVar) {
        this.f1716a = z;
        this.b = aqVar;
        this.c = cVar;
        this.d = pVar;
    }

    public final boolean a() {
        if (this.f1716a) {
            return false;
        }
        b();
        return false;
    }

    public final void b() {
        if (this.b.c()) {
            c cVar = this.c;
            p pVar = this.d;
            cVar.a();
            pVar.t(eu.kh);
        }
    }
}
