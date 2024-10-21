package com.google.android.apps.gsa.nga.engine.aj.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.aj.c;
import com.google.android.apps.gsa.nga.engine.aj.i;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.libraries.g.a;
import com.google.common.b.dq;
import com.google.common.b.fg;
import com.google.common.b.fl;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/aj/a/d.class */
public final class d extends c {
    protected final a d;
    private final Map e;
    private final Map f;
    private final AtomicBoolean g;
    private final af h;

    public d(Context context, a aVar, i iVar, af afVar) {
        super(context, iVar, new com.google.android.apps.gsa.nga.engine.aj.a(aVar, com.google.android.apps.gsa.nga.engine.aj.a.c, com.google.android.apps.gsa.nga.engine.aj.a.d));
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new AtomicBoolean(false);
        this.d = aVar;
        this.h = afVar;
    }

    private final void e(Context context, int i, String str) {
        this.e.put(Integer.valueOf(i), new a(context, this.d, i, str));
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.c
    public final fl a() {
        dq c = dq.c(this.e.values(), this.f.values());
        fg fgVar = new fg(4);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            fgVar.i(((e) it.next()).a());
        }
        return fgVar.g();
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.c
    public final void b() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.c
    public final void c() {
        if (this.g.getAndSet(true)) {
            return;
        }
        this.e.clear();
        this.f.clear();
        e(this.f416a, 10, "linear acceleration");
        e(this.f416a, 11, "rotation vector");
        e(this.f416a, 15, "game rotation vector");
        e(this.f416a, 4, "gyroscope");
        e(this.f416a, 8, "proximity");
        this.f.put(25, new h(this.f416a, this.d, new c(this), this.h));
        Collection._EL.stream(this.e.values()).forEach(new b(1));
        Collection._EL.stream(this.f.values()).forEach(new b(0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.c
    public final void d() {
        if (this.g.getAndSet(false)) {
            Collection._EL.stream(this.e.values()).forEach(new b(2));
            Collection._EL.stream(this.f.values()).forEach(new b(3));
        }
    }
}
