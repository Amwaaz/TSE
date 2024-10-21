package com.google.android.apps.gsa.nga.shared.ad.a.a;

import com.google.android.apps.gsa.nga.shared.ad.a.a;
import com.google.android.apps.gsa.nga.shared.ad.a.d;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.libraries.search.d.aw;
import com.google.android.libraries.search.d.dl;
import com.google.common.a.c;
import com.google.common.a.j;
import com.google.common.base.ci;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ad/a/a/b.class */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    static final Duration f839a = Duration.ofMinutes(5);
    private final c b;
    private final AtomicInteger c = new AtomicInteger();
    private final af d;

    public b(ci ciVar, af afVar) {
        j jVar = new j();
        jVar.f(f839a.getSeconds(), TimeUnit.SECONDS);
        jVar.g(5L);
        jVar.h(ciVar);
        this.b = jVar.a();
        this.d = afVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final com.google.android.apps.gsa.nga.shared.ad.a.b a(a aVar) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.ad.a.b.a.createBuilder();
        int andIncrement = this.c.getAndIncrement();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.ad.a.b bVar = createBuilder.instance;
        bVar.b |= 1;
        bVar.c = andIncrement;
        com.google.android.apps.gsa.nga.shared.ad.a.b build = createBuilder.build();
        bk bkVar = bk.CLIENT_CONFIGURATION;
        ba createBuilder2 = bj.a.createBuilder();
        createBuilder2.copyOnWrite();
        bj bjVar = createBuilder2.instance;
        aVar.getClass();
        bjVar.c = aVar;
        bjVar.b = 99;
        this.d.b(bkVar, createBuilder2.build(), ah.a);
        this.b.a.put(build, aVar);
        return build;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final Optional b(com.google.android.apps.gsa.nga.shared.ad.a.b bVar, boolean z) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null || (aVar.b & 4) == 0) {
            return Optional.empty();
        }
        com.google.android.apps.gsa.nga.shared.d.c.c cVar = aVar.e;
        com.google.android.apps.gsa.nga.shared.d.c.c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = com.google.android.apps.gsa.nga.shared.d.c.c.a;
        }
        if (z) {
            return Optional.of(cVar2);
        }
        com.google.android.apps.gsa.nga.shared.d.c.c cVar3 = cVar2;
        if (cVar2.c == 1) {
            com.google.android.apps.gsa.nga.shared.d.c.b bVar2 = (com.google.android.apps.gsa.nga.shared.d.c.b) cVar2.d;
            ba builder = cVar2.toBuilder();
            ba builder2 = bVar2.toBuilder();
            builder2.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.d.c.b bVar3 = builder2.instance;
            bVar3.b |= 1;
            bVar3.c = false;
            builder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.d.c.c cVar4 = builder.instance;
            com.google.android.apps.gsa.nga.shared.d.c.b build = builder2.build();
            build.getClass();
            cVar4.d = build;
            cVar4.c = 1;
            cVar3 = builder.build();
        }
        return Optional.of(cVar3);
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final Optional c(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar != null && (aVar.b & 1024) != 0) {
            aw awVar = aVar.m;
            aw awVar2 = awVar;
            if (awVar == null) {
                awVar2 = aw.f5084a;
            }
            return Optional.of(awVar2);
        }
        return Optional.empty();
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final Optional d(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar != null && (aVar.b & 16) != 0) {
            dl dlVar = aVar.g;
            dl dlVar2 = dlVar;
            if (dlVar == null) {
                dlVar2 = dl.f5109a;
            }
            return Optional.of(dlVar2);
        }
        return Optional.empty();
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final Optional e(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar != null && (aVar.b & 8) != 0) {
            com.google.android.apps.gsa.nga.shared.u.i.b a2 = com.google.android.apps.gsa.nga.shared.u.i.b.a(aVar.f);
            com.google.android.apps.gsa.nga.shared.u.i.b bVar2 = a2;
            if (a2 == null) {
                bVar2 = com.google.android.apps.gsa.nga.shared.u.i.b.SODA;
            }
            return Optional.of(bVar2);
        }
        return Optional.empty();
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean f(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null) {
            return false;
        }
        return aVar.l;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean g(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null) {
            return false;
        }
        return aVar.j;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean h(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null) {
            return false;
        }
        return aVar.k;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean i(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null) {
            return false;
        }
        return aVar.i;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean j(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null || (aVar.b & 4) == 0) {
            return false;
        }
        com.google.android.apps.gsa.nga.shared.d.c.c cVar = aVar.e;
        com.google.android.apps.gsa.nga.shared.d.c.c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = com.google.android.apps.gsa.nga.shared.d.c.c.a;
        }
        if ((cVar2.b & 1) == 0) {
            return false;
        }
        com.google.android.apps.gsa.nga.shared.u.c.a aVar2 = cVar2.e;
        com.google.android.apps.gsa.nga.shared.u.c.a aVar3 = aVar2;
        if (aVar2 == null) {
            aVar3 = com.google.android.apps.gsa.nga.shared.u.c.a.a;
        }
        return aVar3.c;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean k(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null) {
            return false;
        }
        return aVar.h;
    }

    @Override // com.google.android.apps.gsa.nga.shared.ad.a.d
    public final boolean l(com.google.android.apps.gsa.nga.shared.ad.a.b bVar) {
        a aVar = (a) this.b.a.e(bVar);
        if (aVar == null) {
            return false;
        }
        return aVar.n;
    }
}
