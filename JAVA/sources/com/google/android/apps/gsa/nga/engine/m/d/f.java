package com.google.android.apps.gsa.nga.engine.m.d;

import androidx.core.d.e$;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ac.a;
import com.google.android.apps.gsa.nga.engine.ac.a.p;
import com.google.android.apps.gsa.nga.engine.ae.a.i;
import com.google.android.apps.gsa.nga.engine.annotators.m;
import com.google.android.apps.gsa.nga.engine.q.a.b;
import com.google.android.apps.gsa.nga.engine.q.c;
import com.google.android.apps.gsa.nga.engine.understanding.c.g;
import com.google.android.apps.gsa.nga.shared.aa.a.h;
import com.google.android.apps.gsa.nga.shared.aa.a.j;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bg;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.u.f.o;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.gsa.conversation.h.l;
import com.google.common.f.a.d;
import com.google.common.f.a.e;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.e.h.a.ep;
import com.google.g.e.h.a.er;
import com.google.g.e.h.a.es;
import com.google.g.e.h.a.et;
import com.google.g.e.h.a.ev;
import com.google.g.e.h.a.fr;
import com.google.g.e.i.ce;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.bu;
import com.google.protobuf.cb;
import j$.time.Duration;
import j$.time.temporal.Temporal;
import j$.util.Optional;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/m/d/f.class */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f623a = d.c("CloudHandoverParams");
    public final c b;
    public final m c;
    public final p d;
    private final com.google.android.apps.gsa.shared.util.q.a e;
    private final com.google.common.v.f f;
    private final com.google.android.apps.gsa.nga.engine.am.c g;
    private final af h;
    private final i i;
    private final b j;

    public f(com.google.android.apps.gsa.shared.util.q.a aVar, c cVar, m mVar, af afVar, i iVar, com.google.common.v.f fVar, p pVar, com.google.android.apps.gsa.nga.engine.am.c cVar2, b bVar) {
        this.e = aVar;
        this.b = cVar;
        this.c = mVar;
        this.h = afVar;
        this.i = iVar;
        this.f = fVar;
        this.d = pVar;
        this.g = cVar2;
        this.j = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // com.google.android.apps.gsa.nga.engine.ac.a
    public final Optional a(String str, com.google.android.apps.gsa.nga.engine.b.g.v vVar) {
        h hVar;
        Optional of;
        l lVar = new l();
        Optional b = this.j.b();
        if (b.isPresent()) {
            com.google.android.apps.gsa.nga.engine.q.b bVar = (com.google.android.apps.gsa.nga.engine.q.b) b.get();
            int i = bVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                lVar.c(bVar.a);
            }
        }
        if (this.e.i(eu.dr)) {
            ah b2 = vVar.b();
            com.google.android.apps.gsa.shared.util.q.a aVar = this.e;
            Optional empty = Optional.empty();
            if (aVar.i(eu.fD)) {
                empty = this.i.e();
            }
            c cVar = this.b;
            com.google.common.v.f fVar = this.f;
            d dVar = g.a;
            long a2 = com.google.common.v.c.a(fVar.a());
            ba createBuilder = ep.b.createBuilder();
            createBuilder.copyOnWrite();
            ep epVar = createBuilder.instance;
            str.getClass();
            epVar.c |= 2;
            epVar.f = str;
            createBuilder.copyOnWrite();
            ep epVar2 = createBuilder.instance;
            epVar2.c |= 4;
            epVar2.g = a2;
            if (empty.isPresent()) {
                String str2 = (String) empty.get();
                createBuilder.copyOnWrite();
                ep epVar3 = createBuilder.instance;
                epVar3.c |= 32;
                epVar3.j = str2;
            }
            ba createBuilder2 = es.a.createBuilder();
            createBuilder2.copyOnWrite();
            es esVar = createBuilder2.instance;
            ep build = createBuilder.build();
            build.getClass();
            esVar.d = build;
            esVar.b |= 2;
            ba createBuilder3 = er.a.createBuilder();
            for (o oVar : cVar.i(b2)) {
                ba createBuilder4 = ep.b.createBuilder();
                String str3 = oVar.e;
                createBuilder4.copyOnWrite();
                ep epVar4 = createBuilder4.instance;
                str3.getClass();
                epVar4.c |= 1;
                epVar4.d = str3;
                long j = oVar.g;
                createBuilder4.copyOnWrite();
                ep epVar5 = createBuilder4.instance;
                epVar5.c |= 4;
                epVar5.g = j;
                String str4 = oVar.d;
                createBuilder4.copyOnWrite();
                ep epVar6 = createBuilder4.instance;
                str4.getClass();
                epVar6.c |= 2;
                epVar6.f = str4;
                if ((oVar.c & 8) != 0) {
                    long j2 = oVar.h;
                    createBuilder4.copyOnWrite();
                    ep epVar7 = createBuilder4.instance;
                    epVar7.c |= 8;
                    epVar7.h = j2;
                }
                if ((oVar.c & 128) != 0) {
                    String str5 = oVar.l;
                    createBuilder4.copyOnWrite();
                    ep epVar8 = createBuilder4.instance;
                    str5.getClass();
                    epVar8.c |= 32;
                    epVar8.j = str5;
                }
                for (com.google.android.libraries.search.assistant.z.a.m mVar : oVar.f) {
                    ba createBuilder5 = com.google.g.e.h.a.eu.a.createBuilder();
                    com.google.android.apps.gsa.nga.engine.understanding.c.a aVar2 = g.c;
                    com.google.android.libraries.search.assistant.z.a.l a3 = com.google.android.libraries.search.assistant.z.a.l.a(mVar.d);
                    com.google.android.libraries.search.assistant.z.a.l lVar2 = a3;
                    if (a3 == null) {
                        lVar2 = com.google.android.libraries.search.assistant.z.a.l.v;
                    }
                    et a4 = aVar2.a(lVar2);
                    createBuilder5.copyOnWrite();
                    com.google.g.e.h.a.eu euVar = createBuilder5.instance;
                    euVar.e = a4.v;
                    euVar.b |= 1;
                    int i2 = mVar.e;
                    createBuilder5.copyOnWrite();
                    com.google.g.e.h.a.eu euVar2 = createBuilder5.instance;
                    euVar2.b |= 2;
                    euVar2.f = i2;
                    int i3 = mVar.f;
                    createBuilder5.copyOnWrite();
                    com.google.g.e.h.a.eu euVar3 = createBuilder5.instance;
                    euVar3.b |= 4;
                    euVar3.g = i3;
                    double d = mVar.h;
                    createBuilder5.copyOnWrite();
                    com.google.g.e.h.a.eu euVar4 = createBuilder5.instance;
                    euVar4.b |= 8;
                    euVar4.h = d;
                    if (mVar.b == 10) {
                        ba createBuilder6 = ev.a.createBuilder();
                        String str6 = (mVar.b == 10 ? (com.google.android.libraries.search.assistant.z.a.p) mVar.c : com.google.android.libraries.search.assistant.z.a.p.a).b;
                        createBuilder6.copyOnWrite();
                        ev evVar = createBuilder6.instance;
                        str6.getClass();
                        evVar.b |= 1;
                        evVar.c = str6;
                        String str7 = (mVar.b == 10 ? (com.google.android.libraries.search.assistant.z.a.p) mVar.c : com.google.android.libraries.search.assistant.z.a.p.a).c;
                        createBuilder6.copyOnWrite();
                        ev evVar2 = createBuilder6.instance;
                        str7.getClass();
                        evVar2.b |= 2;
                        evVar2.d = str7;
                        cb cbVar = (mVar.b == 10 ? (com.google.android.libraries.search.assistant.z.a.p) mVar.c : com.google.android.libraries.search.assistant.z.a.p.a).d;
                        createBuilder6.copyOnWrite();
                        ev evVar3 = createBuilder6.instance;
                        cb cbVar2 = evVar3.e;
                        if (!cbVar2.c()) {
                            evVar3.e = bi.mutableCopy(cbVar2);
                        }
                        com.google.protobuf.c.addAll(cbVar, evVar3.e);
                        createBuilder5.copyOnWrite();
                        com.google.g.e.h.a.eu euVar5 = createBuilder5.instance;
                        ev build2 = createBuilder6.build();
                        build2.getClass();
                        euVar5.d = build2;
                        euVar5.c = 5;
                    }
                    com.google.g.e.h.a.eu build3 = createBuilder5.build();
                    createBuilder4.copyOnWrite();
                    ep epVar9 = createBuilder4.instance;
                    build3.getClass();
                    cb cbVar3 = epVar9.e;
                    if (!cbVar3.c()) {
                        epVar9.e = bi.mutableCopy(cbVar3);
                    }
                    epVar9.e.add(build3);
                }
                bu buVar = new bu(oVar.m, o.a);
                createBuilder4.copyOnWrite();
                ep epVar10 = createBuilder4.instance;
                bs bsVar = epVar10.k;
                if (!bsVar.c()) {
                    epVar10.k = bi.mutableCopy(bsVar);
                }
                Iterator it = buVar.iterator();
                while (it.hasNext()) {
                    epVar10.k.g(((com.google.bz.i.b) it.next()).D);
                }
                createBuilder3.copyOnWrite();
                er erVar = createBuilder3.instance;
                ep build4 = createBuilder4.build();
                build4.getClass();
                cb cbVar4 = erVar.c;
                if (!cbVar4.c()) {
                    erVar.c = bi.mutableCopy(cbVar4);
                }
                erVar.c.add(build4);
            }
            Optional h = cVar.h();
            boolean z = false;
            if (h.isPresent()) {
                z = false;
                if (Duration.between((Temporal) h.get(), fVar.a()).compareTo(g.b) < 0) {
                    z = true;
                }
            }
            createBuilder3.copyOnWrite();
            er erVar2 = createBuilder3.instance;
            erVar2.b |= 4;
            erVar2.e = z;
            createBuilder3.copyOnWrite();
            er erVar3 = createBuilder3.instance;
            erVar3.b |= 2;
            erVar3.d = true;
            er build5 = createBuilder3.build();
            createBuilder2.copyOnWrite();
            es esVar2 = createBuilder2.instance;
            build5.getClass();
            esVar2.c = build5;
            esVar2.b |= 1;
            lVar.e(createBuilder2.build());
        }
        if (this.e.i(eu.hq)) {
            com.google.android.apps.gsa.nga.engine.am.c cVar2 = this.g;
            synchronized (cVar2.f453a) {
                hVar = (h) cVar2.b.get(vVar);
                cVar2.b.size();
            }
            com.google.common.f.ab abVar = e.a;
            if (hVar != null) {
                j jVar = hVar.d;
                j jVar2 = jVar;
                if (jVar == null) {
                    jVar2 = j.a;
                }
                String str8 = jVar2.d;
            }
            Optional ofNullable = Optional.ofNullable(hVar);
            if (ofNullable.isEmpty()) {
                of = Optional.empty();
            } else {
                com.google.android.apps.gsa.nga.shared.aa.a.f fVar2 = ((h) ofNullable.get()).e;
                com.google.android.apps.gsa.nga.shared.aa.a.f fVar3 = fVar2;
                if (fVar2 == null) {
                    fVar3 = com.google.android.apps.gsa.nga.shared.aa.a.f.a;
                }
                ba createBuilder7 = fr.a.createBuilder();
                com.google.protobuf.v vVar2 = fVar3.e;
                createBuilder7.copyOnWrite();
                fr frVar = createBuilder7.instance;
                vVar2.getClass();
                frVar.b |= 2;
                frVar.d = vVar2;
                com.google.protobuf.v vVar3 = fVar3.f;
                createBuilder7.copyOnWrite();
                fr frVar2 = createBuilder7.instance;
                vVar3.getClass();
                frVar2.b |= 1;
                frVar2.c = vVar3;
                boolean z2 = fVar3.g;
                createBuilder7.copyOnWrite();
                fr frVar3 = createBuilder7.instance;
                frVar3.b |= 4;
                frVar3.e = z2;
                fr build6 = createBuilder7.build();
                com.google.protobuf.v vVar4 = build6.d;
                com.google.protobuf.v vVar5 = build6.c;
                boolean z3 = build6.e;
                of = Optional.of(build6);
            }
            if (of.isPresent()) {
                lVar.e((MessageLite) of.get());
            }
        }
        ce a5 = lVar.a();
        return a5.b.isEmpty() ? Optional.empty() : Optional.of(a5);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ac.a
    public final void b(ce ceVar, Optional optional) {
        Optional empty;
        this.b.e(ceVar);
        com.google.android.apps.gsa.nga.shared.b.a.e.b(ceVar).ifPresent(new b(this, 3));
        ba createBuilder = bg.a.createBuilder();
        optional.ifPresent(new b(createBuilder, 1));
        com.google.android.apps.gsa.nga.shared.b.a.h.b(ceVar).ifPresent(new b(createBuilder, 0));
        com.google.android.apps.gsa.nga.shared.b.a.i.b(ceVar).ifPresent(new b(createBuilder, 2));
        int i = createBuilder.instance.b;
        if ((i & 4) != 0 || (i & 2) != 0) {
            af afVar = this.h;
            bk bkVar = bk.LOGGING_PARAMS_UPDATE;
            ba createBuilder2 = bj.a.createBuilder();
            createBuilder2.copyOnWrite();
            bj bjVar = createBuilder2.instance;
            bg build = createBuilder.build();
            build.getClass();
            bjVar.c = build;
            bjVar.b = 36;
            afVar.b(bkVar, (bj) createBuilder2.build(), (ah) optional.map(new c(0)).orElse(ah.a));
        }
        b bVar = this.j;
        com.google.android.apps.gsa.nga.engine.q.a aVar = new com.google.android.apps.gsa.nga.engine.q.a();
        aVar.b(ceVar);
        aVar.a = 1;
        bVar.h(aVar.a());
        Optional b = com.google.android.apps.gsa.nga.shared.b.a.i.b(ceVar);
        d dVar = g.a;
        Iterator it = ceVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            ej ejVar = (ej) it.next();
            if ("asst.query.context.params".equals(ejVar.c)) {
                try {
                    ei eiVar = ejVar.d;
                    ei eiVar2 = eiVar;
                    if (eiVar == null) {
                        eiVar2 = ei.a;
                    }
                    empty = Optional.of(bi.parseFrom(es.a, eiVar2.d));
                } catch (com.google.protobuf.ce e) {
                    aus.f(g.a.f(), "Failed to parse QueryContextParams from ConversationParams.", (char) 4933, e);
                    empty = Optional.empty();
                }
            }
        }
        if (((Boolean) b.map(new c(4)).orElse(false)).booleanValue() || ((Boolean) empty.map(new c(5)).orElse(false)).booleanValue()) {
            optional.map(new c(1)).orElse("");
            this.b.g();
            return;
        }
        if (optional.isPresent()) {
            this.b.c();
        }
        if (empty.isEmpty()) {
            return;
        }
        Object obj = empty.get();
        dl.y((cn) e$.ExternalSyntheticApiModelOutline0.m(new com.google.android.apps.gsa.nga.engine.understanding.c.f((es) obj, (!optional.isPresent() || ((com.google.android.apps.gsa.nga.engine.ac.f) optional.get()).c.isEmpty()) ? Optional.empty() : Optional.of(((com.google.android.apps.gsa.nga.engine.ac.f) optional.get()).c), new a(this, optional), new l(this.c, 1)), o.b), new e(this), ay.a);
        optional.map(new c(1)).orElse("");
    }
}
