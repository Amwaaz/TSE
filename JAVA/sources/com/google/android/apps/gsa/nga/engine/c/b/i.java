package com.google.android.apps.gsa.nga.engine.c.b;

import com.google.android.apps.gsa.nga.engine.ae.q;
import com.google.android.apps.gsa.nga.engine.c.h;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.search.assistant.appactions.d.e.e;
import com.google.android.libraries.search.assistant.appactions.d.e.g;
import com.google.android.libraries.search.assistant.n.a.a.j;
import com.google.android.libraries.search.assistant.n.a.a.k;
import com.google.android.libraries.search.assistant.n.a.d.al;
import com.google.android.libraries.search.assistant.n.a.d.u;
import com.google.android.libraries.search.assistant.n.a.d.x;
import com.google.apps.tiktok.account.data.ah;
import com.google.apps.tiktok.tracing.au;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/b/i.class */
public final class i extends f implements com.google.android.libraries.search.assistant.n.a.a.b, com.google.android.apps.gsa.nga.engine.c.i, c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f522a = d.j();
    private static final al d;
    public final q b;
    public final h c;
    private final Executor e;
    private final b f;
    private final a g;
    private final dj h;
    private final AtomicReference i;
    private final y j;

    static {
        ba createBuilder = al.f4849a.createBuilder();
        createBuilder.copyOnWrite();
        al alVar = (al) createBuilder.instance;
        alVar.b |= 2;
        alVar.d = true;
        ba createBuilder2 = u.f4874a.createBuilder();
        createBuilder2.copyOnWrite();
        u uVar = (u) createBuilder2.instance;
        uVar.b = 3;
        uVar.c = 391179243;
        createBuilder.copyOnWrite();
        al alVar2 = (al) createBuilder.instance;
        u uVar2 = (u) createBuilder2.build();
        uVar2.getClass();
        alVar2.c = uVar2;
        alVar2.b |= 1;
        d = (al) createBuilder.build();
    }

    public i(n nVar, y yVar, h hVar, Executor executor, b bVar, q qVar, a aVar, dj djVar) {
        super(nVar, yVar);
        this.i = new AtomicReference(Optional.empty());
        this.j = yVar;
        this.c = hVar;
        this.f = bVar;
        this.e = executor;
        this.b = qVar;
        this.g = aVar;
        this.h = djVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.c.b.c
    public final cn a(com.google.android.libraries.search.assistant.appactions.d.e.f fVar) {
        fl g;
        e eVar = fVar.c;
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = e.a;
        }
        if (eVar2.b.size() > 0) {
            e eVar3 = fVar.c;
            e eVar4 = eVar3;
            if (eVar3 == null) {
                eVar4 = e.a;
            }
            g = fl.m(eVar4.b);
        } else {
            g = this.b.i.w().g();
        }
        Optional optional = (Optional) this.i.get();
        return optional.isEmpty() ? dl.n(g.a) : com.google.apps.tiktok.tracing.contrib.c.e.g(this.f.a((String) optional.get())).h(new d(this, g, optional), this.e).e(ah.class, new f(1), this.e);
    }

    @Override // com.google.android.libraries.search.assistant.n.a.a.c
    public final /* synthetic */ com.google.android.libraries.search.assistant.n.a.a.d b(x xVar, com.google.android.libraries.search.assistant.n.a.a.g gVar) {
        return k.d(this, xVar, gVar);
    }

    @Override // com.google.android.libraries.search.assistant.n.a.a.c
    public final /* synthetic */ j c() {
        return null;
    }

    @Override // com.google.android.libraries.search.assistant.n.a.a.c
    public final al e() {
        return d;
    }

    @Override // com.google.android.libraries.search.assistant.n.a.a.b
    public final cn f(x xVar) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.libraries.search.assistant.appactions.d.e.f.b);
        xVar.d(bgVar);
        Object l = ((bd) xVar).br.l(bgVar.d);
        return com.google.common.util.concurrent.i.g(a((com.google.android.libraries.search.assistant.appactions.d.e.f) (l == null ? bgVar.b : bgVar.c(l))), ex.b(new f(3)), this.e);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        return !((Optional) this.i.get()).equals(this.j.c().c);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        Optional optional = this.j.c().c;
        this.i.set(optional);
        if (optional.isEmpty()) {
            return com.google.android.apps.gsa.v.c.b;
        }
        this.c.b(this);
        au e = this.h.e("ShortcutsContextProvider#initialize");
        try {
            com.google.apps.tiktok.tracing.contrib.c.e e2 = com.google.apps.tiktok.tracing.contrib.c.e.g(this.f.a((String) optional.get())).i(new e(0), this.e).h(new f(0), this.e).e(ah.class, new f(2), this.e);
            if (e != null) {
                e.close();
            }
            return e2;
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        Optional optional = (Optional) this.i.get();
        if (optional.isEmpty()) {
            return com.google.android.apps.gsa.v.c.b;
        }
        this.c.c(this);
        au e = this.h.e("ShortcutsContextProvider#uninitialize");
        try {
            com.google.apps.tiktok.tracing.contrib.c.e h = com.google.apps.tiktok.tracing.contrib.c.e.g(this.f.a((String) optional.get())).i(new e(2), this.e).h(new f(4), this.e);
            if (e != null) {
                e.close();
            }
            return h;
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.libraries.search.assistant.n.a.a.b
    public final /* synthetic */ cn j(x xVar, com.google.android.libraries.search.assistant.n.a.a.g gVar) {
        return f(xVar);
    }

    @Override // com.google.android.libraries.mdi.c.a.h
    public final void k() {
        cn h;
        if (this.g.i(eu.lw)) {
            Optional optional = (Optional) this.i.get();
            if (optional.isEmpty()) {
                h = ci.a;
            } else {
                cn a2 = this.f.a((String) optional.get());
                e eVar = new e(1);
                h = com.google.common.util.concurrent.i.h(a2, ex.e(eVar), this.e);
            }
            h hVar = new h();
            dl.y(h, ex.h(hVar), this.e);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "ShortcutsContextProvider";
    }

    @Override // com.google.android.libraries.mdi.c.a.h
    public final void m() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 69;
    }
}
