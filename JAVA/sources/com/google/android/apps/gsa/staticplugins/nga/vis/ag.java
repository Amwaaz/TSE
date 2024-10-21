package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.core.ac.w;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.staticplugins.nga.l.e;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/vis/ag.class */
public final class ag implements e, w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1728a = new Object();
    private final Context b;
    private final a c;
    private final af d;
    private final h e;
    private boolean f;

    public ag(Context context, a aVar, h hVar) {
        this.b = context;
        this.c = aVar;
        this.d = new af(aVar);
        this.e = hVar;
    }

    public final void a() {
        boolean i = this.c.i(eu.es);
        synchronized (this.f1728a) {
            if (i) {
                if (!this.f) {
                    androidx.core.content.a.f(this.b, this.d, new IntentFilter("com.google.android.apps.gsa.ACTION_KILL_SEARCH"), null, 2);
                    this.f = true;
                }
            } else if (this.f) {
                this.b.unregisterReceiver(this.d);
                this.f = false;
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ac.w
    public final void d(i iVar) {
        if (iVar.a(eu.es.f1434a)) {
            a();
        }
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.e
    public final void i() {
        this.e.n("[NGA] SearchKillCommandReceiverRegister.onSearchProcessStart", new f(this) { // from class: com.google.android.apps.gsa.staticplugins.nga.vis.ae

            /* renamed from: a, reason: collision with root package name */
            public final ag f1726a;

            {
                this.f1726a = this;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                this.f1726a.a();
            }
        });
    }
}
