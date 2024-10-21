package com.google.android.apps.gsa.nga.shared.j.b;

import com.google.android.apps.gsa.nga.api.ao;
import com.google.android.apps.gsa.nga.shared.d.b;
import com.google.android.apps.gsa.staticplugins.bisto.v.a.aa;
import com.google.android.apps.gsa.staticplugins.bisto.v.a.q;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.gsa.h.i;
import com.google.android.libraries.search.d.ab;
import com.google.android.libraries.search.d.bn;
import com.google.android.libraries.search.d.bq;
import com.google.android.libraries.search.d.br;
import com.google.android.libraries.search.d.bs;
import com.google.android.libraries.search.d.bt;
import com.google.android.libraries.search.d.c.a.e;
import com.google.android.libraries.search.d.c.g;
import com.google.android.libraries.search.d.dl;
import com.google.common.a.bl;
import com.google.common.a.c;
import com.google.common.a.j;
import com.google.common.base.at;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/b/a.class */
public final class a implements com.google.android.libraries.search.d.c.a, com.google.android.apps.gsa.nga.shared.j.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f960a = d.j();
    static final Duration b = Duration.ofSeconds(20);
    public final b c;
    public final Object d = new Object();
    public final Map e;
    public ao f;
    public final e g;
    private final h h;
    private final c i;
    private final com.google.android.libraries.search.d.q.f.a.b j;

    public a(e eVar, h hVar, b bVar, com.google.android.libraries.search.d.q.f.a.b bVar2) {
        j jVar = new j();
        jVar.g(3L);
        this.i = jVar.a();
        this.e = new ConcurrentHashMap();
        this.g = eVar;
        this.h = hVar;
        this.c = bVar;
        this.j = bVar2;
    }

    @Override // com.google.android.apps.gsa.nga.shared.j.a
    public final boolean a() {
        boolean z;
        synchronized (this.d) {
            z = this.f != null;
        }
        return z;
    }

    public final bn b(com.google.android.libraries.search.d.ah.c cVar, dl dlVar) {
        bl blVar = this.i.a;
        bn a2 = this.j.a();
        blVar.put(a2, dlVar);
        this.e.put(dlVar, cVar);
        this.h.p("[NGA] deleteInvocationMapping due to timeout", Duration.ofMillis(b.toMillis()), new d(this, dlVar, 1));
        return a2;
    }

    @Override // com.google.android.libraries.search.d.c.a
    public final at c(g gVar) {
        dl dlVar;
        com.google.android.libraries.search.d.ah.c cVar;
        int i = gVar.b;
        if ((i & 1) != 0) {
            dl dlVar2 = gVar.c;
            dlVar = dlVar2;
            if (dlVar2 == null) {
                dlVar = dl.f5109a;
            }
        } else {
            if ((i & 4) == 0) {
                com.google.common.f.a.a f = f960a.f();
                f.ak(5179);
                f.p("startListening was called without precachedBufferId or invocationToken");
                return com.google.common.base.a.a;
            }
            bn bnVar = gVar.e;
            bn bnVar2 = bnVar;
            if (bnVar == null) {
                bnVar2 = bn.f5096a;
            }
            dl dlVar3 = (dl) this.i.a.e(bnVar2);
            if (dlVar3 == null) {
                com.google.common.f.a.a f2 = f960a.f();
                f2.ak(5180);
                f2.q("No matching InvocationToken for PrecachedBufferId %d present", bnVar2.c);
                return com.google.common.base.a.a;
            }
            dlVar = dlVar3;
        }
        d dVar = f960a;
        com.google.common.f.a.a d = dVar.d();
        d.ak(5181);
        d.s("#startListening for %s", com.google.android.apps.gsa.nga.shared.d.d.d.b(Optional.of(dlVar)));
        com.google.android.libraries.search.d.ah.c cVar2 = (com.google.android.libraries.search.d.ah.c) this.e.remove(dlVar);
        if (cVar2 != null) {
            return at.k(cVar2);
        }
        synchronized (this.d) {
            q qVar = this.f;
            if (qVar == null) {
                com.google.common.f.a.a f3 = dVar.f();
                f3.ak(5182);
                f3.p("startListening was called, but no MicController was registered");
                return com.google.common.base.a.a;
            }
            Optional b2 = qVar.b(dlVar);
            if (b2.isPresent()) {
                com.google.android.apps.gsa.staticplugins.bisto.v.a.k kVar = (com.google.android.apps.gsa.staticplugins.bisto.v.a.k) b2.get();
                com.google.android.libraries.gsa.h.c hVar = new com.google.android.apps.gsa.staticplugins.bisto.v.a.h(kVar, dlVar, 0);
                com.google.common.f.h d2 = com.google.android.apps.gsa.staticplugins.bisto.v.a.k.a.d();
                d2.aj(com.google.common.f.a.e.a, "DialogHandler");
                com.google.common.f.h hVar2 = d2;
                hVar2.ak(13529);
                hVar2.p("startListening");
                if (i.d(androidx.annotation.b.class)) {
                    try {
                        cVar = (com.google.android.libraries.search.d.ah.c) hVar.a();
                    } catch (Exception e) {
                        throw new IllegalArgumentException("Must not happen", e);
                    }
                } else {
                    cVar = (com.google.android.libraries.search.d.ah.c) com.google.common.util.concurrent.dl.x(kVar.b.a("startListening", hVar));
                }
            } else {
                com.google.common.f.h e2 = q.a.e();
                e2.aj(com.google.common.f.a.e.a, "MicControllerDelegator");
                com.google.common.f.h hVar3 = e2;
                hVar3.ak(13577);
                hVar3.p("startListening was called when defaultMicController is not present");
                aa aaVar = new aa(1);
                ab abVar = ab.f5060a;
                ba createBuilder = bt.a.createBuilder();
                bs bsVar = bs.b;
                createBuilder.copyOnWrite();
                bt btVar = createBuilder.instance;
                btVar.c = Integer.valueOf(bsVar.aj);
                btVar.b = 2;
                cVar = new com.google.android.libraries.search.d.ah.c(aaVar, abVar, com.google.common.util.concurrent.dl.n(createBuilder.build()));
            }
            return at.k(cVar);
        }
    }

    @Override // com.google.android.libraries.search.d.c.a
    public final /* synthetic */ cn d() {
        return com.google.common.util.concurrent.dl.n(com.google.android.libraries.search.d.c.b.b);
    }

    @Override // com.google.android.libraries.search.d.c.a
    public final /* synthetic */ cn e(boolean z) {
        return com.google.common.util.concurrent.dl.n(com.google.android.libraries.search.d.c.c.b);
    }

    @Override // com.google.android.libraries.search.d.c.a
    public final cn f(com.google.android.libraries.search.d.c.i iVar) {
        dl dlVar;
        int i = iVar.b;
        if ((i & 1) != 0) {
            dl dlVar2 = iVar.c;
            dlVar = dlVar2;
            if (dlVar2 == null) {
                dlVar = dl.f5109a;
            }
        } else {
            if ((i & 2) == 0) {
                com.google.common.f.a.a f = f960a.f();
                f.ak(5183);
                f.p("stopListening called without PrecachedBufferId or InvocationToken");
                ba createBuilder = br.a.createBuilder();
                bq bqVar = bq.D;
                createBuilder.copyOnWrite();
                br brVar = createBuilder.instance;
                brVar.c = Integer.valueOf(bqVar.M);
                brVar.b = 2;
                return com.google.common.util.concurrent.dl.n(createBuilder.build());
            }
            bn bnVar = iVar.d;
            bn bnVar2 = bnVar;
            if (bnVar == null) {
                bnVar2 = bn.f5096a;
            }
            dl dlVar3 = (dl) this.i.a.e(bnVar2);
            if (dlVar3 == null) {
                com.google.common.f.a.a f2 = f960a.f();
                f2.ak(5184);
                f2.q("No matching InvocationToken present for PrecachedBufferId %d", bnVar2.c);
                ba createBuilder2 = br.a.createBuilder();
                bq bqVar2 = bq.E;
                createBuilder2.copyOnWrite();
                br brVar2 = createBuilder2.instance;
                brVar2.c = Integer.valueOf(bqVar2.M);
                brVar2.b = 2;
                return com.google.common.util.concurrent.dl.n(createBuilder2.build());
            }
            dlVar = dlVar3;
        }
        d dVar = f960a;
        com.google.common.f.a.a d = dVar.d();
        d.ak(5185);
        d.s("#stopListening for %s", com.google.android.apps.gsa.nga.shared.d.d.d.b(Optional.of(dlVar)));
        synchronized (this.d) {
            ao aoVar = this.f;
            if (aoVar != null) {
                return aoVar.a(dlVar);
            }
            com.google.common.f.a.a f3 = dVar.f();
            f3.ak(5186);
            f3.p("stopListening called but no MicController is registered");
            ba createBuilder3 = br.a.createBuilder();
            bq bqVar3 = bq.B;
            createBuilder3.copyOnWrite();
            br brVar3 = createBuilder3.instance;
            brVar3.c = Integer.valueOf(bqVar3.M);
            brVar3.b = 2;
            return com.google.common.util.concurrent.dl.n(createBuilder3.build());
        }
    }

    final boolean g(dl dlVar) {
        if (((com.google.android.libraries.search.d.ah.c) this.e.remove(dlVar)) == null) {
            return false;
        }
        d dVar = f960a;
        com.google.common.f.a.a f = dVar.f();
        f.ak(5192);
        f.s("WriteableAudioBuffer not consumed for %s", com.google.android.apps.gsa.nga.shared.d.d.d.b(Optional.of(dlVar)));
        synchronized (this.d) {
            ao aoVar = this.f;
            if (aoVar != null) {
                aoVar.a(dlVar);
                return true;
            }
            com.google.common.f.a.a f2 = dVar.f();
            f2.ak(5193);
            f2.p("deleteMapping called but no micController was registered");
            return false;
        }
    }

    @Override // com.google.android.libraries.search.d.c.a
    public final /* synthetic */ boolean h() {
        return false;
    }
}
