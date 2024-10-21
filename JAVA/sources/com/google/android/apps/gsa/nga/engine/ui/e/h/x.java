package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.android.apps.gsa.nga.shared.ae.a.b.u;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/x.class */
public class x implements com.google.android.apps.gsa.nga.engine.ak.v.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f762a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.h.x");
    public final com.google.android.apps.gsa.nga.shared.s.e b = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final com.google.android.apps.gsa.nga.shared.s.e c = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final com.google.android.libraries.gsa.h.h d;
    public final com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.f e;
    public com.google.android.apps.gsa.nga.api.k f;
    public final com.google.android.apps.gsa.nga.engine.ak.v.a.e g;
    private final com.google.android.apps.gsa.nga.engine.ar.b.b.d h;

    public x(com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.f fVar, com.google.android.apps.gsa.nga.engine.ar.b.b.d dVar, com.google.android.apps.gsa.nga.engine.ak.v.a.e eVar) {
        this.d = hVar;
        this.e = fVar;
        this.h = dVar;
        this.g = eVar;
    }

    public final void a() {
        com.google.common.f.h d = f762a.d();
        d.ak(4747);
        d.p("clearCallbackInternal");
        ba createBuilder = com.google.android.apps.gsa.nga.shared.ae.a.b.s.a.createBuilder();
        u uVar = u.a;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.ae.a.b.s sVar = createBuilder.instance;
        uVar.getClass();
        sVar.c = uVar;
        sVar.b = 2;
        this.e.b(createBuilder.build());
        this.b.b(false);
        this.c.b(false);
        this.f = null;
        this.g.b(this);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final /* synthetic */ void c() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final void e() {
        com.google.common.f.h d = f762a.d();
        d.ak(4753);
        d.p("onSearchProcessDied");
        this.h.d();
        this.d.n("[NGA] NgaRemoteAssistUiController.onSearchProcessDied", new w(this, 0));
    }
}
