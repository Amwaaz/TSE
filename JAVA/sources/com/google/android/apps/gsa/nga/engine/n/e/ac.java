package com.google.android.apps.gsa.nga.engine.n.e;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.ae.b;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.c;
import com.google.android.apps.gsa.nga.engine.as.d;
import com.google.android.apps.gsa.nga.engine.n.j;
import com.google.android.apps.gsa.nga.engine.n.k;
import com.google.android.apps.gsa.nga.engine.n.l;
import com.google.android.apps.gsa.nga.engine.n.m;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.engine.v.p;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.v.f;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/e/ac.class */
public final class ac implements b, c {

    /* renamed from: a, reason: collision with root package name */
    public final f f626a;
    public final h b;
    public final d c;
    public final Object d;
    public cn e;
    public cn f;
    public boolean g;
    public boolean h;
    public final Set i;
    public final Set j;
    public final af k;
    public final com.google.android.apps.gsa.nga.engine.g.a.y l;
    private final i m;
    private Optional n;
    private final com.google.android.apps.gsa.nga.shared.a.b o;
    private final ag p;
    private final ap q;

    public ac(com.google.android.apps.gsa.nga.shared.a.b bVar, f fVar, h hVar, ag agVar, af afVar, d dVar, ap apVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar, i iVar) {
        Object obj = new Object();
        this.d = obj;
        this.i = new HashSet();
        this.j = new HashSet();
        this.o = bVar;
        this.f626a = fVar;
        this.b = hVar;
        this.p = agVar;
        this.k = afVar;
        this.c = dVar;
        this.q = apVar;
        this.l = yVar;
        this.m = iVar;
        synchronized (obj) {
            this.n = Optional.empty();
            this.e = dl.n(i(Long.MIN_VALUE));
            this.f = dl.n(k(Long.MIN_VALUE));
            this.g = false;
            this.h = false;
        }
    }

    private final com.google.android.apps.gsa.nga.engine.n.i h() {
        return i(this.f626a.a().toEpochMilli());
    }

    private static com.google.android.apps.gsa.nga.engine.n.i i(long j) {
        com.google.android.apps.gsa.nga.engine.n.h hVar = new com.google.android.apps.gsa.nga.engine.n.h(null);
        hVar.d = Optional.ofNullable((Object) null);
        hVar.f630a = Optional.ofNullable((Object) null);
        hVar.b = Optional.ofNullable((Object) null);
        hVar.b(j);
        return hVar.a();
    }

    private static l k(long j) {
        k kVar = new k(null);
        kVar.f632a = Optional.ofNullable((Object) null);
        kVar.b(j);
        return kVar.a();
    }

    private final Optional l(cn cnVar) {
        m mVar;
        if (!cnVar.isDone()) {
            return Optional.of(cnVar);
        }
        if (!cnVar.isCancelled() && (mVar = (m) com.google.android.apps.gsa.shared.util.c.ag.j(cnVar, null)) != null && mVar.a() + 6000 >= this.f626a.a().toEpochMilli()) {
            return Optional.of(cnVar);
        }
        return Optional.empty();
    }

    private final void m() {
        synchronized (this.d) {
            this.n = Optional.empty();
            this.e = dl.n(i(Long.MIN_VALUE));
            this.f = dl.n(k(Long.MIN_VALUE));
        }
    }

    private final void n(ah ahVar) {
        if (ahVar.equals(ah.a)) {
            return;
        }
        synchronized (this.d) {
            Optional l = l(this.e);
            Optional l2 = l(this.f);
            boolean booleanValue = ((Boolean) l.map(new d(8)).orElse(true)).booleanValue();
            boolean booleanValue2 = ((Boolean) l2.map(new d(8)).orElse(true)).booleanValue();
            if (booleanValue && booleanValue2) {
                if (this.n.isEmpty()) {
                    this.n = Optional.of(ahVar);
                    return;
                }
                if (!((ah) this.n.get()).d.equals(ahVar.d)) {
                    this.n.get();
                    String str = ahVar.d;
                    m();
                    this.n = Optional.of(ahVar);
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(com.google.android.apps.gsa.nga.engine.ar.ah ahVar) {
        if (ahVar.equals(com.google.android.apps.gsa.nga.engine.ar.ah.IDLE)) {
            m();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.common.util.concurrent.cn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.common.util.concurrent.cn, java.lang.Object] */
    public final j c(boolean z, ah ahVar) {
        String str = ahVar.d;
        n(ahVar);
        synchronized (this.d) {
            if (z) {
                Optional l = l(this.e);
                Optional l2 = l(this.f);
                if (l.isPresent() && l2.isPresent()) {
                    return new j((cn) l.get(), (cn) l2.get());
                }
            }
            SettableFuture settableFuture = new SettableFuture();
            SettableFuture settableFuture2 = new SettableFuture();
            this.e = com.google.android.apps.gsa.shared.util.c.ag.e(settableFuture, Duration.ofMillis(6000L), this.b);
            this.f = com.google.android.apps.gsa.shared.util.c.ag.e(settableFuture2, Duration.ofMillis(6000L), this.b);
            ap apVar = this.q;
            cn cnVar = this.e;
            apVar.b(45, ahVar, cnVar);
            this.e = cnVar;
            ap apVar2 = this.q;
            cn cnVar2 = this.f;
            apVar2.b(43, ahVar, cnVar2);
            this.f = cnVar2;
            if (f()) {
                synchronized (this.j) {
                    this.j.add(settableFuture);
                }
                synchronized (this.i) {
                    this.i.add(settableFuture2);
                }
                com.google.android.apps.gsa.nga.shared.a.b bVar = this.o;
                com.google.android.apps.gsa.nga.shared.a.a aVar = new com.google.android.apps.gsa.nga.shared.a.a();
                aVar.b();
                aVar.d();
                aVar.e(ahVar.d);
                bVar.a(aVar.a());
            } else {
                af afVar = this.k;
                bk bkVar = bk.ACCESS_DENIED;
                com.google.android.apps.gsa.nga.engine.v.b bVar2 = p.a;
                afVar.c(bkVar, new com.google.android.apps.gsa.nga.engine.v.j(2), ahVar);
                settableFuture.n(h());
                settableFuture2.n(d());
            }
            cn cnVar3 = this.e;
            if (cnVar3 == null) {
                throw new NullPointerException("Null assistData");
            }
            cn cnVar4 = this.f;
            if (cnVar4 == null) {
                throw new NullPointerException("Null screenshot");
            }
            return new j(cnVar3, cnVar4);
        }
    }

    public final l d() {
        return k(this.f626a.a().toEpochMilli());
    }

    public final void e(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, com.google.android.libraries.assistant.g.d.f fVar, com.google.android.libraries.search.assistant.d.a.a aVar) {
        com.google.android.apps.gsa.nga.engine.n.i h;
        fl m;
        if (bundle == null && assistContent == null && assistStructure == null) {
            synchronized (this.d) {
                this.g = true;
            }
        }
        if (f()) {
            this.m.b(w.NGA_ASSIST_DATA_SCREEN_CONTEXT_ALLOWED);
            com.google.android.apps.gsa.nga.engine.n.h hVar = new com.google.android.apps.gsa.nga.engine.n.h(null);
            hVar.d = Optional.ofNullable(bundle);
            hVar.f630a = Optional.ofNullable(assistContent);
            hVar.b = Optional.ofNullable(assistStructure);
            hVar.e = Optional.of(fVar);
            hVar.f = Optional.of(aVar);
            hVar.b(this.f626a.a().toEpochMilli());
            if (assistStructure != null) {
                hVar.c = Optional.of(new ab(assistStructure));
            }
            h = hVar.a();
        } else {
            af afVar = this.k;
            bk bkVar = bk.ACCESS_DENIED;
            com.google.android.apps.gsa.nga.engine.v.b bVar = p.a;
            afVar.c(bkVar, new com.google.android.apps.gsa.nga.engine.v.j(2), ah.a);
            h = h();
        }
        synchronized (this.d) {
            this.e = dl.n(h);
        }
        synchronized (this.j) {
            m = fl.m(this.j);
            this.j.clear();
        }
        Collection._EL.stream(m).forEach(new aa(h, 2));
    }

    public final boolean f() {
        return this.p.q(this.l.c().c);
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [com.google.common.util.concurrent.cn, java.lang.Object] */
    public final cn g(ah ahVar) {
        String str = ahVar.d;
        n(ahVar);
        synchronized (this.d) {
            Optional l = l(this.e);
            if (l.isPresent()) {
                return l.get();
            }
            SettableFuture settableFuture = new SettableFuture();
            cn e = com.google.android.apps.gsa.shared.util.c.ag.e(settableFuture, Duration.ofMillis(6000L), this.b);
            this.e = e;
            this.q.b(45, ahVar, e);
            this.e = e;
            if (f()) {
                synchronized (this.j) {
                    this.j.add(settableFuture);
                }
                com.google.android.apps.gsa.nga.shared.a.b bVar = this.o;
                com.google.android.apps.gsa.nga.shared.a.a aVar = new com.google.android.apps.gsa.nga.shared.a.a();
                aVar.b();
                aVar.e(ahVar.d);
                bVar.a(aVar.a());
            } else {
                af afVar = this.k;
                bk bkVar = bk.ACCESS_DENIED;
                com.google.android.apps.gsa.nga.engine.v.b bVar2 = p.a;
                afVar.c(bkVar, new com.google.android.apps.gsa.nga.engine.v.j(2), ahVar);
                settableFuture.n(h());
            }
            return this.e;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.b
    public final void j(Optional optional) {
        m();
    }
}
