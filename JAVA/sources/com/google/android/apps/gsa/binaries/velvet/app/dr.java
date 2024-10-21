package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.util.LongSparseArray;
import com.google.android.apps.gsa.assistant.shared.ab;
import com.google.android.apps.gsa.binaries.velvet.app.au;
import com.google.android.apps.gsa.binaries.velvet.app.aw;
import com.google.android.apps.gsa.binaries.velvet.app.cl;
import com.google.android.apps.gsa.binaries.velvet.app.jo;
import com.google.android.apps.gsa.binaries.velvet.app.mq;
import com.google.android.apps.gsa.handsfree.MessageBuffer;
import com.google.android.apps.gsa.search.core.ac.t;
import com.google.android.apps.gsa.search.core.ae.aq.b.ao;
import com.google.android.apps.gsa.search.core.ae.aq.f;
import com.google.android.apps.gsa.search.core.as;
import com.google.android.apps.gsa.search.core.google.a.ac;
import com.google.android.apps.gsa.search.core.google.am;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.h.s;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.search.core.service.a.a.e;
import com.google.android.apps.gsa.search.core.service.af;
import com.google.android.apps.gsa.search.core.service.aj;
import com.google.android.apps.gsa.search.core.service.ak;
import com.google.android.apps.gsa.search.core.service.az;
import com.google.android.apps.gsa.search.core.service.c.b;
import com.google.android.apps.gsa.search.core.service.d.j;
import com.google.android.apps.gsa.search.core.service.e.a.k;
import com.google.android.apps.gsa.search.core.service.f.a.g;
import com.google.android.apps.gsa.search.core.service.f.a.i;
import com.google.android.apps.gsa.search.core.state.TtsState;
import com.google.android.apps.gsa.search.core.state.ae;
import com.google.android.apps.gsa.search.core.state.ah;
import com.google.android.apps.gsa.search.core.state.ai;
import com.google.android.apps.gsa.search.core.state.al;
import com.google.android.apps.gsa.search.core.state.ay;
import com.google.android.apps.gsa.search.core.state.ba;
import com.google.android.apps.gsa.search.core.state.bf;
import com.google.android.apps.gsa.search.core.state.bk;
import com.google.android.apps.gsa.search.core.state.bl;
import com.google.android.apps.gsa.search.core.state.bm;
import com.google.android.apps.gsa.search.core.state.bn;
import com.google.android.apps.gsa.search.core.state.bq;
import com.google.android.apps.gsa.search.core.state.bs;
import com.google.android.apps.gsa.search.core.state.bt;
import com.google.android.apps.gsa.search.core.state.bx;
import com.google.android.apps.gsa.search.core.state.by;
import com.google.android.apps.gsa.search.core.state.bz;
import com.google.android.apps.gsa.search.core.state.cf;
import com.google.android.apps.gsa.search.core.state.cg;
import com.google.android.apps.gsa.search.core.state.ch;
import com.google.android.apps.gsa.search.core.state.ci;
import com.google.android.apps.gsa.search.core.state.cp;
import com.google.android.apps.gsa.search.core.state.cu;
import com.google.android.apps.gsa.search.core.state.cx;
import com.google.android.apps.gsa.search.core.state.d.ag;
import com.google.android.apps.gsa.search.core.state.d.r;
import com.google.android.apps.gsa.search.core.state.l;
import com.google.android.apps.gsa.search.core.state.u;
import com.google.android.apps.gsa.shared.k.bo;
import com.google.android.apps.gsa.shared.k.cz;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.c.a.q;
import com.google.android.apps.gsa.shared.util.c.a.x;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.apps.gsa.staticplugins.accl.c.z;
import com.google.android.apps.gsa.staticplugins.f.v;
import com.google.android.apps.gsa.staticplugins.l.o;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.apps.gsa.staticplugins.nga.s.a.bh;
import com.google.android.apps.gsa.staticplugins.nga.u.ax;
import com.google.android.apps.gsa.staticplugins.nga.u.bc;
import com.google.android.apps.gsa.staticplugins.nga.u.bp;
import com.google.android.apps.gsa.staticplugins.opa.br.ap;
import com.google.android.apps.gsa.staticplugins.opa.fv;
import com.google.android.apps.gsa.staticplugins.opa.gf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.TapasJni;
import com.google.android.apps.gsa.staticplugins.opa.util.ad;
import com.google.android.apps.gsa.staticplugins.opa.util.br;
import com.google.android.apps.gsa.tasks.m;
import com.google.android.apps.search.assistant.platform.pcp.j.ar;
import com.google.android.libraries.search.assistant.proactive.aq;
import com.google.android.libraries.search.assistant.proactive.ce;
import com.google.android.libraries.search.assistant.proactive.y;
import com.google.android.libraries.search.l.aa;
import com.google.android.libraries.web.o.w;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.base.ca;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import e.a;
import e.c.c;
import e.c.h;
import j$.util.Optional;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/dr.class */
public final class dr implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f297a;
    public final ds b;
    private final int c;

    public dr(jo joVar, ds dsVar, int i) {
        this.f297a = joVar;
        this.b = dsVar;
        this.c = i;
    }

    private final Object b() {
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
        jy jyVar;
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
        jy jyVar2;
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
        jy jyVar3;
        h hVar85;
        h hVar86;
        h hVar87;
        jy jyVar4;
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
        h hVar112;
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
        jy jyVar5;
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
        jy jyVar6;
        h hVar178;
        h hVar179;
        h hVar180;
        h hVar181;
        jy jyVar7;
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
        jy jyVar8;
        h hVar201;
        jy jyVar9;
        h hVar202;
        jy jyVar10;
        h hVar203;
        h hVar204;
        h hVar205;
        h hVar206;
        jy jyVar11;
        h hVar207;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        h hVar212;
        h hVar213;
        jy jyVar12;
        h hVar214;
        jy jyVar13;
        h hVar215;
        h hVar216;
        h hVar217;
        h hVar218;
        h hVar219;
        h hVar220;
        h hVar221;
        jy jyVar14;
        h hVar222;
        jy jyVar15;
        h hVar223;
        jy jyVar16;
        h hVar224;
        h hVar225;
        h hVar226;
        h hVar227;
        h hVar228;
        h hVar229;
        h hVar230;
        h hVar231;
        h hVar232;
        h hVar233;
        h hVar234;
        jy jyVar17;
        h hVar235;
        h hVar236;
        h hVar237;
        h hVar238;
        h hVar239;
        h hVar240;
        h hVar241;
        h hVar242;
        h hVar243;
        h hVar244;
        h hVar245;
        h hVar246;
        h hVar247;
        h hVar248;
        h hVar249;
        h hVar250;
        h hVar251;
        h hVar252;
        h hVar253;
        h hVar254;
        h hVar255;
        h hVar256;
        h hVar257;
        h hVar258;
        h hVar259;
        h hVar260;
        h hVar261;
        h hVar262;
        h hVar263;
        h hVar264;
        h hVar265;
        h hVar266;
        h hVar267;
        h hVar268;
        h hVar269;
        h hVar270;
        h hVar271;
        h hVar272;
        h hVar273;
        h hVar274;
        h hVar275;
        h hVar276;
        h hVar277;
        h hVar278;
        h hVar279;
        h hVar280;
        h hVar281;
        h hVar282;
        h hVar283;
        h hVar284;
        h hVar285;
        h hVar286;
        h hVar287;
        h hVar288;
        h hVar289;
        h hVar290;
        h hVar291;
        h hVar292;
        h hVar293;
        h hVar294;
        h hVar295;
        h hVar296;
        h hVar297;
        h hVar298;
        h hVar299;
        h hVar300;
        h hVar301;
        h hVar302;
        h hVar303;
        h hVar304;
        h hVar305;
        h hVar306;
        h hVar307;
        h hVar308;
        h hVar309;
        h hVar310;
        h hVar311;
        h hVar312;
        h hVar313;
        h hVar314;
        h hVar315;
        h hVar316;
        h hVar317;
        h hVar318;
        h hVar319;
        h hVar320;
        h hVar321;
        h hVar322;
        h hVar323;
        h hVar324;
        h hVar325;
        h hVar326;
        h hVar327;
        h hVar328;
        h hVar329;
        h hVar330;
        h hVar331;
        h hVar332;
        h hVar333;
        h hVar334;
        h hVar335;
        h hVar336;
        h hVar337;
        h hVar338;
        h hVar339;
        h hVar340;
        h hVar341;
        h hVar342;
        h hVar343;
        h hVar344;
        h hVar345;
        h hVar346;
        h hVar347;
        h hVar348;
        h hVar349;
        h hVar350;
        h hVar351;
        h hVar352;
        h hVar353;
        h hVar354;
        h hVar355;
        h hVar356;
        h hVar357;
        h hVar358;
        h hVar359;
        h hVar360;
        h hVar361;
        h hVar362;
        h hVar363;
        h hVar364;
        h hVar365;
        h hVar366;
        h hVar367;
        h hVar368;
        h hVar369;
        h hVar370;
        h hVar371;
        h hVar372;
        h hVar373;
        h hVar374;
        h hVar375;
        h hVar376;
        h hVar377;
        h hVar378;
        h hVar379;
        h hVar380;
        h hVar381;
        h hVar382;
        h hVar383;
        h hVar384;
        h hVar385;
        h hVar386;
        h hVar387;
        h hVar388;
        h hVar389;
        h hVar390;
        h hVar391;
        h hVar392;
        h hVar393;
        h hVar394;
        h hVar395;
        h hVar396;
        h hVar397;
        h hVar398;
        h hVar399;
        h hVar400;
        h hVar401;
        h hVar402;
        h hVar403;
        h hVar404;
        h hVar405;
        h hVar406;
        h hVar407;
        h hVar408;
        h hVar409;
        h hVar410;
        h hVar411;
        h hVar412;
        h hVar413;
        h hVar414;
        h hVar415;
        h hVar416;
        h hVar417;
        h hVar418;
        h hVar419;
        h hVar420;
        h hVar421;
        h hVar422;
        h hVar423;
        h hVar424;
        h hVar425;
        h hVar426;
        h hVar427;
        h hVar428;
        h hVar429;
        h hVar430;
        h hVar431;
        h hVar432;
        h hVar433;
        h hVar434;
        h hVar435;
        h hVar436;
        h hVar437;
        h hVar438;
        h hVar439;
        h hVar440;
        h hVar441;
        h hVar442;
        h hVar443;
        h hVar444;
        h hVar445;
        h hVar446;
        h hVar447;
        h hVar448;
        h hVar449;
        h hVar450;
        h hVar451;
        h hVar452;
        h hVar453;
        h hVar454;
        h hVar455;
        h hVar456;
        h hVar457;
        h hVar458;
        h hVar459;
        h hVar460;
        h hVar461;
        h hVar462;
        h hVar463;
        h hVar464;
        jy jyVar18;
        h hVar465;
        h hVar466;
        h hVar467;
        h hVar468;
        h hVar469;
        h hVar470;
        h hVar471;
        h hVar472;
        h hVar473;
        jy jyVar19;
        h hVar474;
        h hVar475;
        h hVar476;
        h hVar477;
        h hVar478;
        h hVar479;
        h hVar480;
        h hVar481;
        h hVar482;
        h hVar483;
        h hVar484;
        int i = this.c;
        switch (i) {
            case 0:
                hVar = this.f297a.f;
                Context context = (Context) hVar.a();
                hVar2 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar485 = (com.google.android.libraries.gsa.h.h) hVar2.a();
                hVar3 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar486 = (com.google.android.libraries.gsa.h.h) hVar3.a();
                hVar4 = this.f297a.he;
                com.google.android.apps.gsa.shared.util.c.a.aw awVar = (com.google.android.apps.gsa.shared.util.c.a.aw) hVar4.a();
                hVar5 = this.f297a.gf;
                SharedPreferences sharedPreferences = (SharedPreferences) hVar5.a();
                hVar6 = this.f297a.aD;
                d dVar = (d) hVar6.a();
                hVar7 = this.b.el;
                b bVar = (b) hVar7.a();
                hVar8 = this.b.p;
                a b = c.b(hVar8);
                hVar9 = this.b.f;
                a b2 = c.b(hVar9);
                hVar10 = this.b.t;
                a b3 = c.b(hVar10);
                hVar11 = this.b.lc;
                a b4 = c.b(hVar11);
                hVar12 = this.b.eo;
                a b5 = c.b(hVar12);
                hVar13 = this.f297a.EE;
                a b6 = c.b(hVar13);
                hVar14 = this.f297a.gF;
                a b7 = c.b(hVar14);
                hVar15 = this.b.aW;
                a b8 = c.b(hVar15);
                hVar16 = this.b.aW;
                a b9 = c.b(hVar16);
                hVar17 = this.b.aT;
                a b10 = c.b(hVar17);
                hVar18 = this.f297a.wg;
                at atVar = (at) hVar18.a();
                hVar19 = this.b.lR;
                at atVar2 = (at) hVar19.a();
                hVar20 = this.b.eT;
                com.google.android.apps.gsa.shared.util.keepalive.d dVar2 = (com.google.android.apps.gsa.shared.util.keepalive.d) hVar20.a();
                hVar21 = this.f297a.gm;
                com.google.android.apps.gsa.shared.o.a.a aVar = (com.google.android.apps.gsa.shared.o.a.a) hVar21.a();
                hVar22 = this.f297a.aF;
                hVar23 = this.b.lS;
                a b11 = c.b(hVar23);
                hVar24 = this.b.kk;
                a b12 = c.b(hVar24);
                hVar25 = this.f297a.gn;
                return new af(context, hVar485, hVar486, awVar, sharedPreferences, dVar, bVar, b, b2, b3, b4, b5, b6, b7, b8, b9, b10, atVar, atVar2, dVar2, aVar, b11, b12, (com.google.android.apps.gsa.w.a) hVar25.a());
            case 1:
                hVar26 = this.b.ek;
                return e.c(c.b(hVar26));
            case 2:
                ds dsVar = this.b;
                jo joVar = this.f297a;
                x aB = dsVar.aB();
                jyVar = joVar.f319a;
                hVar27 = jyVar.uO;
                q qVar = (q) hVar27.a();
                hVar28 = this.f297a.gq;
                return e.b(aB, qVar, (p) hVar28.a());
            case 3:
                hVar29 = this.b.b;
                return new b((com.google.android.libraries.gsa.h.h) hVar29.a());
            case 4:
                hVar30 = this.b.c;
                af afVar = (af) hVar30.a();
                hVar31 = this.b.be;
                ai aiVar = (ai) hVar31.a();
                hVar32 = this.b.be;
                ai aiVar2 = (ai) hVar32.a();
                hVar33 = this.b.em;
                r rVar = (r) hVar33.a();
                hVar34 = this.b.d;
                ah ahVar = (ah) hVar34.a();
                hVar35 = this.b.w;
                com.google.android.apps.gsa.search.core.state.d.q qVar2 = (com.google.android.apps.gsa.search.core.state.d.q) hVar35.a();
                hVar36 = this.b.e;
                com.google.android.apps.gsa.search.core.state.d.h hVar487 = (com.google.android.apps.gsa.search.core.state.d.h) hVar36.a();
                hVar37 = this.b.lQ;
                com.google.android.apps.gsa.search.core.state.af afVar2 = (com.google.android.apps.gsa.search.core.state.af) hVar37.a();
                hVar38 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar488 = (com.google.android.libraries.gsa.h.h) hVar38.a();
                hVar39 = this.f297a.hs;
                s sVar = (s) hVar39.a();
                jyVar2 = this.f297a.f319a;
                com.google.android.apps.gsa.search.core.ab.c X = jyVar2.X();
                hVar40 = this.b.eq;
                i iVar = (i) hVar40.a();
                hVar41 = this.f297a.gF;
                a b13 = c.b(hVar41);
                hVar42 = this.b.jU;
                az azVar = (az) hVar42.a();
                hVar43 = this.f297a.gq;
                p pVar = (p) hVar43.a();
                hVar44 = this.f297a.gn;
                return new com.google.android.apps.gsa.search.core.service.x(afVar, aiVar, aiVar2, rVar, ahVar, qVar2, hVar487, afVar2, hVar488, sVar, X, iVar, b13, azVar, pVar, (com.google.android.apps.gsa.w.a) hVar44.a());
            case 5:
                hVar45 = this.b.d;
                a b14 = c.b(hVar45);
                hVar46 = this.b.w;
                a b15 = c.b(hVar46);
                hVar47 = this.b.lQ;
                a b16 = c.b(hVar47);
                hVar48 = this.b.t;
                a b17 = c.b(hVar48);
                hVar49 = this.b.aV;
                at k = at.k(c.b(hVar49));
                hVar50 = this.f297a.gj;
                a b18 = c.b(hVar50);
                ds dsVar2 = this.b;
                jo joVar2 = this.f297a;
                j r = dsVar2.r();
                hVar51 = joVar2.gF;
                a b19 = c.b(hVar51);
                hVar52 = this.b.fb;
                return new ai(b14, b15, b16, b17, k, b18, r, b19, (com.google.android.apps.gsa.search.core.state.x) hVar52.a());
            case 6:
                hVar53 = this.f297a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar53.a();
                hVar54 = this.f297a.gq;
                p pVar2 = (p) hVar54.a();
                hVar55 = this.b.lP;
                com.google.common.b.hn hnVar = (com.google.common.b.hn) hVar55.a();
                hVar56 = this.b.b;
                hVar57 = this.f297a.gz;
                hVar58 = this.f297a.gF;
                a b20 = c.b(hVar58);
                hVar59 = this.f297a.gm;
                com.google.android.apps.gsa.shared.o.a.a aVar3 = (com.google.android.apps.gsa.shared.o.a.a) hVar59.a();
                hVar60 = this.f297a.aF;
                return new ah(aVar2, pVar2, hnVar, b20, aVar3, (com.google.android.apps.gsa.shared.o.b.a.a) hVar60.a());
            case 7:
                ds dsVar3 = this.b;
                jo joVar3 = this.f297a;
                Set gy = dsVar3.gy();
                hVar61 = joVar3.gm;
                return com.google.android.apps.gsa.search.core.state.e.a.c(gy, (com.google.android.apps.gsa.shared.o.a.a) hVar61.a());
            case 8:
                hVar62 = this.b.fd;
                return new u((ae) hVar62.a());
            case 9:
                hVar63 = this.b.d;
                a b21 = c.b(hVar63);
                hVar64 = this.b.u;
                a b22 = c.b(hVar64);
                hVar65 = this.b.fh;
                a b23 = c.b(hVar65);
                hVar66 = this.b.fe;
                a b24 = c.b(hVar66);
                ds dsVar4 = this.b;
                jo joVar4 = this.f297a;
                com.google.android.apps.gsa.search.core.m.i.c p = dsVar4.p();
                hVar67 = joVar4.gm;
                return new bn(b21, b22, b23, b24, p);
            case 10:
                hVar68 = this.b.d;
                a b25 = c.b(hVar68);
                hVar69 = this.b.w;
                a b26 = c.b(hVar69);
                hVar70 = this.b.v;
                a b27 = c.b(hVar70);
                hVar71 = this.b.x;
                a b28 = c.b(hVar71);
                hVar72 = this.b.bB;
                a b29 = c.b(hVar72);
                hVar73 = this.b.fe;
                a b30 = c.b(hVar73);
                hVar74 = this.b.fc;
                a b31 = c.b(hVar74);
                hVar75 = this.b.fd;
                a b32 = c.b(hVar75);
                hVar76 = this.b.fk;
                a b33 = c.b(hVar76);
                hVar77 = this.b.fi;
                a b34 = c.b(hVar77);
                hVar78 = this.b.z;
                a b35 = c.b(hVar78);
                hVar79 = this.b.fn;
                a b36 = c.b(hVar79);
                hVar80 = this.b.ld;
                a b37 = c.b(hVar80);
                hVar81 = this.b.k;
                a b38 = c.b(hVar81);
                hVar82 = this.b.bj;
                a b39 = c.b(hVar82);
                hVar83 = this.b.C;
                a b40 = c.b(hVar83);
                hVar84 = this.f297a.hG;
                a b41 = c.b(hVar84);
                jyVar3 = this.f297a.f319a;
                hVar85 = jyVar3.hj;
                a b42 = c.b(hVar85);
                hVar86 = this.f297a.gq;
                p pVar3 = (p) hVar86.a();
                hVar87 = this.f297a.oZ;
                com.google.android.apps.gsa.search.shared.c.c cVar = (com.google.android.apps.gsa.search.shared.c.c) hVar87.a();
                jyVar4 = this.f297a.f319a;
                hVar88 = jyVar4.uY;
                com.google.android.apps.gsa.shared.logger.a.a aVar4 = (com.google.android.apps.gsa.shared.logger.a.a) hVar88.a();
                ds dsVar5 = this.b;
                com.google.android.apps.gsa.search.core.ae.bk.a am = dsVar5.am();
                hVar89 = dsVar5.A;
                com.google.android.apps.gsa.search.core.ae.bg.a aVar5 = (com.google.android.apps.gsa.search.core.ae.bg.a) hVar89.a();
                hVar90 = this.f297a.gF;
                a b43 = c.b(hVar90);
                hVar91 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar489 = (com.google.android.libraries.gsa.h.h) hVar91.a();
                hVar92 = this.f297a.gm;
                hVar93 = this.f297a.gR;
                at k2 = at.k(c.b(hVar93));
                hVar94 = this.f297a.nl;
                Query query = (Query) hVar94.a();
                hVar95 = this.f297a.g;
                return new bk(b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, pVar3, cVar, aVar4, am, aVar5, b43, hVar489, k2, query, (com.google.android.libraries.g.a) hVar95.a());
            case 11:
                hVar96 = this.b.em;
                a b44 = c.b(hVar96);
                hVar97 = this.b.t;
                a b45 = c.b(hVar97);
                ds dsVar6 = this.b;
                jo joVar5 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bk.a am2 = dsVar6.am();
                hVar98 = joVar5.gm;
                return new com.google.android.apps.gsa.search.core.state.d.q(b44, b45, am2);
            case 12:
                hVar99 = this.f297a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar99.a();
                hVar100 = this.f297a.gq;
                p pVar4 = (p) hVar100.a();
                hVar101 = this.b.kZ;
                com.google.common.b.hn hnVar2 = (com.google.common.b.hn) hVar101.a();
                hVar102 = this.b.b;
                hVar103 = this.f297a.gz;
                hVar104 = this.f297a.gF;
                a b46 = c.b(hVar104);
                hVar105 = this.b.lc;
                a b47 = c.b(hVar105);
                hVar106 = this.f297a.gm;
                com.google.android.apps.gsa.shared.o.a.a aVar7 = (com.google.android.apps.gsa.shared.o.a.a) hVar106.a();
                hVar107 = this.f297a.aF;
                return new r(aVar6, pVar4, hnVar2, b46, b47, aVar7, (com.google.android.apps.gsa.shared.o.b.a.a) hVar107.a());
            case 13:
                ds dsVar7 = this.b;
                jo joVar6 = this.f297a;
                Set gB = dsVar7.gB();
                hVar108 = joVar6.gm;
                return com.google.android.apps.gsa.search.core.state.e.a.b(gB, (com.google.android.apps.gsa.shared.o.a.a) hVar108.a());
            case 14:
                hVar109 = this.b.e;
                return new u((ae) hVar109.a());
            case 15:
                hVar110 = this.b.em;
                a b48 = c.b(hVar110);
                ds dsVar8 = this.b;
                jo joVar7 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.j.b E = dsVar8.E();
                com.google.android.apps.gsa.search.core.ae.bt.b aq = dsVar8.aq();
                hVar111 = joVar7.gm;
                return new com.google.android.apps.gsa.search.core.state.d.h(b48, E, aq);
            case 16:
                hVar112 = this.b.eq;
                a b49 = c.b(hVar112);
                hVar113 = this.b.ep;
                a b50 = c.b(hVar113);
                hVar114 = this.b.kk;
                a b51 = c.b(hVar114);
                hVar115 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar490 = (com.google.android.libraries.gsa.h.h) hVar115.a();
                hVar116 = this.f297a.gF;
                a b52 = c.b(hVar116);
                hVar117 = this.b.kl;
                com.google.android.apps.gsa.search.core.service.e.b.c cVar2 = (com.google.android.apps.gsa.search.core.service.e.b.c) hVar117.a();
                hVar118 = this.b.kn;
                com.google.android.apps.gsa.search.core.service.e.a.a aVar8 = (com.google.android.apps.gsa.search.core.service.e.a.a) hVar118.a();
                hVar119 = this.b.kq;
                com.google.android.apps.gsa.search.core.service.e.a.j jVar = (com.google.android.apps.gsa.search.core.service.e.a.j) hVar119.a();
                hVar120 = this.b.kr;
                k kVar = (k) hVar120.a();
                hVar121 = this.f297a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar121.a();
                hVar122 = this.b.en;
                return new com.google.android.apps.gsa.search.core.service.e.a.h(b49, b50, b51, hVar490, b52, cVar2, aVar8, jVar, kVar, aVar9, (g) hVar122.a());
            case 17:
                hVar123 = this.b.en;
                g gVar = (g) hVar123.a();
                hVar124 = this.b.kg;
                return new i(gVar, (com.google.android.apps.gsa.search.core.service.f.a.b) hVar124.a());
            case 18:
                hVar125 = this.f297a.gn;
                return new g((com.google.android.apps.gsa.w.a) hVar125.a());
            case 19:
                hVar126 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar491 = (com.google.android.libraries.gsa.h.h) hVar126.a();
                hVar127 = this.b.eo;
                com.google.android.apps.gsa.search.core.state.d.x xVar = (com.google.android.apps.gsa.search.core.state.d.x) hVar127.a();
                hVar128 = this.b.ep;
                com.google.android.apps.gsa.search.core.state.d.af afVar3 = (com.google.android.apps.gsa.search.core.state.d.af) hVar128.a();
                hVar129 = this.b.eq;
                a b53 = c.b(hVar129);
                hVar130 = this.b.ke;
                a b54 = c.b(hVar130);
                hVar131 = this.b.kf;
                return new com.google.android.apps.gsa.search.core.service.f.a.b(hVar491, xVar, afVar3, b53, b54, (com.google.android.apps.gsa.search.core.service.g.b.a.a.j) hVar131.a());
            case 20:
                hVar132 = this.b.em;
                a b55 = c.b(hVar132);
                hVar133 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.x(b55);
            case 21:
                hVar134 = this.b.em;
                a b56 = c.b(hVar134);
                hVar135 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.af(b56);
            case 22:
                ds dsVar9 = this.b;
                jo joVar8 = this.f297a;
                Map gw = dsVar9.gw();
                hVar136 = joVar8.gp;
                com.google.android.libraries.gsa.h.h hVar492 = (com.google.android.libraries.gsa.h.h) hVar136.a();
                hVar137 = this.b.b;
                return new com.google.android.apps.gsa.search.core.service.f.a.e(gw, hVar492, (com.google.android.libraries.gsa.h.h) hVar137.a());
            case 23:
                hVar138 = this.f297a.f;
                Context context2 = (Context) hVar138.a();
                hVar139 = this.f297a.gi;
                String str = (String) hVar139.a();
                hVar140 = this.b.er;
                com.google.android.apps.gsa.search.core.state.d.ae aeVar = (com.google.android.apps.gsa.search.core.state.d.ae) hVar140.a();
                hVar141 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar493 = (com.google.android.libraries.gsa.h.h) hVar141.a();
                hVar142 = this.f297a.gV;
                hVar143 = this.f297a.hS;
                c.b(hVar143);
                hVar144 = this.f297a.gP;
                hVar145 = this.b.es;
                a b57 = c.b(hVar145);
                hVar146 = this.b.g;
                a b58 = c.b(hVar146);
                ds dsVar10 = this.b;
                jo joVar9 = this.f297a;
                hVar147 = dsVar10.et;
                hVar148 = joVar9.mx;
                com.google.android.apps.gsa.hotword.b.j jVar2 = (com.google.android.apps.gsa.hotword.b.j) hVar148.a();
                hVar149 = this.f297a.hG;
                a b59 = c.b(hVar149);
                hVar150 = this.f297a.hO;
                com.google.android.libraries.search.b.b bVar2 = (com.google.android.libraries.search.b.b) hVar150.a();
                hVar151 = this.f297a.QW;
                return new com.google.android.apps.gsa.staticplugins.ak.c(context2, str, aeVar, hVar493, b57, b58, hVar147, jVar2, b59, bVar2, c.b(hVar151));
            case 24:
                hVar152 = this.b.em;
                a b60 = c.b(hVar152);
                hVar153 = this.b.e;
                a b61 = c.b(hVar153);
                hVar154 = this.f297a.gq;
                p pVar5 = (p) hVar154.a();
                hVar155 = this.f297a.g;
                com.google.android.libraries.g.a aVar10 = (com.google.android.libraries.g.a) hVar155.a();
                hVar156 = this.f297a.gf;
                SharedPreferences sharedPreferences2 = (SharedPreferences) hVar156.a();
                hVar157 = this.f297a.Fw;
                a b62 = c.b(hVar157);
                hVar158 = this.f297a.gV;
                a b63 = c.b(hVar158);
                hVar159 = this.b.g;
                com.google.android.apps.gsa.search.core.ae.am.a aVar11 = (com.google.android.apps.gsa.search.core.ae.am.a) hVar159.a();
                hVar160 = this.f297a.kg;
                t tVar = (t) hVar160.a();
                hVar161 = this.b.h;
                a b64 = c.b(hVar161);
                hVar162 = this.f297a.gm;
                hVar163 = this.b.i;
                a b65 = c.b(hVar163);
                hVar164 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar494 = (com.google.android.libraries.gsa.h.h) hVar164.a();
                jyVar5 = this.f297a.f319a;
                hVar165 = jyVar5.az;
                com.google.android.libraries.search.t.a.a.a.e eVar = (com.google.android.libraries.search.t.a.a.a.e) hVar165.a();
                hVar166 = this.b.k;
                com.google.android.apps.gsa.search.core.state.d.t tVar2 = (com.google.android.apps.gsa.search.core.state.d.t) hVar166.a();
                hVar167 = this.b.l;
                a b66 = c.b(hVar167);
                hVar168 = this.f297a.mS;
                at k3 = at.k((com.google.android.apps.gsa.assistant.shared.u) hVar168.a());
                hVar169 = this.f297a.f;
                Context context3 = (Context) hVar169.a();
                hVar170 = this.f297a.hG;
                a b67 = c.b(hVar170);
                hVar171 = this.f297a.io;
                return new com.google.android.apps.gsa.search.core.state.d.ae(b60, b61, pVar5, aVar10, sharedPreferences2, b62, b63, aVar11, tVar, b64, b65, hVar494, eVar, tVar2, b66, k3, context3, b67, (com.google.android.apps.gsa.assist.a.k) hVar171.a());
            case 25:
                hVar172 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.am.a.b(c.b(hVar172));
            case 26:
                hVar173 = this.b.em;
                a b68 = c.b(hVar173);
                hVar174 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.j(b68);
            case 27:
                hVar175 = this.f297a.aD;
                d dVar3 = (d) hVar175.a();
                hVar176 = this.f297a.gq;
                a b69 = c.b(hVar176);
                hVar177 = this.f297a.g;
                com.google.android.libraries.g.a aVar12 = (com.google.android.libraries.g.a) hVar177.a();
                jyVar6 = this.f297a.f319a;
                hVar178 = jyVar6.uP;
                return new com.google.android.apps.gsa.shared.speech.a.k(dVar3, b69, aVar12, (com.google.android.apps.gsa.shared.util.debug.a.b.d) hVar178.a());
            case 28:
                hVar179 = this.b.em;
                a b70 = c.b(hVar179);
                hVar180 = this.f297a.oZ;
                a b71 = c.b(hVar180);
                hVar181 = this.f297a.gf;
                a b72 = c.b(hVar181);
                jyVar7 = this.f297a.f319a;
                hVar182 = jyVar7.uQ;
                com.google.android.apps.gsa.shared.r.a aVar13 = (com.google.android.apps.gsa.shared.r.a) hVar182.a();
                hVar183 = this.b.j;
                f fVar = (f) hVar183.a();
                hVar184 = this.f297a.g;
                com.google.android.libraries.g.a aVar14 = (com.google.android.libraries.g.a) hVar184.a();
                hVar185 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.t(b70, b71, b72, aVar13, fVar, aVar14);
            case 29:
                hVar186 = this.b.f;
                return new ao(c.b(hVar186));
            case 30:
                hVar187 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.af.a.c(c.b(hVar187));
            case 31:
                hVar188 = this.f297a.gf;
                n nVar = (n) hVar188.a();
                hVar189 = this.f297a.gP;
                m mVar = (m) hVar189.a();
                hVar190 = this.f297a.f;
                Context context4 = (Context) hVar190.a();
                hVar191 = this.f297a.lV;
                com.google.android.apps.gsa.staticplugins.aa.b bVar3 = (com.google.android.apps.gsa.staticplugins.aa.b) hVar191.a();
                hVar192 = this.b.i;
                return new com.google.android.apps.gsa.staticplugins.au.b.q(nVar, mVar, context4, bVar3, c.b(hVar192));
            case 32:
                hVar193 = this.f297a.gP;
                m mVar2 = (m) hVar193.a();
                hVar194 = this.f297a.hY;
                com.google.android.apps.gsa.speech.k.a aVar15 = (com.google.android.apps.gsa.speech.k.a) hVar194.a();
                hVar195 = this.f297a.gV;
                com.google.android.apps.gsa.speech.o.g gVar2 = (com.google.android.apps.gsa.speech.o.g) hVar195.a();
                hVar196 = this.f297a.gf;
                return new com.google.android.apps.gsa.hotword.b.a(mVar2, aVar15, gVar2, (n) hVar196.a());
            case 33:
                hVar197 = this.f297a.gX;
                String str2 = (String) hVar197.a();
                ds dsVar11 = this.b;
                jo joVar10 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bp.i gM = dsVar11.gM();
                hVar198 = joVar10.gq;
                return new com.google.android.apps.gsa.staticplugins.bs.b.a.i(str2, gM, (p) hVar198.a());
            case 34:
                hVar199 = this.f297a.hC;
                com.google.android.libraries.gsa.c.b.k kVar2 = (com.google.android.libraries.gsa.c.b.k) hVar199.a();
                hVar200 = this.f297a.gZ;
                ca caVar = (ca) hVar200.a();
                jyVar8 = this.f297a.f319a;
                com.google.android.apps.gsa.search.core.google.au U = jyVar8.U();
                hVar201 = this.b.m;
                a b73 = c.b(hVar201);
                jyVar9 = this.f297a.f319a;
                hVar202 = jyVar9.uU;
                at k4 = at.k(c.b(hVar202));
                jyVar10 = this.f297a.f319a;
                hVar203 = jyVar10.uV;
                at k5 = at.k(c.b(hVar203));
                hVar204 = this.b.el;
                return com.google.android.apps.gsa.search.core.q.a.m.c(kVar2, caVar, U, b73, k4, k5, (b) hVar204.a());
            case 35:
                hVar205 = this.f297a.f;
                a b74 = c.b(hVar205);
                hVar206 = this.f297a.gy;
                a b75 = c.b(hVar206);
                jyVar11 = this.f297a.f319a;
                hVar207 = jyVar11.uR;
                cq cqVar = (cq) hVar207.a();
                hVar208 = this.f297a.H;
                Executor executor = (Executor) hVar208.a();
                hVar209 = this.f297a.hM;
                a b76 = c.b(hVar209);
                hVar210 = this.f297a.gF;
                a b77 = c.b(hVar210);
                ds dsVar12 = this.b;
                jo joVar11 = this.f297a;
                hVar211 = dsVar12.ev;
                hVar212 = joVar11.gq;
                c.b(hVar212);
                hVar213 = this.f297a.bM;
                a b78 = c.b(hVar213);
                jyVar12 = this.f297a.f319a;
                hVar214 = jyVar12.fW;
                w wVar = (w) hVar214.a();
                jyVar13 = this.f297a.f319a;
                hVar215 = jyVar13.uS;
                a b79 = c.b(hVar215);
                hVar216 = this.b.ew;
                a b80 = c.b(hVar216);
                hVar217 = this.f297a.iK;
                return new com.google.android.apps.gsa.staticplugins.w.p(b74, b75, cqVar, executor, b76, b77, hVar211, b78, wVar, b79, b80, c.b(hVar217));
            case 36:
                hVar218 = this.f297a.f;
                Context context5 = (Context) hVar218.a();
                hVar219 = this.f297a.H;
                Executor executor2 = (Executor) hVar219.a();
                hVar220 = this.f297a.v;
                Executor executor3 = (Executor) hVar220.a();
                hVar221 = this.f297a.bM;
                com.google.android.libraries.search.account.k kVar3 = (com.google.android.libraries.search.account.k) hVar221.a();
                jyVar14 = this.f297a.f319a;
                hVar222 = jyVar14.fW;
                w wVar2 = (w) hVar222.a();
                jyVar15 = this.f297a.f319a;
                hVar223 = jyVar15.uS;
                com.google.android.apps.gsa.staticplugins.w.s sVar2 = (com.google.android.apps.gsa.staticplugins.w.s) hVar223.a();
                jyVar16 = this.f297a.f319a;
                com.google.android.libraries.web.webview.a.p eE = jyVar16.eE();
                hVar224 = this.f297a.gT;
                return new com.google.android.apps.gsa.staticplugins.w.f(context5, executor2, executor3, kVar3, wVar2, sVar2, eE, (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar224.a());
            case 37:
                hVar225 = this.f297a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar3 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar225.a();
                hVar226 = this.f297a.f;
                Context context6 = (Context) hVar226.a();
                hVar227 = this.f297a.H;
                return new com.google.android.apps.gsa.staticplugins.w.a.d(cVar3, context6, (Executor) hVar227.a());
            case 38:
                return new dq(this, 0);
            case 39:
                hVar228 = this.b.r;
                com.google.android.apps.gsa.shared.util.o.g gVar3 = (com.google.android.apps.gsa.shared.util.o.g) hVar228.a();
                hVar229 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.bs.b.a(gVar3, (p) hVar229.a());
            case 40:
                hVar230 = this.b.o;
                Context context7 = (Context) hVar230.a();
                hVar231 = this.b.p;
                a b81 = c.b(hVar231);
                hVar232 = this.b.q;
                a b82 = c.b(hVar232);
                hVar233 = this.b.eB;
                a b83 = c.b(hVar233);
                hVar234 = this.b.b;
                return new aj(context7, b81, b82, b83, (com.google.android.libraries.gsa.h.h) hVar234.a());
            case 41:
                jyVar17 = this.f297a.f319a;
                hVar235 = jyVar17.fQ;
                return at.k((com.google.android.apps.gsa.staticplugins.bx.a) hVar235.a());
            case 42:
                return at.k(this.b.aL());
            case 43:
                hVar236 = this.f297a.hG;
                return new com.google.android.apps.gsa.staticplugins.x.c.b(c.b(hVar236));
            case 44:
                return new com.google.android.apps.gsa.staticplugins.bs.b.c(this.b.gI());
            case 45:
                hVar237 = this.b.eE;
                return com.google.android.apps.gsa.staticplugins.actions.b.a.b((gl) hVar237.a());
            case 46:
                return com.google.android.apps.gsa.staticplugins.actions.b.a.c(new mq(this.f297a, this.b));
            case 47:
                return com.google.android.apps.gsa.staticplugins.p.f.a.a.a.b(new lz(this.f297a, this.b, (byte[]) null, (byte[]) null));
            case 48:
                return com.google.android.apps.gsa.staticplugins.s.a.a.b(new mq(this.f297a, this.b));
            case 49:
                ds dsVar13 = this.b;
                com.google.android.apps.gsa.staticplugins.u.d aK = dsVar13.aK();
                hVar238 = dsVar13.eL;
                return com.google.android.apps.gsa.staticplugins.u.a.a.b(aK, c.b(hVar238), this.b.gr());
            case 50:
                hVar239 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.t.a.a(c.b(hVar239));
            case 51:
                hVar240 = this.f297a.gm;
                com.google.android.apps.gsa.shared.o.a.a aVar16 = (com.google.android.apps.gsa.shared.o.a.a) hVar240.a();
                hVar241 = this.b.ek;
                return new com.google.android.apps.gsa.search.core.service.a.a.d(c.b(hVar241), aVar16);
            case 52:
                hVar242 = this.f297a.f;
                Context context8 = (Context) hVar242.a();
                hVar243 = this.f297a.g;
                com.google.android.libraries.g.a aVar17 = (com.google.android.libraries.g.a) hVar243.a();
                hVar244 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar495 = (com.google.android.libraries.gsa.h.h) hVar244.a();
                hVar245 = this.f297a.gB;
                an anVar = (an) hVar245.a();
                ds dsVar14 = this.b;
                Map gr = dsVar14.gr();
                hVar246 = dsVar14.eK;
                com.google.android.libraries.gcoreclient.e.a.b bVar4 = new com.google.android.libraries.gcoreclient.e.a.b();
                hVar247 = this.f297a.gm;
                return new com.google.android.apps.gsa.staticplugins.u.h(context8, aVar17, hVar495, anVar, gr, hVar246, bVar4);
            case 53:
                hVar248 = this.f297a.oZ;
                return new com.google.android.apps.gsa.staticplugins.u.i((com.google.android.apps.gsa.search.shared.c.c) hVar248.a());
            case 54:
                hVar249 = this.f297a.f;
                return new com.google.android.libraries.gcoreclient.f.a.a.c((Context) hVar249.a());
            case 55:
                return com.google.android.apps.gsa.staticplugins.searchboxroot.a.a.b(new mq(this.f297a, this.b));
            case 56:
                hVar250 = this.b.eO;
                return com.google.android.apps.gsa.staticplugins.bn.i.b(hVar250);
            case 57:
                return new mq(this.f297a, this.b);
            case 58:
                hVar251 = this.b.t;
                com.google.android.apps.gsa.search.core.state.d.ai aiVar3 = (com.google.android.apps.gsa.search.core.state.d.ai) hVar251.a();
                hVar252 = this.b.t;
                com.google.android.apps.gsa.search.core.state.d.ai aiVar4 = (com.google.android.apps.gsa.search.core.state.d.ai) hVar252.a();
                hVar253 = this.b.k;
                a b84 = c.b(hVar253);
                hVar254 = this.b.p;
                a b85 = c.b(hVar254);
                hVar255 = this.b.eU;
                ak akVar = (ak) hVar255.a();
                hVar256 = this.f297a.f;
                Context context9 = (Context) hVar256.a();
                hVar257 = this.f297a.kg;
                a b86 = c.b(hVar257);
                hVar258 = this.f297a.pb;
                a b87 = c.b(hVar258);
                hVar259 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar496 = (com.google.android.libraries.gsa.h.h) hVar259.a();
                hVar260 = this.f297a.gq;
                return new com.google.android.apps.gsa.search.core.service.au(aiVar3, aiVar4, b84, b85, akVar, context9, b86, b87, hVar496, (p) hVar260.a());
            case 59:
                hVar261 = this.b.em;
                a b88 = c.b(hVar261);
                hVar262 = this.b.eQ;
                a b89 = c.b(hVar262);
                hVar263 = this.b.er;
                a b90 = c.b(hVar263);
                hVar264 = this.b.ep;
                a b91 = c.b(hVar264);
                hVar265 = this.b.eR;
                a b92 = c.b(hVar265);
                hVar266 = this.b.eS;
                a b93 = c.b(hVar266);
                hVar267 = this.f297a.kg;
                t tVar3 = (t) hVar267.a();
                ds dsVar15 = this.b;
                jo joVar12 = this.f297a;
                com.google.android.apps.gsa.shared.util.keepalive.a aC = dsVar15.aC();
                hVar268 = joVar12.gm;
                return new com.google.android.apps.gsa.search.core.state.d.ai(b88, b89, b90, b91, b92, b93, tVar3, aC);
            case 60:
                hVar269 = this.b.em;
                a b94 = c.b(hVar269);
                hVar270 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar497 = (com.google.android.libraries.gsa.h.h) hVar270.a();
                ds dsVar16 = this.b;
                jo joVar13 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.ae.a Q = dsVar16.Q();
                hVar271 = joVar13.gm;
                return new com.google.android.apps.gsa.search.core.state.d.u(b94, hVar497, Q);
            case 61:
                hVar272 = this.b.em;
                a b95 = c.b(hVar272);
                hVar273 = this.b.t;
                a b96 = c.b(hVar273);
                hVar274 = this.f297a.gq;
                p pVar6 = (p) hVar274.a();
                hVar275 = this.f297a.hs;
                s sVar3 = (s) hVar275.a();
                ds dsVar17 = this.b;
                com.google.android.apps.gsa.search.core.ae.ao.a X2 = dsVar17.X();
                hVar276 = dsVar17.j;
                f fVar2 = (f) hVar276.a();
                ds dsVar18 = this.b;
                jo joVar14 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bk.a am3 = dsVar18.am();
                hVar277 = joVar14.gm;
                return new ag(b95, b96, pVar6, sVar3, X2, fVar2, am3);
            case 62:
                hVar278 = this.b.em;
                a b97 = c.b(hVar278);
                hVar279 = this.f297a.g;
                com.google.android.libraries.g.a aVar18 = (com.google.android.libraries.g.a) hVar279.a();
                ds dsVar19 = this.b;
                com.google.android.apps.gsa.search.core.ae.c.a z = dsVar19.z();
                hVar280 = dsVar19.b;
                com.google.android.libraries.gsa.h.h hVar498 = (com.google.android.libraries.gsa.h.h) hVar280.a();
                hVar281 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.d(b97, aVar18, z, hVar498);
            case 63:
                hVar282 = this.b.eT;
                com.google.android.apps.gsa.shared.util.keepalive.d dVar4 = (com.google.android.apps.gsa.shared.util.keepalive.d) hVar282.a();
                hVar283 = this.f297a.f;
                Context context10 = (Context) hVar283.a();
                hVar284 = this.f297a.gV;
                a b98 = c.b(hVar284);
                hVar285 = this.f297a.gf;
                SharedPreferences sharedPreferences3 = (SharedPreferences) hVar285.a();
                hVar286 = this.f297a.iq;
                ab abVar = (ab) hVar286.a();
                hVar287 = this.f297a.hY;
                com.google.android.apps.gsa.speech.k.a aVar19 = (com.google.android.apps.gsa.speech.k.a) hVar287.a();
                hVar288 = this.f297a.Fn;
                return new ak(dVar4, context10, b98, sharedPreferences3, abVar, aVar19, (com.google.android.apps.gsa.sidekick.a.c.c) hVar288.a());
            case 64:
                hVar289 = this.b.eW;
                z zVar = (z) hVar289.a();
                hVar290 = this.b.F;
                at atVar3 = (at) hVar290.a();
                hVar291 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.accl.i.a(zVar, atVar3, (p) hVar291.a(), this.b.H());
            case 65:
                hVar292 = this.f297a.gq;
                h b99 = e.c.i.b(hVar292);
                hVar293 = this.f297a.gz;
                return new z(b99, hVar293, (char[]) null);
            case 66:
                hVar294 = this.b.E;
                return at.k((com.google.android.apps.gsa.staticplugins.accl.i) hVar294.a());
            case 67:
                hVar295 = this.f297a.gB;
                a b100 = c.b(hVar295);
                hVar296 = this.f297a.aD;
                a b101 = c.b(hVar296);
                hVar297 = this.b.D;
                return new com.google.android.apps.gsa.staticplugins.accl.i(b100, b101, c.b(hVar297), new lz(this.f297a, this.b));
            case 68:
                hVar298 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar499 = (com.google.android.libraries.gsa.h.h) hVar298.a();
                hVar299 = this.b.u;
                a b102 = c.b(hVar299);
                hVar300 = this.b.v;
                a b103 = c.b(hVar300);
                hVar301 = this.f297a.gq;
                return new com.google.android.apps.gsa.search.core.a.t(hVar499, b102, b103, c.b(hVar301));
            case 69:
                hVar302 = this.b.d;
                a b104 = c.b(hVar302);
                hVar303 = this.b.eY;
                a b105 = c.b(hVar303);
                hVar304 = this.b.x;
                a b106 = c.b(hVar304);
                hVar305 = this.b.fa;
                a b107 = c.b(hVar305);
                hVar306 = this.b.fe;
                a b108 = c.b(hVar306);
                hVar307 = this.b.ff;
                a b109 = c.b(hVar307);
                hVar308 = this.b.y;
                a b110 = c.b(hVar308);
                hVar309 = this.b.fh;
                a b111 = c.b(hVar309);
                hVar310 = this.b.u;
                a b112 = c.b(hVar310);
                hVar311 = this.b.t;
                a b113 = c.b(hVar311);
                hVar312 = this.b.z;
                a b114 = c.b(hVar312);
                hVar313 = this.f297a.oZ;
                a b115 = c.b(hVar313);
                hVar314 = this.f297a.kg;
                a b116 = c.b(hVar314);
                hVar315 = this.b.fn;
                a b117 = c.b(hVar315);
                hVar316 = this.f297a.gq;
                p pVar7 = (p) hVar316.a();
                ds dsVar20 = this.b;
                com.google.android.apps.gsa.search.core.ae.b.b y = dsVar20.y();
                hVar317 = dsVar20.b;
                com.google.android.libraries.gsa.h.h hVar500 = (com.google.android.libraries.gsa.h.h) hVar317.a();
                hVar318 = this.f297a.gm;
                ds dsVar21 = this.b;
                return new com.google.android.apps.gsa.search.core.state.f(b104, b105, b106, b107, b108, b109, b110, b111, b112, b113, b114, b115, b116, b117, pVar7, y, hVar500, dsVar21.v(), dsVar21.u());
            case 70:
                hVar319 = this.b.d;
                a b118 = c.b(hVar319);
                ds dsVar22 = this.b;
                com.google.android.apps.gsa.search.core.ae.c.a z2 = dsVar22.z();
                hVar320 = dsVar22.eX;
                com.google.android.apps.gsa.search.core.b.b bVar5 = (com.google.android.apps.gsa.search.core.b.b) hVar320.a();
                hVar321 = this.f297a.gm;
                hVar322 = this.b.b;
                return new com.google.android.apps.gsa.search.core.state.i(b118, z2, bVar5, (com.google.android.libraries.gsa.h.h) hVar322.a());
            case 71:
                return new com.google.android.apps.gsa.search.core.b.b(this.b.z());
            case 72:
                hVar323 = this.b.v;
                a b119 = c.b(hVar323);
                hVar324 = this.b.eZ;
                a b120 = c.b(hVar324);
                hVar325 = this.b.fa;
                a b121 = c.b(hVar325);
                hVar326 = this.b.u;
                a b122 = c.b(hVar326);
                ds dsVar23 = this.b;
                jo joVar15 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bk.a am4 = dsVar23.am();
                hVar327 = joVar15.gm;
                hVar328 = this.b.w;
                com.google.android.apps.gsa.search.core.state.d.q qVar3 = (com.google.android.apps.gsa.search.core.state.d.q) hVar328.a();
                hVar329 = this.b.d;
                a b123 = c.b(hVar329);
                hVar330 = this.b.fb;
                return new com.google.android.apps.gsa.search.core.state.j(b119, b120, b121, b122, am4, qVar3, b123, (com.google.android.apps.gsa.search.core.state.x) hVar330.a());
            case 73:
                hVar331 = this.b.d;
                a b124 = c.b(hVar331);
                hVar332 = this.b.w;
                a b125 = c.b(hVar332);
                hVar333 = this.f297a.gm;
                return new l(b124, b125);
            case 74:
                hVar334 = this.b.d;
                a b126 = c.b(hVar334);
                hVar335 = this.b.u;
                a b127 = c.b(hVar335);
                hVar336 = this.b.e;
                a b128 = c.b(hVar336);
                hVar337 = this.b.e;
                a b129 = c.b(hVar337);
                hVar338 = this.f297a.gV;
                a b130 = c.b(hVar338);
                ds dsVar24 = this.b;
                jo joVar16 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.j.b E2 = dsVar24.E();
                hVar339 = joVar16.gm;
                hVar340 = this.f297a.gq;
                p pVar8 = (p) hVar340.a();
                hVar341 = this.f297a.wg;
                return new com.google.android.apps.gsa.search.core.state.s(b126, b127, b128, b129, b130, E2, pVar8, (at) hVar341.a());
            case 75:
                return new com.google.android.apps.gsa.search.core.state.x();
            case 76:
                hVar342 = this.b.d;
                a b131 = c.b(hVar342);
                hVar343 = this.b.fc;
                a b132 = c.b(hVar343);
                hVar344 = this.b.u;
                a b133 = c.b(hVar344);
                hVar345 = this.b.fd;
                a b134 = c.b(hVar345);
                hVar346 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.ab(b131, b132, b133, b134);
            case 77:
                hVar347 = this.b.d;
                a b135 = c.b(hVar347);
                hVar348 = this.b.v;
                a b136 = c.b(hVar348);
                hVar349 = this.b.u;
                a b137 = c.b(hVar349);
                hVar350 = this.f297a.gV;
                com.google.android.apps.gsa.speech.o.g gVar4 = (com.google.android.apps.gsa.speech.o.g) hVar350.a();
                hVar351 = this.f297a.gq;
                p pVar9 = (p) hVar351.a();
                hVar352 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar501 = (com.google.android.libraries.gsa.h.h) hVar352.a();
                hVar353 = this.f297a.gF;
                a b138 = c.b(hVar353);
                hVar354 = this.f297a.gm;
                return new ba(b135, b136, b137, gVar4, pVar9, hVar501, b138);
            case 78:
                hVar355 = this.b.em;
                a b139 = c.b(hVar355);
                hVar356 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.w(b139);
            case 79:
                hVar357 = this.b.d;
                a b140 = c.b(hVar357);
                hVar358 = this.f297a.nu;
                a b141 = c.b(hVar358);
                hVar359 = this.f297a.gq;
                p pVar10 = (p) hVar359.a();
                ds dsVar25 = this.b;
                com.google.android.apps.gsa.search.core.ae.ak.a U2 = dsVar25.U();
                hVar360 = dsVar25.b;
                com.google.android.libraries.gsa.h.h hVar502 = (com.google.android.libraries.gsa.h.h) hVar360.a();
                hVar361 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.aj(b140, b141, pVar10, U2, hVar502);
            case 80:
                hVar362 = this.b.d;
                a b142 = c.b(hVar362);
                hVar363 = this.b.u;
                a b143 = c.b(hVar363);
                hVar364 = this.b.fg;
                a b144 = c.b(hVar364);
                hVar365 = this.f297a.g;
                com.google.android.libraries.g.a aVar20 = (com.google.android.libraries.g.a) hVar365.a();
                hVar366 = this.f297a.gq;
                p pVar11 = (p) hVar366.a();
                hVar367 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar503 = (com.google.android.libraries.gsa.h.h) hVar367.a();
                ds dsVar26 = this.b;
                jo joVar17 = this.f297a;
                com.google.android.apps.gsa.search.core.m.c.b o = dsVar26.o();
                hVar368 = joVar17.gm;
                return new bf(b142, b143, b144, aVar20, pVar11, hVar503, o);
            case 81:
                hVar369 = this.b.d;
                a b145 = c.b(hVar369);
                hVar370 = this.f297a.g;
                com.google.android.libraries.g.a aVar21 = (com.google.android.libraries.g.a) hVar370.a();
                hVar371 = this.f297a.gm;
                hVar372 = this.f297a.gn;
                return new ci(b145, aVar21, (com.google.android.apps.gsa.w.a) hVar372.a());
            case 82:
                hVar373 = this.b.d;
                a b146 = c.b(hVar373);
                hVar374 = this.b.v;
                a b147 = c.b(hVar374);
                hVar375 = this.b.x;
                a b148 = c.b(hVar375);
                hVar376 = this.b.fe;
                a b149 = c.b(hVar376);
                hVar377 = this.b.fc;
                a b150 = c.b(hVar377);
                hVar378 = this.b.u;
                a b151 = c.b(hVar378);
                hVar379 = this.b.fi;
                a b152 = c.b(hVar379);
                hVar380 = this.b.t;
                a b153 = c.b(hVar380);
                hVar381 = this.f297a.gq;
                com.google.android.apps.gsa.shared.k.c cVar4 = (com.google.android.apps.gsa.shared.k.c) hVar381.a();
                hVar382 = this.b.C;
                a b154 = c.b(hVar382);
                hVar383 = this.f297a.gF;
                a b155 = c.b(hVar383);
                hVar384 = this.f297a.kg;
                t tVar4 = (t) hVar384.a();
                hVar385 = this.f297a.f;
                Context context11 = (Context) hVar385.a();
                hVar386 = this.f297a.gf;
                SharedPreferences sharedPreferences4 = (SharedPreferences) hVar386.a();
                hVar387 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar504 = (com.google.android.libraries.gsa.h.h) hVar387.a();
                ds dsVar27 = this.b;
                jo joVar18 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bt.b aq2 = dsVar27.aq();
                hVar388 = joVar18.gm;
                hVar389 = this.f297a.nZ;
                at atVar4 = (at) hVar389.a();
                hVar390 = this.f297a.qI;
                a b156 = c.b(hVar390);
                hVar391 = this.f297a.gq;
                return new TtsState(b146, b147, b148, b149, b150, b151, b152, b153, cVar4, b154, b155, tVar4, context11, sharedPreferences4, hVar504, aq2, atVar4, b156, c.b(hVar391));
            case 83:
                hVar392 = this.b.d;
                a b157 = c.b(hVar392);
                hVar393 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.ag(b157);
            case 84:
                hVar394 = this.b.d;
                a b158 = c.b(hVar394);
                hVar395 = this.f297a.gq;
                p pVar12 = (p) hVar395.a();
                hVar396 = this.b.u;
                a b159 = c.b(hVar396);
                hVar397 = this.b.z;
                a b160 = c.b(hVar397);
                hVar398 = this.b.fh;
                a b161 = c.b(hVar398);
                hVar399 = this.b.v;
                a b162 = c.b(hVar399);
                hVar400 = this.b.x;
                a b163 = c.b(hVar400);
                hVar401 = this.b.fj;
                a b164 = c.b(hVar401);
                hVar402 = this.b.fl;
                a b165 = c.b(hVar402);
                hVar403 = this.b.A;
                a b166 = c.b(hVar403);
                hVar404 = this.b.j;
                f fVar3 = (f) hVar404.a();
                ds dsVar28 = this.b;
                com.google.android.apps.gsa.search.core.ae.au.a ag = dsVar28.ag();
                hVar405 = dsVar28.b;
                com.google.android.libraries.gsa.h.h hVar505 = (com.google.android.libraries.gsa.h.h) hVar405.a();
                hVar406 = this.f297a.gm;
                hVar407 = this.b.fm;
                a b167 = c.b(hVar407);
                hVar408 = this.b.B;
                hVar409 = this.f297a.hG;
                return new ay(b158, pVar12, b159, b160, b161, b162, b163, b164, b165, b166, fVar3, ag, hVar505, b167, c.b(hVar409));
            case 85:
                hVar410 = this.b.d;
                a b168 = c.b(hVar410);
                hVar411 = this.f297a.g;
                com.google.android.libraries.g.a aVar22 = (com.google.android.libraries.g.a) hVar411.a();
                hVar412 = this.b.A;
                com.google.android.apps.gsa.search.core.ae.bg.a aVar23 = (com.google.android.apps.gsa.search.core.ae.bg.a) hVar412.a();
                hVar413 = this.b.u;
                a b169 = c.b(hVar413);
                hVar414 = this.b.fi;
                a b170 = c.b(hVar414);
                hVar415 = this.f297a.gq;
                a b171 = c.b(hVar415);
                hVar416 = this.f297a.f;
                hVar417 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar506 = (com.google.android.libraries.gsa.h.h) hVar417.a();
                hVar418 = this.f297a.gm;
                hVar419 = this.f297a.oZ;
                a b172 = c.b(hVar419);
                hVar420 = this.f297a.gf;
                return new bx(b168, aVar22, aVar23, b169, b170, b171, hVar506, b172, c.b(hVar420));
            case 86:
                hVar421 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bg.a.k(c.b(hVar421));
            case 87:
                hVar422 = this.b.d;
                a b173 = c.b(hVar422);
                hVar423 = this.b.v;
                a b174 = c.b(hVar423);
                hVar424 = this.b.x;
                a b175 = c.b(hVar424);
                hVar425 = this.b.fe;
                a b176 = c.b(hVar425);
                hVar426 = this.b.u;
                a b177 = c.b(hVar426);
                hVar427 = this.b.fk;
                a b178 = c.b(hVar427);
                hVar428 = this.b.t;
                a b179 = c.b(hVar428);
                ds dsVar29 = this.b;
                jo joVar19 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bj.a al = dsVar29.al();
                hVar429 = joVar19.gz;
                com.google.android.libraries.gsa.h.h hVar507 = (com.google.android.libraries.gsa.h.h) hVar429.a();
                hVar430 = this.f297a.gm;
                return new bq(b173, b174, b175, b176, b177, b178, b179, al, hVar507);
            case 88:
                hVar431 = this.b.d;
                a b180 = c.b(hVar431);
                hVar432 = this.f297a.gm;
                return new bm(b180);
            case 89:
                hVar433 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar508 = (com.google.android.libraries.gsa.h.h) hVar433.a();
                hVar434 = this.b.u;
                a b181 = c.b(hVar434);
                hVar435 = this.b.fi;
                return new bs(hVar508, b181, c.b(hVar435));
            case 90:
                return new com.google.android.apps.gsa.search.core.l.g();
            case 91:
                hVar436 = this.b.d;
                a b182 = c.b(hVar436);
                hVar437 = this.b.v;
                a b183 = c.b(hVar437);
                hVar438 = this.b.x;
                a b184 = c.b(hVar438);
                hVar439 = this.b.w;
                a b185 = c.b(hVar439);
                hVar440 = this.b.eZ;
                a b186 = c.b(hVar440);
                hVar441 = this.b.fe;
                a b187 = c.b(hVar441);
                hVar442 = this.b.u;
                a b188 = c.b(hVar442);
                ds dsVar30 = this.b;
                jo joVar20 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.aa.a.a gD = dsVar30.gD();
                hVar443 = joVar20.gq;
                p pVar13 = (p) hVar443.a();
                hVar444 = this.f297a.kg;
                t tVar5 = (t) hVar444.a();
                hVar445 = this.f297a.hs;
                s sVar4 = (s) hVar445.a();
                hVar446 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar509 = (com.google.android.libraries.gsa.h.h) hVar446.a();
                ds dsVar31 = this.b;
                jo joVar21 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bu.a ar = dsVar31.ar();
                hVar447 = joVar21.gm;
                return new cg(b182, b183, b184, b185, b186, b187, b188, gD, pVar13, tVar5, sVar4, hVar509, ar);
            case 92:
                hVar448 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar448.a();
                hVar449 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar510 = (com.google.android.libraries.gsa.h.h) hVar449.a();
                hVar450 = this.f297a.g;
                com.google.android.libraries.g.a aVar24 = (com.google.android.libraries.g.a) hVar450.a();
                hVar451 = this.f297a.pm;
                am amVar = (am) hVar451.a();
                hVar452 = this.f297a.lu;
                a b189 = c.b(hVar452);
                hVar453 = this.f297a.gf;
                n nVar2 = (n) hVar453.a();
                hVar454 = this.f297a.gF;
                a b190 = c.b(hVar454);
                hVar455 = this.f297a.f;
                Context context12 = (Context) hVar455.a();
                hVar456 = this.f297a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar25 = (com.google.android.apps.gsa.search.core.y.a.a) hVar456.a();
                hVar457 = this.b.G;
                com.google.android.apps.gsa.search.core.q.a.i iVar2 = (com.google.android.apps.gsa.search.core.q.a.i) hVar457.a();
                hVar458 = this.b.eS;
                return new com.google.android.apps.gsa.staticplugins.a.d(anVar2, hVar510, aVar24, amVar, b189, nVar2, b190, context12, aVar25, iVar2, (com.google.android.apps.gsa.search.core.state.a.a) hVar458.a());
            case 93:
                hVar459 = this.b.n;
                return new com.google.android.apps.gsa.search.core.q.a.i((com.google.android.apps.gsa.shared.v.ae) hVar459.a());
            case 94:
                ds dsVar32 = this.b;
                jo joVar22 = this.f297a;
                Object ge = dsVar32.ge();
                hVar460 = joVar22.gz;
                return new com.google.android.apps.gsa.staticplugins.b.b.c((com.google.android.apps.gsa.staticplugins.b.b.a) ge, (com.google.android.libraries.gsa.h.h) hVar460.a());
            case 95:
                ds dsVar33 = this.b;
                com.google.android.apps.gsa.search.core.d.a n = dsVar33.n();
                Object gf = dsVar33.gf();
                Object gg = dsVar33.gg();
                hVar461 = dsVar33.r;
                com.google.android.apps.gsa.shared.util.o.g gVar5 = (com.google.android.apps.gsa.shared.util.o.g) hVar461.a();
                hVar462 = this.f297a.gq;
                p pVar14 = (p) hVar462.a();
                hVar463 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar2 = (com.google.android.apps.gsa.search.core.service.x) hVar463.a();
                hVar464 = this.f297a.hM;
                com.google.android.apps.gsa.search.core.google.ai aiVar5 = (com.google.android.apps.gsa.search.core.google.ai) hVar464.a();
                jyVar18 = this.f297a.f319a;
                hVar465 = jyVar18.ki;
                hVar466 = this.f297a.hG;
                com.google.android.apps.gsa.shared.logger.b.h hVar511 = (com.google.android.apps.gsa.shared.logger.b.h) hVar466.a();
                hVar467 = this.f297a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar5 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar467.a();
                hVar468 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar512 = (com.google.android.libraries.gsa.h.h) hVar468.a();
                hVar469 = this.b.H;
                return new com.google.android.apps.gsa.staticplugins.c.d(n, (com.google.android.apps.gsa.staticplugins.c.a) gf, (com.google.android.apps.gsa.staticplugins.c.b) gg, gVar5, pVar14, xVar2, aiVar5, hVar511, cVar5, hVar512, (com.google.common.v.f) hVar469.a());
            case 96:
                return com.google.common.v.a.a.b();
            case 97:
                return new com.google.android.apps.gsa.staticplugins.d.a.a();
            case 98:
                hVar470 = this.b.fv;
                a b191 = c.b(hVar470);
                hVar471 = this.f297a.g;
                com.google.android.libraries.g.a aVar26 = (com.google.android.libraries.g.a) hVar471.a();
                hVar472 = this.f297a.gq;
                a b192 = c.b(hVar472);
                hVar473 = this.f297a.gB;
                an anVar3 = (an) hVar473.a();
                jyVar19 = this.f297a.f319a;
                hVar474 = jyVar19.by;
                a b193 = c.b(hVar474);
                ds dsVar34 = this.b;
                com.google.android.apps.gsa.search.core.ae.aq.g ad = dsVar34.ad();
                com.google.android.apps.gsa.search.core.ae.aq.b aa = dsVar34.aa();
                hVar475 = dsVar34.I;
                com.google.android.apps.gsa.search.core.ae.aq.d dVar5 = (com.google.android.apps.gsa.search.core.ae.aq.d) hVar475.a();
                hVar476 = this.f297a.gf;
                SharedPreferences sharedPreferences5 = (SharedPreferences) hVar476.a();
                hVar477 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar513 = (com.google.android.libraries.gsa.h.h) hVar477.a();
                hVar478 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar514 = (com.google.android.libraries.gsa.h.h) hVar478.a();
                hVar479 = this.f297a.hi;
                a b194 = c.b(hVar479);
                hVar480 = this.f297a.it;
                ad adVar = (ad) hVar480.a();
                hVar481 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar2 = (com.google.android.apps.gsa.assistant.shared.z) hVar481.a();
                hVar482 = this.f297a.hG;
                a b195 = c.b(hVar482);
                ds dsVar35 = this.b;
                return new v(b191, aVar26, b192, anVar3, b193, ad, aa, dVar5, sharedPreferences5, hVar513, hVar514, b194, adVar, zVar2, b195, dsVar35.ac(), dsVar35.ae());
            case 99:
                jo joVar23 = this.f297a;
                ds dsVar36 = this.b;
                hVar483 = joVar23.nz;
                hVar484 = dsVar36.fu;
                return new com.google.android.apps.gsa.staticplugins.f.z(hVar483, hVar484);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        o a2;
        int i = this.c;
        switch (i) {
            case 100:
                return new mm(this.f297a, this.b);
            case 101:
                return new com.google.android.apps.gsa.search.core.ae.aq.b.am(c.b(this.b.f));
            case 102:
                ds dsVar = this.b;
                jo joVar = this.f297a;
                a b = c.b(dsVar.an);
                a b2 = c.b(joVar.pB);
                com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) this.f297a.gp.a();
                com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) this.f297a.gz.a();
                a b3 = c.b(this.f297a.hG);
                com.google.android.apps.gsa.w.a aVar = (com.google.android.apps.gsa.w.a) this.f297a.gn.a();
                ds dsVar2 = this.b;
                return new com.google.android.apps.gsa.staticplugins.g.b.e(b, b2, hVar, hVar2, b3, aVar, c.b(dsVar2.ao), c.b(dsVar2.ap));
            case 103:
                p pVar = (p) this.f297a.gq.a();
                com.google.android.apps.gsa.staticplugins.nga.ui.b.a aVar2 = (com.google.android.apps.gsa.staticplugins.nga.ui.b.a) this.f297a.f319a.av.a();
                a b4 = c.b(this.f297a.pm);
                a b5 = c.b(this.f297a.pb);
                a b6 = c.b(this.f297a.pB);
                ds dsVar3 = this.b;
                jo joVar2 = this.f297a;
                a b7 = c.b(dsVar3.J);
                a b8 = c.b(joVar2.pP);
                ds dsVar4 = this.b;
                jy jyVar = this.f297a.f319a;
                h hVar3 = dsVar4.S;
                h hVar4 = dsVar4.R;
                h hVar5 = dsVar4.O;
                a b9 = c.b(dsVar4.M);
                a b10 = c.b(hVar5);
                a b11 = c.b(hVar4);
                a b12 = c.b(hVar3);
                a b13 = c.b(jyVar.gi);
                a b14 = c.b(this.f297a.oV);
                a b15 = c.b(this.f297a.pj);
                ds dsVar5 = this.b;
                h hVar6 = dsVar5.X;
                h hVar7 = dsVar5.W;
                h hVar8 = dsVar5.V;
                a b16 = c.b(dsVar5.T);
                a b17 = c.b(hVar8);
                a b18 = c.b(hVar7);
                ha w = ha.w((ac) hVar6.a(), (ac) dsVar5.Y.a(), (ac) dsVar5.Z.a(), (ac) dsVar5.aa.a(), (ac) dsVar5.ab.a(), (ac) dsVar5.ac.a(), new ac[]{(ac) dsVar5.ad.a(), (ac) dsVar5.ae.a(), (ac) dsVar5.af.a(), (ac) dsVar5.ag.a()});
                ds dsVar6 = this.b;
                jo joVar3 = this.f297a;
                a b19 = c.b(dsVar6.ah);
                a b20 = c.b(dsVar6.ai);
                a b21 = c.b(joVar3.hw);
                a b22 = c.b(this.f297a.f319a.gk);
                boolean A = this.f297a.f319a.sv().A();
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f297a.g.a();
                ds dsVar7 = this.b;
                com.google.android.apps.gsa.staticplugins.g.ag agVar = new com.google.android.apps.gsa.staticplugins.g.ag(at.k(dsVar7.f298a.nE()), at.k((com.google.android.apps.gsa.staticplugins.opa.samson.c.e.i) dsVar7.f298a.oB.a()), (at) dsVar7.aj.a());
                ds dsVar8 = this.b;
                return new com.google.android.apps.gsa.staticplugins.g.j(pVar, aVar2, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, w, b19, b20, b21, b22, A, aVar3, agVar, c.b(dsVar8.ak), c.b(dsVar8.al), at.k(c.b(this.f297a.f319a.eY)), at.k(c.b(this.b.am)), (at) this.f297a.qy.a(), (Executor) this.f297a.v.a(), (com.google.common.v.f) this.b.H.a());
            case 104:
                return new com.google.android.apps.gsa.staticplugins.g.k((Context) this.f297a.f.a());
            case 105:
                p pVar2 = (p) this.f297a.gq.a();
                a b23 = c.b(this.f297a.gB);
                ds dsVar9 = this.b;
                return new com.google.android.apps.gsa.search.core.google.d.a(pVar2, b23, c.b(dsVar9.K), c.b(dsVar9.L));
            case 106:
                return new com.google.android.apps.gsa.assistant.settings.features.payments.a(c.b(this.f297a.gf));
            case 107:
                return at.k((com.google.android.apps.gsa.shared.p.a.a) this.f297a.f319a.fn.a());
            case 108:
                return new com.google.android.apps.gsa.search.core.google.a.v((com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), (com.google.android.apps.gsa.search.core.google.a.q) this.b.N.a(), (com.google.android.apps.gsa.search.core.google.a.p) this.f297a.pt.a());
            case 109:
                return new com.google.android.apps.gsa.search.core.google.a.q((com.google.android.apps.gsa.search.core.aa.a.c) this.f297a.ls.a(), (com.google.android.apps.gsa.shared.v.s) this.b.m.a(), (am) this.f297a.pm.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a());
            case 110:
                Context context = (Context) this.f297a.f.a();
                p pVar3 = (p) this.f297a.gq.a();
                a b24 = c.b(this.f297a.pn);
                at k = at.k((com.google.android.apps.gsa.staticplugins.opa.p.c) this.f297a.f319a.fa.a());
                ds dsVar10 = this.b;
                return new com.google.android.apps.gsa.search.core.google.a.r(context, pVar3, b24, k, c.b(dsVar10.P), c.b(dsVar10.Q), at.k((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) this.f297a.mW.a()), (com.google.android.apps.gsa.search.core.google.a.d) this.f297a.f319a.gh.a(), c.b(this.f297a.hG));
            case 111:
                return at.k((com.google.android.apps.gsa.staticplugins.opa.aq.a) this.f297a.f319a.eC.a());
            case 112:
                return at.k((com.google.android.apps.gsa.nga.api.aw) this.f297a.f319a.gg.a());
            case 113:
                return new com.google.android.apps.gsa.search.core.google.a.f((p) this.f297a.gq.a());
            case 114:
                return new com.google.android.apps.gsa.search.core.google.a.c();
            case 115:
                return new com.google.android.apps.gsa.search.core.google.a.b(c.b(this.b.U));
            case 116:
                return at.k((com.google.android.apps.search.assistant.platform.f.a.b) this.f297a.f319a.au.a());
            case 117:
                return new com.google.android.apps.gsa.search.core.google.a.w(c.b(this.f297a.oZ), (com.google.android.apps.gsa.w.a) this.f297a.gn.a());
            case 118:
                return new com.google.android.apps.gsa.staticplugins.accl.h.c();
            case 119:
                return new com.google.android.apps.gsa.staticplugins.accl.h.d();
            case 120:
                return new com.google.android.apps.gsa.staticplugins.accl.h.e();
            case 121:
                return new com.google.android.apps.gsa.staticplugins.g.af((at) this.f297a.gS.a(), c.b(this.f297a.gq));
            case 122:
                return new com.google.android.apps.gsa.staticplugins.g.ai((p) this.f297a.gq.a());
            case 123:
                return new com.google.android.apps.gsa.staticplugins.opa.ak.c((com.google.android.apps.gsa.speech.o.g) this.f297a.gV.a(), (p) this.f297a.gq.a(), (SharedPreferences) this.f297a.gf.a(), (com.google.android.apps.gsa.staticplugins.opa.ak.l) this.f297a.f319a.eD.a(), c.b(this.f297a.kg));
            case 124:
                return new com.google.android.apps.gsa.staticplugins.opa.morris2.h.a((Context) this.f297a.f.a(), at.k((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) this.f297a.mW.a()), (p) this.f297a.gq.a());
            case 125:
                return new com.google.android.apps.gsa.staticplugins.opa.translator.util.t();
            case 126:
                return new com.google.android.apps.gsa.staticplugins.opa.appintegration.g(at.k((com.google.android.apps.gsa.assistant.shared.u) this.f297a.mS.a()), c.b(this.f297a.qt), c.b(this.f297a.gq));
            case 127:
                return new com.google.android.apps.gsa.staticplugins.opa.zerostate.j.b();
            case 128:
                return new com.google.android.apps.gsa.search.core.google.a.ag((p) this.f297a.gq.a(), (com.google.android.apps.gsa.speech.c.c) this.f297a.f319a.gj.a(), (com.google.android.apps.gsa.contacts.au) this.f297a.pL.a());
            case 129:
                return new com.google.android.apps.gsa.staticplugins.g.a((p) this.f297a.gq.a(), (com.google.android.libraries.g.a) this.f297a.g.a(), (com.google.android.apps.gsa.l.b) this.f297a.ly.a(), (an) this.f297a.gB.a());
            case 130:
                return at.k((com.google.android.apps.gsa.nga.shared.q.a.j) this.f297a.iD.a());
            case 131:
                return new com.google.android.apps.gsa.staticplugins.g.ae(c.b(this.f297a.gq), (Executor) this.f297a.v.a(), (Executor) this.f297a.H.a(), (Context) this.f297a.f.a(), c.b(this.f297a.kg), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) this.f297a.gT.a(), (at) this.f297a.pn.a());
            case 132:
                return new com.google.android.apps.gsa.staticplugins.y.q(this.b.M(), (com.google.android.apps.gsa.staticplugins.y.n) this.f297a.f319a.gl.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), (com.google.android.apps.gsa.search.core.ae) this.f297a.lu.a(), (an) this.f297a.gB.a());
            case 133:
                return new com.google.android.apps.gsa.staticplugins.accl.b(c.b(this.f297a.gB));
            case 134:
                return new mg(this.f297a, this.b);
            case 135:
                return new mg(this.f297a, this.b);
            case 136:
                ds dsVar11 = this.b;
                jo joVar4 = this.f297a;
                a b25 = c.b(dsVar11.aw);
                return new com.google.android.apps.gsa.staticplugins.i.i(b25);
            case 137:
                jo joVar5 = this.f297a;
                ds dsVar12 = this.b;
                h hVar9 = joVar5.gy;
                h hVar10 = dsVar12.b;
                h hVar11 = joVar5.pm;
                h hVar12 = joVar5.g;
                h b26 = e.c.i.b(joVar5.hD);
                jo joVar6 = this.f297a;
                ds dsVar13 = this.b;
                h hVar13 = joVar6.hG;
                h hVar14 = joVar6.gq;
                h b27 = e.c.i.b(dsVar13.m);
                ds dsVar14 = this.b;
                h b28 = e.c.i.b(this.f297a.gF);
                jo joVar7 = this.f297a;
                ds dsVar15 = this.b;
                return new com.google.android.apps.gsa.staticplugins.i.g(hVar9, hVar10, hVar11, hVar12, b26, hVar13, hVar14, b27, dsVar14.aq, b28, joVar7.gm, joVar7.aF, dsVar15.ar, joVar7.nz, e.c.i.b(dsVar15.as), dsVar15.av);
            case 138:
                return new com.google.android.apps.gsa.search.core.l.u(c.b(this.f297a.kg), c.b(this.f297a.gy), c.b(this.f297a.hD));
            case 139:
                return new com.google.android.apps.gsa.search.core.l.i();
            case 140:
                return new mm(this.f297a, this.b);
            case 141:
                Context context2 = (Context) this.f297a.f.a();
                a b29 = c.b(this.f297a.gB);
                ds dsVar16 = this.b;
                a b30 = c.b(dsVar16.au);
                com.google.android.libraries.assistant.assistantactions.c.d bI = dsVar16.bI();
                Locale c = ((com.google.android.apps.gsa.assistant.settings.shared.t) b30.a()).c(com.google.common.base.cl.K(((an) b29.a()).r()));
                if (c == null) {
                    a2 = bI.a(context2);
                    break;
                } else {
                    Configuration configuration = new Configuration(context2.getResources().getConfiguration());
                    configuration.setLocale(c);
                    a2 = bI.a(context2.createConfigurationContext(configuration));
                    break;
                }
            case 142:
                return new com.google.android.apps.gsa.assistant.settings.shared.t((Context) this.f297a.f.a(), c.b(this.f297a.gf), (Executor) this.f297a.H.a(), c.b(this.f297a.gq), c.b(this.f297a.gB), c.b(this.f297a.gt), c.b(this.f297a.gQ), c.b(this.b.at), at.k((fv) this.f297a.lw.a()), c.b(this.f297a.lx), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a());
            case 143:
                jo joVar8 = this.f297a;
                gy l = ha.l(5);
                l.j(com.google.android.apps.gsa.staticplugins.nga.a.b.b.a(joVar8.gU));
                l.h((com.google.android.apps.gsa.assistant.settings.shared.s) this.f297a.gs.a());
                l.h(new com.google.android.apps.gsa.staticplugins.au.b.p(this.f297a.dx()));
                l.h((com.google.android.apps.gsa.assistant.settings.shared.s) this.f297a.lv.a());
                l.h(this.f297a.dy());
                return l.g();
            case 144:
                return new nv(this.f297a, this.b);
            case 145:
                com.google.android.apps.gsa.search.core.state.d.h hVar15 = (com.google.android.apps.gsa.search.core.state.d.h) this.b.e.a();
                com.google.android.libraries.gsa.h.h hVar16 = (com.google.android.libraries.gsa.h.h) this.b.b.a();
                AudioManager audioManager = (AudioManager) this.f297a.cZ.a();
                com.google.android.apps.gsa.shared.util.af afVar = (com.google.android.apps.gsa.shared.util.af) this.f297a.f319a.gp.a();
                com.google.android.apps.gsa.search.core.service.x xVar = (com.google.android.apps.gsa.search.core.service.x) this.b.p.a();
                com.google.android.apps.gsa.x.a.e eVar = (com.google.android.apps.gsa.x.a.e) this.f297a.ps.a();
                com.google.android.apps.gsa.speech.audio.e.h hVar17 = (com.google.android.apps.gsa.speech.audio.e.h) this.f297a.f319a.gq.a();
                return new com.google.android.apps.gsa.staticplugins.j.e(hVar15, hVar16, audioManager, afVar, xVar, eVar, hVar17, (com.google.android.libraries.gsa.h.h) this.f297a.gz.a());
            case 146:
                return new com.google.android.apps.gsa.staticplugins.k.f((com.google.android.apps.gsa.search.core.service.x) this.b.p.a(), (com.google.android.apps.gsa.shared.util.c.a.aw) this.f297a.gu.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gz.a(), (Context) this.f297a.f.a(), (AudioManager) this.f297a.cZ.a());
            case 147:
                com.google.android.libraries.gsa.h.h hVar18 = (com.google.android.libraries.gsa.h.h) this.f297a.gv.a();
                ds dsVar17 = this.b;
                return new com.google.android.apps.gsa.staticplugins.l.g(hVar18, fu.q("podcast_player", dsVar17.aY, "opa", dsVar17.aZ, "opa_media_player", dsVar17.ba, "speakr", dsVar17.bc, "speakr_email", dsVar17.bd));
            case 148:
                ds dsVar18 = this.b;
                jo joVar9 = this.f297a;
                com.google.android.apps.gsa.staticplugins.l.p aG = dsVar18.aG();
                com.google.android.apps.gsa.staticplugins.l.s aH = dsVar18.aH();
                p pVar4 = (p) joVar9.gq.a();
                a b31 = c.b(this.b.aX);
                com.google.android.apps.gsa.shared.logger.e eVar2 = (com.google.android.apps.gsa.shared.logger.e) this.f297a.gF.a();
                if (!pVar4.w(cz.b)) {
                    a2 = aG.a("podcast_player", eVar2, aH.a(com.google.common.base.a.a));
                    break;
                } else {
                    a2 = aG.a("podcast_player", eVar2, aH.a(at.k(b31)));
                    break;
                }
            case 149:
                return new com.google.android.apps.gsa.staticplugins.l.v();
            case 150:
                Context context3 = (Context) this.f297a.f.a();
                com.google.android.libraries.gsa.c.a.a.t tVar = (com.google.android.libraries.gsa.c.a.a.t) this.f297a.hD.a();
                p pVar5 = (p) this.f297a.gq.a();
                androidx.media3.exoplayer.u uVar = new androidx.media3.exoplayer.u(context3, new com.google.android.apps.gsa.staticplugins.l.a.a(context3, 1));
                uVar.c(new com.google.android.apps.gsa.staticplugins.l.u(tVar, pVar5));
                return uVar.a();
            case 151:
                ds dsVar19 = this.b;
                return fu.n("speakr", dsVar19.ax, "speakr_email", dsVar19.ay);
            case 152:
                return com.google.android.apps.gsa.staticplugins.l.a.b.a((Context) this.f297a.f.a(), (com.google.android.libraries.gsa.c.a.a.t) this.f297a.hD.a(), (p) this.f297a.gq.a());
            case 153:
                return com.google.android.apps.gsa.staticplugins.l.a.b.a((Context) this.f297a.f.a(), (com.google.android.libraries.gsa.c.a.a.t) this.f297a.hD.a(), (p) this.f297a.gq.a());
            case 154:
                return new com.google.android.apps.gsa.search.core.ae.as.a.b(c.b(this.b.f));
            case 155:
                Context context4 = (Context) this.f297a.f.a();
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) this.f297a.g.a();
                ds dsVar20 = this.b;
                return new com.google.android.apps.gsa.staticplugins.l.b(context4, aVar4, dsVar20.am(), (com.google.android.libraries.gsa.h.h) dsVar20.b.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), c.b(this.f297a.oo));
            case 156:
                ds dsVar21 = this.b;
                Map gv = dsVar21.gv();
                com.google.android.libraries.gsa.h.h hVar19 = (com.google.android.libraries.gsa.h.h) dsVar21.b.a();
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) dsVar21.f298a.g.a();
                return new com.google.android.apps.gsa.search.core.service.ay(new com.google.android.apps.gsa.search.core.service.d.i(gv, hVar19, aVar5, (com.google.android.apps.gsa.shared.logger.e) dsVar21.f298a.gF.a(), new com.google.android.apps.gsa.search.shared.service.d.a(), (p) dsVar21.f298a.gq.a(), (com.google.android.apps.gsa.w.a) dsVar21.f298a.gn.a()), c.b(this.b.aS), c.b(this.f297a.gj), (com.google.android.libraries.gsa.h.h) this.b.b.a(), (com.google.android.apps.gsa.search.core.service.d.o) this.b.aU.a(), at.k(c.b(this.b.aV)), c.b(this.f297a.gF));
            case 157:
                return new com.google.android.apps.gsa.contentprovider.a.a.a(this.b.az);
            case 158:
                return new mq(this.f297a, this.b);
            case 159:
                return new com.google.android.apps.gsa.staticplugins.h.a.a(this.b.aA);
            case 160:
                return new mj(this.b);
            case 161:
                return new com.google.android.apps.gsa.staticplugins.backup.b.b.a(this.b.aB);
            case 162:
                return new mq(this.f297a, this.b, (byte[]) null);
            case 163:
                return new com.google.android.apps.gsa.staticplugins.bisto.s.c.c(this.b.aC, 1);
            case 164:
                return new lm(this.f297a, this.b);
            case 165:
                return new com.google.android.apps.gsa.staticplugins.bisto.s.c.c(new mj(this.b), 0);
            case 166:
                final h hVar20 = this.b.aD;
                return new com.google.android.apps.gsa.search.core.service.d.h(hVar20) { // from class: com.google.android.apps.gsa.staticplugins.o.a.a

                    /* renamed from: a, reason: collision with root package name */
                    public final k.a.a f1729a;

                    {
                        this.f1729a = hVar20;
                    }

                    @Override // com.google.android.apps.gsa.search.core.service.d.h
                    public final com.google.android.apps.gsa.search.core.service.d.g a(com.google.android.apps.gsa.search.core.service.d.l lVar) {
                        au auVar = (au) this.f1729a.a();
                        return (com.google.android.apps.gsa.staticplugins.o.b.b) new aw(auVar.f292a, auVar.b).b.a();
                    }
                };
            case 167:
                return new au(this.f297a, this.b);
            case 168:
                return new com.google.android.apps.gsa.staticplugins.p.c.a(this.b.aE);
            case 169:
                return new lm(this.f297a, this.b);
            case 170:
                return new com.google.android.apps.gsa.staticplugins.x.a.a(this.b.aF);
            case 171:
                return new mj(this.b);
            case 172:
                return new com.google.android.apps.gsa.staticplugins.deeplink.a.a(this.b.aG);
            case 173:
                return new mq(this.f297a, this.b);
            case 174:
                return new com.google.android.apps.gsa.staticplugins.ae.a.a(this.b.aH);
            case 175:
                return new ls();
            case 176:
                return new com.google.android.apps.gsa.staticplugins.al.b.a.a(this.b.aI);
            case 177:
                return new mq(this.f297a, this.b);
            case 178:
                return new com.google.android.apps.gsa.staticplugins.mediabrowser.a.a(this.b.aJ);
            case 179:
                return new mq(this.f297a, this.b);
            case 180:
                return new com.google.android.apps.gsa.staticplugins.av.a.a(this.b.aK, 0);
            case 181:
                return new lm(this.f297a, this.b);
            case 182:
                return new com.google.android.apps.gsa.staticplugins.av.a.a(this.b.aK, 1);
            case 183:
                return new com.google.android.apps.gsa.staticplugins.ax.a.a(this.b.aL);
            case 184:
                return new mq(this.f297a, this.b);
            case 185:
                return new com.google.android.apps.gsa.staticplugins.opa.morris2.g.a.a(this.b.aM);
            case 186:
                return new mq(this.f297a, this.b);
            case 187:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.n.a.a(this.b.aN);
            case 188:
                return new lm(this.f297a, this.b);
            case 189:
                return new com.google.android.apps.gsa.staticplugins.opa.bd.b.a(new mq(this.f297a, this.b));
            case 190:
                return new com.google.android.apps.gsa.staticplugins.opa.bd.f.a.a(this.b.aO);
            case 191:
                return new mq(this.f297a, this.b);
            case 192:
                return new com.google.android.apps.gsa.staticplugins.opamediaplayer.a.b(this.b.aP, 1);
            case 193:
                return new mq(this.f297a, this.b);
            case 194:
                return new com.google.android.apps.gsa.staticplugins.opamediaplayer.a.b(this.b.aP, 0);
            case 195:
                return new com.google.android.apps.gsa.staticplugins.ba.e.a.a(new lm(this.f297a, this.b));
            case 196:
                return new com.google.android.apps.gsa.staticplugins.bf.a.a.a(this.b.aQ);
            case 197:
                return new mq(this.f297a, this.b);
            case 198:
                jo joVar10 = this.f297a;
                mq mqVar = new mq(joVar10, this.b);
                return new com.google.android.apps.gsa.staticplugins.search.a.a(mqVar);
            case 199:
                return new com.google.android.apps.gsa.staticplugins.smartspace.d.a(this.b.aR);
            default:
                throw new AssertionError(i);
        }
        return a2;
    }

    private final Object d() {
        final h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        jy jyVar;
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
        jy jyVar2;
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
        h hVar44;
        h hVar45;
        h hVar46;
        h hVar47;
        h hVar48;
        h hVar49;
        h hVar50;
        h hVar51;
        jy jyVar3;
        h hVar52;
        h hVar53;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        jy jyVar4;
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
        jy jyVar5;
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
        jy jyVar6;
        h hVar86;
        h hVar87;
        h hVar88;
        jy jyVar7;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        h hVar96;
        jy jyVar8;
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
        h hVar116;
        h hVar117;
        h hVar118;
        h hVar119;
        h hVar120;
        jy jyVar9;
        h hVar121;
        h hVar122;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        jy jyVar10;
        h hVar128;
        jy jyVar11;
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
        jy jyVar12;
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
        h hVar205;
        h hVar206;
        h hVar207;
        jy jyVar13;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        h hVar212;
        h hVar213;
        jy jyVar14;
        h hVar214;
        h hVar215;
        h hVar216;
        h hVar217;
        h hVar218;
        jy jyVar15;
        h hVar219;
        h hVar220;
        h hVar221;
        h hVar222;
        h hVar223;
        h hVar224;
        h hVar225;
        h hVar226;
        h hVar227;
        h hVar228;
        h hVar229;
        h hVar230;
        h hVar231;
        h hVar232;
        h hVar233;
        h hVar234;
        h hVar235;
        h hVar236;
        h hVar237;
        jy jyVar16;
        h hVar238;
        h hVar239;
        h hVar240;
        h hVar241;
        h hVar242;
        h hVar243;
        h hVar244;
        h hVar245;
        h hVar246;
        h hVar247;
        h hVar248;
        jy jyVar17;
        h hVar249;
        jy jyVar18;
        h hVar250;
        h hVar251;
        h hVar252;
        h hVar253;
        h hVar254;
        h hVar255;
        h hVar256;
        h hVar257;
        h hVar258;
        h hVar259;
        h hVar260;
        h hVar261;
        h hVar262;
        jy jyVar19;
        h hVar263;
        h hVar264;
        h hVar265;
        h hVar266;
        h hVar267;
        h hVar268;
        h hVar269;
        h hVar270;
        h hVar271;
        jy jyVar20;
        h hVar272;
        h hVar273;
        h hVar274;
        h hVar275;
        h hVar276;
        h hVar277;
        h hVar278;
        h hVar279;
        jy jyVar21;
        h hVar280;
        h hVar281;
        h hVar282;
        h hVar283;
        h hVar284;
        h hVar285;
        jy jyVar22;
        h hVar286;
        jy jyVar23;
        h hVar287;
        h hVar288;
        h hVar289;
        jy jyVar24;
        jy jyVar25;
        h hVar290;
        jy jyVar26;
        h hVar291;
        h hVar292;
        h hVar293;
        jy jyVar27;
        h hVar294;
        h hVar295;
        h hVar296;
        h hVar297;
        h hVar298;
        h hVar299;
        h hVar300;
        h hVar301;
        h hVar302;
        h hVar303;
        h hVar304;
        h hVar305;
        h hVar306;
        h hVar307;
        h hVar308;
        h hVar309;
        h hVar310;
        h hVar311;
        h hVar312;
        h hVar313;
        h hVar314;
        h hVar315;
        h hVar316;
        h hVar317;
        h hVar318;
        h hVar319;
        h hVar320;
        h hVar321;
        h hVar322;
        h hVar323;
        h hVar324;
        h hVar325;
        h hVar326;
        jy jyVar28;
        h hVar327;
        h hVar328;
        h hVar329;
        jy jyVar29;
        h hVar330;
        h hVar331;
        h hVar332;
        h hVar333;
        h hVar334;
        h hVar335;
        h hVar336;
        h hVar337;
        jy jyVar30;
        h hVar338;
        h hVar339;
        h hVar340;
        h hVar341;
        h hVar342;
        h hVar343;
        h hVar344;
        h hVar345;
        h hVar346;
        h hVar347;
        h hVar348;
        h hVar349;
        h hVar350;
        h hVar351;
        h hVar352;
        h hVar353;
        h hVar354;
        h hVar355;
        h hVar356;
        h hVar357;
        h hVar358;
        h hVar359;
        h hVar360;
        h hVar361;
        h hVar362;
        h hVar363;
        h hVar364;
        h hVar365;
        h hVar366;
        h hVar367;
        h hVar368;
        h hVar369;
        h hVar370;
        h hVar371;
        h hVar372;
        h hVar373;
        h hVar374;
        h hVar375;
        h hVar376;
        h hVar377;
        h hVar378;
        h hVar379;
        h hVar380;
        h hVar381;
        h hVar382;
        h hVar383;
        h hVar384;
        h hVar385;
        h hVar386;
        h hVar387;
        h hVar388;
        int i = this.c;
        switch (i) {
            case 200:
                return new mq(this.f297a, this.b);
            case 201:
                hVar = this.b.gs;
                return new com.google.android.apps.gsa.search.core.service.d.h(hVar) { // from class: com.google.android.apps.gsa.staticplugins.bu.a.a

                    /* renamed from: a, reason: collision with root package name */
                    public final k.a.a f1638a;

                    {
                        this.f1638a = hVar;
                    }

                    @Override // com.google.android.apps.gsa.search.core.service.d.h
                    public final com.google.android.apps.gsa.search.core.service.d.g a(com.google.android.apps.gsa.search.core.service.d.l lVar) {
                        mq mqVar = (mq) this.f1638a.a();
                        return (com.google.android.apps.gsa.search.core.service.d.g) c.c(new cl((jo) mqVar.a, mqVar.b, 0)).a();
                    }
                };
            case 202:
                return new mq(this.f297a, this.b);
            case 203:
                hVar2 = this.b.gu;
                return new com.google.android.apps.gsa.staticplugins.cg.a.a(hVar2);
            case 204:
                return new mj(this.b);
            case 205:
                hVar3 = this.b.gw;
                return new com.google.android.apps.gsa.tasks.b.a.a(hVar3);
            case 206:
                return new mq(this.f297a, this.b);
            case 207:
                hVar4 = this.b.gy;
                return new com.google.android.apps.gsa.staticplugins.nga.s.b.a(hVar4);
            case 208:
                return new lm(this.f297a, this.b);
            case 209:
                jyVar = this.f297a.f319a;
                hVar5 = jyVar.uW;
                com.google.android.apps.gsa.search.core.o.a aVar = (com.google.android.apps.gsa.search.core.o.a) hVar5.a();
                hVar6 = this.f297a.g;
                return new com.google.android.apps.gsa.search.core.o.b(aVar, (com.google.android.libraries.g.a) hVar6.a());
            case 210:
                hVar7 = this.b.aT;
                j jVar = (j) hVar7.a();
                hVar8 = this.b.gA;
                return new com.google.android.apps.gsa.search.core.service.d.o(jVar, (com.google.android.apps.gsa.search.core.service.d.a) hVar8.a());
            case 211:
                hVar9 = this.f297a.gq;
                return new j((p) hVar9.a());
            case 212:
                return new com.google.android.apps.gsa.search.core.service.d.a();
            case 213:
                LongSparseArray longSparseArray = new LongSparseArray();
                ds dsVar = this.b;
                jo joVar = this.f297a;
                com.google.android.apps.gsa.staticplugins.bp.c.a gH = dsVar.gH();
                com.google.android.apps.gsa.staticplugins.bp.c.b gO = dsVar.gO();
                com.google.android.apps.gsa.staticplugins.bp.c.b gG = dsVar.gG();
                hVar10 = joVar.nz;
                return new com.google.android.apps.gsa.staticplugins.bp.a.b(longSparseArray, gH, gO, gG, (com.google.android.apps.gsa.search.core.y.a.a) hVar10.a());
            case 214:
                hVar11 = this.f297a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar2 = (com.google.android.apps.gsa.search.core.y.a.a) hVar11.a();
                hVar12 = this.f297a.f;
                return com.google.android.apps.gsa.staticplugins.bp.c.c.b(aVar2, (Context) hVar12.a());
            case 215:
                hVar13 = this.f297a.f;
                Context context = (Context) hVar13.a();
                hVar14 = this.b.n;
                com.google.android.apps.gsa.shared.v.ae aeVar = (com.google.android.apps.gsa.shared.v.ae) hVar14.a();
                hVar15 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar389 = (com.google.android.libraries.gsa.h.h) hVar15.a();
                hVar16 = this.f297a.gB;
                an anVar = (an) hVar16.a();
                hVar17 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.l.af(context, aeVar, hVar389, anVar, (p) hVar17.a());
            case 216:
                hVar18 = this.f297a.f;
                return com.google.android.apps.gsa.staticplugins.l.a.c.c((Context) hVar18.a());
            case 217:
                ds dsVar2 = this.b;
                jo joVar2 = this.f297a;
                com.google.android.apps.gsa.staticplugins.l.p aG = dsVar2.aG();
                com.google.android.apps.gsa.staticplugins.l.s aH = dsVar2.aH();
                hVar19 = joVar2.gF;
                return com.google.android.apps.gsa.staticplugins.l.a.c.b(aG, aH, (com.google.android.apps.gsa.shared.logger.e) hVar19.a());
            case 218:
                ds dsVar3 = this.b;
                jo joVar3 = this.f297a;
                com.google.android.apps.gsa.staticplugins.l.p aG2 = dsVar3.aG();
                com.google.android.apps.gsa.staticplugins.l.s aH2 = dsVar3.aH();
                hVar20 = joVar3.gF;
                return com.google.android.apps.gsa.staticplugins.l.a.c.d(aG2, aH2, (com.google.android.apps.gsa.shared.logger.e) hVar20.a());
            case 219:
                ds dsVar4 = this.b;
                jo joVar4 = this.f297a;
                com.google.android.apps.gsa.staticplugins.l.p aG3 = dsVar4.aG();
                com.google.android.apps.gsa.staticplugins.l.b.p aI = dsVar4.aI();
                hVar21 = joVar4.gF;
                return com.google.android.apps.gsa.staticplugins.l.a.c.f(aG3, aI, (com.google.android.apps.gsa.shared.logger.e) hVar21.a());
            case 220:
                hVar22 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bp.a.m(c.b(hVar22));
            case 221:
                ds dsVar5 = this.b;
                jo joVar5 = this.f297a;
                com.google.android.apps.gsa.staticplugins.l.p aG4 = dsVar5.aG();
                com.google.android.apps.gsa.staticplugins.l.b.p aI2 = dsVar5.aI();
                hVar23 = joVar5.gF;
                return com.google.android.apps.gsa.staticplugins.l.a.c.e(aG4, aI2, (com.google.android.apps.gsa.shared.logger.e) hVar23.a());
            case 222:
                com.google.android.apps.gsa.staticplugins.m.a.a aVar3 = new com.google.android.apps.gsa.staticplugins.m.a.a();
                hVar24 = this.f297a.gA;
                return new com.google.android.apps.gsa.staticplugins.m.a.c(aVar3, (com.google.android.libraries.gsa.h.h) hVar24.a());
            case 223:
                hVar25 = this.f297a.f;
                Context context2 = (Context) hVar25.a();
                hVar26 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar390 = (com.google.android.libraries.gsa.h.h) hVar26.a();
                Object gh = this.b.gh();
                com.google.android.apps.gsa.staticplugins.n.f fVar = new com.google.android.apps.gsa.staticplugins.n.f();
                hVar27 = this.b.p;
                return new com.google.android.apps.gsa.staticplugins.n.e(context2, hVar390, (com.google.android.apps.gsa.staticplugins.n.b) gh, fVar, c.b(hVar27));
            case 224:
                hVar28 = this.f297a.f;
                Context context3 = (Context) hVar28.a();
                hVar29 = this.f297a.gf;
                SharedPreferences sharedPreferences = (SharedPreferences) hVar29.a();
                jyVar2 = this.f297a.f319a;
                hVar30 = jyVar2.by;
                at atVar = (at) hVar30.a();
                hVar31 = this.f297a.gB;
                an anVar2 = (an) hVar31.a();
                hVar32 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar391 = (com.google.android.libraries.gsa.h.h) hVar32.a();
                hVar33 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar392 = (com.google.android.libraries.gsa.h.h) hVar33.a();
                hVar34 = this.f297a.g;
                hVar35 = this.b.gH;
                a b = c.b(hVar35);
                jo joVar6 = this.f297a;
                ds dsVar6 = this.b;
                com.google.android.apps.gsa.search.core.ac.af da = joVar6.da();
                com.google.android.apps.gsa.staticplugins.bisto.t.e aJ = dsVar6.aJ();
                hVar36 = joVar6.gV;
                a b2 = c.b(hVar36);
                hVar37 = this.f297a.nF;
                com.google.android.apps.gsa.assistant.settings.devices.d.b.l lVar = (com.google.android.apps.gsa.assistant.settings.devices.d.b.l) hVar37.a();
                hVar38 = this.f297a.io;
                com.google.android.apps.gsa.assist.a.k kVar = (com.google.android.apps.gsa.assist.a.k) hVar38.a();
                hVar39 = this.f297a.qQ;
                ds dsVar7 = this.b;
                jo joVar7 = this.f297a;
                ProxyPermissionsRequester aE = dsVar7.aE();
                hVar40 = joVar7.v;
                cr crVar = (cr) hVar40.a();
                ds dsVar8 = this.b;
                return new com.google.android.apps.gsa.staticplugins.bisto.w.i(context3, sharedPreferences, atVar, anVar2, hVar391, hVar392, b, da, aJ, b2, lVar, kVar, aE, crVar, dsVar8.bF(), (com.google.android.apps.search.assistant.surfaces.bisto.a.f.l) dsVar8.gi());
            case 225:
                ds dsVar9 = this.b;
                jo joVar8 = this.f297a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p bE = dsVar9.bE();
                hVar41 = joVar8.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds(bE, (Executor) hVar41.a());
            case 226:
                jo joVar9 = this.f297a;
                lz lzVar = new lz(joVar9, this.b, (byte[]) null);
                hVar42 = joVar9.nz;
                return new com.google.android.apps.gsa.staticplugins.p.h.b(lzVar, (com.google.android.apps.gsa.search.core.y.a.a) hVar42.a());
            case 227:
                hVar43 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar393 = (com.google.android.libraries.gsa.h.h) hVar43.a();
                hVar44 = this.f297a.h;
                PackageManager packageManager = (PackageManager) hVar44.a();
                hVar45 = this.f297a.gi;
                String str = (String) hVar45.a();
                hVar46 = this.b.gK;
                return new com.google.android.apps.gsa.staticplugins.q.b(hVar393, packageManager, str, hVar46);
            case 228:
                return com.google.android.apps.gsa.staticplugins.q.a.b.b();
            case 229:
                hVar47 = this.b.p;
                return new com.google.android.apps.gsa.staticplugins.v.a((com.google.android.apps.gsa.search.core.service.x) hVar47.a());
            case 230:
                hVar48 = this.b.r;
                return new com.google.android.apps.gsa.staticplugins.x.a((com.google.android.apps.gsa.shared.util.o.g) hVar48.a());
            case 231:
                hVar49 = this.f297a.gq;
                p pVar = (p) hVar49.a();
                hVar50 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar = (com.google.android.apps.gsa.search.core.service.x) hVar50.a();
                hVar51 = this.b.aW;
                a b3 = c.b(hVar51);
                jyVar3 = this.f297a.f319a;
                hVar52 = jyVar3.uY;
                com.google.android.apps.gsa.shared.logger.a.a aVar4 = (com.google.android.apps.gsa.shared.logger.a.a) hVar52.a();
                hVar53 = this.f297a.gR;
                a b4 = c.b(hVar53);
                hVar54 = this.f297a.hc;
                a b5 = c.b(hVar54);
                hVar55 = this.b.b;
                return new com.google.android.apps.gsa.staticplugins.deeplink.e.c(pVar, xVar, b3, aVar4, b4, b5, (com.google.android.libraries.gsa.h.h) hVar55.a());
            case 232:
                hVar56 = this.f297a.f;
                Context context4 = (Context) hVar56.a();
                hVar57 = this.b.j;
                f fVar2 = (f) hVar57.a();
                jyVar4 = this.f297a.f319a;
                hVar58 = jyVar4.S;
                a b6 = c.b(hVar58);
                hVar59 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.deeplink.e.a(context4, fVar2, b6, (p) hVar59.a());
            case 233:
                hVar60 = this.b.j;
                return new com.google.android.apps.gsa.staticplugins.deeplink.e.d((f) hVar60.a());
            case 234:
                hVar61 = this.b.j;
                f fVar3 = (f) hVar61.a();
                hVar62 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.deeplink.e.e(fVar3, (p) hVar62.a());
            case 235:
                hVar63 = this.b.r;
                return new com.google.android.apps.gsa.staticplugins.deeplink.e.f((com.google.android.apps.gsa.shared.util.o.g) hVar63.a());
            case 236:
                hVar64 = this.f297a.gB;
                an anVar3 = (an) hVar64.a();
                hVar65 = this.f297a.f;
                Context context5 = (Context) hVar65.a();
                hVar66 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar394 = (com.google.android.libraries.gsa.h.h) hVar66.a();
                hVar67 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar395 = (com.google.android.libraries.gsa.h.h) hVar67.a();
                hVar68 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar396 = (com.google.android.libraries.gsa.h.h) hVar68.a();
                jyVar5 = this.f297a.f319a;
                hVar69 = jyVar5.gl;
                Object a2 = hVar69.a();
                hVar70 = this.f297a.ly;
                com.google.android.apps.gsa.l.b bVar = (com.google.android.apps.gsa.l.b) hVar70.a();
                hVar71 = this.f297a.gq;
                p pVar2 = (p) hVar71.a();
                hVar72 = this.f297a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar72.a();
                hVar73 = this.f297a.kG;
                hVar74 = this.b.gU;
                com.google.android.apps.gsa.staticplugins.y.a.f fVar4 = (com.google.android.apps.gsa.staticplugins.y.a.f) hVar74.a();
                hVar75 = this.f297a.lz;
                return com.google.android.apps.gsa.staticplugins.y.m.b(anVar3, context5, hVar394, hVar395, hVar396, a2, bVar, pVar2, aVar5, fVar4, (com.google.android.apps.gsa.l.g.f) hVar75.a(), this.f297a.ab());
            case 237:
                hVar76 = this.b.gT;
                com.google.android.libraries.storage.protostore.cg cgVar = (com.google.android.libraries.storage.protostore.cg) hVar76.a();
                hVar77 = this.f297a.gp;
                return new com.google.android.apps.gsa.staticplugins.y.a.f(cgVar, (com.google.android.libraries.gsa.h.h) hVar77.a());
            case 238:
                hVar78 = this.f297a.f;
                Context context6 = (Context) hVar78.a();
                hVar79 = this.f297a.aA;
                return com.google.android.apps.gsa.staticplugins.y.b.a.b(context6, (com.google.android.libraries.storage.protostore.af) hVar79.a());
            case 239:
                hVar80 = this.f297a.f;
                hVar81 = this.f297a.oh;
                hVar82 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar397 = (com.google.android.libraries.gsa.h.h) hVar82.a();
                hVar83 = this.f297a.hM;
                com.google.android.apps.gsa.search.core.google.ai aiVar = (com.google.android.apps.gsa.search.core.google.ai) hVar83.a();
                hVar84 = this.f297a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar6 = (com.google.android.apps.gsa.search.core.y.a.a) hVar84.a();
                hVar85 = this.b.G;
                return new com.google.android.apps.gsa.staticplugins.ab.f(hVar397, aiVar, aVar6, (com.google.android.apps.gsa.search.core.q.a.i) hVar85.a());
            case 240:
                jyVar6 = this.f297a.f319a;
                hVar86 = jyVar6.uZ;
                com.google.android.apps.gsa.j.a aVar7 = (com.google.android.apps.gsa.j.a) hVar86.a();
                hVar87 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar398 = (com.google.android.libraries.gsa.h.h) hVar87.a();
                hVar88 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.ad.c(aVar7, hVar398, (p) hVar88.a());
            case 241:
                ds dsVar10 = this.b;
                jo joVar10 = this.f297a;
                com.google.android.apps.gsa.staticplugins.af.a.a gF = dsVar10.gF();
                jyVar7 = joVar10.f319a;
                hVar89 = jyVar7.va;
                c.b(hVar89);
                hVar90 = this.f297a.gq;
                p pVar3 = (p) hVar90.a();
                hVar91 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar2 = (com.google.android.apps.gsa.search.core.service.x) hVar91.a();
                hVar92 = this.f297a.gA;
                return new com.google.android.apps.gsa.staticplugins.af.a(gF, pVar3, xVar2);
            case 242:
                hVar93 = this.f297a.f;
                Context context7 = (Context) hVar93.a();
                hVar94 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar3 = (com.google.android.apps.gsa.search.core.service.x) hVar94.a();
                hVar95 = this.f297a.kg;
                t tVar = (t) hVar95.a();
                hVar96 = this.b.hb;
                com.google.android.apps.gsa.handsfree.h hVar399 = (com.google.android.apps.gsa.handsfree.h) hVar96.a();
                ds dsVar11 = this.b;
                jo joVar11 = this.f297a;
                com.google.android.apps.gsa.search.core.ac.s w = dsVar11.w();
                jyVar8 = joVar11.f319a;
                hVar97 = jyVar8.gz;
                a b7 = c.b(hVar97);
                hVar98 = this.f297a.gB;
                a b8 = c.b(hVar98);
                hVar99 = this.f297a.gt;
                a b9 = c.b(hVar99);
                hVar100 = this.f297a.iq;
                c.b(hVar100);
                hVar101 = this.f297a.gr;
                a b10 = c.b(hVar101);
                ds dsVar12 = this.b;
                jo joVar12 = this.f297a;
                com.google.android.apps.gsa.handsfree.j i2 = dsVar12.i();
                hVar102 = joVar12.oh;
                at atVar2 = (at) hVar102.a();
                hVar103 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar4 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar103.a();
                hVar104 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar400 = (com.google.android.libraries.gsa.h.h) hVar104.a();
                hVar105 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar401 = (com.google.android.libraries.gsa.h.h) hVar105.a();
                hVar106 = this.b.be;
                ai aiVar2 = (ai) hVar106.a();
                hVar107 = this.b.bg;
                a b11 = c.b(hVar107);
                hVar108 = this.b.w;
                com.google.android.apps.gsa.search.core.state.d.q qVar = (com.google.android.apps.gsa.search.core.state.d.q) hVar108.a();
                hVar109 = this.b.k;
                com.google.android.apps.gsa.search.core.state.d.t tVar2 = (com.google.android.apps.gsa.search.core.state.d.t) hVar109.a();
                hVar110 = this.b.e;
                com.google.android.apps.gsa.search.core.state.d.h hVar402 = (com.google.android.apps.gsa.search.core.state.d.h) hVar110.a();
                hVar111 = this.f297a.nu;
                a b12 = c.b(hVar111);
                hVar112 = this.f297a.nW;
                a b13 = c.b(hVar112);
                hVar113 = this.f297a.hG;
                com.google.android.apps.gsa.shared.logger.b.h hVar403 = (com.google.android.apps.gsa.shared.logger.b.h) hVar113.a();
                hVar114 = this.f297a.gq;
                p pVar4 = (p) hVar114.a();
                hVar115 = this.b.bh;
                a b14 = c.b(hVar115);
                hVar116 = this.b.aW;
                com.google.android.apps.gsa.search.core.service.ay ayVar = (com.google.android.apps.gsa.search.core.service.ay) hVar116.a();
                hVar117 = this.f297a.pn;
                at atVar3 = (at) hVar117.a();
                hVar118 = this.b.F;
                at atVar4 = (at) hVar118.a();
                hVar119 = this.f297a.mS;
                at k = at.k((com.google.android.apps.gsa.assistant.shared.u) hVar119.a());
                hVar120 = this.f297a.wg;
                at atVar5 = (at) hVar120.a();
                jyVar9 = this.f297a.f319a;
                hVar121 = jyVar9.vh;
                return new com.google.android.apps.gsa.staticplugins.ai.i(context7, xVar3, tVar, hVar399, w, b7, b8, b9, b10, i2, atVar2, anVar4, hVar400, hVar401, aiVar2, b11, qVar, tVar2, hVar402, b12, b13, hVar403, pVar4, b14, ayVar, atVar3, atVar4, k, atVar5, at.k((com.google.android.apps.gsa.staticplugins.nga.a.b.a) hVar121.a()), this.f297a.kl());
            case 243:
                hVar122 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar5 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar122.a();
                hVar123 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar404 = (com.google.android.libraries.gsa.h.h) hVar123.a();
                hVar124 = this.f297a.f;
                Context context8 = (Context) hVar124.a();
                hVar125 = this.f297a.cZ;
                jo joVar13 = this.f297a;
                ds dsVar13 = this.b;
                joVar13.X();
                hVar126 = dsVar13.gZ;
                com.google.android.apps.gsa.handsfree.a aVar8 = (com.google.android.apps.gsa.handsfree.a) hVar126.a();
                hVar127 = this.b.d;
                cp cpVar = (cp) hVar127.a();
                jyVar10 = this.f297a.f319a;
                hVar128 = jyVar10.gx;
                a b15 = c.b(hVar128);
                jyVar11 = this.f297a.f319a;
                hVar129 = jyVar11.gq;
                com.google.android.apps.gsa.speech.audio.e.h hVar405 = (com.google.android.apps.gsa.speech.audio.e.h) hVar129.a();
                hVar130 = this.f297a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar130.a();
                hVar131 = this.f297a.oZ;
                a b16 = c.b(hVar131);
                hVar132 = this.b.ha;
                MessageBuffer messageBuffer = (MessageBuffer) hVar132.a();
                hVar133 = this.b.e;
                c.b(hVar133);
                hVar134 = this.b.u;
                a b17 = c.b(hVar134);
                hVar135 = this.b.z;
                return new com.google.android.apps.gsa.handsfree.h(anVar5, hVar404, context8, aVar8, cpVar, b15, hVar405, aVar9, b16, messageBuffer, b17, c.b(hVar135));
            case 244:
                hVar136 = this.f297a.gV;
                com.google.android.apps.gsa.speech.o.g gVar = (com.google.android.apps.gsa.speech.o.g) hVar136.a();
                hVar137 = this.f297a.g;
                return new com.google.android.apps.gsa.handsfree.a(gVar, (com.google.android.libraries.g.a) hVar137.a());
            case 245:
                return new MessageBuffer();
            case 246:
                hVar138 = this.f297a.f;
                Context context9 = (Context) hVar138.a();
                hVar139 = this.f297a.gq;
                p pVar5 = (p) hVar139.a();
                hVar140 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar = (com.google.android.apps.gsa.assistant.shared.z) hVar140.a();
                hVar141 = this.f297a.gY;
                hVar142 = this.f297a.mS;
                at k2 = at.k((com.google.android.apps.gsa.assistant.shared.u) hVar142.a());
                hVar143 = this.b.bf;
                at atVar6 = (at) hVar143.a();
                hVar144 = this.f297a.kg;
                t tVar3 = (t) hVar144.a();
                hVar145 = this.b.k;
                com.google.android.apps.gsa.search.core.state.d.t tVar4 = (com.google.android.apps.gsa.search.core.state.d.t) hVar145.a();
                hVar146 = this.f297a.mW;
                return new com.google.android.apps.gsa.search.core.ac.ai(context9, pVar5, zVar, k2, atVar6, tVar3, tVar4, at.k((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) hVar146.a()));
            case 247:
                hVar147 = this.f297a.qt;
                return at.k((com.google.android.apps.gsa.assistant.shared.v) hVar147.a());
            case 248:
                hVar148 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.u.a.a(c.b(hVar148));
            case 249:
                ds dsVar14 = this.b;
                jo joVar14 = this.f297a;
                Object gk = dsVar14.gk();
                hVar149 = joVar14.gz;
                com.google.android.libraries.gsa.h.h hVar406 = (com.google.android.libraries.gsa.h.h) hVar149.a();
                hVar150 = this.b.b;
                return new com.google.android.apps.gsa.staticplugins.al.p((com.google.android.apps.gsa.staticplugins.al.d) gk, hVar406, (com.google.android.libraries.gsa.h.h) hVar150.a());
            case 250:
                hVar151 = this.f297a.f;
                Context context10 = (Context) hVar151.a();
                hVar152 = this.f297a.g;
                com.google.android.libraries.g.a aVar10 = (com.google.android.libraries.g.a) hVar152.a();
                hVar153 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar407 = (com.google.android.libraries.gsa.h.h) hVar153.a();
                hVar154 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar408 = (com.google.android.libraries.gsa.h.h) hVar154.a();
                hVar155 = this.b.G;
                a b18 = c.b(hVar155);
                hVar156 = this.b.he;
                a b19 = c.b(hVar156);
                hVar157 = this.f297a.nz;
                return new com.google.android.apps.gsa.staticplugins.am.i(context10, aVar10, hVar407, hVar408, b18, b19, (com.google.android.apps.gsa.search.core.y.a.a) hVar157.a());
            case 251:
                hVar158 = this.b.n;
                com.google.android.apps.gsa.shared.v.ae aeVar2 = (com.google.android.apps.gsa.shared.v.ae) hVar158.a();
                hVar159 = this.f297a.gA;
                return new com.google.android.apps.gsa.staticplugins.am.e(aeVar2, (com.google.android.libraries.gsa.h.h) hVar159.a());
            case 252:
                hVar160 = this.f297a.g;
                a b20 = c.b(hVar160);
                hVar161 = this.b.p;
                a b21 = c.b(hVar161);
                hVar162 = this.f297a.hD;
                a b22 = c.b(hVar162);
                hVar163 = this.f297a.gf;
                c.b(hVar163);
                hVar164 = this.f297a.f;
                return new com.google.android.apps.gsa.staticplugins.ap.a(b20, b21, b22);
            case 253:
                hVar165 = this.b.p;
                return new com.google.android.apps.gsa.staticplugins.aq.a((com.google.android.apps.gsa.search.core.service.x) hVar165.a());
            case 254:
                hVar166 = this.f297a.f;
                Context context11 = (Context) hVar166.a();
                hVar167 = this.f297a.gq;
                p pVar6 = (p) hVar167.a();
                hVar168 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar409 = (com.google.android.libraries.gsa.h.h) hVar168.a();
                hVar169 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar410 = (com.google.android.libraries.gsa.h.h) hVar169.a();
                hVar170 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar411 = (com.google.android.libraries.gsa.h.h) hVar170.a();
                hVar171 = this.f297a.oZ;
                return new com.google.android.apps.gsa.staticplugins.as.d(context11, pVar6, hVar409, hVar410, hVar411, c.b(hVar171));
            case 255:
                hVar172 = this.b.p;
                return new com.google.android.apps.gsa.staticplugins.at.a(c.b(hVar172));
            case 256:
                hVar173 = this.f297a.f;
                Context context12 = (Context) hVar173.a();
                hVar174 = this.b.e;
                com.google.android.apps.gsa.search.core.state.d.h hVar412 = (com.google.android.apps.gsa.search.core.state.d.h) hVar174.a();
                hVar175 = this.b.er;
                com.google.android.apps.gsa.search.core.state.d.ae aeVar3 = (com.google.android.apps.gsa.search.core.state.d.ae) hVar175.a();
                hVar176 = this.b.k;
                com.google.android.apps.gsa.search.core.state.d.t tVar5 = (com.google.android.apps.gsa.search.core.state.d.t) hVar176.a();
                hVar177 = this.b.be;
                ai aiVar3 = (ai) hVar177.a();
                hVar178 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar413 = (com.google.android.libraries.gsa.h.h) hVar178.a();
                hVar179 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar414 = (com.google.android.libraries.gsa.h.h) hVar179.a();
                hVar180 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar415 = (com.google.android.libraries.gsa.h.h) hVar180.a();
                hVar181 = this.f297a.gq;
                p pVar7 = (p) hVar181.a();
                hVar182 = this.f297a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar182.a();
                hVar183 = this.f297a.nW;
                com.google.android.apps.gsa.search.core.j.a aVar12 = (com.google.android.apps.gsa.search.core.j.a) hVar183.a();
                hVar184 = this.f297a.cZ;
                AudioManager audioManager = (AudioManager) hVar184.a();
                jyVar12 = this.f297a.f319a;
                hVar185 = jyVar12.vi;
                com.google.android.apps.gsa.speech.audio.n nVar = (com.google.android.apps.gsa.speech.audio.n) hVar185.a();
                hVar186 = this.f297a.kg;
                t tVar6 = (t) hVar186.a();
                hVar187 = this.f297a.gV;
                com.google.android.apps.gsa.speech.o.g gVar2 = (com.google.android.apps.gsa.speech.o.g) hVar187.a();
                hVar188 = this.b.bg;
                com.google.android.apps.gsa.search.core.ac.ai aiVar4 = (com.google.android.apps.gsa.search.core.ac.ai) hVar188.a();
                hVar189 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar4 = (com.google.android.apps.gsa.search.core.service.x) hVar189.a();
                hVar190 = this.f297a.gB;
                an anVar6 = (an) hVar190.a();
                hVar191 = this.f297a.Fw;
                a b23 = c.b(hVar191);
                hVar192 = this.f297a.hS;
                a b24 = c.b(hVar192);
                hVar193 = this.f297a.gf;
                SharedPreferences sharedPreferences2 = (SharedPreferences) hVar193.a();
                hVar194 = this.b.r;
                a b25 = c.b(hVar194);
                hVar195 = this.f297a.hY;
                a b26 = c.b(hVar195);
                hVar196 = this.b.hn;
                a b27 = c.b(hVar196);
                hVar197 = this.f297a.hX;
                a b28 = c.b(hVar197);
                hVar198 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar2 = (com.google.android.apps.gsa.assistant.shared.z) hVar198.a();
                hVar199 = this.b.aW;
                a b29 = c.b(hVar199);
                hVar200 = this.f297a.oh;
                at atVar7 = (at) hVar200.a();
                hVar201 = this.f297a.hG;
                a b30 = c.b(hVar201);
                hVar202 = this.f297a.pn;
                at atVar8 = (at) hVar202.a();
                hVar203 = this.f297a.gm;
                hVar204 = this.f297a.hi;
                boolean booleanValue = ((Boolean) hVar204.a()).booleanValue();
                hVar205 = this.b.i;
                a b31 = c.b(hVar205);
                ds dsVar15 = this.b;
                jo joVar15 = this.f297a;
                com.google.android.apps.gsa.speech.audio.e aF = dsVar15.aF();
                com.google.android.apps.gsa.staticplugins.au.b aN = dsVar15.aN();
                at k3 = at.k(joVar15.nE());
                hVar206 = this.f297a.mS;
                at k4 = at.k((com.google.android.apps.gsa.assistant.shared.u) hVar206.a());
                hVar207 = this.f297a.gY;
                a b32 = c.b(hVar207);
                jyVar13 = this.f297a.f319a;
                hVar208 = jyVar13.gB;
                a b33 = c.b(hVar208);
                hVar209 = this.f297a.gn;
                a b34 = c.b(hVar209);
                hVar210 = this.b.bi;
                com.google.android.apps.gsa.shared.speech.a.i iVar = (com.google.android.apps.gsa.shared.speech.a.i) hVar210.a();
                hVar211 = this.f297a.Do;
                com.google.android.libraries.assistant.auto.jumpboost.b.g.a aVar13 = (com.google.android.libraries.assistant.auto.jumpboost.b.g.a) hVar211.a();
                hVar212 = this.f297a.el;
                com.google.android.libraries.assistant.auto.tng.j.a.a.a aVar14 = (com.google.android.libraries.assistant.auto.tng.j.a.a.a) hVar212.a();
                hVar213 = this.f297a.mW;
                a b35 = c.b(hVar213);
                jyVar14 = this.f297a.f319a;
                hVar214 = jyVar14.eY;
                return new com.google.android.apps.gsa.staticplugins.au.l(context12, hVar412, aeVar3, tVar5, aiVar3, hVar413, hVar414, hVar415, pVar7, aVar11, aVar12, audioManager, nVar, tVar6, gVar2, aiVar4, xVar4, anVar6, b23, b24, sharedPreferences2, b25, b26, b27, b28, zVar2, b29, atVar7, b30, atVar8, booleanValue, b31, aF, aN, k3, k4, b32, b33, b34, iVar, aVar13, aVar14, b35, at.k((com.google.android.apps.gsa.nga.shared.q.h) hVar214.a()));
            case 257:
                ds dsVar16 = this.b;
                Object go = dsVar16.go();
                hVar215 = dsVar16.hm;
                return new com.google.android.apps.gsa.speech.n.h((com.google.android.apps.gsa.speech.n.c) go, (com.google.android.apps.gsa.speech.n.e) hVar215.a(), this.b.aj());
            case 258:
                hVar216 = this.b.hk;
                a b36 = c.b(hVar216);
                hVar217 = this.b.hl;
                return new com.google.android.apps.gsa.speech.n.e(b36, c.b(hVar217));
            case 259:
                hVar218 = this.f297a.f;
                return new com.google.android.apps.gsa.speech.n.a((Context) hVar218.a());
            case 260:
                return new com.google.android.apps.gsa.speech.n.b();
            case 261:
                jyVar15 = this.f297a.f319a;
                hVar219 = jyVar15.eW;
                return new com.google.android.apps.gsa.shared.speech.a.i((com.google.android.libraries.storage.protostore.cg) hVar219.a());
            case 262:
                hVar220 = this.b.er;
                com.google.android.apps.gsa.search.core.state.d.ae aeVar4 = (com.google.android.apps.gsa.search.core.state.d.ae) hVar220.a();
                hVar221 = this.b.b;
                return new com.google.android.apps.gsa.staticplugins.au.n(aeVar4, (com.google.android.libraries.gsa.h.h) hVar221.a());
            case 263:
                hVar222 = this.f297a.hD;
                com.google.android.libraries.gsa.c.a.a.t tVar7 = (com.google.android.libraries.gsa.c.a.a.t) hVar222.a();
                hVar223 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar416 = (com.google.android.libraries.gsa.h.h) hVar223.a();
                hVar224 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar5 = (com.google.android.apps.gsa.search.core.service.x) hVar224.a();
                hVar225 = this.f297a.f;
                hVar226 = this.b.bj;
                com.google.android.apps.gsa.search.core.state.d.l lVar2 = (com.google.android.apps.gsa.search.core.state.d.l) hVar226.a();
                hVar227 = this.f297a.gf;
                return new com.google.android.apps.gsa.staticplugins.aw.d(tVar7, hVar416, xVar5, lVar2, c.b(hVar227));
            case 264:
                hVar228 = this.b.em;
                a b37 = c.b(hVar228);
                hVar229 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.l(b37);
            case 265:
                hVar230 = this.f297a.f;
                Context context13 = (Context) hVar230.a();
                hVar231 = this.f297a.py;
                com.google.android.apps.gsa.shared.f.e eVar = (com.google.android.apps.gsa.shared.f.e) hVar231.a();
                hVar232 = this.f297a.gq;
                p pVar8 = (p) hVar232.a();
                hVar233 = this.f297a.g;
                com.google.android.libraries.g.a aVar15 = (com.google.android.libraries.g.a) hVar233.a();
                hVar234 = this.f297a.gf;
                SharedPreferences sharedPreferences3 = (SharedPreferences) hVar234.a();
                hVar235 = this.f297a.iq;
                ab abVar = (ab) hVar235.a();
                hVar236 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar417 = (com.google.android.libraries.gsa.h.h) hVar236.a();
                hVar237 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar6 = (com.google.android.apps.gsa.search.core.service.x) hVar237.a();
                jyVar16 = this.f297a.f319a;
                hVar238 = jyVar16.vj;
                com.google.android.apps.gsa.shared.notificationlistening.collection.a.f fVar5 = (com.google.android.apps.gsa.shared.notificationlistening.collection.a.f) hVar238.a();
                ds dsVar17 = this.b;
                jo joVar16 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.by.d av = dsVar17.av();
                hVar239 = joVar16.gi;
                String str2 = (String) hVar239.a();
                hVar240 = this.f297a.gY;
                hVar241 = this.f297a.pz;
                return new com.google.android.apps.gsa.staticplugins.ax.d(context13, eVar, pVar8, aVar15, sharedPreferences3, abVar, hVar417, xVar6, fVar5, av, str2, (com.google.android.apps.gsa.shared.notificationlistening.collection.a.z) hVar241.a());
            case 266:
                return new com.google.android.apps.gsa.staticplugins.opa.b.b.c.e(Optional.of(this.b.aT()));
            case 267:
                return new mm(this.f297a, this.b);
            case 268:
                hVar242 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar418 = (com.google.android.libraries.gsa.h.h) hVar242.a();
                hVar243 = this.f297a.oo;
                com.google.android.apps.gsa.shared.t.ac acVar = (com.google.android.apps.gsa.shared.t.ac) hVar243.a();
                hVar244 = this.f297a.f;
                Context context14 = (Context) hVar244.a();
                hVar245 = this.f297a.gu;
                return new com.google.android.apps.gsa.staticplugins.opa.ar.s(hVar418, acVar, context14, (com.google.android.apps.gsa.shared.util.c.a.aw) hVar245.a());
            case 269:
                hVar246 = this.b.hA;
                com.google.android.apps.gsa.staticplugins.opa.worker.proactive.au auVar = (com.google.android.apps.gsa.staticplugins.opa.worker.proactive.au) hVar246.a();
                hVar247 = this.b.j;
                f fVar6 = (f) hVar247.a();
                hVar248 = this.b.hB;
                com.google.android.apps.gsa.staticplugins.opa.at.p pVar9 = (com.google.android.apps.gsa.staticplugins.opa.at.p) hVar248.a();
                jyVar17 = this.f297a.f319a;
                hVar249 = jyVar17.gF;
                com.google.android.apps.gsa.opa.g.b.a aVar16 = (com.google.android.apps.gsa.opa.g.b.a) hVar249.a();
                jyVar18 = this.f297a.f319a;
                hVar250 = jyVar18.vo;
                com.google.android.apps.gsa.staticplugins.opa.at.m mVar = (com.google.android.apps.gsa.staticplugins.opa.at.m) hVar250.a();
                ds dsVar18 = this.b;
                jo joVar17 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.g.h C = dsVar18.C();
                hVar251 = joVar17.in;
                return new com.google.android.apps.gsa.staticplugins.opa.at.q(auVar, fVar6, pVar9, aVar16, mVar, C, (com.google.android.libraries.search.assistant.proactive.h.c) hVar251.a());
            case 270:
                hVar252 = this.f297a.f;
                Context context15 = (Context) hVar252.a();
                hVar253 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar419 = (com.google.android.libraries.gsa.h.h) hVar253.a();
                hVar254 = this.f297a.H;
                Executor executor = (Executor) hVar254.a();
                jo joVar18 = this.f297a;
                ds dsVar19 = this.b;
                ce ks = joVar18.ks();
                y bJ = dsVar19.bJ();
                hVar255 = dsVar19.hv;
                com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z zVar3 = (com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z) hVar255.a();
                hVar256 = this.f297a.gB;
                an anVar7 = (an) hVar256.a();
                hVar257 = this.f297a.oh;
                at atVar9 = (at) hVar257.a();
                hVar258 = this.f297a.g;
                com.google.android.libraries.g.a aVar17 = (com.google.android.libraries.g.a) hVar258.a();
                hVar259 = this.f297a.gq;
                p pVar10 = (p) hVar259.a();
                hVar260 = this.f297a.hw;
                a b38 = c.b(hVar260);
                hVar261 = this.b.hw;
                a b39 = c.b(hVar261);
                hVar262 = this.f297a.im;
                a b40 = c.b(hVar262);
                jyVar19 = this.f297a.f319a;
                hVar263 = jyVar19.gC;
                a b41 = c.b(hVar263);
                hVar264 = this.b.hx;
                a b42 = c.b(hVar264);
                ds dsVar20 = this.b;
                aq bK = dsVar20.bK();
                hVar265 = dsVar20.hy;
                a b43 = c.b(hVar265);
                hVar266 = this.b.hz;
                c.b(hVar266);
                ds dsVar21 = this.b;
                jo joVar19 = this.f297a;
                com.google.android.libraries.search.assistant.proactive.ba bL = dsVar21.bL();
                hVar267 = joVar19.in;
                com.google.android.libraries.search.assistant.proactive.h.c cVar = (com.google.android.libraries.search.assistant.proactive.h.c) hVar267.a();
                ds dsVar22 = this.b;
                jo joVar20 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bo.b ao = dsVar22.ao();
                com.google.android.apps.search.assistant.platform.pcp.featuredata.n bA = dsVar22.bA();
                hVar268 = joVar20.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar2 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar268.a();
                hVar269 = this.f297a.W;
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) hVar269.a();
                com.google.android.apps.search.assistant.verticals.ambient.smartspace.f fVar7 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.f();
                hVar270 = this.f297a.gX;
                a b44 = c.b(hVar270);
                jo joVar21 = this.f297a;
                com.google.android.libraries.search.assistant.proactive.ag kr = joVar21.kr();
                hVar271 = joVar21.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar11 = (com.google.apps.tiktok.contrib.work.b.p) hVar271.a();
                jyVar20 = this.f297a.f319a;
                hVar272 = jyVar20.bK;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.au(context15, hVar419, executor, ks, bJ, zVar3, anVar7, atVar9, aVar17, pVar10, b38, b39, b40, b41, b42, bK, b43, bL, cVar, ao, bA, cVar2, yVar, fVar7, b44, kr, pVar11, (com.google.android.libraries.search.assistant.b.a) hVar272.a());
            case 271:
                hVar273 = this.f297a.f;
                Context context16 = (Context) hVar273.a();
                hVar274 = this.f297a.hw;
                a b45 = c.b(hVar274);
                hVar275 = this.f297a.gX;
                a b46 = c.b(hVar275);
                hVar276 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar4 = (com.google.android.apps.gsa.assistant.shared.z) hVar276.a();
                hVar277 = this.f297a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar3 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar277.a();
                at k5 = at.k(this.b.bM());
                jo joVar22 = this.f297a;
                com.google.android.libraries.search.assistant.proactive.ag kr2 = joVar22.kr();
                hVar278 = joVar22.gz;
                com.google.android.libraries.gsa.h.h hVar420 = (com.google.android.libraries.gsa.h.h) hVar278.a();
                hVar279 = this.f297a.H;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z(context16, b45, b46, zVar4, cVar3, k5, kr2, hVar420, (Executor) hVar279.a());
            case 272:
                jyVar21 = this.f297a.f319a;
                return at.k(jyVar21.dY());
            case 273:
                hVar280 = this.f297a.nn;
                return new com.google.android.libraries.search.assistant.proactive.j.e((KeyguardManager) hVar280.a(), this.f297a.I());
            case 274:
                return at.k(this.b.bN());
            case 275:
                hVar281 = this.f297a.f;
                Context context17 = (Context) hVar281.a();
                hVar282 = this.f297a.H;
                Executor executor2 = (Executor) hVar282.a();
                hVar283 = this.f297a.im;
                a b47 = c.b(hVar283);
                jo joVar23 = this.f297a;
                com.google.android.libraries.search.assistant.proactive.ag kr3 = joVar23.kr();
                hVar284 = joVar23.lr;
                Random random = (Random) hVar284.a();
                hVar285 = this.b.H;
                com.google.common.v.f fVar8 = (com.google.common.v.f) hVar285.a();
                jyVar22 = this.f297a.f319a;
                com.google.android.libraries.search.assistant.proactive.storage.ab se = jyVar22.se();
                hVar286 = this.f297a.in;
                return new com.google.android.libraries.search.assistant.proactive.f(context17, executor2, b47, kr3, random, fVar8, se, (com.google.android.libraries.search.assistant.proactive.h.c) hVar286.a());
            case 276:
                ds dsVar23 = this.b;
                jo joVar24 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.g.h C2 = dsVar23.C();
                jyVar23 = joVar24.f319a;
                hVar287 = jyVar23.vo;
                com.google.android.apps.gsa.staticplugins.opa.at.m mVar2 = (com.google.android.apps.gsa.staticplugins.opa.at.m) hVar287.a();
                hVar288 = this.f297a.in;
                return new com.google.android.apps.gsa.staticplugins.opa.at.p(C2, mVar2, (com.google.android.libraries.search.assistant.proactive.h.c) hVar288.a());
            case 277:
                hVar289 = this.b.bk;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.z zVar5 = (com.google.android.apps.gsa.staticplugins.opa.smartspace.z) hVar289.a();
                ds dsVar24 = this.b;
                jo joVar25 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.b.f aX = dsVar24.aX();
                jyVar24 = joVar25.f319a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.b.u aI3 = jyVar24.aI();
                ds dsVar25 = this.b;
                jo joVar26 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.i.g ba = dsVar25.ba();
                com.google.android.apps.gsa.staticplugins.opa.smartspace.m.b bb = dsVar25.bb();
                com.google.android.apps.gsa.staticplugins.opa.smartspace.a.b aW = dsVar25.aW();
                jyVar25 = joVar26.f319a;
                jyVar25.rV();
                ds dsVar26 = this.b;
                jo joVar27 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.e aZ = dsVar26.aZ();
                hVar290 = joVar27.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar = (com.google.android.apps.gsa.opa.smartspace.d) hVar290.a();
                jyVar26 = this.f297a.f319a;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.e.p ba2 = jyVar26.ba();
                com.google.android.apps.search.assistant.verticals.ambient.smartspace.f fVar9 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.f();
                ds dsVar27 = this.b;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.d.h aY = dsVar27.aY();
                hVar291 = dsVar27.hD;
                com.google.android.apps.gsa.staticplugins.opa.bg.r rVar = (com.google.android.apps.gsa.staticplugins.opa.bg.r) hVar291.a();
                hVar292 = this.f297a.nH;
                cq cqVar = (cq) hVar292.a();
                ds dsVar28 = this.b;
                jo joVar28 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.n.o bc = dsVar28.bc();
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.v aS = dsVar28.aS();
                hVar293 = joVar28.gq;
                p pVar12 = (p) hVar293.a();
                jyVar27 = this.f297a.f319a;
                com.google.android.apps.search.assistant.verticals.ambient.k.e cq = jyVar27.cq();
                jo joVar29 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.a dI = joVar29.dI();
                hVar294 = joVar29.nN;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.e(zVar5, aX, aI3, ba, bb, aW, aZ, dVar, ba2, fVar9, aY, rVar, cqVar, bc, aS, pVar12, cq, dI, (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar294.a());
            case 278:
                ds dsVar29 = this.b;
                jo joVar30 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.g.h C3 = dsVar29.C();
                hVar295 = joVar30.gz;
                com.google.android.libraries.gsa.h.h hVar421 = (com.google.android.libraries.gsa.h.h) hVar295.a();
                ds dsVar30 = this.b;
                dsVar30.gK();
                jo joVar31 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bo.b ao2 = dsVar30.ao();
                hVar296 = joVar31.g;
                com.google.android.libraries.g.a aVar18 = (com.google.android.libraries.g.a) hVar296.a();
                hVar297 = this.f297a.gP;
                m mVar3 = (m) hVar297.a();
                hVar298 = this.f297a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar2 = (com.google.android.apps.gsa.opa.smartspace.d) hVar298.a();
                ds dsVar31 = this.b;
                jo joVar32 = this.f297a;
                com.google.android.apps.gsa.opa.smartspace.a j = dsVar31.j();
                com.google.android.apps.gsa.opa.smartspace.b.a cF = joVar32.cF();
                hVar299 = joVar32.gq;
                a b48 = c.b(hVar299);
                hVar300 = this.f297a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar19 = (com.google.android.apps.gsa.opa.a.a.a) hVar300.a();
                hVar301 = this.f297a.ov;
                com.google.android.apps.gsa.smartspace.k kVar2 = (com.google.android.apps.gsa.smartspace.k) hVar301.a();
                hVar302 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar422 = (com.google.android.libraries.gsa.h.h) hVar302.a();
                hVar303 = this.f297a.oA;
                com.google.android.apps.gsa.assistant.settings.features.d.w wVar = (com.google.android.apps.gsa.assistant.settings.features.d.w) hVar303.a();
                hVar304 = this.f297a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar2 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar304.a();
                ds dsVar32 = this.b;
                jo joVar33 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.d.h aY2 = dsVar32.aY();
                at k6 = at.k(joVar33.eH());
                hVar305 = this.f297a.hq;
                com.google.android.apps.gsa.search.core.aa.a.k kVar3 = (com.google.android.apps.gsa.search.core.aa.a.k) hVar305.a();
                jo joVar34 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.e.e em = joVar34.em();
                hVar306 = joVar34.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar4 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar306.a();
                ds dsVar33 = this.b;
                jo joVar35 = this.f297a;
                ar bC = dsVar33.bC();
                hVar307 = joVar35.ls;
                com.google.android.apps.gsa.search.core.aa.a.c cVar5 = (com.google.android.apps.gsa.search.core.aa.a.c) hVar307.a();
                hVar308 = this.f297a.lu;
                com.google.android.apps.gsa.search.core.ae aeVar5 = (com.google.android.apps.gsa.search.core.ae) hVar308.a();
                hVar309 = this.f297a.gB;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.z(C3, hVar421, ao2, aVar18, mVar3, dVar2, j, cF, b48, aVar19, kVar2, hVar422, wVar, rVar2, aY2, k6, kVar3, em, cVar4, bC, cVar5, aeVar5, (an) hVar309.a());
            case 279:
                hVar310 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar423 = (com.google.android.libraries.gsa.h.h) hVar310.a();
                hVar311 = this.f297a.gq;
                p pVar13 = (p) hVar311.a();
                hVar312 = this.f297a.gf;
                SharedPreferences sharedPreferences4 = (SharedPreferences) hVar312.a();
                hVar313 = this.f297a.g;
                com.google.android.libraries.g.a aVar20 = (com.google.android.libraries.g.a) hVar313.a();
                ds dsVar34 = this.b;
                jo joVar36 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.bg.x bd = dsVar34.bd();
                hVar314 = joVar36.gB;
                an anVar8 = (an) hVar314.a();
                hVar315 = this.f297a.nC;
                at k7 = at.k((com.google.android.apps.gsa.staticplugins.opa.bg.v) hVar315.a());
                hVar316 = this.f297a.lu;
                com.google.android.apps.gsa.search.core.ae aeVar6 = (com.google.android.apps.gsa.search.core.ae) hVar316.a();
                jo joVar37 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.bg.h eu = joVar37.eu();
                com.google.android.apps.gsa.staticplugins.opa.bg.s ev = joVar37.ev();
                hVar317 = joVar37.gt;
                a b49 = c.b(hVar317);
                hVar318 = this.f297a.nF;
                com.google.android.apps.gsa.assistant.settings.devices.d.b.l lVar3 = (com.google.android.apps.gsa.assistant.settings.devices.d.b.l) hVar318.a();
                hVar319 = this.f297a.oN;
                return new com.google.android.apps.gsa.staticplugins.opa.bg.r(hVar423, pVar13, sharedPreferences4, aVar20, bd, anVar8, k7, aeVar6, eu, ev, b49, lVar3, (com.google.android.apps.gsa.r.f) hVar319.a(), this.f297a.cH());
            case 280:
                return new jk(this, 1);
            case 281:
                hVar320 = this.b.ij;
                return new com.google.android.apps.gsa.staticplugins.opa.br.c.a(c.b(hVar320));
            case 282:
                hVar321 = this.f297a.f;
                Context context18 = (Context) hVar321.a();
                hVar322 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar424 = (com.google.android.libraries.gsa.h.h) hVar322.a();
                hVar323 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar425 = (com.google.android.libraries.gsa.h.h) hVar323.a();
                hVar324 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar426 = (com.google.android.libraries.gsa.h.h) hVar324.a();
                hVar325 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar7 = (com.google.android.apps.gsa.search.core.service.x) hVar325.a();
                hVar326 = this.f297a.hG;
                a b50 = c.b(hVar326);
                ds dsVar35 = this.b;
                jo joVar38 = this.f297a;
                Object gm = dsVar35.gm();
                com.google.android.apps.gsa.staticplugins.opa.br.n be = dsVar35.be();
                jyVar28 = joVar38.f319a;
                hVar327 = jyVar28.fW;
                w wVar2 = (w) hVar327.a();
                hVar328 = this.f297a.gd;
                com.google.android.libraries.search.account.b.b bVar2 = (com.google.android.libraries.search.account.b.b) hVar328.a();
                hVar329 = this.f297a.gq;
                p pVar14 = (p) hVar329.a();
                jyVar29 = this.f297a.f319a;
                hVar330 = jyVar29.av;
                com.google.android.apps.gsa.staticplugins.nga.ui.b.a aVar21 = (com.google.android.apps.gsa.staticplugins.nga.ui.b.a) hVar330.a();
                hVar331 = this.f297a.gZ;
                as asVar = (as) hVar331.a();
                hVar332 = this.f297a.gF;
                a b51 = c.b(hVar332);
                hVar333 = this.f297a.hK;
                return new com.google.android.apps.gsa.staticplugins.opa.br.am(context18, hVar424, hVar425, hVar426, xVar7, b50, (com.google.android.apps.gsa.staticplugins.opa.br.y) gm, be, wVar2, bVar2, pVar14, aVar21, asVar, b51, (com.google.android.apps.gsa.search.core.h.u) hVar333.a(), (com.google.android.apps.gsa.staticplugins.opa.br.ab) this.b.gn());
            case 283:
                hVar334 = this.f297a.f;
                Context context19 = (Context) hVar334.a();
                hVar335 = this.b.r;
                com.google.android.apps.gsa.shared.util.o.g gVar3 = (com.google.android.apps.gsa.shared.util.o.g) hVar335.a();
                ds dsVar36 = this.b;
                com.google.android.apps.gsa.search.core.google.ar gP = dsVar36.gP();
                com.google.android.apps.gsa.search.core.c.c m = dsVar36.m();
                hVar336 = dsVar36.hG;
                com.google.android.apps.gsa.search.core.ae.d.a aVar22 = (com.google.android.apps.gsa.search.core.ae.d.a) hVar336.a();
                hVar337 = this.f297a.pc;
                com.google.android.apps.gsa.search.core.google.ag agVar = (com.google.android.apps.gsa.search.core.google.ag) hVar337.a();
                jyVar30 = this.f297a.f319a;
                hVar338 = jyVar30.ki;
                com.google.android.apps.gsa.shared.logger.f.a aVar23 = (com.google.android.apps.gsa.shared.logger.f.a) hVar338.a();
                hVar339 = this.b.hH;
                com.google.android.apps.gsa.staticplugins.opa.br.b.c cVar6 = (com.google.android.apps.gsa.staticplugins.opa.br.b.c) hVar339.a();
                hVar340 = this.f297a.gF;
                a b52 = c.b(hVar340);
                hVar341 = this.f297a.pm;
                a b53 = c.b(hVar341);
                hVar342 = this.f297a.hM;
                a b54 = c.b(hVar342);
                hVar343 = this.b.b;
                return new com.google.android.apps.gsa.staticplugins.opa.br.k(context19, gVar3, gP, m, aVar22, agVar, aVar23, cVar6, b52, b53, b54, (com.google.android.libraries.gsa.h.h) hVar343.a());
            case 284:
                hVar344 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.d.a.a(c.b(hVar344));
            case 285:
                jo joVar39 = this.f297a;
                hVar345 = joVar39.f;
                hVar346 = joVar39.pm;
                h b55 = e.c.i.b(hVar346);
                jo joVar40 = this.f297a;
                hVar347 = joVar40.nl;
                hVar348 = joVar40.hG;
                return new com.google.android.apps.gsa.staticplugins.opa.br.b.c(hVar345, b55, hVar347, e.c.i.b(hVar348));
            case 286:
                hVar349 = this.f297a.H;
                cq cqVar2 = (cq) hVar349.a();
                hVar350 = this.f297a.v;
                cq cqVar3 = (cq) hVar350.a();
                hVar351 = this.f297a.B;
                cq cqVar4 = (cq) hVar351.a();
                hVar352 = this.f297a.f;
                Context context20 = (Context) hVar352.a();
                hVar353 = this.f297a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar7 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar353.a();
                hVar354 = this.f297a.oC;
                return new com.google.android.apps.gsa.search.core.webview.i(cqVar2, cqVar3, cqVar4, context20, cVar7, (com.google.android.apps.gsa.search.core.google.w) hVar354.a());
            case 287:
                jo joVar41 = this.f297a;
                ds dsVar37 = this.b;
                hVar355 = joVar41.lV;
                hVar356 = dsVar37.hK;
                hVar357 = dsVar37.hL;
                return new com.google.android.apps.gsa.staticplugins.br.b.d(hVar355, hVar356, hVar357);
            case 288:
                hVar358 = this.f297a.f;
                return new com.google.android.apps.gsa.staticplugins.br.b.a((Context) hVar358.a());
            case 289:
                return new com.google.android.apps.gsa.staticplugins.br.b.b();
            case 290:
                ds dsVar38 = this.b;
                jo joVar42 = this.f297a;
                hVar359 = dsVar38.p;
                hVar360 = dsVar38.b;
                hVar361 = joVar42.gv;
                hVar362 = joVar42.f;
                hVar363 = joVar42.pm;
                hVar364 = joVar42.hM;
                hVar365 = joVar42.hD;
                h b56 = e.c.i.b(hVar365);
                jo joVar43 = this.f297a;
                ds dsVar39 = this.b;
                hVar366 = joVar43.gn;
                hVar367 = dsVar39.r;
                hVar368 = joVar43.gq;
                return new com.google.android.apps.gsa.staticplugins.opa.br.f(hVar359, hVar360, hVar361, hVar362, hVar363, hVar364, b56, hVar366, hVar367, hVar368);
            case 291:
                jo joVar44 = this.f297a;
                ds dsVar40 = this.b;
                hVar369 = joVar44.gv;
                hVar370 = dsVar40.hP;
                hVar371 = joVar44.gq;
                return new ap(hVar369, hVar370, e.c.i.b(hVar371));
            case 292:
                hVar372 = this.f297a.gv;
                return new com.google.android.apps.gsa.search.core.w.h(hVar372);
            case 293:
                jo joVar45 = this.f297a;
                ds dsVar41 = this.b;
                hVar373 = joVar45.gv;
                hVar374 = dsVar41.hP;
                return new com.google.android.apps.gsa.staticplugins.opa.br.aq(hVar373, hVar374);
            case 294:
                ds dsVar42 = this.b;
                jo joVar46 = this.f297a;
                hVar375 = dsVar42.hV;
                hVar376 = joVar46.g;
                return new com.google.android.apps.gsa.staticplugins.webview.s(hVar375, hVar376);
            case 295:
                ds dsVar43 = this.b;
                jo joVar47 = this.f297a;
                hVar377 = dsVar43.r;
                hVar378 = joVar47.hB;
                hVar379 = joVar47.pb;
                h b57 = e.c.i.b(hVar379);
                hVar380 = this.f297a.gf;
                h b58 = e.c.i.b(hVar380);
                ds dsVar44 = this.b;
                hVar381 = dsVar44.b;
                hVar382 = dsVar44.hU;
                return new com.google.android.apps.gsa.staticplugins.webview.v(hVar377, hVar378, b57, b58, hVar381, hVar382);
            case 296:
                hVar383 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.av.a.a(c.b(hVar383));
            case 297:
                hVar384 = this.b.hG;
                return new com.google.android.apps.gsa.staticplugins.b.a.a(hVar384);
            case 298:
                jo joVar48 = this.f297a;
                ds dsVar45 = this.b;
                hVar385 = joVar48.gv;
                hVar386 = dsVar45.hZ;
                return new com.google.android.apps.gsa.staticplugins.webview.a(hVar385, hVar386);
            case 299:
                hVar387 = this.f297a.f;
                Context context21 = (Context) hVar387.a();
                hVar388 = this.b.r;
                return new com.google.android.apps.gsa.staticplugins.webview.a(context21, (com.google.android.apps.gsa.shared.util.o.g) hVar388.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
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
        jy jyVar;
        h hVar13;
        jy jyVar2;
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
        jy jyVar3;
        jy jyVar4;
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
        jy jyVar5;
        h hVar82;
        jy jyVar6;
        h hVar83;
        h hVar84;
        h hVar85;
        h hVar86;
        h hVar87;
        h hVar88;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        jy jyVar7;
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
        jy jyVar8;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        h hVar112;
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
        jy jyVar9;
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
        jy jyVar10;
        h hVar149;
        h hVar150;
        h hVar151;
        h hVar152;
        h hVar153;
        jy jyVar11;
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
        jy jyVar12;
        h hVar169;
        h hVar170;
        jy jyVar13;
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
        jy jyVar14;
        h hVar184;
        jy jyVar15;
        h hVar185;
        jy jyVar16;
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
        h hVar205;
        h hVar206;
        jy jyVar17;
        h hVar207;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        h hVar212;
        h hVar213;
        h hVar214;
        h hVar215;
        h hVar216;
        h hVar217;
        h hVar218;
        h hVar219;
        h hVar220;
        h hVar221;
        h hVar222;
        h hVar223;
        h hVar224;
        h hVar225;
        h hVar226;
        h hVar227;
        h hVar228;
        h hVar229;
        h hVar230;
        h hVar231;
        h hVar232;
        h hVar233;
        h hVar234;
        h hVar235;
        h hVar236;
        h hVar237;
        h hVar238;
        h hVar239;
        h hVar240;
        h hVar241;
        h hVar242;
        h hVar243;
        h hVar244;
        h hVar245;
        h hVar246;
        h hVar247;
        h hVar248;
        h hVar249;
        h hVar250;
        h hVar251;
        h hVar252;
        h hVar253;
        h hVar254;
        h hVar255;
        h hVar256;
        h hVar257;
        h hVar258;
        h hVar259;
        h hVar260;
        h hVar261;
        h hVar262;
        h hVar263;
        h hVar264;
        h hVar265;
        h hVar266;
        h hVar267;
        h hVar268;
        h hVar269;
        h hVar270;
        h hVar271;
        h hVar272;
        h hVar273;
        h hVar274;
        h hVar275;
        h hVar276;
        h hVar277;
        h hVar278;
        h hVar279;
        jy jyVar18;
        h hVar280;
        h hVar281;
        h hVar282;
        h hVar283;
        jy jyVar19;
        h hVar284;
        h hVar285;
        h hVar286;
        h hVar287;
        jy jyVar20;
        h hVar288;
        jy jyVar21;
        h hVar289;
        h hVar290;
        jy jyVar22;
        h hVar291;
        jy jyVar23;
        h hVar292;
        jy jyVar24;
        h hVar293;
        jy jyVar25;
        h hVar294;
        h hVar295;
        h hVar296;
        h hVar297;
        h hVar298;
        h hVar299;
        h hVar300;
        h hVar301;
        h hVar302;
        jy jyVar26;
        h hVar303;
        h hVar304;
        h hVar305;
        jy jyVar27;
        h hVar306;
        jy jyVar28;
        h hVar307;
        h hVar308;
        h hVar309;
        h hVar310;
        jy jyVar29;
        h hVar311;
        h hVar312;
        h hVar313;
        h hVar314;
        h hVar315;
        h hVar316;
        h hVar317;
        h hVar318;
        h hVar319;
        h hVar320;
        h hVar321;
        h hVar322;
        h hVar323;
        h hVar324;
        h hVar325;
        h hVar326;
        h hVar327;
        h hVar328;
        h hVar329;
        h hVar330;
        h hVar331;
        h hVar332;
        h hVar333;
        h hVar334;
        h hVar335;
        h hVar336;
        h hVar337;
        h hVar338;
        h hVar339;
        h hVar340;
        h hVar341;
        h hVar342;
        h hVar343;
        h hVar344;
        h hVar345;
        h hVar346;
        h hVar347;
        h hVar348;
        h hVar349;
        h hVar350;
        h hVar351;
        h hVar352;
        h hVar353;
        h hVar354;
        h hVar355;
        h hVar356;
        h hVar357;
        h hVar358;
        jy jyVar30;
        h hVar359;
        jy jyVar31;
        h hVar360;
        jy jyVar32;
        h hVar361;
        h hVar362;
        h hVar363;
        h hVar364;
        h hVar365;
        h hVar366;
        jy jyVar33;
        h hVar367;
        h hVar368;
        h hVar369;
        h hVar370;
        h hVar371;
        jy jyVar34;
        h hVar372;
        h hVar373;
        h hVar374;
        h hVar375;
        h hVar376;
        h hVar377;
        h hVar378;
        h hVar379;
        h hVar380;
        h hVar381;
        h hVar382;
        h hVar383;
        h hVar384;
        h hVar385;
        h hVar386;
        h hVar387;
        h hVar388;
        h hVar389;
        h hVar390;
        h hVar391;
        h hVar392;
        h hVar393;
        h hVar394;
        h hVar395;
        h hVar396;
        h hVar397;
        h hVar398;
        h hVar399;
        h hVar400;
        h hVar401;
        h hVar402;
        jy jyVar35;
        h hVar403;
        h hVar404;
        h hVar405;
        jy jyVar36;
        h hVar406;
        h hVar407;
        h hVar408;
        h hVar409;
        h hVar410;
        h hVar411;
        jy jyVar37;
        h hVar412;
        h hVar413;
        h hVar414;
        h hVar415;
        h hVar416;
        h hVar417;
        h hVar418;
        h hVar419;
        h hVar420;
        h hVar421;
        h hVar422;
        h hVar423;
        h hVar424;
        jy jyVar38;
        h hVar425;
        h hVar426;
        h hVar427;
        h hVar428;
        h hVar429;
        h hVar430;
        h hVar431;
        h hVar432;
        h hVar433;
        h hVar434;
        h hVar435;
        h hVar436;
        h hVar437;
        h hVar438;
        h hVar439;
        h hVar440;
        h hVar441;
        h hVar442;
        h hVar443;
        h hVar444;
        h hVar445;
        h hVar446;
        h hVar447;
        jy jyVar39;
        h hVar448;
        h hVar449;
        h hVar450;
        h hVar451;
        h hVar452;
        h hVar453;
        h hVar454;
        h hVar455;
        jy jyVar40;
        h hVar456;
        jy jyVar41;
        h hVar457;
        h hVar458;
        jy jyVar42;
        h hVar459;
        h hVar460;
        h hVar461;
        h hVar462;
        jy jyVar43;
        h hVar463;
        h hVar464;
        h hVar465;
        h hVar466;
        h hVar467;
        h hVar468;
        h hVar469;
        h hVar470;
        h hVar471;
        h hVar472;
        h hVar473;
        h hVar474;
        h hVar475;
        h hVar476;
        h hVar477;
        int i = this.c;
        switch (i) {
            case 300:
                jo joVar = this.f297a;
                ds dsVar = this.b;
                hVar = joVar.gp;
                hVar2 = dsVar.hP;
                hVar3 = dsVar.ib;
                hVar4 = joVar.lj;
                return new com.google.android.apps.gsa.staticplugins.br.d.d(hVar, hVar2, hVar3, hVar4);
            case 301:
                hVar5 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bm.a.d(c.b(hVar5));
            case 302:
                ds dsVar2 = this.b;
                jo joVar2 = this.f297a;
                hVar6 = dsVar2.hP;
                hVar7 = dsVar2.ie;
                hVar8 = joVar2.gv;
                return new com.google.android.apps.gsa.staticplugins.br.f.d(hVar6, hVar7, hVar8);
            case 303:
                hVar9 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bn.a.b(c.b(hVar9));
            case 304:
                jo joVar3 = this.f297a;
                ds dsVar3 = this.b;
                hVar10 = joVar3.he;
                hVar11 = dsVar3.hP;
                hVar12 = joVar3.nu;
                jyVar = joVar3.f319a;
                hVar13 = jyVar.gM;
                return new com.google.android.apps.gsa.staticplugins.br.a.p(hVar10, hVar11, hVar12, hVar13);
            case 305:
                jyVar2 = this.f297a.f319a;
                hVar14 = jyVar2.Q;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.a.a((com.google.android.apps.gsa.staticplugins.opa.samson.c.k) hVar14.a());
            case 306:
                hVar15 = this.f297a.f;
                Context context = (Context) hVar15.a();
                hVar16 = this.f297a.gP;
                m mVar = (m) hVar16.a();
                hVar17 = this.f297a.gn;
                com.google.android.apps.gsa.w.a aVar = (com.google.android.apps.gsa.w.a) hVar17.a();
                hVar18 = this.f297a.gq;
                p pVar = (p) hVar18.a();
                hVar19 = this.f297a.ls;
                com.google.android.apps.gsa.search.core.aa.a.c cVar = (com.google.android.apps.gsa.search.core.aa.a.c) hVar19.a();
                hVar20 = this.b.ir;
                com.google.android.apps.gsa.l.a.g gVar = (com.google.android.apps.gsa.l.a.g) hVar20.a();
                hVar21 = this.b.bn;
                com.google.android.libraries.search.l.b.f fVar = (com.google.android.libraries.search.l.b.f) hVar21.a();
                hVar22 = this.f297a.gB;
                an anVar = (an) hVar22.a();
                hVar23 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar478 = (com.google.android.libraries.gsa.h.h) hVar23.a();
                ds dsVar4 = this.b;
                jo joVar4 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.x.a M = dsVar4.M();
                com.google.android.apps.gsa.l.b.c g = dsVar4.g();
                joVar4.aa();
                com.google.android.apps.gsa.l.g.m ab = joVar4.ab();
                hVar24 = joVar4.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar2 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar24.a();
                hVar25 = this.f297a.hq;
                com.google.android.apps.gsa.search.core.aa.a.k kVar = (com.google.android.apps.gsa.search.core.aa.a.k) hVar25.a();
                hVar26 = this.f297a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar26.a();
                hVar27 = this.f297a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar = (com.google.android.apps.gsa.opa.smartspace.d) hVar27.a();
                ds dsVar5 = this.b;
                jo joVar5 = this.f297a;
                Map gu = dsVar5.gu();
                Map gs = dsVar5.gs();
                jyVar3 = joVar5.f319a;
                com.google.android.libraries.search.l.a.d ec = jyVar3.ec();
                jyVar4 = this.f297a.f319a;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.e.g(context, mVar, aVar, pVar, cVar, gVar, fVar, anVar, hVar478, M, g, ab, cVar2, kVar, rVar, dVar, gu, gs, ec, jyVar4.rf());
            case 307:
                hVar28 = this.f297a.gB;
                an anVar2 = (an) hVar28.a();
                hVar29 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar479 = (com.google.android.libraries.gsa.h.h) hVar29.a();
                hVar30 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar480 = (com.google.android.libraries.gsa.h.h) hVar30.a();
                hVar31 = this.f297a.ft;
                com.google.common.base.ci ciVar = (com.google.common.base.ci) hVar31.a();
                hVar32 = this.f297a.lK;
                com.google.android.libraries.geller.portable.ae aeVar = (com.google.android.libraries.geller.portable.ae) hVar32.a();
                ds dsVar6 = this.b;
                com.google.android.apps.gsa.l.b.c g2 = dsVar6.g();
                hVar33 = dsVar6.iq;
                return new com.google.android.apps.gsa.l.a.g(anVar2, hVar479, hVar480, ciVar, aeVar, g2, c.b(hVar33));
            case 308:
                hVar34 = this.f297a.lK;
                com.google.android.libraries.geller.portable.ae aeVar2 = (com.google.android.libraries.geller.portable.ae) hVar34.a();
                hVar35 = this.f297a.f;
                Context context2 = (Context) hVar35.a();
                hVar36 = this.f297a.ly;
                com.google.android.apps.gsa.l.b bVar = (com.google.android.apps.gsa.l.b) hVar36.a();
                ds dsVar7 = this.b;
                jo joVar6 = this.f297a;
                com.google.android.apps.gsa.l.g.g h = dsVar7.h();
                Set gA = dsVar7.gA();
                Map Xu = joVar6.Xu();
                hVar37 = joVar6.ha;
                com.google.android.apps.gsa.shared.util.c.a.g gVar2 = (com.google.android.apps.gsa.shared.util.c.a.g) hVar37.a();
                ds dsVar8 = this.b;
                jo joVar7 = this.f297a;
                com.google.android.apps.gsa.l.b.c g3 = dsVar8.g();
                hVar38 = joVar7.gq;
                p pVar2 = (p) hVar38.a();
                hVar39 = this.f297a.ls;
                return com.google.android.apps.gsa.l.d.c.c(aeVar2, context2, bVar, h, gA, Xu, gVar2, g3, pVar2, (com.google.android.apps.gsa.search.core.aa.a.c) hVar39.a());
            case 309:
                hVar40 = this.f297a.f;
                Context context3 = (Context) hVar40.a();
                hVar41 = this.f297a.H;
                hVar42 = this.f297a.gq;
                p pVar3 = (p) hVar42.a();
                hVar43 = this.b.bl;
                com.google.android.apps.gsa.search.core.ae.h.a aVar2 = (com.google.android.apps.gsa.search.core.ae.h.a) hVar43.a();
                hVar44 = this.b.O;
                com.google.android.apps.gsa.search.core.google.a.v vVar = (com.google.android.apps.gsa.search.core.google.a.v) hVar44.a();
                hVar45 = this.f297a.nl;
                Query query = (Query) hVar45.a();
                hVar46 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar481 = (com.google.android.libraries.gsa.h.h) hVar46.a();
                hVar47 = this.f297a.ly;
                com.google.android.apps.gsa.l.b bVar2 = (com.google.android.apps.gsa.l.b) hVar47.a();
                hVar48 = this.f297a.Fm;
                com.google.android.apps.gsa.search.core.h.a aVar3 = (com.google.android.apps.gsa.search.core.h.a) hVar48.a();
                hVar49 = this.f297a.gt;
                a b = c.b(hVar49);
                hVar50 = this.b.im;
                a b2 = c.b(hVar50);
                hVar51 = this.f297a.lO;
                com.google.android.libraries.mdi.download.h.b.ai aiVar = (com.google.android.libraries.mdi.download.h.b.ai) hVar51.a();
                ds dsVar9 = this.b;
                jo joVar8 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.aq.b aa = dsVar9.aa();
                hVar52 = joVar8.oG;
                a b3 = c.b(hVar52);
                jo joVar9 = this.f297a;
                com.google.android.libraries.geller.portable.a.h adP = joVar9.adP();
                hVar53 = joVar9.gf;
                n nVar = (n) hVar53.a();
                hVar54 = this.f297a.hq;
                com.google.android.apps.gsa.search.core.aa.a.k kVar2 = (com.google.android.apps.gsa.search.core.aa.a.k) hVar54.a();
                hVar55 = this.f297a.hG;
                return new com.google.android.apps.gsa.l.f.i(context3, pVar3, aVar2, vVar, query, hVar481, bVar2, aVar3, b, b2, aiVar, aa, b3, adP, nVar, kVar2, c.b(hVar55));
            case 310:
                hVar56 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.h.a.a(c.b(hVar56));
            case 311:
                hVar57 = this.f297a.hj;
                return at.k((com.google.android.apps.gsa.nga.shared.f.a.ao) hVar57.a());
            case 312:
                hVar58 = this.f297a.jO;
                com.google.android.libraries.storage.protostore.cg cgVar = (com.google.android.libraries.storage.protostore.cg) hVar58.a();
                hVar59 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar482 = (com.google.android.libraries.gsa.h.h) hVar59.a();
                hVar60 = this.b.io;
                return new com.google.android.apps.gsa.staticplugins.opa.n.b.c(cgVar, hVar482, c.b(hVar60));
            case 313:
                return new op(this.f297a.dA());
            case 314:
                hVar61 = this.b.bm;
                com.google.android.libraries.search.l.aj ajVar = (com.google.android.libraries.search.l.aj) hVar61.a();
                hVar62 = this.f297a.bq;
                com.google.apps.tiktok.account.data.a.d dVar2 = (com.google.apps.tiktok.account.data.a.d) hVar62.a();
                hVar63 = this.f297a.lR;
                com.google.apps.tiktok.p.b bVar3 = (com.google.apps.tiktok.p.b) hVar63.a();
                hVar64 = this.f297a.H;
                cq cqVar = (cq) hVar64.a();
                hVar65 = this.f297a.g;
                return new com.google.android.libraries.search.l.b.f(ajVar, dVar2, bVar3, cqVar, (com.google.android.libraries.g.a) hVar65.a(), this.f297a.ov());
            case 315:
                hVar66 = this.f297a.vL;
                aa aaVar = (aa) hVar66.a();
                jo joVar10 = this.f297a;
                ds dsVar10 = this.b;
                Map XO = joVar10.XO();
                Set gA2 = dsVar10.gA();
                hVar67 = joVar10.adW;
                com.google.android.libraries.search.l.e.d dVar3 = (com.google.android.libraries.search.l.e.d) hVar67.a();
                jo joVar11 = this.f297a;
                Map Xu2 = joVar11.Xu();
                hVar68 = joVar11.H;
                cq cqVar2 = (cq) hVar68.a();
                hVar69 = this.f297a.v;
                cq cqVar3 = (cq) hVar69.a();
                hVar70 = this.f297a.n;
                cq cqVar4 = (cq) hVar70.a();
                ds dsVar11 = this.b;
                jo joVar12 = this.f297a;
                Map gs2 = dsVar11.gs();
                hVar71 = joVar12.lK;
                com.google.android.libraries.geller.portable.ae aeVar3 = (com.google.android.libraries.geller.portable.ae) hVar71.a();
                jo joVar13 = this.f297a;
                return new com.google.android.libraries.search.l.aj(aaVar, XO, gA2, dVar3, Xu2, cqVar2, cqVar3, cqVar4, gs2, aeVar3, joVar13.adO(), joVar13.ada(), joVar13.l(), joVar13.og());
            case 316:
                hVar72 = this.f297a.f;
                Context context4 = (Context) hVar72.a();
                hVar73 = this.f297a.gq;
                p pVar4 = (p) hVar73.a();
                hVar74 = this.f297a.gv;
                hVar75 = this.f297a.qB;
                c.b(hVar75);
                hVar76 = this.f297a.qF;
                a b4 = c.b(hVar76);
                hVar77 = this.f297a.qD;
                c.b(hVar77);
                jo joVar14 = this.f297a;
                Optional empty = Optional.empty();
                hVar78 = joVar14.hG;
                c.b(hVar78);
                hVar79 = this.b.H;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar79.a();
                hVar80 = this.b.iv;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.g.e(context4, pVar4, b4, empty, fVar2, Optional.of(c.b(hVar80)));
            case 317:
                hVar81 = this.f297a.gR;
                Optional of = Optional.of((bg) hVar81.a());
                jyVar5 = this.f297a.f319a;
                hVar82 = jyVar5.rA;
                Optional of2 = Optional.of((com.google.android.apps.gsa.nga.shared.f.a.ab) hVar82.a());
                jyVar6 = this.f297a.f319a;
                hVar83 = jyVar6.rB;
                hVar84 = this.b.iu;
                return com.google.android.apps.gsa.assistant.shared.j.c.a.b(of, of2, hVar83, hVar84);
            case 318:
                hVar85 = this.f297a.f;
                Context context5 = (Context) hVar85.a();
                hVar86 = this.b.it;
                com.google.android.apps.gsa.assistant.shared.j.o oVar = (com.google.android.apps.gsa.assistant.shared.j.o) hVar86.a();
                hVar87 = this.f297a.jP;
                com.google.android.apps.gsa.assistant.shared.d.i iVar = (com.google.android.apps.gsa.assistant.shared.d.i) hVar87.a();
                hVar88 = this.f297a.gq;
                p pVar5 = (p) hVar88.a();
                hVar89 = this.b.H;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar89.a();
                hVar90 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar483 = (com.google.android.libraries.gsa.h.h) hVar90.a();
                hVar91 = this.f297a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar4 = (com.google.android.apps.gsa.search.core.y.a.a) hVar91.a();
                hVar92 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar484 = (com.google.android.libraries.gsa.h.h) hVar92.a();
                hVar93 = this.f297a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar93.a();
                hVar94 = this.f297a.hG;
                com.google.android.apps.gsa.shared.logger.b.h hVar485 = (com.google.android.apps.gsa.shared.logger.b.h) hVar94.a();
                jyVar7 = this.f297a.f319a;
                hVar95 = jyVar7.rA;
                Optional of3 = Optional.of(c.b(hVar95));
                hVar96 = this.b.io;
                a b5 = c.b(hVar96);
                hVar97 = this.f297a.jT;
                return new com.google.android.apps.gsa.assistant.shared.j.b.aa(context5, oVar, iVar, pVar5, fVar3, hVar483, aVar4, hVar484, aVar5, hVar485, of3, b5, (com.google.android.apps.gsa.nga.shared.f.a.m) hVar97.a());
            case 319:
                hVar98 = this.f297a.jQ;
                com.google.android.libraries.storage.protostore.cg cgVar2 = (com.google.android.libraries.storage.protostore.cg) hVar98.a();
                hVar99 = this.b.H;
                return new com.google.android.apps.gsa.assistant.shared.j.o(cgVar2);
            case 320:
                hVar100 = this.f297a.aF;
                com.google.android.apps.gsa.shared.o.b.a.a aVar6 = (com.google.android.apps.gsa.shared.o.b.a.a) hVar100.a();
                hVar101 = this.b.r;
                com.google.android.apps.gsa.shared.util.o.g gVar3 = (com.google.android.apps.gsa.shared.util.o.g) hVar101.a();
                hVar102 = this.f297a.f;
                Context context6 = (Context) hVar102.a();
                hVar103 = this.f297a.oH;
                com.google.android.apps.gsa.staticplugins.bq.m mVar2 = (com.google.android.apps.gsa.staticplugins.bq.m) hVar103.a();
                hVar104 = this.f297a.lz;
                com.google.android.apps.gsa.l.g.f fVar4 = (com.google.android.apps.gsa.l.g.f) hVar104.a();
                ds dsVar12 = this.b;
                jo joVar15 = this.f297a;
                com.google.android.apps.gsa.assistant.shared.appactions.b.b a2 = dsVar12.a();
                com.google.android.apps.gsa.assistant.shared.appactions.b.n R = joVar15.R();
                hVar105 = joVar15.gp;
                com.google.android.libraries.gsa.h.h hVar486 = (com.google.android.libraries.gsa.h.h) hVar105.a();
                hVar106 = this.f297a.gB;
                an anVar3 = (an) hVar106.a();
                hVar107 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar487 = (com.google.android.libraries.gsa.h.h) hVar107.a();
                jyVar8 = this.f297a.f319a;
                hVar108 = jyVar8.gN;
                a b6 = c.b(hVar108);
                hVar109 = this.f297a.gF;
                a b7 = c.b(hVar109);
                hVar110 = this.f297a.og;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.b.f(aVar6, gVar3, context6, mVar2, fVar4, a2, R, hVar486, anVar3, hVar487, b6, b7, Optional.of((gf) hVar110.a()), this.b.b());
            case 321:
                hVar111 = this.f297a.gq;
                p pVar6 = (p) hVar111.a();
                hVar112 = this.b.hD;
                com.google.android.apps.gsa.staticplugins.opa.bg.r rVar2 = (com.google.android.apps.gsa.staticplugins.opa.bg.r) hVar112.a();
                hVar113 = this.b.iy;
                br brVar = (br) hVar113.a();
                hVar114 = this.f297a.gt;
                a b8 = c.b(hVar114);
                hVar115 = this.f297a.lu;
                a b9 = c.b(hVar115);
                hVar116 = this.f297a.f;
                Context context7 = (Context) hVar116.a();
                hVar117 = this.f297a.gX;
                String str = (String) hVar117.a();
                hVar118 = this.b.ip;
                a b10 = c.b(hVar118);
                hVar119 = this.f297a.oa;
                ca caVar = (ca) hVar119.a();
                hVar120 = this.f297a.gS;
                at atVar = (at) hVar120.a();
                hVar121 = this.f297a.gZ;
                as asVar = (as) hVar121.a();
                hVar122 = this.f297a.qF;
                com.google.android.apps.gsa.staticplugins.opa.util.h hVar488 = (com.google.android.apps.gsa.staticplugins.opa.util.h) hVar122.a();
                hVar123 = this.f297a.hG;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.c.b(pVar6, rVar2, brVar, b8, b9, context7, str, b10, caVar, atVar, asVar, hVar488, c.b(hVar123));
            case 322:
                hVar124 = this.f297a.gf;
                return new br((SharedPreferences) hVar124.a());
            case 323:
                hVar125 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar489 = (com.google.android.libraries.gsa.h.h) hVar125.a();
                hVar126 = this.f297a.gP;
                m mVar3 = (m) hVar126.a();
                hVar127 = this.f297a.gq;
                p pVar7 = (p) hVar127.a();
                hVar128 = this.f297a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar128.a();
                hVar129 = this.f297a.gB;
                an anVar4 = (an) hVar129.a();
                hVar130 = this.f297a.hw;
                com.google.android.apps.gsa.search.core.h.b bVar4 = (com.google.android.apps.gsa.search.core.h.b) hVar130.a();
                jo joVar16 = this.f297a;
                com.google.android.apps.gsa.l.g.m ab2 = joVar16.ab();
                hVar131 = joVar16.lu;
                com.google.android.apps.gsa.search.core.ae aeVar4 = (com.google.android.apps.gsa.search.core.ae) hVar131.a();
                hVar132 = this.f297a.pJ;
                com.google.android.apps.gsa.contacts.m mVar4 = (com.google.android.apps.gsa.contacts.m) hVar132.a();
                jyVar9 = this.f297a.f319a;
                hVar133 = jyVar9.gj;
                com.google.android.apps.gsa.speech.c.c cVar3 = (com.google.android.apps.gsa.speech.c.c) hVar133.a();
                hVar134 = this.f297a.pL;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.d.e(hVar489, mVar3, pVar7, aVar7, anVar4, bVar4, ab2, aeVar4, mVar4, cVar3, (com.google.android.apps.gsa.contacts.au) hVar134.a());
            case 324:
                hVar135 = this.b.hA;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.b(c.b(hVar135));
            case 325:
                ds dsVar13 = this.b;
                com.google.android.apps.gsa.staticplugins.ag.v gN = dsVar13.gN();
                hVar136 = dsVar13.ar;
                com.google.android.apps.gsa.search.core.l.i iVar2 = (com.google.android.apps.gsa.search.core.l.i) hVar136.a();
                hVar137 = this.f297a.gp;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.c(gN, iVar2, (com.google.android.libraries.gsa.h.h) hVar137.a());
            case 326:
                return new kj(this.f297a, this.b);
            case 327:
                hVar138 = this.f297a.qH;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.i.a();
            case 328:
                hVar139 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar = (com.google.android.apps.gsa.search.core.service.x) hVar139.a();
                hVar140 = this.b.F;
                at atVar2 = (at) hVar140.a();
                hVar141 = this.f297a.iq;
                ab abVar = (ab) hVar141.a();
                hVar142 = this.b.hA;
                a b11 = c.b(hVar142);
                hVar143 = this.b.iF;
                a b12 = c.b(hVar143);
                hVar144 = this.f297a.oZ;
                a b13 = c.b(hVar144);
                hVar145 = this.f297a.f;
                Context context8 = (Context) hVar145.a();
                hVar146 = this.b.r;
                com.google.android.apps.gsa.shared.util.o.g gVar4 = (com.google.android.apps.gsa.shared.util.o.g) hVar146.a();
                hVar147 = this.f297a.gf;
                a b14 = c.b(hVar147);
                hVar148 = this.f297a.g;
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) hVar148.a();
                jyVar10 = this.f297a.f319a;
                hVar149 = jyVar10.fb;
                com.google.android.apps.gsa.staticplugins.opa.s.a aVar9 = (com.google.android.apps.gsa.staticplugins.opa.s.a) hVar149.a();
                hVar150 = this.f297a.pn;
                at atVar3 = (at) hVar150.a();
                hVar151 = this.f297a.oh;
                at atVar4 = (at) hVar151.a();
                hVar152 = this.f297a.od;
                a b15 = c.b(hVar152);
                hVar153 = this.f297a.gq;
                p pVar8 = (p) hVar153.a();
                jyVar11 = this.f297a.f319a;
                hVar154 = jyVar11.fa;
                com.google.android.apps.gsa.staticplugins.opa.p.c cVar4 = (com.google.android.apps.gsa.staticplugins.opa.p.c) hVar154.a();
                hVar155 = this.f297a.hG;
                a b16 = c.b(hVar155);
                hVar156 = this.f297a.hU;
                a b17 = c.b(hVar156);
                ds dsVar14 = this.b;
                com.google.android.apps.gsa.staticplugins.opa.util.at gQ = dsVar14.gQ();
                hVar157 = dsVar14.iG;
                a b18 = c.b(hVar157);
                hVar158 = this.b.iH;
                a b19 = c.b(hVar158);
                hVar159 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar490 = (com.google.android.libraries.gsa.h.h) hVar159.a();
                hVar160 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar491 = (com.google.android.libraries.gsa.h.h) hVar160.a();
                hVar161 = this.f297a.gA;
                hVar162 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar492 = (com.google.android.libraries.gsa.h.h) hVar162.a();
                hVar163 = this.f297a.pw;
                at k = at.k((com.google.android.apps.gsa.staticplugins.accl.m) hVar163.a());
                hVar164 = this.b.iy;
                hVar165 = this.b.iI;
                com.google.android.apps.gsa.staticplugins.opa.util.w wVar = (com.google.android.apps.gsa.staticplugins.opa.util.w) hVar165.a();
                ds dsVar15 = this.b;
                com.google.android.apps.gsa.search.core.ae.a.a x = dsVar15.x();
                hVar166 = dsVar15.aW;
                com.google.android.apps.gsa.search.core.service.ay ayVar = (com.google.android.apps.gsa.search.core.service.ay) hVar166.a();
                hVar167 = this.f297a.kg;
                a b20 = c.b(hVar167);
                ds dsVar16 = this.b;
                com.google.android.apps.gsa.search.core.ae.aq.c ab3 = dsVar16.ab();
                hVar168 = dsVar16.q;
                a b21 = c.b(hVar168);
                jyVar12 = this.f297a.f319a;
                hVar169 = jyVar12.af;
                a b22 = c.b(hVar169);
                hVar170 = this.b.iJ;
                c.b(hVar170);
                jyVar13 = this.f297a.f319a;
                hVar171 = jyVar13.cb;
                at k2 = at.k((com.google.android.apps.gsa.staticplugins.nga.f.a.a.c) hVar171.a());
                hVar172 = this.b.bo;
                at atVar5 = (at) hVar172.a();
                hVar173 = this.f297a.qB;
                a b23 = c.b(hVar173);
                hVar174 = this.f297a.qD;
                a b24 = c.b(hVar174);
                ds dsVar17 = this.b;
                jo joVar17 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.worker.a bf = dsVar17.bf();
                hVar175 = joVar17.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar5 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar175.a();
                jo joVar18 = this.f297a;
                com.google.android.libraries.search.assistant.proactive.ag kr = joVar18.kr();
                hVar176 = joVar18.in;
                com.google.android.libraries.search.assistant.proactive.h.c cVar6 = (com.google.android.libraries.search.assistant.proactive.h.c) hVar176.a();
                hVar177 = this.f297a.W;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.s(xVar, atVar2, abVar, b11, b12, b13, context8, gVar4, b14, aVar8, aVar9, atVar3, atVar4, b15, pVar8, cVar4, b16, b17, gQ, b18, b19, hVar490, hVar491, hVar492, k, wVar, x, ayVar, b20, ab3, b21, b22, k2, atVar5, b23, b24, bf, cVar5, kr, cVar6, (com.google.android.libraries.search.t.i.y) hVar177.a());
            case 329:
                hVar178 = this.f297a.f;
                Context context9 = (Context) hVar178.a();
                jo joVar19 = this.f297a;
                ce ks = joVar19.ks();
                hVar179 = joVar19.oh;
                at atVar6 = (at) hVar179.a();
                hVar180 = this.f297a.uD;
                ProxyIntentStarter proxyIntentStarter = (ProxyIntentStarter) hVar180.a();
                hVar181 = this.f297a.gq;
                p pVar9 = (p) hVar181.a();
                hVar182 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar493 = (com.google.android.libraries.gsa.h.h) hVar182.a();
                hVar183 = this.f297a.od;
                com.google.android.apps.gsa.search.shared.g.h hVar494 = (com.google.android.apps.gsa.search.shared.g.h) hVar183.a();
                jyVar14 = this.f297a.f319a;
                hVar184 = jyVar14.gC;
                a b25 = c.b(hVar184);
                ds dsVar18 = this.b;
                jo joVar20 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.aq.a Z = dsVar18.Z();
                aq bK = dsVar18.bK();
                jyVar15 = joVar20.f319a;
                com.google.android.apps.gsa.opa.g.a S = jyVar15.S();
                hVar185 = this.b.hy;
                a b26 = c.b(hVar185);
                ds dsVar19 = this.b;
                jo joVar21 = this.f297a;
                com.google.android.libraries.search.assistant.proactive.ba bL = dsVar19.bL();
                jyVar16 = joVar21.f319a;
                hVar186 = jyVar16.af;
                a b27 = c.b(hVar186);
                hVar187 = this.f297a.oa;
                ca caVar2 = (ca) hVar187.a();
                hVar188 = this.f297a.in;
                com.google.android.libraries.search.assistant.proactive.h.c cVar7 = (com.google.android.libraries.search.assistant.proactive.h.c) hVar188.a();
                ds dsVar20 = this.b;
                jo joVar22 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opa.worker.proactive.b.a.b bg = dsVar20.bg();
                hVar189 = joVar22.gT;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.t(context9, ks, atVar6, proxyIntentStarter, pVar9, hVar493, hVar494, b25, Z, bK, S, b26, bL, b27, caVar2, cVar7, bg, (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar189.a());
            case 330:
                hVar190 = this.f297a.mS;
                return at.k((com.google.android.apps.gsa.assistant.shared.c) hVar190.a());
            case 331:
                ds dsVar21 = this.b;
                hVar191 = dsVar21.ar;
                hVar192 = dsVar21.j;
                hVar193 = dsVar21.b;
                return new com.google.android.apps.gsa.staticplugins.opa.az.g(hVar191, hVar192, hVar193);
            case 332:
                hVar194 = this.b.H;
                com.google.common.v.f fVar5 = (com.google.common.v.f) hVar194.a();
                hVar195 = this.f297a.nt;
                Resources resources = (Resources) hVar195.a();
                hVar196 = this.f297a.gq;
                p pVar10 = (p) hVar196.a();
                hVar197 = this.f297a.qv;
                com.google.android.apps.gsa.staticplugins.opa.morris2.h.j jVar = (com.google.android.apps.gsa.staticplugins.opa.morris2.h.j) hVar197.a();
                hVar198 = this.f297a.nb;
                com.google.android.libraries.assistant.auto.tng.morris.b.g gVar5 = (com.google.android.libraries.assistant.auto.tng.morris.b.g) hVar198.a();
                hVar199 = this.b.j;
                f fVar6 = (f) hVar199.a();
                hVar200 = this.f297a.gB;
                an anVar5 = (an) hVar200.a();
                hVar201 = this.f297a.gT;
                return new com.google.android.apps.gsa.staticplugins.opa.util.w(fVar5, resources, pVar10, jVar, gVar5, fVar6, anVar5, (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar201.a());
            case 333:
                hVar202 = this.f297a.gq;
                p pVar11 = (p) hVar202.a();
                hVar203 = this.f297a.gB;
                a b28 = c.b(hVar203);
                hVar204 = this.f297a.gf;
                a b29 = c.b(hVar204);
                hVar205 = this.f297a.hD;
                a b30 = c.b(hVar205);
                hVar206 = this.b.au;
                return new com.google.android.apps.gsa.assistant.settings.shared.h(pVar11, b28, b29, b30, c.b(hVar206));
            case 334:
                jyVar17 = this.f297a.f319a;
                hVar207 = jyVar17.gO;
                return at.k((com.google.android.apps.gsa.search.core.carassistant.a.a) hVar207.a());
            case 335:
                hVar208 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar495 = (com.google.android.libraries.gsa.h.h) hVar208.a();
                hVar209 = this.b.r;
                com.google.android.apps.gsa.shared.util.o.g gVar6 = (com.google.android.apps.gsa.shared.util.o.g) hVar209.a();
                hVar210 = this.f297a.gF;
                a b31 = c.b(hVar210);
                hVar211 = this.f297a.hM;
                com.google.android.apps.gsa.search.core.google.ai aiVar2 = (com.google.android.apps.gsa.search.core.google.ai) hVar211.a();
                hVar212 = this.f297a.f;
                Context context10 = (Context) hVar212.a();
                hVar213 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar496 = (com.google.android.libraries.gsa.h.h) hVar213.a();
                hVar214 = this.b.n;
                return new com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.k(hVar495, gVar6, b31, aiVar2, context10, hVar496, (com.google.android.apps.gsa.shared.v.ae) hVar214.a());
            case 336:
                hVar215 = this.f297a.f;
                Context context11 = (Context) hVar215.a();
                hVar216 = this.f297a.gq;
                p pVar12 = (p) hVar216.a();
                hVar217 = this.b.hD;
                com.google.android.apps.gsa.staticplugins.opa.bg.r rVar3 = (com.google.android.apps.gsa.staticplugins.opa.bg.r) hVar217.a();
                hVar218 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar497 = (com.google.android.libraries.gsa.h.h) hVar218.a();
                hVar219 = this.f297a.Vn;
                com.google.android.apps.gsa.r.f.ag agVar = (com.google.android.apps.gsa.r.f.ag) hVar219.a();
                hVar220 = this.f297a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar8 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar220.a();
                hVar221 = this.f297a.uM;
                com.google.android.apps.search.assistant.platform.pcp.api.r rVar4 = (com.google.android.apps.search.assistant.platform.pcp.api.r) hVar221.a();
                hVar222 = this.f297a.g;
                com.google.android.libraries.g.a aVar10 = (com.google.android.libraries.g.a) hVar222.a();
                Optional of4 = Optional.of(this.f297a.fn());
                hVar223 = this.f297a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar5 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar223.a();
                hVar224 = this.f297a.nP;
                com.google.android.apps.gsa.opa.smartspace.p pVar13 = (com.google.android.apps.gsa.opa.smartspace.p) hVar224.a();
                ds dsVar22 = this.b;
                jo joVar23 = this.f297a;
                com.google.android.apps.search.assistant.platform.pcp.j.av bD = dsVar22.bD();
                hVar225 = joVar23.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar11 = (com.google.android.apps.gsa.opa.a.a.a) hVar225.a();
                hVar226 = this.f297a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar4 = (com.google.android.apps.gsa.opa.smartspace.d) hVar226.a();
                hVar227 = this.f297a.lu;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.ab(context11, pVar12, rVar3, hVar497, agVar, cVar8, rVar4, aVar10, of4, rVar5, pVar13, bD, aVar11, dVar4, (com.google.android.apps.gsa.search.core.ae) hVar227.a());
            case 337:
                hVar228 = this.b.iO;
                a b32 = c.b(hVar228);
                hVar229 = this.f297a.gq;
                a b33 = c.b(hVar229);
                hVar230 = this.b.iQ;
                a b34 = c.b(hVar230);
                hVar231 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar498 = (com.google.android.libraries.gsa.h.h) hVar231.a();
                hVar232 = this.f297a.ha;
                com.google.android.apps.gsa.shared.util.c.a.g gVar7 = (com.google.android.apps.gsa.shared.util.c.a.g) hVar232.a();
                hVar233 = this.f297a.za;
                a b35 = c.b(hVar233);
                hVar234 = this.f297a.uj;
                a b36 = c.b(hVar234);
                hVar235 = this.f297a.ur;
                c.b(hVar235);
                hVar236 = this.f297a.yQ;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.h.f(b32, b33, b34, hVar498, gVar7, b35, b36, c.b(hVar236));
            case 338:
                jo joVar24 = this.f297a;
                ds dsVar23 = this.b;
                hVar237 = joVar24.nz;
                hVar238 = dsVar23.iN;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.h.c(hVar237, e.c.i.b(hVar238));
            case 339:
                return new mm(this.f297a, this.b, (byte[]) null);
            case 340:
                hVar239 = this.f297a.f;
                Context context12 = (Context) hVar239.a();
                hVar240 = this.f297a.ug;
                com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.a aVar12 = (com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.a) hVar240.a();
                hVar241 = this.f297a.hP;
                a b37 = c.b(hVar241);
                hVar242 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar499 = (com.google.android.libraries.gsa.h.h) hVar242.a();
                hVar243 = this.f297a.as;
                com.google.android.libraries.storage.a.j jVar2 = (com.google.android.libraries.storage.a.j) hVar243.a();
                hVar244 = this.f297a.tZ;
                com.google.android.apps.gsa.staticplugins.opa.tapas.d.a.g gVar8 = (com.google.android.apps.gsa.staticplugins.opa.tapas.d.a.g) hVar244.a();
                jo joVar25 = this.f297a;
                Optional empty2 = Optional.empty();
                hVar245 = joVar25.aaD;
                TapasJni tapasJni = (TapasJni) hVar245.a();
                hVar246 = this.f297a.gq;
                p pVar14 = (p) hVar246.a();
                hVar247 = this.b.iP;
                a b38 = c.b(hVar247);
                hVar248 = this.f297a.uh;
                return new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e(context12, aVar12, b37, hVar499, jVar2, gVar8, empty2, tapasJni, pVar14, b38, (com.google.android.libraries.assistant.c.b.a.a.a) hVar248.a());
            case 341:
                hVar249 = this.b.H;
                return new com.google.android.apps.gsa.staticplugins.opa.tapas.n.g.a(c.b(hVar249));
            case 342:
                hVar250 = this.f297a.f;
                hVar251 = this.b.bp;
                a b39 = c.b(hVar251);
                hVar252 = this.f297a.gq;
                p pVar15 = (p) hVar252.a();
                hVar253 = this.b.aW;
                com.google.android.apps.gsa.search.core.service.ay ayVar2 = (com.google.android.apps.gsa.search.core.service.ay) hVar253.a();
                hVar254 = this.f297a.ha;
                com.google.android.apps.gsa.shared.util.c.a.g gVar9 = (com.google.android.apps.gsa.shared.util.c.a.g) hVar254.a();
                hVar255 = this.f297a.g;
                com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) hVar255.a();
                ds dsVar24 = this.b;
                jo joVar26 = this.f297a;
                com.google.android.apps.gsa.staticplugins.opamediaplayer.b.c bh = dsVar24.bh();
                hVar256 = joVar26.gY;
                return new com.google.android.apps.gsa.staticplugins.opamediaplayer.h.f(b39, pVar15, ayVar2, gVar9, aVar13, bh);
            case 343:
                hVar257 = this.f297a.f;
                Context context13 = (Context) hVar257.a();
                ds dsVar25 = this.b;
                jo joVar27 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.l.a F = dsVar25.F();
                hVar258 = joVar27.gv;
                com.google.android.libraries.gsa.h.h hVar500 = (com.google.android.libraries.gsa.h.h) hVar258.a();
                hVar259 = this.b.iS;
                com.google.android.libraries.gsa.h.h hVar501 = (com.google.android.libraries.gsa.h.h) hVar259.a();
                hVar260 = this.b.iT;
                com.google.android.libraries.gsa.h.h hVar502 = (com.google.android.libraries.gsa.h.h) hVar260.a();
                hVar261 = this.f297a.gf;
                a b40 = c.b(hVar261);
                ds dsVar26 = this.b;
                jo joVar28 = this.f297a;
                Set gz = dsVar26.gz();
                hVar262 = joVar28.gq;
                return new com.google.android.apps.gsa.staticplugins.opamediaplayer.ac(context13, F, hVar500, hVar501, hVar502, b40, gz, (p) hVar262.a());
            case 344:
                hVar263 = this.f297a.gu;
                return com.google.android.apps.gsa.staticplugins.opamediaplayer.a.c.b((com.google.android.apps.gsa.shared.util.c.a.aw) hVar263.a());
            case 345:
                hVar264 = this.f297a.gu;
                return com.google.android.apps.gsa.staticplugins.opamediaplayer.a.c.c((com.google.android.apps.gsa.shared.util.c.a.aw) hVar264.a());
            case 346:
                return new com.google.android.apps.gsa.staticplugins.opamediaplayer.b.a.a();
            case 347:
                hVar265 = this.f297a.f;
                Context context14 = (Context) hVar265.a();
                hVar266 = this.f297a.gA;
                com.google.android.libraries.gsa.h.h hVar503 = (com.google.android.libraries.gsa.h.h) hVar266.a();
                hVar267 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar504 = (com.google.android.libraries.gsa.h.h) hVar267.a();
                hVar268 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar505 = (com.google.android.libraries.gsa.h.h) hVar268.a();
                hVar269 = this.f297a.gB;
                a b41 = c.b(hVar269);
                hVar270 = this.f297a.gm;
                return new com.google.android.apps.gsa.staticplugins.bb.a.i(context14, hVar503, hVar504, hVar505, b41);
            case 348:
                hVar271 = this.b.p;
                return new com.google.android.apps.gsa.staticplugins.be.a((com.google.android.apps.gsa.search.core.service.x) hVar271.a());
            case 349:
                hVar272 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar506 = (com.google.android.libraries.gsa.h.h) hVar272.a();
                hVar273 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar507 = (com.google.android.libraries.gsa.h.h) hVar273.a();
                hVar274 = this.b.jb;
                a b42 = c.b(hVar274);
                jo joVar29 = this.f297a;
                hVar275 = joVar29.nz;
                hVar276 = joVar29.hD;
                a b43 = c.b(hVar276);
                hVar277 = this.b.bq;
                a b44 = c.b(hVar277);
                hVar278 = this.b.br;
                a b45 = c.b(hVar278);
                hVar279 = this.f297a.hY;
                return new com.google.android.apps.gsa.staticplugins.bf.e(hVar506, hVar507, b42, hVar275, b43, b44, b45, c.b(hVar279));
            case 350:
                return new com.google.android.apps.gsa.staticplugins.bi.i.b.i.b(this.b.bs());
            case 351:
                return new hh(this.f297a, this.b);
            case 352:
                jyVar18 = this.f297a.f319a;
                hVar280 = jyVar18.gP;
                com.google.android.apps.gsa.x.d.a.a aVar14 = (com.google.android.apps.gsa.x.d.a.a) hVar280.a();
                hVar281 = this.f297a.gq;
                com.google.android.apps.gsa.shared.k.c cVar9 = (com.google.android.apps.gsa.shared.k.c) hVar281.a();
                ds dsVar27 = this.b;
                com.google.android.apps.gsa.b.f.u c = dsVar27.c();
                dsVar27.gJ();
                hVar282 = this.b.je;
                a b46 = c.b(hVar282);
                hVar283 = this.f297a.hG;
                a b47 = c.b(hVar283);
                jyVar19 = this.f297a.f319a;
                hVar284 = jyVar19.gQ;
                a b48 = c.b(hVar284);
                hVar285 = this.b.jf;
                a b49 = c.b(hVar285);
                hVar286 = this.f297a.ha;
                com.google.android.apps.gsa.shared.util.c.a.g gVar10 = (com.google.android.apps.gsa.shared.util.c.a.g) hVar286.a();
                hVar287 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar508 = (com.google.android.libraries.gsa.h.h) hVar287.a();
                jyVar20 = this.f297a.f319a;
                hVar288 = jyVar20.gR;
                a b50 = c.b(hVar288);
                jyVar21 = this.f297a.f319a;
                hVar289 = jyVar21.gS;
                com.google.android.apps.gsa.speech.audio.k kVar3 = (com.google.android.apps.gsa.speech.audio.k) hVar289.a();
                hVar290 = this.b.jg;
                a b51 = c.b(hVar290);
                jyVar22 = this.f297a.f319a;
                hVar291 = jyVar22.gT;
                a b52 = c.b(hVar291);
                jyVar23 = this.f297a.f319a;
                hVar292 = jyVar23.gU;
                a b53 = c.b(hVar292);
                jyVar24 = this.f297a.f319a;
                hVar293 = jyVar24.gp;
                a b54 = c.b(hVar293);
                jyVar25 = this.f297a.f319a;
                hVar294 = jyVar25.gM;
                return new com.google.android.apps.gsa.b.f.i(aVar14, cVar9, c, b46, b47, b48, b49, gVar10, hVar508, b50, kVar3, b51, b52, b53, b54, (at) hVar294.a());
            case 353:
                ds dsVar28 = this.b;
                jo joVar30 = this.f297a;
                com.google.android.libraries.search.d.s.b.b bO = dsVar28.bO();
                hVar295 = joVar30.ha;
                com.google.android.apps.gsa.shared.util.c.a.g gVar11 = (com.google.android.apps.gsa.shared.util.c.a.g) hVar295.a();
                hVar296 = this.b.jc;
                return new com.google.android.apps.gsa.b.f.a(bO, gVar11, c.b(hVar296));
            case 354:
                hVar297 = this.f297a.gF;
                a b55 = c.b(hVar297);
                hVar298 = this.f297a.hG;
                return new com.google.android.apps.gsa.b.f.b(b55, c.b(hVar298));
            case 355:
                hVar299 = this.f297a.ps;
                com.google.android.apps.gsa.x.a.e eVar = (com.google.android.apps.gsa.x.a.e) hVar299.a();
                hVar300 = this.f297a.f;
                Context context15 = (Context) hVar300.a();
                hVar301 = this.f297a.gz;
                return new com.google.android.apps.gsa.b.f.w(eVar, context15, (com.google.android.libraries.gsa.h.h) hVar301.a());
            case 356:
                hVar302 = this.f297a.cQ;
                a b56 = c.b(hVar302);
                jyVar26 = this.f297a.f319a;
                hVar303 = jyVar26.gQ;
                return new com.google.android.apps.gsa.b.f.x(b56, c.b(hVar303));
            case 357:
                return new com.google.android.apps.gsa.b.f.f();
            case 358:
                hVar304 = this.f297a.f;
                Context context16 = (Context) hVar304.a();
                hVar305 = this.f297a.gq;
                com.google.android.apps.gsa.shared.k.c cVar10 = (com.google.android.apps.gsa.shared.k.c) hVar305.a();
                jyVar27 = this.f297a.f319a;
                hVar306 = jyVar27.vi;
                com.google.android.apps.gsa.speech.audio.n nVar2 = (com.google.android.apps.gsa.speech.audio.n) hVar306.a();
                jyVar28 = this.f297a.f319a;
                hVar307 = jyVar28.vv;
                a b57 = c.b(hVar307);
                hVar308 = this.f297a.g;
                hVar309 = this.f297a.ps;
                a b58 = c.b(hVar309);
                hVar310 = this.f297a.hY;
                a b59 = c.b(hVar310);
                jyVar29 = this.f297a.f319a;
                com.google.android.apps.gsa.speech.audio.c.i ac = jyVar29.ac();
                hVar311 = this.f297a.cQ;
                a b60 = c.b(hVar311);
                hVar312 = this.f297a.hG;
                a b61 = c.b(hVar312);
                hVar313 = this.f297a.kg;
                return new com.google.android.apps.gsa.x.e.a.d.a(context16, cVar10, nVar2, b57, b58, b59, ac, b60, b61, c.b(hVar313));
            case 359:
                hVar314 = this.b.p;
                a b62 = c.b(hVar314);
                hVar315 = this.f297a.gB;
                a b63 = c.b(hVar315);
                hVar316 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar509 = (com.google.android.libraries.gsa.h.h) hVar316.a();
                ds dsVar29 = this.b;
                com.google.android.apps.gsa.staticplugins.bh.c bi = dsVar29.bi();
                hVar317 = dsVar29.G;
                com.google.android.apps.gsa.search.core.q.a.i iVar3 = (com.google.android.apps.gsa.search.core.q.a.i) hVar317.a();
                hVar318 = this.f297a.nz;
                return new com.google.android.apps.gsa.staticplugins.bh.e(b62, b63, hVar509, bi, iVar3, (com.google.android.apps.gsa.search.core.y.a.a) hVar318.a());
            case 360:
                ds dsVar30 = this.b;
                com.google.android.apps.gsa.staticplugins.bi.i.b.b.c.h bm = dsVar30.bm();
                com.google.android.apps.gsa.staticplugins.bi.i.b.b.d.b bn = dsVar30.bn();
                com.google.android.apps.gsa.staticplugins.bi.i.b.b.e.b bo = dsVar30.bo();
                com.google.android.apps.gsa.staticplugins.bi.i.b.d.b bp = dsVar30.bp();
                com.google.android.apps.gsa.staticplugins.bi.i.b.f.b bq = dsVar30.bq();
                com.google.android.apps.gsa.staticplugins.bi.d.c bj = dsVar30.bj();
                hVar319 = dsVar30.jp;
                a b64 = c.b(hVar319);
                ds dsVar31 = this.b;
                com.google.android.apps.gsa.staticplugins.bi.i.b.h.d br = dsVar31.br();
                com.google.android.apps.gsa.staticplugins.bi.i.b.j.h bt = dsVar31.bt();
                com.google.android.apps.gsa.staticplugins.bi.i.b.k.b bu = dsVar31.bu();
                hVar320 = dsVar31.b;
                com.google.android.libraries.gsa.h.h hVar510 = (com.google.android.libraries.gsa.h.h) hVar320.a();
                hVar321 = this.f297a.gp;
                return new com.google.android.apps.gsa.staticplugins.bi.c(bm, bn, bo, bp, bq, bj, b64, br, bt, bu, hVar510, (com.google.android.libraries.gsa.h.h) hVar321.a());
            case 361:
                return new gt(this.f297a, this.b);
            case 362:
                return new gt(this.f297a, this.b);
            case 363:
                return new gt(this.f297a, this.b);
            case 364:
                return new gt(this.f297a, this.b);
            case 365:
                return new gt(this.f297a, this.b);
            case 366:
                return new du(this.b);
            case 367:
                hVar322 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar511 = (com.google.android.libraries.gsa.h.h) hVar322.a();
                hVar323 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar512 = (com.google.android.libraries.gsa.h.h) hVar323.a();
                ds dsVar32 = this.b;
                jo joVar31 = this.f297a;
                com.google.android.apps.gsa.staticplugins.bi.i.b.a.b.c bk = dsVar32.bk();
                com.google.android.apps.gsa.staticplugins.bi.i.b.a.d.b bl = dsVar32.bl();
                hVar324 = joVar31.mm;
                com.google.android.apps.gsa.speech.e.c.t tVar = (com.google.android.apps.gsa.speech.e.c.t) hVar324.a();
                hVar325 = this.f297a.gV;
                com.google.android.apps.gsa.speech.o.g gVar12 = (com.google.android.apps.gsa.speech.o.g) hVar325.a();
                hVar326 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.bi.i.b.a.c(hVar511, hVar512, bk, bl, tVar, gVar12, (p) hVar326.a());
            case 368:
                return new gt(this.f297a, this.b);
            case 369:
                return new gt(this.f297a, this.b);
            case 370:
                return new gt(this.f297a, this.b);
            case 371:
                return new gt(this.f297a, this.b);
            case 372:
                return new gt(this.f297a, this.b);
            case 373:
                hVar327 = this.f297a.gy;
                return new com.google.android.apps.gsa.staticplugins.bj.a((com.google.android.apps.gsa.shared.util.c.a.an) hVar327.a(), this.b.ay());
            case 374:
                hVar328 = this.f297a.gq;
                p pVar16 = (p) hVar328.a();
                hVar329 = this.b.G;
                com.google.android.apps.gsa.search.core.q.a.i iVar4 = (com.google.android.apps.gsa.search.core.q.a.i) hVar329.a();
                hVar330 = this.f297a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar15 = (com.google.android.apps.gsa.search.core.y.a.a) hVar330.a();
                hVar331 = this.f297a.pm;
                return new com.google.android.apps.gsa.search.core.google.b.c(pVar16, iVar4, aVar15, (am) hVar331.a());
            case 375:
                hVar332 = this.f297a.oD;
                com.google.android.apps.gsa.staticplugins.bl.f fVar7 = (com.google.android.apps.gsa.staticplugins.bl.f) hVar332.a();
                hVar333 = this.b.n;
                com.google.android.apps.gsa.shared.v.ae aeVar5 = (com.google.android.apps.gsa.shared.v.ae) hVar333.a();
                ds dsVar33 = this.b;
                jo joVar32 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.q.a I = dsVar33.I();
                hVar334 = joVar32.Ue;
                com.google.android.apps.gsa.x.f.a.a aVar16 = (com.google.android.apps.gsa.x.f.a.a) hVar334.a();
                hVar335 = this.f297a.gq;
                p pVar17 = (p) hVar335.a();
                hVar336 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar6 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar336.a();
                hVar337 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar513 = (com.google.android.libraries.gsa.h.h) hVar337.a();
                hVar338 = this.f297a.gm;
                hVar339 = this.f297a.gf;
                hVar340 = this.f297a.gi;
                String str2 = (String) hVar340.a();
                hVar341 = this.f297a.gB;
                com.google.android.apps.gsa.speech.helper.a aVar17 = (com.google.android.apps.gsa.speech.helper.a) hVar341.a();
                hVar342 = this.f297a.gz;
                return new com.google.android.apps.gsa.staticplugins.bl.x(fVar7, aeVar5, I, aVar16, pVar17, anVar6, hVar513, str2, aVar17, (com.google.android.libraries.gsa.h.h) hVar342.a());
            case 376:
                ds dsVar34 = this.b;
                jo joVar33 = this.f297a;
                com.google.android.apps.gsa.staticplugins.s3request.producers.k bw = dsVar34.bw();
                com.google.android.apps.gsa.staticplugins.s3request.producers.e bv = dsVar34.bv();
                hVar343 = joVar33.gp;
                return new com.google.android.apps.gsa.staticplugins.s3request.b(bw, bv, (com.google.android.libraries.gsa.h.h) hVar343.a());
            case 377:
                hVar344 = this.f297a.pf;
                hVar345 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar7 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar345.a();
                ds dsVar35 = this.b;
                jo joVar34 = this.f297a;
                com.google.android.apps.gsa.s3.producers.l l = dsVar35.l();
                hVar346 = joVar34.gz;
                return new com.google.android.apps.gsa.staticplugins.s3request.c.f(anVar7, l, (com.google.android.libraries.gsa.h.h) hVar346.a());
            case 378:
                return new md(this.f297a, this.b);
            case 379:
                return new md(this.f297a, this.b, (byte[]) null);
            case 380:
                return new md(this.f297a, this.b);
            case 381:
                hVar347 = this.f297a.f;
                Context context17 = (Context) hVar347.a();
                hVar348 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar8 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar348.a();
                hVar349 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar514 = (com.google.android.libraries.gsa.h.h) hVar349.a();
                hVar350 = this.b.bw;
                a b65 = c.b(hVar350);
                hVar351 = this.f297a.pE;
                com.google.android.apps.gsa.search.core.ad.b bVar5 = (com.google.android.apps.gsa.search.core.ad.b) hVar351.a();
                hVar352 = this.f297a.gV;
                com.google.android.apps.gsa.speech.o.g gVar13 = (com.google.android.apps.gsa.speech.o.g) hVar352.a();
                hVar353 = this.f297a.gq;
                p pVar18 = (p) hVar353.a();
                hVar354 = this.f297a.oF;
                com.google.android.apps.gsa.speech.m.b.a aVar18 = (com.google.android.apps.gsa.speech.m.b.a) hVar354.a();
                hVar355 = this.f297a.gB;
                com.google.android.apps.gsa.speech.helper.a aVar19 = (com.google.android.apps.gsa.speech.helper.a) hVar355.a();
                hVar356 = this.f297a.hD;
                a b66 = c.b(hVar356);
                hVar357 = this.f297a.oE;
                a b67 = c.b(hVar357);
                jo joVar35 = this.f297a;
                hVar358 = joVar35.gf;
                jyVar30 = joVar35.f319a;
                hVar359 = jyVar30.vw;
                com.google.android.apps.gsa.assist.b.c cVar11 = (com.google.android.apps.gsa.assist.b.c) hVar359.a();
                jyVar31 = this.f297a.f319a;
                hVar360 = jyVar31.hb;
                com.google.android.apps.gsa.s3.producers.e eVar2 = (com.google.android.apps.gsa.s3.producers.e) hVar360.a();
                jyVar32 = this.f297a.f319a;
                hVar361 = jyVar32.ha;
                com.google.android.apps.gsa.s3.producers.a aVar20 = (com.google.android.apps.gsa.s3.producers.a) hVar361.a();
                hVar362 = this.f297a.oY;
                com.google.android.apps.gsa.assist.a.i iVar5 = (com.google.android.apps.gsa.assist.a.i) hVar362.a();
                ds dsVar36 = this.b;
                jo joVar36 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bd.a aj = dsVar36.aj();
                hVar363 = joVar36.gp;
                com.google.android.libraries.gsa.h.h hVar515 = (com.google.android.libraries.gsa.h.h) hVar363.a();
                hVar364 = this.f297a.hG;
                return new com.google.android.apps.gsa.staticplugins.bm.h(context17, anVar8, hVar514, b65, bVar5, gVar13, pVar18, aVar18, aVar19, b66, b67, hVar358, cVar11, eVar2, aVar20, iVar5, aj, hVar515, c.b(hVar364));
            case 382:
                ds dsVar37 = this.b;
                jo joVar37 = this.f297a;
                hVar365 = dsVar37.bv;
                hVar366 = joVar37.ps;
                c.b(hVar366);
                jyVar33 = this.f297a.f319a;
                hVar367 = jyVar33.hc;
                hVar368 = this.f297a.gq;
                a b68 = c.b(hVar368);
                hVar369 = this.f297a.hs;
                c.b(hVar369);
                hVar370 = this.f297a.gB;
                a b69 = c.b(hVar370);
                hVar371 = this.f297a.go;
                a b70 = c.b(hVar371);
                jyVar34 = this.f297a.f319a;
                hVar372 = jyVar34.bC;
                com.google.android.apps.gsa.assistant.shared.aw awVar = (com.google.android.apps.gsa.assistant.shared.aw) hVar372.a();
                hVar373 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar = (com.google.android.apps.gsa.assistant.shared.z) hVar373.a();
                hVar374 = this.b.br;
                return new com.google.android.apps.gsa.speech.m.e(hVar365, b68, b69, b70, awVar, zVar);
            case 383:
                hVar375 = this.f297a.gq;
                return new com.google.android.apps.gsa.speech.m.c((p) hVar375.a());
            case 384:
                hVar376 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar2 = (com.google.android.apps.gsa.search.core.service.x) hVar376.a();
                hVar377 = this.b.jC;
                com.google.android.apps.gsa.search.core.state.d.ah ahVar = (com.google.android.apps.gsa.search.core.state.d.ah) hVar377.a();
                hVar378 = this.f297a.gf;
                hVar379 = this.b.b;
                return new com.google.android.apps.gsa.staticplugins.bo.b(xVar2, ahVar, (com.google.android.libraries.gsa.h.h) hVar379.a());
            case 385:
                hVar380 = this.b.em;
                a b71 = c.b(hVar380);
                hVar381 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.ah(b71);
            case 386:
                hVar382 = this.f297a.f;
                Context context18 = (Context) hVar382.a();
                hVar383 = this.f297a.mj;
                ContentResolver contentResolver = (ContentResolver) hVar383.a();
                hVar384 = this.b.r;
                com.google.android.apps.gsa.shared.util.o.g gVar14 = (com.google.android.apps.gsa.shared.util.o.g) hVar384.a();
                ds dsVar38 = this.b;
                jo joVar38 = this.f297a;
                com.google.android.apps.gsa.shared.util.permissions.f aD = dsVar38.aD();
                hVar385 = joVar38.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar21 = (com.google.android.apps.gsa.search.core.y.a.a) hVar385.a();
                hVar386 = this.b.G;
                com.google.android.apps.gsa.search.core.q.a.i iVar6 = (com.google.android.apps.gsa.search.core.q.a.i) hVar386.a();
                hVar387 = this.f297a.g;
                com.google.android.libraries.g.a aVar22 = (com.google.android.libraries.g.a) hVar387.a();
                hVar388 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar516 = (com.google.android.libraries.gsa.h.h) hVar388.a();
                hVar389 = this.f297a.gz;
                return new com.google.android.apps.gsa.staticplugins.br.f.j(context18, contentResolver, gVar14, aD, aVar21, iVar6, aVar22, hVar516, (com.google.android.libraries.gsa.h.h) hVar389.a());
            case 387:
                hVar390 = this.f297a.oC;
                com.google.android.apps.gsa.search.core.google.w wVar2 = (com.google.android.apps.gsa.search.core.google.w) hVar390.a();
                hVar391 = this.f297a.lN;
                com.google.android.apps.gsa.n.h hVar517 = (com.google.android.apps.gsa.n.h) hVar391.a();
                hVar392 = this.f297a.uD;
                ProxyIntentStarter proxyIntentStarter2 = (ProxyIntentStarter) hVar392.a();
                hVar393 = this.f297a.gv;
                com.google.android.libraries.gsa.h.h hVar518 = (com.google.android.libraries.gsa.h.h) hVar393.a();
                hVar394 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar519 = (com.google.android.libraries.gsa.h.h) hVar394.a();
                hVar395 = this.f297a.f;
                Context context19 = (Context) hVar395.a();
                hVar396 = this.f297a.gT;
                return new com.google.android.apps.gsa.staticplugins.br.d.o(wVar2, hVar517, proxyIntentStarter2, hVar518, hVar519, context19, (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar396.a(), this.b.bP());
            case 388:
                this.b.bx();
                return new com.google.android.apps.gsa.staticplugins.smartspace.b.a();
            case 389:
                hVar397 = this.f297a.f;
                Context context20 = (Context) hVar397.a();
                hVar398 = this.f297a.g;
                com.google.android.libraries.g.a aVar23 = (com.google.android.libraries.g.a) hVar398.a();
                hVar399 = this.f297a.hs;
                s sVar = (s) hVar399.a();
                hVar400 = this.f297a.gq;
                p pVar19 = (p) hVar400.a();
                hVar401 = this.f297a.oo;
                com.google.android.apps.gsa.shared.t.ac acVar = (com.google.android.apps.gsa.shared.t.ac) hVar401.a();
                hVar402 = this.f297a.ov;
                com.google.android.apps.gsa.smartspace.k kVar4 = (com.google.android.apps.gsa.smartspace.k) hVar402.a();
                ds dsVar39 = this.b;
                jo joVar39 = this.f297a;
                com.google.android.apps.gsa.staticplugins.smartspace.b.c bx = dsVar39.bx();
                jyVar35 = joVar39.f319a;
                hVar403 = jyVar35.vR;
                com.google.android.apps.gsa.staticplugins.smartspace.e.c cVar12 = (com.google.android.apps.gsa.staticplugins.smartspace.e.c) hVar403.a();
                ds dsVar40 = this.b;
                jo joVar40 = this.f297a;
                com.google.android.apps.gsa.search.core.preferences.o q = dsVar40.q();
                hVar404 = joVar40.gp;
                com.google.android.libraries.gsa.h.h hVar520 = (com.google.android.libraries.gsa.h.h) hVar404.a();
                hVar405 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar521 = (com.google.android.libraries.gsa.h.h) hVar405.a();
                jyVar36 = this.f297a.f319a;
                hVar406 = jyVar36.bD;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.o.b bVar6 = (com.google.android.apps.gsa.staticplugins.opa.smartspace.o.b) hVar406.a();
                hVar407 = this.f297a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar5 = (com.google.android.apps.gsa.opa.smartspace.d) hVar407.a();
                hVar408 = this.f297a.oi;
                com.google.android.apps.gsa.opa.smartspace.c cVar13 = (com.google.android.apps.gsa.opa.smartspace.c) hVar408.a();
                hVar409 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar2 = (com.google.android.apps.gsa.assistant.shared.z) hVar409.a();
                hVar410 = this.f297a.oM;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.k.k kVar5 = (com.google.android.apps.gsa.staticplugins.opa.smartspace.k.k) hVar410.a();
                hVar411 = this.f297a.oL;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q qVar = (com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q) hVar411.a();
                jo joVar41 = this.f297a;
                ds dsVar41 = this.b;
                com.google.android.apps.gsa.opa.smartspace.b.a cF = joVar41.cF();
                com.google.android.apps.gsa.opa.smartspace.g.c k3 = dsVar41.k();
                jyVar37 = joVar41.f319a;
                com.google.android.apps.gsa.staticplugins.opa.util.bs aO = jyVar37.aO();
                hVar412 = this.f297a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar14 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar412.a();
                hVar413 = this.f297a.uN;
                a b72 = c.b(hVar413);
                hVar414 = this.f297a.uM;
                com.google.android.apps.search.assistant.platform.pcp.api.r rVar6 = (com.google.android.apps.search.assistant.platform.pcp.api.r) hVar414.a();
                com.google.android.apps.search.assistant.verticals.ambient.smartspace.f fVar8 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.f();
                hVar415 = this.f297a.oI;
                com.google.android.apps.gsa.smartspace.l lVar = (com.google.android.apps.gsa.smartspace.l) hVar415.a();
                hVar416 = this.f297a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar7 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar416.a();
                at k4 = at.k(this.f297a.fn());
                hVar417 = this.f297a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar24 = (com.google.android.apps.gsa.opa.a.a.a) hVar417.a();
                hVar418 = this.f297a.ls;
                com.google.android.apps.gsa.search.core.aa.a.c cVar15 = (com.google.android.apps.gsa.search.core.aa.a.c) hVar418.a();
                jo joVar42 = this.f297a;
                com.google.android.apps.search.assistant.platform.pcp.j.as fm = joVar42.fm();
                hVar419 = joVar42.TO;
                com.google.android.apps.gsa.opa.smartspace.e.a aVar25 = (com.google.android.apps.gsa.opa.smartspace.e.a) hVar419.a();
                hVar420 = this.f297a.nP;
                com.google.android.apps.gsa.opa.smartspace.p pVar20 = (com.google.android.apps.gsa.opa.smartspace.p) hVar420.a();
                hVar421 = this.f297a.gB;
                an anVar9 = (an) hVar421.a();
                hVar422 = this.f297a.lN;
                com.google.android.apps.gsa.n.h hVar522 = (com.google.android.apps.gsa.n.h) hVar422.a();
                hVar423 = this.f297a.Un;
                com.google.android.apps.gsa.smartspace.b.f fVar9 = (com.google.android.apps.gsa.smartspace.b.f) hVar423.a();
                hVar424 = this.f297a.H;
                Executor executor = (Executor) hVar424.a();
                jyVar38 = this.f297a.f319a;
                return new com.google.android.apps.gsa.staticplugins.smartspace.ah(context20, aVar23, sVar, pVar19, acVar, kVar4, bx, cVar12, q, hVar520, hVar521, bVar6, dVar5, cVar13, zVar2, kVar5, qVar, cF, k3, aO, cVar14, b72, rVar6, fVar8, lVar, rVar7, k4, aVar24, cVar15, fm, aVar25, pVar20, anVar9, hVar522, fVar9, executor, jyVar38.ct());
            case 390:
                hVar425 = this.f297a.ov;
                com.google.android.apps.gsa.smartspace.k kVar6 = (com.google.android.apps.gsa.smartspace.k) hVar425.a();
                hVar426 = this.b.H;
                com.google.common.v.f fVar10 = (com.google.common.v.f) hVar426.a();
                hVar427 = this.f297a.gq;
                p pVar21 = (p) hVar427.a();
                hVar428 = this.f297a.ls;
                com.google.android.apps.gsa.search.core.aa.a.c cVar16 = (com.google.android.apps.gsa.search.core.aa.a.c) hVar428.a();
                hVar429 = this.f297a.oA;
                return new com.google.android.apps.gsa.smartspace.c(kVar6, fVar10, pVar21, cVar16, (com.google.android.apps.gsa.assistant.settings.features.d.w) hVar429.a());
            case 391:
                ds dsVar42 = this.b;
                jo joVar43 = this.f297a;
                com.google.android.apps.gsa.staticplugins.smartspace.widget.e by = dsVar42.by();
                hVar430 = joVar43.f;
                Context context21 = (Context) hVar430.a();
                ds dsVar43 = this.b;
                jo joVar44 = this.f297a;
                com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.v bG = dsVar43.bG();
                hVar431 = joVar44.ls;
                return new com.google.android.apps.gsa.staticplugins.smartspace.widget.h(by, context21, bG, (com.google.android.apps.gsa.search.core.aa.a.c) hVar431.a());
            case 392:
                ds dsVar44 = this.b;
                jo joVar45 = this.f297a;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.d.j bB = dsVar44.bB();
                hVar432 = joVar45.H;
                cq cqVar5 = (cq) hVar432.a();
                hVar433 = this.f297a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar22 = (com.google.apps.tiktok.contrib.work.b.p) hVar433.a();
                hVar434 = this.f297a.v;
                cr crVar = (cr) hVar434.a();
                jo joVar46 = this.f297a;
                com.google.android.apps.search.assistant.platform.pcp.j.as fm2 = joVar46.fm();
                hVar435 = joVar46.wu;
                com.google.android.libraries.assistant.pcp.v.b.g gVar15 = (com.google.android.libraries.assistant.pcp.v.b.g) hVar435.a();
                hVar436 = this.f297a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar26 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar436.a();
                hVar437 = this.f297a.f;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac(bB, cqVar5, pVar22, crVar, fm2, gVar15, aVar26, (Context) hVar437.a());
            case 393:
                hVar438 = this.b.jJ;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac acVar2 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac) hVar438.a();
                hVar439 = this.f297a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar23 = (com.google.apps.tiktok.contrib.work.b.p) hVar439.a();
                jo joVar47 = this.f297a;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m(acVar2, pVar23, joVar47.on(), joVar47.fm());
            case 394:
                hVar440 = this.f297a.f;
                hVar441 = this.f297a.hW;
                return new com.google.android.apps.gsa.staticplugins.bt.a((com.google.android.apps.gsa.speech.audio.a.f) hVar441.a(), this.b.as());
            case 395:
                hVar442 = this.f297a.gN;
                com.google.android.apps.gsa.w.b.b bVar7 = (com.google.android.apps.gsa.w.b.b) hVar442.a();
                hVar443 = this.f297a.gn;
                com.google.android.apps.gsa.w.a aVar27 = (com.google.android.apps.gsa.w.a) hVar443.a();
                hVar444 = this.f297a.gz;
                com.google.android.libraries.gsa.h.h hVar523 = (com.google.android.libraries.gsa.h.h) hVar444.a();
                hVar445 = this.f297a.g;
                return new com.google.android.apps.gsa.staticplugins.bw.c(bVar7, aVar27, hVar523, (com.google.android.libraries.g.a) hVar445.a());
            case 396:
                hVar446 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar524 = (com.google.android.libraries.gsa.h.h) hVar446.a();
                hVar447 = this.b.jO;
                a b73 = c.b(hVar447);
                jyVar39 = this.f297a.f319a;
                hVar448 = jyVar39.fP;
                a b74 = c.b(hVar448);
                hVar449 = this.b.p;
                com.google.android.apps.gsa.search.core.service.x xVar3 = (com.google.android.apps.gsa.search.core.service.x) hVar449.a();
                hVar450 = this.b.jP;
                a b75 = c.b(hVar450);
                hVar451 = this.f297a.hG;
                a b76 = c.b(hVar451);
                hVar452 = this.b.e;
                com.google.android.apps.gsa.search.core.state.d.h hVar525 = (com.google.android.apps.gsa.search.core.state.d.h) hVar452.a();
                hVar453 = this.f297a.g;
                com.google.android.libraries.g.a aVar28 = (com.google.android.libraries.g.a) hVar453.a();
                hVar454 = this.f297a.nZ;
                at atVar7 = (at) hVar454.a();
                hVar455 = this.f297a.gq;
                return new com.google.android.apps.gsa.staticplugins.bz.r(hVar524, b73, b74, xVar3, b75, b76, hVar525, aVar28, atVar7, c.b(hVar455));
            case 397:
                jyVar40 = this.f297a.f319a;
                hVar456 = jyVar40.gz;
                com.google.android.apps.gsa.search.core.ad.a.q qVar2 = (com.google.android.apps.gsa.search.core.ad.a.q) hVar456.a();
                jyVar41 = this.f297a.f319a;
                hVar457 = jyVar41.fP;
                com.google.android.apps.gsa.x.a.k kVar7 = (com.google.android.apps.gsa.x.a.k) hVar457.a();
                hVar458 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar10 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar458.a();
                jyVar42 = this.f297a.f319a;
                hVar459 = jyVar42.fU;
                a b77 = c.b(hVar459);
                hVar460 = this.f297a.hD;
                a b78 = c.b(hVar460);
                hVar461 = this.b.e;
                com.google.android.apps.gsa.search.core.state.d.h hVar526 = (com.google.android.apps.gsa.search.core.state.d.h) hVar461.a();
                hVar462 = this.b.q;
                a b79 = c.b(hVar462);
                jyVar43 = this.f297a.f319a;
                com.google.android.apps.gsa.staticplugins.bz.b.f aU = jyVar43.aU();
                hVar463 = this.b.b;
                return new com.google.android.apps.gsa.staticplugins.bz.i(qVar2, kVar7, anVar10, b77, b78, hVar526, b79, aU, (com.google.android.libraries.gsa.h.h) hVar463.a());
            case 398:
                return new com.google.android.apps.gsa.f.b.a();
            case 399:
                hVar464 = this.b.p;
                a b80 = c.b(hVar464);
                hVar465 = this.b.r;
                c.b(hVar465);
                hVar466 = this.f297a.ip;
                a b81 = c.b(hVar466);
                hVar467 = this.f297a.f;
                Context context22 = (Context) hVar467.a();
                hVar468 = this.f297a.gq;
                hVar469 = this.f297a.gB;
                a b82 = c.b(hVar469);
                hVar470 = this.f297a.is;
                a b83 = c.b(hVar470);
                hVar471 = this.f297a.oZ;
                a b84 = c.b(hVar471);
                hVar472 = this.f297a.gt;
                com.google.android.apps.gsa.assistant.shared.z zVar3 = (com.google.android.apps.gsa.assistant.shared.z) hVar472.a();
                hVar473 = this.f297a.nW;
                com.google.android.apps.gsa.search.core.j.a aVar29 = (com.google.android.apps.gsa.search.core.j.a) hVar473.a();
                hVar474 = this.f297a.oh;
                at atVar8 = (at) hVar474.a();
                hVar475 = this.f297a.kg;
                t tVar2 = (t) hVar475.a();
                hVar476 = this.f297a.mS;
                at k5 = at.k((com.google.android.apps.gsa.assistant.shared.u) hVar476.a());
                hVar477 = this.f297a.gF;
                return new com.google.android.apps.gsa.staticplugins.cc.a(b80, b81, context22, b82, b83, b84, zVar3, aVar29, atVar8, tVar2, k5, c.b(hVar477));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        jy jyVar;
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
        jy jyVar2;
        h hVar38;
        h hVar39;
        jy jyVar3;
        h hVar40;
        h hVar41;
        jy jyVar4;
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
        h hVar112;
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
        jy jyVar5;
        h hVar128;
        h hVar129;
        h hVar130;
        h hVar131;
        h hVar132;
        h hVar133;
        h hVar134;
        jy jyVar6;
        h hVar135;
        h hVar136;
        h hVar137;
        h hVar138;
        h hVar139;
        h hVar140;
        h hVar141;
        h hVar142;
        h hVar143;
        jy jyVar7;
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
        h hVar205;
        h hVar206;
        h hVar207;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        h hVar212;
        h hVar213;
        h hVar214;
        h hVar215;
        h hVar216;
        h hVar217;
        h hVar218;
        h hVar219;
        h hVar220;
        h hVar221;
        h hVar222;
        h hVar223;
        h hVar224;
        h hVar225;
        h hVar226;
        h hVar227;
        h hVar228;
        h hVar229;
        h hVar230;
        h hVar231;
        h hVar232;
        h hVar233;
        h hVar234;
        h hVar235;
        h hVar236;
        h hVar237;
        h hVar238;
        h hVar239;
        h hVar240;
        h hVar241;
        h hVar242;
        h hVar243;
        h hVar244;
        h hVar245;
        h hVar246;
        h hVar247;
        h hVar248;
        h hVar249;
        h hVar250;
        h hVar251;
        h hVar252;
        h hVar253;
        h hVar254;
        h hVar255;
        h hVar256;
        h hVar257;
        h hVar258;
        h hVar259;
        h hVar260;
        h hVar261;
        h hVar262;
        h hVar263;
        h hVar264;
        h hVar265;
        h hVar266;
        h hVar267;
        h hVar268;
        h hVar269;
        h hVar270;
        h hVar271;
        h hVar272;
        h hVar273;
        h hVar274;
        h hVar275;
        h hVar276;
        h hVar277;
        h hVar278;
        h hVar279;
        jy jyVar8;
        h hVar280;
        h hVar281;
        h hVar282;
        h hVar283;
        h hVar284;
        h hVar285;
        h hVar286;
        h hVar287;
        h hVar288;
        h hVar289;
        h hVar290;
        h hVar291;
        h hVar292;
        h hVar293;
        h hVar294;
        h hVar295;
        h hVar296;
        h hVar297;
        h hVar298;
        h hVar299;
        h hVar300;
        h hVar301;
        h hVar302;
        h hVar303;
        int i = this.c;
        switch (i) {
            case 400:
                hVar = this.f297a.f;
                Context context = (Context) hVar.a();
                hVar2 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar304 = (com.google.android.libraries.gsa.h.h) hVar2.a();
                hVar3 = this.f297a.gv;
                hVar4 = this.f297a.cZ;
                AudioManager audioManager = (AudioManager) hVar4.a();
                hVar5 = this.f297a.ps;
                com.google.android.apps.gsa.x.a.e eVar = (com.google.android.apps.gsa.x.a.e) hVar5.a();
                hVar6 = this.f297a.gf;
                n nVar = (n) hVar6.a();
                hVar7 = this.f297a.gm;
                return new com.google.android.apps.gsa.staticplugins.cd.k(context, hVar304, audioManager, eVar, nVar);
            case 401:
                ds dsVar = this.b;
                jo joVar = this.f297a;
                Object gq = dsVar.gq();
                hVar8 = joVar.gV;
                a b = c.b(hVar8);
                jyVar = this.f297a.f319a;
                hVar9 = jyVar.hg;
                a b2 = c.b(hVar9);
                hVar10 = this.b.jU;
                return new com.google.android.apps.gsa.staticplugins.ce.o((com.google.android.apps.gsa.staticplugins.ce.ah) gq, b, b2, (az) hVar10.a());
            case 402:
                hVar11 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.k.a.a(c.b(hVar11));
            case 403:
                return new com.google.android.apps.gsa.f.a.b();
            case 404:
                return new az();
            case 405:
                hVar12 = this.f297a.gq;
                p pVar = (p) hVar12.a();
                hVar13 = this.f297a.gk;
                boolean booleanValue = ((Boolean) hVar13.a()).booleanValue();
                hVar14 = this.f297a.oZ;
                a b3 = c.b(hVar14);
                hVar15 = this.f297a.gV;
                a b4 = c.b(hVar15);
                hVar16 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar305 = (com.google.android.libraries.gsa.h.h) hVar16.a();
                hVar17 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar306 = (com.google.android.libraries.gsa.h.h) hVar17.a();
                hVar18 = this.f297a.hD;
                a b5 = c.b(hVar18);
                hVar19 = this.b.jW;
                cu cuVar = (cu) hVar19.a();
                ds dsVar2 = this.b;
                com.google.android.apps.gsa.search.core.ae.bb.a ai = dsVar2.ai();
                hVar20 = dsVar2.bx;
                return new com.google.android.apps.gsa.staticplugins.ce.h(pVar, booleanValue, b3, b4, hVar305, hVar306, b5, cuVar, ai, (com.google.android.apps.gsa.f.a.b) hVar20.a());
            case 406:
                hVar21 = this.b.C;
                a b6 = c.b(hVar21);
                hVar22 = this.b.u;
                a b7 = c.b(hVar22);
                hVar23 = this.b.fh;
                a b8 = c.b(hVar23);
                hVar24 = this.b.fl;
                a b9 = c.b(hVar24);
                hVar25 = this.b.z;
                a b10 = c.b(hVar25);
                hVar26 = this.b.jT;
                com.google.android.apps.gsa.search.core.ae.k.a aVar = (com.google.android.apps.gsa.search.core.ae.k.a) hVar26.a();
                hVar27 = this.b.fm;
                a b11 = c.b(hVar27);
                hVar28 = this.f297a.gq;
                p pVar2 = (p) hVar28.a();
                hVar29 = this.f297a.nl;
                Query query = (Query) hVar29.a();
                hVar30 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar307 = (com.google.android.libraries.gsa.h.h) hVar30.a();
                hVar31 = this.f297a.hD;
                return new cu(b6, b7, b8, b9, b10, aVar, b11, pVar2, query, hVar307, c.b(hVar31));
            case 407:
                ds dsVar3 = this.b;
                jo joVar2 = this.f297a;
                com.google.android.apps.gsa.staticplugins.webview.g bz = dsVar3.bz();
                hVar32 = joVar2.gv;
                return new com.google.android.apps.gsa.staticplugins.webview.z(bz, (com.google.android.libraries.gsa.h.h) hVar32.a(), this.b.aA());
            case 408:
                hVar33 = this.f297a.f;
                Context context2 = (Context) hVar33.a();
                hVar34 = this.f297a.gZ;
                return new com.google.android.apps.gsa.staticplugins.webview.a(context2, c.b(hVar34));
            case 409:
                ds dsVar4 = this.b;
                jo joVar3 = this.f297a;
                Object gp = dsVar4.gp();
                Object gl = dsVar4.gl();
                hVar35 = joVar3.hG;
                return new com.google.android.apps.gsa.staticplugins.ch.v((com.google.android.apps.gsa.staticplugins.ch.o) gp, (com.google.android.apps.gsa.staticplugins.ch.e) gl, c.b(hVar35));
            case 410:
                hVar36 = this.f297a.f;
                Context context3 = (Context) hVar36.a();
                hVar37 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar308 = (com.google.android.libraries.gsa.h.h) hVar37.a();
                jyVar2 = this.f297a.f319a;
                Object pl = jyVar2.pl();
                ds dsVar5 = this.b;
                jo joVar4 = this.f297a;
                com.google.android.apps.gsa.staticplugins.nga.e.d aO = dsVar5.aO();
                bh aQ = dsVar5.aQ();
                hVar38 = joVar4.qb;
                hVar39 = this.f297a.gP;
                m mVar = (m) hVar39.a();
                jyVar3 = this.f297a.f319a;
                hVar40 = jyVar3.vS;
                com.google.android.apps.gsa.staticplugins.nga.p.a aVar2 = (com.google.android.apps.gsa.staticplugins.nga.p.a) hVar40.a();
                hVar41 = this.f297a.ly;
                jyVar4 = this.f297a.f319a;
                hVar42 = jyVar4.hh;
                com.google.android.apps.gsa.staticplugins.nga.ui.c cVar = (com.google.android.apps.gsa.staticplugins.nga.ui.c) hVar42.a();
                hVar43 = this.f297a.gB;
                return new com.google.android.apps.gsa.staticplugins.nga.b(context3, hVar308, (com.google.android.apps.search.assistant.verticals.c.a.n) pl, aO, aQ, mVar, aVar2, cVar, (an) hVar43.a(), this.f297a.ab());
            case 411:
                return new gt(this.f297a, this.b);
            case 412:
                hVar44 = this.f297a.gA;
                return new com.google.android.apps.gsa.staticplugins.opa.bd.e.a.a.o((com.google.android.libraries.gsa.h.h) hVar44.a());
            case 413:
                hVar45 = this.b.b;
                return new com.google.android.apps.gsa.search.core.service.g.b.a.a.j(c.b(hVar45));
            case 414:
                ds dsVar6 = this.b;
                com.google.android.apps.gsa.search.core.service.g.b.a.b t = dsVar6.t();
                hVar46 = dsVar6.ki;
                return new com.google.android.apps.gsa.search.core.service.g.b.b(t, (com.google.android.apps.gsa.search.core.service.g.b.a) hVar46.a());
            case 415:
                hVar47 = this.b.ke;
                h b12 = e.c.i.b(hVar47);
                hVar48 = this.b.kj;
                return new com.google.android.apps.gsa.search.core.service.g.b.a.a.h(b12, e.c.i.b(hVar48));
            case 416:
                hVar49 = this.b.kf;
                h b13 = e.c.i.b(hVar49);
                hVar50 = this.b.kh;
                h b14 = e.c.i.b(hVar50);
                hVar51 = this.b.ki;
                return new com.google.android.apps.gsa.search.core.service.g.b.a.a.e(b13, b14, hVar51);
            case 417:
                return new com.google.android.apps.gsa.search.core.service.g.b.a();
            case 418:
                hVar52 = this.f297a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar = (com.google.android.apps.gsa.shared.util.c.a.an) hVar52.a();
                hVar53 = this.f297a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar53.a();
                hVar54 = this.f297a.gq;
                p pVar3 = (p) hVar54.a();
                hVar55 = this.b.km;
                return new com.google.android.apps.gsa.search.core.service.e.b.c(anVar, aVar3, pVar3, c.b(hVar55));
            case 419:
                hVar56 = this.b.kl;
                com.google.android.apps.gsa.search.core.service.e.b.c cVar2 = (com.google.android.apps.gsa.search.core.service.e.b.c) hVar56.a();
                hVar57 = this.b.gA;
                return new com.google.android.apps.gsa.search.core.service.e.b.e(cVar2, (com.google.android.apps.gsa.search.core.service.d.a) hVar57.a());
            case 420:
                return new com.google.android.apps.gsa.search.core.service.e.a.a();
            case 421:
                hVar58 = this.b.kl;
                com.google.android.apps.gsa.search.core.service.e.b.c cVar3 = (com.google.android.apps.gsa.search.core.service.e.b.c) hVar58.a();
                hVar59 = this.b.kp;
                return new com.google.android.apps.gsa.search.core.service.e.a.j(cVar3, (com.google.android.apps.gsa.search.core.service.e.a.a.c) hVar59.a());
            case 422:
                return new com.google.android.apps.gsa.search.core.service.e.a.a.c(this.b.s());
            case 423:
                hVar60 = this.f297a.gq;
                return new com.google.android.apps.gsa.search.core.service.e.a.m((p) hVar60.a());
            case 424:
                hVar61 = this.f297a.gq;
                return new k((p) hVar61.a());
            case 425:
                hVar62 = this.b.kt;
                return new u((ae) hVar62.a());
            case 426:
                hVar63 = this.b.em;
                a b15 = c.b(hVar63);
                hVar64 = this.f297a.gm;
                hVar65 = this.b.m;
                return new com.google.android.apps.gsa.search.core.state.d.i(b15, c.b(hVar65));
            case 427:
                hVar66 = this.b.w;
                return new u((ae) hVar66.a());
            case 428:
                hVar67 = this.b.kw;
                return new u((ae) hVar67.a());
            case 429:
                hVar68 = this.b.em;
                a b16 = c.b(hVar68);
                hVar69 = this.b.aW;
                a b17 = c.b(hVar69);
                hVar70 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.n(b16, b17);
            case 430:
                hVar71 = this.b.ep;
                return new u((ae) hVar71.a());
            case 431:
                hVar72 = this.b.jC;
                return new u((ae) hVar72.a());
            case 432:
                hVar73 = this.b.ff;
                return new u((ae) hVar73.a());
            case 433:
            case 449:
                hVar74 = this.b.by;
                return new u((ae) hVar74.a());
            case 434:
                hVar75 = this.b.em;
                a b18 = c.b(hVar75);
                ds dsVar7 = this.b;
                jo joVar5 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.r.a J = dsVar7.J();
                hVar76 = joVar5.gm;
                return new com.google.android.apps.gsa.search.core.state.d.k(b18, J);
            case 435:
                hVar77 = this.b.kC;
                return new u((ae) hVar77.a());
            case 436:
                hVar78 = this.b.em;
                a b19 = c.b(hVar78);
                hVar79 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.a(b19);
            case 437:
                hVar80 = this.b.eS;
                return new u((ae) hVar80.a());
            case 438:
                hVar81 = this.b.kF;
                return new u((ae) hVar81.a());
            case 439:
                hVar82 = this.b.em;
                a b20 = c.b(hVar82);
                ds dsVar8 = this.b;
                jo joVar6 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.e.a A = dsVar8.A();
                hVar83 = joVar6.gm;
                hVar84 = this.b.b;
                return new com.google.android.apps.gsa.search.core.state.d.f(b20, A, (com.google.android.libraries.gsa.h.h) hVar84.a());
            case 440:
                hVar85 = this.b.kH;
                return new u((ae) hVar85.a());
            case 441:
                hVar86 = this.b.em;
                a b21 = c.b(hVar86);
                hVar87 = this.b.jT;
                com.google.android.apps.gsa.search.core.ae.k.a aVar4 = (com.google.android.apps.gsa.search.core.ae.k.a) hVar87.a();
                hVar88 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.g(b21, aVar4);
            case 442:
                hVar89 = this.b.h;
                return new u((ae) hVar89.a());
            case 443:
                hVar90 = this.b.bj;
                return new u((ae) hVar90.a());
            case 444:
                hVar91 = this.b.kL;
                return new u((ae) hVar91.a());
            case 445:
                hVar92 = this.b.em;
                a b22 = c.b(hVar92);
                ds dsVar9 = this.b;
                jo joVar7 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.v.a L = dsVar9.L();
                hVar93 = joVar7.gm;
                return new com.google.android.apps.gsa.search.core.state.d.m(b22, L);
            case 446:
                hVar94 = this.b.bz;
                return new u((ae) hVar94.a());
            case 447:
                ds dsVar10 = this.b;
                com.google.android.apps.gsa.search.core.ae.ac.a P = dsVar10.P();
                hVar95 = dsVar10.b;
                com.google.android.libraries.gsa.h.h hVar309 = (com.google.android.libraries.gsa.h.h) hVar95.a();
                hVar96 = this.b.em;
                a b23 = c.b(hVar96);
                hVar97 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.p(P, hVar309, b23);
            case 448:
                hVar98 = this.b.k;
                return new u((ae) hVar98.a());
            case 450:
                hVar99 = this.b.eo;
                return new u((ae) hVar99.a());
            case 451:
                hVar100 = this.b.kR;
                com.google.android.apps.gsa.search.core.state.d.v vVar = (com.google.android.apps.gsa.search.core.state.d.v) hVar100.a();
                hVar101 = this.b.e;
                a b24 = c.b(hVar101);
                hVar102 = this.b.er;
                a b25 = c.b(hVar102);
                hVar103 = this.b.w;
                return new com.google.android.apps.gsa.search.core.state.ac(vVar, b24, b25, c.b(hVar103), 2);
            case 452:
                hVar104 = this.f297a.gq;
                a b26 = c.b(hVar104);
                hVar105 = this.b.em;
                a b27 = c.b(hVar105);
                hVar106 = this.f297a.nt;
                Resources resources = (Resources) hVar106.a();
                hVar107 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.v(b26, b27, resources);
            case 453:
                hVar108 = this.b.er;
                com.google.android.apps.gsa.search.core.state.d.ae aeVar = (com.google.android.apps.gsa.search.core.state.d.ae) hVar108.a();
                hVar109 = this.b.e;
                a b28 = c.b(hVar109);
                hVar110 = this.b.t;
                return new com.google.android.apps.gsa.search.core.state.am(aeVar, b28, c.b(hVar110), 0);
            case 454:
                hVar111 = this.b.eR;
                ag agVar = (ag) hVar111.a();
                hVar112 = this.b.t;
                return new com.google.android.apps.gsa.search.core.state.q(agVar, c.b(hVar112), 6);
            case 455:
                hVar113 = this.b.t;
                com.google.android.apps.gsa.search.core.state.d.ai aiVar = (com.google.android.apps.gsa.search.core.state.d.ai) hVar113.a();
                hVar114 = this.b.eS;
                a b29 = c.b(hVar114);
                hVar115 = this.b.eQ;
                a b30 = c.b(hVar115);
                hVar116 = this.b.er;
                a b31 = c.b(hVar116);
                hVar117 = this.b.ep;
                a b32 = c.b(hVar117);
                hVar118 = this.b.eR;
                return new ch(aiVar, b29, b30, b31, b32, c.b(hVar118), 1);
            case 456:
                hVar119 = this.b.eQ;
                com.google.android.apps.gsa.search.core.state.d.u uVar = (com.google.android.apps.gsa.search.core.state.d.u) hVar119.a();
                hVar120 = this.b.e;
                return new com.google.android.apps.gsa.search.core.state.q(uVar, c.b(hVar120), 3);
            case 457:
                hVar121 = this.b.kX;
                com.google.android.apps.gsa.search.core.state.d.aj ajVar = (com.google.android.apps.gsa.search.core.state.d.aj) hVar121.a();
                hVar122 = this.b.e;
                a b33 = c.b(hVar122);
                hVar123 = this.b.jC;
                return new com.google.android.apps.gsa.search.core.state.am(ajVar, b33, c.b(hVar123), 4);
            case 458:
                hVar124 = this.b.em;
                a b34 = c.b(hVar124);
                hVar125 = this.b.bA;
                com.google.android.apps.gsa.search.core.ae.bq.a aVar5 = (com.google.android.apps.gsa.search.core.ae.bq.a) hVar125.a();
                hVar126 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.d.aj(b34, aVar5);
            case 459:
                hVar127 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bq.a.b(c.b(hVar127));
            case 460:
                jyVar5 = this.f297a.f319a;
                hVar128 = jyVar5.gf;
                com.google.android.apps.gsa.shared.util.keepalive.d dVar = (com.google.android.apps.gsa.shared.util.keepalive.d) hVar128.a();
                ds dsVar11 = this.b;
                com.google.android.apps.gsa.search.shared.service.b.b ax = dsVar11.ax();
                hVar129 = dsVar11.t;
                a b35 = c.b(hVar129);
                hVar130 = this.b.b;
                a b36 = c.b(hVar130);
                hVar131 = this.b.lb;
                a b37 = c.b(hVar131);
                hVar132 = this.f297a.gq;
                return new com.google.android.apps.gsa.search.core.service.ao(dVar, ax, b35, b36, b37, c.b(hVar132));
            case 461:
                hVar133 = this.b.la;
                com.google.android.apps.gsa.search.core.state.ca caVar = (com.google.android.apps.gsa.search.core.state.ca) hVar133.a();
                hVar134 = this.f297a.EE;
                return ha.s(caVar, (com.google.android.apps.gsa.search.core.state.ca) hVar134.a());
            case 462:
                jyVar6 = this.f297a.f319a;
                hVar135 = jyVar6.hi;
                return new com.google.android.apps.gsa.eventlogger.e((com.google.android.apps.gsa.eventlogger.d) hVar135.a());
            case 463:
                hVar136 = this.b.d;
                a b38 = c.b(hVar136);
                hVar137 = this.b.bh;
                com.google.android.apps.gsa.search.core.ae.u.a aVar6 = (com.google.android.apps.gsa.search.core.ae.u.a) hVar137.a();
                hVar138 = this.f297a.gq;
                p pVar4 = (p) hVar138.a();
                hVar139 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.z(b38, aVar6, pVar4, this.b.ap());
            case 464:
                return new bt();
            case 465:
                ds dsVar12 = this.b;
                jo joVar8 = this.f297a;
                hVar140 = dsVar12.b;
                hVar141 = joVar8.gp;
                hVar142 = joVar8.gz;
                hVar143 = joVar8.gq;
                h b39 = e.c.i.b(hVar143);
                jyVar7 = this.f297a.f319a;
                hVar144 = jyVar7.gP;
                return new com.google.android.apps.gsa.search.core.m.h.h(hVar140, hVar141, hVar142, b39, hVar144);
            case 466:
                ds dsVar13 = this.b;
                jo joVar9 = this.f297a;
                hVar145 = dsVar13.fh;
                hVar146 = joVar9.gm;
                return new com.google.android.apps.gsa.search.core.state.c.b.b(hVar145, hVar146);
            case 467:
                hVar147 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bh.a.b(c.b(hVar147));
            case 468:
                hVar148 = this.b.fg;
                return new u((ae) hVar148.a());
            case 469:
                hVar149 = this.b.lh;
                return com.google.android.apps.gsa.search.core.state.e.a.d((com.google.android.apps.gsa.search.core.state.aa) hVar149.a());
            case 470:
                hVar150 = this.b.bB;
                com.google.android.apps.gsa.search.core.state.z zVar = (com.google.android.apps.gsa.search.core.state.z) hVar150.a();
                hVar151 = this.b.v;
                a b40 = c.b(hVar151);
                hVar152 = this.b.x;
                a b41 = c.b(hVar152);
                hVar153 = this.b.fa;
                a b42 = c.b(hVar153);
                hVar154 = this.b.u;
                a b43 = c.b(hVar154);
                hVar155 = this.b.kX;
                return new com.google.android.apps.gsa.search.core.state.aa(zVar, b40, b41, b42, b43, c.b(hVar155));
            case 471:
                hVar156 = this.b.lk;
                return com.google.android.apps.gsa.search.core.state.e.a.e((com.google.android.apps.gsa.search.core.state.q) hVar156.a());
            case 472:
                hVar157 = this.b.lj;
                com.google.android.apps.gsa.search.core.state.v vVar2 = (com.google.android.apps.gsa.search.core.state.v) hVar157.a();
                hVar158 = this.b.bB;
                return new com.google.android.apps.gsa.search.core.state.q(vVar2, c.b(hVar158), 2);
            case 473:
                hVar159 = this.b.d;
                a b44 = c.b(hVar159);
                ds dsVar14 = this.b;
                jo joVar10 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.o.a G = dsVar14.G();
                hVar160 = joVar10.gm;
                return new com.google.android.apps.gsa.search.core.state.v(b44, G);
            case 474:
                hVar161 = this.b.v;
                com.google.android.apps.gsa.search.core.state.f fVar = (com.google.android.apps.gsa.search.core.state.f) hVar161.a();
                hVar162 = this.b.x;
                a b45 = c.b(hVar162);
                hVar163 = this.b.fa;
                a b46 = c.b(hVar163);
                hVar164 = this.b.fc;
                a b47 = c.b(hVar164);
                hVar165 = this.b.u;
                a b48 = c.b(hVar165);
                hVar166 = this.b.fk;
                a b49 = c.b(hVar166);
                hVar167 = this.b.t;
                a b50 = c.b(hVar167);
                hVar168 = this.b.z;
                a b51 = c.b(hVar168);
                hVar169 = this.b.fi;
                a b52 = c.b(hVar169);
                hVar170 = this.b.fn;
                return new com.google.android.apps.gsa.search.core.state.g(fVar, b45, b46, b47, b48, b49, b50, b51, b52, c.b(hVar170));
            case 475:
                hVar171 = this.b.x;
                com.google.android.apps.gsa.search.core.state.j jVar = (com.google.android.apps.gsa.search.core.state.j) hVar171.a();
                hVar172 = this.b.v;
                a b53 = c.b(hVar172);
                hVar173 = this.b.eZ;
                a b54 = c.b(hVar173);
                hVar174 = this.b.fa;
                a b55 = c.b(hVar174);
                hVar175 = this.b.w;
                a b56 = c.b(hVar175);
                hVar176 = this.b.u;
                return new com.google.android.apps.gsa.search.core.state.k(jVar, b53, b54, b55, b56, c.b(hVar176));
            case 476:
                hVar177 = this.b.eZ;
                l lVar = (l) hVar177.a();
                hVar178 = this.b.w;
                return new com.google.android.apps.gsa.search.core.state.q(lVar, c.b(hVar178), 1);
            case 477:
                hVar179 = this.b.fa;
                com.google.android.apps.gsa.search.core.state.s sVar = (com.google.android.apps.gsa.search.core.state.s) hVar179.a();
                hVar180 = this.b.eZ;
                a b57 = c.b(hVar180);
                hVar181 = this.b.u;
                a b58 = c.b(hVar181);
                hVar182 = this.b.z;
                a b59 = c.b(hVar182);
                hVar183 = this.b.v;
                a b60 = c.b(hVar183);
                hVar184 = this.b.x;
                a b61 = c.b(hVar184);
                hVar185 = this.b.C;
                return new com.google.android.apps.gsa.search.core.state.t(sVar, b57, b58, b59, b60, b61, c.b(hVar185));
            case 478:
                hVar186 = this.b.fe;
                com.google.android.apps.gsa.search.core.state.ab abVar = (com.google.android.apps.gsa.search.core.state.ab) hVar186.a();
                hVar187 = this.b.fc;
                a b62 = c.b(hVar187);
                hVar188 = this.b.u;
                a b63 = c.b(hVar188);
                hVar189 = this.b.fd;
                return new com.google.android.apps.gsa.search.core.state.ac(abVar, b62, b63, c.b(hVar189), 0);
            case 479:
                hVar190 = this.b.lr;
                com.google.android.apps.gsa.search.core.state.y yVar = (com.google.android.apps.gsa.search.core.state.y) hVar190.a();
                hVar191 = this.b.x;
                a b64 = c.b(hVar191);
                hVar192 = this.b.fa;
                a b65 = c.b(hVar192);
                hVar193 = this.b.fn;
                return new com.google.android.apps.gsa.search.core.state.ac(yVar, b64, b65, c.b(hVar193), 1);
            case 480:
                hVar194 = this.b.d;
                a b66 = c.b(hVar194);
                hVar195 = this.b.eI;
                com.google.android.apps.gsa.search.core.ae.t.a aVar7 = (com.google.android.apps.gsa.search.core.ae.t.a) hVar195.a();
                hVar196 = this.f297a.gm;
                return new com.google.android.apps.gsa.search.core.state.y(b66, aVar7);
            case 481:
                hVar197 = this.b.lt;
                com.google.android.apps.gsa.search.core.state.ak akVar = (com.google.android.apps.gsa.search.core.state.ak) hVar197.a();
                hVar198 = this.b.x;
                a b67 = c.b(hVar198);
                hVar199 = this.b.fa;
                a b68 = c.b(hVar199);
                hVar200 = this.b.u;
                a b69 = c.b(hVar200);
                hVar201 = this.b.fd;
                a b70 = c.b(hVar201);
                hVar202 = this.b.lu;
                a b71 = c.b(hVar202);
                hVar203 = this.b.z;
                return new al(akVar, b67, b68, b69, b70, b71, c.b(hVar203));
            case 482:
                hVar204 = this.b.d;
                a b72 = c.b(hVar204);
                hVar205 = this.b.x;
                a b73 = c.b(hVar205);
                hVar206 = this.b.fd;
                a b74 = c.b(hVar206);
                hVar207 = this.b.z;
                a b75 = c.b(hVar207);
                hVar208 = this.f297a.gf;
                SharedPreferences sharedPreferences = (SharedPreferences) hVar208.a();
                hVar209 = this.b.g;
                com.google.android.apps.gsa.search.core.ae.am.a aVar8 = (com.google.android.apps.gsa.search.core.ae.am.a) hVar209.a();
                ds dsVar15 = this.b;
                jo joVar11 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bl.a an = dsVar15.an();
                hVar210 = joVar11.gm;
                return new com.google.android.apps.gsa.search.core.state.ak(b72, b73, b74, b75, sharedPreferences, aVar8, an);
            case 483:
                hVar211 = this.b.d;
                a b76 = c.b(hVar211);
                hVar212 = this.f297a.Fv;
                com.google.android.apps.gsa.speech.hotword.a aVar9 = (com.google.android.apps.gsa.speech.hotword.a) hVar212.a();
                ds dsVar16 = this.b;
                jo joVar12 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bk.a am = dsVar16.am();
                hVar213 = joVar12.gm;
                return new by(b76, aVar9, am);
            case 484:
                hVar214 = this.b.fh;
                bf bfVar = (bf) hVar214.a();
                hVar215 = this.b.v;
                a b77 = c.b(hVar215);
                hVar216 = this.b.fe;
                a b78 = c.b(hVar216);
                hVar217 = this.b.u;
                a b79 = c.b(hVar217);
                hVar218 = this.b.fl;
                a b80 = c.b(hVar218);
                hVar219 = this.b.z;
                return new com.google.android.apps.gsa.search.core.state.bg(bfVar, b77, b78, b79, b80, c.b(hVar219));
            case 485:
                hVar220 = this.b.u;
                bk bkVar = (bk) hVar220.a();
                hVar221 = this.b.v;
                a b81 = c.b(hVar221);
                hVar222 = this.b.x;
                a b82 = c.b(hVar222);
                hVar223 = this.b.fi;
                a b83 = c.b(hVar223);
                hVar224 = this.b.z;
                return new bl(bkVar, b81, b82, b83, c.b(hVar224));
            case 486:
                hVar225 = this.b.fl;
                bq bqVar = (bq) hVar225.a();
                hVar226 = this.b.v;
                a b84 = c.b(hVar226);
                hVar227 = this.b.x;
                a b85 = c.b(hVar227);
                hVar228 = this.b.e;
                a b86 = c.b(hVar228);
                hVar229 = this.b.fa;
                a b87 = c.b(hVar229);
                hVar230 = this.b.fe;
                a b88 = c.b(hVar230);
                hVar231 = this.b.kR;
                a b89 = c.b(hVar231);
                hVar232 = this.b.er;
                a b90 = c.b(hVar232);
                hVar233 = this.b.u;
                a b91 = c.b(hVar233);
                hVar234 = this.b.z;
                a b92 = c.b(hVar234);
                hVar235 = this.b.fk;
                a b93 = c.b(hVar235);
                hVar236 = this.b.fn;
                return new com.google.android.apps.gsa.search.core.state.br(bqVar, b84, b85, b86, b87, b88, b89, b90, b91, b92, b93, c.b(hVar236));
            case 487:
                hVar237 = this.b.fi;
                com.google.android.apps.gsa.search.core.state.ag agVar2 = (com.google.android.apps.gsa.search.core.state.ag) hVar237.a();
                hVar238 = this.b.u;
                return new com.google.android.apps.gsa.search.core.state.q(agVar2, c.b(hVar238), 4);
            case 488:
                hVar239 = this.b.lu;
                by byVar = (by) hVar239.a();
                hVar240 = this.b.eY;
                a b94 = c.b(hVar240);
                hVar241 = this.b.x;
                a b95 = c.b(hVar241);
                hVar242 = this.b.eZ;
                a b96 = c.b(hVar242);
                hVar243 = this.b.er;
                a b97 = c.b(hVar243);
                hVar244 = this.b.u;
                a b98 = c.b(hVar244);
                hVar245 = this.b.z;
                return new bz(byVar, b94, b95, b96, b97, b98, c.b(hVar245));
            case 489:
                hVar246 = this.b.z;
                TtsState ttsState = (TtsState) hVar246.a();
                hVar247 = this.b.x;
                a b99 = c.b(hVar247);
                hVar248 = this.b.eZ;
                a b100 = c.b(hVar248);
                hVar249 = this.b.fe;
                a b101 = c.b(hVar249);
                hVar250 = this.b.u;
                a b102 = c.b(hVar250);
                hVar251 = this.b.v;
                a b103 = c.b(hVar251);
                hVar252 = this.b.t;
                a b104 = c.b(hVar252);
                hVar253 = this.b.fi;
                a b105 = c.b(hVar253);
                hVar254 = this.b.C;
                return new cf(ttsState, b99, b100, b101, b102, b103, b104, b105, c.b(hVar254));
            case 490:
                hVar255 = this.b.fn;
                cg cgVar = (cg) hVar255.a();
                hVar256 = this.b.v;
                a b106 = c.b(hVar256);
                hVar257 = this.b.x;
                a b107 = c.b(hVar257);
                hVar258 = this.b.fe;
                a b108 = c.b(hVar258);
                hVar259 = this.b.u;
                a b109 = c.b(hVar259);
                hVar260 = this.b.fi;
                return new ch(cgVar, b106, b107, b108, b109, c.b(hVar260), 0);
            case 491:
                hVar261 = this.b.lE;
                cx cxVar = (cx) hVar261.a();
                hVar262 = this.b.v;
                a b110 = c.b(hVar262);
                hVar263 = this.b.e;
                a b111 = c.b(hVar263);
                hVar264 = this.b.u;
                return new com.google.android.apps.gsa.search.core.state.ac(cxVar, b110, b111, c.b(hVar264), 4);
            case 492:
                hVar265 = this.b.d;
                a b112 = c.b(hVar265);
                hVar266 = this.b.v;
                a b113 = c.b(hVar266);
                hVar267 = this.b.u;
                a b114 = c.b(hVar267);
                hVar268 = this.b.fd;
                a b115 = c.b(hVar268);
                hVar269 = this.b.fl;
                a b116 = c.b(hVar269);
                hVar270 = this.b.x;
                a b117 = c.b(hVar270);
                hVar271 = this.b.jW;
                cu cuVar2 = (cu) hVar271.a();
                ds dsVar17 = this.b;
                com.google.android.apps.gsa.search.core.ae.bw.d at = dsVar17.at();
                hVar272 = dsVar17.j;
                f fVar2 = (f) hVar272.a();
                hVar273 = this.b.lD;
                com.google.android.apps.gsa.search.core.ae.bi.a.d dVar2 = (com.google.android.apps.gsa.search.core.ae.bi.a.d) hVar273.a();
                hVar274 = this.f297a.nz;
                a b118 = c.b(hVar274);
                hVar275 = this.b.b;
                com.google.android.libraries.gsa.h.h hVar310 = (com.google.android.libraries.gsa.h.h) hVar275.a();
                hVar276 = this.f297a.gp;
                com.google.android.libraries.gsa.h.h hVar311 = (com.google.android.libraries.gsa.h.h) hVar276.a();
                hVar277 = this.f297a.gq;
                p pVar5 = (p) hVar277.a();
                hVar278 = this.f297a.gm;
                ds dsVar18 = this.b;
                jo joVar13 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.an.a W = dsVar18.W();
                hVar279 = joVar13.nZ;
                at atVar = (at) hVar279.a();
                jyVar8 = this.f297a.f319a;
                hVar280 = jyVar8.hf;
                boolean booleanValue2 = ((Boolean) hVar280.a()).booleanValue();
                ds dsVar19 = this.b;
                jo joVar14 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.aq.a.a af = dsVar19.af();
                hVar281 = joVar14.hG;
                return new cx(b112, b113, b114, b115, b116, b117, cuVar2, at, fVar2, dVar2, b118, hVar310, hVar311, pVar5, W, atVar, booleanValue2, af, c.b(hVar281));
            case 493:
                hVar282 = this.b.f;
                return new com.google.android.apps.gsa.search.core.ae.bi.a.d(c.b(hVar282));
            case 494:
                hVar283 = this.b.eY;
                com.google.android.apps.gsa.search.core.state.i iVar = (com.google.android.apps.gsa.search.core.state.i) hVar283.a();
                hVar284 = this.b.u;
                a b119 = c.b(hVar284);
                hVar285 = this.b.x;
                return new com.google.android.apps.gsa.search.core.state.am(iVar, b119, c.b(hVar285), 1);
            case 495:
                hVar286 = this.b.lH;
                com.google.android.apps.gsa.search.core.state.an anVar2 = (com.google.android.apps.gsa.search.core.state.an) hVar286.a();
                hVar287 = this.b.x;
                a b120 = c.b(hVar287);
                hVar288 = this.b.fa;
                a b121 = c.b(hVar288);
                hVar289 = this.b.bj;
                a b122 = c.b(hVar289);
                hVar290 = this.b.u;
                return new com.google.android.apps.gsa.search.core.state.ao(anVar2, b120, b121, b122, c.b(hVar290));
            case 496:
                hVar291 = this.b.d;
                a b123 = c.b(hVar291);
                hVar292 = this.b.eZ;
                a b124 = c.b(hVar292);
                ds dsVar20 = this.b;
                jo joVar15 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.s.a K = dsVar20.K();
                hVar293 = joVar15.gm;
                return new com.google.android.apps.gsa.search.core.state.an(b123, b124, K);
            case 497:
                hVar294 = this.b.fc;
                ba baVar = (ba) hVar294.a();
                hVar295 = this.b.bj;
                a b125 = c.b(hVar295);
                hVar296 = this.b.u;
                return new com.google.android.apps.gsa.search.core.state.am(baVar, b125, c.b(hVar296), 2);
            case 498:
                hVar297 = this.b.fk;
                bm bmVar = (bm) hVar297.a();
                hVar298 = this.b.v;
                a b126 = c.b(hVar298);
                hVar299 = this.b.u;
                return new com.google.android.apps.gsa.search.core.state.am(bmVar, b126, c.b(hVar299), 3);
            case 499:
                hVar300 = this.b.fj;
                bx bxVar = (bx) hVar300.a();
                hVar301 = this.b.x;
                a b127 = c.b(hVar301);
                hVar302 = this.b.u;
                a b128 = c.b(hVar302);
                hVar303 = this.b.fl;
                return new com.google.android.apps.gsa.search.core.state.ac(bxVar, b127, b128, c.b(hVar303), 3);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.c;
        switch (i) {
            case 500:
                return new com.google.android.apps.gsa.search.core.state.q((com.google.android.apps.gsa.search.core.state.aj) this.b.y.a(), c.b(this.b.u), 5);
            case 501:
                return new com.google.android.apps.gsa.search.core.state.q((com.google.android.apps.gsa.search.core.state.p) this.b.bE.a(), c.b(this.b.u), 0);
            case 502:
                a b = c.b(this.b.d);
                ds dsVar = this.b;
                jo joVar = this.f297a;
                a b2 = c.b(dsVar.C);
                a b3 = c.b(joVar.gq);
                ds dsVar2 = this.b;
                com.google.android.apps.gsa.search.core.ae.i.a D = dsVar2.D();
                com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) dsVar2.b.a();
                return new com.google.android.apps.gsa.search.core.state.p(b, b2, b3, D, hVar);
            case 503:
                ay ayVar = (ay) this.b.C.a();
                ds dsVar3 = this.b;
                h hVar2 = dsVar3.v;
                a b4 = c.b(dsVar3.u);
                a b5 = c.b(hVar2);
                a b6 = c.b(dsVar3.bz);
                a b7 = c.b(this.b.bB);
                ds dsVar4 = this.b;
                return new com.google.android.apps.gsa.search.core.state.az(ayVar, b4, b5, b6, b7, c.b(dsVar4.x), c.b(dsVar4.t), c.b(dsVar4.z));
            case 504:
                ds dsVar5 = this.b;
                return new com.google.android.apps.gsa.search.core.state.af(c.b(dsVar5.u), c.b(dsVar5.w));
            case 505:
                return at.k((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f297a.hc.a());
            case 506:
                ds dsVar6 = this.b;
                return new com.google.android.apps.gsa.search.core.service.r(c.b(dsVar6.aW), (com.google.android.apps.gsa.search.core.service.a) dsVar6.bF.a(), (j) this.b.aT.a());
            case 507:
                return new com.google.android.apps.gsa.search.core.service.a();
            case 508:
                return new com.google.android.apps.gsa.x.b.a.a(c.b(this.b.n), (am) this.f297a.pm.a(), (com.google.android.apps.gsa.sidekick.a.a.a) this.f297a.hL.a(), (an) this.f297a.gB.a(), c.b(this.f297a.gF), c.b(this.f297a.pj));
            case 509:
                return this.f297a.cN().a("gsa_relationship_contact_info");
            case 510:
                return new com.google.android.apps.gsa.search.shared.actions.a.a();
            case 511:
                return new com.google.android.apps.gsa.staticplugins.i.j(c.b(this.b.aw));
            case 512:
                return new com.google.android.libraries.gcoreclient.b.a.e();
            case 513:
                return new com.google.android.libraries.gcoreclient.b.a.e();
            case 514:
                return new com.google.android.apps.gsa.search.core.a.b.e(this.b.aq(), (Context) this.f297a.f.a(), (SharedPreferences) this.f297a.gf.a(), c.b(this.f297a.gt), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), (p) this.f297a.gq.a());
            case 515:
                return new com.google.android.apps.gsa.search.core.ae.aw.a.b(c.b(this.b.f));
            case 516:
                return new com.google.android.apps.gsa.staticplugins.opa.br.a.f((com.google.android.apps.gsa.search.core.service.x) this.b.p.a(), this.b.ag(), (com.google.android.apps.gsa.search.core.y.a.a) this.f297a.nz.a(), (p) this.f297a.gq.a(), c.b(this.f297a.hG), c.b(this.f297a.gF));
            case 517:
                return new com.google.android.apps.gsa.search.core.ae.bd.a.e(c.b(this.b.f));
            case 518:
                return at.k((com.google.android.apps.gsa.nga.shared.q.h) this.f297a.f319a.eY.a());
            case 519:
                return new com.google.android.apps.gsa.staticplugins.g.ag(at.k(this.f297a.nE()), at.k((com.google.android.apps.gsa.staticplugins.opa.samson.c.e.i) this.f297a.oB.a()), (at) this.b.aj.a());
            case 520:
                return ha.w((ac) this.b.X.a(), (ac) this.b.Y.a(), (ac) this.b.Z.a(), (ac) this.b.aa.a(), (ac) this.b.ab.a(), (ac) this.b.ac.a(), new ac[]{(ac) this.b.ad.a(), (ac) this.b.ae.a(), (ac) this.b.af.a(), (ac) this.b.ag.a()});
            case 521:
                h hVar3 = this.b.cc;
                hVar3.getClass();
                return new com.google.android.apps.gsa.staticplugins.e.b.c(hVar3);
            case 522:
                return new com.google.android.apps.gsa.staticplugins.e.c.b((Context) this.f297a.f.a(), (SharedPreferences) this.f297a.gf.a());
            case 523:
                return new com.google.android.apps.gsa.staticplugins.am.a.a(this.b.R(), (n) this.f297a.gf.a());
            case 524:
                h hVar4 = this.b.cf;
                hVar4.getClass();
                return new com.google.android.apps.gsa.staticplugins.opa.ag.e(hVar4);
            case 525:
                a b8 = c.b(this.f297a.nU);
                a b9 = c.b(this.f297a.gB);
                a b10 = c.b(this.f297a.ig);
                a b11 = c.b(this.f297a.ii);
                ds dsVar7 = this.b;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.d.a(b8, b9, b10, b11, dsVar7.aU(), dsVar7.aV());
            case 526:
                h hVar5 = this.b.ch;
                hVar5.getClass();
                return new com.google.android.apps.gsa.staticplugins.opa.ag.e(hVar5);
            case 527:
                com.google.android.apps.gsa.staticplugins.opa.morris2.h.h hVar6 = (com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) this.f297a.mW.a();
                Context context = (Context) this.f297a.f.a();
                com.google.android.apps.gsa.staticplugins.opa.morris2.h.j jVar = (com.google.android.apps.gsa.staticplugins.opa.morris2.h.j) this.f297a.qv.a();
                jo joVar2 = this.f297a;
                h hVar7 = joVar2.qu;
                an anVar = (an) joVar2.gB.a();
                jo joVar3 = this.f297a;
                return new com.google.android.apps.gsa.staticplugins.opa.morris2.a.b(hVar6, context, jVar, hVar7, anVar, joVar3.ab(), (com.google.android.libraries.g.a) joVar3.g.a(), (Executor) this.f297a.v.a(), (com.google.common.v.f) this.b.H.a());
            case 528:
                h hVar8 = this.b.ck;
                hVar8.getClass();
                return new com.google.android.apps.gsa.staticplugins.bg.a.a(hVar8);
            case 529:
                return new com.google.android.libraries.search.r.a.b(this.f297a.f319a.S, this.b.gt());
            case 530:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((com.google.android.apps.gsa.assistant.shared.z) this.f297a.gt.a(), 5);
            case 531:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((com.google.android.apps.gsa.assistant.shared.z) this.f297a.gt.a(), 4);
            case 532:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.c((com.google.android.apps.gsa.assistant.shared.z) this.f297a.gt.a(), (p) this.f297a.gq.a(), (com.google.android.apps.gsa.search.core.aa.a.c) this.f297a.ls.a(), (com.google.android.apps.gsa.staticplugins.opa.util.bn) this.f297a.f319a.V.a());
            case 533:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.f(1);
            case 534:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((p) this.f297a.gq.a(), 7);
            case 535:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.f(0);
            case 536:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((p) this.f297a.gq.a(), 1);
            case 537:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((SharedPreferences) this.f297a.gf.a(), 3);
            case 538:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((SharedPreferences) this.f297a.gf.a(), 2);
            case 539:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((SharedPreferences) this.f297a.gf.a(), 0);
            case 540:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((SharedPreferences) this.f297a.gf.a(), 8);
            case 541:
                return new com.google.android.apps.gsa.staticplugins.opa.ag.d((SharedPreferences) this.f297a.gf.a(), 6);
            case 542:
                return new com.google.android.apps.gsa.staticplugins.nga.q.a((at) this.f297a.wg.a());
            case 543:
                return new com.google.android.apps.gsa.staticplugins.opa.setupwizard.a(c.b(this.f297a.gq), c.b(this.f297a.gB), c.b(this.f297a.gt), c.b(this.f297a.gr), c.b(this.f297a.ig));
            case 544:
                com.google.android.apps.gsa.staticplugins.opa.util.p pVar = (com.google.android.apps.gsa.staticplugins.opa.util.p) this.f297a.wl.a();
                p pVar2 = (p) this.f297a.gq.a();
                return new com.google.android.apps.gsa.staticplugins.opa.samson.k.a(pVar, pVar2);
            case 545:
                return new com.google.android.apps.gsa.staticplugins.opa.v.m(c.b(this.f297a.gB), Optional.of((com.google.android.apps.gsa.staticplugins.opa.omniconsent.y) this.f297a.ig.a()), c.b(this.f297a.ie), (com.google.android.apps.gsa.assistant.shared.z) this.f297a.gt.a());
            case 546:
                p pVar3 = (p) this.f297a.gq.a();
                at atVar = (at) this.f297a.f319a.by.a();
                com.google.android.apps.gsa.assistant.shared.z zVar = (com.google.android.apps.gsa.assistant.shared.z) this.f297a.gt.a();
                an anVar2 = (an) this.f297a.gB.a();
                Context context2 = (Context) this.f297a.f.a();
                ds dsVar8 = this.b;
                return new com.google.android.apps.gsa.staticplugins.opa.appintegration.a.a(pVar3, atVar, zVar, anVar2, context2, dsVar8.cj, (at) dsVar8.bf.a());
            case 547:
                return new com.google.android.libraries.gcoreclient.f.c.c((Context) this.f297a.f.a());
            case 548:
                return new com.google.android.apps.gsa.staticplugins.ch.a.a((Context) this.f297a.f.a());
            case 549:
                return new com.google.android.apps.gsa.search.core.ae.ba.a.a(c.b(this.b.f));
            case 550:
                return new com.google.android.apps.gsa.search.core.ae.n.a.a(c.b(this.b.f));
            case 551:
                return new com.google.android.apps.gsa.staticplugins.opamediaplayer.f(c.b(this.b.bp), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a());
            case 552:
                return new com.google.android.apps.gsa.search.core.ae.bw.a.e(c.b(this.b.f));
            case 553:
                return new com.google.android.apps.gsa.search.core.ae.b.a.a(c.b(this.b.f));
            case 554:
                return new com.google.android.apps.gsa.search.core.ae.bt.a.e(c.b(this.b.f));
            case 555:
                return new lm(this.f297a, this.b);
            case 556:
                return new com.google.android.apps.gsa.staticplugins.p.f.a.c(new lz(this.f297a, this.b));
            case 557:
                return new com.google.android.libraries.assistant.auto.tng.l.g((Executor) this.f297a.H.a());
            case 558:
                return new com.google.android.apps.gsa.search.core.ae.a.a.a(c.b(this.b.f));
            case 559:
                return new com.google.android.apps.gsa.search.core.ae.p.a.f(c.b(this.b.f));
            case 560:
                return new com.google.android.apps.gsa.search.core.ae.p.a.e(c.b(this.b.f));
            case 561:
                return new com.google.android.apps.gsa.search.core.ae.ax.a.b(c.b(this.b.f));
            case 562:
                return new ld(this.f297a, this.b);
            case 563:
                return new com.google.android.apps.gsa.shared.util.o.c((Context) this.b.o.a());
            case 564:
                return new com.google.android.apps.gsa.staticplugins.opa.bd.f.i();
            case 565:
                return new com.google.android.apps.gsa.search.core.service.aw((com.google.android.apps.gsa.shared.logger.b.h) this.f297a.hG.a());
            case 566:
                return new com.google.android.apps.gsa.search.core.ae.at.a.a(c.b(this.b.f));
            case 567:
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.g((Context) this.f297a.f.a(), (n) this.f297a.gf.a(), c.b(this.f297a.ip));
            case 568:
                return com.google.android.apps.gsa.l.d.a.f(this.b.gL());
            case 569:
                return new com.google.android.libraries.search.l.b.n((com.google.android.libraries.search.l.b.f) this.b.bn.a(), (com.google.apps.tiktok.account.data.b) this.f297a.bN.a(), (ExecutorService) this.f297a.H.a());
            case 570:
                return com.google.android.apps.gsa.l.d.a.a(this.b.gL());
            case 571:
                return com.google.android.apps.gsa.l.d.a.b(this.b.gL());
            case 572:
                return com.google.android.apps.gsa.l.d.a.c(this.b.gL());
            case 573:
                return com.google.android.apps.gsa.l.d.a.d(this.b.gL());
            case 574:
                return com.google.android.apps.gsa.l.d.a.e(this.b.gL(), (p) this.f297a.gq.a(), (at) this.f297a.gS.a());
            case 575:
            case 576:
                return com.google.android.apps.gsa.l.d.a.g(this.b.gL());
            case 577:
                com.google.android.apps.gsa.l.a.o e = this.b.e();
                fl flVar = com.google.android.apps.gsa.l.d.b.a;
                return e.a();
            case 578:
                return this.b.aM().a("MDD.MAINTENANCE.PERIODIC.GCM.TASK");
            case 579:
                gy l = ha.l(3);
                l.j(this.b.gx());
                nr nrVar = nr.a;
                nrVar.getClass();
                l.j(nrVar);
                l.h((com.google.android.apps.gsa.shared.x.a) this.f297a.f319a.cT.a());
                return l.g();
            case 580:
                return new com.google.android.apps.gsa.staticplugins.nga.t.c((an) this.f297a.gB.a(), (com.google.android.apps.gsa.assistant.settings.shared.t) this.b.au.a(), (com.google.android.apps.gsa.nga.shared.q.a) this.f297a.iD.a(), c.b(this.f297a.gq), c.b(this.f297a.lA));
            case 581:
                return this.b.aM().a("MDD.CHARGING.PERIODIC.TASK");
            case 582:
                return this.b.aM().a("MDD.CELLULAR.CHARGING.PERIODIC.TASK");
            case 583:
                return this.b.aM().a("MDD.WIFI.CHARGING.PERIODIC.TASK");
            case 584:
                com.google.android.apps.gsa.l.a.o gL = this.b.gL();
                com.google.protobuf.ba createBuilder = com.google.android.apps.gsa.l.e.c.c.createBuilder();
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar = createBuilder.instance;
                cVar.d |= 2;
                cVar.h = "agsa";
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar2 = createBuilder.instance;
                cVar2.i = 1;
                cVar2.d |= 4;
                createBuilder.aZ(fl.s(com.google.protos.o.b.v.l, com.google.protos.o.b.v.at, com.google.protos.o.b.v.bE, com.google.protos.o.b.v.bF));
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar3 = createBuilder.instance;
                cVar3.d |= 16;
                cVar3.j = true;
                return gL.b(createBuilder.build());
            case 585:
                ds dsVar9 = this.b;
                com.google.android.apps.gsa.l.a.u f = dsVar9.f();
                at k = at.k(dsVar9.aP());
                com.google.protobuf.ba createBuilder2 = com.google.android.apps.gsa.l.e.c.c.createBuilder();
                com.google.android.libraries.geller.c cVar4 = com.google.android.libraries.geller.c.a;
                createBuilder2.ba(com.google.protos.o.b.v.cx);
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar5 = createBuilder2.instance;
                cVar5.i = 1;
                cVar5.d |= 4;
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar6 = createBuilder2.instance;
                cVar6.d |= 2;
                cVar6.h = "agsa";
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar7 = createBuilder2.instance;
                cVar7.d |= 16;
                cVar7.j = true;
                com.google.android.apps.gsa.l.e.c build = createBuilder2.build();
                com.google.android.apps.gsa.l.f.q qVar = (com.google.android.apps.gsa.l.f.q) f.a.a();
                qVar.getClass();
                com.google.android.libraries.search.l.b.n nVar = (com.google.android.libraries.search.l.b.n) f.b.a();
                nVar.getClass();
                p pVar4 = (p) f.c.a();
                pVar4.getClass();
                build.getClass();
                return new com.google.android.apps.gsa.l.a.t(qVar, nVar, pVar4, k, build);
            case 586:
                return new com.google.android.apps.gsa.l.f.q(c.b(this.f297a.gB), (com.google.android.apps.gsa.l.f.j) this.b.gj(), (com.google.common.base.ci) this.f297a.ft.a(), (com.google.android.libraries.geller.portable.ae) this.f297a.lK.a());
            case 587:
                Context context3 = (Context) this.f297a.f.a();
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f297a.g.a();
                ExecutorService executorService = (ExecutorService) this.f297a.n.a();
                at k2 = at.k(((p) this.f297a.gq.a()).t(bo.z));
                com.google.common.base.a aVar2 = com.google.common.base.a.a;
                return new com.google.android.libraries.geller.h.as(context3, aVar, executorService, k2, aVar2, aVar2);
            case 588:
                return new com.google.android.apps.gsa.staticplugins.nga.h.a((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f297a.hc.a());
            case 589:
                com.google.android.apps.gsa.l.a.o gL2 = this.b.gL();
                com.google.protobuf.ba createBuilder3 = com.google.android.apps.gsa.l.e.c.c.createBuilder();
                createBuilder3.ba(com.google.protos.o.b.v.cn);
                createBuilder3.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar8 = createBuilder3.instance;
                cVar8.i = 1;
                cVar8.d |= 4;
                createBuilder3.copyOnWrite();
                com.google.android.apps.gsa.l.e.c cVar9 = createBuilder3.instance;
                cVar9.d |= 2;
                cVar9.h = "agsa";
                return gL2.b(createBuilder3.build());
            case 590:
                return new com.google.android.apps.gsa.l.a.k((Context) this.f297a.f.a(), (at) this.f297a.gS.a(), (p) this.f297a.gq.a());
            case 591:
                return new com.google.android.apps.gsa.search.core.google.gaia.changed.c((an) this.f297a.gB.a(), (com.google.android.apps.gsa.assistant.shared.aw) this.f297a.f319a.bC.a(), (com.google.android.apps.gsa.shared.util.c.a.an) this.f297a.gy.a());
            case 592:
                return new com.google.android.apps.gsa.searchbox.a.a.a.f(new com.google.android.apps.gsa.search.core.ae.bc.a.a(c.b(this.b.f)));
            case 593:
                return new com.google.android.apps.gsa.staticplugins.au.b.r((n) this.f297a.gf.a(), (com.google.android.apps.gsa.search.core.ae.af.a) this.b.l.a());
            case 594:
                a b12 = c.b(this.f297a.gV);
                n nVar2 = (n) this.f297a.gf.a();
                a b13 = c.b(this.f297a.lV);
                a b14 = c.b(this.f297a.gP);
                a b15 = c.b(this.f297a.hR);
                Context context4 = (Context) this.f297a.f.a();
                a b16 = c.b(this.b.i);
                return new com.google.android.apps.gsa.staticplugins.au.b.n(b12, nVar2, b13, b14, b15, context4, b16, c.b(this.f297a.hG), (com.google.android.libraries.search.b.b) this.f297a.hO.a(), c.b(this.f297a.gq), c.b(this.f297a.vJ), c.b(this.f297a.hP), c.b(this.f297a.v), c.b(this.f297a.H), c.b(this.b.l), (com.google.android.libraries.storage.a.j) this.f297a.as.a(), (d) this.f297a.aD.a(), (com.google.android.apps.gsa.hotword.b.j) this.f297a.mx.a(), (com.google.android.apps.gsa.shared.util.j) this.f297a.gY.a());
            case 595:
                return new com.google.android.apps.gsa.opa.i(c.b(this.f297a.gq), c.b(this.f297a.gB), c.b(this.f297a.gf), c.b(this.f297a.oH), c.b(this.f297a.gV), (com.google.android.apps.gsa.assistant.settings.shared.t) this.b.au.a(), c.b(this.f297a.f319a.bF), (com.google.android.apps.gsa.assistant.settings.shared.u) this.f297a.wj.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gA.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), c.b(this.f297a.gn));
            case 596:
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.e.a((com.google.android.apps.gsa.staticplugins.opa.smartspace.z) this.b.bk.a());
            case 597:
                return new com.google.android.apps.gsa.staticplugins.opa.worker.h.a(this.b.ap());
            case 598:
                return new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.a.g((Context) this.f297a.f.a(), (com.google.apps.tiktok.account.data.b) this.f297a.bN.a(), (com.google.android.apps.gsa.staticplugins.opa.worker.proactive.i) this.b.dg.a(), (Executor) this.f297a.H.a(), this.f297a.kr());
            case 599:
                return new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.i((Context) this.f297a.f.a(), (com.google.android.libraries.g.a) this.f297a.g.a(), (an) this.f297a.gB.a(), (com.google.android.apps.gsa.staticplugins.bq.m) this.f297a.oH.a(), new com.google.android.apps.gsa.t.a.a((p) this.b.f298a.gq.a()), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) this.f297a.gT.a(), (Executor) this.f297a.v.a(), (p) this.f297a.gq.a());
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        com.google.android.apps.gsa.search.core.ae.be.a.b eVar;
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
        if (i2 == 3) {
            return e();
        }
        if (i2 == 4) {
            return f();
        }
        if (i2 == 5) {
            return g();
        }
        switch (i) {
            case 600:
                com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) this.f297a.gz.a();
                ds dsVar = this.b;
                jo joVar = this.f297a;
                eVar = new com.google.android.apps.gsa.staticplugins.opa.zerostate.e(hVar, dsVar.C(), joVar.cJ(), (com.google.android.apps.gsa.staticplugins.opa.util.h) joVar.qF.a());
                break;
            case 601:
                cr crVar = (cr) this.f297a.v.a();
                com.google.android.apps.gsa.staticplugins.ba.ag agVar = (com.google.android.apps.gsa.staticplugins.ba.ag) this.f297a.nG.a();
                com.google.android.libraries.assistant.pcp.q.a.k kVar = (com.google.android.libraries.assistant.pcp.q.a.k) this.f297a.om.a();
                jo joVar2 = this.f297a;
                com.google.android.libraries.assistant.pcp.q.a.ag iu = joVar2.iu();
                p pVar = (p) joVar2.gq.a();
                com.google.android.apps.gsa.assistant.settings.features.d.w wVar = (com.google.android.apps.gsa.assistant.settings.features.d.w) this.f297a.oA.a();
                com.google.android.apps.gsa.r.f fVar = (com.google.android.apps.gsa.r.f) this.f297a.oN.a();
                jo joVar3 = this.f297a;
                eVar = new com.google.android.apps.gsa.staticplugins.ba.h(crVar, agVar, kVar, iu, pVar, wVar, fVar, joVar3.cH(), (cr) joVar3.H.a(), (com.google.common.v.f) this.b.H.a(), (com.google.android.libraries.search.t.i.y) this.f297a.W.a(), this.f297a.op);
                break;
            case 602:
                eVar = new com.google.android.apps.gsa.staticplugins.smartspace.b((com.google.android.apps.gsa.opa.smartspace.d) this.f297a.oj.a(), (com.google.android.apps.gsa.staticplugins.opa.smartspace.o.b) this.f297a.f319a.bD.a(), (com.google.android.apps.gsa.staticplugins.opa.smartspace.k.k) this.f297a.oM.a(), (com.google.android.apps.gsa.opa.a.a.a) this.f297a.nK.a());
                break;
            case 603:
                eVar = new com.google.android.apps.gsa.staticplugins.bw.a(new com.google.android.apps.gsa.search.core.ae.bs.a.b(c.b(this.b.f)));
                break;
            case 604:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.i.a((Context) this.f297a.f.a(), (bg) this.f297a.gR.a());
                break;
            case 605:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.f.a.b.a((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f297a.hc.a());
                break;
            case 606:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.m.g((com.google.android.apps.gsa.nga.api.aq) this.f297a.hb.a(), (com.google.android.apps.gsa.nga.shared.q.g) this.f297a.iD.a(), (com.google.android.apps.gsa.staticplugins.nga.a.a.x) this.f297a.hl.a(), (com.google.android.apps.gsa.l.b) this.f297a.ly.a(), Optional.of(new com.google.android.apps.search.assistant.libraries.dictation.starter.a.f(this.f297a.kA)), (p) this.f297a.gq.a(), (an) this.f297a.gB.a(), (com.google.android.apps.gsa.nga.shared.q.a.x) this.f297a.iF.a(), (com.google.common.v.f) this.b.H.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gz.a(), (bg) this.f297a.gR.a());
                break;
            case 607:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.m.h((com.google.android.apps.gsa.speech.o.g) this.f297a.gV.a(), (p) this.f297a.gq.a(), (an) this.f297a.gB.a(), (com.google.android.apps.gsa.staticplugins.nga.k.n) this.f297a.hc.a(), (bg) this.f297a.gR.a());
                break;
            case 608:
                com.google.android.apps.gsa.nga.shared.f.a.an anVar = (com.google.android.apps.gsa.nga.shared.f.a.an) this.f297a.jJ.a();
                com.google.android.apps.gsa.staticplugins.nga.t.i iVar = (com.google.android.apps.gsa.staticplugins.nga.t.i) this.f297a.hg.a();
                bg bgVar = (bg) this.f297a.gR.a();
                jo joVar4 = this.b.f298a;
                eVar = new com.google.android.apps.gsa.staticplugins.nga.w.b(anVar, iVar, bgVar, new com.google.android.apps.gsa.contacts.bf(joVar4.gL, joVar4.gM, joVar4.g, joVar4.gn), (com.google.android.apps.gsa.contacts.au) this.f297a.pL.a(), (com.google.android.apps.gsa.shared.util.c.a.aw) this.f297a.he.a());
                break;
            case 609:
                ds dsVar2 = this.b;
                com.google.android.apps.gsa.staticplugins.nga.u.t tVar = (com.google.android.apps.gsa.staticplugins.nga.u.t) dsVar2.f298a.lC.a();
                com.google.android.libraries.mdi.download.ae aeVar = (com.google.android.libraries.mdi.download.ae) dsVar2.dr.a();
                com.google.android.apps.gsa.staticplugins.nga.u.bo boVar = (com.google.android.apps.gsa.staticplugins.nga.u.bo) dsVar2.dt.a();
                com.google.android.apps.gsa.nga.shared.q.a.x xVar = (com.google.android.apps.gsa.nga.shared.q.a.x) dsVar2.f298a.iF.a();
                com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) dsVar2.f298a.gp.a();
                jo joVar5 = dsVar2.f298a;
                eVar = new com.google.android.apps.gsa.staticplugins.nga.u.bh(new bc(tVar, aeVar, boVar, xVar, hVar2, joVar5.cz(), joVar5.dC()), (bg) this.f297a.gR.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), this.f297a.dC(), 1);
                break;
            case 610:
                eVar = com.google.android.apps.gsa.staticplugins.nga.u.by.a(this.b.aR(), (p) this.f297a.gq.a());
                break;
            case 611:
                ds dsVar3 = this.b;
                com.google.android.apps.gsa.staticplugins.nga.u.t tVar2 = (com.google.android.apps.gsa.staticplugins.nga.u.t) dsVar3.f298a.lC.a();
                bp aR = dsVar3.aR();
                com.google.android.libraries.gsa.h.h hVar3 = (com.google.android.libraries.gsa.h.h) dsVar3.f298a.gp.a();
                jo joVar6 = dsVar3.f298a;
                com.google.android.apps.gsa.staticplugins.nga.u.bm bmVar = new com.google.android.apps.gsa.staticplugins.nga.u.bm(tVar2, aR, hVar3, joVar6.dC(), (an) joVar6.gB.a());
                com.google.android.apps.gsa.staticplugins.nga.u.e eVar2 = (com.google.android.apps.gsa.staticplugins.nga.u.e) this.f297a.lI.a();
                com.google.android.libraries.gsa.h.h hVar4 = (com.google.android.libraries.gsa.h.h) this.f297a.gp.a();
                ds dsVar4 = this.b;
                Set Yc = dsVar4.f298a.Yc();
                com.google.android.libraries.search.integrations.h.a.c cVar = (com.google.android.libraries.search.integrations.h.a.c) dsVar4.ds.a();
                com.google.android.libraries.search.integrations.h.a.b.c cVar2 = com.google.android.libraries.search.integrations.h.a.b.c.VELVET;
                cVar2.getClass();
                jo joVar7 = dsVar4.f298a;
                Map a2 = com.google.android.libraries.assistant.c.b.b.i.a(Yc, cVar, cVar2, (com.google.android.libraries.assistant.c.b.a.b.p) joVar7.Wa(), Optional.empty(), ((Boolean) joVar7.hH.a()).booleanValue());
                a2.getClass();
                eVar = com.google.android.apps.gsa.staticplugins.nga.u.by.b(bmVar, eVar2, hVar4, a2);
                break;
            case 612:
                Context context = (Context) this.f297a.f.a();
                cr crVar2 = (cr) this.f297a.H.a();
                cq cqVar = (cq) this.f297a.v.a();
                com.google.android.libraries.search.l.aj ajVar = (com.google.android.libraries.search.l.aj) this.b.bm.a();
                com.google.android.libraries.geller.portable.ae aeVar2 = (com.google.android.libraries.geller.portable.ae) this.f297a.lK.a();
                com.google.android.libraries.mdi.download.ba baVar = (com.google.android.libraries.mdi.download.ba) this.f297a.aB.a();
                com.google.android.libraries.mdi.download.h.b.ai aiVar = (com.google.android.libraries.mdi.download.h.b.ai) this.f297a.lO.a();
                com.google.android.libraries.search.integrations.h.a.a.e eVar3 = (com.google.android.libraries.search.integrations.h.a.a.e) this.f297a.lP.a();
                jo joVar8 = this.f297a;
                eVar = new com.google.android.libraries.search.integrations.h.a.c(context, crVar2, cqVar, ajVar, aeVar2, baVar, aiVar, eVar3, joVar8.XI(), joVar8.lg(), (com.google.android.libraries.mdi.download.aj) joVar8.ay.a(), h.a.a.as.a.a.h.i(this.f297a.V), h.a.a.as.a.a.h.c(this.f297a.V));
                break;
            case 613:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.u.bh((com.google.android.libraries.mdi.download.bz) this.f297a.hP.a(), (com.google.android.apps.gsa.staticplugins.nga.u.t) this.f297a.lC.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), (com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.g) this.f297a.lB.a(), 0);
                break;
            case 614:
                com.google.android.libraries.mdi.download.bz bzVar = (com.google.android.libraries.mdi.download.bz) this.f297a.hP.a();
                jo joVar9 = this.f297a;
                eVar = new com.google.android.apps.gsa.staticplugins.nga.u.o(bzVar, joVar9.cz(), (ax) joVar9.mz.a(), (com.google.android.apps.gsa.staticplugins.nga.u.j) this.f297a.lE.a(), (com.google.android.apps.gsa.staticplugins.nga.u.t) this.f297a.lC.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gp.a(), (com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.g) this.f297a.lB.a(), (an) this.f297a.gB.a());
                break;
            case 615:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.a.a.e(c.b(this.f297a.hl), c.b(this.f297a.hb), (com.google.android.libraries.gsa.h.h) this.f297a.gz.a());
                break;
            case 616:
                eVar = new com.google.android.apps.gsa.assistant.settings.shared.j.e((Context) this.f297a.f.a(), (com.google.android.libraries.gsa.h.h) this.f297a.gv.a(), (n) this.f297a.gf.a(), (com.google.android.apps.gsa.assistant.settings.shared.f) this.f297a.nE.a(), (com.google.android.apps.gsa.staticplugins.bq.m) this.f297a.oH.a(), (com.google.android.apps.gsa.search.core.google.a.a.e) this.f297a.pr.a(), (m) this.f297a.gP.a(), (p) this.f297a.gq.a());
                break;
            case 617:
                eVar = new com.google.android.apps.gsa.staticplugins.nga.n.f((com.google.android.apps.gsa.shared.util.q.a) this.f297a.hh.a(), (com.google.common.base.ci) this.f297a.ft.a(), (com.google.android.apps.gsa.shared.util.c.a.aw) this.f297a.jF.a());
                break;
            case 618:
                eVar = new com.google.android.apps.gsa.search.core.ae.bo.a.i(c.b(this.b.f));
                break;
            case 619:
                eVar = new com.google.android.apps.gsa.search.core.ae.g.a.a(c.b(this.b.f));
                break;
            case 620:
                eVar = new com.google.android.apps.gsa.search.core.ae.aq.b.aq(c.b(this.b.f));
                break;
            case 621:
                jo joVar10 = this.f297a;
                ds dsVar5 = this.b;
                eVar = new com.google.android.apps.gsa.staticplugins.ag.o(joVar10.hG, joVar10.gm, joVar10.hE, joVar10.g, joVar10.aF, dsVar5.m, joVar10.oX, joVar10.gF, joVar10.gp, joVar10.hq, joVar10.gq, dsVar5.n, joVar10.gB, joVar10.gf, joVar10.hD, joVar10.gy, joVar10.f);
                break;
            case 622:
                eVar = new mk(this.f297a);
                break;
            case 623:
                com.google.android.apps.gsa.staticplugins.bi.f.c cVar3 = (com.google.android.apps.gsa.staticplugins.bi.f.c) this.b.dM.a();
                a b = c.b(this.f297a.gF);
                com.google.android.apps.gsa.staticplugins.bi.f.b bVar = (com.google.android.apps.gsa.staticplugins.bi.f.b) this.f297a.f319a.gP.a();
                c.b(this.f297a.go);
                com.google.android.apps.gsa.b.f.i iVar2 = (com.google.android.apps.gsa.b.f.i) this.b.bq.a();
                com.google.android.apps.gsa.speech.audio.k kVar2 = (com.google.android.apps.gsa.speech.audio.k) this.f297a.f319a.gS.a();
                c.b(this.f297a.hG);
                eVar = new com.google.android.apps.gsa.staticplugins.bi.f.d(cVar3, b, bVar, iVar2, kVar2, (Context) this.f297a.f.a());
                break;
            case 624:
                com.google.android.libraries.gsa.h.h hVar5 = (com.google.android.libraries.gsa.h.h) this.b.dH.a();
                com.google.android.libraries.gsa.h.h hVar6 = (com.google.android.libraries.gsa.h.h) this.b.dI.a();
                a b2 = c.b(this.f297a.gF);
                com.google.android.apps.gsa.speech.e.c.h hVar7 = (com.google.android.apps.gsa.speech.e.c.h) this.f297a.f319a.iQ.a();
                jo joVar11 = this.f297a;
                h hVar8 = joVar11.f319a.iX;
                eVar = new com.google.android.apps.gsa.staticplugins.bi.f.c(hVar5, hVar6, b2, hVar7, joVar11.gY, (com.google.android.apps.gsa.staticplugins.au.a) hVar8.a(), c.b(this.b.dL), (com.google.android.apps.gsa.shared.logger.b.h) this.f297a.hG.a(), (com.google.android.apps.gsa.b.f.i) this.b.bq.a());
                break;
            case 625:
                eVar = ((com.google.android.apps.gsa.shared.util.c.a.aw) this.f297a.he.a()).a(com.google.android.apps.gsa.staticplugins.bi.e.c.class);
                break;
            case 626:
                eVar = ((com.google.android.apps.gsa.shared.util.c.a.aw) this.f297a.he.a()).a(com.google.android.apps.gsa.staticplugins.bi.e.b.class);
                break;
            case 627:
                com.google.android.apps.gsa.shared.v.ae aeVar3 = (com.google.android.apps.gsa.shared.v.ae) this.b.n.a();
                com.google.android.apps.gsa.staticplugins.bi.h.g gVar = new com.google.android.apps.gsa.staticplugins.bi.h.g();
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) this.f297a.gy.a();
                a b3 = c.b(this.f297a.go);
                jo joVar12 = this.f297a;
                h hVar9 = joVar12.gf;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) joVar12.g.a();
                Context context2 = (Context) this.f297a.f.a();
                ds dsVar6 = this.b;
                jo joVar13 = this.f297a;
                a b4 = c.b(dsVar6.dJ);
                com.google.android.libraries.gsa.h.h hVar10 = (com.google.android.libraries.gsa.h.h) joVar13.gp.a();
                com.google.android.apps.gsa.search.core.ae.be.a.b bVar2 = new com.google.android.apps.gsa.search.core.ae.be.a.b(c.b(this.b.f));
                ds dsVar7 = this.b;
                jo joVar14 = this.f297a;
                com.google.android.apps.gsa.search.core.ae.bd.a aj = dsVar7.aj();
                p pVar2 = (p) joVar14.gq.a();
                ds dsVar8 = this.b;
                eVar = new com.google.android.apps.gsa.staticplugins.bi.c.i(aeVar3, gVar, anVar2, b3, hVar9, aVar, context2, b4, hVar10, bVar2, aj, pVar2, new com.google.android.apps.gsa.speech.hotword.d.a(dsVar8.aN(), (com.google.android.apps.gsa.speech.o.g) dsVar8.f298a.gV.a(), dsVar8.aF(), (com.google.android.apps.gsa.shared.k.c) dsVar8.f298a.gq.a(), (com.google.android.apps.gsa.shared.speech.a.i) dsVar8.bi.a(), (com.google.android.libraries.g.a) dsVar8.f298a.g.a()), c.b(this.b.dK));
                break;
            case 628:
                eVar = com.google.android.apps.gsa.staticplugins.bi.e.a.a((PackageManager) this.f297a.h.a(), (String) this.f297a.gi.a());
                break;
            case 629:
                ha.o((Collection) this.b.f298a.f319a.iP.a());
                c.b(this.f297a.hD);
                eVar = new com.google.android.apps.gsa.staticplugins.bi.f.f();
                break;
            case 630:
                eVar = new gt(this.f297a, this.b);
                break;
            case 631:
                eVar = new com.google.android.apps.gsa.staticplugins.bi.i.b.b.e.b(this.b.bs);
                break;
            case 632:
                eVar = ha.o((Collection) this.f297a.f319a.iP.a());
                break;
            case 633:
                eVar = new gt(this.f297a, this.b);
                break;
            case 634:
                eVar = new com.google.android.apps.gsa.staticplugins.bi.i.b.j.h(this.b.bu);
                break;
            case 635:
                eVar = new gt(this.f297a, this.b);
                break;
            case 636:
                eVar = new com.google.android.apps.gsa.staticplugins.bi.i.b.a.d.b(this.b.bt);
                break;
            case 637:
                eVar = new com.google.android.apps.gsa.speech.m.a.c((Context) this.f297a.f.a());
                break;
            case 638:
                eVar = new com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.aq((com.google.android.apps.gsa.q.g) this.b.bp.a(), (com.google.android.libraries.g.a) this.f297a.g.a());
                break;
            case 639:
                eVar = new com.google.android.apps.gsa.search.core.ae.bp.a.l(c.b(this.b.f));
                break;
            case 640:
                eVar = new com.google.android.apps.gsa.staticplugins.opamediaplayer.a.f((com.google.android.apps.gsa.search.core.ae.bp.k) this.b.ef.a(), (p) this.f297a.gq.a());
                break;
            case 641:
                eVar = new com.google.android.apps.gsa.search.core.ae.be.a.b(c.b(this.b.f));
                break;
            default:
                throw new AssertionError(i);
        }
        return eVar;
    }
}
