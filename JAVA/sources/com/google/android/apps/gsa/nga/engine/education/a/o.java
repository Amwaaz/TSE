package com.google.android.apps.gsa.nga.engine.education.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.j.a.c;
import com.google.android.apps.gsa.nga.engine.ao.h;
import com.google.android.apps.gsa.nga.engine.c.c.a.k;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.search.b.b;
import com.google.android.libraries.search.b.i.e;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.b.op;
import com.google.common.base.bb;
import com.google.common.base.ck;
import com.google.common.f.a.d;
import com.google.common.f.ab;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.common.v.f;
import com.google.g.x.a.ac;
import com.google.g.x.a.ad;
import com.google.g.x.a.ae;
import com.google.g.x.a.ag;
import com.google.g.x.a.ah;
import com.google.g.x.a.ai;
import com.google.g.x.a.aj;
import com.google.g.x.a.ak;
import com.google.g.x.a.u;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/a/o.class */
public final class o extends com.google.android.apps.gsa.nga.engine.t.c implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final d f554a = d.j();
    public final fl b;
    public final Context c;
    public final AtomicReference d;
    public final AtomicReference e;
    public final AtomicReference f;
    public final f g;
    public final AtomicReference h;
    public final Optional i;
    public final cr j;
    public final i k;
    private final fl l;
    private final com.google.android.apps.gsa.shared.util.q.a m;
    private final e.a n;
    private final com.google.android.libraries.gsa.h.h o;
    private final e.a p;
    private final y q;

    public o(Context context, com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.libraries.gsa.h.h hVar, e.a aVar2, y yVar, n nVar, f fVar, e.a aVar3, Optional optional, cr crVar, i iVar) {
        super(nVar, new op(Integer.valueOf(eu.bX.f1434a)));
        q a2 = w.a();
        a2.b = "nga-hs-1";
        a2.c = new a(2132093196);
        a2.d = new a(2132093072);
        a2.d(Locale.ROOT);
        a2.b(p.f555a);
        a2.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/clock_round_color_48dp.png";
        w a3 = a2.a();
        q a4 = w.a();
        a4.b = "nga-hs-11";
        a4.c = new a(2132093184);
        a4.d = new a(2132093074);
        a4.d(Locale.ROOT);
        a4.b(p.f555a);
        a4.h = (String) p.g.get("com.google.android.gm");
        a4.e = Optional.ofNullable("com.google.android.gm");
        w a5 = a4.a();
        q a6 = w.a();
        a6.b = "nga-hs-2";
        a6.c = new a(2132093169);
        a6.d = new a(2132093078);
        a6.d(Locale.ROOT);
        a6.b(p.f555a);
        a6.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/weather_round_color_48dp.png";
        w a7 = a6.a();
        q a8 = w.a();
        a8.b = "nga-hs-8";
        a8.c = new a(2132093166);
        a8.d = new a(2132093079);
        a8.d(Locale.ROOT);
        a8.b(p.f555a);
        a8.e = Optional.ofNullable("com.google.android.GoogleCamera");
        a8.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png";
        w a9 = a8.a();
        q a10 = w.a();
        a10.b = "nga-hs-12";
        a10.d = new a(2132093075);
        a10.d(Locale.ROOT);
        a10.b(p.f555a);
        a10.h = "http://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png";
        w a11 = a10.a();
        q a12 = w.a();
        a12.b = "nga-hs-4";
        a12.c = new a(2132093188);
        a12.d = new a(2132093080);
        a12.d(Locale.ROOT);
        a12.b(p.f555a);
        a12.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/clock_round_color_48dp.png";
        w a13 = a12.a();
        q a14 = w.a();
        a14.b = "nga-hs-5";
        a14.c = new a(2132093170);
        a14.d = new a(2132093081);
        a14.d(Locale.ROOT);
        a14.b(p.f555a);
        a14.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/dialer_round_color_48dp.png";
        w a15 = a14.a();
        q a16 = w.a();
        a16.b = "nga-hs-13";
        a16.c = new a(2132093174);
        a16.d = new a(2132093076);
        a16.d(Locale.ROOT);
        a16.b(p.f555a);
        a16.e = Optional.ofNullable("com.android.vending");
        a16.h = (String) p.g.get("com.android.vending");
        w a17 = a16.a();
        q a18 = w.a();
        a18.b = "nga-hs-7";
        a18.c = new a(2132093188);
        a18.d = new a(2132093082);
        a18.d(Locale.ROOT);
        a18.b(p.f555a);
        a18.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/myday_round_color_48dp.png";
        w a19 = a18.a();
        q a20 = w.a();
        a20.b = "nga-hs-14";
        a20.c = new a(2132093185);
        a20.d = new a(2132093077);
        a20.d(Locale.ROOT);
        a20.b(p.f555a);
        a20.e = Optional.ofNullable("com.google.android.apps.messaging");
        a20.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/text_round_color_48dp.png";
        w a21 = a20.a();
        q a22 = w.a();
        a22.b = "nga-hs-10";
        a22.c = new a(2132093196);
        a22.d = new a(2132093073);
        a22.d(Locale.ROOT);
        a22.b(p.f555a);
        a22.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/reminder_round_color.png";
        w a23 = a22.a();
        q a24 = w.a();
        a24.b = "nga-ia-1";
        a24.d = new a(2132093083);
        a24.d(Locale.ROOT);
        a24.b(p.b);
        a24.f = new op("com.android.chrome");
        a24.h = (String) p.g.get("com.android.chrome");
        w a25 = a24.a();
        q a26 = w.a();
        a26.b = "nga-ia-2";
        a26.c = new a(2132093170);
        a26.d = new a(2132093084);
        a26.d(Locale.ROOT);
        a26.b(p.b);
        a26.f = new op("com.google.android.dialer");
        a26.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/dialer_round_color_48dp.png";
        w a27 = a26.a();
        q a28 = w.a();
        a28.b = "nga-ia-3";
        a28.c = new a(2132093166);
        a28.d = new a(2132093085);
        a28.d(Locale.ROOT);
        a28.b(p.b);
        a28.f = new op("com.google.android.GoogleCamera");
        a28.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png";
        w a29 = a28.a();
        q a30 = w.a();
        a30.b = "nga-ia-4";
        a30.c = new a(2132093186);
        a30.d = new a(2132093086);
        a30.d(Locale.ROOT);
        a30.b(p.b);
        a30.f = new op("com.google.android.apps.photos");
        a30.h = (String) p.g.get("com.google.android.apps.photos");
        w a31 = a30.a();
        q a32 = w.a();
        a32.b = "nga-ia-6";
        a32.c = new a(2132093194);
        a32.d = new a(2132093087);
        a32.d(Locale.ROOT);
        a32.b(p.b);
        a32.f = new op("com.google.android.youtube");
        a32.h = (String) p.g.get("com.google.android.youtube");
        w a33 = a32.a();
        q a34 = w.a();
        a34.b = "nga-ia-7";
        a34.c = new a(2132093170);
        a34.d = new a(2132093088);
        a34.d(Locale.ROOT);
        a34.b(p.b);
        a34.f = new op("com.google.android.apps.messaging");
        a34.h = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/text_round_color_48dp.png";
        w a35 = a34.a();
        q a36 = w.a();
        a36.b = "nga-ia-8";
        a36.c = new a(2132093174);
        a36.d = new a(2132093089);
        a36.d(Locale.ROOT);
        a36.b(p.b);
        a36.f = new op("com.android.vending");
        a36.h = (String) p.g.get("com.android.vending");
        w a37 = a36.a();
        q a38 = w.a();
        a38.b = "nga-ia-9";
        a38.c = new a(2132093184);
        a38.d = new a(2132093090);
        a38.d(Locale.ROOT);
        a38.b(p.b);
        a38.f = new op("com.google.android.gm");
        a38.h = (String) p.g.get("com.google.android.gm");
        w a39 = a38.a();
        q a40 = w.a();
        a40.b = "nga-hf-2";
        a40.c = new a(2132093071);
        a40.d = new a(2132093071);
        a40.d(Locale.US);
        a40.b(p.c);
        ai createBuilder = ah.a.createBuilder();
        ag agVar = ag.b;
        createBuilder.copyOnWrite();
        ah ahVar = createBuilder.instance;
        ahVar.c = agVar.d;
        ahVar.b |= 1;
        ai createBuilder2 = aj.a.createBuilder();
        ag agVar2 = ag.b;
        createBuilder2.copyOnWrite();
        aj ajVar = createBuilder2.instance;
        ajVar.c = agVar2.d;
        ajVar.b |= 1;
        ba createBuilder3 = ae.a.createBuilder();
        ad adVar = ad.b;
        createBuilder3.copyOnWrite();
        ae aeVar = createBuilder3.instance;
        aeVar.e = adVar.d;
        aeVar.b |= 1;
        ai createBuilder4 = ac.a.createBuilder();
        ba createBuilder5 = ak.a.createBuilder();
        createBuilder5.copyOnWrite();
        ak akVar = createBuilder5.instance;
        akVar.b = 1;
        akVar.c = "com.google.android.apps.nexuslauncher";
        createBuilder4.s(createBuilder5);
        createBuilder3.copyOnWrite();
        ae aeVar2 = createBuilder3.instance;
        ac build = createBuilder4.build();
        build.getClass();
        aeVar2.d = build;
        aeVar2.c = 2;
        createBuilder2.q(createBuilder3);
        createBuilder.r(createBuilder2);
        ai createBuilder6 = aj.a.createBuilder();
        ag agVar3 = ag.c;
        createBuilder6.copyOnWrite();
        aj ajVar2 = createBuilder6.instance;
        ajVar2.c = agVar3.d;
        ajVar2.b |= 1;
        ba createBuilder7 = ae.a.createBuilder();
        ad adVar2 = ad.c;
        createBuilder7.copyOnWrite();
        ae aeVar3 = createBuilder7.instance;
        aeVar3.e = adVar2.d;
        aeVar3.b |= 1;
        ai createBuilder8 = ac.a.createBuilder();
        ba createBuilder9 = ak.a.createBuilder();
        createBuilder9.copyOnWrite();
        ak akVar2 = createBuilder9.instance;
        akVar2.b = 2;
        akVar2.c = true;
        createBuilder8.s(createBuilder9);
        createBuilder7.copyOnWrite();
        ae aeVar4 = createBuilder7.instance;
        ac build2 = createBuilder8.build();
        build2.getClass();
        aeVar4.d = build2;
        aeVar4.c = 2;
        createBuilder6.q(createBuilder7);
        createBuilder.r(createBuilder6);
        a40.f556a = Optional.of(createBuilder.build());
        this.l = fl.A(a3, a5, a7, a9, a11, a13, a15, a17, a19, a21, a23, a25, new w[]{a27, a29, a31, a33, a35, a37, a39, a40.a()});
        q a41 = w.a();
        a41.b = "nga-lpp-1";
        a41.c = new a(2132093091);
        a41.d = new a(2132093091);
        a41.d(Locale.ROOT);
        a41.b(p.f555a);
        this.b = fl.p(a41.a());
        this.d = new AtomicReference(ni.a);
        this.e = new AtomicReference(ni.a);
        this.f = new AtomicReference(Optional.empty());
        this.h = new AtomicReference(Optional.empty());
        this.c = context;
        this.o = hVar;
        this.m = aVar;
        this.n = aVar2;
        this.q = yVar;
        this.g = fVar;
        this.p = aVar3;
        this.i = optional;
        this.j = crVar;
        this.k = iVar;
    }

    public static fl c(com.google.android.apps.gsa.assistant.shared.d.f fVar) {
        Locale locale = fVar.a.equals(Locale.US) ? Locale.ENGLISH : fVar.a;
        fVar.b.size();
        Locale locale2 = fVar.a;
        return (fl) Collection._EL.stream(fVar.b).filter(new i(1)).flatMap(new k(locale, 1)).collect(bs.a);
    }

    public static boolean k(Locale locale, Locale locale2) {
        if (locale2.equals(Locale.ROOT)) {
            return true;
        }
        return TextUtils.isEmpty(locale2.getCountry()) ? locale.getLanguage().equals(locale2.getLanguage()) : locale.equals(locale2);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(com.google.android.apps.gsa.nga.shared.f.t tVar) {
        if (tVar.equals(com.google.android.apps.gsa.nga.shared.f.t.f) || tVar.equals(com.google.android.apps.gsa.nga.shared.f.t.g)) {
            if (!tVar.equals(com.google.android.apps.gsa.nga.shared.f.t.g)) {
                S();
                return;
            }
            com.google.android.libraries.gsa.h.h hVar = this.o;
            cn g = com.google.common.util.concurrent.i.g(((com.google.android.apps.gsa.assistant.shared.j.o) this.p.a()).f279a.d(), new com.google.common.base.ah() { // from class: com.google.android.apps.gsa.assistant.shared.j.i
                public final Object apply(Object obj) {
                    com.google.android.apps.gsa.assistant.shared.j.a.d dVar = ((c) obj).i;
                    com.google.android.apps.gsa.assistant.shared.j.a.d dVar2 = dVar;
                    if (dVar == null) {
                        dVar2 = com.google.android.apps.gsa.assistant.shared.j.a.d.a;
                    }
                    return dVar2;
                }
            }, ay.a);
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
            z.g(hVar.k(g, "[NGA] Load overapp promise", new f(this)), new g());
        }
    }

    public final com.google.g.ab.e.b.d a(com.google.g.ab.e.b.c cVar) {
        com.google.g.ab.e.b.d dVar;
        if (!j() || this.i.isEmpty()) {
            return com.google.g.ab.e.b.d.a;
        }
        Object obj = this.i.get();
        int cU = a.a.cU(cVar.c);
        int i = cU;
        if (cU == 0) {
            i = 1;
        }
        com.google.android.apps.gsa.nga.engine.c.c.a.i iVar = (com.google.android.apps.gsa.nga.engine.c.c.a.i) obj;
        b bVar = iVar.e;
        String valueOf = String.valueOf(i - 1);
        bVar.a(new e(new com.google.android.libraries.search.b.b.a("NGA_APP_CONTROL_DISCOVERY_IMMEDIATE_FETCH", true, com.google.common.base.a.a, 1336, com.google.android.libraries.search.b.a.c.e.NGA_APP_CONTROL, com.google.android.libraries.search.b.a.c.b.b, com.google.android.libraries.search.b.a.c.b.f5007a, com.google.android.libraries.search.b.a.c.b.c, com.google.android.libraries.search.b.a.c.b.d)).m("surface", valueOf));
        String b = iVar.d.b(cVar);
        Optional a2 = k.a(cVar);
        if (TextUtils.isEmpty(b) || a2.isEmpty()) {
            if (a2.isPresent()) {
                a2.get();
            }
        } else if (iVar.c() && iVar.e() && iVar.d.c()) {
            if (iVar.d((Locale) a2.get())) {
                com.google.android.apps.gsa.nga.engine.c.c.a.b.a aVar = iVar.f;
                com.google.g.ab.e.b.o createBuilder = com.google.g.ab.e.b.d.a.createBuilder();
                fl b2 = iVar.b(b, (Locale) a2.get());
                createBuilder.copyOnWrite();
                com.google.g.ab.e.b.d dVar2 = createBuilder.instance;
                dVar2.a();
                com.google.protobuf.c.addAll(b2, dVar2.b);
                dVar = aVar.a(cVar, (com.google.g.ab.e.b.d) createBuilder.build());
                if (dVar.b.isEmpty()) {
                    b bVar2 = iVar.e;
                    com.google.android.libraries.search.b.i.a c = com.google.android.libraries.search.b.a.c.b.F().c(com.google.net.util.a.b.o);
                    c.s("surface", valueOf);
                    bVar2.a(c);
                } else {
                    b bVar3 = iVar.e;
                    com.google.android.libraries.search.b.i.a c2 = com.google.android.libraries.search.b.a.c.b.F().c(com.google.net.util.a.b.a);
                    c2.s("surface", valueOf);
                    bVar3.a(c2);
                }
                return dVar;
            }
            ((Locale) a2.get()).toLanguageTag();
        }
        b bVar4 = iVar.e;
        com.google.android.libraries.search.b.i.a c3 = com.google.android.libraries.search.b.a.c.b.F().c(com.google.net.util.a.b.o);
        c3.s("surface", valueOf);
        bVar4.a(c3);
        dVar = com.google.g.ab.e.b.d.a;
        return dVar;
    }

    public final fl e(Locale locale, t... tVarArr) {
        if (gV()) {
            fl f = f((fl) this.d.get(), locale, tVarArr);
            f.size();
            if (!f.isEmpty()) {
                return f;
            }
        }
        return f(this.l, locale, tVarArr);
    }

    public final fl f(fl flVar, Locale locale, t... tVarArr) {
        Stream filter = Collection._EL.stream(flVar).filter(new d(locale, 1)).filter(new h(this, tVarArr));
        int i = fl.e;
        return (fl) filter.collect(bs.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.q.c().f619a && this.m.i(eu.bX);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        return !((Optional) this.f.get()).equals(Optional.of(this.q.c().d));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        this.f.set(Optional.of(this.q.c().d));
        com.google.android.apps.gsa.assistant.shared.d.i iVar = (com.google.android.apps.gsa.assistant.shared.d.i) this.n.a();
        ab abVar = com.google.common.f.a.e.a;
        cn a2 = iVar.a("Get chalkboard suggestions for NGA FRE", ck.e(com.google.android.apps.gsa.assistant.shared.d.i.a, new bb(com.google.android.apps.gsa.assistant.shared.d.i.b)));
        com.google.android.apps.gsa.assistant.shared.d.i iVar2 = (com.google.android.apps.gsa.assistant.shared.d.i) this.n.a();
        cn g = com.google.common.util.concurrent.i.g(((cg) iVar2.c.a()).d(), new com.google.android.apps.gsa.assistant.shared.d.e(new bb(com.google.android.apps.gsa.assistant.shared.d.i.b)), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        cn g2 = com.google.common.util.concurrent.i.g(iVar2.b(), new com.google.android.apps.gsa.assistant.shared.d.a(), ay.a);
        com.google.android.apps.gsa.assistant.shared.d.a.b bVar = new com.google.android.apps.gsa.assistant.shared.d.a.b();
        bVar.a = new HashMap();
        bVar.b = new ArrayList();
        bVar.a.put(u.c, new com.google.android.apps.gsa.assistant.shared.d.a.c());
        if (iVar2.d.i(br.be)) {
            bVar.c = true;
        }
        cn b = dl.i(new cn[]{g, g2}).b(new com.google.android.apps.gsa.assistant.shared.d.b(g, bVar, g2), ay.a);
        return dl.i(new cn[]{a2, b}).b(new n(this, a2, b), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        int i = fl.e;
        this.d.set(ni.a);
        this.e.set(ni.a);
        return dl.n(com.google.android.apps.gsa.v.c.f1836a);
    }

    public final boolean j() {
        return this.m.i(eu.bt) && this.m.i(eu.bu);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "QuerySuggestions";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 12;
    }
}
