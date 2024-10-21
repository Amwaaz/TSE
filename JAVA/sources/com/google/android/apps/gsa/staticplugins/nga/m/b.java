package com.google.android.apps.gsa.staticplugins.nga.m;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.q.a.k;
import com.google.android.apps.gsa.nga.shared.q.h;
import com.google.android.apps.gsa.search.core.google.gaia.b.a.c;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.o.bl;
import com.google.common.o.qn;
import com.google.common.util.concurrent.cn;
import com.google.common.v.f;
import com.google.g.z.w.q;
import kotlinx.coroutines.ag;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/m/b.class */
public final class b implements h, com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f1695a;
    private final f b;
    private final Context c;
    private final a d;
    private final ag e;
    private final d f;
    private final k g;

    public b(f fVar, Context context, a aVar, ag agVar, c cVar, d dVar) {
        fVar.getClass();
        context.getClass();
        aVar.getClass();
        agVar.getClass();
        cVar.getClass();
        dVar.getClass();
        this.b = fVar;
        this.c = context;
        this.d = aVar;
        this.e = agVar;
        this.f1695a = cVar;
        this.f = dVar;
        dVar.a(this);
        this.g = new k(fVar, context, aVar, agVar);
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final q a() {
        return this.g.g;
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final cn b() {
        return this.g.a(new a(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final cn c() {
        return this.g.b(new a(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final void d() {
        this.g.f(new a(this, 2));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("TngStateDump");
        q qVar = this.g.g;
        qn qnVar = fVar.c;
        qnVar.copyOnWrite();
        bl blVar = qnVar.instance;
        bl blVar2 = bl.a;
        qVar.getClass();
        blVar.q = qVar;
        blVar.b |= 1024;
    }
}
