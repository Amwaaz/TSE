package com.google.android.apps.gsa.nga.engine.viss;

import android.os.IBinder;
import com.google.android.apps.gsa.nga.engine.ak.v.a.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/viss/y.class */
final class y implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f820a;
    final aa b;

    public y(aa aaVar, IBinder iBinder) {
        this.b = aaVar;
        this.f820a = iBinder;
    }

    public final void a() {
        aa aaVar = this.b;
        if (aaVar.e == null) {
            com.google.common.f.a.a f = aa.f817a.f();
            f.ak(5046);
            f.p("#onSearchProcessDied: currentDeathRecipient is not set");
        } else {
            aaVar.e = null;
            ((v) aaVar.c.a()).b();
            e eVar = (e) aaVar.d.a();
            eVar.b.n("[NGA] notify search process status listeners on death", new com.google.android.apps.gsa.nga.engine.ak.v.a.a(eVar));
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.b.b.n("[NGA] ClientDeathRecipient.binderDied", new x(this));
    }
}
