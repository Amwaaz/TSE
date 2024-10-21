package com.google.android.apps.gsa.nga.engine.recognition.e;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.h;
import com.google.android.apps.gsa.nga.engine.recognition.i;
import com.google.android.apps.gsa.nga.engine.recognition.j;
import com.google.android.apps.gsa.nga.engine.recognition.n;
import com.google.android.apps.gsa.nga.engine.recognition.r;
import com.google.android.apps.gsa.nga.engine.recognition.s;
import com.google.android.apps.gsa.nga.engine.recognition.t;
import com.google.android.apps.gsa.nga.engine.recognition.z;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.engine.v.a.ar;
import com.google.android.apps.gsa.nga.engine.v.a.aw;
import com.google.android.apps.gsa.nga.engine.v.p;
import com.google.android.apps.gsa.nga.engine.v.u;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.cs;
import com.google.android.apps.gsa.nga.shared.q.d.ct;
import com.google.android.apps.gsa.nga.shared.q.d.cu;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import com.google.speech.recognizer.a.f;
import e.a;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/e/b.class */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private static final d f649a = d.j();
    private final a b;
    private final com.google.android.apps.gsa.shared.util.q.a c;
    private final aw d;
    private final Optional e;
    private String f = "";
    private u g = null;
    private final af h;
    private final ap i;

    public b(a aVar, com.google.android.apps.gsa.shared.util.q.a aVar2, ap apVar, af afVar, aw awVar, Optional optional) {
        this.b = aVar;
        this.c = aVar2;
        this.i = apVar;
        this.h = afVar;
        this.d = awVar;
        this.e = optional;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.n
    public final void b(f fVar, v vVar, boolean z) {
        Iterator it = ((Set) this.b.a()).iterator();
        while (it.hasNext()) {
            ((r) it.next()).ha(fVar, vVar, z);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.n
    public final void c(com.google.android.apps.gsa.nga.engine.recognition.u uVar, String str) {
        ba createBuilder = cu.a.createBuilder();
        createBuilder.copyOnWrite();
        cu cuVar = createBuilder.instance;
        str.getClass();
        cuVar.b |= 4;
        cuVar.d = str;
        com.google.android.apps.gsa.nga.shared.u.j.b.a a2 = p.a(uVar);
        createBuilder.copyOnWrite();
        cu cuVar2 = createBuilder.instance;
        cuVar2.f = a2.getNumber();
        cuVar2.b |= 16;
        boolean isEmpty = uVar.b().isEmpty();
        createBuilder.copyOnWrite();
        cu cuVar3 = createBuilder.instance;
        cuVar3.b |= 128;
        cuVar3.i = !isEmpty;
        cs b = uVar.n.b();
        createBuilder.copyOnWrite();
        cu cuVar4 = createBuilder.instance;
        b.getClass();
        cuVar4.e = b;
        cuVar4.b |= 8;
        if (uVar.r.isPresent()) {
            int ordinal = ((i) uVar.r.get()).ordinal();
            if (ordinal == 0) {
                createBuilder.copyOnWrite();
                cu cuVar5 = createBuilder.instance;
                cuVar5.j = 0;
                cuVar5.b |= 256;
            } else if (ordinal == 1) {
                createBuilder.copyOnWrite();
                cu cuVar6 = createBuilder.instance;
                cuVar6.j = 1;
                cuVar6.b |= 256;
            } else if (ordinal == 2) {
                createBuilder.copyOnWrite();
                cu cuVar7 = createBuilder.instance;
                cuVar7.j = 2;
                cuVar7.b |= 256;
            }
        }
        int ordinal2 = uVar.g.ordinal();
        if (ordinal2 == 0) {
            ct ctVar = ct.d;
            createBuilder.copyOnWrite();
            cu cuVar8 = createBuilder.instance;
            cuVar8.c = ctVar.k;
            cuVar8.b |= 1;
        } else if (ordinal2 == 1) {
            ct ctVar2 = ct.e;
            createBuilder.copyOnWrite();
            cu cuVar9 = createBuilder.instance;
            cuVar9.c = ctVar2.k;
            cuVar9.b |= 1;
        } else if (ordinal2 == 2) {
            ct ctVar3 = ct.f;
            createBuilder.copyOnWrite();
            cu cuVar10 = createBuilder.instance;
            cuVar10.c = ctVar3.k;
            cuVar10.b |= 1;
        }
        af afVar = this.h;
        bk bkVar = bk.SPEECH_EVENT;
        ba createBuilder2 = bj.a.createBuilder();
        createBuilder2.copyOnWrite();
        bj bjVar = createBuilder2.instance;
        cu build = createBuilder.build();
        build.getClass();
        bjVar.c = build;
        bjVar.b = 13;
        afVar.b(bkVar, (bj) createBuilder2.build(), uVar.j.c());
        if (uVar.d() && this.c.i(df.bG)) {
            com.google.common.f.a.a d = f649a.d();
            d.ak(3851);
            d.s("Recognized Text: %s", uVar.b());
        }
        com.google.android.apps.gsa.nga.engine.b.c.a aVar = uVar.j;
        if (uVar.f) {
            j jVar = new j(aVar.a, uVar.l);
            Iterator it = ((Set) this.b.a()).iterator();
            while (it.hasNext()) {
                ((r) it.next()).c(jVar);
            }
        }
        if (!uVar.b().isEmpty()) {
            boolean z = uVar.f;
            Instant instant = uVar.a;
            if (instant == null) {
                throw new NullPointerException("Null instant");
            }
            String c = uVar.c();
            if (c == null) {
                throw new NullPointerException("Null transcript");
            }
            if (aVar == null) {
                throw new NullPointerException("Null candidateIdentifier");
            }
            z zVar = uVar.n;
            if (zVar == null) {
                throw new NullPointerException("Null speakerInfo");
            }
            com.google.android.apps.gsa.nga.engine.recognition.af afVar2 = new com.google.android.apps.gsa.nga.engine.recognition.af(c, instant, z, aVar, zVar);
            Iterator it2 = ((Set) this.b.a()).iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).e(afVar2);
            }
        } else if (!uVar.d()) {
            return;
        }
        aVar.e();
        uVar.b();
        if (this.c.i(eu.gy) || !uVar.g.equals(t.a) || uVar.f) {
            this.e.ifPresent(new a(uVar));
            if (uVar.d()) {
                this.f = "";
                u uVar2 = this.g;
                if (uVar2 != null) {
                    uVar2.c();
                    this.g = null;
                }
            } else if (!uVar.b().equals(this.f)) {
                this.f = uVar.b();
                ar arVar = this.g;
                if (arVar != null) {
                    synchronized (arVar) {
                        arVar.d();
                        if (!arVar.b) {
                            arVar.e(4);
                        }
                    }
                }
                this.g = this.i.a(27, uVar.j.c());
            }
            s sVar = new s(uVar);
            fl flVar = uVar.d;
            if (!flVar.isEmpty()) {
                sVar.c = fl.m(flVar.subList(0, Math.min(flVar.size(), (int) (uVar.l == h.b ? this.c.d(eu.ma) : this.c.d(eu.lZ)))));
            }
            com.google.android.apps.gsa.nga.engine.recognition.u a3 = sVar.a();
            this.d.d(a3);
            this.h.c(bk.QUERY_SENSITIVE, new com.google.android.apps.gsa.nga.engine.v.n(Optional.empty(), a3), a3.j.c());
            Iterator it3 = ((Set) this.b.a()).iterator();
            while (it3.hasNext()) {
                ((r) it3.next()).hg(a3);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.d
    public final void gZ(com.google.android.apps.gsa.nga.engine.recognition.f fVar) {
        Iterator it = ((Set) this.b.a()).iterator();
        while (it.hasNext()) {
            ((r) it.next()).gZ(fVar);
        }
    }
}
