package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.accounts.Account;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.search.core.g.b.a;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.tasks.m;
import com.google.android.apps.gsa.tasks.s;
import com.google.android.apps.gsa.tasks.u;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.o.kh;
import com.google.common.o.ls;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protos.o.b.v;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/x.class */
public final class x implements a, com.google.android.apps.gsa.nga.api.at, com.google.android.apps.gsa.shared.util.debug.a.b, com.google.android.libraries.search.account.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1674a = d.j();
    public final e.a b;
    public final e.a c;
    public final h d;
    public final e.a e;
    public cn i;
    public cn j;
    public final ag m;
    public final com.google.android.apps.gsa.staticplugins.nga.d.a.c n;
    private final e.a o;
    private final e.a p;
    private final m q;
    public final Object f = new Object();
    public final Object g = new Object();
    public final AtomicBoolean l = new AtomicBoolean(false);
    public ca h = c();
    public ca k = e(com.google.android.apps.gsa.nga.shared.android.p.b);

    public x(e.a aVar, e.a aVar2, ag agVar, com.google.android.apps.gsa.staticplugins.nga.d.a.c cVar, e.a aVar3, h hVar, m mVar, e.a aVar4, e.a aVar5) {
        this.b = aVar;
        this.o = aVar2;
        this.m = agVar;
        this.n = cVar;
        this.c = aVar3;
        this.d = hVar;
        this.q = mVar;
        this.p = aVar4;
        this.e = aVar5;
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void a(NgaState ngaState) {
        throw null;
    }

    @Override // com.google.android.apps.gsa.search.core.g.b.a
    public final void b(boolean z, boolean z2) {
        this.d.n("[NGA] NgaAccountChecker.onDeviceInstallOrBoot", new ap(this, 1));
    }

    public final ca c() {
        ca e;
        synchronized (this.f) {
            e = cl.e(new o(this, 0), Duration.ofMinutes(10L));
        }
        return e;
    }

    public final ca e(com.google.android.apps.gsa.nga.shared.android.p pVar) {
        ca d;
        synchronized (this.g) {
            d = cl.d(new r(pVar));
        }
        return d;
    }

    public final kh f() {
        kh khVar;
        if (!j()) {
            return kh.e;
        }
        synchronized (this.f) {
            khVar = (kh) this.h.a();
            if (khVar.equals(kh.b) && this.i == null) {
                z.g(g(), new n(2));
            }
        }
        return khVar;
    }

    public final cn g() {
        return this.d.b("[NGA] NgaAccountChecker.refreshDasherAccountStatus", new m(this, 0));
    }

    final cn h() {
        final String w = ((com.google.android.apps.gsa.speech.o.g) this.o.a()).w();
        final com.google.android.apps.gsa.shared.util.debug.j jVar = new com.google.android.apps.gsa.shared.util.debug.j();
        return this.d.k(this.d.k(dl.t((List) DesugarArrays.stream(((com.google.android.apps.gsa.search.core.google.gaia.an) this.b.a()).A()).map(new Function(this, w, jVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.j

            /* renamed from: a, reason: collision with root package name */
            public final x f1670a;
            public final String b;
            public final com.google.android.apps.gsa.shared.util.debug.j c;

            {
                this.f1670a = this;
                this.b = w;
                this.c = jVar;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.google.android.apps.gsa.search.core.google.gaia.an) this.f1670a.b.a()).c(this.b, (Account) obj, false, this.c);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return Function._CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())), "[NGA] NgaAccountChecker.checkForOAuthTokenValidity", new com.google.android.libraries.gsa.h.d() { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.k
            @Override // com.google.android.libraries.gsa.h.d
            public final Object a(Object obj) {
                return Boolean.valueOf(Collection._EL.stream((List) obj).filter(new i(1)).anyMatch(new i(0)));
            }
        }), "[NGA] NgaAccountCHecker.refreshOAuthTokenStatus", new l(this, 1));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("Account checker status");
        f d = fVar.d((Object) null);
        d.b("Dasher account status").a(new com.google.android.apps.gsa.shared.util.b.d(f().name(), false));
        d.b("Has invalid OAuth token").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.l.get()), false));
        DesugarArrays.stream(((com.google.android.apps.gsa.search.core.google.gaia.an) this.b.a()).B()).forEach(new s(this, d));
    }

    public final void i() {
        if (j()) {
            z.g(h(), new n(0));
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void ir(NgaState ngaState, boolean z) {
        if (z) {
            com.google.common.f.a.a d = f1674a.d();
            d.ak(15003);
            d.p("Tng is active skip updates");
        } else if (j()) {
            z.g(h(), new com.google.android.apps.gsa.nga.shared.ah.a.w() { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.p
                @Override // com.google.android.apps.gsa.nga.shared.ah.a.w
                public final void a(Throwable th) {
                    aus.f(x.f1674a.e(), "Failed to refresh OAuth token status.", (char) 14998, th);
                }
            });
        }
    }

    @Override // com.google.android.libraries.search.account.a
    public final void is() {
        if (j()) {
            z.g(h(), new n(3));
            z.g(g(), new n(4));
            com.google.protobuf.ba createBuilder = com.google.android.apps.gsa.l.e.c.c.createBuilder();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.l.e.c cVar = createBuilder.instance;
            cVar.i = 4;
            cVar.d |= 4;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.l.e.c cVar2 = createBuilder.instance;
            cVar2.d |= 2;
            cVar2.h = "agsa";
            createBuilder.ba(v.cF);
            com.google.android.apps.gsa.l.e.c build = createBuilder.build();
            com.google.protobuf.ba createBuilder2 = s.a.createBuilder();
            createBuilder2.copyOnWrite();
            s sVar = createBuilder2.instance;
            sVar.e = 1;
            sVar.b = 4 | sVar.b;
            com.google.protobuf.bc createBuilder3 = u.a.createBuilder();
            createBuilder3.w(com.google.android.apps.gsa.l.e.d.a, build);
            createBuilder2.copyOnWrite();
            s sVar2 = createBuilder2.instance;
            u build2 = createBuilder3.build();
            build2.getClass();
            sVar2.h = build2;
            sVar2.b |= 32;
            if (this.q.f(com.google.android.apps.gsa.tasks.ar.GELLER_REFRESH_TASK, createBuilder2.build())) {
                return;
            }
            com.google.common.f.a.a f = f1674a.f();
            f.ak(15006);
            f.p("Couldn't schedule Geller refresh task.");
        }
    }

    public final boolean j() {
        return ((com.google.android.apps.gsa.nga.api.aq) this.p.a()).a() == ls.b;
    }

    public final boolean k() {
        if (j()) {
            return DesugarArrays.stream(((com.google.android.apps.gsa.search.core.google.gaia.an) this.b.a()).B()).map(new q(2)).allMatch(new v(this));
        }
        return false;
    }
}
