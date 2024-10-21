package com.google.android.apps.gsa.nga.engine.v;

import com.google.android.apps.gsa.nga.engine.ak.n.a;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.engine.v.a.j;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.android.apps.gsa.nga.shared.q.r;
import com.google.android.apps.gsa.shared.util.c.d;
import com.google.android.libraries.gsa.h.h;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/t.class */
public final class t extends c {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.n.e f815a;
    public final r b;
    public final af c;
    public final j d;
    private final h e;
    private final y f;

    public t(h hVar, af afVar, a aVar, j jVar, y yVar, n nVar) {
        super(nVar);
        this.b = new s(this);
        this.e = hVar;
        this.c = afVar;
        this.d = jVar;
        this.f = yVar;
        this.f815a = aVar.a(hVar, new d() { // from class: com.google.android.apps.gsa.nga.engine.v.q
            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                ((r) obj).a((bl) obj2);
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.f.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.e.a("[NGA] Subscribe NgaEventLogger listeners.", new r(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.e.a("[NGA] uninitialize", new r(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NgaEventLoggerSubscriber";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 29;
    }
}
