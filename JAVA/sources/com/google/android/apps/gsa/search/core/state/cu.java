package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.ei;
import com.google.android.apps.gsa.shared.logger.c.b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.v.m;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.at;
import com.google.common.o.hb;
import com.google.common.o.r;
import com.google.protobuf.bc;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cu.class */
public class cu implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1270a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.cu");
    public final a b;
    public final com.google.android.apps.gsa.search.core.h.p c;
    public final Query d;
    private final a e;
    private final a f;
    private final a g;
    private final a h;
    private final com.google.android.apps.gsa.search.core.ae.k.a i;
    private final a j;
    private final h k;
    private final a l;

    public cu(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, com.google.android.apps.gsa.search.core.ae.k.a aVar6, a aVar7, com.google.android.apps.gsa.search.core.h.p pVar, Query query, h hVar, a aVar8) {
        this.e = aVar;
        this.b = aVar2;
        this.f = aVar3;
        this.g = aVar4;
        this.h = aVar5;
        this.i = aVar6;
        this.j = aVar7;
        this.c = pVar;
        this.d = query;
        this.k = hVar;
        this.l = aVar8;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void a(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (((bk) this.b.a()).m.co(query)) {
            ((bq) this.g.a()).c(2);
            this.i.d();
            ay ayVar = (ay) this.e.a();
            if (ayVar.b.w(com.google.android.apps.gsa.shared.k.az.dR) && !((j) ayVar.f.a()).f1303a.l()) {
                ayVar.i.b();
            }
            if (((bk) ayVar.c.a()).m.bn()) {
                ayVar.h.B(new com.google.android.apps.gsa.search.shared.service.ae(hf.CONTINUOUS_MATCH_STARTED).a());
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void b(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (((bk) this.b.a()).m.co(query)) {
            bq bqVar = (bq) this.g.a();
            int i = bqVar.k;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    bqVar.c(5);
                } else if (i != 4 && i != 5 && i != 6 && i != 7 && i != 9) {
                    bqVar.c(4);
                }
            }
            this.i.f();
            ay ayVar = (ay) this.e.a();
            if (ayVar.b.w(com.google.android.apps.gsa.shared.k.az.kZ) && ayVar.b.w(com.google.android.apps.gsa.shared.k.az.iT) && !((j) ayVar.f.a()).f1303a.l()) {
                ayVar.i.c();
            }
            if (((bk) ayVar.c.a()).m.bn()) {
                ayVar.h.B(new com.google.android.apps.gsa.search.shared.service.ae(hf.CONTINUOUS_MATCH_STOPPED).a());
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void c(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void d(Query query, m mVar) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        bf bfVar = (bf) this.f.a();
        b a2 = com.google.android.apps.gsa.shared.logger.c.c.a();
        a2.a = mVar.c();
        bfVar.n(a2.a(), query.E);
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void e(byte[] bArr) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        ay ayVar = (ay) this.e.a();
        if (ayVar.o) {
            ayVar.h.n(bArr);
        } else {
            ayVar.x.add(bArr);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void f(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (query.bJ()) {
            ((ay) this.e.a()).l(query);
        } else {
            ((bk) this.b.a()).v(query);
        }
        if (this.c.w(ei.c) && query.ca()) {
            ((bq) this.g.a()).c(9);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void g(Query query, SearchError searchError) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (query.bJ()) {
            ((ay) this.e.a()).f(query, searchError);
        } else {
            ((bk) this.b.a()).r(query, searchError);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void h(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (query.bJ()) {
            com.google.android.apps.gsa.search.core.ae.aq.f fVar = ((ay) this.e.a()).h;
            com.google.android.apps.gsa.search.shared.service.ae aeVar = new com.google.android.apps.gsa.search.shared.service.ae(hf.CAR_ASSISTANT_NETWORK_STATE);
            com.google.protobuf.bg bgVar = com.google.android.apps.gsa.search.shared.service.c.y.a;
            com.google.protobuf.ba createBuilder = com.google.android.apps.gsa.search.shared.service.c.z.a.createBuilder();
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c.u uVar = com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c.u.d;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.c.z zVar = createBuilder.instance;
            zVar.c = uVar.e;
            zVar.b |= 1;
            aeVar.b(bgVar, createBuilder.build());
            fVar.B(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void i(Query query, SearchError searchError) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        ((bk) this.b.a()).r(query, searchError);
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void j(Query query, com.google.android.apps.gsa.search.core.l.aj ajVar) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (query.bJ()) {
            ((ay) this.e.a()).i(query, ajVar);
        } else {
            ((bs) this.j.a()).a(query, ajVar);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void k(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        ((bq) this.g.a()).c(5);
        ((bq) this.g.a()).f.a();
        bk bkVar = (bk) this.b.a();
        if (bkVar.R(query, false, bkVar.u, false)) {
            bkVar.an();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void l(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        bk bkVar = (bk) this.b.a();
        if (bkVar.m.co(query)) {
            com.google.android.apps.gsa.search.core.state.f.c.b(query, 172, at.k(r.a), bkVar.g, bkVar.i, bkVar.h);
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 172;
            String b = com.google.android.libraries.search.t.k.a.b(bkVar.m.E);
            createBuilder.copyOnWrite();
            hb hbVar2 = createBuilder.instance;
            b.getClass();
            hbVar2.b |= 4;
            hbVar2.o = b;
            createBuilder.copyOnWrite();
            hb hbVar3 = createBuilder.instance;
            hbVar3.g |= 1;
            hbVar3.aq = false;
            com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
            bkVar.T(query);
            bkVar.m = bkVar.n(query);
            bkVar.an();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void m(Query query, com.google.android.apps.gsa.shared.speech.i iVar) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (query.bJ()) {
            ((ay) this.e.a()).k(query, iVar);
        } else {
            ((TtsState) this.h.a()).k(query, iVar.a);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void n() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        ((bk) this.b.a()).Z();
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void o(Query query, String str, String str2, boolean z, String str3) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (str3 != null && !str3.equals(query.J)) {
            com.google.common.f.h f = f1270a.f();
            f.aj(com.google.common.f.a.e.a, "VoiceSearchEventBus");
            com.google.common.f.h hVar = f;
            hVar.ak(7893);
            hVar.p("language doesnt match getLanguageOverride");
        }
        if (((bk) this.b.a()).m.co(query)) {
            if (z && this.c.w(df.bG)) {
                com.google.common.f.h d = f1270a.d();
                d.aj(com.google.common.f.a.e.a, "VoiceSearchEventBus");
                com.google.common.f.h hVar2 = d;
                hVar2.ak(7891);
                hVar2.s("Recognized Text: %s", str);
            }
            bq bqVar = (bq) this.g.a();
            if (str3 != null && !str3.equals(query.J)) {
                com.google.common.f.h f2 = bq.f1253a.f();
                f2.ak(7722);
                f2.p("language doesnt match getLanguageOverride");
            }
            if (bqVar.i(query)) {
                if (bqVar.m) {
                    com.google.common.f.h f3 = bq.f1253a.f();
                    f3.ak(7720);
                    f3.p("updateRecognizedText called after text already final.");
                } else if (z) {
                    if (str2.isEmpty()) {
                        bqVar.p = str2;
                        bqVar.o = str;
                        bqVar.m = true;
                        bqVar.f.b(bqVar.o, str3);
                        bqVar.c(9);
                        bqVar.an();
                    } else {
                        com.google.common.f.h f4 = bq.f1253a.f();
                        f4.ak(7719);
                        f4.p("Final updateRecognizedText call with non-empty pending text");
                        int i = com.google.android.apps.gsa.shared.util.b.h.a;
                    }
                } else if (!bqVar.o.equals(str) || !bqVar.p.equals(str2)) {
                    bqVar.p = str2;
                    bqVar.o = str;
                    int i2 = bqVar.k;
                    if (i2 != 4 && i2 != 5 && i2 != 8 && i2 != 7 && i2 != 9 && i2 != 0) {
                        bqVar.c(10);
                    }
                    if (!bqVar.o.isEmpty() || !bqVar.p.isEmpty()) {
                        bqVar.f.j(bqVar.o, bqVar.p, str3);
                    }
                    bqVar.an();
                }
            }
            if (this.c.w(com.google.android.apps.gsa.shared.k.az.de)) {
                new com.google.android.apps.gsa.shared.util.c.ae(((com.google.android.libraries.gsa.c.a.a.t) this.l.a()).c(), this.k, "check connectivity info").a(new ct(this, z, str)).a(new a(18));
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void p(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        bq bqVar = (bq) this.g.a();
        if (bqVar.i(query)) {
            bqVar.a();
            bqVar.c(1);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void q(Query query) {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (((bk) this.b.a()).m.co(query)) {
            ((bq) this.g.a()).c(3);
            if (query.bJ()) {
                ((ay) this.e.a()).h.r();
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bw.c
    public final void r() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        bk bkVar = (bk) this.b.a();
        bkVar.y(bkVar.m.r());
    }
}
