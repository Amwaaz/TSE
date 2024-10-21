package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.shared.o.b;
import com.google.android.apps.gsa.search.shared.service.c.ev;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/p.class */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final af f395a;
    private boolean b;

    public p(af afVar) {
        this.f395a = afVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final /* synthetic */ void a(ev evVar) {
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final void b(boolean z) {
        if (this.b && !z) {
            this.f395a.c.set(false);
        }
        this.b = z;
    }
}
