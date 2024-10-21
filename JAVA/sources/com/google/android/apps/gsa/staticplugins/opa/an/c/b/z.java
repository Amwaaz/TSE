package com.google.android.apps.gsa.staticplugins.opa.an.c.b;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.api.a.ab;
import com.google.android.apps.gsa.opa.f.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.h;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.staticplugins.opa.an.c.d.e;
import com.google.android.apps.gsa.staticplugins.opa.an.c.d.k;
import com.google.android.apps.gsa.staticplugins.opa.an.c.d.l;
import com.google.android.apps.gsa.staticplugins.opa.an.c.d.q;
import com.google.android.apps.search.assistant.surfaces.voice.handsfree.c.d;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.ha;
import com.google.common.b.oo;
import com.google.common.b.qj;
import com.google.common.o.r;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.common.v.f;
import com.google.g.e.h.a.bt;
import com.google.g.e.h.a.eg;
import com.google.g.e.i.bx;
import com.google.g.e.i.cd;
import com.google.g.e.i.ce;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.g.e.i.si;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cu;
import com.google.protobuf.v;
import com.google.speech.recognizer.a.s;
import com.google.speech.recognizer.a.u;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/an/c/b/z.class */
public class z implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1758a = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.opa.an.c.b.z");
    private static final ha f = ha.s(c.HOTWORD, c.LOCKSCREEN_HOTWORD);
    public final Executor b;
    public final f c;
    public final d d;
    public final com.google.android.apps.gsa.shared.util.q.a e;
    private final p g;
    private final h h;
    private final com.google.android.libraries.search.assistant.y.d i;
    private final PackageManager j;
    private final Optional k;
    private final ha l;

    public z(p pVar, h hVar, Executor executor, com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.libraries.search.assistant.y.d dVar, f fVar, d dVar2, PackageManager packageManager, Optional optional, ha haVar) {
        this.g = pVar;
        this.h = hVar;
        this.b = executor;
        this.e = aVar;
        this.i = dVar;
        this.c = fVar;
        this.d = dVar2;
        this.j = packageManager;
        this.k = optional;
        this.l = haVar;
    }

    private final void u(com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar) {
        this.g.c(hVar, Bundle.EMPTY);
    }

    private final void v(com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar, Bundle bundle) {
        this.g.c(hVar, bundle);
    }

    private final void w(boolean z) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = e.a.createBuilder();
        createBuilder2.copyOnWrite();
        e eVar = createBuilder2.instance;
        eVar.b |= 1;
        eVar.c = z;
        e build = createBuilder2.build();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        build.getClass();
        hVar.d = build;
        hVar.c = 24;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    private static void x(List list, ba baVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.apps.gsa.shared.logger.b.f fVar = (com.google.android.apps.gsa.shared.logger.b.f) it.next();
            ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.b.a.createBuilder();
            w wVar = fVar.a;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.staticplugins.opa.an.c.d.b bVar = createBuilder.instance;
            bVar.c = wVar.aaF;
            bVar.b |= 1;
            long j = fVar.e;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.staticplugins.opa.an.c.d.b bVar2 = createBuilder.instance;
            bVar2.b |= 2;
            bVar2.e = j;
            r rVar = fVar.d;
            if (rVar != null) {
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.staticplugins.opa.an.c.d.b bVar3 = createBuilder.instance;
                bVar3.f = rVar;
                bVar3.b |= 4;
            }
            fu fuVar = fVar.c;
            if (fuVar != null) {
                qj j2 = fuVar.v().j();
                while (j2.hasNext()) {
                    Map.Entry entry = (Map.Entry) j2.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    str.getClass();
                    str2.getClass();
                    createBuilder.copyOnWrite();
                    com.google.android.apps.gsa.staticplugins.opa.an.c.d.b bVar4 = createBuilder.instance;
                    cu cuVar = bVar4.d;
                    if (!cuVar.b) {
                        bVar4.d = cuVar.a();
                    }
                    bVar4.d.put(str, str2);
                }
            }
            baVar.copyOnWrite();
            com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = baVar.instance;
            com.google.android.apps.gsa.staticplugins.opa.an.c.d.b build = createBuilder.build();
            com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a;
            build.getClass();
            cb cbVar = hVar.e;
            if (!cbVar.c()) {
                hVar.e = bi.mutableCopy(cbVar);
            }
            hVar.e.add(build);
        }
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void a(String str, String str2, s sVar, List list, Bundle bundle) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.u.b.c.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.c cVar = createBuilder2.instance;
        str.getClass();
        cVar.b |= 1;
        cVar.c = str;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.c cVar2 = createBuilder2.instance;
        str2.getClass();
        cVar2.b |= 4;
        cVar2.e = str2;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.c cVar3 = createBuilder2.instance;
        sVar.getClass();
        cVar3.d = sVar;
        cVar3.b |= 2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.nga.shared.u.b.c build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 3;
        x(list, createBuilder);
        v((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build(), bundle);
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void b() {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.c cVar = com.google.android.apps.gsa.staticplugins.opa.an.c.d.c.a;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        cVar.getClass();
        hVar.d = cVar;
        hVar.c = 6;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void c(String str, String str2, com.google.common.o.o.p pVar, bx bxVar, boolean z, List list, Bundle bundle) {
        eg egVar;
        ba createBuilder = eg.a.createBuilder();
        createBuilder.copyOnWrite();
        eg egVar2 = createBuilder.instance;
        pVar.getClass();
        egVar2.c = pVar;
        egVar2.b |= 1;
        eg build = createBuilder.build();
        ce ceVar = bxVar.f;
        ce ceVar2 = ceVar;
        if (ceVar == null) {
            ceVar2 = ce.a;
        }
        Iterator it = ceVar2.b.iterator();
        while (true) {
            egVar = build;
            if (!it.hasNext()) {
                break;
            }
            ej ejVar = (ej) it.next();
            if ("asst.nga.response.params".equals(ejVar.c)) {
                ei eiVar = ejVar.d;
                ei eiVar2 = eiVar;
                if (eiVar == null) {
                    eiVar2 = ei.a;
                }
                if ("assistant.api.params.NgaResponseParams".equals(eiVar2.c)) {
                    try {
                        ei eiVar3 = ejVar.d;
                        ei eiVar4 = eiVar3;
                        if (eiVar3 == null) {
                            eiVar4 = ei.a;
                        }
                        ba builder = bi.parseFrom(eg.a, eiVar4.d).toBuilder();
                        builder.copyOnWrite();
                        eg egVar3 = builder.instance;
                        pVar.getClass();
                        egVar3.c = pVar;
                        egVar3.b |= 1;
                        egVar = builder.build();
                    } catch (com.google.protobuf.ce e) {
                        egVar = build;
                    }
                }
            }
        }
        si builder2 = bxVar.toBuilder();
        ce ceVar3 = bxVar.f;
        ce ceVar4 = ceVar3;
        if (ceVar3 == null) {
            ceVar4 = ce.a;
        }
        v byteString = egVar.toByteString();
        cd builder3 = ceVar4.toBuilder();
        int size = builder3.instance.b.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                break;
            }
            size = i;
            if ("asst.nga.response.params".equals(builder3.q(i).c)) {
                builder3.u(i);
                break;
            }
        }
        ba createBuilder2 = ej.a.createBuilder();
        createBuilder2.copyOnWrite();
        ej ejVar2 = createBuilder2.instance;
        ejVar2.b |= 1;
        ejVar2.c = "asst.nga.response.params";
        ba createBuilder3 = ei.a.createBuilder();
        createBuilder3.copyOnWrite();
        ei eiVar5 = createBuilder3.instance;
        eiVar5.b |= 1;
        eiVar5.c = "assistant.api.params.NgaResponseParams";
        createBuilder3.copyOnWrite();
        ei eiVar6 = createBuilder3.instance;
        byteString.getClass();
        eiVar6.b |= 2;
        eiVar6.d = byteString;
        createBuilder2.copyOnWrite();
        ej ejVar3 = createBuilder2.instance;
        ei build2 = createBuilder3.build();
        build2.getClass();
        ejVar3.d = build2;
        ejVar3.b |= 2;
        builder3.w(createBuilder2);
        ce build3 = builder3.build();
        builder2.copyOnWrite();
        bx bxVar2 = builder2.instance;
        build3.getClass();
        bxVar2.f = build3;
        bxVar2.b |= 16;
        bx build4 = builder2.build();
        ba createBuilder4 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder5 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.d.a.createBuilder();
        createBuilder5.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.d dVar = createBuilder5.instance;
        str.getClass();
        dVar.b |= 8;
        dVar.f = str;
        createBuilder5.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.d dVar2 = createBuilder5.instance;
        str2.getClass();
        dVar2.b |= 1;
        dVar2.c = str2;
        createBuilder5.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.d dVar3 = createBuilder5.instance;
        pVar.getClass();
        dVar3.e = pVar;
        dVar3.b |= 4;
        createBuilder5.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.d dVar4 = createBuilder5.instance;
        build4.getClass();
        dVar4.d = build4;
        dVar4.b |= 2;
        createBuilder5.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.d dVar5 = createBuilder5.instance;
        dVar5.b |= 16;
        dVar5.g = z;
        createBuilder4.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder4.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.d build5 = createBuilder5.build();
        build5.getClass();
        hVar.d = build5;
        hVar.c = 5;
        x(list, createBuilder4);
        v((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder4.build(), bundle);
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void d(com.google.android.apps.gsa.opa.f.c cVar) {
        if (f.contains(cVar.b)) {
            dl.y(i.h(i.h(!this.j.hasSystemFeature("com.google.android.feature.PIXEL_TABLET_2023_EXPERIENCE") ? dl.n(s()) : (cn) this.k.map(new w(this, 1)).orElseGet(new t()), new x(this), ay.a), new u(this, !this.e.i(eu.di) ? dl.n(Optional.empty()) : com.google.common.util.concurrent.c.g(i.g(cf.i(this.i.a()), new r(this, 0), this.b), Throwable.class, new s(1), this.b)), this.b), new y(this, cVar), this.b);
        } else {
            t(cVar, Optional.empty(), Optional.empty());
        }
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void e(fl flVar, String str) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.f.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.f fVar = createBuilder2.instance;
        fVar.b |= 1;
        fVar.c = str;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.f build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 20;
        x(flVar, createBuilder);
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void f(ab abVar) {
        if (this.e.i(eu.aN)) {
            return;
        }
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.i.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.i iVar = createBuilder2.instance;
        abVar.getClass();
        iVar.c = abVar;
        iVar.b |= 1;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.i build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 21;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void g() {
        w(true);
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void h() {
        w(false);
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void i(String str) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.j.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.j jVar = createBuilder2.instance;
        str.getClass();
        jVar.b |= 1;
        jVar.c = str;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.j build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 25;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void j(String str) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = k.a.createBuilder();
        createBuilder2.copyOnWrite();
        k kVar = createBuilder2.instance;
        str.getClass();
        kVar.b |= 1;
        kVar.c = str;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        k build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 10;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void k() {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.m mVar = com.google.android.apps.gsa.staticplugins.opa.an.c.d.m.a;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        mVar.getClass();
        hVar.d = mVar;
        hVar.c = 19;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void l(String str) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.n.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.n nVar = createBuilder2.instance;
        nVar.b |= 1;
        nVar.c = str;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.n build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 23;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void m(long j) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.o.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.o oVar = createBuilder2.instance;
        oVar.b |= 1;
        oVar.c = j;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.o build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 15;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void n(float f2) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.p.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.p pVar = createBuilder2.instance;
        pVar.b |= 1;
        pVar.c = f2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.p build = createBuilder2.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 22;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void o() {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        l lVar = l.a;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        lVar.getClass();
        hVar.d = lVar;
        hVar.c = 12;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void p(AssistContent assistContent, AssistStructure assistStructure, Bundle bundle, Bitmap bitmap) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("assist-content", assistContent);
        bundle2.putParcelable("assist-structure", assistStructure);
        bundle2.putBundle("assist-data", bundle);
        bundle2.putParcelable("assist-screenshot", bitmap);
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        q qVar = q.a;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        qVar.getClass();
        hVar.d = qVar;
        hVar.c = 9;
        v((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build(), bundle2);
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void q(String str, s sVar) {
        u uVar = sVar.h;
        u uVar2 = uVar;
        if (uVar == null) {
            uVar2 = u.a;
        }
        com.google.speech.recognizer.a.h hVar = (com.google.speech.recognizer.a.h) oo.ax(uVar2.e, (Object) null);
        if (hVar != null) {
            com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
            eVar.a = w.ASR_PREFETCH_RECEIVED_BY_SEARCH;
            eVar.c("queryHash", Integer.toString(hVar.c.hashCode()));
            eVar.c("rId", str);
            this.h.a(eVar.a());
        }
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.u.b.e.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.e eVar2 = createBuilder2.instance;
        str.getClass();
        eVar2.b |= 1;
        eVar2.c = str;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.e eVar3 = createBuilder2.instance;
        sVar.getClass();
        eVar3.d = sVar;
        eVar3.b |= 2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar2 = createBuilder.instance;
        com.google.android.apps.gsa.nga.shared.u.b.e build = createBuilder2.build();
        build.getClass();
        hVar2.d = build;
        hVar2.c = 2;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.opa.f.b
    public final void r(String str, int i) {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.u.b.b.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.b bVar = createBuilder2.instance;
        str.getClass();
        bVar.b |= 1;
        bVar.c = str;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.b bVar2 = createBuilder2.instance;
        bVar2.d = i - 1;
        bVar2.b |= 2;
        com.google.android.apps.gsa.nga.shared.u.b.b build = createBuilder2.build();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder.instance;
        build.getClass();
        hVar.d = build;
        hVar.c = 4;
        u((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder.build());
    }

    public final fl s() {
        fg fgVar = new fg(4);
        HashSet<bt> hashSet = new HashSet((Collection) com.google.android.apps.gsa.shared.k.b.a(this.e.h(eu.hh), new q()));
        hashSet.remove(bt.a);
        for (bt btVar : hashSet) {
            if (this.l.contains(btVar)) {
                fgVar.h(btVar);
            } else {
                com.google.common.f.h f2 = f1758a.f();
                f2.ak(17794);
                f2.q("Unsupported requested attribute: %d", btVar.i);
            }
        }
        return fgVar.g();
    }

    public final void t(com.google.android.apps.gsa.opa.f.c cVar, Optional optional, Optional optional2) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.b.d.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar = createBuilder.instance;
        String str = cVar.a;
        str.getClass();
        dVar.b |= 1;
        dVar.c = str;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar2 = createBuilder.instance;
        dVar2.e = cVar.b.cF;
        dVar2.b |= 4;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar3 = createBuilder.instance;
        dVar3.b |= 256;
        dVar3.j = cVar.c;
        int i = cVar.d.Z;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar4 = createBuilder.instance;
        dVar4.b |= 512;
        dVar4.k = i;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar5 = createBuilder.instance;
        String str2 = cVar.e;
        str2.getClass();
        dVar5.b |= 8;
        dVar5.f = str2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar6 = createBuilder.instance;
        ce ceVar = cVar.f;
        ceVar.getClass();
        dVar6.d = ceVar;
        dVar6.b |= 2;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar7 = createBuilder.instance;
        dVar7.b |= 64;
        dVar7.h = cVar.i;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar8 = createBuilder.instance;
        dVar8.b |= 1024;
        dVar8.l = cVar.k;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.b.d dVar9 = createBuilder.instance;
        dVar9.b |= 2048;
        dVar9.m = cVar.l;
        optional.ifPresent(new v(createBuilder, 1));
        optional2.ifPresent(new v(createBuilder, 0));
        cVar.g.ifPresent(new v(createBuilder, 2));
        cVar.j.ifPresent(new v(createBuilder, 3));
        ba createBuilder2 = com.google.android.apps.gsa.staticplugins.opa.an.c.d.h.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar = createBuilder2.instance;
        com.google.android.apps.gsa.nga.shared.u.b.d build = createBuilder.build();
        build.getClass();
        hVar.d = build;
        hVar.c = 1;
        v((com.google.android.apps.gsa.staticplugins.opa.an.c.d.h) createBuilder2.build(), cVar.h);
    }
}
