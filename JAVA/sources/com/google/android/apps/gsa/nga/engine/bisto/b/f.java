package com.google.android.apps.gsa.nga.engine.bisto.b;

import com.google.android.apps.gsa.nga.api.a.ac;
import com.google.android.apps.gsa.nga.api.a.ai;
import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.g;
import com.google.android.apps.gsa.nga.api.a.s;
import com.google.android.apps.gsa.nga.api.au;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.recognition.af;
import com.google.android.apps.gsa.nga.engine.recognition.j;
import com.google.android.apps.gsa.nga.engine.recognition.r;
import com.google.android.apps.gsa.nga.engine.recognition.t;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.shared.d.b;
import com.google.android.apps.gsa.nga.shared.q.c.fb;
import com.google.android.libraries.search.d.dl;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/bisto/b/f.class */
public final class f implements com.google.android.apps.gsa.nga.engine.ar.c, r, com.google.android.apps.gsa.nga.engine.recognition.g.c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f513a = d.j();
    public final com.google.android.libraries.gsa.h.h b;
    public final au c;
    public final b d;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d e;
    private final com.google.android.apps.gsa.nga.shared.ad.a.d f;

    public f(com.google.android.libraries.gsa.h.h hVar, au auVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, com.google.android.apps.gsa.nga.shared.ad.a.d dVar2, b bVar) {
        this.b = hVar;
        this.c = auVar;
        this.e = dVar;
        this.f = dVar2;
        this.d = bVar;
    }

    private final Optional j(aj ajVar, com.google.android.apps.gsa.nga.engine.b.g.v vVar) {
        return !Optional.of(vVar).equals(ajVar.b) ? Optional.empty() : f(ajVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(ah ahVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final /* synthetic */ void c(j jVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final /* synthetic */ void e(af afVar) {
    }

    public final Optional f(aj ajVar) {
        return this.f.d(ajVar.c());
    }

    public final void g(ak akVar) {
        this.b.n("[NGA] QueryStatusDispatcherImpl#notifyListener", new d(this, akVar, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.d
    public final /* synthetic */ void gZ(com.google.android.apps.gsa.nga.engine.recognition.f fVar) {
    }

    public final void h(ai aiVar) {
        this.b.n("[NGA] QueryStatusDispatcherImpl#suppressListener", new d(this, aiVar, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final /* synthetic */ void ha(com.google.speech.recognizer.a.f fVar, com.google.android.apps.gsa.nga.engine.b.g.v vVar, boolean z) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        Optional f = f(ajVar);
        Optional f2 = f(ajVar2);
        if (!f.equals(f2) && !ajVar2.k() && !ajVar.k()) {
            dl dlVar = (dl) f2.orElse(dl.f5109a);
            ba createBuilder = ak.a.createBuilder();
            createBuilder.copyOnWrite();
            ak akVar = createBuilder.instance;
            dlVar.getClass();
            akVar.e = dlVar;
            akVar.b |= 1;
            com.google.android.apps.gsa.nga.api.a.m mVar = com.google.android.apps.gsa.nga.api.a.m.a;
            createBuilder.copyOnWrite();
            ak akVar2 = createBuilder.instance;
            mVar.getClass();
            akVar2.d = mVar;
            akVar2.c = 10;
            g((ak) createBuilder.build());
        }
        if (ajVar.k()) {
            dl dlVar2 = (dl) f2.orElse(dl.f5109a);
            ba createBuilder2 = ak.a.createBuilder();
            createBuilder2.copyOnWrite();
            ak akVar3 = createBuilder2.instance;
            dlVar2.getClass();
            akVar3.e = dlVar2;
            akVar3.b |= 1;
            com.google.android.apps.gsa.nga.api.a.m mVar2 = com.google.android.apps.gsa.nga.api.a.m.a;
            createBuilder2.copyOnWrite();
            ak akVar4 = createBuilder2.instance;
            mVar2.getClass();
            akVar4.d = mVar2;
            akVar4.c = 10;
            g((ak) createBuilder2.build());
            return;
        }
        if (ajVar.f473a.a()) {
            dl dlVar3 = (dl) f.orElse(dl.f5109a);
            ba createBuilder3 = ak.a.createBuilder();
            createBuilder3.copyOnWrite();
            ak akVar5 = createBuilder3.instance;
            dlVar3.getClass();
            akVar5.e = dlVar3;
            akVar5.b |= 1;
            s sVar = s.a;
            createBuilder3.copyOnWrite();
            ak akVar6 = createBuilder3.instance;
            sVar.getClass();
            akVar6.d = sVar;
            akVar6.c = 3;
            g((ak) createBuilder3.build());
            return;
        }
        if (ajVar.g()) {
            dl dlVar4 = (dl) f.orElse(dl.f5109a);
            ba createBuilder4 = ak.a.createBuilder();
            createBuilder4.copyOnWrite();
            ak akVar7 = createBuilder4.instance;
            dlVar4.getClass();
            akVar7.e = dlVar4;
            akVar7.b |= 1;
            g gVar = g.a;
            createBuilder4.copyOnWrite();
            ak akVar8 = createBuilder4.instance;
            gVar.getClass();
            akVar8.d = gVar;
            akVar8.c = 9;
            g((ak) createBuilder4.build());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.r
    public final void hg(u uVar) {
        t tVar = uVar.g;
        if (tVar == t.c || tVar == t.a) {
            Optional j = j(this.e.a(), uVar.j.a);
            if (j.isEmpty()) {
                return;
            }
            if (uVar.g == t.c) {
                dl dlVar = (dl) j.get();
                ba createBuilder = ak.a.createBuilder();
                createBuilder.copyOnWrite();
                ak akVar = createBuilder.instance;
                akVar.e = dlVar;
                akVar.b |= 1;
                ba createBuilder2 = al.a.createBuilder();
                String b = uVar.b();
                createBuilder2.copyOnWrite();
                al alVar = createBuilder2.instance;
                b.getClass();
                alVar.b = b;
                al build = createBuilder2.build();
                createBuilder.copyOnWrite();
                ak akVar2 = createBuilder.instance;
                build.getClass();
                akVar2.d = build;
                akVar2.c = 4;
                g((ak) createBuilder.build());
                return;
            }
            dl dlVar2 = (dl) j.get();
            ba createBuilder3 = ak.a.createBuilder();
            createBuilder3.copyOnWrite();
            ak akVar3 = createBuilder3.instance;
            akVar3.e = dlVar2;
            akVar3.b |= 1;
            ba createBuilder4 = com.google.android.apps.gsa.nga.api.a.af.a.createBuilder();
            String b2 = uVar.b();
            createBuilder4.copyOnWrite();
            com.google.android.apps.gsa.nga.api.a.af afVar = createBuilder4.instance;
            b2.getClass();
            afVar.b = b2;
            com.google.android.apps.gsa.nga.api.a.af build2 = createBuilder4.build();
            createBuilder3.copyOnWrite();
            ak akVar4 = createBuilder3.instance;
            build2.getClass();
            akVar4.d = build2;
            akVar4.c = 11;
            g((ak) createBuilder3.build());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.g.c
    public final void i(com.google.android.apps.gsa.nga.engine.b.g.v vVar) {
        Optional j = j(this.e.a(), vVar);
        if (j.isEmpty()) {
            return;
        }
        this.d.b.b(new fb((byte[]) null));
        dl dlVar = (dl) j.get();
        ba createBuilder = ak.a.createBuilder();
        createBuilder.copyOnWrite();
        ak akVar = createBuilder.instance;
        akVar.e = dlVar;
        akVar.b |= 1;
        ac acVar = ac.a;
        createBuilder.copyOnWrite();
        ak akVar2 = createBuilder.instance;
        acVar.getClass();
        akVar2.d = acVar;
        akVar2.c = 5;
        g((ak) createBuilder.build());
    }
}
