package com.google.android.apps.gsa.nga.engine.recognition.n.a;

import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.g.a;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.recognition.m.a.ae;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.viss.v;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.cy;
import com.google.android.apps.gsa.nga.shared.u.i.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.ha;
import com.google.common.base.ci;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/n/a/i.class */
public final class i extends com.google.android.apps.gsa.nga.engine.t.c implements com.google.android.apps.gsa.nga.engine.ao.i, com.google.android.apps.gsa.nga.engine.ar.c, a {

    /* renamed from: a, reason: collision with root package name */
    private static final d f671a = d.j();
    private final com.google.android.apps.gsa.shared.util.q.a b;
    private final f c;
    private final e.a d;
    private final Set e;
    private final v f;
    private final ci g;
    private final boolean h;
    private final ae i;
    private b j;
    private final com.google.android.apps.gsa.nga.shared.ad.a.d k;
    private com.google.android.apps.gsa.nga.engine.recognition.n.b l;
    private long m;
    private long n;
    private final af o;
    private final y p;

    public i(com.google.android.apps.gsa.shared.util.q.a aVar, f fVar, e.a aVar2, Set set, v vVar, ci ciVar, af afVar, y yVar, n nVar, boolean z, com.google.android.apps.gsa.nga.shared.ad.a.d dVar, ae aeVar) {
        super(nVar);
        this.b = aVar;
        this.c = fVar;
        this.d = aVar2;
        this.e = set;
        this.f = vVar;
        this.g = ciVar;
        this.o = afVar;
        this.p = yVar;
        this.h = z;
        this.m = ciVar.a();
        this.k = dVar;
        this.l = com.google.android.apps.gsa.nga.engine.recognition.n.b.S3_ONLY;
        this.j = b.S3;
        this.i = aeVar;
    }

    private final Optional e(aj ajVar) {
        boolean z = this.p.c().b;
        ba createBuilder = com.google.android.apps.gsa.nga.engine.recognition.n.b.a.a.createBuilder();
        com.google.android.apps.gsa.nga.engine.recognition.n.b bVar = this.l;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar = createBuilder.instance;
        aVar.e = bVar.getNumber();
        aVar.b |= 4;
        b bVar2 = b.S3;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar2 = createBuilder.instance;
        aVar2.c = bVar2.d;
        aVar2.b |= 1;
        com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.m;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar3 = createBuilder.instance;
        aVar3.d = cVar.u;
        aVar3.b |= 2;
        return Optional.of(createBuilder.build());
    }

    private final Optional f(aj ajVar) {
        if (this.k.e(ajVar.c()).equals(Optional.of(b.SODA))) {
            ba createBuilder = com.google.android.apps.gsa.nga.engine.recognition.n.b.a.a.createBuilder();
            com.google.android.apps.gsa.nga.engine.recognition.n.b bVar = this.l;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar = createBuilder.instance;
            aVar.e = bVar.getNumber();
            aVar.b |= 4;
            b bVar2 = b.SODA;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar2 = createBuilder.instance;
            aVar2.c = bVar2.d;
            aVar2.b |= 1;
            com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.k;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar3 = createBuilder.instance;
            aVar3.d = cVar.u;
            aVar3.b |= 2;
            return Optional.of(createBuilder.build());
        }
        if (!ajVar.i()) {
            return Optional.empty();
        }
        ba createBuilder2 = com.google.android.apps.gsa.nga.engine.recognition.n.b.a.a.createBuilder();
        com.google.android.apps.gsa.nga.engine.recognition.n.b bVar3 = this.l;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar4 = createBuilder2.instance;
        aVar4.e = bVar3.getNumber();
        aVar4.b |= 4;
        b bVar4 = b.SODA;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar5 = createBuilder2.instance;
        aVar5.c = bVar4.d;
        aVar5.b |= 1;
        com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar2 = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.l;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar6 = createBuilder2.instance;
        aVar6.d = cVar2.u;
        aVar6.b |= 2;
        return Optional.of(createBuilder2.build());
    }

    private final void j(com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar) {
        synchronized (this) {
            com.google.common.f.a.a d = f671a.d();
            d.ak(4019);
            b a2 = b.a(aVar.c);
            b bVar = a2;
            if (a2 == null) {
                bVar = b.SODA;
            }
            com.google.android.apps.gsa.nga.engine.recognition.n.b a3 = com.google.android.apps.gsa.nga.engine.recognition.n.b.a(aVar.e);
            com.google.android.apps.gsa.nga.engine.recognition.n.b bVar2 = a3;
            if (a3 == null) {
                bVar2 = com.google.android.apps.gsa.nga.engine.recognition.n.b.DEFAULT_SODA_ONLY;
            }
            com.google.android.apps.gsa.nga.engine.recognition.n.b.c a4 = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.a(aVar.d);
            com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar = a4;
            if (a4 == null) {
                cVar = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.a;
            }
            d.N("Recognizer choice: (recognizer_type: %s, recognizer_mode: %s, choice_reason: %s)", bVar, bVar2, cVar);
            b a5 = b.a(aVar.c);
            b bVar3 = a5;
            if (a5 == null) {
                bVar3 = b.SODA;
            }
            if (bVar3.equals(this.j)) {
                return;
            }
            b a6 = b.a(aVar.c);
            b bVar4 = a6;
            if (a6 == null) {
                bVar4 = b.SODA;
            }
            this.j = bVar4;
            this.n = this.g.a();
            for (com.google.android.apps.gsa.nga.engine.recognition.n.c cVar2 : this.e) {
                b a7 = b.a(aVar.c);
                b bVar5 = a7;
                if (a7 == null) {
                    bVar5 = b.SODA;
                }
                cVar2.f(bVar5);
            }
            com.google.common.f.a.a d2 = f671a.d();
            d2.ak(4020);
            b a8 = b.a(aVar.c);
            b bVar6 = a8;
            if (a8 == null) {
                bVar6 = b.SODA;
            }
            d2.s("New recognizer: %s", bVar6);
            af afVar = this.o;
            bk bkVar = bk.SPEECH_RECOGNITION_SWITCH;
            ba createBuilder = bj.a.createBuilder();
            ba createBuilder2 = cy.a.createBuilder();
            b a9 = b.a(aVar.c);
            b bVar7 = a9;
            if (a9 == null) {
                bVar7 = b.SODA;
            }
            String name = bVar7.name();
            createBuilder2.copyOnWrite();
            cy cyVar = createBuilder2.instance;
            name.getClass();
            cyVar.b = 1;
            cyVar.c = name;
            cy build = createBuilder2.build();
            createBuilder.copyOnWrite();
            bj bjVar = createBuilder.instance;
            build.getClass();
            bjVar.c = build;
            bjVar.b = 59;
            afVar.b(bkVar, (bj) createBuilder.build(), ah.a);
        }
    }

    private final void k() {
        com.google.android.apps.gsa.nga.engine.recognition.n.b bVar;
        synchronized (this) {
            com.google.android.apps.gsa.nga.engine.recognition.n.b bVar2 = (com.google.android.apps.gsa.nga.engine.recognition.n.b) Optional.ofNullable(com.google.android.apps.gsa.nga.engine.recognition.n.b.a((int) this.b.d(eu.lv))).orElse(com.google.android.apps.gsa.nga.engine.recognition.n.b.UNRECOGNIZED);
            if (this.h) {
                bVar = com.google.android.apps.gsa.nga.engine.recognition.n.b.S3_ONLY;
            } else {
                com.google.android.apps.gsa.nga.engine.g.c c = this.p.c();
                bVar = bVar2;
                if (c.f.size() <= 1) {
                    bVar = bVar2;
                    if (com.google.android.apps.gsa.nga.shared.m.b.a(c.d, this.b.h(eu.lV))) {
                        com.google.common.f.a.a d = f671a.d();
                        d.ak(4022);
                        d.p("100 percent SODA launched, uses SODA_ONLY_WHEN_POSSIBLE");
                        bVar = com.google.android.apps.gsa.nga.engine.recognition.n.b.SODA_ONLY_WHEN_POSSIBLE;
                    }
                }
            }
            if (!bVar.equals(this.l)) {
                this.l = bVar;
                if (bVar.equals(com.google.android.apps.gsa.nga.engine.recognition.n.b.DEFAULT_SODA_ONLY)) {
                    ba createBuilder = com.google.android.apps.gsa.nga.engine.recognition.n.b.a.a.createBuilder();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b bVar3 = com.google.android.apps.gsa.nga.engine.recognition.n.b.DEFAULT_SODA_ONLY;
                    createBuilder.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar = createBuilder.instance;
                    aVar.e = bVar3.getNumber();
                    aVar.b |= 4;
                    b bVar4 = b.SODA;
                    createBuilder.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar2 = createBuilder.instance;
                    aVar2.c = bVar4.d;
                    aVar2.b |= 1;
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.c;
                    createBuilder.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar3 = createBuilder.instance;
                    aVar3.d = cVar.u;
                    aVar3.b |= 2;
                    j((com.google.android.apps.gsa.nga.engine.recognition.n.b.a) createBuilder.build());
                } else if (this.l.equals(com.google.android.apps.gsa.nga.engine.recognition.n.b.S3_ONLY)) {
                    ba createBuilder2 = com.google.android.apps.gsa.nga.engine.recognition.n.b.a.a.createBuilder();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b bVar5 = com.google.android.apps.gsa.nga.engine.recognition.n.b.S3_ONLY;
                    createBuilder2.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar4 = createBuilder2.instance;
                    aVar4.e = bVar5.getNumber();
                    aVar4.b |= 4;
                    b bVar6 = b.S3;
                    createBuilder2.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar5 = createBuilder2.instance;
                    aVar5.c = bVar6.d;
                    aVar5.b |= 1;
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar2 = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.d;
                    createBuilder2.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar6 = createBuilder2.instance;
                    aVar6.d = cVar2.u;
                    aVar6.b |= 2;
                    j((com.google.android.apps.gsa.nga.engine.recognition.n.b.a) createBuilder2.build());
                }
                if (this.j == null) {
                    ba createBuilder3 = com.google.android.apps.gsa.nga.engine.recognition.n.b.a.a.createBuilder();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b bVar7 = com.google.android.apps.gsa.nga.engine.recognition.n.b.DEFAULT_SODA_ONLY;
                    createBuilder3.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar7 = createBuilder3.instance;
                    aVar7.e = bVar7.getNumber();
                    aVar7.b |= 4;
                    b bVar8 = b.SODA;
                    createBuilder3.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar8 = createBuilder3.instance;
                    aVar8.c = bVar8.d;
                    aVar8.b |= 1;
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.c cVar3 = com.google.android.apps.gsa.nga.engine.recognition.n.b.c.a;
                    createBuilder3.copyOnWrite();
                    com.google.android.apps.gsa.nga.engine.recognition.n.b.a aVar9 = createBuilder3.instance;
                    aVar9.d = cVar3.u;
                    aVar9.b |= 2;
                    j((com.google.android.apps.gsa.nga.engine.recognition.n.b.a) createBuilder3.build());
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(com.google.android.apps.gsa.nga.engine.ar.ah ahVar) {
        if (ahVar == com.google.android.apps.gsa.nga.engine.ar.ah.IDLE) {
            this.m = this.g.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x05c1 A[Catch: all -> 0x08ac, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0009, B:9:0x0034, B:14:0x0059, B:16:0x0060, B:18:0x0077, B:20:0x088d, B:24:0x0107, B:25:0x010e, B:26:0x0138, B:26:0x0138, B:28:0x089d, B:29:0x08a2, B:30:0x013f, B:32:0x014e, B:33:0x0157, B:35:0x0164, B:36:0x016c, B:38:0x017f, B:39:0x0231, B:40:0x019e, B:42:0x01a7, B:43:0x02bb, B:45:0x02ca, B:46:0x02d3, B:48:0x02e0, B:49:0x02e8, B:50:0x037a, B:52:0x0389, B:53:0x0392, B:55:0x03a1, B:56:0x03aa, B:58:0x03b7, B:59:0x0441, B:61:0x044e, B:63:0x0478, B:65:0x05bb, B:67:0x05c1, B:68:0x05c9, B:70:0x05d3, B:71:0x065d, B:73:0x0667, B:74:0x06f1, B:75:0x0506, B:77:0x0528, B:78:0x05b6, B:79:0x077b, B:80:0x0805, B:82:0x08a4), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05c9 A[Catch: all -> 0x08ac, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0009, B:9:0x0034, B:14:0x0059, B:16:0x0060, B:18:0x0077, B:20:0x088d, B:24:0x0107, B:25:0x010e, B:26:0x0138, B:26:0x0138, B:28:0x089d, B:29:0x08a2, B:30:0x013f, B:32:0x014e, B:33:0x0157, B:35:0x0164, B:36:0x016c, B:38:0x017f, B:39:0x0231, B:40:0x019e, B:42:0x01a7, B:43:0x02bb, B:45:0x02ca, B:46:0x02d3, B:48:0x02e0, B:49:0x02e8, B:50:0x037a, B:52:0x0389, B:53:0x0392, B:55:0x03a1, B:56:0x03aa, B:58:0x03b7, B:59:0x0441, B:61:0x044e, B:63:0x0478, B:65:0x05bb, B:67:0x05c1, B:68:0x05c9, B:70:0x05d3, B:71:0x065d, B:73:0x0667, B:74:0x06f1, B:75:0x0506, B:77:0x0528, B:78:0x05b6, B:79:0x077b, B:80:0x0805, B:82:0x08a4), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.gsa.nga.shared.u.i.b c(com.google.android.apps.gsa.nga.engine.ar.aj r6) {
        /*
            Method dump skipped, instructions count: 2225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.n.a.i.c(com.google.android.apps.gsa.nga.engine.ar.aj):com.google.android.apps.gsa.nga.shared.u.i.b");
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.p.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i, com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        if (haVar.contains(Integer.valueOf(eu.lv.f1451a)) || haVar.contains(Integer.valueOf(eu.lV.f1453a))) {
            k();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        k();
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "SwitchManager";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 42;
    }
}
