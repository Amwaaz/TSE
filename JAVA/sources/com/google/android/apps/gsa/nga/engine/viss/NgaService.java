package com.google.android.apps.gsa.nga.engine.viss;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.nga.shared.aj.a.c;
import com.google.android.apps.gsa.nga.shared.ak.j;
import com.google.android.apps.gsa.shared.ai.b;
import com.google.common.f.a.d;
import h.a.a.p.b.a.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/viss/NgaService.class */
public class NgaService extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f816a = d.j();
    public e.a A;
    public e.a B;
    public e.a C;
    public e.a D;
    public e.a E;
    public e.a F;
    public j H;
    public e.a b;
    public e.a c;
    public e.a d;
    public e.a e;
    public e.a f;
    public e.a g;
    public e.a h;
    public e.a i;
    public e.a j;
    public e.a k;
    public e.a l;
    public e.a m;
    public e.a n;
    public e.a o;
    public e.a p;
    public e.a q;
    public e.a r;
    public e.a s;
    public e.a t;
    public e.a u;
    public e.a v;
    public e.a w;
    public e.a x;
    public e.a y;
    public e.a z;
    public final Object G = new Object();
    public long I = -1;
    private final com.google.android.apps.gsa.nga.api.u J = new com.google.android.apps.gsa.nga.api.u(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.J;
    }

    @Override // android.app.Service
    public final void onCreate() {
        e.h(8);
        super.onCreate();
        r rVar = (r) com.google.android.apps.gsa.nga.c.a.a(this);
        if (rVar == null) {
            stopSelf();
        } else {
            rVar.ZT(this);
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        synchronized (this.G) {
            j jVar = this.H;
            if (jVar != null) {
                f.I(((c) this.g.a()).c, jVar);
                this.H = null;
            }
        }
        return super.onUnbind(intent);
    }
}
