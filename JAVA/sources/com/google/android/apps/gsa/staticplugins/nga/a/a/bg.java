package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.q.a.ag;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.apps.gsa.staticplugins.nga.l.e;
import com.google.android.libraries.gsa.h.f;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.h;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import e.a;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bg.class */
public class bg implements e, com.google.android.apps.gsa.shared.util.debug.a.b {
    private static final com.google.common.f.j C = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.nga.a.a.bg");
    public be B;
    private final a D;
    private final a E;
    private final a F;
    private final a G;
    private final a H;
    private final a I;
    private final com.google.android.libraries.g.a J;
    private final a K;
    private final com.google.android.apps.gsa.nga.shared.q.a.aj L;
    private final com.google.android.apps.gsa.nga.shared.q.a.ah M;
    private final a N;
    private final a O;
    private final boolean P;
    private final a Q;
    private bd R;
    private final d T;
    public final ca b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final Context k;
    public final a m;
    public final a n;
    public final a o;
    BroadcastReceiver y;
    public boolean z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1665a = new Object();
    public ev p = null;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public String t = null;
    public com.google.android.apps.gsa.assistant.shared.b u = null;
    public com.google.android.libraries.assistant.d.b.d v = null;
    public Boolean w = null;
    public Boolean x = null;
    public bf A = bf.UNKNOWN;
    private final AtomicBoolean S = new AtomicBoolean(false);
    public final List l = new CopyOnWriteArrayList();

    public bg(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, Context context, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, com.google.android.libraries.g.a aVar18, d dVar, a aVar19, a aVar20, com.google.android.apps.gsa.nga.shared.q.a.aj ajVar, com.google.android.apps.gsa.nga.shared.q.a.ah ahVar, a aVar21, a aVar22, boolean z, a aVar23) {
        this.b = cl.d(new o(aVar, 2));
        this.c = aVar2;
        this.d = aVar3;
        this.f = aVar4;
        this.g = aVar8;
        this.h = aVar9;
        this.i = aVar10;
        this.j = aVar11;
        this.k = context;
        this.F = aVar12;
        this.H = aVar14;
        this.I = aVar15;
        this.m = aVar17;
        this.J = aVar18;
        this.n = aVar19;
        this.o = aVar20;
        this.P = z;
        this.Q = aVar23;
        this.e = aVar5;
        this.D = aVar6;
        this.E = aVar7;
        this.G = aVar13;
        this.K = aVar16;
        this.T = dVar;
        this.L = ajVar;
        this.M = ahVar;
        this.N = aVar21;
        this.O = aVar22;
    }

    private final void m() {
        if (this.S.getAndSet(true)) {
            return;
        }
        this.T.a(this);
        this.L.e(new com.google.android.apps.gsa.nga.shared.q.a.ai(this) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.am

            /* renamed from: a, reason: collision with root package name */
            public final bg f1649a;

            {
                this.f1649a = this;
            }

            @Override // com.google.android.apps.gsa.nga.shared.q.a.ai
            public final NgaState a() {
                return this.f1649a.a();
            }
        });
        this.M.d(new ag(this) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.an

            /* renamed from: a, reason: collision with root package name */
            public final bg f1650a;

            {
                this.f1650a = this;
            }

            @Override // com.google.android.apps.gsa.nga.shared.q.a.ag
            public final Optional a() {
                return this.f1650a.b();
            }
        });
    }

    private final void n() {
        ((com.google.android.apps.gsa.staticplugins.nga.t.c) this.F.a()).a();
        ((com.google.android.apps.gsa.shared.k.c) this.e.a()).t(eu.kh);
    }

    public final NgaState a() {
        NgaState ngaState;
        synchronized (this.f1665a) {
            if (this.R == null) {
                h f = C.f();
                f.al(com.google.common.f.am.b);
                f.ak(15027);
                f.p("getNgaState called while state is null");
                com.google.android.apps.gsa.shared.util.ai aiVar = new com.google.android.apps.gsa.shared.util.ai(this.J);
                g();
                ((com.google.android.libraries.gsa.h.h) this.b.a()).n("[NGA] NgaStateCheckerImpl.logFirstNgaStateTime", new al(this, aiVar.a()));
            }
            ngaState = this.R.f1662a;
        }
        return ngaState;
    }

    public final Optional b() {
        synchronized (this.f1665a) {
            bd bdVar = this.R;
            if (bdVar != null) {
                return bdVar.b;
            }
            h f = C.f();
            f.ak(15043);
            f.p("getNgaStateInfo called while state is null");
            return Optional.empty();
        }
    }

    public final void c(com.google.android.apps.gsa.nga.api.at atVar) {
        synchronized (this.f1665a) {
            this.l.add(atVar);
        }
    }

    public final void e() {
        ((com.google.android.libraries.gsa.h.h) this.b.a()).n("[NGA]NgaStateCheckerImpl.maybeRegisterLiveData", new ap(this, 0));
    }

    public final void f(com.google.android.apps.gsa.nga.api.at atVar) {
        synchronized (this.f1665a) {
            this.l.remove(atVar);
        }
    }

    public final void g() {
        bd a2;
        AccessibilityManager a3;
        m();
        if (this.A == bf.ENABLED) {
            h d = C.d();
            d.ak(15042);
            d.p("If user is on TNG:MA mark this enabled since TNG is active");
            a2 = bd.a();
        } else if (!((com.google.android.apps.gsa.nga.api.aq) this.d.a()).c()) {
            h d2 = C.d();
            d2.ak(15041);
            d2.p("NGA disabled due to not being eligible.");
            a2 = bd.b(2);
        } else if (((com.google.android.apps.gsa.nga.api.aq) this.d.a()).e()) {
            h d3 = C.d();
            d3.ak(15040);
            d3.p("NGA disabled due to forced update requirement.");
            a2 = bd.b(3);
        } else if (!((com.google.android.apps.gsa.staticplugins.nga.b.e) this.D.a()).d.a()) {
            h d4 = C.d();
            d4.ak(15039);
            d4.p("NGA disabled since GSA isn't the default assistant.");
            a2 = bd.b(4);
        } else if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.aO) && (a3 = ((c) this.K.a()).a()) != null && a3.isEnabled()) {
            n();
            h d5 = C.d();
            d5.ak(15038);
            d5.p("NGA disabled since it's running Panthera and at least one a11y feature is on.");
            a2 = bd.b(5);
        } else {
            n();
            if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.fC) || !(Boolean.TRUE.equals(this.w) || Boolean.TRUE.equals(this.x))) {
                if (!((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.fl)) {
                    if (ev.RESUMED.equals(this.p)) {
                        h d6 = C.d();
                        d6.ak(15036);
                        d6.p("NGA paused because OPA is resumed.");
                        a2 = bd.c(3);
                    }
                }
                if (!((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.fk)) {
                    if (ev.RESUMED.equals(this.p) && this.q) {
                        h d7 = C.d();
                        d7.ak(15035);
                        d7.p("NGA paused because OPA is in interpreter mode.");
                        a2 = bd.c(4);
                    } else if (this.r) {
                        h d8 = C.d();
                        d8.ak(15034);
                        d8.p("NGA paused because OPA is in interpreter prewarm mode.");
                        a2 = bd.c(5);
                    }
                }
                if (!((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.fj)) {
                    if (ev.RESUMED.equals(this.p) && this.s) {
                        h d9 = C.d();
                        d9.ak(15033);
                        d9.p("NGA paused because Interactive Canvas is active.");
                        a2 = bd.c(6);
                    }
                }
                if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.dL) && !((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.jO)) {
                    String str = this.t;
                    com.google.android.apps.gsa.assistant.shared.b bVar = this.u;
                    com.google.android.libraries.assistant.d.b.d dVar = this.v;
                    if (com.google.android.apps.gsa.assistant.shared.b.CONNECTED.equals(bVar) && com.google.android.apps.gsa.shared.util.p.f.contains(str) && (dVar == com.google.android.libraries.assistant.d.b.d.FREE_NAVIGATION_IN_FOREGROUND || dVar == com.google.android.libraries.assistant.d.b.d.GUIDED_NAVIGATION_IN_FOREGROUND)) {
                        h d10 = C.d();
                        d10.ak(15032);
                        d10.p("NGA paused because GMM integration is active.");
                        a2 = bd.c(7);
                    }
                }
                if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(com.google.android.apps.gsa.shared.k.az.dc)) {
                    String str2 = this.t;
                    if (com.google.android.apps.gsa.assistant.shared.b.CONNECTED.equals(this.u) && (com.google.android.apps.gsa.shared.util.p.c.contains(str2) || com.google.android.apps.gsa.shared.util.p.g.contains(str2))) {
                        h d11 = C.d();
                        d11.ak(15031);
                        d11.p("NGA paused because Waze or Jacquard integration is active.");
                        a2 = bd.c(8);
                    }
                }
                if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.aM) && ((com.google.android.libraries.assistant.auto.jumpboost.p.a) this.E.a()).f2753a) {
                    h d12 = C.d();
                    d12.ak(15030);
                    d12.p("NGA paused because we're in car mode.");
                    a2 = bd.c(9);
                } else if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.aM) && ((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) this.O.a()).i()) {
                    h d13 = C.d();
                    d13.ak(15029);
                    d13.p("NGA paused because Morris is running.");
                    a2 = bd.c(9);
                } else {
                    h d14 = C.d();
                    d14.ak(15028);
                    d14.p("NGA enabled in interactor.");
                    a2 = bd.a();
                }
            } else {
                h d15 = C.d();
                d15.ak(15037);
                d15.p("NGA paused because Dreamliner/Ambient Mode is active.");
                a2 = bd.c(2);
            }
        }
        final bd bdVar = this.R;
        this.R = a2;
        if (Objects.equals(a2, bdVar)) {
            return;
        }
        com.google.common.f.j jVar = C;
        h d16 = jVar.d();
        d16.ak(15054);
        d16.s("Nga state changed to %s", a2);
        boolean z = this.A == bf.ENABLED;
        h d17 = jVar.d();
        d17.ak(15055);
        d17.s("isTngActive=%s", Boolean.valueOf(z));
        final bd bdVar2 = a2;
        final boolean z2 = z;
        ((com.google.android.libraries.gsa.h.h) this.b.a()).n("[NGA] Update state to listeners", new f(this, bdVar, bdVar2, z2) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.as

            /* renamed from: a, reason: collision with root package name */
            public final bg f1654a;
            public final bd b;
            public final bd c;
            public final boolean d;

            {
                this.f1654a = this;
                this.b = bdVar;
                this.c = bdVar2;
                this.d = z2;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                boolean z3;
                bd bdVar3 = this.c;
                bd bdVar4 = this.b;
                if (bdVar4 == null || bdVar3.f1662a != bdVar4.f1662a) {
                    bg bgVar = this.f1654a;
                    Iterator it = ((Set) bgVar.f.a()).iterator();
                    while (true) {
                        z3 = this.d;
                        if (!it.hasNext()) {
                            break;
                        } else {
                            ((com.google.android.apps.gsa.nga.api.at) it.next()).ir(bdVar3.f1662a, z3);
                        }
                    }
                    Iterator it2 = bgVar.l.iterator();
                    while (it2.hasNext()) {
                        ((com.google.android.apps.gsa.nga.api.at) it2.next()).ir(bdVar3.f1662a, z3);
                    }
                    ak akVar = (ak) bgVar.o.a();
                    if (akVar.d.isEmpty()) {
                        return;
                    }
                    dl.y(cf.i(((com.google.android.apps.gsa.n.a.c) akVar.d.get()).a()), new aj(akVar), akVar.b);
                }
            }
        });
    }

    public final void h() {
        j(new f() { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.av
            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
            }
        });
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        NgaState a2 = a();
        fVar.q("NgaState");
        fVar.a("NGA state").a(new com.google.android.apps.gsa.shared.util.b.d(a2.toString(), false));
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.e
    public final void i() {
        String l = ((u) this.I.a()).l();
        com.google.android.apps.gsa.assistant.shared.b bVar = ((u) this.I.a()).s() ? com.google.android.apps.gsa.assistant.shared.b.CONNECTED : com.google.android.apps.gsa.assistant.shared.b.NOT_CONNECTED;
        synchronized (this.f1665a) {
            this.t = l;
            this.u = bVar;
        }
        e();
        if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.aO)) {
            c cVar = (c) this.K.a();
            ar arVar = new ar(this, 0);
            AccessibilityManager a2 = cVar.a();
            if (a2 != null) {
                a2.addAccessibilityStateChangeListener(arVar);
            }
        }
        m();
        if (((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.c)) {
            ((com.google.android.apps.gsa.assistant.settings.features.a.c) this.N.a()).a();
        }
        final ak akVar = (ak) this.o.a();
        akVar.c.ifPresent(new Consumer(akVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.ai

            /* renamed from: a, reason: collision with root package name */
            public final ak f1646a;

            {
                this.f1646a = akVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((com.google.android.libraries.search.location.compliance.b.h) obj).b(new com.google.android.libraries.search.location.compliance.b.a(this.f1646a) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.ah

                    /* renamed from: a, reason: collision with root package name */
                    public final ak f1645a;

                    {
                        this.f1645a = r4;
                    }

                    @Override // com.google.android.libraries.search.location.compliance.b.a
                    public final void a(boolean z) {
                        this.f1645a.a(z);
                    }
                });
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void j(f fVar) {
        cn n;
        if (this.P) {
            bu buVar = (bu) this.Q.a();
            cn b = ((com.google.android.apps.gsa.search.core.google.gaia.b.a.c) buVar.b.a()).b();
            bo boVar = new bo(buVar, 0);
            com.google.apps.tiktok.tracing.contrib.c.e h = com.google.apps.tiktok.tracing.contrib.c.e.g(i.g(b, ex.b(boVar), ay.a)).i(new bp(), ay.a).h(new bq(), ay.a);
            com.google.common.base.ah ahVar = new com.google.common.base.ah() { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.ao
                public final Object apply(Object obj) {
                    return ((Boolean) obj).booleanValue() ? bf.ENABLED : bf.DISABLED;
                }
            };
            n = i.g(h, ex.b(ahVar), ay.a);
        } else {
            n = dl.n(bf.UNKNOWN);
        }
        bb bbVar = new bb(this, fVar);
        dl.y(n, ex.h(bbVar), ay.a);
    }

    public final boolean k() {
        if (!a().b()) {
            return false;
        }
        ((com.google.android.apps.gsa.staticplugins.nga.t.c) this.F.a()).a();
        ((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(eu.cx);
        ((com.google.android.apps.gsa.shared.k.c) this.e.a()).t(eu.kh);
        ((com.google.android.apps.gsa.shared.k.c) this.e.a()).t(eu.ay);
        ((com.google.android.apps.gsa.shared.k.c) this.e.a()).t(eu.aw);
        return false;
    }

    public final boolean l() {
        if (!a().b()) {
            return false;
        }
        n();
        return false;
    }
}
