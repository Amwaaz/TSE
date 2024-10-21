package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import androidx.compose.ui.platform.ca;
import com.google.android.apps.search.assistant.surfaces.settings.features.quickphrases.bc;
import com.google.android.apps.search.assistant.surfaces.settings.features.voicematch.bl;
import com.google.android.apps.search.assistant.surfaces.settings.features.voicematch.br;
import com.google.android.apps.search.assistant.surfaces.settings.features.voicematch.cv;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.bf;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.r;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ac;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bd;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bg;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bq;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.ce;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.cg;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.t;
import com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.z;
import com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d.s;
import com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.g;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.an;
import com.google.android.apps.search.assistant.surfaces.voice.l.c.a.ah;
import com.google.android.apps.search.assistant.surfaces.voice.p.n.af;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am;
import com.google.android.apps.search.assistant.surfaces.voice.robin.car.p;
import com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w;
import com.google.android.apps.search.assistant.surfaces.voice.robin.query.h.a.m;
import com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.ai;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.extensions.cd;
import com.google.android.apps.search.assistant.surfaces.voice.shared.c.k;
import com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.cs;
import com.google.android.apps.search.assistant.surfaces.voice.ui.host.n;
import com.google.android.apps.search.assistant.surfaces.voice.ui.response.bj;
import com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ab;
import com.google.android.apps.search.assistant.verticals.a.b.a.l;
import com.google.android.apps.search.googleapp.discover.expeditions.a.a.d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.u;
import com.google.android.libraries.assistant.auto.jumpboost.n.y;
import com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c;
import com.google.android.libraries.assistant.q.q;
import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.android.libraries.search.assistant.invocation.k.b.a.a;
import com.google.android.libraries.search.assistant.n.a.b.bw;
import com.google.android.libraries.search.assistant.performer.communication.bs;
import com.google.android.libraries.search.assistant.performer.communication.c.ad;
import com.google.android.libraries.search.assistant.performer.deviceactions.a.a.o;
import com.google.android.libraries.search.assistant.performer.deviceactions.a.a.v;
import com.google.android.libraries.search.assistant.performer.deviceactions.ar;
import com.google.android.libraries.search.l.ae;
import com.google.android.libraries.search.l.e.e;
import com.google.android.libraries.storage.a.j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.d.b.a.b;
import com.google.apps.tiktok.account.d.b.f;
import com.google.apps.tiktok.concurrent.ao;
import com.google.apps.tiktok.g.ax;
import com.google.apps.tiktok.g.ay;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nn;
import com.google.common.base.at;
import com.google.common.base.ci;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import com.google.protos.e.v.x;
import e.c.h;
import io.grpc.i;
import j$.util.Optional;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.ag;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/iy.class */
public final class iy implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f310a;
    public final ik b;
    private final int c;

    public iy(jo joVar, ik ikVar, int i) {
        this.f310a = joVar;
        this.b = ikVar;
        this.c = i;
    }

    private final Object b() {
        h hVar;
        h hVar2;
        h hVar3;
        iz izVar;
        h hVar4;
        iz izVar2;
        iz izVar3;
        iz izVar4;
        h hVar5;
        iz izVar5;
        iz izVar6;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        jr jrVar;
        h hVar10;
        iz izVar7;
        iz izVar8;
        iz izVar9;
        iz izVar10;
        iz izVar11;
        iz izVar12;
        iz izVar13;
        iz izVar14;
        h hVar11;
        h hVar12;
        h hVar13;
        jr jrVar2;
        h hVar14;
        jr jrVar3;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        iz izVar15;
        h hVar19;
        iz izVar16;
        iz izVar17;
        iz izVar18;
        h hVar20;
        h hVar21;
        h hVar22;
        iz izVar19;
        h hVar23;
        h hVar24;
        jy jyVar;
        h hVar25;
        jy jyVar2;
        h hVar26;
        jy jyVar3;
        h hVar27;
        jy jyVar4;
        h hVar28;
        jy jyVar5;
        h hVar29;
        jj jjVar;
        h hVar30;
        jj jjVar2;
        h hVar31;
        jj jjVar3;
        h hVar32;
        h hVar33;
        iz izVar20;
        h hVar34;
        iz izVar21;
        iz izVar22;
        h hVar35;
        h hVar36;
        iz izVar23;
        h hVar37;
        h hVar38;
        h hVar39;
        iz izVar24;
        h hVar40;
        iz izVar25;
        h hVar41;
        iz izVar26;
        h hVar42;
        iz izVar27;
        h hVar43;
        iz izVar28;
        h hVar44;
        iz izVar29;
        h hVar45;
        iz izVar30;
        h hVar46;
        jr jrVar4;
        h hVar47;
        iz izVar31;
        h hVar48;
        h hVar49;
        h hVar50;
        iz izVar32;
        h hVar51;
        h hVar52;
        h hVar53;
        h hVar54;
        iz izVar33;
        h hVar55;
        iz izVar34;
        h hVar56;
        h hVar57;
        jr jrVar5;
        h hVar58;
        iz izVar35;
        iz izVar36;
        iz izVar37;
        h hVar59;
        iz izVar38;
        h hVar60;
        h hVar61;
        jj jjVar4;
        iz izVar39;
        iz izVar40;
        iz izVar41;
        iz izVar42;
        iz izVar43;
        iz izVar44;
        iz izVar45;
        iz izVar46;
        iz izVar47;
        iz izVar48;
        iz izVar49;
        iz izVar50;
        iz izVar51;
        iz izVar52;
        jr jrVar6;
        h hVar62;
        iz izVar53;
        jj jjVar5;
        iz izVar54;
        h hVar63;
        iz izVar55;
        h hVar64;
        iz izVar56;
        h hVar65;
        iz izVar57;
        h hVar66;
        iz izVar58;
        h hVar67;
        iz izVar59;
        h hVar68;
        iz izVar60;
        h hVar69;
        iz izVar61;
        h hVar70;
        iz izVar62;
        jr jrVar7;
        h hVar71;
        h hVar72;
        jr jrVar8;
        h hVar73;
        iz izVar63;
        iz izVar64;
        iz izVar65;
        iz izVar66;
        h hVar74;
        jr jrVar9;
        h hVar75;
        iz izVar67;
        h hVar76;
        iz izVar68;
        iz izVar69;
        h hVar77;
        h hVar78;
        iz izVar70;
        iz izVar71;
        h hVar79;
        iz izVar72;
        h hVar80;
        iz izVar73;
        jj jjVar6;
        jr jrVar10;
        h hVar81;
        iz izVar74;
        h hVar82;
        iz izVar75;
        h hVar83;
        iz izVar76;
        h hVar84;
        h hVar85;
        iz izVar77;
        iz izVar78;
        iz izVar79;
        h hVar86;
        jj jjVar7;
        iz izVar80;
        iz izVar81;
        h hVar87;
        iz izVar82;
        h hVar88;
        iz izVar83;
        iz izVar84;
        h hVar89;
        iz izVar85;
        h hVar90;
        iz izVar86;
        h hVar91;
        iz izVar87;
        h hVar92;
        iz izVar88;
        h hVar93;
        iz izVar89;
        jj jjVar8;
        h hVar94;
        iz izVar90;
        h hVar95;
        h hVar96;
        h hVar97;
        h hVar98;
        h hVar99;
        iz izVar91;
        h hVar100;
        iz izVar92;
        h hVar101;
        h hVar102;
        iz izVar93;
        jr jrVar11;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        jj jjVar9;
        jj jjVar10;
        iz izVar94;
        jy jyVar6;
        h hVar107;
        h hVar108;
        jj jjVar11;
        jr jrVar12;
        h hVar109;
        h hVar110;
        h hVar111;
        iz izVar95;
        h hVar112;
        iz izVar96;
        h hVar113;
        iz izVar97;
        h hVar114;
        iz izVar98;
        h hVar115;
        iz izVar99;
        h hVar116;
        iz izVar100;
        h hVar117;
        iz izVar101;
        h hVar118;
        h hVar119;
        jr jrVar13;
        h hVar120;
        h hVar121;
        h hVar122;
        iz izVar102;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        jj jjVar12;
        h hVar128;
        iz izVar103;
        h hVar129;
        h hVar130;
        iz izVar104;
        iz izVar105;
        iz izVar106;
        iz izVar107;
        h hVar131;
        h hVar132;
        h hVar133;
        h hVar134;
        iz izVar108;
        jj jjVar13;
        iz izVar109;
        iz izVar110;
        h hVar135;
        h hVar136;
        h hVar137;
        h hVar138;
        h hVar139;
        h hVar140;
        jr jrVar14;
        h hVar141;
        h hVar142;
        iz izVar111;
        iz izVar112;
        iz izVar113;
        h hVar143;
        h hVar144;
        h hVar145;
        jy jyVar7;
        h hVar146;
        iz izVar114;
        h hVar147;
        iz izVar115;
        h hVar148;
        h hVar149;
        h hVar150;
        iz izVar116;
        iz izVar117;
        h hVar151;
        h hVar152;
        iz izVar118;
        h hVar153;
        iz izVar119;
        h hVar154;
        iz izVar120;
        h hVar155;
        iz izVar121;
        h hVar156;
        iz izVar122;
        h hVar157;
        iz izVar123;
        h hVar158;
        iz izVar124;
        h hVar159;
        iz izVar125;
        h hVar160;
        h hVar161;
        h hVar162;
        iz izVar126;
        h hVar163;
        iz izVar127;
        h hVar164;
        iz izVar128;
        h hVar165;
        h hVar166;
        iz izVar129;
        h hVar167;
        h hVar168;
        iz izVar130;
        h hVar169;
        iz izVar131;
        h hVar170;
        iz izVar132;
        h hVar171;
        iz izVar133;
        h hVar172;
        iz izVar134;
        h hVar173;
        h hVar174;
        h hVar175;
        iz izVar135;
        h hVar176;
        iz izVar136;
        iz izVar137;
        h hVar177;
        h hVar178;
        int i = this.c;
        switch (i) {
            case 0:
                ik ikVar = this.b;
                jo joVar = this.f310a;
                com.google.apps.tiktok.q.b.h e = ae.e();
                b kg = ikVar.kg();
                hVar = joVar.w;
                return ae.g(e, kg, (j) hVar.a());
            case 1:
                ik ikVar2 = this.b;
                jo joVar2 = this.f310a;
                com.google.apps.tiktok.q.b.h d = ae.d();
                b kg2 = ikVar2.kg();
                hVar2 = joVar2.w;
                return ae.f(d, kg2, (j) hVar2.a());
            case 2:
                return new e();
            case 3:
                return new com.google.android.libraries.search.p.e();
            case 4:
                ik ikVar3 = this.b;
                jo joVar3 = this.f310a;
                com.google.apps.tiktok.q.b.h c = d.c();
                f kf = ikVar3.kf();
                hVar3 = joVar3.w;
                return d.b(c, kf, (j) hVar3.a());
            case 5:
                izVar = this.b.b;
                hVar4 = izVar.dp;
                return new com.google.android.libraries.search.ah.k.d((i) hVar4.a());
            case 6:
                izVar2 = this.b.b;
                return ha.o(izVar2.gK());
            case 7:
                izVar3 = this.b.b;
                return ha.o(izVar3.gJ());
            case 8:
                izVar4 = this.b.b;
                hVar5 = izVar4.h;
                com.google.android.libraries.search.assistant.invocation.assistdata.a.d dVar = (com.google.android.libraries.search.assistant.invocation.assistdata.a.d) hVar5.a();
                izVar5 = this.b.b;
                a nz = izVar5.nz();
                izVar6 = this.b.b;
                hVar6 = izVar6.ds;
                x xVar = (x) hVar6.a();
                hVar7 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar2 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar7.a();
                hVar8 = this.f310a.Q;
                ag agVar = (ag) hVar8.a();
                hVar9 = this.b.ba;
                return new l(dVar, nz, xVar, dVar2, agVar, (com.google.android.libraries.search.b.b) hVar9.a());
            case 9:
                jrVar = this.f310a.b;
                com.google.android.libraries.search.assistant.invocation.s.c.b hL = jrVar.hL();
                hVar10 = this.f310a.Q;
                return new com.google.android.libraries.search.assistant.invocation.assistdata.a.d(hL, (ag) hVar10.a());
            case 10:
                return com.google.android.apps.search.assistant.verticals.a.b.b.a.b(this.b.qg());
            case 11:
                izVar7 = this.b.b;
                return g.h(izVar7.bO());
            case 12:
                izVar8 = this.b.b;
                return g.b(izVar8.bO());
            case 13:
                izVar9 = this.b.b;
                return g.i(izVar9.nJ());
            case 14:
                izVar10 = this.b.b;
                return g.c(izVar10.bO());
            case 15:
                izVar11 = this.b.b;
                return g.d(izVar11.bO());
            case 16:
                izVar12 = this.b.b;
                return g.f(izVar12.bO());
            case 17:
                izVar13 = this.b.b;
                return g.e(izVar13.bO());
            case 18:
                izVar14 = this.b.b;
                return g.g(izVar14.bO());
            case 19:
            case 92:
                hVar11 = this.f310a.iu;
                ay ayVar = (ay) hVar11.a();
                hVar12 = this.f310a.Q;
                ag agVar2 = (ag) hVar12.a();
                hVar13 = this.f310a.H;
                return new k(ayVar, agVar2, (cr) hVar13.a());
            case 20:
                jo joVar4 = this.f310a;
                c cVar = c.d;
                jrVar2 = joVar4.b;
                hVar14 = jrVar2.dB;
                jo joVar5 = this.f310a;
                c cVar2 = c.c;
                jrVar3 = joVar5.b;
                hVar15 = jrVar3.dD;
                return fu.n(cVar, hVar14, cVar2, hVar15);
            case 21:
                hVar16 = this.f310a.f;
                Context context = (Context) hVar16.a();
                ik ikVar4 = this.b;
                jo joVar6 = this.f310a;
                com.google.android.libraries.search.assistant.notification.a.a.k m112if = ikVar4.m112if();
                hVar17 = joVar6.H;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.a.l(context, m112if, (Executor) hVar17.a());
            case 22:
                hVar18 = this.f310a.f;
                Context context2 = (Context) hVar18.a();
                izVar15 = this.b.b;
                hVar19 = izVar15.du;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.k kVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.k) hVar19.a();
                izVar16 = this.b.b;
                u nN = izVar16.nN();
                izVar17 = this.b.b;
                Map gr = izVar17.gr();
                ik ikVar5 = this.b;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d fq = ikVar5.fq();
                izVar18 = ikVar5.b;
                hVar20 = izVar18.dy;
                com.google.android.libraries.assistant.auto.jumpboost.d.b.a aVar = (com.google.android.libraries.assistant.auto.jumpboost.d.b.a) hVar20.a();
                hVar21 = this.f310a.Q;
                ag agVar3 = (ag) hVar21.a();
                hVar22 = this.f310a.dp;
                aa aaVar = (aa) hVar22.a();
                izVar19 = this.b.b;
                hVar23 = izVar19.dA;
                return new y(context2, kVar, nN, gr, fq, aVar, agVar3, aaVar, hVar23);
            case 23:
                hVar24 = this.f310a.f;
                Context context3 = (Context) hVar24.a();
                jyVar = this.f310a.f319a;
                hVar25 = jyVar.bM;
                e.a b = e.c.c.b(hVar25);
                jyVar2 = this.f310a.f319a;
                hVar26 = jyVar2.sg;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.d dVar3 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.d) hVar26.a();
                jyVar3 = this.f310a.f319a;
                Optional pa = jyVar3.pa();
                hVar27 = this.f310a.Q;
                ag agVar4 = (ag) hVar27.a();
                jyVar4 = this.f310a.f319a;
                hVar28 = jyVar4.bV;
                jyVar5 = this.f310a.f319a;
                hVar29 = jyVar5.bW;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.k(context3, b, dVar3, pa, agVar4, hVar28, hVar29);
            case 24:
                return new iu(this);
            case 25:
                jjVar = this.b.f308a;
                hVar30 = jjVar.ah;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d dVar4 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d) hVar30.a();
                jjVar2 = this.b.f308a;
                hVar31 = jjVar2.Q;
                com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d dVar5 = (com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d) hVar31.a();
                jjVar3 = this.b.f308a;
                hVar32 = jjVar3.I;
                com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k kVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k) hVar32.a();
                hVar33 = this.b.bH;
                ai aiVar = (ai) hVar33.a();
                izVar20 = this.b.b;
                m ck = izVar20.ck();
                hVar34 = this.f310a.Q;
                ag agVar5 = (ag) hVar34.a();
                izVar21 = this.b.b;
                boolean jO = izVar21.jO();
                izVar22 = this.b.b;
                hVar35 = izVar22.dy;
                com.google.android.libraries.assistant.auto.jumpboost.d.b.a aVar2 = (com.google.android.libraries.assistant.auto.jumpboost.d.b.a) hVar35.a();
                hVar36 = this.f310a.ko;
                return new p(dVar4, dVar5, kVar2, aiVar, ck, agVar5, jO, aVar2, (com.google.android.libraries.search.d.q.f.a.b) hVar36.a());
            case 26:
                return new ix(this, 0);
            case 27:
                return new lt(this);
            case 28:
                izVar23 = this.b.b;
                hVar37 = izVar23.dx;
                com.google.android.libraries.assistant.auto.jumpboost.d.c.a.b bVar = (com.google.android.libraries.assistant.auto.jumpboost.d.c.a.b) hVar37.a();
                jo joVar7 = this.f310a;
                Optional empty = Optional.empty();
                hVar38 = joVar7.Q;
                return new com.google.android.libraries.assistant.auto.jumpboost.d.b.a.a(bVar, empty, (ag) hVar38.a());
            case 29:
                hVar39 = this.f310a.eA;
                return com.google.android.libraries.assistant.auto.jumpboost.d.c.a.i.b((i) hVar39.a());
            case 30:
                return Boolean.valueOf(h.a.a.b.b.a.c.g(this.b.yy()));
            case 31:
                izVar24 = this.b.b;
                hVar40 = izVar24.fA;
                e.a b2 = e.c.c.b(hVar40);
                izVar25 = this.b.b;
                hVar41 = izVar25.fB;
                e.a b3 = e.c.c.b(hVar41);
                izVar26 = this.b.b;
                hVar42 = izVar26.gb;
                e.a b4 = e.c.c.b(hVar42);
                izVar27 = this.b.b;
                hVar43 = izVar27.B;
                e.a b5 = e.c.c.b(hVar43);
                izVar28 = this.b.b;
                hVar44 = izVar28.y;
                e.a b6 = e.c.c.b(hVar44);
                izVar29 = this.b.b;
                hVar45 = izVar29.gc;
                e.a b7 = e.c.c.b(hVar45);
                izVar30 = this.b.b;
                hVar46 = izVar30.bd;
                e.a b8 = e.c.c.b(hVar46);
                jrVar4 = this.f310a.b;
                hVar47 = jrVar4.aG;
                e.a b9 = e.c.c.b(hVar47);
                izVar31 = this.b.b;
                boolean kI = izVar31.kI();
                hVar48 = this.b.cQ;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l lVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l) hVar48.a();
                hVar49 = this.f310a.Q;
                ag agVar6 = (ag) hVar49.a();
                hVar50 = this.f310a.bo;
                ag agVar7 = (ag) hVar50.a();
                izVar32 = this.b.b;
                hVar51 = izVar32.x;
                e.a b10 = e.c.c.b(hVar51);
                hVar52 = this.f310a.f;
                Context context4 = (Context) hVar52.a();
                hVar53 = this.b.ba;
                e.a b11 = e.c.c.b(hVar53);
                hVar54 = this.b.aV;
                e.a b12 = e.c.c.b(hVar54);
                izVar33 = this.b.b;
                hVar55 = izVar33.ge;
                bg bgVar = (bg) hVar55.a();
                izVar34 = this.b.b;
                hVar56 = izVar34.aI;
                e.a b13 = e.c.c.b(hVar56);
                hVar57 = this.f310a.rq;
                com.google.android.libraries.search.assistant.u.i iVar = (com.google.android.libraries.search.assistant.u.i) hVar57.a();
                jrVar5 = this.f310a.b;
                hVar58 = jrVar5.nL;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.k kVar3 = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.k) hVar58.a();
                izVar35 = this.b.b;
                boolean hQ = izVar35.hQ();
                izVar36 = this.b.b;
                boolean hR = izVar36.hR();
                izVar37 = this.b.b;
                boolean hT = izVar37.hT();
                hVar59 = this.b.cF;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar59.a();
                izVar38 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.k.f bT = izVar38.bT();
                hVar60 = this.f310a.W;
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) hVar60.a();
                hVar61 = this.f310a.Y;
                String str = (String) hVar61.a();
                jjVar4 = this.b.f308a;
                boolean pZ = jjVar4.pZ();
                izVar39 = this.b.b;
                boolean gQ = izVar39.gQ();
                izVar40 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.shared.b.e cu = izVar40.cu();
                izVar41 = this.b.b;
                boolean hU = izVar41.hU();
                izVar42 = this.b.b;
                boolean hV = izVar42.hV();
                izVar43 = this.b.b;
                boolean hW = izVar43.hW();
                izVar44 = this.b.b;
                boolean hX = izVar44.hX();
                izVar45 = this.b.b;
                izVar45.nE();
                izVar46 = this.b.b;
                izVar46.nF();
                izVar47 = this.b.b;
                izVar47.nG();
                izVar48 = this.b.b;
                izVar48.nD();
                izVar49 = this.b.b;
                boolean hY = izVar49.hY();
                izVar50 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.a.l bK = izVar50.bK();
                izVar51 = this.b.b;
                boolean hZ = izVar51.hZ();
                izVar52 = this.b.b;
                boolean ia = izVar52.ia();
                jrVar6 = this.f310a.b;
                hVar62 = jrVar6.fH;
                izVar53 = this.b.b;
                boolean ib = izVar53.ib();
                jjVar5 = this.b.f308a;
                boolean ns = jjVar5.ns();
                izVar54 = this.b.b;
                return new bd(b2, b3, b4, b5, b6, b7, b8, b9, kI, lVar, agVar6, agVar7, b10, context4, b11, b12, bgVar, b13, iVar, kVar3, hQ, hR, hT, aeVar, bT, yVar, str, pZ, gQ, cu, hU, hV, hW, hX, hY, bK, hZ, ia, hVar62, ib, ns, izVar54.ic());
            case 32:
                hVar63 = this.f310a.Q;
                ag agVar8 = (ag) hVar63.a();
                izVar55 = this.b.b;
                hVar64 = izVar55.x;
                e.a b14 = e.c.c.b(hVar64);
                izVar56 = this.b.b;
                hVar65 = izVar56.fx;
                e.a b15 = e.c.c.b(hVar65);
                izVar57 = this.b.b;
                hVar66 = izVar57.fy;
                lt ltVar = (lt) hVar66.a();
                izVar58 = this.b.b;
                hVar67 = izVar58.fz;
                lt ltVar2 = (lt) hVar67.a();
                izVar59 = this.b.b;
                hVar68 = izVar59.al;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.bg bgVar2 = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.bg) hVar68.a();
                izVar60 = this.b.b;
                hVar69 = izVar60.v;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.x(agVar8, b14, b15, ltVar, ltVar2, bgVar2, (cg) hVar69.a());
            case 33:
                izVar61 = this.b.b;
                hVar70 = izVar61.w;
                z zVar = (z) hVar70.a();
                izVar62 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.d.j bH = izVar62.bH();
                jrVar7 = this.f310a.b;
                hVar71 = jrVar7.go;
                com.google.android.libraries.web.contrib.l.b bVar2 = (com.google.android.libraries.web.contrib.l.b) hVar71.a();
                hVar72 = this.b.ba;
                com.google.android.libraries.search.b.b bVar3 = (com.google.android.libraries.search.b.b) hVar72.a();
                jrVar8 = this.f310a.b;
                hVar73 = jrVar8.gp;
                Executor executor = (Executor) hVar73.a();
                izVar63 = this.b.b;
                boolean mb = izVar63.mb();
                izVar64 = this.b.b;
                boolean my = izVar64.my();
                izVar65 = this.b.b;
                return new bq(zVar, bH, bVar2, bVar3, executor, mb, my, izVar65.mO());
            case 34:
                izVar66 = this.b.b;
                hVar74 = izVar66.dB;
                com.google.android.apps.search.assistant.surfaces.voice.i.d.a.j jVar = (com.google.android.apps.search.assistant.surfaces.voice.i.d.a.j) hVar74.a();
                jrVar9 = this.f310a.b;
                hVar75 = jrVar9.aG;
                com.google.android.libraries.search.assistant.aw.n.b.j jVar2 = (com.google.android.libraries.search.assistant.aw.n.b.j) hVar75.a();
                izVar67 = this.b.b;
                hVar76 = izVar67.v;
                cg cgVar = (cg) hVar76.a();
                izVar68 = this.b.b;
                boolean kI2 = izVar68.kI();
                izVar69 = this.b.b;
                boolean ly = izVar69.ly();
                hVar77 = this.f310a.Q;
                return new z(jVar, jVar2, cgVar, kI2, ly, (ag) hVar77.a());
            case 35:
                return com.google.android.apps.search.assistant.surfaces.voice.i.d.c.a.b(this.b.qg());
            case 36:
                hVar78 = this.f310a.Q;
                return new cg((ag) hVar78.a());
            case 37:
                izVar70 = this.b.b;
                boolean gM = izVar70.gM();
                izVar71 = this.b.b;
                hVar79 = izVar71.fs;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ae aeVar2 = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ae) hVar79.a();
                izVar72 = this.b.b;
                hVar80 = izVar72.fw;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.c.a.b(gM, aeVar2, (bf) hVar80.a());
            case 38:
                izVar73 = this.b.b;
                r bG = izVar73.bG();
                jjVar6 = this.b.f308a;
                com.google.android.libraries.search.assistant.p.a.c.j et = jjVar6.et();
                jrVar10 = this.f310a.b;
                hVar81 = jrVar10.gp;
                Executor executor2 = (Executor) hVar81.a();
                izVar74 = this.b.b;
                hVar82 = izVar74.eH;
                lt ltVar3 = (lt) hVar82.a();
                izVar75 = this.b.b;
                hVar83 = izVar75.fq;
                lt ltVar4 = (lt) hVar83.a();
                izVar76 = this.b.b;
                hVar84 = izVar76.fr;
                e.a b16 = e.c.c.b(hVar84);
                hVar85 = this.b.cF;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ae(bG, et, executor2, ltVar3, ltVar4, b16, (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar85.a());
            case 39:
                izVar77 = this.b.b;
                Map gv = izVar77.gv();
                izVar78 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.f aM = izVar78.aM();
                izVar79 = this.b.b;
                hVar86 = izVar79.eF;
                com.google.android.apps.search.assistant.libraries.dictation.f.a aVar3 = (com.google.android.apps.search.assistant.libraries.dictation.f.a) hVar86.a();
                jjVar7 = this.b.f308a;
                com.google.android.apps.search.assistant.libraries.dictation.a.k A = jjVar7.A();
                izVar80 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.b(gv, aM, aVar3, A, izVar80.kA());
            case 40:
                return new lt(this);
            case 41:
                return com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d.b.b(this.b.qh());
            case 42:
                izVar81 = this.b.b;
                hVar87 = izVar81.z;
                lt ltVar5 = (lt) hVar87.a();
                izVar82 = this.b.b;
                hVar88 = izVar82.dC;
                lt ltVar6 = (lt) hVar88.a();
                izVar83 = this.b.b;
                a nz2 = izVar83.nz();
                izVar84 = this.b.b;
                hVar89 = izVar84.i;
                com.google.android.apps.search.assistant.verticals.a.b.c cVar3 = (com.google.android.apps.search.assistant.verticals.a.b.c) hVar89.a();
                izVar85 = this.b.b;
                hVar90 = izVar85.A;
                lt ltVar7 = (lt) hVar90.a();
                izVar86 = this.b.b;
                hVar91 = izVar86.E;
                com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.b bVar4 = (com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.b) hVar91.a();
                izVar87 = this.b.b;
                boolean hH = izVar87.hH();
                hVar92 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.a.i(ltVar5, ltVar6, nz2, cVar3, ltVar7, bVar4, hH, (ag) hVar92.a());
            case 43:
                return new lt(this);
            case 44:
                return new lt(this);
            case 45:
                izVar88 = this.b.b;
                hVar93 = izVar88.dE;
                return com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.c.a.c((com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.a.b) hVar93.a());
            case 46:
                return new bs(this, 2);
            case 47:
                izVar89 = this.b.b;
                ac bI = izVar89.bI();
                jjVar8 = this.b.f308a;
                hVar94 = jjVar8.fp;
                com.google.android.apps.search.assistant.surfaces.voice.h.a.i iVar2 = (com.google.android.apps.search.assistant.surfaces.voice.h.a.i) hVar94.a();
                izVar90 = this.b.b;
                hVar95 = izVar90.dD;
                com.google.android.apps.search.assistant.surfaces.voice.h.d.c cVar4 = (com.google.android.apps.search.assistant.surfaces.voice.h.d.c) hVar95.a();
                hVar96 = this.f310a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar96.a();
                hVar97 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.a.b(bI, iVar2, cVar4, aVar4, (ag) hVar97.a());
            case 48:
                hVar98 = this.b.ba;
                com.google.android.libraries.search.b.b bVar5 = (com.google.android.libraries.search.b.b) hVar98.a();
                hVar99 = this.b.aV;
                com.google.android.libraries.search.b.b bVar6 = (com.google.android.libraries.search.b.b) hVar99.a();
                izVar91 = this.b.b;
                hVar100 = izVar91.B;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.d dVar6 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.d) hVar100.a();
                izVar92 = this.b.b;
                hVar101 = izVar92.C;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.d dVar7 = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.d) hVar101.a();
                hVar102 = this.f310a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar102.a();
                izVar93 = this.b.b;
                boolean hb = izVar93.hb();
                jrVar11 = this.f310a.b;
                hVar103 = jrVar11.nG;
                return new com.google.android.apps.search.assistant.surfaces.voice.h.d.c(bVar5, bVar6, dVar6, dVar7, aVar5, hb, (com.google.android.apps.search.assistant.surfaces.voice.h.d.b) hVar103.a());
            case 49:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.d();
            case 50:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.d();
            case 51:
                return new lt(this);
            case 52:
                return new lt(this);
            case 53:
                return new lt(this);
            case 54:
                return com.google.android.apps.search.assistant.libraries.e.a.a.b(this.b.qh());
            case 55:
                hVar104 = this.b.aU;
                return Boolean.valueOf(h.a.a.f.b.a.f.e((h.a.a.f.b.a.k) hVar104.a()));
            case 56:
                hVar105 = this.f310a.vm;
                com.google.android.libraries.search.d.af.a.d dVar8 = (com.google.android.libraries.search.d.af.a.d) hVar105.a();
                hVar106 = this.f310a.Q;
                return new com.google.android.libraries.search.assistant.performer.communication.impl.b(dVar8, (ag) hVar106.a());
            case 57:
                jjVar9 = this.b.f308a;
                com.google.android.libraries.search.assistant.performer.deviceactions.a.a.y ey = jjVar9.ey();
                jjVar10 = this.b.f308a;
                v ex = jjVar10.ex();
                izVar94 = this.b.b;
                o cO = izVar94.cO();
                jyVar6 = this.f310a.f319a;
                hVar107 = jyVar6.hv;
                com.google.android.libraries.search.assistant.performer.deviceactions.c.c cVar5 = (com.google.android.libraries.search.assistant.performer.deviceactions.c.c) hVar107.a();
                hVar108 = this.f310a.H;
                cq cqVar = (cq) hVar108.a();
                jjVar11 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.k(ey, ex, cO, cVar5, cqVar, jjVar11.mW());
            case 58:
                jrVar12 = this.f310a.b;
                hVar109 = jrVar12.nH;
                return com.google.android.apps.f.b.a.a.a.b((i) hVar109.a());
            case 59:
                jo joVar8 = this.f310a;
                ik ikVar6 = this.b;
                hVar110 = joVar8.f;
                hVar111 = joVar8.H;
                izVar95 = ikVar6.b;
                hVar112 = izVar95.dL;
                izVar96 = this.b.b;
                hVar113 = izVar96.I;
                izVar97 = this.b.b;
                hVar114 = izVar97.dN;
                izVar98 = this.b.b;
                hVar115 = izVar98.dO;
                izVar99 = this.b.b;
                hVar116 = izVar99.dP;
                h b17 = e.c.i.b(hVar116);
                izVar100 = this.b.b;
                hVar117 = izVar100.dQ;
                h b18 = e.c.i.b(hVar117);
                izVar101 = this.b.b;
                hVar118 = izVar101.dR;
                h b19 = e.c.i.b(hVar118);
                jo joVar9 = this.f310a;
                hVar119 = joVar9.nh;
                jrVar13 = joVar9.b;
                hVar120 = jrVar13.nI;
                ik ikVar7 = this.b;
                hVar121 = ikVar7.kS;
                hVar122 = ikVar7.dh;
                izVar102 = ikVar7.b;
                hVar123 = izVar102.dS;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.n.h(hVar110, hVar111, hVar112, hVar113, hVar114, hVar115, b17, b18, b19, hVar119, hVar120, hVar121, hVar122, hVar123);
            case 60:
                return af.b(this.b.im());
            case 61:
                return new com.google.android.libraries.search.assistant.performer.communication.c.a.h();
            case 62:
                hVar124 = this.f310a.f;
                Context context5 = (Context) hVar124.a();
                hVar125 = this.f310a.Q;
                ag agVar9 = (ag) hVar125.a();
                hVar126 = this.f310a.I;
                NotificationManager notificationManager = (NotificationManager) hVar126.a();
                hVar127 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar9 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar127.a();
                jjVar12 = this.b.f308a;
                hVar128 = jjVar12.fF;
                com.google.android.libraries.search.assistant.performer.n.v vVar = (com.google.android.libraries.search.assistant.performer.n.v) hVar128.a();
                izVar103 = this.b.b;
                hVar129 = izVar103.dM;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.n.m(context5, agVar9, notificationManager, dVar9, vVar, (com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.b.j) hVar129.a());
            case 63:
                hVar130 = this.b.ar;
                w wVar = (w) hVar130.a();
                ik ikVar8 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.p cN = ikVar8.cN();
                izVar104 = ikVar8.b;
                boolean ik = izVar104.ik();
                izVar105 = this.b.b;
                boolean iq = izVar105.iq();
                izVar106 = this.b.b;
                boolean is = izVar106.is();
                izVar107 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.b.j(wVar, cN, ik, iq, is, izVar107.iy(), this.b.aY());
            case 64:
                ik ikVar9 = this.b;
                jo joVar10 = this.f310a;
                hVar131 = ikVar9.bm;
                hVar132 = joVar10.H;
                return new com.google.android.libraries.search.assistant.performer.communication.c.b.f(hVar131, hVar132);
            case 65:
                hVar133 = this.b.bm;
                com.google.android.libraries.search.assistant.ai.a.j jVar3 = (com.google.android.libraries.search.assistant.ai.a.j) hVar133.a();
                hVar134 = this.f310a.Q;
                ag agVar10 = (ag) hVar134.a();
                izVar108 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.n.ae(jVar3, agVar10, izVar108.dw());
            case 66:
                jjVar13 = this.b.f308a;
                return Optional.of(jjVar13.eF());
            case 67:
                izVar109 = this.b.b;
                return Optional.of(izVar109.cZ());
            case 68:
                izVar110 = this.b.b;
                return Boolean.valueOf(h.a.a.d.b.a.r.n(izVar110.of()));
            case 69:
                return new lt(this);
            case 70:
                hVar135 = this.f310a.f;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.g((Context) hVar135.a());
            case 71:
                hVar136 = this.b.aa;
                com.google.apps.tiktok.g.p pVar = (com.google.apps.tiktok.g.p) hVar136.a();
                hVar137 = this.f310a.h;
                PackageManager packageManager = (PackageManager) hVar137.a();
                hVar138 = this.f310a.H;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.u(pVar, packageManager, (cq) hVar138.a());
            case 72:
                hVar139 = this.f310a.f;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.i(hVar139);
            case 73:
                hVar140 = this.f310a.f;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.i(hVar140);
            case 74:
                jrVar14 = this.f310a.b;
                return new ar(Optional.of(jrVar14.E()));
            case 75:
                Optional of = Optional.of(this.f310a.eQ());
                hVar141 = this.f310a.Q;
                ag agVar11 = (ag) hVar141.a();
                hVar142 = this.b.dC;
                Optional of2 = Optional.of((com.google.android.apps.search.assistant.verticals.a.a.a.a) hVar142.a());
                izVar111 = this.b.b;
                return new com.google.android.apps.search.assistant.libraries.dictation.d.p(of, agVar11, of2, izVar111.N());
            case 76:
                izVar112 = this.b.b;
                Optional of3 = Optional.of(izVar112.M());
                Optional of4 = Optional.of(this.f310a.eQ());
                izVar113 = this.b.b;
                hVar143 = izVar113.eb;
                com.google.android.libraries.search.assistant.az.b.a.a.a aVar6 = (com.google.android.libraries.search.assistant.az.b.a.a.a) hVar143.a();
                hVar144 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.libraries.dictation.d.i(of3, of4, aVar6, (ag) hVar144.a());
            case 77:
                return com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint.c.b(this.b.qg());
            case 78:
                hVar145 = this.b.J;
                com.google.android.libraries.search.t.a.a aVar7 = (com.google.android.libraries.search.t.a.a) hVar145.a();
                jyVar7 = this.f310a.f319a;
                com.google.android.libraries.search.b.f dA = jyVar7.dA();
                hVar146 = this.f310a.W;
                return new com.google.android.libraries.search.assistant.az.b.a.a.a(aVar7, dA, (com.google.android.libraries.search.t.i.y) hVar146.a());
            case 79:
                izVar114 = this.b.b;
                hVar147 = izVar114.y;
                s sVar = (s) hVar147.a();
                izVar115 = this.b.b;
                hVar148 = izVar115.r;
                com.google.android.apps.search.assistant.surfaces.voice.shared.c.a aVar8 = (com.google.android.apps.search.assistant.surfaces.voice.shared.c.a) hVar148.a();
                hVar149 = this.f310a.Q;
                ag agVar12 = (ag) hVar149.a();
                hVar150 = this.b.ba;
                com.google.android.libraries.search.b.b bVar7 = (com.google.android.libraries.search.b.b) hVar150.a();
                izVar116 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.fluidactions.f(sVar, aVar8, agVar12, bVar7, izVar116.iT());
            case 80:
                izVar117 = this.b.b;
                hVar151 = izVar117.L;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d dVar10 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d) hVar151.a();
                hVar152 = this.f310a.iu;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.response.c.a.c(dVar10, (ay) hVar152.a());
            case 81:
                izVar118 = this.b.b;
                hVar153 = izVar118.j;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar179 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar153.a();
                izVar119 = this.b.b;
                hVar154 = izVar119.k;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar180 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar154.a();
                izVar120 = this.b.b;
                hVar155 = izVar120.l;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar181 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar155.a();
                izVar121 = this.b.b;
                hVar156 = izVar121.m;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar182 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar156.a();
                izVar122 = this.b.b;
                hVar157 = izVar122.n;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar183 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar157.a();
                izVar123 = this.b.b;
                hVar158 = izVar123.o;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar184 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar158.a();
                izVar124 = this.b.b;
                hVar159 = izVar124.p;
                com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h hVar185 = (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar159.a();
                izVar125 = this.b.b;
                hVar160 = izVar125.q;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d(hVar179, hVar180, hVar181, hVar182, hVar183, hVar184, hVar185, (com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e.h) hVar160.a());
            case 82:
                hVar161 = this.f310a.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar8 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar161.a();
                hVar162 = this.b.i;
                return new an(bVar8, (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar162.a());
            case 83:
                izVar126 = this.b.b;
                hVar163 = izVar126.dC;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.x((lt) hVar163.a());
            case 84:
                return new com.google.android.apps.search.assistant.verticals.a.f.e();
            case 85:
                izVar127 = this.b.b;
                return Optional.of(izVar127.L());
            case 86:
                hVar164 = this.f310a.f;
                return new com.google.android.libraries.search.assistant.performer.h.aa((Context) hVar164.a());
            case 87:
                return new lt(this);
            case 88:
                izVar128 = this.b.b;
                hVar165 = izVar128.eh;
                return com.google.android.libraries.search.assistant.invocation.e.a.b.b.f((lt) hVar165.a());
            case 89:
                return new lt(this);
            case 90:
                return com.google.android.libraries.search.assistant.invocation.e.a.b.b.b(this.f310a.Ve());
            case 91:
                hVar166 = this.f310a.H;
                cq cqVar2 = (cq) hVar166.a();
                izVar129 = this.b.b;
                hVar167 = izVar129.dL;
                com.google.android.libraries.search.assistant.performer.communication.c.a.f fVar = (com.google.android.libraries.search.assistant.performer.communication.c.a.f) hVar167.a();
                ik ikVar10 = this.b;
                com.google.android.libraries.search.assistant.performer.communication.c.b.g io = ikVar10.io();
                hVar168 = ikVar10.kW;
                ad adVar = (ad) hVar168.a();
                izVar130 = this.b.b;
                hVar169 = izVar130.S;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.n.u(cqVar2, fVar, io, adVar, (com.google.android.apps.search.assistant.surfaces.voice.shared.c.a) hVar169.a());
            case 93:
                izVar131 = this.b.b;
                hVar170 = izVar131.dL;
                com.google.android.libraries.search.assistant.performer.communication.c.a.f fVar2 = (com.google.android.libraries.search.assistant.performer.communication.c.a.f) hVar170.a();
                izVar132 = this.b.b;
                hVar171 = izVar132.I;
                com.google.android.libraries.search.assistant.performer.communication.c.a.h hVar186 = (com.google.android.libraries.search.assistant.performer.communication.c.a.h) hVar171.a();
                ik ikVar11 = this.b;
                com.google.android.libraries.search.assistant.performer.communication.c.b.g io2 = ikVar11.io();
                izVar133 = ikVar11.b;
                hVar172 = izVar133.ek;
                e.a b20 = e.c.c.b(hVar172);
                izVar134 = this.b.b;
                hVar173 = izVar134.el;
                e.a b21 = e.c.c.b(hVar173);
                hVar174 = this.b.kX;
                com.google.android.libraries.search.assistant.performer.communication.c.l lVar2 = (com.google.android.libraries.search.assistant.performer.communication.c.l) hVar174.a();
                hVar175 = this.b.dh;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.n.i(fVar2, hVar186, io2, b20, b21, lVar2, ((Boolean) hVar175.a()).booleanValue());
            case 94:
                izVar135 = this.b.b;
                return Optional.of(izVar135.cX());
            case 95:
                ik ikVar12 = this.b;
                jo joVar11 = this.f310a;
                com.google.apps.tiktok.q.b.h b22 = com.google.android.libraries.search.assistant.spokennotifications.autoread.e.a.b();
                f kf2 = ikVar12.kf();
                hVar176 = joVar11.w;
                return com.google.android.libraries.search.assistant.spokennotifications.autoread.e.a.c(b22, kf2, (j) hVar176.a());
            case 96:
                izVar136 = this.b.b;
                return Optional.of(izVar136.cY());
            case 97:
                return new lt(this);
            case 98:
                izVar137 = this.b.b;
                hVar177 = izVar137.M;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.s((com.google.android.apps.search.assistant.surfaces.voice.ui.response.c.c) hVar177.a());
            case 99:
                hVar178 = this.f310a.f;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.a.c((Context) hVar178.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        iz izVar;
        iz izVar2;
        h hVar;
        iz izVar3;
        h hVar2;
        iz izVar4;
        iz izVar5;
        iz izVar6;
        iz izVar7;
        iz izVar8;
        iz izVar9;
        iz izVar10;
        iz izVar11;
        iz izVar12;
        iz izVar13;
        iz izVar14;
        iz izVar15;
        iz izVar16;
        iz izVar17;
        iz izVar18;
        iz izVar19;
        iz izVar20;
        iz izVar21;
        iz izVar22;
        iz izVar23;
        iz izVar24;
        iz izVar25;
        iz izVar26;
        iz izVar27;
        iz izVar28;
        iz izVar29;
        iz izVar30;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        iz izVar31;
        jj jjVar;
        iz izVar32;
        h hVar7;
        iz izVar33;
        h hVar8;
        h hVar9;
        iz izVar34;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        h hVar14;
        h hVar15;
        iz izVar35;
        iz izVar36;
        h hVar16;
        h hVar17;
        iz izVar37;
        h hVar18;
        iz izVar38;
        h hVar19;
        h hVar20;
        h hVar21;
        h hVar22;
        h hVar23;
        iz izVar39;
        h hVar24;
        iz izVar40;
        h hVar25;
        iz izVar41;
        iz izVar42;
        h hVar26;
        iz izVar43;
        h hVar27;
        iz izVar44;
        h hVar28;
        iz izVar45;
        h hVar29;
        iz izVar46;
        h hVar30;
        h hVar31;
        h hVar32;
        iz izVar47;
        h hVar33;
        iz izVar48;
        h hVar34;
        h hVar35;
        iz izVar49;
        h hVar36;
        h hVar37;
        jr jrVar;
        iz izVar50;
        jj jjVar2;
        h hVar38;
        jr jrVar2;
        h hVar39;
        h hVar40;
        jr jrVar3;
        iz izVar51;
        h hVar41;
        iz izVar52;
        h hVar42;
        iz izVar53;
        h hVar43;
        iz izVar54;
        h hVar44;
        h hVar45;
        h hVar46;
        jr jrVar4;
        iz izVar55;
        iz izVar56;
        h hVar47;
        iz izVar57;
        h hVar48;
        h hVar49;
        jj jjVar3;
        h hVar50;
        iz izVar58;
        h hVar51;
        h hVar52;
        h hVar53;
        jj jjVar4;
        iz izVar59;
        h hVar54;
        iz izVar60;
        h hVar55;
        iz izVar61;
        h hVar56;
        iz izVar62;
        h hVar57;
        iz izVar63;
        h hVar58;
        h hVar59;
        iz izVar64;
        h hVar60;
        h hVar61;
        h hVar62;
        iz izVar65;
        iz izVar66;
        iz izVar67;
        iz izVar68;
        iz izVar69;
        iz izVar70;
        iz izVar71;
        iz izVar72;
        iz izVar73;
        iz izVar74;
        iz izVar75;
        iz izVar76;
        iz izVar77;
        iz izVar78;
        iz izVar79;
        iz izVar80;
        iz izVar81;
        iz izVar82;
        iz izVar83;
        iz izVar84;
        iz izVar85;
        iz izVar86;
        iz izVar87;
        iz izVar88;
        iz izVar89;
        iz izVar90;
        iz izVar91;
        iz izVar92;
        iz izVar93;
        iz izVar94;
        iz izVar95;
        iz izVar96;
        iz izVar97;
        iz izVar98;
        iz izVar99;
        h hVar63;
        iz izVar100;
        h hVar64;
        h hVar65;
        h hVar66;
        iz izVar101;
        iz izVar102;
        iz izVar103;
        iz izVar104;
        iz izVar105;
        iz izVar106;
        iz izVar107;
        iz izVar108;
        iz izVar109;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        iz izVar110;
        h hVar71;
        h hVar72;
        iz izVar111;
        iz izVar112;
        h hVar73;
        iz izVar113;
        h hVar74;
        iz izVar114;
        iz izVar115;
        iz izVar116;
        iz izVar117;
        jr jrVar5;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        h hVar80;
        h hVar81;
        jj jjVar5;
        h hVar82;
        h hVar83;
        iz izVar118;
        h hVar84;
        iz izVar119;
        h hVar85;
        jr jrVar6;
        h hVar86;
        iz izVar120;
        iz izVar121;
        iz izVar122;
        h hVar87;
        iz izVar123;
        h hVar88;
        iz izVar124;
        h hVar89;
        h hVar90;
        iz izVar125;
        jj jjVar6;
        h hVar91;
        iz izVar126;
        h hVar92;
        h hVar93;
        iz izVar127;
        h hVar94;
        h hVar95;
        h hVar96;
        iz izVar128;
        jr jrVar7;
        iz izVar129;
        iz izVar130;
        iz izVar131;
        iz izVar132;
        h hVar97;
        jr jrVar8;
        iz izVar133;
        iz izVar134;
        jr jrVar9;
        jj jjVar7;
        jj jjVar8;
        iz izVar135;
        iz izVar136;
        h hVar98;
        h hVar99;
        iz izVar137;
        iz izVar138;
        jr jrVar10;
        h hVar100;
        jr jrVar11;
        iz izVar139;
        iz izVar140;
        jr jrVar12;
        iz izVar141;
        iz izVar142;
        h hVar101;
        iz izVar143;
        h hVar102;
        jr jrVar13;
        h hVar103;
        h hVar104;
        jr jrVar14;
        iz izVar144;
        iz izVar145;
        jr jrVar15;
        iz izVar146;
        h hVar105;
        h hVar106;
        iz izVar147;
        h hVar107;
        h hVar108;
        iz izVar148;
        iz izVar149;
        h hVar109;
        h hVar110;
        h hVar111;
        iz izVar150;
        iz izVar151;
        h hVar112;
        h hVar113;
        jr jrVar16;
        h hVar114;
        iz izVar152;
        h hVar115;
        iz izVar153;
        h hVar116;
        iz izVar154;
        h hVar117;
        h hVar118;
        h hVar119;
        iz izVar155;
        h hVar120;
        iz izVar156;
        iz izVar157;
        iz izVar158;
        iz izVar159;
        iz izVar160;
        h hVar121;
        iz izVar161;
        h hVar122;
        h hVar123;
        iz izVar162;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        h hVar128;
        h hVar129;
        jy jyVar;
        h hVar130;
        jr jrVar17;
        h hVar131;
        h hVar132;
        h hVar133;
        iz izVar163;
        iz izVar164;
        h hVar134;
        iz izVar165;
        h hVar135;
        h hVar136;
        h hVar137;
        iz izVar166;
        h hVar138;
        h hVar139;
        h hVar140;
        h hVar141;
        h hVar142;
        iz izVar167;
        h hVar143;
        h hVar144;
        h hVar145;
        iz izVar168;
        h hVar146;
        h hVar147;
        h hVar148;
        h hVar149;
        iz izVar169;
        h hVar150;
        h hVar151;
        jr jrVar18;
        h hVar152;
        iz izVar170;
        h hVar153;
        h hVar154;
        jj jjVar9;
        iz izVar171;
        iz izVar172;
        iz izVar173;
        h hVar155;
        h hVar156;
        iz izVar174;
        h hVar157;
        iz izVar175;
        h hVar158;
        iz izVar176;
        h hVar159;
        iz izVar177;
        h hVar160;
        iz izVar178;
        h hVar161;
        jr jrVar19;
        h hVar162;
        jj jjVar10;
        iz izVar179;
        iz izVar180;
        iz izVar181;
        iz izVar182;
        h hVar163;
        iz izVar183;
        h hVar164;
        iz izVar184;
        iz izVar185;
        iz izVar186;
        h hVar165;
        int i = this.c;
        switch (i) {
            case 100:
                izVar = this.b.b;
                boolean jG = izVar.jG();
                izVar2 = this.b.b;
                hVar = izVar2.dC;
                lt ltVar = (lt) hVar.a();
                izVar3 = this.b.b;
                hVar2 = izVar3.es;
                return com.google.android.apps.search.assistant.surfaces.voice.p.j.b.b(jG, ltVar, (Set) hVar2.a());
            case 101:
                ik ikVar = this.b;
                gy l = ha.l(27);
                izVar4 = ikVar.b;
                l.h(izVar4.aG());
                izVar5 = this.b.b;
                l.h(izVar5.aJ());
                izVar6 = this.b.b;
                l.h(izVar6.bD());
                izVar7 = this.b.b;
                l.h(izVar7.aN());
                izVar8 = this.b.b;
                l.h(izVar8.aH());
                izVar9 = this.b.b;
                l.h(izVar9.aI());
                izVar10 = this.b.b;
                l.h(izVar10.bn());
                izVar11 = this.b.b;
                l.h(izVar11.bu());
                izVar12 = this.b.b;
                l.h(izVar12.bA());
                izVar13 = this.b.b;
                l.h(izVar13.bp());
                izVar14 = this.b.b;
                l.h(izVar14.bl());
                izVar15 = this.b.b;
                l.h(izVar15.bm());
                izVar16 = this.b.b;
                l.h(izVar16.bs());
                izVar17 = this.b.b;
                l.h(izVar17.bC());
                izVar18 = this.b.b;
                l.h(izVar18.bi());
                izVar19 = this.b.b;
                l.h(izVar19.bk());
                izVar20 = this.b.b;
                l.h(izVar20.bq());
                izVar21 = this.b.b;
                l.h(izVar21.bx());
                izVar22 = this.b.b;
                l.h(izVar22.bz());
                izVar23 = this.b.b;
                l.h(izVar23.bj());
                izVar24 = this.b.b;
                l.h(izVar24.br());
                izVar25 = this.b.b;
                l.h(izVar25.bB());
                izVar26 = this.b.b;
                l.h(izVar26.by());
                izVar27 = this.b.b;
                l.h(izVar27.bt());
                izVar28 = this.b.b;
                l.h(izVar28.bo());
                izVar29 = this.b.b;
                l.h(izVar29.bw());
                izVar30 = this.b.b;
                l.j(izVar30.gI());
                return l.g();
            case 102:
                hVar3 = this.b.aU;
                return Boolean.valueOf(h.a.a.f.b.a.f.d((h.a.a.f.b.a.k) hVar3.a()));
            case 103:
                return new com.google.android.apps.search.assistant.surfaces.voice.p.c.k();
            case 104:
                hVar4 = this.f310a.f;
                Context context = (Context) hVar4.a();
                hVar5 = this.f310a.H;
                cr crVar = (cr) hVar5.a();
                hVar6 = this.f310a.bz;
                ao aoVar = (ao) hVar6.a();
                izVar31 = this.b.b;
                com.google.android.libraries.search.assistant.ad.f cL = izVar31.cL();
                jjVar = this.b.f308a;
                bs ew = jjVar.ew();
                izVar32 = this.b.b;
                hVar7 = izVar32.E;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.c.o(context, crVar, aoVar, cL, ew, (com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.b) hVar7.a());
            case 105:
                return new lt(this);
            case 106:
                return new lt(this);
            case 107:
                izVar33 = this.b.b;
                hVar8 = izVar33.y;
                s sVar = (s) hVar8.a();
                hVar9 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.c(sVar, (ag) hVar9.a());
            case 108:
                izVar34 = this.b.b;
                hVar10 = izVar34.y;
                s sVar2 = (s) hVar10.a();
                hVar11 = this.b.ba;
                com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) hVar11.a();
                hVar12 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.text.g(sVar2, bVar, (ag) hVar12.a());
            case 109:
                return new lt(this);
            case 110:
                hVar13 = this.f310a.iu;
                ay ayVar = (ay) hVar13.a();
                hVar14 = this.f310a.Q;
                ag agVar = (ag) hVar14.a();
                hVar15 = this.f310a.H;
                return new k(ayVar, agVar, (cr) hVar15.a());
            case 111:
                izVar35 = this.b.b;
                return com.google.android.apps.search.assistant.surfaces.voice.p.t.a.b.b(izVar35.bO());
            case 112:
                izVar36 = this.b.b;
                hVar16 = izVar36.ew;
                return com.google.android.libraries.search.assistant.invocation.e.a.b.b.e((lt) hVar16.a());
            case 113:
                return new lt(this);
            case 114:
                return new lt(this);
            case 115:
                hVar17 = this.f310a.Q;
                ag agVar2 = (ag) hVar17.a();
                izVar37 = this.b.b;
                hVar18 = izVar37.ex;
                lt ltVar2 = (lt) hVar18.a();
                izVar38 = this.b.b;
                hVar19 = izVar38.dM;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.b.l(agVar2, ltVar2, (com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.b.j) hVar19.a());
            case 116:
                hVar20 = this.b.kJ;
                e.a b = e.c.c.b(hVar20);
                hVar21 = this.f310a.f;
                Context context2 = (Context) hVar21.a();
                ik ikVar2 = this.b;
                com.google.android.libraries.search.assistant.proactive.b.b iB = ikVar2.iB();
                hVar22 = ikVar2.kK;
                return new com.google.android.libraries.search.assistant.performer.j.b(b, context2, iB, e.c.c.b(hVar22));
            case 117:
                hVar23 = this.f310a.f;
                Context context3 = (Context) hVar23.a();
                izVar39 = this.b.b;
                hVar24 = izVar39.dC;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.u.c(context3, (lt) hVar24.a());
            case 118:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.b();
            case 119:
                izVar40 = this.b.b;
                hVar25 = izVar40.B;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.b.a((com.google.android.apps.search.assistant.surfaces.voice.e.j.d) hVar25.a());
            case 120:
                izVar41 = this.b.b;
                return Optional.of(izVar41.bX());
            case 121:
                izVar42 = this.b.b;
                hVar26 = izVar42.dC;
                lt ltVar3 = (lt) hVar26.a();
                izVar43 = this.b.b;
                hVar27 = izVar43.eC;
                izVar44 = this.b.b;
                boolean kr = izVar44.kr();
                hVar28 = this.b.ba;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ac(ltVar3, hVar27, kr, (com.google.android.libraries.search.b.b) hVar28.a());
            case 122:
                izVar45 = this.b.b;
                hVar29 = izVar45.dC;
                lt ltVar4 = (lt) hVar29.a();
                izVar46 = this.b.b;
                com.google.android.libraries.search.assistant.performer.m.b cT = izVar46.cT();
                ik ikVar3 = this.b;
                Random b2 = ab.b();
                hVar30 = ikVar3.ba;
                com.google.android.libraries.search.b.b bVar2 = (com.google.android.libraries.search.b.b) hVar30.a();
                hVar31 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.p.s.e(ltVar4, cT, b2, bVar2, (ag) hVar31.a());
            case 123:
                hVar32 = this.b.dx;
                return new com.google.android.libraries.search.assistant.performer.m.a.b((q) hVar32.a());
            case 124:
                izVar47 = this.b.b;
                hVar33 = izVar47.dC;
                lt ltVar5 = (lt) hVar33.a();
                izVar48 = this.b.b;
                hVar34 = izVar48.ae;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.b bVar3 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.b) hVar34.a();
                hVar35 = this.f310a.Q;
                ag agVar3 = (ag) hVar35.a();
                izVar49 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.query.d.a.p(ltVar5, bVar3, agVar3, izVar49.ce());
            case 125:
                hVar36 = this.f310a.Q;
                ag agVar4 = (ag) hVar36.a();
                hVar37 = this.f310a.f;
                Context context4 = (Context) hVar37.a();
                jrVar = this.f310a.b;
                boolean gG = jrVar.gG();
                izVar50 = this.b.b;
                boolean ky = izVar50.ky();
                jjVar2 = this.b.f308a;
                boolean ra = jjVar2.ra();
                hVar38 = this.b.bZ;
                com.google.android.apps.search.assistant.surfaces.voice.robin.routing.aa aaVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.routing.aa) hVar38.a();
                ik ikVar4 = this.b;
                jo joVar = this.f310a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.ac ct = ikVar4.ct();
                jrVar2 = joVar.b;
                hVar39 = jrVar2.o;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar = (com.google.android.apps.search.assistant.surfaces.voice.o.p) hVar39.a();
                hVar40 = this.f310a.ez;
                com.google.common.v.f fVar = (com.google.common.v.f) hVar40.a();
                jrVar3 = this.f310a.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.c.a.a.b O = jrVar3.O();
                izVar51 = this.b.b;
                hVar41 = izVar51.ad;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.af afVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.af) hVar41.a();
                izVar52 = this.b.b;
                hVar42 = izVar52.D;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.a.b bVar4 = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.a.b) hVar42.a();
                izVar53 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.o ci = izVar53.ci();
                hVar43 = this.b.x;
                com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.g gVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.g) hVar43.a();
                izVar54 = this.b.b;
                hVar44 = izVar54.t;
                lt ltVar6 = (lt) hVar44.a();
                hVar45 = this.f310a.Y;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.ae(agVar4, context4, gG, ky, ra, aaVar, ct, pVar, fVar, O, afVar, bVar4, ci, gVar, ltVar6, (String) hVar45.a());
            case 126:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.af();
            case 127:
                return new iv(this, 0);
            case 128:
                hVar46 = this.f310a.h;
                PackageManager packageManager = (PackageManager) hVar46.a();
                jo joVar2 = this.f310a;
                boolean acG = joVar2.acG();
                jrVar4 = joVar2.b;
                return new com.google.android.apps.search.assistant.libraries.dictation.f.a(packageManager, acG, jrVar4.gH());
            case 129:
                return new lt(this);
            case 130:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.c();
            case 131:
                izVar55 = this.b.b;
                boolean lK = izVar55.lK();
                izVar56 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.b(lK, izVar56.lN());
            case 132:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.f();
            case 133:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.e((byte[]) null);
            case 134:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.bg();
            case 135:
                hVar47 = this.f310a.Q;
                ag agVar5 = (ag) hVar47.a();
                izVar57 = this.b.b;
                hVar48 = izVar57.y;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.e.e(agVar5, (s) hVar48.a());
            case 136:
                return new lt(this);
            case 137:
                hVar49 = this.b.ek;
                return new com.google.android.apps.search.assistant.surfaces.voice.growth.d.c.m((com.google.android.libraries.search.assistant.aj.d.b.e) hVar49.a());
            case 138:
                jjVar3 = this.b.f308a;
                hVar50 = jjVar3.t;
                e.a b3 = e.c.c.b(hVar50);
                izVar58 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.growth.d.c.y bW = izVar58.bW();
                hVar51 = this.b.ek;
                com.google.android.libraries.search.assistant.aj.d.b.e eVar = (com.google.android.libraries.search.assistant.aj.d.b.e) hVar51.a();
                hVar52 = this.f310a.H;
                Executor executor = (Executor) hVar52.a();
                hVar53 = this.f310a.lg;
                e.a b4 = e.c.c.b(hVar53);
                jjVar4 = this.b.f308a;
                boolean pX = jjVar4.pX();
                izVar59 = this.b.b;
                hVar54 = izVar59.eG;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.a.e(b3, bW, eVar, executor, b4, pX, (com.google.android.apps.search.assistant.surfaces.voice.i.g.a.e) hVar54.a());
            case 139:
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.d.c.b(this.b.qg());
            case 140:
                izVar60 = this.b.b;
                hVar55 = izVar60.ae;
                return Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.ae) hVar55.a());
            case 141:
                return new lt(this);
            case 142:
                return new lt(this);
            case 143:
                return com.google.android.apps.search.assistant.surfaces.voice.e.h.e.g.b(this.b.qg());
            case 144:
                izVar61 = this.b.b;
                hVar56 = izVar61.au;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.h.a.c((com.google.android.apps.search.assistant.surfaces.voice.e.h.a) hVar56.a());
            case 145:
                izVar62 = this.b.b;
                hVar57 = izVar62.at;
                izVar63 = this.b.b;
                hVar58 = izVar63.as;
                lt ltVar7 = (lt) hVar58.a();
                ik ikVar5 = this.b;
                boolean un = ikVar5.un();
                hVar59 = ikVar5.cK;
                return com.google.android.apps.search.assistant.surfaces.voice.e.h.a.d.b(hVar57, ltVar7, un, hVar59);
            case 146:
                izVar64 = this.b.b;
                hVar60 = izVar64.as;
                lt ltVar8 = (lt) hVar60.a();
                ik ikVar6 = this.b;
                hVar61 = ikVar6.cI;
                hVar62 = ikVar6.jE;
                return com.google.android.apps.search.assistant.surfaces.voice.e.h.d.b.b(ltVar8, hVar61, hVar62);
            case 147:
                return new lt(this);
            case 148:
                ik ikVar7 = this.b;
                gy l2 = ha.l(34);
                izVar65 = ikVar7.b;
                l2.h(izVar65.at());
                izVar66 = this.b.b;
                l2.h(izVar66.ad());
                izVar67 = this.b.b;
                l2.h(izVar67.ae());
                izVar68 = this.b.b;
                l2.h(izVar68.ay());
                izVar69 = this.b.b;
                l2.h(izVar69.am());
                izVar70 = this.b.b;
                l2.h(izVar70.ab());
                izVar71 = this.b.b;
                l2.h(izVar71.ac());
                izVar72 = this.b.b;
                l2.j(izVar72.gA());
                izVar73 = this.b.b;
                l2.h(izVar73.ag());
                izVar74 = this.b.b;
                l2.j(izVar74.gH());
                izVar75 = this.b.b;
                l2.h(izVar75.aw());
                izVar76 = this.b.b;
                l2.h(izVar76.aa());
                izVar77 = this.b.b;
                l2.h(izVar77.an());
                izVar78 = this.b.b;
                l2.h(izVar78.as());
                izVar79 = this.b.b;
                l2.h(izVar79.af());
                izVar80 = this.b.b;
                l2.h(izVar80.Z());
                izVar81 = this.b.b;
                l2.h(izVar81.ar());
                izVar82 = this.b.b;
                l2.h(izVar82.ah());
                izVar83 = this.b.b;
                l2.h(izVar83.aq());
                izVar84 = this.b.b;
                l2.h(izVar84.au());
                izVar85 = this.b.b;
                l2.h(izVar85.Y());
                izVar86 = this.b.b;
                l2.h(izVar86.ao());
                izVar87 = this.b.b;
                l2.j(izVar87.gy());
                izVar88 = this.b.b;
                l2.h(izVar88.ap());
                izVar89 = this.b.b;
                l2.h(izVar89.ak());
                izVar90 = this.b.b;
                l2.h(izVar90.aj());
                izVar91 = this.b.b;
                l2.h(izVar91.ax());
                izVar92 = this.b.b;
                l2.h(izVar92.W());
                izVar93 = this.b.b;
                l2.h(izVar93.X());
                izVar94 = this.b.b;
                l2.j(izVar94.gx());
                izVar95 = this.b.b;
                l2.h(izVar95.ai());
                izVar96 = this.b.b;
                l2.h(izVar96.al());
                izVar97 = this.b.b;
                l2.h(izVar97.av());
                izVar98 = this.b.b;
                l2.j(izVar98.gB());
                return l2.g();
            case 149:
                izVar99 = this.b.b;
                hVar63 = izVar99.ak;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.e eVar2 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.e) hVar63.a();
                izVar100 = this.b.b;
                hVar64 = izVar100.ah;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.c cVar = (com.google.android.apps.search.assistant.surfaces.voice.e.j.c) hVar64.a();
                hVar65 = this.b.cR;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.k) hVar65.a();
                hVar66 = this.f310a.Q;
                ag agVar6 = (ag) hVar66.a();
                izVar101 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.q cc = izVar101.cc();
                izVar102 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ac.e(eVar2, cVar, kVar, agVar6, cc, izVar102.lU());
            case 150:
                izVar103 = this.b.b;
                String fP = izVar103.fP();
                izVar104 = this.b.b;
                boolean hS = izVar104.hS();
                izVar105 = this.b.b;
                boolean lY = izVar105.lY();
                izVar106 = this.b.b;
                boolean mc = izVar106.mc();
                izVar107 = this.b.b;
                boolean mh = izVar107.mh();
                izVar108 = this.b.b;
                String fT = izVar108.fT();
                izVar109 = this.b.b;
                boolean ml = izVar109.ml();
                hVar67 = this.b.jI;
                e.a b5 = e.c.c.b(hVar67);
                hVar68 = this.b.ba;
                com.google.android.libraries.search.b.b bVar5 = (com.google.android.libraries.search.b.b) hVar68.a();
                hVar69 = this.f310a.Q;
                ag agVar7 = (ag) hVar69.a();
                ik ikVar8 = this.b;
                jo joVar3 = this.f310a;
                com.google.android.apps.search.assistant.platform.g.m.c ah = ikVar8.ah();
                hVar70 = joVar3.tr;
                boolean booleanValue = ((Boolean) hVar70.a()).booleanValue();
                izVar110 = this.b.b;
                hVar71 = izVar110.N;
                an anVar = (an) hVar71.a();
                hVar72 = this.b.dh;
                boolean booleanValue2 = ((Boolean) hVar72.a()).booleanValue();
                izVar111 = this.b.b;
                boolean mn = izVar111.mn();
                izVar112 = this.b.b;
                hVar73 = izVar112.eI;
                e.a b6 = e.c.c.b(hVar73);
                izVar113 = this.b.b;
                hVar74 = izVar113.eJ;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.k kVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.k) hVar74.a();
                izVar114 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.n.d(fP, hS, lY, mc, mh, fT, ml, b5, bVar5, agVar7, ah, booleanValue, anVar, booleanValue2, mn, b6, kVar2, izVar114.aC());
            case 151:
                izVar115 = this.b.b;
                return Optional.of(izVar115.da());
            case 152:
                izVar116 = this.b.b;
                boolean mr = izVar116.mr();
                izVar117 = this.b.b;
                boolean mt = izVar117.mt();
                jrVar5 = this.f310a.b;
                boolean gF = jrVar5.gF();
                hVar75 = this.f310a.f;
                Context context5 = (Context) hVar75.a();
                hVar76 = this.f310a.sZ;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.k(mr, mt, gF, context5, (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar76.a());
            case 153:
                hVar77 = this.f310a.f;
                Context context6 = (Context) hVar77.a();
                hVar78 = this.f310a.nn;
                KeyguardManager keyguardManager = (KeyguardManager) hVar78.a();
                hVar79 = this.b.aj;
                e.a b7 = e.c.c.b(hVar79);
                hVar80 = this.b.g;
                AccountId accountId = (AccountId) hVar80.a();
                hVar81 = this.f310a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar81.a();
                jjVar5 = this.b.f308a;
                hVar82 = jjVar5.fD;
                e.a b8 = e.c.c.b(hVar82);
                hVar83 = this.b.ak;
                com.google.android.apps.search.assistant.platform.g.j.c cVar2 = (com.google.android.apps.search.assistant.platform.g.j.c) hVar83.a();
                izVar118 = this.b.b;
                hVar84 = izVar118.az;
                com.google.android.apps.search.assistant.surfaces.voice.e.e.aj.e eVar3 = (com.google.android.apps.search.assistant.surfaces.voice.e.e.aj.e) hVar84.a();
                izVar119 = this.b.b;
                com.google.android.apps.search.assistant.platform.g.j.s O2 = izVar119.O();
                hVar85 = this.f310a.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar85.a();
                jrVar6 = this.f310a.b;
                hVar86 = jrVar6.x;
                com.google.android.apps.gsa.u.e.a aVar = (com.google.android.apps.gsa.u.e.a) hVar86.a();
                izVar120 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.e.b.f aA = izVar120.aA();
                izVar121 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.e.b.c az = izVar121.az();
                izVar122 = this.b.b;
                hVar87 = izVar122.eK;
                e.a b9 = e.c.c.b(hVar87);
                izVar123 = this.b.b;
                hVar88 = izVar123.aA;
                com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.a.c cVar3 = (com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.a.c) hVar88.a();
                izVar124 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.e.e.p.s aD = izVar124.aD();
                hVar89 = this.f310a.cZ;
                AudioManager audioManager = (AudioManager) hVar89.a();
                hVar90 = this.f310a.va;
                e.a b10 = e.c.c.b(hVar90);
                izVar125 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.contextawareness.c aE = izVar125.aE();
                jjVar6 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.contextawareness.r W = jjVar6.W();
                hVar91 = this.b.cQ;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l lVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l) hVar91.a();
                izVar126 = this.b.b;
                hVar92 = izVar126.ak;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.e eVar4 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.e) hVar92.a();
                hVar93 = this.b.cF;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar93.a();
                ik ikVar9 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.u.b.j cs = ikVar9.cs();
                izVar127 = ikVar9.b;
                hVar94 = izVar127.eL;
                e.a b11 = e.c.c.b(hVar94);
                hVar95 = this.b.ba;
                com.google.android.libraries.search.b.b bVar6 = (com.google.android.libraries.search.b.b) hVar95.a();
                hVar96 = this.f310a.bo;
                ag agVar8 = (ag) hVar96.a();
                izVar128 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.af bP = izVar128.bP();
                jrVar7 = this.f310a.b;
                boolean gI = jrVar7.gI();
                izVar129 = this.b.b;
                boolean mQ = izVar129.mQ();
                ik ikVar10 = this.b;
                boolean ul = ikVar10.ul();
                izVar130 = ikVar10.b;
                boolean mN = izVar130.mN();
                izVar131 = this.b.b;
                boolean mK = izVar131.mK();
                izVar132 = this.b.b;
                hVar97 = izVar132.ab;
                com.google.android.apps.search.assistant.surfaces.voice.e.b.a aVar2 = (com.google.android.apps.search.assistant.surfaces.voice.e.b.a) hVar97.a();
                jrVar8 = this.f310a.b;
                com.google.android.apps.search.assistant.platform.g.m.a.a.b D = jrVar8.D();
                izVar133 = this.b.b;
                boolean mR = izVar133.mR();
                izVar134 = this.b.b;
                boolean mS = izVar134.mS();
                jrVar9 = this.f310a.b;
                boolean gK = jrVar9.gK();
                jjVar7 = this.b.f308a;
                boolean qo = jjVar7.qo();
                jjVar8 = this.b.f308a;
                boolean qp = jjVar8.qp();
                izVar135 = this.b.b;
                boolean mT = izVar135.mT();
                izVar136 = this.b.b;
                boolean mU = izVar136.mU();
                hVar98 = this.f310a.tr;
                boolean booleanValue3 = ((Boolean) hVar98.a()).booleanValue();
                hVar99 = this.b.dh;
                boolean booleanValue4 = ((Boolean) hVar99.a()).booleanValue();
                izVar137 = this.b.b;
                boolean mV = izVar137.mV();
                ik ikVar11 = this.b;
                boolean uh = ikVar11.uh();
                boolean um = ikVar11.um();
                izVar138 = ikVar11.b;
                boolean mW = izVar138.mW();
                jrVar10 = this.f310a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.p.p(context6, keyguardManager, b7, accountId, dVar, b8, cVar2, eVar3, O2, fVar2, aVar, aA, az, b9, cVar3, aD, audioManager, b10, aE, W, lVar, eVar4, aeVar, cs, b11, bVar6, agVar8, bP, gI, mQ, ul, mN, mK, aVar2, D, mR, mS, gK, qo, qp, mT, mU, booleanValue3, booleanValue4, mV, uh, um, mW, jrVar10.ht());
            case 154:
                hVar100 = this.b.ak;
                com.google.android.apps.search.assistant.platform.g.j.c cVar4 = (com.google.android.apps.search.assistant.platform.g.j.c) hVar100.a();
                jrVar11 = this.f310a.b;
                com.google.android.apps.search.assistant.platform.g.m.a.a.b D2 = jrVar11.D();
                izVar139 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.lockscreen.b.a.b cb = izVar139.cb();
                izVar140 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.e.b.f aA2 = izVar140.aA();
                ik ikVar12 = this.b;
                jo joVar4 = this.f310a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.u.b.j cs2 = ikVar12.cs();
                jrVar12 = joVar4.b;
                boolean gI2 = jrVar12.gI();
                izVar141 = this.b.b;
                boolean mK2 = izVar141.mK();
                ik ikVar13 = this.b;
                boolean ul2 = ikVar13.ul();
                izVar142 = ikVar13.b;
                boolean mN2 = izVar142.mN();
                hVar101 = this.f310a.bo;
                ag agVar9 = (ag) hVar101.a();
                izVar143 = this.b.b;
                boolean mZ = izVar143.mZ();
                hVar102 = this.b.z;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.aj.e(cVar4, D2, cb, aA2, cs2, gI2, mK2, ul2, mN2, agVar9, mZ, (am) hVar102.a());
            case 155:
                jrVar13 = this.f310a.b;
                hVar103 = jrVar13.gu;
                com.google.android.libraries.search.assistant.ag.k kVar3 = (com.google.android.libraries.search.assistant.ag.k) hVar103.a();
                jo joVar5 = this.f310a;
                com.google.android.libraries.search.assistant.y.a.l jK = joVar5.jK();
                hVar104 = joVar5.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar104.a();
                jrVar14 = this.f310a.b;
                long t = jrVar14.t();
                jo joVar6 = this.f310a;
                ik ikVar14 = this.b;
                ha nJ = joVar6.nJ();
                izVar144 = ikVar14.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c bQ = izVar144.bQ();
                izVar145 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e bR = izVar145.bR();
                jrVar15 = this.f310a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.b.i(kVar3, jK, fVar3, t, nJ, bQ, bR, jrVar15.gJ());
            case 156:
                izVar146 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.a.c(izVar146.mP(), this.f310a.fG());
            case 157:
                return com.google.android.apps.search.assistant.surfaces.voice.e.d.a.d(this.b.iL());
            case 158:
                hVar105 = this.b.bk;
                com.google.android.libraries.search.assistant.invocation.o.c.a aVar3 = (com.google.android.libraries.search.assistant.invocation.o.c.a) hVar105.a();
                hVar106 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.b.c(aVar3, (ag) hVar106.a());
            case 159:
                izVar147 = this.b.b;
                hVar107 = izVar147.eN;
                e.a b12 = e.c.c.b(hVar107);
                hVar108 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.i.c(b12, (ag) hVar108.a());
            case 160:
                izVar148 = this.b.b;
                return com.google.android.apps.search.assistant.surfaces.voice.e.d.a.f(izVar148.cU());
            case 161:
                izVar149 = this.b.b;
                hVar109 = izVar149.eP;
                e.a b13 = e.c.c.b(hVar109);
                hVar110 = this.f310a.Q;
                ag agVar10 = (ag) hVar110.a();
                hVar111 = this.b.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.j.d(b13, agVar10, e.c.c.b(hVar111));
            case 162:
                izVar150 = this.b.b;
                return com.google.android.apps.search.assistant.surfaces.voice.e.d.a.b(izVar150.cV());
            case 163:
                izVar151 = this.b.b;
                hVar112 = izVar151.eR;
                e.a b14 = e.c.c.b(hVar112);
                hVar113 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.o.c(b14, (ag) hVar113.a());
            case 164:
                return new com.google.android.libraries.search.assistant.aq.k.a();
            case 165:
                jrVar16 = this.f310a.b;
                com.google.android.libraries.search.assistant.invocation.s.c.b hL = jrVar16.hL();
                hVar114 = this.f310a.f;
                Context context7 = (Context) hVar114.a();
                izVar152 = this.b.b;
                hVar115 = izVar152.eT;
                e.a b15 = e.c.c.b(hVar115);
                jo joVar7 = this.f310a;
                ik ikVar15 = this.b;
                com.google.android.libraries.search.assistant.y.a.l jK2 = joVar7.jK();
                izVar153 = ikVar15.b;
                hVar116 = izVar153.aC;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.a aVar4 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.a) hVar116.a();
                izVar154 = this.b.b;
                hVar117 = izVar154.B;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.d dVar2 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.d) hVar117.a();
                hVar118 = this.f310a.Q;
                ag agVar11 = (ag) hVar118.a();
                hVar119 = this.f310a.bo;
                ag agVar12 = (ag) hVar119.a();
                izVar155 = this.b.b;
                hVar120 = izVar155.aj;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.f fVar4 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.f) hVar120.a();
                izVar156 = this.b.b;
                boolean gN = izVar156.gN();
                izVar157 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.q.i(hL, context7, b15, jK2, aVar4, dVar2, agVar11, agVar12, fVar4, gN, izVar157.gO());
            case 166:
                izVar158 = this.b.b;
                return com.google.android.apps.search.assistant.surfaces.voice.e.d.a.e(izVar158.cW());
            case 167:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.a();
            case 168:
                izVar159 = this.b.b;
                return com.google.android.apps.search.assistant.surfaces.voice.e.g.m.b(izVar159.nQ());
            case 169:
                return new lt(this);
            case 170:
                izVar160 = this.b.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.g.r(izVar160.gP());
            case 171:
                hVar121 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ah.b((ag) hVar121.a());
            case 172:
                izVar161 = this.b.b;
                hVar122 = izVar161.ah;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.c cVar5 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.c) hVar122.a();
                hVar123 = this.f310a.ez;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ab.a(cVar5, (com.google.common.v.f) hVar123.a());
            case 173:
                izVar162 = this.b.b;
                hVar124 = izVar162.i;
                e.a b16 = e.c.c.b(hVar124);
                hVar125 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.c.b(b16, (ag) hVar125.a());
            case 174:
                hVar126 = this.b.P;
                com.google.android.libraries.search.l.p pVar2 = (com.google.android.libraries.search.l.p) hVar126.a();
                hVar127 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.aa.c(pVar2, (ag) hVar127.a());
            case 175:
                hVar128 = this.b.iF;
                e.a b17 = e.c.c.b(hVar128);
                hVar129 = this.f310a.Q;
                ag agVar13 = (ag) hVar129.a();
                jyVar = this.f310a.f319a;
                hVar130 = jyVar.gY;
                jrVar17 = this.f310a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ad.c(b17, agVar13, hVar130, jrVar17.h(), this.b.uY());
            case 176:
                jo joVar8 = this.f310a;
                com.google.android.libraries.search.assistant.y.a.l jK3 = joVar8.jK();
                hVar131 = joVar8.Q;
                ag agVar14 = (ag) hVar131.a();
                hVar132 = this.f310a.g;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.s.b(jK3, agVar14, (com.google.android.libraries.g.a) hVar132.a());
            case 177:
                hVar133 = this.f310a.Q;
                ag agVar15 = (ag) hVar133.a();
                izVar163 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.af bP2 = izVar163.bP();
                izVar164 = this.b.b;
                hVar134 = izVar164.aE;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.w.c(agVar15, bP2, (com.google.android.apps.search.assistant.surfaces.voice.e.j.e) hVar134.a());
            case 178:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.j.e();
            case 179:
                izVar165 = this.b.b;
                hVar135 = izVar165.fe;
                com.google.android.libraries.search.assistant.aq.c.a aVar5 = (com.google.android.libraries.search.assistant.aq.c.a) hVar135.a();
                hVar136 = this.f310a.Q;
                ag agVar16 = (ag) hVar136.a();
                ik ikVar16 = this.b;
                boolean uh2 = ikVar16.uh();
                hVar137 = ikVar16.cF;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.h.d(aVar5, agVar16, uh2, (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar137.a());
            case 180:
                return new iw();
            case 181:
                izVar166 = this.b.b;
                hVar138 = izVar166.aj;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.y.a((com.google.android.apps.search.assistant.surfaces.voice.e.j.f) hVar138.a());
            case 182:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.t.a();
            case 183:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ai.a();
            case 184:
                hVar139 = this.b.be;
                e.a b18 = e.c.c.b(hVar139);
                hVar140 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.d.b(b18, (ag) hVar140.a());
            case 185:
                hVar141 = this.b.be;
                e.a b19 = e.c.c.b(hVar141);
                hVar142 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.e.c(b19, (ag) hVar142.a());
            case 186:
                izVar167 = this.b.b;
                hVar143 = izVar167.fl;
                lt ltVar9 = (lt) hVar143.a();
                hVar144 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.f.c(ltVar9, (ag) hVar144.a());
            case 187:
                return new lt(this);
            case 188:
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.r.a();
            case 189:
                hVar145 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.u.b((ag) hVar145.a());
            case 190:
                izVar168 = this.b.b;
                hVar146 = izVar168.ak;
                com.google.android.apps.search.assistant.surfaces.voice.e.j.e eVar5 = (com.google.android.apps.search.assistant.surfaces.voice.e.j.e) hVar146.a();
                hVar147 = this.f310a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.e.e.ae.b(eVar5, (ag) hVar147.a());
            case 191:
                ik ikVar17 = this.b;
                long p = ikVar17.p();
                long q = ikVar17.q();
                hVar148 = ikVar17.jB;
                com.google.android.apps.search.assistant.surfaces.voice.e.e.ag.c cVar6 = (com.google.android.apps.search.assistant.surfaces.voice.e.e.ag.c) hVar148.a();
                hVar149 = this.b.ba;
                com.google.android.libraries.search.b.b bVar7 = (com.google.android.libraries.search.b.b) hVar149.a();
                izVar169 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.t.a.a.a.a.a.a cE = izVar169.cE();
                hVar150 = this.f310a.H;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar150.a();
                hVar151 = this.f310a.bo;
                return new com.google.android.apps.search.assistant.surfaces.voice.t.a.a.a.e(p, q, cVar6, bVar7, cE, scheduledExecutorService, (ag) hVar151.a());
            case 192:
                return new lt(this);
            case 193:
                jrVar18 = this.f310a.b;
                hVar152 = jrVar18.gp;
                Executor executor2 = (Executor) hVar152.a();
                izVar170 = this.b.b;
                hVar153 = izVar170.eH;
                lt ltVar10 = (lt) hVar153.a();
                ik ikVar18 = this.b;
                jo joVar9 = this.f310a;
                bw hQ = ikVar18.hQ();
                hVar154 = joVar9.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar154.a();
                jjVar9 = this.b.f308a;
                com.google.android.libraries.search.assistant.p.a.c.j et = jjVar9.et();
                izVar171 = this.b.b;
                r bG = izVar171.bG();
                izVar172 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.h bF = izVar172.bF();
                izVar173 = this.b.b;
                hVar155 = izVar173.aG;
                e.a b20 = e.c.c.b(hVar155);
                hVar156 = this.b.cK;
                e.a b21 = e.c.c.b(hVar156);
                izVar174 = this.b.b;
                hVar157 = izVar174.aH;
                e.a b22 = e.c.c.b(hVar157);
                izVar175 = this.b.b;
                hVar158 = izVar175.fu;
                com.google.android.apps.search.assistant.surfaces.voice.e.i.c.g gVar2 = (com.google.android.apps.search.assistant.surfaces.voice.e.i.c.g) hVar158.a();
                izVar176 = this.b.b;
                hVar159 = izVar176.fv;
                lt ltVar11 = (lt) hVar159.a();
                izVar177 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.d bE = izVar177.bE();
                hVar160 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar8 = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar160.a();
                izVar178 = this.b.b;
                hVar161 = izVar178.fr;
                e.a b23 = e.c.c.b(hVar161);
                jrVar19 = this.f310a.b;
                hVar162 = jrVar19.go;
                com.google.android.libraries.web.contrib.l.b bVar9 = (com.google.android.libraries.web.contrib.l.b) hVar162.a();
                jjVar10 = this.b.f308a;
                boolean qe = jjVar10.qe();
                izVar179 = this.b.b;
                boolean lE = izVar179.lE();
                ik ikVar19 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.b.a aX = ikVar19.aX();
                izVar180 = ikVar19.b;
                boolean gQ = izVar180.gQ();
                izVar181 = this.b.b;
                com.google.android.apps.search.assistant.surfaces.voice.shared.b.e cu = izVar181.cu();
                izVar182 = this.b.b;
                com.google.protobuf.ao di = izVar182.di();
                hVar163 = this.f310a.Q;
                ag agVar17 = (ag) hVar163.a();
                izVar183 = this.b.b;
                boolean gR = izVar183.gR();
                hVar164 = this.b.cF;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar164.a();
                izVar184 = this.b.b;
                return new bf(executor2, ltVar10, hQ, aVar6, et, bG, bF, b20, b21, b22, gVar2, ltVar11, bE, bVar8, b23, bVar9, qe, lE, aX, gQ, cu, di, agVar17, gR, aeVar2, izVar184.gS());
            case 194:
                ik ikVar20 = this.b;
                gy l3 = ha.l(2);
                izVar185 = ikVar20.b;
                l3.h(izVar185.P());
                izVar186 = this.b.b;
                l3.j(izVar186.gz());
                return l3.g();
            case 195:
                hVar165 = this.f310a.Q;
                return new com.google.android.libraries.search.assistant.n.a.a.b.a.b((ag) hVar165.a(), this.b.iL());
            case 196:
                return com.google.android.apps.search.assistant.surfaces.voice.e.i.b.a.c(this.b.qg());
            case 197:
                return new lt(this);
            case 198:
                return new lt(this);
            case 199:
                return new lt(this);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.c;
        switch (i) {
            case 200:
                return ha.w(new com.google.android.apps.search.assistant.surfaces.voice.ui.input.b.c.a.a(), new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.longpresspower.a.a(), new com.google.android.apps.search.assistant.surfaces.voice.handsfree.b.a(), new bj(), new com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b(), new com.google.android.apps.search.assistant.surfaces.voice.handsfree.d.c(), new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.b[]{this.b.b.cm(), this.b.b.cD()});
            case 201:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.o(this.b.b.bN(), (ag) this.f310a.Q.a());
            case 202:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.ai((Context) this.f310a.f.a(), (AccountId) this.b.g.a(), (com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.ad) this.b.b.aK.a(), this.f310a.b.R(), Optional.of(this.b.b.cC()), Optional.of(this.b.b.cA()), (ag) this.f310a.Q.a(), this.b.b.cy());
            case 203:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.ad((AccountId) this.b.g.a(), this.b.b.gu());
            case 204:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.a.d.b((n) this.b.b.aJ.a());
            case 205:
                return new n((com.google.android.apps.search.assistant.surfaces.voice.ui.host.c.a) this.b.b.aI.a(), (KeyguardManager) this.f310a.nn.a(), this.f310a.I());
            case 206:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.c.a((com.google.android.libraries.search.d.x.e.d) this.f310a.vh.a(), this.b.b.x());
            case 207:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.g(com.google.android.apps.search.assistant.surfaces.voice.ui.b.c.a, com.google.android.apps.search.assistant.surfaces.voice.ui.b.b.a);
            case 208:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.f.d.b((n) this.b.b.aJ.a());
            case 209:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.h.d.b((n) this.b.b.aJ.a());
            case 210:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.g(com.google.android.apps.search.assistant.surfaces.voice.ui.i.c.a, com.google.android.apps.search.assistant.surfaces.voice.ui.i.b.a);
            case 211:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.j.a();
            case 212:
                ((n) this.b.b.aJ.a()).getClass();
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.g(com.google.android.apps.search.assistant.surfaces.voice.ui.j.c.a, com.google.android.apps.search.assistant.surfaces.voice.ui.j.b.a);
            case 213:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.input.j.b((n) this.b.b.aJ.a(), this.b.b.gT());
            case 214:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.intentplateholder.n.b((n) this.b.b.aJ.a());
            case 215:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.aa.a();
            case 216:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.g(com.google.android.apps.search.assistant.surfaces.voice.ui.k.c.a, com.google.android.apps.search.assistant.surfaces.voice.ui.k.b.a);
            case 217:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.l.d.b((n) this.b.b.aJ.a());
            case 218:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.m.l.b((n) this.b.b.aJ.a());
            case 219:
                return com.google.android.apps.search.assistant.surfaces.voice.lockscreen.a.b.d.a();
            case 220:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.o.d.a();
            case 221:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.g(com.google.android.apps.search.assistant.surfaces.voice.ui.responsewithembedding.p.a, com.google.android.apps.search.assistant.surfaces.voice.ui.responsewithembedding.o.a);
            case 222:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.p.d.b((n) this.b.b.aJ.a());
            case 223:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.q.d.b((n) this.b.b.aJ.a());
            case 224:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.r.d.b((n) this.b.b.aJ.a());
            case 225:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.voicesearchblocker.i.b((n) this.b.b.aJ.a());
            case 226:
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.aa((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) this.f310a.sZ.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) this.b.i.a(), this.f310a.fG());
            case 227:
                return new bt(this, 2);
            case 228:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.r(this.f310a.v());
            case 229:
                return new com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.f(e.c.c.b(this.f310a.jO), (ax) this.f310a.iv.a());
            case 230:
                return new com.google.android.apps.search.assistant.surfaces.voice.growth.c.o((com.google.android.libraries.search.assistant.aj.d.b.e) this.b.qv(), (com.google.common.v.f) this.f310a.ez.a(), (Executor) this.f310a.H.a());
            case 231:
                com.google.android.libraries.search.assistant.aj.d.b.e eVar = (com.google.android.libraries.search.assistant.aj.d.b.e) this.b.ek.a();
                Context context = (Context) this.f310a.f.a();
                jo joVar = this.f310a;
                ik ikVar = this.b;
                com.google.android.libraries.search.assistant.y.a.l jK = joVar.jK();
                com.google.android.apps.search.assistant.surfaces.voice.growth.c.o oVar = (com.google.android.apps.search.assistant.surfaces.voice.growth.c.o) ikVar.b.aN.a();
                boolean c = h.a.a.d.a.a.c.c(this.f310a.V);
                boolean e = h.a.a.d.a.a.c.e(this.f310a.V);
                boolean m = this.b.f308a.sa().m();
                ik ikVar2 = this.b;
                boolean gW = ikVar2.b.gW();
                long k = ikVar2.f308a.sa().k();
                long l = this.b.f308a.sa().l();
                ik ikVar3 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.longpresspower.b.d(eVar, context, jK, oVar, c, e, m, gW, k, l, ikVar3.b.B(), ikVar3.b.C(), ikVar3.b.G(), ikVar3.b.b());
            case 232:
                AccountId accountId = (AccountId) this.b.g.a();
                Context context2 = (Context) this.f310a.f.a();
                com.google.android.libraries.search.assistant.at.a.a.h hVar = (com.google.android.libraries.search.assistant.at.a.a.h) this.b.m.a();
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) this.f310a.bq.a();
                com.google.android.apps.search.assistant.platform.g.k.a.j jVar = (com.google.android.apps.search.assistant.platform.g.k.a.j) this.f310a.lx.a();
                ik ikVar4 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.growth.b.h(accountId, context2, hVar, dVar, jVar, ikVar4.b.bV(), ((com.google.apps.tiktok.experiments.e) ikVar4.b.fF().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45417648").f(), ((com.google.apps.tiktok.experiments.e) this.b.b.fF().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45419957").e(), this.b.b.fY());
            case 233:
                return this.b.kf().a(com.google.android.apps.search.assistant.surfaces.voice.growth.b.a.f.a(), (j) this.f310a.w.a());
            case 234:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.b.f((Executor) this.f310a.H.a(), (ag) this.f310a.Q.a(), (com.google.android.libraries.storage.protostore.cg) this.b.b.aQ.a(), this.b.b.c());
            case 235:
                return this.b.kf().a(com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.b.g.a(), (j) this.f310a.w.a());
            case 236:
                Context context3 = (Context) this.f310a.f.a();
                ik ikVar5 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.lockscreenblocker.b(context3, ikVar5.b.bM(), ikVar5.b.db(), ikVar5.b.dc(), ikVar5.b.dd());
            case 237:
                return this.b.kf().a(com.google.android.libraries.search.assistant.bb.e.a.b.b.e.a(), (j) this.f310a.w.a());
            case 238:
                boolean k2 = this.b.f308a.rY().k();
                iz izVar = this.b.b;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.h.e.a(k2, izVar.aU, izVar.aV);
            case 239:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.h.d((ag) this.f310a.Q.a(), (com.google.android.libraries.assistant.c.b.c.af) this.b.b.aT.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.b.b.l) this.b.cQ.a(), this.b.aX());
            case 240:
                return new com.google.android.libraries.assistant.c.b.c.af(this.b.qh());
            case 241:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.h.a();
            case 242:
                ik ikVar6 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.c(ikVar6.b.bS(), e.c.c.b(ikVar6.f308a.fr), e.c.c.b(this.b.b.bc), e.c.c.b(this.b.cP), e.c.c.b(this.b.cR), new h.a.a.f.b.a.k(this.b.l).h(), this.b.f308a.rZ().m());
            case 243:
                com.google.android.apps.search.assistant.surfaces.voice.l.a.a.d dVar2 = (com.google.android.apps.search.assistant.surfaces.voice.l.a.a.d) this.b.b.aW.a();
                ik ikVar7 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.l.e.d ca = ikVar7.b.ca();
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar3 = (com.google.android.apps.search.assistant.platform.g.k.a.d) ikVar7.Z.a();
                com.google.android.apps.search.assistant.surfaces.voice.l.b.a aVar = (com.google.android.apps.search.assistant.surfaces.voice.l.b.a) this.b.b.aX.a();
                ik ikVar8 = this.b;
                return new ah(dVar2, ca, dVar3, aVar, ikVar8.aM(), ikVar8.b.bZ(), (com.google.android.apps.search.assistant.surfaces.voice.l.c.a.z) ikVar8.b.bb.a(), at.k(this.f310a.b.ai()));
            case 244:
                return new com.google.android.apps.search.assistant.surfaces.voice.l.a.a.d(this.b.f308a.aw());
            case 245:
                return this.b.kf().a(com.google.android.apps.search.assistant.surfaces.voice.l.e.e.a(), (j) this.f310a.w.a());
            case 246:
                return new com.google.android.apps.search.assistant.surfaces.voice.l.b.c((ay) this.f310a.iu.a());
            case 247:
                lt ltVar = (lt) this.b.b.aY.a();
                lt ltVar2 = (lt) this.b.b.aZ.a();
                com.google.android.apps.search.assistant.surfaces.voice.l.b.a aVar2 = (com.google.android.apps.search.assistant.surfaces.voice.l.b.a) this.b.b.aX.a();
                ik ikVar9 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.l.c.a.z(ltVar, ltVar2, aVar2, ikVar9.aM(), (com.google.android.apps.search.assistant.surfaces.voice.l.c.a.ai) ikVar9.b.ba.a(), this.b.b.dj());
            case 248:
                return new lt(this);
            case 249:
                return new lt(this);
            case 250:
                return new com.google.android.apps.search.assistant.surfaces.voice.l.c.a.ai((com.google.android.libraries.search.t.i.y) this.f310a.W.a(), (ci) this.f310a.ft.a(), (String) this.f310a.Y.a());
            case 251:
                return new bz(this, 2);
            case 252:
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.e(this.b.aj);
            case 253:
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.f((com.google.android.apps.search.assistant.surfaces.voice.growth.onboarding.longpresspower.b.d) this.b.b.aO.a(), this.b.b.hm(), e.c.c.b(this.f310a.ta));
            case 254:
                Optional of = Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ai.v) this.b.bY.a());
                e.a b = e.c.c.b(this.b.b.bg);
                ik ikVar10 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.h(of, b, ikVar10.b.hn(), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) ikVar10.aO.a());
            case 255:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.e.b(Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ai.v) this.b.bY.a()), e.c.c.b(this.b.bZ), this.b.f308a.bb());
            case 256:
                Optional of2 = Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ai.v) this.b.bY.a());
                e.a b2 = e.c.c.b(this.b.b.bg);
                ik ikVar11 = this.b;
                jo joVar2 = this.f310a;
                boolean hn = ikVar11.b.hn();
                Context context4 = (Context) joVar2.f.a();
                ik ikVar12 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.i(of2, b2, hn, context4, ikVar12.b.hh(), ikVar12.b.cz());
            case 257:
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.p.a;
            case 258:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.i(this.b.b.ho(), 2);
            case 259:
                Context context5 = (Context) this.f310a.f.a();
                ik ikVar13 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.g(context5, ikVar13.b.hh(), ikVar13.b.cz());
            case 260:
                ik ikVar14 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.d(ikVar14.b.hp(), ikVar14.b.cp(), 2);
            case 261:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.f(this.b.b.bJ(), 2);
            case 262:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.i(this.b.b.hK(), 0);
            case 263:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.i(this.b.b.hL(), 1);
            case 264:
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.d((com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.c) this.b.b.bd.a(), this.b.b.hM());
            case 265:
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.j(this.f310a.b.fH, this.b.b.hN());
            case 266:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.f(this.b.aB(), 3);
            case 267:
                ik ikVar15 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.c(ikVar15.f308a.fv, ikVar15.b.hO());
            case 268:
                ik ikVar16 = this.b;
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.bs.k(ikVar16.f308a.fv, ikVar16.b.hP());
            case 269:
                this.b.b.hB();
                return com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.p.b;
            case 270:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.f(this.b.b.bJ(), 1);
            case 271:
                return new com.google.android.apps.search.assistant.surfaces.voice.k.c(Optional.empty(), Optional.empty());
            case 272:
                e.a b3 = e.c.c.b(this.b.b.bx);
                ik ikVar17 = this.b;
                e.a b4 = e.c.c.b(ikVar17.b.w);
                e.a b5 = e.c.c.b(ikVar17.b.by);
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) this.b.cF.a();
                ag agVar = (ag) this.f310a.Q.a();
                ik ikVar18 = this.b;
                return new ce(b3, b4, b5, aeVar, agVar, ikVar18.b.id(), ikVar18.b.ie(), ikVar18.f308a.rZ().n());
            case 273:
                return new t((com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.a) this.b.b.bx.a(), this.f310a.b.az());
            case 274:
                return this.b.kg().a(com.google.android.apps.search.assistant.surfaces.voice.robin.ah.l.a(), (j) this.f310a.w.a());
            case 275:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45374428").b());
            case 276:
                return new cs((Optional) this.b.b.bB.a, Optional.empty(), (com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.s) this.b.b.bC.a(), this.b.b.cx(), new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.h(), (AudioManager) this.f310a.cZ.a(), (com.google.android.libraries.search.assistant.aa.c.a.a) this.b.b.bD.a(), (m.c.n) this.f310a.R.a(), this.b.b.fG().a(), this.f310a.b.eN().a(), (m.c.n) this.f310a.P.a(), Optional.of(this.f310a.jK()), Optional.empty(), Optional.of((com.google.android.apps.search.assistant.surfaces.c.b.a.a) this.f310a.b.gR.a()));
            case 277:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.s(Optional.empty(), Optional.empty(), (ag) this.f310a.bo.a());
            case 278:
                return new com.google.android.libraries.search.assistant.aa.c.a.a((Context) this.f310a.f.a());
            case 279:
                return new com.google.android.apps.search.assistant.platform.appintegration.g.a.a.d((AccountId) this.b.g.a(), this.b.b.cK(), (cr) this.f310a.H.a(), this.b.b.nI());
            case 280:
                Optional optional = (Optional) this.b.b.bH.a();
                Optional optional2 = (Optional) this.b.b.bJ.a();
                iz izVar2 = this.b.b;
                Optional optional3 = (Optional) izVar2.bB.a;
                com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.s sVar = (com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.s) izVar2.bC.a();
                com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.d dVar4 = (com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.d) this.b.b.bK.a();
                ik ikVar19 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.bd(optional, optional2, optional3, sVar, dVar4, ikVar19.b.nK(), ikVar19.b.cx(), (m.c.n) this.f310a.R.a(), this.b.b.fG().a(), this.f310a.b.eN().a(), (com.google.android.libraries.search.assistant.aa.e.b.a.a) this.b.b.bL.a(), this.b.b.dl());
            case 281:
                return Optional.of((com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.n) this.b.b.bG.a());
            case 282:
                com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.n b6 = com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.o.b(this.b.b.fH());
                b6.getClass();
                return b6;
            case 283:
                return Optional.of((com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.l) this.b.b.bI.a());
            case 284:
                com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.l a2 = com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.o.a(this.b.b.fH());
                a2.getClass();
                return a2;
            case 285:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.a.a.d();
            case 286:
                this.b.b.nC();
                return new com.google.android.libraries.search.assistant.aa.e.b.a.a();
            case 287:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.al.w((String) this.f310a.Y.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f310a.b.o.a());
            case 288:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45413959").f());
            case 289:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45630368").f());
            case 290:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45634071").f());
            case 291:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45651237").f());
            case 292:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.j.s.b((Context) this.f310a.f.a());
            case 293:
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f310a.g.a();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.f310a.lj.a();
                cq cqVar = (cq) this.f310a.H.a();
                jo joVar3 = this.f310a;
                return com.google.android.apps.search.assistant.surfaces.settings.features.communication.a.g.a(aVar3, extensionRegistryLite, cqVar, joVar3.mx(), joVar3.md(), ca.C(), this.b.ye());
            case 294:
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) this.f310a.g.a();
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) this.f310a.lj.a();
                cq cqVar2 = (cq) this.f310a.H.a();
                jo joVar4 = this.f310a;
                return com.google.android.apps.search.assistant.surfaces.settings.features.communication.a.h.a(aVar4, extensionRegistryLite2, cqVar2, joVar4.mx(), joVar4.md(), ca.C(), this.b.ye());
            case 295:
                jo joVar5 = this.f310a;
                return new com.google.android.apps.search.assistant.surfaces.settings.features.entrypointcontrols.a.c((com.google.android.apps.search.assistant.platform.g.g.b.k) joVar5.VF(), (com.google.android.apps.search.assistant.platform.g.i.k) joVar5.b.fH.a(), this.b.f308a.V());
            case 296:
                return this.b.kf().a(com.google.android.apps.search.assistant.surfaces.settings.features.hotwordsensitivity.a.c.a(), (j) this.f310a.w.a());
            case 297:
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) this.f310a.g.a();
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) this.f310a.lj.a();
                cq cqVar3 = (cq) this.f310a.H.a();
                jo joVar6 = this.f310a;
                return com.google.android.apps.search.assistant.surfaces.settings.features.language.n.b(aVar5, extensionRegistryLite3, cqVar3, joVar6.mx(), joVar6.md(), ca.C(), this.b.ye());
            case 298:
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) this.f310a.g.a();
                ExtensionRegistryLite extensionRegistryLite4 = (ExtensionRegistryLite) this.f310a.lj.a();
                cq cqVar4 = (cq) this.f310a.H.a();
                jo joVar7 = this.f310a;
                return com.google.android.apps.search.assistant.surfaces.settings.features.people.a.a.l.c(aVar6, extensionRegistryLite4, cqVar4, joVar7.mx(), joVar7.md(), com.google.android.apps.search.assistant.surfaces.settings.features.people.a.a.l.b(), this.b.ye());
            case 299:
                return this.b.kf().a(com.google.android.apps.search.assistant.surfaces.settings.features.personalization.a.b.a(), (j) this.f310a.w.a());
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        com.google.android.libraries.assistant.c.e.a.c.g anVar;
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
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f310a.g.a();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.f310a.lj.a();
                cq cqVar = (cq) this.f310a.H.a();
                jo joVar = this.f310a;
                com.google.apps.tiktok.cache.ab mx = joVar.mx();
                com.google.android.libraries.storage.c.e md = joVar.md();
                com.google.apps.tiktok.cache.p a2 = com.google.apps.tiktok.cache.q.a();
                a2.e(com.google.android.apps.search.assistant.surfaces.settings.features.privacyadvisor.a.b.a);
                a2.c(1);
                anVar = new com.google.apps.tiktok.cache.an(new com.google.apps.tiktok.cache.a(this.b.ye()), "SqliteKeyValueCache:PrivacyAdvisorSettingsDataCache", -1, aVar, extensionRegistryLite, md, mx, cqVar, a2.a());
                break;
            case 301:
                ik ikVar = this.b;
                com.google.android.apps.search.assistant.platform.g.n.e I = ikVar.f308a.I();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.n nVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.n) ikVar.b.ca.a();
                com.google.android.apps.search.assistant.surfaces.voice.j.b.c.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.c.k) this.b.b.cb.a();
                boolean f = ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.user 45417227").f();
                com.google.android.apps.search.assistant.platform.g.c.g gVar = (com.google.android.apps.search.assistant.platform.g.c.g) this.b.ah.a();
                boolean a3 = h.a.a.f.b.a.i.a(this.b.l);
                ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.user 45375275").f();
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.q.a.l(I, nVar, kVar, f, gVar, a3, ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.user 45378784").f(), (ag) this.f310a.Q.a());
                break;
            case 302:
                ag agVar = (ag) this.f310a.Q.a();
                ik ikVar2 = this.b;
                jo joVar2 = this.f310a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR = ikVar2.aR();
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) joVar2.sZ.a();
                ik ikVar3 = this.b;
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.j.b.c.f(agVar, aR, bVar, ikVar3.aU(), ikVar3.aS(), ikVar3.b.fO(), ikVar3.b.il(), ikVar3.b.im(), ikVar3.b.in(), ikVar3.b.io(), (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) ikVar3.i.a(), (lt) this.b.f308a.fu.a(), (com.google.android.apps.search.assistant.platform.g.g.b.c) this.b.aj.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) this.f310a.b.jP.a(), this.b.b.ip());
                break;
            case 303:
                ag agVar2 = (ag) this.f310a.Q.a();
                ik ikVar4 = this.b;
                jo joVar3 = this.f310a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR2 = ikVar4.aR();
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) joVar3.sZ.a();
                ik ikVar5 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.d.s aU = ikVar5.aU();
                com.google.android.apps.search.assistant.surfaces.voice.j.a.d.m aS = ikVar5.aS();
                lt ltVar = (lt) ikVar5.cO.a();
                ik ikVar6 = this.b;
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.j.b.c.k(agVar2, aR2, bVar2, aU, aS, ltVar, ikVar6.b.fO(), ikVar6.b.il(), ikVar6.b.im(), ikVar6.b.in(), ikVar6.b.io(), (com.google.android.apps.search.assistant.platform.g.g.b.c) ikVar6.aj.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) this.f310a.b.jP.a(), this.b.b.ip());
                break;
            case 304:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "SharedDeviceQuickPhrasesSettingsData";
                ba createBuilder = com.google.android.apps.search.assistant.surfaces.settings.features.quickphrases.af.a.createBuilder();
                createBuilder.getClass();
                a4.c = bc.a(createBuilder);
                anVar = this.b.kf().a(a4.a(), (j) this.f310a.w.a());
                break;
            case 305:
                anVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45642626").f());
                break;
            case 306:
                com.google.apps.tiktok.q.b.g a5 = com.google.apps.tiktok.q.b.h.a();
                a5.f5883a = "StructureSettingsStoreData";
                a5.c(com.google.android.apps.search.assistant.surfaces.settings.features.structure.m.a);
                anVar = this.b.kf().a(a5.a(), (j) this.f310a.w.a());
                break;
            case 307:
                anVar = new bl((ScheduledExecutorService) this.f310a.H.a(), (ag) this.f310a.Q.a(), (com.google.common.v.f) this.f310a.ez.a(), (com.google.android.libraries.storage.protostore.cg) this.b.b.cg.a(), (com.google.android.libraries.search.assistant.at.a.a.h) this.b.m.a());
                break;
            case 308:
                com.google.apps.tiktok.q.b.g a6 = com.google.apps.tiktok.q.b.h.a();
                a6.f5883a = "VoiceMatchSharedDevicesSettingsData";
                ba createBuilder2 = br.a.createBuilder();
                createBuilder2.getClass();
                a6.c = cv.d(createBuilder2);
                anVar = this.b.kf().a(a6.a(), (j) this.f310a.w.a());
                break;
            case 309:
                com.google.apps.tiktok.q.b.g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "VoiceSelectionSettingsData";
                ba createBuilder3 = com.google.android.apps.search.assistant.surfaces.settings.features.voiceselection.a.t.a.createBuilder();
                createBuilder3.getClass();
                a7.c = com.google.android.apps.search.assistant.surfaces.settings.features.voiceselection.a.u.a(createBuilder3);
                anVar = this.b.kf().a(a7.a(), (j) this.f310a.w.a());
                break;
            case 310:
                anVar = new com.google.android.libraries.elements.converters.i.a.e();
                break;
            case 311:
                com.google.apps.tiktok.q.b.g a8 = com.google.apps.tiktok.q.b.h.a();
                a8.f5883a = "OneLearningCenterData";
                a8.c(com.google.g.x.a.l.a);
                anVar = this.b.kf().a(a8.a(), (j) this.f310a.w.a());
                break;
            case 312:
                anVar = new k((ay) this.f310a.iu.a(), (ag) this.f310a.Q.a(), (cr) this.f310a.H.a());
                break;
            case 313:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.zerostate.ax();
                break;
            case 314:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.o.z();
                break;
            case 315:
                com.google.android.libraries.logging.ve.u uVar = (com.google.android.libraries.logging.ve.u) this.f310a.qn.a();
                boolean f2 = ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45623548").f();
                this.f310a.b.hW();
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.x.bd(uVar, f2);
                break;
            case 316:
                com.google.apps.tiktok.q.b.g a9 = com.google.apps.tiktok.q.b.h.a();
                a9.f5883a = "SuggestionDataStore";
                ba createBuilder4 = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.zerostate.a.b.a.createBuilder();
                createBuilder4.getClass();
                a9.c = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.zerostate.a.c.a(createBuilder4);
                anVar = this.b.kf().a(a9.a(), (j) this.f310a.w.a());
                break;
            case 317:
                com.google.apps.tiktok.q.b.g a10 = com.google.apps.tiktok.q.b.h.a();
                a10.f5883a = "ImageInputConfig";
                a10.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.imageinput.a.a.a);
                anVar = this.b.kf().a(a10.a(), (j) this.f310a.w.a());
                break;
            case 318:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.aa.a();
                break;
            case 319:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.aa.c.a((Context) this.f310a.f.a(), ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45647899").d());
                break;
            case 320:
                ik ikVar7 = this.b;
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.floaty.orchestrator.impl.ad(ikVar7.b.dp(), (com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d) ikVar7.f308a.Q.a(), (ag) this.f310a.Q.a());
                break;
            case 321:
                anVar = new ls();
                break;
            case 322:
                anVar = new lt(this);
                break;
            case 323:
                com.google.apps.tiktok.q.b.g a11 = com.google.apps.tiktok.q.b.h.a();
                a11.f5883a = "ImageGenerationTooltipDisplayedData";
                a11.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.extensions.imagegen.bf.a);
                anVar = this.b.kg().a(a11.a(), (j) this.f310a.w.a());
                break;
            case 324:
                anVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45477217").f());
                break;
            case 325:
                anVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45626338").f());
                break;
            case 326:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45625664").e();
                break;
            case 327:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45628842").e();
                break;
            case 328:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633331").e();
                break;
            case 329:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633332").e();
                break;
            case 330:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633333").e();
                break;
            case 331:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633334").e();
                break;
            case 332:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633335").e();
                break;
            case 333:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633336").e();
                break;
            case 334:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633337").e();
                break;
            case 335:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633338").e();
                break;
            case 336:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633339").e();
                break;
            case 337:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633476").e();
                break;
            case 338:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633477").e();
                break;
            case 339:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633478").e();
                break;
            case 340:
                anVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45651958").b());
                break;
            case 341:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45655334").e();
                break;
            case 342:
                anVar = ((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45651959").e();
                break;
            case 343:
                anVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45653608").b());
                break;
            case 344:
                com.google.android.libraries.storage.protostore.cg cgVar = (com.google.android.libraries.storage.protostore.cg) this.b.b.cQ.a();
                ag agVar3 = (ag) this.f310a.Q.a();
                Executor executor = (Executor) this.f310a.H.a();
                com.google.common.v.f fVar = (com.google.common.v.f) this.f310a.ez.a();
                dj djVar = (dj) this.b.q.a();
                ik ikVar8 = this.b;
                boolean kH = ikVar8.b.kH();
                boolean f3 = ((com.google.apps.tiktok.experiments.e) ikVar8.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45646771").f();
                com.google.android.libraries.logging.ve.u uVar2 = (com.google.android.libraries.logging.ve.u) this.f310a.qn.a();
                iz izVar = this.b.b;
                new cd((dj) izVar.b.q.a(), (com.google.android.libraries.logging.ve.u) izVar.f311a.qn.a(), (com.google.android.libraries.logging.ve.j) izVar.f311a.qm.a(), (com.google.android.libraries.logging.ve.synthetic.l) izVar.f311a.b.kb.a(), izVar.jD());
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.voiceselection.b.k(cgVar, agVar3, executor, fVar, djVar, kH, f3, uVar2);
                break;
            case 345:
                com.google.apps.tiktok.q.b.g a12 = com.google.apps.tiktok.q.b.h.a();
                a12.f5883a = "VoiceSelectionPromotionDataStore";
                a12.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.voiceselection.b.l.a);
                anVar = this.b.kf().a(a12.a(), (j) this.f310a.w.a());
                break;
            case 346:
                ik ikVar9 = this.b;
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.c.a.g(ikVar9.cZ(), ikVar9.b.kS(), ikVar9.b.kR(), ikVar9.b.kT(), ((com.google.apps.tiktok.experiments.e) ikVar9.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45649647").f(), ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45649466").f(), ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45655166").f(), (ag) this.f310a.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.c.g) this.b.bB.a(), this.b.f308a.aq());
                break;
            case 347:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.a.t();
                break;
            case 348:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.a.b.a.f((com.google.common.v.f) this.f310a.ez.a(), (ag) this.f310a.bo.a(), (ag) this.f310a.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d) this.b.f308a.Q.a(), (m.c.n) this.f310a.P.a());
                break;
            case 349:
                com.google.apps.tiktok.q.b.g a13 = com.google.apps.tiktok.q.b.h.a();
                a13.f5883a = "ConditionEvaluatorConfig";
                a13.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.d.a.c.a);
                anVar = this.b.kf().a(a13.a(), (j) this.f310a.w.a());
                break;
            case 350:
                com.google.apps.tiktok.q.b.g a14 = com.google.apps.tiktok.q.b.h.a();
                a14.f5883a = "RobinTooltipDataStore";
                a14.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.r.a.a.a);
                anVar = this.b.kg().a(a14.a(), (j) this.f310a.w.a());
                break;
            case 351:
                com.google.apps.tiktok.q.b.g a15 = com.google.apps.tiktok.q.b.h.a();
                a15.f5883a = "SatisfactionSurveyDataStore";
                ba createBuilder5 = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.common.l.a.a.a.createBuilder();
                createBuilder5.getClass();
                a15.c = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.common.l.a.b.a(createBuilder5);
                anVar = this.b.kg().a(a15.a(), (j) this.f310a.w.a());
                break;
            case 352:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.extensions.linking.s();
                break;
            case 353:
                anVar = new lt(this);
                break;
            case 354:
                anVar = new lt(this);
                break;
            case 355:
                ag agVar4 = (ag) this.f310a.Q.a();
                iz izVar2 = this.b.b;
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.h.w(agVar4, new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.h.d(izVar2.b.df(), (Executor) izVar2.f311a.H.a(), (com.google.android.libraries.g.a) izVar2.f311a.g.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) izVar2.b.bA.a(), izVar2.b.bl()), com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.h.u.b(h.a.a.d.b.a.ae.aa(this.b.l)));
                break;
            case 356:
                com.google.apps.tiktok.q.b.g a16 = com.google.apps.tiktok.q.b.h.a();
                a16.f5883a = "RobinFloatyFreDataStore";
                a16.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.floaty.a.c.a);
                anVar = this.b.kg().a(a16.a(), (j) this.f310a.w.a());
                break;
            case 357:
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.ui.response.a.a();
                break;
            case 358:
                anVar = new iv(this, 2);
                break;
            case 359:
                anVar = new iv(this, 3);
                break;
            case 360:
                ik ikVar10 = this.b;
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.floaty.ui.oobe.input.t(ikVar10.b.cl(), ikVar10.f308a.aN(), (ag) this.f310a.Q.a());
                break;
            case 361:
                ((com.google.apps.tiktok.experiments.e) this.b.b.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45621761").d();
                this.b.cM();
                anVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.d.c((am) this.b.z.a(), (ag) this.f310a.bo.a(), (ag) this.f310a.Q.a(), (com.google.common.v.f) this.f310a.ez.a());
                break;
            case 362:
                com.google.apps.tiktok.q.b.g a17 = com.google.apps.tiktok.q.b.h.a();
                a17.f5883a = "ZeroStateStatusProtoStore";
                a17.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.zerostate.b.l.a);
                anVar = this.b.kf().a(a17.a(), (j) this.f310a.w.a());
                break;
            case 363:
                com.google.apps.tiktok.q.b.g a18 = com.google.apps.tiktok.q.b.h.a();
                a18.f5883a = "VoiceMatchBannerStatusProtoStore";
                a18.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.zerostate.banner.e.q.a);
                anVar = this.b.kf().a(a18.a(), (j) this.f310a.w.a());
                break;
            case 364:
                ik ikVar11 = this.b;
                fu fuVar = nn.a;
                Optional empty = Optional.empty();
                JSControllerInitializationMode jSControllerInitializationMode = JSControllerInitializationMode.DEFAULT;
                if (jSControllerInitializationMode == null) {
                    throw new NullPointerException("Null initializationMode");
                }
                byte[] byteArray = com.google.protos.youtube.javascript.a.a.a.toByteArray();
                if (byteArray == null) {
                    throw new NullPointerException("Null platformDetails");
                }
                iz izVar3 = ikVar11.b;
                com.google.android.libraries.elements.b.d.i iVar = new com.google.android.libraries.elements.b.d.i(jSControllerInitializationMode, byteArray, empty);
                Optional empty2 = Optional.empty();
                Optional empty3 = Optional.empty();
                Optional.empty();
                anVar = new com.google.android.libraries.elements.b.d.j(iVar, izVar3.dh, empty2, fuVar, empty3);
                break;
            case 365:
                anVar = JSModuleCache.create();
                if (anVar == null) {
                    throw new RuntimeException("JS Module Cache not created - was it included in the .so?");
                }
                break;
            case 366:
                anVar = at.k(true);
                break;
            case 367:
                jo joVar4 = this.f310a;
                ik ikVar12 = this.b;
                h hVar = joVar4.H;
                h hVar2 = ikVar12.g;
                jr jrVar = joVar4.b;
                anVar = new com.google.android.libraries.assistant.c.e.a.c.g(hVar, hVar2, jrVar.gQ, joVar4.bN, jrVar.gP, ikVar12.b.bA);
                break;
            default:
                throw new AssertionError(i);
        }
        return anVar;
    }
}
