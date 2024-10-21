package com.google.android.apps.gsa.nga.engine.e.b.a;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.j.a;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.speech.audio.a.j;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/e/b/a/i.class */
public final class i extends c {
    private static final com.google.common.f.a.d b = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final e f551a;
    private final h c;
    private final a d;
    private final com.google.android.apps.gsa.shared.util.q.a e;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d f;
    private final y g;
    private final ag h;

    public i(h hVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, e eVar, a aVar, com.google.android.apps.gsa.shared.util.q.a aVar2, y yVar, ag agVar, n nVar) {
        super(nVar);
        this.c = hVar;
        this.f = dVar;
        this.f551a = eVar;
        this.d = aVar;
        this.e = aVar2;
        this.g = yVar;
        this.h = agVar;
    }

    public final com.google.android.libraries.search.d.f a() {
        j c = this.f551a.c();
        if (c != null) {
            c.a();
        }
        j c2 = this.f551a.c();
        if (c2 != null) {
            c2.a();
        }
        boolean z = this.g.c().b;
        this.f.a().n();
        this.f.a().m();
        this.f.a().q();
        this.d.a();
        this.f551a.c();
        this.f.a().j();
        this.h.u(null, new com.google.android.apps.gsa.nga.shared.f.a.f(8), new com.google.android.apps.gsa.nga.shared.f.a.f(13)).orElse(false);
        this.e.i(eu.fd);
        if (this.f.a().n()) {
            return com.google.android.libraries.search.d.f.ROUTE_BLUETOOTH_REQUIRED;
        }
        if (!this.f.a().q() && !this.f.a().m()) {
            fl a2 = this.g.c().e.a();
            j c3 = this.f551a.c();
            String name = c3 != null ? c3.a.getName() : "";
            Stream stream = Collection._EL.stream(a2);
            String lowerCase = name.toLowerCase(this.g.c().d);
            lowerCase.getClass();
            if (!stream.anyMatch(new g(lowerCase)) && this.e.i(eu.fc) && ((!this.d.a() || this.e.i(eu.fd)) && !this.f.a().j())) {
                return com.google.android.libraries.search.d.f.ROUTE_BLUETOOTH_PREFERRED;
            }
        }
        return com.google.android.libraries.search.d.f.ROUTE_NO_AUDIO;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.g.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        com.google.common.f.a.a d = b.d();
        d.ak(2661);
        d.p("Initialize");
        return this.c.a("[NGA] BluetoothRouteHelper: initialized", new h(this));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return dl.n(com.google.android.apps.gsa.v.c.f1836a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "BluetoothRouteHelper";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 71;
    }
}
