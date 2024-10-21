package com.google.android.apps.gsa.nga.engine.am;

import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/f.class */
public final class f implements com.google.android.apps.gsa.nga.engine.ar.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f460a = new Object();
    private ah b;

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
        synchronized (this.f460a) {
            this.b = ahVar;
            ah.FULL_LISTENING.equals(this.b);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }
}
