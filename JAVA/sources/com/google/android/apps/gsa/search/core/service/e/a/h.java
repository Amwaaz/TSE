package com.google.android.apps.gsa.search.core.service.e.a;

import com.google.android.apps.gsa.search.core.state.d.af;
import com.google.apps.tiktok.tracing.al;
import com.google.apps.tiktok.tracing.ap;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.fe;
import com.google.common.b.nr;
import com.google.common.b.oo;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.dl;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a/h.class */
public final class h implements com.google.android.apps.gsa.shared.util.debug.a.g, com.google.android.apps.gsa.search.core.service.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1180a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.service.e.a.h");
    public final j b;

    @Deprecated
    public final e.a c;
    public final e.a d;
    public final e.a e;
    public final a f;
    public final com.google.android.libraries.g.a g;
    public final Set h = oo.j();
    public final dj i;
    public boolean j;
    public volatile boolean k;
    private final com.google.android.libraries.gsa.h.h l;
    private final e.a m;
    private final k n;
    private final com.google.android.apps.gsa.search.core.service.f.a.g o;
    private final com.google.android.apps.gsa.search.core.service.f.c p;
    private final com.google.android.apps.gsa.search.core.service.e.b.c q;
    private final c r;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.google.android.apps.gsa.search.core.service.e.a.c] */
    public h(e.a aVar, e.a aVar2, e.a aVar3, com.google.android.libraries.gsa.h.h hVar, e.a aVar4, com.google.android.apps.gsa.search.core.service.e.b.c cVar, a aVar5, j jVar, k kVar, com.google.android.libraries.g.a aVar6, com.google.android.apps.gsa.search.core.service.f.a.g gVar) {
        com.google.android.apps.gsa.search.core.service.f.c cVar2 = new com.google.android.apps.gsa.search.core.service.f.c(this) { // from class: com.google.android.apps.gsa.search.core.service.e.a.b

            /* renamed from: a, reason: collision with root package name */
            public final h f1174a;

            {
                this.f1174a = this;
            }

            @Override // com.google.android.apps.gsa.search.core.service.f.c
            public final void a(com.google.android.apps.gsa.search.core.service.f.b bVar) {
                ab abVar = com.google.common.f.a.e.a;
                this.f1174a.g();
            }
        };
        this.p = cVar2;
        ?? r0 = new Object(this) { // from class: com.google.android.apps.gsa.search.core.service.e.a.c

            /* renamed from: a, reason: collision with root package name */
            public final h f1175a;

            {
                this.f1175a = this;
            }
        };
        this.r = r0;
        this.k = false;
        this.e = aVar2;
        this.d = aVar3;
        this.l = hVar;
        this.q = cVar;
        this.c = aVar;
        this.m = aVar4;
        this.f = aVar5;
        this.b = jVar;
        this.n = kVar;
        this.g = aVar6;
        this.o = gVar;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        new HashMap();
        new HashMap();
        fe feVar = fe.REALTIME;
        if (!hashSet.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = ap.f5903a;
            throw null;
        }
        this.i = new dj(new al(at.k(false)), new k.a.a() { // from class: com.google.apps.tiktok.tracing.dk
            public final Object a() {
                return nr.a;
            }
        }, hashSet2, feVar);
        ((com.google.android.apps.gsa.search.core.service.f.a.i) aVar.a()).c(cVar2);
        cVar.f1185a.add(r0);
    }

    public static Set b(Set set) {
        return set == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(set);
    }

    @Override // com.google.android.apps.gsa.search.core.service.b.a
    public final void a() {
        throw null;
    }

    public final void c(com.google.android.apps.gsa.search.core.service.e.g gVar) {
        ab abVar = com.google.common.f.a.e.a;
        if (this.k) {
            com.google.common.f.h d = f1180a.d();
            d.aj(com.google.common.f.a.e.a, "WorkController");
            com.google.common.f.h hVar = d;
            hVar.ak(7362);
            hVar.s("WorkProxy is not enqueued because WorkController is disposed: %s", gVar);
            return;
        }
        gVar.b.h(this.g.f().toEpochMilli());
        j jVar = this.b;
        com.google.android.apps.gsa.search.core.service.e.a.a.c cVar = jVar.b;
        cVar.b.add(gVar);
        com.google.android.apps.gsa.search.core.service.e.a.a.a aVar = cVar.c;
        if (aVar != null && aVar.b.a(gVar)) {
            aVar.c.add(gVar);
        }
        com.google.android.apps.gsa.search.core.service.e.a.a.c cVar2 = jVar.b;
        jVar.f1182a.set(true);
        k kVar = this.n;
        kVar.f1183a.add(gVar.b);
        Queue queue = kVar.f1183a;
        g();
    }

    public final void e(String str, com.google.android.libraries.gsa.h.f fVar) {
        if (com.google.android.libraries.gsa.h.i.d(com.google.android.apps.gsa.search.core.service.a.a.class)) {
            fVar.run();
        } else {
            this.l.n(str, fVar);
        }
    }

    public final void f(com.google.android.apps.gsa.search.core.service.f.b bVar) {
        if (this.f.a(bVar.id())) {
            ((com.google.android.apps.gsa.search.core.service.g.b.b) this.d.a()).c(bVar);
        }
    }

    public final void g() {
        e("Perform queued work", new com.google.android.libraries.gsa.h.f(this) { // from class: com.google.android.apps.gsa.search.core.service.e.a.d

            /* renamed from: a, reason: collision with root package name */
            public final h f1176a;

            {
                this.f1176a = this;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                HashSet hashSet;
                HashSet hashSet2;
                h hVar = this.f1176a;
                if (hVar.k) {
                    com.google.common.f.h d = h.f1180a.d();
                    d.aj(com.google.common.f.a.e.a, "WorkController");
                    com.google.common.f.h hVar2 = d;
                    hVar2.ak(7371);
                    hVar2.p("Work is not performed because WorkController is disposed");
                    return;
                }
                ab abVar = com.google.common.f.a.e.a;
                cl.v(com.google.android.libraries.gsa.h.i.d(com.google.android.apps.gsa.search.core.service.a.a.class), "checkEventBusThread failed");
                if (hVar.j) {
                    return;
                }
                hVar.j = true;
                HashSet hashSet3 = null;
                HashSet hashSet4 = null;
                do {
                    try {
                        j jVar = hVar.b;
                        jVar.f1182a.set(false);
                        hashSet = hashSet4;
                        hashSet2 = hashSet3;
                        for (com.google.android.apps.gsa.search.core.service.e.g gVar : jVar.b()) {
                            String i = gVar.i();
                            if (hVar.f.a(i)) {
                                String i2 = gVar.i();
                                if (hVar.h.add(i2)) {
                                    dl.y(((com.google.android.apps.gsa.search.core.service.g.b.b) hVar.d.a()).b(i2), new f(hVar, i2), ay.a);
                                }
                            } else {
                                at a2 = ((com.google.android.apps.gsa.search.core.service.f.a.i) hVar.c.a()).a(i);
                                if (a2.h()) {
                                    hVar.h(gVar, (com.google.android.apps.gsa.search.core.service.f.b) a2.c());
                                    HashSet hashSet5 = hashSet;
                                    if (hashSet == null) {
                                        hashSet5 = new HashSet();
                                    }
                                    hashSet5.add(i);
                                    hashSet = hashSet5;
                                } else {
                                    HashSet hashSet6 = hashSet2;
                                    if (hashSet2 == null) {
                                        hashSet6 = new HashSet();
                                    }
                                    hashSet6.add(i);
                                    hashSet2 = hashSet6;
                                }
                            }
                        }
                        hashSet3 = hashSet2;
                        hashSet4 = hashSet;
                    } finally {
                        hVar.j = false;
                    }
                } while (hVar.b.f1182a.get());
                Set b = h.b(hashSet2);
                Set b2 = h.b(hashSet);
                cl.v(com.google.android.libraries.gsa.h.i.d(com.google.android.apps.gsa.search.core.service.a.a.class), "checkEventBusThread failed");
                if (b2 != null) {
                    ((af) hVar.e.a()).c.removeAll(b2);
                }
                if (b != null) {
                    af afVar = (af) hVar.e.a();
                    if (afVar.c.addAll(b)) {
                        afVar.an();
                    }
                }
                for (com.google.android.apps.gsa.search.core.service.e.g gVar2 : DesugarCollections.unmodifiableCollection(DesugarCollections.unmodifiableCollection(hVar.b.b.b))) {
                    Integer num = (Integer) ((af) hVar.e.a()).f1276a.get(gVar2.i());
                    if (num != null && num.intValue() == 6) {
                        hVar.b.c(gVar2);
                        gVar2.o(new com.google.android.apps.gsa.search.core.service.g.a.a("Worker " + gVar2.i() + " not found"));
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.google.android.apps.gsa.search.core.service.e.g r6, com.google.android.apps.gsa.search.core.service.f.b r7) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.e.a.h.h(com.google.android.apps.gsa.search.core.service.e.g, com.google.android.apps.gsa.search.core.service.f.b):void");
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkControllerImpl");
        fVar.b("mPerformingQueuedWork").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.j), false));
        fVar.k(this.b);
        fVar.k((com.google.android.apps.gsa.shared.util.debug.a.a) this.d.a());
        fVar.k(this.n);
    }
}
