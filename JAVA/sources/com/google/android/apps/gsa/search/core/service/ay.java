package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.o.b;
import com.google.android.apps.gsa.search.core.service.d.a.c;
import com.google.android.apps.gsa.search.core.service.d.e;
import com.google.android.apps.gsa.search.core.service.d.i;
import com.google.android.apps.gsa.search.core.service.d.l;
import com.google.android.apps.gsa.shared.k.y;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.g;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ba;
import com.google.common.b.eq;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import e.a;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/ay.class */
public class ay implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1158a = j.i("com.google.android.apps.gsa.search.core.service.ay");
    public final com.google.android.apps.gsa.search.core.service.d.o b;
    public final com.google.common.base.at c;
    public final a d;
    final ba e = new eq(16);
    final ba f = new eq(16);
    private final i g;
    private final a h;
    private final h i;
    private final a j;

    public ay(i iVar, a aVar, a aVar2, h hVar, com.google.android.apps.gsa.search.core.service.d.o oVar, com.google.common.base.at atVar, a aVar3) {
        this.g = iVar;
        this.h = aVar;
        this.j = aVar2;
        this.i = hVar;
        this.b = oVar;
        this.c = atVar;
        this.d = aVar3;
    }

    public final long a() {
        return ((b) this.h.a()).f1136a.incrementAndGet();
    }

    public final e b(long j, String str) {
        ab abVar = com.google.common.f.a.e.a;
        com.google.android.apps.gsa.search.core.service.d.b bVar = new com.google.android.apps.gsa.search.core.service.d.b();
        com.google.android.apps.gsa.search.core.service.d.d dVar = new com.google.android.apps.gsa.search.core.service.d.d();
        i iVar = this.g;
        c cVar = new c(iVar.b);
        k.a.a aVar = (k.a.a) iVar.f1166a.get(str);
        if (aVar == null) {
            throw new com.google.android.apps.gsa.search.core.service.d.n(str);
        }
        return new e(((com.google.android.apps.gsa.search.core.service.d.h) aVar.a()).a(new l(j, bVar, dVar, cVar)), bVar, dVar, cVar, str, iVar.c, iVar.d, iVar.f, iVar.g);
    }

    public final void c(long j) {
        com.google.android.libraries.gsa.h.i.b(com.google.android.apps.gsa.search.core.service.a.a.class);
        ab abVar = com.google.common.f.a.e.a;
        e eVar = (e) this.e.get(Long.valueOf(j));
        if (eVar == null || !this.f.containsValue(eVar)) {
            if (eVar != null) {
                e(null, eVar);
            }
        } else {
            com.google.common.f.h f = f1158a.f();
            f.aj(com.google.common.f.a.e.a, "SessionLifecycleManager");
            com.google.common.f.h hVar = f;
            hVar.ak(7327);
            hVar.r("Attempting to destroy session %d that has a primary client", j);
        }
    }

    public final void e(o oVar, e eVar) {
        if (eVar != null) {
            if (oVar != null) {
                oVar.s = null;
            }
            h(eVar);
            com.google.android.apps.gsa.search.core.service.d.o oVar2 = this.b;
            if (oVar2.b == eVar) {
                oVar2.b = null;
                oVar2.f1169a.notifyObservers(com.google.android.apps.gsa.search.core.service.d.o.a(null));
            }
        }
        this.e.e().remove(eVar);
        this.f.e().remove(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(o oVar) {
        ab abVar = com.google.common.f.a.e.a;
        cl.v(oVar.n, "Only started clients can be activated");
        e eVar = oVar.s;
        eVar.getClass();
        oVar.i = true;
        i(oVar, eVar);
        this.b.b(eVar);
        eVar.a("#onNewClient");
        eVar.b("#onNewClient");
        eVar.b.f1163a = oVar.f;
        eVar.c.f1164a = oVar.e;
        eVar.f1165a.j(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(o oVar) {
        ab abVar = com.google.common.f.a.e.a;
        oVar.i = false;
        e eVar = oVar.s;
        if (eVar != null) {
            boolean z = oVar.o;
            Long l = eVar.g;
            eVar.a("#onClientDeactivated");
            eVar.b("#onClientDeactivated");
            eVar.f1165a.g(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [e.a, java.lang.Object] */
    public final void h(e eVar) {
        com.google.common.base.a k;
        com.google.android.apps.gsa.search.core.service.d.g gVar = eVar.f1165a;
        Long l = eVar.g;
        eVar.a("#getDataToSave");
        eVar.b("#getDataToSave");
        bc createBuilder = com.google.android.apps.gsa.search.shared.service.d.b.v.f1347a.createBuilder();
        if (eVar.f1165a.k()) {
            Long l2 = eVar.g;
            l2.getClass();
            long longValue = l2.longValue();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.v vVar = createBuilder.instance;
            vVar.b |= 1;
            vVar.c = longValue;
            String str = eVar.f;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.v vVar2 = createBuilder.instance;
            str.getClass();
            vVar2.b |= 4;
            vVar2.e = str;
            k = com.google.common.base.at.k(createBuilder);
        } else {
            k = com.google.common.base.a.a;
        }
        if (k.h()) {
            Object c = k.c();
            int intValue = ((Integer) this.j.a()).intValue();
            com.google.protobuf.ba baVar = (com.google.protobuf.ba) c;
            baVar.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.v vVar3 = ((bc) c).instance;
            vVar3.b |= 2;
            vVar3.d = intValue;
            ((com.google.android.apps.gsa.search.core.service.d.b.a) this.c.a.a()).c(baVar.build());
        }
        com.google.android.apps.gsa.search.core.service.d.g gVar2 = eVar.f1165a;
        Long l3 = eVar.g;
        eVar.a("#onDestroy");
        eVar.b("#onDestroy");
        eVar.g = -1L;
        eVar.f1165a.h();
        eVar.i = true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("SessionLifecycleManager");
        Iterator it = this.e.h().iterator();
        while (it.hasNext()) {
            fVar.m((e) it.next());
        }
    }

    public final void i(o oVar, e eVar) {
        this.f.d(Long.valueOf(oVar.c), eVar, true);
    }

    public final void j(String str, com.google.android.apps.gsa.search.shared.service.d.b.u uVar) {
        ab abVar = com.google.common.f.a.e.a;
        long a2 = a();
        e b = b(a2, str);
        if (com.google.android.libraries.gsa.h.i.d(com.google.android.apps.gsa.search.core.service.a.a.class)) {
            l(b, a2, uVar, false);
        } else {
            this.i.n("SessionLifecycleManager [start session]", new ax(this, b, a2, uVar));
        }
    }

    public final boolean k(o oVar) {
        if (!BitFlags.f(oVar.f.b.b, 562949953421312L)) {
            return false;
        }
        ab abVar = com.google.common.f.a.e.a;
        return true;
    }

    public final void l(e eVar, long j, com.google.android.apps.gsa.search.shared.service.d.b.u uVar, boolean z) {
        Long valueOf = Long.valueOf(j);
        this.e.d(valueOf, eVar, false);
        ab abVar = com.google.common.f.a.e.a;
        if (!z) {
            this.b.b(eVar);
        }
        com.google.android.apps.gsa.search.shared.service.d.b.u uVar2 = uVar;
        if (uVar == null) {
            uVar2 = com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a;
        }
        if (eVar.j.w(y.l)) {
            bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.libraries.search.i.a.b.a.a.a);
            uVar2.d(bgVar);
            if (((bd) uVar2).br.o(bgVar.d)) {
                e.c(eVar.f, eVar.f1165a);
            }
        }
        eVar.g = valueOf;
        cl.y(!eVar.h, "Session with sessionId = %s is already started", eVar.g);
        eVar.f1165a.l(j, uVar2);
        eVar.h = true;
    }
}
