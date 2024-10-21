package com.google.android.apps.gsa.nga.engine.b.f.a;

import android.os.Bundle;
import com.google.android.apps.gsa.binaries.velvet.app.kz;
import com.google.android.apps.gsa.binaries.velvet.app.ox;
import com.google.android.apps.gsa.nga.engine.ac.a.ag;
import com.google.android.apps.gsa.nga.engine.ac.a.ba;
import com.google.android.apps.gsa.nga.engine.ac.a.bj;
import com.google.android.apps.gsa.nga.engine.ac.a.j;
import com.google.android.apps.gsa.nga.engine.ac.a.m;
import com.google.android.apps.gsa.nga.engine.ac.a.n;
import com.google.android.apps.gsa.nga.engine.ac.c;
import com.google.android.apps.gsa.nga.engine.ac.f;
import com.google.android.apps.gsa.nga.engine.ar.ak;
import com.google.android.apps.gsa.nga.engine.b.e.a;
import com.google.android.apps.gsa.nga.engine.b.g.b.aq;
import com.google.android.apps.gsa.nga.engine.b.g.b.ar;
import com.google.android.apps.gsa.nga.engine.b.g.b.as;
import com.google.android.apps.gsa.nga.engine.b.g.b.az;
import com.google.android.apps.gsa.nga.engine.b.g.b.bd;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.engine.v.u;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.a.d;
import com.google.common.f.ab;
import e.c.k;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/b/f/a/x.class */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final d f510a = d.j();
    public final e b = new i(Optional.empty(), a.class);
    public final Queue c = new ArrayDeque();
    private final w d;

    public x(w wVar) {
        this.d = wVar;
    }

    final void a(k kVar) {
        if (!this.c.isEmpty()) {
            this.c.add(kVar);
            return;
        }
        Optional optional = (Optional) ((i) this.b).b.get();
        if (kVar.b() != 1) {
            if (optional.isPresent()) {
                ((v) optional.get()).a(kVar);
                return;
            }
            return;
        }
        this.c.add(kVar);
        if (!optional.isPresent()) {
            b();
            return;
        }
        com.google.common.f.a.a d = f510a.d();
        d.ak(2426);
        d.s("System busy, utterance start scheduled (%s)", kVar.f().b);
        ((v) optional.get()).b();
    }

    public final void b() {
        com.google.android.apps.gsa.nga.engine.b.g.s sVar;
        while (true) {
            sVar = null;
            if (this.c.isEmpty()) {
                break;
            }
            k kVar = (k) this.c.poll();
            if (kVar == null) {
                sVar = null;
                break;
            } else if (kVar.b() == 1) {
                sVar = kVar.f();
                break;
            }
        }
        if (sVar == null) {
            this.b.b(Optional.empty());
            return;
        }
        com.google.common.f.a.a d = f510a.d();
        d.ak(2428);
        d.s("Starting utterance (%s)", sVar.b);
        w wVar = this.d;
        aq aqVar = (aq) wVar.f509a.a();
        aqVar.getClass();
        ag agVar = (ag) wVar.b.a();
        agVar.getClass();
        h hVar = (h) wVar.c.a();
        hVar.getClass();
        v vVar = new v(sVar, aqVar, agVar, hVar);
        m mVar = new m(this, vVar, 4);
        com.google.common.f.a.a d2 = v.a.d();
        d2.ak(2422);
        d2.s("init for %s", vVar.b);
        aq aqVar2 = vVar.e;
        com.google.android.apps.gsa.nga.engine.b.g.s sVar2 = vVar.d;
        u a2 = ((ap) aqVar2.b).a(100001, sVar2.b.b());
        try {
            Object obj = aqVar2.a;
            ((kz) obj).b = sVar2;
            k.b(((kz) obj).b, com.google.android.apps.gsa.nga.engine.b.g.s.class);
            as c = ((com.google.android.apps.gsa.nga.engine.b.g.b.ap) e.b.a.a(new ox(((kz) obj).a, (com.google.android.apps.gsa.nga.engine.b.g.s) ((kz) obj).b), com.google.android.apps.gsa.nga.engine.b.g.b.ap.class)).c();
            Optional optional = sVar2.f;
            c.c.m(c.e, "[NGA] running OnDoneTasks", new ar(c, 1));
            c.j.set(((Boolean) optional.orElse(false)).booleanValue());
            az azVar = c.b;
            boolean z = c.j.get();
            if (azVar.b.i(eu.fs)) {
                azVar.k.ifPresent(new bd(1));
            }
            if (!z) {
                n nVar = azVar.n;
                ab abVar = com.google.common.f.a.e.a;
                nVar.e.j = nVar;
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.opa.extra.CONTINUED_CONVERSATION", nVar.c.f());
                bundle.putBoolean("cancelled_by_bisto", ((Boolean) nVar.u.a().g.b.c(ak.g, false)).booleanValue());
                nVar.r.a(new j(nVar));
                if (nVar.k) {
                    String d3 = nVar.d(m.b);
                    nVar.n = m.b;
                    bj bjVar = nVar.e;
                    Optional empty = Optional.empty();
                    Optional of = Optional.of(bundle);
                    Optional empty2 = Optional.empty();
                    int i = fl.e;
                    f a3 = nVar.a("", d3, empty, of, empty2, ni.a);
                    com.google.common.f.a.a d4 = bj.f393a.d();
                    d4.ak(3704);
                    d4.s("#init() requestId=%s", a3.e);
                    bjVar.b(a3);
                    ba baVar = bjVar.d;
                    baVar.g = a3;
                    baVar.b.b(c.PREFETCHING);
                    nVar.h.b();
                }
            }
            Iterator it = ((Set) c.f.a()).iterator();
            while (it.hasNext()) {
                ((com.google.android.apps.gsa.nga.engine.b.g.x) it.next()).a();
            }
            a2.a();
            vVar.f = c;
            vVar.c.m(ad.a(vVar.f.h.a, new t()), "[NGA] Utterance done callback", new u(mVar));
            this.b.b(Optional.of(vVar));
            while (true) {
                k kVar2 = (k) this.c.peek();
                if (kVar2 == null || kVar2.b() == 1) {
                    break;
                }
                this.c.remove();
                vVar.a(kVar2);
            }
            if (this.c.isEmpty()) {
                return;
            }
            vVar.b();
        } catch (Throwable th) {
            try {
                a2.a();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
