package com.google.android.apps.gsa.nga.engine.t;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/t/f.class */
public abstract class f extends c {

    /* renamed from: a, reason: collision with root package name */
    private final y f680a;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(n nVar, y yVar) {
        super(nVar);
        this.f680a = yVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f(n nVar, y yVar, ha haVar) {
        super(nVar, haVar);
        this.f680a = yVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        boolean z = this.f680a.c().b;
        return false;
    }
}
