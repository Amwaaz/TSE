package com.google.android.apps.gsa.binaries.velvet.app;

import android.accounts.AccountManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import androidx.d.bk;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ad;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.az;
import com.google.android.apps.search.assistant.platform.pcp.j.as;
import com.google.android.apps.search.assistant.platform.pcp.j.bc;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.an;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.ap;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.d.s;
import com.google.android.apps.search.assistant.surfaces.voice.l.d.b.a;
import com.google.android.apps.search.assistant.surfaces.voice.l.d.b.b;
import com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.ui.bj;
import com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.z;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.data.attachments.bz;
import com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.af;
import com.google.android.apps.search.assistant.verticals.a.h.g;
import com.google.android.apps.search.assistant.verticals.ambient.j.o;
import com.google.android.apps.search.assistant.verticals.ambient.p.b.a.am;
import com.google.android.apps.search.assistant.verticals.ambient.p.b.a.x;
import com.google.android.apps.search.assistant.verticals.ambient.s.h.ae;
import com.google.android.apps.search.assistant.verticals.b.k;
import com.google.android.apps.search.googleapp.contentcreator.m.c;
import com.google.android.apps.search.googleapp.contentcreator.m.e;
import com.google.android.apps.search.googleapp.contentcreator.storage.AppDatabase;
import com.google.android.apps.search.googleapp.contentcreator.storage.bg;
import com.google.android.apps.search.googleapp.contentcreator.storage.bp;
import com.google.android.apps.search.googleapp.contentcreator.storage.bx;
import com.google.android.apps.search.googleapp.contentcreator.storage.cd;
import com.google.android.apps.search.googleapp.launcher.c.j.d;
import com.google.android.apps.search.googleapp.notifications.settings.a.l;
import com.google.android.apps.search.googleapp.promomanager.a.a.ab;
import com.google.android.apps.search.googleapp.promomanager.a.a.aj;
import com.google.android.apps.search.googleapp.searchwidget.ah;
import com.google.android.apps.search.podcasts.b.g.u;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.q;
import com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.datastore.MediaProfileDatabase;
import com.google.android.libraries.assistant.pcp.b.a.aa;
import com.google.android.libraries.assistant.pcp.b.a.ao;
import com.google.android.libraries.assistant.pcp.b.a.aq;
import com.google.android.libraries.assistant.pcp.b.a.ar;
import com.google.android.libraries.assistant.pcp.d.a.w;
import com.google.android.libraries.assistant.pcp.datastore.b.d.j;
import com.google.android.libraries.assistant.pcp.datastore.room.ContentDatabase;
import com.google.android.libraries.assistant.pcp.r.b.i;
import com.google.android.libraries.assistant.q.ak;
import com.google.android.libraries.search.a.b.t;
import com.google.android.libraries.search.ah.i.b.Cdo;
import com.google.android.libraries.search.assistant.appactions.d.r;
import com.google.android.libraries.search.assistant.aq.h.b.v;
import com.google.android.libraries.search.assistant.az.c.ax;
import com.google.android.libraries.search.assistant.n.a.b.bw;
import com.google.android.libraries.search.assistant.n.a.b.fo;
import com.google.android.libraries.search.assistant.proactive.bl;
import com.google.android.libraries.search.l.b.f;
import com.google.android.libraries.search.l.p;
import com.google.android.libraries.search.location.compliance.be;
import com.google.android.libraries.search.t.c.ai;
import com.google.android.libraries.search.t.e.m;
import com.google.android.libraries.storage.protostore.cg;
import com.google.android.libraries.web.contrib.h.a.n;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.phenotype.cw;
import com.google.apps.tiktok.experiments.phenotype.dk;
import com.google.apps.tiktok.g.ay;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.dm;
import com.google.aw.g.a.a.al;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nn;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.speech.g.bn;
import e.c.h;
import h.a.a.d.b.a.y;
import j$.time.Duration;
import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlinx.coroutines.ag;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/jd.class */
public final class jd implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f312a;
    public final ik b;
    private final int c;
    private final int d;

    public jd(jo joVar, ik ikVar, int i, int i2) {
        this.d = i2;
        this.f312a = joVar;
        this.b = ikVar;
        this.c = i;
    }

    private final Object b() {
        je jeVar;
        h hVar;
        h hVar2;
        h hVar3;
        je jeVar2;
        je jeVar3;
        jj jjVar;
        h hVar4;
        jj jjVar2;
        h hVar5;
        jj jjVar3;
        h hVar6;
        je jeVar4;
        jx jxVar;
        jx jxVar2;
        je jeVar5;
        je jeVar6;
        je jeVar7;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        iz izVar;
        h hVar12;
        je jeVar8;
        jx jxVar3;
        jr jrVar;
        h hVar13;
        h hVar14;
        je jeVar9;
        je jeVar10;
        je jeVar11;
        je jeVar12;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        jj jjVar4;
        jx jxVar4;
        je jeVar13;
        h hVar19;
        je jeVar14;
        h hVar20;
        h hVar21;
        je jeVar15;
        je jeVar16;
        je jeVar17;
        h hVar22;
        h hVar23;
        je jeVar18;
        je jeVar19;
        je jeVar20;
        jr jrVar2;
        jr jrVar3;
        je jeVar21;
        je jeVar22;
        h hVar24;
        je jeVar23;
        je jeVar24;
        je jeVar25;
        je jeVar26;
        je jeVar27;
        je jeVar28;
        je jeVar29;
        je jeVar30;
        je jeVar31;
        jx jxVar5;
        h hVar25;
        h hVar26;
        h hVar27;
        h hVar28;
        jx jxVar6;
        je jeVar32;
        h hVar29;
        jr jrVar4;
        jx jxVar7;
        je jeVar33;
        je jeVar34;
        h hVar30;
        h hVar31;
        h hVar32;
        jr jrVar5;
        h hVar33;
        h hVar34;
        je jeVar35;
        je jeVar36;
        h hVar35;
        h hVar36;
        je jeVar37;
        je jeVar38;
        h hVar37;
        h hVar38;
        h hVar39;
        h hVar40;
        je jeVar39;
        je jeVar40;
        je jeVar41;
        je jeVar42;
        h hVar41;
        h hVar42;
        je jeVar43;
        je jeVar44;
        h hVar43;
        h hVar44;
        h hVar45;
        jr jrVar6;
        h hVar46;
        jj jjVar5;
        je jeVar45;
        je jeVar46;
        je jeVar47;
        je jeVar48;
        je jeVar49;
        jj jjVar6;
        je jeVar50;
        jx jxVar8;
        h hVar47;
        jj jjVar7;
        je jeVar51;
        h hVar48;
        je jeVar52;
        h hVar49;
        h hVar50;
        h hVar51;
        je jeVar53;
        je jeVar54;
        h hVar52;
        h hVar53;
        iz izVar2;
        h hVar54;
        h hVar55;
        h hVar56;
        je jeVar55;
        je jeVar56;
        je jeVar57;
        je jeVar58;
        je jeVar59;
        h hVar57;
        h hVar58;
        h hVar59;
        h hVar60;
        je jeVar60;
        je jeVar61;
        je jeVar62;
        je jeVar63;
        je jeVar64;
        jj jjVar8;
        h hVar61;
        je jeVar65;
        h hVar62;
        h hVar63;
        h hVar64;
        je jeVar66;
        h hVar65;
        jj jjVar9;
        h hVar66;
        je jeVar67;
        h hVar67;
        h hVar68;
        h hVar69;
        je jeVar68;
        h hVar70;
        h hVar71;
        h hVar72;
        je jeVar69;
        h hVar73;
        h hVar74;
        h hVar75;
        je jeVar70;
        jy jyVar;
        jj jjVar10;
        h hVar76;
        jy jyVar2;
        je jeVar71;
        h hVar77;
        je jeVar72;
        h hVar78;
        h hVar79;
        h hVar80;
        h hVar81;
        je jeVar73;
        h hVar82;
        je jeVar74;
        je jeVar75;
        je jeVar76;
        jj jjVar11;
        h hVar83;
        jj jjVar12;
        h hVar84;
        jj jjVar13;
        je jeVar77;
        jj jjVar14;
        h hVar85;
        jj jjVar15;
        h hVar86;
        jj jjVar16;
        h hVar87;
        je jeVar78;
        jj jjVar17;
        je jeVar79;
        jj jjVar18;
        je jeVar80;
        jj jjVar19;
        h hVar88;
        je jeVar81;
        je jeVar82;
        je jeVar83;
        jj jjVar20;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        je jeVar84;
        je jeVar85;
        jr jrVar7;
        je jeVar86;
        je jeVar87;
        jj jjVar21;
        h hVar93;
        je jeVar88;
        jj jjVar22;
        je jeVar89;
        je jeVar90;
        je jeVar91;
        je jeVar92;
        je jeVar93;
        h hVar94;
        je jeVar94;
        je jeVar95;
        jr jrVar8;
        jr jrVar9;
        je jeVar96;
        h hVar95;
        h hVar96;
        h hVar97;
        jj jjVar23;
        h hVar98;
        je jeVar97;
        je jeVar98;
        je jeVar99;
        jj jjVar24;
        jj jjVar25;
        jj jjVar26;
        h hVar99;
        je jeVar100;
        jj jjVar27;
        jr jrVar10;
        jj jjVar28;
        h hVar100;
        h hVar101;
        je jeVar101;
        h hVar102;
        je jeVar102;
        jj jjVar29;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        jj jjVar30;
        h hVar107;
        h hVar108;
        je jeVar103;
        je jeVar104;
        jj jjVar31;
        je jeVar105;
        h hVar109;
        je jeVar106;
        jj jjVar32;
        je jeVar107;
        je jeVar108;
        je jeVar109;
        int i = this.c;
        switch (i) {
            case 0:
                jeVar = this.b.c;
                return a.b(je.eu(jeVar));
            case 1:
                hVar = this.f312a.g;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) hVar.a();
                hVar2 = this.f312a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar2.a();
                hVar3 = this.f312a.H;
                cq cqVar = (cq) hVar3.a();
                jo joVar = this.f312a;
                return b.d(aVar, extensionRegistryLite, cqVar, joVar.mx(), joVar.md(), b.c(), this.b.ye());
            case 2:
                jeVar2 = this.b.c;
                Object fk = jeVar2.fk();
                jeVar3 = this.b.c;
                return k.b(fk, jeVar3.fS());
            case 3:
                jjVar = this.b.f308a;
                hVar4 = jjVar.li;
                return com.google.android.apps.search.podcasts.n.h.e(hVar4);
            case 4:
                jjVar2 = this.b.f308a;
                hVar5 = jjVar2.lj;
                return com.google.android.apps.search.podcasts.n.h.f(hVar5);
            case 5:
                jjVar3 = this.b.f308a;
                hVar6 = jjVar3.lh;
                return com.google.android.apps.search.podcasts.n.h.g(hVar6);
            case 6:
                jeVar4 = this.b.c;
                com.google.android.apps.search.googleapp.launcher.c.j.b aJ = jeVar4.aJ();
                jxVar = this.f312a.c;
                boolean dK = jxVar.dK();
                jxVar2 = this.f312a.c;
                return d.c(aJ, dK, jxVar2.l());
            case 7:
                jeVar5 = this.b.c;
                return t.b(jeVar5.bz());
            case 8:
                jeVar6 = this.b.c;
                h dt = je.dt(jeVar6);
                jeVar7 = this.b.c;
                return g.c(dt, jeVar7.gY());
            case 9:
                hVar7 = this.b.P;
                p pVar = (p) hVar7.a();
                hVar8 = this.b.be;
                r rVar = (r) hVar8.a();
                hVar9 = this.f312a.vU;
                f fVar = (f) hVar9.a();
                hVar10 = this.b.g;
                AccountId accountId = (AccountId) hVar10.a();
                hVar11 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar11.a();
                izVar = this.b.b;
                com.google.android.libraries.search.assistant.appactions.d.b.d cJ = izVar.cJ();
                hVar12 = this.f312a.v;
                return new com.google.android.apps.search.assistant.verticals.a.h.f(pVar, rVar, fVar, accountId, dVar, cJ, (Executor) hVar12.a());
            case 10:
                jeVar8 = this.b.c;
                h dS = je.dS(jeVar8);
                jo joVar2 = this.f312a;
                ae fZ = joVar2.fZ();
                jxVar3 = joVar2.c;
                return x.c(dS, fZ, jxVar3.o(), this.f312a.aca());
            case 11:
                ik ikVar = this.b;
                jo joVar3 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.p.b.a.t dI = ikVar.dI();
                jrVar = joVar3.b;
                com.google.android.apps.search.assistant.verticals.ambient.p.a.a.a S = jrVar.S();
                hVar13 = this.f312a.v;
                Executor executor = (Executor) hVar13.a();
                hVar14 = this.f312a.nM;
                return new am(dI, S, executor, (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar14.a(), this.f312a.acZ(), this.b.dV());
            case 12:
                jeVar9 = this.b.c;
                return e.c(jeVar9.aD());
            case 13:
                jeVar10 = this.b.c;
                com.google.android.apps.search.googleapp.contentcreator.m.h aE = jeVar10.aE();
                jeVar11 = this.b.c;
                return new c(aE, jeVar11.hW());
            case 14:
                jeVar12 = this.b.c;
                return com.google.android.libraries.assistant.pcp.b.b.c.b(je.dB(jeVar12), this.b.gT());
            case 15:
                ik ikVar2 = this.b;
                jo joVar4 = this.f312a;
                com.google.android.libraries.assistant.pcp.o.a.b gT = ikVar2.gT();
                j gS = ikVar2.gS();
                com.google.android.libraries.assistant.pcp.datastore.b.c.f io = joVar4.io();
                w gy = ikVar2.gy();
                com.google.android.libraries.assistant.pcp.d.a.x gz = ikVar2.gz();
                com.google.android.libraries.assistant.pcp.b.a.r gt = ikVar2.gt();
                hVar15 = ikVar2.cl;
                com.google.android.libraries.assistant.pcp.h.e eVar = (com.google.android.libraries.assistant.pcp.h.e) hVar15.a();
                hVar16 = this.f312a.we;
                i iVar = (i) hVar16.a();
                hVar17 = this.f312a.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar17.a();
                hVar18 = this.f312a.H;
                return new ao(gT, gS, io, gy, gz, gt, eVar, iVar, fVar2, (Executor) hVar18.a(), Optional.empty());
            case 16:
                jjVar4 = this.b.f308a;
                com.google.android.apps.search.googleapp.notifications.settings.a.j cy = jjVar4.cy();
                jxVar4 = this.f312a.c;
                return l.c(cy, jxVar4.aD());
            case 17:
                jeVar13 = this.b.c;
                h dC = je.dC(jeVar13);
                ik ikVar3 = this.b;
                jo joVar5 = this.f312a;
                com.google.android.libraries.assistant.pcp.o.a.b gT2 = ikVar3.gT();
                hVar19 = joVar5.we;
                return com.google.android.libraries.assistant.pcp.b.b.c.d(dC, gT2, (i) hVar19.a(), new Random(), this.f312a.aca());
            case 18:
                jeVar14 = this.b.c;
                Object fj = jeVar14.fj();
                hVar20 = this.f312a.H;
                Executor executor2 = (Executor) hVar20.a();
                hVar21 = this.f312a.we;
                return new aq((ar) fj, executor2, (i) hVar21.a());
            case 19:
                jeVar15 = this.b.c;
                return com.google.android.libraries.search.t.e.k.d(je.dJ(jeVar15));
            case 20:
                jeVar16 = this.b.c;
                ai lo = jeVar16.lo();
                jeVar17 = this.b.c;
                Set fN = jeVar17.fN();
                hVar22 = this.f312a.bo;
                ag agVar = (ag) hVar22.a();
                hVar23 = this.b.F;
                return new m(lo, fN, agVar, (com.google.android.libraries.search.t.e.j) hVar23.a());
            case 21:
                jeVar18 = this.b.c;
                boolean jt = jeVar18.jt();
                jeVar19 = this.b.c;
                boolean kv = jeVar19.kv();
                jeVar20 = this.b.c;
                boolean kT = jeVar20.kT();
                jrVar2 = this.f312a.b;
                boolean gx = jrVar2.gx();
                jrVar3 = this.f312a.b;
                com.google.protobuf.ao bf = jrVar3.bf();
                jeVar21 = this.b.c;
                boolean lg = jeVar21.lg();
                jeVar22 = this.b.c;
                return com.google.android.apps.search.omnient.onboarding.b.a.b(jt, kv, kT, gx, bf, lg, jeVar22.cj());
            case 22:
                ik ikVar4 = this.b;
                jo joVar6 = this.f312a;
                com.google.apps.tiktok.q.b.h c = com.google.android.libraries.search.lens.d.b.k.c();
                com.google.apps.tiktok.account.d.b.f kf = ikVar4.kf();
                hVar24 = joVar6.w;
                return com.google.android.libraries.search.lens.d.b.k.b(c, kf, (com.google.android.libraries.storage.a.j) hVar24.a());
            case 23:
                jeVar23 = this.b.c;
                return n.c((lt) je.dG(jeVar23).a(), Optional.empty(), Optional.empty(), Optional.empty());
            case 24:
                return new lt(this);
            case 25:
                jeVar24 = this.b.c;
                com.google.android.apps.search.omnient.f.b bk = jeVar24.bk();
                jeVar25 = this.b.c;
                boolean lj = jeVar25.lj();
                jeVar26 = this.b.c;
                boolean fT = jeVar26.fT();
                jeVar27 = this.b.c;
                com.google.protobuf.ao cS = jeVar27.cS();
                jeVar28 = this.b.c;
                return com.google.android.apps.search.omnient.f.d.b(bk, lj, fT, cS, jeVar28.gc(), this.f312a.gY());
            case 26:
                jeVar29 = this.b.c;
                com.google.protobuf.ao cW = jeVar29.cW();
                jeVar30 = this.b.c;
                return com.google.android.apps.search.googleapp.t.m.d(cW, je.dM(jeVar30));
            case 27:
                return new com.google.android.apps.search.googleapp.t.b(this.b.eN());
            case 28:
                jeVar31 = this.b.c;
                h dN = je.dN(jeVar31);
                jxVar5 = this.f312a.c;
                return com.google.android.apps.search.assistant.verticals.ambient.j.m.b(dN, jxVar5.fC(), this.f312a.fZ());
            case 29:
                ik ikVar5 = this.b;
                jo joVar7 = this.f312a;
                com.google.android.apps.search.assistant.platform.pcp.api.l H = ikVar5.H();
                com.google.android.apps.search.assistant.verticals.ambient.j.i dy = ikVar5.dy();
                hVar25 = joVar7.v;
                Executor executor3 = (Executor) hVar25.a();
                hVar26 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar26.a();
                hVar27 = this.f312a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar2 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar27.a();
                hVar28 = this.b.J;
                com.google.android.libraries.search.t.a.a aVar3 = (com.google.android.libraries.search.t.a.a) hVar28.a();
                jxVar6 = this.f312a.c;
                return new o(H, dy, executor3, aVar2, rVar2, aVar3, jxVar6.fC());
            case 30:
                jeVar32 = this.b.c;
                h dQ = je.dQ(jeVar32);
                jo joVar8 = this.f312a;
                ae fZ2 = joVar8.fZ();
                hVar29 = joVar8.op;
                Boolean bool = (Boolean) hVar29.a();
                jrVar4 = this.f312a.b;
                Boolean bool2 = (Boolean) jr.dk(jrVar4).a();
                jxVar7 = this.f312a.c;
                return com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.w.b(dQ, fZ2, bool, bool2, Long.valueOf(jxVar7.r()));
            case 31:
                ik ikVar6 = this.b;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.o M = ikVar6.M();
                jeVar33 = ikVar6.c;
                az Z = jeVar33.Z();
                jeVar34 = this.b.c;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.a Y = jeVar34.Y();
                ik ikVar7 = this.b;
                jo joVar9 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.s.h.t dV = ikVar7.dV();
                hVar30 = joVar9.v;
                Executor executor4 = (Executor) hVar30.a();
                hVar31 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar4 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar31.a();
                jo joVar10 = this.f312a;
                hVar32 = joVar10.op;
                jrVar5 = joVar10.b;
                h dk = jr.dk(jrVar5);
                hVar33 = this.b.ct;
                com.google.android.apps.search.assistant.verticals.ambient.q.a.l lVar = (com.google.android.apps.search.assistant.verticals.ambient.q.a.l) hVar33.a();
                hVar34 = this.f312a.ez;
                return new ad(M, Z, Y, dV, executor4, aVar4, hVar32, dk, lVar, (com.google.common.v.f) hVar34.a());
            case 32:
                jeVar35 = this.b.c;
                h dR = je.dR(jeVar35);
                jeVar36 = this.b.c;
                return com.google.android.libraries.assistant.auto.tng.media.mediabrowser.d.b.b(dR, Long.valueOf(jeVar36.m()));
            case 33:
                hVar35 = this.f312a.f;
                Context context = (Context) hVar35.a();
                hVar36 = this.f312a.h;
                PackageManager packageManager = (PackageManager) hVar36.a();
                jeVar37 = this.b.c;
                return new q(context, packageManager, je.en(jeVar37));
            case 34:
                return Boolean.valueOf(h.a.a.b.b.a.c.b(this.b.yw()));
            case 35:
                jeVar38 = this.b.c;
                return com.google.android.libraries.assistant.pcp.b.b.c.i(je.dw(jeVar38), this.b.gT());
            case 36:
                hVar37 = this.b.cs;
                com.google.android.libraries.assistant.pcp.p.a.d dVar2 = (com.google.android.libraries.assistant.pcp.p.a.d) hVar37.a();
                ik ikVar8 = this.b;
                jo joVar11 = this.f312a;
                j gS2 = ikVar8.gS();
                com.google.android.libraries.assistant.pcp.b.a.r gt2 = ikVar8.gt();
                com.google.android.libraries.assistant.pcp.d.a.x gz2 = ikVar8.gz();
                hVar38 = joVar11.we;
                i iVar2 = (i) hVar38.a();
                ik ikVar9 = this.b;
                jo joVar12 = this.f312a;
                com.google.android.libraries.assistant.pcp.o.a.b gT3 = ikVar9.gT();
                hVar39 = joVar12.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar39.a();
                hVar40 = this.f312a.H;
                return new aa(dVar2, gS2, gt2, gz2, iVar2, gT3, fVar3, (Executor) hVar40.a(), Optional.empty());
            case 37:
                jeVar39 = this.b.c;
                h dV2 = je.dV(jeVar39);
                jeVar40 = this.b.c;
                long s = jeVar40.s();
                jeVar41 = this.b.c;
                return com.google.android.apps.search.googleapp.promomanager.e.a.b(dV2, s, jeVar41.gj());
            case 38:
                jeVar42 = this.b.c;
                return new com.google.android.apps.search.googleapp.promomanager.e.b(jeVar42.aM());
            case 39:
                ik ikVar10 = this.b;
                jo joVar13 = this.f312a;
                com.google.apps.tiktok.q.b.h b = com.google.android.libraries.search.ab.a.c.b();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar10.kf();
                hVar41 = joVar13.w;
                return com.google.android.libraries.search.ab.a.c.c(b, kf2, (com.google.android.libraries.storage.a.j) hVar41.a());
            case 40:
                hVar42 = this.b.X;
                return com.google.android.apps.search.googleapp.promomanager.c.g.b((com.google.apps.tiktok.p.b.c) hVar42.a());
            case 41:
                jeVar43 = this.b.c;
                h eH = je.eH(jeVar43);
                jeVar44 = this.b.c;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.g.b(eH, jeVar44.gL());
            case 42:
                hVar43 = this.f312a.Q;
                ag agVar2 = (ag) hVar43.a();
                hVar44 = this.f312a.f;
                Context context2 = (Context) hVar44.a();
                hVar45 = this.f312a.gd;
                com.google.android.libraries.search.account.b.b bVar = (com.google.android.libraries.search.account.b.b) hVar45.a();
                jrVar6 = this.f312a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar2 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar6).a();
                hVar46 = this.f312a.Y;
                String str = (String) hVar46.a();
                jjVar5 = this.b.f308a;
                s ap = jjVar5.ap();
                jeVar45 = this.b.c;
                boolean gn = jeVar45.gn();
                jeVar46 = this.b.c;
                boolean gr = jeVar46.gr();
                jeVar47 = this.b.c;
                boolean gA = jeVar47.gA();
                jeVar48 = this.b.c;
                boolean gF = jeVar48.gF();
                jeVar49 = this.b.c;
                boolean gI = jeVar49.gI();
                jo joVar14 = this.f312a;
                ik ikVar11 = this.b;
                boolean acQ = joVar14.acQ();
                jjVar6 = ikVar11.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.d(agVar2, context2, bVar, pVar2, str, ap, gn, gr, gA, gF, gI, acQ, jjVar6.mP());
            case 43:
                jeVar50 = this.b.c;
                h eM = je.eM(jeVar50);
                jxVar8 = this.f312a.c;
                return com.google.android.apps.search.googleapp.searchwidget.b.f(eM, jxVar8.aH());
            case 44:
                hVar47 = this.f312a.f;
                Context context3 = (Context) hVar47.a();
                jo joVar15 = this.f312a;
                ik ikVar12 = this.b;
                ah gH = joVar15.gH();
                com.google.android.libraries.search.j.a.p kY = joVar15.kY();
                jjVar7 = ikVar12.f308a;
                com.google.android.apps.search.googleapp.searchwidget.f.c dc = jjVar7.dc();
                jo joVar16 = this.f312a;
                ik ikVar13 = this.b;
                com.google.android.libraries.search.j.i kW = joVar16.kW();
                com.google.android.libraries.search.j.n kX = joVar16.kX();
                com.google.android.libraries.search.aq.b.d lU = joVar16.lU();
                jeVar51 = ikVar13.c;
                return new com.google.android.apps.search.googleapp.searchwidget.c(context3, gH, kY, dc, kW, kX, lU, jeVar51.bh());
            case 45:
                hVar48 = this.f312a.bo;
                ag agVar3 = (ag) hVar48.a();
                jo joVar17 = this.f312a;
                ik ikVar14 = this.b;
                com.google.android.apps.search.googleapp.searchwidget.j.b gV = joVar17.gV();
                jeVar52 = ikVar14.c;
                com.google.android.apps.search.googleapp.searchwidget.j.q lu = jeVar52.lu();
                hVar49 = this.f312a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar3 = (com.google.apps.tiktok.contrib.work.b.p) hVar49.a();
                jo joVar18 = this.f312a;
                com.google.android.apps.search.googleapp.searchwidget.b.r gL = joVar18.gL();
                com.google.protobuf.ao oq = joVar18.oq();
                hVar50 = joVar18.ez;
                com.google.common.v.f fVar4 = (com.google.common.v.f) hVar50.a();
                hVar51 = this.f312a.L;
                return new com.google.android.apps.search.googleapp.searchwidget.j.k(agVar3, gV, lu, pVar3, gL, oq, fVar4, (com.google.apps.tiktok.concurrent.k) hVar51.a());
            case 46:
                return new jb(this, 0);
            case 47:
                jeVar53 = this.b.c;
                h eN = je.eN(jeVar53);
                jeVar54 = this.b.c;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ab.b.d.b(eN, jeVar54.gZ());
            case 48:
                hVar52 = this.f312a.bo;
                ag agVar4 = (ag) hVar52.a();
                hVar53 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar53.a();
                izVar2 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ab.a.d ch = izVar2.ch();
                hVar54 = this.b.aO;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) hVar54.a();
                hVar55 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar2 = (com.google.apps.tiktok.account.data.b) hVar55.a();
                hVar56 = this.b.g;
                AccountId accountId2 = (AccountId) hVar56.a();
                jeVar55 = this.b.c;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ab.b.b(agVar4, auVar, ch, kVar, bVar2, accountId2, jeVar55.gT());
            case 49:
                jeVar56 = this.b.c;
                h eU = je.eU(jeVar56);
                jeVar57 = this.b.c;
                return ax.b(eU, jeVar57.hi());
            case 50:
                jeVar58 = this.b.c;
                com.google.android.libraries.search.assistant.az.c.az ch2 = jeVar58.ch();
                jeVar59 = this.b.c;
                com.google.android.libraries.search.assistant.az.c.d dVar3 = (com.google.android.libraries.search.assistant.az.c.d) je.dx(jeVar59).a();
                hVar57 = this.f312a.H;
                Executor executor5 = (Executor) hVar57.a();
                hVar58 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar58.a();
                hVar59 = this.b.g;
                return new com.google.android.libraries.search.assistant.az.c.aw(ch2, dVar3, executor5, dVar4, (AccountId) hVar59.a());
            case 51:
                hVar60 = this.f312a.v;
                cr crVar = (cr) hVar60.a();
                ik ikVar15 = this.b;
                v iJ = ikVar15.iJ();
                jeVar60 = ikVar15.c;
                com.google.android.libraries.search.assistant.az.c.az ch3 = jeVar60.ch();
                jeVar61 = this.b.c;
                Boolean valueOf = Boolean.valueOf(jeVar61.hc());
                jeVar62 = this.b.c;
                return new com.google.android.libraries.search.assistant.az.c.d(crVar, iJ, ch3, valueOf, jeVar62.cZ());
            case 52:
                jeVar63 = this.b.c;
                h eV = je.eV(jeVar63);
                jeVar64 = this.b.c;
                return com.google.android.apps.search.googleapp.compliance.a.a.a.d(eV, jeVar64.hm());
            case 53:
                jjVar8 = this.b.f308a;
                com.google.android.apps.search.googleapp.compliance.a.a.i bx = jjVar8.bx();
                hVar61 = this.b.g;
                return new com.google.android.apps.search.googleapp.compliance.a.a.l(bx, (AccountId) hVar61.a());
            case 54:
                jeVar65 = this.b.c;
                return com.google.android.apps.search.googleapp.contentcreator.mediapicker.licensedmedia.d.c(je.ev(jeVar65));
            case 55:
                hVar62 = this.f312a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar62.a();
                hVar63 = this.f312a.lj;
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) hVar63.a();
                hVar64 = this.f312a.H;
                cq cqVar2 = (cq) hVar64.a();
                jo joVar19 = this.f312a;
                return com.google.android.apps.search.googleapp.contentcreator.mediapicker.licensedmedia.d.d(aVar5, extensionRegistryLite2, cqVar2, joVar19.mx(), joVar19.md(), com.google.android.apps.search.googleapp.contentcreator.mediapicker.licensedmedia.d.b(), this.b.ye());
            case 56:
                jeVar66 = this.b.c;
                return com.google.apps.tiktok.cache.x.c(je.dT(jeVar66));
            case 57:
                ik ikVar16 = this.b;
                jo joVar20 = this.f312a;
                Map lr = je.lr();
                com.google.apps.tiktok.account.d.f kd = ikVar16.kd();
                hVar65 = joVar20.v;
                return new com.google.apps.tiktok.cache.s(lr, kd, (cq) hVar65.a());
            case 58:
                jjVar9 = this.b.f308a;
                hVar66 = jjVar9.jv;
                return com.google.android.apps.search.googleapp.saves.b.a.a.e(hVar66);
            case 59:
                jeVar67 = this.b.c;
                return com.google.android.apps.search.googleapp.search.searchcatalog.a.c.c(je.ew(jeVar67));
            case 60:
                hVar67 = this.f312a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar67.a();
                hVar68 = this.f312a.lj;
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) hVar68.a();
                hVar69 = this.f312a.H;
                cq cqVar3 = (cq) hVar69.a();
                jo joVar21 = this.f312a;
                return com.google.android.apps.search.googleapp.search.searchcatalog.a.c.d(aVar6, extensionRegistryLite3, cqVar3, joVar21.mx(), joVar21.md(), com.google.android.apps.search.googleapp.search.searchcatalog.a.c.b(), this.b.ye());
            case 61:
                jeVar68 = this.b.c;
                return com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.a.d(je.ex(jeVar68));
            case 62:
                hVar70 = this.f312a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar70.a();
                hVar71 = this.f312a.lj;
                ExtensionRegistryLite extensionRegistryLite4 = (ExtensionRegistryLite) hVar71.a();
                hVar72 = this.f312a.H;
                cq cqVar4 = (cq) hVar72.a();
                jo joVar22 = this.f312a;
                return com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.a.g(aVar7, extensionRegistryLite4, cqVar4, joVar22.mx(), joVar22.md(), com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.a.b(), this.b.ye());
            case 63:
                jeVar69 = this.b.c;
                return com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.a.e(je.ey(jeVar69));
            case 64:
                hVar73 = this.f312a.g;
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) hVar73.a();
                hVar74 = this.f312a.lj;
                ExtensionRegistryLite extensionRegistryLite5 = (ExtensionRegistryLite) hVar74.a();
                hVar75 = this.f312a.H;
                cq cqVar5 = (cq) hVar75.a();
                jo joVar23 = this.f312a;
                return com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.a.f(aVar8, extensionRegistryLite5, cqVar5, joVar23.mx(), joVar23.md(), com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.a.c(), this.b.ye());
            case 65:
                jeVar70 = this.b.c;
                return ha.o(jeVar70.fQ());
            case 66:
                return Boolean.valueOf(h.a.a.b.b.a.f.b(this.b.pS()));
            case 67:
                jyVar = this.f312a.f319a;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.s sVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.s) jy.kN(jyVar).a();
                jjVar10 = this.b.f308a;
                hVar76 = jjVar10.q;
                com.google.android.libraries.assistant.auto.tng.assistant.a.a.a aVar9 = (com.google.android.libraries.assistant.auto.tng.assistant.a.a.a) hVar76.a();
                jyVar2 = this.f312a.f319a;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n nVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n) jy.fF(jyVar2).a();
                jeVar71 = this.b.c;
                com.google.android.libraries.assistant.auto.jumpboost.o.a.e bt = jeVar71.bt();
                hVar77 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar77.a();
                jeVar72 = this.b.c;
                com.google.android.libraries.assistant.auto.tng.ui.voiceplate.g gVar2 = (com.google.android.libraries.assistant.auto.tng.ui.voiceplate.g) je.eX(jeVar72).a();
                hVar78 = this.f312a.H;
                Executor executor6 = (Executor) hVar78.a();
                hVar79 = this.f312a.Q;
                return new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.a.c(sVar, aVar9, nVar, bt, gVar, gVar2, executor6, (ag) hVar79.a());
            case 68:
                return new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.g();
            case 69:
                ik ikVar17 = this.b;
                jo joVar24 = this.f312a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.ad.c();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar17.kf();
                hVar80 = joVar24.w;
                return com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.ad.b(c2, kf3, (com.google.android.libraries.storage.a.j) hVar80.a());
            case 70:
                ik ikVar18 = this.b;
                jo joVar25 = this.f312a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.apps.search.googleapp.compliance.v.c();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar18.kf();
                hVar81 = joVar25.w;
                return com.google.android.apps.search.googleapp.compliance.v.b(c3, kf4, (com.google.android.libraries.storage.a.j) hVar81.a());
            case 71:
                jeVar73 = this.b.c;
                com.google.apps.tiktok.q.b.h cF = jeVar73.cF();
                ik ikVar19 = this.b;
                jo joVar26 = this.f312a;
                com.google.apps.tiktok.account.d.b.f kf5 = ikVar19.kf();
                hVar82 = joVar26.w;
                return com.google.android.apps.search.googleapp.search.suggest.b.b.k.b(cF, kf5, (com.google.android.libraries.storage.a.j) hVar82.a());
            case 72:
                return new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.o();
            case 73:
                jeVar74 = this.b.c;
                com.google.android.apps.search.googleapp.search.suggest.c.p pVar4 = (com.google.android.apps.search.googleapp.search.suggest.c.p) je.eR(jeVar74).a();
                jeVar75 = this.b.c;
                lt ltVar = (lt) je.dH(jeVar75).a();
                jeVar76 = this.b.c;
                Set fP = jeVar76.fP();
                jjVar11 = this.b.f308a;
                hVar83 = jjVar11.ap;
                com.google.android.libraries.search.ac.b.c.x xVar = (com.google.android.libraries.search.ac.b.c.x) hVar83.a();
                jjVar12 = this.b.f308a;
                hVar84 = jjVar12.ar;
                com.google.android.libraries.search.ac.b.c.i iVar3 = (com.google.android.libraries.search.ac.b.c.i) hVar84.a();
                jjVar13 = this.b.f308a;
                String mN = jjVar13.mN();
                jeVar77 = this.b.c;
                long x = jeVar77.x();
                jjVar14 = this.b.f308a;
                return com.google.android.apps.search.googleapp.search.suggest.c.m.c(pVar4, ltVar, fP, xVar, iVar3, mN, x, jjVar14.nu());
            case 74:
                hVar85 = this.f312a.g;
                com.google.android.libraries.g.a aVar10 = (com.google.android.libraries.g.a) hVar85.a();
                jjVar15 = this.b.f308a;
                hVar86 = jjVar15.am;
                com.google.android.apps.search.googleapp.search.suggest.f.c cVar = (com.google.android.apps.search.googleapp.search.suggest.f.c) hVar86.a();
                jjVar16 = this.b.f308a;
                hVar87 = jjVar16.an;
                com.google.android.apps.search.googleapp.search.suggest.c.g gVar3 = (com.google.android.apps.search.googleapp.search.suggest.c.g) hVar87.a();
                jeVar78 = this.b.c;
                Set fP2 = jeVar78.fP();
                jjVar17 = this.b.f308a;
                String mN2 = jjVar17.mN();
                jeVar79 = this.b.c;
                return new com.google.android.apps.search.googleapp.search.suggest.c.p(aVar10, cVar, gVar3, fP2, mN2, jeVar79.x());
            case 75:
                return new com.google.android.apps.search.googleapp.search.suggest.sources.a.b.e();
            case 76:
                return new com.google.android.libraries.search.ac.b.g.g.a();
            case 77:
                return new com.google.android.apps.search.googleapp.search.suggest.c.r();
            case 78:
                return new com.google.android.libraries.search.ac.b.c.e();
            case 79:
                return new com.google.android.apps.search.googleapp.search.suggest.c.c();
            case 80:
                return new lt(this);
            case 81:
                jjVar18 = this.b.f308a;
                boolean nu = jjVar18.nu();
                jeVar80 = this.b.c;
                com.google.android.apps.search.googleapp.search.suggest.c.l ba = jeVar80.ba();
                jjVar19 = this.b.f308a;
                hVar88 = jjVar19.aR;
                return com.google.android.apps.search.googleapp.search.suggest.c.m.b(nu, ba, (com.google.android.apps.search.googleapp.search.suggest.c.k) hVar88.a());
            case 82:
                jeVar81 = this.b.c;
                jeVar81.lx();
                jeVar82 = this.b.c;
                com.google.android.libraries.search.v.n lq = jeVar82.lq();
                jeVar83 = this.b.c;
                com.google.android.libraries.search.v.a.g ck = jeVar83.ck();
                jjVar20 = this.b.f308a;
                hVar89 = jjVar20.aF;
                com.google.android.apps.search.googleapp.d.f fVar5 = (com.google.android.apps.search.googleapp.d.f) hVar89.a();
                hVar90 = this.f312a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar90.a();
                hVar91 = this.f312a.H;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar91.a();
                hVar92 = this.f312a.Q;
                ag agVar5 = (ag) hVar92.a();
                jeVar84 = this.b.c;
                com.google.android.apps.search.googleapp.search.g.a aVar12 = (com.google.android.apps.search.googleapp.search.g.a) je.dL(jeVar84).a();
                jeVar85 = this.b.c;
                boolean booleanValue = ((Boolean) je.ed(jeVar85).a()).booleanValue();
                jrVar7 = this.f312a.b;
                ((Boolean) jr.dp(jrVar7).a()).booleanValue();
                jeVar86 = this.b.c;
                return new com.google.android.apps.search.googleapp.search.h.l(lq, ck, fVar5, aVar11, scheduledExecutorService, agVar5, aVar12, booleanValue, jeVar86.hI());
            case 83:
                jeVar87 = this.b.c;
                return Boolean.valueOf(h.a.a.r.b.a.m.b(jeVar87.lF()));
            case 84:
                jjVar21 = this.b.f308a;
                hVar93 = jjVar21.aJ;
                com.google.android.libraries.search.b.b bVar3 = (com.google.android.libraries.search.b.b) hVar93.a();
                jeVar88 = this.b.c;
                com.google.android.apps.search.googleapp.search.e.l lVar2 = (com.google.android.apps.search.googleapp.search.e.l) je.eI(jeVar88).a();
                jjVar22 = this.b.f308a;
                com.google.android.libraries.search.integrations.f.b.a eL = jjVar22.eL();
                jeVar89 = this.b.c;
                return new com.google.android.apps.search.googleapp.search.g.a(bVar3, lVar2, eL, (com.google.android.apps.search.googleapp.search.srp.o.c.a.e) je.dz(jeVar89).a());
            case 85:
                jeVar90 = this.b.c;
                com.google.android.apps.search.googleapp.search.e.o lH = jeVar90.lH();
                jeVar91 = this.b.c;
                com.google.android.libraries.web.contrib.c.c cz = jeVar91.cz();
                jeVar92 = this.b.c;
                com.google.android.apps.search.googleapp.search.e.n aQ = jeVar92.aQ();
                jeVar93 = this.b.c;
                com.google.android.apps.search.googleapp.search.e.o aR = jeVar93.aR();
                hVar94 = this.f312a.Q;
                return new com.google.android.apps.search.googleapp.search.e.l(lH, cz, aQ, aR, (ag) hVar94.a());
            case 86:
                jeVar94 = this.b.c;
                return new com.google.android.libraries.web.contrib.c.a.j((lt) je.dI(jeVar94).a());
            case 87:
                return new lt(this);
            case 88:
                jeVar95 = this.b.c;
                com.google.android.apps.search.googleapp.search.srp.n.a aX = jeVar95.aX();
                jrVar8 = this.f312a.b;
                boolean gL2 = jrVar8.gL();
                jrVar9 = this.f312a.b;
                boolean gM = jrVar9.gM();
                jeVar96 = this.b.c;
                com.google.android.apps.search.googleapp.search.srp.o.b.a.b aY = jeVar96.aY();
                hVar95 = this.f312a.H;
                cr crVar2 = (cr) hVar95.a();
                hVar96 = this.f312a.g;
                return new com.google.android.apps.search.googleapp.search.srp.o.c.a.e(aX, gL2, gM, aY, crVar2, (com.google.android.libraries.g.a) hVar96.a());
            case 89:
                return Boolean.valueOf(h.a.a.r.b.a.m.d(this.b.yC()));
            case 90:
                hVar97 = this.f312a.g;
                com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) hVar97.a();
                jjVar23 = this.b.f308a;
                hVar98 = jjVar23.aC;
                com.google.android.libraries.search.ap.b.b bVar4 = (com.google.android.libraries.search.ap.b.b) hVar98.a();
                jeVar97 = this.b.c;
                String str2 = (String) je.dX(jeVar97).a();
                jeVar98 = this.b.c;
                String str3 = (String) je.dY(jeVar98).a();
                jeVar99 = this.b.c;
                return new com.google.android.apps.search.googleapp.search.j.c(aVar13, bVar4, str2, str3, ((Boolean) je.ek(jeVar99).a()).booleanValue());
            case 91:
                jjVar24 = this.b.f308a;
                return h.a.a.r.b.a.m.f(jjVar24.sp());
            case 92:
                jjVar25 = this.b.f308a;
                return h.a.a.r.b.a.m.g(jjVar25.sp());
            case 93:
                jjVar26 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.m.h(jjVar26.sp()));
            case 94:
                return new jc(this, 0);
            case 95:
                hVar99 = this.f312a.f;
                Context context4 = (Context) hVar99.a();
                jeVar100 = this.b.c;
                String fr = jeVar100.fr();
                jjVar27 = this.b.f308a;
                String mQ = jjVar27.mQ();
                jrVar10 = this.f312a.b;
                String ff = jrVar10.ff();
                jjVar28 = this.b.f308a;
                hVar100 = jjVar28.aC;
                com.google.android.libraries.search.ap.b.b bVar5 = (com.google.android.libraries.search.ap.b.b) hVar100.a();
                jo joVar27 = this.f312a;
                Optional empty = Optional.empty();
                hVar101 = joVar27.bh;
                com.google.android.libraries.search.t.h.a aVar14 = (com.google.android.libraries.search.t.h.a) hVar101.a();
                jeVar101 = this.b.c;
                com.google.android.libraries.search.aj.d.b cq = jeVar101.cq();
                hVar102 = this.b.G;
                ai aiVar = (ai) hVar102.a();
                jeVar102 = this.b.c;
                return new com.google.android.apps.search.googleapp.search.srp.l.az(context4, fr, mQ, ff, bVar5, empty, aVar14, cq, aiVar, jeVar102.aV());
            case 96:
                jjVar29 = this.b.f308a;
                hVar103 = jjVar29.aC;
                return new com.google.android.libraries.search.ap.b.e((com.google.android.libraries.search.ap.b.b) hVar103.a());
            case 97:
                hVar104 = this.f312a.f;
                Context context5 = (Context) hVar104.a();
                hVar105 = this.b.g;
                AccountId accountId3 = (AccountId) hVar105.a();
                hVar106 = this.f312a.bh;
                com.google.android.libraries.search.t.h.a aVar15 = (com.google.android.libraries.search.t.h.a) hVar106.a();
                jjVar30 = this.b.f308a;
                com.google.android.apps.search.googleapp.y.a.b cr = jjVar30.cr();
                hVar107 = this.f312a.R;
                m.c.n nVar2 = (m.c.n) hVar107.a();
                hVar108 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar5 = (com.google.apps.tiktok.account.data.a.d) hVar108.a();
                jeVar103 = this.b.c;
                com.google.android.apps.search.googleapp.search.i.d aT = jeVar103.aT();
                ik ikVar20 = this.b;
                com.google.android.libraries.web.webview.a.x ka = ikVar20.ka();
                jeVar104 = ikVar20.c;
                com.google.android.libraries.web.g.a cA = jeVar104.cA();
                jjVar31 = this.b.f308a;
                com.google.android.apps.search.googleapp.compliance.a.a.i bx2 = jjVar31.bx();
                jeVar105 = this.b.c;
                List fI = jeVar105.fI();
                hVar109 = this.b.G;
                ai aiVar2 = (ai) hVar109.a();
                jeVar106 = this.b.c;
                boolean iJ2 = jeVar106.iJ();
                jjVar32 = this.b.f308a;
                com.google.android.libraries.search.aj.b.a.i fs = jjVar32.fs();
                jeVar107 = this.b.c;
                return new com.google.android.apps.search.googleapp.search.srp.l.p(context5, accountId3, aVar15, cr, nVar2, dVar5, aT, ka, cA, bx2, fI, aiVar2, iJ2, fs, jeVar107.iM());
            case 98:
                jeVar108 = this.b.c;
                return Boolean.valueOf(h.a.a.r.b.a.m.c(jeVar108.lF()));
            case 99:
                jeVar109 = this.b.c;
                return Boolean.valueOf(h.a.a.r.b.a.a.b.b(jeVar109.lJ()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.c;
        switch (i) {
            case 100:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45640797").b());
            case 101:
                return new z((ag) this.f312a.bo.a(), y.q(this.b.l), (com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.ag) this.b.c.aw.a(), Optional.of(new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.aa()));
            case 102:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.ag((cg) this.b.w.a(), this.b.c.fO(), (m.c.n) this.f312a.P.a());
            case 103:
                return new com.google.android.libraries.search.assistant.av.d.c.j(this.b.qg(), io.grpc.h.a);
            case 104:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.zerostate.b.b();
            case 105:
                this.b.hz();
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.f.a.a();
            case 106:
                return new com.google.android.libraries.elements.converters.i.a.e();
            case 107:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.a.a.b(this.b.c.bD(), (ag) this.f312a.Q.a());
            case 108:
                cr crVar = (cr) this.f312a.H.a();
                com.google.cj.i.f fVar = (com.google.cj.i.f) this.f312a.wr.a();
                jo joVar = this.f312a;
                ik ikVar = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.e(crVar, fVar, new lz(joVar, ikVar), (com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a.g) ikVar.c.aD.a());
            case 109:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a.g((Executor) this.f312a.H.a(), (com.google.android.libraries.search.d.aq) this.f312a.b.dt.a(), (com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a) this.b.c.aC.a(), (com.google.android.libraries.search.d.x.e.i) this.f312a.vf.a());
            case 110:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a((com.google.android.libraries.search.b.b) this.b.ba.a());
            case 111:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.a();
            case 112:
            case 115:
                return new com.google.android.apps.search.assistant.surfaces.voice.shared.c.k((ay) this.f312a.iu.a(), (ag) this.f312a.Q.a(), (cr) this.f312a.H.a());
            case 113:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.g((com.google.android.libraries.g.a) this.f312a.g.a(), (com.google.apps.tiktok.concurrent.ao) this.f312a.bz.a());
            case 114:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.e();
            case 116:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.input.e.a.a.c((ay) this.f312a.iu.a(), (ag) this.f312a.Q.a(), (Executor) this.f312a.H.a(), (com.google.android.apps.search.assistant.surfaces.voice.i.g.h.ae) this.b.c.aK.a());
            case 117:
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.h.ae(this.b.qg(), io.grpc.h.a);
            case 118:
                com.google.apps.tiktok.q.b.g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "InterpreterPreference";
                a2.c(com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.o.b.c.a);
                return this.b.kf().a(a2.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 119:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.d.a.a.a.e.a();
            case 120:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.j.b((com.google.android.libraries.g.a) this.f312a.g.a());
            case 121:
                return new af(this.b.c.az(), (ay) this.f312a.iu.a(), this.b.c.le());
            case 122:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.f(this.b.c.fJ(), (Executor) this.f312a.v.a(), (ay) this.f312a.iu.a(), this.b.b.cv());
            case 123:
                return this.b.c.ab().a(new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.a.a(com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.i.b, com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.j.d));
            case 124:
                com.google.android.libraries.search.assistant.aj.e.a.a aVar = (com.google.android.libraries.search.assistant.aj.e.a.a) this.b.f308a.t.a();
                iz izVar = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.a.n(aVar, (Optional) izVar.bB.a, (an) izVar.N.a(), this.f312a.b.eN().a(), (ag) this.f312a.Q.a());
            case 125:
                return this.b.c.ab().a(new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.a.a(com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.i.d, com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.j.d));
            case 126:
                return this.b.c.ac().a(new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.b.a(com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.i.b, com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.j.b));
            case 127:
                return this.b.c.ac().a(new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.b.a(com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.i.d, com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.j.b));
            case 128:
                return ((lt) this.b.c.aQ.a()).X(new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.c.a(com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.i.b, com.google.android.apps.search.assistant.surfaces.voice.ui.common.c.j.c));
            case 129:
                return new lt(this);
            case 130:
                com.google.apps.tiktok.q.b.g a3 = com.google.apps.tiktok.q.b.h.a();
                a3.f5883a = "SidePanelDisplayData";
                a3.c(com.google.android.apps.search.assistant.surfaces.voice.ui.response.g.f.a);
                return this.b.kf().a(a3.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 131:
                return new com.google.android.libraries.search.urlhandler.internal.a.a();
            case 132:
                return new com.google.android.libraries.lens.view.m.g((Context) this.f312a.f.a());
            case 133:
                return new com.google.android.libraries.web.webview.contrib.a.b.d((PackageManager) this.f312a.h.a(), (Context) this.f312a.f.a());
            case 134:
                return new ls();
            case 135:
                return new lt(this);
            case 136:
                return fu.m("places_model_version", new com.google.android.apps.search.assistant.verticals.ambient.r.d.a.b(h.a.a.f.a.a.x.V(this.f312a.b.f322a.V)));
            case 137:
                ik ikVar2 = this.b;
                jo joVar2 = this.f312a;
                je jeVar = ikVar2.c;
                com.google.aq.b.a.b cH = jeVar.cH();
                com.google.android.apps.search.assistant.verticals.family.custodio.b.b.e aA = jeVar.aA();
                com.google.common.v.f fVar2 = (com.google.common.v.f) joVar2.ez.a();
                ay ayVar = (ay) this.f312a.iu.a();
                com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) this.b.ba.a();
                String str = (String) this.f312a.Y.a();
                jo joVar3 = this.f312a;
                return new com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.p(cH, aA, fVar2, ayVar, bVar, str, joVar3.j(), (ScheduledExecutorService) joVar3.H.a(), ((com.google.apps.tiktok.experiments.e) this.b.c.mg().a.a()).a("com.google.android.apps.search.assistant.user 45362779").f());
            case 138:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "CustodioCacheDataStore";
                a4.c(com.google.android.apps.search.assistant.verticals.family.custodio.c.i.a);
                return this.b.kf().a(a4.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 139:
                return new com.google.android.apps.search.assistant.verticals.newsplayer.ui.a.aa((com.google.apps.tiktok.g.ax) this.f312a.iv.a(), (ay) this.f312a.iu.a());
            case 140:
                return new com.google.android.apps.search.assistant.verticals.newsplayer.ui.a.y();
            case 141:
                com.google.apps.tiktok.q.b.g a5 = com.google.apps.tiktok.q.b.h.a();
                a5.f5883a = "GoogleApp_AccountMenuDataStore";
                a5.c(com.google.android.apps.search.googleapp.accounts.ui.b.j.a);
                return this.b.kf().a(a5.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 142:
                com.google.apps.tiktok.q.b.g a6 = com.google.apps.tiktok.q.b.h.a();
                a6.f5883a = "GoogleApp_AccountMenu_DeleteHistoryDataStore";
                a6.c(com.google.android.libraries.search.u.b.a.a.a);
                return this.b.kf().a(a6.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 143:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.c((ag) this.f312a.Q.a(), (com.google.apps.tiktok.account.data.b) this.f312a.bN.a(), (AccountId) this.b.g.a());
            case 144:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.f((ag) this.f312a.Q.a(), (com.google.common.v.f) this.f312a.ez.a(), this.f312a.b.X());
            case 145:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.h((ag) this.f312a.Q.a(), this.b.c.aP());
            case 146:
                com.google.apps.tiktok.q.b.g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "SaveFeatureDataStore";
                a7.c(com.google.android.apps.search.googleapp.saves.savefeature.a.b.h.a);
                return this.b.kf().a(a7.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 147:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.n((ag) this.f312a.Q.a(), this.b.f308a.cm());
            case 148:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.m((com.google.android.libraries.search.t.h.a) this.f312a.bh.a());
            case 149:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.o((Context) this.f312a.f.a());
            case 150:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.x((com.google.android.libraries.search.udcdataservice.k) this.b.Q.a(), (Executor) this.f312a.H.a());
            case 151:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.y((Context) this.f312a.f.a(), this.b.c.dk());
            case 152:
                return new ab((ag) this.f312a.Q.a(), this.b.c.aB());
            case 153:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.ad((ag) this.f312a.Q.a());
            case 154:
                ag agVar = (ag) this.f312a.Q.a();
                com.google.common.v.f fVar3 = (com.google.common.v.f) this.f312a.ez.a();
                jo joVar4 = this.f312a;
                return new com.google.android.apps.search.googleapp.promomanager.a.a.af(agVar, fVar3, joVar4.gK(), joVar4.lU());
            case 155:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.ah(((com.google.apps.tiktok.experiments.e) this.b.c.b.l.a()).a("com.google.android.libraries.search.googleapp.user 45374163").f(), (cg) this.b.H.a(), (cg) this.f312a.b.kA.a(), (com.google.common.v.f) this.f312a.ez.a(), (Executor) this.f312a.H.a());
            case 156:
                return new aj((Context) this.f312a.f.a());
            case 157:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.j((ag) this.f312a.Q.a(), (com.google.common.v.f) this.f312a.ez.a(), this.b.c.aP());
            case 158:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.aa((ag) this.f312a.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) this.b.ar.a(), this.b.c.fW());
            case 159:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.r((ag) this.f312a.Q.a(), (Optional) this.b.f308a.cX.a(), Optional.of((com.google.android.libraries.search.lens.d.a.a) this.b.c.p.a()));
            case 160:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.v((ag) this.f312a.Q.a(), Optional.of((com.google.android.libraries.search.lens.d.a.a) this.b.c.p.a()));
            case 161:
                return new com.google.android.apps.search.googleapp.promomanager.a.a.s((ag) this.f312a.Q.a(), (Optional) this.b.f308a.cX.a());
            case 162:
                com.google.apps.tiktok.q.b.g a8 = com.google.apps.tiktok.q.b.h.a();
                a8.f5883a = "UserModelDataStore";
                a8.c(com.google.android.libraries.search.lens.e.c.a.d.a);
                return this.b.kf().a(a8.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 163:
                ik ikVar3 = this.b;
                jo joVar5 = this.f312a;
                je jeVar2 = ikVar3.c;
                return new com.google.android.apps.search.googleapp.promomanager.f.s(jeVar2.fX(), jeVar2.fU(), (com.google.android.libraries.g.a) joVar5.g.a(), (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a(), (com.google.android.apps.search.googleapp.promomanager.a.z) this.b.c.bw.a(), (com.google.android.apps.search.googleapp.promomanager.c.k) this.b.c.bx.a(), (cg) this.b.c.y.a(), (cg) this.b.c.bv.a(), (ag) this.f312a.Q.a(), (m.c.n) this.f312a.P.a());
            case 164:
                return new com.google.android.apps.search.googleapp.promomanager.a.z((ay) this.f312a.iu.a(), (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a(), this.b.c.aK());
            case 165:
                com.google.apps.tiktok.q.b.g a9 = com.google.apps.tiktok.q.b.h.a();
                a9.f5883a = "PromoManagerStateDataStore";
                a9.c(com.google.protos.ax.a.a.a.ah.a);
                return this.b.kf().a(a9.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 166:
                ag agVar2 = (ag) this.f312a.Q.a();
                ik ikVar4 = this.b;
                return new com.google.android.apps.search.googleapp.promomanager.c.k(agVar2, ikVar4.c.cR(), (com.google.apps.tiktok.p.b.c) ikVar4.X.a(), this.b.f308a.fu());
            case 167:
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) this.f312a.iv.a();
                je jeVar3 = this.b.c;
                h hVar = jeVar3.bv;
                com.google.android.apps.search.googleapp.promomanager.a.g aK = jeVar3.aK();
                com.google.android.apps.search.googleapp.promomanager.a.j aL = jeVar3.aL();
                com.google.android.apps.search.googleapp.promomanager.c.f aM = jeVar3.aM();
                cg cgVar = (cg) hVar.a();
                cg cgVar2 = (cg) this.b.c.y.a();
                com.google.android.apps.search.googleapp.promomanager.a.z zVar = (com.google.android.apps.search.googleapp.promomanager.a.z) this.b.c.bw.a();
                com.google.android.libraries.search.b.b bVar2 = (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a();
                Executor executor = (Executor) this.f312a.H.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f312a.v.a();
                je jeVar4 = this.b.c;
                return new com.google.android.apps.search.googleapp.promomanager.a.y(axVar, aK, aL, aM, cgVar, cgVar2, zVar, bVar2, executor, scheduledExecutorService, jeVar4.fU(), jeVar4.fY());
            case 168:
                return new com.google.android.apps.search.googleapp.discover.streamui.f.g();
            case 169:
                return new com.google.android.libraries.search.video.a.i();
            case 170:
                return new com.google.android.libraries.search.video.e.m(this.b.c.lz(), (byte[]) null);
            case 171:
                return new com.google.android.libraries.search.video.a.i(this.f312a.H);
            case 172:
                return new com.google.android.libraries.search.video.e.m(this.b.c.cx());
            case 173:
                return new com.google.android.libraries.search.video.e.m(this.b.c.cw());
            case 174:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sw().a.a()).a("com.google.android.libraries.search.googleapp.user 45618579").f());
            case 175:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.mm().a.a()).a("com.google.android.libraries.search.googleapp.user 45650334").f());
            case 176:
                com.google.android.libraries.search.t.a.a.a.e a10 = com.google.android.apps.search.googleapp.x.c.a.a(this.b.c.ly());
                a10.getClass();
                return a10;
            case 177:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.mm().a.a()).a("com.google.android.libraries.search.googleapp.user 45639669").f());
            case 178:
                return new com.google.android.apps.search.googleapp.search.srp.d.a();
            case 179:
                return new com.google.android.apps.search.omnient.b.d.e((Optional) this.b.f308a.cX.a(), (com.google.android.apps.search.omnient.b.a.k) this.b.f308a.cW.a(), (Context) this.f312a.f.a(), (ag) this.f312a.Q.a(), ((com.google.apps.tiktok.experiments.e) this.b.c.b.l.a()).a("com.google.android.apps.search.omnient 45614967").f(), (cg) this.b.c.bJ.a());
            case 180:
                com.google.apps.tiktok.q.b.g a11 = com.google.apps.tiktok.q.b.h.a();
                a11.f5883a = "SamsungJitTipStateDataStore";
                a11.c(com.google.android.apps.search.omnient.b.d.a.a.a);
                return this.b.kf().a(a11.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 181:
                return new lt(this);
            case 182:
                com.google.apps.tiktok.q.b.g a12 = com.google.apps.tiktok.q.b.h.a();
                a12.f5883a = "InboxPromoThrottling";
                a12.c(com.google.android.libraries.search.w.a.a.a);
                return this.b.kf().a(a12.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 183:
                return new com.google.android.apps.search.googleapp.inbox.a((com.google.android.libraries.search.b.b) this.b.f308a.aJ.a());
            case 184:
                PackageManager packageManager = (PackageManager) this.f312a.h.a();
                com.google.android.libraries.search.urlhandler.processors.c.b bVar3 = (com.google.android.libraries.search.urlhandler.processors.c.b) this.f312a.wz.a();
                com.google.android.apps.search.googleapp.customtabs.b.z zVar2 = (com.google.android.apps.search.googleapp.customtabs.b.z) this.f312a.wy.a();
                cq cqVar = (cq) this.f312a.v.a();
                je jeVar5 = this.b.c;
                return new com.google.android.apps.search.googleapp.customtabs.e.c(packageManager, bVar3, zVar2, cqVar, jeVar5.gp(), jeVar5.gq(), jeVar5.gs(), jeVar5.gt());
            case 185:
                return new com.google.android.apps.search.googleapp.stampviewer.b.m();
            case 186:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sz().a.a()).a("com.google.android.libraries.search.googleapp.user 45639032").f());
            case 187:
                com.google.apps.tiktok.q.b.g a13 = com.google.apps.tiktok.q.b.h.a();
                a13.f5883a = "contentcreator_boba_identity_cache";
                a13.c(com.google.android.apps.search.googleapp.contentcreator.i.a.a);
                return this.b.kf().a(a13.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 188:
                return new com.google.android.apps.search.googleapp.e.b.b((ay) this.f312a.iu.a(), this.b.c.mw().aD(), ((com.google.apps.tiktok.experiments.e) this.b.c.mw().a.a()).a("com.google.android.libraries.search.googleapp.user 45627270").d(), (com.google.common.v.f) this.f312a.ez.a());
            case 189:
                return new com.google.android.apps.search.googleapp.contentcreator.compose.element.image.c();
            case 190:
                com.google.android.apps.search.googleapp.contentcreator.storage.d D = ((AppDatabase) this.b.c.bS.a()).D();
                D.getClass();
                return D;
            case 191:
                AppDatabase a14 = this.b.kh().a((com.google.apps.tiktok.q.c.h) this.b.c.bR.a(), AppDatabase.class, new Object[]{new com.google.android.apps.search.googleapp.contentcreator.storage.ay(), new com.google.android.apps.search.googleapp.contentcreator.storage.az((ExtensionRegistryLite) this.b.c.f313a.lj.a()), new com.google.android.apps.search.googleapp.contentcreator.storage.r()});
                a14.getClass();
                return a14;
            case 192:
                com.google.apps.tiktok.q.c.g a15 = com.google.apps.tiktok.q.c.h.a();
                a15.a = "kahani.protobased";
                a15.c = new com.google.apps.tiktok.q.c.a(0);
                ArrayList arrayList = com.google.android.apps.search.googleapp.contentcreator.storage.p.a;
                Iterator it = com.google.android.apps.search.googleapp.contentcreator.storage.p.a.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    a15.b().h((androidx.room.e.a) next);
                }
                return a15.a();
            case 193:
                return new com.google.android.apps.search.googleapp.contentcreator.themes.f((bg) this.b.c.bU.a(), (ag) this.f312a.Q.a());
            case 194:
                bg H = ((AppDatabase) this.b.c.bS.a()).H();
                H.getClass();
                return H;
            case 195:
                return new com.google.android.apps.search.googleapp.contentcreator.compose.element.edittimedelement.s();
            case 196:
                com.google.android.apps.search.googleapp.contentcreator.storage.w E = ((AppDatabase) this.b.c.bS.a()).E();
                E.getClass();
                return E;
            case 197:
                com.google.android.apps.search.googleapp.contentcreator.storage.ae F = ((AppDatabase) this.b.c.bS.a()).F();
                F.getClass();
                return F;
            case 198:
                cd K = ((AppDatabase) this.b.c.bS.a()).K();
                K.getClass();
                return K;
            case 199:
                bp I = ((AppDatabase) this.b.c.bS.a()).I();
                I.getClass();
                return I;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.c;
        switch (i) {
            case 200:
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar = (cq) this.f312a.H.a();
                jo joVar = this.f312a;
                return com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.d.n.b(aVar, extensionRegistryLite, cqVar, joVar.mx(), joVar.md(), com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.d.n.a(), this.b.ye());
            case 201:
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar2 = (cq) this.f312a.H.a();
                jo joVar2 = this.f312a;
                return com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.a.a.b(aVar2, extensionRegistryLite2, cqVar2, joVar2.mx(), joVar2.md(), com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.a.a.a(), this.b.ye());
            case 202:
                return new com.google.android.apps.search.googleapp.discover.streamui.f.c((com.google.android.apps.search.googleapp.discover.streamui.f.g) this.b.c.bA.a(), (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a());
            case 203:
                ik ikVar = this.b;
                jo joVar3 = this.f312a;
                return ikVar.kf().a(com.google.android.apps.search.googleapp.discover.a.b.a(), (com.google.android.libraries.storage.a.j) joVar3.w.a());
            case 204:
                return new ls();
            case 205:
                return new com.google.android.apps.search.googleapp.discover.b.c((cq) this.f312a.v.a(), (Context) this.f312a.f.a(), (String) this.f312a.Y.a());
            case 206:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lA().a.a()).a("com.google.android.libraries.search.googleapp.user 45386657").f());
            case 207:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sk().a.a()).a("com.google.android.libraries.search.googleapp.user 251").f());
            case 208:
                return Boolean.valueOf(this.b.c.mx().aS());
            case 209:
                return new com.google.android.libraries.search.silk.impl.w.a();
            case 210:
                return new com.google.android.apps.search.googleapp.discover.a.d.c((Executor) this.f312a.H.a(), (com.google.frameworks.client.data.android.l) this.b.f308a.bk.a(), (ag) this.f312a.Q.a(), (com.google.android.libraries.search.trust.c.t) this.f312a.wH.a());
            case 211:
                return new com.google.android.apps.search.googleapp.discover.streamui.impl.a.a();
            case 212:
                ik ikVar2 = this.b;
                com.google.android.apps.search.googleapp.discover.settings.b.h cd = ikVar2.f308a.cd();
                AccountId accountId = (AccountId) ikVar2.g.a();
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f312a.bN.a();
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) this.f312a.iv.a();
                Executor executor = (Executor) this.f312a.H.a();
                ik ikVar3 = this.b;
                jo joVar4 = this.f312a;
                return new com.google.android.apps.search.googleapp.discover.settings.b.a.h(cd, accountId, bVar, axVar, executor, ikVar3.c.cD(), (com.google.common.v.f) joVar4.ez.a(), this.b.c.hb(), (ag) this.f312a.Q.a());
            case 213:
                ik ikVar4 = this.b;
                jo joVar5 = this.f312a;
                return ikVar4.kf().a(com.google.android.apps.search.googleapp.discover.m.b.a(), (com.google.android.libraries.storage.a.j) joVar5.w.a());
            case 214:
                return Boolean.valueOf(this.b.f308a.sL().au());
            case 215:
                return Boolean.valueOf(this.b.f308a.sN().av());
            case 216:
                ik ikVar5 = this.b;
                return new com.google.android.apps.search.googleapp.discover.u.a.d(ikVar5.f308a.md(), (com.google.android.apps.search.googleapp.discover.z.ao) ikVar5.f308a.dx.a());
            case 217:
                com.google.android.apps.search.googleapp.discover.u.a.d dVar = (com.google.android.apps.search.googleapp.discover.u.a.d) this.b.c.cn.a();
                dVar.getClass();
                return dVar;
            case 218:
                ik ikVar6 = this.b;
                jo joVar6 = this.f312a;
                return ikVar6.kf().a(com.google.android.apps.search.googleapp.discover.streamui.impl.c.d.a(), (com.google.android.libraries.storage.a.j) joVar6.w.a());
            case 219:
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar3 = (cq) this.f312a.H.a();
                jo joVar7 = this.f312a;
                return com.google.android.apps.search.googleapp.j.a.k.b(aVar3, extensionRegistryLite3, cqVar3, joVar7.mx(), joVar7.md(), com.google.android.apps.search.googleapp.j.a.k.a(), this.b.ye());
            case 220:
                return new com.google.android.apps.search.googleapp.x.e.a((com.google.android.libraries.search.b.b) this.b.f308a.aJ.a(), (com.google.android.apps.search.googleapp.x.d.b) this.f312a.b.em.a());
            case 221:
                return new com.google.android.apps.search.googleapp.x.f.a(((Boolean) this.b.c.cq.a()).booleanValue(), ((com.google.apps.tiktok.experiments.e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45639049").f(), (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a(), (AtomicReference) this.f312a.b.kU.a(), Optional.of((com.google.android.apps.search.googleapp.search.e.l) this.b.c.ag.a()), this.b.f308a.eL(), (AtomicReference) this.f312a.b.kV.a());
            case 222:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45399210").f());
            case 223:
                jr jrVar = this.f312a.b;
                return new com.google.android.apps.search.googleapp.w.b(jrVar.kW, jrVar.kX);
            case 224:
                return new com.google.android.apps.search.googleapp.w.c(this.b.c.mt().al(), this.b.c.mt().ak());
            case 225:
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) this.f312a.g.a();
                Context context = (Context) this.f312a.f.a();
                jo joVar8 = this.f312a;
                return new com.google.android.libraries.search.o.b.d(aVar4, context, joVar8.f319a.rw(), ((com.google.apps.tiktok.experiments.e) joVar8.b.iB().a.a()).a("com.google.android.libraries.search.device 45626213").b(), ((com.google.apps.tiktok.experiments.e) this.f312a.b.iB().a.a()).a("com.google.android.libraries.search.device 45626214").b(), this.b.c.ci(), (ag) this.f312a.bo.a(), (ay) this.f312a.iu.a());
            case 226:
                return new com.google.android.libraries.search.robin.a.d((ag) this.f312a.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) this.b.ar.a(), (com.google.android.libraries.g.a) this.f312a.g.a());
            case 227:
                ik ikVar7 = this.b;
                jo joVar9 = this.f312a;
                return ikVar7.kf().a(com.google.android.apps.search.googleapp.homescreen.c.a.a.b.a(), (com.google.android.libraries.storage.a.j) joVar9.w.a());
            case 228:
                ik ikVar8 = this.b;
                jo joVar10 = this.f312a;
                return ikVar8.kf().a(com.google.android.apps.search.googleapp.launcher.a.a.a.a(), (com.google.android.libraries.storage.a.j) joVar10.w.a());
            case 229:
                return new com.google.android.apps.search.googleapp.urlhandler.c.a(this.b.c.bj());
            case 230:
                ik ikVar9 = this.b;
                jo joVar11 = this.f312a;
                return ikVar9.kf().a(com.google.android.apps.search.googleapp.resumption.activityhub.a.g.a(), (com.google.android.libraries.storage.a.j) joVar11.w.a());
            case 231:
                return com.google.apps.tiktok.cache.d.a((Executor) this.f312a.H.a(), com.google.apps.tiktok.cache.f.a().a(), (com.google.android.libraries.g.a) this.f312a.g.a());
            case 232:
                ik ikVar10 = this.b;
                jo joVar12 = this.f312a;
                return ikVar10.kf().a(com.google.android.apps.search.googleapp.saves.a.d.a(), (com.google.android.libraries.storage.a.j) joVar12.w.a());
            case 233:
                ag agVar = (ag) this.f312a.Q.a();
                ik ikVar11 = this.b;
                return new com.google.android.libraries.search.c.a.c(agVar, ikVar11.c.m115do(), (com.google.frameworks.client.data.android.d.f) ikVar11.c.cA.a());
            case 234:
                return com.google.android.libraries.search.c.b.a.a((com.google.apps.tiktok.p.b.c) this.b.X.a());
            case 235:
                ik ikVar12 = this.b;
                jo joVar13 = this.f312a;
                return ikVar12.kf().a(com.google.android.apps.search.googleapp.resumption.a.g.a(), (com.google.android.libraries.storage.a.j) joVar13.w.a());
            case 236:
                com.google.android.apps.search.googleapp.search.voicesearch.b.i iVar = (com.google.android.apps.search.googleapp.search.voicesearch.b.i) this.b.c.cC.a();
                ik ikVar13 = this.b;
                return new com.google.android.apps.search.googleapp.search.voicesearch.b.e(iVar, ikVar13.c.be(), ikVar13.c.bf(), (com.google.android.apps.search.googleapp.search.h.q) ikVar13.c.cG.a(), ((com.google.apps.tiktok.experiments.e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45644517").f());
            case 237:
                return new com.google.android.apps.search.googleapp.search.voicesearch.b.i((ay) this.f312a.iu.a(), (com.google.apps.tiktok.g.ax) this.f312a.iv.a());
            case 238:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45643853").b());
            case 239:
                com.google.android.libraries.assistant.q.an d = io.grpc.j.a.d(new ak(0), this.b.qh(), io.grpc.h.a);
                d.getClass();
                return d;
            case 240:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45634315").f());
            case 241:
                return new com.google.android.apps.search.googleapp.search.voicesearch.a.d((Context) this.f312a.f.a(), (ag) this.f312a.Q.a(), this.b.c.bd());
            case 242:
                return new com.google.android.apps.search.googleapp.search.h.a((com.google.common.v.f) this.f312a.ez.a(), (com.google.android.apps.search.googleapp.search.g.a) this.b.c.ai.a(), (com.google.android.libraries.g.a) this.f312a.g.a());
            case 243:
                ik ikVar14 = this.b;
                return new com.google.android.apps.search.googleapp.search.h.q(ikVar14.c.lq(), (com.google.android.apps.search.googleapp.x.f.a) ikVar14.c.cr.a(), (com.google.android.libraries.search.ap.b.b) this.b.f308a.aC.a());
            case 244:
                return Boolean.valueOf(this.b.c.mi().O());
            case 245:
                return this.b.c.mi().M();
            case 246:
                return this.b.c.mi().L();
            case 247:
                return this.b.c.mi().N();
            case 248:
                ((com.google.apps.tiktok.p.b.c) this.b.X.a()).getClass();
                return com.google.frameworks.client.data.android.a.p.b();
            case 249:
                return new com.google.android.apps.search.googleapp.search.srp.h.a();
            case 250:
                return this.b.f308a.sp().I();
            case 251:
                return Boolean.valueOf(this.b.c.mo().ae());
            case 252:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lK().a.a()).a("com.google.android.libraries.search.googleapp.user 45649522").f());
            case 253:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lO().a.a()).a("com.google.android.libraries.search.googleapp.user 45657956").f());
            case 254:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lO().a.a()).a("com.google.android.libraries.search.googleapp.user 45657955").f());
            case 255:
                return Boolean.valueOf(this.b.c.ml().U());
            case 256:
                return ((com.google.apps.tiktok.experiments.e) this.b.c.lB().a.a()).a("com.google.android.libraries.search.googleapp.user 45408006").d();
            case 257:
                return Boolean.valueOf(this.b.f308a.sp().K());
            case 258:
                return Boolean.valueOf(this.b.c.mf().u());
            case 259:
                return Boolean.valueOf(this.b.c.mf().C());
            case 260:
                ik ikVar15 = this.b;
                jo joVar14 = this.f312a;
                return ikVar15.kf().a(com.google.android.apps.search.googleapp.search.suggest.g.aa.a(), (com.google.android.libraries.storage.a.j) joVar14.w.a());
            case 261:
                com.google.android.apps.search.googleapp.search.suggest.c.i iVar2 = (com.google.android.apps.search.googleapp.search.suggest.c.i) this.b.c.cX.a();
                lt ltVar = (lt) this.b.c.cY.a();
                ik ikVar16 = this.b;
                return com.google.android.apps.search.googleapp.search.suggest.c.m.d(iVar2, ltVar, ikVar16.f308a.nu(), (com.google.android.libraries.search.ac.b.c.m) ikVar16.f308a.aP.a());
            case 262:
                return new com.google.android.apps.search.googleapp.search.suggest.c.i((com.google.android.apps.search.googleapp.search.suggest.c.k) this.b.f308a.aR.a(), (com.google.android.libraries.g.a) this.f312a.g.a());
            case 263:
                return new lt(this);
            case 264:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45614150").f());
            case 265:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45417594").f());
            case 266:
                return Boolean.valueOf(this.b.f308a.su().P());
            case 267:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45390639").f());
            case 268:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45401959").f());
            case 269:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.si().a.a()).a("com.google.android.libraries.search.googleapp.user 45388964").f());
            case 270:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45460454").f());
            case 271:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45641315").f());
            case 272:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45644729").f());
            case 273:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45644730").f());
            case 274:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45641577").f());
            case 275:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45640560").b());
            case 276:
                return new com.google.android.libraries.elements.converters.i.a.e();
            case 277:
                return new com.google.android.apps.search.googleapp.discover.settings.b.o(this.f312a.c.gF().f(), (Context) this.f312a.f.a(), (TelephonyManager) this.f312a.uY.a(), (com.google.android.apps.search.googleapp.discover.settings.b.a.h) this.b.c.ck.a());
            case 278:
                return new com.google.android.apps.search.googleapp.settingsui.an();
            case 279:
                return Long.valueOf(this.b.f308a.sk().r());
            case 280:
                return Boolean.valueOf(this.b.f308a.sk().s());
            case 281:
                ik ikVar17 = this.b;
                jo joVar15 = this.f312a;
                return ikVar17.kf().a(com.google.android.apps.search.googleapp.stampviewer.a.g.a(), (com.google.android.libraries.storage.a.j) joVar15.w.a());
            case 282:
                return com.google.android.libraries.search.aj.e.a.b(this.b.c.fg().a());
            case 283:
                lt ltVar2 = (lt) this.b.f308a.ao.a();
                ltVar2.getClass();
                return ltVar2.aD();
            case 284:
                com.google.android.libraries.search.ac.b.g.e eVar = (com.google.android.libraries.search.ac.b.g.e) this.b.c.dv.a();
                eVar.getClass();
                return eVar;
            case 285:
                return com.google.android.apps.search.omnient.suggest.c.a.c((lt) this.b.f308a.aN.a(), (com.google.android.libraries.search.ac.b.c.w) this.b.c.ds.a(), (com.google.android.libraries.search.ac.b.c.h) this.b.c.dt.a(), (com.google.android.libraries.search.ac.b.c.m) this.b.c.du.a());
            case 286:
                return com.google.android.apps.search.omnient.suggest.c.a.d((lt) this.b.f308a.aq.a(), (com.google.android.libraries.search.ac.b.c.w) this.b.c.ds.a());
            case 287:
                ls lsVar = (ls) this.b.f308a.aO.a();
                com.google.android.libraries.search.b.b el = this.b.f308a.el();
                lsVar.getClass();
                return new com.google.android.libraries.search.ac.b.c.m(el);
            case 288:
                ik ikVar18 = this.b;
                jo joVar16 = this.f312a;
                return ikVar18.kf().a(com.google.android.libraries.search.lens.e.b.g.a(), (com.google.android.libraries.storage.a.j) joVar16.w.a());
            case 289:
                ik ikVar19 = this.b;
                jo joVar17 = this.f312a;
                return ikVar19.kf().a(com.google.android.apps.search.omnient.education.a.e.a(), (com.google.android.libraries.storage.a.j) joVar17.w.a());
            case 290:
                return new com.google.android.apps.search.omnient.searchresults.o.a.g((com.google.android.libraries.search.ap.b.b) this.b.f308a.aC.a());
            case 291:
                ik ikVar20 = this.b;
                jo joVar18 = this.f312a;
                return ikVar20.kf().a(com.google.android.libraries.search.lens.e.a.k.a(), (com.google.android.libraries.storage.a.j) joVar18.w.a());
            case 292:
                return com.google.android.apps.search.omnient.suggest.c.a.b((lt) this.b.c.ab.a(), ha.o(this.b.c.fM()), (com.google.android.libraries.search.ac.b.c.w) this.b.c.ds.a(), (com.google.android.libraries.search.ac.b.c.h) this.b.c.dt.a(), ((com.google.apps.tiktok.experiments.e) this.b.c.lG().a.a()).a("com.google.android.apps.search.omnient 45459788").b());
            case 293:
                return new com.google.android.apps.search.podcasts.k.b.b((com.google.android.apps.search.podcasts.l.f) this.f312a.f319a.cI.a(), (u) this.b.f308a.eO.a(), this.f312a.c.dq());
            case 294:
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite4 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar4 = (cq) this.f312a.H.a();
                jo joVar19 = this.f312a;
                return com.google.android.apps.search.podcasts.episode.a.g.d(aVar5, extensionRegistryLite4, cqVar4, joVar19.mx(), joVar19.md(), com.google.android.apps.search.podcasts.episode.a.g.a(), this.b.ye());
            case 295:
                return new com.google.apps.tiktok.g.an();
            case 296:
                ik ikVar21 = this.b;
                com.google.android.apps.search.podcasts.n.g ds = ikVar21.f308a.ds();
                com.google.apps.tiktok.g.a.a.c cE = ikVar21.c.cE();
                com.google.android.apps.search.podcasts.g.e eVar2 = (com.google.android.apps.search.podcasts.g.e) ikVar21.c.dD.a();
                ik ikVar22 = this.b;
                return new com.google.android.apps.search.podcasts.explore.a.j(ds, cE, eVar2, ikVar22.f308a.dw(), (com.google.android.apps.search.podcasts.l.ae) ikVar22.f308a.eL.a(), new com.google.apps.tiktok.g.an(), (u) this.b.f308a.eO.a());
            case 297:
                ik ikVar23 = this.b;
                return new com.google.android.apps.search.podcasts.g.e(ikVar23.c.bo(), ikVar23.f308a.di(), ikVar23.c.bm());
            case 298:
                return new com.google.android.apps.search.podcasts.util.a.c(((com.google.apps.tiktok.experiments.e) this.f312a.c.gr().a.a()).a("com.google.android.apps.podcasts_android.device 45360345").f(), (com.google.android.apps.search.podcasts.l.ae) this.b.f308a.eL.a(), (dj) this.b.q.a());
            case 299:
                ik ikVar24 = this.b;
                return new com.google.android.apps.search.podcasts.home.a.g(ikVar24.f308a.ds(), ikVar24.c.cE(), (com.google.android.apps.search.podcasts.g.e) ikVar24.c.dD.a(), (com.google.android.apps.search.podcasts.autodownload.a) this.f312a.f319a.cJ.a(), this.b.c.bp(), new com.google.apps.tiktok.g.an(), (u) this.b.f308a.eO.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        int i = this.c;
        switch (i) {
            case 300:
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar = (cq) this.f312a.H.a();
                jo joVar = this.f312a;
                return com.google.android.apps.search.podcasts.language.b.a.a(aVar, extensionRegistryLite, cqVar, joVar.mx(), joVar.md(), com.google.android.apps.search.podcasts.language.b.b.b(), this.b.ye());
            case 301:
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar2 = (cq) this.f312a.H.a();
                jo joVar2 = this.f312a;
                return com.google.android.apps.search.podcasts.search.b.a.a(aVar2, extensionRegistryLite2, cqVar2, joVar2.mx(), joVar2.md(), com.google.android.apps.search.podcasts.search.b.i.b(), this.b.ye());
            case 302:
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar3 = (cq) this.f312a.H.a();
                jo joVar3 = this.f312a;
                return com.google.android.apps.search.podcasts.searchresults.a.g.b(aVar3, extensionRegistryLite3, cqVar3, joVar3.mx(), joVar3.md(), com.google.android.apps.search.podcasts.searchresults.a.g.a(), this.b.ye());
            case 303:
                com.google.android.apps.search.podcasts.l.ae aeVar = (com.google.android.apps.search.podcasts.l.ae) this.b.f308a.eL.a();
                Executor executor = (Executor) this.f312a.H.a();
                Context context = (Context) this.f312a.f.a();
                ik ikVar = this.b;
                jo joVar4 = this.f312a;
                return new com.google.android.apps.search.podcasts.settings.a.j(aeVar, executor, context, ikVar.c.bn(), ikVar.c.bo(), (com.google.android.libraries.g.a) joVar4.g.a(), (com.google.android.apps.search.podcasts.b.b.ah) this.b.f308a.eS.a(), this.b.f308a.dw(), (ay) this.f312a.iu.a());
            case 304:
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite4 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar4 = (cq) this.f312a.H.a();
                jo joVar5 = this.f312a;
                return com.google.android.apps.search.podcasts.show.c.j.b(aVar4, extensionRegistryLite4, cqVar4, joVar5.mx(), joVar5.md(), com.google.android.apps.search.podcasts.show.c.j.a(), this.b.ye());
            case 305:
                return new com.google.apps.tiktok.g.an();
            case 306:
                ik ikVar2 = this.b;
                jo joVar6 = this.f312a;
                return ikVar2.kf().a(com.google.android.apps.search.pronunciationlearning.content.j.a(), (com.google.android.libraries.storage.a.j) joVar6.w.a());
            case 307:
                ik ikVar3 = this.b;
                jo joVar7 = this.f312a;
                return ikVar3.kf().a(com.google.android.apps.search.pronunciationlearning.e.a.d.a(), (com.google.android.libraries.storage.a.j) joVar7.w.a());
            case 308:
                return new com.google.android.apps.search.pronunciationlearning.c.b.f((com.google.apps.tiktok.g.ax) this.f312a.iv.a(), (ay) this.f312a.iu.a(), this.b.c.bq(), (cq) this.f312a.H.a(), new com.google.android.apps.search.pronunciationlearning.c.d.a(this.b.c.dO));
            case 309:
                return new com.google.android.apps.search.pronunciationlearning.c.a.m((cr) this.f312a.H.a());
            case 310:
                ik ikVar4 = this.b;
                com.google.aw.k.c.e.a.f a2 = com.google.android.apps.search.pronunciationlearning.c.c.a.a(ikVar4.V, (com.google.apps.tiktok.p.m) this.f312a.c.aW.a(), (com.google.apps.tiktok.p.u) this.f312a.mh.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), com.google.common.base.a.a);
                a2.getClass();
                return a2;
            case 311:
                return new com.google.android.apps.search.pronunciationlearning.d.o((com.google.android.apps.search.pronunciationlearning.d.d) this.f312a.c.aX.a(), (cq) this.f312a.H.a(), (com.google.android.libraries.search.d.e.a.c) this.f312a.fx.a());
            case 312:
                return com.google.android.apps.search.readaloud.f.a.p.b((com.google.android.apps.search.readaloud.d.a) this.b.c.dR.a(), this.b.c.dS.a(), this.b.c.br());
            case 313:
                ik ikVar5 = this.b;
                jo joVar8 = this.f312a;
                Function fR = ikVar5.c.fR();
                ay ayVar = (ay) joVar8.iu.a();
                return new com.google.android.apps.search.readaloud.d.a(fR, ayVar);
            case 314:
                return new dq(this, 2);
            case 315:
                return new com.google.android.apps.search.readaloud.f.a.a((ay) this.f312a.iu.a());
            case 316:
                ik ikVar6 = this.b;
                jo joVar9 = this.f312a;
                return ikVar6.kf().a(com.google.android.apps.search.sceneviewer.a.d.a(), (com.google.android.libraries.storage.a.j) joVar9.w.a());
            case 317:
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) this.f312a.iv.a();
                ay ayVar2 = (ay) this.f312a.iu.a();
                cq cqVar5 = (cq) this.f312a.H.a();
                ik ikVar7 = this.b;
                return new com.google.android.apps.search.soundsearch.h.b.i(axVar, ayVar2, cqVar5, ikVar7.c.bs(), ikVar7.c.ff().a(), (com.google.android.libraries.g.a) this.f312a.g.a(), (ConnectivityManager) this.f312a.wN.a());
            case 318:
                ik ikVar8 = this.b;
                jo joVar10 = this.f312a;
                return ikVar8.kf().b(ikVar8.c.cG(), (com.google.android.libraries.storage.a.j) joVar10.w.a());
            case 319:
                com.google.protos.ap.b.a.b dm = this.b.c.dm();
                Duration ofMinutes = Duration.ofMinutes(30L);
                ofMinutes.getClass();
                ik ikVar9 = this.b;
                Object fl = ikVar9.c.fl();
                return com.google.android.libraries.search.ak.e.a(dm, ofMinutes, (com.google.android.libraries.search.ak.d) fl, (com.google.android.libraries.g.a) this.f312a.g.a());
            case 320:
                ik ikVar10 = this.b;
                jo joVar11 = this.f312a;
                return ikVar10.kf().a(com.google.android.libraries.search.silk.impl.u.e.a(), (com.google.android.libraries.storage.a.j) joVar11.w.a());
            case 321:
                jo joVar12 = this.f312a;
                return new com.google.android.libraries.assistant.auto.jumpboost.debug.a(joVar12.c.bc, (Optional) joVar12.dq.a(), (com.google.android.apps.search.assistant.surfaces.b.b.a.e) this.f312a.ea.a());
            case 322:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).c());
            case 323:
                jo joVar13 = this.f312a;
                h hVar = joVar13.b.fw;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) joVar13.g.a();
                jo joVar14 = this.f312a;
                ik ikVar11 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.g(hVar, joVar13.c.bi, aVar5, joVar14.b.am(), ikVar11.cm, ikVar11.cl, (com.google.android.libraries.assistant.auto.tng.suggestions.j.a.b) ikVar11.f308a.fe.a(), (com.google.apps.tiktok.cache.o) this.b.c.ea.a(), (Executor) this.f312a.H.a(), (Executor) this.f312a.v.a());
            case 324:
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite5 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar6 = (cq) this.f312a.H.a();
                jo joVar15 = this.f312a;
                return com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.b.a.b(aVar6, extensionRegistryLite5, cqVar6, joVar15.mx(), joVar15.md(), com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.b.a.a(), this.b.ye());
            case 325:
                return new com.google.android.libraries.assistant.x.a();
            case 326:
                return Long.valueOf(new h.a.a.b.b.a.g(this.b.l).b());
            case 327:
                return Long.valueOf(new h.a.a.b.b.a.g(this.b.l).a());
            case 328:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).d());
            case 329:
                return Boolean.valueOf(this.b.f308a.se().i());
            case 330:
                com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.d dVar = (com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.d) this.b.c.eh.a();
                e.c.c.b(this.b.c.ei);
                Executor executor2 = (Executor) this.f312a.H.a();
                com.google.android.libraries.assistant.auto.tng.assistant.a.a.a aVar7 = (com.google.android.libraries.assistant.auto.tng.assistant.a.a.a) this.b.f308a.q.a();
                ik ikVar12 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.e(dVar, executor2, aVar7, ikVar12.ay, (com.google.android.libraries.assistant.auto.tng.p.a.g) ikVar12.ax.a());
            case 331:
                com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.d b = com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.e.b(this.b.c.fh());
                b.getClass();
                return b;
            case 332:
                com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.c a3 = com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.e.a(this.b.c.fh());
                a3.getClass();
                return a3;
            case 333:
                return new com.google.android.libraries.lens.view.a.a((AccountId) this.b.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f312a.bq.a());
            case 334:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sg().a.a()).a("com.google.android.apps.search.lens.user 45657366").f());
            case 335:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lX().a.a()).a("com.google.android.apps.search.lens.user 45374409").f());
            case 336:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45374598").f());
            case 337:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lX().a.a()).a("com.google.android.apps.search.lens.user 45374917").f());
            case 338:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45374328").f());
            case 339:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45375206").f());
            case 340:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45385787").f());
            case 341:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45426984").f());
            case 342:
                ik ikVar13 = this.b;
                com.google.aw.g.a.a.w J = ikVar13.c.cJ().J(com.google.frameworks.client.data.android.d.e.a, ikVar13.f308a.fC());
                J.getClass();
                return J;
            case 343:
                ik ikVar14 = this.b;
                com.google.aw.g.a.a.x J2 = ikVar14.c.cK().J(com.google.frameworks.client.data.android.d.e.a, ikVar14.f308a.fC());
                J2.getClass();
                return J2;
            case 344:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45375208").b());
            case 345:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lX().a.a()).a("com.google.android.apps.search.lens.user 45414513").f());
            case 346:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lN().a.a()).a("com.google.android.apps.search.lens.user 45384640").f());
            case 347:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sg().a.a()).a("com.google.android.apps.search.lens.user 45410081").f());
            case 348:
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                uri.getClass();
                return uri;
            case 349:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sg().a.a()).a("com.google.android.apps.search.lens.user 45408848").f());
            case 350:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.c.lX().a.a()).a("com.google.android.apps.search.lens.user 45374326").f());
            case 351:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sg().a.a()).a("com.google.android.apps.search.lens.user 45389987").f());
            case 352:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sg().a.a()).a("com.google.android.apps.search.lens.user 45491628").f());
            case 353:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sg().a.a()).a("com.google.android.apps.search.lens.user 45491629").f());
            case 354:
                ik ikVar15 = this.b;
                al a4 = com.google.android.libraries.lens.view.ag.v.a(ikVar15.c.cL(), ikVar15.f308a.fC(), com.google.android.libraries.lens.view.ag.v.b(ikVar15.f308a.fA()));
                a4.getClass();
                return a4;
            case 355:
                return new androidx.slice.j((Context) this.f312a.f.a());
            case 356:
                return new com.google.android.libraries.search.silk.impl.v.a(this.b.c.cr());
            case 357:
                ik ikVar16 = this.b;
                jo joVar16 = this.f312a;
                return ikVar16.kf().a(com.google.android.apps.search.googleapp.notifications.i.f.a(), (com.google.android.libraries.storage.a.j) joVar16.w.a());
            case 358:
                return new com.google.android.libraries.search.silk.impl.u.d((com.google.apps.tiktok.account.data.a.d) this.f312a.bq.a(), (AccountId) this.b.g.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), (com.google.android.libraries.g.a) this.f312a.g.a(), (Executor) this.f312a.H.a(), this.b.c.cp());
            case 359:
                ik ikVar17 = this.b;
                jo joVar17 = this.f312a;
                jx jxVar = joVar17.c;
                h hVar2 = ikVar17.c.eI;
                jj jjVar = ikVar17.f308a;
                return new com.google.android.libraries.search.rendering.xuikit.xblend.j.x(hVar2, jjVar.cp, jxVar.bD, jjVar.aV, jjVar.aU, joVar17.wH, joVar17.f319a.dL, ikVar17.da, jjVar.cn, joVar17.b.eb);
            case 360:
                jo joVar18 = this.f312a;
                return new com.google.android.libraries.search.rendering.xuikit.xblend.j.c(joVar18.f319a.dK, joVar18.ft, joVar18.Q);
            case 361:
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite6 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar7 = (cq) this.f312a.H.a();
                jo joVar19 = this.f312a;
                return com.google.android.libraries.search.rendering.xuikit.xblend.e.l.b(aVar8, extensionRegistryLite6, cqVar7, joVar19.mx(), joVar19.md(), com.google.android.libraries.search.rendering.xuikit.xblend.e.m.b(Optional.empty()), this.b.ye());
            case 362:
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite7 = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar8 = (cq) this.f312a.H.a();
                jo joVar20 = this.f312a;
                return com.google.android.libraries.search.rendering.xuikit.xblend.e.o.b(aVar9, extensionRegistryLite7, cqVar8, joVar20.mx(), joVar20.md(), com.google.android.libraries.search.rendering.xuikit.xblend.e.l.a(), this.b.ye());
            case 363:
                return new com.google.android.libraries.search.t.a.o((com.google.android.libraries.search.t.a.a) this.b.J.a(), nn.a);
            case 364:
                ik ikVar18 = this.b;
                jo joVar21 = this.f312a;
                return ikVar18.kf().a(com.google.android.apps.search.googleapp.search.settings.languages.a.d.a(), (com.google.android.libraries.storage.a.j) joVar21.w.a());
            case 365:
                return new com.google.android.libraries.search.video.e.a.a(this.b.c.bC(), (com.google.android.libraries.g.a) this.f312a.g.a());
            case 366:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.startup.h();
            case 367:
                com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k) this.b.f308a.I.a();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.d.a aVar10 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.d.a) this.b.f308a.R.a();
                ik ikVar19 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.u.a.h(kVar, aVar10, ikVar19.cs(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d) ikVar19.f308a.ah.a(), this.b.c.kU());
            case 368:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.h.j((com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k) this.b.f308a.I.a(), this.b.c.ae(), (ag) this.f312a.Q.a(), (dj) this.b.q.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f312a.b.o.a(), (String) this.f312a.Y.a());
            case 369:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.startup.i(new op(this.b.c.ln()));
            case 370:
                com.google.android.apps.search.googleapp.contentcreator.storage.an G = ((AppDatabase) this.b.c.bS.a()).G();
                G.getClass();
                return G;
            case 371:
                ik ikVar20 = this.b;
                jo joVar22 = this.f312a;
                return ikVar20.kf().a(com.google.android.apps.search.googleapp.deluxesearchboxchips.b.a.j.d(), (com.google.android.libraries.storage.a.j) joVar22.w.a());
            case 372:
                return Boolean.valueOf(this.b.f308a.sF().ai());
            case 373:
                return new com.google.android.apps.search.googleapp.search.h.a.g(this.b.ye());
            case 374:
                return Double.valueOf(this.b.f308a.sp().G());
            case 375:
                return Double.valueOf(this.b.f308a.sp().H());
            case 376:
                return new com.google.android.apps.search.omnient.searchresults.c.c((com.google.android.gms.droidguard.a) this.f312a.b.eL.a(), (ag) this.f312a.bo.a(), (m.c.n) this.f312a.R.a());
            case 377:
                return new com.google.android.apps.search.googleapp.contentcreator.themes.c((Context) this.f312a.f.a(), (Executor) this.f312a.v.a());
            case 378:
                return new com.google.android.apps.search.googleapp.labs.a.v(this.b.f308a.cq(), (ag) this.f312a.Q.a(), this.f312a.b.jg().q());
            case 379:
                ik ikVar21 = this.b;
                jo joVar23 = this.f312a;
                return ikVar21.kf().a(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.data.a.b.a(), (com.google.android.libraries.storage.a.j) joVar23.w.a());
            case 380:
                bx J3 = ((AppDatabase) this.b.c.bS.a()).J();
                J3.getClass();
                return J3;
            case 381:
                return new ja(this, 0);
            case 382:
                return new com.google.android.libraries.search.assistant.ao.b.e((nz) this.b.cT.a(), this.b.c.cf(), (ag) this.f312a.Q.a());
            case 383:
                return new lt(this);
            case 384:
                je jeVar = this.b.c;
                fq i2 = fu.i(30);
                i2.i("asst.history.action_history", jeVar.bT());
                i2.i("asst.device.carrier.params", this.b.c.bW());
                i2.i("asst.language.params", this.b.c.bY());
                i2.i("asst.lockscreen.params", this.b.c.bZ());
                i2.i("asst.communication.message", this.b.c.ca());
                i2.i("OPAQUE_TOKEN", this.b.c.bS());
                i2.i("asst.communication.top_contact", this.b.c.cd());
                i2.i("asst.communication.call", this.b.c.bV());
                i2.i("alarm", this.b.c.bU());
                i2.i("timer", this.b.c.cc());
                i2.i("stopwatch", this.b.c.cb());
                i2.i("asst.dialog.state.params", this.b.c.bX());
                int i3 = com.google.android.apps.search.assistant.surfaces.b.c.a.c.a;
                i2.i("CLIENT_ID", new com.google.android.libraries.search.assistant.n.a.a.a("AUTO_PROJECTED"));
                i2.i("app_context_params", this.b.c.bE());
                i2.i("asst.device.properties", this.b.c.bI());
                i2.i("call", (com.google.android.libraries.search.assistant.n.a.a.b) this.b.f308a.i.a());
                i2.i("asst.gmm.state.params", this.b.c.bK());
                i2.i("media", this.b.c.bM());
                i2.i("navigation_state", this.b.c.bN());
                i2.i("asst.assistant.sdk.device.params", this.b.c.bF());
                i2.i("asst.gws.params", this.b.c.bL());
                i2.i("asst.display.context.params", this.b.c.bJ());
                i2.i("asst.device.capabilities", this.b.c.bG());
                i2.i("asst.device.oem.params", this.b.c.bH());
                i2.i("asst.request.logging.params", this.b.c.bO());
                i2.i("456993644", (com.google.android.libraries.search.assistant.n.a.a.b) this.b.cI.a());
                i2.i("asst.request.trigger", this.b.c.bP());
                i2.i("asst.device.location.xgeo_header", this.b.c.bR());
                i2.i("USER_AGENT", this.b.c.bu());
                i2.i("TRIGGER_TRUST_LEVEL", this.b.c.bQ());
                return i2.h(true);
            case 385:
                return new lt(this);
            case 386:
                return new lt(this);
            case 387:
                return new lt(this);
            case 388:
                return Optional.of(this.b.fr());
            case 389:
                return com.google.android.apps.search.assistant.surfaces.b.c.a.d.b((lt) this.b.c.fg.a());
            case 390:
                return new lt(this);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        h hVar;
        AccountId accountId;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        jy jyVar;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        h hVar14;
        jr jrVar;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        h hVar19;
        h hVar20;
        h hVar21;
        h hVar22;
        h hVar23;
        h hVar24;
        h hVar25;
        h hVar26;
        h hVar27;
        h hVar28;
        jy jyVar2;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        h hVar33;
        jr jrVar2;
        jr jrVar3;
        h hVar34;
        h hVar35;
        h hVar36;
        h hVar37;
        h hVar38;
        h hVar39;
        h hVar40;
        jr jrVar4;
        jy jyVar3;
        h hVar41;
        h hVar42;
        h hVar43;
        h hVar44;
        h hVar45;
        h hVar46;
        h hVar47;
        h hVar48;
        h hVar49;
        h hVar50;
        h hVar51;
        h hVar52;
        jr jrVar5;
        h hVar53;
        jr jrVar6;
        jr jrVar7;
        jr jrVar8;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        jr jrVar9;
        h hVar58;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        jr jrVar10;
        h hVar66;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        h hVar71;
        h hVar72;
        h hVar73;
        h hVar74;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        jy jyVar4;
        h hVar79;
        h hVar80;
        h hVar81;
        h hVar82;
        h hVar83;
        jy jyVar5;
        h hVar84;
        h hVar85;
        jy jyVar6;
        h hVar86;
        h hVar87;
        h hVar88;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        h hVar96;
        h hVar97;
        h hVar98;
        h hVar99;
        h hVar100;
        h hVar101;
        h hVar102;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        jr jrVar11;
        h hVar112;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        h hVar117;
        h hVar118;
        h hVar119;
        h hVar120;
        jr jrVar12;
        h hVar121;
        h hVar122;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        jr jrVar13;
        h hVar127;
        jr jrVar14;
        jr jrVar15;
        jr jrVar16;
        h hVar128;
        h hVar129;
        h hVar130;
        h hVar131;
        h hVar132;
        jy jyVar7;
        h hVar133;
        h hVar134;
        h hVar135;
        h hVar136;
        h hVar137;
        h hVar138;
        h hVar139;
        jr jrVar17;
        jr jrVar18;
        h hVar140;
        h hVar141;
        h hVar142;
        jr jrVar19;
        h hVar143;
        h hVar144;
        h hVar145;
        h hVar146;
        h hVar147;
        h hVar148;
        h hVar149;
        h hVar150;
        jy jyVar8;
        h hVar151;
        h hVar152;
        h hVar153;
        jr jrVar20;
        h hVar154;
        h hVar155;
        h hVar156;
        jr jrVar21;
        h hVar157;
        h hVar158;
        h hVar159;
        h hVar160;
        h hVar161;
        h hVar162;
        h hVar163;
        h hVar164;
        h hVar165;
        h hVar166;
        h hVar167;
        h hVar168;
        h hVar169;
        h hVar170;
        h hVar171;
        h hVar172;
        h hVar173;
        h hVar174;
        h hVar175;
        h hVar176;
        h hVar177;
        h hVar178;
        h hVar179;
        h hVar180;
        h hVar181;
        h hVar182;
        h hVar183;
        h hVar184;
        h hVar185;
        h hVar186;
        h hVar187;
        h hVar188;
        h hVar189;
        h hVar190;
        h hVar191;
        h hVar192;
        h hVar193;
        h hVar194;
        h hVar195;
        h hVar196;
        h hVar197;
        h hVar198;
        h hVar199;
        h hVar200;
        h hVar201;
        h hVar202;
        h hVar203;
        h hVar204;
        int i = this.c;
        switch (i) {
            case 0:
                ik ikVar = this.b;
                jo joVar = this.f312a;
                com.google.apps.tiktok.q.b.h ky = ikVar.ky();
                com.google.apps.tiktok.account.d.b.f kf = ikVar.kf();
                hVar = joVar.w;
                return com.google.android.apps.search.assistant.platform.g.p.a.b(ky, kf, (com.google.android.libraries.storage.a.j) hVar.a());
            case 1:
                accountId = this.b.e;
                com.google.apps.tiktok.i.f.b.b.b(accountId);
                return accountId;
            case 2:
                hVar2 = this.f312a.H;
                cq cqVar = (cq) hVar2.a();
                hVar3 = this.f312a.iv;
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) hVar3.a();
                hVar4 = this.b.h;
                cg cgVar = (cg) hVar4.a();
                ik ikVar2 = this.b;
                com.google.apps.tiktok.g.ax km = ikVar2.km();
                com.google.android.apps.search.assistant.platform.g.j.a.c ae = ikVar2.ae();
                com.google.android.apps.search.assistant.platform.g.j.m ad = ikVar2.ad();
                hVar5 = ikVar2.jT;
                return new com.google.android.apps.search.assistant.platform.g.j.j(cqVar, axVar, cgVar, km, ae, ad, e.c.c.b(hVar5));
            case 3:
                ik ikVar3 = this.b;
                jo joVar2 = this.f312a;
                com.google.apps.tiktok.q.b.h xu = ik.xu();
                com.google.apps.tiktok.account.d.b.a.b kg = ikVar3.kg();
                hVar6 = joVar2.w;
                return com.google.android.apps.search.assistant.platform.g.j.t.b(xu, kg, (com.google.android.libraries.storage.a.j) hVar6.a());
            case 4:
                ik ikVar4 = this.b;
                jo joVar3 = this.f312a;
                com.google.android.libraries.search.l.q je = ikVar4.je();
                jyVar = joVar3.f319a;
                boolean rk = jyVar.rk();
                Optional of = Optional.of(this.b.cv());
                hVar7 = this.b.jS;
                return com.google.android.libraries.search.assistant.ac.a.d.b(je, rk, of, (nz) hVar7.a());
            case 5:
                ik ikVar5 = this.b;
                hVar8 = ikVar5.as;
                hVar9 = ikVar5.cX;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.an(hVar8, hVar9, ikVar5.aY());
            case 6:
                hVar10 = this.f312a.Q;
                ag agVar = (ag) hVar10.a();
                hVar11 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar11.a();
                ik ikVar6 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.g aZ = ikVar6.aZ();
                hVar12 = ikVar6.iv;
                com.google.android.apps.search.assistant.surfaces.voice.j.f.a.h hVar205 = (com.google.android.apps.search.assistant.surfaces.voice.j.f.a.h) hVar12.a();
                this.b.cD();
                hVar13 = this.b.z;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am amVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) hVar13.a();
                Optional of2 = Optional.of(new com.google.android.apps.search.assistant.surfaces.voice.robin.j.a());
                ik ikVar7 = this.b;
                jo joVar4 = this.f312a;
                boolean ut = ikVar7.ut();
                boolean uv = ikVar7.uv();
                boolean uw = ikVar7.uw();
                hVar14 = joVar4.Y;
                String str = (String) hVar14.a();
                jrVar = this.f312a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar).a();
                hVar15 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar2 = (com.google.apps.tiktok.account.data.b) hVar15.a();
                hVar16 = this.b.g;
                AccountId accountId2 = (AccountId) hVar16.a();
                ik ikVar8 = this.b;
                jo joVar5 = this.f312a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.d.m aS = ikVar8.aS();
                hVar17 = joVar5.tr;
                boolean booleanValue = ((Boolean) hVar17.a()).booleanValue();
                hVar18 = this.f312a.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar3 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar18.a();
                ik ikVar9 = this.b;
                jo joVar6 = this.f312a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.d.r aT = ikVar9.aT();
                joVar6.acQ();
                hVar19 = this.f312a.f;
                Context context = (Context) hVar19.a();
                hVar20 = this.f312a.x;
                com.google.android.libraries.phenotype.client.a.i iVar = (com.google.android.libraries.phenotype.client.a.i) hVar20.a();
                ik ikVar10 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p(agVar, bVar, aZ, hVar205, amVar, of2, ut, uv, uw, str, pVar, bVar2, accountId2, aS, booleanValue, bVar3, aT, context, iVar, ikVar10.ux(), ikVar10.uy());
            case 7:
                hVar21 = this.f312a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.d.b((ag) hVar21.a());
            case 8:
                hVar22 = this.b.k;
                return dk.b((com.google.apps.tiktok.experiments.phenotype.x) hVar22.a());
            case 9:
                hVar23 = this.f312a.aj;
                nz nzVar = (nz) hVar23.a();
                hVar24 = this.f312a.n;
                cq cqVar2 = (cq) hVar24.a();
                hVar25 = this.b.g;
                AccountId accountId3 = (AccountId) hVar25.a();
                hVar26 = this.b.gH;
                cw cwVar = (cw) hVar26.a();
                ik ikVar11 = this.b;
                jo joVar7 = this.f312a;
                com.google.apps.tiktok.account.d.f ke = ikVar11.ke();
                hVar27 = joVar7.ho;
                com.google.apps.tiktok.experiments.phenotype.m mVar = (com.google.apps.tiktok.experiments.phenotype.m) hVar27.a();
                ik ikVar12 = this.b;
                jo joVar8 = this.f312a;
                Map qQ = ikVar12.qQ();
                hVar28 = joVar8.bN;
                return dk.c(nzVar, cqVar2, accountId3, cwVar, ke, mVar, qQ, (com.google.apps.tiktok.account.data.b) hVar28.a(), this.f312a.agc());
            case 10:
                return new ie(this);
            case 11:
                jyVar2 = this.f312a.f319a;
                return at.k(jyVar2.dz());
            case 12:
                hVar29 = this.f312a.H;
                cq cqVar3 = (cq) hVar29.a();
                hVar30 = this.b.gI;
                cg cgVar2 = (cg) hVar30.a();
                hVar31 = this.b.jQ;
                return new com.google.android.apps.search.assistant.platform.g.k.a.d(cqVar3, cgVar2, e.c.c.b(hVar31));
            case 13:
                ik ikVar13 = this.b;
                jo joVar9 = this.f312a;
                com.google.apps.tiktok.q.b.h kw = ikVar13.kw();
                com.google.apps.tiktok.account.d.b.a.b kg2 = ikVar13.kg();
                hVar32 = joVar9.w;
                return com.google.android.apps.search.assistant.platform.g.k.a.k.b(kw, kg2, (com.google.android.libraries.storage.a.j) hVar32.a());
            case 14:
                hVar33 = this.b.g;
                AccountId accountId4 = (AccountId) hVar33.a();
                jrVar2 = this.f312a.b;
                bn bnVar = (bn) jr.dB(jrVar2).a();
                jrVar3 = this.f312a.b;
                return new com.google.android.libraries.search.assistant.at.a.a.h(accountId4, bnVar, (com.google.apps.tiktok.p.b) jr.ee(jrVar3).a());
            case 15:
                ik ikVar14 = this.b;
                gy l = ha.l(7);
                l.h(ikVar14.af());
                l.j(this.b.ry());
                l.h(this.b.hW());
                l.h(this.b.qu());
                l.h(this.b.Z());
                l.h(this.b.aN());
                l.h(this.b.cP());
                return l.g();
            case 16:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.a.a();
            case 17:
                hVar34 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar34.a();
                ik ikVar15 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.feedback.a.c dw = ikVar15.dw();
                hVar35 = ikVar15.o;
                com.google.android.apps.search.assistant.verticals.ambient.d.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.d.a) hVar35.a();
                hVar36 = this.b.ho;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h hVar206 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h) hVar36.a();
                hVar37 = this.b.hK;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h hVar207 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h) hVar37.a();
                ik ikVar16 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h wA = ikVar16.wA();
                hVar38 = ikVar16.hN;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h hVar208 = (com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h) hVar38.a();
                ik ikVar17 = this.b;
                jo joVar10 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.s.g.a.i dS = ikVar17.dS();
                hVar39 = ikVar17.js;
                hVar40 = joVar10.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar40.a();
                jrVar4 = this.f312a.b;
                com.google.android.apps.search.assistant.verticals.ambient.crossprofile.b bVar4 = (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.b) jr.bQ(jrVar4).a();
                jyVar3 = this.f312a.f319a;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.e.l cx = jyVar3.cx();
                hVar41 = this.b.cm;
                com.google.android.libraries.assistant.pcp.b bVar5 = (com.google.android.libraries.assistant.pcp.b) hVar41.a();
                hVar42 = this.f312a.H;
                cr crVar = (cr) hVar42.a();
                hVar43 = this.b.aa;
                com.google.apps.tiktok.g.p pVar2 = (com.google.apps.tiktok.g.p) hVar43.a();
                hVar44 = this.b.q;
                return new com.google.android.apps.search.assistant.verticals.ambient.q.a.l(aVar, dw, aVar2, hVar206, hVar207, wA, hVar208, dS, hVar39, rVar, bVar4, cx, bVar5, crVar, pVar2, (dj) hVar44.a());
            case 18:
                hVar45 = this.f312a.H;
                cr crVar2 = (cr) hVar45.a();
                hVar46 = this.b.gJ;
                cg cgVar3 = (cg) hVar46.a();
                hVar47 = this.f312a.g;
                return new com.google.android.apps.search.assistant.verticals.ambient.d.a.e(crVar2, cgVar3, (com.google.android.libraries.g.a) hVar47.a(), Optional.empty());
            case 19:
                ik ikVar18 = this.b;
                jo joVar11 = this.f312a;
                com.google.apps.tiktok.q.b.h b = com.google.android.apps.search.assistant.verticals.ambient.d.a.f.b();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar18.kf();
                hVar48 = joVar11.w;
                return com.google.android.apps.search.assistant.verticals.ambient.d.a.f.c(b, kf2, (com.google.android.libraries.storage.a.j) hVar48.a());
            case 20:
                ik ikVar19 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.c el = ikVar19.el();
                hVar49 = ikVar19.hn;
                return com.google.android.apps.search.assistant.verticals.ambient.trigger.g.i.c(el, (com.google.android.apps.search.assistant.verticals.ambient.trigger.g.h) hVar49.a());
            case 21:
                hVar50 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar3 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar50.a();
                hVar51 = this.f312a.f;
                Context context2 = (Context) hVar51.a();
                ik ikVar20 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.m.a.b dB = ikVar20.dB();
                com.google.android.apps.search.assistant.verticals.ambient.l.b dz = ikVar20.dz();
                hVar52 = ikVar20.hl;
                com.google.android.apps.search.assistant.verticals.ambient.l.a.m mVar2 = (com.google.android.apps.search.assistant.verticals.ambient.l.a.m) hVar52.a();
                ik ikVar21 = this.b;
                jo joVar12 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.feedback.a.c dw2 = ikVar21.dw();
                jrVar5 = joVar12.b;
                Object a2 = jr.ch(jrVar5).a();
                hVar53 = this.f312a.H;
                ExecutorService executorService = (ExecutorService) hVar53.a();
                jrVar6 = this.f312a.b;
                double d = jrVar6.d();
                jrVar7 = this.f312a.b;
                double e = jrVar7.e();
                jrVar8 = this.f312a.b;
                return com.google.android.apps.search.assistant.verticals.ambient.trigger.g.i.b(aVar3, context2, dB, dz, mVar2, dw2, a2, executorService, d, e, jrVar8.f());
            case 22:
                hVar54 = this.f312a.f;
                Context context3 = (Context) hVar54.a();
                hVar55 = this.f312a.lM;
                com.google.android.libraries.search.location.o oVar = (com.google.android.libraries.search.location.o) hVar55.a();
                hVar56 = this.b.N;
                com.google.android.libraries.search.location.compliance.r rVar2 = (com.google.android.libraries.search.location.compliance.r) hVar56.a();
                Optional of3 = Optional.of(this.b.hB());
                ik ikVar22 = this.b;
                jo joVar13 = this.f312a;
                hVar57 = ikVar22.hi;
                jrVar9 = joVar13.b;
                return new com.google.android.libraries.search.location.y(context3, oVar, rVar2, of3, hVar57, Optional.of((com.google.android.gms.common.e) jr.dy(jrVar9).a()));
            case 23:
                hVar58 = this.f312a.f;
                hVar59 = this.f312a.Qu;
                cg cgVar4 = (cg) hVar59.a();
                hVar60 = this.f312a.H;
                cr crVar3 = (cr) hVar60.a();
                hVar61 = this.f312a.v;
                cr crVar4 = (cr) hVar61.a();
                hVar62 = this.b.q;
                dj djVar = (dj) hVar62.a();
                hVar63 = this.f312a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar63.a();
                hVar64 = this.f312a.iv;
                com.google.apps.tiktok.g.ax axVar2 = (com.google.apps.tiktok.g.ax) hVar64.a();
                hVar65 = this.b.J;
                com.google.android.libraries.search.t.a.a aVar5 = (com.google.android.libraries.search.t.a.a) hVar65.a();
                jrVar10 = this.f312a.b;
                be beVar = (be) jr.cg(jrVar10).a();
                hVar66 = this.f312a.iu;
                ay ayVar = (ay) hVar66.a();
                ik ikVar23 = this.b;
                jo joVar14 = this.f312a;
                com.google.android.libraries.search.location.compliance.at jn = ikVar23.jn();
                hVar67 = joVar14.an;
                return new com.google.android.libraries.search.location.compliance.r(cgVar4, crVar3, crVar4, djVar, aVar4, axVar2, aVar5, beVar, ayVar, jn);
            case 24:
                hVar68 = this.f312a.cq;
                Object a3 = hVar68.a();
                jo joVar15 = this.f312a;
                ik ikVar24 = this.b;
                hVar69 = joVar15.uW;
                return dm.b(a3, hVar69, ikVar24.rU(), dm.c());
            case 25:
                ik ikVar25 = this.b;
                Optional empty = Optional.empty();
                Optional empty2 = Optional.empty();
                hVar70 = ikVar25.gK;
                Optional of4 = Optional.of((com.google.br.d.a.a.e) hVar70.a());
                jo joVar16 = this.f312a;
                Optional empty3 = Optional.empty();
                Optional empty4 = Optional.empty();
                Optional empty5 = Optional.empty();
                hVar71 = joVar16.aY;
                return com.google.br.d.a.a.a.c.c(empty, empty2, of4, empty3, empty4, empty5, (com.google.br.d.a.a.e) hVar71.a());
            case 26:
                hVar72 = this.f312a.aY;
                return com.google.br.d.a.a.a.c.d((com.google.br.d.a.a.e) hVar72.a(), this.f312a.nY(), ha.r());
            case 27:
                ik ikVar26 = this.b;
                return new com.google.android.libraries.search.t.a.n("Account scoped", ikVar26.hE(), ikVar26.jt(), ikVar26.qY());
            case 28:
                hVar73 = this.b.r;
                return at.k((com.google.android.libraries.search.y.a.a.d) hVar73.a());
            case 29:
                hVar74 = this.b.p;
                com.google.br.d.a.a.e eVar = (com.google.br.d.a.a.e) hVar74.a();
                hVar75 = this.f312a.ba;
                return new com.google.android.libraries.search.y.a.a.d(eVar, Optional.of((com.google.frameworks.client.data.android.j.h) hVar75.a()));
            case 30:
                hVar76 = this.b.gN;
                return Optional.of((com.google.android.libraries.search.t.c.a.d) hVar76.a());
            case 31:
                ik ikVar27 = this.b;
                com.google.apps.tiktok.account.data.b.c kc = ikVar27.kc();
                hVar77 = ikVar27.t;
                hVar78 = ikVar27.u;
                return new com.google.android.libraries.search.t.c.a.d(kc, hVar77, (com.google.android.libraries.search.account.e.b) hVar78.a());
            case 32:
                jyVar4 = this.f312a.f319a;
                com.google.android.libraries.web.d.b bVar6 = (com.google.android.libraries.web.d.b) jy.fz(jyVar4).a();
                hVar79 = this.b.s;
                com.google.android.libraries.web.o.u uVar = (com.google.android.libraries.web.o.u) hVar79.a();
                hVar80 = this.f312a.bz;
                com.google.apps.tiktok.concurrent.ao aoVar = (com.google.apps.tiktok.concurrent.ao) hVar80.a();
                hVar81 = this.f312a.Q;
                ag agVar2 = (ag) hVar81.a();
                hVar82 = this.f312a.wS;
                m.c.n nVar = (m.c.n) hVar82.a();
                hVar83 = this.f312a.R;
                return new com.google.android.libraries.web.webview.i.a.a.i(bVar6, uVar, aoVar, agVar2, nVar, (m.c.n) hVar83.a());
            case 33:
                jyVar5 = this.f312a.f319a;
                com.google.android.libraries.web.o.w wVar = (com.google.android.libraries.web.o.w) jy.jm(jyVar5).a();
                hVar84 = this.b.g;
                AccountId accountId5 = (AccountId) hVar84.a();
                hVar85 = this.f312a.wC;
                com.google.android.libraries.web.webview.f.a.b bVar7 = (com.google.android.libraries.web.webview.f.a.b) hVar85.a();
                jyVar6 = this.f312a.f319a;
                com.google.android.libraries.web.d.b bVar8 = (com.google.android.libraries.web.d.b) jy.fz(jyVar6).a();
                hVar86 = this.f312a.wS;
                m.c.n nVar2 = (m.c.n) hVar86.a();
                hVar87 = this.f312a.Q;
                ag agVar3 = (ag) hVar87.a();
                hVar88 = this.f312a.f;
                return new com.google.android.libraries.web.o.u(wVar, accountId5, bVar7, bVar8, nVar2, agVar3, (Context) hVar88.a());
            case 34:
                hVar89 = this.b.gM;
                cg cgVar5 = (cg) hVar89.a();
                ik ikVar28 = this.b;
                Set xx = ik.xx();
                hVar90 = ikVar28.g;
                AccountId accountId6 = (AccountId) hVar90.a();
                hVar91 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar9 = (com.google.apps.tiktok.account.data.b) hVar91.a();
                hVar92 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar92.a();
                hVar93 = this.f312a.H;
                return new com.google.android.libraries.search.account.e.j(cgVar5, xx, accountId6, bVar9, dVar, (Executor) hVar93.a(), this.b.tE());
            case 35:
                ik ikVar29 = this.b;
                jo joVar17 = this.f312a;
                com.google.apps.tiktok.q.b.h kC = ikVar29.kC();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar29.kf();
                hVar94 = joVar17.w;
                return com.google.android.libraries.search.account.e.a.b(kC, kf3, (com.google.android.libraries.storage.a.j) hVar94.a());
            case 36:
                return ha.o(this.b.rT());
            case 37:
                hVar95 = this.f312a.ez;
                com.google.common.v.f fVar = (com.google.common.v.f) hVar95.a();
                hVar96 = this.b.gP;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.x(fVar, (cg) hVar96.a(), this.b.ws());
            case 38:
                ik ikVar30 = this.b;
                jo joVar18 = this.f312a;
                com.google.apps.tiktok.q.b.h b2 = com.google.android.apps.search.assistant.surfaces.voice.robin.x.y.b();
                com.google.apps.tiktok.account.d.b.a.b kg3 = ikVar30.kg();
                hVar97 = joVar18.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.x.y.c(b2, kg3, (com.google.android.libraries.storage.a.j) hVar97.a());
            case 39:
                ik ikVar31 = this.b;
                jo joVar19 = this.f312a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.v.c();
                com.google.apps.tiktok.account.d.b.a.b kg4 = ikVar31.kg();
                hVar98 = joVar19.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.v.b(c, kg4, (com.google.android.libraries.storage.a.j) hVar98.a());
            case 40:
                hVar99 = this.b.gR;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.g((cg) hVar99.a(), this.b.uH());
            case 41:
                ik ikVar32 = this.b;
                jo joVar20 = this.f312a;
                com.google.apps.tiktok.q.b.h b3 = com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.h.b();
                com.google.apps.tiktok.account.d.b.a.b kg5 = ikVar32.kg();
                hVar100 = joVar20.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.h.c(b3, kg5, (com.google.android.libraries.storage.a.j) hVar100.a());
            case 42:
                ik ikVar33 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.ao cL = ikVar33.cL();
                hVar101 = ikVar33.y;
                cg cgVar6 = (cg) hVar101.a();
                hVar102 = this.b.gS;
                cg cgVar7 = (cg) hVar102.a();
                hVar103 = this.b.gT;
                cg cgVar8 = (cg) hVar103.a();
                hVar104 = this.b.gU;
                cg cgVar9 = (cg) hVar104.a();
                hVar105 = this.b.gV;
                cg cgVar10 = (cg) hVar105.a();
                ik ikVar34 = this.b;
                jo joVar21 = this.f312a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.m cD = ikVar34.cD();
                com.google.android.apps.search.assistant.surfaces.voice.robin.j.b.b bg = ikVar34.bg();
                boolean sU = ikVar34.sU();
                hVar106 = joVar21.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar106.a();
                hVar107 = this.f312a.iu;
                ay ayVar2 = (ay) hVar107.a();
                Optional of5 = Optional.of(this.b.cI());
                Optional of6 = Optional.of(this.b.cJ());
                hVar108 = this.f312a.bo;
                ag agVar4 = (ag) hVar108.a();
                hVar109 = this.f312a.Q;
                ag agVar5 = (ag) hVar109.a();
                hVar110 = this.f312a.f;
                Context context4 = (Context) hVar110.a();
                hVar111 = this.f312a.Y;
                String str2 = (String) hVar111.a();
                jrVar11 = this.f312a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar3 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar11).a();
                ik ikVar35 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am(cL, cgVar6, cgVar7, cgVar8, cgVar9, cgVar10, cD, bg, sU, fVar2, ayVar2, of5, of6, agVar4, agVar5, context4, str2, pVar3, ikVar35.sX(), ikVar35.sZ(), ikVar35.tc(), ikVar35.ti(), ikVar35.tr(), ikVar35.tw(), ikVar35.ty(), ikVar35.bn(), ikVar35.wp(), ikVar35.wq());
            case 43:
                ik ikVar36 = this.b;
                jo joVar22 = this.f312a;
                com.google.apps.tiktok.q.b.h m = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.m();
                com.google.apps.tiktok.account.d.b.a.b kg6 = ikVar36.kg();
                hVar112 = joVar22.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.l(m, kg6, (com.google.android.libraries.storage.a.j) hVar112.a());
            case 44:
                ik ikVar37 = this.b;
                jo joVar23 = this.f312a;
                com.google.apps.tiktok.q.b.h f = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.f();
                com.google.apps.tiktok.account.d.b.a.b kg7 = ikVar37.kg();
                hVar113 = joVar23.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.k(f, kg7, (com.google.android.libraries.storage.a.j) hVar113.a());
            case 45:
                ik ikVar38 = this.b;
                jo joVar24 = this.f312a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.c();
                com.google.apps.tiktok.account.d.b.a.b kg8 = ikVar38.kg();
                hVar114 = joVar24.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.g(c2, kg8, (com.google.android.libraries.storage.a.j) hVar114.a());
            case 46:
                ik ikVar39 = this.b;
                jo joVar25 = this.f312a;
                com.google.apps.tiktok.q.b.h e2 = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.e();
                com.google.apps.tiktok.account.d.b.a.b kg9 = ikVar39.kg();
                hVar115 = joVar25.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.j(e2, kg9, (com.google.android.libraries.storage.a.j) hVar115.a());
            case 47:
                ik ikVar40 = this.b;
                jo joVar26 = this.f312a;
                com.google.apps.tiktok.q.b.h d2 = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.d();
                com.google.apps.tiktok.account.d.b.a.b kg10 = ikVar40.kg();
                hVar116 = joVar26.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.i(d2, kg10, (com.google.android.libraries.storage.a.j) hVar116.a());
            case 48:
                ik ikVar41 = this.b;
                jo joVar27 = this.f312a;
                com.google.apps.tiktok.q.b.h b4 = com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.f.b();
                com.google.apps.tiktok.account.d.b.a.b kg11 = ikVar41.kg();
                hVar117 = joVar27.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.f.c(b4, kg11, (com.google.android.libraries.storage.a.j) hVar117.a());
            case 49:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.o.a.h.c(this.b.qh());
            case 50:
                ik ikVar42 = this.b;
                boolean ua = ikVar42.ua();
                hVar118 = ikVar42.gY;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.a.d(ua, (com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.a.j) hVar118.a());
            case 51:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.a.e.b(this.b.qh());
            case 52:
                hVar119 = this.b.z;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am amVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) hVar119.a();
                hVar120 = this.b.ha;
                cg cgVar11 = (cg) hVar120.a();
                jrVar12 = this.f312a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar4 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar12).a();
                hVar121 = this.f312a.Y;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.ui.am(amVar2, cgVar11, pVar4, (String) hVar121.a());
            case 53:
                ik ikVar43 = this.b;
                jo joVar28 = this.f312a;
                com.google.apps.tiktok.q.b.h c3 = bj.c();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar43.kf();
                hVar122 = joVar28.w;
                return bj.b(c3, kf4, (com.google.android.libraries.storage.a.j) hVar122.a());
            case 54:
                ik ikVar44 = this.b;
                return com.google.android.libraries.search.t.c.l.b(ikVar44.js(), ikVar44.jr());
            case 55:
                return new nz(this);
            case 56:
                return new lt(this);
            case 57:
                return new lt(this);
            case 58:
                ik ikVar45 = this.b;
                jo joVar29 = this.f312a;
                com.google.apps.tiktok.q.b.h c4 = com.google.android.apps.search.omnient.f.e.c();
                com.google.apps.tiktok.account.d.b.f kf5 = ikVar45.kf();
                hVar123 = joVar29.w;
                return com.google.android.apps.search.omnient.f.e.b(c4, kf5, (com.google.android.libraries.storage.a.j) hVar123.a());
            case 59:
                hVar124 = this.b.I;
                return new com.google.android.apps.search.googleapp.t.a(hVar124);
            case 60:
                hVar125 = this.f312a.H;
                Executor executor = (Executor) hVar125.a();
                ik ikVar46 = this.b;
                jo joVar30 = this.f312a;
                com.google.android.apps.search.googleapp.t.ad eN = ikVar46.eN();
                com.google.apps.tiktok.account.data.b.c kc2 = ikVar46.kc();
                hVar126 = joVar30.v;
                cr crVar5 = (cr) hVar126.a();
                ik ikVar47 = this.b;
                jo joVar31 = this.f312a;
                com.google.protos.u.d lE = ikVar47.lE();
                jrVar13 = joVar31.b;
                return new com.google.android.apps.search.googleapp.t.o(executor, eN, kc2, crVar5, lE, jrVar13.ba());
            case 61:
                ik ikVar48 = this.b;
                com.google.android.libraries.search.t.c.u jt = ikVar48.jt();
                hVar127 = ikVar48.F;
                return com.google.android.apps.search.googleapp.x.a.c.c(jt, Optional.of((com.google.android.libraries.search.t.e.j) hVar127.a()));
            case 62:
                jrVar14 = this.f312a.b;
                boolean gp = jrVar14.gp();
                jrVar15 = this.f312a.b;
                com.google.protobuf.ao aX = jrVar15.aX();
                jrVar16 = this.f312a.b;
                com.google.protobuf.ao aY = jrVar16.aY();
                hVar128 = this.f312a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar128.a();
                hVar129 = this.f312a.Q;
                ag agVar6 = (ag) hVar129.a();
                hVar130 = this.b.hd;
                return new com.google.android.libraries.search.t.e.j(gp, aX, aY, aVar6, agVar6, (cg) hVar130.a());
            case 63:
                ik ikVar49 = this.b;
                jo joVar32 = this.f312a;
                com.google.apps.tiktok.q.b.h b5 = com.google.android.libraries.search.t.e.k.b();
                com.google.apps.tiktok.account.d.b.f kf6 = ikVar49.kf();
                hVar131 = joVar32.w;
                return com.google.android.libraries.search.t.e.k.e(b5, kf6, (com.google.android.libraries.storage.a.j) hVar131.a());
            case 64:
                ik ikVar50 = this.b;
                jo joVar33 = this.f312a;
                com.google.apps.tiktok.q.b.h b6 = com.google.android.apps.search.googleapp.t.m.b();
                com.google.apps.tiktok.account.d.b.f kf7 = ikVar50.kf();
                hVar132 = joVar33.w;
                return com.google.android.apps.search.googleapp.t.m.e(b6, kf7, (com.google.android.libraries.storage.a.j) hVar132.a());
            case 65:
                return new ii(this);
            case 66:
                return new nz(this);
            case 67:
                return new ij(this);
            case 68:
                jyVar7 = this.f312a.f319a;
                return new com.google.android.libraries.web.a.a.c((com.google.android.libraries.web.a.a.a) jy.fb(jyVar7).a());
            case 69:
                ik ikVar51 = this.b;
                jo joVar34 = this.f312a;
                com.google.apps.tiktok.q.b.h kv = ikVar51.kv();
                com.google.apps.tiktok.account.d.b.f kf8 = ikVar51.kf();
                hVar133 = joVar34.w;
                return com.google.android.libraries.web.o.a.a.a.af.b(kv, kf8, (com.google.android.libraries.storage.a.j) hVar133.a());
            case 70:
                ik ikVar52 = this.b;
                jo joVar35 = this.f312a;
                com.google.apps.tiktok.q.b.h c5 = com.google.android.libraries.search.location.compliance.a.g.c();
                com.google.apps.tiktok.account.d.b.f kf9 = ikVar52.kf();
                hVar134 = joVar35.w;
                return com.google.android.libraries.search.location.compliance.a.g.b(c5, kf9, (com.google.android.libraries.storage.a.j) hVar134.a());
            case 71:
                return new com.google.android.libraries.search.location.s();
            case 72:
                ik ikVar53 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.l.m dA = ikVar53.dA();
                ikVar53.jm();
                ik ikVar54 = this.b;
                jo joVar36 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.m.a.b dB2 = ikVar54.dB();
                hVar135 = joVar36.v;
                Executor executor2 = (Executor) hVar135.a();
                hVar136 = this.f312a.f;
                Context context5 = (Context) hVar136.a();
                hVar137 = this.f312a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar3 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar137.a();
                hVar138 = this.f312a.nM;
                return new com.google.android.apps.search.assistant.verticals.ambient.l.a.m(dA, dB2, executor2, context5, rVar3, (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar138.a());
            case 73:
                hVar139 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar7 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar139.a();
                jrVar17 = this.f312a.b;
                com.google.android.apps.search.assistant.verticals.ambient.r.c.d T = jrVar17.T();
                jrVar18 = this.f312a.b;
                com.google.android.apps.search.assistant.verticals.ambient.r.c.d U = jrVar18.U();
                hVar140 = this.f312a.v;
                cq cqVar4 = (cq) hVar140.a();
                ik ikVar55 = this.b;
                return new com.google.android.apps.search.assistant.verticals.ambient.r.d.d(aVar7, T, U, cqVar4, ikVar55.dO(), ikVar55.dN());
            case 74:
                hVar141 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar8 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar141.a();
                hVar142 = this.f312a.v;
                cq cqVar5 = (cq) hVar142.a();
                ik ikVar56 = this.b;
                jo joVar37 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.r.b.m dN = ikVar56.dN();
                com.google.android.apps.search.assistant.verticals.ambient.r.c.c dO = ikVar56.dO();
                jrVar19 = joVar37.b;
                com.google.android.apps.search.assistant.verticals.ambient.r.c.d U2 = jrVar19.U();
                hVar143 = this.b.hj;
                return new com.google.android.apps.search.assistant.verticals.ambient.r.b.e(aVar8, cqVar5, dN, dO, U2, (com.google.android.apps.search.assistant.verticals.ambient.r.d.d) hVar143.a());
            case 75:
                hVar144 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar9 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar144.a();
                hVar145 = this.b.P;
                p pVar5 = (p) hVar145.a();
                hVar146 = this.f312a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar4 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar146.a();
                ik ikVar57 = this.b;
                jo joVar38 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.i.d.p dx = ikVar57.dx();
                hVar147 = joVar38.H;
                return new com.google.android.apps.search.assistant.verticals.ambient.i.c.a.m(aVar9, pVar5, rVar4, dx, (ExecutorService) hVar147.a());
            case 76:
                ik ikVar58 = this.b;
                jo joVar39 = this.f312a;
                com.google.android.libraries.search.udcdataservice.facs.j jP = ikVar58.jP();
                com.google.android.libraries.search.udcdataservice.ulr.k jQ = ikVar58.jQ();
                hVar148 = joVar39.H;
                cq cqVar6 = (cq) hVar148.a();
                hVar149 = this.f312a.v;
                cq cqVar7 = (cq) hVar149.a();
                hVar150 = this.b.g;
                AccountId accountId7 = (AccountId) hVar150.a();
                jyVar8 = this.f312a.f319a;
                return new com.google.android.libraries.search.udcdataservice.k(jP, jQ, cqVar6, cqVar7, accountId7, jyVar8.ez());
            case 77:
                ik ikVar59 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.l.m dA2 = ikVar59.dA();
                ikVar59.dB();
                hVar151 = this.f312a.v;
                return new com.google.android.apps.search.assistant.verticals.ambient.l.b.a(dA2, (Executor) hVar151.a());
            case 78:
                ik ikVar60 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.c el2 = ikVar60.el();
                hVar152 = ikVar60.hJ;
                return com.google.android.apps.search.assistant.verticals.ambient.trigger.e.j.b(el2, (com.google.android.apps.search.assistant.verticals.ambient.trigger.e.a) hVar152.a());
            case 79:
                hVar153 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar10 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar153.a();
                ik ikVar61 = this.b;
                jo joVar40 = this.f312a;
                com.google.android.apps.search.assistant.platform.pcp.api.l H = ikVar61.H();
                jrVar20 = joVar40.b;
                return new com.google.android.apps.search.assistant.verticals.ambient.trigger.e.a(aVar10, H, jrVar20.gw());
            case 80:
                ik ikVar62 = this.b;
                hVar154 = ikVar62.hv;
                hVar155 = ikVar62.X;
                return new com.google.android.apps.search.assistant.platform.pcp.h.a(hVar154, (com.google.apps.tiktok.p.b.c) hVar155.a());
            case 81:
                ik ikVar63 = this.b;
                jo joVar41 = this.f312a;
                hVar156 = ikVar63.V;
                jrVar21 = joVar41.b;
                com.google.apps.tiktok.p.m mVar3 = (com.google.apps.tiktok.p.m) jr.dA(jrVar21).a();
                hVar157 = this.f312a.mh;
                com.google.apps.tiktok.p.u uVar2 = (com.google.apps.tiktok.p.u) hVar157.a();
                hVar158 = this.f312a.mb;
                return com.google.android.apps.search.assistant.platform.pcp.h.p.b(hVar156, mVar3, uVar2, (com.google.frameworks.client.data.android.d) hVar158.a(), at.i());
            case 82:
                ik ikVar64 = this.b;
                jo joVar42 = this.f312a;
                Map rp = ikVar64.rp();
                hVar159 = joVar42.QP;
                return com.google.apps.tiktok.p.z.b(rp, (bk) hVar159.a(), this.f312a.VX());
            case 83:
                hVar160 = this.f312a.lR;
                com.google.apps.tiktok.p.b bVar10 = (com.google.apps.tiktok.p.b) hVar160.a();
                hVar161 = this.b.g;
                return new com.google.apps.tiktok.account.c.c(bVar10, (AccountId) hVar161.a());
            case 84:
                hVar162 = this.b.g;
                AccountId accountId8 = (AccountId) hVar162.a();
                hVar163 = this.f312a.ap;
                com.google.apps.tiktok.account.data.ao aoVar2 = (com.google.apps.tiktok.account.data.ao) hVar163.a();
                hVar164 = this.f312a.bq;
                return new com.google.apps.tiktok.p.b.f(accountId8, aoVar2, (com.google.apps.tiktok.account.data.a.d) hVar164.a(), at.k(com.google.apps.tiktok.account.data.a.v.b()));
            case 85:
                hVar165 = this.b.ht;
                return com.google.android.libraries.search.trust.b.b.e.b(hVar165);
            case 86:
                hVar166 = this.b.W;
                com.google.android.libraries.search.trust.b.y yVar = (com.google.android.libraries.search.trust.b.y) hVar166.a();
                hVar167 = this.b.g;
                AccountId accountId9 = (AccountId) hVar167.a();
                hVar168 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar11 = (com.google.apps.tiktok.account.data.b) hVar168.a();
                ik ikVar65 = this.b;
                jo joVar43 = this.f312a;
                boolean tV = ikVar65.tV();
                hVar169 = joVar43.H;
                return new com.google.android.libraries.search.trust.b.b.d(yVar, accountId9, bVar11, tV, (cq) hVar169.a());
            case 87:
                hVar170 = this.b.hr;
                cg cgVar12 = (cg) hVar170.a();
                hVar171 = this.b.hs;
                com.google.android.libraries.search.trust.b.f fVar3 = (com.google.android.libraries.search.trust.b.f) hVar171.a();
                ik ikVar66 = this.b;
                jo joVar44 = this.f312a;
                Set sa = ikVar66.sa();
                com.google.android.libraries.search.trust.b.aj jM = ikVar66.jM();
                hVar172 = joVar44.iv;
                com.google.apps.tiktok.g.ax axVar3 = (com.google.apps.tiktok.g.ax) hVar172.a();
                hVar173 = this.f312a.iu;
                ay ayVar3 = (ay) hVar173.a();
                hVar174 = this.b.t;
                com.google.android.libraries.web.webview.i.a.a.i iVar2 = (com.google.android.libraries.web.webview.i.a.a.i) hVar174.a();
                ik ikVar67 = this.b;
                com.google.android.libraries.web.o.j jU = ikVar67.jU();
                com.google.at.f.a.i kW = ikVar67.kW();
                hVar175 = ikVar67.g;
                AccountId accountId10 = (AccountId) hVar175.a();
                hVar176 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar12 = (com.google.apps.tiktok.account.data.b) hVar176.a();
                hVar177 = this.f312a.v;
                cq cqVar8 = (cq) hVar177.a();
                ik ikVar68 = this.b;
                jo joVar45 = this.f312a;
                com.google.android.libraries.search.trust.b.a.a jN = ikVar68.jN();
                hVar178 = joVar45.H;
                cq cqVar9 = (cq) hVar178.a();
                ik ikVar69 = this.b;
                jo joVar46 = this.f312a;
                boolean tV2 = ikVar69.tV();
                boolean tW = ikVar69.tW();
                boolean ub = ikVar69.ub();
                hVar179 = joVar46.ez;
                return new com.google.android.libraries.search.trust.b.y(cgVar12, fVar3, sa, jM, axVar3, ayVar3, iVar2, jU, kW, accountId10, bVar12, cqVar8, jN, cqVar9, tV2, tW, ub, (com.google.common.v.f) hVar179.a());
            case 88:
                ik ikVar70 = this.b;
                jo joVar47 = this.f312a;
                com.google.apps.tiktok.q.b.h kz = ikVar70.kz();
                com.google.apps.tiktok.account.d.b.a.b kg12 = ikVar70.kg();
                hVar180 = joVar47.w;
                return com.google.android.libraries.search.trust.b.d.c(kz, kg12, (com.google.android.libraries.storage.a.j) hVar180.a());
            case 89:
                return new com.google.android.libraries.search.trust.b.f();
            case 90:
                return new com.google.android.libraries.search.trust.b.e();
            case 91:
                ik ikVar71 = this.b;
                jo joVar48 = this.f312a;
                com.google.apps.tiktok.q.b.h kA = ikVar71.kA();
                com.google.apps.tiktok.account.d.b.a.b kg13 = ikVar71.kg();
                hVar181 = joVar48.w;
                return com.google.android.libraries.search.trust.b.d.b(kA, kg13, (com.google.android.libraries.storage.a.j) hVar181.a());
            case 92:
                ik ikVar72 = this.b;
                jo joVar49 = this.f312a;
                com.google.apps.tiktok.q.b.h kB = ikVar72.kB();
                com.google.apps.tiktok.account.d.b.a.b kg14 = ikVar72.kg();
                hVar182 = joVar49.w;
                return com.google.android.libraries.search.trust.b.d.d(kB, kg14, (com.google.android.libraries.storage.a.j) hVar182.a());
            case 93:
                return new com.google.apps.tiktok.p.b.c();
            case 94:
                hVar183 = this.f312a.v;
                Executor executor3 = (Executor) hVar183.a();
                hVar184 = this.b.g;
                AccountId accountId11 = (AccountId) hVar184.a();
                hVar185 = this.f312a.f;
                Context context6 = (Context) hVar185.a();
                ik ikVar73 = this.b;
                com.google.android.apps.search.assistant.platform.pcp.d.c P = ikVar73.P();
                hVar186 = ikVar73.hx;
                as asVar = (as) hVar186.a();
                ik ikVar74 = this.b;
                com.google.android.apps.search.assistant.platform.pcp.j.n S = ikVar74.S();
                boolean uu = ikVar74.uu();
                hVar187 = ikVar74.Z;
                return new com.google.android.apps.search.assistant.platform.pcp.h.j(executor3, accountId11, context6, P, asVar, S, uu, (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar187.a());
            case 95:
                ik ikVar75 = this.b;
                return new as(ikVar75.pV(), ikVar75.pX(), ikVar75.pY(), ikVar75.pZ(), ikVar75.qa(), ikVar75.qb(), ikVar75.qc(), ikVar75.qd(), ikVar75.qe(), ikVar75.pW());
            case 96:
                hVar188 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar2 = (com.google.apps.tiktok.account.data.a.d) hVar188.a();
                hVar189 = this.b.g;
                AccountId accountId12 = (AccountId) hVar189.a();
                hVar190 = this.f312a.v;
                return new com.google.android.libraries.search.integrations.c.a.c(dVar2, accountId12, (cq) hVar190.a(), this.b.jj());
            case 97:
                hVar191 = this.f312a.v;
                Executor executor4 = (Executor) hVar191.a();
                hVar192 = this.b.hy;
                com.google.android.apps.search.assistant.platform.pcp.h.j jVar = (com.google.android.apps.search.assistant.platform.pcp.h.j) hVar192.a();
                hVar193 = this.f312a.f;
                Context context7 = (Context) hVar193.a();
                hVar194 = this.b.g;
                AccountId accountId13 = (AccountId) hVar194.a();
                hVar195 = this.f312a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar195.a();
                Optional of7 = Optional.of(this.f312a.fn());
                jo joVar50 = this.f312a;
                ik ikVar76 = this.b;
                as fm = joVar50.fm();
                bc W = ikVar76.W();
                hVar196 = joVar50.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar12 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar196.a();
                hVar197 = this.f312a.nN;
                return new com.google.android.apps.search.assistant.platform.pcp.h.o(executor4, jVar, context7, accountId13, aVar11, of7, fm, W, aVar12, (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar197.a());
            case 98:
                jo joVar51 = this.f312a;
                com.google.apps.tiktok.d.af mA = joVar51.mA();
                hVar198 = joVar51.f;
                Context context8 = (Context) hVar198.a();
                hVar199 = this.f312a.iu;
                ay ayVar4 = (ay) hVar199.a();
                hVar200 = this.f312a.n;
                cq cqVar10 = (cq) hVar200.a();
                hVar201 = this.f312a.g;
                com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) hVar201.a();
                hVar202 = this.b.q;
                dj djVar2 = (dj) hVar202.a();
                hVar203 = this.f312a.B;
                return new com.google.apps.tiktok.g.p(mA, context8, ayVar4, cqVar10, aVar13, djVar2, (Executor) hVar203.a());
            case 99:
                hVar204 = this.f312a.Th;
                lt ltVar = (lt) hVar204.a();
                ik ikVar77 = this.b;
                return com.google.android.apps.search.assistant.verticals.ambient.p.a.a.f.b(ltVar, ikVar77.dK(), ikVar77.dH(), ikVar77.dF());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        h hVar14;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        h hVar19;
        h hVar20;
        h hVar21;
        h hVar22;
        h hVar23;
        h hVar24;
        h hVar25;
        h hVar26;
        h hVar27;
        h hVar28;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        h hVar33;
        h hVar34;
        h hVar35;
        h hVar36;
        h hVar37;
        h hVar38;
        h hVar39;
        h hVar40;
        h hVar41;
        h hVar42;
        h hVar43;
        jr jrVar;
        h hVar44;
        h hVar45;
        h hVar46;
        h hVar47;
        h hVar48;
        h hVar49;
        h hVar50;
        h hVar51;
        h hVar52;
        h hVar53;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        h hVar58;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        h hVar66;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        h hVar71;
        h hVar72;
        h hVar73;
        h hVar74;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        h hVar80;
        h hVar81;
        h hVar82;
        h hVar83;
        h hVar84;
        h hVar85;
        h hVar86;
        jy jyVar;
        h hVar87;
        jr jrVar2;
        h hVar88;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        jr jrVar3;
        h hVar93;
        h hVar94;
        h hVar95;
        h hVar96;
        h hVar97;
        h hVar98;
        h hVar99;
        h hVar100;
        h hVar101;
        h hVar102;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        h hVar112;
        h hVar113;
        h hVar114;
        h hVar115;
        jr jrVar4;
        h hVar116;
        h hVar117;
        jr jrVar5;
        h hVar118;
        h hVar119;
        h hVar120;
        jr jrVar6;
        h hVar121;
        h hVar122;
        jr jrVar7;
        jr jrVar8;
        h hVar123;
        jr jrVar9;
        jr jrVar10;
        jr jrVar11;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        jr jrVar12;
        jr jrVar13;
        jr jrVar14;
        jr jrVar15;
        h hVar128;
        h hVar129;
        h hVar130;
        jr jrVar16;
        h hVar131;
        h hVar132;
        h hVar133;
        jr jrVar17;
        jr jrVar18;
        jr jrVar19;
        h hVar134;
        h hVar135;
        h hVar136;
        h hVar137;
        jr jrVar20;
        h hVar138;
        h hVar139;
        h hVar140;
        jr jrVar21;
        h hVar141;
        jr jrVar22;
        jr jrVar23;
        h hVar142;
        h hVar143;
        h hVar144;
        h hVar145;
        h hVar146;
        h hVar147;
        h hVar148;
        h hVar149;
        h hVar150;
        h hVar151;
        h hVar152;
        h hVar153;
        h hVar154;
        h hVar155;
        h hVar156;
        h hVar157;
        h hVar158;
        h hVar159;
        h hVar160;
        h hVar161;
        h hVar162;
        jr jrVar24;
        jr jrVar25;
        h hVar163;
        jr jrVar26;
        h hVar164;
        h hVar165;
        h hVar166;
        h hVar167;
        h hVar168;
        h hVar169;
        h hVar170;
        h hVar171;
        jr jrVar27;
        h hVar172;
        h hVar173;
        h hVar174;
        h hVar175;
        h hVar176;
        h hVar177;
        h hVar178;
        h hVar179;
        h hVar180;
        jy jyVar2;
        h hVar181;
        jy jyVar3;
        h hVar182;
        h hVar183;
        h hVar184;
        h hVar185;
        h hVar186;
        int i = this.c;
        switch (i) {
            case 100:
                hVar = this.b.ab;
                com.google.android.apps.search.assistant.verticals.ambient.i.c.a.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.i.c.a.r) hVar.a();
                hVar2 = this.f312a.v;
                cq cqVar = (cq) hVar2.a();
                hVar3 = this.b.hA;
                com.google.android.apps.search.assistant.verticals.ambient.i.e eVar = (com.google.android.apps.search.assistant.verticals.ambient.i.e) hVar3.a();
                hVar4 = this.f312a.h;
                return new com.google.android.apps.search.assistant.verticals.ambient.i.d.m(rVar, cqVar, eVar, (PackageManager) hVar4.a(), this.b.lo());
            case 101:
                hVar5 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar5.a();
                hVar6 = this.b.P;
                p pVar = (p) hVar6.a();
                hVar7 = this.f312a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar2 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar7.a();
                hVar8 = this.f312a.ez;
                com.google.common.v.f fVar = (com.google.common.v.f) hVar8.a();
                ik ikVar = this.b;
                jo joVar = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.i.d.p dx = ikVar.dx();
                hVar9 = joVar.H;
                return new com.google.android.apps.search.assistant.verticals.ambient.i.c.a.r(aVar, pVar, rVar2, fVar, dx, (ExecutorService) hVar9.a());
            case 102:
                hVar10 = this.b.ac;
                com.google.android.apps.search.assistant.verticals.ambient.i.c.a.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.i.c.a.a) hVar10.a();
                hVar11 = this.f312a.v;
                cq cqVar2 = (cq) hVar11.a();
                hVar12 = this.f312a.ez;
                return new com.google.android.apps.search.assistant.verticals.ambient.i.d.y(aVar2, cqVar2);
            case 103:
                hVar13 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar3 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar13.a();
                hVar14 = this.b.P;
                p pVar2 = (p) hVar14.a();
                hVar15 = this.f312a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar3 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar15.a();
                ik ikVar2 = this.b;
                jo joVar2 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.i.d.p dx2 = ikVar2.dx();
                hVar16 = joVar2.H;
                return new com.google.android.apps.search.assistant.verticals.ambient.i.c.a.a(aVar3, pVar2, rVar3, dx2, (ExecutorService) hVar16.a());
            case 104:
                return new lt(this);
            case 105:
                ik ikVar3 = this.b;
                jo joVar3 = this.f312a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.assistant.verticals.ambient.s.g.c.c.c();
                com.google.apps.tiktok.account.d.b.f kf = ikVar3.kf();
                hVar17 = joVar3.w;
                return com.google.android.apps.search.assistant.verticals.ambient.s.g.c.c.d(c, kf, (com.google.android.libraries.storage.a.j) hVar17.a());
            case 106:
                return com.google.android.apps.search.assistant.verticals.ambient.n.ab.b(this.b.jt());
            case 107:
                return com.google.android.apps.search.assistant.verticals.ambient.n.ab.d(this.b.ju());
            case 108:
                jo joVar4 = this.f312a;
                ik ikVar4 = this.b;
                Object VF = joVar4.VF();
                hVar18 = ikVar4.ag;
                com.google.android.apps.search.assistant.platform.g.g.b.f fVar2 = (com.google.android.apps.search.assistant.platform.g.g.b.f) hVar18.a();
                Optional of = Optional.of(this.b.ab());
                hVar19 = this.f312a.hH;
                return new com.google.android.apps.search.assistant.platform.g.g.b.c((com.google.android.apps.search.assistant.platform.g.g.b.k) VF, fVar2, of, Optional.of((Boolean) hVar19.a()));
            case 109:
                hVar20 = this.f312a.H;
                cq cqVar3 = (cq) hVar20.a();
                hVar21 = this.b.hD;
                return new com.google.android.apps.search.assistant.platform.g.g.b.f(cqVar3, (cg) hVar21.a());
            case 110:
                ik ikVar5 = this.b;
                jo joVar5 = this.f312a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.assistant.platform.g.g.b.r.c();
                com.google.apps.tiktok.account.d.b.a.b kg = ikVar5.kg();
                hVar22 = joVar5.w;
                return com.google.android.apps.search.assistant.platform.g.g.b.r.b(c2, kg, (com.google.android.libraries.storage.a.j) hVar22.a());
            case 111:
                hVar23 = this.f312a.Q;
                ag agVar = (ag) hVar23.a();
                hVar24 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar24.a();
                ik ikVar6 = this.b;
                jo joVar6 = this.f312a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.d.ah aV = ikVar6.aV();
                boolean uF = ikVar6.uF();
                hVar25 = joVar6.ez;
                return new ap(agVar, bVar, aV, uF, (com.google.common.v.f) hVar25.a());
            case 112:
                hVar26 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.d.n.b((com.google.android.apps.search.assistant.platform.g.c.g) hVar26.a());
            case 113:
                hVar27 = this.f312a.mO;
                com.google.android.apps.search.assistant.platform.g.c.g gVar = (com.google.android.apps.search.assistant.platform.g.c.g) hVar27.a();
                com.google.android.apps.search.assistant.platform.g.c.b.b.b(gVar);
                return gVar;
            case 114:
                hVar28 = this.f312a.f;
                Context context = (Context) hVar28.a();
                hVar29 = this.f312a.Q;
                return new com.google.android.libraries.search.ai.d(context, (ag) hVar29.a());
            case 115:
                return new lt(this);
            case 116:
                hVar30 = this.b.hG;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p pVar3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p) hVar30.a();
                hVar31 = this.f312a.nM;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e(pVar3, (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar31.a());
            case 117:
                hVar32 = this.f312a.f;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p((Context) hVar32.a(), this.f312a.abD());
            case 118:
                return new lt(this);
            case 119:
                ik ikVar7 = this.b;
                jo joVar7 = this.f312a;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.d.j K = ikVar7.K();
                hVar33 = joVar7.H;
                cq cqVar4 = (cq) hVar33.a();
                hVar34 = this.f312a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar4 = (com.google.apps.tiktok.contrib.work.b.p) hVar34.a();
                hVar35 = this.f312a.v;
                cr crVar = (cr) hVar35.a();
                jo joVar8 = this.f312a;
                as fm = joVar8.fm();
                hVar36 = joVar8.wu;
                com.google.android.libraries.assistant.pcp.v.b.g gVar2 = (com.google.android.libraries.assistant.pcp.v.b.g) hVar36.a();
                hVar37 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar4 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar37.a();
                hVar38 = this.f312a.f;
                return new ac(K, cqVar4, pVar4, crVar, fm, gVar2, aVar4, (Context) hVar38.a());
            case 120:
                hVar39 = this.b.ao;
                ac acVar = (ac) hVar39.a();
                hVar40 = this.f312a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar5 = (com.google.apps.tiktok.contrib.work.b.p) hVar40.a();
                jo joVar9 = this.f312a;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m(acVar, pVar5, joVar9.on(), joVar9.fm());
            case 121:
                hVar41 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar5 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar41.a();
                ik ikVar8 = this.b;
                jo joVar10 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h wB = ikVar8.wB();
                hVar42 = joVar10.H;
                return new com.google.android.apps.search.assistant.verticals.ambient.trigger.f.b(aVar5, wB);
            case 122:
                hVar43 = this.f312a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar6 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar43.a();
                jrVar = this.f312a.b;
                return new com.google.android.apps.search.assistant.verticals.ambient.trigger.h.a(aVar6, (androidx.slice.j) jr.ev(jrVar).a(), this.b.uG());
            case 123:
                ik ikVar9 = this.b;
                return com.google.android.apps.search.assistant.verticals.ambient.trigger.c.i.b(ikVar9.el(), ikVar9.em());
            case 124:
                ik ikVar10 = this.b;
                jo joVar11 = this.f312a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.apps.search.assistant.verticals.ambient.s.g.a.j.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar10.kf();
                hVar44 = joVar11.w;
                return com.google.android.apps.search.assistant.verticals.ambient.s.g.a.j.b(c3, kf2, (com.google.android.libraries.storage.a.j) hVar44.a());
            case 125:
                ik ikVar11 = this.b;
                return ha.u(ikVar11.m111do(), ikVar11.dr(), ikVar11.dq(), ikVar11.dp());
            case 126:
                ik ikVar12 = this.b;
                jo joVar12 = this.f312a;
                com.google.apps.tiktok.q.b.h c4 = com.google.android.apps.search.assistant.verticals.ambient.b.a.k.c();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar12.kf();
                hVar45 = joVar12.w;
                return com.google.android.apps.search.assistant.verticals.ambient.b.a.k.b(c4, kf3, (com.google.android.libraries.storage.a.j) hVar45.a());
            case 127:
                hVar46 = this.f312a.f;
                return new com.google.android.gms.pay.a.h((Context) hVar46.a(), (byte[]) null);
            case 128:
                hVar47 = this.f312a.f;
                Context context2 = (Context) hVar47.a();
                hVar48 = this.b.g;
                AccountId accountId = (AccountId) hVar48.a();
                hVar49 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar49.a();
                hVar50 = this.f312a.H;
                return new com.google.android.apps.search.assistant.verticals.ambient.u.j.a.b(this.b.uI(), context2, dVar, accountId, (ExecutorService) hVar50.a());
            case 129:
                ik ikVar13 = this.b;
                jo joVar13 = this.f312a;
                com.google.apps.tiktok.q.b.h b = com.google.android.apps.search.assistant.verticals.ambient.s.g.d.i.b();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar13.kf();
                hVar51 = joVar13.w;
                return com.google.android.apps.search.assistant.verticals.ambient.s.g.d.i.c(b, kf4, (com.google.android.libraries.storage.a.j) hVar51.a());
            case 130:
                hVar52 = this.f312a.f;
                Context context3 = (Context) hVar52.a();
                hVar53 = this.b.hT;
                return com.google.android.apps.search.assistant.verticals.ambient.u.p.c.a.c(context3, (com.google.android.gms.search.i) hVar53.a());
            case 131:
                return com.google.android.apps.search.assistant.verticals.ambient.u.p.c.a.b();
            case 132:
                ik ikVar14 = this.b;
                Map rj = ikVar14.rj();
                w gy = ikVar14.gy();
                com.google.android.libraries.assistant.pcp.d.a.x gz = ikVar14.gz();
                Object qB = ikVar14.qB();
                com.google.android.libraries.assistant.pcp.u.b.f gX = ikVar14.gX();
                j gS = ikVar14.gS();
                com.google.android.libraries.assistant.pcp.datastore.a.a.g gQ = ikVar14.gQ();
                com.google.android.libraries.assistant.pcp.g.a.ac gA = ikVar14.gA();
                hVar54 = ikVar14.cq;
                com.google.android.libraries.assistant.pcp.k.a.a.ah ahVar = (com.google.android.libraries.assistant.pcp.k.a.a.ah) hVar54.a();
                ik ikVar15 = this.b;
                jo joVar14 = this.f312a;
                com.google.android.libraries.assistant.pcp.b.a.r gt = ikVar15.gt();
                com.google.android.libraries.assistant.pcp.b.c.t gw = ikVar15.gw();
                hVar55 = joVar14.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar55.a();
                hVar56 = this.f312a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar56.a();
                hVar57 = this.b.aB;
                lt ltVar = (lt) hVar57.a();
                ik ikVar16 = this.b;
                com.google.android.libraries.assistant.pcp.logging.e gV = ikVar16.gV();
                hVar58 = ikVar16.cs;
                com.google.android.libraries.assistant.pcp.p.a.d dVar2 = (com.google.android.libraries.assistant.pcp.p.a.d) hVar58.a();
                hVar59 = this.f312a.we;
                i iVar = (i) hVar59.a();
                hVar60 = this.f312a.H;
                return new com.google.android.libraries.assistant.pcp.c.am(rj, gy, gz, (com.google.android.libraries.assistant.pcp.f.x) qB, gX, gS, gQ, gA, ahVar, gt, gw, fVar3, aVar7, ltVar, gV, dVar2, iVar, (Executor) hVar60.a());
            case 133:
                hVar61 = this.b.hW;
                return com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.datastore.a.a.d((MediaProfileDatabase) hVar61.a());
            case 134:
                hVar62 = this.b.hV;
                return com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.datastore.a.a.b((com.google.apps.tiktok.q.c.h) hVar62.a(), this.b.kh());
            case 135:
                return com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.datastore.a.a.c();
            case 136:
                ik ikVar17 = this.b;
                return fu.q(com.google.g.q.b.d.P, ikVar17.qq(), com.google.g.q.b.d.W, ikVar17.iD(), com.google.g.q.b.d.N, ikVar17.qy(), com.google.g.q.b.d.B, ikVar17.qE(), com.google.g.q.b.d.ab, ikVar17.gx());
            case 137:
                hVar63 = this.f312a.f;
                Context context4 = (Context) hVar63.a();
                hVar64 = this.b.g;
                AccountId accountId2 = (AccountId) hVar64.a();
                hVar65 = this.f312a.v;
                cq cqVar5 = (cq) hVar65.a();
                hVar66 = this.f312a.ne;
                com.google.apps.tiktok.media.j jVar = (com.google.apps.tiktok.media.j) hVar66.a();
                hVar67 = this.f312a.h;
                PackageManager packageManager = (PackageManager) hVar67.a();
                ik ikVar18 = this.b;
                com.google.android.libraries.search.assistant.proactive.d.a iC = ikVar18.iC();
                hVar68 = ikVar18.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar3 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar68.a();
                hVar69 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar69.a();
                hVar70 = this.b.ar;
                com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w wVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) hVar70.a();
                jo joVar15 = this.f312a;
                com.google.android.libraries.search.assistant.proactive.ag kr = joVar15.kr();
                hVar71 = joVar15.in;
                return new com.google.android.libraries.search.assistant.proactive.o(context4, accountId2, cqVar5, jVar, packageManager, iC, dVar3, dVar4, wVar, kr, (com.google.android.libraries.search.assistant.proactive.h.c) hVar71.a());
            case 138:
                hVar72 = this.b.aq;
                com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.am amVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.am) hVar72.a();
                hVar73 = this.f312a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w(amVar, (ag) hVar73.a());
            case 139:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.g.b(this.b.qg());
            case 140:
                hVar74 = this.f312a.f;
                Context context5 = (Context) hVar74.a();
                hVar75 = this.b.Y;
                e.a b2 = e.c.c.b(hVar75);
                hVar76 = this.f312a.Y;
                e.a b3 = e.c.c.b(hVar76);
                hVar77 = this.b.aj;
                com.google.android.apps.search.assistant.platform.g.g.b.c cVar = (com.google.android.apps.search.assistant.platform.g.g.b.c) hVar77.a();
                hVar78 = this.b.ar;
                com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w wVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) hVar78.a();
                at k = at.k(this.b.ay());
                jo joVar16 = this.f312a;
                com.google.android.libraries.search.assistant.proactive.ag kr2 = joVar16.kr();
                hVar79 = joVar16.H;
                return new bl(context5, b2, b3, cVar, wVar2, k, kr2, (Executor) hVar79.a(), this.b.uJ());
            case 141:
                hVar80 = this.f312a.v;
                Executor executor = (Executor) hVar80.a();
                hVar81 = this.f312a.Q;
                ag agVar2 = (ag) hVar81.a();
                hVar82 = this.b.hZ;
                cg cgVar = (cg) hVar82.a();
                hVar83 = this.b.ia;
                cg cgVar2 = (cg) hVar83.a();
                hVar84 = this.f312a.iu;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.s.bc(executor, agVar2, cgVar, cgVar2, (ay) hVar84.a(), this.b.l());
            case 142:
                ik ikVar19 = this.b;
                jo joVar17 = this.f312a;
                com.google.apps.tiktok.q.b.h d = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.s.c.d();
                com.google.apps.tiktok.account.d.b.f kf5 = ikVar19.kf();
                hVar85 = joVar17.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.s.c.c(d, kf5, (com.google.android.libraries.storage.a.j) hVar85.a());
            case 143:
                ik ikVar20 = this.b;
                jo joVar18 = this.f312a;
                com.google.apps.tiktok.q.b.h e = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.s.c.e();
                com.google.apps.tiktok.account.d.b.f kf6 = ikVar20.kf();
                hVar86 = joVar18.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.s.c.b(e, kf6, (com.google.android.libraries.storage.a.j) hVar86.a());
            case 144:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.p.a.c(this.b.qh());
            case 145:
                jyVar = this.f312a.f319a;
                return at.k(jyVar.dY());
            case 146:
                hVar87 = this.f312a.nn;
                return new com.google.android.libraries.search.assistant.proactive.j.e((KeyguardManager) hVar87.a(), this.f312a.I());
            case 147:
                jrVar2 = this.f312a.b;
                return at.k(jrVar2.aC());
            case 148:
                ik ikVar21 = this.b;
                jo joVar19 = this.f312a;
                Set rZ = ikVar21.rZ();
                hVar88 = joVar19.we;
                return new com.google.android.libraries.assistant.pcp.h.e(rZ, (i) hVar88.a());
            case 149:
                hVar89 = this.b.ie;
                com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.b bVar2 = (com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.b) hVar89.a();
                hVar90 = this.f312a.H;
                cr crVar2 = (cr) hVar90.a();
                hVar91 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar3 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar91.a();
                hVar92 = this.b.ay;
                return new com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.a.d(bVar2, crVar2, gVar3, hVar92);
            case 150:
                jrVar3 = this.f312a.b;
                com.google.android.libraries.assistant.auto.tng.gmm.grpc.c.a.a an = jrVar3.an();
                hVar93 = this.f312a.f;
                Context context6 = (Context) hVar93.a();
                hVar94 = this.f312a.h;
                return com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.b.a.b(an, context6, (PackageManager) hVar94.a());
            case 151:
                hVar95 = this.f312a.ea;
                com.google.android.apps.search.assistant.surfaces.b.b.a.e eVar2 = (com.google.android.apps.search.assistant.surfaces.b.b.a.e) hVar95.a();
                ik ikVar22 = this.b;
                hVar96 = ikVar22.ig;
                hVar97 = ikVar22.aw;
                return com.google.android.libraries.assistant.auto.tng.p.c.b.a.b(eVar2, hVar96, hVar97);
            case 152:
                ik ikVar23 = this.b;
                jo joVar20 = this.f312a;
                Set se = ikVar23.se();
                hVar98 = joVar20.H;
                return new com.google.android.libraries.assistant.auto.tng.p.c.a.b(se, (Executor) hVar98.a());
            case 153:
                return new com.google.android.libraries.assistant.auto.tng.p.c.a.e();
            case 154:
                hVar99 = this.b.ih;
                lt ltVar2 = (lt) hVar99.a();
                hVar100 = this.b.ig;
                return com.google.android.libraries.assistant.auto.tng.p.c.b.a.c(ltVar2, (com.google.android.libraries.assistant.auto.tng.p.c.a.b) hVar100.a());
            case 155:
                return new lt(this);
            case 156:
                return Boolean.valueOf(h.a.a.b.b.a.c.e(this.b.yx()));
            case 157:
                return Boolean.valueOf(h.a.a.b.b.a.c.f(this.b.yx()));
            case 158:
                hVar101 = this.f312a.H;
                Executor executor2 = (Executor) hVar101.a();
                hVar102 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar3 = (com.google.apps.tiktok.account.data.b) hVar102.a();
                hVar103 = this.f312a.bq;
                return new com.google.android.libraries.assistant.auto.tng.common.a.f(executor2, bVar3, (com.google.apps.tiktok.account.data.a.d) hVar103.a());
            case 159:
                return new lt(this);
            case 160:
                hVar104 = this.b.aC;
                com.google.android.libraries.assistant.auto.tng.media.a.d.a.a aVar8 = (com.google.android.libraries.assistant.auto.tng.media.a.d.a.a) hVar104.a();
                jo joVar21 = this.f312a;
                hVar105 = joVar21.h;
                hVar106 = joVar21.H;
                Executor executor3 = (Executor) hVar106.a();
                hVar107 = this.f312a.v;
                return new com.google.android.libraries.assistant.auto.tng.media.d.b.a.c(aVar8, hVar105, executor3, (Executor) hVar107.a(), this.b.fA());
            case 161:
                return new com.google.android.libraries.assistant.auto.tng.media.a.d.a.a(this.b.yh());
            case 162:
                ik ikVar24 = this.b;
                com.google.android.libraries.assistant.auto.tng.media.d.a.a xT = ikVar24.xT();
                hVar108 = ikVar24.aC;
                com.google.android.libraries.assistant.auto.tng.media.a.d.a.a aVar9 = (com.google.android.libraries.assistant.auto.tng.media.a.d.a.a) hVar108.a();
                jo joVar22 = this.f312a;
                ik ikVar25 = this.b;
                hVar109 = joVar22.h;
                hVar110 = ikVar25.g;
                hVar111 = joVar22.bq;
                hVar112 = joVar22.H;
                Executor executor4 = (Executor) hVar112.a();
                hVar113 = this.f312a.v;
                return new com.google.android.libraries.assistant.auto.tng.media.d.c.a.d(xT, aVar9, hVar109, hVar110, hVar111, executor4, (Executor) hVar113.a(), this.b.fA());
            case 163:
                return new md(this.f312a, this.b);
            case 164:
                hVar114 = this.b.X;
                hVar115 = this.f312a.lQ;
                String str = (String) hVar115.a();
                jrVar4 = this.f312a.b;
                return com.google.android.libraries.assistant.auto.tng.suggestions.h.e.b.a.b(str, jrVar4.fd());
            case 165:
                hVar116 = this.b.g;
                AccountId accountId3 = (AccountId) hVar116.a();
                hVar117 = this.b.aA;
                com.google.android.libraries.assistant.auto.tng.common.a.f fVar4 = (com.google.android.libraries.assistant.auto.tng.common.a.f) hVar117.a();
                ik ikVar26 = this.b;
                jo joVar23 = this.f312a;
                com.google.android.apps.gsa.u.c.f x = ikVar26.x();
                jrVar5 = joVar23.b;
                h ek = jr.ek(jrVar5);
                hVar118 = this.f312a.iv;
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) hVar118.a();
                ik ikVar27 = this.b;
                jo joVar24 = this.f312a;
                hVar119 = ikVar27.il;
                hVar120 = joVar24.H;
                Executor executor5 = (Executor) hVar120.a();
                jrVar6 = this.f312a.b;
                return new com.google.android.libraries.assistant.auto.tng.w.d.a.a.g(accountId3, fVar4, x, ek, axVar, hVar119, executor5, (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a) jr.es(jrVar6).a(), Optional.empty(), Optional.of(this.b.wO()), Optional.empty());
            case 166:
                return new com.google.android.libraries.assistant.auto.tng.w.d.b.a.a(ik.xw());
            case 167:
                return Boolean.valueOf(h.a.a.b.b.a.c.v(this.b.yB()));
            case 168:
                hVar121 = this.b.im;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.b.a.a aVar10 = (com.google.android.libraries.assistant.auto.tng.suggestions.b.b.a.a) hVar121.a();
                ik ikVar28 = this.b;
                jo joVar25 = this.f312a;
                Set rX = ikVar28.rX();
                Set rY = ikVar28.rY();
                hVar122 = joVar25.H;
                cq cqVar6 = (cq) hVar122.a();
                jrVar7 = this.f312a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.b.a.f(aVar10, rX, rY, cqVar6, (com.google.android.libraries.assistant.auto.tng.suggestions.b.e.b.a.h) jr.bP(jrVar7).a());
            case 169:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.b.a.a();
            case 170:
                jrVar8 = this.f312a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a.b(jr.dv(jrVar8));
            case 171:
                hVar123 = this.b.aH;
                com.google.android.libraries.assistant.auto.tng.media.a.e.k kVar = (com.google.android.libraries.assistant.auto.tng.media.a.e.k) hVar123.a();
                ik ikVar29 = this.b;
                jo joVar26 = this.f312a;
                com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.b.b gc = ikVar29.gc();
                jrVar9 = joVar26.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar3 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar9).a();
                jrVar10 = this.f312a.b;
                h dL = jr.dL(jrVar10);
                jrVar11 = this.f312a.b;
                h dK = jr.dK(jrVar11);
                hVar124 = this.f312a.f;
                Context context7 = (Context) hVar124.a();
                hVar125 = this.f312a.bz;
                com.google.apps.tiktok.concurrent.ao aoVar = (com.google.apps.tiktok.concurrent.ao) hVar125.a();
                hVar126 = this.f312a.H;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.b.a.g(kVar, gc, eVar3, dL, dK, context7, aoVar, (cq) hVar126.a());
            case 172:
                hVar127 = this.f312a.f;
                Context context8 = (Context) hVar127.a();
                jrVar12 = this.f312a.b;
                h m122do = jr.m122do(jrVar12);
                jrVar13 = this.f312a.b;
                h dX = jr.dX(jrVar13);
                jrVar14 = this.f312a.b;
                h dr = jr.dr(jrVar14);
                jrVar15 = this.f312a.b;
                return new com.google.android.libraries.assistant.auto.tng.media.a.e.k(context8, m122do, dX, dr, jr.eu(jrVar15));
            case 173:
                hVar128 = this.b.aa;
                com.google.apps.tiktok.g.p pVar6 = (com.google.apps.tiktok.g.p) hVar128.a();
                hVar129 = this.b.q;
                dj djVar = (dj) hVar129.a();
                hVar130 = this.f312a.H;
                cq cqVar7 = (cq) hVar130.a();
                ik ikVar30 = this.b;
                jo joVar27 = this.f312a;
                com.google.android.libraries.assistant.auto.tng.common.f.a.a.i fy = ikVar30.fy();
                jrVar16 = joVar27.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.a.f(pVar6, djVar, cqVar7, fy, jr.cT(jrVar16));
            case 174:
                hVar131 = this.f312a.H;
                cq cqVar8 = (cq) hVar131.a();
                hVar132 = this.f312a.f;
                Context context9 = (Context) hVar132.a();
                ik ikVar31 = this.b;
                jo joVar28 = this.f312a;
                com.google.android.libraries.search.assistant.ai.c.l ii = ikVar31.ii();
                hVar133 = joVar28.H;
                cr crVar3 = (cr) hVar133.a();
                jrVar17 = this.f312a.b;
                h dO = jr.dO(jrVar17);
                jrVar18 = this.f312a.b;
                h dV = jr.dV(jrVar18);
                jrVar19 = this.f312a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.d.a.a.a(cqVar8, context9, ii, crVar3, dO, dV, jr.cB(jrVar19));
            case 175:
                return com.google.android.libraries.search.assistant.ai.c.a.y.b(this.b.qg());
            case 176:
                hVar134 = this.b.g;
                AccountId accountId4 = (AccountId) hVar134.a();
                hVar135 = this.b.aA;
                com.google.android.libraries.assistant.auto.tng.common.a.f fVar5 = (com.google.android.libraries.assistant.auto.tng.common.a.f) hVar135.a();
                ik ikVar32 = this.b;
                jo joVar29 = this.f312a;
                com.google.android.apps.gsa.u.c.f x2 = ikVar32.x();
                hVar136 = joVar29.iv;
                hVar137 = this.b.P;
                p pVar7 = (p) hVar137.a();
                jrVar20 = this.f312a.b;
                h ej = jr.ej(jrVar20);
                hVar138 = this.f312a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar138.a();
                hVar139 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar4 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar139.a();
                hVar140 = this.f312a.H;
                cr crVar4 = (cr) hVar140.a();
                jrVar21 = this.f312a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a aVar12 = (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a) jr.es(jrVar21).a();
                hVar141 = this.b.is;
                cg cgVar3 = (cg) hVar141.a();
                jrVar22 = this.f312a.b;
                cg cgVar4 = (cg) jr.ei(jrVar22).a();
                Optional empty = Optional.empty();
                Optional.empty();
                jrVar23 = this.f312a.b;
                h df = jr.df(jrVar23);
                hVar142 = this.f312a.bN;
                return new com.google.android.libraries.assistant.auto.tng.w.e.a.a.j(accountId4, fVar5, x2, pVar7, ej, aVar11, gVar4, crVar4, aVar12, cgVar3, cgVar4, empty, df, (com.google.apps.tiktok.account.data.b) hVar142.a());
            case 177:
                ik ikVar33 = this.b;
                jo joVar30 = this.f312a;
                com.google.apps.tiktok.q.b.h c5 = com.google.android.libraries.assistant.auto.tng.w.e.b.a.a.c();
                com.google.apps.tiktok.account.d.b.f kf7 = ikVar33.kf();
                hVar143 = joVar30.w;
                return com.google.android.libraries.assistant.auto.tng.w.e.b.a.a.b(c5, kf7, (com.google.android.libraries.storage.a.j) hVar143.a());
            case 178:
                hVar144 = this.f312a.H;
                return new com.google.android.libraries.assistant.auto.jumpboost.m.a.b.d(this.b.sd(), (Executor) hVar144.a());
            case 179:
                hVar145 = this.f312a.gf;
                com.google.android.apps.gsa.search.core.preferences.n nVar = (com.google.android.apps.gsa.search.core.preferences.n) hVar145.a();
                hVar146 = this.f312a.H;
                return new com.google.android.libraries.assistant.auto.tng.morris.a.b(nVar, (Executor) hVar146.a());
            case 180:
                ik ikVar34 = this.b;
                jo joVar31 = this.f312a;
                Map qZ = ikVar34.qZ();
                Object qB2 = ikVar34.qB();
                hVar147 = joVar31.we;
                i iVar2 = (i) hVar147.a();
                hVar148 = this.f312a.H;
                return new com.google.android.libraries.assistant.pcp.d.a.ac(qZ, (com.google.android.libraries.assistant.pcp.f.x) qB2, iVar2, (Executor) hVar148.a());
            case 181:
                hVar149 = this.f312a.afj;
                com.google.android.apps.search.assistant.verticals.ambient.crossprofile.aa aaVar = (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.aa) hVar149.a();
                hVar150 = this.f312a.afi;
                com.google.android.apps.search.assistant.verticals.ambient.crossprofile.l lVar = (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.l) hVar150.a();
                hVar151 = this.f312a.wt;
                com.google.android.enterprise.connectedapps.c cVar2 = (com.google.android.enterprise.connectedapps.c) hVar151.a();
                jo joVar32 = this.f312a;
                ae fZ = joVar32.fZ();
                hVar152 = joVar32.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar13 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar152.a();
                hVar153 = this.f312a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar4 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar153.a();
                ik ikVar35 = this.b;
                com.google.android.apps.search.assistant.verticals.ambient.n.m dD = ikVar35.dD();
                hVar154 = ikVar35.aj;
                com.google.android.apps.search.assistant.platform.g.g.b.c cVar3 = (com.google.android.apps.search.assistant.platform.g.g.b.c) hVar154.a();
                hVar155 = this.f312a.Q;
                return new com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v(aaVar, lVar, cVar2, fZ, aVar13, rVar4, dD, cVar3, (ag) hVar155.a());
            case 182:
                hVar156 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar5 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar156.a();
                ik ikVar36 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.m bh = ikVar36.bh();
                boolean uK = ikVar36.uK();
                boolean uL = ikVar36.uL();
                hVar157 = ikVar36.aN;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k(dVar5, bh, uK, uL, (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.l) hVar157.a());
            case 183:
                ik ikVar37 = this.b;
                jo joVar33 = this.f312a;
                com.google.apps.tiktok.q.b.h c6 = com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.c.c();
                com.google.apps.tiktok.account.d.b.a.b kg2 = ikVar37.kg();
                hVar158 = joVar33.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.c.b(c6, kg2, (com.google.android.libraries.storage.a.j) hVar158.a());
            case 184:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.l(this.b.lC());
            case 185:
                hVar159 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar159.a();
                hVar160 = this.b.ja;
                com.google.android.apps.search.assistant.surfaces.voice.robin.c.a.h hVar187 = (com.google.android.apps.search.assistant.surfaces.voice.robin.c.a.h) hVar160.a();
                this.b.cp();
                hVar161 = this.f312a.ez;
                com.google.common.v.f fVar6 = (com.google.common.v.f) hVar161.a();
                ik ikVar38 = this.b;
                jo joVar34 = this.f312a;
                com.google.protobuf.ao li = ikVar38.li();
                com.google.g.ab.d.b.x kI = ikVar38.kI();
                hVar162 = joVar34.Q;
                ag agVar3 = (ag) hVar162.a();
                jrVar24 = this.f312a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.c.g(auVar, hVar187, fVar6, li, kI, agVar3, (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar24).a());
            case 186:
                jrVar25 = this.f312a.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.h P = jrVar25.P();
                hVar163 = this.b.aO;
                e.a b4 = e.c.c.b(hVar163);
                jrVar26 = this.f312a.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.aw Q = jrVar26.Q();
                ik ikVar39 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.h bl = ikVar39.bl();
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.n cA = ikVar39.cA();
                hVar164 = ikVar39.aV;
                com.google.android.libraries.search.b.b bVar4 = (com.google.android.libraries.search.b.b) hVar164.a();
                ik ikVar40 = this.b;
                com.google.protobuf.ao la = ikVar40.la();
                com.google.protobuf.ao lb = ikVar40.lb();
                com.google.protobuf.ao lc = ikVar40.lc();
                com.google.protobuf.ao ld = ikVar40.ld();
                com.google.protobuf.ao le = ikVar40.le();
                com.google.protobuf.ao lf = ikVar40.lf();
                com.google.protobuf.ao lg = ikVar40.lg();
                hVar165 = ikVar40.iZ;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.b bVar5 = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.b) hVar165.a();
                ik ikVar41 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.u bb = ikVar41.bb();
                boolean ud = ikVar41.ud();
                ikVar41.cn();
                this.b.xE();
                ik ikVar42 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.y.au(P, b4, Q, bl, cA, bVar4, la, lb, lc, ld, le, lf, lg, bVar5, bb, ud, ikVar42.lh(), ikVar42.ue());
            case 187:
                hVar166 = this.f312a.f;
                Context context10 = (Context) hVar166.a();
                hVar167 = this.f312a.Q;
                ag agVar4 = (ag) hVar167.a();
                ik ikVar43 = this.b;
                boolean uM = ikVar43.uM();
                boolean uN = ikVar43.uN();
                boolean uO = ikVar43.uO();
                hVar168 = ikVar43.z;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am amVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) hVar168.a();
                hVar169 = this.b.as;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar4 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) hVar169.a();
                hVar170 = this.f312a.P;
                m.c.n nVar2 = (m.c.n) hVar170.a();
                hVar171 = this.b.q;
                dj djVar2 = (dj) hVar171.a();
                ik ikVar44 = this.b;
                jo joVar35 = this.f312a;
                boolean uP = ikVar44.uP();
                boolean uQ = ikVar44.uQ();
                boolean uR = ikVar44.uR();
                jrVar27 = joVar35.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar8 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar27).a();
                hVar172 = this.f312a.Y;
                String str2 = (String) hVar172.a();
                hVar173 = this.b.iv;
                com.google.android.apps.search.assistant.surfaces.voice.j.f.a.h hVar188 = (com.google.android.apps.search.assistant.surfaces.voice.j.f.a.h) hVar173.a();
                ik ikVar45 = this.b;
                jo joVar36 = this.f312a;
                boolean uS = ikVar45.uS();
                boolean uT = ikVar45.uT();
                boolean uU = ikVar45.uU();
                boolean uV = ikVar45.uV();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ao.an cW = ikVar45.cW();
                hVar174 = joVar36.ta;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ao.ak(context10, agVar4, uM, uN, uO, amVar2, eVar4, nVar2, djVar2, uP, uQ, uR, pVar8, str2, hVar188, uS, uT, uU, uV, cW, (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i) hVar174.a());
            case 188:
                return com.google.android.apps.search.assistant.surfaces.voice.j.b.d.a.a.b(this.b.qh());
            case 189:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ah.a.a.b(this.b.qh());
            case 190:
                ik ikVar46 = this.b;
                jo joVar37 = this.f312a;
                com.google.apps.tiktok.q.b.h b5 = com.google.android.apps.search.assistant.surfaces.voice.robin.ao.b.c.b();
                com.google.apps.tiktok.account.d.b.f kf8 = ikVar46.kf();
                hVar175 = joVar37.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ao.b.c.c(b5, kf8, (com.google.android.libraries.storage.a.j) hVar175.a());
            case 191:
            case 193:
                hVar176 = this.f312a.iu;
                ay ayVar = (ay) hVar176.a();
                hVar177 = this.f312a.Q;
                ag agVar5 = (ag) hVar177.a();
                hVar178 = this.f312a.H;
                return new com.google.android.apps.search.assistant.surfaces.voice.shared.c.k(ayVar, agVar5, (cr) hVar178.a());
            case 192:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r();
            case 194:
                return new iv(this, 1);
            case 195:
                hVar179 = this.b.l;
                return new h.a.a.f.b.a.k(hVar179);
            case 196:
                hVar180 = this.b.J;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.x.a.c((com.google.android.libraries.search.t.a.a) hVar180.a());
            case 197:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.b.a.g();
            case 198:
                jyVar2 = this.f312a.f319a;
                com.google.android.libraries.search.assistant.aq.g.a.g dZ = jyVar2.dZ();
                hVar181 = this.f312a.kw;
                com.google.android.libraries.search.assistant.aq.i.b.d dVar6 = (com.google.android.libraries.search.assistant.aq.i.b.d) hVar181.a();
                jyVar3 = this.f312a.f319a;
                com.google.android.gms.search.queries.d cO = jyVar3.cO();
                hVar182 = this.b.ba;
                hVar183 = this.b.be;
                return com.google.android.apps.search.assistant.surfaces.voice.e.d.a.c(dZ, dVar6, cO, (r) hVar183.a());
            case 199:
                hVar184 = this.b.J;
                com.google.android.libraries.search.t.a.a aVar14 = (com.google.android.libraries.search.t.a.a) hVar184.a();
                hVar185 = this.b.iC;
                com.google.android.libraries.search.assistant.ae.a.a aVar15 = (com.google.android.libraries.search.assistant.ae.a.a) hVar185.a();
                hVar186 = this.b.aY;
                return com.google.android.libraries.search.assistant.ae.a.b.c.b(aVar14, aVar15, ((Boolean) hVar186.a()).booleanValue());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        int i = this.c;
        switch (i) {
            case 200:
                return new bu(this, 2);
            case 201:
                jo joVar = this.f312a;
                ik ikVar = this.b;
                return new com.google.android.libraries.search.assistant.ae.a.a.m(joVar.f319a.dA(), ikVar.ql(), ikVar.hp(), (Duration) ikVar.aX.a(), ((Boolean) this.b.aY.a()).booleanValue(), (com.google.br.d.a.a.e) this.b.p.a(), (Executor) this.f312a.H.a(), (cr) this.f312a.H.a());
            case 202:
                ik ikVar2 = this.b;
                jo joVar2 = this.f312a;
                return com.google.android.libraries.search.assistant.ae.a.b.a.c(ikVar2.qg(), ikVar2.qh(), joVar2.b.gV(), joVar2.b.gZ());
            case 203:
                return com.google.android.libraries.search.assistant.ae.a.b.a.b();
            case 204:
                jo joVar3 = this.f312a;
                return Boolean.valueOf(com.google.android.libraries.search.assistant.ae.a.b.c.c(joVar3.b.hf(), joVar3.b.hl()));
            case 205:
                return new com.google.android.libraries.search.assistant.ae.a.a.s();
            case 206:
                ik ikVar3 = this.b;
                com.google.android.libraries.search.assistant.appactions.d.f.k hN = ikVar3.hN();
                com.google.android.libraries.search.assistant.appactions.d.c.r hK = ikVar3.hK();
                Object qn = ikVar3.qn();
                com.google.android.libraries.search.assistant.appactions.d.b.o hJ = ikVar3.hJ();
                com.google.android.libraries.search.assistant.appactions.d.a.p hH = ikVar3.hH();
                com.google.android.libraries.search.assistant.e.b.a aVar = (com.google.android.libraries.search.assistant.e.b.a) ikVar3.bd.a();
                ik ikVar4 = this.b;
                jo joVar4 = this.f312a;
                boolean uW = ikVar4.uW();
                boolean uX = ikVar4.uX();
                cr crVar = (cr) joVar4.H.a();
                PackageManager packageManager = (PackageManager) this.f312a.h.a();
                ik ikVar5 = this.b;
                return new r(hN, hK, (com.google.android.libraries.search.assistant.appactions.d.a.e) qn, hJ, hH, aVar, uW, uX, crVar, packageManager, ikVar5.hG(), (com.google.android.libraries.search.integrations.c.a.c) ikVar5.Y.a());
            case 207:
                return this.b.kg().a((com.google.apps.tiktok.q.b.h) this.b.bb.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 208:
                return com.google.android.libraries.search.assistant.appactions.b.h.b();
            case 209:
                return new com.google.android.libraries.search.assistant.e.b.a.j((ag) this.f312a.Q.a(), (nz) this.b.bc.a(), this.f312a.f319a.sd());
            case 210:
                return new nz(this);
            case 211:
                return new bv(this, 2);
            case 212:
                ik ikVar6 = this.b;
                jo joVar5 = this.f312a;
                return ikVar6.kg().a(com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.b.a.b(), (com.google.android.libraries.storage.a.j) joVar5.w.a());
            case 213:
                ik ikVar7 = this.b;
                jo joVar6 = this.f312a;
                return ikVar7.kg().a(ikVar7.kx(), (com.google.android.libraries.storage.a.j) joVar6.w.a());
            case 214:
                return new lt(this);
            case 215:
                return new lt(this);
            case 216:
                return com.google.android.libraries.search.assistant.invocation.o.c.b.d((lt) this.b.bj.a());
            case 217:
                return new lt(this);
            case 218:
                return com.google.android.libraries.search.assistant.invocation.o.c.b.b(this.b.qg());
            case 219:
                return new bw(this, 2);
            case 220:
                return new bx(this, 2);
            case 221:
                return new com.google.android.libraries.search.assistant.ai.a.j((Context) this.f312a.f.a(), (com.google.android.libraries.search.assistant.ai.a.a.a.n) this.b.bl.a(), this.b.ih(), (ag) this.f312a.Q.a());
            case 222:
                return com.google.android.libraries.search.assistant.ai.a.a.u.b(this.b.qg());
            case 223:
                return new com.google.android.libraries.search.assistant.ai.b.g.g((Context) this.f312a.f.a(), this.b.m112if(), (ag) this.f312a.Q.a(), (m.c.n) this.f312a.R.a());
            case 224:
                return new com.google.android.libraries.search.assistant.notification.b.k(this.b.ig(), (Executor) this.f312a.H.a());
            case 225:
                ag agVar = (ag) this.f312a.Q.a();
                ag agVar2 = (ag) this.f312a.bo.a();
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ik ikVar8 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.al(agVar, agVar2, aVar2, ikVar8.bt(), ikVar8.bC(), ikVar8.bs(), ikVar8.xP(), ikVar8.vG(), ikVar8.va(), ikVar8.sR(), ikVar8.sS());
            case 226:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.r.am((String) this.f312a.Y.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f312a.b.o.a(), this.b.sT());
            case 227:
                return new com.google.android.libraries.search.assistant.invocation.t.b.g((com.google.android.libraries.search.assistant.invocation.t.b.e) this.b.br.a());
            case 228:
                return new com.google.android.libraries.search.assistant.invocation.t.b.e((com.google.android.libraries.search.assistant.invocation.t.d.e) this.b.bq.a(), (ag) this.f312a.Q.a(), (com.google.android.libraries.g.a) this.f312a.g.a(), (com.google.android.libraries.search.assistant.invocation.n.d.i) this.f312a.eY.a(), (com.google.android.libraries.search.assistant.invocation.utils.e.a) this.f312a.eR.a());
            case 229:
                return com.google.android.libraries.search.assistant.invocation.t.c.c.c(this.b.qg());
            case 230:
                Context context = (Context) this.f312a.f.a();
                Executor executor = (Executor) this.f312a.H.a();
                cr crVar2 = (cr) this.f312a.H.a();
                com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.c.c cVar = (com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.c.c) this.f312a.b.bf.a();
                ik ikVar9 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.h bc = ikVar9.bc();
                com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.ax axVar = (com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.ax) ikVar9.bt.a();
                com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) this.b.aV.a();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.b.as.a();
                ik ikVar10 = this.b;
                jo joVar7 = this.f312a;
                boolean sV = ikVar10.sV();
                String str = (String) joVar7.Y.a();
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar = (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f312a.b.o.a();
                dj djVar = (dj) this.b.q.a();
                jo joVar8 = this.f312a;
                ik ikVar11 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.g(context, executor, crVar2, cVar, bc, axVar, bVar, eVar, sV, str, pVar, djVar, joVar8.b.i(), joVar8.b.hs(), ikVar11.sW(), ikVar11.aY());
            case 231:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.ax(this.f312a.b.hr());
            case 232:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c((com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.ai) this.b.bH.a());
            case 233:
                com.google.speech.g.bp bpVar = (com.google.speech.g.bp) this.b.bx.a();
                ag agVar3 = (ag) this.f312a.Q.a();
                ik ikVar12 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.e cQ = ikVar12.cQ();
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.c cVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.c) ikVar12.by.a();
                ik ikVar13 = this.b;
                ikVar13.cS();
                com.google.android.apps.search.assistant.surfaces.voice.robin.r.am amVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.r.am) ikVar13.bp.a();
                AudioManager audioManager = (AudioManager) this.f312a.cZ.a();
                ik ikVar14 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.ad(bpVar, agVar3, cQ, cVar2, amVar, audioManager, ikVar14.ta(), ikVar14.lj(), ikVar14.cw(), ikVar14.bq(), ikVar14.cN(), ikVar14.be(), ikVar14.ts(), ikVar14.tt(), ikVar14.tu(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f312a.b.o.a(), (String) this.f312a.Y.a());
            case 234:
                ik ikVar15 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.b.a.b(ikVar15.bv, (com.google.frameworks.client.data.android.d.f) ikVar15.bw.a());
            case 235:
                ik ikVar16 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.b.a.c(ikVar16.V, (com.google.apps.tiktok.p.m) this.f312a.b.bg.a(), (com.google.apps.tiktok.p.u) this.f312a.mh.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), com.google.common.base.a.a);
            case 236:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.a.f.b((com.google.apps.tiktok.p.b.c) this.b.X.a());
            case 237:
                Executor executor2 = (Executor) this.f312a.b.bh.a();
                ik ikVar17 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.a.g(executor2, ikVar17.cT(), ikVar17.tb());
            case 238:
                return Boolean.valueOf(h.a.a.d.b.a.r.l(this.b.ys()));
            case 239:
                return Boolean.valueOf(h.a.a.d.b.a.r.k(this.b.ys()));
            case 240:
                return com.google.android.libraries.search.assistant.bb.b.a.b(this.b.qg());
            case 241:
                ik ikVar18 = this.b;
                jo joVar9 = this.f312a;
                return ikVar18.kf().a(com.google.android.libraries.search.assistant.bb.d.a.h.b(), (com.google.android.libraries.storage.a.j) joVar9.w.a());
            case 242:
                ik ikVar19 = this.b;
                jo joVar10 = this.f312a;
                return ikVar19.kf().a(com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.q.b(), (com.google.android.libraries.storage.a.j) joVar10.w.a());
            case 243:
                Context context2 = (Context) this.f312a.f.a();
                ag agVar4 = (ag) this.f312a.Q.a();
                ik ikVar20 = this.b;
                boolean td = ikVar20.td();
                boolean te = ikVar20.te();
                boolean tf = ikVar20.tf();
                e.a b = e.c.c.b(ikVar20.bC);
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.b.aO.a();
                ik ikVar21 = this.b;
                boolean vw = ikVar21.vw();
                boolean tg = ikVar21.tg();
                com.google.protos.l.a.e lv = ikVar21.lv();
                com.google.protos.l.a.e lw = ikVar21.lw();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.aa df = ikVar21.df();
                boolean th = ikVar21.th();
                ikVar21.xA();
                ik ikVar22 = this.b;
                com.google.protobuf.ao lk = ikVar22.lk();
                boolean tj = ikVar22.tj();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.g.e eVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.g.e) ikVar22.bD.a();
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ik ikVar23 = this.b;
                jo joVar11 = this.f312a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.q(context2, agVar4, td, te, tf, b, kVar, vw, tg, lv, lw, df, th, lk, tj, eVar2, aVar3, ikVar23.lx(), ikVar23.tk(), ikVar23.tl(), ikVar23.kY(), ikVar23.tm(), ikVar23.tn(), ikVar23.to(), ikVar23.tp(), ikVar23.tq(), ikVar23.ly(), e.c.c.b(ikVar23.as), joVar11.u(), (com.google.apps.tiktok.account.data.a.d) joVar11.bq.a(), (AccountId) this.b.g.a());
            case 244:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.c.i((com.google.android.apps.search.assistant.surfaces.voice.robin.c.g) this.b.bB.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) this.b.z.a(), (ag) this.f312a.Q.a());
            case 245:
                ik ikVar24 = this.b;
                jo joVar12 = this.f312a;
                return ikVar24.kg().a(ikVar24.kt(), (com.google.android.libraries.storage.a.j) joVar12.w.a());
            case 246:
                ik ikVar25 = this.b;
                jo joVar13 = this.f312a;
                return ikVar25.kg().a(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.g.b(), (com.google.android.libraries.storage.a.j) joVar13.w.a());
            case 247:
                ik ikVar26 = this.b;
                jo joVar14 = this.f312a;
                return ikVar26.kg().a(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.g.c(), (com.google.android.libraries.storage.a.j) joVar14.w.a());
            case 248:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.g.e((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f312a.b.o.a(), (com.google.android.libraries.g.a) this.f312a.g.a(), (String) this.f312a.Y.a(), (ag) this.f312a.Q.a());
            case 249:
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) this.f312a.g.a();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.f312a.lj.a();
                cq cqVar = (cq) this.f312a.H.a();
                jo joVar15 = this.f312a;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.voiceselection.a.i.c(aVar4, extensionRegistryLite, cqVar, joVar15.mx(), joVar15.md(), com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.voiceselection.a.i.b(), this.b.ye());
            case 250:
                return new lt(this);
            case 251:
                return new com.google.android.libraries.search.assistant.performer.o.l();
            case 252:
                return new lt(this);
            case 253:
                return new lt(this);
            case 254:
                return new lt(this);
            case 255:
                return new ls();
            case 256:
                return com.google.android.libraries.search.assistant.invocation.u.b.d.a.b(this.b.qg());
            case 257:
                return new lt(this);
            case 258:
                return new lt(this);
            case 259:
                return new lt(this);
            case 260:
                return new lt(this);
            case 261:
                return com.google.android.libraries.search.assistant.invocation.m.c.a.b(this.f312a.Ve());
            case 262:
                return com.google.android.libraries.search.assistant.invocation.a.c.b.d((com.google.android.libraries.search.assistant.invocation.a.e.a.j) this.b.bQ.a(), (nz) this.b.bR.a());
            case 263:
                return com.google.android.libraries.search.assistant.invocation.a.c.b.b(this.b.qg());
            case 264:
                return new nz(this);
            case 265:
                jo joVar16 = this.f312a;
                ik ikVar27 = this.b;
                com.google.android.libraries.search.assistant.invocation.s.c.b hL = joVar16.b.hL();
                bz db = ikVar27.db();
                com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.i.s sVar = com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.i.s.f4226a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.ac ct = ikVar27.ct();
                Context context3 = (Context) joVar16.f.a();
                ik ikVar28 = this.b;
                jo joVar17 = this.f312a;
                long m = ikVar28.m();
                com.google.android.apps.search.assistant.surfaces.voice.robin.routing.h hVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.routing.h) joVar17.b.bs.a();
                ik ikVar29 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.w.a.t(hL, db, sVar, ct, context3, m, hVar, ikVar29.tx(), ikVar29.tz(), ikVar29.tA(), (ag) this.f312a.bo.a(), (m.c.n) this.f312a.R.a());
            case 266:
                Context context4 = (Context) this.f312a.f.a();
                AccountId accountId = (AccountId) this.b.g.a();
                com.google.android.apps.search.assistant.surfaces.voice.robin.routing.h hVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.routing.h) this.f312a.b.bs.a();
                ik ikVar30 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.m cD = ikVar30.cD();
                com.google.android.apps.search.assistant.surfaces.voice.robin.q.g bp = ikVar30.bp();
                com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w wVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) ikVar30.ar.a();
                ik ikVar31 = this.b;
                boolean tB = ikVar31.tB();
                boolean tC = ikVar31.tC();
                ikVar31.xB();
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k kVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.b.aO.a();
                Optional of = Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ai.v) this.b.bY.a());
                ik ikVar32 = this.b;
                jo joVar18 = this.f312a;
                boolean tP = ikVar32.tP();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.e aY = ikVar32.aY();
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar2 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) joVar18.b.o.a();
                String str2 = (String) this.f312a.Y.a();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am amVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) this.b.z.a();
                ik ikVar33 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.an.c cU = ikVar33.cU();
                long o = ikVar33.o();
                com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.ui.am amVar3 = (com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.ui.am) ikVar33.A.a();
                ik ikVar34 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.routing.aa(context4, accountId, hVar2, cD, bp, wVar, tB, tC, kVar2, of, tP, aY, pVar2, str2, amVar2, cU, o, amVar3, ikVar34.tQ(), ikVar34.tR());
            case 267:
                Context context5 = (Context) this.f312a.f.a();
                ik ikVar35 = this.b;
                boolean tD = ikVar35.tD();
                boolean tF = ikVar35.tF();
                h hVar3 = ikVar35.bV;
                h hVar4 = ikVar35.bW;
                com.google.protos.l.a.b lp = ikVar35.lp();
                boolean tG = ikVar35.tG();
                ikVar35.xC();
                ik ikVar36 = this.b;
                jo joVar19 = this.f312a;
                com.google.protos.l.a.b lq = ikVar36.lq();
                boolean tH = ikVar36.tH();
                int j = joVar19.j();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ai.a.b bVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ai.a.b) joVar19.b.bu.a();
                ag agVar5 = (ag) this.f312a.bo.a();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar3 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.b.as.a();
                Optional of2 = Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ao.ak) this.b.aP.a());
                com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.am amVar4 = (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.am) this.b.aq.a();
                ik ikVar37 = this.b;
                boolean tI = ikVar37.tI();
                long n = ikVar37.n();
                com.google.protobuf.ao kZ = ikVar37.kZ();
                boolean tJ = ikVar37.tJ();
                com.google.android.apps.search.assistant.platform.g.g.b.c cVar3 = (com.google.android.apps.search.assistant.platform.g.g.b.c) ikVar37.aj.a();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am amVar5 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) this.b.z.a();
                ik ikVar38 = this.b;
                jo joVar20 = this.f312a;
                boolean tK = ikVar38.tK();
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar3 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) joVar20.b.o.a();
                String str3 = (String) this.f312a.Y.a();
                ik ikVar39 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ai.b.p(context5, tD, tF, hVar3, hVar4, lp, tG, lq, tH, j, bVar2, agVar5, eVar3, of2, amVar4, tI, n, kZ, tJ, cVar3, amVar5, tK, pVar3, str3, ikVar39.ct(), ikVar39.lz(), ikVar39.lA(), ikVar39.tL(), ikVar39.tM(), ikVar39.tN(), ikVar39.tO(), (com.google.android.apps.search.assistant.surfaces.voice.robin.p.i) ikVar39.bX.a());
            case 268:
                return h.a.a.d.b.a.r.c(this.b.pT());
            case 269:
                return h.a.a.d.b.a.r.m(this.b.yv());
            case 270:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.p.a.b(this.b.qh());
            case 271:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.d((lt) this.b.bT.a(), (cq) this.f312a.H.a(), (com.google.apps.tiktok.g.p) this.b.aa.a(), (dj) this.b.q.a(), (Context) this.f312a.f.a());
            case 272:
                jo joVar21 = this.f312a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.k(joVar21.b.y(), (Context) joVar21.f.a(), (com.google.apps.tiktok.tracing.contrib.b.f.b) this.b.ca.a());
            case 273:
                return new com.google.apps.tiktok.tracing.contrib.b.f.b((dj) this.b.q.a());
            case 274:
                return h.a.a.d.b.a.r.b(this.b.pT());
            case 275:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.c.f((cg) this.b.bf.a(), (ay) this.f312a.iu.a(), (ag) this.f312a.bo.a(), (ag) this.f312a.Q.a(), (Context) this.f312a.f.a());
            case 276:
                return new by(this, 2);
            case 277:
                ik ikVar40 = this.b;
                h hVar5 = ikVar40.cd;
                h hVar6 = ikVar40.ce;
                h hVar7 = ikVar40.cf;
                com.google.frameworks.client.data.android.d.f fVar = (com.google.frameworks.client.data.android.d.f) ikVar40.cg.a();
                ik ikVar41 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.p.b(hVar5, hVar6, hVar7, fVar, ikVar41.tX(), ikVar41.tY(), this.f312a.b.fl());
            case 278:
                ik ikVar42 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.p.e(ikVar42.V, (com.google.apps.tiktok.p.m) this.f312a.b.bv.a(), (com.google.apps.tiktok.p.u) this.f312a.mh.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), com.google.common.base.a.a);
            case 279:
                ik ikVar43 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.p.f(ikVar43.V, (com.google.apps.tiktok.p.m) this.f312a.b.bw.a(), (com.google.apps.tiktok.p.u) this.f312a.mh.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), com.google.common.base.a.a);
            case 280:
                ik ikVar44 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.p.d(ikVar44.V, (com.google.apps.tiktok.p.m) this.f312a.b.bx.a(), (com.google.apps.tiktok.p.u) this.f312a.mh.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), com.google.common.base.a.a);
            case 281:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.p.c((com.google.apps.tiktok.p.b.c) this.b.X.a());
            case 282:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.f.a(this.b.tZ());
            case 283:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.c.a.h((cg) this.b.cj.a(), (com.google.common.v.f) this.f312a.ez.a(), (Executor) this.f312a.H.a(), (ag) this.f312a.Q.a());
            case 284:
                ik ikVar45 = this.b;
                jo joVar22 = this.f312a;
                return ikVar45.kg().a(com.google.android.apps.search.assistant.surfaces.voice.robin.c.a.b.b(), (com.google.android.libraries.storage.a.j) joVar22.w.a());
            case 285:
                ik ikVar46 = this.b;
                jo joVar23 = this.f312a;
                return ikVar46.kg().a(com.google.android.apps.search.assistant.surfaces.voice.robin.s.a.c.b(), (com.google.android.libraries.storage.a.j) joVar23.w.a());
            case 286:
                return new com.google.android.libraries.search.assistant.aq.u.h((AudioManager) this.f312a.cZ.a(), this.f312a.b.ht());
            case 287:
                return new com.google.android.libraries.search.assistant.aq.u.p((Context) this.f312a.f.a(), (KeyguardManager) this.f312a.nn.a());
            case 288:
                return new com.google.android.libraries.search.assistant.aq.u.i((Context) this.f312a.f.a());
            case 289:
                return new com.google.android.libraries.search.assistant.aq.u.o((Context) this.f312a.f.a(), (NotificationManager) this.f312a.I.a());
            case 290:
                return new com.google.android.libraries.search.assistant.aq.u.j();
            case 291:
                return new com.google.android.libraries.search.assistant.aq.u.m((com.google.android.libraries.search.location.y) this.b.O.a(), (com.google.android.libraries.af.b.a) this.f312a.pd.a());
            case 292:
                ik ikVar47 = this.b;
                return new com.google.android.libraries.search.assistant.aq.r.a(ikVar47.uf(), ikVar47.ug(), this.f312a.b.bw());
            case 293:
                return fu.m(com.google.g.q.b.d.W, this.b.iD());
            case 294:
                ik ikVar48 = this.b;
                jo joVar24 = this.f312a;
                return ikVar48.kf().a(com.google.android.libraries.assistant.pcp.datastore.b.d.k.b(), (com.google.android.libraries.storage.a.j) joVar24.w.a());
            case 295:
                fq i2 = fu.i(8);
                i2.i(21, new com.google.android.libraries.assistant.pcp.u.c.a.i());
                i2.i(22, this.b.xM());
                i2.i(52, this.b.gZ());
                i2.i(51, this.b.ha());
                i2.i(54, this.b.xJ());
                i2.i(53, this.b.gY());
                i2.i(56, this.b.xK());
                i2.i(55, this.b.xL());
                return i2.c();
            case 296:
                return com.google.android.libraries.assistant.pcp.datastore.room.a.a.e((ContentDatabase) this.b.co.a());
            case 297:
                return com.google.android.libraries.assistant.pcp.datastore.room.a.a.b((com.google.apps.tiktok.q.c.h) this.b.cn.a(), this.b.kh());
            case 298:
                return com.google.android.libraries.assistant.pcp.datastore.room.a.a.c();
            case 299:
                return com.google.android.libraries.assistant.pcp.datastore.room.a.a.d((ContentDatabase) this.b.co.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        h hVar;
        h hVar2;
        h hVar3;
        jr jrVar;
        h hVar4;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        h hVar14;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        h hVar19;
        h hVar20;
        h hVar21;
        h hVar22;
        h hVar23;
        h hVar24;
        h hVar25;
        h hVar26;
        h hVar27;
        h hVar28;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        h hVar33;
        h hVar34;
        h hVar35;
        h hVar36;
        h hVar37;
        h hVar38;
        jr jrVar2;
        jr jrVar3;
        h hVar39;
        h hVar40;
        h hVar41;
        h hVar42;
        h hVar43;
        h hVar44;
        h hVar45;
        h hVar46;
        h hVar47;
        h hVar48;
        h hVar49;
        h hVar50;
        h hVar51;
        h hVar52;
        h hVar53;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        h hVar58;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        h hVar66;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        h hVar71;
        h hVar72;
        h hVar73;
        h hVar74;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        h hVar80;
        h hVar81;
        h hVar82;
        h hVar83;
        h hVar84;
        h hVar85;
        jr jrVar4;
        h hVar86;
        h hVar87;
        h hVar88;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        jr jrVar5;
        h hVar94;
        h hVar95;
        h hVar96;
        h hVar97;
        h hVar98;
        h hVar99;
        h hVar100;
        h hVar101;
        h hVar102;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        h hVar110;
        jy jyVar;
        h hVar111;
        h hVar112;
        jr jrVar6;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        h hVar117;
        h hVar118;
        h hVar119;
        h hVar120;
        h hVar121;
        h hVar122;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        h hVar128;
        h hVar129;
        h hVar130;
        h hVar131;
        h hVar132;
        h hVar133;
        h hVar134;
        h hVar135;
        h hVar136;
        h hVar137;
        h hVar138;
        h hVar139;
        h hVar140;
        h hVar141;
        h hVar142;
        h hVar143;
        h hVar144;
        h hVar145;
        h hVar146;
        h hVar147;
        h hVar148;
        jr jrVar7;
        h hVar149;
        h hVar150;
        h hVar151;
        h hVar152;
        h hVar153;
        h hVar154;
        h hVar155;
        h hVar156;
        h hVar157;
        h hVar158;
        h hVar159;
        h hVar160;
        h hVar161;
        h hVar162;
        h hVar163;
        h hVar164;
        h hVar165;
        h hVar166;
        h hVar167;
        h hVar168;
        h hVar169;
        h hVar170;
        h hVar171;
        h hVar172;
        h hVar173;
        h hVar174;
        int i = this.c;
        switch (i) {
            case 300:
                ik ikVar = this.b;
                jo joVar = this.f312a;
                com.google.apps.tiktok.q.b.h b = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.f.b();
                com.google.apps.tiktok.account.d.b.f kf = ikVar.kf();
                hVar = joVar.w;
                return com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.f.c(b, kf, (com.google.android.libraries.storage.a.j) hVar.a());
            case 301:
                hVar2 = this.b.g;
                AccountId accountId = (AccountId) hVar2.a();
                jo joVar2 = this.f312a;
                ik ikVar2 = this.b;
                ae fZ = joVar2.fZ();
                hVar3 = ikVar2.aK;
                com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v vVar = (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) hVar3.a();
                jo joVar3 = this.f312a;
                com.google.android.apps.search.assistant.verticals.ambient.s.h.af ga = joVar3.ga();
                jrVar = joVar3.b;
                boolean hv = jrVar.hv();
                hVar4 = this.f312a.f;
                Context context = (Context) hVar4.a();
                hVar5 = this.f312a.Q;
                ag agVar = (ag) hVar5.a();
                hVar6 = this.f312a.bo;
                return new com.google.android.apps.search.assistant.verticals.ambient.u.q.m(accountId, fZ, vVar, ga, hv, context, agVar, (ag) hVar6.a());
            case 302:
                ik ikVar3 = this.b;
                jo joVar4 = this.f312a;
                com.google.android.libraries.assistant.pcp.datastore.a.a.g gQ = ikVar3.gQ();
                j gS = ikVar3.gS();
                w gy = ikVar3.gy();
                com.google.android.libraries.assistant.pcp.j.a.d gP = ikVar3.gP();
                hVar7 = joVar4.ez;
                com.google.common.v.f fVar = (com.google.common.v.f) hVar7.a();
                hVar8 = this.b.aB;
                lt ltVar = (lt) hVar8.a();
                hVar9 = this.f312a.we;
                i iVar = (i) hVar9.a();
                hVar10 = this.f312a.H;
                return new com.google.android.libraries.assistant.pcp.k.a.a.ah(gQ, gS, gy, gP, fVar, ltVar, iVar, (Executor) hVar10.a());
            case 303:
                ik ikVar4 = this.b;
                jo joVar5 = this.f312a;
                com.google.android.libraries.assistant.pcp.j.a.d gP2 = ikVar4.gP();
                hVar11 = joVar5.H;
                return new com.google.android.libraries.assistant.pcp.b.a.a(gP2, (Executor) hVar11.a());
            case 304:
                ik ikVar5 = this.b;
                jo joVar6 = this.f312a;
                com.google.apps.tiktok.q.b.h c = com.google.android.libraries.assistant.pcp.datastore.b.a.e.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar5.kf();
                hVar12 = joVar6.w;
                return com.google.android.libraries.assistant.pcp.datastore.b.a.e.b(c, kf2, (com.google.android.libraries.storage.a.j) hVar12.a());
            case 305:
                ik ikVar6 = this.b;
                jo joVar7 = this.f312a;
                Object qG = ikVar6.qG();
                Object qp = ikVar6.qp();
                hVar13 = joVar7.H;
                Executor executor = (Executor) hVar13.a();
                jo joVar8 = this.f312a;
                Optional empty = Optional.empty();
                hVar14 = joVar8.g;
                return new com.google.android.libraries.assistant.pcp.p.a.d((com.google.android.libraries.assistant.pcp.p.a.l) qG, (com.google.android.libraries.assistant.pcp.p.a.c) qp, executor, empty, (com.google.android.libraries.g.a) hVar14.a());
            case 306:
                ik ikVar7 = this.b;
                jo joVar9 = this.f312a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.a.e.c();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar7.kf();
                hVar15 = joVar9.w;
                return com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.a.e.b(c2, kf3, (com.google.android.libraries.storage.a.j) hVar15.a());
            case 307:
                return new lt(this);
            case 308:
                ik ikVar8 = this.b;
                com.google.android.libraries.assistant.pcp.j.a.d gP3 = ikVar8.gP();
                com.google.android.libraries.assistant.pcp.b.c.t gw = ikVar8.gw();
                hVar16 = ikVar8.cu;
                com.google.android.libraries.assistant.pcp.b.c cVar = (com.google.android.libraries.assistant.pcp.b.c) hVar16.a();
                hVar17 = this.f312a.we;
                i iVar2 = (i) hVar17.a();
                hVar18 = this.f312a.H;
                Executor executor2 = (Executor) hVar18.a();
                hVar19 = this.f312a.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar19.a();
                hVar20 = this.f312a.g;
                return new com.google.android.libraries.assistant.pcp.j.a.g(gP3, gw, cVar, iVar2, executor2, fVar2, (com.google.android.libraries.g.a) hVar20.a());
            case 309:
                ik ikVar9 = this.b;
                Object qo = ikVar9.qo();
                com.google.android.libraries.assistant.pcp.b.a.r gt = ikVar9.gt();
                hVar21 = ikVar9.cr;
                com.google.android.libraries.assistant.pcp.b.b bVar = (com.google.android.libraries.assistant.pcp.b.b) hVar21.a();
                ik ikVar10 = this.b;
                jo joVar10 = this.f312a;
                com.google.android.libraries.assistant.pcp.datastore.b.a.d gR = ikVar10.gR();
                com.google.android.libraries.assistant.pcp.b.c.t gw2 = ikVar10.gw();
                Object qB = ikVar10.qB();
                w gy2 = ikVar10.gy();
                com.google.android.libraries.assistant.pcp.d.a.x gz = ikVar10.gz();
                com.google.android.libraries.assistant.pcp.g.a.ac gA = ikVar10.gA();
                hVar22 = joVar10.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar22.a();
                hVar23 = this.b.aB;
                lt ltVar2 = (lt) hVar23.a();
                hVar24 = this.f312a.we;
                i iVar3 = (i) hVar24.a();
                hVar25 = this.f312a.H;
                Executor executor3 = (Executor) hVar25.a();
                hVar26 = this.f312a.g;
                return new com.google.android.libraries.assistant.pcp.b.a.y((com.google.android.libraries.assistant.pcp.b.a.p) qo, gt, bVar, gR, gw2, (com.google.android.libraries.assistant.pcp.f.x) qB, gy2, gz, gA, fVar3, ltVar2, iVar3, executor3, (com.google.android.libraries.g.a) hVar26.a());
            case 310:
                hVar27 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar27.a();
                hVar28 = this.f312a.bo;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.y.aw(auVar, (ag) hVar28.a());
            case 311:
                return com.google.android.apps.search.assistant.platform.g.c.b.a.c(this.b.qg());
            case 312:
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.d.c.d(this.b.qg());
            case 313:
                ik ikVar11 = this.b;
                bw hQ = ikVar11.hQ();
                hVar29 = ikVar11.cK;
                e.a b2 = e.c.c.b(hVar29);
                hVar30 = this.f312a.P;
                m.c.n nVar = (m.c.n) hVar30.a();
                hVar31 = this.b.cL;
                com.google.android.apps.search.assistant.surfaces.voice.e.a.a aVar = (com.google.android.apps.search.assistant.surfaces.voice.e.a.a) hVar31.a();
                ik ikVar12 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.a aX = ikVar12.aX();
                hVar32 = ikVar12.cM;
                nz nzVar = (nz) hVar32.a();
                ik ikVar13 = this.b;
                boolean up = ikVar13.up();
                hVar33 = ikVar13.cN;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.c cVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.c) hVar33.a();
                hVar34 = this.b.cP;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.g gVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.g) hVar34.a();
                hVar35 = this.b.cQ;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l lVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l) hVar35.a();
                hVar36 = this.b.cR;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.k) hVar36.a();
                hVar37 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar37.a();
                hVar38 = this.b.cU;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.i.a.o(hQ, b2, nVar, aVar, aX, nzVar, up, cVar2, gVar, lVar, kVar, dVar, e.c.c.b(hVar38), this.b.us());
            case 314:
                jrVar2 = this.f312a.b;
                return new com.google.android.libraries.search.assistant.u.d(jrVar2.fs());
            case 315:
                return new nz(this);
            case 316:
                return new nz(this);
            case 317:
                jrVar3 = this.f312a.b;
                com.google.android.libraries.search.assistant.n.b.b.b bVar2 = (com.google.android.libraries.search.assistant.n.b.b.b) jr.bM(jrVar3).a();
                hVar39 = this.b.ju;
                return new com.google.android.libraries.search.assistant.n.b.b.c(bVar2, (com.google.android.libraries.search.assistant.n.b.b.g) hVar39.a());
            case 318:
                hVar40 = this.f312a.f;
                return new com.google.android.libraries.search.assistant.n.b.b.g((Context) hVar40.a());
            case 319:
                return new fo();
            case 320:
                return this.b.rk();
            case 321:
                ik ikVar14 = this.b;
                jo joVar11 = this.f312a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR = ikVar14.aR();
                hVar41 = joVar11.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar3 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar41.a();
                ik ikVar15 = this.b;
                boolean ui = ikVar15.ui();
                boolean uj = ikVar15.uj();
                hVar42 = ikVar15.cD;
                ((Boolean) hVar42.a()).booleanValue();
                hVar43 = this.b.cE;
                boolean booleanValue = ((Boolean) hVar43.a()).booleanValue();
                ik ikVar16 = this.b;
                jo joVar12 = this.f312a;
                boolean uk = ikVar16.uk();
                boolean ul = ikVar16.ul();
                com.google.protos.l.a.e lB = ikVar16.lB();
                hVar44 = joVar12.Q;
                ag agVar2 = (ag) hVar44.a();
                hVar45 = this.b.as;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.ae(aR, bVar3, ui, uj, booleanValue, uk, ul, lB, agVar2, (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p) hVar45.a(), this.b.aY());
            case 322:
                hVar46 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.s.g((com.google.android.apps.search.assistant.platform.g.c.g) hVar46.a());
            case 323:
                hVar47 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.s.d((com.google.android.apps.search.assistant.platform.g.c.g) hVar47.a());
            case 324:
                return Boolean.valueOf(h.a.a.d.b.a.r.e(this.b.ym()));
            case 325:
                return Boolean.valueOf(h.a.a.e.a.a.g.b(this.b.yf()));
            case 326:
                return new com.google.android.libraries.search.assistant.n.a.d.as(this.b.qg());
            case 327:
                ik ikVar17 = this.b;
                gy l = ha.l(9);
                l.j(ikVar17.rs());
                l.j(this.b.rz());
                l.j(this.b.rA());
                l.j(this.b.sf());
                l.h(this.b.aF());
                l.h(this.b.aJ());
                l.h(this.b.aH());
                hVar48 = this.b.jE;
                l.h((com.google.android.libraries.search.assistant.n.a.a.b) hVar48.a());
                l.h(this.b.aG());
                return l.g();
            case 328:
                hVar49 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar2 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar49.a();
                hVar50 = this.f312a.Q;
                ag agVar3 = (ag) hVar50.a();
                hVar51 = this.b.ah;
                return new com.google.android.libraries.search.assistant.n.a.e.b.a.j(dVar2, agVar3, (com.google.android.apps.search.assistant.platform.g.c.g) hVar51.a());
            case 329:
                hVar52 = this.f312a.v;
                Executor executor4 = (Executor) hVar52.a();
                hVar53 = this.b.jy;
                return new com.google.android.libraries.search.assistant.aq.q.a.i(executor4, (com.google.android.libraries.search.assistant.aq.q.b) hVar53.a());
            case 330:
                hVar54 = this.f312a.MT;
                com.google.android.libraries.search.l.aa aaVar = (com.google.android.libraries.search.l.aa) hVar54.a();
                hVar55 = this.f312a.bq;
                com.google.apps.tiktok.account.data.a.d dVar3 = (com.google.apps.tiktok.account.data.a.d) hVar55.a();
                hVar56 = this.f312a.n;
                cq cqVar = (cq) hVar56.a();
                hVar57 = this.b.g;
                AccountId accountId2 = (AccountId) hVar57.a();
                ik ikVar18 = this.b;
                jo joVar13 = this.f312a;
                com.google.android.libraries.search.b.b hz = ikVar18.hz();
                hVar58 = joVar13.g;
                return new com.google.android.libraries.search.assistant.aq.q.f(aaVar, dVar3, cqVar, accountId2, hz, (com.google.android.libraries.g.a) hVar58.a());
            case 331:
                return com.google.android.apps.search.assistant.surfaces.voice.e.o.b(this.b.iN());
            case 332:
                hVar59 = this.b.Q;
                com.google.android.libraries.search.udcdataservice.k kVar2 = (com.google.android.libraries.search.udcdataservice.k) hVar59.a();
                hVar60 = this.b.Z;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ag.c(kVar2, (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar60.a());
            case 333:
                return com.google.android.libraries.search.assistant.aq.v.b.a.b(this.b.qh());
            case 334:
                return com.google.android.libraries.search.assistant.aq.b.a.g.b(this.b.iI());
            case 335:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.l.a();
            case 336:
                return com.google.android.apps.search.assistant.surfaces.voice.e.d.a.g(this.b.iK());
            case 337:
                hVar61 = this.f312a.f;
                Context context2 = (Context) hVar61.a();
                hVar62 = this.b.cJ;
                com.google.android.libraries.search.assistant.ab.t tVar = (com.google.android.libraries.search.assistant.ab.t) hVar62.a();
                hVar63 = this.f312a.h;
                return new com.google.android.libraries.search.assistant.aq.u.g(context2, tVar, (PackageManager) hVar63.a());
            case 338:
                hVar64 = this.b.jF;
                cg cgVar = (cg) hVar64.a();
                hVar65 = this.f312a.ez;
                com.google.common.v.f fVar4 = (com.google.common.v.f) hVar65.a();
                hVar66 = this.f312a.W;
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) hVar66.a();
                hVar67 = this.f312a.Y;
                return new com.google.android.libraries.search.assistant.ab.t(cgVar, fVar4, yVar, (String) hVar67.a());
            case 339:
                ik ikVar19 = this.b;
                jo joVar14 = this.f312a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.libraries.search.assistant.ab.u.c();
                com.google.apps.tiktok.account.d.b.a.b kg = ikVar19.kg();
                hVar68 = joVar14.w;
                return com.google.android.libraries.search.assistant.ab.u.b(c3, kg, (com.google.android.libraries.storage.a.j) hVar68.a());
            case 340:
                hVar69 = this.f312a.f;
                return new com.google.android.libraries.search.assistant.aq.u.n((Context) hVar69.a());
            case 341:
                return new Cif(this);
            case 342:
                return new nz(this);
            case 343:
                hVar70 = this.f312a.Q;
                ag agVar4 = (ag) hVar70.a();
                hVar71 = this.f312a.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar4 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar71.a();
                this.b.xD();
                ik ikVar20 = this.b;
                boolean uo = ikVar20.uo();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.a aX2 = ikVar20.aX();
                hVar72 = ikVar20.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar5 = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar72.a();
                ik ikVar21 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.b.c(agVar4, bVar4, uo, aX2, bVar5, ikVar21.uq(), ikVar21.qI(), ikVar21.qJ());
            case 344:
                hVar73 = this.f312a.Q;
                ag agVar5 = (ag) hVar73.a();
                hVar74 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar6 = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar74.a();
                hVar75 = this.b.cN;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.c cVar3 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.c) hVar75.a();
                ik ikVar22 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR2 = ikVar22.aR();
                boolean ur = ikVar22.ur();
                boolean uC = ikVar22.uC();
                hVar76 = ikVar22.jJ;
                boolean us = ikVar22.us();
                hVar77 = ikVar22.Z;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.b.g(agVar5, bVar6, cVar3, aR2, ur, uC, hVar76, us, (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar77.a());
            case 345:
                hVar78 = this.f312a.P;
                m.c.n nVar2 = (m.c.n) hVar78.a();
                hVar79 = this.f312a.Q;
                ag agVar6 = (ag) hVar79.a();
                hVar80 = this.f312a.bt;
                m.c.n nVar3 = (m.c.n) hVar80.a();
                hVar81 = this.f312a.bu;
                ag agVar7 = (ag) hVar81.a();
                hVar82 = this.f312a.f;
                Context context3 = (Context) hVar82.a();
                hVar83 = this.f312a.iv;
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) hVar83.a();
                hVar84 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar7 = (com.google.apps.tiktok.account.data.b) hVar84.a();
                hVar85 = this.b.cO;
                lt ltVar3 = (lt) hVar85.a();
                jo joVar15 = this.f312a;
                AccountManager u = joVar15.u();
                jrVar4 = joVar15.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q qVar = (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) jr.bA(jrVar4).a();
                hVar86 = this.b.hE;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.v(nVar2, agVar6, nVar3, agVar7, context3, axVar, bVar7, ltVar3, u, qVar, (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) hVar86.a(), this.b.uz());
            case 346:
                return new lt(this);
            case 347:
                hVar87 = this.f312a.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar8 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar87.a();
                ik ikVar23 = this.b;
                boolean uo2 = ikVar23.uo();
                hVar88 = ikVar23.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar9 = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar88.a();
                ik ikVar24 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l(bVar8, uo2, bVar9, ikVar24.uq(), ikVar24.qK());
            case 348:
                hVar89 = this.f312a.Q;
                ag agVar8 = (ag) hVar89.a();
                hVar90 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar10 = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar90.a();
                hVar91 = this.b.cQ;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l lVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l) hVar91.a();
                ik ikVar25 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR3 = ikVar25.aR();
                boolean ur2 = ikVar25.ur();
                boolean uC2 = ikVar25.uC();
                hVar92 = ikVar25.jJ;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.b.k(agVar8, bVar10, lVar2, aR3, ur2, uC2, hVar92);
            case 349:
                hVar93 = this.b.jP;
                nz nzVar2 = (nz) hVar93.a();
                jrVar5 = this.f312a.b;
                com.google.android.libraries.search.assistant.ao.f.a aVar2 = (com.google.android.libraries.search.assistant.ao.f.a) jr.eE(jrVar5).a();
                ik ikVar26 = this.b;
                jo joVar16 = this.f312a;
                com.google.android.libraries.search.assistant.ao.e.a.m iH = ikVar26.iH();
                hVar94 = joVar16.Q;
                return new com.google.android.libraries.search.assistant.ao.b.m(nzVar2, aVar2, iH, (ag) hVar94.a());
            case 350:
                return new nz(this);
            case 351:
                return new nz(this);
            case 352:
                ik ikVar27 = this.b;
                io.grpc.i qg = ikVar27.qg();
                hVar95 = ikVar27.jL;
                return com.google.android.libraries.search.assistant.z.c.b.a.b(qg, (com.google.android.libraries.search.assistant.z.c.a.q) hVar95.a());
            case 353:
                hVar96 = this.f312a.H;
                return new com.google.android.libraries.search.assistant.z.c.a.q((cq) hVar96.a());
            case 354:
                return new nz(this);
            case 355:
                return new nz(this);
            case 356:
                return new nz(this);
            case 357:
                ik ikVar28 = this.b;
                jo joVar17 = this.f312a;
                com.google.apps.tiktok.q.b.h c4 = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.a.c();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar28.kf();
                hVar97 = joVar17.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.a.b(c4, kf4, (com.google.android.libraries.storage.a.j) hVar97.a());
            case 358:
                hVar98 = this.b.jR;
                cg cgVar2 = (cg) hVar98.a();
                hVar99 = this.f312a.ez;
                com.google.common.v.f fVar5 = (com.google.common.v.f) hVar99.a();
                hVar100 = this.f312a.v;
                Executor executor5 = (Executor) hVar100.a();
                hVar101 = this.b.z;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.f(cgVar2, fVar5, executor5, (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am) hVar101.a(), this.b.wr());
            case 359:
                ik ikVar29 = this.b;
                jo joVar18 = this.f312a;
                com.google.apps.tiktok.q.b.h b3 = com.google.android.apps.search.assistant.surfaces.voice.robin.x.a.b();
                com.google.apps.tiktok.account.d.b.a.b kg2 = ikVar29.kg();
                hVar102 = joVar18.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.x.a.d(b3, kg2, (com.google.android.libraries.storage.a.j) hVar102.a());
            case 360:
                return new nz(this);
            case 361:
                ik ikVar30 = this.b;
                return ha.s(ikVar30.Y(), ikVar30.s());
            case 362:
                hVar103 = this.f312a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar103.a();
                hVar104 = this.f312a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar104.a();
                hVar105 = this.f312a.H;
                cq cqVar2 = (cq) hVar105.a();
                jo joVar19 = this.f312a;
                ik ikVar31 = this.b;
                return com.google.android.apps.gsa.assistant.settings.features.y.a.p.c(aVar3, extensionRegistryLite, cqVar2, joVar19.mx(), joVar19.md(), ikVar31.kj(), ikVar31.ye());
            case 363:
                return new com.google.apps.tiktok.g.an();
            case 364:
                ik ikVar32 = this.b;
                jo joVar20 = this.f312a;
                com.google.apps.tiktok.q.b.h ku = ikVar32.ku();
                com.google.apps.tiktok.account.d.b.a.b kg3 = ikVar32.kg();
                hVar106 = joVar20.w;
                return com.google.android.apps.search.assistant.platform.g.n.o.c(ku, kg3, (com.google.android.libraries.storage.a.j) hVar106.a());
            case 365:
                hVar107 = this.f312a.eA;
                return com.google.android.apps.search.assistant.platform.g.n.o.b((io.grpc.i) hVar107.a());
            case 366:
                return com.google.android.apps.search.assistant.verticals.automation.routines.i.b.a.b(this.b.qh());
            case 367:
                hVar108 = this.b.g;
                AccountId accountId3 = (AccountId) hVar108.a();
                hVar109 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar11 = (com.google.apps.tiktok.account.data.b) hVar109.a();
                hVar110 = this.b.hf;
                com.google.android.libraries.web.a.a.c cVar4 = (com.google.android.libraries.web.a.a.c) hVar110.a();
                jyVar = this.f312a.f319a;
                com.google.android.libraries.web.d.b bVar12 = (com.google.android.libraries.web.d.b) jy.fz(jyVar).a();
                ik ikVar33 = this.b;
                jo joVar21 = this.f312a;
                com.google.android.libraries.web.o.a.a.a.r jX = ikVar33.jX();
                com.google.android.libraries.web.webview.a.x ka = ikVar33.ka();
                hVar111 = joVar21.Q;
                ag agVar9 = (ag) hVar111.a();
                hVar112 = this.f312a.P;
                return new com.google.android.libraries.web.contrib.account.internal.o(accountId3, bVar11, cVar4, bVar12, jX, ka, agVar9, (m.c.n) hVar112.a());
            case 368:
                return new com.google.android.libraries.web.base.a.c.b();
            case 369:
                return new op(this.b.jE());
            case 370:
                ik ikVar34 = this.b;
                jo joVar22 = this.f312a;
                io.grpc.i qg2 = ikVar34.qg();
                io.grpc.i qh = ikVar34.qh();
                jrVar6 = joVar22.b;
                return com.google.android.libraries.search.ah.b.e.bk.b(qg2, qh, jrVar6.hB());
            case 371:
                return new op(this.b.jD());
            case 372:
                hVar113 = this.b.db;
                com.google.android.libraries.speech.c.b.i iVar4 = (com.google.android.libraries.speech.c.b.i) hVar113.a();
                hVar114 = this.f312a.tR;
                com.google.android.libraries.speech.c.b.aj ajVar = (com.google.android.libraries.speech.c.b.aj) hVar114.a();
                hVar115 = this.f312a.f;
                Context context4 = (Context) hVar115.a();
                hVar116 = this.f312a.tL;
                com.google.android.libraries.search.b.b bVar13 = (com.google.android.libraries.search.b.b) hVar116.a();
                jo joVar23 = this.f312a;
                boolean abG = joVar23.abG();
                hVar117 = joVar23.H;
                return new com.google.android.libraries.speech.c.b.ae(iVar4, ajVar, context4, bVar13, abG, (cq) hVar117.a());
            case 373:
                jo joVar24 = this.f312a;
                ik ikVar35 = this.b;
                com.google.android.libraries.speech.c.b.j.f mb = joVar24.mb();
                hVar118 = ikVar35.kd;
                com.google.android.libraries.speech.c.b.k.af afVar = (com.google.android.libraries.speech.c.b.k.af) hVar118.a();
                hVar119 = this.f312a.tQ;
                Optional of = Optional.of((com.google.android.libraries.speech.c.b.ak) hVar119.a());
                hVar120 = this.f312a.H;
                cq cqVar3 = (cq) hVar120.a();
                hVar121 = this.f312a.tR;
                com.google.android.libraries.speech.c.b.aj ajVar2 = (com.google.android.libraries.speech.c.b.aj) hVar121.a();
                hVar122 = this.f312a.tL;
                com.google.android.libraries.search.b.b bVar14 = (com.google.android.libraries.search.b.b) hVar122.a();
                jo joVar25 = this.f312a;
                return new com.google.android.libraries.speech.c.b.b.o(mb, afVar, of, cqVar3, ajVar2, bVar14, joVar25.abG(), joVar25.abH());
            case 374:
                hVar123 = this.f312a.hP;
                com.google.android.libraries.mdi.download.bz bzVar = (com.google.android.libraries.mdi.download.bz) hVar123.a();
                hVar124 = this.f312a.as;
                com.google.android.libraries.storage.a.j jVar = (com.google.android.libraries.storage.a.j) hVar124.a();
                hVar125 = this.f312a.tO;
                com.google.android.libraries.speech.c.b.k.s sVar = (com.google.android.libraries.speech.c.b.k.s) hVar125.a();
                hVar126 = this.f312a.tN;
                com.google.android.libraries.speech.c.b.aj ajVar3 = (com.google.android.libraries.speech.c.b.aj) hVar126.a();
                hVar127 = this.f312a.tM;
                com.google.android.libraries.speech.c.b.k.e eVar = (com.google.android.libraries.speech.c.b.k.e) hVar127.a();
                boolean abF = this.f312a.abF();
                jo joVar26 = this.f312a;
                com.google.android.libraries.speech.c.b.c.e lY = joVar26.lY();
                hVar128 = joVar26.f;
                Context context5 = (Context) hVar128.a();
                hVar129 = this.f312a.tL;
                com.google.android.libraries.search.b.b bVar15 = (com.google.android.libraries.search.b.b) hVar129.a();
                ik ikVar36 = this.b;
                jo joVar27 = this.f312a;
                Boolean valueOf = Boolean.valueOf(abF);
                com.google.android.libraries.speech.c.b.h.d jR = ikVar36.jR();
                hVar130 = joVar27.H;
                cq cqVar4 = (cq) hVar130.a();
                hVar131 = this.f312a.v;
                return new com.google.android.libraries.speech.c.b.k.af(bzVar, jVar, sVar, ajVar3, eVar, valueOf, lY, context5, bVar15, jR, cqVar4, (cq) hVar131.a());
            case 375:
            case 376:
                return new op(this.b.jH());
            case 377:
                hVar132 = this.b.kf;
                return Optional.of((Cdo) hVar132.a());
            case 378:
                jo joVar28 = this.f312a;
                ik ikVar37 = this.b;
                com.google.android.libraries.search.ah.i.b.dp lB2 = joVar28.lB();
                hVar133 = ikVar37.ke;
                return com.google.android.libraries.search.ah.i.c.n.h(lB2, (cg) hVar133.a());
            case 379:
                ik ikVar38 = this.b;
                jo joVar29 = this.f312a;
                com.google.apps.tiktok.q.b.h f = com.google.android.libraries.search.ah.i.c.n.f();
                com.google.apps.tiktok.account.d.b.a.b kg4 = ikVar38.kg();
                hVar134 = joVar29.w;
                return com.google.android.libraries.search.ah.i.c.n.c(f, kg4, (com.google.android.libraries.storage.a.j) hVar134.a());
            case 380:
                hVar135 = this.f312a.jB;
                LauncherApps launcherApps = (LauncherApps) hVar135.a();
                hVar136 = this.f312a.H;
                cq cqVar5 = (cq) hVar136.a();
                hVar137 = this.f312a.bz;
                return new com.google.android.apps.search.assistant.verticals.a.g.a.e(launcherApps, cqVar5, (com.google.apps.tiktok.concurrent.ao) hVar137.a(), this.b.hM());
            case 381:
                return new com.google.android.apps.search.assistant.surfaces.voice.i.e.g();
            case 382:
                hVar138 = this.b.kj;
                cg cgVar3 = (cg) hVar138.a();
                hVar139 = this.f312a.bo;
                ag agVar10 = (ag) hVar139.a();
                hVar140 = this.f312a.iu;
                return new com.google.android.apps.search.assistant.platform.g.a.a.f(cgVar3, agVar10, (ay) hVar140.a());
            case 383:
                ik ikVar39 = this.b;
                jo joVar30 = this.f312a;
                com.google.apps.tiktok.q.b.h c5 = com.google.android.apps.search.assistant.platform.g.a.a.g.c();
                com.google.apps.tiktok.account.d.b.a.b kg5 = ikVar39.kg();
                hVar141 = joVar30.w;
                return com.google.android.apps.search.assistant.platform.g.a.a.g.b(c5, kg5, (com.google.android.libraries.storage.a.j) hVar141.a());
            case 384:
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.h.j.c(this.b.qg());
            case 385:
                hVar142 = this.f312a.f;
                Context context6 = (Context) hVar142.a();
                hVar143 = this.b.kk;
                cg cgVar4 = (cg) hVar143.a();
                hVar144 = this.f312a.R;
                m.c.n nVar4 = (m.c.n) hVar144.a();
                hVar145 = this.f312a.H;
                Executor executor6 = (Executor) hVar145.a();
                hVar146 = this.f312a.bo;
                ag agVar11 = (ag) hVar146.a();
                hVar147 = this.f312a.Q;
                ag agVar12 = (ag) hVar147.a();
                hVar148 = this.b.W;
                com.google.android.libraries.search.trust.b.y yVar2 = (com.google.android.libraries.search.trust.b.y) hVar148.a();
                jrVar7 = this.f312a.b;
                com.google.android.gms.b.b.a.a aVar4 = (com.google.android.gms.b.b.a.a) jr.cz(jrVar7).a();
                ik ikVar40 = this.b;
                boolean uA = ikVar40.uA();
                hVar149 = ikVar40.S;
                return new com.google.android.libraries.search.a.b.q(context6, cgVar4, nVar4, executor6, agVar11, agVar12, yVar2, aVar4, uA, (com.google.android.libraries.search.trust.b.e) hVar149.a());
            case 386:
                ik ikVar41 = this.b;
                jo joVar31 = this.f312a;
                com.google.apps.tiktok.q.b.h c6 = t.c();
                com.google.apps.tiktok.account.d.b.a.b kg6 = ikVar41.kg();
                hVar150 = joVar31.w;
                return t.e(c6, kg6, (com.google.android.libraries.storage.a.j) hVar150.a());
            case 387:
                ik ikVar42 = this.b;
                jo joVar32 = this.f312a;
                com.google.apps.tiktok.q.b.h c7 = com.google.android.libraries.search.assistant.aq.i.a.g.c();
                com.google.apps.tiktok.account.d.b.a.b kg7 = ikVar42.kg();
                hVar151 = joVar32.w;
                return com.google.android.libraries.search.assistant.aq.i.a.g.b(c7, kg7, (com.google.android.libraries.storage.a.j) hVar151.a());
            case 388:
                return Boolean.valueOf(h.a.a.f.b.a.f.b(this.b.pU()));
            case 389:
                hVar152 = this.b.gH;
                cw cwVar = (cw) hVar152.a();
                hVar153 = this.f312a.aj;
                nz nzVar3 = (nz) hVar153.a();
                hVar154 = this.b.g;
                AccountId accountId4 = (AccountId) hVar154.a();
                ik ikVar43 = this.b;
                jo joVar33 = this.f312a;
                fu l2 = fu.l();
                com.google.apps.tiktok.account.d.f kd = ikVar43.kd();
                hVar155 = joVar33.ho;
                com.google.apps.tiktok.experiments.phenotype.m mVar = (com.google.apps.tiktok.experiments.phenotype.m) hVar155.a();
                hVar156 = this.f312a.B;
                Executor executor7 = (Executor) hVar156.a();
                hVar157 = this.f312a.bN;
                return com.google.apps.tiktok.experiments.phenotype.ae.i(cwVar, nzVar3, accountId4, l2, kd, mVar, executor7, (com.google.apps.tiktok.account.data.b) hVar157.a(), this.f312a.agc());
            case 390:
                hVar158 = this.f312a.Q;
                return new com.google.android.libraries.search.assistant.p.e.b.d((ag) hVar158.a());
            case 391:
                return new com.google.android.libraries.search.ah.b.d.a(100);
            case 392:
                return new com.google.android.libraries.search.ah.b.d.a(200);
            case 393:
                ik ikVar44 = this.b;
                jo joVar34 = this.f312a;
                com.google.android.libraries.p.a.d.h hi = ikVar44.hi();
                hVar159 = joVar34.Q;
                return new com.google.android.libraries.p.a.b.c.ab(hi, (ag) hVar159.a(), this.b.hg());
            case 394:
                hVar160 = this.f312a.Q;
                ag agVar13 = (ag) hVar160.a();
                hVar161 = this.b.g;
                AccountId accountId5 = (AccountId) hVar161.a();
                hVar162 = this.f312a.bN;
                com.google.apps.tiktok.account.data.b bVar16 = (com.google.apps.tiktok.account.data.b) hVar162.a();
                hVar163 = this.f312a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar163.a();
                hVar164 = this.b.km;
                return new com.google.android.libraries.p.a.d.d(agVar13, accountId5, bVar16, aVar5, (com.google.frameworks.a.a.a.a.e) hVar164.a());
            case 395:
                ik ikVar45 = this.b;
                com.google.frameworks.a.a.a.a.e kV = ikVar45.kV();
                hVar165 = ikVar45.X;
                return com.google.android.libraries.p.a.d.k.c(kV, (com.google.apps.tiktok.p.b.c) hVar165.a());
            case 396:
                hVar166 = this.f312a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar166.a();
                hVar167 = this.f312a.Q;
                return new com.google.android.libraries.search.assistant.av.c.a.d(aVar6, (ag) hVar167.a(), this.b.sc());
            case 397:
                hVar168 = this.f312a.Q;
                return new com.google.android.libraries.search.assistant.aw.d.f((ag) hVar168.a(), this.b.sb());
            case 398:
                hVar169 = this.f312a.f;
                Context context7 = (Context) hVar169.a();
                ik ikVar46 = this.b;
                com.google.android.libraries.search.assistant.aw.k.a.e iQ = ikVar46.iQ();
                com.google.android.libraries.search.assistant.aw.h.a iP = ikVar46.iP();
                com.google.android.libraries.search.assistant.aw.c.a.a aVar7 = new com.google.android.libraries.search.assistant.aw.c.a.a();
                ik ikVar47 = this.b;
                com.google.android.libraries.search.assistant.aw.l.a.c iR = ikVar47.iR();
                hVar170 = ikVar47.dp;
                com.google.android.libraries.search.assistant.aw.e.a.a aVar8 = (com.google.android.libraries.search.assistant.aw.e.a.a) hVar170.a();
                hVar171 = this.b.dw;
                e.a b4 = e.c.c.b(hVar171);
                hVar172 = this.f312a.H;
                return new com.google.android.libraries.search.assistant.aw.c.j(context7, iQ, iP, aVar7, iR, aVar8, b4, (Executor) hVar172.a());
            case 399:
                hVar173 = this.f312a.f;
                Context context8 = (Context) hVar173.a();
                hVar174 = this.f312a.Q;
                return new com.google.android.libraries.search.assistant.aw.n.c(context8, (ag) hVar174.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.c;
        switch (i) {
            case 400:
                return new ig(this);
            case 401:
                ik ikVar = this.b;
                return new com.google.android.libraries.search.assistant.aw.e.a.a(ikVar.hD(), (com.google.android.libraries.search.assistant.aw.n.d.b) ikVar.f2do.a(), this.f312a.b.ix().d());
            case 402:
                return new com.google.android.libraries.search.assistant.aw.n.d.b();
            case 403:
                return new com.google.android.libraries.search.assistant.aw.c.b(this.b.iO());
            case 404:
                jo joVar = this.f312a;
                ik ikVar2 = this.b;
                return new com.google.android.libraries.search.assistant.aw.i.a.m(joVar.b.bT, ikVar2.dp, ikVar2.ds);
            case 405:
                ik ikVar3 = this.b;
                jo joVar2 = this.f312a;
                return new com.google.android.libraries.search.assistant.aw.i.a.g(ikVar3.dq, joVar2.f, joVar2.cZ, joVar2.g, joVar2.b.aE, joVar2.bz, ikVar3.dr);
            case 406:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45419350").f());
            case 407:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45642630").f());
            case 408:
                return new com.google.android.libraries.search.assistant.aw.n.c.a((com.google.android.libraries.g.a) this.f312a.g.a());
            case 409:
                jo joVar3 = this.f312a;
                ik ikVar4 = this.b;
                return new com.google.android.libraries.search.assistant.aw.m.b.j(joVar3.b.aG, joVar3.f, joVar3.bo, joVar3.H, ikVar4.f2do, ikVar4.dp);
            case 410:
                ik ikVar5 = this.b;
                jo joVar4 = this.f312a;
                h hVar = ikVar5.du;
                h hVar2 = joVar4.wr;
                h hVar3 = joVar4.H;
                return new com.google.android.libraries.search.assistant.aw.m.b.z(hVar, hVar2, hVar3, hVar3, ikVar5.dp);
            case 411:
                return new lz(this.f312a, this.b);
            case 412:
                return new lt(this);
            case 413:
                com.google.android.libraries.assistant.q.q a2 = com.google.android.libraries.assistant.q.r.a(this.b.qh());
                a2.getClass();
                return a2;
            case 414:
                return new com.google.android.libraries.search.assistant.performer.deviceactions.b.a.c((cg) this.b.dy.a());
            case 415:
                ik ikVar6 = this.b;
                jo joVar5 = this.f312a;
                return ikVar6.kf().a(com.google.android.libraries.search.assistant.performer.deviceactions.b.a.d.a(), (com.google.android.libraries.storage.a.j) joVar5.w.a());
            case 416:
                return new com.google.android.libraries.search.assistant.performer.deviceactions.i((com.google.android.libraries.search.assistant.invocation.t.a.c) this.b.bs.a(), (Executor) this.f312a.H.a());
            case 417:
                return new com.google.android.libraries.search.assistant.performer.h.m(this.b.xZ(), (cq) this.f312a.H.a(), (com.google.android.libraries.g.a) this.f312a.g.a());
            case 418:
                ik ikVar7 = this.b;
                jo joVar6 = this.f312a;
                return ikVar7.kf().a(com.google.android.libraries.search.assistant.aq.i.a.f.a(), (com.google.android.libraries.storage.a.j) joVar6.w.a());
            case 419:
                jo joVar7 = this.f312a;
                ik ikVar8 = this.b;
                return new com.google.android.libraries.search.assistant.performer.l.h((com.google.android.libraries.search.assistant.performer.l.ac) joVar7.b.fc(), (AccountId) ikVar8.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f312a.bq.a(), (com.google.android.libraries.search.t.i.y) this.f312a.W.a(), (com.google.common.v.f) this.f312a.ez.a());
            case 420:
                return new com.google.android.apps.search.assistant.verticals.a.a.a.b();
            case 421:
                return new lt(this);
            case 422:
                return this.b.hT();
            case 423:
                return new com.google.android.libraries.search.assistant.q.a.a.a.a.n(this.b.qh(), io.grpc.h.a);
            case 424:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359834").f());
            case 425:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).m());
            case 426:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45381439").d();
            case 427:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45384990").f());
            case 428:
                ik ikVar9 = this.b;
                jr jrVar = this.f312a.b;
                return com.google.android.libraries.assistant.auto.tng.f.d.a.b.a.a(ikVar9.fC(), jrVar.bY, jrVar.bZ, jrVar.ca);
            case 429:
                ik ikVar10 = this.b;
                jo joVar8 = this.f312a;
                return ikVar10.kf().a(com.google.android.libraries.assistant.auto.tng.f.d.b.a.a(), (com.google.android.libraries.storage.a.j) joVar8.w.a());
            case 430:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45386177").f());
            case 431:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).j());
            case 432:
                ik ikVar11 = this.b;
                h hVar4 = ikVar11.ax;
                return fu.o(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, ikVar11.fP(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar4.a(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.a, new com.google.android.libraries.assistant.auto.tng.p.d.a.a(this.b.hs()));
            case 433:
                return new com.google.android.libraries.assistant.auto.tng.p.a.f(this.b.rd());
            case 434:
                return new com.google.android.libraries.assistant.auto.tng.p.b.a.a();
            case 435:
                jo joVar9 = this.f312a;
                return new com.google.android.libraries.search.assistant.i.d.a.m(joVar9.b.cd, (com.google.android.libraries.search.assistant.i.a.b.a) this.b.dL.a());
            case 436:
                return new com.google.android.libraries.search.assistant.i.a.b.a((com.google.android.libraries.search.assistant.aw.b.a.a) this.b.dK.a());
            case 437:
                return com.google.android.libraries.assistant.auto.tng.assistant.d.f.b.a.a((com.google.android.libraries.search.assistant.aw.b.a.b) this.b.dJ.a());
            case 438:
                return new com.google.android.libraries.search.assistant.aw.b.a.b(this.b.dn);
            case 439:
                jo joVar10 = this.f312a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.c.k(joVar10.H, joVar10.g);
            case 440:
                return new com.google.android.libraries.search.assistant.i.g.c((com.google.android.libraries.search.assistant.i.g.g) this.b.dT.a());
            case 441:
                com.google.android.libraries.assistant.auto.tng.assistant.a.a.f fVar = (com.google.android.libraries.assistant.auto.tng.assistant.a.a.f) this.b.dO.a();
                com.google.android.libraries.assistant.auto.tng.assistant.a.a.i iVar = (com.google.android.libraries.assistant.auto.tng.assistant.a.a.i) this.f312a.b.cf.a();
                ik ikVar12 = this.b;
                jo joVar11 = this.f312a;
                h hVar5 = ikVar12.dP;
                h hVar6 = ikVar12.dQ;
                h hVar7 = ikVar12.dR;
                ag agVar = (ag) joVar11.Q.a();
                com.google.android.libraries.assistant.auto.tng.assistant.b.a.d dVar = (com.google.android.libraries.assistant.auto.tng.assistant.b.a.d) this.b.dS.a();
                Optional optional = (Optional) this.f312a.dq.a();
                jo joVar12 = this.f312a;
                return new com.google.android.libraries.search.assistant.i.g.g(fVar, iVar, hVar5, hVar6, joVar11.b.cg, hVar7, agVar, dVar, optional, e.c.c.b(joVar12.b.ci), (com.google.android.apps.search.assistant.surfaces.b.b.a.e) joVar12.ea.a());
            case 442:
                return new com.google.android.libraries.assistant.auto.tng.assistant.a.a.f((ay) this.f312a.iu.a());
            case 443:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45377302").f());
            case 444:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45424375").f());
            case 445:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45643864").f());
            case 446:
                return new com.google.android.libraries.assistant.auto.tng.assistant.b.a.d(this.f312a.b.ch);
            case 447:
                com.google.android.libraries.search.location.y yVar = (com.google.android.libraries.search.location.y) this.b.O.a();
                com.google.android.libraries.search.location.l lVar = (com.google.android.libraries.search.location.l) this.b.dV.a();
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f312a.g.a();
                cr crVar = (cr) this.f312a.H.a();
                jo joVar13 = this.f312a;
                ik ikVar13 = this.b;
                h hVar8 = ikVar13.dW;
                h hVar9 = ikVar13.dX;
                h hVar10 = ikVar13.dY;
                h hVar11 = ikVar13.dZ;
                com.google.android.libraries.search.t.i.y yVar2 = (com.google.android.libraries.search.t.i.y) joVar13.W.a();
                jo joVar14 = this.f312a;
                Optional empty = Optional.empty();
                com.google.android.libraries.af.b.a aVar2 = (com.google.android.libraries.af.b.a) joVar14.pd.a();
                jr jrVar2 = joVar13.b;
                return new com.google.android.libraries.assistant.auto.tng.common.n.a.i(yVar, lVar, aVar, crVar, jrVar2.cj, jrVar2.ck, jrVar2.cl, hVar8, jrVar2.cm, hVar9, hVar10, hVar11, yVar2, empty, aVar2);
            case 448:
                jy jyVar = this.f312a.f319a;
                return new com.google.android.libraries.search.location.l(jyVar.sf(), Optional.of((com.google.android.libraries.search.location.compliance.e.a.e) jyVar.bh.a()), (com.google.android.libraries.search.location.y) this.b.O.a(), (Context) this.f312a.f.a(), (Executor) this.f312a.H.a(), (com.google.android.libraries.search.location.o) this.f312a.lM.a());
            case 449:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45364894").f());
            case 450:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45369228").f());
            case 451:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45476366").f());
            case 452:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45572242").f());
            case 453:
                Executor executor = (Executor) this.f312a.H.a();
                jo joVar15 = this.f312a;
                ik ikVar14 = this.b;
                com.google.android.libraries.assistant.auto.tng.common.o.a.a am = joVar15.b.am();
                e.a b = e.c.c.b(ikVar14.eb);
                jo joVar16 = this.f312a;
                com.google.android.libraries.search.assistant.aw.b.a.a aVar3 = (com.google.android.libraries.search.assistant.aw.b.a.a) this.b.dK.a();
                int intValue = ((Integer) this.f312a.b.ce.a()).intValue();
                ik ikVar15 = this.b;
                com.google.android.libraries.assistant.auto.tng.assistant.d.f.a.c fw = ikVar15.fw();
                com.google.android.libraries.assistant.auto.tng.common.m.a.c cVar = (com.google.android.libraries.assistant.auto.tng.common.m.a.c) ikVar15.ed.a();
                jo joVar17 = this.f312a;
                lz lzVar = new lz(joVar17, this.b);
                com.google.cj.i.f fVar2 = (com.google.cj.i.f) joVar17.wr.a();
                ik ikVar16 = this.b;
                h hVar12 = ikVar16.ee;
                Boolean bool = (Boolean) ikVar16.ef.a();
                com.google.android.libraries.assistant.auto.tng.y.c cVar2 = (com.google.android.libraries.assistant.auto.tng.y.c) this.f312a.b.cx.a();
                jo joVar18 = this.f312a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.d.d dVar2 = (com.google.android.libraries.assistant.auto.tng.assistant.d.d.d) this.b.eg.a();
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.g.a.n(executor, am, b, joVar16.b.cn, aVar3, intValue, fw, cVar, lzVar, fVar2, hVar12, bool, cVar2, joVar18.b.cy, dVar2);
            case 454:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.b();
            case 455:
                return new com.google.android.libraries.assistant.auto.tng.common.m.a.c((com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) this.b.aG.a(), (Executor) this.f312a.H.a(), (Context) this.f312a.f.a());
            case 456:
                return new com.google.android.libraries.assistant.auto.tng.w.a.b((p) this.b.P.a(), (cr) this.f312a.H.a());
            case 457:
                Boolean bool2 = (Boolean) this.f312a.b.cq.a();
                bool2.booleanValue();
                return bool2;
            case 458:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.d.d();
            case 459:
                ik ikVar17 = this.b;
                return new com.google.android.libraries.assistant.k.a.a.c(ikVar17.gp(), ikVar17.gr());
            case 460:
                return com.google.android.libraries.assistant.o.a.a.b((com.google.android.libraries.search.trust.c.m) this.b.M.a());
            case 461:
                return new com.google.android.libraries.search.assistant.aj.d.b.e((com.google.android.apps.gsa.u.d.h) this.f312a.wm.a(), (com.google.apps.tiktok.g.ax) this.f312a.iv.a(), (com.google.apps.tiktok.account.data.a.d) this.f312a.bq.a(), (com.google.android.libraries.search.assistant.aj.d.a.g) this.f312a.wn.a(), (at) this.f312a.wo.a(), at.k((com.google.android.apps.search.assistant.surfaces.voice.robin.y.aw) this.b.cw.a()), (com.google.apps.tiktok.cache.o) this.f312a.wp.a(), (cr) this.f312a.H.a());
            case 462:
                return new com.google.android.libraries.search.f.e((AccountId) this.b.g.a(), (com.google.apps.tiktok.account.data.ao) this.f312a.ap.a(), (com.google.frameworks.client.data.android.a.d) this.f312a.ma.a(), (com.google.apps.tiktok.account.data.a.d) this.f312a.bq.a(), (Executor) this.f312a.H.a(), (cq) this.f312a.n.a());
            case 463:
                return this.b.ye().f("PCPDataBase", com.google.android.apps.search.assistant.platform.pcp.b.e.a());
            case 464:
                com.google.android.libraries.assistant.c.b.c.v a3 = com.google.android.libraries.assistant.c.b.c.y.a(this.b.qh());
                a3.getClass();
                return a3;
            case 465:
                return Optional.of(this.b.iA());
            case 466:
                return Optional.of(this.f312a.kr());
            case 467:
                ik ikVar18 = this.b;
                return new com.google.android.apps.search.assistant.verticals.snapshot.a.a(ikVar18.en, (com.google.apps.tiktok.p.b.c) ikVar18.X.a());
            case 468:
                ik ikVar19 = this.b;
                com.google.aw.l.a.b r = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.r(ikVar19.V, (com.google.apps.tiktok.p.m) this.f312a.b.dZ.a(), (com.google.apps.tiktok.p.u) this.f312a.mh.a(), (com.google.frameworks.client.data.android.d) this.f312a.mb.a(), com.google.common.base.a.a);
                r.getClass();
                return r;
            case 469:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).l());
            case 470:
                ik ikVar20 = this.b;
                jr jrVar3 = this.f312a.b;
                com.google.android.libraries.search.assistant.az.a.b.a.b.b.a.b iU = ikVar20.iU();
                com.google.android.libraries.search.assistant.az.a.b.a.b.a.a.c aH = jrVar3.aH();
                com.google.android.libraries.search.assistant.az.a.b.a.b.c.b bVar = (com.google.android.libraries.search.assistant.az.a.b.a.b.c.b) ikVar20.ep.a();
                com.google.android.libraries.storage.a.j jVar = (com.google.android.libraries.storage.a.j) this.f312a.as.a();
                ik ikVar21 = this.b;
                com.google.android.libraries.search.assistant.az.a.b.a.c.i iV = ikVar21.iV();
                dj djVar = (dj) ikVar21.q.a();
                Context context = (Context) this.f312a.f.a();
                cq cqVar = (cq) this.f312a.n.a();
                cq cqVar2 = (cq) this.f312a.H.a();
                jr jrVar4 = this.f312a.b;
                return new com.google.android.libraries.search.assistant.az.a.b.a.b.b.a.j(iU, aH, bVar, jVar, iV, djVar, context, cqVar, cqVar2, jrVar4.fo, jrVar4.fp, jrVar4.fq, jrVar4.fr, jrVar4.fs);
            case 471:
                return new com.google.android.libraries.search.assistant.az.a.b.a.b.c.b((Context) this.f312a.f.a());
            case 472:
                ik ikVar22 = this.b;
                jo joVar19 = this.f312a;
                return ikVar22.kf().a(com.google.android.libraries.assistant.contexttrigger.g.ag.b(), (com.google.android.libraries.storage.a.j) joVar19.w.a());
            case 473:
                return com.google.frameworks.client.data.android.server.tiktok.ae.a((io.grpc.i) this.f312a.kz.a(), this.b.qj());
            case 474:
                ik ikVar23 = this.b;
                jo joVar20 = this.f312a;
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "UlrCacheStore";
                a4.c(com.google.android.libraries.search.udcdataservice.ulr.l.a);
                return ikVar23.kg().a(a4.a(), (com.google.android.libraries.storage.a.j) joVar20.w.a());
            case 475:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).k());
            case 476:
                return new com.google.android.libraries.assistant.auto.tng.f.e.a.a.b((com.google.android.libraries.search.assistant.az.a.b.a.e) this.b.et.a(), (com.google.android.libraries.search.assistant.az.a.b.a.e) this.b.eu.a(), (com.google.android.libraries.search.assistant.az.a.b.a.e) this.b.ew.a(), (Executor) this.f312a.H.a(), this.b.iV());
            case 477:
                return new com.google.android.libraries.search.assistant.az.a.b.a.b.m(new com.google.android.libraries.search.assistant.az.a.b.a.b.c.h(this.b.iV()), (com.google.android.libraries.search.assistant.az.a.b.a.b.b.a.j) this.b.eq.a(), (com.google.android.libraries.search.assistant.az.a.b.a.b.c.b) this.b.ep.a(), this.b.iW(), (Context) this.f312a.f.a(), (Executor) this.f312a.v.a(), (Executor) this.f312a.H.a());
            case 478:
                ik ikVar24 = this.b;
                return new com.google.android.libraries.search.assistant.az.a.b.a.a.i(ikVar24.iS(), ikVar24.iT(), (Executor) this.f312a.H.a(), (Executor) this.f312a.v.a(), (Context) this.f312a.f.a());
            case 479:
                return new com.google.android.libraries.assistant.auto.tng.f.e.a.a.d((ag) this.f312a.Q.a(), this.b.ev);
            case 480:
                Executor executor2 = (Executor) this.f312a.H.a();
                ik ikVar25 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.n.a.a.b(executor2, ikVar25.fK(), ikVar25.fM());
            case 481:
                ik ikVar26 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.f.e.b.a.l(ikVar26.ey, ikVar26.ez, ikVar26.eA);
            case 482:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360531").a());
            case 483:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45364552").a());
            case 484:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45369369").a());
            case 485:
                return new com.google.android.libraries.search.assistant.az.a.b.b.d((Context) this.f312a.f.a());
            case 486:
                return Double.valueOf(new h.a.a.b.b.a.g(this.b.l).g());
            case 487:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45531234").f());
            case 488:
                return new com.google.android.libraries.search.assistant.performer.communication.be((cq) this.f312a.H.a(), this.f312a.f319a.cP(), (com.google.apps.tiktok.g.p) this.b.aa.a(), (PackageManager) this.f312a.h.a());
            case 489:
                jy jyVar2 = this.f312a.f319a;
                return new com.google.android.libraries.search.assistant.performer.communication.bk(jyVar2.hC, jyVar2.hD);
            case 490:
                return new ih(0);
            case 491:
                return new com.google.android.libraries.search.assistant.performer.communication.c.g((ScheduledExecutorService) this.f312a.H.a());
            case 492:
                ik ikVar27 = this.b;
                jy jyVar3 = this.f312a.f319a;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aa(ikVar27.ir(), jyVar3.dG(), (com.google.android.libraries.search.assistant.performer.deviceactions.c.c) jyVar3.hv.a(), (cq) this.f312a.H.a());
            case 493:
                jo joVar21 = this.f312a;
                ik ikVar28 = this.b;
                jy jyVar4 = joVar21.f319a;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ae(jyVar4.dG(), ikVar28.is(), (com.google.android.libraries.search.assistant.performer.deviceactions.c.c) jyVar4.hv.a(), (cq) this.f312a.H.a(), (ScheduledExecutorService) this.f312a.H.a());
            case 494:
                jo joVar22 = this.f312a;
                fq i2 = fu.i(15);
                i2.i("BRIGHTNESS_LEVEL", joVar22.f319a.dR());
                i2.i("SCREEN_TIMEOUT", this.f312a.f319a.dR());
                i2.i("AIRPLANE_MODE", this.f312a.f319a.dL());
                i2.i("DO_NOT_DISTURB", this.f312a.f319a.dN());
                i2.i("BATTERY_SAVER", this.f312a.f319a.dP());
                i2.i("FLASHLIGHT", this.f312a.f319a.dO());
                i2.i("VOLUME_LEVEL", this.f312a.f319a.dS());
                i2.i("ALARM_VOLUME", this.f312a.f319a.dS());
                i2.i("CALL_VOLUME", this.f312a.f319a.dS());
                i2.i("MEDIA_VOLUME", this.f312a.f319a.dS());
                i2.i("NOTIFICATION_VOLUME", this.f312a.f319a.dS());
                i2.i("RING_VOLUME", this.f312a.f319a.dS());
                i2.i("WIFI", this.f312a.f319a.dT());
                i2.i("BLUETOOTH", this.f312a.f319a.dM());
                i2.i("VIBRATION_MODE", this.f312a.f319a.dQ());
                return i2.h(true);
            case 495:
                return new com.google.android.libraries.search.assistant.performer.o.k((com.google.android.libraries.g.a) this.f312a.g.a(), (ScheduledExecutorService) this.f312a.H.a(), this.f312a.b.ac());
            case 496:
                return new com.google.android.libraries.search.assistant.performer.communication.c.ad((ScheduledExecutorService) this.f312a.H.a());
            case 497:
                return new com.google.android.libraries.search.assistant.performer.communication.c.z((Executor) this.f312a.H.a());
            case 498:
                return new com.google.android.libraries.search.assistant.performer.communication.c.l((ScheduledExecutorService) this.f312a.H.a());
            case 499:
                return new com.google.android.libraries.search.assistant.performer.l.s((cq) this.f312a.v.a(), 0);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.c;
        switch (i) {
            case 500:
                return new com.google.android.libraries.search.assistant.performer.l.s((cq) this.f312a.v.a(), 1);
            case 501:
                return new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.am((LauncherApps) this.f312a.jB.a());
            case 502:
                return new com.google.android.libraries.search.assistant.performer.o.h(this.f312a.H);
            case 503:
                return new com.google.android.libraries.assistant.auto.tng.common.f.a.a.i((com.google.android.libraries.g.a) this.f312a.g.a(), (Context) this.f312a.f.a(), (com.google.apps.tiktok.g.p) this.b.aa.a(), (Executor) this.f312a.v.a());
            case 504:
                jo joVar = this.f312a;
                ik ikVar = this.b;
                return com.google.android.apps.gsa.staticplugins.p.a.a.a.a.a(joVar.b.fm, ikVar.y(), ikVar.fz());
            case 505:
                com.google.apps.tiktok.q.b.g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "ClientInstanceIdProto";
                a2.c(com.google.android.libraries.assistant.auto.tng.common.d.a.a.a);
                return this.b.kf().a(a2.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 506:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45381953").f());
            case 507:
                ik ikVar2 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.t.c.a.a.c(ikVar2.ya(), (com.google.android.libraries.assistant.auto.tng.common.a.f) ikVar2.aA.a(), (AccountId) this.b.g.a(), (cr) this.f312a.H.a());
            case 508:
                return Optional.of(this.b.fU());
            case 509:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45428678").f());
            case 510:
                return this.b.fI();
            case 511:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45634175").f());
            case 512:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45366416").f());
            case 513:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45387046").f());
            case 514:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("assistant_auto_tng_libraries_user 45353125").f());
            case 515:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("assistant_auto_tng_libraries_user 45365638").f());
            case 516:
                fl m = fl.m(((com.google.protos.l.a.e) this.b.fe.a()).b);
                m.getClass();
                return m;
            case 517:
                return ((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("assistant_auto_tng_libraries_user 45352461").d();
            case 518:
                return new com.google.android.libraries.assistant.auto.tng.common.t.a.a(this.f312a.f319a.jA);
            case 519:
                Context context = (Context) this.f312a.f.a();
                ik ikVar3 = this.b;
                jr jrVar = this.f312a.b;
                fl kR = ikVar3.kR();
                at.k(jrVar.ap());
                ik ikVar4 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.v.b.a.a.a.a.l(context, kR, ikVar4.rr(), ikVar4.fA(), (cg) ikVar4.fh.a(), (Executor) this.f312a.v.a(), (Executor) this.f312a.H.a());
            case 520:
                com.google.apps.tiktok.q.b.g a3 = com.google.apps.tiktok.q.b.h.a();
                a3.f5883a = "AppCapabilitiesPersistentStorage";
                a3.c(com.google.android.libraries.assistant.auto.tng.v.b.a.a.a.a.n.a);
                return this.b.kf().a(a3.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 521:
                jo joVar2 = this.f312a;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.j.a.a(joVar2.b.ft, (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) joVar2.dp.a());
            case 522:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45364941").f());
            case 523:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45425482").f());
            case 524:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("assistant_auto_tng_libraries_user 45646746").f());
            case 525:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45415402").f());
            case 526:
                h hVar = this.b.aD;
                return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, (com.google.android.libraries.assistant.auto.tng.media.d.a) hVar.a(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, (com.google.android.libraries.assistant.auto.tng.media.d.a) this.b.aE.a());
            case 527:
                Executor executor = (Executor) this.f312a.H.a();
                ik ikVar5 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.g.a.a.a.f(executor, ikVar5.fG(), ikVar5.rg());
            case 528:
                return new com.google.android.libraries.search.assistant.aw.f.a.a.a.k((cq) this.f312a.H.a(), this.b.fv);
            case 529:
                ik ikVar6 = this.b;
                bn bnVar = (bn) Optional.empty().orElseGet(new com.google.android.libraries.search.assistant.aw.f.a.a.b.a(ikVar6.lF(), ikVar6.kS()));
                bnVar.getClass();
                return bnVar;
            case 530:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d((Context) this.f312a.f.a(), (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) this.f312a.dp.a(), (ag) this.f312a.bo.a(), (Executor) this.f312a.v.a(), (com.google.android.libraries.assistant.auto.tng.p.a.g) this.b.ax.a(), Optional.empty(), this.f312a.b.fC);
            case 531:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.j((com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) this.f312a.dp.a(), (Executor) this.f312a.H.a());
            case 532:
                ik ikVar7 = this.b;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.r fD = ikVar7.fD();
                Map rb = ikVar7.rb();
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) ikVar7.fz.a();
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) this.b.ax.a();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.g gVar2 = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.g(lVar.a(gVar), this.b.in());
                k.a.a aVar = (k.a.a) rb.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c);
                aVar.getClass();
                com.google.android.libraries.search.assistant.performer.communication.c.a.f fVar = (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar.a();
                gVar.getClass();
                fVar.getClass();
                ag agVar = (ag) fD.a.a();
                agVar.getClass();
                com.google.android.libraries.search.assistant.performer.communication.c.p pVar = (com.google.android.libraries.search.assistant.performer.communication.c.p) fD.b.a();
                pVar.getClass();
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar2 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) fD.c.a();
                lVar2.getClass();
                return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.q(gVar, fVar, gVar2, agVar, pVar, lVar2, 0);
            case 533:
                return new com.google.android.libraries.search.assistant.performer.communication.c.p((ScheduledExecutorService) this.f312a.H.a());
            case 534:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l(this.f312a.Q);
            case 535:
                ik ikVar8 = this.b;
                return ikVar8.im().a((Set) ((k.a.a) Map._EL.getOrDefault(ikVar8.rc(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.i(1))).a());
            case 536:
                return new op(this.b.xa());
            case 537:
                com.google.android.libraries.search.assistant.az.a.b.a.e eVar = (com.google.android.libraries.search.assistant.az.a.b.a.e) this.b.ex.a();
                jo joVar3 = this.f312a;
                return new com.google.android.libraries.search.assistant.az.a.b.b.a.f(eVar, joVar3.b.aH(), (Executor) joVar3.H.a());
            case 538:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360534").f());
            case 539:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360535").f());
            case 540:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45440311").f());
            case 541:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45645084").f());
            case 542:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45365428").f());
            case 543:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45384934").a());
            case 544:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45369804").d();
            case 545:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45369659").d();
            case 546:
                ik ikVar9 = this.b;
                return ikVar9.im().a((Set) ((k.a.a) Map._EL.getOrDefault(ikVar9.rc(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.i(0))).a());
            case 547:
                ik ikVar10 = this.b;
                return ikVar10.yi().b((com.google.android.libraries.assistant.auto.tng.p.a.g) ikVar10.ax.a());
            case 548:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("assistant_auto_tng_libraries_user 45361008").b());
            case 549:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "AutoTestDriveClientData";
                a4.c(c.b.a.a.a.g.a);
                return this.b.kf().a(a4.a(), (com.google.android.libraries.storage.a.j) this.f312a.w.a());
            case 550:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45418417").f());
            case 551:
                com.google.cj.i.f fVar2 = (com.google.cj.i.f) this.f312a.wr.a();
                jo joVar4 = this.f312a;
                return new com.google.android.libraries.assistant.auto.tng.s.b.e.a.b(fVar2, new md(joVar4, this.b), ((Boolean) joVar4.b.hy.a()).booleanValue());
            case 552:
                ik ikVar11 = this.b;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.r yb = ikVar11.yb();
                java.util.Map rb2 = ikVar11.rb();
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar3 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) ikVar11.fz.a();
                ik ikVar12 = this.b;
                com.google.android.libraries.search.assistant.performer.communication.c.b.c in = ikVar12.in();
                com.google.android.libraries.search.assistant.performer.communication.c.b.g io = ikVar12.io();
                com.google.android.libraries.assistant.auto.tng.p.a.g fP = ikVar12.fP();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.a aVar2 = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.a(lVar3.a(fP), io, in);
                k.a.a aVar3 = (k.a.a) rb2.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d);
                aVar3.getClass();
                return yb.a(fP, (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar3.a(), aVar2);
            case 553:
                ik ikVar13 = this.b;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.r yb2 = ikVar13.yb();
                java.util.Map rb3 = ikVar13.rb();
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar4 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) ikVar13.fz.a();
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar3 = (com.google.android.libraries.assistant.auto.tng.p.a.g) this.b.ax.a();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.e eVar2 = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.e(lVar4.a(gVar3), this.b.in());
                k.a.a aVar4 = (k.a.a) rb3.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c);
                aVar4.getClass();
                return yb2.a(gVar3, (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar4.a(), eVar2);
            case 554:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359835").f());
            case 555:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359836").f());
            case 556:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360922").f());
            case 557:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359837").f());
            case 558:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359838").f());
            case 559:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359839").f());
            case 560:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45359840").f());
            case 561:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360526").f());
            case 562:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360527").f());
            case 563:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360528").f());
            case 564:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 4870978").f());
            case 565:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45619992").f());
            case 566:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45379385").f());
            case 567:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45383413").d();
            case 568:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45417142").f());
            case 569:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45416779").f());
            case 570:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45427307").f());
            case 571:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45429375").e();
            case 572:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45628840").f());
            case 573:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45360533").b());
            case 574:
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar5 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) this.b.fz.a();
                ik ikVar14 = this.b;
                jo joVar5 = this.f312a;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.y xS = ikVar14.xS();
                java.util.Map rb4 = ikVar14.rb();
                com.google.android.libraries.search.assistant.notification.a.b bVar = (com.google.android.libraries.search.assistant.notification.a.b) joVar5.nh.a();
                ik ikVar15 = this.b;
                jr jrVar2 = this.f312a.b;
                com.google.android.libraries.assistant.auto.tng.p.a.g fP2 = ikVar15.fP();
                com.google.android.libraries.search.assistant.performer.communication.c.b.i iVar = (com.google.android.libraries.search.assistant.performer.communication.c.b.i) jrVar2.dA.a();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.b bVar2 = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.b(lVar5.a(fP2), (com.google.android.libraries.assistant.auto.tng.f.d.c.b.ae) this.f312a.b.dz.a(), iVar);
                k.a.a aVar5 = (k.a.a) rb4.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d);
                aVar5.getClass();
                return xS.b(fP2, bVar, (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar5.a(), bVar2);
            case 575:
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar6 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) this.b.fz.a();
                ik ikVar16 = this.b;
                h hVar2 = ikVar16.ax;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.y xS2 = ikVar16.xS();
                java.util.Map rb5 = ikVar16.rb();
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar4 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar2.a();
                com.google.android.libraries.search.assistant.performer.communication.c.b.i iVar2 = (com.google.android.libraries.search.assistant.performer.communication.c.b.i) this.f312a.b.dC.a();
                Optional of = Optional.of((com.google.android.libraries.search.assistant.notification.a.b) this.f312a.b.gd.a());
                com.google.android.libraries.search.assistant.notification.a.b bVar3 = (com.google.android.libraries.search.assistant.notification.a.b) this.f312a.nh.a();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.f fVar3 = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.f(lVar6.a(gVar4), iVar2, 1);
                com.google.android.libraries.search.assistant.notification.a.b bVar4 = (com.google.android.libraries.search.assistant.notification.a.b) of.orElse(bVar3);
                k.a.a aVar6 = (k.a.a) rb5.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c);
                aVar6.getClass();
                return xS2.b(gVar4, bVar4, (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar6.a(), fVar3);
            case 576:
                ik ikVar17 = this.b;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.y fE = ikVar17.fE();
                java.util.Map rb6 = ikVar17.rb();
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar7 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) ikVar17.fz.a();
                ik ikVar18 = this.b;
                com.google.android.libraries.search.assistant.performer.communication.c.b.c in2 = ikVar18.in();
                com.google.android.libraries.search.assistant.performer.communication.c.b.g io2 = ikVar18.io();
                com.google.android.libraries.assistant.auto.tng.p.a.g fP3 = ikVar18.fP();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.d dVar = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.d(lVar7.a(fP3), in2, io2);
                k.a.a aVar7 = (k.a.a) rb6.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d);
                aVar7.getClass();
                return fE.a(fP3, (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar7.a(), dVar);
            case 577:
                ik ikVar19 = this.b;
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.y fE2 = ikVar19.fE();
                java.util.Map rb7 = ikVar19.rb();
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar8 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) ikVar19.fz.a();
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar5 = (com.google.android.libraries.assistant.auto.tng.p.a.g) this.b.ax.a();
                com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.h hVar3 = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.h(lVar8.a(gVar5), this.b.in());
                k.a.a aVar8 = (k.a.a) rb7.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c);
                aVar8.getClass();
                return fE2.a(gVar5, (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar8.a(), hVar3);
            case 578:
                ik ikVar20 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.u.a.a.e(ikVar20.kr(), this.f312a.mJ(), ikVar20.re());
            case 579:
                return new com.google.android.libraries.assistant.auto.tng.p.b.b.a(this.b.hr(), new com.google.android.libraries.assistant.auto.tng.p.b.a.a());
            case 580:
                return new com.google.android.libraries.assistant.auto.tng.p.d.a.a(this.b.hs());
            case 581:
                return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, new com.google.android.libraries.assistant.auto.tng.v.b.a.a.a.e.c(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, this.b.sg());
            case 582:
                ((Boolean) this.f312a.b.hy.a()).booleanValue();
                Executor executor2 = (Executor) this.f312a.v.a();
                Boolean bool = false;
                bool.getClass();
                return new com.google.android.libraries.assistant.auto.tng.s.b.h.a.c(executor2, (cr) this.f312a.H.a());
            case 583:
                return Boolean.valueOf(new h.a.a.b.b.a.g(this.b.l).e());
            case 584:
                com.google.android.libraries.assistant.auto.tng.common.a.f fVar4 = (com.google.android.libraries.assistant.auto.tng.common.a.f) this.b.aA.a();
                AccountId accountId = (AccountId) this.b.g.a();
                return new com.google.android.libraries.assistant.auto.tng.common.b.a.c(fVar4, accountId, (Context) this.f312a.f.a(), (Executor) this.f312a.v.a(), (com.google.android.libraries.assistant.auto.tng.p.a.g) this.b.ax.a());
            case 585:
                return new com.google.android.libraries.assistant.auto.tng.gmm.a.a.a();
            case 586:
                return new com.google.android.libraries.assistant.auto.tng.f.d.a.b(this.b.rh());
            case 587:
                return new com.google.android.libraries.assistant.auto.tng.s.d.a.a(this.f312a.b.li);
            case 588:
                return new com.google.android.libraries.assistant.auto.tng.s.b.a.a.b((com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.j) this.b.fy.a(), (Executor) this.f312a.H.a());
            case 589:
                return new com.google.android.libraries.assistant.auto.tng.s.b.b.a.l((Context) this.f312a.f.a(), (Executor) this.f312a.H.a(), (Executor) this.f312a.v.a(), (com.google.apps.tiktok.account.data.b) this.f312a.bN.a(), (AccountId) this.b.g.a(), (com.google.android.libraries.assistant.auto.tng.w.e.a.b) this.b.aI.a(), (com.google.android.libraries.assistant.auto.tng.common.m.a.c) this.b.ed.a(), (com.google.apps.tiktok.g.p) this.b.aa.a());
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        if (this.d != 0) {
            int i = this.c / 100;
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? k() : j() : i() : h() : g() : f();
        }
        int i2 = this.c / 100;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? e() : d() : c() : b();
    }
}
