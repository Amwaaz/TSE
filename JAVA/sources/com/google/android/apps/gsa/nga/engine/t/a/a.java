package com.google.android.apps.gsa.nga.engine.t.a;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.e;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/t/a/a.class */
public final class a implements com.google.android.apps.gsa.nga.engine.g.a, e {

    /* renamed from: a, reason: collision with root package name */
    private final b f676a;
    private final y b;

    public a(y yVar, b bVar) {
        this.b = yVar;
        this.f676a = bVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final void O() {
        boolean z = this.b.c().f619a;
        b bVar = this.f676a;
        synchronized (bVar.f677a) {
            bVar.b = z;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.e
    public final void f(boolean z) {
        b bVar = this.f676a;
        synchronized (bVar.f677a) {
            bVar.d = false;
            bVar.c = z;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final /* synthetic */ void gX(ha haVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.e
    public final void h() {
        b bVar = this.f676a;
        synchronized (bVar.f677a) {
            bVar.d = true;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return getClass().getSimpleName();
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 26;
    }
}
