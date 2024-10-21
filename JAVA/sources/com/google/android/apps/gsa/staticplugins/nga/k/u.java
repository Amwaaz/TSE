package com.google.android.apps.gsa.staticplugins.nga.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.util.n.c;
import com.google.common.base.ca;
import com.google.common.base.cl;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/k/u.class */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1691a = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.nga.k.u");
    public final com.google.android.libraries.gsa.h.h b;
    public final e.a c;
    public final e.a d;
    public final e.a e;
    public Binder f;
    private final Context j;
    private final ca n;
    private final e.a o;
    private final Deque m = new ArrayDeque();
    public com.google.android.apps.gsa.nga.api.v g = null;
    public boolean h = false;
    private boolean p = false;
    final ServiceConnection i = new t(this);
    private final boolean k = true;
    private final boolean l = true;

    public u(Context context, com.google.android.libraries.gsa.h.h hVar, e.a aVar, e.a aVar2, e.a aVar3, final e.a aVar4, e.a aVar5) {
        this.j = context;
        this.b = hVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.o = aVar5;
        this.n = cl.d(new ca(aVar4) { // from class: com.google.android.apps.gsa.staticplugins.nga.k.s

            /* renamed from: a, reason: collision with root package name */
            public final e.a f1689a;

            {
                this.f1689a = aVar4;
            }

            public final Object a() {
                return Boolean.valueOf(c.SEARCH.equals(this.f1689a.a()));
            }
        });
    }

    public final void a(com.google.android.apps.gsa.nga.api.v vVar) {
        while (!this.m.isEmpty()) {
            try {
                ((a) this.m.pop()).a(vVar);
            } catch (RemoteException e) {
                a.a.dB(f1691a.f(), "Call to INgaService failed", (char) 15118, e);
            }
        }
    }

    public final void b(a aVar) {
        this.b.n("[NGA] sendEligibilityMessage", new r(this, aVar, 1));
    }

    public final void c(a aVar) {
        if (this.l && !((Boolean) this.n.a()).booleanValue()) {
            com.google.common.f.h f = f1691a.f();
            f.ak(15120);
            f.p("Using NgaInteractorConnection outside of :search is not allowed.");
            return;
        }
        if (this.k) {
            this.m.add(aVar);
            com.google.android.apps.gsa.nga.api.v vVar = this.g;
            if (this.h && vVar != null) {
                a(vVar);
                return;
            }
            if (this.p) {
                return;
            }
            this.p = true;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.j, "com.google.android.apps.gsa.nga.engine.viss.NgaService"));
            intent.setPackage("com.google.android.googlequicksearchbox");
            if (!this.j.bindService(intent, this.i, 1)) {
                com.google.common.f.h e = f1691a.e();
                e.ak(15122);
                e.p("Unable to bind to NgaService");
            }
        }
    }

    public final void d(a aVar) {
        this.b.n("[NGA] sendMessageIfEligible", new r(this, aVar, 0));
    }

    public final void e(a aVar) {
        this.b.n("[NGA] sendMessageIfNgaEnabled", new q(this, aVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(a aVar) {
        this.b.n("[NGA] sendVisEventMessage", new q(this, aVar, 1));
    }
}
