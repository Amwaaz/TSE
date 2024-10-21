package com.google.android.apps.gsa.binaries.velvet.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.search.shared.h.a.i;
import com.google.android.apps.search.assistant.platform.g.c.g;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.aj;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.bw;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.cd;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ck;
import com.google.android.apps.search.assistant.surfaces.bisto.d.ay;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.de;
import com.google.android.apps.search.assistant.surfaces.dictation.service.a.bq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.a.bt;
import com.google.android.apps.search.assistant.surfaces.dictation.service.g.bc;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p.be;
import com.google.android.apps.search.assistant.surfaces.dictation.service.t.bf;
import com.google.android.apps.search.assistant.surfaces.voice.h.c.z;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.a.k;
import com.google.android.apps.search.assistant.surfaces.voice.j.a.d.m;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.d.aq;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.r;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.u;
import com.google.android.apps.search.assistant.surfaces.voice.o.p;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am;
import com.google.android.apps.search.assistant.surfaces.voice.robin.car.q;
import com.google.android.apps.search.assistant.surfaces.voice.robin.p.a;
import com.google.android.apps.search.assistant.surfaces.voice.robin.p.aa;
import com.google.android.apps.search.assistant.surfaces.voice.robin.t.b.d;
import com.google.android.apps.search.assistant.surfaces.voice.robin.t.j;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.ai;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.OneSearchImageProvider;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ac;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ae;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ah;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.o;
import com.google.android.libraries.assistant.auto.tng.suggestions.j.s;
import com.google.android.libraries.assistant.c.a.a.a.e;
import com.google.android.libraries.assistant.c.b.b.af;
import com.google.android.libraries.assistant.c.b.c.v;
import com.google.android.libraries.search.ah.b.e.bj;
import com.google.android.libraries.search.assistant.ai.a.a.t;
import com.google.android.libraries.search.assistant.ao.e.ab;
import com.google.android.libraries.search.assistant.bb.a.ar;
import com.google.android.libraries.search.assistant.bb.a.as;
import com.google.android.libraries.search.assistant.bb.a.bg;
import com.google.android.libraries.search.assistant.bb.a.bh;
import com.google.android.libraries.search.assistant.invocation.a.c.b;
import com.google.android.libraries.search.assistant.invocation.a.c.c;
import com.google.android.libraries.search.assistant.invocation.k.e.a.x;
import com.google.android.libraries.search.assistant.invocation.u.b.c.w;
import com.google.android.libraries.search.assistant.n.a.b.da;
import com.google.android.libraries.search.assistant.n.a.b.dj;
import com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.a.ad;
import com.google.android.libraries.search.t.i.y;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.g.ax;
import com.google.common.b.fu;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.base.ci;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.db;
import com.google.common.v.f;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ao;
import com.google.speech.g.bn;
import e.c.h;
import io.grpc.dh;
import j$.util.Optional;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.ag;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/jh.class */
public final class jh implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f314a;
    public final ik b;
    private final int c;

    public jh(jo joVar, ik ikVar, int i) {
        this.f314a = joVar;
        this.b = ikVar;
        this.c = i;
    }

    private final Object b() {
        ji jiVar;
        ji jiVar2;
        jr jrVar;
        ji jiVar3;
        ji jiVar4;
        jr jrVar2;
        ji jiVar5;
        ji jiVar6;
        ji jiVar7;
        ji jiVar8;
        jj jjVar;
        h hVar;
        ji jiVar9;
        ji jiVar10;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        jj jjVar2;
        h hVar6;
        h hVar7;
        h hVar8;
        jr jrVar3;
        ji jiVar11;
        ji jiVar12;
        ji jiVar13;
        h hVar9;
        ji jiVar14;
        jr jrVar4;
        ji jiVar15;
        ji jiVar16;
        h hVar10;
        ji jiVar17;
        ji jiVar18;
        ji jiVar19;
        h hVar11;
        ji jiVar20;
        h hVar12;
        h hVar13;
        h hVar14;
        h hVar15;
        h hVar16;
        ji jiVar21;
        h hVar17;
        jj jjVar3;
        ji jiVar22;
        ji jiVar23;
        ji jiVar24;
        h hVar18;
        h hVar19;
        jr jrVar5;
        ji jiVar25;
        ji jiVar26;
        ji jiVar27;
        ji jiVar28;
        h hVar20;
        jr jrVar6;
        h hVar21;
        ji jiVar29;
        ji jiVar30;
        h hVar22;
        ji jiVar31;
        ji jiVar32;
        ji jiVar33;
        h hVar23;
        h hVar24;
        jx jxVar;
        jj jjVar4;
        h hVar25;
        ji jiVar34;
        ji jiVar35;
        jr jrVar7;
        ji jiVar36;
        ji jiVar37;
        h hVar26;
        h hVar27;
        h hVar28;
        jr jrVar8;
        jx jxVar2;
        jx jxVar3;
        jx jxVar4;
        jx jxVar5;
        jr jrVar9;
        jx jxVar6;
        jx jxVar7;
        jr jrVar10;
        jx jxVar8;
        ji jiVar38;
        h hVar29;
        h hVar30;
        h hVar31;
        ji jiVar39;
        iz izVar;
        jr jrVar11;
        ji jiVar40;
        iz izVar2;
        iz izVar3;
        h hVar32;
        h hVar33;
        h hVar34;
        h hVar35;
        ji jiVar41;
        ji jiVar42;
        ji jiVar43;
        h hVar36;
        ji jiVar44;
        ji jiVar45;
        iz izVar4;
        jj jjVar5;
        ji jiVar46;
        h hVar37;
        h hVar38;
        iz izVar5;
        iz izVar6;
        h hVar39;
        h hVar40;
        ji jiVar47;
        h hVar41;
        jr jrVar12;
        iz izVar7;
        iz izVar8;
        h hVar42;
        h hVar43;
        h hVar44;
        ji jiVar48;
        ji jiVar49;
        h hVar45;
        ji jiVar50;
        h hVar46;
        ji jiVar51;
        ji jiVar52;
        h hVar47;
        ji jiVar53;
        iz izVar9;
        h hVar48;
        ji jiVar54;
        iz izVar10;
        iz izVar11;
        h hVar49;
        h hVar50;
        h hVar51;
        ji jiVar55;
        ji jiVar56;
        h hVar52;
        ji jiVar57;
        jj jjVar6;
        h hVar53;
        ji jiVar58;
        ji jiVar59;
        h hVar54;
        ji jiVar60;
        jy jyVar;
        h hVar55;
        h hVar56;
        ji jiVar61;
        h hVar57;
        h hVar58;
        h hVar59;
        ji jiVar62;
        ji jiVar63;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        je jeVar;
        ji jiVar64;
        h hVar64;
        h hVar65;
        jj jjVar7;
        h hVar66;
        jj jjVar8;
        ji jiVar65;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        ji jiVar66;
        h hVar71;
        jj jjVar9;
        h hVar72;
        h hVar73;
        h hVar74;
        jr jrVar13;
        jj jjVar10;
        ji jiVar67;
        h hVar75;
        ji jiVar68;
        ji jiVar69;
        h hVar76;
        ji jiVar70;
        ji jiVar71;
        ji jiVar72;
        ji jiVar73;
        jr jrVar14;
        h hVar77;
        iz izVar12;
        ji jiVar74;
        ji jiVar75;
        jj jjVar11;
        ji jiVar76;
        ji jiVar77;
        ji jiVar78;
        jj jjVar12;
        ji jiVar79;
        ji jiVar80;
        h hVar78;
        ji jiVar81;
        ji jiVar82;
        ji jiVar83;
        ji jiVar84;
        ji jiVar85;
        ji jiVar86;
        h hVar79;
        ji jiVar87;
        jx jxVar9;
        ji jiVar88;
        ji jiVar89;
        ji jiVar90;
        ji jiVar91;
        h hVar80;
        h hVar81;
        ji jiVar92;
        ji jiVar93;
        ji jiVar94;
        ji jiVar95;
        ji jiVar96;
        ji jiVar97;
        jx jxVar10;
        ji jiVar98;
        ji jiVar99;
        jr jrVar15;
        ji jiVar100;
        h hVar82;
        ji jiVar101;
        ji jiVar102;
        h hVar83;
        ji jiVar103;
        ji jiVar104;
        ji jiVar105;
        ji jiVar106;
        ji jiVar107;
        ji jiVar108;
        ji jiVar109;
        ji jiVar110;
        ji jiVar111;
        ji jiVar112;
        ji jiVar113;
        ji jiVar114;
        ji jiVar115;
        ji jiVar116;
        ji jiVar117;
        h hVar84;
        h hVar85;
        h hVar86;
        jr jrVar16;
        h hVar87;
        h hVar88;
        ji jiVar118;
        ji jiVar119;
        ji jiVar120;
        ji jiVar121;
        ji jiVar122;
        ji jiVar123;
        ji jiVar124;
        ji jiVar125;
        iz izVar13;
        iz izVar14;
        iz izVar15;
        ji jiVar126;
        jr jrVar17;
        jr jrVar18;
        jr jrVar19;
        jr jrVar20;
        jr jrVar21;
        h hVar89;
        ji jiVar127;
        h hVar90;
        iz izVar16;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        ji jiVar128;
        ji jiVar129;
        ji jiVar130;
        ji jiVar131;
        jr jrVar22;
        h hVar96;
        h hVar97;
        ji jiVar132;
        ji jiVar133;
        h hVar98;
        ji jiVar134;
        ji jiVar135;
        ji jiVar136;
        ji jiVar137;
        ji jiVar138;
        ji jiVar139;
        ji jiVar140;
        ji jiVar141;
        h hVar99;
        h hVar100;
        ji jiVar142;
        h hVar101;
        h hVar102;
        ji jiVar143;
        ji jiVar144;
        h hVar103;
        h hVar104;
        ji jiVar145;
        ji jiVar146;
        ji jiVar147;
        ji jiVar148;
        h hVar105;
        h hVar106;
        jj jjVar13;
        h hVar107;
        h hVar108;
        jj jjVar14;
        h hVar109;
        h hVar110;
        ji jiVar149;
        h hVar111;
        h hVar112;
        jj jjVar15;
        h hVar113;
        ji jiVar150;
        h hVar114;
        h hVar115;
        h hVar116;
        ji jiVar151;
        h hVar117;
        ji jiVar152;
        ji jiVar153;
        ji jiVar154;
        h hVar118;
        h hVar119;
        ji jiVar155;
        jj jjVar16;
        h hVar120;
        ji jiVar156;
        jj jjVar17;
        ji jiVar157;
        ji jiVar158;
        ji jiVar159;
        ji jiVar160;
        ji jiVar161;
        h hVar121;
        int i = this.c;
        switch (i) {
            case 0:
                jiVar = this.b.d;
                return jiVar.ae();
            case 1:
                jiVar2 = this.b.d;
                return new c(jiVar2.aI(), 1);
            case 2:
                jrVar = this.f314a.b;
                return b.c(jrVar.eW());
            case 3:
                jiVar3 = this.b.d;
                lt ltVar = (lt) ji.cm(jiVar3).a();
                jiVar4 = this.b.d;
                return com.google.android.libraries.search.assistant.invocation.k.b.a.b.b(ltVar, jiVar4.aJ());
            case 4:
                return new lt(this);
            case 5:
                jrVar2 = this.f314a.b;
                return new x(jrVar2.eW());
            case 6:
                jiVar5 = this.b.d;
                return jiVar5.S();
            case 7:
                jiVar6 = this.b.d;
                g gVar = (g) ji.bX(jiVar6).a();
                com.google.android.apps.search.assistant.platform.g.c.b.b.d(gVar);
                return gVar;
            case 8:
                return this.f314a.fo();
            case 9:
                jiVar7 = this.b.d;
                return new i(jiVar7.f());
            case 10:
                jiVar8 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.robin.t.b.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.t.b.b) ji.bZ(jiVar8).a();
                d.b(bVar);
                return bVar;
            case 11:
                jjVar = this.b.f308a;
                j aN = jjVar.aN();
                hVar = this.f314a.P;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.t.b.b(aN, (n) hVar.a());
            case 12:
                jiVar9 = this.b.d;
                return jiVar9.T();
            case 13:
                jiVar10 = this.b.d;
                aa aaVar = (aa) ji.cS(jiVar10).a();
                a.d(aaVar);
                return aaVar;
            case 14:
                hVar2 = this.f314a.lR;
                com.google.apps.tiktok.p.b bVar2 = (com.google.apps.tiktok.p.b) hVar2.a();
                hVar3 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar3.a();
                ik ikVar = this.b;
                jo joVar = this.f314a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.g aZ = ikVar.aZ();
                hVar4 = joVar.P;
                n nVar = (n) hVar4.a();
                hVar5 = this.f314a.Q;
                ag agVar = (ag) hVar5.a();
                jjVar2 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.b.i aq = jjVar2.aq();
                ik ikVar2 = this.b;
                jo joVar2 = this.f314a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.h bl = ikVar2.bl();
                hVar6 = joVar2.Y;
                String str = (String) hVar6.a();
                hVar7 = this.b.cy;
                k kVar = (k) hVar7.a();
                hVar8 = this.f314a.g;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) hVar8.a();
                jrVar3 = this.f314a.b;
                p pVar = (p) jr.bE(jrVar3).a();
                jiVar11 = this.b.d;
                jiVar11.bA();
                jiVar12 = this.b.d;
                jiVar12.dX();
                jiVar13 = this.b.d;
                jiVar13.ed();
                hVar9 = this.f314a.x;
                com.google.android.libraries.phenotype.client.a.i iVar = (com.google.android.libraries.phenotype.client.a.i) hVar9.a();
                jiVar14 = this.b.d;
                jiVar14.bD();
                jrVar4 = this.f314a.b;
                jrVar4.hI();
                jiVar15 = this.b.d;
                jiVar15.ef();
                jiVar16 = this.b.d;
                jiVar16.bE();
                hVar10 = this.f314a.bo;
                ag agVar2 = (ag) hVar10.a();
                jiVar17 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.h Z = jiVar17.Z();
                jiVar18 = this.b.d;
                r rVar = (r) ji.cl(jiVar18).a();
                jiVar19 = this.b.d;
                long b = jiVar19.b();
                Optional of = Optional.of(new com.google.android.apps.search.assistant.surfaces.voice.robin.j.a());
                hVar11 = this.b.z;
                am amVar = (am) hVar11.a();
                this.b.cD();
                ik ikVar3 = this.b;
                boolean ut = ikVar3.ut();
                boolean uv = ikVar3.uv();
                boolean uw = ikVar3.uw();
                jiVar20 = ikVar3.d;
                boolean dI = jiVar20.dI();
                ik ikVar4 = this.b;
                jo joVar3 = this.f314a;
                m aS = ikVar4.aS();
                hVar12 = joVar3.tr;
                boolean booleanValue = ((Boolean) hVar12.a()).booleanValue();
                hVar13 = this.f314a.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar3 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar13.a();
                hVar14 = this.f314a.bN;
                com.google.apps.tiktok.account.data.b bVar4 = (com.google.apps.tiktok.account.data.b) hVar14.a();
                hVar15 = this.b.g;
                AccountId accountId = (AccountId) hVar15.a();
                ik ikVar5 = this.b;
                jo joVar4 = this.f314a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.d.r aT = ikVar5.aT();
                hVar16 = joVar4.f;
                Context context = (Context) hVar16.a();
                ik ikVar6 = this.b;
                u bb = ikVar6.bb();
                jiVar21 = ikVar6.d;
                boolean dJ = jiVar21.dJ();
                ik ikVar7 = this.b;
                return new aa(bVar2, auVar, aZ, nVar, agVar, aq, bl, str, kVar, aVar, pVar, iVar, agVar2, Z, rVar, b, of, amVar, ut, uv, uw, dI, aS, booleanValue, bVar3, bVar4, accountId, aT, context, bb, dJ, ikVar7.ux(), ikVar7.uy());
            case 15:
                hVar17 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar17.a();
                jjVar3 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.b.i aq2 = jjVar3.aq();
                jiVar22 = this.b.d;
                ao bD = jiVar22.bD();
                jiVar23 = this.b.d;
                ao bA = jiVar23.bA();
                jiVar24 = this.b.d;
                ao bE = jiVar24.bE();
                hVar18 = this.f314a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar18.a();
                this.b.bl();
                hVar19 = this.f314a.Q;
                ag agVar3 = (ag) hVar19.a();
                jrVar5 = this.f314a.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.a.b hI = jrVar5.hI();
                jiVar25 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.h Z2 = jiVar25.Z();
                jiVar26 = this.b.d;
                long a2 = jiVar26.a();
                jiVar27 = this.b.d;
                boolean dG = jiVar27.dG();
                ik ikVar8 = this.b;
                u bb2 = ikVar8.bb();
                jiVar28 = ikVar8.d;
                boolean ep = jiVar28.ep();
                hVar20 = this.f314a.Y;
                String str2 = (String) hVar20.a();
                jrVar6 = this.f314a.b;
                p pVar2 = (p) jr.bE(jrVar6).a();
                ik ikVar9 = this.b;
                jo joVar5 = this.f314a;
                boolean uc = ikVar9.uc();
                hVar21 = joVar5.x;
                com.google.android.libraries.phenotype.client.a.i iVar2 = (com.google.android.libraries.phenotype.client.a.i) hVar21.a();
                jiVar29 = this.b.d;
                return new r(auVar2, aq2, bD, bA, bE, aVar2, agVar3, hI, Z2, a2, dG, bb2, ep, str2, pVar2, uc, iVar2, jiVar29.dH());
            case 16:
                jiVar30 = this.b.d;
                h bW = ji.bW(jiVar30);
                hVar22 = this.f314a.W;
                return new o(bW, (y) hVar22.a());
            case 17:
                ik ikVar10 = this.b;
                Object ga = jx.ga();
                jiVar31 = ikVar10.d;
                ah ax = jiVar31.ax();
                jiVar32 = this.b.d;
                ae aw = jiVar32.aw();
                jiVar33 = this.b.d;
                ac av = jiVar33.av();
                hVar23 = this.f314a.f9do;
                l lVar = (l) hVar23.a();
                hVar24 = this.f314a.f9do;
                l lVar2 = (l) hVar24.a();
                jxVar = this.f314a.c;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.c cVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.c) jx.bj(jxVar).a();
                jjVar4 = this.b.f308a;
                hVar25 = jjVar4.ff;
                s sVar = (s) hVar25.a();
                jiVar34 = this.b.d;
                com.google.android.libraries.assistant.auto.tng.suggestions.j.d az = jiVar34.az();
                jiVar35 = this.b.d;
                com.google.android.libraries.assistant.auto.tng.f.e.b.a.k ay = jiVar35.ay();
                jrVar7 = this.f314a.b;
                e eVar = (e) jr.bD(jrVar7).a();
                jiVar36 = this.b.d;
                com.google.android.libraries.assistant.auto.jumpboost.q.j jVar = (com.google.android.libraries.assistant.auto.jumpboost.q.j) ji.bN(jiVar36).a();
                jiVar37 = this.b.d;
                com.google.android.libraries.assistant.auto.jumpboost.b.a.g au = jiVar37.au();
                hVar26 = this.f314a.f;
                Context context2 = (Context) hVar26.a();
                hVar27 = this.f314a.Q;
                ag agVar4 = (ag) hVar27.a();
                hVar28 = this.f314a.bo;
                ag agVar5 = (ag) hVar28.a();
                jrVar8 = this.f314a.b;
                h cw = jr.cw(jrVar8);
                jxVar2 = this.f314a.c;
                h bI = jx.bI(jxVar2);
                jxVar3 = this.f314a.c;
                h bU = jx.bU(jxVar3);
                jxVar4 = this.f314a.c;
                h bW2 = jx.bW(jxVar4);
                jxVar5 = this.f314a.c;
                h bR = jx.bR(jxVar5);
                jrVar9 = this.f314a.b;
                h dm = jr.dm(jrVar9);
                jxVar6 = this.f314a.c;
                h bM = jx.bM(jxVar6);
                jxVar7 = this.f314a.c;
                h bP = jx.bP(jxVar7);
                jrVar10 = this.f314a.b;
                h ds = jr.ds(jrVar10);
                jxVar8 = this.f314a.c;
                h bJ = jx.bJ(jxVar8);
                jiVar38 = this.b.d;
                Optional dk = jiVar38.dk();
                ik ikVar11 = this.b;
                jo joVar6 = this.f314a;
                q bf = ikVar11.bf();
                hVar29 = joVar6.mR;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.l((com.google.android.libraries.assistant.auto.jumpboost.b.d.a.a) ga, ax, aw, av, lVar, lVar2, cVar, sVar, az, ay, eVar, jVar, au, context2, agVar4, agVar5, cw, bI, bU, bW2, bR, dm, bM, bP, ds, bJ, dk, bf, (com.google.android.libraries.assistant.auto.jumpboost.p.a) hVar29.a());
            case 18:
                return h.a.a.b.b.a.c.k(this.b.yz());
            case 19:
                return h.a.a.b.b.a.c.j(this.b.yz());
            case 20:
                return Long.valueOf(h.a.a.b.b.a.c.i(this.b.yz()));
            case 21:
                return h.a.a.b.b.a.c.h(this.b.yz());
            case 22:
                ik ikVar12 = this.b;
                jo joVar7 = this.f314a;
                w ic = ikVar12.ic();
                com.google.android.libraries.assistant.auto.jumpboost.k.c hv = joVar7.hv();
                hVar30 = joVar7.Q;
                ag agVar6 = (ag) hVar30.a();
                hVar31 = this.b.ax;
                return new com.google.android.libraries.assistant.auto.jumpboost.q.j(ic, hv, agVar6, (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar31.a());
            case 23:
                jiVar39 = this.b.d;
                return jiVar39.X();
            case 24:
                izVar = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ac bI2 = izVar.bI();
                jrVar11 = this.f314a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.c.b(bI2, (Executor) jr.ez(jrVar11).a());
            case 25:
                jiVar40 = this.b.d;
                return jiVar40.U();
            case 26:
                izVar2 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.h.d.c cVar2 = (com.google.android.apps.search.assistant.surfaces.voice.h.d.c) iz.eg(izVar2).a();
                izVar3 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ac bI3 = izVar3.bI();
                hVar32 = this.f314a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar32.a();
                hVar33 = this.b.cy;
                k kVar2 = (k) hVar33.a();
                hVar34 = this.f314a.P;
                n nVar2 = (n) hVar34.a();
                hVar35 = this.f314a.Q;
                ag agVar7 = (ag) hVar35.a();
                jiVar41 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e eVar2 = (com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e) ji.cQ(jiVar41).a();
                jiVar42 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.c.a.i iVar3 = (com.google.android.apps.search.assistant.surfaces.voice.h.c.a.i) ji.cR(jiVar42).a();
                jiVar43 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.b.a V = jiVar43.V();
                hVar36 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar36.a();
                jiVar44 = this.b.d;
                boolean dK = jiVar44.dK();
                jiVar45 = this.b.d;
                ao bF = jiVar45.bF();
                izVar4 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.a aVar4 = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.a) iz.dU(izVar4).a();
                jjVar5 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.h.c.u(cVar2, bI3, aVar3, kVar2, nVar2, agVar7, eVar2, iVar3, V, dVar, dK, bF, aVar4, Optional.of(jjVar5.ac()));
            case 27:
                return new com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e();
            case 28:
                jiVar46 = this.b.d;
                ao bF2 = jiVar46.bF();
                hVar37 = this.f314a.ez;
                f fVar = (f) hVar37.a();
                hVar38 = this.f314a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.h.c.a.i(bF2, fVar, (ag) hVar38.a());
            case 29:
                izVar5 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ac bI4 = izVar5.bI();
                izVar6 = this.b.b;
                e.a b2 = e.c.c.b(iz.eg(izVar6));
                hVar39 = this.f314a.P;
                n nVar3 = (n) hVar39.a();
                hVar40 = this.f314a.Q;
                ag agVar8 = (ag) hVar40.a();
                jiVar47 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.b.a V2 = jiVar47.V();
                hVar41 = this.b.p;
                com.google.br.d.a.a.e eVar3 = (com.google.br.d.a.a.e) hVar41.a();
                jrVar12 = this.f314a.b;
                return new z(bI4, b2, nVar3, agVar8, V2, eVar3, jrVar12.hl());
            case 30:
                izVar7 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.h.d.c cVar3 = (com.google.android.apps.search.assistant.surfaces.voice.h.d.c) iz.eg(izVar7).a();
                izVar8 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ac bI5 = izVar8.bI();
                hVar42 = this.f314a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar42.a();
                hVar43 = this.b.cy;
                k kVar3 = (k) hVar43.a();
                hVar44 = this.f314a.P;
                n nVar4 = (n) hVar44.a();
                jiVar48 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e eVar4 = (com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e) ji.cQ(jiVar48).a();
                jiVar49 = this.b.d;
                jiVar49.V();
                hVar45 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar2 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar45.a();
                jiVar50 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.c.b.e W = jiVar50.W();
                ik ikVar13 = this.b;
                boolean uN = ikVar13.uN();
                hVar46 = ikVar13.as;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar5 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) hVar46.a();
                jiVar51 = this.b.d;
                boolean dL = jiVar51.dL();
                jiVar52 = this.b.d;
                com.google.protos.l.a.e bL = jiVar52.bL();
                hVar47 = this.f314a.f;
                Context context3 = (Context) hVar47.a();
                jiVar53 = this.b.d;
                boolean dM = jiVar53.dM();
                izVar9 = this.b.b;
                boolean m114if = izVar9.m114if();
                hVar48 = this.f314a.ta;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i iVar4 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i) hVar48.a();
                jiVar54 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.voice.h.c.g(cVar3, bI5, aVar5, kVar3, nVar4, eVar4, dVar2, W, uN, eVar5, dL, bL, context3, dM, m114if, iVar4, jiVar54.dU());
            case 31:
                izVar10 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.h.d.c cVar4 = (com.google.android.apps.search.assistant.surfaces.voice.h.d.c) iz.eg(izVar10).a();
                izVar11 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ac bI6 = izVar11.bI();
                hVar49 = this.f314a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar49.a();
                hVar50 = this.b.cy;
                k kVar4 = (k) hVar50.a();
                hVar51 = this.f314a.P;
                n nVar5 = (n) hVar51.a();
                jiVar55 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e eVar6 = (com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e) ji.cQ(jiVar55).a();
                jiVar56 = this.b.d;
                jiVar56.V();
                hVar52 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar3 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar52.a();
                jiVar57 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.voice.h.c.l(cVar4, bI6, aVar6, kVar4, nVar5, eVar6, dVar3, jiVar57.W());
            case 32:
                jjVar6 = this.b.f308a;
                hVar53 = jjVar6.me;
                com.google.android.apps.search.assistant.surfaces.voice.i.d.l lVar3 = (com.google.android.apps.search.assistant.surfaces.voice.i.d.l) hVar53.a();
                com.google.android.apps.search.assistant.surfaces.voice.i.d.c.a.c(lVar3);
                return lVar3;
            case 33:
                jiVar58 = this.b.d;
                return com.google.android.libraries.search.assistant.invocation.o.c.b.c(jiVar58.aK());
            case 34:
                jiVar59 = this.b.d;
                return new t(jiVar59.aN(), new com.google.android.libraries.search.assistant.ai.a.a.h());
            case 35:
                hVar54 = this.f314a.H;
                return new com.google.android.libraries.search.assistant.ai.a.a.j((cr) hVar54.a());
            case 36:
                jiVar60 = this.b.d;
                jiVar60.aO();
                return new com.google.android.libraries.search.assistant.ai.b.d.g();
            case 37:
                jyVar = this.f314a.f319a;
                jyVar.Q();
                hVar55 = this.f314a.Q;
                ag agVar9 = (ag) hVar55.a();
                hVar56 = this.f314a.H;
                return new com.google.android.libraries.search.assistant.ai.d.a.d(agVar9, (cr) hVar56.a());
            case 38:
                jiVar61 = this.b.d;
                return jiVar61.ar();
            case 39:
                hVar57 = this.f314a.f;
                Context context4 = (Context) hVar57.a();
                hVar58 = this.f314a.v;
                cq cqVar = (cq) hVar58.a();
                hVar59 = this.f314a.H;
                Executor executor = (Executor) hVar59.a();
                jiVar62 = this.b.d;
                com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.f eD = jiVar62.eD();
                jiVar63 = this.b.d;
                h cg = ji.cg(jiVar63);
                hVar60 = this.f314a.g;
                return new OneSearchImageProvider(context4, cqVar, executor, eD, cg, (com.google.android.libraries.g.a) hVar60.a());
            case 40:
                hVar61 = this.f314a.f;
                return com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.g.b((Context) hVar61.a());
            case 41:
                hVar62 = this.f314a.f;
                Context context5 = (Context) hVar62.a();
                hVar63 = this.f314a.Q;
                ag agVar10 = (ag) hVar63.a();
                jeVar = this.b.c;
                com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.q bc = jeVar.bc();
                jiVar64 = this.b.d;
                com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l ap = jiVar64.ap();
                hVar64 = this.f314a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar64.a();
                hVar65 = this.f314a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar65.a();
                jjVar7 = this.b.f308a;
                hVar66 = jjVar7.aC;
                com.google.android.libraries.search.ap.b.b bVar5 = (com.google.android.libraries.search.ap.b.b) hVar66.a();
                jjVar8 = this.b.f308a;
                return new ai(context5, agVar10, bc, ap, aVar7, extensionRegistryLite, bVar5, jjVar8.fh());
            case 42:
                jiVar65 = this.b.d;
                aq aqVar = (aq) ji.cT(jiVar65).a();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.a.b.b(aqVar);
                return aqVar;
            case 43:
                hVar67 = this.b.g;
                AccountId accountId2 = (AccountId) hVar67.a();
                hVar68 = this.f314a.lR;
                com.google.apps.tiktok.p.b bVar6 = (com.google.apps.tiktok.p.b) hVar68.a();
                hVar69 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar3 = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar69.a();
                hVar70 = this.f314a.P;
                n nVar6 = (n) hVar70.a();
                jiVar66 = this.b.d;
                ao bE2 = jiVar66.bE();
                hVar71 = this.f314a.g;
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) hVar71.a();
                jjVar9 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.b.i aq3 = jjVar9.aq();
                hVar72 = this.b.cy;
                k kVar5 = (k) hVar72.a();
                hVar73 = this.f314a.Q;
                ag agVar11 = (ag) hVar73.a();
                hVar74 = this.f314a.Y;
                String str3 = (String) hVar74.a();
                jrVar13 = this.f314a.b;
                p pVar3 = (p) jr.bE(jrVar13).a();
                jjVar10 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.s ap2 = jjVar10.ap();
                jiVar67 = this.b.d;
                ao bA2 = jiVar67.bA();
                hVar75 = this.b.ba;
                com.google.android.libraries.search.b.b bVar7 = (com.google.android.libraries.search.b.b) hVar75.a();
                jiVar68 = this.b.d;
                boolean dX = jiVar68.dX();
                jiVar69 = this.b.d;
                boolean ed = jiVar69.ed();
                hVar76 = this.f314a.x;
                com.google.android.libraries.phenotype.client.a.i iVar5 = (com.google.android.libraries.phenotype.client.a.i) hVar76.a();
                ik ikVar14 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.h bl2 = ikVar14.bl();
                jiVar70 = ikVar14.d;
                boolean dN = jiVar70.dN();
                jiVar71 = this.b.d;
                ao bG = jiVar71.bG();
                jiVar72 = this.b.d;
                boolean ef = jiVar72.ef();
                ik ikVar15 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ap.a dk2 = ikVar15.dk();
                jiVar73 = ikVar15.d;
                ao bD2 = jiVar73.bD();
                jrVar14 = this.f314a.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.a.b hI2 = jrVar14.hI();
                hVar77 = this.b.z;
                am amVar2 = (am) hVar77.a();
                izVar12 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ah.j cl = izVar12.cl();
                ik ikVar16 = this.b;
                u bb3 = ikVar16.bb();
                com.google.protos.l.a.b lr = ikVar16.lr();
                ao la = ikVar16.la();
                jiVar74 = ikVar16.d;
                boolean ep2 = jiVar74.ep();
                jiVar75 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.h Z3 = jiVar75.Z();
                jjVar11 = this.b.f308a;
                boolean qg = jjVar11.qg();
                ik ikVar17 = this.b;
                boolean uc2 = ikVar17.uc();
                jiVar76 = ikVar17.d;
                boolean eC = jiVar76.eC();
                jiVar77 = this.b.d;
                boolean dO = jiVar77.dO();
                jiVar78 = this.b.d;
                boolean dF = jiVar78.dF();
                jjVar12 = this.b.f308a;
                String mP = jjVar12.mP();
                jiVar79 = this.b.d;
                return new aq(accountId2, bVar6, auVar3, nVar6, bE2, aVar8, aq3, kVar5, agVar11, str3, pVar3, ap2, bA2, bVar7, dX, ed, iVar5, bl2, dN, bG, ef, dk2, bD2, hI2, amVar2, cl, bb3, lr, la, ep2, Z3, qg, uc2, eC, dO, dF, mP, jiVar79.dH());
            case 44:
                jiVar80 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.h hVar122 = (com.google.android.libraries.search.assistant.av.d.h) ji.cU(jiVar80).a();
                com.google.android.libraries.search.assistant.av.d.b.a.b(hVar122);
                return hVar122;
            case 45:
                hVar78 = this.f314a.Q;
                ag agVar12 = (ag) hVar78.a();
                jiVar81 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.l lVar4 = (com.google.android.libraries.search.assistant.av.d.a.l) ji.bO(jiVar81).a();
                jiVar82 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.u bm = jiVar82.bm();
                jiVar83 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.o bl3 = jiVar83.bl();
                jiVar84 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.d.c br = jiVar84.br();
                jiVar85 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.a.f bo = jiVar85.bo();
                jiVar86 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.aa bn = jiVar86.bn();
                hVar79 = this.b.dm;
                com.google.android.libraries.search.assistant.av.c.a.d dVar4 = (com.google.android.libraries.search.assistant.av.c.a.d) hVar79.a();
                jiVar87 = this.b.d;
                com.google.android.libraries.search.assistant.av.c.b bk = jiVar87.bk();
                jxVar9 = this.f314a.c;
                com.google.android.libraries.search.assistant.av.d.a.w wVar = (com.google.android.libraries.search.assistant.av.d.a.w) jx.cc(jxVar9).a();
                jiVar88 = this.b.d;
                boolean dQ = jiVar88.dQ();
                jiVar89 = this.b.d;
                long d = jiVar89.d();
                jiVar90 = this.b.d;
                long c = jiVar90.c();
                jiVar91 = this.b.d;
                return new com.google.android.libraries.search.assistant.av.d.h(agVar12, lVar4, bm, bl3, br, bo, bn, dVar4, bk, wVar, dQ, d, c, jiVar91.bq());
            case 46:
                hVar80 = this.f314a.Q;
                ag agVar13 = (ag) hVar80.a();
                hVar81 = this.b.dm;
                com.google.android.libraries.search.assistant.av.c.a.d dVar5 = (com.google.android.libraries.search.assistant.av.c.a.d) hVar81.a();
                ik ikVar18 = this.b;
                da hR = ikVar18.hR();
                jiVar92 = ikVar18.d;
                long c2 = jiVar92.c();
                ik ikVar19 = this.b;
                Set sc = ikVar19.sc();
                jiVar93 = ikVar19.d;
                com.google.android.libraries.search.assistant.av.d.a.aa bn2 = jiVar93.bn();
                jiVar94 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.u bm2 = jiVar94.bm();
                jiVar95 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.o bl4 = jiVar95.bl();
                jiVar96 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.a.f bo2 = jiVar96.bo();
                jiVar97 = this.b.d;
                com.google.android.libraries.search.assistant.av.c.b bk2 = jiVar97.bk();
                jxVar10 = this.f314a.c;
                com.google.android.libraries.search.assistant.av.d.a.w wVar2 = (com.google.android.libraries.search.assistant.av.d.a.w) jx.cc(jxVar10).a();
                jiVar98 = this.b.d;
                com.google.android.libraries.search.assistant.av.d.a.c.d bq = jiVar98.bq();
                jiVar99 = this.b.d;
                return new com.google.android.libraries.search.assistant.av.d.a.l(agVar13, dVar5, hR, c2, sc, bn2, bm2, bl4, bo2, bk2, wVar2, bq, jiVar99.dP());
            case 47:
                ik ikVar20 = this.b;
                jo joVar8 = this.f314a;
                io.grpc.i qg2 = ikVar20.qg();
                io.grpc.i qh = ikVar20.qh();
                jrVar15 = joVar8.b;
                return bj.c(qg2, qh, jrVar15.hB());
            case 48:
                jiVar100 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.i.d.b.d dVar6 = (com.google.android.apps.search.assistant.surfaces.voice.i.d.b.d) ji.cX(jiVar100).a();
                com.google.android.apps.search.assistant.surfaces.voice.i.d.c.a.d(dVar6);
                return dVar6;
            case 49:
                hVar82 = this.f314a.P;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.d.b.d((n) hVar82.a());
            case 50:
                jiVar101 = this.b.d;
                com.google.android.libraries.search.assistant.ap.g.a aVar9 = (com.google.android.libraries.search.assistant.ap.g.a) ji.cP(jiVar101).a();
                com.google.android.libraries.search.assistant.ap.g.b.b(aVar9);
                return aVar9;
            case 51:
                jiVar102 = this.b.d;
                com.google.android.libraries.search.assistant.ap.e.a.j eG = jiVar102.eG();
                hVar83 = this.f314a.P;
                return new com.google.android.libraries.search.assistant.ap.g.a(eG, (n) hVar83.a());
            case 52:
                return new lt(this);
            case 53:
                jiVar103 = this.b.d;
                com.google.android.libraries.search.assistant.n.a.a.b aC = jiVar103.aC();
                jiVar104 = this.b.d;
                com.google.android.libraries.search.assistant.n.a.a.b aE = jiVar104.aE();
                jiVar105 = this.b.d;
                com.google.android.libraries.search.assistant.n.a.a.b aD = jiVar105.aD();
                jiVar106 = this.b.d;
                com.google.android.libraries.search.assistant.n.a.a.b aF = jiVar106.aF();
                jiVar107 = this.b.d;
                com.google.android.libraries.search.assistant.n.a.a.b aG = jiVar107.aG();
                jiVar108 = this.b.d;
                com.google.android.libraries.search.assistant.ap.d.b.a.c aU = jiVar108.aU();
                jiVar109 = this.b.d;
                jiVar110 = this.b.d;
                jiVar111 = this.b.d;
                jiVar112 = this.b.d;
                jiVar113 = this.b.d;
                jiVar114 = this.b.d;
                jiVar115 = this.b.d;
                jiVar116 = this.b.d;
                jiVar117 = this.b.d;
                return ha.w(aC, aE, aD, aF, aG, aU, new com.google.android.libraries.search.assistant.n.a.a.b[]{jiVar109.aV(), jiVar110.aW(), jiVar111.be(), jiVar112.aX(), jiVar113.aY(), jiVar114.aZ(), jiVar115.ba(), jiVar116.bb(), jiVar117.bc()});
            case 54:
                return new com.google.android.libraries.search.assistant.ap.d.a.c();
            case 55:
                return com.google.android.libraries.search.assistant.ap.d.b.a.b(this.b.iL());
            case 56:
                return new com.google.android.libraries.search.assistant.ap.d.c.d();
            case 57:
                hVar84 = this.f314a.bo;
                ag agVar14 = (ag) hVar84.a();
                hVar85 = this.b.g;
                AccountId accountId3 = (AccountId) hVar85.a();
                hVar86 = this.f314a.bq;
                com.google.apps.tiktok.account.data.a.d dVar7 = (com.google.apps.tiktok.account.data.a.d) hVar86.a();
                jrVar16 = this.f314a.b;
                com.google.android.gms.contextmanager.a.a aVar10 = (com.google.android.gms.contextmanager.a.a) jr.cx(jrVar16).a();
                hVar87 = this.f314a.f;
                return new com.google.android.libraries.search.assistant.aq.p.a.d(agVar14, accountId3, dVar7, aVar10, (Context) hVar87.a());
            case 58:
                return new com.google.android.libraries.search.assistant.ap.d.d.a();
            case 59:
                com.google.android.libraries.search.assistant.n.a.a.a aVar11 = new com.google.android.libraries.search.assistant.n.a.a.a("ANDROID_WEAR");
                hVar88 = this.b.cI;
                com.google.android.libraries.search.assistant.n.a.a.b bVar8 = (com.google.android.libraries.search.assistant.n.a.a.b) hVar88.a();
                jiVar118 = this.b.d;
                com.google.android.libraries.search.assistant.ap.d.e.a.a.c bd = jiVar118.bd();
                jiVar119 = this.b.d;
                com.google.android.libraries.search.assistant.ap.d.e.a.d.c bg = jiVar119.bg();
                jiVar120 = this.b.d;
                com.google.android.libraries.search.assistant.ap.d.e.a.e.c bh = jiVar120.bh();
                jiVar121 = this.b.d;
                return ha.w(aVar11, bVar8, bd, bg, bh, jiVar121.bf(), new com.google.android.libraries.search.assistant.n.a.a.b[0]);
            case 60:
                return com.google.android.libraries.search.assistant.ap.e.a.b.b();
            case 61:
                ik ikVar21 = this.b;
                com.google.android.libraries.search.assistant.ap.e eVar7 = com.google.android.libraries.search.assistant.ap.e.a;
                jiVar122 = ikVar21.d;
                return fu.m(eVar7, jiVar122.eF());
            case 62:
                jiVar123 = this.b.d;
                return jiVar123.aR();
            case 63:
                jiVar124 = this.b.d;
                return new com.google.android.libraries.search.assistant.ap.e.a.a((com.google.android.libraries.search.assistant.ap.d.c.d) ji.cO(jiVar124).a());
            case 64:
                jiVar125 = this.b.d;
                return com.google.android.libraries.search.assistant.ap.c.a.b(jiVar125.dB());
            case 65:
                return new lt(this);
            case 66:
                return new lt(this);
            case 67:
                return new lt(this);
            case 68:
                izVar13 = this.b.b;
                com.google.android.libraries.search.assistant.performer.h.z cQ = izVar13.cQ();
                izVar14 = this.b.b;
                com.google.android.libraries.search.assistant.performer.h.f.a.a cR = izVar14.cR();
                izVar15 = this.b.b;
                com.google.android.libraries.search.assistant.performer.h.f.a.g cS = izVar15.cS();
                jiVar126 = this.b.d;
                com.google.android.libraries.search.assistant.ap.c.h.a aS2 = jiVar126.aS();
                jrVar17 = this.f314a.b;
                boolean gE = jrVar17.gE();
                jrVar18 = this.f314a.b;
                boolean gz = jrVar18.gz();
                jrVar19 = this.f314a.b;
                boolean gA = jrVar19.gA();
                jrVar20 = this.f314a.b;
                boolean gB = jrVar20.gB();
                jrVar21 = this.f314a.b;
                return com.google.android.libraries.search.assistant.ap.c.d.b.b(cQ, cR, cS, aS2, gE, gz, gA, gB, e.c.c.b(jr.bF(jrVar21)));
            case 69:
                return new lt(this);
            case 70:
                return new lt(this);
            case 71:
                hVar89 = this.b.cV;
                com.google.android.apps.search.assistant.surfaces.voice.e.i.a.o oVar = (com.google.android.apps.search.assistant.surfaces.voice.e.i.a.o) hVar89.a();
                com.google.android.apps.search.assistant.surfaces.voice.e.i.b.a.b(oVar);
                return oVar;
            case 72:
                jiVar127 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.robin.o.a.g gVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.o.a.g) ji.db(jiVar127).a();
                com.google.android.apps.search.assistant.surfaces.voice.robin.o.a.h.b(gVar2);
                return gVar2;
            case 73:
                hVar90 = this.f314a.P;
                n nVar7 = (n) hVar90.a();
                izVar16 = this.b.b;
                boolean ig = izVar16.ig();
                ik ikVar22 = this.b;
                jo joVar9 = this.f314a;
                boolean tr = ikVar22.tr();
                hVar91 = joVar9.bN;
                com.google.apps.tiktok.account.data.b bVar9 = (com.google.apps.tiktok.account.data.b) hVar91.a();
                hVar92 = this.b.g;
                AccountId accountId4 = (AccountId) hVar92.a();
                hVar93 = this.f314a.gf;
                SharedPreferences sharedPreferences = (SharedPreferences) hVar93.a();
                hVar94 = this.b.gS;
                cg cgVar = (cg) hVar94.a();
                hVar95 = this.b.z;
                am amVar3 = (am) hVar95.a();
                jiVar128 = this.b.d;
                cg cgVar2 = (cg) ji.cL(jiVar128).a();
                ik ikVar23 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.m cD = ikVar23.cD();
                jiVar129 = ikVar23.d;
                boolean dR = jiVar129.dR();
                jiVar130 = this.b.d;
                boolean dS = jiVar130.dS();
                jiVar131 = this.b.d;
                boolean dT = jiVar131.dT();
                jrVar22 = this.f314a.b;
                p pVar4 = (p) jr.bE(jrVar22).a();
                hVar96 = this.f314a.Y;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.o.a.g(nVar7, ig, tr, bVar9, accountId4, sharedPreferences, cgVar, amVar3, cgVar2, cD, dR, dS, dT, pVar4, (String) hVar96.a());
            case 74:
                ik ikVar24 = this.b;
                jo joVar10 = this.f314a;
                com.google.apps.tiktok.q.b.h b3 = com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.b();
                com.google.apps.tiktok.account.d.b.a.b kg = ikVar24.kg();
                hVar97 = joVar10.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ak.c.a.h(b3, kg, (com.google.android.libraries.storage.a.j) hVar97.a());
            case 75:
                jiVar132 = this.b.d;
                return new com.google.android.libraries.search.ah.i.c.z(jiVar132.bv());
            case 76:
                jiVar133 = this.b.d;
                return new com.google.android.libraries.search.assistant.invocation.t.c.a(jiVar133.aL());
            case 77:
                hVar98 = this.f314a.fl;
                return com.google.android.libraries.search.assistant.invocation.t.c.c.d((com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.g) hVar98.a());
            case 78:
                jiVar134 = this.b.d;
                return jiVar134.Y();
            case 79:
                jiVar135 = this.b.d;
                return jiVar135.ad();
            case 80:
                jiVar136 = this.b.d;
                h dh = ji.dh(jiVar136);
                jiVar137 = this.b.d;
                boolean dV = jiVar137.dV();
                jiVar138 = this.b.d;
                return com.google.android.apps.search.assistant.platform.i.j.b(dh, dV, ji.dg(jiVar138));
            case 81:
                jiVar139 = this.b.d;
                com.google.android.apps.search.assistant.libraries.m.b h = jiVar139.h();
                jiVar140 = this.b.d;
                com.google.android.apps.search.assistant.libraries.m.b g = jiVar140.g();
                jiVar141 = this.b.d;
                com.google.android.apps.search.assistant.libraries.m.b i2 = jiVar141.i();
                hVar99 = this.f314a.Q;
                ag agVar15 = (ag) hVar99.a();
                hVar100 = this.f314a.P;
                n nVar8 = (n) hVar100.a();
                jiVar142 = this.b.d;
                return new com.google.android.apps.search.assistant.platform.i.i(h, g, i2, agVar15, nVar8, jiVar142.aj());
            case 82:
                ik ikVar25 = this.b;
                jo joVar11 = this.f314a;
                io.grpc.i qh2 = ikVar25.qh();
                hVar101 = joVar11.em;
                return com.google.android.apps.search.assistant.platform.i.j.c(qh2, (com.google.frameworks.client.data.android.server.tiktok.ac) hVar101.a());
            case 83:
                hVar102 = this.f314a.H;
                Executor executor2 = (Executor) hVar102.a();
                jiVar143 = this.b.d;
                lt ltVar2 = (lt) ji.cn(jiVar143).a();
                jiVar144 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.e.a.h ai = jiVar144.ai();
                hVar103 = this.f314a.Q;
                return new com.google.android.apps.search.assistant.surfaces.e.t(executor2, ltVar2, ai, (ag) hVar103.a());
            case 84:
                return new lt(this);
            case 85:
                return new ju(this, 1);
            case 86:
                return new lt(this);
            case 87:
                return new lt(this);
            case 88:
                return new lt(this);
            case 89:
                return new lt(this);
            case 90:
                return Long.valueOf(h.a.a.f.b.a.f.c(this.b.yp()));
            case 91:
                hVar104 = this.f314a.R;
                n nVar9 = (n) hVar104.a();
                jiVar145 = this.b.d;
                com.google.protos.l.a.b bJ2 = jiVar145.bJ();
                jiVar146 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.e.d.e.h(nVar9, bJ2, jiVar146.bK());
            case 92:
                return new lt(this);
            case 93:
                return new lt(this);
            case 94:
                jiVar147 = this.b.d;
                return new com.google.android.libraries.search.assistant.ai.c.a.u(jiVar147.aP(), new com.google.android.libraries.search.assistant.ai.c.a.z());
            case 95:
                jiVar148 = this.b.d;
                Map dx = jiVar148.dx();
                hVar105 = this.f314a.H;
                cr crVar = (cr) hVar105.a();
                hVar106 = this.f314a.P;
                return new com.google.android.libraries.search.assistant.ai.c.a.d(dx, crVar, (n) hVar106.a());
            case 96:
                jjVar13 = this.b.f308a;
                hVar107 = jjVar13.cb;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.c.b bVar10 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.c.b) hVar107.a();
                hVar108 = this.f314a.f;
                Context context6 = (Context) hVar108.a();
                jjVar14 = this.b.f308a;
                hVar109 = jjVar14.cc;
                ad adVar = (ad) hVar109.a();
                hVar110 = this.f314a.H;
                cq cqVar2 = (cq) hVar110.a();
                ik ikVar26 = this.b;
                Optional empty = Optional.empty();
                jiVar149 = ikVar26.d;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.d dVar8 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.d) ji.dc(jiVar149).a();
                hVar111 = this.f314a.g;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.e(bVar10, context6, adVar, cqVar2, empty, dVar8, (com.google.android.libraries.g.a) hVar111.a());
            case 97:
                hVar112 = this.f314a.f;
                Context context7 = (Context) hVar112.a();
                jjVar15 = this.b.f308a;
                hVar113 = jjVar15.cc;
                ad adVar2 = (ad) hVar113.a();
                jiVar150 = this.b.d;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.a.a.a aVar12 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.a.a.a) ji.bU(jiVar150).a();
                hVar114 = this.f314a.H;
                cq cqVar3 = (cq) hVar114.a();
                hVar115 = this.f314a.H;
                cr crVar2 = (cr) hVar115.a();
                hVar116 = this.f314a.g;
                com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) hVar116.a();
                jiVar151 = this.b.d;
                com.google.android.libraries.search.assistant.spokennotifications.a.e.a bs = jiVar151.bs();
                hVar117 = this.f314a.mW;
                Optional of2 = Optional.of((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) hVar117.a());
                jiVar152 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.a.a.g aa = jiVar152.aa();
                jiVar153 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.i ag = jiVar153.ag();
                jiVar154 = this.b.d;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.a.c.a.b bVar11 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.a.c.a.b) ji.cw(jiVar154).a();
                hVar118 = this.f314a.vh;
                com.google.android.libraries.search.d.x.e.d dVar9 = (com.google.android.libraries.search.d.x.e.d) hVar118.a();
                hVar119 = this.f314a.W;
                y yVar = (y) hVar119.a();
                jiVar155 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.d dVar10 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.d) ji.dd(jiVar155).a();
                jjVar16 = this.b.f308a;
                hVar120 = jjVar16.fy;
                com.google.android.libraries.search.assistant.spokennotifications.a.b bVar12 = (com.google.android.libraries.search.assistant.spokennotifications.a.b) hVar120.a();
                jiVar156 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.c.a.i iVar6 = (com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.c.a.i) ji.de(jiVar156).a();
                jjVar17 = this.b.f308a;
                com.google.android.apps.search.assistant.platform.g.l.a.o G = jjVar17.G();
                jiVar157 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.c af = jiVar157.af();
                jiVar158 = this.b.d;
                boolean dY = jiVar158.dY();
                jiVar159 = this.b.d;
                boolean dZ = jiVar159.dZ();
                jiVar160 = this.b.d;
                boolean booleanValue2 = ((Boolean) ji.cJ(jiVar160).a()).booleanValue();
                jiVar161 = this.b.d;
                boolean ea = jiVar161.ea();
                hVar121 = this.f314a.hH;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.a.s(context7, adVar2, aVar12, cqVar3, crVar2, aVar13, bs, of2, aa, ag, bVar11, dVar9, yVar, dVar10, bVar12, iVar6, G, af, dY, dZ, booleanValue2, ea, ((Boolean) hVar121.a()).booleanValue());
            case 98:
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.a.a.a();
            case 99:
                return com.google.android.libraries.search.assistant.spokennotifications.autoread.a.c.g.b(this.b.qg());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v261, types: [java.lang.Object, com.google.android.apps.search.assistant.surfaces.dictation.service.f.a] */
    /* JADX WARN: Type inference failed for: r2v257, types: [com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.a, java.lang.Object] */
    private final Object c() {
        jr jrVar;
        h hVar;
        jj jjVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        jr jrVar2;
        jr jrVar3;
        h hVar7;
        h hVar8;
        ji jiVar;
        h hVar9;
        jx jxVar;
        h hVar10;
        h hVar11;
        jr jrVar4;
        h hVar12;
        jx jxVar2;
        jr jrVar5;
        h hVar13;
        h hVar14;
        jj jjVar2;
        h hVar15;
        h hVar16;
        h hVar17;
        ji jiVar2;
        h hVar18;
        jx jxVar3;
        jx jxVar4;
        jx jxVar5;
        h hVar19;
        ji jiVar3;
        ji jiVar4;
        jx jxVar6;
        h hVar20;
        h hVar21;
        h hVar22;
        h hVar23;
        ji jiVar5;
        ji jiVar6;
        ji jiVar7;
        h hVar24;
        jj jjVar3;
        h hVar25;
        jj jjVar4;
        ji jiVar8;
        h hVar26;
        h hVar27;
        ji jiVar9;
        h hVar28;
        jj jjVar5;
        ji jiVar10;
        h hVar29;
        h hVar30;
        jj jjVar6;
        jx jxVar7;
        ji jiVar11;
        h hVar31;
        ji jiVar12;
        h hVar32;
        h hVar33;
        ji jiVar13;
        h hVar34;
        ji jiVar14;
        jx jxVar8;
        h hVar35;
        ji jiVar15;
        h hVar36;
        h hVar37;
        h hVar38;
        h hVar39;
        h hVar40;
        h hVar41;
        h hVar42;
        h hVar43;
        h hVar44;
        jj jjVar7;
        h hVar45;
        h hVar46;
        h hVar47;
        h hVar48;
        h hVar49;
        ji jiVar16;
        ji jiVar17;
        ji jiVar18;
        ji jiVar19;
        ji jiVar20;
        jx jxVar9;
        ji jiVar21;
        jx jxVar10;
        jx jxVar11;
        jx jxVar12;
        h hVar50;
        h hVar51;
        h hVar52;
        h hVar53;
        h hVar54;
        jy jyVar;
        h hVar55;
        h hVar56;
        h hVar57;
        ji jiVar22;
        h hVar58;
        h hVar59;
        h hVar60;
        jx jxVar13;
        h hVar61;
        ji jiVar23;
        h hVar62;
        jx jxVar14;
        ji jiVar24;
        jy jyVar2;
        ji jiVar25;
        h hVar63;
        h hVar64;
        ji jiVar26;
        h hVar65;
        h hVar66;
        ji jiVar27;
        ji jiVar28;
        ji jiVar29;
        ji jiVar30;
        ji jiVar31;
        ji jiVar32;
        jx jxVar15;
        jx jxVar16;
        jx jxVar17;
        jx jxVar18;
        jx jxVar19;
        jx jxVar20;
        ji jiVar33;
        jx jxVar21;
        iz izVar;
        ji jiVar34;
        je jeVar;
        h hVar67;
        h hVar68;
        h hVar69;
        ji jiVar35;
        ji jiVar36;
        h hVar70;
        h hVar71;
        h hVar72;
        h hVar73;
        h hVar74;
        ji jiVar37;
        ji jiVar38;
        ji jiVar39;
        ji jiVar40;
        ji jiVar41;
        ji jiVar42;
        jx jxVar22;
        h hVar75;
        h hVar76;
        ji jiVar43;
        ji jiVar44;
        h hVar77;
        ji jiVar45;
        h hVar78;
        jx jxVar23;
        ji jiVar46;
        jx jxVar24;
        ji jiVar47;
        ji jiVar48;
        ji jiVar49;
        ji jiVar50;
        ji jiVar51;
        ji jiVar52;
        ji jiVar53;
        ji jiVar54;
        ji jiVar55;
        jx jxVar25;
        h hVar79;
        ji jiVar56;
        ji jiVar57;
        ji jiVar58;
        ji jiVar59;
        ji jiVar60;
        ji jiVar61;
        ji jiVar62;
        ji jiVar63;
        iz izVar2;
        ji jiVar64;
        ji jiVar65;
        h hVar80;
        jx jxVar26;
        jx jxVar27;
        jx jxVar28;
        jx jxVar29;
        jx jxVar30;
        jx jxVar31;
        jx jxVar32;
        jx jxVar33;
        jx jxVar34;
        jx jxVar35;
        h hVar81;
        jx jxVar36;
        jx jxVar37;
        jx jxVar38;
        jx jxVar39;
        h hVar82;
        ji jiVar66;
        jx jxVar40;
        jx jxVar41;
        jx jxVar42;
        ji jiVar67;
        h hVar83;
        h hVar84;
        h hVar85;
        jx jxVar43;
        jx jxVar44;
        ji jiVar68;
        ji jiVar69;
        ji jiVar70;
        ji jiVar71;
        ji jiVar72;
        ji jiVar73;
        jx jxVar45;
        jx jxVar46;
        jx jxVar47;
        ji jiVar74;
        h hVar86;
        h hVar87;
        h hVar88;
        h hVar89;
        ji jiVar75;
        ji jiVar76;
        ji jiVar77;
        jx jxVar48;
        jx jxVar49;
        jx jxVar50;
        jx jxVar51;
        jx jxVar52;
        h hVar90;
        jx jxVar53;
        ji jiVar78;
        ji jiVar79;
        ji jiVar80;
        ji jiVar81;
        ji jiVar82;
        jx jxVar54;
        jx jxVar55;
        h hVar91;
        ji jiVar83;
        h hVar92;
        ji jiVar84;
        jx jxVar56;
        h hVar93;
        ji jiVar85;
        ji jiVar86;
        ji jiVar87;
        ji jiVar88;
        h hVar94;
        ji jiVar89;
        ji jiVar90;
        h hVar95;
        ji jiVar91;
        h hVar96;
        ji jiVar92;
        h hVar97;
        h hVar98;
        h hVar99;
        h hVar100;
        ji jiVar93;
        ji jiVar94;
        ji jiVar95;
        h hVar101;
        h hVar102;
        ji jiVar96;
        h hVar103;
        ji jiVar97;
        ji jiVar98;
        ji jiVar99;
        h hVar104;
        ji jiVar100;
        h hVar105;
        jx jxVar57;
        jx jxVar58;
        h hVar106;
        ji jiVar101;
        ji jiVar102;
        jx jxVar59;
        h hVar107;
        ji jiVar103;
        h hVar108;
        h hVar109;
        h hVar110;
        ji jiVar104;
        iz izVar3;
        jx jxVar60;
        jx jxVar61;
        iz izVar4;
        h hVar111;
        ji jiVar105;
        ji jiVar106;
        ji jiVar107;
        ji jiVar108;
        ji jiVar109;
        h hVar112;
        iz izVar5;
        jx jxVar62;
        ji jiVar110;
        h hVar113;
        ji jiVar111;
        ji jiVar112;
        ji jiVar113;
        ji jiVar114;
        h hVar114;
        h hVar115;
        ji jiVar115;
        ji jiVar116;
        h hVar116;
        h hVar117;
        ji jiVar117;
        ji jiVar118;
        ji jiVar119;
        jx jxVar63;
        ji jiVar120;
        ji jiVar121;
        ji jiVar122;
        ji jiVar123;
        h hVar118;
        jx jxVar64;
        jx jxVar65;
        jx jxVar66;
        h hVar119;
        ji jiVar124;
        h hVar120;
        h hVar121;
        h hVar122;
        jj jjVar8;
        h hVar123;
        h hVar124;
        je jeVar2;
        h hVar125;
        jj jjVar9;
        h hVar126;
        int i = this.c;
        switch (i) {
            case 100:
                jrVar = this.f314a.b;
                p pVar = (p) jr.bE(jrVar).a();
                hVar = this.f314a.Y;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.d(pVar, (String) hVar.a());
            case 101:
                jjVar = this.b.f308a;
                hVar2 = jjVar.mn;
                return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.c.a.i((com.google.android.apps.search.assistant.surfaces.bisto.e.d.h) hVar2.a());
            case 102:
                return Boolean.valueOf(h.a.a.d.b.a.r.d(this.b.ym()));
            case 103:
                hVar3 = this.f314a.Sc;
                com.google.android.libraries.assistant.auto.tng.morris.d.a.f fVar = (com.google.android.libraries.assistant.auto.tng.morris.d.a.f) hVar3.a();
                hVar4 = this.f314a.H;
                cq cqVar = (cq) hVar4.a();
                hVar5 = this.f314a.pY;
                return new com.google.android.libraries.assistant.auto.tng.morris.d.a.r(fVar, cqVar, (com.google.android.libraries.assistant.auto.tng.morris.c.n) hVar5.a());
            case 104:
                hVar6 = this.f314a.nh;
                com.google.android.libraries.search.assistant.notification.a.b bVar = (com.google.android.libraries.search.assistant.notification.a.b) hVar6.a();
                jrVar2 = this.f314a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar2).a();
                jrVar3 = this.f314a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.e.b.a.h hVar127 = (com.google.android.libraries.assistant.auto.tng.suggestions.b.e.b.a.h) jr.bP(jrVar3).a();
                hVar7 = this.f314a.H;
                cq cqVar2 = (cq) hVar7.a();
                hVar8 = this.f314a.v;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.d.a.a.j(bVar, eVar, hVar127, cqVar2, (Executor) hVar8.a());
            case 105:
                jiVar = this.b.d;
                return com.google.android.apps.search.assistant.platform.ondevice.b.a.a.a.b(jiVar.by());
            case 106:
                return new nz(this);
            case 107:
                return new nz(this);
            case 108:
                return new nz(this);
            case 109:
                hVar9 = this.f314a.P;
                n nVar = (n) hVar9.a();
                jxVar = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.grpc.b.c(nVar, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.b.k) jx.bk(jxVar).a());
            case 110:
                hVar10 = this.f314a.P;
                n nVar2 = (n) hVar10.a();
                hVar11 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar11.a();
                jrVar4 = this.f314a.b;
                return new com.google.android.libraries.assistant.auto.tng.report.service.a(nVar2, gVar, jr.de(jrVar4));
            case 111:
                hVar12 = this.f314a.P;
                n nVar3 = (n) hVar12.a();
                jxVar2 = this.f314a.c;
                return new bg(nVar3, (bh) jx.bs(jxVar2).a());
            case 112:
                jrVar5 = this.f314a.b;
                ar arVar = (ar) jr.ca(jrVar5).a();
                hVar13 = this.f314a.P;
                return new as(arVar, (n) hVar13.a());
            case 113:
                hVar14 = this.f314a.R;
                n nVar4 = (n) hVar14.a();
                jjVar2 = this.b.f308a;
                hVar15 = jjVar2.bx;
                de deVar = (de) hVar15.a();
                hVar16 = this.b.g;
                AccountId accountId = (AccountId) hVar16.a();
                hVar17 = this.f314a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar17.a();
                jiVar2 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.a.g m = jiVar2.m();
                hVar18 = this.b.Y;
                com.google.android.libraries.search.integrations.c.a.c cVar = (com.google.android.libraries.search.integrations.c.a.c) hVar18.a();
                jxVar3 = this.f314a.c;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.b.b T = jxVar3.T();
                jxVar4 = this.f314a.c;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.b.k kVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.b.k) jx.bk(jxVar4).a();
                jxVar5 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.grpc.a.ai(nVar4, deVar, accountId, dVar, m, cVar, T, kVar, jxVar5.dB());
            case 114:
                hVar19 = this.b.aZ;
                return new com.google.android.libraries.search.assistant.ae.a.a.d((com.google.android.libraries.search.assistant.ae.a.a.m) hVar19.a());
            case 115:
                jiVar3 = this.b.d;
                return new com.google.android.apps.search.assistant.platform.b.c.a.b(jiVar3.aH());
            case 116:
                return new lm(this.f314a, this.b);
            case 117:
                jiVar4 = this.b.d;
                com.google.android.apps.search.assistant.platform.appintegration.mosaic.a.b.a.a j = jiVar4.j();
                jxVar6 = this.f314a.c;
                com.google.android.apps.search.assistant.platform.appintegration.d.b bVar2 = (com.google.android.apps.search.assistant.platform.appintegration.d.b) jx.bu(jxVar6).a();
                hVar20 = this.b.g;
                return new com.google.android.apps.search.assistant.platform.appintegration.g.z(j, bVar2, (AccountId) hVar20.a());
            case 118:
                return new lm(this.f314a, this.b);
            case 119:
                hVar21 = this.b.ag;
                com.google.android.apps.search.assistant.platform.g.g.b.f fVar2 = (com.google.android.apps.search.assistant.platform.g.g.b.f) hVar21.a();
                hVar22 = this.f314a.v;
                return new com.google.android.apps.search.assistant.platform.g.g.a.b(fVar2, (Executor) hVar22.a());
            case 120:
                hVar23 = this.f314a.H;
                cq cqVar3 = (cq) hVar23.a();
                jiVar5 = this.b.d;
                return new com.google.android.apps.search.googleapp.search.voicesearch.b.b.c(cqVar3, jiVar5.as());
            case 121:
                return com.google.android.apps.search.googleapp.search.voicesearch.b.c.s.c();
            case 122:
                return com.google.android.apps.search.googleapp.search.voicesearch.b.c.s.b();
            case 123:
                jiVar6 = this.b.d;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.a.a.a aVar = (com.google.android.libraries.search.assistant.spokennotifications.autoread.a.a.a) ji.bU(jiVar6).a();
                jiVar7 = this.b.d;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.d dVar2 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.d) ji.dc(jiVar7).a();
                hVar24 = this.f314a.H;
                Executor executor = (Executor) hVar24.a();
                jjVar3 = this.b.f308a;
                hVar25 = jjVar3.cc;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.a.d(aVar, dVar2, executor, (ad) hVar25.a());
            case 124:
                jjVar4 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.e.f.c.a(jjVar4.P());
            case 125:
                jiVar8 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.bisto.e.f.a.a.a o = jiVar8.o();
                hVar26 = this.f314a.v;
                Executor executor2 = (Executor) hVar26.a();
                hVar27 = this.f314a.H;
                Executor executor3 = (Executor) hVar27.a();
                jiVar9 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.bisto.e.f.b.a p = jiVar9.p();
                hVar28 = this.b.m;
                com.google.android.libraries.search.assistant.at.a.a.h hVar128 = (com.google.android.libraries.search.assistant.at.a.a.h) hVar28.a();
                jjVar5 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.bisto.e.b.e P = jjVar5.P();
                jiVar10 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.bisto.e.c.h hVar129 = (com.google.android.apps.search.assistant.surfaces.bisto.e.c.h) ji.ce(jiVar10).a();
                hVar29 = this.f314a.bq;
                com.google.apps.tiktok.account.data.a.d dVar3 = (com.google.apps.tiktok.account.data.a.d) hVar29.a();
                hVar30 = this.b.g;
                AccountId accountId2 = (AccountId) hVar30.a();
                jjVar6 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.bisto.a.j.k L = jjVar6.L();
                jxVar7 = this.f314a.c;
                boolean dL = jxVar7.dL();
                jiVar11 = this.b.d;
                com.google.g.v.a.a.b bz = jiVar11.bz();
                hVar31 = this.b.Y;
                return new com.google.android.apps.search.assistant.surfaces.bisto.e.f.b.n(o, executor2, executor3, p, hVar128, P, hVar129, dVar3, accountId2, L, dL, bz, (com.google.android.libraries.search.integrations.c.a.c) hVar31.a());
            case 126:
                jiVar12 = this.b.d;
                return com.google.android.apps.search.assistant.surfaces.bisto.e.f.a.b.b.b(jiVar12.bM());
            case 127:
                hVar32 = this.f314a.ux;
                Context context = (Context) hVar32.a();
                hVar33 = this.f314a.Q;
                ag agVar = (ag) hVar33.a();
                jiVar13 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.bisto.e.c.k n = jiVar13.n();
                hVar34 = this.f314a.ez;
                f fVar3 = (f) hVar34.a();
                jiVar14 = this.b.d;
                ay ayVar = (ay) ji.ca(jiVar14).a();
                jxVar8 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.bisto.e.c.h(context, agVar, n, fVar3, ayVar, jxVar8.dJ());
            case 128:
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.grpc.a.a.b.b(this.b.qg());
            case 129:
                hVar35 = this.f314a.P;
                return new com.google.android.apps.search.assistant.surfaces.voice.b.a.c((n) hVar35.a());
            case 130:
                jiVar15 = this.b.d;
                Map du = jiVar15.du();
                hVar36 = this.f314a.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar36.a();
                hVar37 = this.f314a.H;
                return new com.google.android.libraries.search.assistant.o.a.a.h(du, dVar4, (ExecutorService) hVar37.a());
            case 131:
                return new com.google.android.apps.search.assistant.verticals.contextdebug.r();
            case 132:
                hVar38 = this.b.aa;
                com.google.apps.tiktok.g.p pVar2 = (com.google.apps.tiktok.g.p) hVar38.a();
                hVar39 = this.f314a.H;
                return new com.google.android.apps.search.assistant.verticals.contextdebug.c.c(pVar2, (Executor) hVar39.a());
            case 133:
                ik ikVar = this.b;
                jo joVar = this.f314a;
                com.google.android.apps.search.assistant.platform.pcp.api.l H = ikVar.H();
                hVar40 = joVar.H;
                return new com.google.android.apps.search.assistant.platform.pcp.c.c(H, (Executor) hVar40.a());
            case 134:
                ik ikVar2 = this.b;
                com.google.android.libraries.assistant.pcp.datastore.a.a.g gQ = ikVar2.gQ();
                hVar41 = ikVar2.cm;
                com.google.android.libraries.assistant.pcp.b bVar3 = (com.google.android.libraries.assistant.pcp.b) hVar41.a();
                hVar42 = this.f314a.H;
                return new com.google.android.libraries.assistant.pcp.l.a.c(gQ, bVar3, (Executor) hVar42.a());
            case 135:
                ik ikVar3 = this.b;
                jo joVar2 = this.f314a;
                Set rx = ikVar3.rx();
                com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.o M = ikVar3.M();
                hVar43 = joVar2.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar43.a();
                hVar44 = this.f314a.H;
                return new com.google.android.apps.search.assistant.verticals.ambient.i.b.f(rx, M, aVar2, (ExecutorService) hVar44.a());
            case 136:
                jjVar7 = this.b.f308a;
                hVar45 = jjVar7.fA;
                com.google.android.libraries.search.assistant.spokennotifications.a.a.a aVar3 = (com.google.android.libraries.search.assistant.spokennotifications.a.a.a) hVar45.a();
                hVar46 = this.f314a.H;
                cq cqVar4 = (cq) hVar46.a();
                hVar47 = this.f314a.H;
                cr crVar = (cr) hVar47.a();
                hVar48 = this.f314a.g;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.a.c.f(aVar3, cqVar4, crVar, (com.google.android.libraries.g.a) hVar48.a());
            case 137:
                hVar49 = this.f314a.H;
                cr crVar2 = (cr) hVar49.a();
                jiVar16 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b bVar4 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b) ji.bP(jiVar16).a();
                jiVar17 = this.b.d;
                Object a2 = ji.cv(jiVar17).a();
                jiVar18 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.u uVar = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.u) ji.cu(jiVar18).a();
                ik ikVar4 = this.b;
                Optional empty = Optional.empty();
                jiVar19 = ikVar4.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.n nVar5 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.n) ji.cb(jiVar19).a();
                jiVar20 = this.b.d;
                Object dm = jiVar20.dm();
                jxVar9 = this.f314a.c;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ag agVar2 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ag) jx.bp(jxVar9).a();
                jiVar21 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.n l = jiVar21.l();
                jxVar10 = this.f314a.c;
                boolean dM = jxVar10.dM();
                jxVar11 = this.f314a.c;
                boolean booleanValue = ((Boolean) jx.bK(jxVar11).a()).booleanValue();
                jxVar12 = this.f314a.c;
                return cd.b(crVar2, bVar4, a2, uVar, empty, nVar5, dm, agVar2, l, dM, booleanValue, ((Boolean) jx.bL(jxVar12).a()).booleanValue());
            case 138:
                hVar50 = this.b.g;
                AccountId accountId3 = (AccountId) hVar50.a();
                hVar51 = this.f314a.bq;
                com.google.apps.tiktok.account.data.a.d dVar5 = (com.google.apps.tiktok.account.data.a.d) hVar51.a();
                hVar52 = this.f314a.bN;
                com.google.apps.tiktok.account.data.b bVar5 = (com.google.apps.tiktok.account.data.b) hVar52.a();
                hVar53 = this.f314a.H;
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b(accountId3, dVar5, bVar5, (cq) hVar53.a());
            case 139:
                hVar54 = this.f314a.H;
                cq cqVar5 = (cq) hVar54.a();
                jyVar = this.f314a.f319a;
                return new bw(cqVar5, jyVar.py());
            case 140:
                hVar55 = this.f314a.f;
                Context context2 = (Context) hVar55.a();
                hVar56 = this.f314a.hP;
                e.a b = e.c.c.b(hVar56);
                hVar57 = this.f314a.H;
                cq cqVar6 = (cq) hVar57.a();
                jo joVar3 = this.f314a;
                ik ikVar5 = this.b;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.ag fg = joVar3.fg();
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.z ff = joVar3.ff();
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.e fe = joVar3.fe();
                boolean abQ = joVar3.abQ();
                boolean adh = joVar3.adh();
                boolean abR = joVar3.abR();
                boolean abS = joVar3.abS();
                jiVar22 = ikVar5.d;
                Set dC = jiVar22.dC();
                hVar58 = this.f314a.Qm;
                af afVar = (af) hVar58.a();
                jo joVar4 = this.f314a;
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.u(context2, b, cqVar6, fg, ff, fe, abQ, adh, abR, abS, dC, afVar, joVar4.hn(), joVar4.afM());
            case 141:
                hVar59 = this.f314a.acj;
                com.google.android.libraries.search.assistant.t.a.a.b bVar6 = (com.google.android.libraries.search.assistant.t.a.a.b) hVar59.a();
                hVar60 = this.f314a.f;
                Context context3 = (Context) hVar60.a();
                jxVar13 = this.f314a.c;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.b R = jxVar13.R();
                hVar61 = this.f314a.H;
                cr crVar3 = (cr) hVar61.a();
                jiVar23 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b bVar7 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b) ji.bP(jiVar23).a();
                hVar62 = this.f314a.ez;
                f fVar4 = (f) hVar62.a();
                jo joVar5 = this.f314a;
                Optional empty2 = Optional.empty();
                jxVar14 = joVar5.c;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ag agVar3 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ag) jx.bp(jxVar14).a();
                jiVar24 = this.b.d;
                Object dn = jiVar24.dn();
                jyVar2 = this.f314a.f319a;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.p aY = jyVar2.aY();
                jiVar25 = this.b.d;
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.n(bVar6, context3, R, crVar3, bVar7, fVar4, empty2, agVar3, (aj) dn, aY, jiVar25.at());
            case 142:
                hVar63 = this.b.J;
                return com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.a.b((com.google.android.libraries.search.t.a.a) hVar63.a());
            case 143:
                hVar64 = this.f314a.H;
                cr crVar4 = (cr) hVar64.a();
                jiVar26 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b bVar8 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b) ji.bP(jiVar26).a();
                hVar65 = this.f314a.wN;
                ConnectivityManager connectivityManager = (ConnectivityManager) hVar65.a();
                hVar66 = this.f314a.ez;
                f fVar5 = (f) hVar66.a();
                jiVar27 = this.b.d;
                Object a3 = ji.cv(jiVar27).a();
                jiVar28 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.u uVar2 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.u) ji.cu(jiVar28).a();
                jiVar29 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.n nVar6 = (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.n) ji.cb(jiVar29).a();
                jiVar30 = this.b.d;
                Object dm2 = jiVar30.dm();
                jiVar31 = this.b.d;
                Object m117do = jiVar31.m117do();
                jiVar32 = this.b.d;
                com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.n l2 = jiVar32.l();
                jxVar15 = this.f314a.c;
                ao aO = jxVar15.aO();
                jxVar16 = this.f314a.c;
                boolean dN = jxVar16.dN();
                jxVar17 = this.f314a.c;
                boolean booleanValue2 = ((Boolean) jx.bK(jxVar17).a()).booleanValue();
                jxVar18 = this.f314a.c;
                ao aoVar = (ao) jx.bV(jxVar18).a();
                jxVar19 = this.f314a.c;
                boolean booleanValue3 = ((Boolean) jx.bL(jxVar19).a()).booleanValue();
                jxVar20 = this.f314a.c;
                return com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.cl.c(crVar4, bVar8, connectivityManager, fVar5, a3, uVar2, nVar6, dm2, m117do, l2, aO, dN, booleanValue2, aoVar, booleanValue3, (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ag) jx.bp(jxVar20).a());
            case 144:
                jiVar33 = this.b.d;
                h bT = ji.bT(jiVar33);
                jxVar21 = this.f314a.c;
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.t(bT, jx.bv(jxVar21));
            case 145:
                izVar = this.b.b;
                e.a b2 = e.c.c.b(iz.eb(izVar));
                jiVar34 = this.b.d;
                e.a b3 = e.c.c.b(ji.cc(jiVar34));
                jeVar = this.b.c;
                com.google.apps.tiktok.cache.o oVar = (com.google.apps.tiktok.cache.o) je.eu(jeVar).a();
                ik ikVar6 = this.b;
                jo joVar6 = this.f314a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.b.b.b aM = ikVar6.aM();
                hVar67 = joVar6.P;
                n nVar7 = (n) hVar67.a();
                hVar68 = this.b.g;
                AccountId accountId4 = (AccountId) hVar68.a();
                hVar69 = this.f314a.bN;
                return new com.google.android.apps.search.assistant.surfaces.voice.l.d.a.f(b2, b3, oVar, aM, nVar7, accountId4, (com.google.apps.tiktok.account.data.b) hVar69.a());
            case 146:
                jiVar35 = this.b.d;
                boolean eb = jiVar35.eb();
                jiVar36 = this.b.d;
                boolean ec = jiVar36.ec();
                hVar70 = this.b.cQ;
                e.a b4 = e.c.c.b(hVar70);
                hVar71 = this.b.cN;
                return new com.google.android.apps.search.assistant.surfaces.voice.l.d.a.j(eb, ec, b4, e.c.c.b(hVar71));
            case 147:
                hVar72 = this.f314a.H;
                cr crVar5 = (cr) hVar72.a();
                hVar73 = this.b.g;
                AccountId accountId5 = (AccountId) hVar73.a();
                hVar74 = this.f314a.f;
                return new com.google.android.libraries.search.assistant.serviceengine.discovery.c.h(crVar5, accountId5, (Context) hVar74.a(), jx.fZ());
            case 148:
                jiVar37 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.j.g gVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.j.g) ji.cz(jiVar37).a();
                jiVar38 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.n.c.a.a aVar4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.n.c.a.a) ji.cA(jiVar38).a();
                jiVar39 = this.b.d;
                nz nzVar = (nz) ji.cr(jiVar39).a();
                jiVar40 = this.b.d;
                be F = jiVar40.F();
                jiVar41 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.o.s sVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.o.s) ji.ch(jiVar41).a();
                jiVar42 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.q.m G = jiVar42.G();
                jxVar22 = this.f314a.c;
                long m2 = jxVar22.m();
                hVar75 = this.f314a.H;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.i.b(gVar2, aVar4, nzVar, F, sVar, G, m2, (Executor) hVar75.a());
            case 149:
                mq mqVar = new mq(this.f314a, this.b);
                hVar76 = this.f314a.Q;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.j.g(mqVar, (ag) hVar76.a());
            case 150:
                jiVar43 = this.b.d;
                com.google.frameworks.client.data.android.b.k kVar2 = (com.google.frameworks.client.data.android.b.k) ji.cH(jiVar43).a();
                ik ikVar7 = this.b;
                URI b5 = com.google.android.apps.search.assistant.surfaces.dictation.service.n.a.a.b();
                jiVar44 = ikVar7.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.n.c.a.a(kVar2, b5, jiVar44.C());
            case 151:
                return new com.google.frameworks.client.data.android.b.k();
            case 152:
                return new nz(this);
            case 153:
                hVar77 = this.f314a.f;
                Context context4 = (Context) hVar77.a();
                jiVar45 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e eVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e) ji.cB(jiVar45).a();
                hVar78 = this.b.em;
                v vVar = (v) hVar78.a();
                jxVar23 = this.f314a.c;
                com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c cVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c) jx.cq(jxVar23).a();
                jiVar46 = this.b.d;
                ?? dp = jiVar46.dp();
                jxVar24 = this.f314a.c;
                Optional of = Optional.of(jxVar24.X());
                jiVar47 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.as eN = jiVar47.eN();
                jiVar48 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.a.j q = jiVar48.q();
                jiVar49 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.a.i iVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.a.i) ji.bR(jiVar49).a();
                jiVar50 = this.b.d;
                lt ltVar = (lt) ji.cp(jiVar50).a();
                jiVar51 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.aa.y yVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.aa.y) ji.bQ(jiVar51).a();
                jiVar52 = this.b.d;
                lt ltVar2 = (lt) ji.cq(jiVar52).a();
                jiVar53 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.x.v vVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.x.v) ji.cV(jiVar53).a();
                jiVar54 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.a.x r = jiVar54.r();
                jiVar55 = this.b.d;
                bq bqVar = (bq) ji.bS(jiVar55).a();
                jxVar25 = this.f314a.c;
                com.google.android.apps.search.assistant.surfaces.dictation.service.e.c W = jxVar25.W();
                hVar79 = this.f314a.hT;
                AccessibilityManager accessibilityManager = (AccessibilityManager) hVar79.a();
                jiVar56 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.p pVar3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.r.p) ji.ci(jiVar56).a();
                jiVar57 = this.b.d;
                lt ltVar3 = (lt) ji.cj(jiVar57).a();
                jiVar58 = this.b.d;
                lt ltVar4 = (lt) ji.ck(jiVar58).a();
                jiVar59 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.q.s sVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.q.s) ji.cC(jiVar59).a();
                jiVar60 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.q.y H2 = jiVar60.H();
                jiVar61 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.z N = jiVar61.N();
                jiVar62 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.s.a aVar5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.s.a) ji.cF(jiVar62).a();
                jiVar63 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.b L2 = jiVar63.L();
                izVar2 = this.b.b;
                com.google.android.apps.search.assistant.libraries.dictation.f.a aVar6 = (com.google.android.apps.search.assistant.libraries.dictation.f.a) iz.ee(izVar2).a();
                jiVar64 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.ad.f fVar6 = (com.google.android.apps.search.assistant.surfaces.dictation.service.ad.f) ji.cG(jiVar64).a();
                jiVar65 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.g gVar3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.g) ji.cD(jiVar65).a();
                hVar80 = this.f314a.Q;
                ag agVar4 = (ag) hVar80.a();
                jxVar26 = this.f314a.c;
                boolean fK = jxVar26.fK();
                jxVar27 = this.f314a.c;
                boolean fL = jxVar27.fL();
                jxVar28 = this.f314a.c;
                boolean fM = jxVar28.fM();
                jxVar29 = this.f314a.c;
                long g = jxVar29.g();
                jxVar30 = this.f314a.c;
                long h = jxVar30.h();
                jxVar31 = this.f314a.c;
                boolean fN = jxVar31.fN();
                jxVar32 = this.f314a.c;
                boolean fO = jxVar32.fO();
                jxVar33 = this.f314a.c;
                boolean fP = jxVar33.fP();
                jxVar34 = this.f314a.c;
                long i2 = jxVar34.i();
                jxVar35 = this.f314a.c;
                boolean fQ = jxVar35.fQ();
                hVar81 = this.f314a.jn;
                com.google.android.libraries.assistant.c.b.a.a.a aVar7 = (com.google.android.libraries.assistant.c.b.a.a.a) hVar81.a();
                jxVar36 = this.f314a.c;
                boolean fR = jxVar36.fR();
                jxVar37 = this.f314a.c;
                boolean dX = jxVar37.dX();
                jxVar38 = this.f314a.c;
                boolean fS = jxVar38.fS();
                jxVar39 = this.f314a.c;
                jxVar39.f();
                hVar82 = this.b.aj;
                com.google.android.apps.search.assistant.platform.g.g.b.c cVar3 = (com.google.android.apps.search.assistant.platform.g.g.b.c) hVar82.a();
                jiVar66 = this.b.d;
                Set dE = jiVar66.dE();
                jxVar40 = this.f314a.c;
                boolean fT = jxVar40.fT();
                jxVar41 = this.f314a.c;
                long j2 = jxVar41.j();
                jxVar42 = this.f314a.c;
                long k = jxVar42.k();
                jiVar67 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.o.s(context4, eVar2, vVar, cVar2, (com.google.android.apps.search.assistant.surfaces.dictation.service.f.a) dp, of, eN, q, iVar, ltVar, yVar, ltVar2, vVar2, r, bqVar, W, accessibilityManager, pVar3, ltVar3, ltVar4, sVar2, H2, N, aVar5, L2, aVar6, fVar6, gVar3, agVar4, fK, fL, fM, g, h, fN, fO, fP, i2, fQ, aVar7, fR, dX, fS, cVar3, dE, fT, j2, k, jiVar67.E());
            case 154:
                hVar83 = this.f314a.ez;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e((f) hVar83.a());
            case 155:
                hVar84 = this.f314a.f;
                Context context5 = (Context) hVar84.a();
                hVar85 = this.f314a.R;
                n nVar8 = (n) hVar85.a();
                jxVar43 = this.f314a.c;
                long u = jxVar43.u();
                jxVar44 = this.f314a.c;
                return new bq(context5, nVar8, u, jxVar44.y());
            case 156:
                jiVar68 = this.b.d;
                bq bqVar2 = (bq) ji.bS(jiVar68).a();
                jiVar69 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.ad O = jiVar69.O();
                jiVar70 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.as eN2 = jiVar70.eN();
                jiVar71 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.z N2 = jiVar71.N();
                jiVar72 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.ad.f fVar7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.ad.f) ji.cG(jiVar72).a();
                jiVar73 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.b L3 = jiVar73.L();
                jxVar45 = this.f314a.c;
                boolean dX2 = jxVar45.dX();
                jxVar46 = this.f314a.c;
                long F2 = jxVar46.F();
                jxVar47 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.s.a(bqVar2, O, eN2, N2, fVar7, L3, dX2, F2, jxVar47.ea());
            case 157:
                jiVar74 = this.b.d;
                cg cgVar = (cg) ji.cM(jiVar74).a();
                hVar86 = this.f314a.Q;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.ad.f(cgVar, (ag) hVar86.a());
            case 158:
                ik ikVar8 = this.b;
                jo joVar7 = this.f314a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.assistant.surfaces.dictation.service.ad.p.c();
                com.google.apps.tiktok.account.d.b.f kf = ikVar8.kf();
                hVar87 = joVar7.w;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.ad.p.b(c, kf, (com.google.android.libraries.storage.a.j) hVar87.a());
            case 159:
                hVar88 = this.f314a.H;
                cr crVar6 = (cr) hVar88.a();
                hVar89 = this.f314a.v;
                Executor executor4 = (Executor) hVar89.a();
                jiVar75 = this.b.d;
                lt ltVar5 = (lt) ji.co(jiVar75).a();
                jiVar76 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.b L4 = jiVar76.L();
                jiVar77 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.j jVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.r.j) ji.cf(jiVar77).a();
                jxVar48 = this.f314a.c;
                ao aF = jxVar48.aF();
                jxVar49 = this.f314a.c;
                ao aG = jxVar49.aG();
                jxVar50 = this.f314a.c;
                boolean eW = jxVar50.eW();
                jxVar51 = this.f314a.c;
                boolean fe2 = jxVar51.fe();
                jxVar52 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.a.i(crVar6, executor4, ltVar5, L4, jVar, aF, aG, eW, fe2, jxVar52.b());
            case 160:
                return new lt(this);
            case 161:
                hVar90 = this.f314a.Q;
                ag agVar5 = (ag) hVar90.a();
                jxVar53 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.a.q(agVar5, jxVar53.aT());
            case 162:
                return new bt();
            case 163:
                jiVar78 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.b J = jiVar78.J();
                jiVar79 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac acVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac) ji.cN(jiVar79).a();
                jiVar80 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac eL = jiVar80.eL();
                jiVar81 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.g.aw v = jiVar81.v();
                jiVar82 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.ad adVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.r.ad) ji.cE(jiVar82).a();
                jxVar54 = this.f314a.c;
                boolean ei = jxVar54.ei();
                jxVar55 = this.f314a.c;
                ao aE = jxVar55.aE();
                hVar91 = this.f314a.H;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.n(J, acVar, eL, v, adVar, ei, aE, (cr) hVar91.a());
            case 164:
                jiVar83 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac(jiVar83.J());
            case 165:
                ik ikVar9 = this.b;
                jo joVar8 = this.f314a;
                com.google.apps.tiktok.q.b.h c2 = bc.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar9.kf();
                hVar92 = joVar8.w;
                return bc.b(c2, kf2, (com.google.android.libraries.storage.a.j) hVar92.a());
            case 166:
                jiVar84 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.b J2 = jiVar84.J();
                jxVar56 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.w(J2, jxVar56.eL());
            case 167:
                return new lt(this);
            case 168:
                hVar93 = this.f314a.H;
                cr crVar7 = (cr) hVar93.a();
                jiVar85 = this.b.d;
                Optional of2 = Optional.of((com.google.android.libraries.search.ah.aq) ji.cY(jiVar85).a());
                jiVar86 = this.b.d;
                Optional of3 = Optional.of((com.google.android.libraries.search.ah.ao) ji.cW(jiVar86).a());
                jiVar87 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.s.a aVar8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.s.a) ji.cF(jiVar87).a();
                jiVar88 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.aa.y(crVar7, of2, of3, aVar8, jiVar88.Q());
            case 169:
                return bj.d(this.b.qh());
            case 170:
                return bj.b(this.b.qh());
            case 171:
                return new lt(this);
            case 172:
                hVar94 = this.f314a.f;
                Context context6 = (Context) hVar94.a();
                jiVar89 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.s.a aVar9 = (com.google.android.apps.search.assistant.surfaces.dictation.service.s.a) ji.cF(jiVar89).a();
                jiVar90 = this.b.d;
                com.google.android.libraries.speech.transcription.g.c.h hVar130 = (com.google.android.libraries.speech.transcription.g.c.h) ji.cx(jiVar90).a();
                hVar95 = this.f314a.H;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.x.v(context6, aVar9, hVar130, (cr) hVar95.a());
            case 173:
                jiVar91 = this.b.d;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.x.a.a.b((io.grpc.i) ji.bY(jiVar91).a());
            case 174:
                hVar96 = this.f314a.f;
                Context context7 = (Context) hVar96.a();
                jiVar92 = this.b.d;
                io.grpc.b.n nVar9 = (io.grpc.b.n) ji.cZ(jiVar92).a();
                hVar97 = this.f314a.H;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar97.a();
                hVar98 = this.f314a.v;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.x.a.a.c(context7, nVar9, scheduledExecutorService, (Executor) hVar98.a());
            case 175:
                hVar99 = this.f314a.f;
                Context context8 = (Context) hVar99.a();
                hVar100 = this.f314a.v;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.x.a.a.e(context8, (cq) hVar100.a());
            case 176:
                jiVar93 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac eL2 = jiVar93.eL();
                jiVar94 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.g.aw v2 = jiVar94.v();
                jiVar95 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.b J3 = jiVar95.J();
                hVar101 = this.f314a.ez;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.t(eL2, v2, J3, (f) hVar101.a());
            case 177:
                return new lt(this);
            case 178:
                hVar102 = this.f314a.f;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.p.a.b((Context) hVar102.a());
            case 179:
                return new lt(this);
            case 180:
                jiVar96 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.q.m G2 = jiVar96.G();
                hVar103 = this.f314a.wN;
                ConnectivityManager connectivityManager2 = (ConnectivityManager) hVar103.a();
                jiVar97 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.q.y H3 = jiVar97.H();
                jiVar98 = this.b.d;
                Set dE2 = jiVar98.dE();
                jiVar99 = this.b.d;
                bq bqVar3 = (bq) ji.bS(jiVar99).a();
                hVar104 = this.f314a.ez;
                f fVar8 = (f) hVar104.a();
                jiVar100 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.b L5 = jiVar100.L();
                hVar105 = this.f314a.bo;
                ag agVar6 = (ag) hVar105.a();
                jxVar57 = this.f314a.c;
                boolean fI = jxVar57.fI();
                jxVar58 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.q.s(G2, connectivityManager2, H3, dE2, bqVar3, fVar8, L5, agVar6, fI, jxVar58.f());
            case 181:
                ik ikVar10 = this.b;
                jo joVar9 = this.f314a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.apps.search.assistant.surfaces.dictation.service.q.z.c();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar10.kf();
                hVar106 = joVar9.w;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.q.z.b(c3, kf3, (com.google.android.libraries.storage.a.j) hVar106.a());
            case 182:
                jiVar101 = this.b.d;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.x.a.a.d((io.grpc.i) ji.bY(jiVar101).a());
            case 183:
                jiVar102 = this.b.d;
                ?? dl = jiVar102.dl();
                jxVar59 = this.f314a.c;
                boolean fJ = jxVar59.fJ();
                hVar107 = this.f314a.v;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.g((com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.a) dl, fJ, (cq) hVar107.a());
            case 184:
                jiVar103 = this.b.d;
                com.google.apps.tiktok.q.b.h bx = jiVar103.bx();
                ik ikVar11 = this.b;
                jo joVar10 = this.f314a;
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar11.kf();
                hVar108 = joVar10.w;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.a.d.b(bx, kf4, (com.google.android.libraries.storage.a.j) hVar108.a());
            case 185:
                return new ls();
            case 186:
                hVar109 = this.f314a.P;
                n nVar10 = (n) hVar109.a();
                hVar110 = this.f314a.Md;
                com.google.android.apps.search.assistant.surfaces.dictation.service.k.c cVar4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.k.c) hVar110.a();
                jiVar104 = this.b.d;
                com.google.android.libraries.search.assistant.az.b.a.e eVar3 = (com.google.android.libraries.search.assistant.az.b.a.e) ji.cy(jiVar104).a();
                izVar3 = this.b.b;
                com.google.android.libraries.search.assistant.az.b.a.a.a aVar10 = (com.google.android.libraries.search.assistant.az.b.a.a.a) iz.eH(izVar3).a();
                jxVar60 = this.f314a.c;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.k.e(nVar10, cVar4, eVar3, aVar10, (com.google.android.libraries.search.assistant.az.b.a.b.b) jx.cg(jxVar60).a());
            case 187:
                jxVar61 = this.f314a.c;
                com.google.android.libraries.search.assistant.az.b.a.b.b bVar9 = (com.google.android.libraries.search.assistant.az.b.a.b.b) jx.cg(jxVar61).a();
                jo joVar11 = this.f314a;
                ik ikVar12 = this.b;
                joVar11.J();
                izVar4 = ikVar12.b;
                com.google.android.libraries.search.assistant.az.b.a.a.a aVar11 = (com.google.android.libraries.search.assistant.az.b.a.a.a) iz.eH(izVar4).a();
                hVar111 = this.f314a.P;
                return new com.google.android.libraries.search.assistant.az.b.a.e(bVar9, aVar11, (n) hVar111.a());
            case 188:
                jiVar105 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.l.l lVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.l.l) ji.bV(jiVar105).a();
                jiVar106 = this.b.d;
                lt ltVar6 = (lt) ji.ct(jiVar106).a();
                jiVar107 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.l.ay ayVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.l.ay) ji.df(jiVar107).a();
                jiVar108 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.l.s A = jiVar108.A();
                jiVar109 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.g.aw v3 = jiVar109.v();
                hVar112 = this.f314a.H;
                Executor executor5 = (Executor) hVar112.a();
                izVar5 = this.b.b;
                com.google.android.apps.search.assistant.libraries.dictation.f.a aVar12 = (com.google.android.apps.search.assistant.libraries.dictation.f.a) iz.ee(izVar5).a();
                jxVar62 = this.f314a.c;
                boolean fU = jxVar62.fU();
                jiVar110 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.l.w(lVar, ltVar6, ayVar2, A, v3, executor5, aVar12, fU, jiVar110.eK());
            case 189:
                hVar113 = this.f314a.Q;
                ag agVar7 = (ag) hVar113.a();
                jiVar111 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.j.g gVar4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.j.g) ji.cz(jiVar111).a();
                jiVar112 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.b D = jiVar112.D();
                jiVar113 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e eVar4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e) ji.cB(jiVar113).a();
                jiVar114 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.o.s sVar3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.o.s) ji.ch(jiVar114).a();
                hVar114 = this.f314a.ez;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.l.l(agVar7, gVar4, D, eVar4, sVar3, (f) hVar114.a());
            case 190:
                hVar115 = this.f314a.f;
                Context context9 = (Context) hVar115.a();
                jiVar115 = this.b.d;
                io.grpc.b.n dj = jiVar115.dj();
                ik ikVar13 = this.b;
                URI b6 = com.google.android.apps.search.assistant.surfaces.dictation.service.n.a.a.b();
                jiVar116 = ikVar13.d;
                dh dhVar = (dh) ji.cH(jiVar116).a();
                hVar116 = this.f314a.H;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) hVar116.a();
                hVar117 = this.f314a.v;
                return com.google.android.apps.search.assistant.surfaces.dictation.service.n.a.a.c(context9, dj, b6, dhVar, scheduledExecutorService2, (Executor) hVar117.a());
            case 191:
                return new lt(this);
            case 192:
                jiVar117 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.l.c eJ = jiVar117.eJ();
                jiVar118 = this.b.d;
                nz nzVar2 = (nz) ji.cr(jiVar118).a();
                jiVar119 = this.b.d;
                lt ltVar7 = (lt) ji.cs(jiVar119).a();
                jxVar63 = this.f314a.c;
                com.google.android.apps.search.assistant.surfaces.dictation.service.g.af afVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.g.af) jx.bq(jxVar63).a();
                jiVar120 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.z.ah ahVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.z.ah) ji.cd(jiVar120).a();
                jiVar121 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.j jVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.r.j) ji.cf(jiVar121).a();
                jiVar122 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.a I = jiVar122.I();
                jiVar123 = this.b.d;
                com.google.android.apps.search.assistant.surfaces.dictation.service.s.a aVar13 = (com.google.android.apps.search.assistant.surfaces.dictation.service.s.a) ji.cF(jiVar123).a();
                hVar118 = this.f314a.Q;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.l.ay(eJ, nzVar2, ltVar7, afVar2, ahVar, jVar2, I, aVar13, (ag) hVar118.a());
            case 193:
                return new lt(this);
            case 194:
                return new lt(this);
            case 195:
                jxVar64 = this.f314a.c;
                ao aI = jxVar64.aI();
                jxVar65 = this.f314a.c;
                ao aJ = jxVar65.aJ();
                jxVar66 = this.f314a.c;
                ao aK = jxVar66.aK();
                hVar119 = this.f314a.hT;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.z.ah(aI, aJ, aK, (AccessibilityManager) hVar119.a());
            case 196:
                jiVar124 = this.b.d;
                return new com.google.android.libraries.speech.a.a.b(jiVar124.dD());
            case 197:
                hVar120 = this.f314a.f;
                Context context10 = (Context) hVar120.a();
                hVar121 = this.f314a.hO;
                com.google.android.libraries.search.b.b bVar10 = (com.google.android.libraries.search.b.b) hVar121.a();
                hVar122 = this.f314a.H;
                cq cqVar7 = (cq) hVar122.a();
                jjVar8 = this.b.f308a;
                hVar123 = jjVar8.gc;
                return new com.google.android.apps.gsa.nga.engine.n.d.a.k(context10, bVar10, cqVar7, (lt) hVar123.a());
            case 198:
                hVar124 = this.f314a.P;
                n nVar11 = (n) hVar124.a();
                jeVar2 = this.b.c;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.a.l(nVar11, (com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.w) je.eJ(jeVar2).a());
            case 199:
                hVar125 = this.f314a.P;
                n nVar12 = (n) hVar125.a();
                jjVar9 = this.b.f308a;
                hVar126 = jjVar9.iN;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.e.a(nVar12, hVar126);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.c;
        switch (i) {
            case 200:
                Context context = (Context) this.f314a.f.a();
                jo joVar = this.f314a;
                ik ikVar = this.b;
                joVar.f319a.Q();
                ji jiVar = ikVar.d;
                return new com.google.android.libraries.search.assistant.ai.c.a.k(context, jiVar.dw(), (lt) jiVar.bl.a(), (com.google.android.libraries.search.assistant.ai.d.a.d) this.b.d.s.a(), (ScheduledExecutorService) this.f314a.H.a(), (ag) this.f314a.Q.a(), (n) this.f314a.P.a());
            case 201:
                ik ikVar2 = this.b;
                jo joVar2 = this.f314a;
                jj jjVar = ikVar2.f308a;
                h hVar = jjVar.cb;
                h hVar2 = jjVar.fx;
                ji jiVar2 = ikVar2.d;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.d.h(hVar, hVar2, jiVar2.r, ikVar2.bn, joVar2.H, jjVar.fA, jjVar.fB, jjVar.fy, jiVar2.Y, ikVar2.cD, jjVar.x, jiVar2.Z, jiVar2.X);
            case 202:
                ik ikVar3 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.morris.d.a.n(ikVar3.d.r, ikVar3.bn, this.f314a.H);
            case 203:
                jo joVar3 = this.f314a;
                ik ikVar4 = this.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.d.a.a.d(joVar3.H, joVar3.f, ikVar4.d.r, ikVar4.bn);
            case 204:
                return new lt(this);
            case 205:
                return new lt(this);
            case 206:
                return new com.google.android.libraries.search.assistant.ai.c.a.a.j(this.b.qh(), io.grpc.h.a);
            case 207:
                return new com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.g((ExecutorService) this.f314a.H.a(), this.b.d.eI());
            case 208:
                return new com.google.android.libraries.search.assistant.ao.e.f((com.google.android.libraries.search.assistant.ao.e.d) this.b.d.bo.a(), (n) this.f314a.P.a());
            case 209:
                return new com.google.android.libraries.search.assistant.ao.e.d();
            case 210:
                return new com.google.android.libraries.search.assistant.ao.e.m((com.google.android.libraries.search.assistant.ao.e.d) this.b.d.bo.a(), (com.google.android.libraries.search.assistant.ao.e.n) this.b.d.bq.a(), (n) this.f314a.P.a(), (ag) this.f314a.Q.a());
            case 211:
                ik ikVar5 = this.b;
                return new ab(ikVar5.d.aQ(), ikVar5.iG(), ikVar5.iF(), Optional.of(this.f314a.c.au()), ((com.google.apps.tiktok.experiments.e) this.b.d.eP().a.a()).a("com.google.android.apps.search.assistant.user 45428166").f(), ((com.google.apps.tiktok.experiments.e) this.b.d.eP().a.a()).a("com.google.android.apps.search.assistant.user 45428180").f(), (ag) this.f314a.Q.a());
            case 212:
                ji jiVar3 = this.b.d;
                return new dj(jiVar3.dz(), ha.o(jiVar3.dA()), (nz) this.b.cH.a(), (n) this.f314a.P.a(), (ci) this.f314a.ft.a(), (com.google.android.libraries.search.assistant.n.b.b.c) this.b.cA.a());
            case 213:
                return new op(this.f314a.c.ap());
            case 214:
                return new op((com.google.android.libraries.search.assistant.n.a.a.b) this.b.cI.a());
            case 215:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.h.e.r((n) this.f314a.P.a(), (ag) this.f314a.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.e.h.c.h) this.b.d.bt.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.g) this.b.cP.a());
            case 216:
                com.google.android.apps.search.assistant.surfaces.voice.e.h.a aVar = (com.google.android.apps.search.assistant.surfaces.voice.e.h.a) this.b.b.at.a();
                lt ltVar = (lt) this.b.b.as.a();
                h hVar3 = this.b.cK;
                aVar.getClass();
                ltVar.getClass();
                hVar3.getClass();
                return ltVar.ai(new com.google.android.apps.search.assistant.surfaces.voice.e.h.c.b("TNG:MA-sbcp", false), hVar3, aVar);
            case 217:
                return new com.google.android.libraries.search.assistant.ac.a.a.a.i((com.google.android.libraries.search.l.p) this.b.P.a(), (com.google.android.libraries.search.l.b.f) this.f314a.vU.a(), (AccountId) this.b.g.a(), (cq) this.f314a.H.a(), (com.google.android.libraries.search.y.a.a.d) this.b.r.a());
            case 218:
                jo joVar4 = this.f314a;
                jx jxVar = joVar4.c;
                long n = jxVar.n();
                long p = jxVar.p();
                long q = jxVar.q();
                Context context2 = (Context) joVar4.f.a();
                ik ikVar6 = this.b;
                h hVar4 = ikVar6.ba;
                ji jiVar4 = ikVar6.d;
                return new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.a.m(n, p, q, context2, jiVar4.dv(), jiVar4.ac(), (com.google.android.libraries.search.b.b) hVar4.a(), (f) this.f314a.ez.a(), (cr) this.f314a.H.a());
            case 219:
                com.google.apps.tiktok.q.b.g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "FrePersistentData";
                a2.c(com.google.android.apps.search.assistant.surfaces.voice.m.b.a.g.a);
                return this.b.kf().a(a2.a(), (com.google.android.libraries.storage.a.j) this.f314a.w.a());
            case 220:
                ik ikVar7 = this.b;
                return new com.google.android.apps.search.assistant.verticals.automation.routines.i.a.i(ikVar7.f308a.bs(), (AccountId) ikVar7.g.a(), (com.google.apps.tiktok.account.data.b) this.f314a.bN.a(), (ax) this.f314a.iv.a(), (com.google.android.apps.search.assistant.verticals.automation.routines.d.a.b) this.f314a.c.ao.a(), this.b.d.ao(), (Executor) this.f314a.H.a());
            case 221:
                lt ltVar2 = (lt) this.b.d.bE.a();
                ik ikVar8 = this.b;
                h hVar5 = this.f314a.c.aq;
                com.google.android.libraries.search.ah.b.b.c bu = ikVar8.d.bu();
                com.google.android.libraries.search.ah.l.c cVar = (com.google.android.libraries.search.ah.l.c) hVar5.a();
                com.google.android.libraries.search.ah.b.d.a aVar2 = (com.google.android.libraries.search.ah.b.d.a) this.b.dk.a();
                jx jxVar2 = this.f314a.c;
                jo joVar5 = jxVar2.f325a;
                return ltVar2.O(bu, cVar, aVar2, new com.google.android.libraries.search.ah.h.a.g(jxVar2.al(), aVar2), Optional.of(((lt) joVar5.mi.a()).E(new com.google.android.libraries.assistant.soda.c.a.b(1))));
            case 222:
                return new lt(this);
            case 223:
                return new lt(this);
            case 224:
                bn q2 = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(this.b.V, (com.google.apps.tiktok.p.m) this.f314a.mg.a(), (com.google.apps.tiktok.p.u) this.f314a.mh.a(), (com.google.frameworks.client.data.android.d) this.f314a.mb.a(), com.google.common.base.a.a);
                q2.getClass();
                return q2;
            case 225:
                return new com.google.android.libraries.search.ah.c.a.c();
            case 226:
                return new lt(this);
            case 227:
                return new lt(this);
            case 228:
                bn q3 = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(this.b.V, (com.google.apps.tiktok.p.m) this.f314a.c.L.a(), (com.google.apps.tiktok.p.u) this.f314a.mh.a(), (com.google.frameworks.client.data.android.d) this.f314a.mb.a(), com.google.common.base.a.a);
                q3.getClass();
                return q3;
            case 229:
                return new lt(this);
            case 230:
                return new ck((com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.u) this.b.f308a.bt.a(), (cr) this.f314a.H.a());
            case 231:
                je jeVar = this.b.c;
                return new com.google.android.libraries.search.assistant.az.c.bg(jeVar.ch(), (com.google.android.libraries.search.assistant.az.c.d) jeVar.E.a(), (Executor) this.f314a.H.a());
            case 232:
                n nVar = (n) this.f314a.P.a();
                ik ikVar9 = this.b;
                ji jiVar5 = ikVar9.d;
                com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.c.a.g av = ikVar9.f308a.av();
                jiVar5.eH();
                com.google.android.apps.search.assistant.platform.g.q.b bVar = (com.google.android.apps.search.assistant.platform.g.q.b) this.b.b.J.a();
                ik ikVar10 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.oobe.c.d(nVar, av, bVar, ikVar10.d.ab(), new com.google.android.libraries.search.assistant.spokennotifications.autoread.o(ikVar10.f308a.qy()));
            case 233:
                lt ltVar3 = (lt) this.b.d.e.a();
                com.google.android.libraries.search.assistant.invocation.k.a.d dVar = (com.google.android.libraries.search.assistant.invocation.k.a.d) this.f314a.tA.a();
                ltVar3.getClass();
                dVar.getClass();
                return new com.google.android.libraries.search.assistant.invocation.k.b.b.a(ltVar3, dVar);
            case 234:
                lt ltVar4 = (lt) this.b.d.bE.a();
                ik ikVar11 = this.b;
                h hVar6 = this.f314a.c.ar;
                com.google.android.libraries.search.ah.b.b.b bt = ikVar11.d.bt();
                com.google.android.libraries.search.ah.l.c cVar2 = (com.google.android.libraries.search.ah.l.c) hVar6.a();
                com.google.android.libraries.search.ah.b.d.a aVar3 = (com.google.android.libraries.search.ah.b.d.a) this.b.dl.a();
                jx jxVar3 = this.f314a.c;
                return ltVar4.O(bt, cVar2, aVar3, new com.google.android.libraries.search.ah.h.a.g(jxVar3.al(), aVar3), Optional.of(jxVar3.am()));
            case 235:
                return new com.google.android.apps.search.assistant.surfaces.voice.t.v((lt) this.b.d.bV.a(), this.b.b.cF());
            case 236:
                return new lt(this);
            case 237:
                ik ikVar12 = this.b;
                jj jjVar2 = ikVar12.f308a;
                com.google.android.libraries.search.assistant.n.a.b.bw hQ = ikVar12.hQ();
                com.google.android.libraries.search.assistant.p.a.c.j jVar = new com.google.android.libraries.search.assistant.p.a.c.j((com.google.android.libraries.search.assistant.p.a.c.u) jjVar2.me());
                lt ltVar5 = (lt) this.b.d.bT.a();
                Executor executor = (Executor) this.b.d.bL.a();
                ag agVar = (ag) this.f314a.Q.a();
                ji jiVar6 = this.b.d;
                h hVar7 = jiVar6.P;
                boolean ee = jiVar6.ee();
                boolean eg = jiVar6.eg();
                h hVar8 = jiVar6.bQ;
                lt ltVar6 = (lt) hVar7.a();
                ji jiVar7 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.voice.t.e(hQ, jVar, ltVar5, executor, agVar, ee, eg, hVar8, ltVar6, jiVar7.ah(), jiVar7.eh(), jiVar7.ei(), jiVar7.ej(), jiVar7.dr(), jiVar7.ds(), jiVar7.ek(), jiVar7.el());
            case 238:
                return new lt(this);
            case 239:
                return new lt(this);
            case 240:
                return new db((Executor) this.f314a.H.a());
            case 241:
                return new lt(this);
            case 242:
                return new lt(this);
            case 243:
                return new com.google.android.libraries.assistant.c.f.a.s((com.google.android.libraries.assistant.c.f.b.j) this.b.d.bN.a(), (lt) this.b.d.bP.a(), (ag) this.f314a.Q.a(), (Executor) this.f314a.H.a(), (f) this.f314a.ez.a());
            case 244:
                com.google.android.libraries.assistant.c.f.b.j g = io.grpc.j.c.g(new com.google.android.libraries.assistant.c.f.b.h(0), this.b.qh(), io.grpc.h.a);
                g.getClass();
                return g;
            case 245:
                return new lt(this);
            case 246:
                com.google.android.libraries.assistant.c.f.b.l d = io.grpc.j.a.d(new com.google.android.libraries.assistant.c.f.b.h(1), this.b.qh(), io.grpc.h.a);
                d.getClass();
                return d;
            case 247:
                return new com.google.android.apps.search.assistant.platform.i.b();
            case 248:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45477226").d();
            case 249:
                ik ikVar13 = this.b;
                com.google.android.libraries.search.ah.aq b = this.f314a.b.hB() ? com.google.android.libraries.search.ah.ar.b(ikVar13.qh()) : com.google.android.libraries.search.ah.ar.b(ikVar13.qg());
                b.getClass();
                return b;
            case 250:
                return new com.google.android.libraries.search.assistant.aa.f.a.t(this.b.qh(), (cq) this.f314a.H.a());
            case 251:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45385542").b());
            case 252:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.d.eQ().a.a()).a("com.google.android.apps.search.assistant.user 45407048").f());
            case 253:
                return Boolean.valueOf(this.b.d.eQ().b());
            case 254:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45357004").f());
            case 255:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45407264").d();
            case 256:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45381171").f());
            case 257:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45408104").f());
            case 258:
                return new com.google.android.libraries.search.assistant.ah.b.l((Context) this.f314a.f.a(), (n) this.f314a.R.a(), this.b.d.Q);
            case 259:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45384935").f());
            case 260:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45390390").f());
            case 261:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45429288").f());
            case 262:
                return new com.google.android.libraries.search.assistant.ah.b.v((com.google.apps.tiktok.p.b) this.f314a.b.gQ.a(), (String) this.f314a.b.gP.a(), ((Long) this.b.b.bA.a()).longValue(), this.f314a.c.fW(), (AccountId) this.b.g.a(), (com.google.apps.tiktok.account.data.b) this.f314a.bN.a(), Optional.of(this.b.d.aM()));
            case 263:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45545651").f());
            case 264:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45364738").f());
            case 265:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45373436").b());
            case 266:
                return new lt(this);
            case 267:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45398469").f());
            case 268:
                return Boolean.valueOf(new h.a.a.f.b.a.k(this.b.l).g());
            case 269:
                ik ikVar14 = this.b;
                jo joVar6 = this.f314a;
                ji jiVar8 = ikVar14.d;
                bn b2 = com.google.android.apps.search.assistant.platform.d.b.c.c.b(jiVar8.ct, jiVar8.cu, (Context) joVar6.f.a(), this.b.d.ey(), this.f314a.c.dH());
                b2.getClass();
                return b2;
            case 270:
                bn q4 = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(this.b.V, (com.google.apps.tiktok.p.m) this.f314a.c.ce.a(), (com.google.apps.tiktok.p.u) this.f314a.mh.a(), (com.google.frameworks.client.data.android.d) this.f314a.mb.a(), com.google.common.base.a.a);
                q4.getClass();
                return q4;
            case 271:
                bn q5 = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(this.b.V, (com.google.apps.tiktok.p.m) this.f314a.c.cf.a(), (com.google.apps.tiktok.p.u) this.f314a.mh.a(), (com.google.frameworks.client.data.android.d) this.f314a.mb.a(), com.google.common.base.a.a);
                q5.getClass();
                return q5;
            case 272:
                return new lt(this);
            case 273:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45381822").f());
            case 274:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45476028").f());
            case 275:
                return new com.google.android.apps.search.assistant.platform.e.j.e.a.a.a((Context) this.f314a.f.a(), this.b.d.eA());
            case 276:
                return Boolean.valueOf(new h.a.a.f.b.a.k(this.b.l).f());
            case 277:
                return new com.google.android.apps.search.assistant.platform.appintegration.e.f.b();
            case 278:
                return new com.google.android.apps.search.assistant.platform.appintegration.performers.f.a((Context) this.f314a.f.a());
            case 279:
                return new com.google.android.apps.search.assistant.platform.appintegration.performers.e.a((lt) this.b.f308a.gb.a());
            case 280:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.j.ab();
            case 281:
                com.google.apps.tiktok.q.b.g a3 = com.google.apps.tiktok.q.b.h.a();
                a3.f5883a = "DictationEduProto";
                a3.c(com.google.android.apps.search.assistant.surfaces.dictation.service.p.m.a);
                return this.b.kf().a(a3.a(), (com.google.android.libraries.storage.a.j) this.f314a.w.a());
            case 282:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.ad.o((cg) this.b.d.cI.a(), (ag) this.f314a.Q.a());
            case 283:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "MultilangLanguageRevertHistory";
                a4.c(com.google.android.apps.search.assistant.surfaces.dictation.service.ad.g.a);
                return this.b.kf().a(a4.a(), (com.google.android.libraries.storage.a.j) this.f314a.w.a());
            case 284:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.g.af((byte[]) null);
            case 285:
                jo joVar7 = this.f314a;
                ji jiVar9 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.u(joVar7.c.aR(), jiVar9.M(), jiVar9.x(), (cr) joVar7.H.a());
            case 286:
                ji jiVar10 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.ab.b(jiVar10.R(), jiVar10.M());
            case 287:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.d();
            case 288:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.k(new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.f(this.b.d.z()), (com.google.android.apps.search.assistant.surfaces.dictation.service.r.j) this.b.d.aI.a(), this.f314a.c.dO());
            case 289:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.o(new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.h(this.b.d.z()));
            case 290:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.s(new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.j(this.b.d.z()), this.f314a.c.dP());
            case 291:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.v();
            case 292:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.y();
            case 293:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.aa();
            case 294:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.ae();
            case 295:
                ji jiVar11 = this.b.d;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.d(jiVar11.M(), jiVar11.y(), (com.google.android.apps.search.assistant.surfaces.dictation.service.r.j) jiVar11.aI.a(), (cr) this.f314a.H.a());
            case 296:
                return new lt(this);
            case 297:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.t.a.g((ag) this.f314a.Q.a(), this.f314a.c.aS());
            case 298:
                return new ls();
            case 299:
                return new lt(this);
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        com.google.android.libraries.search.assistant.aq.o.e jVar;
        int i = this.c;
        int i2 = i / 100;
        if (i2 == 0) {
            return b();
        }
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return d();
        }
        switch (i) {
            case 300:
                jVar = new com.google.android.apps.search.assistant.surfaces.dictation.service.h.a.j(this.b.d.cW);
                break;
            case 301:
                jVar = new lt(this);
                break;
            case 302:
                jVar = new lt(this);
                break;
            case 303:
                jVar = new lt(this);
                break;
            case 304:
                jVar = new jf(this);
                break;
            case 305:
                jVar = new bf();
                break;
            case 306:
                jVar = new lt(this);
                break;
            case 307:
                jVar = new jg(this, 1);
                break;
            case 308:
                jVar = new jg(this, 0);
                break;
            case 309:
                jVar = new com.google.android.apps.search.assistant.surfaces.dictation.service.aa.b();
                break;
            case 310:
                Optional of = Optional.of((com.google.android.libraries.search.ah.aq) this.b.d.aM.a());
                ji jiVar = this.b.d;
                Map dt = jiVar.dt();
                Map dy = jiVar.dy();
                jiVar.Q();
                com.google.android.apps.search.assistant.surfaces.dictation.service.aa.y yVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.aa.y) jiVar.aN.a();
                com.google.android.apps.search.assistant.surfaces.dictation.service.y.a.c cVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.y.a.c) this.f314a.c.an.a();
                cq cqVar = (cq) this.f314a.v.a();
                cr crVar = (cr) this.f314a.H.a();
                jx jxVar = this.f314a.c;
                jVar = new com.google.android.apps.search.assistant.surfaces.dictation.service.aa.s(of, dt, dy, yVar, cVar, cqVar, crVar, jxVar.bg(), jxVar.eq(), jxVar.ei(), jxVar.eA());
                break;
            case 311:
                jVar = new lt(this);
                break;
            case 312:
                jVar = new jg(this, 2);
                break;
            case 313:
                jVar = new lt(this);
                break;
            case 314:
                jVar = new lt(this);
                break;
            case 315:
                jVar = new jg(this, 3);
                break;
            case 316:
                jVar = new com.google.android.apps.search.assistant.surfaces.dictation.service.x.c();
                break;
            case 317:
                com.google.android.libraries.speech.transcription.g.c.i iVar = (com.google.android.libraries.speech.transcription.g.c.i) this.b.d.aT.a();
                com.google.android.apps.search.assistant.surfaces.dictation.service.x.v vVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.x.v) this.b.d.aP.a();
                com.google.android.apps.search.assistant.surfaces.dictation.service.y.a.c cVar2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.y.a.c) this.f314a.c.an.a();
                ji jiVar2 = this.b.d;
                h hVar = jiVar2.aV;
                Map dt2 = jiVar2.dt();
                Map dy2 = jiVar2.dy();
                com.google.android.apps.search.assistant.surfaces.dictation.service.v.a.h hVar2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.v.a.h((com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.g) hVar.a(), ((com.google.apps.tiktok.experiments.e) jiVar2.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45639495").f(), ((com.google.apps.tiktok.experiments.e) jiVar2.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45639496").f());
                com.google.android.apps.search.assistant.surfaces.dictation.service.r.ad adVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.r.ad) this.b.d.aH.a();
                cq cqVar2 = (cq) this.f314a.v.a();
                cr crVar2 = (cr) this.f314a.H.a();
                jx jxVar2 = this.f314a.c;
                jVar = new com.google.android.apps.search.assistant.surfaces.dictation.service.x.r(iVar, vVar, cVar2, dt2, dy2, hVar2, adVar, cqVar2, crVar2, jxVar2.bg(), jxVar2.eq(), jxVar2.ei(), jxVar2.eA(), ((com.google.apps.tiktok.experiments.e) jxVar2.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45656211").b());
                break;
            case 318:
                jVar = new bf((byte[]) null);
                break;
            case 319:
                jVar = new db((Executor) this.f314a.H.a());
                break;
            case 320:
                jVar = ((com.google.android.libraries.search.assistant.aq.o.e) this.b.f308a.fR.a()).b();
                break;
            default:
                throw new AssertionError(i);
        }
        return jVar;
    }
}
