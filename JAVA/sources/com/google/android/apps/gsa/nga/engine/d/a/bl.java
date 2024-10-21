package com.google.android.apps.gsa.nga.engine.d.a;

import android.location.Location;
import androidx.e.a.g;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ae.m;
import com.google.android.apps.gsa.nga.engine.ak.c.a.j;
import com.google.android.apps.gsa.nga.engine.ak.c.s;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.c;
import com.google.android.apps.gsa.nga.shared.ak.e;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.dt;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.appactions.a.o;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nn;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.b.qj;
import com.google.common.base.bu;
import com.google.common.base.ci;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.e.h.a.cq;
import com.google.g.e.h.a.ct;
import com.google.g.e.i.bx;
import com.google.g.e.i.cd;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.g.e.i.gk;
import com.google.g.e.i.ku;
import com.google.g.e.i.kv;
import com.google.g.e.i.ky;
import com.google.g.e.i.mn;
import com.google.g.e.i.mp;
import com.google.g.e.i.si;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.bg;
import com.google.protobuf.ce;
import com.google.protobuf.v;
import com.google.speech.context.a.b;
import com.google.speech.i.a.aa;
import com.google.speech.i.a.l;
import com.google.speech.i.a.q;
import com.google.speech.i.a.t;
import com.google.speech.i.a.u;
import com.google.speech.i.a.w;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/bl.class */
public final class bl implements bd, c, m, com.google.android.apps.gsa.nga.engine.ak.o.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f540a = d.j();
    private static final fl c = fl.v("SMS", "Hangouts", "Messenger", "WhatsApp", "Viber", "Telegram", "Line");
    private static final ha d = new op("asst.dialog.state.params");
    private static final Duration e = Duration.ofSeconds(10);
    private final e.a f;
    private final s g;
    private final com.google.android.apps.gsa.shared.util.q.a h;
    private final ci i;
    private final com.google.android.apps.gsa.nga.engine.ak.p.f j;
    private final com.google.android.apps.gsa.nga.engine.c.m k;
    private final x p;
    private final AtomicReference l = new AtomicReference(bj.a().a());
    private final AtomicReference m = new AtomicReference();
    public final AtomicReference b = new AtomicReference();
    private ha n = nr.a;
    private fu o = nn.a;

    public bl(e.a aVar, s sVar, com.google.android.apps.gsa.shared.util.q.a aVar2, x xVar, com.google.android.apps.gsa.nga.engine.ak.p.f fVar, ci ciVar, com.google.android.apps.gsa.nga.engine.c.m mVar) {
        this.f = aVar;
        this.g = sVar;
        this.h = aVar2;
        this.p = xVar;
        this.j = fVar;
        this.i = ciVar;
        this.k = mVar;
    }

    static void g(t tVar, String str, float f) {
        com.google.protobuf.ba createBuilder = q.a.createBuilder();
        t createBuilder2 = u.a.createBuilder();
        createBuilder2.q(f);
        createBuilder.copyOnWrite();
        q qVar = createBuilder.instance;
        u build = createBuilder2.build();
        build.getClass();
        qVar.c = build;
        qVar.b = 2;
        tVar.s(str, createBuilder.build());
    }

    static void h(t tVar, String str, String str2) {
        com.google.protobuf.ba createBuilder = q.a.createBuilder();
        t createBuilder2 = com.google.speech.i.a.f.a.createBuilder();
        createBuilder2.v(v.y(str2));
        createBuilder.copyOnWrite();
        q qVar = createBuilder.instance;
        com.google.speech.i.a.f build = createBuilder2.build();
        build.getClass();
        qVar.c = build;
        qVar.b = 1;
        tVar.s(str, createBuilder.build());
    }

    private static bj i(ct ctVar) {
        bh a2 = bj.a();
        cq a3 = cq.a(ctVar.g);
        cq cqVar = a3;
        if (a3 == null) {
            cqVar = cq.a;
        }
        int ordinal = cqVar.ordinal();
        if (ordinal == 1) {
            a2.b(bi.CONTACT_SELECTION);
            int i = fl.e;
            a2.c(ni.a);
            return a2.a();
        }
        if (ordinal == 2) {
            fg fgVar = new fg(4);
            gk gkVar = ctVar.h;
            gk gkVar2 = gkVar;
            if (gkVar == null) {
                gkVar2 = gk.a;
            }
            mn mnVar = gkVar2.e;
            mn mnVar2 = mnVar;
            if (mnVar == null) {
                mnVar2 = mn.a;
            }
            Iterator it = mnVar2.h.iterator();
            while (it.hasNext()) {
                kv kvVar = ((mp) it.next()).c;
                kv kvVar2 = kvVar;
                if (kvVar == null) {
                    kvVar2 = kv.a;
                }
                Iterator it2 = kvVar2.d.iterator();
                while (it2.hasNext()) {
                    fgVar.h(((ku) it2.next()).d);
                }
            }
            a2.c(fgVar.g());
            a2.b(bi.CONTACT_DISAMBIGUATION);
            return a2.a();
        }
        if (ordinal == 3) {
            a2.b(bi.PROVIDER_DISAMBIGUATION);
            a2.c(c);
            return a2.a();
        }
        if (ordinal != 5) {
            return a2.a();
        }
        gy gyVar = new gy();
        gk gkVar3 = ctVar.h;
        gk gkVar4 = gkVar3;
        if (gkVar3 == null) {
            gkVar4 = gk.a;
        }
        mn mnVar3 = gkVar4.e;
        mn mnVar4 = mnVar3;
        if (mnVar3 == null) {
            mnVar4 = mn.a;
        }
        Iterator it3 = mnVar4.h.iterator();
        while (it3.hasNext()) {
            kv kvVar3 = ((mp) it3.next()).c;
            kv kvVar4 = kvVar3;
            if (kvVar3 == null) {
                kvVar4 = kv.a;
            }
            Iterator it4 = kvVar4.g.iterator();
            while (it4.hasNext()) {
                gyVar.h(((ky) it4.next()).e);
            }
        }
        a2.b(bi.PHONE_NUMBER_SELECTION);
        a2.c(gyVar.g().g());
        return a2.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
        if (this.h.i(eu.hk) && ahVar == ah.FULL_LISTENING) {
            com.google.android.apps.gsa.nga.engine.ak.p.f fVar = this.j;
            com.google.android.apps.gsa.nga.engine.ak.p.d dVar = com.google.android.apps.gsa.nga.engine.ak.p.d.f;
            Duration duration = e;
            cn n = dl.n(Optional.empty());
            if (fVar.b.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 && fVar.b()) {
                fVar.a(dVar);
                n = g.a(new com.google.android.apps.gsa.nga.engine.ak.p.a(fVar, duration));
            }
            dl.y(n, new bg(this), ay.a);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.bd
    public final w c() {
        b bVar;
        com.google.protobuf.bc createBuilder = w.a.createBuilder();
        t createBuilder2 = com.google.speech.i.a.s.a.createBuilder();
        h(createBuilder2, "client-id", "NGA");
        bk bkVar = new bk(this.i, this.p);
        Optional d2 = ((e) this.f.a()).d();
        if (d2.isPresent()) {
            h(createBuilder2, "foreground-app", (String) d2.get());
        }
        bkVar.a("USER_STATE_FOREGROUND_APP");
        if (this.h.i(eu.lf)) {
            Optional of = Optional.of(this.k.a());
            gy gyVar = new gy();
            d2.ifPresent(new be(this, gyVar, of));
            com.google.protobuf.ba createBuilder3 = q.a.createBuilder();
            t createBuilder4 = com.google.speech.i.a.f.a.createBuilder();
            createBuilder4.u((Iterable) Collection._EL.stream(gyVar.g()).map(new d(9)).collect(Collectors.toCollection(new bf())));
            com.google.speech.i.a.f build = createBuilder4.build();
            createBuilder3.copyOnWrite();
            q qVar = createBuilder3.instance;
            build.getClass();
            qVar.c = build;
            qVar.b = 1;
            createBuilder2.s("app-actions-foreground-builtin-intents", createBuilder3.build());
            bkVar.a("USER_STATE_FOREGROUND_BUILTIN_INTENTS_SET");
            gy gyVar2 = new gy();
            qj j = this.n.j();
            while (j.hasNext()) {
                gyVar2.j(e((String) j.next(), of));
            }
            com.google.protobuf.ba createBuilder5 = q.a.createBuilder();
            t createBuilder6 = com.google.speech.i.a.f.a.createBuilder();
            createBuilder6.u((Iterable) Collection._EL.stream(gyVar2.g()).map(new d(9)).collect(Collectors.toCollection(new bf())));
            com.google.speech.i.a.f build2 = createBuilder6.build();
            createBuilder5.copyOnWrite();
            q qVar2 = createBuilder5.instance;
            build2.getClass();
            qVar2.c = build2;
            qVar2.b = 1;
            createBuilder2.s("app-actions-builtin-intents", createBuilder5.build());
            bkVar.a("USER_STATE_BUILTIN_INTENTS_SET");
        }
        if (((j) this.g).f.f423a.get()) {
            h(createBuilder2, "alarm-status", "FIRING");
        }
        bkVar.a("USER_STATE_ALARM");
        if (((j) this.g).c.f423a.get()) {
            h(createBuilder2, "timer-status", "FIRING");
        }
        bkVar.a("USER_STATE_TIMER");
        Location location = (Location) this.b.get();
        if (this.h.i(eu.hk)) {
            if (location != null) {
                g(createBuilder2, "latitude", (float) location.getLatitude());
                g(createBuilder2, "longitude", (float) location.getLongitude());
            }
            bkVar.a("USER_STATE_LOCATION");
        }
        com.google.protobuf.ba createBuilder7 = com.google.speech.i.a.m.a.createBuilder();
        if (this.h.i(eu.cE)) {
            bj bjVar = (bj) this.l.get();
            if (bjVar != null) {
                if (!bjVar.f539a.f.isEmpty()) {
                    h(createBuilder2, "communications-state", bjVar.f539a.f);
                }
                fl flVar = bjVar.b;
                int size = flVar.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) flVar.get(i);
                    com.google.protobuf.ba createBuilder8 = l.a.createBuilder();
                    createBuilder8.copyOnWrite();
                    l lVar = createBuilder8.instance;
                    str.getClass();
                    lVar.b |= 1;
                    lVar.c = str;
                    l build3 = createBuilder8.build();
                    createBuilder7.copyOnWrite();
                    com.google.speech.i.a.m mVar = createBuilder7.instance;
                    build3.getClass();
                    mVar.a();
                    mVar.b.add(build3);
                }
            }
            bkVar.a("USER_STATE_DISAMBIGUATION");
        }
        v f = this.h.f(df.aY);
        if (f != null) {
            try {
                bVar = (b) com.google.protobuf.bi.parseFrom(b.a, f, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (ce e2) {
                aus.f(f540a.f(), "Failed to parse biasing params bytes. Using default instance.", (char) 2575, e2);
                bVar = b.a;
            }
            com.google.speech.context.a.a aVar = bVar.c;
            com.google.speech.context.a.a aVar2 = aVar;
            if (aVar == null) {
                aVar2 = com.google.speech.context.a.a.a;
            }
            createBuilder.ao(aVar2.d);
            com.google.speech.context.a.a aVar3 = bVar.c;
            com.google.speech.context.a.a aVar4 = aVar3;
            if (aVar3 == null) {
                aVar4 = com.google.speech.context.a.a.a;
            }
            com.google.speech.context.a.e eVar = aVar4.e;
            com.google.speech.context.a.e eVar2 = eVar;
            if (eVar == null) {
                eVar2 = com.google.speech.context.a.e.a;
            }
            createBuilder.copyOnWrite();
            w wVar = createBuilder.instance;
            eVar2.getClass();
            wVar.f = eVar2;
            wVar.b |= 4;
            com.google.protobuf.ba createBuilder9 = q.a.createBuilder();
            t createBuilder10 = com.google.speech.i.a.f.a.createBuilder();
            com.google.speech.context.a.a aVar5 = bVar.c;
            com.google.speech.context.a.a aVar6 = aVar5;
            if (aVar5 == null) {
                aVar6 = com.google.speech.context.a.a.a;
            }
            createBuilder10.u((Iterable) Collection._EL.stream(aVar6.c).map(new d(9)).collect(Collectors.toList()));
            com.google.speech.i.a.f build4 = createBuilder10.build();
            createBuilder9.copyOnWrite();
            q qVar3 = createBuilder9.instance;
            build4.getClass();
            qVar3.c = build4;
            qVar3.b = 1;
            createBuilder2.s("experiment-labels", createBuilder9.build());
        }
        bkVar.a("USER_STATE_EXPERIMENT_LABELS");
        com.google.protobuf.ba createBuilder11 = com.google.speech.i.a.n.a.createBuilder();
        createBuilder11.copyOnWrite();
        com.google.speech.i.a.n nVar = createBuilder11.instance;
        nVar.b |= 1;
        nVar.e = "communication-disambiguation-items";
        createBuilder11.copyOnWrite();
        com.google.speech.i.a.n nVar2 = createBuilder11.instance;
        com.google.speech.i.a.m build5 = createBuilder7.build();
        build5.getClass();
        nVar2.d = build5;
        nVar2.c = 2;
        createBuilder.aF(createBuilder11);
        com.google.speech.i.a.s build6 = createBuilder2.build();
        createBuilder.copyOnWrite();
        w wVar2 = createBuilder.instance;
        build6.getClass();
        wVar2.d = build6;
        wVar2.b |= 1;
        bx bxVar = (bx) this.m.getAndSet(null);
        if (bxVar != null) {
            bg bgVar = aa.b;
            com.google.protobuf.ba createBuilder12 = aa.a.createBuilder();
            createBuilder12.copyOnWrite();
            aa aaVar = createBuilder12.instance;
            aaVar.d = bxVar;
            aaVar.c |= 1;
            createBuilder.w(bgVar, createBuilder12.build());
        }
        x xVar = bkVar.b;
        com.google.common.base.bx bxVar2 = bkVar.a;
        com.google.android.apps.gsa.nga.shared.q.c.fu d3 = dt.d();
        d3.c = Double.valueOf(Duration.ofMillis(bxVar2.a(TimeUnit.MILLISECONDS)).toMillis());
        d3.b = "USER_STATE_TOTAL";
        xVar.b(d3.d());
        return createBuilder.build();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.bd
    public final void d(com.google.g.e.i.ce ceVar) {
        bj a2;
        bx build;
        if (this.h.i(eu.cE)) {
            Iterator it = ceVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a2 = bj.a().a();
                    break;
                }
                ej ejVar = (ej) it.next();
                if (ejVar.c.equals("asst.communication.message")) {
                    ei eiVar = ejVar.d;
                    ei eiVar2 = eiVar;
                    if (eiVar == null) {
                        eiVar2 = ei.a;
                    }
                    if (eiVar2.c.equals("assistant.api.params.MessageParams")) {
                        com.google.protobuf.ba createBuilder = com.google.g.e.h.a.dt.a.createBuilder();
                        try {
                            createBuilder.mergeFrom(eiVar2.d);
                            ct ctVar = createBuilder.build().c;
                            ct ctVar2 = ctVar;
                            if (ctVar == null) {
                                ctVar2 = ct.a;
                            }
                            a2 = i(ctVar2);
                            if (!a2.equals(bj.a().a())) {
                                break;
                            }
                        } catch (ce e2) {
                            aus.f(f540a.f(), "Failed to parse MessageParams.", (char) 2574, e2);
                        }
                    } else {
                        continue;
                    }
                } else if (ejVar.c.equals("asst.communication.call")) {
                    ei eiVar3 = ejVar.d;
                    ei eiVar4 = eiVar3;
                    if (eiVar3 == null) {
                        eiVar4 = ei.a;
                    }
                    if (eiVar4.c.equals("assistant.api.params.CallParams")) {
                        com.google.protobuf.ba createBuilder2 = com.google.g.e.h.a.aa.a.createBuilder();
                        try {
                            createBuilder2.mergeFrom(eiVar4.d);
                            ct ctVar3 = createBuilder2.build().c;
                            ct ctVar4 = ctVar3;
                            if (ctVar3 == null) {
                                ctVar4 = ct.a;
                            }
                            a2 = i(ctVar4);
                            if (!a2.equals(bj.a().a())) {
                                break;
                            }
                        } catch (ce e3) {
                            aus.f(f540a.f(), "Failed to parse MessageParams.", (char) 2573, e3);
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            this.l.set(a2);
            AtomicReference atomicReference = this.m;
            cd createBuilder3 = com.google.g.e.i.ce.a.createBuilder();
            for (ej ejVar2 : ceVar.b) {
                if ((ejVar2.b & 1) != 0) {
                    if (d.a.equals(ejVar2.c)) {
                        createBuilder3.t(ejVar2);
                    }
                }
            }
            com.google.g.e.i.ce build2 = createBuilder3.build();
            if (build2.b.size() == 0) {
                build = null;
            } else {
                si createBuilder4 = bx.a.createBuilder();
                createBuilder4.copyOnWrite();
                bx bxVar = createBuilder4.instance;
                build2.getClass();
                bxVar.f = build2;
                bxVar.b |= 16;
                build = createBuilder4.build();
            }
            atomicReference.set(build);
        }
    }

    public final ha e(String str, Optional optional) {
        gy gyVar = new gy();
        if (this.o.containsKey(str)) {
            gyVar.j((Iterable) this.o.get(str));
        }
        optional.isPresent();
        gyVar.j(((o) optional.get()).c(str));
        return gyVar.g();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.o.a
    public final void f() {
        this.l.set(bj.a().a());
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.m
    public final void gY(ha haVar) {
        if (this.n.equals(haVar)) {
            return;
        }
        gy gyVar = new gy();
        gyVar.j(haVar);
        this.n = gyVar.g();
        fu a2 = com.google.android.apps.gsa.shared.k.b.f1407a.a(this.h.h(eu.t));
        fq fqVar = new fq(4);
        qj j = a2.v().j();
        while (j.hasNext()) {
            Map.Entry entry = (Map.Entry) j.next();
            gy gyVar2 = new gy();
            gyVar2.j(bu.d("|").j((CharSequence) entry.getValue()));
            fqVar.i((String) entry.getKey(), gyVar2.g());
        }
        this.o = fqVar.h(false);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }
}
