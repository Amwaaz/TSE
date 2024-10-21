package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.KeyguardManager;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.session.MediaSessionManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.staticplugins.bisto.e.z;
import com.google.android.apps.gsa.staticplugins.bisto.u.b.t;
import com.google.android.apps.gsa.staticplugins.bisto.u.b.u;
import com.google.android.apps.gsa.staticplugins.bisto.util.ab;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.apps.gsa.staticplugins.nga.vis.a.d;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.service.v;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.service.w;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.ah;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.bo;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.bv;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.by;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.co;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.cw;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.da;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.dc;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.de;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.dz;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ea;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.m;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.b.k;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.sbcdecoder.JniSbcDecoderImpl;
import com.google.android.apps.search.googleapp.launcher.c.b.c;
import com.google.android.apps.search.googleapp.launcher.c.x;
import com.google.android.apps.search.googleapp.z.f;
import com.google.android.apps.search.lens.c.e;
import com.google.android.libraries.g.a;
import com.google.android.libraries.lens.view.ai.p;
import com.google.android.libraries.lens.view.ai.q;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.a.ac;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.h.b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.h.g;
import com.google.android.libraries.search.assistant.invocation.k.e.y;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.account.data.ao;
import com.google.apps.tiktok.account.data.manager.ad;
import com.google.apps.tiktok.tracing.aa;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.dm;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.frameworks.client.data.android.server.l;
import e.c.h;
import e.c.i;
import io.grpc.ef;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.ag;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/hx.class */
public final class hx implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f302a;
    public final os b;
    private final int c;

    public hx(jo joVar, os osVar, int i) {
        this.f302a = joVar;
        this.b = osVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r17v4, types: [com.google.android.apps.search.assistant.surfaces.bisto.interactor.d.a, java.lang.Object] */
    private final Object b() {
        jy jyVar;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        jy jyVar2;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        jx jxVar;
        h hVar10;
        jy jyVar3;
        h hVar11;
        h hVar12;
        jy jyVar4;
        h hVar13;
        h hVar14;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        h hVar19;
        h hVar20;
        h hVar21;
        jy jyVar5;
        h hVar22;
        h hVar23;
        h hVar24;
        h hVar25;
        jx jxVar2;
        h hVar26;
        h hVar27;
        h hVar28;
        h hVar29;
        jx jxVar3;
        h hVar30;
        h hVar31;
        jx jxVar4;
        h hVar32;
        h hVar33;
        h hVar34;
        jx jxVar5;
        h hVar35;
        jy jyVar6;
        h hVar36;
        h hVar37;
        h hVar38;
        h hVar39;
        h hVar40;
        h hVar41;
        jx jxVar6;
        h hVar42;
        jr jrVar;
        h hVar43;
        jx jxVar7;
        h hVar44;
        jx jxVar8;
        h hVar45;
        jr jrVar2;
        h hVar46;
        jx jxVar9;
        jx jxVar10;
        h hVar47;
        jx jxVar11;
        jx jxVar12;
        h hVar48;
        h hVar49;
        h hVar50;
        jy jyVar7;
        h hVar51;
        h hVar52;
        jx jxVar13;
        jy jyVar8;
        h hVar53;
        jx jxVar14;
        jy jyVar9;
        h hVar54;
        h hVar55;
        h hVar56;
        jx jxVar15;
        h hVar57;
        h hVar58;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        jy jyVar10;
        h hVar66;
        h hVar67;
        h hVar68;
        h hVar69;
        jx jxVar16;
        h hVar70;
        h hVar71;
        jy jyVar11;
        h hVar72;
        jx jxVar17;
        h hVar73;
        h hVar74;
        h hVar75;
        jx jxVar18;
        jy jyVar12;
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
        Service service;
        h hVar87;
        h hVar88;
        jr jrVar3;
        h hVar89;
        Service service2;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        jx jxVar19;
        jx jxVar20;
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
        jy jyVar13;
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
        jx jxVar21;
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
        jx jxVar22;
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
        jx jxVar23;
        h hVar165;
        h hVar166;
        h hVar167;
        h hVar168;
        h hVar169;
        jy jyVar14;
        h hVar170;
        jy jyVar15;
        h hVar171;
        h hVar172;
        h hVar173;
        h hVar174;
        jx jxVar24;
        h hVar175;
        jx jxVar25;
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
        jx jxVar26;
        jy jyVar16;
        h hVar206;
        h hVar207;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        h hVar212;
        h hVar213;
        h hVar214;
        jx jxVar27;
        jx jxVar28;
        jx jxVar29;
        h hVar215;
        h hVar216;
        h hVar217;
        h hVar218;
        jx jxVar30;
        h hVar219;
        h hVar220;
        h hVar221;
        h hVar222;
        h hVar223;
        h hVar224;
        h hVar225;
        h hVar226;
        jx jxVar31;
        jy jyVar17;
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
        jy jyVar18;
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
        jx jxVar32;
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
        jx jxVar33;
        h hVar289;
        h hVar290;
        int i = this.c;
        switch (i) {
            case 0:
                jyVar = this.f302a.f319a;
                hVar = jyVar.eY;
                jo joVar = this.f302a;
                hVar2 = joVar.gq;
                hVar3 = joVar.gy;
                hVar4 = joVar.oZ;
                h b = i.b(hVar4);
                hVar5 = this.f302a.is;
                h b2 = i.b(hVar5);
                jyVar2 = this.f302a.f319a;
                hVar6 = jyVar2.hd;
                jo joVar2 = this.f302a;
                hVar7 = joVar2.aD;
                hVar8 = joVar2.oY;
                hVar9 = joVar2.gt;
                jxVar = joVar2.c;
                hVar10 = jxVar.dQ;
                jyVar3 = this.f302a.f319a;
                hVar11 = jyVar3.aD;
                jo joVar3 = this.f302a;
                hVar12 = joVar3.nW;
                jyVar4 = joVar3.f319a;
                hVar13 = jyVar4.ic;
                hVar14 = this.f302a.gF;
                h b3 = i.b(hVar14);
                hVar15 = this.f302a.hG;
                h b4 = i.b(hVar15);
                jo joVar4 = this.f302a;
                hVar16 = joVar4.gm;
                hVar17 = joVar4.aF;
                hVar18 = joVar4.hI;
                hVar19 = joVar4.nl;
                hVar20 = joVar4.hZ;
                hVar21 = joVar4.g;
                jyVar5 = joVar4.f319a;
                hVar22 = jyVar5.az;
                jo joVar5 = this.f302a;
                hVar23 = joVar5.qu;
                hVar24 = joVar5.kg;
                hVar25 = joVar5.oB;
                jxVar2 = joVar5.c;
                hVar26 = jxVar2.dR;
                hVar27 = this.f302a.mZ;
                h b5 = i.b(hVar27);
                jo joVar6 = this.f302a;
                hVar28 = joVar6.mW;
                hVar29 = joVar6.iF;
                jxVar3 = joVar6.c;
                hVar30 = jxVar3.dS;
                os osVar = this.b;
                jo joVar7 = this.f302a;
                hVar31 = osVar.c;
                jxVar4 = joVar7.c;
                hVar32 = jxVar4.dU;
                os osVar2 = this.b;
                jo joVar8 = this.f302a;
                hVar33 = osVar2.d;
                hVar34 = osVar2.e;
                jxVar5 = joVar8.c;
                hVar35 = jxVar5.dP;
                return new com.google.android.apps.gsa.assist.av(hVar, hVar2, hVar3, b, b2, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, b3, b4, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, b5, hVar28, hVar29, hVar30, hVar31, hVar32, hVar33, hVar34, hVar35);
            case 1:
                jyVar6 = this.f302a.f319a;
                return new ac(jyVar6.dC(), this.f302a.jN());
            case 2:
                hVar36 = this.b.aP;
                return g.b((b) hVar36.a());
            case 3:
                return new hw(this);
            case 4:
                hVar37 = this.f302a.cq;
                Object a2 = hVar37.a();
                jo joVar9 = this.f302a;
                os osVar3 = this.b;
                hVar38 = joVar9.uW;
                return dm.b(a2, hVar38, osVar3.dP(), dm.c());
            case 5:
                hVar39 = this.b.e;
                return new aa((dj) hVar39.a());
            case 6:
                hVar40 = this.f302a.f;
                Context context = (Context) hVar40.a();
                hVar41 = this.f302a.B;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar41.a();
                jxVar6 = this.f302a.c;
                hVar42 = jxVar6.gf;
                Object a3 = hVar42.a();
                jrVar = this.f302a.b;
                hVar43 = jrVar.em;
                com.google.android.apps.search.googleapp.x.d.b bVar = (com.google.android.apps.search.googleapp.x.d.b) hVar43.a();
                jxVar7 = this.f302a.c;
                hVar44 = jxVar7.aH;
                f fVar = (f) hVar44.a();
                os osVar4 = this.b;
                jo joVar10 = this.f302a;
                com.google.android.apps.search.googleapp.launcher.c.g o = osVar4.o();
                jxVar8 = joVar10.c;
                hVar45 = jxVar8.k;
                c cVar = (c) hVar45.a();
                jrVar2 = this.f302a.b;
                hVar46 = jrVar2.kD;
                com.google.android.apps.search.googleapp.launcher.b.c cVar2 = (com.google.android.apps.search.googleapp.launcher.b.c) hVar46.a();
                jxVar9 = this.f302a.c;
                boolean da = jxVar9.da();
                jxVar10 = this.f302a.c;
                hVar47 = jxVar10.dV;
                boolean booleanValue = ((Boolean) hVar47.a()).booleanValue();
                jxVar11 = this.f302a.c;
                boolean fw = jxVar11.fw();
                jxVar12 = this.f302a.c;
                return x.b(context, scheduledExecutorService, a3, bVar, fVar, o, cVar, cVar2, da, booleanValue, fw, jxVar12.fx());
            case 7:
                return new lt(this);
            case 8:
                hVar48 = this.f302a.f;
                Context context2 = (Context) hVar48.a();
                hVar49 = this.f302a.lq;
                e eVar = (e) hVar49.a();
                hVar50 = this.f302a.g;
                a aVar = (a) hVar50.a();
                jyVar7 = this.f302a.f319a;
                hVar51 = jyVar7.hT;
                com.google.android.libraries.lens.view.u.a aVar2 = (com.google.android.libraries.lens.view.u.a) hVar51.a();
                hVar52 = this.b.aQ;
                com.google.android.apps.search.lens.d.a aVar3 = (com.google.android.apps.search.lens.d.a) hVar52.a();
                jxVar13 = this.f302a.c;
                com.google.protos.l.a.e bc = jxVar13.bc();
                jyVar8 = this.f302a.f319a;
                boolean rh = jyVar8.rh();
                hVar53 = this.b.aR;
                p pVar = (p) hVar53.a();
                jxVar14 = this.f302a.c;
                return new com.google.android.apps.search.lens.e.f(context2, eVar, aVar, aVar2, aVar3, bc, rh, pVar, jxVar14.fy());
            case 9:
                jyVar9 = this.f302a.f319a;
                hVar54 = jyVar9.hT;
                return new com.google.android.apps.search.lens.d.a(e.c.c.b(hVar54));
            case 10:
                hVar55 = this.f302a.f;
                Context context3 = (Context) hVar55.a();
                hVar56 = this.f302a.H;
                return q.d(context3, (cr) hVar56.a());
            case 11:
                jxVar15 = this.f302a.c;
                return new com.google.android.apps.search.lens.e.b(jxVar15.ba());
            case 12:
                hVar57 = this.f302a.gv;
                return new com.google.android.apps.gsa.nga.shared.ak.h(hVar57);
            case 13:
                hVar58 = this.f302a.f;
                Context context4 = (Context) hVar58.a();
                hVar59 = this.f302a.hh;
                com.google.android.apps.gsa.shared.util.q.a aVar4 = (com.google.android.apps.gsa.shared.util.q.a) hVar59.a();
                hVar60 = this.f302a.gz;
                com.google.android.libraries.gsa.h.h hVar291 = (com.google.android.libraries.gsa.h.h) hVar60.a();
                hVar61 = this.f302a.gA;
                com.google.android.libraries.gsa.h.h hVar292 = (com.google.android.libraries.gsa.h.h) hVar61.a();
                hVar62 = this.f302a.gv;
                com.google.android.libraries.gsa.h.h hVar293 = (com.google.android.libraries.gsa.h.h) hVar62.a();
                hVar63 = this.f302a.qY;
                com.google.android.libraries.gsa.h.h hVar294 = (com.google.android.libraries.gsa.h.h) hVar63.a();
                hVar64 = this.f302a.gp;
                com.google.android.libraries.gsa.h.h hVar295 = (com.google.android.libraries.gsa.h.h) hVar64.a();
                hVar65 = this.f302a.qZ;
                j jVar = (j) hVar65.a();
                jyVar10 = this.f302a.f319a;
                hVar66 = jyVar10.dW;
                com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.g gVar = (com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.g) hVar66.a();
                os osVar5 = this.b;
                jo joVar11 = this.f302a;
                com.google.android.apps.gsa.nga.shared.ui.assistlayer.o.a a4 = osVar5.a();
                Object u = osVar5.u();
                hVar67 = joVar11.iP;
                com.google.android.apps.gsa.nga.shared.p.b bVar2 = (com.google.android.apps.gsa.nga.shared.p.b) hVar67.a();
                hVar68 = this.f302a.iA;
                af afVar = (af) hVar68.a();
                hVar69 = this.f302a.qq;
                com.google.android.libraries.b.a.f fVar2 = (com.google.android.libraries.b.a.f) hVar69.a();
                jxVar16 = this.f302a.c;
                hVar70 = jxVar16.ej;
                d dVar = (d) hVar70.a();
                hVar71 = this.f302a.on;
                com.google.android.apps.gsa.shared.t.x xVar = (com.google.android.apps.gsa.shared.t.x) hVar71.a();
                jyVar11 = this.f302a.f319a;
                hVar72 = jyVar11.av;
                com.google.android.apps.gsa.staticplugins.nga.ui.b.a aVar5 = (com.google.android.apps.gsa.staticplugins.nga.ui.b.a) hVar72.a();
                jxVar17 = this.f302a.c;
                hVar73 = jxVar17.gh;
                Optional of = Optional.of((com.google.android.apps.gsa.nga.shared.q.a.d) hVar73.a());
                com.google.android.apps.search.assistant.surfaces.voice.titan.ui.e.a.b bVar3 = new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.e.a.b();
                hVar74 = this.f302a.iF;
                return new com.google.android.apps.gsa.staticplugins.nga.vis.a.a(context4, aVar4, hVar291, hVar292, hVar293, hVar294, hVar295, jVar, gVar, a4, (com.google.android.apps.gsa.staticplugins.nga.vis.a.h) u, bVar2, afVar, fVar2, dVar, xVar, aVar5, of, bVar3, (com.google.android.apps.gsa.nga.shared.q.a.x) hVar74.a());
            case 14:
                hVar75 = this.f302a.gR;
                return new com.google.android.apps.gsa.staticplugins.nga.vis.b((bg) hVar75.a());
            case 15:
                jxVar18 = this.f302a.c;
                return Optional.of(jxVar18.I());
            case 16:
                jyVar12 = this.f302a.f319a;
                hVar76 = jyVar12.rn;
                return new op((com.google.android.apps.gsa.assistant.shared.e.a.f) hVar76.a());
            case 17:
                hVar77 = this.f302a.tA;
                return Optional.of((y) hVar77.a());
            case 18:
                return new lt(this);
            case 19:
                return new lt(this);
            case 20:
                return new lt(this);
            case 21:
                hVar78 = this.f302a.f;
                Context context5 = (Context) hVar78.a();
                os osVar6 = this.b;
                jo joVar12 = this.f302a;
                w e = osVar6.e();
                hVar79 = joVar12.hh;
                return new v(context5, e, (com.google.android.apps.gsa.shared.util.q.a) hVar79.a());
            case 22:
                hVar80 = this.f302a.f;
                Context context6 = (Context) hVar80.a();
                hVar81 = this.f302a.gp;
                return new com.google.android.apps.gsa.staticplugins.opa.appintegration.service.p(context6, (com.google.android.libraries.gsa.h.h) hVar81.a());
            case 23:
                hVar82 = this.b.e;
                hVar83 = this.b.aU;
                return com.google.frameworks.client.data.android.server.tiktok.af.c(at.k((ef) hVar83.a()), at.k(this.b.r()));
            case 24:
                hVar84 = this.b.e;
                return l.b((dj) hVar84.a());
            case 25:
                os osVar7 = this.b;
                Optional empty = Optional.empty();
                Optional empty2 = Optional.empty();
                Optional empty3 = Optional.empty();
                Optional empty4 = Optional.empty();
                Optional empty5 = Optional.empty();
                hVar85 = osVar7.aV;
                Optional of2 = Optional.of((com.google.br.d.a.a.e) hVar85.a());
                hVar86 = this.f302a.aY;
                return com.google.br.d.a.a.a.c.c(empty, empty2, empty3, empty4, empty5, of2, (com.google.br.d.a.a.e) hVar86.a());
            case 26:
                os osVar8 = this.b;
                jo joVar13 = this.f302a;
                service = osVar8.f331a;
                hVar87 = joVar13.aY;
                return com.google.br.d.a.a.a.c.b(service, (com.google.br.d.a.a.e) hVar87.a(), this.f302a.nY(), this.b.v());
            case 27:
                hVar88 = this.f302a.h;
                PackageManager packageManager = (PackageManager) hVar88.a();
                jo joVar14 = this.f302a;
                boolean acG = joVar14.acG();
                jrVar3 = joVar14.b;
                return new com.google.android.apps.search.assistant.libraries.dictation.f.a(packageManager, acG, jrVar3.gH());
            case 28:
                hVar89 = this.f302a.qN;
                n nVar = (n) hVar89.a();
                service2 = this.b.f331a;
                return com.google.apps.tiktok.f.g.g(nVar, service2);
            case 29:
                hVar90 = this.f302a.f;
                Context context7 = (Context) hVar90.a();
                hVar91 = this.f302a.gi;
                String str = (String) hVar91.a();
                hVar92 = this.f302a.hP;
                e.a b6 = e.c.c.b(hVar92);
                hVar93 = this.f302a.v;
                return new com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.e(context7, str, b6, e.c.c.b(hVar93));
            case 30:
                hVar94 = this.f302a.qt;
                return at.k((com.google.android.apps.gsa.assistant.shared.v) hVar94.a());
            case 31:
                jxVar19 = this.f302a.c;
                return at.k(jxVar19.aC());
            case 32:
                jxVar20 = this.f302a.c;
                hVar95 = jxVar20.gn;
                return at.k((com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.b.i) hVar95.a());
            case 33:
                return new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.a.a.c(this.f302a.kl());
            case 34:
                hVar96 = this.f302a.ap;
                ao aoVar = (ao) hVar96.a();
                hVar97 = this.f302a.ap;
                ao aoVar2 = (ao) hVar97.a();
                hVar98 = this.f302a.H;
                Executor executor = (Executor) hVar98.a();
                hVar99 = this.b.g;
                return new ad(aoVar, aoVar2, executor, (aa) hVar99.a());
            case 35:
                hVar100 = this.f302a.f;
                Context context8 = (Context) hVar100.a();
                hVar101 = this.f302a.g;
                a aVar6 = (a) hVar101.a();
                hVar102 = this.f302a.py;
                com.google.android.apps.gsa.shared.f.e eVar2 = (com.google.android.apps.gsa.shared.f.e) hVar102.a();
                hVar103 = this.b.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar7 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar103.a();
                hVar104 = this.b.E;
                com.google.android.apps.gsa.staticplugins.bisto.m.c cVar3 = (com.google.android.apps.gsa.staticplugins.bisto.m.c) hVar104.a();
                hVar105 = this.b.F;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p pVar2 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p) hVar105.a();
                hVar106 = this.f302a.ti;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar4 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) hVar106.a();
                hVar107 = this.b.G;
                com.google.android.apps.gsa.staticplugins.bisto.p.d dVar2 = (com.google.android.apps.gsa.staticplugins.bisto.p.d) hVar107.a();
                hVar108 = this.b.L;
                com.google.android.apps.gsa.staticplugins.bisto.o.a.b bVar4 = (com.google.android.apps.gsa.staticplugins.bisto.o.a.b) hVar108.a();
                hVar109 = this.b.bj;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.a.j jVar2 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.a.j) hVar109.a();
                hVar110 = this.b.br;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.a aVar8 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.a) hVar110.a();
                hVar111 = this.b.bt;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.b.h hVar296 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.b.h) hVar111.a();
                hVar112 = this.b.bv;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.e eVar3 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.e) hVar112.a();
                hVar113 = this.b.Z;
                ah ahVar = (ah) hVar113.a();
                hVar114 = this.b.af;
                com.google.android.libraries.assistant.accessory.e.n nVar2 = (com.google.android.libraries.assistant.accessory.e.n) hVar114.a();
                hVar115 = this.b.ag;
                com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) hVar115.a();
                hVar116 = this.b.bp;
                com.google.android.gms.wearable.n nVar3 = (com.google.android.gms.wearable.n) hVar116.a();
                hVar117 = this.f302a.W;
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) hVar117.a();
                jyVar13 = this.f302a.f319a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.e.b bg = jyVar13.bg();
                hVar118 = this.b.bw;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h hVar297 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h) hVar118.a();
                hVar119 = this.b.H;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q qVar2 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q) hVar119.a();
                os osVar9 = this.b;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.e k = osVar9.k();
                hVar120 = osVar9.al;
                ab abVar = (ab) hVar120.a();
                hVar121 = this.f302a.v;
                cr crVar = (cr) hVar121.a();
                hVar122 = this.f302a.B;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.g(context8, aVar6, eVar2, aVar7, cVar3, pVar2, cVar4, dVar2, bVar4, jVar2, aVar8, hVar296, eVar3, ahVar, nVar2, qVar, nVar3, yVar, bg, hVar297, qVar2, k, abVar, crVar, (cr) hVar122.a());
            case 36:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a();
            case 37:
                hVar123 = this.f302a.aD;
                return new com.google.android.apps.gsa.staticplugins.bisto.m.c((com.google.android.apps.gsa.shared.util.debug.d) hVar123.a());
            case 38:
                os osVar10 = this.b;
                jo joVar15 = this.f302a;
                de h = osVar10.h();
                hVar124 = joVar15.bo;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p(h, (ag) hVar124.a());
            case 39:
                hVar125 = this.b.aZ;
                return new com.google.android.apps.gsa.staticplugins.bisto.p.d((SharedPreferences) hVar125.a());
            case 40:
                hVar126 = this.f302a.ux;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.g((Context) hVar126.a(), this.f302a.cV());
            case 41:
                jo joVar16 = this.f302a;
                os osVar11 = this.b;
                lm lmVar = new lm(joVar16, osVar11);
                lz lzVar = new lz(joVar16, osVar11);
                hVar127 = osVar11.K;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.ag agVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.ag) hVar127.a();
                hVar128 = this.b.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar9 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar128.a();
                jxVar21 = this.f302a.c;
                hVar129 = jxVar21.Q;
                k kVar = (k) hVar129.a();
                hVar130 = this.f302a.W;
                com.google.android.libraries.search.t.i.y yVar2 = (com.google.android.libraries.search.t.i.y) hVar130.a();
                hVar131 = this.f302a.py;
                com.google.android.apps.gsa.shared.f.e eVar4 = (com.google.android.apps.gsa.shared.f.e) hVar131.a();
                hVar132 = this.f302a.f;
                Context context9 = (Context) hVar132.a();
                hVar133 = this.f302a.B;
                Executor executor2 = (Executor) hVar133.a();
                os osVar12 = this.b;
                return new com.google.android.apps.gsa.staticplugins.bisto.o.a.b(lmVar, lzVar, agVar, aVar9, kVar, yVar2, eVar4, context9, executor2, osVar12.aA(), osVar12.m());
            case 42:
                hVar134 = this.f302a.g;
                a aVar10 = (a) hVar134.a();
                hVar135 = this.b.F;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p pVar3 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p) hVar135.a();
                hVar136 = this.f302a.v;
                cr crVar2 = (cr) hVar136.a();
                hVar137 = this.b.I;
                hVar138 = this.b.J;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.ag(aVar10, pVar3, crVar2, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.x) hVar138.a());
            case 43:
                hVar139 = this.f302a.g;
                hVar140 = this.b.H;
                hVar141 = this.b.F;
                hVar142 = this.f302a.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.n();
            case 44:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q(this.b.l());
            case 45:
                hVar143 = this.b.H;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q qVar3 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q) hVar143.a();
                hVar144 = this.f302a.v;
                cr crVar3 = (cr) hVar144.a();
                jxVar22 = this.f302a.c;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.x(qVar3, crVar3, jxVar22.fA());
            case 46:
                hVar145 = this.f302a.f;
                Context context10 = (Context) hVar145.a();
                hVar146 = this.b.Z;
                ah ahVar2 = (ah) hVar146.a();
                hVar147 = this.b.F;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p pVar4 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p) hVar147.a();
                jo joVar17 = this.f302a;
                os osVar13 = this.b;
                mm mmVar = new mm(joVar17, osVar13);
                hVar148 = osVar13.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar11 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar148.a();
                hVar149 = this.b.aa;
                e.a b7 = e.c.c.b(hVar149);
                hVar150 = this.f302a.ti;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar5 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) hVar150.a();
                hVar151 = this.b.I;
                hVar152 = this.f302a.jv;
                com.google.android.apps.gsa.search.shared.service.e.e eVar5 = (com.google.android.apps.gsa.search.shared.service.e.e) hVar152.a();
                hVar153 = this.f302a.v;
                cr crVar4 = (cr) hVar153.a();
                hVar154 = this.f302a.B;
                Executor executor3 = (Executor) hVar154.a();
                os osVar14 = this.b;
                Object t = osVar14.t();
                hVar155 = osVar14.H;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q qVar4 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q) hVar155.a();
                hVar156 = this.b.M;
                com.google.android.apps.search.assistant.surfaces.bisto.a.c.e eVar6 = (com.google.android.apps.search.assistant.surfaces.bisto.a.c.e) hVar156.a();
                os osVar15 = this.b;
                Optional empty6 = Optional.empty();
                hVar157 = osVar15.bi;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.a.j(context10, ahVar2, pVar4, mmVar, aVar11, b7, cVar5, eVar5, crVar4, executor3, (com.google.android.apps.search.assistant.surfaces.bisto.a.f.l) t, qVar4, eVar6, empty6, (lt) hVar157.a());
            case 47:
                hVar158 = this.b.bb;
                lt ltVar = (lt) hVar158.a();
                hVar159 = this.b.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar12 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar159.a();
                hVar160 = this.b.bc;
                lt ltVar2 = (lt) hVar160.a();
                hVar161 = this.b.bd;
                lt ltVar3 = (lt) hVar161.a();
                os osVar16 = this.b;
                jo joVar18 = this.f302a;
                hVar162 = osVar16.be;
                hVar163 = osVar16.bg;
                hVar164 = osVar16.bf;
                jxVar23 = joVar18.c;
                hVar165 = jxVar23.Q;
                return new ah(ltVar, aVar12, ltVar2, ltVar3, hVar162, hVar163, hVar164, (k) hVar165.a());
            case 48:
                return new lt(this);
            case 49:
                return new lt(this);
            case 50:
                hVar166 = this.b.F;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p pVar5 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p) hVar166.a();
                os osVar17 = this.b;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.l l = osVar17.l();
                hVar167 = osVar17.J;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.x xVar2 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.x) hVar167.a();
                hVar168 = this.f302a.v;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) hVar168.a();
                hVar169 = this.b.M;
                return new cw(pVar5, l, xVar2, scheduledExecutorService2, (com.google.android.apps.search.assistant.surfaces.bisto.a.c.e) hVar169.a());
            case 51:
                jyVar14 = this.f302a.f319a;
                hVar170 = jyVar14.fK;
                cg cgVar = (cg) hVar170.a();
                jyVar15 = this.f302a.f319a;
                String pt = jyVar15.pt();
                hVar171 = this.f302a.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.c.e(cgVar, pt, (Executor) hVar171.a());
            case 52:
                jo joVar19 = this.f302a;
                hVar172 = joVar19.v;
                hVar173 = joVar19.bm;
                hVar174 = joVar19.ux;
                jxVar24 = joVar19.c;
                hVar175 = jxVar24.eO;
                jxVar25 = this.f302a.c;
                hVar176 = jxVar25.go;
                return new dc(hVar172, hVar173, hVar174, hVar175, hVar176, (byte[]) null);
            case 53:
                hVar177 = this.f302a.R;
                n nVar4 = (n) hVar177.a();
                hVar178 = this.f302a.qM;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.room.a aVar13 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.room.a) hVar178.a();
                os osVar18 = this.b;
                jo joVar20 = this.f302a;
                dz i2 = osVar18.i();
                hVar179 = joVar20.qO;
                ea eaVar = (ea) hVar179.a();
                hVar180 = this.f302a.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar180.a();
                hVar181 = this.f302a.W;
                return new de(nVar4, aVar13, i2, eaVar, fVar3, (com.google.android.libraries.search.t.i.y) hVar181.a());
            case 54:
                return new lt(this);
            case 55:
                return new lt(this);
            case 56:
                return new lt(this);
            case 57:
                hVar182 = this.f302a.f;
                Context context11 = (Context) hVar182.a();
                hVar183 = this.f302a.bo;
                ag agVar2 = (ag) hVar183.a();
                hVar184 = this.f302a.gd;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.d(context11, agVar2, (com.google.android.libraries.search.account.b.b) hVar184.a());
            case 58:
                hVar185 = this.b.S;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.j(hVar185);
            case 59:
                hVar186 = this.f302a.um;
                return new by((MediaSessionManager) hVar186.a());
            case 60:
                return new lt(this);
            case 61:
                hVar187 = this.f302a.f;
                Context context12 = (Context) hVar187.a();
                hVar188 = this.b.W;
                return new da(context12, (com.google.android.apps.search.assistant.surfaces.bisto.a.i.b) hVar188.a());
            case 62:
                hVar189 = this.f302a.ux;
                Context context13 = (Context) hVar189.a();
                hVar190 = this.f302a.nn;
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.i.b(context13, (KeyguardManager) hVar190.a());
            case 63:
                hVar191 = this.f302a.f;
                Context context14 = (Context) hVar191.a();
                hVar192 = this.f302a.B;
                return new co(context14, (ScheduledExecutorService) hVar192.a(), this.b.f());
            case 64:
                hVar193 = this.f302a.ux;
                Context context15 = (Context) hVar193.a();
                hVar194 = this.b.D;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.a(context15, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar194.a());
            case 65:
                hVar195 = this.b.be;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.a aVar14 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.a) hVar195.a();
                hVar196 = this.b.bf;
                return new bo(aVar14, (bv) hVar196.a());
            case 66:
                hVar197 = this.f302a.ux;
                Context context16 = (Context) hVar197.a();
                hVar198 = this.b.D;
                return new bv(context16, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar198.a());
            case 67:
                os osVar19 = this.b;
                jo joVar21 = this.f302a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p g = osVar19.g();
                hVar199 = joVar21.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds(g, (Executor) hVar199.a());
            case 68:
                return new lt(this);
            case 69:
                hVar200 = this.b.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar15 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar200.a();
                hVar201 = this.b.ac;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar16 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar201.a();
                os osVar20 = this.b;
                hVar202 = osVar20.bn;
                hVar203 = osVar20.aa;
                e.a b8 = e.c.c.b(hVar203);
                hVar204 = this.f302a.B;
                cr crVar5 = (cr) hVar204.a();
                hVar205 = this.b.ab;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds dsVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds) hVar205.a();
                jxVar26 = this.f302a.c;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.b.b T = jxVar26.T();
                jyVar16 = this.f302a.f319a;
                hVar206 = jyVar16.hA;
                com.google.android.apps.gsa.staticplugins.bisto.m.e eVar7 = (com.google.android.apps.gsa.staticplugins.bisto.m.e) hVar206.a();
                hVar207 = this.b.af;
                com.google.android.libraries.assistant.accessory.e.n nVar5 = (com.google.android.libraries.assistant.accessory.e.n) hVar207.a();
                hVar208 = this.b.bo;
                com.google.android.gms.common.api.q qVar5 = (com.google.android.gms.common.api.q) hVar208.a();
                hVar209 = this.b.bp;
                com.google.android.gms.wearable.n nVar6 = (com.google.android.gms.wearable.n) hVar209.a();
                hVar210 = this.b.ag;
                com.google.android.gms.common.api.q qVar6 = (com.google.android.gms.common.api.q) hVar210.a();
                hVar211 = this.b.bq;
                com.google.android.gms.wearable.n nVar7 = (com.google.android.gms.wearable.n) hVar211.a();
                hVar212 = this.b.ad;
                e.a b9 = e.c.c.b(hVar212);
                hVar213 = this.f302a.v;
                cr crVar6 = (cr) hVar213.a();
                os osVar21 = this.b;
                jo joVar22 = this.f302a;
                ?? s = osVar21.s();
                hVar214 = joVar22.ux;
                Context context17 = (Context) hVar214.a();
                jxVar27 = this.f302a.c;
                boolean fF = jxVar27.fF();
                jxVar28 = this.f302a.c;
                boolean fB = jxVar28.fB();
                jxVar29 = this.f302a.c;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.aa(aVar15, aVar16, hVar202, b8, crVar5, dsVar, T, eVar7, nVar5, qVar5, nVar6, qVar6, nVar7, b9, crVar6, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.d.a) s, context17, fF, fB, jxVar29.fG());
            case 70:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a();
            case 71:
                hVar215 = this.f302a.f;
                Context context18 = (Context) hVar215.a();
                hVar216 = this.f302a.v;
                cr crVar7 = (cr) hVar216.a();
                hVar217 = this.b.F;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p pVar6 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p) hVar217.a();
                hVar218 = this.f302a.qO;
                ea eaVar2 = (ea) hVar218.a();
                jxVar30 = this.f302a.c;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.b.b T2 = jxVar30.T();
                hVar219 = this.b.ad;
                e.a b10 = e.c.c.b(hVar219);
                jo joVar23 = this.f302a;
                os osVar22 = this.b;
                mq mqVar = new mq(joVar23, osVar22);
                hVar220 = osVar22.bk;
                hVar221 = osVar22.bl;
                hVar222 = joVar23.bM;
                com.google.android.libraries.search.account.k kVar2 = (com.google.android.libraries.search.account.k) hVar222.a();
                hVar223 = this.b.ae;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.l.b bVar5 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.l.b) hVar223.a();
                os osVar23 = this.b;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.k.f az = osVar23.az();
                hVar224 = osVar23.ac;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar17 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar224.a();
                hVar225 = this.b.M;
                com.google.android.apps.search.assistant.surfaces.bisto.a.c.e eVar8 = (com.google.android.apps.search.assistant.surfaces.bisto.a.c.e) hVar225.a();
                os osVar24 = this.b;
                Optional empty7 = Optional.empty();
                Optional empty8 = Optional.empty();
                hVar226 = osVar24.e;
                dj djVar = (dj) hVar226.a();
                jxVar31 = this.f302a.c;
                boolean fB2 = jxVar31.fB();
                jyVar17 = this.f302a.f319a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.q(context18, crVar7, pVar6, eaVar2, T2, b10, mqVar, hVar220, hVar221, kVar2, bVar5, az, aVar17, eVar8, empty7, empty8, djVar, fB2, jyVar17.qU());
            case 72:
                return com.google.android.apps.gsa.staticplugins.bisto.u.c.a.b(this.f302a.Vf());
            case 73:
                hVar227 = this.f302a.f;
                Context context19 = (Context) hVar227.a();
                hVar228 = this.f302a.v;
                cr crVar8 = (cr) hVar228.a();
                hVar229 = this.b.S;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.d dVar3 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.d) hVar229.a();
                hVar230 = this.f302a.g;
                a aVar18 = (a) hVar230.a();
                os osVar25 = this.b;
                jo joVar24 = this.f302a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.h.a j = osVar25.j();
                hVar231 = joVar24.qO;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.k.n(context19, crVar8, dVar3, aVar18, j, this.b.k());
            case 74:
                hVar232 = this.f302a.f;
                Context context20 = (Context) hVar232.a();
                hVar233 = this.f302a.v;
                cr crVar9 = (cr) hVar233.a();
                hVar234 = this.f302a.g;
                a aVar19 = (a) hVar234.a();
                hVar235 = this.f302a.qO;
                hVar236 = this.f302a.gd;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.k.q(context20, crVar9, aVar19, (com.google.android.libraries.search.account.b.b) hVar236.a());
            case 75:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.l.b();
            case 76:
                hVar237 = this.f302a.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.k.f(hVar237);
            case 77:
                hVar238 = this.f302a.ux;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.f((Context) hVar238.a());
            case 78:
                hVar239 = this.f302a.ux;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.c((Context) hVar239.a());
            case 79:
                hVar240 = this.f302a.ux;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.d((Context) hVar240.a());
            case 80:
                hVar241 = this.f302a.ux;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.b((Context) hVar241.a());
            case 81:
                hVar242 = this.f302a.ux;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.i((Context) hVar242.a());
            case 82:
                hVar243 = this.f302a.ux;
                Context context21 = (Context) hVar243.a();
                hVar244 = this.f302a.gd;
                com.google.android.libraries.search.account.b.b bVar6 = (com.google.android.libraries.search.account.b.b) hVar244.a();
                hVar245 = this.f302a.Q;
                ag agVar3 = (ag) hVar245.a();
                hVar246 = this.f302a.bM;
                com.google.android.libraries.search.account.k kVar3 = (com.google.android.libraries.search.account.k) hVar246.a();
                hVar247 = this.b.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar20 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar247.a();
                hVar248 = this.b.e;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.f(context21, bVar6, agVar3, kVar3, aVar20, (dj) hVar248.a());
            case 83:
                hVar249 = this.b.Z;
                ah ahVar3 = (ah) hVar249.a();
                hVar250 = this.b.F;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p pVar7 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p) hVar250.a();
                hVar251 = this.b.aj;
                e.a b11 = e.c.c.b(hVar251);
                jo joVar25 = this.f302a;
                os osVar26 = this.b;
                mm mmVar2 = new mm(joVar25, osVar26);
                hVar252 = osVar26.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar21 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar252.a();
                hVar253 = this.b.aa;
                e.a b12 = e.c.c.b(hVar253);
                hVar254 = this.b.ak;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.e eVar9 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.e) hVar254.a();
                hVar255 = this.f302a.jv;
                com.google.android.apps.gsa.search.shared.service.e.e eVar10 = (com.google.android.apps.gsa.search.shared.service.e.e) hVar255.a();
                hVar256 = this.b.W;
                com.google.android.apps.search.assistant.surfaces.bisto.a.i.b bVar7 = (com.google.android.apps.search.assistant.surfaces.bisto.a.i.b) hVar256.a();
                hVar257 = this.f302a.B;
                cq cqVar = (cq) hVar257.a();
                hVar258 = this.f302a.n;
                cq cqVar2 = (cq) hVar258.a();
                hVar259 = this.b.bi;
                lt ltVar4 = (lt) hVar259.a();
                os osVar27 = this.b;
                jo joVar26 = this.f302a;
                Object t2 = osVar27.t();
                Optional empty9 = Optional.empty();
                hVar260 = joVar26.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.d.b.h(ahVar3, pVar7, b11, mmVar2, aVar21, b12, eVar9, eVar10, bVar7, cqVar, cqVar2, ltVar4, (com.google.android.apps.search.assistant.surfaces.bisto.a.f.l) t2, empty9, (cq) hVar260.a());
            case 84:
                hVar261 = this.f302a.ux;
                return new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.e((Context) hVar261.a(), this.b.n());
            case 85:
                return new lw(this, 1);
            case 86:
                jyVar18 = this.f302a.f319a;
                hVar262 = jyVar18.hA;
                return new com.google.android.apps.gsa.staticplugins.bisto.m.a((com.google.android.apps.gsa.staticplugins.bisto.m.e) hVar262.a());
            case 87:
                hVar263 = this.f302a.f;
                Context context22 = (Context) hVar263.a();
                hVar264 = this.f302a.B;
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) hVar264.a();
                hVar265 = this.b.D;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.e(context22, scheduledExecutorService3, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar265.a());
            case 88:
                hVar266 = this.f302a.f;
                Context context23 = (Context) hVar266.a();
                hVar267 = this.f302a.abB;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.f fVar4 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.f) hVar267.a();
                os osVar28 = this.b;
                hVar268 = osVar28.bu;
                hVar269 = osVar28.aa;
                e.a b13 = e.c.c.b(hVar269);
                hVar270 = this.f302a.H;
                Executor executor4 = (Executor) hVar270.a();
                hVar271 = this.b.D;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar22 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar271.a();
                hVar272 = this.b.ac;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a aVar23 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar272.a();
                hVar273 = this.f302a.gd;
                com.google.android.libraries.search.account.b.b bVar8 = (com.google.android.libraries.search.account.b.b) hVar273.a();
                jxVar32 = this.f302a.c;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.e(context23, fVar4, hVar268, b13, executor4, aVar22, aVar23, bVar8, jxVar32.bb());
            case 89:
                os osVar29 = this.b;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.h.a j2 = osVar29.j();
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.e k2 = osVar29.k();
                hVar274 = osVar29.ac;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.g(j2, k2, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar274.a());
            case 90:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.h();
            case 91:
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.e(this.b.d());
            case 92:
                hVar275 = this.f302a.f;
                return com.google.android.apps.gsa.staticplugins.bisto.n.a.b((Context) hVar275.a());
            case 93:
                hVar276 = this.b.am;
                Context context24 = (Context) hVar276.a();
                hVar277 = this.f302a.g;
                a aVar24 = (a) hVar277.a();
                os osVar30 = this.b;
                com.google.android.apps.gsa.staticplugins.bisto.h.c c = osVar30.c();
                hVar278 = osVar30.ab;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds dsVar2 = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds) hVar278.a();
                hVar279 = this.f302a.H;
                Executor executor5 = (Executor) hVar279.a();
                hVar280 = this.b.H;
                return new com.google.android.apps.gsa.staticplugins.bisto.notifications.a.d(context24, aVar24, c, dsVar2, executor5, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q) hVar280.a());
            case 94:
                hVar281 = this.b.am;
                return new com.google.android.apps.gsa.staticplugins.bisto.util.w((Context) hVar281.a());
            case 95:
                os osVar31 = this.b;
                com.google.android.apps.gsa.staticplugins.bisto.b.b.p b14 = osVar31.b();
                hVar282 = osVar31.D;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.h(b14, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) hVar282.a());
            case 96:
                os osVar32 = this.b;
                jo joVar27 = this.f302a;
                hVar283 = osVar32.H;
                hVar284 = joVar27.g;
                hVar285 = osVar32.F;
                hVar286 = joVar27.v;
                return new z(hVar283, hVar284, hVar285, hVar286);
            case 97:
                hVar287 = this.f302a.v;
                cr crVar10 = (cr) hVar287.a();
                hVar288 = this.f302a.n;
                return new com.google.android.apps.gsa.staticplugins.bisto.k.g(crVar10, (Executor) hVar288.a());
            case 98:
                jxVar33 = this.f302a.c;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.q U = jxVar33.U();
                hVar289 = this.b.M;
                com.google.android.apps.search.assistant.surfaces.bisto.a.c.e eVar11 = (com.google.android.apps.search.assistant.surfaces.bisto.a.c.e) hVar289.a();
                hVar290 = this.f302a.v;
                return new m(U, eVar11, (Executor) hVar290.a());
            case 99:
                return new lt(this);
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.e aVar;
        int i = this.c;
        if (i / 100 == 0) {
            return b();
        }
        switch (i) {
            case 100:
                aVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.d.a((com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.f302a.ti.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.i.f) this.f302a.f319a.fF.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.p) this.f302a.px.a());
                break;
            case 101:
                aVar = new com.google.android.apps.search.assistant.surfaces.bisto.b.c((Context) this.f302a.f.a(), (com.google.android.libraries.storage.protostore.af) this.f302a.aA.a(), (Executor) this.f302a.H.a());
                break;
            case 102:
                aVar = new lt(this);
                break;
            case 103:
                aVar = new lt(this);
                break;
            case 104:
                aVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.a.k(new JniSbcDecoderImpl(new com.google.android.apps.search.assistant.surfaces.bisto.interactor.sbcdecoder.a((Context) this.b.b.ux.a())), (Executor) this.f302a.n.a());
                break;
            case 105:
                aVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.k.l((Context) this.f302a.ux.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) this.b.D.a());
                break;
            case 106:
                aVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.m.a.a();
                break;
            case 107:
                aVar = com.google.common.android.a.c.a;
                aVar.getClass();
                break;
            case 108:
                aVar = new com.google.android.gms.common.api.q((Context) this.f302a.ux.a(), null, com.google.android.gms.wearable.q.a, com.google.android.gms.wearable.p.a, com.google.android.gms.common.api.p.f2601a);
                break;
            case 109:
                os osVar = this.b;
                aVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.e((Context) osVar.b.f.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) osVar.D.a());
                if (aVar.c.compareAndSet(false, true)) {
                    NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
                    com.google.common.f.h d = com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.e.a.d();
                    d.aj(com.google.common.f.a.e.a, "TetheredPhoneNetworkMonitor");
                    com.google.common.f.h hVar = d;
                    hVar.ak(26571);
                    hVar.p("Network callback registered.");
                    aVar.d.registerNetworkCallback(build, aVar.g);
                }
                ConnectivityManager connectivityManager = aVar.d;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    boolean a2 = com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.e.a(networkCapabilities);
                    com.google.common.f.h d2 = com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.e.a.d();
                    d2.aj(com.google.common.f.a.e.a, "TetheredPhoneNetworkMonitor");
                    com.google.common.f.h hVar2 = d2;
                    hVar2.ak(26572);
                    hVar2.s("Set isNetworkConnected to %b", Boolean.valueOf(a2));
                    synchronized (aVar.f) {
                        aVar.e.set(a2);
                        Collection._EL.forEach(aVar.b, new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.a(aVar));
                    }
                    break;
                } else {
                    com.google.common.f.h d3 = com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.e.e.a.d();
                    d3.aj(com.google.common.f.a.e.a, "TetheredPhoneNetworkMonitor");
                    com.google.common.f.h hVar3 = d3;
                    hVar3.ak(26573);
                    hVar3.p("NetworkCapabilities is null");
                    break;
                }
            case 110:
                aVar = new t((Context) this.f302a.ux.a(), (com.google.android.apps.gsa.staticplugins.bisto.u.b.k) this.b.aI.a(), (com.google.android.apps.gsa.shared.f.e) this.f302a.py.a(), (com.google.android.apps.gsa.staticplugins.bisto.u.b.x) this.b.aL.a(), (cr) this.f302a.B.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) this.b.ac.a(), ((com.google.apps.tiktok.experiments.e) new h.a.a.a.a.a.b.a.a.c(this.f302a.c.f325a.V).a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_tng_interactor.device 45628865").f());
                break;
            case 111:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f302a.B.a();
                a aVar2 = (a) this.f302a.g.a();
                u uVar = (u) this.b.aG.a();
                com.google.android.apps.gsa.staticplugins.bisto.m.a aVar3 = (com.google.android.apps.gsa.staticplugins.bisto.m.a) this.b.ai.a();
                z zVar = (z) this.b.ap.a();
                e.a b = e.c.c.b(this.b.aH);
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.l.b bVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.l.b) this.b.ae.a();
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.f302a.ti.a();
                os osVar2 = this.b;
                aVar = new com.google.android.apps.gsa.staticplugins.bisto.u.b.k(scheduledExecutorService, aVar2, uVar, aVar3, zVar, b, bVar, cVar, osVar2.k(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.h.a) osVar2.D.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.c.e) this.b.M.a(), (Executor) this.f302a.v.a());
                ((com.google.android.apps.gsa.staticplugins.bisto.u.b.k) aVar).c.execute(new com.google.android.apps.gsa.staticplugins.bisto.u.b.b(aVar, 1));
                break;
            case 112:
                aVar = new u((Context) this.f302a.f.a(), (com.google.android.apps.gsa.search.shared.service.t) this.b.aF.a(), (a) this.f302a.g.a());
                break;
            case 113:
                com.google.android.apps.gsa.search.shared.service.x xVar = (com.google.android.apps.gsa.search.shared.service.x) this.f302a.hI.a();
                com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
                dVar.f1344a = 162727720920608L;
                dVar.c = com.google.common.o.or.q;
                dVar.d = "bisto";
                aVar = xVar.a(null, null, new ClientConfig(dVar));
                break;
            case 114:
                os osVar3 = this.b;
                jo joVar = osVar3.b;
                h hVar4 = joVar.f;
                h hVar5 = joVar.v;
                h hVar6 = osVar3.ab;
                h hVar7 = osVar3.H;
                hVar4.getClass();
                hVar5.getClass();
                hVar6.getClass();
                hVar7.getClass();
                Context context = (Context) hVar4.a();
                context.getClass();
                ((Executor) hVar5.a()).getClass();
                ((com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds) hVar6.a()).getClass();
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q qVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q) hVar7.a();
                qVar.getClass();
                aVar = new com.google.android.apps.gsa.staticplugins.bisto.util.y(context, qVar);
                break;
            case 115:
                aVar = new com.google.android.apps.gsa.staticplugins.bisto.u.b.x((Executor) this.f302a.B.a(), (com.google.android.apps.gsa.staticplugins.bisto.u.b.v) this.b.aK.a(), (z) this.b.ap.a());
                break;
            case 116:
                aVar = new com.google.android.apps.gsa.staticplugins.bisto.u.b.v((com.google.android.apps.gsa.search.shared.service.t) this.b.aJ.a());
                break;
            case 117:
                com.google.android.apps.gsa.search.shared.service.x xVar2 = (com.google.android.apps.gsa.search.shared.service.x) this.f302a.hI.a();
                com.google.android.apps.gsa.search.shared.service.d dVar2 = new com.google.android.apps.gsa.search.shared.service.d();
                dVar2.f1344a = 4398046511104L;
                dVar2.c = com.google.common.o.or.q;
                dVar2.d = "transcription";
                aVar = xVar2.a(null, null, new ClientConfig(dVar2));
                break;
            case 118:
                aVar = new com.google.android.apps.gsa.staticplugins.bisto.u.a.c((a) this.f302a.g.a(), (t) this.b.aM.a(), this.b.ar);
                break;
            default:
                throw new AssertionError(i);
        }
        return aVar;
    }
}
