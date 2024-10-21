package com.google.android.apps.gsa.nga.engine.v.a;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/ao.class */
public final class ao extends c {

    /* renamed from: a, reason: collision with root package name */
    private final an f809a;
    private final y b;

    public ao(an anVar, y yVar, n nVar) {
        super(nVar);
        this.f809a = anVar;
        this.b = yVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.b.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        Optional optional;
        an anVar = this.f809a;
        synchronized (anVar.b) {
            optional = anVar.e;
        }
        return !optional.equals(this.b.c().c);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        Optional optional = this.b.c().c;
        an anVar = this.f809a;
        anVar.f808a.n("[NGA] Set primary account name", new am(anVar, optional));
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        an anVar = this.f809a;
        synchronized (anVar.b) {
            anVar.c.clear();
            anVar.e = Optional.empty();
            anVar.d = false;
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NgaUserAppFlowLogger";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 28;
    }
}
