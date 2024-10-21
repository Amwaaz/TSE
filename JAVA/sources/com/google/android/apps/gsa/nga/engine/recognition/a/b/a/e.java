package com.google.android.apps.gsa.nga.engine.recognition.a.b.a;

import android.media.AudioManager;
import android.os.Handler;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.b.b.o;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.d.a;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.nga.shared.v.a.a.b;
import com.google.android.libraries.ao.g$;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.d.s.e.a.f;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/a/b/a/e.class */
public final class e extends c implements com.google.android.apps.gsa.nga.engine.ar.d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f644a;
    public final a b;
    private final com.google.android.apps.gsa.nga.shared.n.e c;
    private com.google.android.apps.gsa.nga.shared.v.a.a.d d;
    private final f e;

    public e(AudioManager audioManager, n nVar, f fVar, k kVar, a aVar, h hVar) {
        super(nVar);
        this.d = com.google.android.apps.gsa.nga.shared.v.a.a.d.f1016a;
        this.f644a = audioManager;
        this.e = fVar;
        this.b = aVar;
        this.c = kVar.a(hVar, new com.google.android.apps.gsa.shared.util.c.d() { // from class: com.google.android.apps.gsa.nga.engine.recognition.a.b.a.d
            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                ((o) obj).a((com.google.android.apps.gsa.nga.shared.v.a.a.d) obj2);
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(ah ahVar) {
    }

    public final void c(com.google.android.libraries.search.d.s.e.c cVar) {
        com.google.android.apps.gsa.nga.shared.v.a.a.d dVar;
        synchronized (this) {
            com.google.android.apps.gsa.nga.shared.v.a.a.d dVar2 = this.d;
            Stream filter = Collection._EL.stream(cVar.b).filter(new a()).map(new b()).filter(new c(this));
            int i = fl.e;
            fl flVar = (fl) filter.collect(bs.a);
            if (flVar.isEmpty()) {
                ba createBuilder = com.google.android.apps.gsa.nga.shared.v.a.a.d.f1016a.createBuilder();
                com.google.android.apps.gsa.nga.shared.v.a.a.a aVar = com.google.android.apps.gsa.nga.shared.v.a.a.a.a;
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.nga.shared.v.a.a.d dVar3 = (com.google.android.apps.gsa.nga.shared.v.a.a.d) createBuilder.instance;
                aVar.getClass();
                dVar3.c = aVar;
                dVar3.b = 1;
                dVar = (com.google.android.apps.gsa.nga.shared.v.a.a.d) createBuilder.build();
            } else {
                ba createBuilder2 = com.google.android.apps.gsa.nga.shared.v.a.a.d.f1016a.createBuilder();
                ba createBuilder3 = b.a.createBuilder();
                createBuilder3.copyOnWrite();
                b bVar = createBuilder3.instance;
                com.google.protobuf.bs bsVar = bVar.b;
                if (!bsVar.c()) {
                    bVar.b = bi.mutableCopy(bsVar);
                }
                com.google.protobuf.c.addAll(flVar, bVar.b);
                b build = createBuilder3.build();
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.nga.shared.v.a.a.d dVar4 = (com.google.android.apps.gsa.nga.shared.v.a.a.d) createBuilder2.instance;
                build.getClass();
                dVar4.c = build;
                dVar4.b = 4;
                dVar = (com.google.android.apps.gsa.nga.shared.v.a.a.d) createBuilder2.build();
            }
            if (dVar.equals(dVar2)) {
                return;
            }
            this.d = dVar;
            this.c.a(dVar);
        }
    }

    public final boolean e() {
        int i;
        synchronized (this) {
            i = this.d.b;
        }
        return i == 4;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        f fVar = this.e;
        synchronized (fVar.e) {
            if (fVar.g.isEmpty()) {
                fVar.d.isPresent();
                g$.ExternalSyntheticApiModelOutline0.m(fVar.b, g$.ExternalSyntheticApiModelOutline0.m(fVar.d.get()), (Handler) null);
            }
            fVar.g.add(this);
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        cn cnVar;
        synchronized (this) {
            f fVar = this.e;
            synchronized (fVar.e) {
                fVar.g.remove(this);
                fVar.i.remove(this);
                if (fVar.g.isEmpty()) {
                    fVar.d.isPresent();
                    g$.ExternalSyntheticApiModelOutline0.m(fVar.b, g$.ExternalSyntheticApiModelOutline0.m(fVar.d.get()));
                }
            }
            this.d = com.google.android.apps.gsa.nga.shared.v.a.a.d.f1016a;
            cnVar = com.google.android.apps.gsa.v.c.b;
        }
        return cnVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "MicExclusiveCheckerImpl";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 39;
    }
}
