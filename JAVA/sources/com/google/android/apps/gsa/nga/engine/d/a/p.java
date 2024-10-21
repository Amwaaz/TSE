package com.google.android.apps.gsa.nga.engine.d.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ae.b;
import com.google.android.apps.gsa.nga.engine.ae.l;
import com.google.android.apps.gsa.nga.engine.annotators.e;
import com.google.android.apps.gsa.nga.engine.ao.h;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.c;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.o.r;
import com.google.android.apps.gsa.nga.engine.o.t;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.shared.f.a.ak;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.ac;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.libraries.search.assistant.aq.q.o;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.b.bs;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nn;
import com.google.common.b.nr;
import com.google.common.b.qj;
import com.google.common.base.bu;
import com.google.common.base.cl;
import com.google.common.base.u;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.cu;
import com.google.speech.a.a.i;
import com.google.speech.a.a.m;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/p.class */
public final class p extends com.google.android.apps.gsa.nga.engine.t.f implements an, t, e, l, h, r, com.google.android.apps.gsa.nga.engine.o.a, b, c {
    public final bc A;
    public final com.google.android.apps.gsa.nga.engine.c.h B;
    public final ap C;
    private final com.google.android.apps.gsa.nga.engine.ak.h.t L;
    private String M;
    private ha N;
    private ha O;
    private ha P;
    private fl Q;
    private ha R;
    private final com.google.android.libraries.gsa.h.h S;
    private final com.google.android.libraries.g.a T;
    private final com.google.android.apps.search.assistant.platform.a.b U;
    private final Comparator V;
    private final com.google.android.apps.gsa.nga.shared.f.a.an W;
    public final aw d;
    public final Context e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final AtomicReference i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final Optional m;
    public final AtomicReference n;
    public final com.google.android.apps.gsa.shared.util.q.a o;
    public final com.google.android.libraries.gsa.h.h p;
    public final AtomicReference q;
    public final AtomicReference r;
    public final e.a s;
    public final com.google.android.apps.gsa.nga.engine.ak.h.ap t;
    public final e.a u;
    public m v;
    public final com.google.android.apps.gsa.nga.engine.c.b.c w;
    public final AtomicReference x;
    public final k y;
    public final Comparator z;

    /* renamed from: a, reason: collision with root package name */
    public static final d f542a = d.j();
    public static final d b = d.c("BiasingResourcesDebug");
    public static final bu c = bu.f(cl.I("[\\p{Space}\\p{Punct}&&[^']]")).g(u.c).a();
    private static final Integer G = 200;
    private static final Integer H = 200;
    private static final fl I = fl.p("starlight-photo-tagged-name");
    private static final fl J = fl.p("schema.org/TextDigitalDocument");
    private static final Long K = 600000L;

    public p(Context context, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, com.google.android.libraries.g.a aVar, com.google.android.apps.gsa.nga.engine.ak.h.t tVar, ap apVar, com.google.android.apps.gsa.shared.util.q.a aVar2, bc bcVar, aw awVar, e.a aVar3, com.google.android.apps.gsa.nga.shared.f.a.an anVar, com.google.android.apps.gsa.nga.engine.ak.h.ap apVar2, y yVar, com.google.android.apps.gsa.nga.engine.t.a.n nVar, Optional optional, com.google.android.apps.search.assistant.platform.a.b bVar, com.google.android.apps.gsa.nga.engine.c.h hVar3, com.google.android.apps.gsa.nga.engine.c.b.c cVar, e.a aVar4) {
        super(nVar, yVar);
        this.f = new AtomicReference();
        this.g = new AtomicReference(n.a(nr.a, false));
        this.h = new AtomicReference(nr.a);
        this.i = new AtomicReference(nr.a);
        this.j = new AtomicReference(nr.a);
        this.k = new AtomicReference(nr.a);
        this.l = new AtomicReference(nr.a);
        this.n = new AtomicReference(nn.a);
        nr nrVar = nr.a;
        this.N = nrVar;
        this.O = nrVar;
        this.P = nrVar;
        int i = fl.e;
        fl flVar = ni.a;
        this.Q = flVar;
        this.R = nr.a;
        this.q = new AtomicReference(flVar);
        this.r = new AtomicReference(ni.a);
        this.x = new AtomicReference(nn.a);
        this.y = new k();
        this.z = Comparator._EL.reversed(Comparator._CC.comparing(new d(4)));
        this.V = Comparator._EL.reversed(Comparator._CC.comparing(new d(5)));
        this.e = context;
        this.L = tVar;
        this.A = bcVar;
        this.p = hVar;
        this.S = hVar2;
        this.d = awVar;
        this.s = aVar3;
        this.W = anVar;
        this.T = aVar;
        this.t = apVar2;
        this.o = aVar2;
        this.C = apVar;
        this.m = optional;
        this.U = bVar;
        this.B = hVar3;
        this.w = cVar;
        this.u = aVar4;
    }

    private final int X(ae aeVar) {
        aa aaVar = e().b;
        aa aaVar2 = aaVar;
        if (aaVar == null) {
            aaVar2 = aa.a;
        }
        int i = aeVar.l;
        ad adVar = ad.a;
        cu cuVar = aaVar2.q;
        Integer valueOf = Integer.valueOf(i);
        if (cuVar.containsKey(valueOf)) {
            adVar = (ad) cuVar.get(valueOf);
        }
        return adVar.c ? (adVar.b & 2) != 0 ? adVar.d : 500 : 0;
    }

    private final ha Y(fl flVar) {
        if (!this.o.i(eu.mC)) {
            return nr.a;
        }
        gy gyVar = new gy();
        int size = flVar.size();
        for (int i = 0; i < size; i++) {
            m mVar = ((com.google.protos.au.b.a) flVar.get(i)).b;
            m mVar2 = mVar;
            if (mVar == null) {
                mVar2 = m.a;
            }
            if (mVar2.d.equals("contacts-from-devices")) {
                com.google.speech.a.a.c cVar = mVar2.i;
                com.google.speech.a.a.c cVar2 = cVar;
                if (cVar == null) {
                    cVar2 = com.google.speech.a.a.c.a;
                }
                Iterator it = cVar2.d.iterator();
                while (it.hasNext()) {
                    gyVar.h(((com.google.speech.a.a.d) it.next()).c.toLowerCase(Locale.US));
                }
            }
        }
        return gyVar.g();
    }

    private final ha Z() {
        n nVar = (n) this.g.get();
        if (nVar.b) {
            Optional optional = nVar.c;
            if (optional.isEmpty() || ((Long) optional.get()).longValue() <= this.T.f().toEpochMilli()) {
                L();
            }
        }
        return ((n) this.g.get()).f541a;
    }

    public static v f(Context context) {
        v vVar = v.a;
        try {
            try {
                return com.google.protobuf.bi.parseFrom(v.a, context.getResources().openRawResource(2132017208), ExtensionRegistryLite.getGeneratedRegistry());
            } catch (IOException e) {
                aus.f(f542a.f(), "Converting from input stream to BiasingConfig caused an exception.", (char) 2555, e);
                return vVar;
            }
        } catch (Resources.NotFoundException e2) {
            aus.f(f542a.f(), "Biasing config resource not found.", (char) 2556, e2);
            return vVar;
        }
    }

    public static fl m(List list, int i) {
        fg fgVar = new fg(4);
        for (int i2 = 0; i2 < (list.size() - i) + 1; i2++) {
            fgVar.h(TextUtils.join(" ", list.subList(i2, i2 + i)));
        }
        return fgVar.g();
    }

    public static ha p(String str, String str2) {
        return ha.t(a.a.dx(str2, str, " "), a.a.dx(str, str2, " in "), a.a.dx(str, str2, " on "));
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha A() {
        return this.N;
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha B() {
        gy gyVar = new gy();
        fu fuVar = (fu) this.x.get();
        if (!this.o.i(eu.k)) {
            Collection._EL.stream(fuVar.g()).flatMap(new d(0)).forEach(new l(gyVar, 1));
            return gyVar.g();
        }
        if (Optional.ofNullable(this.M).isEmpty()) {
            return gyVar.g();
        }
        String str = (String) Optional.ofNullable(this.M).get();
        if (!fuVar.containsKey(str)) {
            return gyVar.g();
        }
        qj j = ((ha) fuVar.get(str)).j();
        while (j.hasNext()) {
            com.google.g.am.b.a.d dVar = (com.google.g.am.b.a.d) j.next();
            if (!dVar.d.isEmpty()) {
                gyVar.h(dVar.d);
            }
            if (!dVar.e.isEmpty()) {
                gyVar.h(dVar.e);
            }
        }
        return gyVar.g();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha C() {
        gy gyVar = new gy();
        Collection._EL.stream(((fu) this.x.get()).g()).flatMap(new d(6)).forEach(new l(gyVar, 0));
        return gyVar.g();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final org.a.a.b.b.b D() {
        if (!this.A.b().booleanValue()) {
            fl flVar = (fl) this.q.get();
            fl flVar2 = (fl) this.r.get();
            if (flVar2.isEmpty() && flVar.isEmpty()) {
                fl g = Z().g();
                fl flVar3 = ni.a;
                return org.a.a.b.b.b.d(g, flVar3, flVar3);
            }
            gy gyVar = new gy();
            gyVar.j(flVar);
            gyVar.j(this.d.a());
            gyVar.j(flVar2);
            fl g2 = gyVar.g().g();
            int size = g2.size();
            H.intValue();
            fl d = g2.d(0, Math.min(size, 200));
            fl flVar4 = ni.a;
            return org.a.a.b.b.b.d(d, flVar4, flVar4);
        }
        fl flVar5 = (fl) this.q.get();
        fl g3 = this.d.a().g();
        fl flVar6 = (fl) this.r.get();
        gy gyVar2 = new gy();
        if (flVar5.isEmpty() && g3.isEmpty()) {
            gyVar2.j(Z().g());
        } else {
            gyVar2.j(flVar5);
            gyVar2.j(g3);
        }
        fl g4 = gyVar2.g().g();
        int min = Math.min(g4.size(), Long.valueOf(this.A.f536a.d(eu.aW)).intValue());
        fl d2 = g4.d(0, min);
        gy gyVar3 = new gy();
        if (min < g4.size()) {
            gyVar3.j(g4.d(min, g4.size()));
        }
        gyVar3.j(flVar6);
        fl g5 = gyVar3.g().g();
        return org.a.a.b.b.b.d(d2, g5.d(0, Math.min(g5.size(), this.A.e().intValue())), ni.a);
    }

    public final void E() {
        ((bb) this.s.a()).c();
    }

    @Override // com.google.android.apps.gsa.nga.engine.o.t
    public final void F(fl flVar) {
        fg fgVar = new fg(4);
        int size = flVar.size();
        for (int i = 0; i < size; i++) {
            m mVar = ((com.google.protos.au.b.a) flVar.get(i)).b;
            m mVar2 = mVar;
            if (mVar == null) {
                mVar2 = m.a;
            }
            if (I.contains(mVar2.d)) {
                com.google.speech.a.a.c cVar = mVar2.i;
                com.google.speech.a.a.c cVar2 = cVar;
                if (cVar == null) {
                    cVar2 = com.google.speech.a.a.c.a;
                }
                Iterator it = cVar2.d.iterator();
                while (it.hasNext()) {
                    fgVar.h(((com.google.speech.a.a.d) it.next()).c.toLowerCase(Locale.US));
                }
                i iVar = mVar2.f;
                i iVar2 = iVar;
                if (iVar == null) {
                    iVar2 = i.a;
                }
                Iterator it2 = iVar2.b.iterator();
                while (it2.hasNext()) {
                    fgVar.h(((com.google.speech.a.a.h) it2.next()).c.toLowerCase(Locale.US));
                }
            }
        }
        ni g = fgVar.g();
        int i2 = g.d;
        H.intValue();
        this.Q = g.d(0, Math.min(i2, 200));
        gy gyVar = new gy();
        int size2 = flVar.size();
        for (int i3 = 0; i3 < size2; i3++) {
            m mVar3 = ((com.google.protos.au.b.a) flVar.get(i3)).b;
            m mVar4 = mVar3;
            if (mVar3 == null) {
                mVar4 = m.a;
            }
            if ("voice-profile-assistant-voice-ngrams".equals(mVar4.d)) {
                i iVar3 = mVar4.f;
                i iVar4 = iVar3;
                if (iVar3 == null) {
                    iVar4 = i.a;
                }
                Iterator it3 = iVar4.b.iterator();
                while (it3.hasNext()) {
                    gyVar.h(((com.google.speech.a.a.h) it3.next()).c.toLowerCase(Locale.US));
                }
            }
        }
        gyVar.g();
        this.N = Y(flVar);
        if (this.A.c().booleanValue()) {
            gy gyVar2 = new gy();
            int size3 = flVar.size();
            for (int i4 = 0; i4 < size3; i4++) {
                m mVar5 = ((com.google.protos.au.b.a) flVar.get(i4)).b;
                m mVar6 = mVar5;
                if (mVar5 == null) {
                    mVar6 = m.a;
                }
                if (mVar6.d.equals("acp-music-song-names") || mVar6.d.equals("acp-music-artist-names") || mVar6.d.equals("acp-music-personal-playlist-names")) {
                    fg fgVar2 = new fg(4);
                    com.google.speech.a.a.c cVar3 = mVar6.i;
                    com.google.speech.a.a.c cVar4 = cVar3;
                    if (cVar3 == null) {
                        cVar4 = com.google.speech.a.a.c.a;
                    }
                    for (com.google.speech.a.a.d dVar : cVar4.d) {
                        fgVar2.h(new com.google.common.base.av(Float.valueOf(dVar.d), dVar.c.toLowerCase(Locale.US)));
                    }
                    Stream sorted = Collection._EL.stream(fgVar2.g()).sorted(this.V);
                    G.intValue();
                    for (com.google.common.base.av avVar : (List) sorted.limit(200L).collect(Collectors.toList())) {
                        avVar.getClass();
                        gyVar2.h((String) avVar.b);
                    }
                }
            }
            this.O = gyVar2.g();
        } else {
            this.O = nr.a;
        }
        if (this.A.d().booleanValue()) {
            this.N = Y(flVar);
        } else {
            this.N = nr.a;
        }
        E();
    }

    @Override // com.google.android.apps.gsa.nga.engine.o.a
    public final void G(fl flVar) {
        if (this.A.a().booleanValue()) {
            this.R = (ha) Collection._EL.stream(flVar).filter(new h(0)).map(new d(2)).flatMap(new d(3)).collect(bs.b);
            E();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(com.google.android.apps.gsa.nga.shared.f.t tVar) {
        if (gV() && tVar == com.google.android.apps.gsa.nga.shared.f.t.e) {
            M();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.l
    public final void I(ha haVar) {
        gy gyVar = new gy();
        gyVar.j(haVar);
        this.P = gyVar.g();
        E();
    }

    @Override // com.google.android.apps.gsa.nga.engine.o.r
    public final void J() {
        N(k());
    }

    @Override // com.google.android.apps.gsa.nga.engine.o.t
    public final void K(fl flVar) {
    }

    public final void L() {
        try {
            com.google.android.apps.gsa.nga.engine.ak.h.t tVar = this.L;
            tVar.r();
            new ae(tVar.f.a("[NGA] ContactsHelper.getBestContactNames", new com.google.android.apps.gsa.nga.engine.ak.h.b(tVar, 2)), this.p, "[NGA] AndroidBiasingResources.updateBestContactNames").a(new g(this, 3)).a(new b(5));
        } catch (com.google.android.apps.gsa.nga.engine.l.b e) {
            if (!(e instanceof com.google.android.apps.gsa.nga.engine.l.a)) {
                DesugarAtomicReference.getAndUpdate(this.g, new i());
                return;
            }
            n nVar = (n) this.g.get();
            AtomicReference atomicReference = this.g;
            com.google.android.libraries.g.a aVar = this.T;
            nr nrVar = nr.a;
            long epochMilli = aVar.f().toEpochMilli();
            K.longValue();
            atomicReference.set(new n(nrVar, true, Optional.of(Long.valueOf(epochMilli + 600000))));
            if (nVar.f541a.isEmpty()) {
                return;
            }
            this.d.b(nr.a);
            E();
        }
    }

    public final void M() {
        com.google.android.apps.gsa.nga.shared.f.a.an anVar = this.W;
        cg cgVar = anVar.e;
        com.google.android.apps.gsa.contacts.bb bbVar = com.google.android.apps.gsa.contacts.bb.a;
        cn l = anVar.f862a.l(cgVar.d(), "[NGA] NgaReadOnlyLogsBasedTopContactsPreferences.getTopContactInfo", new com.google.android.apps.gsa.nga.shared.f.a.l(bbVar, 16));
        if (anVar.d.i(eu.fo)) {
            l = anVar.f862a.l(l, "[NGA] NgaReadOnlyLogsBasedTopContactsPreferences.getShortcutTopContacts", new ak(anVar, bbVar));
        }
        new ae(l, this.p, "[NGA] AndroidBiasingResources.updateLogsBasedContacts").a(new g(this, 2)).a(new b(4));
    }

    public final void N(o oVar) {
        ac a2 = new ae(this.p.l(this.U.a(com.google.android.libraries.search.assistant.aq.q.c.class), "[NGA] assistantAccountEntryPoints.getEntryPoint", new e(oVar)), this.p, "[NGA] AndroidBiasingResources.updatePkgAccessorData").a(new g(this, 1));
        a2.b(RuntimeException.class, new b(2));
        a2.a(new b(3));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void b(ah ahVar) {
        if (this.o.i(eu.j) && ahVar == ah.FULL_LISTENING && !((ha) this.j.get()).isEmpty()) {
            this.j.set(nr.a);
            E();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.annotators.e
    public final void c() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final v e() {
        v vVar = (v) this.f.get();
        v vVar2 = vVar;
        if (vVar == null) {
            vVar2 = v.a;
        }
        return vVar2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        cn a2 = this.p.a("[NGA] AndroidBiasingResources.initialize", new j(this, 1));
        cn n = dl.n(com.google.android.apps.gsa.v.c.f1836a);
        if (this.o.i(eu.j)) {
            n = this.S.a("[NGA] AndroidBiasingResources.initialize App Control Data Changed", new j(this, 0));
        }
        return dl.i(new cn[]{a2, n}).a(new k(), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void hc(aj ajVar, aj ajVar2) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        if (this.o.i(eu.l)) {
            com.google.android.apps.gsa.nga.engine.c.h hVar = this.B;
            m mVar = this.v;
            mVar.getClass();
            hVar.c(mVar);
            this.v = null;
        }
        return dl.n(com.google.android.apps.gsa.v.c.f1836a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.b
    public final void j(Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        String packageName = ((ComponentName) optional.get()).getPackageName();
        if (packageName.equals(this.M)) {
            return;
        }
        this.M = packageName;
        if (this.o.i(eu.k)) {
            E();
        }
    }

    public final o k() {
        aa aaVar = e().b;
        aa aaVar2 = aaVar;
        if (aaVar == null) {
            aaVar2 = aa.a;
        }
        ah ahVar = aaVar2.j;
        ah ahVar2 = ahVar;
        if (ahVar == null) {
            ahVar2 = ah.a;
        }
        int i = 500;
        int i2 = ahVar2.c ? (ahVar2.b & 2) != 0 ? ahVar2.d : 500 : 0;
        aa aaVar3 = e().b;
        aa aaVar4 = aaVar3;
        if (aaVar3 == null) {
            aaVar4 = aa.a;
        }
        ac acVar = aaVar4.k;
        ac acVar2 = acVar;
        if (acVar == null) {
            acVar2 = ac.a;
        }
        int i3 = acVar2.c ? (acVar2.b & 2) != 0 ? acVar2.d : 500 : 0;
        aa aaVar5 = e().b;
        aa aaVar6 = aaVar5;
        if (aaVar5 == null) {
            aaVar6 = aa.a;
        }
        af afVar = aaVar6.l;
        af afVar2 = afVar;
        if (afVar == null) {
            afVar2 = af.a;
        }
        int i4 = afVar2.c ? (afVar2.b & 2) != 0 ? afVar2.d : 500 : 0;
        aa aaVar7 = e().b;
        aa aaVar8 = aaVar7;
        if (aaVar7 == null) {
            aaVar8 = aa.a;
        }
        ag agVar = aaVar8.m;
        ag agVar2 = agVar;
        if (agVar == null) {
            agVar2 = ag.a;
        }
        if (!agVar2.c) {
            i = 0;
        } else if ((agVar2.b & 2) != 0) {
            i = agVar2.d;
        }
        com.google.android.libraries.search.assistant.aq.q.n nVar = new com.google.android.libraries.search.assistant.aq.q.n();
        nVar.n(0);
        nVar.a(0);
        nVar.l(0);
        nVar.m(0);
        nVar.j(0);
        nVar.k(0);
        nVar.d(0);
        nVar.b(0);
        nVar.e(0);
        nVar.c(0);
        nVar.f(0);
        nVar.g(0);
        nVar.h(0);
        nVar.i(0);
        nVar.n(i2);
        nVar.a(i3);
        nVar.l(i4);
        nVar.m(i);
        nVar.j(X(ae.b));
        nVar.k(X(ae.c));
        nVar.d(X(ae.d));
        nVar.b(X(ae.e));
        nVar.e(X(ae.f));
        nVar.c(X(ae.g));
        nVar.f(X(ae.h));
        nVar.g(X(ae.i));
        nVar.h(X(ae.j));
        nVar.i(X(ae.k));
        if (nVar.o == 16383) {
            return new o(nVar.a, nVar.b, nVar.c, nVar.d, nVar.e, nVar.f, nVar.g, nVar.h, nVar.i, nVar.j, nVar.k, nVar.l, nVar.m, nVar.n);
        }
        StringBuilder sb = new StringBuilder();
        if ((nVar.o & 1) == 0) {
            sb.append(" vipContactMaxCount");
        }
        if ((nVar.o & 2) == 0) {
            sb.append(" emailContactMaxCount");
        }
        if ((nVar.o & 4) == 0) {
            sb.append(" mediaArtistMaxCount");
        }
        if ((nVar.o & 8) == 0) {
            sb.append(" mediaNonArtistMaxCount");
        }
        if ((nVar.o & 16) == 0) {
            sb.append(" homeAutomationRoomMaxCount");
        }
        if ((nVar.o & 32) == 0) {
            sb.append(" homeAutomationStructureMaxCount");
        }
        if ((nVar.o & 64) == 0) {
            sb.append(" homeAutomationItemWithFunctionOnOffMaxCount");
        }
        if ((nVar.o & 128) == 0) {
            sb.append(" homeAutomationItemWithFunctionBrightnessMaxCount");
        }
        if ((nVar.o & 256) == 0) {
            sb.append(" homeAutomationItemWithFunctionTemperatureSettingMaxCount");
        }
        if ((nVar.o & 512) == 0) {
            sb.append(" homeAutomationItemWithFunctionColorSettingMaxCount");
        }
        if ((nVar.o & 1024) == 0) {
            sb.append(" homeAutomationItemWithTraitAssistantMaxCount");
        }
        if ((nVar.o & 2048) == 0) {
            sb.append(" homeAutomationItemWithTraitCastMaxCount");
        }
        if ((nVar.o & 4096) == 0) {
            sb.append(" homeAutomationItemWithTraitCommunicationCallMaxCount");
        }
        if ((nVar.o & 8192) == 0) {
            sb.append(" homeAutomationItemWithTraitCommunicationVideocallMaxCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "AndroidBiasingResources";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 7;
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final fl o() {
        return this.Q;
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha q() {
        return this.O;
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha r() {
        return (ha) this.j.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha s() {
        return this.P;
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha t() {
        return this.R;
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha u() {
        gy gyVar = new gy();
        ni niVar = J;
        int i = niVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            Iterator it = this.B.a("com.google.android.apps.docs", (String) niVar.get(i2)).b.iterator();
            while (it.hasNext()) {
                com.google.g.am.b.a.f fVar = ((com.google.g.am.b.a.h) it.next()).c;
                com.google.g.am.b.a.f fVar2 = fVar;
                if (fVar == null) {
                    fVar2 = com.google.g.am.b.a.f.a;
                }
                gyVar.h(fVar2.d);
            }
        }
        return gyVar.g();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha v() {
        gy gyVar = new gy();
        Iterator it = this.B.a("com.google.android.keep", "schema.org/NoteDigitalDocument").b.iterator();
        while (it.hasNext()) {
            com.google.g.am.b.a.f fVar = ((com.google.g.am.b.a.h) it.next()).c;
            com.google.g.am.b.a.f fVar2 = fVar;
            if (fVar == null) {
                fVar2 = com.google.g.am.b.a.f.a;
            }
            gyVar.h(fVar2.d);
        }
        return gyVar.g();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha w() {
        return (ha) this.i.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha x() {
        return (ha) this.k.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha y() {
        return (ha) this.l.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.d.a.an
    public final ha z() {
        return (ha) this.h.get();
    }
}
