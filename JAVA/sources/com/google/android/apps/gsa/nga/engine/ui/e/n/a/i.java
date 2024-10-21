package com.google.android.apps.gsa.nga.engine.ui.e.n.a;

import com.google.android.apps.gsa.nga.engine.ui.e.k.a.e;
import com.google.android.apps.gsa.nga.engine.ui.e.n.b.a;
import com.google.android.apps.gsa.nga.engine.ui.e.n.c;
import com.google.android.apps.gsa.nga.engine.ui.e.n.d;
import com.google.android.apps.gsa.nga.shared.ae.a.a.bt;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.f;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.libraries.gsa.h.h;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/a/i.class */
public class i implements com.google.android.apps.gsa.nga.engine.ui.e.i {
    private static final com.google.common.f.j g = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.n.a.i");
    public final h b;
    public final f c;
    public final f d;
    private final f h;
    private final a j;
    private final e k;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.s.e f776a = new com.google.android.apps.gsa.nga.shared.s.i(com.google.android.apps.gsa.nga.engine.ui.e.n.j.f787a, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    private final k i = new k();
    public final com.google.android.apps.gsa.nga.shared.s.e e = new com.google.android.apps.gsa.nga.shared.s.i(d.UNRECOGNIZED, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final k f = new k();

    public i(h hVar, f fVar, f fVar2, f fVar3, a aVar, e eVar) {
        this.b = hVar;
        this.c = fVar;
        this.d = fVar2;
        this.h = fVar3;
        this.j = aVar;
        this.k = eVar;
    }

    private final boolean p() {
        int i = ((com.google.android.apps.gsa.nga.engine.ui.e.c.a.d) this.d.c()).c.f;
        boolean z = i == 3;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final Long a(com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar) {
        return (Long) com.google.android.apps.gsa.nga.engine.ui.e.n.j.a(iVar).orElseGet(new f(this.j, 0));
    }

    final /* synthetic */ Long b() {
        return a((com.google.android.apps.gsa.nga.engine.ui.e.n.i) ((com.google.android.apps.gsa.nga.shared.s.i) this.f776a).b.get());
    }

    public final void c(boolean z) {
        com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) ((com.google.android.apps.gsa.nga.shared.s.i) this.f776a).b.get();
        com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar2 = com.google.android.apps.gsa.nga.engine.ui.e.n.j.f787a;
        if (iVar.b == 3) {
            com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar3 = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) ((com.google.android.apps.gsa.nga.shared.s.i) this.f776a).b.get();
            ba builder = (iVar3.b == 3 ? (com.google.android.apps.gsa.nga.engine.ui.e.n.h) iVar3.c : com.google.android.apps.gsa.nga.engine.ui.e.n.h.f785a).toBuilder();
            builder.copyOnWrite();
            ((com.google.android.apps.gsa.nga.engine.ui.e.n.h) builder.instance).d = z;
            com.google.android.apps.gsa.nga.engine.ui.e.n.h hVar = (com.google.android.apps.gsa.nga.engine.ui.e.n.h) builder.build();
            ba createBuilder = com.google.android.apps.gsa.nga.engine.ui.e.n.i.f786a.createBuilder();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar4 = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) createBuilder.instance;
            hVar.getClass();
            iVar4.c = hVar;
            iVar4.b = 3;
            o(createBuilder);
        }
    }

    public final void d() {
        this.b.n("[NGA] onAssistantExplicitDismissGesture", new e(this, 4));
    }

    public final void e() {
        this.b.n("[NGA] onAssistantImplicitDismissGesture", new e(this, 6));
    }

    public final void f(d dVar) {
        if (p() || l()) {
            this.e.b(dVar);
        }
    }

    public final void g() {
        if (p() || l()) {
            this.e.b(d.UNRECOGNIZED);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void h() {
        o(com.google.android.apps.gsa.nga.engine.ui.e.n.j.f787a.toBuilder());
        this.i.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void hm() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void i() {
        this.i.c(ad.i(this.d, this.k.b, this.e, new c(this)), new d(this, 2));
        this.i.c(this.e, new d(this, 3));
        this.i.c(ad.l(this.c, new h(1)), new d(this, 4));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void k() {
    }

    public final boolean l() {
        int i = ((com.google.android.apps.gsa.nga.engine.ui.e.c.a.d) this.d.c()).c.f;
        boolean z = i == 2;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean m() {
        return !p();
    }

    public final void n(int i) {
        if (((com.google.android.apps.gsa.nga.engine.ui.e.b.a) ((com.google.android.apps.gsa.nga.shared.s.i) this.c).b.get()).f(com.google.android.apps.gsa.shared.ab.k.c)) {
            return;
        }
        ba createBuilder = com.google.android.apps.gsa.nga.engine.ui.e.n.i.f786a.createBuilder();
        ba createBuilder2 = c.f781a.createBuilder();
        long longValue = a((com.google.android.apps.gsa.nga.engine.ui.e.n.i) ((com.google.android.apps.gsa.nga.shared.s.i) this.f776a).b.get()).longValue();
        createBuilder2.copyOnWrite();
        ((c) createBuilder2.instance).b = longValue;
        createBuilder2.copyOnWrite();
        ((c) createBuilder2.instance).c = i - 2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) createBuilder.instance;
        c cVar = (c) createBuilder2.build();
        cVar.getClass();
        iVar.c = cVar;
        iVar.b = 5;
        o(createBuilder);
    }

    public final void o(ba baVar) {
        boolean z = ((bt) ((com.google.android.apps.gsa.nga.shared.s.a) this.h).b()).b;
        baVar.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) baVar.instance;
        com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar2 = com.google.android.apps.gsa.nga.engine.ui.e.n.i.f786a;
        iVar.d = z;
        com.google.android.apps.gsa.nga.engine.ui.e.n.i iVar3 = (com.google.android.apps.gsa.nga.engine.ui.e.n.i) baVar.build();
        com.google.common.f.h d = g.d();
        d.ak(4824);
        d.s("Setting session to type: %s", com.google.android.apps.gsa.nga.engine.ui.e.n.f.a(iVar3.b));
        this.f776a.b(iVar3);
    }
}
