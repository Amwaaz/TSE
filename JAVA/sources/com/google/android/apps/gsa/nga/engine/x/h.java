package com.google.android.apps.gsa.nga.engine.x;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.android.a.f;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.op;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/x/h.class */
public final class h extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f829a;
    public final com.google.android.apps.gsa.shared.util.q.a b;
    public final f c;
    public final d d;
    public final com.google.android.apps.gsa.nga.engine.m.d e;
    public final com.google.android.libraries.gsa.h.h f;
    public final Object g;
    public Optional h;
    public final x i;
    private final com.google.android.libraries.gsa.h.h j;
    private final y k;

    public h(Context context, com.google.android.apps.gsa.shared.util.q.a aVar, y yVar, f fVar, d dVar, com.google.android.apps.gsa.nga.engine.m.d dVar2, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, n nVar, x xVar) {
        super(nVar, new op(Integer.valueOf(eu.ek.f1434a)));
        this.g = new Object();
        this.h = Optional.empty();
        this.f829a = context;
        this.b = aVar;
        this.k = yVar;
        this.c = fVar;
        this.d = dVar;
        this.e = dVar2;
        this.f = hVar;
        this.j = hVar2;
        this.i = xVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.k.c().f619a && this.b.i(eu.ek);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.j.a("[NGA] NgaInteractorMemoryMonitor.initialize", new f(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.j.a("[NGA] NgaInteractorMemoryMonitor.uninitialize", new f(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NgaInteractorMemoryMonitor";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 30;
    }
}
