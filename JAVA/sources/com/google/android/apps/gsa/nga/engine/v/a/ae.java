package com.google.android.apps.gsa.nga.engine.v.a;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.common.util.concurrent.cn;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/ae.class */
public final class ae extends c {

    /* renamed from: a, reason: collision with root package name */
    private final d f806a;
    private final Set b;
    private final y c;

    public ae(d dVar, Set set, y yVar, n nVar) {
        super(nVar);
        this.f806a = dVar;
        this.b = set;
        this.c = yVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.c.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.f806a.a((b) it.next());
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.f806a.b((b) it.next());
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NgaFeedbackDumpInitializer";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 27;
    }
}
