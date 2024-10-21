package com.google.android.apps.gsa.nga.engine.an;

import com.google.android.apps.gsa.nga.shared.ab.f;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.h.a;
import j$.util.Collection;
import java.util.HashMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/an/v.class */
public final class v implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f464a = new Object();
    public final HashMap b = new HashMap();
    public final f c;

    public v(f fVar) {
        this.c = fVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f464a) {
            Collection._EL.stream(this.b.keySet()).sorted().forEach(new t(this, sb, 0));
        }
        fVar.a("Nga Mdd Lib information").a(new d(sb.toString(), false));
        fVar.a("Nga Mdd Lib hash").a(new d(Long.valueOf(a.b(sb.toString())), false));
    }
}
