package com.google.android.apps.gsa.nga.engine.ae;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;
import java.io.Closeable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/aq.class */
public final class aq extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f408a = d.j();
    public final Context b;
    public final h c;
    public final com.google.android.apps.gsa.nga.shared.n.e d;
    public final com.google.android.apps.gsa.nga.shared.n.e e;
    public final a f;
    public final BroadcastReceiver g;
    public final ca h;
    public Optional i;
    public Optional j;
    public Closeable k;
    public final ad l;
    public final af m;
    private final h n;
    private final y o;

    public aq(Context context, h hVar, ad adVar, com.google.android.apps.gsa.nga.shared.n.k kVar, com.google.android.apps.gsa.nga.shared.n.k kVar2, af afVar, n nVar, y yVar, a aVar, aw awVar) {
        super(nVar);
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = new ah(2);
        this.b = context;
        this.c = hVar;
        this.l = adVar;
        h a2 = awVar.a(an.class);
        this.n = a2;
        this.d = kVar.a(a2, new aj(0));
        this.e = kVar2.a(a2, new aj(2));
        this.m = afVar;
        this.o = yVar;
        this.f = aVar;
        this.g = new com.google.android.apps.gsa.nga.shared.android.m(new ak(this, 0), aVar, eu.bS);
        this.h = cl.d(new am(context));
    }

    public final ac a() {
        ad adVar = this.l;
        return new ac(adVar.d(), adVar.e(), adVar.b());
    }

    public final void c(ac acVar) {
        this.n.n("[NGA] notifyListeners", new ae(this, acVar, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.o.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.n.a("[NGA] initialize", new g(this, 4));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.c.a("[NGA] uninitialize", new com.google.android.libraries.gsa.h.c(this) { // from class: com.google.android.apps.gsa.nga.engine.ae.al

            /* renamed from: a, reason: collision with root package name */
            public final aq f406a;

            {
                this.f406a = this;
            }

            @Override // com.google.android.libraries.gsa.h.c
            public final Object a() {
                aq aqVar = this.f406a;
                aqVar.b.unregisterReceiver(aqVar.g);
                aqVar.k.close();
                return com.google.android.apps.gsa.v.c.f1836a;
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "ScreenStateObservable";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 36;
    }
}
