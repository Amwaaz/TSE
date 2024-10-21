package com.google.android.apps.gsa.nga.engine.ui.e.k.a;

import com.google.android.apps.gsa.nga.engine.ui.e.i;
import com.google.android.apps.gsa.nga.engine.ui.e.r.a.p;
import com.google.android.apps.gsa.nga.shared.ae.a.a.bk;
import com.google.android.apps.gsa.nga.shared.ae.a.a.cp;
import com.google.android.apps.gsa.nga.shared.ae.a.a.d;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/k/a/e.class */
public class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f767a = j.i("com.google.android.apps.gsa.nga.engine.ui.e.k.a.e");
    public final h c;
    public final a d;
    public SettableFuture e;
    private final com.google.android.apps.gsa.nga.engine.ui.e.c.a.e f;
    private final p h;
    public final com.google.android.apps.gsa.nga.shared.s.e b = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    private final k g = new k();

    public e(h hVar, com.google.android.apps.gsa.nga.engine.ui.e.c.a.e eVar, p pVar, a aVar) {
        this.c = hVar;
        this.f = eVar;
        this.h = pVar;
        this.d = aVar;
    }

    public final cn a() {
        SettableFuture settableFuture = new SettableFuture();
        this.e = settableFuture;
        this.c.n("[NGA] restoreUiAfterScreenshot", new b(this, settableFuture));
        return settableFuture;
    }

    public final void b() {
        SettableFuture settableFuture = this.e;
        if (settableFuture == null || settableFuture.isDone()) {
            return;
        }
        this.e.cancel(true);
        this.e = null;
    }

    public final void c() {
        SettableFuture settableFuture = this.e;
        if (settableFuture == null || settableFuture.isDone()) {
            return;
        }
        this.e.n(c.f1836a);
        this.e = null;
    }

    public final void d() {
        this.c.n("[NGA] restoreUiAfterScreenshot", new a(this));
    }

    public final void e(boolean z) {
        ba createBuilder = cp.a.createBuilder();
        createBuilder.copyOnWrite();
        cp cpVar = createBuilder.instance;
        cpVar.b |= 1;
        cpVar.c = z;
        cp build = createBuilder.build();
        com.google.common.f.h d = p.f797a.d();
        d.ak(4886);
        d.p("setUiDisplayConfig");
        ba createBuilder2 = d.a.createBuilder();
        createBuilder2.copyOnWrite();
        d dVar = createBuilder2.instance;
        build.getClass();
        dVar.c = build;
        dVar.b = 6;
        this.h.c(bk.a(createBuilder2.build()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void h() {
        this.g.a();
        b();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void hm() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void i() {
        this.g.c(this.f.c(), new d(this));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void k() {
    }
}
