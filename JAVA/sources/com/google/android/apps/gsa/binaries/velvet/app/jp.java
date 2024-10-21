package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.AlarmManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.session.MediaSessionManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Process;
import android.os.Vibrator;
import androidx.work.bb;
import com.google.android.apps.gsa.assistant.settings.hq.a.g;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.b.a;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.d;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.d.a.f;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.d.a.i;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.df;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dh;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dt;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.f.a.e;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.x;
import com.google.android.apps.gsa.assistant.settings.shared.u;
import com.google.android.apps.gsa.contacts.ba;
import com.google.android.apps.gsa.nga.engine.ac.a.ad;
import com.google.android.apps.gsa.nga.engine.ac.a.z;
import com.google.android.apps.gsa.nga.engine.ae.ab;
import com.google.android.apps.gsa.nga.engine.ak.s.m;
import com.google.android.apps.gsa.nga.engine.ar.b.b.aj;
import com.google.android.apps.gsa.nga.engine.ar.b.s;
import com.google.android.apps.gsa.nga.engine.ar.b.w;
import com.google.android.apps.gsa.nga.engine.bisto.b.y;
import com.google.android.apps.gsa.nga.engine.n.e.ac;
import com.google.android.apps.gsa.nga.engine.n.e.ae;
import com.google.android.apps.gsa.nga.engine.n.e.ai;
import com.google.android.apps.gsa.nga.engine.ui.answer.ak;
import com.google.android.apps.gsa.nga.engine.ui.answer.ap;
import com.google.android.apps.gsa.nga.engine.viss.aa;
import com.google.android.apps.gsa.nga.engine.viss.q;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.am;
import com.google.android.apps.gsa.search.core.ac.v;
import com.google.android.apps.gsa.search.core.as;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.speech.d.j;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.apps.gsa.staticplugins.opa.OpaActivity;
import com.google.android.apps.gsa.staticplugins.opa.ag.b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.l;
import com.google.android.apps.gsa.staticplugins.opa.bg.r;
import com.google.android.apps.gsa.staticplugins.opa.errorui.ax;
import com.google.android.apps.gsa.staticplugins.opa.errorui.br;
import com.google.android.apps.gsa.staticplugins.opa.errorui.cs;
import com.google.android.apps.gsa.staticplugins.opa.fp;
import com.google.android.apps.gsa.staticplugins.opa.fv;
import com.google.android.apps.gsa.staticplugins.opa.fw;
import com.google.android.apps.gsa.staticplugins.opa.gn;
import com.google.android.apps.gsa.staticplugins.opa.hq.o;
import com.google.android.apps.gsa.staticplugins.opa.samson.l.bd;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.ar;
import com.google.android.apps.gsa.staticplugins.opa.util.az;
import com.google.android.apps.gsa.staticplugins.opa.util.bn;
import com.google.android.apps.gsa.staticplugins.settings.k;
import com.google.android.apps.gsa.staticplugins.settings.n;
import com.google.android.apps.gsa.store.tasks.DeleteExpiredContentTask;
import com.google.android.apps.gsa.tasks.al;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.de;
import com.google.android.apps.search.assistant.surfaces.settings.features.entrypointcontrols.t;
import com.google.android.apps.search.assistant.surfaces.voice.robin.x.be;
import com.google.android.apps.search.assistant.verticals.newsplayer.h.ay;
import com.google.android.apps.search.googleapp.activity.GoogleAppActivity;
import com.google.android.apps.search.lens.LensExportedActivity;
import com.google.android.apps.search.lens.LensientActivity;
import com.google.android.apps.search.omnient.host.activity.OmnientActivity;
import com.google.android.apps.search.speechenroll.clickabletext.ClickableText;
import com.google.android.apps.search.weather.WeatherActivity;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;
import com.google.android.libraries.search.assistant.performer.communication.bk;
import com.google.android.libraries.search.assistant.proactive.aq;
import com.google.android.libraries.search.assistant.proactive.ce;
import com.google.android.libraries.search.garbagecollection.jni.NativeGc;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.account.api.controller.ah;
import com.google.apps.tiktok.experiments.phenotype.cp;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.apps.tiktok.tracing.fy;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.base.bu;
import com.google.common.base.ca;
import com.google.common.base.ci;
import com.google.common.o.hy;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ao;
import e.c.c;
import e.c.h;
import j$.time.ZoneId;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.dc;
import org.chromium.net.CronetEngine;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/jp.class */
public final class jp implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f320a;
    private final int b;

    public jp(jo joVar, int i) {
        this.f320a = joVar;
        this.b = i;
    }

    private final Object b() {
        h hVar;
        jy jyVar;
        h hVar2;
        h hVar3;
        h hVar4;
        jy jyVar2;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        jy jyVar3;
        h hVar12;
        jy jyVar4;
        h hVar13;
        h hVar14;
        jy jyVar5;
        h hVar15;
        h hVar16;
        h hVar17;
        jy jyVar6;
        h hVar18;
        h hVar19;
        jy jyVar7;
        jy jyVar8;
        h hVar20;
        jy jyVar9;
        h hVar21;
        jy jyVar10;
        h hVar22;
        h hVar23;
        jy jyVar11;
        h hVar24;
        h hVar25;
        jy jyVar12;
        h hVar26;
        jy jyVar13;
        h hVar27;
        jy jyVar14;
        h hVar28;
        jy jyVar15;
        h hVar29;
        jy jyVar16;
        h hVar30;
        jy jyVar17;
        h hVar31;
        jy jyVar18;
        h hVar32;
        jy jyVar19;
        h hVar33;
        jy jyVar20;
        h hVar34;
        jy jyVar21;
        h hVar35;
        jy jyVar22;
        h hVar36;
        jy jyVar23;
        h hVar37;
        jy jyVar24;
        h hVar38;
        jy jyVar25;
        h hVar39;
        jy jyVar26;
        h hVar40;
        h hVar41;
        jy jyVar27;
        h hVar42;
        jy jyVar28;
        h hVar43;
        jy jyVar29;
        h hVar44;
        h hVar45;
        jy jyVar30;
        h hVar46;
        h hVar47;
        jy jyVar31;
        h hVar48;
        jy jyVar32;
        h hVar49;
        jy jyVar33;
        h hVar50;
        h hVar51;
        h hVar52;
        h hVar53;
        jy jyVar34;
        jy jyVar35;
        h hVar54;
        jy jyVar36;
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
        jy jyVar37;
        jy jyVar38;
        jy jyVar39;
        jy jyVar40;
        jy jyVar41;
        jy jyVar42;
        jy jyVar43;
        jy jyVar44;
        jy jyVar45;
        jy jyVar46;
        jy jyVar47;
        jy jyVar48;
        jy jyVar49;
        jy jyVar50;
        jy jyVar51;
        jy jyVar52;
        jy jyVar53;
        jy jyVar54;
        jy jyVar55;
        jy jyVar56;
        jy jyVar57;
        jy jyVar58;
        jy jyVar59;
        h hVar65;
        jy jyVar60;
        h hVar66;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        h hVar71;
        h hVar72;
        h hVar73;
        h hVar74;
        jy jyVar61;
        h hVar75;
        jy jyVar62;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        jy jyVar63;
        jy jyVar64;
        h hVar80;
        h hVar81;
        h hVar82;
        h hVar83;
        h hVar84;
        h hVar85;
        h hVar86;
        h hVar87;
        jy jyVar65;
        h hVar88;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        jy jyVar66;
        jy jyVar67;
        h hVar94;
        jy jyVar68;
        jy jyVar69;
        jy jyVar70;
        jy jyVar71;
        jy jyVar72;
        h hVar95;
        h hVar96;
        h hVar97;
        h hVar98;
        h hVar99;
        h hVar100;
        h hVar101;
        h hVar102;
        jy jyVar73;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        h hVar107;
        jy jyVar74;
        jy jyVar75;
        jy jyVar76;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        h hVar112;
        h hVar113;
        h hVar114;
        jy jyVar77;
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
        jy jyVar78;
        jy jyVar79;
        jy jyVar80;
        jy jyVar81;
        jy jyVar82;
        jy jyVar83;
        h hVar131;
        h hVar132;
        h hVar133;
        h hVar134;
        h hVar135;
        jy jyVar84;
        jy jyVar85;
        h hVar136;
        h hVar137;
        jy jyVar86;
        jy jyVar87;
        h hVar138;
        jy jyVar88;
        h hVar139;
        h hVar140;
        h hVar141;
        jy jyVar89;
        h hVar142;
        jy jyVar90;
        h hVar143;
        h hVar144;
        h hVar145;
        jy jyVar91;
        h hVar146;
        h hVar147;
        h hVar148;
        jy jyVar92;
        h hVar149;
        h hVar150;
        h hVar151;
        jy jyVar93;
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
        jy jyVar94;
        h hVar162;
        h hVar163;
        jy jyVar95;
        h hVar164;
        jy jyVar96;
        h hVar165;
        jy jyVar97;
        h hVar166;
        h hVar167;
        h hVar168;
        h hVar169;
        h hVar170;
        h hVar171;
        h hVar172;
        jy jyVar98;
        h hVar173;
        jy jyVar99;
        h hVar174;
        h hVar175;
        h hVar176;
        h hVar177;
        h hVar178;
        h hVar179;
        jy jyVar100;
        jy jyVar101;
        jy jyVar102;
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
        jy jyVar103;
        h hVar192;
        jy jyVar104;
        h hVar193;
        h hVar194;
        h hVar195;
        jy jyVar105;
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
        jy jyVar106;
        h hVar207;
        jy jyVar107;
        jy jyVar108;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        h hVar212;
        jy jyVar109;
        h hVar213;
        h hVar214;
        h hVar215;
        h hVar216;
        jy jyVar110;
        h hVar217;
        h hVar218;
        h hVar219;
        jy jyVar111;
        h hVar220;
        jy jyVar112;
        h hVar221;
        h hVar222;
        h hVar223;
        h hVar224;
        h hVar225;
        h hVar226;
        h hVar227;
        h hVar228;
        h hVar229;
        jy jyVar113;
        h hVar230;
        jy jyVar114;
        h hVar231;
        h hVar232;
        int i = this.b;
        switch (i) {
            case 0:
                hVar = this.f320a.oo;
                return new u(c.b(hVar));
            case 1:
                jyVar = this.f320a.f319a;
                hVar2 = jyVar.kh;
                return b.l(c.b(hVar2));
            case 2:
                hVar3 = this.f320a.f;
                Context context = (Context) hVar3.a();
                hVar4 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar233 = (com.google.android.libraries.gsa.h.h) hVar4.a();
                jyVar2 = this.f320a.f319a;
                Object pg = jyVar2.pg();
                hVar5 = this.f320a.gZ;
                as asVar = (as) hVar5.a();
                hVar6 = this.f320a.gq;
                p pVar = (p) hVar6.a();
                hVar7 = this.f320a.hG;
                return new g(context, hVar233, (com.google.android.apps.gsa.assistant.settings.hq.a.h) pg, asVar, pVar, (com.google.android.apps.gsa.shared.logger.b.h) hVar7.a());
            case 3:
                hVar8 = this.f320a.oh;
                return new com.google.android.apps.gsa.search.shared.g.c((at) hVar8.a());
            case 4:
                hVar9 = this.f320a.hG;
                return new a((com.google.android.apps.gsa.shared.logger.b.h) hVar9.a());
            case 5:
                return new com.google.android.apps.gsa.shared.logger.f.a();
            case 6:
                hVar10 = this.f320a.f;
                Context context2 = (Context) hVar10.a();
                hVar11 = this.f320a.gq;
                p pVar2 = (p) hVar11.a();
                jyVar3 = this.f320a.f319a;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.a.a(context2, pVar2, jyVar3.ax());
            case 7:
                hVar12 = this.f320a.f;
                Context context3 = (Context) hVar12.a();
                jyVar4 = this.f320a.f319a;
                hVar13 = jyVar4.f;
                at atVar = (at) hVar13.a();
                hVar14 = this.f320a.gq;
                p pVar3 = (p) hVar14.a();
                jyVar5 = this.f320a.f319a;
                hVar15 = jyVar5.c;
                return new o(context3, atVar, pVar3, (at) hVar15.a());
            case 8:
                hVar16 = this.f320a.f;
                Context context4 = (Context) hVar16.a();
                hVar17 = this.f320a.gq;
                e.a b = c.b(hVar17);
                jyVar6 = this.f320a.f319a;
                hVar18 = jyVar6.kj;
                return b.m(context4, b, c.b(hVar18));
            case 9:
                hVar19 = this.f320a.gq;
                return new com.google.android.apps.gsa.staticplugins.opa.bj.a.a(hVar19);
            case 10:
                jyVar7 = this.f320a.f319a;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dr(jyVar7.t());
            case 11:
                jyVar8 = this.f320a.f319a;
                hVar20 = jyVar8.i;
                jyVar9 = this.f320a.f319a;
                hVar21 = jyVar9.kl;
                jyVar10 = this.f320a.f319a;
                hVar22 = jyVar10.h;
                hVar23 = this.f320a.gq;
                return new dt(hVar20, hVar21, hVar22, hVar23);
            case 12:
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.b.b();
            case 13:
                jyVar11 = this.f320a.f319a;
                hVar24 = jyVar11.kk;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.f.a.b(hVar24);
            case 14:
                jo joVar = this.f320a;
                hVar25 = joVar.on;
                jyVar12 = joVar.f319a;
                hVar26 = jyVar12.d;
                jyVar13 = this.f320a.f319a;
                hVar27 = jyVar13.h;
                return new e(hVar25, hVar26, hVar27);
            case 15:
                jyVar14 = this.f320a.f319a;
                hVar28 = jyVar14.ko;
                jyVar15 = this.f320a.f319a;
                hVar29 = jyVar15.h;
                return new df(hVar28, hVar29, (byte[]) null, (byte[]) null, (byte[]) null);
            case 16:
                jyVar16 = this.f320a.f319a;
                hVar30 = jyVar16.kn;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dr(hVar30, (char[]) null, (byte[]) null);
            case 17:
                jyVar17 = this.f320a.f319a;
                hVar31 = jyVar17.b;
                jyVar18 = this.f320a.f319a;
                hVar32 = jyVar18.d;
                jyVar19 = this.f320a.f319a;
                hVar33 = jyVar19.h;
                return new x(hVar31, hVar32, hVar33, (byte[]) null);
            case 18:
                jyVar20 = this.f320a.f319a;
                hVar34 = jyVar20.k;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dr(hVar34, (byte[]) null);
            case 19:
                jyVar21 = this.f320a.f319a;
                hVar35 = jyVar21.j;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dr(hVar35);
            case 20:
                jyVar22 = this.f320a.f319a;
                hVar36 = jyVar22.d;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dr(hVar36, (char[]) null);
            case 21:
                jyVar23 = this.f320a.f319a;
                hVar37 = jyVar23.h;
                jyVar24 = this.f320a.f319a;
                hVar38 = jyVar24.b;
                return new df(hVar37, hVar38, (byte[]) null);
            case 22:
                jyVar25 = this.f320a.f319a;
                hVar39 = jyVar25.h;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dr(hVar39, (byte[]) null, (byte[]) null);
            case 23:
                jyVar26 = this.f320a.f319a;
                hVar40 = jyVar26.kv;
                hVar41 = this.f320a.gq;
                return new f(hVar40, hVar41);
            case 24:
                jyVar27 = this.f320a.f319a;
                hVar42 = jyVar27.kt;
                jyVar28 = this.f320a.f319a;
                hVar43 = jyVar28.ku;
                return new f(hVar42, hVar43, (byte[]) null);
            case 25:
                jyVar29 = this.f320a.f319a;
                hVar44 = jyVar29.i;
                jo joVar2 = this.f320a;
                hVar45 = joVar2.on;
                jyVar30 = joVar2.f319a;
                hVar46 = jyVar30.h;
                return new i(hVar44, hVar45, hVar46, (byte[]) null);
            case 26:
                jo joVar3 = this.f320a;
                hVar47 = joVar3.on;
                jyVar31 = joVar3.f319a;
                hVar48 = jyVar31.i;
                jyVar32 = this.f320a.f319a;
                hVar49 = jyVar32.d;
                return new i(hVar47, hVar48, hVar49);
            case 27:
                return new dh();
            case 28:
                jyVar33 = this.f320a.f319a;
                hVar50 = jyVar33.l;
                jo joVar4 = this.f320a;
                hVar51 = joVar4.gB;
                hVar52 = joVar4.gt;
                hVar53 = joVar4.bx;
                return new dt(hVar50, hVar51, hVar52, hVar53, (byte[]) null, (byte[]) null);
            case 29:
                jyVar34 = this.f320a.f319a;
                return new com.google.android.apps.gsa.shared.ui.b.a.a(jyVar34.aa());
            case 30:
                jyVar35 = this.f320a.f319a;
                com.google.android.apps.gsa.assistant.settings.c.a v = jyVar35.v();
                hVar54 = this.f320a.gB;
                an anVar = (an) hVar54.a();
                jyVar36 = this.f320a.f319a;
                hVar55 = jyVar36.kz;
                return d.b(v, anVar, hVar55.a());
            case 31:
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.a();
            case 32:
                jo joVar5 = this.f320a;
                hVar56 = joVar5.gy;
                hVar57 = joVar5.gq;
                return new j(hVar56, hVar57);
            case 33:
                jo joVar6 = this.f320a;
                hVar58 = joVar6.gB;
                hVar59 = joVar6.gy;
                hVar60 = joVar6.gq;
                hVar61 = joVar6.gy;
                return new com.google.android.apps.gsa.speech.d.c(hVar58, hVar59, hVar60, hVar61);
            case 34:
                hVar62 = this.f320a.f;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.h((Context) hVar62.a());
            case 35:
                hVar63 = this.f320a.f;
                Context context5 = (Context) hVar63.a();
                hVar64 = this.f320a.tr;
                boolean booleanValue = ((Boolean) hVar64.a()).booleanValue();
                jyVar37 = this.f320a.f319a;
                boolean qD = jyVar37.qD();
                jyVar38 = this.f320a.f319a;
                return new com.google.android.libraries.search.assistant.aa.e.a(context5, booleanValue, qD, jyVar38.qL());
            case 36:
                jo joVar7 = this.f320a;
                gy l = ha.l(26);
                jyVar39 = joVar7.f319a;
                l.j(jyVar39.pG());
                jyVar40 = this.f320a.f319a;
                l.j(jyVar40.pH());
                jyVar41 = this.f320a.f319a;
                l.j(jyVar41.pJ());
                jyVar42 = this.f320a.f319a;
                l.j(jyVar42.pK());
                jyVar43 = this.f320a.f319a;
                l.j(jyVar43.pP());
                jyVar44 = this.f320a.f319a;
                l.j(jyVar44.qx());
                jyVar45 = this.f320a.f319a;
                l.j(jyVar45.qf());
                jyVar46 = this.f320a.f319a;
                l.j(jyVar46.pI());
                jyVar47 = this.f320a.f319a;
                l.j(jyVar47.pN());
                jyVar48 = this.f320a.f319a;
                l.j(jyVar48.pO());
                l.j(t.b());
                jyVar49 = this.f320a.f319a;
                l.j(jyVar49.qh());
                l.j(new op("news"));
                jyVar50 = this.f320a.f319a;
                l.j(jyVar50.qd());
                jyVar51 = this.f320a.f319a;
                l.j(jyVar51.qj());
                jyVar52 = this.f320a.f319a;
                l.j(jyVar52.qk());
                l.j(com.google.android.apps.gsa.assistant.settings.features.an.i.b());
                jyVar53 = this.f320a.f319a;
                l.j(jyVar53.qz());
                jyVar54 = this.f320a.f319a;
                l.j(jyVar54.pV());
                jyVar55 = this.f320a.f319a;
                l.j(jyVar55.qb());
                l.j(new op("phone_voice_match"));
                l.j(new op("android_device_settings"));
                jyVar56 = this.f320a.f319a;
                l.j(jyVar56.qc());
                jyVar57 = this.f320a.f319a;
                l.j(jyVar57.qe());
                jyVar58 = this.f320a.f319a;
                l.j(jyVar58.qA());
                jyVar59 = this.f320a.f319a;
                l.j(jyVar59.qB());
                return l.g();
            case 37:
                hVar65 = this.f320a.gq;
                p pVar4 = (p) hVar65.a();
                jyVar60 = this.f320a.f319a;
                hVar66 = jyVar60.s;
                e.a b2 = c.b(hVar66);
                hVar67 = this.f320a.vR;
                return new k(pVar4, b2, c.b(hVar67));
            case 38:
                hVar68 = this.f320a.gR;
                return Optional.of((bg) hVar68.a());
            case 39:
                hVar69 = this.f320a.iG;
                return new n((SensorManager) hVar69.a());
            case 40:
                hVar70 = this.f320a.gf;
                c.b(hVar70);
                hVar71 = this.f320a.bM;
                com.google.android.libraries.search.account.k kVar = (com.google.android.libraries.search.account.k) hVar71.a();
                hVar72 = this.f320a.gX;
                hVar73 = this.f320a.bc;
                return new com.google.android.apps.gsa.eventlogger.a.b(kVar);
            case 41:
                hVar74 = this.f320a.f;
                jyVar61 = this.f320a.f319a;
                hVar75 = jyVar61.kA;
                jyVar62 = this.f320a.f319a;
                hVar76 = jyVar62.kD;
                c.b(hVar76);
                hVar77 = this.f320a.gn;
                e.a b3 = c.b(hVar77);
                hVar78 = this.f320a.bK;
                hVar79 = this.f320a.gq;
                c.b(hVar79);
                return new com.google.android.apps.gsa.eventlogger.a.g(b3);
            case 42:
                jyVar63 = this.f320a.f319a;
                return new op(jyVar63.V());
            case 43:
                jyVar64 = this.f320a.f319a;
                hVar80 = jyVar64.kC;
                com.google.android.libraries.search.integrations.f.a.a aVar = (com.google.android.libraries.search.integrations.f.a.a) hVar80.a();
                hVar81 = this.f320a.gq;
                p pVar5 = (p) hVar81.a();
                hVar82 = this.f320a.hq;
                c.b(hVar82);
                hVar83 = this.f320a.g;
                hVar84 = this.f320a.gf;
                hVar85 = this.f320a.gT;
                hVar86 = this.f320a.f;
                hVar87 = this.f320a.H;
                return new com.google.android.apps.gsa.staticplugins.ad.a(aVar, pVar5);
            case 44:
                jyVar65 = this.f320a.f319a;
                hVar88 = jyVar65.kB;
                hVar89 = this.f320a.bo;
                return new com.google.android.libraries.search.integrations.f.a.a.c(hVar88, (ag) hVar89.a());
            case 45:
                hVar90 = this.f320a.f;
                return new com.google.android.libraries.search.integrations.f.a.a.d((Context) hVar90.a());
            case 46:
                return new y();
            case 47:
                hVar91 = this.f320a.hh;
                com.google.android.apps.gsa.shared.util.q.a aVar2 = (com.google.android.apps.gsa.shared.util.q.a) hVar91.a();
                hVar92 = this.f320a.ra;
                v vVar = (v) hVar92.a();
                jo joVar8 = this.f320a;
                com.google.android.apps.gsa.nga.shared.n.k afG = joVar8.afG();
                hVar93 = joVar8.Gh;
                com.google.android.libraries.gsa.h.h hVar234 = (com.google.android.libraries.gsa.h.h) hVar93.a();
                jyVar66 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.shared.n.k N = jyVar66.N();
                jyVar67 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.shared.n.k M = jyVar67.M();
                hVar94 = this.f320a.gz;
                return new com.google.android.apps.gsa.nga.engine.ao.g(aVar2, vVar, afG, hVar234, N, M, (com.google.android.libraries.gsa.h.h) hVar94.a());
            case 48:
                jo joVar9 = this.f320a;
                gy l2 = ha.l(15);
                jyVar68 = joVar9.f319a;
                l2.j(jyVar68.pY());
                jyVar69 = this.f320a.f319a;
                l2.j(jyVar69.pW());
                jyVar70 = this.f320a.f319a;
                l2.j(jyVar70.qy());
                jyVar71 = this.f320a.f319a;
                l2.j(jyVar71.pR());
                jyVar72 = this.f320a.f319a;
                l2.j(jyVar72.pZ());
                hVar95 = this.f320a.Iw;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar95.a());
                hVar96 = this.f320a.Nu;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar96.a());
                hVar97 = this.f320a.OJ;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar97.a());
                hVar98 = this.f320a.kN;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar98.a());
                hVar99 = this.f320a.jH;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar99.a());
                hVar100 = this.f320a.iY;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar100.a());
                hVar101 = this.f320a.PH;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar101.a());
                hVar102 = this.f320a.IH;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar102.a());
                jyVar73 = this.f320a.f319a;
                hVar103 = jyVar73.kE;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar103.a());
                hVar104 = this.f320a.KY;
                l2.h((com.google.android.apps.gsa.nga.engine.ao.i) hVar104.a());
                return l2.g();
            case 49:
                hVar105 = this.f320a.h;
                hVar106 = this.f320a.hh;
                hVar107 = this.f320a.ez;
                return new com.google.android.apps.gsa.nga.engine.ak.c.a();
            case 50:
                jo joVar10 = this.f320a;
                gy l3 = ha.l(11);
                jyVar74 = joVar10.f319a;
                l3.j(jyVar74.qa());
                jyVar75 = this.f320a.f319a;
                l3.j(jyVar75.pX());
                jyVar76 = this.f320a.f319a;
                l3.j(jyVar76.pS());
                hVar108 = this.f320a.IF;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar108.a());
                hVar109 = this.f320a.Ns;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar109.a());
                hVar110 = this.f320a.Ov;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar110.a());
                hVar111 = this.f320a.OO;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar111.a());
                hVar112 = this.f320a.jH;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar112.a());
                hVar113 = this.f320a.iY;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar113.a());
                hVar114 = this.f320a.Mh;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar114.a());
                jyVar77 = this.f320a.f319a;
                hVar115 = jyVar77.kG;
                l3.h((com.google.android.apps.gsa.nga.engine.ao.h) hVar115.a());
                return l3.g();
            case 51:
                jo joVar11 = this.f320a;
                com.google.android.apps.gsa.nga.engine.ar.b.f bA = joVar11.bA();
                hVar116 = joVar11.iR;
                w wVar = (w) hVar116.a();
                hVar117 = this.f320a.iC;
                com.google.android.libraries.gsa.h.h hVar235 = (com.google.android.libraries.gsa.h.h) hVar117.a();
                hVar118 = this.f320a.jG;
                com.google.android.apps.gsa.nga.engine.ar.b.d dVar = (com.google.android.apps.gsa.nga.engine.ar.b.d) hVar118.a();
                hVar119 = this.f320a.hk;
                return new com.google.android.apps.gsa.nga.engine.ar.b.b.p(bA, wVar, hVar235, dVar, (com.google.android.apps.gsa.nga.shared.f.a.ag) hVar119.a());
            case 52:
                hVar120 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar236 = (com.google.android.libraries.gsa.h.h) hVar120.a();
                hVar121 = this.f320a.HO;
                com.google.android.apps.gsa.nga.engine.an.a aVar3 = (com.google.android.apps.gsa.nga.engine.an.a) hVar121.a();
                hVar122 = this.f320a.iY;
                com.google.android.apps.gsa.nga.engine.g.a.y yVar = (com.google.android.apps.gsa.nga.engine.g.a.y) hVar122.a();
                hVar123 = this.f320a.kC;
                e.a b4 = c.b(hVar123);
                hVar124 = this.f320a.jE;
                return new com.google.android.apps.gsa.nga.engine.an.an(hVar236, aVar3, yVar, b4, c.b(hVar124));
            case 53:
                hVar125 = this.f320a.iA;
                return new com.google.android.apps.gsa.nga.shared.r.a((af) hVar125.a());
            case 54:
                hVar126 = this.f320a.NP;
                com.google.android.apps.gsa.nga.engine.education.w wVar2 = (com.google.android.apps.gsa.nga.engine.education.w) hVar126.a();
                hVar127 = this.f320a.Gb;
                return new com.google.android.apps.gsa.nga.engine.ak.j.a.a(wVar2, (com.google.android.apps.gsa.nga.engine.ar.b.b.y) hVar127.a());
            case 55:
                hVar128 = this.f320a.xA;
                com.google.android.apps.gsa.nga.engine.ak.l.c.k kVar2 = (com.google.android.apps.gsa.nga.engine.ak.l.c.k) hVar128.a();
                hVar129 = this.f320a.gp;
                return new com.google.android.apps.gsa.nga.engine.ak.l.b.e(kVar2, (com.google.android.libraries.gsa.h.h) hVar129.a());
            case 56:
                hVar130 = this.f320a.iC;
                com.google.android.libraries.gsa.h.h hVar237 = (com.google.android.libraries.gsa.h.h) hVar130.a();
                jyVar78 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.ak.n.a I = jyVar78.I();
                jyVar79 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.ak.n.a H = jyVar79.H();
                jyVar80 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.ak.n.a L = jyVar80.L();
                jyVar81 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.ak.n.a K = jyVar81.K();
                jyVar82 = this.f320a.f319a;
                return new com.google.android.apps.gsa.nga.engine.ac.a.at(hVar237, I, H, L, K, jyVar82.J());
            case 57:
                jyVar83 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.shared.o.b O = jyVar83.O();
                hVar131 = this.f320a.Op;
                com.google.android.apps.gsa.nga.shared.o.b bVar = (com.google.android.apps.gsa.nga.shared.o.b) hVar131.a();
                hVar132 = this.f320a.NU;
                com.google.android.apps.gsa.nga.shared.o.b bVar2 = (com.google.android.apps.gsa.nga.shared.o.b) hVar132.a();
                hVar133 = this.f320a.NJ;
                com.google.android.apps.gsa.nga.shared.o.b bVar3 = (com.google.android.apps.gsa.nga.shared.o.b) hVar133.a();
                hVar134 = this.f320a.jZ;
                return ha.v(O, bVar, bVar2, bVar3, (com.google.android.apps.gsa.nga.shared.o.b) hVar134.a());
            case 58:
                hVar135 = this.f320a.jZ;
                return new op((com.google.android.apps.gsa.nga.shared.o.a) hVar135.a());
            case 59:
                jyVar84 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.shared.o.c P = jyVar84.P();
                jyVar85 = this.f320a.f319a;
                hVar136 = jyVar85.kK;
                return ha.s(P, (com.google.android.apps.gsa.nga.shared.o.c) hVar136.a());
            case 60:
                hVar137 = this.f320a.Gc;
                return new com.google.android.apps.gsa.nga.engine.am.a((com.google.android.apps.gsa.nga.engine.am.g) hVar137.a());
            case 61:
                jyVar86 = this.f320a.f319a;
                return new op(jyVar86.rm());
            case 62:
                jyVar87 = this.f320a.f319a;
                return new op(jyVar87.rl());
            case 63:
                hVar138 = this.f320a.PM;
                e.a b5 = c.b(hVar138);
                jyVar88 = this.f320a.f319a;
                hVar139 = jyVar88.kU;
                e.a b6 = c.b(hVar139);
                hVar140 = this.f320a.jy;
                e.a b7 = c.b(hVar140);
                hVar141 = this.f320a.le;
                e.a b8 = c.b(hVar141);
                jyVar89 = this.f320a.f319a;
                hVar142 = jyVar89.kV;
                e.a b9 = c.b(hVar142);
                jyVar90 = this.f320a.f319a;
                hVar143 = jyVar90.kY;
                e.a b10 = c.b(hVar143);
                hVar144 = this.f320a.hh;
                return new q(b5, b6, b7, b8, b9, b10, (com.google.android.apps.gsa.shared.util.q.a) hVar144.a());
            case 64:
                hVar145 = this.f320a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar145.a();
                jyVar91 = this.f320a.f319a;
                hVar146 = jyVar91.kR;
                com.google.android.apps.gsa.nga.engine.ar.b.b.k kVar3 = (com.google.android.apps.gsa.nga.engine.ar.b.b.k) hVar146.a();
                hVar147 = this.f320a.jy;
                ac acVar = (ac) hVar147.a();
                jo joVar12 = this.f320a;
                ab aY = joVar12.aY();
                com.google.android.apps.gsa.nga.engine.ap.a.b by = joVar12.by();
                hVar148 = joVar12.PY;
                com.google.android.apps.gsa.nga.shared.q.b bVar4 = (com.google.android.apps.gsa.nga.shared.q.b) hVar148.a();
                jyVar92 = this.f320a.f319a;
                hVar149 = jyVar92.kS;
                ad adVar = (ad) hVar149.a();
                hVar150 = this.f320a.hk;
                com.google.android.apps.gsa.nga.shared.f.a.ag agVar = (com.google.android.apps.gsa.nga.shared.f.a.ag) hVar150.a();
                hVar151 = this.f320a.hh;
                com.google.android.apps.gsa.shared.util.q.a aVar5 = (com.google.android.apps.gsa.shared.util.q.a) hVar151.a();
                jyVar93 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.ab.a.a G = jyVar93.G();
                hVar152 = this.f320a.iL;
                am amVar = (am) hVar152.a();
                hVar153 = this.f320a.OO;
                return new ai(aVar4, kVar3, acVar, aY, by, bVar4, adVar, agVar, aVar5, G, amVar, (ae) hVar153.a());
            case 65:
                hVar154 = this.f320a.iC;
                com.google.android.libraries.gsa.h.h hVar238 = (com.google.android.libraries.gsa.h.h) hVar154.a();
                jo joVar13 = this.f320a;
                com.google.android.apps.gsa.nga.engine.ar.b.f bA2 = joVar13.bA();
                hVar155 = joVar13.Jl;
                com.google.android.apps.gsa.nga.engine.ar.b.t tVar = (com.google.android.apps.gsa.nga.engine.ar.b.t) hVar155.a();
                hVar156 = this.f320a.Nv;
                com.google.android.apps.gsa.nga.engine.recognition.d.a.b bVar5 = (com.google.android.apps.gsa.nga.engine.recognition.d.a.b) hVar156.a();
                hVar157 = this.f320a.iR;
                w wVar3 = (w) hVar157.a();
                hVar158 = this.f320a.iA;
                af afVar = (af) hVar158.a();
                hVar159 = this.f320a.Jw;
                com.google.android.apps.gsa.nga.engine.recognition.l.a aVar6 = (com.google.android.apps.gsa.nga.engine.recognition.l.a) hVar159.a();
                hVar160 = this.f320a.LT;
                com.google.android.apps.gsa.nga.engine.ak.i.g gVar = (com.google.android.apps.gsa.nga.engine.ak.i.g) hVar160.a();
                hVar161 = this.f320a.iJ;
                com.google.android.apps.gsa.nga.engine.v.i iVar = (com.google.android.apps.gsa.nga.engine.v.i) hVar161.a();
                jyVar94 = this.f320a.f319a;
                hVar162 = jyVar94.kO;
                s sVar = (s) hVar162.a();
                hVar163 = this.f320a.kd;
                com.google.android.apps.gsa.nga.shared.ad.a.d dVar2 = (com.google.android.apps.gsa.nga.shared.ad.a.d) hVar163.a();
                jyVar95 = this.f320a.f319a;
                hVar164 = jyVar95.E;
                com.google.android.apps.gsa.nga.shared.ad.a.c cVar = (com.google.android.apps.gsa.nga.shared.ad.a.c) hVar164.a();
                jyVar96 = this.f320a.f319a;
                hVar165 = jyVar96.kP;
                com.google.android.apps.gsa.nga.engine.ui.e.h.c.b bVar6 = (com.google.android.apps.gsa.nga.engine.ui.e.h.c.b) hVar165.a();
                jo joVar14 = this.f320a;
                m bo = joVar14.bo();
                jyVar97 = joVar14.f319a;
                com.google.android.apps.gsa.nga.engine.e.a.a D = jyVar97.D();
                hVar166 = this.f320a.Kj;
                return new com.google.android.apps.gsa.nga.engine.ar.b.b.k(hVar238, bA2, tVar, bVar5, wVar3, afVar, aVar6, gVar, iVar, sVar, dVar2, cVar, bVar6, bo, D, (com.google.android.apps.gsa.nga.engine.recognition.d.a) hVar166.a());
            case 66:
                hVar167 = this.f320a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar167.a();
                hVar168 = this.f320a.hh;
                return new s(aVar7, (com.google.android.apps.gsa.shared.util.q.a) hVar168.a());
            case 67:
                return new com.google.android.apps.gsa.nga.shared.ad.a.a.a();
            case 68:
                hVar169 = this.f320a.NE;
                com.google.android.libraries.gsa.h.h hVar239 = (com.google.android.libraries.gsa.h.h) hVar169.a();
                hVar170 = this.f320a.ks;
                return new com.google.android.apps.gsa.nga.engine.ui.e.h.c.b(hVar239, c.b(hVar170), this.f320a.bo());
            case 69:
                hVar171 = this.f320a.FW;
                z zVar = (z) hVar171.a();
                hVar172 = this.f320a.iC;
                return new ad(zVar, (com.google.android.libraries.gsa.h.h) hVar172.a());
            case 70:
                return new com.google.android.libraries.assistant.g.d.i();
            case 71:
                jyVar98 = this.f320a.f319a;
                hVar173 = jyVar98.kX;
                return new com.google.android.libraries.search.assistant.d.a.b((com.google.android.apps.e.b.a.b) hVar173.a());
            case 72:
                jyVar99 = this.f320a.f319a;
                hVar174 = jyVar99.kW;
                return com.google.android.libraries.search.assistant.d.b.a.a.b.b((io.grpc.i) hVar174.a());
            case 73:
                hVar175 = this.f320a.f;
                return com.google.android.libraries.search.assistant.d.b.a.a.b.c((Context) hVar175.a());
            case 74:
                hVar176 = this.f320a.he;
                com.google.android.apps.gsa.shared.util.c.a.aw awVar = (com.google.android.apps.gsa.shared.util.c.a.aw) hVar176.a();
                hVar177 = this.f320a.JX;
                e.a b11 = c.b(hVar177);
                hVar178 = this.f320a.jY;
                return new aa(awVar, b11, c.b(hVar178));
            case 75:
                return new com.google.android.apps.gsa.nga.engine.ak.f.a.a();
            case 76:
                hVar179 = this.f320a.kX;
                com.google.android.apps.gsa.nga.engine.b.d.i iVar2 = (com.google.android.apps.gsa.nga.engine.b.d.i) hVar179.a();
                jyVar100 = this.f320a.f319a;
                com.google.android.libraries.search.assistant.invocation.c.a.a.a.b dD = jyVar100.dD();
                jyVar101 = this.f320a.f319a;
                return new com.google.android.apps.gsa.nga.engine.viss.ae(iVar2, dD, jyVar101.dC());
            case 77:
                jyVar102 = this.f320a.f319a;
                return new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.a.b.a(jyVar102.eV());
            case 78:
                jo joVar15 = this.f320a;
                com.google.android.libraries.search.assistant.invocation.c.a.a.b jO = joVar15.jO();
                Optional of = Optional.of(joVar15.jP());
                hVar180 = this.f320a.ta;
                return new com.google.android.libraries.search.assistant.invocation.c.a.a.a(jO, of, (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i) hVar180.a());
            case 79:
                hVar181 = this.f320a.iL;
                am amVar2 = (am) hVar181.a();
                hVar182 = this.f320a.iF;
                return new com.google.android.apps.gsa.nga.shared.ak.i(amVar2, (com.google.android.apps.gsa.nga.shared.q.a.x) hVar182.a());
            case 80:
                return com.google.android.libraries.search.assistant.invocation.h.d.a.a.o.b(this.f320a.Ve());
            case 81:
                hVar183 = this.f320a.eY;
                return new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.c.a((com.google.android.libraries.search.assistant.invocation.n.d.i) hVar183.a());
            case 82:
                hVar184 = this.f320a.jM;
                return com.google.android.apps.gsa.nga.engine.ui.e.h.b.a.c((com.google.android.apps.gsa.nga.engine.ui.e.d.b) hVar184.a());
            case 83:
                jo joVar16 = this.f320a;
                hVar185 = joVar16.gv;
                hVar186 = joVar16.jG;
                return new ak(hVar185, hVar186);
            case 84:
                jo joVar17 = this.f320a;
                hVar187 = joVar17.qq;
                hVar188 = joVar17.gv;
                hVar189 = joVar17.jG;
                hVar190 = joVar17.hh;
                hVar191 = joVar17.iV;
                return new ap(hVar187, hVar188, hVar189, hVar190, hVar191);
            case 85:
                jyVar103 = this.f320a.f319a;
                hVar192 = jyVar103.lb;
                return new com.google.android.apps.gsa.nga.shared.af.c(hVar192);
            case 86:
                return new com.google.android.apps.gsa.nga.shared.ah.b.f();
            case 87:
                jyVar104 = this.f320a.f319a;
                return com.google.android.apps.gsa.staticplugins.opa.j.a.a.a.b(jyVar104.at());
            case 88:
                hVar193 = this.f320a.gP;
                com.google.android.apps.gsa.tasks.m mVar = (com.google.android.apps.gsa.tasks.m) hVar193.a();
                hVar194 = this.f320a.gq;
                p pVar6 = (p) hVar194.a();
                hVar195 = this.f320a.ip;
                e.a b12 = c.b(hVar195);
                jyVar105 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.opa.samson.c.f.m aG = jyVar105.aG();
                hVar196 = this.f320a.f;
                Context context6 = (Context) hVar196.a();
                hVar197 = this.f320a.oB;
                com.google.android.apps.gsa.staticplugins.opa.samson.c.e.i iVar3 = (com.google.android.apps.gsa.staticplugins.opa.samson.c.e.i) hVar197.a();
                hVar198 = this.f320a.ij;
                com.google.android.apps.gsa.staticplugins.opa.samson.o.c cVar2 = (com.google.android.apps.gsa.staticplugins.opa.samson.o.c) hVar198.a();
                hVar199 = this.f320a.gB;
                an anVar2 = (an) hVar199.a();
                hVar200 = this.f320a.il;
                com.google.android.apps.gsa.staticplugins.opa.samson.t.a aVar8 = (com.google.android.apps.gsa.staticplugins.opa.samson.t.a) hVar200.a();
                hVar201 = this.f320a.ir;
                com.google.android.apps.gsa.staticplugins.opa.samson.c.c.a aVar9 = (com.google.android.apps.gsa.staticplugins.opa.samson.c.c.a) hVar201.a();
                hVar202 = this.f320a.nY;
                com.google.android.apps.gsa.staticplugins.opa.samson.o.b bVar7 = (com.google.android.apps.gsa.staticplugins.opa.samson.o.b) hVar202.a();
                hVar203 = this.f320a.FC;
                com.google.android.apps.gsa.staticplugins.opa.samson.t.b bVar8 = (com.google.android.apps.gsa.staticplugins.opa.samson.t.b) hVar203.a();
                hVar204 = this.f320a.mW;
                com.google.android.apps.gsa.staticplugins.opa.morris2.h.h hVar240 = (com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) hVar204.a();
                hVar205 = this.f320a.mS;
                com.google.android.apps.gsa.assistant.shared.c cVar3 = (com.google.android.apps.gsa.assistant.shared.c) hVar205.a();
                hVar206 = this.f320a.TH;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.c.k(mVar, pVar6, b12, aG, context6, iVar3, cVar2, anVar2, aVar8, aVar9, bVar7, bVar8, hVar240, cVar3, (cr) hVar206.a());
            case 89:
                jyVar106 = this.f320a.f319a;
                hVar207 = jyVar106.ld;
                l lVar = (l) hVar207.a();
                jo joVar18 = this.f320a;
                com.google.android.apps.gsa.staticplugins.opa.ambient.f.b.t dR = joVar18.dR();
                jyVar107 = joVar18.f319a;
                Set ql = jyVar107.ql();
                jyVar108 = this.f320a.f319a;
                hVar208 = jyVar108.li;
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d dVar3 = (com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d) hVar208.a();
                hVar209 = this.f320a.qW;
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.g gVar2 = (com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.g) hVar209.a();
                hVar210 = this.f320a.nO;
                cq cqVar = (cq) hVar210.a();
                hVar211 = this.f320a.gq;
                p pVar7 = (p) hVar211.a();
                hVar212 = this.f320a.nK;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.g.a.n(lVar, dR, ql, dVar3, gVar2, cqVar, pVar7, (com.google.android.apps.gsa.opa.a.a.a) hVar212.a());
            case 90:
                jyVar109 = this.f320a.f319a;
                fl eM = jyVar109.eM();
                jo joVar19 = this.f320a;
                Optional empty = Optional.empty();
                hVar213 = joVar19.Tj;
                jo joVar20 = this.f320a;
                com.google.android.apps.gsa.staticplugins.opa.ambient.i.d.a dT = joVar20.dT();
                hVar214 = joVar20.nO;
                cr crVar = (cr) hVar214.a();
                hVar215 = this.f320a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar10 = (com.google.android.apps.gsa.opa.a.a.a) hVar215.a();
                hVar216 = this.f320a.nD;
                com.google.android.apps.gsa.staticplugins.opa.ambient.f.b.u uVar = (com.google.android.apps.gsa.staticplugins.opa.ambient.f.b.u) hVar216.a();
                jyVar110 = this.f320a.f319a;
                cg rB = jyVar110.rB();
                hVar217 = this.f320a.gq;
                p pVar8 = (p) hVar217.a();
                hVar218 = this.f320a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar218.a();
                hVar219 = this.f320a.TF;
                return new l(eM, empty, dT, crVar, aVar10, uVar, rB, pVar8, aVar11, (com.google.android.apps.gsa.opa.smartspace.c.d) hVar219.a());
            case 91:
                jyVar111 = this.f320a.f319a;
                hVar220 = jyVar111.lg;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d((com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g) hVar220.a());
            case 92:
                jyVar112 = this.f320a.f319a;
                return com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e.b(jyVar112.aq());
            case 93:
                hVar221 = this.f320a.f;
                Context context7 = (Context) hVar221.a();
                hVar222 = this.f320a.cZ;
                AudioManager audioManager = (AudioManager) hVar222.a();
                hVar223 = this.f320a.hh;
                com.google.android.apps.gsa.shared.util.q.a aVar12 = (com.google.android.apps.gsa.shared.util.q.a) hVar223.a();
                hVar224 = this.f320a.g;
                com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) hVar224.a();
                hVar225 = this.f320a.H;
                cr crVar2 = (cr) hVar225.a();
                hVar226 = this.f320a.nK;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.c.a.j(context7, audioManager, aVar12, aVar13, crVar2, (com.google.android.apps.gsa.opa.a.a.a) hVar226.a());
            case 94:
                hVar227 = this.f320a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar14 = (com.google.android.apps.gsa.opa.a.a.a) hVar227.a();
                hVar228 = this.f320a.hh;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.a.a(aVar14, (com.google.android.apps.gsa.shared.util.q.a) hVar228.a());
            case 95:
                hVar229 = this.f320a.qW;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d((com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.g) hVar229.a());
            case 96:
                jyVar113 = this.f320a.f319a;
                return com.google.android.apps.gsa.staticplugins.opa.y.a.a.b(jyVar113.av());
            case 97:
                hVar230 = this.f320a.f;
                return com.google.android.gms.common.a.a.b((Context) hVar230.a());
            case 98:
                jyVar114 = this.f320a.f319a;
                return new com.google.android.apps.gsa.staticplugins.opa.appintegration.b.a((com.google.android.apps.gsa.staticplugins.opa.appintegration.b.d) jyVar114.pe());
            case 99:
                hVar231 = this.f320a.gT;
                com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar4 = (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) hVar231.a();
                hVar232 = this.f320a.f;
                return new bn(cVar4, (Context) hVar232.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        h hVar;
        jy jyVar;
        h hVar2;
        jy jyVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        jy jyVar3;
        h hVar9;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        h hVar14;
        h hVar15;
        jy jyVar4;
        jy jyVar5;
        jy jyVar6;
        h hVar16;
        h hVar17;
        jy jyVar7;
        h hVar18;
        jy jyVar8;
        h hVar19;
        jy jyVar9;
        h hVar20;
        jy jyVar10;
        h hVar21;
        jy jyVar11;
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
        h hVar44;
        h hVar45;
        h hVar46;
        jy jyVar12;
        h hVar47;
        h hVar48;
        h hVar49;
        jy jyVar13;
        jy jyVar14;
        h hVar50;
        h hVar51;
        jy jyVar15;
        h hVar52;
        jy jyVar16;
        h hVar53;
        h hVar54;
        jy jyVar17;
        h hVar55;
        jy jyVar18;
        h hVar56;
        jy jyVar19;
        h hVar57;
        jy jyVar20;
        h hVar58;
        h hVar59;
        jy jyVar21;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        jy jyVar22;
        h hVar64;
        jy jyVar23;
        h hVar65;
        h hVar66;
        h hVar67;
        h hVar68;
        h hVar69;
        jy jyVar24;
        h hVar70;
        h hVar71;
        h hVar72;
        jy jyVar25;
        h hVar73;
        h hVar74;
        jy jyVar26;
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
        jy jyVar27;
        h hVar120;
        h hVar121;
        h hVar122;
        jy jyVar28;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        h hVar128;
        jy jyVar29;
        h hVar129;
        h hVar130;
        h hVar131;
        h hVar132;
        h hVar133;
        h hVar134;
        jy jyVar30;
        h hVar135;
        h hVar136;
        jy jyVar31;
        h hVar137;
        jy jyVar32;
        jy jyVar33;
        h hVar138;
        h hVar139;
        jy jyVar34;
        h hVar140;
        jy jyVar35;
        jy jyVar36;
        jy jyVar37;
        h hVar141;
        h hVar142;
        h hVar143;
        jy jyVar38;
        h hVar144;
        h hVar145;
        h hVar146;
        h hVar147;
        h hVar148;
        h hVar149;
        h hVar150;
        h hVar151;
        jy jyVar39;
        h hVar152;
        h hVar153;
        jy jyVar40;
        h hVar154;
        h hVar155;
        h hVar156;
        h hVar157;
        h hVar158;
        h hVar159;
        jy jyVar41;
        h hVar160;
        jy jyVar42;
        h hVar161;
        jy jyVar43;
        h hVar162;
        h hVar163;
        h hVar164;
        h hVar165;
        h hVar166;
        h hVar167;
        jy jyVar44;
        h hVar168;
        h hVar169;
        h hVar170;
        jy jyVar45;
        h hVar171;
        jy jyVar46;
        jy jyVar47;
        h hVar172;
        jy jyVar48;
        h hVar173;
        h hVar174;
        h hVar175;
        jy jyVar49;
        h hVar176;
        h hVar177;
        jy jyVar50;
        h hVar178;
        h hVar179;
        h hVar180;
        jy jyVar51;
        h hVar181;
        h hVar182;
        jy jyVar52;
        h hVar183;
        h hVar184;
        h hVar185;
        h hVar186;
        h hVar187;
        h hVar188;
        jy jyVar53;
        h hVar189;
        h hVar190;
        h hVar191;
        h hVar192;
        h hVar193;
        h hVar194;
        jy jyVar54;
        h hVar195;
        h hVar196;
        h hVar197;
        h hVar198;
        jy jyVar55;
        h hVar199;
        h hVar200;
        h hVar201;
        jy jyVar56;
        jy jyVar57;
        jy jyVar58;
        jy jyVar59;
        h hVar202;
        h hVar203;
        h hVar204;
        jy jyVar60;
        h hVar205;
        jy jyVar61;
        final h hVar206;
        jy jyVar62;
        jy jyVar63;
        jy jyVar64;
        jy jyVar65;
        jy jyVar66;
        jy jyVar67;
        jy jyVar68;
        jy jyVar69;
        h hVar207;
        jy jyVar70;
        h hVar208;
        h hVar209;
        jy jyVar71;
        h hVar210;
        jy jyVar72;
        h hVar211;
        h hVar212;
        h hVar213;
        h hVar214;
        jy jyVar73;
        h hVar215;
        jy jyVar74;
        h hVar216;
        h hVar217;
        jy jyVar75;
        h hVar218;
        h hVar219;
        h hVar220;
        jy jyVar76;
        h hVar221;
        h hVar222;
        jy jyVar77;
        h hVar223;
        jy jyVar78;
        h hVar224;
        jy jyVar79;
        h hVar225;
        jy jyVar80;
        h hVar226;
        jy jyVar81;
        h hVar227;
        jy jyVar82;
        h hVar228;
        jy jyVar83;
        h hVar229;
        jy jyVar84;
        h hVar230;
        h hVar231;
        h hVar232;
        jy jyVar85;
        h hVar233;
        jy jyVar86;
        h hVar234;
        h hVar235;
        jy jyVar87;
        h hVar236;
        jy jyVar88;
        jy jyVar89;
        jy jyVar90;
        h hVar237;
        h hVar238;
        jy jyVar91;
        jy jyVar92;
        h hVar239;
        jy jyVar93;
        h hVar240;
        jy jyVar94;
        jy jyVar95;
        h hVar241;
        jy jyVar96;
        jy jyVar97;
        h hVar242;
        jy jyVar98;
        h hVar243;
        jy jyVar99;
        h hVar244;
        jy jyVar100;
        h hVar245;
        jy jyVar101;
        h hVar246;
        h hVar247;
        h hVar248;
        int i = this.b;
        switch (i) {
            case 100:
                hVar = this.f320a.hc;
                return com.google.android.apps.gsa.staticplugins.nga.a.b.c.b((com.google.android.apps.gsa.staticplugins.nga.k.n) hVar.a());
            case 101:
                jyVar = this.f320a.f319a;
                hVar2 = jyVar.ll;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.c.a.a(hVar2);
            case 102:
                return new mj(this.f320a);
            case 103:
                jyVar2 = this.f320a.f319a;
                hVar3 = jyVar2.lv;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.c(hVar3);
            case 104:
                hVar4 = this.f320a.gD;
                com.google.android.libraries.gcoreclient.f.c.c cVar = (com.google.android.libraries.gcoreclient.f.c.c) hVar4.a();
                hVar5 = this.f320a.h;
                hVar6 = this.f320a.f;
                Context context = (Context) hVar6.a();
                hVar7 = this.f320a.gm;
                hVar8 = this.f320a.gq;
                p pVar = (p) hVar8.a();
                jyVar3 = this.f320a.f319a;
                hVar9 = jyVar3.Z;
                Map map = (Map) hVar9.a();
                hVar10 = this.f320a.po;
                at atVar = (at) hVar10.a();
                hVar11 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar249 = (com.google.android.libraries.gsa.h.h) hVar11.a();
                hVar12 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar250 = (com.google.android.libraries.gsa.h.h) hVar12.a();
                hVar13 = this.f320a.gB;
                e.a b = c.b(hVar13);
                hVar14 = this.f320a.hI;
                com.google.android.apps.gsa.search.shared.service.x xVar = (com.google.android.apps.gsa.search.shared.service.x) hVar14.a();
                hVar15 = this.f320a.Tm;
                e.a b2 = c.b(hVar15);
                jyVar4 = this.f320a.f319a;
                Object pb = jyVar4.pb();
                jyVar5 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.opa.samson.t.a aH = jyVar5.aH();
                jyVar6 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.opa.samson.b aE = jyVar6.aE();
                hVar16 = this.f320a.pI;
                at atVar2 = (at) hVar16.a();
                hVar17 = this.f320a.oa;
                ca caVar = (ca) hVar17.a();
                jyVar7 = this.f320a.f319a;
                hVar18 = jyVar7.V;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.l(cVar, context, pVar, map, atVar, hVar249, hVar250, b, xVar, b2, (com.google.android.apps.gsa.staticplugins.opa.samson.k) pb, aH, aE, atVar2, caVar, (bn) hVar18.a());
            case 105:
                jyVar8 = this.f320a.f319a;
                hVar19 = jyVar8.lo;
                jyVar9 = this.f320a.f319a;
                hVar20 = jyVar9.lq;
                jyVar10 = this.f320a.f319a;
                hVar21 = jyVar10.ls;
                jyVar11 = this.f320a.f319a;
                hVar22 = jyVar11.lu;
                return fu.p("m-ip", hVar19, "ch-amb-m-ip", hVar20, "pf-ip", hVar21, "ch-amb-pf-ip", hVar22);
            case 106:
                hVar23 = this.f320a.f;
                Context context2 = (Context) hVar23.a();
                hVar24 = this.f320a.gq;
                p pVar2 = (p) hVar24.a();
                hVar25 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar251 = (com.google.android.libraries.gsa.h.h) hVar25.a();
                hVar26 = this.f320a.gz;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.i.p(context2, pVar2, hVar251, (com.google.android.libraries.gsa.h.h) hVar26.a());
            case 107:
                hVar27 = this.f320a.f;
                Context context3 = (Context) hVar27.a();
                hVar28 = this.f320a.gq;
                p pVar3 = (p) hVar28.a();
                hVar29 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar252 = (com.google.android.libraries.gsa.h.h) hVar29.a();
                hVar30 = this.f320a.gz;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.i.a(context3, pVar3, hVar252, (com.google.android.libraries.gsa.h.h) hVar30.a());
            case 108:
                hVar31 = this.f320a.f;
                Context context4 = (Context) hVar31.a();
                hVar32 = this.f320a.gq;
                e.a b3 = c.b(hVar32);
                hVar33 = this.f320a.po;
                e.a b4 = c.b(hVar33);
                hVar34 = this.f320a.gB;
                e.a b5 = c.b(hVar34);
                hVar35 = this.f320a.ii;
                e.a b6 = c.b(hVar35);
                hVar36 = this.f320a.il;
                e.a b7 = c.b(hVar36);
                hVar37 = this.f320a.nY;
                return new bd(context4, b3, b4, b5, b6, b7, c.b(hVar37));
            case 109:
                hVar38 = this.f320a.f;
                Context context5 = (Context) hVar38.a();
                hVar39 = this.f320a.gq;
                e.a b8 = c.b(hVar39);
                hVar40 = this.f320a.po;
                e.a b9 = c.b(hVar40);
                hVar41 = this.f320a.gB;
                e.a b10 = c.b(hVar41);
                hVar42 = this.f320a.ii;
                e.a b11 = c.b(hVar42);
                hVar43 = this.f320a.il;
                e.a b12 = c.b(hVar43);
                hVar44 = this.f320a.nY;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.l.an(context5, b8, b9, b10, b11, b12, c.b(hVar44));
            case 110:
                jo joVar = this.f320a;
                hVar45 = joVar.gq;
                hVar46 = joVar.g;
                return new com.google.android.apps.gsa.staticplugins.opa.zerostate.a.c(hVar45, hVar46);
            case 111:
                jyVar12 = this.f320a.f319a;
                hVar47 = jyVar12.lx;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.m.a(hVar47);
            case 112:
                return new kz(this.f320a);
            case 113:
                hVar48 = this.f320a.gv;
                e.a b13 = c.b(hVar48);
                hVar49 = this.f320a.h;
                e.a b14 = c.b(hVar49);
                jyVar13 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.opa.an.c.e.c az = jyVar13.az();
                jyVar14 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.opa.an.c.e.i aA = jyVar14.aA();
                hVar50 = this.f320a.gq;
                e.a b15 = c.b(hVar50);
                hVar51 = this.f320a.mW;
                return new com.google.android.apps.gsa.staticplugins.opa.an.c.e.e(b13, b14, az, aA, b15, (com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) hVar51.a());
            case 114:
                jyVar15 = this.f320a.f319a;
                hVar52 = jyVar15.lC;
                e.a b16 = c.b(hVar52);
                jyVar16 = this.f320a.f319a;
                hVar53 = jyVar16.ae;
                return new com.google.android.apps.gsa.staticplugins.opa.bb.h(b16, (com.google.android.apps.gsa.staticplugins.opa.an.b.a.a) hVar53.a(), com.google.android.apps.gsa.staticplugins.opa.bb.j.b);
            case 115:
                hVar54 = this.f320a.hI;
                com.google.android.apps.gsa.search.shared.service.x xVar2 = (com.google.android.apps.gsa.search.shared.service.x) hVar54.a();
                jyVar17 = this.f320a.f319a;
                hVar55 = jyVar17.ad;
                e.a b17 = c.b(hVar55);
                jyVar18 = this.f320a.f319a;
                hVar56 = jyVar18.af;
                e.a b18 = c.b(hVar56);
                jyVar19 = this.f320a.f319a;
                hVar57 = jyVar19.lA;
                com.google.android.apps.gsa.staticplugins.opa.x.a aVar = (com.google.android.apps.gsa.staticplugins.opa.x.a) hVar57.a();
                jyVar20 = this.f320a.f319a;
                hVar58 = jyVar20.lB;
                com.google.android.apps.gsa.staticplugins.opa.x.t tVar = (com.google.android.apps.gsa.staticplugins.opa.x.t) hVar58.a();
                hVar59 = this.f320a.gq;
                p pVar4 = (p) hVar59.a();
                jyVar21 = this.f320a.f319a;
                hVar60 = jyVar21.ae;
                return new com.google.android.apps.gsa.staticplugins.opa.bb.g(xVar2, b17, b18, aVar, tVar, pVar4, (com.google.android.apps.gsa.staticplugins.opa.an.b.a.a) hVar60.a());
            case 116:
                hVar61 = this.f320a.gq;
                e.a b19 = c.b(hVar61);
                hVar62 = this.f320a.gt;
                return new com.google.android.apps.gsa.staticplugins.opa.util.at(b19, c.b(hVar62));
            case 117:
                hVar63 = this.f320a.gq;
                e.a b20 = c.b(hVar63);
                jyVar22 = this.f320a.f319a;
                hVar64 = jyVar22.ae;
                e.a b21 = c.b(hVar64);
                jyVar23 = this.f320a.f319a;
                hVar65 = jyVar23.W;
                at k = at.k(c.b(hVar65));
                hVar66 = this.f320a.hb;
                at k2 = at.k(c.b(hVar66));
                hVar67 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar253 = (com.google.android.libraries.gsa.h.h) hVar67.a();
                hVar68 = this.f320a.mE;
                com.google.android.apps.gsa.shared.ab.b bVar = (com.google.android.apps.gsa.shared.ab.b) hVar68.a();
                hVar69 = this.f320a.hG;
                return new com.google.android.apps.gsa.staticplugins.opa.bd.c.f(b20, b21, k, k2, hVar253, bVar, c.b(hVar69));
            case 118:
                jyVar24 = this.f320a.f319a;
                hVar70 = jyVar24.lz;
                return com.google.android.apps.gsa.staticplugins.opa.an.b.b.a.b(at.k((com.google.android.apps.gsa.staticplugins.opa.an.b.a.a) hVar70.a()));
            case 119:
                hVar71 = this.f320a.iA;
                return new com.google.android.apps.gsa.staticplugins.opa.an.b.a.a((af) hVar71.a());
            case 120:
                hVar72 = this.f320a.gq;
                return new com.google.android.apps.gsa.staticplugins.opa.x.a((p) hVar72.a());
            case 121:
                jyVar25 = this.f320a.f319a;
                hVar73 = jyVar25.lA;
                com.google.android.apps.gsa.staticplugins.opa.x.a aVar2 = (com.google.android.apps.gsa.staticplugins.opa.x.a) hVar73.a();
                hVar74 = this.f320a.qy;
                at atVar3 = (at) hVar74.a();
                jyVar26 = this.f320a.f319a;
                hVar75 = jyVar26.ag;
                return new com.google.android.apps.gsa.staticplugins.opa.x.t(aVar2, atVar3, (at) hVar75.a());
            case 122:
                hVar76 = this.f320a.iF;
                return at.k((com.google.android.apps.gsa.nga.shared.q.a.x) hVar76.a());
            case 123:
                jo joVar2 = this.f320a;
                hVar77 = joVar2.hY;
                hVar78 = joVar2.nu;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.e(hVar77, hVar78);
            case 124:
                jo joVar3 = this.f320a;
                hVar79 = joVar3.gV;
                hVar80 = joVar3.hY;
                hVar81 = joVar3.gq;
                hVar82 = joVar3.aD;
                hVar83 = joVar3.W;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.y(hVar79, hVar80, hVar81, hVar82, hVar83);
            case 125:
                jo joVar4 = this.f320a;
                hVar84 = joVar4.gV;
                hVar85 = joVar4.hY;
                hVar86 = joVar4.aD;
                hVar87 = joVar4.W;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.q(hVar84, hVar85, hVar86, hVar87, (byte[]) null);
            case 126:
                jo joVar5 = this.f320a;
                hVar88 = joVar5.gV;
                hVar89 = joVar5.hY;
                hVar90 = joVar5.aD;
                hVar91 = joVar5.io;
                hVar92 = joVar5.lu;
                hVar93 = joVar5.gq;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.m(hVar88, hVar89, hVar90, hVar91, hVar92, hVar93, (byte[]) null, (byte[]) null);
            case 127:
                jo joVar6 = this.f320a;
                hVar94 = joVar6.gV;
                hVar95 = joVar6.hY;
                hVar96 = joVar6.aD;
                hVar97 = joVar6.io;
                hVar98 = joVar6.lu;
                hVar99 = joVar6.gq;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.m(hVar94, hVar95, hVar96, hVar97, hVar98, hVar99);
            case 128:
                hVar100 = this.f320a.hY;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.u(hVar100);
            case 129:
                jo joVar7 = this.f320a;
                hVar101 = joVar7.gV;
                hVar102 = joVar7.aD;
                hVar103 = joVar7.gq;
                hVar104 = joVar7.nt;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.q(hVar101, hVar102, hVar103, hVar104);
            case 130:
                jo joVar8 = this.f320a;
                hVar105 = joVar8.gq;
                hVar106 = joVar8.gV;
                hVar107 = joVar8.gf;
                hVar108 = joVar8.aD;
                hVar109 = joVar8.vw;
                hVar110 = joVar8.nt;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.m(hVar105, hVar106, hVar107, hVar108, hVar109, hVar110, (byte[]) null);
            case 131:
                jo joVar9 = this.f320a;
                hVar111 = joVar9.nX;
                hVar112 = joVar9.hY;
                hVar113 = joVar9.gV;
                hVar114 = joVar9.gB;
                h b22 = e.c.i.b(hVar114);
                jo joVar10 = this.f320a;
                hVar115 = joVar10.hG;
                hVar116 = joVar10.hO;
                hVar117 = joVar10.mw;
                hVar118 = joVar10.H;
                hVar119 = joVar10.gq;
                jyVar27 = joVar10.f319a;
                hVar120 = jyVar27.aq;
                return new com.google.android.apps.gsa.speech.settingsui.hotword.ad(hVar111, hVar112, hVar113, b22, hVar115, hVar116, hVar117, hVar118, hVar119, hVar120);
            case 132:
                hVar121 = this.f320a.f;
                return new ClickableText((Context) hVar121.a());
            case 133:
                return new com.google.android.apps.gsa.speech.settingsui.hotword.j();
            case 134:
                jo joVar11 = this.f320a;
                hVar122 = joVar11.f;
                jyVar28 = joVar11.f319a;
                hVar123 = jyVar28.lG;
                hVar124 = this.f320a.gq;
                return new com.google.android.apps.gsa.shared.aa.b.h(hVar122, hVar123, hVar124, (byte[]) null);
            case 135:
                jo joVar12 = this.f320a;
                hVar125 = joVar12.f;
                hVar126 = joVar12.gz;
                hVar127 = joVar12.xD;
                hVar128 = joVar12.ip;
                jyVar29 = joVar12.f319a;
                hVar129 = jyVar29.lF;
                return new com.google.android.apps.gsa.shared.aa.b.f(hVar125, hVar126, hVar127, hVar128, hVar129);
            case 136:
                jo joVar13 = this.f320a;
                hVar130 = joVar13.f;
                hVar131 = joVar13.gz;
                hVar132 = joVar13.pp;
                return new com.google.android.apps.gsa.shared.aa.b.h(hVar130, hVar131, hVar132);
            case 137:
                hVar133 = this.f320a.P;
                m.c.n nVar = (m.c.n) hVar133.a();
                hVar134 = this.f320a.Q;
                ag agVar = (ag) hVar134.a();
                jyVar30 = this.f320a.f319a;
                return new com.google.android.apps.search.assistant.platform.f.a.b(nVar, agVar, jyVar30.sd());
            case 138:
                hVar135 = this.f320a.gq;
                e.a b23 = c.b(hVar135);
                hVar136 = this.f320a.of;
                return new com.google.android.apps.gsa.staticplugins.nga.ui.b.a(b23, (com.google.android.apps.gsa.nga.shared.ui.a.a) hVar136.a());
            case 139:
                jyVar31 = this.f320a.f319a;
                com.google.android.libraries.search.t.a.a.a.c ej = jyVar31.ej();
                hVar137 = this.f320a.hO;
                return com.google.android.apps.gsa.shared.logger.g.a.b(ej, (com.google.android.libraries.search.b.b) hVar137.a());
            case 140:
                jyVar32 = this.f320a.f319a;
                com.google.android.libraries.search.b.f dA = jyVar32.dA();
                jyVar33 = this.f320a.f319a;
                hVar138 = jyVar33.lI;
                com.google.android.libraries.search.t.a.a.b.b bVar2 = (com.google.android.libraries.search.t.a.a.b.b) hVar138.a();
                hVar139 = this.f320a.CQ;
                return new com.google.android.libraries.search.t.a.a.b(dA, bVar2, (com.google.android.libraries.search.integrations.b.a) hVar139.a());
            case 141:
                jyVar34 = this.f320a.f319a;
                hVar140 = jyVar34.lH;
                return new com.google.android.libraries.search.t.a.a.b.b(hVar140);
            case 142:
                fq i2 = fu.i(6);
                i2.i(OmnientActivity.class, new com.google.android.apps.search.omnient.host.activity.k());
                i2.i(OpaActivity.class, new fw());
                i2.i(WeatherActivity.class, new com.google.android.apps.search.weather.k());
                i2.i(GoogleAppActivity.class, new com.google.android.apps.search.googleapp.activity.w());
                jyVar35 = this.f320a.f319a;
                i2.i(LensExportedActivity.class, jyVar35.ek());
                jyVar36 = this.f320a.f319a;
                i2.i(LensientActivity.class, jyVar36.ek());
                return i2.g();
            case 143:
                return new com.google.android.libraries.lens.view.ai.b.a();
            case 144:
                jyVar37 = this.f320a.f319a;
                hVar141 = jyVar37.ax;
                return new com.google.android.libraries.search.t.a.a.a.d((com.google.android.libraries.search.t.a.a.b) hVar141.a());
            case 145:
                hVar142 = this.f320a.hh;
                com.google.android.apps.gsa.shared.util.q.a aVar3 = (com.google.android.apps.gsa.shared.util.q.a) hVar142.a();
                hVar143 = this.f320a.acb;
                e.a b24 = c.b(hVar143);
                jyVar38 = this.f320a.f319a;
                hVar144 = jyVar38.lJ;
                return b.p(aVar3, b24, c.b(hVar144));
            case 146:
                hVar145 = this.f320a.lz;
                com.google.android.apps.gsa.l.g.f fVar = (com.google.android.apps.gsa.l.g.f) hVar145.a();
                hVar146 = this.f320a.gB;
                an anVar = (an) hVar146.a();
                hVar147 = this.f320a.oq;
                r rVar = (r) hVar147.a();
                hVar148 = this.f320a.gz;
                com.google.android.libraries.gsa.h.h hVar254 = (com.google.android.libraries.gsa.h.h) hVar148.a();
                hVar149 = this.f320a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar149.a();
                hVar150 = this.f320a.gq;
                return new com.google.android.apps.gsa.staticplugins.opa.bp.g(fVar, anVar, rVar, hVar254, aVar4, (p) hVar150.a());
            case 147:
                hVar151 = this.f320a.hG;
                return new az(c.b(hVar151));
            case 148:
                return new com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint.c();
            case 149:
                jyVar39 = this.f320a.f319a;
                hVar152 = jyVar39.lK;
                return com.google.android.apps.gsa.staticplugins.e.b.b.b(hVar152);
            case 150:
                hVar153 = this.f320a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar153.a();
                jyVar40 = this.f320a.f319a;
                hVar154 = jyVar40.aD;
                com.google.android.apps.gsa.assist.f.a.b bVar3 = (com.google.android.apps.gsa.assist.f.a.b) hVar154.a();
                hVar155 = this.f320a.hG;
                return new com.google.android.apps.gsa.staticplugins.e.c.f(anVar2, bVar3, (com.google.android.apps.gsa.shared.logger.b.h) hVar155.a());
            case 151:
                hVar156 = this.f320a.f;
                Context context6 = (Context) hVar156.a();
                hVar157 = this.f320a.gq;
                com.google.android.apps.gsa.shared.k.c cVar2 = (com.google.android.apps.gsa.shared.k.c) hVar157.a();
                hVar158 = this.f320a.gy;
                return new com.google.android.apps.gsa.assist.f.a.b(context6, cVar2, (com.google.android.apps.gsa.shared.util.c.a.an) hVar158.a());
            case 152:
                hVar159 = this.f320a.mK;
                return new com.google.android.apps.gsa.staticplugins.feedback.b.a((com.google.android.apps.gsa.shared.n.f) hVar159.a());
            case 153:
                jyVar41 = this.f320a.f319a;
                hVar160 = jyVar41.lL;
                return new com.google.android.apps.gsa.staticplugins.opaonboarding.d.a(hVar160);
            case 154:
                return new dm(this.f320a);
            case 155:
                jyVar42 = this.f320a.f319a;
                hVar161 = jyVar42.lM;
                return com.google.android.apps.gsa.staticplugins.inappwebpage.n.b(hVar161);
            case 156:
                return new mj(this.f320a);
            case 157:
                jyVar43 = this.f320a.f319a;
                hVar162 = jyVar43.lN;
                return b.i(hVar162);
            case 158:
                hVar163 = this.f320a.kg;
                com.google.android.apps.gsa.search.core.ac.t tVar2 = (com.google.android.apps.gsa.search.core.ac.t) hVar163.a();
                hVar164 = this.f320a.gq;
                p pVar5 = (p) hVar164.a();
                hVar165 = this.f320a.oh;
                at atVar4 = (at) hVar165.a();
                hVar166 = this.f320a.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar3 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar166.a();
                hVar167 = this.f320a.gF;
                return new fp(tVar2, pVar5, atVar4, anVar3, (com.google.android.apps.gsa.shared.logger.e) hVar167.a());
            case 159:
                jyVar44 = this.f320a.f319a;
                hVar168 = jyVar44.lO;
                return com.google.android.apps.gsa.staticplugins.cd.a.b.b(hVar168);
            case 160:
                hVar169 = this.f320a.gf;
                return new com.google.android.apps.gsa.staticplugins.cd.d((com.google.android.apps.gsa.search.core.preferences.n) hVar169.a());
            case 161:
                hVar170 = this.f320a.f;
                Context context7 = (Context) hVar170.a();
                jyVar45 = this.f320a.f319a;
                hVar171 = jyVar45.lQ;
                jyVar46 = this.f320a.f319a;
                com.google.android.libraries.w.a.c.a cY = jyVar46.cY();
                jyVar47 = this.f320a.f319a;
                hVar172 = jyVar47.lR;
                com.google.android.gms.gmscompliance.a.a aVar5 = (com.google.android.gms.gmscompliance.a.a) hVar172.a();
                jyVar48 = this.f320a.f319a;
                hVar173 = jyVar48.lS;
                com.google.android.libraries.w.a.d.a aVar6 = (com.google.android.libraries.w.a.d.a) hVar173.a();
                hVar174 = this.f320a.ez;
                return new com.google.android.libraries.w.a.a.g(context7, hVar171, cY, aVar5, aVar6, (com.google.common.v.f) hVar174.a());
            case 162:
                hVar175 = this.f320a.f;
                Context context8 = (Context) hVar175.a();
                jyVar49 = this.f320a.f319a;
                hVar176 = jyVar49.lP;
                return Boolean.valueOf(com.google.android.libraries.search.g.c.b(context8, hVar176));
            case 163:
                return Boolean.valueOf(h.a.a.as.a.a.g.g(this.f320a.agy()));
            case 164:
                hVar177 = this.f320a.f;
                Context context9 = (Context) hVar177.a();
                jyVar50 = this.f320a.f319a;
                return com.google.android.libraries.w.a.b.a.b(context9, jyVar50.cY());
            case 165:
                hVar178 = this.f320a.f;
                return new com.google.android.libraries.w.a.d.a((Context) hVar178.a());
            case 166:
                hVar179 = this.f320a.f;
                Context context10 = (Context) hVar179.a();
                hVar180 = this.f320a.uF;
                return new com.google.android.libraries.web.n.c(context10, (com.google.android.libraries.web.n.b) hVar180.a(), jy.rJ());
            case 167:
                jyVar51 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.as.a.a.g.b(jyVar51.sj()));
            case 168:
                hVar181 = this.f320a.f;
                Context context11 = (Context) hVar181.a();
                jo joVar14 = this.f320a;
                com.google.android.libraries.search.account.b.b jy = joVar14.jy();
                hVar182 = joVar14.Q;
                return new com.google.android.libraries.search.trust.a.a(context11, jy, (ag) hVar182.a());
            case 169:
                jyVar52 = this.f320a.f319a;
                return new com.google.android.libraries.ao.f(jyVar52.pB());
            case 170:
                hVar183 = this.f320a.f;
                return new com.google.android.libraries.social.b.e((Context) hVar183.a());
            case 171:
                hVar184 = this.f320a.mR;
                e.a b25 = c.b(hVar184);
                hVar185 = this.f320a.mW;
                e.a b26 = c.b(hVar185);
                hVar186 = this.f320a.mS;
                e.a b27 = c.b(hVar186);
                hVar187 = this.f320a.mS;
                e.a b28 = c.b(hVar187);
                hVar188 = this.f320a.Nx;
                e.a b29 = c.b(hVar188);
                jyVar53 = this.f320a.f319a;
                ao eP = jyVar53.eP();
                hVar189 = this.f320a.f;
                Context context12 = (Context) hVar189.a();
                hVar190 = this.f320a.Q;
                ag agVar2 = (ag) hVar190.a();
                hVar191 = this.f320a.bo;
                ag agVar3 = (ag) hVar191.a();
                hVar192 = this.f320a.H;
                cr crVar = (cr) hVar192.a();
                hVar193 = this.f320a.B;
                return new com.google.android.apps.gsa.shared.b.a.u(b25, b26, b27, b28, b29, eP, context12, agVar2, agVar3, crVar, (Executor) hVar193.a());
            case 172:
                hVar194 = this.f320a.bo;
                ag agVar4 = (ag) hVar194.a();
                jyVar54 = this.f320a.f319a;
                hVar195 = jyVar54.lV;
                return new com.google.android.apps.search.googleapp.notifications.accountsettings.z(agVar4, c.b(hVar195));
            case 173:
                hVar196 = this.f320a.f;
                return new com.google.android.apps.search.googleapp.notifications.accountsettings.ae((Context) hVar196.a(), this.f320a.jy());
            case 174:
                final at k3 = at.k(com.google.android.libraries.k.a.f.b());
                return new com.google.android.libraries.ao.c.a(k3) { // from class: com.google.android.libraries.k.a.d

                    /* renamed from: a, reason: collision with root package name */
                    public final at f3041a;

                    {
                        this.f3041a = k3;
                    }

                    @Override // com.google.android.libraries.ao.c.a
                    public final void c() {
                        e.d = (e) this.f3041a.a;
                    }
                };
            case 175:
                hVar197 = this.f320a.f;
                Context context13 = (Context) hVar197.a();
                hVar198 = this.f320a.H;
                cr crVar2 = (cr) hVar198.a();
                jyVar55 = this.f320a.f319a;
                hVar199 = jyVar55.lZ;
                e.a b30 = c.b(hVar199);
                hVar200 = this.f320a.bK;
                dj djVar = (dj) hVar200.a();
                hVar201 = this.f320a.an;
                return com.google.android.libraries.search.x.a.e.b(context13, crVar2, b30, djVar, (com.google.android.libraries.search.z.a.a.a) hVar201.a());
            case 176:
                jyVar56 = this.f320a.f319a;
                com.google.android.libraries.search.x.a.f en = jyVar56.en();
                jyVar57 = this.f320a.f319a;
                com.google.android.libraries.search.x.c.a ep = jyVar57.ep();
                jyVar58 = this.f320a.f319a;
                return ha.t(en, ep, jyVar58.eq());
            case 177:
                jo joVar15 = this.f320a;
                com.google.android.libraries.search.t.c.q ll = joVar15.ll();
                jyVar59 = joVar15.f319a;
                int rL = jyVar59.rL();
                hVar202 = this.f320a.Y;
                String str = (String) hVar202.a();
                hVar203 = this.f320a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar203.a();
                hVar204 = this.f320a.Q;
                ag agVar5 = (ag) hVar204.a();
                jyVar60 = this.f320a.f319a;
                return new com.google.android.libraries.search.x.a.a.g(ll, rL, str, aVar7, agVar5, jyVar60.eQ());
            case 178:
                this.f320a.jj();
                return new com.google.android.libraries.ao.c.a() { // from class: com.google.android.libraries.performance.primes.metrics.b.o
                    @Override // com.google.android.libraries.ao.c.a
                    public final void c() {
                        Boolean bool = false;
                        bool.getClass();
                    }
                };
            case 179:
                hVar205 = this.f320a.f;
                final Context context14 = (Context) hVar205.a();
                jyVar61 = this.f320a.f319a;
                hVar206 = jyVar61.oq;
                jyVar62 = this.f320a.f319a;
                final at k4 = at.k(jyVar62.eJ());
                final com.google.android.libraries.ao.c ju = this.f320a.ju();
                return new com.google.android.libraries.ao.c.a(ju, context14, hVar206, k4) { // from class: com.google.android.libraries.ao.a.a

                    /* renamed from: a, reason: collision with root package name */
                    public final com.google.android.libraries.ao.c f2736a;
                    public final Context b;
                    public final k.a.a c;
                    public final at d;

                    {
                        this.f2736a = ju;
                        this.b = context14;
                        this.c = hVar206;
                        this.d = k4;
                    }

                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.common.base.ah] */
                    @Override // com.google.android.libraries.ao.c.a
                    public final void c() {
                        if (!this.f2736a.a()) {
                            Boolean bool = false;
                            bool.getClass();
                            return;
                        }
                        com.google.common.base.bd bdVar = this.d;
                        k.a.a aVar8 = this.c;
                        Application application = (Application) this.b;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) bdVar.a.apply(new b(application, aVar8, bdVar)));
                    }
                };
            case 180:
                jo joVar16 = this.f320a;
                gy l = ha.l(7);
                jyVar63 = joVar16.f319a;
                l.h(jyVar63.j());
                jyVar64 = this.f320a.f319a;
                l.h(jyVar64.i());
                jyVar65 = this.f320a.f319a;
                l.j(jyVar65.pM());
                jyVar66 = this.f320a.f319a;
                l.j(jyVar66.pL());
                jyVar67 = this.f320a.f319a;
                l.h(jyVar67.k());
                jyVar68 = this.f320a.f319a;
                l.h(jyVar68.el());
                jyVar69 = this.f320a.f319a;
                hVar207 = jyVar69.op;
                l.h((Application.ActivityLifecycleCallbacks) hVar207.a());
                return l.g();
            case 181:
                jyVar70 = this.f320a.f319a;
                hVar208 = jyVar70.mc;
                return com.google.apps.tiktok.c.c.b((m.c.n) hVar208.a());
            case 182:
                jo joVar17 = this.f320a;
                com.google.apps.tiktok.f.i mD = joVar17.mD();
                hVar209 = joVar17.B;
                return com.google.apps.tiktok.f.g.c(mD, (cr) hVar209.a());
            case 183:
                jyVar71 = this.f320a.f319a;
                hVar210 = jyVar71.aO;
                com.google.android.libraries.notifications.platform.k.a aVar8 = (com.google.android.libraries.notifications.platform.k.a) hVar210.a();
                jyVar72 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.entrypoints.systemtray.f(aVar8, jyVar72.da());
            case 184:
                return new com.google.android.libraries.notifications.platform.k.a.a();
            case 185:
                hVar211 = this.f320a.n;
                cq cqVar = (cq) hVar211.a();
                hVar212 = this.f320a.L;
                com.google.apps.tiktok.concurrent.k kVar = (com.google.apps.tiktok.concurrent.k) hVar212.a();
                hVar213 = this.f320a.bz;
                com.google.apps.tiktok.concurrent.ao aoVar = (com.google.apps.tiktok.concurrent.ao) hVar213.a();
                hVar214 = this.f320a.v;
                return new com.google.android.libraries.notifications.platform.n.a.d(cqVar, kVar, aoVar, (ScheduledExecutorService) hVar214.a());
            case 186:
                jyVar73 = this.f320a.f319a;
                hVar215 = jyVar73.mz;
                com.google.android.libraries.notifications.internal.storage.impl.h hVar255 = (com.google.android.libraries.notifications.internal.storage.impl.h) hVar215.a();
                jyVar74 = this.f320a.f319a;
                hVar216 = jyVar74.mA;
                return new com.google.android.libraries.notifications.internal.storage.impl.j(hVar255, (cq) hVar216.a());
            case 187:
                hVar217 = this.f320a.f;
                Context context15 = (Context) hVar217.a();
                jyVar75 = this.f320a.f319a;
                hVar218 = jyVar75.my;
                e.a b31 = c.b(hVar218);
                hVar219 = this.f320a.g;
                return new com.google.android.libraries.notifications.internal.storage.impl.h(context15, b31, (com.google.android.libraries.g.a) hVar219.a());
            case 188:
                hVar220 = this.f320a.f;
                Context context16 = (Context) hVar220.a();
                jo joVar18 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b32 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar76 = joVar18.f319a;
                hVar221 = jyVar76.me;
                com.google.android.libraries.notifications.platform.internal.d.d dVar = (com.google.android.libraries.notifications.platform.internal.d.d) hVar221.a();
                hVar222 = this.f320a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar222.a();
                jyVar77 = this.f320a.f319a;
                hVar223 = jyVar77.mi;
                com.google.android.libraries.notifications.platform.internal.o.n nVar2 = (com.google.android.libraries.notifications.platform.internal.o.n) hVar223.a();
                jyVar78 = this.f320a.f319a;
                hVar224 = jyVar78.mv;
                com.google.android.libraries.notifications.internal.k.f fVar2 = (com.google.android.libraries.notifications.internal.k.f) hVar224.a();
                jyVar79 = this.f320a.f319a;
                hVar225 = jyVar79.mw;
                com.google.android.libraries.notifications.platform.b.a.b bVar4 = (com.google.android.libraries.notifications.platform.b.a.b) hVar225.a();
                jyVar80 = this.f320a.f319a;
                hVar226 = jyVar80.mk;
                com.google.android.libraries.notifications.internal.n.d dVar2 = (com.google.android.libraries.notifications.internal.n.d) hVar226.a();
                jyVar81 = this.f320a.f319a;
                hVar227 = jyVar81.aP;
                com.google.android.libraries.notifications.platform.f.b bVar5 = (com.google.android.libraries.notifications.platform.f.b) hVar227.a();
                jyVar82 = this.f320a.f319a;
                hVar228 = jyVar82.aO;
                com.google.android.libraries.notifications.platform.k.a aVar10 = (com.google.android.libraries.notifications.platform.k.a) hVar228.a();
                jyVar83 = this.f320a.f319a;
                hVar229 = jyVar83.mx;
                return new com.google.android.libraries.notifications.internal.b.a.b(context16, b32, dVar, aVar9, nVar2, fVar2, bVar4, dVar2, bVar5, aVar10, (Random) hVar229.a());
            case 189:
                jo joVar19 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b33 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar84 = joVar19.f319a;
                hVar230 = jyVar84.aO;
                com.google.android.libraries.notifications.platform.k.a aVar11 = (com.google.android.libraries.notifications.platform.k.a) hVar230.a();
                hVar231 = this.f320a.f;
                return com.google.android.libraries.notifications.platform.internal.d.c.b(b33, aVar11, (Context) hVar231.a());
            case 190:
                hVar232 = this.f320a.f;
                Context context17 = (Context) hVar232.a();
                com.google.android.libraries.search.integrations.j.b.b();
                jyVar85 = this.f320a.f319a;
                hVar233 = jyVar85.aR;
                com.google.android.libraries.notifications.platform.internal.m.a aVar12 = (com.google.android.libraries.notifications.platform.internal.m.a) hVar233.a();
                jyVar86 = this.f320a.f319a;
                hVar234 = jyVar86.mh;
                return new com.google.android.libraries.notifications.platform.internal.o.a.m(context17, aVar12, (com.google.android.libraries.notifications.platform.internal.o.m) hVar234.a());
            case 191:
                hVar235 = this.f320a.f;
                Context context18 = (Context) hVar235.a();
                jo joVar20 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b34 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar87 = joVar20.f319a;
                hVar236 = jyVar87.aQ;
                return new com.google.android.libraries.notifications.platform.internal.m.a.a(context18, b34, (com.google.android.libraries.notifications.platform.internal.h.a.a) hVar236.a());
            case 192:
                return new com.google.android.libraries.notifications.platform.internal.h.a.a();
            case 193:
                jyVar88 = this.f320a.f319a;
                at k5 = at.k(jyVar88.eh());
                com.google.android.libraries.search.integrations.j.b.b();
                jyVar89 = this.f320a.f319a;
                at k6 = at.k(jyVar89.ru());
                jyVar90 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.platform.internal.o.a.k(k5, k6, jyVar90.rs());
            case 194:
                hVar237 = this.f320a.f;
                return com.google.android.libraries.notifications.platform.internal.n.a.w.c((Context) hVar237.a());
            case 195:
                hVar238 = this.f320a.f;
                Context context19 = (Context) hVar238.a();
                jo joVar21 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b35 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar91 = joVar21.f319a;
                at k7 = at.k(jyVar91.eh());
                jyVar92 = this.f320a.f319a;
                hVar239 = jyVar92.mk;
                com.google.android.libraries.notifications.internal.n.d dVar3 = (com.google.android.libraries.notifications.internal.n.d) hVar239.a();
                jyVar93 = this.f320a.f319a;
                hVar240 = jyVar93.ms;
                at k8 = at.k((com.google.android.libraries.notifications.d.b.c.a.c) hVar240.a());
                jyVar94 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.o.a.a dp = jyVar94.dp();
                jyVar95 = this.f320a.f319a;
                hVar241 = jyVar95.mu;
                com.google.android.libraries.notifications.internal.k.e eVar = (com.google.android.libraries.notifications.internal.k.e) hVar241.a();
                jyVar96 = this.f320a.f319a;
                at k9 = at.k(jyVar96.ru());
                jyVar97 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.internal.k.a.j(context19, b35, k7, dVar3, k8, dp, eVar, k9, jyVar97.rs());
            case 196:
                hVar242 = this.f320a.f;
                return new com.google.android.libraries.notifications.internal.n.a.i((Context) hVar242.a(), com.google.android.libraries.search.integrations.j.b.b());
            case 197:
                jyVar98 = this.f320a.f319a;
                hVar243 = jyVar98.ml;
                com.google.android.libraries.notifications.d.b.c.a.a aVar13 = (com.google.android.libraries.notifications.d.b.c.a.a) hVar243.a();
                jyVar99 = this.f320a.f319a;
                hVar244 = jyVar99.mm;
                com.google.android.libraries.notifications.d.b.d.a aVar14 = (com.google.android.libraries.notifications.d.b.d.a) hVar244.a();
                jyVar100 = this.f320a.f319a;
                hVar245 = jyVar100.mn;
                com.google.android.libraries.notifications.d.b.d.c cVar3 = (com.google.android.libraries.notifications.d.b.d.c) hVar245.a();
                jyVar101 = this.f320a.f319a;
                hVar246 = jyVar101.mr;
                return new com.google.android.libraries.notifications.d.b.c.a.c(aVar13, aVar14, cVar3, (com.google.android.libraries.notifications.d.b.d.e) hVar246.a());
            case 198:
                hVar247 = this.f320a.f;
                return new com.google.android.libraries.notifications.d.b.c.a.a((Context) hVar247.a());
            case 199:
                hVar248 = this.f320a.f;
                return new com.google.android.libraries.notifications.d.b.d.a.b((Context) hVar248.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case 1000:
                return this.f320a.f319a.sp().b();
            case 1001:
                return this.f320a.f319a.sp().c();
            case 1002:
                com.google.speech.g.bn a2 = com.google.android.apps.search.assistant.surfaces.bisto.e.f.a.b.a.a(this.f320a.f319a.eW());
                a2.getClass();
                return a2;
            case 1003:
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.d.n.d();
            case 1004:
                return new h.a.a.d.a.a.g(this.f320a.V).c();
            case 1005:
                return new h.a.a.d.a.a.g(this.f320a.V).d();
            case 1006:
                jo joVar = this.f320a;
                return new com.google.android.apps.gsa.assist.b(joVar.gy, e.c.i.b(joVar.f319a.ib), joVar.oY, joVar.gq, e.c.i.b(joVar.is), this.f320a.gm);
            case 1007:
                return at.k((com.google.android.apps.gsa.staticplugins.e.b) this.f320a.f319a.ia.a());
            case 1008:
                return new com.google.android.apps.gsa.staticplugins.e.b((com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.assist.a.i) this.f320a.oY.a(), (com.google.android.apps.gsa.assist.a.a) this.f320a.f319a.hd.a(), c.b(this.f320a.hG), (com.google.android.libraries.gsa.h.h) this.f320a.f319a.hZ.a());
            case 1009:
                return ((com.google.android.apps.gsa.shared.util.c.a.aw) this.f320a.he.a()).a(com.google.android.apps.gsa.staticplugins.e.a.class);
            case 1010:
                return new com.google.android.apps.gsa.shared.s.a((com.google.android.libraries.g.a) this.f320a.g.a());
            case 1011:
                return new com.google.android.apps.gsa.tasks.a.a();
            case 1012:
                return new al(c.b(this.f320a.f319a.bz));
            case 1013:
                return new com.google.android.apps.gsa.hotword.a.f(this.f320a.f319a.B());
            case 1014:
                return new com.google.android.apps.gsa.hotword.a.j((com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a(), (com.google.android.apps.gsa.shared.speech.a.i) this.f320a.f319a.eX.a(), (an) this.f320a.gB.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), (com.google.android.libraries.search.b.b) this.f320a.hO.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.speech.hotword.b.a) this.f320a.hR.a(), (com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gf.a());
            case 1015:
                return new com.google.android.apps.gsa.staticplugins.backup.e((String) this.f320a.gi.a());
            case 1016:
                jo joVar2 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.b.p(joVar2.f319a.aI(), (com.google.android.libraries.search.t.i.y) joVar2.W.a());
            case 1017:
                return new com.google.android.apps.gsa.staticplugins.t.b((ContentResolver) this.f320a.f319a.gt.a(), (com.google.android.apps.gsa.i.d) this.f320a.gL.a(), (com.google.android.apps.gsa.i.e) this.f320a.gM.a(), (com.google.android.apps.gsa.contacts.at) this.f320a.pK.a(), (ba) this.f320a.f319a.ij.a(), (Executor) this.f320a.v.a(), (com.google.android.apps.gsa.search.core.aa.a.c) this.f320a.ls.a());
            case 1018:
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f320a.g.a();
                com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                com.google.android.apps.gsa.tasks.m mVar = (com.google.android.apps.gsa.tasks.m) this.f320a.gP.a();
                p pVar = (p) this.f320a.gq.a();
                com.google.android.apps.gsa.search.core.ae aeVar = (com.google.android.apps.gsa.search.core.ae) this.f320a.lu.a();
                jo joVar3 = this.f320a;
                return new ba(aVar, hVar, mVar, pVar, aeVar, joVar3.ab(), (an) joVar3.gB.a(), (com.google.android.apps.gsa.contacts.m) this.f320a.pJ.a(), (com.google.android.apps.gsa.w.a) this.f320a.gn.a(), (com.google.android.apps.gsa.search.core.aa.a.c) this.f320a.ls.a());
            case 1019:
                com.google.android.apps.gsa.contacts.at atVar = (com.google.android.apps.gsa.contacts.at) this.f320a.pK.a();
                ba baVar = (ba) this.f320a.f319a.ij.a();
                p pVar2 = (p) this.f320a.gq.a();
                jo joVar4 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.t.e(atVar, baVar, pVar2, c.b(joVar4.f319a.im), (Executor) joVar4.v.a(), (com.google.android.apps.gsa.search.core.aa.a.c) this.f320a.ls.a());
            case 1020:
                jo joVar5 = this.f320a;
                return new com.google.android.libraries.assistant.f.a.g(c.b(joVar5.f319a.il), c.b(joVar5.jC));
            case 1021:
                return com.google.android.libraries.assistant.f.a.a.a((Context) this.f320a.f.a(), (com.google.android.libraries.storage.protostore.af) this.f320a.aA.a());
            case 1022:
                return new DeleteExpiredContentTask((com.google.android.libraries.g.a) this.f320a.g.a(), (com.google.android.apps.gsa.search.core.y.a.a) this.f320a.nz.a(), this.f320a.f319a.qo());
            case 1023:
                return com.google.android.apps.gsa.store.n.a(this.f320a.f319a.hL, com.google.android.apps.gsa.s.c.CONTENT_STORE_CONVERSATION_CLIENT);
            case 1024:
                return com.google.android.apps.gsa.store.n.a(this.f320a.f319a.io, com.google.android.apps.gsa.s.c.CONTENT_STORE_NOW);
            case 1025:
                jo joVar6 = this.f320a;
                com.google.android.apps.gsa.staticplugins.bv.b.u eL = joVar6.eL();
                ca caVar = (ca) joVar6.nA.a();
                jo joVar7 = this.f320a;
                return com.google.android.apps.gsa.staticplugins.bv.a.d.a(eL, caVar, joVar7.nD(), (com.google.android.apps.gsa.shared.util.debug.d) joVar7.aD.a(), (p) this.f320a.gq.a());
            case 1026:
                return com.google.android.apps.gsa.store.n.a(this.f320a.nB, com.google.android.apps.gsa.s.c.CONTENT_STORE_OPA);
            case 1027:
                return com.google.android.apps.gsa.store.n.a(this.f320a.pg, com.google.android.apps.gsa.s.c.CONTENT_STORE_SEARCHBOX);
            case 1028:
                return com.google.android.apps.gsa.store.n.a(this.f320a.f319a.fV, com.google.android.apps.gsa.s.c.CONTENT_STORE_STATE_DUMP_EVENT);
            case 1029:
                com.google.android.apps.gsa.sidekick.a.a.b bVar = (com.google.android.apps.gsa.sidekick.a.a.b) this.f320a.hA.a();
                an anVar = (an) this.f320a.gB.a();
                return new com.google.android.apps.gsa.search.core.c(bVar, anVar);
            case 1030:
                return new com.google.android.apps.gsa.search.core.f((Context) this.f320a.f.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.sidekick.a.a.f) this.f320a.hy.a(), (an) this.f320a.gB.a(), (com.google.android.apps.gsa.search.core.udc.q) this.f320a.hu.a(), c.b(this.f320a.hv), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), (com.google.android.libraries.storage.a.j) this.f320a.as.a());
            case 1031:
                Context context = (Context) this.f320a.f.a();
                jo joVar8 = this.f320a;
                return new com.google.android.apps.gsa.speech.g.b(context, joVar8.f319a.ak(), (com.google.android.apps.gsa.speech.o.g) joVar8.gV.a(), (com.google.android.apps.gsa.search.core.h.u) this.f320a.hK.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.speech.e.b) this.f320a.lU.a(), (com.google.android.apps.gsa.speech.e.b.i) this.f320a.lX.a(), (com.google.android.apps.gsa.speech.e.a.c) this.f320a.f319a.hg.a(), c.b(this.f320a.ny), (com.google.android.apps.gsa.shared.o.a.a) this.f320a.gm.a());
            case 1032:
                return new com.google.android.apps.gsa.languagepack.av((com.google.android.apps.gsa.languagepack.ak) this.f320a.lW.a(), c.b(this.f320a.hD), (com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a(), (p) this.f320a.gq.a(), ((Boolean) this.f320a.hi.a()).booleanValue(), (cq) this.f320a.H.a(), (cq) this.f320a.v.a());
            case 1033:
                return new com.google.android.apps.gsa.staticplugins.opa.promo.n((com.google.android.apps.gsa.assistant.shared.ab) this.f320a.iq.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.assistant.shared.z) this.f320a.gt.a());
            case 1034:
                return new com.google.android.apps.gsa.staticplugins.opa.promo.m((com.google.android.apps.gsa.assistant.shared.ab) this.f320a.iq.a(), 0);
            case 1035:
                return new com.google.android.apps.gsa.staticplugins.opa.promo.m(this.f320a.K(), 1);
            case 1036:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.activity.a.a(c.b(this.f320a.ip), (com.google.android.libraries.g.a) this.f320a.g.a(), (com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gf.a());
            case 1037:
                return new com.google.android.apps.gsa.search.core.google.gaia.ao((an) this.f320a.gB.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.assistant.shared.aw) this.f320a.f319a.bC.a());
            case 1038:
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.i.j((com.google.android.apps.gsa.opa.smartspace.c) this.f320a.oi.a());
            case 1039:
                com.google.android.apps.gsa.speech.o.g gVar = (com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a();
                com.google.android.apps.gsa.speech.k.a aVar2 = (com.google.android.apps.gsa.speech.k.a) this.f320a.hY.a();
                jo joVar9 = this.f320a;
                return new com.google.android.apps.gsa.hotword.b.a.c(gVar, aVar2, joVar9.f319a.ab(), joVar9.f319a.iB, c.b(joVar9.hG), (com.google.android.libraries.search.b.b) this.f320a.hO.a(), (com.google.android.apps.gsa.hotword.b.j) this.f320a.mx.a(), (com.google.android.libraries.search.ai.o) this.f320a.mw.a(), (cq) this.f320a.v.a());
            case 1040:
                return new com.google.android.apps.gsa.hotword.b.a((com.google.android.apps.gsa.tasks.m) this.f320a.gP.a(), (com.google.android.apps.gsa.speech.k.a) this.f320a.hY.a(), (com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a(), (com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gf.a());
            case 1041:
                jy jyVar = this.f320a.f319a;
                return new com.google.android.apps.gsa.staticplugins.bp.e.c(jyVar.rZ(), jyVar.a());
            case 1042:
                return new com.google.android.apps.gsa.search.core.google.ab(this.f320a.cP(), 1);
            case 1043:
                return new com.google.android.apps.gsa.search.core.google.m((com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gf.a(), (com.google.android.apps.gsa.search.shared.service.e.e) this.f320a.jv.a());
            case 1044:
                return new com.google.android.apps.gsa.search.core.google.ab((com.google.android.apps.gsa.search.shared.service.e.e) this.f320a.jv.a(), 0);
            case 1045:
                return new com.google.android.apps.gsa.search.core.z.b((Context) this.f320a.f.a());
            case 1046:
                return new com.google.android.apps.gsa.staticplugins.smartspace.b.g(this.f320a.f319a.aS(), 1);
            case 1047:
                return new com.google.android.apps.gsa.staticplugins.smartspace.b.g(this.f320a.f319a.aS(), 0);
            case 1048:
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.a.c((com.google.android.apps.gsa.opa.smartspace.c) this.f320a.oi.a());
            case 1049:
                return Optional.of(this.f320a.f319a.aM());
            case 1050:
                return Optional.of((com.google.android.apps.gsa.assistant.settings.features.x.a.j) this.f320a.iw.a());
            case 1051:
                return new com.google.android.apps.gsa.staticplugins.nga.ui.account.a.a((an) this.f320a.gB.a());
            case 1052:
                Set a3 = com.google.android.apps.gsa.speech.i.a.a.a();
                a3.getClass();
                return a3;
            case 1053:
                return com.google.android.apps.gsa.staticplugins.bi.e.d.a(this.f320a.lU);
            case 1054:
                return new com.google.android.apps.gsa.staticplugins.au.a(this.f320a.f319a.iW);
            case 1055:
                this.f320a.f319a.sh();
                return new com.google.android.apps.gsa.staticplugins.au.a.a();
            case 1056:
                jo joVar10 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.au.c.a(joVar10.hS, joVar10.gV);
            case 1057:
                c.b(this.f320a.gF);
                return new com.google.android.apps.gsa.staticplugins.au.c.a();
            case 1058:
                com.google.android.apps.gsa.x.d.a.a aVar3 = (com.google.android.apps.gsa.x.d.a.a) this.f320a.f319a.gP.a();
                com.google.android.apps.gsa.shared.k.c cVar = (com.google.android.apps.gsa.shared.k.c) this.f320a.gq.a();
                jy jyVar2 = this.f320a.f319a;
                com.google.android.apps.gsa.b.f.u x = jyVar2.x();
                jyVar2.rT();
                jo joVar11 = this.f320a;
                e.a b = c.b(joVar11.f319a.iS);
                e.a b2 = c.b(joVar11.hG);
                e.a b3 = c.b(this.f320a.f319a.gQ);
                jo joVar12 = this.f320a;
                e.a b4 = c.b(joVar12.f319a.iT);
                com.google.android.apps.gsa.shared.util.c.a.g gVar2 = (com.google.android.apps.gsa.shared.util.c.a.g) joVar12.ha.a();
                com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) this.f320a.gp.a();
                e.a b5 = c.b(this.f320a.f319a.gR);
                com.google.android.apps.gsa.speech.audio.k kVar = (com.google.android.apps.gsa.speech.audio.k) this.f320a.f319a.gS.a();
                jy jyVar3 = this.f320a.f319a;
                return new com.google.android.apps.gsa.b.f.i(aVar3, cVar, x, b, b2, b3, b4, gVar2, hVar2, b5, kVar, c.b(jyVar3.iU), c.b(jyVar3.gT), c.b(this.f320a.f319a.gU), c.b(this.f320a.f319a.gp), (at) this.f320a.f319a.gM.a());
            case 1059:
                jo joVar13 = this.f320a;
                return new com.google.android.apps.gsa.b.f.a(joVar13.f319a.eb(), (com.google.android.apps.gsa.shared.util.c.a.g) joVar13.ha.a(), c.b(this.f320a.f319a.iR));
            case 1060:
                return new com.google.android.apps.gsa.b.f.b(c.b(this.f320a.gF), c.b(this.f320a.hG));
            case 1061:
                return new com.google.android.apps.gsa.b.f.w((com.google.android.apps.gsa.x.a.e) this.f320a.ps.a(), (Context) this.f320a.f.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a());
            case 1062:
                return new com.google.android.apps.gsa.b.f.x(c.b(this.f320a.cQ), c.b(this.f320a.f319a.gQ));
            case 1063:
                return new com.google.android.apps.gsa.b.f.f();
            case 1064:
                return new com.google.android.apps.gsa.speech.e.c.r((com.google.android.libraries.assistant.soda.ac) this.f320a.f319a.jg.a(), (Context) this.f320a.f.a(), (com.google.android.apps.gsa.shared.logger.b.h) this.f320a.hG.a(), c.b(this.f320a.mm), (com.google.android.apps.gsa.speech.e.c.u) this.f320a.f319a.jh.a());
            case 1065:
                jo joVar14 = this.f320a;
                h hVar3 = e.c.g.b;
                jy jyVar4 = joVar14.f319a;
                return new com.google.android.libraries.assistant.soda.ac(hVar3, jyVar4.ja, jyVar4.jc, jyVar4.jf, joVar14.v, joVar14.H);
            case 1066:
                return at.k(this.f320a.iA());
            case 1067:
                return at.k((com.google.android.libraries.assistant.soda.ag) this.f320a.f319a.jb.a());
            case 1068:
                return new Soda((Context) this.f320a.f.a(), (cq) this.f320a.v.a(), (cr) this.f320a.H.a());
            case 1069:
                return new com.google.android.libraries.assistant.soda.h((Context) this.f320a.f.a(), (cq) this.f320a.v.a(), (cr) this.f320a.H.a(), Optional.of((com.google.android.libraries.speech.transcription.d.a) this.f320a.f319a.jd.a()), Optional.empty(), Optional.of(this.f320a.iA()), Optional.of((com.google.android.libraries.assistant.soda.c.j) this.f320a.f319a.je.a()));
            case 1070:
                com.google.android.apps.search.d.a.d b6 = this.f320a.f319a.oW().b();
                com.google.protos.l.a.e c = this.f320a.f319a.oW().c();
                ao d = ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45357884").d();
                boolean f = ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45386178").f();
                ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45408219").d();
                long b7 = ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45407723").b();
                ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45408541").f();
                long a4 = this.f320a.f319a.oW().a();
                boolean f2 = ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45459633").f();
                boolean f3 = ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45531009").f();
                ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45615079").f();
                boolean f4 = ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.oW().a.a()).a("com.google.android.apps.search.transcription.device 45622795").f();
                jo joVar15 = this.f320a;
                jy jyVar5 = joVar15.f319a;
                return new com.google.android.libraries.speech.transcription.d.a(b6, c, d, f, b7, a4, f2, f3, f4, jyVar5.ri(), jyVar5.eB(), joVar15.f319a.rj());
            case 1071:
                return ((lt) this.f320a.mi.a()).E(new com.google.android.libraries.speech.transcription.g.au());
            case 1072:
                return new com.google.android.apps.gsa.speech.e.c.u(c.b(this.f320a.gq));
            case 1073:
                return new com.google.android.apps.gsa.assist.b.a((Context) this.f320a.f.a(), (String) this.f320a.gX.a(), (com.google.android.apps.gsa.search.core.h.b) this.f320a.hw.a(), (com.google.android.apps.gsa.n.h) this.f320a.lN.a(), (com.google.android.apps.gsa.search.core.google.w) this.f320a.oC.a(), (com.google.android.apps.gsa.assist.a.a) this.f320a.f319a.hd.a(), (com.google.android.apps.gsa.search.core.ae) this.f320a.lu.a());
            case 1074:
                return Integer.valueOf(com.google.android.apps.gsa.staticplugins.s3request.b.a.a((com.google.android.apps.gsa.shared.k.c) this.f320a.gq.a()));
            case 1075:
                return "voice-search";
            case 1076:
                return Boolean.valueOf(this.f320a.f319a.sA().c());
            case 1077:
                return Boolean.valueOf(com.google.android.libraries.assistant.auto.tng.s.a.a.a.a(Optional.of((Boolean) this.f320a.f319a.jr.a())));
            case 1078:
            case 1094:
            case 1095:
            case 1098:
                return false;
            case 1079:
                com.google.android.libraries.assistant.auto.tng.common.o.a.h hVar4 = (com.google.android.libraries.assistant.auto.tng.common.o.a.h) this.f320a.f319a.jt.a();
                jy jyVar6 = this.f320a.f319a;
                return com.google.android.apps.gsa.staticplugins.p.b.b.b.a(hVar4, jyVar6.ju, jyVar6.ai());
            case 1080:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f320a.wN.a();
                jo joVar16 = this.f320a;
                return new com.google.android.libraries.assistant.auto.tng.common.o.a.h(connectivityManager, joVar16.f319a.rx(), Optional.of(joVar16.nP()), (Executor) this.f320a.H.a());
            case 1081:
                return Boolean.valueOf(this.f320a.f319a.sB().d());
            case 1082:
                return 3000L;
            case 1083:
            case 1096:
                return -1L;
            case 1084:
                return 6000L;
            case 1085:
                return 1000L;
            case 1086:
                return Boolean.valueOf(this.f320a.f319a.sC().e());
            case 1087:
                return 2000L;
            case 1088:
            case 1089:
            case 1093:
                return 5000L;
            case 1090:
                return Double.valueOf(0.5d);
            case 1091:
                return Double.valueOf(1.5d);
            case 1092:
                return 500L;
            case 1097:
                int i2 = fl.e;
                fl flVar = ni.a;
                flVar.getClass();
                return flVar;
            case 1099:
                return Boolean.valueOf(this.f320a.f319a.sx().a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        h hVar;
        h hVar2;
        jy jyVar;
        h hVar3;
        jy jyVar2;
        h hVar4;
        jy jyVar3;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        jy jyVar4;
        h hVar12;
        jy jyVar5;
        h hVar13;
        jy jyVar6;
        h hVar14;
        jy jyVar7;
        jy jyVar8;
        h hVar15;
        jy jyVar9;
        h hVar16;
        jy jyVar10;
        h hVar17;
        h hVar18;
        jy jyVar11;
        h hVar19;
        jy jyVar12;
        h hVar20;
        jy jyVar13;
        h hVar21;
        jy jyVar14;
        h hVar22;
        jy jyVar15;
        h hVar23;
        h hVar24;
        jy jyVar16;
        h hVar25;
        h hVar26;
        jy jyVar17;
        jy jyVar18;
        jy jyVar19;
        h hVar27;
        jy jyVar20;
        h hVar28;
        jy jyVar21;
        h hVar29;
        jy jyVar22;
        h hVar30;
        jy jyVar23;
        h hVar31;
        h hVar32;
        jy jyVar24;
        jy jyVar25;
        h hVar33;
        jy jyVar26;
        h hVar34;
        jy jyVar27;
        h hVar35;
        jy jyVar28;
        jy jyVar29;
        h hVar36;
        h hVar37;
        jy jyVar30;
        h hVar38;
        jy jyVar31;
        h hVar39;
        jy jyVar32;
        h hVar40;
        jy jyVar33;
        h hVar41;
        jy jyVar34;
        h hVar42;
        jy jyVar35;
        h hVar43;
        h hVar44;
        h hVar45;
        jy jyVar36;
        h hVar46;
        jy jyVar37;
        h hVar47;
        h hVar48;
        jy jyVar38;
        h hVar49;
        jy jyVar39;
        h hVar50;
        jy jyVar40;
        h hVar51;
        jy jyVar41;
        h hVar52;
        jy jyVar42;
        h hVar53;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        h hVar58;
        h hVar59;
        jy jyVar43;
        h hVar60;
        h hVar61;
        h hVar62;
        jy jyVar44;
        h hVar63;
        jy jyVar45;
        h hVar64;
        jy jyVar46;
        h hVar65;
        jy jyVar47;
        h hVar66;
        h hVar67;
        h hVar68;
        jy jyVar48;
        h hVar69;
        jy jyVar49;
        h hVar70;
        jy jyVar50;
        h hVar71;
        jy jyVar51;
        h hVar72;
        jy jyVar52;
        h hVar73;
        h hVar74;
        h hVar75;
        jy jyVar53;
        h hVar76;
        jy jyVar54;
        h hVar77;
        jy jyVar55;
        h hVar78;
        jy jyVar56;
        h hVar79;
        h hVar80;
        jy jyVar57;
        h hVar81;
        h hVar82;
        h hVar83;
        h hVar84;
        jy jyVar58;
        h hVar85;
        jy jyVar59;
        h hVar86;
        jy jyVar60;
        h hVar87;
        jy jyVar61;
        h hVar88;
        jy jyVar62;
        h hVar89;
        jy jyVar63;
        h hVar90;
        jy jyVar64;
        h hVar91;
        jy jyVar65;
        h hVar92;
        jy jyVar66;
        h hVar93;
        h hVar94;
        jy jyVar67;
        jy jyVar68;
        h hVar95;
        jy jyVar69;
        h hVar96;
        jy jyVar70;
        h hVar97;
        jy jyVar71;
        h hVar98;
        jy jyVar72;
        h hVar99;
        jy jyVar73;
        h hVar100;
        jy jyVar74;
        h hVar101;
        jy jyVar75;
        h hVar102;
        h hVar103;
        jy jyVar76;
        h hVar104;
        jy jyVar77;
        h hVar105;
        jy jyVar78;
        h hVar106;
        h hVar107;
        jy jyVar79;
        h hVar108;
        jy jyVar80;
        h hVar109;
        jy jyVar81;
        h hVar110;
        jy jyVar82;
        h hVar111;
        jy jyVar83;
        h hVar112;
        jy jyVar84;
        h hVar113;
        jy jyVar85;
        h hVar114;
        jy jyVar86;
        h hVar115;
        jy jyVar87;
        h hVar116;
        jy jyVar88;
        h hVar117;
        jy jyVar89;
        h hVar118;
        jy jyVar90;
        h hVar119;
        jy jyVar91;
        jy jyVar92;
        jy jyVar93;
        h hVar120;
        jy jyVar94;
        h hVar121;
        jy jyVar95;
        h hVar122;
        jy jyVar96;
        h hVar123;
        jy jyVar97;
        h hVar124;
        h hVar125;
        h hVar126;
        h hVar127;
        jy jyVar98;
        jy jyVar99;
        h hVar128;
        jy jyVar100;
        h hVar129;
        jy jyVar101;
        h hVar130;
        jy jyVar102;
        h hVar131;
        jy jyVar103;
        h hVar132;
        jy jyVar104;
        h hVar133;
        jy jyVar105;
        h hVar134;
        jy jyVar106;
        h hVar135;
        jy jyVar107;
        h hVar136;
        jy jyVar108;
        h hVar137;
        jy jyVar109;
        h hVar138;
        jy jyVar110;
        h hVar139;
        jy jyVar111;
        h hVar140;
        jy jyVar112;
        h hVar141;
        jy jyVar113;
        h hVar142;
        jy jyVar114;
        h hVar143;
        h hVar144;
        jy jyVar115;
        h hVar145;
        jy jyVar116;
        jy jyVar117;
        jy jyVar118;
        h hVar146;
        jy jyVar119;
        jy jyVar120;
        h hVar147;
        jy jyVar121;
        h hVar148;
        jy jyVar122;
        h hVar149;
        jy jyVar123;
        h hVar150;
        jy jyVar124;
        h hVar151;
        jy jyVar125;
        h hVar152;
        h hVar153;
        jy jyVar126;
        h hVar154;
        h hVar155;
        h hVar156;
        jy jyVar127;
        h hVar157;
        jy jyVar128;
        h hVar158;
        jy jyVar129;
        h hVar159;
        jy jyVar130;
        jy jyVar131;
        h hVar160;
        jy jyVar132;
        h hVar161;
        jy jyVar133;
        h hVar162;
        h hVar163;
        jy jyVar134;
        h hVar164;
        jy jyVar135;
        h hVar165;
        jy jyVar136;
        h hVar166;
        jy jyVar137;
        h hVar167;
        jy jyVar138;
        h hVar168;
        jy jyVar139;
        h hVar169;
        jy jyVar140;
        h hVar170;
        jy jyVar141;
        h hVar171;
        jy jyVar142;
        h hVar172;
        jy jyVar143;
        h hVar173;
        jy jyVar144;
        h hVar174;
        jy jyVar145;
        h hVar175;
        jy jyVar146;
        h hVar176;
        jy jyVar147;
        h hVar177;
        jy jyVar148;
        h hVar178;
        jy jyVar149;
        h hVar179;
        jy jyVar150;
        h hVar180;
        h hVar181;
        jy jyVar151;
        jy jyVar152;
        h hVar182;
        jy jyVar153;
        h hVar183;
        jy jyVar154;
        h hVar184;
        jy jyVar155;
        h hVar185;
        jy jyVar156;
        h hVar186;
        jy jyVar157;
        h hVar187;
        jy jyVar158;
        h hVar188;
        h hVar189;
        jy jyVar159;
        h hVar190;
        jy jyVar160;
        h hVar191;
        h hVar192;
        jy jyVar161;
        h hVar193;
        jy jyVar162;
        h hVar194;
        jy jyVar163;
        h hVar195;
        h hVar196;
        jy jyVar164;
        h hVar197;
        jy jyVar165;
        h hVar198;
        jy jyVar166;
        h hVar199;
        jy jyVar167;
        h hVar200;
        h hVar201;
        jy jyVar168;
        h hVar202;
        jy jyVar169;
        jy jyVar170;
        h hVar203;
        jy jyVar171;
        jy jyVar172;
        h hVar204;
        jy jyVar173;
        h hVar205;
        jy jyVar174;
        jy jyVar175;
        h hVar206;
        jy jyVar176;
        jy jyVar177;
        h hVar207;
        jy jyVar178;
        jy jyVar179;
        h hVar208;
        jy jyVar180;
        h hVar209;
        jy jyVar181;
        jy jyVar182;
        h hVar210;
        jy jyVar183;
        h hVar211;
        jy jyVar184;
        jy jyVar185;
        h hVar212;
        jy jyVar186;
        jy jyVar187;
        h hVar213;
        jy jyVar188;
        jy jyVar189;
        h hVar214;
        jy jyVar190;
        jy jyVar191;
        h hVar215;
        jy jyVar192;
        jy jyVar193;
        h hVar216;
        jy jyVar194;
        jy jyVar195;
        h hVar217;
        jy jyVar196;
        h hVar218;
        jy jyVar197;
        h hVar219;
        jy jyVar198;
        jy jyVar199;
        h hVar220;
        jy jyVar200;
        jy jyVar201;
        int i = this.b;
        switch (i) {
            case 200:
                hVar = this.f320a.f;
                return new com.google.android.libraries.notifications.d.b.d.a.e((Context) hVar.a());
            case 201:
                hVar2 = this.f320a.f;
                Context context = (Context) hVar2.a();
                jyVar = this.f320a.f319a;
                hVar3 = jyVar.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar = (com.google.android.libraries.notifications.platform.internal.p.b) hVar3.a();
                jyVar2 = this.f320a.f319a;
                hVar4 = jyVar2.mq;
                return new com.google.android.libraries.notifications.d.b.d.a.f(context, bVar, (com.google.android.libraries.notifications.internal.storage.impl.j) hVar4.a());
            case 202:
                jyVar3 = this.f320a.f319a;
                hVar5 = jyVar3.mo;
                return com.google.android.libraries.notifications.platform.internal.p.a.q.c((GnpRoomDatabase) hVar5.a());
            case 203:
                hVar6 = this.f320a.f;
                Context context2 = (Context) hVar6.a();
                hVar7 = this.f320a.R;
                return com.google.android.libraries.notifications.platform.internal.room.r.b(context2, (m.c.n) hVar7.a());
            case 204:
                return ha.t(com.google.android.libraries.notifications.internal.n.a.o.b(), com.google.android.libraries.notifications.internal.n.b.a.g.b(), com.google.android.libraries.notifications.platform.entrypoints.push.f.b());
            case 205:
                hVar8 = this.f320a.f;
                return new com.google.android.libraries.notifications.internal.k.a.g((Context) hVar8.a());
            case 206:
                hVar9 = this.f320a.f;
                return new com.google.android.libraries.notifications.platform.b.a.b((Context) hVar9.a());
            case 207:
                hVar10 = this.f320a.g;
                return com.google.android.libraries.notifications.platform.b.a.c.b((com.google.android.libraries.g.a) hVar10.a());
            case 208:
                hVar11 = this.f320a.v;
                return com.google.android.libraries.notifications.platform.internal.c.b.c(at.k(hVar11));
            case 209:
                jyVar4 = this.f320a.f319a;
                hVar12 = jyVar4.aP;
                com.google.android.libraries.notifications.platform.f.b bVar2 = (com.google.android.libraries.notifications.platform.f.b) hVar12.a();
                jyVar5 = this.f320a.f319a;
                hVar13 = jyVar5.nN;
                Object a2 = hVar13.a();
                jyVar6 = this.f320a.f319a;
                hVar14 = jyVar6.nP;
                Object a3 = hVar14.a();
                jyVar7 = this.f320a.f319a;
                return com.google.android.libraries.notifications.internal.i.a.d.b(bVar2, a2, a3, jyVar7.dc());
            case 210:
                jyVar8 = this.f320a.f319a;
                hVar15 = jyVar8.nE;
                com.google.android.libraries.notifications.internal.h.a aVar = (com.google.android.libraries.notifications.internal.h.a) hVar15.a();
                jyVar9 = this.f320a.f319a;
                hVar16 = jyVar9.my;
                com.google.android.libraries.notifications.internal.b.a aVar2 = (com.google.android.libraries.notifications.internal.b.a) hVar16.a();
                jyVar10 = this.f320a.f319a;
                hVar17 = jyVar10.mF;
                com.google.android.libraries.notifications.platform.internal.i.a.f fVar = (com.google.android.libraries.notifications.platform.internal.i.a.f) hVar17.a();
                hVar18 = this.f320a.g;
                return new com.google.android.libraries.notifications.internal.i.a.a(aVar, aVar2, fVar, (com.google.android.libraries.g.a) hVar18.a());
            case 211:
                jyVar11 = this.f320a.f319a;
                hVar19 = jyVar11.mR;
                com.google.android.libraries.notifications.internal.n.g gVar = (com.google.android.libraries.notifications.internal.n.g) hVar19.a();
                jyVar12 = this.f320a.f319a;
                hVar20 = jyVar12.nI;
                e.a b = c.b(hVar20);
                jyVar13 = this.f320a.f319a;
                hVar21 = jyVar13.nJ;
                e.a b2 = c.b(hVar21);
                jyVar14 = this.f320a.f319a;
                hVar22 = jyVar14.my;
                com.google.android.libraries.notifications.internal.b.a aVar3 = (com.google.android.libraries.notifications.internal.b.a) hVar22.a();
                jyVar15 = this.f320a.f319a;
                hVar23 = jyVar15.nL;
                com.google.android.libraries.notifications.platform.b.c cVar = (com.google.android.libraries.notifications.platform.b.c) hVar23.a();
                hVar24 = this.f320a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar24.a();
                jyVar16 = this.f320a.f319a;
                hVar25 = jyVar16.nM;
                return new com.google.android.libraries.notifications.internal.h.a.c(gVar, b, b2, aVar3, cVar, aVar4, (Lock) hVar25.a());
            case 212:
                hVar26 = this.f320a.f;
                Context context3 = (Context) hVar26.a();
                jyVar17 = this.f320a.f319a;
                at k = at.k(jyVar17.sk());
                jyVar18 = this.f320a.f319a;
                at k2 = at.k(jyVar18.si());
                jyVar19 = this.f320a.f319a;
                hVar27 = jyVar19.mN;
                com.google.android.libraries.notifications.internal.n.a.l lVar = (com.google.android.libraries.notifications.internal.n.a.l) hVar27.a();
                jyVar20 = this.f320a.f319a;
                hVar28 = jyVar20.mq;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar28.a();
                jyVar21 = this.f320a.f319a;
                hVar29 = jyVar21.mk;
                com.google.android.libraries.notifications.internal.n.d dVar = (com.google.android.libraries.notifications.internal.n.d) hVar29.a();
                jyVar22 = this.f320a.f319a;
                hVar30 = jyVar22.mC;
                com.google.android.libraries.notifications.internal.n.a.j jVar2 = (com.google.android.libraries.notifications.internal.n.a.j) hVar30.a();
                jyVar23 = this.f320a.f319a;
                hVar31 = jyVar23.my;
                com.google.android.libraries.notifications.internal.b.a aVar5 = (com.google.android.libraries.notifications.internal.b.a) hVar31.a();
                jo joVar = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b3 = com.google.android.libraries.search.integrations.j.b.b();
                fu l = fu.l();
                hVar32 = joVar.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar32.a();
                jyVar24 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.n.b.a.f dh = jyVar24.dh();
                jyVar25 = this.f320a.f319a;
                hVar33 = jyVar25.mO;
                com.google.android.libraries.notifications.internal.n.b.a.h hVar221 = (com.google.android.libraries.notifications.internal.n.b.a.h) hVar33.a();
                jyVar26 = this.f320a.f319a;
                hVar34 = jyVar26.mP;
                e.a b4 = c.b(hVar34);
                jyVar27 = this.f320a.f319a;
                hVar35 = jyVar27.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar2 = (com.google.android.libraries.notifications.platform.internal.q.c) hVar35.a();
                jyVar28 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.internal.n.a.n(context3, k, k2, lVar, jVar, dVar, jVar2, aVar5, b3, l, aVar6, dh, hVar221, b4, cVar2, at.k(jyVar28.dj()));
            case 213:
                jyVar29 = this.f320a.f319a;
                hVar36 = jyVar29.mM;
                return new com.google.android.libraries.notifications.internal.n.a.l((com.google.android.libraries.notifications.internal.n.a.h) hVar36.a());
            case 214:
                hVar37 = this.f320a.f;
                Context context4 = (Context) hVar37.a();
                jo joVar2 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b5 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar30 = joVar2.f319a;
                hVar38 = jyVar30.mB;
                com.google.android.libraries.notifications.internal.e.a aVar7 = (com.google.android.libraries.notifications.internal.e.a) hVar38.a();
                jyVar31 = this.f320a.f319a;
                hVar39 = jyVar31.mC;
                com.google.android.libraries.notifications.internal.n.a.j jVar3 = (com.google.android.libraries.notifications.internal.n.a.j) hVar39.a();
                jyVar32 = this.f320a.f319a;
                hVar40 = jyVar32.mK;
                e.a b6 = c.b(hVar40);
                jyVar33 = this.f320a.f319a;
                hVar41 = jyVar33.mk;
                com.google.android.libraries.notifications.internal.n.d dVar2 = (com.google.android.libraries.notifications.internal.n.d) hVar41.a();
                jyVar34 = this.f320a.f319a;
                hVar42 = jyVar34.my;
                com.google.android.libraries.notifications.internal.b.a aVar8 = (com.google.android.libraries.notifications.internal.b.a) hVar42.a();
                jyVar35 = this.f320a.f319a;
                hVar43 = jyVar35.mL;
                return new com.google.android.libraries.notifications.internal.n.a.h(context4, b5, aVar7, jVar3, b6, dVar2, aVar8, hVar43);
            case 215:
                hVar44 = this.f320a.f;
                return new com.google.android.libraries.notifications.internal.e.a.a((Context) hVar44.a());
            case 216:
                hVar45 = this.f320a.f;
                Context context5 = (Context) hVar45.a();
                jo joVar3 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b7 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar36 = joVar3.f319a;
                return new com.google.android.libraries.notifications.internal.n.a.j(context5, b7, at.k(jyVar36.ed()));
            case 217:
                hVar46 = this.f320a.f;
                Context context6 = (Context) hVar46.a();
                jyVar37 = this.f320a.f319a;
                hVar47 = jyVar37.mJ;
                return new com.google.android.libraries.notifications.platform.j.a.a(context6, (com.google.android.libraries.notifications.platform.n.c.a) hVar47.a());
            case 218:
                hVar48 = this.f320a.ne;
                com.google.apps.tiktok.media.j jVar4 = (com.google.apps.tiktok.media.j) hVar48.a();
                jyVar38 = this.f320a.f319a;
                hVar49 = jyVar38.mI;
                return new com.google.android.libraries.notifications.platform.n.c.a(jVar4, (com.google.android.libraries.notifications.platform.internal.l.a.a) hVar49.a());
            case 219:
                jyVar39 = this.f320a.f319a;
                hVar50 = jyVar39.mF;
                com.google.android.libraries.notifications.platform.internal.i.a.f fVar2 = (com.google.android.libraries.notifications.platform.internal.i.a.f) hVar50.a();
                jyVar40 = this.f320a.f319a;
                hVar51 = jyVar40.mG;
                jyVar41 = this.f320a.f319a;
                hVar52 = jyVar41.mH;
                bu buVar = com.google.bo.a.c.a;
                return new com.google.android.libraries.notifications.platform.internal.l.a.a.c(fVar2);
            case 220:
                jyVar42 = this.f320a.f319a;
                hVar53 = jyVar42.mE;
                com.google.android.libraries.notifications.platform.internal.i.a.d dVar3 = (com.google.android.libraries.notifications.platform.internal.i.a.d) hVar53.a();
                hVar54 = this.f320a.Q;
                return new com.google.android.libraries.notifications.platform.internal.i.a.f(dVar3, (ag) hVar54.a());
            case 221:
                hVar55 = this.f320a.f;
                Context context7 = (Context) hVar55.a();
                hVar56 = this.f320a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar56.a();
                hVar57 = this.f320a.bu;
                return new com.google.android.libraries.notifications.platform.internal.i.a.a.e(context7, aVar9, (ag) hVar57.a());
            case 222:
                return new com.google.android.libraries.notifications.platform.internal.l.a.a.a();
            case 223:
                hVar58 = this.f320a.n;
                return com.google.android.libraries.notifications.platform.internal.c.b.d(at.k(hVar58));
            case 224:
                hVar59 = this.f320a.H;
                at k3 = at.k(hVar59);
                jyVar43 = this.f320a.f319a;
                hVar60 = jyVar43.mA;
                return com.google.android.libraries.notifications.platform.internal.c.b.b(k3, (cr) hVar60.a());
            case 225:
                hVar61 = this.f320a.f;
                return new com.google.android.libraries.notifications.internal.n.b.a.h((Context) hVar61.a());
            case 226:
                hVar62 = this.f320a.f;
                Context context8 = (Context) hVar62.a();
                jyVar44 = this.f320a.f319a;
                hVar63 = jyVar44.mA;
                return com.google.android.libraries.notifications.platform.internal.q.d.b(context8, (cr) hVar63.a());
            case 227:
                jyVar45 = this.f320a.f319a;
                hVar64 = jyVar45.mS;
                com.google.android.libraries.notifications.d.a aVar10 = (com.google.android.libraries.notifications.d.a) hVar64.a();
                jyVar46 = this.f320a.f319a;
                hVar65 = jyVar46.nH;
                return ha.s(aVar10, (com.google.android.libraries.notifications.d.a) hVar65.a());
            case 228:
                jyVar47 = this.f320a.f319a;
                hVar66 = jyVar47.my;
                hVar67 = this.f320a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar67.a();
                hVar68 = this.f320a.f;
                Context context9 = (Context) hVar68.a();
                jyVar48 = this.f320a.f319a;
                hVar69 = jyVar48.aO;
                return new com.google.android.libraries.notifications.d.a.a.b(hVar66, aVar11, context9, (com.google.android.libraries.notifications.platform.k.a) hVar69.a());
            case 229:
                jyVar49 = this.f320a.f319a;
                hVar70 = jyVar49.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar3 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar70.a();
                jyVar50 = this.f320a.f319a;
                hVar71 = jyVar50.mT;
                com.google.android.libraries.notifications.d.b.a.c cVar3 = (com.google.android.libraries.notifications.d.b.a.c) hVar71.a();
                jyVar51 = this.f320a.f319a;
                hVar72 = jyVar51.nF;
                com.google.android.libraries.notifications.d.b.e.a aVar12 = (com.google.android.libraries.notifications.d.b.e.a) hVar72.a();
                jyVar52 = this.f320a.f319a;
                hVar73 = jyVar52.no;
                return new com.google.android.libraries.notifications.d.b.a(bVar3, cVar3, aVar12, (com.google.android.libraries.notifications.d.b.b.b.a) hVar73.a());
            case 230:
                hVar74 = this.f320a.f;
                Context context10 = (Context) hVar74.a();
                hVar75 = this.f320a.g;
                return new com.google.android.libraries.notifications.d.b.a.a.b(context10, (com.google.android.libraries.g.a) hVar75.a());
            case 231:
                jyVar53 = this.f320a.f319a;
                hVar76 = jyVar53.mU;
                com.google.android.libraries.notifications.i.d dVar4 = (com.google.android.libraries.notifications.i.d) hVar76.a();
                jyVar54 = this.f320a.f319a;
                hVar77 = jyVar54.mX;
                e.a b8 = c.b(hVar77);
                jyVar55 = this.f320a.f319a;
                hVar78 = jyVar55.nG;
                e.a b9 = c.b(hVar78);
                jyVar56 = this.f320a.f319a;
                hVar79 = jyVar56.aT;
                return new com.google.android.libraries.notifications.d.b.e.a.a(dVar4, b8, b9, c.b(hVar79));
            case 232:
                hVar80 = this.f320a.f;
                return new com.google.android.libraries.notifications.i.a.a.a((Context) hVar80.a(), com.google.android.libraries.search.integrations.j.b.b(), jy.rE());
            case 233:
                jyVar57 = this.f320a.f319a;
                hVar81 = jyVar57.mW;
                com.google.android.libraries.notifications.platform.internal.k.e eVar = (com.google.android.libraries.notifications.platform.internal.k.e) hVar81.a();
                hVar82 = this.f320a.Q;
                return com.google.android.libraries.notifications.platform.internal.k.a.f.b(eVar, (ag) hVar82.a());
            case 234:
                hVar83 = this.f320a.f;
                Context context11 = (Context) hVar83.a();
                hVar84 = this.f320a.P;
                m.c.n nVar = (m.c.n) hVar84.a();
                jyVar58 = this.f320a.f319a;
                hVar85 = jyVar58.mV;
                Class cls = (Class) hVar85.a();
                jyVar59 = this.f320a.f319a;
                hVar86 = jyVar59.mQ;
                return new com.google.android.libraries.notifications.platform.internal.k.a.e(context11, nVar, cls, (com.google.android.libraries.notifications.platform.internal.q.c) hVar86.a());
            case 235:
                return com.google.android.libraries.notifications.platform.entrypoints.job.a.b();
            case 236:
                jyVar60 = this.f320a.f319a;
                hVar87 = jyVar60.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar4 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar87.a();
                jyVar61 = this.f320a.f319a;
                hVar88 = jyVar61.mT;
                com.google.android.libraries.notifications.d.b.a.c cVar4 = (com.google.android.libraries.notifications.d.b.a.c) hVar88.a();
                jyVar62 = this.f320a.f319a;
                hVar89 = jyVar62.no;
                com.google.android.libraries.notifications.d.b.b.b.a aVar13 = (com.google.android.libraries.notifications.d.b.b.b.a) hVar89.a();
                jyVar63 = this.f320a.f319a;
                hVar90 = jyVar63.nD;
                com.google.android.libraries.notifications.internal.k.c cVar5 = (com.google.android.libraries.notifications.internal.k.c) hVar90.a();
                jyVar64 = this.f320a.f319a;
                hVar91 = jyVar64.nE;
                com.google.android.libraries.notifications.internal.h.a aVar14 = (com.google.android.libraries.notifications.internal.h.a) hVar91.a();
                jyVar65 = this.f320a.f319a;
                hVar92 = jyVar65.nF;
                com.google.android.libraries.notifications.d.b.e.a aVar15 = (com.google.android.libraries.notifications.d.b.e.a) hVar92.a();
                jyVar66 = this.f320a.f319a;
                hVar93 = jyVar66.nB;
                return new com.google.android.libraries.notifications.d.b.e.a.b(bVar4, cVar4, aVar13, cVar5, aVar14, aVar15, hVar93);
            case 237:
                hVar94 = this.f320a.g;
                com.google.android.libraries.g.a aVar16 = (com.google.android.libraries.g.a) hVar94.a();
                jyVar67 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.d.b.b.b.a.a(aVar16, jyVar67.pF(), 1);
            case 238:
                jyVar68 = this.f320a.f319a;
                hVar95 = jyVar68.mY;
                com.google.android.libraries.notifications.d.b.b.c.a aVar17 = (com.google.android.libraries.notifications.d.b.b.c.a) hVar95.a();
                jyVar69 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.d.b.b.b.a.a(aVar17, jyVar69.qw(), 0);
            case 239:
                hVar96 = this.f320a.g;
                return new com.google.android.libraries.notifications.d.b.b.c.a((com.google.android.libraries.g.a) hVar96.a());
            case 240:
                jyVar70 = this.f320a.f319a;
                hVar97 = jyVar70.mm;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.d((com.google.android.libraries.notifications.d.b.d.a) hVar97.a());
            case 241:
                jyVar71 = this.f320a.f319a;
                hVar98 = jyVar71.mm;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.g((com.google.android.libraries.notifications.d.b.d.a) hVar98.a());
            case 242:
                jyVar72 = this.f320a.f319a;
                hVar99 = jyVar72.mm;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.c((com.google.android.libraries.notifications.d.b.d.a) hVar99.a());
            case 243:
                jyVar73 = this.f320a.f319a;
                hVar100 = jyVar73.mn;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.e((com.google.android.libraries.notifications.d.b.d.c) hVar100.a());
            case 244:
                jyVar74 = this.f320a.f319a;
                hVar101 = jyVar74.mn;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.f((com.google.android.libraries.notifications.d.b.d.c) hVar101.a());
            case 245:
                jyVar75 = this.f320a.f319a;
                hVar102 = jyVar75.ne;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.i((com.google.android.libraries.notifications.d.b.d.f) hVar102.a());
            case 246:
                hVar103 = this.f320a.f;
                return new com.google.android.libraries.notifications.d.b.d.a.g((Context) hVar103.a());
            case 247:
                jyVar76 = this.f320a.f319a;
                hVar104 = jyVar76.ne;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.b((com.google.android.libraries.notifications.d.b.d.f) hVar104.a());
            case 248:
                jyVar77 = this.f320a.f319a;
                hVar105 = jyVar77.ne;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.h((com.google.android.libraries.notifications.d.b.d.f) hVar105.a());
            case 249:
                jyVar78 = this.f320a.f319a;
                hVar106 = jyVar78.mr;
                return com.google.android.libraries.notifications.d.b.b.a.a.g.j((com.google.android.libraries.notifications.d.b.d.e) hVar106.a());
            case 250:
                hVar107 = this.f320a.g;
                return new com.google.android.libraries.notifications.d.b.b.a.a.k((com.google.android.libraries.g.a) hVar107.a());
            case 251:
                jyVar79 = this.f320a.f319a;
                hVar108 = jyVar79.mn;
                return new com.google.android.libraries.notifications.d.b.b.a.a.h((com.google.android.libraries.notifications.d.b.d.c) hVar108.a(), 0);
            case 252:
                jyVar80 = this.f320a.f319a;
                hVar109 = jyVar80.nl;
                return new com.google.android.libraries.notifications.d.b.b.a.a.h((com.google.android.libraries.notifications.d.b.d.b) hVar109.a(), 1);
            case 253:
                jyVar81 = this.f320a.f319a;
                hVar110 = jyVar81.mu;
                return new com.google.android.libraries.notifications.d.b.d.a.d((com.google.android.libraries.notifications.internal.k.e) hVar110.a());
            case 254:
                jyVar82 = this.f320a.f319a;
                hVar111 = jyVar82.np;
                com.google.android.libraries.notifications.internal.k.a.b bVar5 = (com.google.android.libraries.notifications.internal.k.a.b) hVar111.a();
                jyVar83 = this.f320a.f319a;
                hVar112 = jyVar83.ns;
                com.google.android.libraries.notifications.h.a.c cVar6 = (com.google.android.libraries.notifications.h.a.c) hVar112.a();
                jyVar84 = this.f320a.f319a;
                hVar113 = jyVar84.nt;
                com.google.android.libraries.notifications.internal.k.a.h hVar222 = (com.google.android.libraries.notifications.internal.k.a.h) hVar113.a();
                jyVar85 = this.f320a.f319a;
                hVar114 = jyVar85.nu;
                com.google.android.libraries.notifications.internal.k.a.h hVar223 = (com.google.android.libraries.notifications.internal.k.a.h) hVar114.a();
                jyVar86 = this.f320a.f319a;
                hVar115 = jyVar86.nv;
                com.google.android.libraries.notifications.internal.k.a.h hVar224 = (com.google.android.libraries.notifications.internal.k.a.h) hVar115.a();
                jyVar87 = this.f320a.f319a;
                hVar116 = jyVar87.nw;
                Object a4 = hVar116.a();
                jyVar88 = this.f320a.f319a;
                hVar117 = jyVar88.nx;
                com.google.android.libraries.notifications.internal.k.a.h hVar225 = (com.google.android.libraries.notifications.internal.k.a.h) hVar117.a();
                jyVar89 = this.f320a.f319a;
                hVar118 = jyVar89.ny;
                Object a5 = hVar118.a();
                jyVar90 = this.f320a.f319a;
                hVar119 = jyVar90.nA;
                com.google.android.libraries.notifications.internal.k.a.l lVar2 = (com.google.android.libraries.notifications.internal.k.a.l) hVar119.a();
                jyVar91 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.k.a.k sa = jyVar91.sa();
                jyVar92 = this.f320a.f319a;
                jyVar92.rW();
                jyVar93 = this.f320a.f319a;
                hVar120 = jyVar93.my;
                com.google.android.libraries.notifications.internal.b.a aVar18 = (com.google.android.libraries.notifications.internal.b.a) hVar120.a();
                jyVar94 = this.f320a.f319a;
                hVar121 = jyVar94.nB;
                return com.google.android.libraries.notifications.internal.k.a.f.b(bVar5, cVar6, hVar222, hVar223, hVar224, a4, hVar225, a5, lVar2, sa, aVar18, hVar121);
            case 255:
                jo joVar4 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b10 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar95 = joVar4.f319a;
                hVar122 = jyVar95.mi;
                return new com.google.android.libraries.notifications.internal.k.a.b(b10, (com.google.android.libraries.notifications.platform.internal.o.n) hVar122.a());
            case 256:
                jyVar96 = this.f320a.f319a;
                Object pi = jyVar96.pi();
                hVar123 = this.f320a.bt;
                return new com.google.android.libraries.notifications.h.a.c((com.google.android.libraries.notifications.h.a.d) pi, (m.c.n) hVar123.a());
            case 257:
                return ha.s(com.google.android.libraries.notifications.c.a.b(), com.google.android.libraries.notifications.platform.h.a.a.d.b());
            case 258:
                jyVar97 = this.f320a.f319a;
                hVar124 = jyVar97.aS;
                return new com.google.android.libraries.notifications.platform.n.b.b((com.google.frameworks.client.data.android.l) hVar124.a());
            case 259:
                hVar125 = this.f320a.H;
                cq cqVar = (cq) hVar125.a();
                hVar126 = this.f320a.v;
                cq cqVar2 = (cq) hVar126.a();
                jo joVar5 = this.f320a;
                hVar127 = joVar5.ax;
                ha r = ha.r();
                jyVar98 = joVar5.f319a;
                return com.google.frameworks.client.data.android.y.b(cqVar, cqVar2, hVar127, r, at.k(jyVar98.eO()));
            case 260:
                jo joVar6 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b11 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar99 = joVar6.f319a;
                hVar128 = jyVar99.mv;
                com.google.android.libraries.notifications.internal.k.f fVar3 = (com.google.android.libraries.notifications.internal.k.f) hVar128.a();
                jyVar100 = this.f320a.f319a;
                hVar129 = jyVar100.mi;
                return new com.google.android.libraries.notifications.internal.k.a.h(b11, fVar3, (com.google.android.libraries.notifications.platform.internal.o.n) hVar129.a(), (byte[]) null);
            case 261:
                jo joVar7 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b12 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar101 = joVar7.f319a;
                hVar130 = jyVar101.mv;
                com.google.android.libraries.notifications.internal.k.f fVar4 = (com.google.android.libraries.notifications.internal.k.f) hVar130.a();
                jyVar102 = this.f320a.f319a;
                hVar131 = jyVar102.mi;
                return new com.google.android.libraries.notifications.internal.k.a.h(b12, fVar4, (com.google.android.libraries.notifications.platform.internal.o.n) hVar131.a(), (byte[]) null);
            case 262:
                jo joVar8 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b13 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar103 = joVar8.f319a;
                hVar132 = jyVar103.mv;
                com.google.android.libraries.notifications.internal.k.f fVar5 = (com.google.android.libraries.notifications.internal.k.f) hVar132.a();
                jyVar104 = this.f320a.f319a;
                hVar133 = jyVar104.mi;
                return new com.google.android.libraries.notifications.internal.k.a.h(b13, fVar5, (com.google.android.libraries.notifications.platform.internal.o.n) hVar133.a());
            case 263:
                com.google.android.libraries.search.integrations.j.b.b();
                jyVar105 = this.f320a.f319a;
                hVar134 = jyVar105.mi;
                return new com.google.android.libraries.notifications.internal.k.a.m();
            case 264:
                jo joVar9 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b14 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar106 = joVar9.f319a;
                hVar135 = jyVar106.aR;
                com.google.android.libraries.notifications.platform.internal.m.a aVar19 = (com.google.android.libraries.notifications.platform.internal.m.a) hVar135.a();
                jyVar107 = this.f320a.f319a;
                hVar136 = jyVar107.mi;
                return new com.google.android.libraries.notifications.internal.k.a.h(b14, aVar19, (com.google.android.libraries.notifications.platform.internal.o.n) hVar136.a());
            case 265:
                jo joVar10 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b15 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar108 = joVar10.f319a;
                hVar137 = jyVar108.mi;
                return new com.google.android.libraries.notifications.internal.k.a.k(b15, (com.google.android.libraries.notifications.platform.internal.o.n) hVar137.a());
            case 266:
                jo joVar11 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b16 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar109 = joVar11.f319a;
                hVar138 = jyVar109.aR;
                com.google.android.libraries.notifications.platform.internal.m.a aVar20 = (com.google.android.libraries.notifications.platform.internal.m.a) hVar138.a();
                jyVar110 = this.f320a.f319a;
                hVar139 = jyVar110.mv;
                com.google.android.libraries.notifications.internal.k.f fVar6 = (com.google.android.libraries.notifications.internal.k.f) hVar139.a();
                jyVar111 = this.f320a.f319a;
                hVar140 = jyVar111.mi;
                com.google.android.libraries.notifications.platform.internal.o.n nVar2 = (com.google.android.libraries.notifications.platform.internal.o.n) hVar140.a();
                jyVar112 = this.f320a.f319a;
                hVar141 = jyVar112.mh;
                com.google.android.libraries.notifications.platform.internal.o.m mVar = (com.google.android.libraries.notifications.platform.internal.o.m) hVar141.a();
                jyVar113 = this.f320a.f319a;
                hVar142 = jyVar113.my;
                com.google.android.libraries.notifications.internal.b.a aVar21 = (com.google.android.libraries.notifications.internal.b.a) hVar142.a();
                jyVar114 = this.f320a.f319a;
                hVar143 = jyVar114.nz;
                hVar144 = this.f320a.f;
                Context context12 = (Context) hVar144.a();
                jyVar115 = this.f320a.f319a;
                hVar145 = jyVar115.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar7 = (com.google.android.libraries.notifications.platform.internal.q.c) hVar145.a();
                jyVar116 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.internal.k.a.l(b16, aVar20, fVar6, nVar2, mVar, aVar21, context12, cVar7, jyVar116.rs());
            case 267:
                jyVar117 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt = jyVar117.dt();
                jyVar118 = this.f320a.f319a;
                hVar146 = jyVar118.nG;
                return com.google.android.libraries.notifications.d.b.e.a.c.b(dt, hVar146.a());
            case 268:
                jyVar119 = this.f320a.f319a;
                return at.k(jyVar119.ee());
            case 269:
                jyVar120 = this.f320a.f319a;
                hVar147 = jyVar120.mR;
                com.google.android.libraries.notifications.internal.n.g gVar2 = (com.google.android.libraries.notifications.internal.n.g) hVar147.a();
                jyVar121 = this.f320a.f319a;
                hVar148 = jyVar121.mq;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar5 = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar148.a();
                jyVar122 = this.f320a.f319a;
                hVar149 = jyVar122.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar6 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar149.a();
                jyVar123 = this.f320a.f319a;
                hVar150 = jyVar123.mP;
                com.google.android.libraries.notifications.internal.i.e eVar2 = (com.google.android.libraries.notifications.internal.i.e) hVar150.a();
                jyVar124 = this.f320a.f319a;
                hVar151 = jyVar124.my;
                com.google.android.libraries.notifications.internal.b.a aVar22 = (com.google.android.libraries.notifications.internal.b.a) hVar151.a();
                jyVar125 = this.f320a.f319a;
                hVar152 = jyVar125.mO;
                com.google.android.libraries.notifications.internal.n.b.a.h hVar226 = (com.google.android.libraries.notifications.internal.n.b.a.h) hVar152.a();
                hVar153 = this.f320a.bt;
                return new com.google.android.libraries.notifications.j.a.e(gVar2, jVar5, bVar6, eVar2, aVar22, hVar226, (m.c.n) hVar153.a());
            case 270:
                jyVar126 = this.f320a.f319a;
                hVar154 = jyVar126.nK;
                com.google.android.libraries.notifications.platform.b.c cVar8 = (com.google.android.libraries.notifications.platform.b.c) hVar154.a();
                hVar155 = this.f320a.g;
                return com.google.android.libraries.notifications.internal.storage.impl.c.c(cVar8, (com.google.android.libraries.g.a) hVar155.a());
            case 271:
                hVar156 = this.f320a.f;
                return com.google.android.libraries.notifications.internal.storage.impl.c.b((Context) hVar156.a());
            case 272:
                return new ReentrantLock();
            case 273:
                jyVar127 = this.f320a.f319a;
                hVar157 = jyVar127.nO;
                com.google.android.libraries.notifications.internal.storage.d dVar5 = (com.google.android.libraries.notifications.internal.storage.d) hVar157.a();
                jyVar128 = this.f320a.f319a;
                hVar158 = jyVar128.mU;
                com.google.android.libraries.notifications.i.d dVar6 = (com.google.android.libraries.notifications.i.d) hVar158.a();
                jyVar129 = this.f320a.f319a;
                hVar159 = jyVar129.mX;
                e.a b17 = c.b(hVar159);
                jyVar130 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.i.a.f db = jyVar130.db();
                jyVar131 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.internal.i.a.e(dVar5, dVar6, b17, db, jyVar131.dl());
            case 274:
                hVar160 = this.f320a.f;
                return new com.google.android.libraries.notifications.internal.storage.impl.e((Context) hVar160.a());
            case 275:
                jyVar132 = this.f320a.f319a;
                hVar161 = jyVar132.og;
                com.google.android.libraries.notifications.internal.l.a aVar23 = (com.google.android.libraries.notifications.internal.l.a) hVar161.a();
                jyVar133 = this.f320a.f319a;
                hVar162 = jyVar133.nD;
                return new com.google.android.libraries.notifications.internal.m.a.b(aVar23, (com.google.android.libraries.notifications.internal.k.c) hVar162.a());
            case 276:
                hVar163 = this.f320a.f;
                Context context13 = (Context) hVar163.a();
                jyVar134 = this.f320a.f319a;
                hVar164 = jyVar134.mU;
                com.google.android.libraries.notifications.i.d dVar7 = (com.google.android.libraries.notifications.i.d) hVar164.a();
                jyVar135 = this.f320a.f319a;
                hVar165 = jyVar135.mX;
                e.a b18 = c.b(hVar165);
                jyVar136 = this.f320a.f319a;
                hVar166 = jyVar136.nQ;
                e.a b19 = c.b(hVar166);
                jyVar137 = this.f320a.f319a;
                hVar167 = jyVar137.nO;
                com.google.android.libraries.notifications.internal.storage.d dVar8 = (com.google.android.libraries.notifications.internal.storage.d) hVar167.a();
                jyVar138 = this.f320a.f319a;
                hVar168 = jyVar138.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar9 = (com.google.android.libraries.notifications.platform.internal.q.c) hVar168.a();
                jyVar139 = this.f320a.f319a;
                hVar169 = jyVar139.nZ;
                e.a b20 = c.b(hVar169);
                jyVar140 = this.f320a.f319a;
                hVar170 = jyVar140.oa;
                e.a b21 = c.b(hVar170);
                jyVar141 = this.f320a.f319a;
                hVar171 = jyVar141.ob;
                c.b(hVar171);
                jyVar142 = this.f320a.f319a;
                hVar172 = jyVar142.oc;
                e.a b22 = c.b(hVar172);
                jyVar143 = this.f320a.f319a;
                hVar173 = jyVar143.od;
                e.a b23 = c.b(hVar173);
                jyVar144 = this.f320a.f319a;
                hVar174 = jyVar144.oe;
                c.b(hVar174);
                jyVar145 = this.f320a.f319a;
                hVar175 = jyVar145.aV;
                e.a b24 = c.b(hVar175);
                jyVar146 = this.f320a.f319a;
                hVar176 = jyVar146.aW;
                e.a b25 = c.b(hVar176);
                jyVar147 = this.f320a.f319a;
                hVar177 = jyVar147.aX;
                c.b(hVar177);
                jyVar148 = this.f320a.f319a;
                hVar178 = jyVar148.aY;
                e.a b26 = c.b(hVar178);
                jyVar149 = this.f320a.f319a;
                hVar179 = jyVar149.aZ;
                e.a b27 = c.b(hVar179);
                jyVar150 = this.f320a.f319a;
                hVar180 = jyVar150.ba;
                c.b(hVar180);
                return new com.google.android.libraries.notifications.internal.l.a.d(context13, dVar7, b18, b19, dVar8, cVar9, b20, b21, b22, b23, b24, b25, b26, b27);
            case 277:
                hVar181 = this.f320a.Q;
                return new com.google.android.libraries.notifications.internal.l.a.h((ag) hVar181.a());
            case 278:
                jo joVar12 = this.f320a;
                jyVar151 = joVar12.f319a;
                jyVar152 = joVar12.f319a;
                hVar182 = jyVar152.nD;
                com.google.android.libraries.notifications.internal.l.a.e eVar3 = new com.google.android.libraries.notifications.internal.l.a.e((com.google.android.libraries.notifications.internal.k.c) hVar182.a());
                jy.rO(jyVar151, eVar3);
                return eVar3;
            case 279:
                jyVar153 = this.f320a.f319a;
                hVar183 = jyVar153.mP;
                com.google.android.libraries.notifications.internal.i.e eVar4 = (com.google.android.libraries.notifications.internal.i.e) hVar183.a();
                jyVar154 = this.f320a.f319a;
                hVar184 = jyVar154.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar7 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar184.a();
                jyVar155 = this.f320a.f319a;
                hVar185 = jyVar155.nS;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar6 = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar185.a();
                jyVar156 = this.f320a.f319a;
                hVar186 = jyVar156.nE;
                com.google.android.libraries.notifications.internal.h.a aVar24 = (com.google.android.libraries.notifications.internal.h.a) hVar186.a();
                jyVar157 = this.f320a.f319a;
                hVar187 = jyVar157.my;
                com.google.android.libraries.notifications.internal.b.a aVar25 = (com.google.android.libraries.notifications.internal.b.a) hVar187.a();
                jyVar158 = this.f320a.f319a;
                hVar188 = jyVar158.nI;
                Set set = (Set) hVar188.a();
                hVar189 = this.f320a.g;
                com.google.android.libraries.g.a aVar26 = (com.google.android.libraries.g.a) hVar189.a();
                jyVar159 = this.f320a.f319a;
                hVar190 = jyVar159.nB;
                return new com.google.android.libraries.notifications.internal.m.a.c(eVar4, bVar7, jVar6, aVar24, aVar25, set, aVar26, hVar190);
            case 280:
                jyVar160 = this.f320a.f319a;
                hVar191 = jyVar160.mz;
                com.google.android.libraries.notifications.internal.storage.impl.h hVar227 = (com.google.android.libraries.notifications.internal.storage.impl.h) hVar191.a();
                hVar192 = this.f320a.g;
                return new com.google.android.libraries.notifications.internal.storage.impl.j(hVar227, (com.google.android.libraries.g.a) hVar192.a());
            case 281:
                jyVar161 = this.f320a.f319a;
                hVar193 = jyVar161.mP;
                com.google.android.libraries.notifications.internal.i.e eVar5 = (com.google.android.libraries.notifications.internal.i.e) hVar193.a();
                jyVar162 = this.f320a.f319a;
                hVar194 = jyVar162.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar8 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar194.a();
                jyVar163 = this.f320a.f319a;
                hVar195 = jyVar163.my;
                com.google.android.libraries.notifications.internal.b.a aVar27 = (com.google.android.libraries.notifications.internal.b.a) hVar195.a();
                hVar196 = this.f320a.g;
                return new com.google.android.libraries.notifications.internal.m.a.e(eVar5, bVar8, aVar27, (com.google.android.libraries.g.a) hVar196.a());
            case 282:
                jyVar164 = this.f320a.f319a;
                hVar197 = jyVar164.mR;
                com.google.android.libraries.notifications.internal.n.g gVar3 = (com.google.android.libraries.notifications.internal.n.g) hVar197.a();
                jyVar165 = this.f320a.f319a;
                hVar198 = jyVar165.my;
                return new com.google.android.libraries.notifications.internal.m.a.a(gVar3, (com.google.android.libraries.notifications.internal.b.a) hVar198.a());
            case 283:
                jyVar166 = this.f320a.f319a;
                hVar199 = jyVar166.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar9 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar199.a();
                jyVar167 = this.f320a.f319a;
                hVar200 = jyVar167.mE;
                com.google.android.libraries.notifications.platform.internal.i.a.d dVar9 = (com.google.android.libraries.notifications.platform.internal.i.a.d) hVar200.a();
                hVar201 = this.f320a.g;
                com.google.android.libraries.g.a aVar28 = (com.google.android.libraries.g.a) hVar201.a();
                jyVar168 = this.f320a.f319a;
                hVar202 = jyVar168.nW;
                com.google.android.libraries.notifications.internal.m.a aVar29 = (com.google.android.libraries.notifications.internal.m.a) hVar202.a();
                jyVar169 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.g.a.f(bVar9, dVar9, aVar28, aVar29, jyVar169.rs());
            case 284:
                jyVar170 = this.f320a.f319a;
                hVar203 = jyVar170.mp;
                return new com.google.android.libraries.notifications.g.a.e((com.google.android.libraries.notifications.platform.internal.p.b) hVar203.a());
            case 285:
                jo joVar13 = this.f320a;
                jyVar171 = joVar13.f319a;
                jyVar172 = joVar13.f319a;
                hVar204 = jyVar172.nD;
                com.google.android.libraries.notifications.internal.k.c cVar10 = (com.google.android.libraries.notifications.internal.k.c) hVar204.a();
                jyVar173 = this.f320a.f319a;
                hVar205 = jyVar173.nS;
                com.google.android.libraries.notifications.internal.l.a.f fVar7 = new com.google.android.libraries.notifications.internal.l.a.f(cVar10, (com.google.android.libraries.notifications.internal.storage.impl.j) hVar205.a());
                jy.rP(jyVar171, fVar7);
                return fVar7;
            case 286:
                jo joVar14 = this.f320a;
                jyVar174 = joVar14.f319a;
                jyVar175 = joVar14.f319a;
                hVar206 = jyVar175.nD;
                com.google.android.libraries.notifications.internal.l.a.i iVar = new com.google.android.libraries.notifications.internal.l.a.i((com.google.android.libraries.notifications.internal.k.c) hVar206.a());
                jy.rQ(jyVar174, iVar);
                return iVar;
            case 287:
                jo joVar15 = this.f320a;
                jyVar176 = joVar15.f319a;
                jyVar177 = joVar15.f319a;
                hVar207 = jyVar177.nD;
                com.google.android.libraries.notifications.internal.l.a.l lVar3 = new com.google.android.libraries.notifications.internal.l.a.l((com.google.android.libraries.notifications.internal.k.c) hVar207.a());
                jy.rS(jyVar176, lVar3);
                return lVar3;
            case 288:
                jo joVar16 = this.f320a;
                jyVar178 = joVar16.f319a;
                jyVar179 = joVar16.f319a;
                hVar208 = jyVar179.nD;
                com.google.android.libraries.notifications.internal.k.c cVar11 = (com.google.android.libraries.notifications.internal.k.c) hVar208.a();
                jyVar180 = this.f320a.f319a;
                hVar209 = jyVar180.nO;
                com.google.android.libraries.notifications.internal.l.a.b bVar10 = new com.google.android.libraries.notifications.internal.l.a.b(cVar11, (com.google.android.libraries.notifications.internal.storage.d) hVar209.a());
                jy.rM(jyVar178, bVar10);
                return bVar10;
            case 289:
                jo joVar17 = this.f320a;
                jyVar181 = joVar17.f319a;
                jyVar182 = joVar17.f319a;
                hVar210 = jyVar182.nD;
                com.google.android.libraries.notifications.internal.k.c cVar12 = (com.google.android.libraries.notifications.internal.k.c) hVar210.a();
                jyVar183 = this.f320a.f319a;
                hVar211 = jyVar183.nO;
                com.google.android.libraries.notifications.internal.l.a.k kVar = new com.google.android.libraries.notifications.internal.l.a.k(cVar12, (com.google.android.libraries.notifications.internal.storage.d) hVar211.a());
                jy.rR(jyVar181, kVar);
                return kVar;
            case 290:
                jyVar184 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt2 = jyVar184.dt();
                jyVar185 = this.f320a.f319a;
                hVar212 = jyVar185.nZ;
                return com.google.android.libraries.notifications.internal.l.a.c.b(dt2, (com.google.android.libraries.notifications.internal.l.a.e) hVar212.a());
            case 291:
                jyVar186 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt3 = jyVar186.dt();
                jyVar187 = this.f320a.f319a;
                hVar213 = jyVar187.oa;
                return com.google.android.libraries.notifications.internal.l.a.c.d(dt3, (com.google.android.libraries.notifications.internal.l.a.f) hVar213.a());
            case 292:
                jyVar188 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt4 = jyVar188.dt();
                jyVar189 = this.f320a.f319a;
                hVar214 = jyVar189.ob;
                return com.google.android.libraries.notifications.internal.l.a.c.e(dt4, (com.google.android.libraries.notifications.internal.l.a.i) hVar214.a());
            case 293:
                jyVar190 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt5 = jyVar190.dt();
                jyVar191 = this.f320a.f319a;
                hVar215 = jyVar191.oc;
                return com.google.android.libraries.notifications.internal.l.a.c.g(dt5, (com.google.android.libraries.notifications.internal.l.a.l) hVar215.a());
            case 294:
                jyVar192 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt6 = jyVar192.dt();
                jyVar193 = this.f320a.f319a;
                hVar216 = jyVar193.od;
                return com.google.android.libraries.notifications.internal.l.a.c.c(dt6, (com.google.android.libraries.notifications.internal.l.a.b) hVar216.a());
            case 295:
                jyVar194 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt7 = jyVar194.dt();
                jyVar195 = this.f320a.f319a;
                hVar217 = jyVar195.oe;
                return com.google.android.libraries.notifications.internal.l.a.c.f(dt7, (com.google.android.libraries.notifications.internal.l.a.k) hVar217.a());
            case 296:
                jyVar196 = this.f320a.f319a;
                hVar218 = jyVar196.oi;
                com.google.android.libraries.notifications.internal.n.f fVar8 = (com.google.android.libraries.notifications.internal.n.f) hVar218.a();
                jyVar197 = this.f320a.f319a;
                return fu.n(1, fVar8, 2, jyVar197.dg());
            case 297:
                hVar219 = this.f320a.f;
                jyVar198 = this.f320a.f319a;
                at k4 = at.k(jyVar198.si());
                jyVar199 = this.f320a.f319a;
                hVar220 = jyVar199.my;
                return new com.google.android.libraries.notifications.internal.n.a.a(k4, (com.google.android.libraries.notifications.internal.b.a) hVar220.a());
            case 298:
                jyVar200 = this.f320a.f319a;
                com.google.android.libraries.search.t.c.ai rv = jyVar200.rv();
                jyVar201 = this.f320a.f319a;
                return new com.google.android.libraries.search.am.c(rv, jyVar201.b());
            case 299:
                return new cp();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        jy jyVar;
        e.b.a.c.c.a aVar;
        jy jyVar2;
        h hVar;
        jy jyVar3;
        h hVar2;
        jy jyVar4;
        h hVar3;
        h hVar4;
        h hVar5;
        jy jyVar5;
        h hVar6;
        jy jyVar6;
        h hVar7;
        jy jyVar7;
        jy jyVar8;
        h hVar8;
        jy jyVar9;
        h hVar9;
        h hVar10;
        jy jyVar10;
        h hVar11;
        jy jyVar11;
        jy jyVar12;
        h hVar12;
        h hVar13;
        h hVar14;
        jy jyVar13;
        h hVar15;
        jy jyVar14;
        h hVar16;
        jy jyVar15;
        h hVar17;
        h hVar18;
        jy jyVar16;
        jy jyVar17;
        h hVar19;
        h hVar20;
        h hVar21;
        h hVar22;
        h hVar23;
        h hVar24;
        jy jyVar18;
        h hVar25;
        h hVar26;
        h hVar27;
        jy jyVar19;
        h hVar28;
        jy jyVar20;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        jy jyVar21;
        h hVar33;
        jy jyVar22;
        h hVar34;
        jy jyVar23;
        h hVar35;
        jy jyVar24;
        h hVar36;
        jy jyVar25;
        h hVar37;
        jy jyVar26;
        h hVar38;
        jy jyVar27;
        h hVar39;
        jy jyVar28;
        h hVar40;
        jy jyVar29;
        h hVar41;
        jy jyVar30;
        h hVar42;
        jy jyVar31;
        h hVar43;
        h hVar44;
        jy jyVar32;
        h hVar45;
        jy jyVar33;
        h hVar46;
        h hVar47;
        jy jyVar34;
        h hVar48;
        jy jyVar35;
        h hVar49;
        jy jyVar36;
        h hVar50;
        jy jyVar37;
        h hVar51;
        jy jyVar38;
        h hVar52;
        jy jyVar39;
        h hVar53;
        jy jyVar40;
        h hVar54;
        jy jyVar41;
        h hVar55;
        jy jyVar42;
        h hVar56;
        jy jyVar43;
        jy jyVar44;
        h hVar57;
        jy jyVar45;
        h hVar58;
        jy jyVar46;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        h hVar66;
        jy jyVar47;
        h hVar67;
        h hVar68;
        h hVar69;
        h hVar70;
        h hVar71;
        jy jyVar48;
        h hVar72;
        h hVar73;
        h hVar74;
        jy jyVar49;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        jy jyVar50;
        jy jyVar51;
        jy jyVar52;
        jy jyVar53;
        h hVar80;
        h hVar81;
        h hVar82;
        h hVar83;
        h hVar84;
        h hVar85;
        h hVar86;
        jy jyVar54;
        jy jyVar55;
        h hVar87;
        h hVar88;
        h hVar89;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        jy jyVar56;
        jy jyVar57;
        h hVar96;
        h hVar97;
        h hVar98;
        h hVar99;
        jy jyVar58;
        h hVar100;
        h hVar101;
        h hVar102;
        h hVar103;
        jy jyVar59;
        jy jyVar60;
        jy jyVar61;
        h hVar104;
        h hVar105;
        jy jyVar62;
        h hVar106;
        h hVar107;
        jy jyVar63;
        h hVar108;
        jy jyVar64;
        h hVar109;
        h hVar110;
        h hVar111;
        jy jyVar65;
        jy jyVar66;
        h hVar112;
        jy jyVar67;
        h hVar113;
        h hVar114;
        jy jyVar68;
        h hVar115;
        jy jyVar69;
        h hVar116;
        jy jyVar70;
        h hVar117;
        jy jyVar71;
        h hVar118;
        h hVar119;
        jy jyVar72;
        h hVar120;
        jy jyVar73;
        h hVar121;
        h hVar122;
        h hVar123;
        jy jyVar74;
        h hVar124;
        h hVar125;
        jy jyVar75;
        h hVar126;
        h hVar127;
        jy jyVar76;
        h hVar128;
        jy jyVar77;
        h hVar129;
        jy jyVar78;
        h hVar130;
        h hVar131;
        h hVar132;
        jy jyVar79;
        h hVar133;
        h hVar134;
        h hVar135;
        jy jyVar80;
        jy jyVar81;
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
        jy jyVar82;
        jy jyVar83;
        jy jyVar84;
        h hVar146;
        jy jyVar85;
        jy jyVar86;
        h hVar147;
        jy jyVar87;
        h hVar148;
        h hVar149;
        h hVar150;
        h hVar151;
        h hVar152;
        jy jyVar88;
        h hVar153;
        h hVar154;
        h hVar155;
        h hVar156;
        h hVar157;
        h hVar158;
        jy jyVar89;
        h hVar159;
        h hVar160;
        h hVar161;
        h hVar162;
        h hVar163;
        h hVar164;
        jy jyVar90;
        h hVar165;
        jy jyVar91;
        h hVar166;
        jy jyVar92;
        h hVar167;
        h hVar168;
        h hVar169;
        h hVar170;
        jy jyVar93;
        h hVar171;
        h hVar172;
        h hVar173;
        h hVar174;
        h hVar175;
        jy jyVar94;
        h hVar176;
        h hVar177;
        h hVar178;
        jy jyVar95;
        jy jyVar96;
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
        jy jyVar97;
        h hVar189;
        jy jyVar98;
        h hVar190;
        h hVar191;
        int i = this.b;
        switch (i) {
            case 300:
                jyVar = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.as.a.a.f.g(jyVar.ss()));
            case 301:
                aVar = this.f320a.d;
                Application b = e.b.a.c.c.b.b(aVar);
                jyVar2 = this.f320a.f319a;
                hVar = jyVar2.on;
                jyVar3 = this.f320a.f319a;
                hVar2 = jyVar3.oo;
                return new com.google.android.libraries.aw.f.a(b, hVar, hVar2);
            case 302:
            case 303:
                jyVar4 = this.f320a.f319a;
                hVar3 = jyVar4.mS;
                return new op((com.google.android.libraries.notifications.d.a.a.b) hVar3.a());
            case 304:
                return new fy(jy.rF());
            case 305:
                hVar4 = this.f320a.f;
                return com.google.android.libraries.search.rendering.xuikit.c.f.c.g((Context) hVar4.a());
            case 306:
                hVar5 = this.f320a.f;
                return new com.google.apps.tiktok.contrib.a.a((Context) hVar5.a());
            case 307:
                jyVar5 = this.f320a.f319a;
                hVar6 = jyVar5.ox;
                jyVar6 = this.f320a.f319a;
                return new com.google.android.libraries.search.z.a.a(hVar6, jyVar6.er());
            case 308:
                hVar7 = this.f320a.bo;
                ag agVar = (ag) hVar7.a();
                jyVar7 = this.f320a.f319a;
                com.google.android.libraries.search.integrations.l.d ei = jyVar7.ei();
                jyVar8 = this.f320a.f319a;
                hVar8 = jyVar8.ov;
                e.a b2 = c.b(hVar8);
                jyVar9 = this.f320a.f319a;
                hVar9 = jyVar9.ow;
                return new com.google.android.libraries.search.garbagecollection.e(agVar, ei, b2, c.b(hVar9));
            case 309:
                return new com.google.android.libraries.search.garbagecollection.a();
            case 310:
                hVar10 = this.f320a.f;
                return new NativeGc((Context) hVar10.a());
            case 311:
                jyVar10 = this.f320a.f319a;
                hVar11 = jyVar10.oz;
                jyVar11 = this.f320a.f319a;
                return new com.google.android.libraries.search.z.a.a(hVar11, jyVar11.er());
            case 312:
                jyVar12 = this.f320a.f319a;
                Set qi = jyVar12.qi();
                hVar12 = this.f320a.bo;
                ag agVar2 = (ag) hVar12.a();
                hVar13 = this.f320a.f;
                Context context = (Context) hVar13.a();
                hVar14 = this.f320a.E;
                return new com.google.android.libraries.search.integrations.l.c(qi, agVar2, context, (com.google.apps.tiktok.concurrent.n) hVar14.a());
            case 313:
                this.f320a.ju();
                Optional empty = Optional.empty();
                Optional.empty();
                jyVar13 = this.f320a.f319a;
                hVar15 = jyVar13.pe;
                jyVar14 = this.f320a.f319a;
                hVar16 = jyVar14.pg;
                jyVar15 = this.f320a.f319a;
                hVar17 = jyVar15.ph;
                return new com.google.apps.tiktok.i.k(empty, hVar15, hVar16, hVar17);
            case 314:
                hVar18 = this.f320a.f;
                Context context2 = (Context) hVar18.a();
                jo joVar = this.f320a;
                com.google.android.libraries.ao.c ju = joVar.ju();
                jyVar16 = joVar.f319a;
                Map pC = jyVar16.pC();
                jyVar17 = this.f320a.f319a;
                Map px = jyVar17.px();
                hVar19 = this.f320a.v;
                cq cqVar = (cq) hVar19.a();
                hVar20 = this.f320a.L;
                e.a b3 = c.b(hVar20);
                jo joVar2 = this.f320a;
                hVar21 = joVar2.bK;
                hVar22 = joVar2.i;
                return new com.google.apps.tiktok.i.j(context2, ju, pC, px, cqVar, b3, hVar21, hVar22);
            case 315:
                return new com.google.apps.tiktok.account.data.r(this.f320a.mn());
            case 316:
                hVar23 = this.f320a.ho;
                return com.google.apps.tiktok.experiments.phenotype.ae.g((com.google.apps.tiktok.experiments.phenotype.m) hVar23.a());
            case 317:
                hVar24 = this.f320a.x;
                com.google.android.libraries.phenotype.client.a.i iVar = (com.google.android.libraries.phenotype.client.a.i) hVar24.a();
                jyVar18 = this.f320a.f319a;
                return com.google.apps.tiktok.experiments.phenotype.ae.h(iVar, jyVar18.eG());
            case 318:
                hVar25 = this.f320a.bN;
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) hVar25.a();
                hVar26 = this.f320a.f;
                Context context3 = (Context) hVar26.a();
                hVar27 = this.f320a.bo;
                return new com.google.android.apps.search.googleapp.bubbles.a.l(bVar, context3, (ag) hVar27.a(), this.f320a.jy());
            case 319:
                jyVar19 = this.f320a.f319a;
                hVar28 = jyVar19.bd;
                return new com.google.android.libraries.search.integrations.j.a.c.a((com.google.android.libraries.search.integrations.j.a.e.d) hVar28.a());
            case 320:
                jyVar20 = this.f320a.f319a;
                com.google.android.libraries.search.integrations.j.a.b ef = jyVar20.ef();
                hVar29 = this.f320a.H;
                cq cqVar2 = (cq) hVar29.a();
                hVar30 = this.f320a.v;
                cr crVar = (cr) hVar30.a();
                hVar31 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar = (com.google.apps.tiktok.contrib.work.b.p) hVar31.a();
                hVar32 = this.f320a.W;
                return new com.google.android.libraries.search.integrations.j.a.e.d(ef, cqVar2, crVar, pVar, (com.google.android.libraries.search.t.i.y) hVar32.a());
            case 321:
                jyVar21 = this.f320a.f319a;
                hVar33 = jyVar21.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar2 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar33.a();
                jyVar22 = this.f320a.f319a;
                hVar34 = jyVar22.aR;
                jyVar23 = this.f320a.f319a;
                hVar35 = jyVar23.oH;
                com.google.android.libraries.notifications.g.a.d dVar = (com.google.android.libraries.notifications.g.a.d) hVar35.a();
                jyVar24 = this.f320a.f319a;
                hVar36 = jyVar24.oI;
                jyVar25 = this.f320a.f319a;
                hVar37 = jyVar25.oL;
                jyVar26 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.g.a.a(bVar2, dVar, jyVar26.rs());
            case 322:
                hVar38 = this.f320a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar38.a();
                jyVar27 = this.f320a.f319a;
                hVar39 = jyVar27.oF;
                com.google.android.libraries.notifications.internal.a.a.c cVar = (com.google.android.libraries.notifications.internal.a.a.c) hVar39.a();
                jo joVar3 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b4 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar28 = joVar3.f319a;
                hVar40 = jyVar28.og;
                com.google.android.libraries.notifications.internal.l.a aVar3 = (com.google.android.libraries.notifications.internal.l.a) hVar40.a();
                jyVar29 = this.f320a.f319a;
                hVar41 = jyVar29.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar3 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar41.a();
                jyVar30 = this.f320a.f319a;
                hVar42 = jyVar30.oG;
                com.google.android.libraries.notifications.platform.internal.r.a.b bVar4 = (com.google.android.libraries.notifications.platform.internal.r.a.b) hVar42.a();
                jyVar31 = this.f320a.f319a;
                hVar43 = jyVar31.nA;
                com.google.android.libraries.notifications.internal.k.a.l lVar = (com.google.android.libraries.notifications.internal.k.a.l) hVar43.a();
                hVar44 = this.f320a.f;
                Context context4 = (Context) hVar44.a();
                jyVar32 = this.f320a.f319a;
                hVar45 = jyVar32.aO;
                return new com.google.android.libraries.notifications.g.a.d(aVar2, cVar, b4, aVar3, bVar3, bVar4, lVar, context4, (com.google.android.libraries.notifications.platform.k.a) hVar45.a());
            case 323:
                jyVar33 = this.f320a.f319a;
                hVar46 = jyVar33.mp;
                return new com.google.android.libraries.notifications.internal.a.a.c((com.google.android.libraries.notifications.platform.internal.p.b) hVar46.a());
            case 324:
                hVar47 = this.f320a.f;
                return new com.google.android.libraries.notifications.platform.internal.r.a.a.a((Context) hVar47.a());
            case 325:
                jyVar34 = this.f320a.f319a;
                hVar48 = jyVar34.og;
                jyVar35 = this.f320a.f319a;
                hVar49 = jyVar35.mp;
                jyVar36 = this.f320a.f319a;
                hVar50 = jyVar36.oF;
                return new com.google.android.libraries.notifications.g.a.g();
            case 326:
                jyVar37 = this.f320a.f319a;
                hVar51 = jyVar37.mp;
                jyVar38 = this.f320a.f319a;
                hVar52 = jyVar38.nO;
                com.google.android.libraries.notifications.internal.storage.d dVar2 = (com.google.android.libraries.notifications.internal.storage.d) hVar52.a();
                jyVar39 = this.f320a.f319a;
                hVar53 = jyVar39.nS;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar53.a();
                jyVar40 = this.f320a.f319a;
                hVar54 = jyVar40.mR;
                com.google.android.libraries.notifications.internal.n.g gVar = (com.google.android.libraries.notifications.internal.n.g) hVar54.a();
                jyVar41 = this.f320a.f319a;
                hVar55 = jyVar41.my;
                com.google.android.libraries.notifications.internal.b.a aVar4 = (com.google.android.libraries.notifications.internal.b.a) hVar55.a();
                jyVar42 = this.f320a.f319a;
                hVar56 = jyVar42.nI;
                Set set = (Set) hVar56.a();
                jyVar43 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.f.c rq = jyVar43.rq();
                jyVar44 = this.f320a.f319a;
                hVar57 = jyVar44.mA;
                return new com.google.android.libraries.notifications.internal.a.a.b(dVar2, jVar, gVar, aVar4, set, rq, (cq) hVar57.a());
            case 327:
                jyVar45 = this.f320a.f319a;
                hVar58 = jyVar45.mA;
                cq cqVar3 = (cq) hVar58.a();
                jyVar46 = this.f320a.f319a;
                hVar59 = jyVar46.oJ;
                return com.google.android.libraries.notifications.platform.internal.p.a.q.b(cqVar3, (com.google.android.libraries.storage.a.j) hVar59.a());
            case 328:
                hVar60 = this.f320a.f;
                return com.google.android.libraries.notifications.platform.internal.p.a.q.e((Context) hVar60.a());
            case 329:
                hVar61 = this.f320a.bN;
                com.google.apps.tiktok.account.data.b bVar5 = (com.google.apps.tiktok.account.data.b) hVar61.a();
                hVar62 = this.f320a.f;
                Context context5 = (Context) hVar62.a();
                hVar63 = this.f320a.bo;
                return new com.google.android.apps.search.googleapp.discover.ae.y(bVar5, context5, (ag) hVar63.a());
            case 330:
                hVar64 = this.f320a.H;
                ExecutorService executorService = (ExecutorService) hVar64.a();
                hVar65 = this.f320a.bN;
                com.google.apps.tiktok.account.data.b bVar6 = (com.google.apps.tiktok.account.data.b) hVar65.a();
                hVar66 = this.f320a.vU;
                com.google.android.libraries.search.l.b.f fVar = (com.google.android.libraries.search.l.b.f) hVar66.a();
                jyVar47 = this.f320a.f319a;
                return new com.google.android.libraries.search.l.d.b(executorService, bVar6, fVar, jyVar47.pz());
            case 331:
                hVar67 = this.f320a.gK;
                return new com.google.android.apps.search.googleapp.notifications.accountsettings.f(hVar67);
            case 332:
                hVar68 = this.f320a.hP;
                return new com.google.android.libraries.search.integrations.h.b((bz) hVar68.a());
            case 333:
                jo joVar4 = this.f320a;
                com.google.android.apps.search.omnient.b.b.a gY = joVar4.gY();
                hVar69 = joVar4.Q;
                ag agVar3 = (ag) hVar69.a();
                hVar70 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar2 = (com.google.apps.tiktok.contrib.work.b.p) hVar70.a();
                hVar71 = this.f320a.ws;
                com.google.android.apps.search.omnient.b.e.f fVar2 = (com.google.android.apps.search.omnient.b.e.f) hVar71.a();
                jyVar48 = this.f320a.f319a;
                hVar72 = jyVar48.bf;
                return new com.google.android.apps.search.omnient.host.availability.h(gY, agVar3, pVar2, fVar2, (com.google.android.apps.search.omnient.host.availability.j) hVar72.a());
            case 334:
                hVar73 = this.f320a.f;
                Context context6 = (Context) hVar73.a();
                hVar74 = this.f320a.bo;
                ag agVar4 = (ag) hVar74.a();
                jyVar49 = this.f320a.f319a;
                hVar75 = jyVar49.be;
                e.a b5 = c.b(hVar75);
                hVar76 = this.f320a.gK;
                return new com.google.android.apps.search.omnient.host.availability.j(context6, agVar4, b5, (com.google.apps.tiktok.contrib.work.b.p) hVar76.a());
            case 335:
                hVar77 = this.f320a.f;
                Context context7 = (Context) hVar77.a();
                hVar78 = this.f320a.v;
                Executor executor = (Executor) hVar78.a();
                hVar79 = this.f320a.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar79.a();
                jyVar50 = this.f320a.f319a;
                Optional oZ = jyVar50.oZ();
                jo joVar5 = this.f320a;
                boolean aco = joVar5.aco();
                boolean acp = joVar5.acp();
                boolean acq = joVar5.acq();
                jyVar51 = joVar5.f319a;
                boolean qE = jyVar51.qE();
                jyVar52 = this.f320a.f319a;
                boolean qF = jyVar52.qF();
                jyVar53 = this.f320a.f319a;
                boolean qG = jyVar53.qG();
                hVar80 = this.f320a.W;
                return new com.google.android.apps.search.omnient.host.availability.b(context7, executor, fVar3, oZ, aco, acp, acq, qE, qF, qG, (com.google.android.libraries.search.t.i.y) hVar80.a());
            case 336:
                jo joVar6 = this.f320a;
                hVar81 = joVar6.gK;
                hVar82 = joVar6.an;
                return new com.google.android.libraries.search.integrations.p.a.e(hVar81, (com.google.android.libraries.search.z.a.a.a) hVar82.a());
            case 337:
                hVar83 = this.f320a.f;
                Context context8 = (Context) hVar83.a();
                jo joVar7 = this.f320a;
                return new com.google.android.apps.search.googleapp.searchwidget.h.a(context8, joVar7.gH(), joVar7.lU(), joVar7.kY(), joVar7.gG());
            case 338:
                hVar84 = this.f320a.f;
                return new com.google.android.apps.search.soundsearch.shortcut.a.a((Context) hVar84.a());
            case 339:
                hVar85 = this.f320a.ho;
                com.google.apps.tiktok.experiments.phenotype.m mVar = (com.google.apps.tiktok.experiments.phenotype.m) hVar85.a();
                jo joVar8 = this.f320a;
                com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar8.fZ();
                hVar86 = joVar8.gK;
                jyVar54 = joVar8.f319a;
                com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.aa cu = jyVar54.cu();
                jyVar55 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.ambient.trigger.e.l cx = jyVar55.cx();
                hVar87 = this.f320a.v;
                cr crVar2 = (cr) hVar87.a();
                hVar88 = this.f320a.nM;
                return new com.google.android.apps.search.assistant.verticals.ambient.startup.f(mVar, fZ, hVar86, cu, cx, crVar2, (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar88.a());
            case 340:
                return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.g(this.f320a.gq());
            case 341:
                jo joVar9 = this.f320a;
                com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.shortcut.a.b fP = joVar9.fP();
                hVar89 = joVar9.H;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.shortcut.a.c(fP, (cr) hVar89.a());
            case 342:
                hVar90 = this.f320a.f;
                return new com.google.android.apps.search.googleapp.startup.c.a((Context) hVar90.a());
            case 343:
                hVar91 = this.f320a.f;
                return new com.google.android.apps.search.widgets.a.a((Context) hVar91.a());
            case 344:
                hVar92 = this.f320a.f;
                Context context9 = (Context) hVar92.a();
                jo joVar10 = this.f320a;
                com.google.android.apps.search.widgets.weather.a.b hl = joVar10.hl();
                hVar93 = joVar10.bo;
                return new com.google.android.apps.search.widgets.weather.a.d(context9, hl, (ag) hVar93.a());
            case 345:
                hVar94 = this.f320a.x;
                com.google.android.libraries.phenotype.client.a.i iVar2 = (com.google.android.libraries.phenotype.client.a.i) hVar94.a();
                hVar95 = this.f320a.bo;
                ag agVar5 = (ag) hVar95.a();
                jyVar56 = this.f320a.f319a;
                return new com.google.android.libraries.search.z.a.d(iVar2, agVar5, jyVar56.qJ());
            case 346:
                jyVar57 = this.f320a.f319a;
                hVar96 = jyVar57.bg;
                hVar97 = this.f320a.ao;
                return new com.google.apps.tiktok.r.b.al(hVar96, ((Boolean) hVar97.a()).booleanValue());
            case 347:
                hVar98 = this.f320a.ao;
                boolean booleanValue = ((Boolean) hVar98.a()).booleanValue();
                jo joVar11 = this.f320a;
                hVar99 = joVar11.agy;
                jyVar58 = joVar11.f319a;
                hVar100 = jyVar58.pc;
                return com.google.apps.tiktok.r.b.af.b(booleanValue, hVar99, hVar100);
            case 348:
                return new com.google.apps.tiktok.r.b.c();
            case 349:
                hVar101 = this.f320a.f;
                Context context10 = (Context) hVar101.a();
                jo joVar12 = this.f320a;
                com.google.android.libraries.ao.c ju2 = joVar12.ju();
                hVar102 = joVar12.H;
                ExecutorService executorService2 = (ExecutorService) hVar102.a();
                hVar103 = this.f320a.v;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar103.a();
                jo joVar13 = this.f320a;
                int j = joVar13.j();
                jyVar59 = joVar13.f319a;
                Map pC2 = jyVar59.pC();
                jyVar60 = this.f320a.f319a;
                Map px2 = jyVar60.px();
                jyVar61 = this.f320a.f319a;
                hVar104 = jyVar61.pf;
                return new com.google.apps.tiktok.i.w(context10, ju2, executorService2, scheduledExecutorService, j, pC2, px2, c.b(hVar104));
            case 350:
                hVar105 = this.f320a.f;
                return com.google.apps.tiktok.i.x.e((Context) hVar105.a(), this.f320a.md());
            case 351:
                jyVar62 = this.f320a.f319a;
                return Optional.of(Boolean.valueOf(jyVar62.qK()));
            case 352:
                hVar106 = this.f320a.bo;
                ag agVar6 = (ag) hVar106.a();
                hVar107 = this.f320a.f;
                Context context11 = (Context) hVar107.a();
                jyVar63 = this.f320a.f319a;
                hVar108 = jyVar63.pk;
                return new com.google.android.libraries.search.location.compliance.e.g(agVar6, context11, c.b(hVar108));
            case 353:
                jyVar64 = this.f320a.f319a;
                hVar109 = jyVar64.pj;
                e.a b6 = c.b(hVar109);
                hVar110 = this.f320a.Qt;
                e.a b7 = c.b(hVar110);
                hVar111 = this.f320a.v;
                return new com.google.android.libraries.search.location.compliance.e.c(b6, b7, (Executor) hVar111.a());
            case 354:
                jyVar65 = this.f320a.f319a;
                return new com.google.android.libraries.search.location.compliance.e.e(jyVar65.qq());
            case 355:
                jyVar66 = this.f320a.f319a;
                return new com.google.android.libraries.search.location.compliance.e.a.e(jyVar66.sf());
            case 356:
                hVar112 = this.f320a.n;
                Executor executor2 = (Executor) hVar112.a();
                jyVar67 = this.f320a.f319a;
                return new com.google.apps.tiktok.contrib.b.b(executor2, at.k(jyVar67.pf()));
            case 357:
                hVar113 = this.f320a.H;
                cr crVar3 = (cr) hVar113.a();
                hVar114 = this.f320a.n;
                return new com.google.android.libraries.k.b.a.c(crVar3, (cr) hVar114.a());
            case 358:
                jyVar68 = this.f320a.f319a;
                hVar115 = jyVar68.ps;
                com.google.common.f.b.a.c cVar2 = (com.google.common.f.b.a.c) hVar115.a();
                jyVar69 = this.f320a.f319a;
                hVar116 = jyVar69.pu;
                com.google.common.f.b.a.c cVar3 = (com.google.common.f.b.a.c) hVar116.a();
                jyVar70 = this.f320a.f319a;
                hVar117 = jyVar70.pw;
                com.google.common.f.b.a.c cVar4 = (com.google.common.f.b.a.c) hVar117.a();
                jyVar71 = this.f320a.f319a;
                hVar118 = jyVar71.py;
                return ha.u(cVar2, cVar3, cVar4, (com.google.common.f.b.a.c) hVar118.a());
            case 359:
                hVar119 = this.f320a.f;
                Context context12 = (Context) hVar119.a();
                jyVar72 = this.f320a.f319a;
                hVar120 = jyVar72.po;
                e.a b8 = c.b(hVar120);
                jyVar73 = this.f320a.f319a;
                hVar121 = jyVar73.pr;
                Object a2 = hVar121.a();
                hVar122 = this.f320a.bl;
                com.google.android.gms.clearcut.a.b bVar7 = (com.google.android.gms.clearcut.a.b) hVar122.a();
                hVar123 = this.f320a.Y;
                return com.google.apps.tiktok.l.a.a.c.b(context12, b8, a2, bVar7, (String) hVar123.a());
            case 360:
                return new Object() { // from class: com.google.android.libraries.search.integrations.g.a
                };
            case 361:
                jyVar74 = this.f320a.f319a;
                hVar124 = jyVar74.pp;
                com.google.frameworks.client.a.a.a.a.i iVar3 = (com.google.frameworks.client.a.a.a.a.i) hVar124.a();
                hVar125 = this.f320a.bq;
                e.a b9 = c.b(hVar125);
                jyVar75 = this.f320a.f319a;
                hVar126 = jyVar75.pq;
                return new com.google.apps.tiktok.l.a.a.g(iVar3, b9, (com.google.apps.tiktok.l.a.a.e) hVar126.a());
            case 362:
                hVar127 = this.f320a.f;
                Context context13 = (Context) hVar127.a();
                jyVar76 = this.f320a.f319a;
                hVar128 = jyVar76.po;
                return com.google.apps.tiktok.l.a.a.c.c(context13, c.b(hVar128));
            case 363:
                return new com.google.apps.tiktok.l.a.a.e();
            case 364:
                jyVar77 = this.f320a.f319a;
                hVar129 = jyVar77.pt;
                return new com.google.android.libraries.search.integrations.g.c(hVar129);
            case 365:
                return Boolean.valueOf(h.a.a.as.a.a.f.f(this.f320a.agx()));
            case 366:
                jyVar78 = this.f320a.f319a;
                hVar130 = jyVar78.pv;
                return new com.google.android.libraries.performance.primes.c.d((com.google.android.libraries.performance.primes.c.e) hVar130.a());
            case 367:
                hVar131 = this.f320a.cl;
                return new com.google.android.libraries.performance.primes.c.e((com.google.android.libraries.performance.primes.c.k) hVar131.a());
            case 368:
                hVar132 = this.f320a.H;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) hVar132.a();
                jyVar79 = this.f320a.f319a;
                hVar133 = jyVar79.px;
                return new com.google.android.libraries.p.a.e.a.c(scheduledExecutorService2, (lt) hVar133.a());
            case 369:
                return new lt(this);
            case 370:
                return new op(this.f320a.Wc());
            case 371:
                hVar134 = this.f320a.f;
                Context context14 = (Context) hVar134.a();
                Optional of = Optional.of(this.f320a.fn());
                hVar135 = this.f320a.v;
                Executor executor3 = (Executor) hVar135.a();
                jo joVar14 = this.f320a;
                boolean acU = joVar14.acU();
                jyVar80 = joVar14.f319a;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.e(context14, of, executor3, acU, jyVar80.be());
            case 372:
                jyVar81 = this.f320a.f319a;
                com.google.android.apps.search.assistant.platform.pcp.g.a bc = jyVar81.bc();
                hVar136 = this.f320a.f;
                Context context15 = (Context) hVar136.a();
                hVar137 = this.f320a.v;
                Executor executor4 = (Executor) hVar137.a();
                hVar138 = this.f320a.bN;
                return new com.google.android.apps.search.assistant.platform.pcp.g.i(bc, context15, executor4, (com.google.apps.tiktok.account.data.b) hVar138.a());
            case 373:
                return new com.google.android.apps.search.assistant.surfaces.c.a.a.a();
            case 374:
                return new Object() { // from class: com.google.android.apps.gsa.nga.engine.viss.a
                };
            case 375:
                return new lt(this);
            case 376:
                hVar139 = this.f320a.iC;
                com.google.android.libraries.gsa.h.h hVar192 = (com.google.android.libraries.gsa.h.h) hVar139.a();
                jo joVar15 = this.f320a;
                com.google.android.apps.gsa.nga.engine.ar.b.f bA = joVar15.bA();
                hVar140 = joVar15.iR;
                return new com.google.android.apps.gsa.nga.engine.ar.b.b.ac(hVar192, bA, (w) hVar140.a());
            case 377:
                jo joVar16 = this.f320a;
                com.google.android.apps.gsa.nga.engine.ar.b.f bA2 = joVar16.bA();
                hVar141 = joVar16.iC;
                com.google.android.libraries.gsa.h.h hVar193 = (com.google.android.libraries.gsa.h.h) hVar141.a();
                hVar142 = this.f320a.jG;
                com.google.android.apps.gsa.nga.engine.ar.b.d dVar3 = (com.google.android.apps.gsa.nga.engine.ar.b.d) hVar142.a();
                hVar143 = this.f320a.kd;
                com.google.android.apps.gsa.nga.shared.ad.a.d dVar4 = (com.google.android.apps.gsa.nga.shared.ad.a.d) hVar143.a();
                hVar144 = this.f320a.iR;
                hVar145 = this.f320a.ez;
                return new com.google.android.apps.gsa.nga.engine.ar.b.b.e(bA2, hVar193, dVar3, dVar4);
            case 378:
                jyVar82 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.bisto.b.a E = jyVar82.E();
                jyVar83 = this.f320a.f319a;
                com.google.android.apps.gsa.nga.engine.bisto.b.o F = jyVar83.F();
                jyVar84 = this.f320a.f319a;
                hVar146 = jyVar84.pI;
                return ha.t(E, F, (com.google.android.apps.gsa.nga.engine.bisto.b) hVar146.a());
            case 379:
                jyVar85 = this.f320a.f319a;
                Object po = jyVar85.po();
                jyVar86 = this.f320a.f319a;
                hVar147 = jyVar86.pD;
                return new com.google.android.apps.gsa.nga.engine.bisto.b.h((com.google.android.apps.gsa.nga.engine.bisto.b.v) po, (com.google.android.libraries.gsa.h.h) hVar147.a());
            case 380:
                jyVar87 = this.f320a.f319a;
                hVar148 = jyVar87.pB;
                return new com.google.android.apps.gsa.nga.engine.bisto.b.c((com.google.android.libraries.gsa.h.h) hVar148.a());
            case 381:
                hVar149 = this.f320a.jF;
                return com.google.android.apps.gsa.nga.engine.bisto.c.a.c((com.google.android.apps.gsa.shared.util.c.a.aw) hVar149.a());
            case 382:
                hVar150 = this.f320a.he;
                return com.google.android.apps.gsa.nga.engine.bisto.c.a.b((com.google.android.apps.gsa.shared.util.c.a.aw) hVar150.a());
            case 383:
                hVar151 = this.f320a.f;
                return new com.google.android.apps.gsa.nga.engine.bisto.b.w((Context) hVar151.a());
            case 384:
                jo joVar17 = this.f320a;
                hVar152 = joVar17.gp;
                jyVar88 = joVar17.f319a;
                hVar153 = jyVar88.pD;
                hVar154 = this.f320a.ki;
                return new com.google.android.apps.gsa.nga.engine.bisto.b.m(hVar152, hVar153, hVar154);
            case 385:
                return Boolean.valueOf(h.a.a.f.a.a.h.b(this.f320a.agw()));
            case 386:
                hVar155 = this.f320a.jG;
                com.google.android.apps.gsa.nga.engine.ar.b.d dVar5 = (com.google.android.apps.gsa.nga.engine.ar.b.d) hVar155.a();
                hVar156 = this.f320a.iC;
                com.google.android.libraries.gsa.h.h hVar194 = (com.google.android.libraries.gsa.h.h) hVar156.a();
                hVar157 = this.f320a.kd;
                com.google.android.apps.gsa.nga.shared.ad.a.d dVar6 = (com.google.android.apps.gsa.nga.shared.ad.a.d) hVar157.a();
                hVar158 = this.f320a.iR;
                return new com.google.android.apps.gsa.nga.engine.ar.b.b.m(dVar5, hVar194, dVar6, this.f320a.bA());
            case 387:
                jyVar89 = this.f320a.f319a;
                hVar159 = jyVar89.pH;
                Object a3 = hVar159.a();
                hVar160 = this.f320a.jG;
                return com.google.android.apps.gsa.nga.engine.bisto.b.p.b(a3, (com.google.android.apps.gsa.nga.engine.ar.b.d) hVar160.a());
            case 388:
                hVar161 = this.f320a.iC;
                this.f320a.bA();
                hVar162 = this.f320a.kd;
                return new aj();
            case 389:
                hVar163 = this.f320a.iC;
                this.f320a.bA();
                hVar164 = this.f320a.kd;
                return new aj();
            case 390:
                jyVar90 = this.f320a.f319a;
                hVar165 = jyVar90.pJ;
                com.google.android.libraries.search.assistant.ai.c.a aVar5 = (com.google.android.libraries.search.assistant.ai.c.a) hVar165.a();
                jyVar91 = this.f320a.f319a;
                hVar166 = jyVar91.pK;
                return fu.n("CHARGING_AMBIENT", aVar5, "MORRIS", (com.google.android.libraries.search.assistant.ai.c.a) hVar166.a());
            case 391:
                jyVar92 = this.f320a.f319a;
                com.google.android.apps.gsa.shared.f.p Z = jyVar92.Z();
                hVar167 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar195 = (com.google.android.libraries.gsa.h.h) hVar167.a();
                hVar168 = this.f320a.jv;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.j.c(Z, hVar195, (com.google.android.apps.gsa.search.shared.service.e.e) hVar168.a());
            case 392:
                hVar169 = this.f320a.f;
                Context context16 = (Context) hVar169.a();
                hVar170 = this.f320a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar170.a();
                jyVar93 = this.f320a.f319a;
                com.google.android.apps.gsa.shared.f.p Z2 = jyVar93.Z();
                hVar171 = this.f320a.H;
                cr crVar4 = (cr) hVar171.a();
                hVar172 = this.f320a.v;
                cr crVar5 = (cr) hVar172.a();
                hVar173 = this.f320a.jv;
                com.google.android.apps.gsa.search.shared.service.e.e eVar = (com.google.android.apps.gsa.search.shared.service.e.e) hVar173.a();
                hVar174 = this.f320a.hh;
                com.google.android.apps.gsa.shared.util.q.a aVar7 = (com.google.android.apps.gsa.shared.util.q.a) hVar174.a();
                hVar175 = this.f320a.pz;
                com.google.android.apps.gsa.shared.notificationlistening.collection.a.z zVar = (com.google.android.apps.gsa.shared.notificationlistening.collection.a.z) hVar175.a();
                jyVar94 = this.f320a.f319a;
                return new com.google.android.apps.gsa.staticplugins.opa.morris2.e.e(context16, aVar6, Z2, crVar4, crVar5, eVar, aVar7, zVar, jyVar94.R());
            case 393:
                hVar176 = this.f320a.f;
                Context context17 = (Context) hVar176.a();
                hVar177 = this.f320a.gm;
                hVar178 = this.f320a.jv;
                com.google.android.apps.gsa.search.shared.service.e.e eVar2 = (com.google.android.apps.gsa.search.shared.service.e.e) hVar178.a();
                jyVar95 = this.f320a.f319a;
                com.google.android.apps.gsa.notificationlistener.a Q = jyVar95.Q();
                jyVar96 = this.f320a.f319a;
                com.google.android.apps.gsa.notificationlistener.i R = jyVar96.R();
                hVar179 = this.f320a.gz;
                com.google.android.libraries.gsa.h.h hVar196 = (com.google.android.libraries.gsa.h.h) hVar179.a();
                hVar180 = this.f320a.hO;
                com.google.android.libraries.search.b.b bVar8 = (com.google.android.libraries.search.b.b) hVar180.a();
                hVar181 = this.f320a.gi;
                hVar182 = this.f320a.g;
                return new com.google.android.apps.gsa.notificationlistener.v(context17, eVar2, Q, R, hVar196, bVar8, (com.google.android.libraries.g.a) hVar182.a());
            case 394:
                return com.google.android.apps.gsa.eventlogger.f.b();
            case 395:
                return new com.google.android.libraries.gcoreclient.q.a.e();
            case 396:
                return new com.google.android.libraries.gcoreclient.q.a.f();
            case 397:
                hVar183 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar3 = (com.google.apps.tiktok.contrib.work.b.p) hVar183.a();
                hVar184 = this.f320a.oI;
                com.google.android.apps.gsa.smartspace.l lVar2 = (com.google.android.apps.gsa.smartspace.l) hVar184.a();
                hVar185 = this.f320a.nN;
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) hVar185.a();
                hVar186 = this.f320a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar7 = (com.google.android.apps.gsa.opa.smartspace.d) hVar186.a();
                hVar187 = this.f320a.v;
                Executor executor5 = (Executor) hVar187.a();
                hVar188 = this.f320a.ls;
                return new com.google.android.apps.gsa.smartspace.e.c(pVar3, lVar2, rVar, dVar7, executor5, (com.google.android.apps.gsa.search.core.aa.a.c) hVar188.a());
            case 398:
                jyVar97 = this.f320a.f319a;
                hVar189 = jyVar97.qD;
                return new op((com.google.android.apps.gsa.search.core.g.b.a) hVar189.a());
            case 399:
                jyVar98 = this.f320a.f319a;
                hVar190 = jyVar98.bz;
                e.a b10 = c.b(hVar190);
                hVar191 = this.f320a.v;
                return new com.google.android.apps.gsa.tasks.ak(b10, (cq) hVar191.a());
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
        jy jyVar;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        jy jyVar2;
        jy jyVar3;
        h hVar11;
        jy jyVar4;
        h hVar12;
        jy jyVar5;
        h hVar13;
        jy jyVar6;
        h hVar14;
        jy jyVar7;
        h hVar15;
        jy jyVar8;
        h hVar16;
        jy jyVar9;
        h hVar17;
        jy jyVar10;
        h hVar18;
        h hVar19;
        h hVar20;
        jy jyVar11;
        jy jyVar12;
        h hVar21;
        jy jyVar13;
        h hVar22;
        h hVar23;
        h hVar24;
        jy jyVar14;
        h hVar25;
        jy jyVar15;
        h hVar26;
        jy jyVar16;
        h hVar27;
        jy jyVar17;
        h hVar28;
        jy jyVar18;
        h hVar29;
        jy jyVar19;
        jy jyVar20;
        jy jyVar21;
        h hVar30;
        h hVar31;
        h hVar32;
        h hVar33;
        jy jyVar22;
        h hVar34;
        h hVar35;
        h hVar36;
        h hVar37;
        h hVar38;
        h hVar39;
        jy jyVar23;
        h hVar40;
        h hVar41;
        h hVar42;
        h hVar43;
        h hVar44;
        jy jyVar24;
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
        jy jyVar25;
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
        jy jyVar26;
        jy jyVar27;
        jy jyVar28;
        h hVar96;
        jy jyVar29;
        h hVar97;
        jy jyVar30;
        h hVar98;
        jy jyVar31;
        h hVar99;
        jy jyVar32;
        h hVar100;
        jy jyVar33;
        jy jyVar34;
        h hVar101;
        jy jyVar35;
        jy jyVar36;
        h hVar102;
        h hVar103;
        jy jyVar37;
        h hVar104;
        jy jyVar38;
        h hVar105;
        jy jyVar39;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        h hVar112;
        jy jyVar40;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        h hVar117;
        h hVar118;
        h hVar119;
        jy jyVar41;
        h hVar120;
        h hVar121;
        h hVar122;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        jy jyVar42;
        h hVar127;
        jy jyVar43;
        h hVar128;
        h hVar129;
        jy jyVar44;
        h hVar130;
        h hVar131;
        h hVar132;
        jy jyVar45;
        h hVar133;
        jy jyVar46;
        h hVar134;
        h hVar135;
        jy jyVar47;
        h hVar136;
        h hVar137;
        int i = this.b;
        switch (i) {
            case 400:
                hVar = this.f320a.f319a.qB;
                com.google.android.apps.gsa.tasks.ai aiVar = (com.google.android.apps.gsa.tasks.ai) hVar.a();
                hVar2 = this.f320a.gP;
                com.google.android.apps.gsa.tasks.m mVar = (com.google.android.apps.gsa.tasks.m) hVar2.a();
                hVar3 = this.f320a.EC;
                com.google.android.apps.gsa.tasks.w wVar = (com.google.android.apps.gsa.tasks.w) hVar3.a();
                hVar4 = this.f320a.gf;
                com.google.android.apps.gsa.search.core.preferences.n nVar = (com.google.android.apps.gsa.search.core.preferences.n) hVar4.a();
                hVar5 = this.f320a.gj;
                return new com.google.android.apps.gsa.tasks.an(aiVar, mVar, wVar, nVar, ((Integer) hVar5.a()).intValue());
            case 401:
                jo joVar = this.f320a;
                Map pE = joVar.f319a.pE();
                hVar6 = joVar.gq;
                return new com.google.android.apps.gsa.tasks.ai(pE, (p) hVar6.a());
            case 402:
                p pVar = (p) this.f320a.gq.a();
                jyVar = this.f320a.f319a;
                return com.google.android.apps.gsa.staticplugins.opa.zerostate.e.c.d(pVar, jyVar.aP());
            case 403:
                hVar7 = this.f320a.f319a.U;
                return at.k((com.google.android.apps.gsa.staticplugins.opa.h.a) hVar7.a());
            case 404:
                return com.google.android.apps.gsa.hotword.a.a.c((p) this.f320a.gq.a());
            case 405:
                return com.google.android.apps.gsa.hotword.a.a.b();
            case 406:
                return com.google.android.apps.gsa.staticplugins.backup.a.a.b();
            case 407:
                return com.google.android.apps.gsa.staticplugins.t.a.a.c((p) this.f320a.gq.a());
            case 408:
                return com.google.android.apps.gsa.staticplugins.t.a.a.b((p) this.f320a.gq.a());
            case 409:
                return com.google.android.apps.gsa.store.tasks.a.b();
            case 410:
                return com.google.android.apps.gsa.search.core.g.b();
            case 411:
                return com.google.android.apps.gsa.speech.g.c.b((p) this.f320a.gq.a());
            case 412:
                return com.google.android.apps.gsa.l.d.c.b((p) this.f320a.gq.a());
            case 413:
                return com.google.android.apps.gsa.l.d.c.i((p) this.f320a.gq.a());
            case 414:
                return com.google.android.apps.gsa.l.d.c.d((p) this.f320a.gq.a());
            case 415:
                return com.google.android.apps.gsa.l.d.c.h((p) this.f320a.gq.a());
            case 416:
                return com.google.android.apps.gsa.l.d.c.f((p) this.f320a.gq.a());
            case 417:
                return com.google.android.apps.gsa.l.d.c.g((p) this.f320a.gq.a());
            case 418:
                return com.google.android.apps.gsa.l.d.c.j((p) this.f320a.gq.a(), this.f320a.acg());
            case 419:
                return com.google.android.apps.gsa.l.d.c.e((p) this.f320a.gq.a());
            case 420:
                return com.google.android.apps.gsa.languagepack.b.f.f((p) this.f320a.gq.a());
            case 421:
                return com.google.android.apps.gsa.staticplugins.ar.a.a.d((com.google.android.apps.gsa.search.core.aa.a.k) this.f320a.hq.a());
            case 422:
                return com.google.android.apps.gsa.staticplugins.ar.a.a.b((com.google.android.apps.gsa.search.core.aa.a.k) this.f320a.hq.a());
            case 423:
                return com.google.android.apps.gsa.staticplugins.ar.a.a.c((com.google.android.apps.gsa.search.core.aa.a.k) this.f320a.hq.a());
            case 424:
                return com.google.android.apps.gsa.staticplugins.ar.a.a.e((com.google.android.apps.gsa.search.core.aa.a.k) this.f320a.hq.a());
            case 425:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.h((p) this.f320a.gq.a());
            case 426:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.e((p) this.f320a.gq.a());
            case 427:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.j((p) this.f320a.gq.a());
            case 428:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.d((p) this.f320a.gq.a());
            case 429:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.b((p) this.f320a.gq.a());
            case 430:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.m((p) this.f320a.gq.a());
            case 431:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.l();
            case 432:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.k();
            case 433:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.f();
            case 434:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.g();
            case 435:
                hVar8 = this.f320a.gq;
                return com.google.android.apps.gsa.staticplugins.nga.j.b.i();
            case 436:
                return b.o((p) this.f320a.gq.a());
            case 437:
                p pVar2 = (p) this.f320a.gq.a();
                hVar9 = this.f320a.gP;
                return com.google.android.apps.gsa.staticplugins.ba.b.a.b(pVar2);
            case 438:
                return com.google.android.apps.gsa.search.core.google.gaia.a.b.b();
            case 439:
                com.google.android.apps.gsa.tasks.t a2 = com.google.android.apps.gsa.hotword.b.a.d.a();
                a2.getClass();
                return a2;
            case 440:
                com.google.android.apps.gsa.tasks.t a3 = com.google.android.apps.gsa.staticplugins.bp.c.d.a();
                a3.getClass();
                return a3;
            case 441:
                com.google.android.apps.gsa.tasks.t a4 = com.google.android.apps.gsa.search.core.z.a.a();
                a4.getClass();
                return a4;
            case 442:
                com.google.android.apps.gsa.tasks.t a5 = com.google.android.apps.gsa.staticplugins.au.b.a.a.a();
                a5.getClass();
                return a5;
            case 443:
                return com.google.android.apps.gsa.staticplugins.opa.worker.f.a.b(c.b(this.f320a.gq));
            case 444:
                com.google.android.apps.gsa.tasks.t a6 = com.google.android.apps.gsa.staticplugins.bw.a.a.a();
                a6.getClass();
                return a6;
            case 445:
                jy jyVar48 = this.f320a.f319a;
                gy l = ha.l(26);
                hVar10 = jyVar48.qE;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar10.a());
                jyVar2 = this.f320a.f319a;
                l.j(jyVar2.pU());
                jyVar3 = this.f320a.f319a;
                hVar11 = jyVar3.qF;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar11.a());
                jyVar4 = this.f320a.f319a;
                hVar12 = jyVar4.qG;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar12.a());
                jyVar5 = this.f320a.f319a;
                hVar13 = jyVar5.qH;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar13.a());
                jyVar6 = this.f320a.f319a;
                hVar14 = jyVar6.qI;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar14.a());
                jyVar7 = this.f320a.f319a;
                hVar15 = jyVar7.qM;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar15.a());
                jyVar8 = this.f320a.f319a;
                hVar16 = jyVar8.qN;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar16.a());
                jyVar9 = this.f320a.f319a;
                hVar17 = jyVar9.qP;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar17.a());
                jyVar10 = this.f320a.f319a;
                hVar18 = jyVar10.qR;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar18.a());
                l.h(new com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.a());
                hVar19 = this.f320a.gs;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar19.a());
                hVar20 = this.f320a.Ru;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar20.a());
                jyVar11 = this.f320a.f319a;
                l.h(jyVar11.aJ());
                jyVar12 = this.f320a.f319a;
                hVar21 = jyVar12.qS;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar21.a());
                jyVar13 = this.f320a.f319a;
                hVar22 = jyVar13.qU;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar22.a());
                hVar23 = this.f320a.hl;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar23.a());
                hVar24 = this.f320a.Rv;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar24.a());
                jyVar14 = this.f320a.f319a;
                hVar25 = jyVar14.qW;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar25.a());
                jyVar15 = this.f320a.f319a;
                hVar26 = jyVar15.qY;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar26.a());
                jyVar16 = this.f320a.f319a;
                hVar27 = jyVar16.ra;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar27.a());
                jyVar17 = this.f320a.f319a;
                hVar28 = jyVar17.rc;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar28.a());
                jyVar18 = this.f320a.f319a;
                hVar29 = jyVar18.re;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar29.a());
                jyVar19 = this.f320a.f319a;
                l.h(jyVar19.aK());
                jyVar20 = this.f320a.f319a;
                l.h(jyVar20.aR());
                jyVar21 = this.f320a.f319a;
                hVar30 = jyVar21.rg;
                l.h((com.google.android.apps.gsa.search.core.g.b.a) hVar30.a());
                return l.g();
            case 446:
                hVar31 = this.f320a.f319a.bB;
                return new com.google.android.apps.gsa.staticplugins.ao.a.a((at) hVar31.a());
            case 447:
                return com.google.android.apps.gsa.shared.u.b.d((Context) this.f320a.f.a());
            case 448:
                Context context = (Context) this.f320a.f.a();
                hVar32 = this.f320a.gt;
                return new com.google.android.apps.gsa.staticplugins.opa.ag.h((com.google.android.apps.gsa.assistant.shared.z) hVar32.a(), context);
            case 449:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f320a.gh.a();
                hVar33 = this.f320a.ip;
                com.google.android.apps.gsa.search.shared.h.b bVar = (com.google.android.apps.gsa.search.shared.h.b) hVar33.a();
                jyVar22 = this.f320a.f319a;
                hVar34 = jyVar22.bC;
                return new com.google.android.apps.gsa.staticplugins.opa.ag.j(sharedPreferences, bVar, (com.google.android.apps.gsa.assistant.shared.aw) hVar34.a());
            case 450:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f320a.gf.a();
                hVar35 = this.f320a.gB;
                an anVar = (an) hVar35.a();
                hVar36 = this.f320a.gp;
                return new com.google.android.apps.gsa.assistant.shared.aw(sharedPreferences2, anVar, (com.google.android.libraries.gsa.h.h) hVar36.a());
            case 451:
                hVar37 = this.f320a.f319a.bD;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.o.b bVar2 = (com.google.android.apps.gsa.staticplugins.opa.smartspace.o.b) hVar37.a();
                hVar38 = this.f320a.oj;
                return new com.google.android.apps.gsa.staticplugins.smartspace.d.b((com.google.android.apps.gsa.opa.smartspace.d) hVar38.a(), bVar2);
            case 452:
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.o.b((com.google.android.apps.gsa.opa.smartspace.c) this.f320a.oi.a());
            case 453:
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.a.d((com.google.android.apps.gsa.opa.smartspace.c) this.f320a.oi.a());
            case 454:
                int intValue = ((Integer) this.f320a.gj.a()).intValue();
                hVar39 = this.f320a.gh;
                SharedPreferences sharedPreferences3 = (SharedPreferences) hVar39.a();
                jyVar23 = this.f320a.f319a;
                hVar40 = jyVar23.qK;
                return new com.google.android.apps.gsa.search.core.ab.c(intValue, sharedPreferences3, c.b(hVar40));
            case 455:
                Context context2 = (Context) this.f320a.f.a();
                jo joVar2 = this.f320a;
                hVar41 = joVar2.gf;
                hVar42 = joVar2.gy;
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) hVar42.a();
                hVar43 = this.f320a.gQ;
                com.google.android.apps.gsa.configuration.a aVar = (com.google.android.apps.gsa.configuration.a) hVar43.a();
                hVar44 = this.f320a.gP;
                com.google.android.apps.gsa.tasks.m mVar2 = (com.google.android.apps.gsa.tasks.m) hVar44.a();
                jyVar24 = this.f320a.f319a;
                hVar45 = jyVar24.bE;
                e.a b = c.b(hVar45);
                hVar46 = this.f320a.hz;
                com.google.android.apps.gsa.search.core.d dVar = (com.google.android.apps.gsa.search.core.d) hVar46.a();
                hVar47 = this.f320a.mx;
                at k = at.k((com.google.android.apps.gsa.hotword.b.j) hVar47.a());
                hVar48 = this.f320a.hG;
                e.a b2 = c.b(hVar48);
                hVar49 = this.f320a.hO;
                return new com.google.android.apps.gsa.search.core.ab.b(context2, hVar41, anVar2, aVar, mVar2, b, dVar, k, b2, at.k((com.google.android.libraries.search.b.b) hVar49.a()));
            case 456:
                hVar50 = this.f320a.f319a.qJ;
                com.google.android.apps.gsa.tasks.ap apVar = (com.google.android.apps.gsa.tasks.ap) hVar50.a();
                hVar51 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar138 = (com.google.android.libraries.gsa.h.h) hVar51.a();
                hVar52 = this.f320a.gA;
                com.google.android.libraries.gsa.h.h hVar139 = (com.google.android.libraries.gsa.h.h) hVar52.a();
                hVar53 = this.f320a.EC;
                com.google.android.apps.gsa.tasks.w wVar2 = (com.google.android.apps.gsa.tasks.w) hVar53.a();
                hVar54 = this.f320a.gO;
                Object a7 = hVar54.a();
                hVar55 = this.f320a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar55.a();
                hVar56 = this.f320a.gm;
                return com.google.android.apps.gsa.tasks.af.c(apVar, hVar138, hVar139, wVar2, a7, aVar2);
            case 457:
                com.google.android.libraries.gsa.h.h hVar140 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                hVar57 = this.f320a.jv;
                return new com.google.android.apps.gsa.tasks.ap(hVar140, (com.google.android.apps.gsa.search.shared.service.e.e) hVar57.a());
            case 458:
                com.google.android.libraries.gsa.h.h hVar141 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                hVar58 = this.f320a.gP;
                com.google.android.apps.gsa.tasks.m mVar3 = (com.google.android.apps.gsa.tasks.m) hVar58.a();
                hVar59 = this.f320a.pN;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.b.o oVar = (com.google.android.apps.gsa.staticplugins.opa.smartspace.b.o) hVar59.a();
                hVar60 = this.f320a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar2 = (com.google.android.apps.gsa.opa.smartspace.d) hVar60.a();
                hVar61 = this.f320a.gq;
                p pVar3 = (p) hVar61.a();
                hVar62 = this.f320a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar62.a();
                hVar63 = this.f320a.ok;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.al alVar = (com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.al) hVar63.a();
                hVar64 = this.f320a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar4 = (com.google.android.apps.gsa.opa.a.a.a) hVar64.a();
                hVar65 = this.f320a.oA;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.b.u(hVar141, mVar3, oVar, dVar2, pVar3, aVar3, alVar, aVar4, (com.google.android.apps.gsa.assistant.settings.features.d.w) hVar65.a());
            case 459:
                com.google.apps.tiktok.contrib.work.b.p pVar4 = (com.google.apps.tiktok.contrib.work.b.p) this.f320a.gK.a();
                hVar66 = this.f320a.gq;
                p pVar5 = (p) hVar66.a();
                hVar67 = this.f320a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar3 = (com.google.android.apps.gsa.opa.smartspace.d) hVar67.a();
                hVar68 = this.f320a.ok;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.al alVar2 = (com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.al) hVar68.a();
                hVar69 = this.f320a.nK;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.b.a.f(pVar4, pVar5, dVar3, alVar2, (com.google.android.apps.gsa.opa.a.a.a) hVar69.a());
            case 460:
                com.google.android.apps.gsa.l.f.a aVar5 = (com.google.android.apps.gsa.l.f.a) this.f320a.mB.a();
                hVar70 = this.f320a.gA;
                return new com.google.android.apps.gsa.l.d(aVar5, (com.google.android.libraries.gsa.h.h) hVar70.a());
            case 461:
                return new com.google.android.apps.gsa.smartspace.e.f(this.f320a.f319a.qt());
            case 462:
                com.google.apps.tiktok.contrib.work.b.p pVar6 = (com.google.apps.tiktok.contrib.work.b.p) this.f320a.gK.a();
                hVar71 = this.f320a.iF;
                com.google.android.apps.gsa.nga.shared.q.a.x xVar = (com.google.android.apps.gsa.nga.shared.q.a.x) hVar71.a();
                hVar72 = this.f320a.gq;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.e.g(pVar6, xVar, (p) hVar72.a());
            case 463:
                e.a b3 = c.b(this.f320a.gq);
                hVar73 = this.f320a.gB;
                e.a b4 = c.b(hVar73);
                hVar74 = this.f320a.gf;
                e.a b5 = c.b(hVar74);
                hVar75 = this.f320a.oH;
                e.a b6 = c.b(hVar75);
                hVar76 = this.f320a.gV;
                e.a b7 = c.b(hVar76);
                hVar77 = this.f320a.gW;
                com.google.android.apps.gsa.assistant.settings.shared.t tVar = (com.google.android.apps.gsa.assistant.settings.shared.t) hVar77.a();
                jyVar25 = this.f320a.f319a;
                hVar78 = jyVar25.bF;
                e.a b8 = c.b(hVar78);
                hVar79 = this.f320a.wj;
                u uVar = (u) hVar79.a();
                hVar80 = this.f320a.gA;
                com.google.android.libraries.gsa.h.h hVar142 = (com.google.android.libraries.gsa.h.h) hVar80.a();
                hVar81 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar143 = (com.google.android.libraries.gsa.h.h) hVar81.a();
                hVar82 = this.f320a.gn;
                return new com.google.android.apps.gsa.opa.i(b3, b4, b5, b6, b7, tVar, b8, uVar, hVar142, hVar143, c.b(hVar82));
            case 464:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f320a.gf.a();
                hVar83 = this.f320a.gV;
                com.google.android.apps.gsa.speech.o.g gVar = (com.google.android.apps.gsa.speech.o.g) hVar83.a();
                hVar84 = this.f320a.mw;
                return new com.google.android.apps.gsa.search.core.ac.o(sharedPreferences4, gVar, (com.google.android.libraries.search.ai.o) hVar84.a());
            case 465:
                return new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.u((com.google.android.apps.gsa.tasks.m) this.f320a.gP.a());
            case 466:
                com.google.apps.tiktok.contrib.work.b.p pVar7 = (com.google.apps.tiktok.contrib.work.b.p) this.f320a.gK.a();
                hVar85 = this.f320a.gq;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.g.d(pVar7, (p) hVar85.a());
            case 467:
                com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac acVar = (com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac) this.f320a.wv.a();
                hVar86 = this.f320a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar4 = (com.google.android.apps.gsa.opa.smartspace.d) hVar86.a();
                jo joVar3 = this.f320a;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.d.j fj = joVar3.fj();
                hVar87 = joVar3.wx;
                com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m mVar4 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m) hVar87.a();
                hVar88 = this.f320a.ok;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.h.h(acVar, dVar4, fj, mVar4, (com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.al) hVar88.a());
            case 468:
                Context context3 = (Context) this.f320a.f.a();
                hVar89 = this.f320a.ls;
                return new com.google.android.apps.gsa.staticplugins.smartspace.widget.d(context3, (com.google.android.apps.gsa.search.core.aa.a.c) hVar89.a());
            case 469:
                Context context4 = (Context) this.f320a.f.a();
                hVar90 = this.f320a.gt;
                e.a b9 = c.b(hVar90);
                hVar91 = this.f320a.gq;
                e.a b10 = c.b(hVar91);
                hVar92 = this.f320a.gY;
                return new com.google.android.apps.gsa.search.core.ac.s(context4, b9, b10, c.b(hVar92));
            case 470:
                return new com.google.android.apps.gsa.n.k((Context) this.f320a.f.a(), at.k(this.f320a.af()));
            case 471:
                return new com.google.android.apps.gsa.projection.a.a();
            case 472:
                return new com.google.android.libraries.search.assistant.b.a(this.f320a.eT());
            case 473:
                Context context5 = (Context) this.f320a.f.a();
                hVar93 = this.f320a.gz;
                com.google.android.libraries.gsa.h.h hVar144 = (com.google.android.libraries.gsa.h.h) hVar93.a();
                hVar94 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar145 = (com.google.android.libraries.gsa.h.h) hVar94.a();
                hVar95 = this.f320a.H;
                Executor executor = (Executor) hVar95.a();
                jyVar26 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.gearhead.projected.e al = jyVar26.al();
                jyVar27 = this.f320a.f319a;
                com.google.android.libraries.search.b.f dA = jyVar27.dA();
                jyVar28 = this.f320a.f319a;
                hVar96 = jyVar28.bN;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b bVar3 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b) hVar96.a();
                jyVar29 = this.f320a.f319a;
                hVar97 = jyVar29.bO;
                jyVar30 = this.f320a.f319a;
                hVar98 = jyVar30.bQ;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j jVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j) hVar98.a();
                jyVar31 = this.f320a.f319a;
                hVar99 = jyVar31.ri;
                jyVar32 = this.f320a.f319a;
                hVar100 = jyVar32.rj;
                jo joVar4 = this.f320a;
                com.google.android.libraries.assistant.auto.jumpboost.i.b hr = joVar4.hr();
                jyVar33 = joVar4.f319a;
                at k2 = at.k(jyVar33.pp());
                jyVar34 = this.f320a.f319a;
                hVar101 = jyVar34.bR;
                com.google.android.libraries.assistant.auto.tng.j.c.c.a.a aVar6 = (com.google.android.libraries.assistant.auto.tng.j.c.c.a.a) hVar101.a();
                jyVar35 = this.f320a.f319a;
                Optional pa = jyVar35.pa();
                jyVar36 = this.f320a.f319a;
                hVar102 = jyVar36.bT;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n nVar2 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n) hVar102.a();
                hVar103 = this.f320a.W;
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) hVar103.a();
                jyVar37 = this.f320a.f319a;
                hVar104 = jyVar37.bU;
                com.google.android.libraries.assistant.auto.jumpboost.s.a aVar7 = (com.google.android.libraries.assistant.auto.jumpboost.s.a) hVar104.a();
                jyVar38 = this.f320a.f319a;
                hVar105 = jyVar38.bV;
                jyVar39 = this.f320a.f319a;
                hVar106 = jyVar39.bW;
                return new com.google.android.apps.gsa.staticplugins.gearhead.projected.v(context5, hVar144, hVar145, executor, al, dA, bVar3, hVar97, jVar, hVar99, hVar100, hr, k2, aVar6, pa, nVar2, yVar, aVar7, hVar105, hVar106);
            case 474:
                hVar107 = this.f320a.f319a.bL;
                e.a b11 = c.b(hVar107);
                hVar108 = this.f320a.el;
                return new com.google.android.libraries.assistant.auto.tng.j.b.a.b(b11, c.b(hVar108));
            case 475:
                hVar109 = this.f320a.f319a.rh;
                return new com.google.android.libraries.assistant.auto.tng.j.a.d((cg) hVar109.a());
            case 476:
                jo joVar5 = this.f320a;
                com.google.apps.tiktok.q.b.h a8 = com.google.android.libraries.assistant.auto.tng.j.a.e.a();
                com.google.apps.tiktok.q.b.k nb = joVar5.nb();
                hVar110 = joVar5.w;
                return com.google.android.libraries.assistant.auto.tng.j.a.f.b(a8, nb, (com.google.android.libraries.storage.a.j) hVar110.a());
            case 477:
                return Boolean.valueOf(h.a.a.b.a.a.f.l(this.f320a.f319a.sD()));
            case 478:
                cq cqVar = (cq) this.f320a.v.a();
                hVar111 = this.f320a.f;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b(cqVar, (Context) hVar111.a());
            case 479:
                return Boolean.valueOf(h.a.a.b.a.a.c.c.c(this.f320a.f319a.sm()));
            case 480:
                Executor executor2 = (Executor) this.f320a.H.a();
                hVar112 = this.f320a.v;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar112.a();
                jyVar40 = this.f320a.f319a;
                hVar113 = jyVar40.bP;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j(executor2, scheduledExecutorService, (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.c) hVar113.a());
            case 481:
                Context context6 = (Context) this.f320a.f.a();
                hVar114 = this.f320a.bo;
                ag agVar = (ag) hVar114.a();
                hVar115 = this.f320a.v;
                Executor executor3 = (Executor) hVar115.a();
                hVar116 = this.f320a.nr;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.o(context6, agVar, executor3, (com.google.apps.tiktok.g.p) hVar116.a());
            case 482:
                return Boolean.valueOf(h.a.a.b.a.a.c.c.b(this.f320a.f319a.sm()));
            case 483:
                return new com.google.android.libraries.assistant.auto.tng.j.c.c.a.a();
            case 484:
                return new com.google.android.libraries.assistant.auto.tng.j.c.d.a.h((com.google.android.libraries.assistant.auto.tng.j.c.d.a.d) this.f320a.f319a.pn());
            case 485:
                return Boolean.valueOf(h.a.a.b.a.a.f.k(this.f320a.f319a.sD()));
            case 486:
                Executor executor4 = (Executor) this.f320a.B.a();
                hVar117 = this.f320a.v;
                Executor executor5 = (Executor) hVar117.a();
                hVar118 = this.f320a.f;
                return new com.google.android.libraries.assistant.auto.tng.ui.d.a.a.c(executor4, executor5, (Context) hVar118.a(), this.f320a.hr());
            case 487:
                Executor executor6 = (Executor) this.f320a.H.a();
                hVar119 = this.f320a.Do;
                com.google.android.libraries.assistant.auto.jumpboost.b.g.a aVar8 = (com.google.android.libraries.assistant.auto.jumpboost.b.g.a) hVar119.a();
                jyVar41 = this.f320a.f319a;
                hVar120 = jyVar41.rm;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n(executor6, aVar8, hVar120);
            case 488:
                return Boolean.valueOf(h.a.a.b.a.a.c.c.d(new h.a.a.b.a.a.c.d(this.f320a.V)));
            case 489:
                PackageManager packageManager = (PackageManager) this.f320a.h.a();
                hVar121 = this.f320a.Y;
                return new com.google.android.libraries.assistant.auto.jumpboost.s.a(packageManager, (String) hVar121.a());
            case 490:
                return Boolean.valueOf(h.a.a.b.a.a.f.c(new h.a.a.b.a.a.r(this.f320a.V)));
            case 491:
                return Boolean.valueOf(h.a.a.b.a.a.f.b(new h.a.a.b.a.a.r(this.f320a.V)));
            case 492:
                return new com.google.android.libraries.assistant.auto.jumpboost.caractivity.a((byte[]) null);
            case 493:
                return Boolean.valueOf(h.a.a.b.a.a.f.e(new h.a.a.b.a.a.r(this.f320a.V)));
            case 494:
                return Boolean.valueOf(h.a.a.b.a.a.f.f(new h.a.a.b.a.a.r(this.f320a.V)));
            case 495:
                p pVar8 = (p) this.f320a.gq.a();
                hVar122 = this.f320a.f319a.cb;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.e.a(pVar8, c.b(hVar122));
            case 496:
                com.google.android.libraries.gsa.h.h hVar146 = (com.google.android.libraries.gsa.h.h) this.f320a.gv.a();
                hVar123 = this.f320a.hc;
                com.google.android.apps.gsa.staticplugins.nga.k.n nVar3 = (com.google.android.apps.gsa.staticplugins.nga.k.n) hVar123.a();
                hVar124 = this.f320a.gq;
                p pVar9 = (p) hVar124.a();
                jo joVar6 = this.f320a;
                com.google.android.apps.gsa.nga.shared.i.a.d bV = joVar6.bV();
                hVar125 = joVar6.gf;
                SharedPreferences sharedPreferences5 = (SharedPreferences) hVar125.a();
                hVar126 = this.f320a.iF;
                com.google.android.apps.gsa.nga.shared.q.a.x xVar2 = (com.google.android.apps.gsa.nga.shared.q.a.x) hVar126.a();
                jyVar42 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.nga.f.a.e.g ao = jyVar42.ao();
                hVar127 = this.f320a.og;
                jyVar43 = this.f320a.f319a;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.a.c(hVar146, nVar3, pVar9, bV, sharedPreferences5, xVar2, ao, jyVar43.an());
            case 497:
                Context context7 = (Context) this.f320a.f.a();
                e.a b12 = c.b(this.f320a.nk);
                hVar128 = this.f320a.gv;
                return new com.google.android.apps.gsa.assistant.shared.e.a.f(context7, b12, (com.google.android.libraries.gsa.h.h) hVar128.a());
            case 498:
                p pVar10 = (p) this.f320a.gq.a();
                hVar129 = this.f320a.f319a.cd;
                e.a b13 = c.b(hVar129);
                jyVar44 = this.f320a.f319a;
                hVar130 = jyVar44.cb;
                com.google.android.apps.gsa.staticplugins.nga.f.a.a.c cVar = (com.google.android.apps.gsa.staticplugins.nga.f.a.a.c) hVar130.a();
                hVar131 = this.f320a.iF;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.e.c(pVar10, b13, cVar, (com.google.android.apps.gsa.nga.shared.q.a.x) hVar131.a());
            case 499:
                Context context8 = (Context) this.f320a.f.a();
                hVar132 = this.f320a.f319a.rq;
                com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.r rVar = (com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.r) hVar132.a();
                jyVar45 = this.f320a.f319a;
                hVar133 = jyVar45.cb;
                com.google.android.apps.gsa.staticplugins.nga.f.a.a.c cVar2 = (com.google.android.apps.gsa.staticplugins.nga.f.a.a.c) hVar133.a();
                jyVar46 = this.f320a.f319a;
                hVar134 = jyVar46.rs;
                com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.r rVar2 = (com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.r) hVar134.a();
                hVar135 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar147 = (com.google.android.libraries.gsa.h.h) hVar135.a();
                jyVar47 = this.f320a.f319a;
                Set qu = jyVar47.qu();
                hVar136 = this.f320a.gm;
                jo joVar7 = this.f320a;
                com.google.android.apps.gsa.nga.shared.i.a.d bV2 = joVar7.bV();
                hVar137 = joVar7.iF;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.m(context8, rVar, cVar2, rVar2, hVar147, qu, bV2, (com.google.android.apps.gsa.nga.shared.q.a.x) hVar137.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        jy jyVar;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        jy jyVar2;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        jy jyVar3;
        h hVar12;
        h hVar13;
        h hVar14;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        h hVar19;
        h hVar20;
        jy jyVar4;
        h hVar21;
        h hVar22;
        h hVar23;
        jy jyVar5;
        h hVar24;
        h hVar25;
        h hVar26;
        h hVar27;
        jy jyVar6;
        h hVar28;
        h hVar29;
        h hVar30;
        h hVar31;
        jy jyVar7;
        h hVar32;
        h hVar33;
        h hVar34;
        jy jyVar8;
        h hVar35;
        jy jyVar9;
        h hVar36;
        jy jyVar10;
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
        jy jyVar11;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        h hVar66;
        h hVar67;
        jy jyVar12;
        h hVar68;
        jy jyVar13;
        h hVar69;
        h hVar70;
        jy jyVar14;
        h hVar71;
        h hVar72;
        h hVar73;
        jy jyVar15;
        h hVar74;
        h hVar75;
        h hVar76;
        h hVar77;
        jy jyVar16;
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
        jy jyVar17;
        h hVar90;
        h hVar91;
        jy jyVar18;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        h hVar96;
        h hVar97;
        jy jyVar19;
        h hVar98;
        h hVar99;
        jy jyVar20;
        h hVar100;
        h hVar101;
        h hVar102;
        jy jyVar21;
        h hVar103;
        h hVar104;
        h hVar105;
        h hVar106;
        h hVar107;
        h hVar108;
        jy jyVar22;
        jy jyVar23;
        h hVar109;
        jy jyVar24;
        h hVar110;
        jy jyVar25;
        h hVar111;
        jy jyVar26;
        h hVar112;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        jy jyVar27;
        jy jyVar28;
        jy jyVar29;
        h hVar117;
        h hVar118;
        jy jyVar30;
        h hVar119;
        jy jyVar31;
        h hVar120;
        jy jyVar32;
        h hVar121;
        jy jyVar33;
        h hVar122;
        jy jyVar34;
        h hVar123;
        jy jyVar35;
        h hVar124;
        h hVar125;
        h hVar126;
        jy jyVar36;
        jy jyVar37;
        jy jyVar38;
        jy jyVar39;
        jy jyVar40;
        h hVar127;
        jy jyVar41;
        h hVar128;
        jy jyVar42;
        h hVar129;
        h hVar130;
        h hVar131;
        h hVar132;
        jy jyVar43;
        jy jyVar44;
        jy jyVar45;
        h hVar133;
        jy jyVar46;
        h hVar134;
        jy jyVar47;
        h hVar135;
        h hVar136;
        jy jyVar48;
        h hVar137;
        jy jyVar49;
        h hVar138;
        jy jyVar50;
        h hVar139;
        h hVar140;
        h hVar141;
        h hVar142;
        jy jyVar51;
        h hVar143;
        jy jyVar52;
        h hVar144;
        h hVar145;
        jy jyVar53;
        h hVar146;
        jy jyVar54;
        h hVar147;
        jy jyVar55;
        h hVar148;
        jy jyVar56;
        h hVar149;
        h hVar150;
        jy jyVar57;
        jy jyVar58;
        jy jyVar59;
        jy jyVar60;
        jy jyVar61;
        h hVar151;
        jy jyVar62;
        h hVar152;
        h hVar153;
        h hVar154;
        h hVar155;
        h hVar156;
        jy jyVar63;
        h hVar157;
        jy jyVar64;
        h hVar158;
        jy jyVar65;
        h hVar159;
        h hVar160;
        h hVar161;
        h hVar162;
        h hVar163;
        jy jyVar66;
        h hVar164;
        h hVar165;
        h hVar166;
        h hVar167;
        jy jyVar67;
        h hVar168;
        h hVar169;
        jy jyVar68;
        h hVar170;
        h hVar171;
        h hVar172;
        jy jyVar69;
        h hVar173;
        jy jyVar70;
        h hVar174;
        h hVar175;
        h hVar176;
        jy jyVar71;
        h hVar177;
        h hVar178;
        h hVar179;
        h hVar180;
        jy jyVar72;
        h hVar181;
        jy jyVar73;
        h hVar182;
        jy jyVar74;
        h hVar183;
        h hVar184;
        jy jyVar75;
        h hVar185;
        h hVar186;
        jy jyVar76;
        h hVar187;
        h hVar188;
        h hVar189;
        jy jyVar77;
        h hVar190;
        h hVar191;
        h hVar192;
        jy jyVar78;
        h hVar193;
        h hVar194;
        h hVar195;
        h hVar196;
        h hVar197;
        h hVar198;
        h hVar199;
        jy jyVar79;
        h hVar200;
        h hVar201;
        jy jyVar80;
        h hVar202;
        jy jyVar81;
        jy jyVar82;
        h hVar203;
        h hVar204;
        h hVar205;
        jy jyVar83;
        h hVar206;
        jy jyVar84;
        h hVar207;
        jy jyVar85;
        h hVar208;
        jy jyVar86;
        jy jyVar87;
        jy jyVar88;
        h hVar209;
        jy jyVar89;
        h hVar210;
        jy jyVar90;
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
        jy jyVar91;
        h hVar224;
        jy jyVar92;
        h hVar225;
        h hVar226;
        h hVar227;
        h hVar228;
        jy jyVar93;
        h hVar229;
        h hVar230;
        jy jyVar94;
        h hVar231;
        jy jyVar95;
        h hVar232;
        jy jyVar96;
        h hVar233;
        jy jyVar97;
        h hVar234;
        jy jyVar98;
        jy jyVar99;
        h hVar235;
        jy jyVar100;
        jy jyVar101;
        jy jyVar102;
        h hVar236;
        h hVar237;
        jy jyVar103;
        jy jyVar104;
        jy jyVar105;
        h hVar238;
        jy jyVar106;
        h hVar239;
        jy jyVar107;
        h hVar240;
        jy jyVar108;
        h hVar241;
        h hVar242;
        jy jyVar109;
        h hVar243;
        jy jyVar110;
        h hVar244;
        h hVar245;
        jy jyVar111;
        h hVar246;
        jy jyVar112;
        jy jyVar113;
        h hVar247;
        jy jyVar114;
        h hVar248;
        jy jyVar115;
        h hVar249;
        jy jyVar116;
        jy jyVar117;
        jy jyVar118;
        jy jyVar119;
        h hVar250;
        jy jyVar120;
        h hVar251;
        h hVar252;
        jy jyVar121;
        h hVar253;
        h hVar254;
        jy jyVar122;
        h hVar255;
        jy jyVar123;
        h hVar256;
        h hVar257;
        jy jyVar124;
        h hVar258;
        jy jyVar125;
        jy jyVar126;
        jy jyVar127;
        h hVar259;
        h hVar260;
        jy jyVar128;
        h hVar261;
        h hVar262;
        h hVar263;
        jy jyVar129;
        jy jyVar130;
        h hVar264;
        jy jyVar131;
        jy jyVar132;
        h hVar265;
        jy jyVar133;
        h hVar266;
        h hVar267;
        jy jyVar134;
        h hVar268;
        h hVar269;
        jy jyVar135;
        h hVar270;
        jy jyVar136;
        h hVar271;
        h hVar272;
        jy jyVar137;
        h hVar273;
        jy jyVar138;
        jy jyVar139;
        jy jyVar140;
        h hVar274;
        h hVar275;
        jy jyVar141;
        h hVar276;
        jy jyVar142;
        h hVar277;
        jy jyVar143;
        h hVar278;
        jy jyVar144;
        jy jyVar145;
        jy jyVar146;
        h hVar279;
        h hVar280;
        jy jyVar147;
        h hVar281;
        jy jyVar148;
        h hVar282;
        h hVar283;
        jy jyVar149;
        h hVar284;
        jy jyVar150;
        h hVar285;
        jy jyVar151;
        h hVar286;
        jy jyVar152;
        h hVar287;
        jy jyVar153;
        jy jyVar154;
        jy jyVar155;
        h hVar288;
        jy jyVar156;
        h hVar289;
        jy jyVar157;
        h hVar290;
        jy jyVar158;
        int i = this.b;
        switch (i) {
            case 500:
                jyVar = this.f320a.f319a;
                hVar = jyVar.ro;
                cg cgVar = (cg) hVar.a();
                hVar2 = this.f320a.gp;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.r(cgVar, (com.google.android.libraries.gsa.h.h) hVar2.a());
            case 501:
                hVar3 = this.f320a.f;
                Context context = (Context) hVar3.a();
                hVar4 = this.f320a.aA;
                return com.google.android.apps.gsa.staticplugins.nga.f.a.c.b.a.b(context, (com.google.android.libraries.storage.protostore.af) hVar4.a());
            case 502:
                jyVar2 = this.f320a.f319a;
                hVar5 = jyVar2.cb;
                return new com.google.android.apps.gsa.staticplugins.nga.f.a.c.a.r((com.google.android.apps.gsa.staticplugins.nga.f.a.a.c) hVar5.a(), this.f320a.bW());
            case 503:
                hVar6 = this.f320a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar = (com.google.android.apps.gsa.opa.a.a.a) hVar6.a();
                hVar7 = this.f320a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar = (com.google.android.apps.gsa.opa.smartspace.d) hVar7.a();
                jo joVar = this.f320a;
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.v dJ = joVar.dJ();
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.a dI = joVar.dI();
                hVar8 = joVar.ls;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.z(aVar, dVar, dJ, dI, (com.google.android.apps.gsa.search.core.aa.a.c) hVar8.a());
            case 504:
                hVar9 = this.f320a.f;
                Context context2 = (Context) hVar9.a();
                hVar10 = this.f320a.nK;
                com.google.android.apps.gsa.opa.a.a.a aVar2 = (com.google.android.apps.gsa.opa.a.a.a) hVar10.a();
                hVar11 = this.f320a.oj;
                com.google.android.apps.gsa.opa.smartspace.d dVar2 = (com.google.android.apps.gsa.opa.smartspace.d) hVar11.a();
                jyVar3 = this.f320a.f319a;
                com.google.android.apps.gsa.staticplugins.opa.smartspace.b.u aI = jyVar3.aI();
                hVar12 = this.f320a.W;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.b.a.c(context2, aVar2, dVar2, aI, (com.google.android.libraries.search.t.i.y) hVar12.a());
            case 505:
                hVar13 = this.f320a.TO;
                com.google.android.apps.gsa.opa.smartspace.e.a aVar3 = (com.google.android.apps.gsa.opa.smartspace.e.a) hVar13.a();
                hVar14 = this.f320a.TT;
                hVar15 = this.f320a.gz;
                com.google.android.libraries.gsa.h.h hVar291 = (com.google.android.libraries.gsa.h.h) hVar15.a();
                hVar16 = this.f320a.oK;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.h(aVar3, hVar291, (com.google.android.apps.gsa.shared.g.h) hVar16.a());
            case 506:
                hVar17 = this.f320a.Uw;
                com.google.android.apps.gsa.smartspace.b.y yVar = (com.google.android.apps.gsa.smartspace.b.y) hVar17.a();
                hVar18 = this.f320a.oI;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.u(yVar, (com.google.android.apps.gsa.smartspace.l) hVar18.a());
            case 507:
                hVar19 = this.f320a.oj;
                return new ar((com.google.android.apps.gsa.opa.smartspace.d) hVar19.a());
            case 508:
                hVar20 = this.f320a.gq;
                p pVar = (p) hVar20.a();
                jyVar4 = this.f320a.f319a;
                boolean qM = jyVar4.qM();
                hVar21 = this.f320a.oi;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.d.a.a(pVar, qM, (com.google.android.apps.gsa.opa.smartspace.c) hVar21.a());
            case 509:
                hVar22 = this.f320a.f;
                return new com.google.android.apps.gsa.staticplugins.opa.util.calendar.p((Context) hVar22.a());
            case 510:
                hVar23 = this.f320a.f;
                return new com.google.android.apps.gsa.staticplugins.opa.util.calendar.j((Context) hVar23.a());
            case 511:
                jyVar5 = this.f320a.f319a;
                hVar24 = jyVar5.ck;
                Optional of = Optional.of(c.b(hVar24));
                hVar25 = this.f320a.gq;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.g.b(of, (p) hVar25.a());
            case 512:
                hVar26 = this.f320a.f;
                Context context3 = (Context) hVar26.a();
                hVar27 = this.f320a.gq;
                p pVar2 = (p) hVar27.a();
                jyVar6 = this.f320a.f319a;
                hVar28 = jyVar6.rD;
                com.google.android.apps.gsa.assistant.shared.j.b.c cVar = (com.google.android.apps.gsa.assistant.shared.j.b.c) hVar28.a();
                hVar29 = this.f320a.hG;
                com.google.android.apps.gsa.shared.logger.b.h hVar292 = (com.google.android.apps.gsa.shared.logger.b.h) hVar29.a();
                hVar30 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar293 = (com.google.android.libraries.gsa.h.h) hVar30.a();
                hVar31 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar294 = (com.google.android.libraries.gsa.h.h) hVar31.a();
                jyVar7 = this.f320a.f319a;
                hVar32 = jyVar7.rn;
                com.google.android.apps.gsa.assistant.shared.e.a.f fVar = (com.google.android.apps.gsa.assistant.shared.e.a.f) hVar32.a();
                hVar33 = this.f320a.ez;
                return new com.google.android.apps.gsa.assistant.shared.j.d.t(context3, pVar2, cVar, hVar292, hVar293, hVar294, fVar, (com.google.common.v.f) hVar33.a());
            case 513:
                hVar34 = this.f320a.gR;
                Optional of2 = Optional.of((bg) hVar34.a());
                jyVar8 = this.f320a.f319a;
                hVar35 = jyVar8.rA;
                Optional of3 = Optional.of((com.google.android.apps.gsa.nga.shared.f.a.ab) hVar35.a());
                jyVar9 = this.f320a.f319a;
                hVar36 = jyVar9.rB;
                jyVar10 = this.f320a.f319a;
                hVar37 = jyVar10.rC;
                return com.google.android.apps.gsa.assistant.shared.j.c.a.b(of2, of3, hVar36, hVar37);
            case 514:
                hVar38 = this.f320a.hf;
                return new com.google.android.apps.gsa.nga.shared.f.a.ab((cg) hVar38.a());
            case 515:
                hVar39 = this.f320a.f;
                Context context4 = (Context) hVar39.a();
                hVar40 = this.f320a.jR;
                com.google.android.apps.gsa.assistant.shared.j.o oVar = (com.google.android.apps.gsa.assistant.shared.j.o) hVar40.a();
                hVar41 = this.f320a.jP;
                com.google.android.apps.gsa.assistant.shared.d.i iVar = (com.google.android.apps.gsa.assistant.shared.d.i) hVar41.a();
                hVar42 = this.f320a.gq;
                p pVar3 = (p) hVar42.a();
                hVar43 = this.f320a.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar43.a();
                hVar44 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar295 = (com.google.android.libraries.gsa.h.h) hVar44.a();
                hVar45 = this.f320a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar4 = (com.google.android.apps.gsa.search.core.y.a.a) hVar45.a();
                hVar46 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar296 = (com.google.android.libraries.gsa.h.h) hVar46.a();
                hVar47 = this.f320a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar47.a();
                hVar48 = this.f320a.hG;
                com.google.android.apps.gsa.shared.logger.b.h hVar297 = (com.google.android.apps.gsa.shared.logger.b.h) hVar48.a();
                hVar49 = this.f320a.jT;
                return new com.google.android.apps.gsa.assistant.shared.j.b.c(context4, oVar, iVar, pVar3, fVar2, hVar295, aVar4, hVar296, aVar5, hVar297, (com.google.android.apps.gsa.nga.shared.f.a.m) hVar49.a(), (byte[]) null);
            case 516:
                hVar50 = this.f320a.f;
                Context context5 = (Context) hVar50.a();
                hVar51 = this.f320a.jR;
                com.google.android.apps.gsa.assistant.shared.j.o oVar2 = (com.google.android.apps.gsa.assistant.shared.j.o) hVar51.a();
                hVar52 = this.f320a.jP;
                com.google.android.apps.gsa.assistant.shared.d.i iVar2 = (com.google.android.apps.gsa.assistant.shared.d.i) hVar52.a();
                hVar53 = this.f320a.gq;
                p pVar4 = (p) hVar53.a();
                hVar54 = this.f320a.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar54.a();
                hVar55 = this.f320a.gv;
                com.google.android.libraries.gsa.h.h hVar298 = (com.google.android.libraries.gsa.h.h) hVar55.a();
                hVar56 = this.f320a.nz;
                com.google.android.apps.gsa.search.core.y.a.a aVar6 = (com.google.android.apps.gsa.search.core.y.a.a) hVar56.a();
                hVar57 = this.f320a.gp;
                com.google.android.libraries.gsa.h.h hVar299 = (com.google.android.libraries.gsa.h.h) hVar57.a();
                hVar58 = this.f320a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar58.a();
                hVar59 = this.f320a.hG;
                com.google.android.apps.gsa.shared.logger.b.h hVar300 = (com.google.android.apps.gsa.shared.logger.b.h) hVar59.a();
                jyVar11 = this.f320a.f319a;
                hVar60 = jyVar11.rA;
                Optional of4 = Optional.of(c.b(hVar60));
                hVar61 = this.f320a.qA;
                e.a b = c.b(hVar61);
                hVar62 = this.f320a.jT;
                return new com.google.android.apps.gsa.assistant.shared.j.b.aa(context5, oVar2, iVar2, pVar4, fVar3, hVar298, aVar6, hVar299, aVar7, hVar300, of4, b, (com.google.android.apps.gsa.nga.shared.f.a.m) hVar62.a());
            case 517:
                hVar63 = this.f320a.qF;
                return new com.google.android.apps.gsa.staticplugins.opa.worker.g.g((com.google.android.apps.gsa.staticplugins.opa.util.h) hVar63.a());
            case 518:
                hVar64 = this.f320a.uM;
                com.google.android.apps.search.assistant.platform.pcp.api.r rVar = (com.google.android.apps.search.assistant.platform.pcp.api.r) hVar64.a();
                hVar65 = this.f320a.f;
                Context context6 = (Context) hVar65.a();
                hVar66 = this.f320a.bN;
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) hVar66.a();
                hVar67 = this.f320a.v;
                Executor executor = (Executor) hVar67.a();
                jyVar12 = this.f320a.f319a;
                return new com.google.android.apps.search.assistant.platform.pcp.crossprofile.e(rVar, context6, bVar, executor, jyVar12.bd());
            case 519:
                hVar68 = this.f320a.f;
                Context context7 = (Context) hVar68.a();
                jyVar13 = this.f320a.f319a;
                hVar69 = jyVar13.rF;
                de deVar = (de) hVar69.a();
                hVar70 = this.f320a.bo;
                ag agVar = (ag) hVar70.a();
                jyVar14 = this.f320a.f319a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.g.b(context7, deVar, agVar, jyVar14.l());
            case 520:
                hVar71 = this.f320a.f;
                Context context8 = (Context) hVar71.a();
                hVar72 = this.f320a.bN;
                com.google.apps.tiktok.account.data.b bVar2 = (com.google.apps.tiktok.account.data.b) hVar72.a();
                hVar73 = this.f320a.in;
                com.google.android.libraries.search.assistant.proactive.h.c cVar2 = (com.google.android.libraries.search.assistant.proactive.h.c) hVar73.a();
                jyVar15 = this.f320a.f319a;
                hVar74 = jyVar15.bK;
                com.google.android.libraries.search.assistant.b.a aVar8 = (com.google.android.libraries.search.assistant.b.a) hVar74.a();
                hVar75 = this.f320a.H;
                return new com.google.android.apps.search.assistant.surfaces.notification.f(context8, bVar2, cVar2, aVar8, (Executor) hVar75.a());
            case 521:
                hVar76 = this.f320a.f;
                Context context9 = (Context) hVar76.a();
                hVar77 = this.f320a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar77.a();
                jyVar16 = this.f320a.f319a;
                hVar78 = jyVar16.co;
                cg cgVar2 = (cg) hVar78.a();
                hVar79 = this.f320a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.contextawareness.m(context9, aVar9, cgVar2, (ag) hVar79.a());
            case 522:
                jo joVar2 = this.f320a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.assistant.surfaces.voice.contextawareness.s.c();
                com.google.apps.tiktok.q.b.a.b nc = joVar2.nc();
                hVar80 = joVar2.w;
                return com.google.android.apps.search.assistant.surfaces.voice.contextawareness.s.b(c, nc, (com.google.android.libraries.storage.a.j) hVar80.a());
            case 523:
                hVar81 = this.f320a.bo;
                ag agVar2 = (ag) hVar81.a();
                hVar82 = this.f320a.f;
                Context context10 = (Context) hVar82.a();
                hVar83 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar5 = (com.google.apps.tiktok.contrib.work.b.p) hVar83.a();
                hVar84 = this.f320a.ez;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.f.c(agVar2, context10, pVar5, Optional.of((com.google.common.v.f) hVar84.a()));
            case 524:
                jo joVar3 = this.f320a;
                com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar3.fZ();
                hVar85 = joVar3.v;
                Executor executor2 = (Executor) hVar85.a();
                hVar86 = this.f320a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar10 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar86.a();
                hVar87 = this.f320a.f;
                Context context11 = (Context) hVar87.a();
                hVar88 = this.f320a.gd;
                return new com.google.android.apps.search.assistant.verticals.ambient.n.p(fZ, executor2, aVar10, context11, (com.google.android.libraries.search.account.b.b) hVar88.a(), this.f320a.acW());
            case 525:
                hVar89 = this.f320a.f;
                Context context12 = (Context) hVar89.a();
                jyVar17 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.ambient.smartspace.f.c cs = jyVar17.cs();
                hVar90 = this.f320a.H;
                ExecutorService executorService = (ExecutorService) hVar90.a();
                hVar91 = this.f320a.nM;
                return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.oobe.e(context12, cs, executorService, (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar91.a());
            case 526:
                jyVar18 = this.f320a.f319a;
                com.google.apps.tiktok.q.b.h eI = jyVar18.eI();
                jo joVar4 = this.f320a;
                com.google.apps.tiktok.q.b.k nb = joVar4.nb();
                hVar92 = joVar4.w;
                return com.google.android.apps.search.assistant.verticals.ambient.smartspace.f.b.b(eI, nb, (com.google.android.libraries.storage.a.j) hVar92.a());
            case 527:
                jo joVar5 = this.f320a;
                com.google.apps.tiktok.q.b.h b2 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.c.b.b();
                com.google.apps.tiktok.q.b.k nb2 = joVar5.nb();
                hVar93 = joVar5.w;
                return com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.c.b.c(b2, nb2, (com.google.android.libraries.storage.a.j) hVar93.a());
            case 528:
                hVar94 = this.f320a.bN;
                com.google.apps.tiktok.account.data.b bVar3 = (com.google.apps.tiktok.account.data.b) hVar94.a();
                hVar95 = this.f320a.Q;
                ag agVar3 = (ag) hVar95.a();
                hVar96 = this.f320a.f;
                Context context13 = (Context) hVar96.a();
                hVar97 = this.f320a.R;
                m.c.n nVar = (m.c.n) hVar97.a();
                jyVar19 = this.f320a.f319a;
                hVar98 = jyVar19.bK;
                com.google.android.libraries.search.assistant.b.a aVar11 = (com.google.android.libraries.search.assistant.b.a) hVar98.a();
                hVar99 = this.f320a.nM;
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar12 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) hVar99.a();
                jyVar20 = this.f320a.f319a;
                return new com.google.android.apps.search.assistant.verticals.ambient.u.v.s(bVar3, agVar3, context13, nVar, aVar11, aVar12, jyVar20.cw());
            case 529:
                jo joVar6 = this.f320a;
                com.google.apps.tiktok.q.b.h g = com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.g();
                com.google.apps.tiktok.q.b.k nb3 = joVar6.nb();
                hVar100 = joVar6.w;
                return com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.b(g, nb3, (com.google.android.libraries.storage.a.j) hVar100.a());
            case 530:
                hVar101 = this.f320a.f;
                Context context14 = (Context) hVar101.a();
                hVar102 = this.f320a.v;
                cr crVar = (cr) hVar102.a();
                jyVar21 = this.f320a.f319a;
                com.google.frameworks.client.data.android.l eN = jyVar21.eN();
                hVar103 = this.f320a.wH;
                return new com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.common.image.r(context14, crVar, eN, (com.google.android.libraries.search.trust.c.t) hVar103.a());
            case 531:
                jo joVar7 = this.f320a;
                com.google.apps.tiktok.q.b.h i2 = com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.i();
                com.google.apps.tiktok.q.b.k nb4 = joVar7.nb();
                hVar104 = joVar7.w;
                return com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.e(i2, nb4, (com.google.android.libraries.storage.a.j) hVar104.a());
            case 532:
                hVar105 = this.f320a.f;
                Context context15 = (Context) hVar105.a();
                hVar106 = this.f320a.nr;
                com.google.apps.tiktok.g.p pVar6 = (com.google.apps.tiktok.g.p) hVar106.a();
                hVar107 = this.f320a.H;
                Executor executor3 = (Executor) hVar107.a();
                hVar108 = this.f320a.ez;
                com.google.common.v.f fVar4 = (com.google.common.v.f) hVar108.a();
                jyVar22 = this.f320a.f319a;
                return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.k(context15, pVar6, executor3, fVar4, jyVar22.c());
            case 533:
                jyVar23 = this.f320a.f319a;
                hVar109 = jyVar23.rL;
                jyVar24 = this.f320a.f319a;
                hVar110 = jyVar24.rQ;
                e.a b3 = c.b(hVar110);
                jyVar25 = this.f320a.f319a;
                hVar111 = jyVar25.rY;
                return com.google.android.apps.search.assistant.verticals.newsplayer.e.a.b(hVar109, b3, c.b(hVar111));
            case 534:
                jyVar26 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.g(jyVar26.sr()));
            case 535:
                hVar112 = this.f320a.f;
                Context context16 = (Context) hVar112.a();
                hVar113 = this.f320a.H;
                Executor executor4 = (Executor) hVar113.a();
                hVar114 = this.f320a.B;
                cq cqVar = (cq) hVar114.a();
                hVar115 = this.f320a.B;
                cr crVar2 = (cr) hVar115.a();
                hVar116 = this.f320a.bK;
                dj djVar = (dj) hVar116.a();
                jyVar27 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.f.d cD = jyVar27.cD();
                jyVar28 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.i.b cF = jyVar28.cF();
                jyVar29 = this.f320a.f319a;
                hVar117 = jyVar29.cy;
                com.google.android.apps.search.assistant.verticals.newsplayer.media.j jVar = (com.google.android.apps.search.assistant.verticals.newsplayer.media.j) hVar117.a();
                hVar118 = this.f320a.g;
                com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) hVar118.a();
                jyVar30 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.h.as cE = jyVar30.cE();
                hVar119 = this.f320a.nn;
                KeyguardManager keyguardManager = (KeyguardManager) hVar119.a();
                jyVar31 = this.f320a.f319a;
                hVar120 = jyVar31.rO;
                jyVar32 = this.f320a.f319a;
                hVar121 = jyVar32.rP;
                jyVar33 = this.f320a.f319a;
                hVar122 = jyVar33.cz;
                return new com.google.android.apps.search.assistant.verticals.newsplayer.h.ap(context16, executor4, cqVar, crVar2, djVar, cD, cF, jVar, aVar13, cE, keyguardManager, hVar120, hVar121, hVar122);
            case 536:
                jyVar34 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.f(jyVar34.sr()));
            case 537:
                hVar123 = this.f320a.f;
                Context context17 = (Context) hVar123.a();
                jyVar35 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.media.h cC = jyVar35.cC();
                hVar124 = this.f320a.ne;
                com.google.apps.tiktok.media.j jVar2 = (com.google.apps.tiktok.media.j) hVar124.a();
                hVar125 = this.f320a.bz;
                return new com.google.android.apps.search.assistant.verticals.newsplayer.media.j(context17, cC, jVar2, (com.google.apps.tiktok.concurrent.ao) hVar125.a());
            case 538:
                jo joVar8 = this.f320a;
                com.google.apps.tiktok.q.b.h d = com.google.android.apps.search.assistant.verticals.newsplayer.h.y.d();
                com.google.apps.tiktok.q.b.k nb5 = joVar8.nb();
                hVar126 = joVar8.w;
                return com.google.android.apps.search.assistant.verticals.newsplayer.h.y.e(d, nb5, (com.google.android.libraries.storage.a.j) hVar126.a());
            case 539:
                jyVar36 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.e(jyVar36.sr()));
            case 540:
                jyVar37 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.k(jyVar37.sr()));
            case 541:
                jyVar38 = this.f320a.f319a;
                return h.a.a.f.a.a.h.j(jyVar38.sr());
            case 542:
                jyVar39 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.l(jyVar39.sr()));
            case 543:
                jyVar40 = this.f320a.f319a;
                hVar127 = jyVar40.rR;
                Object a2 = hVar127.a();
                jyVar41 = this.f320a.f319a;
                hVar128 = jyVar41.rV;
                Object a3 = hVar128.a();
                jyVar42 = this.f320a.f319a;
                hVar129 = jyVar42.rX;
                Object a4 = hVar129.a();
                hVar130 = this.f320a.f;
                Context context18 = (Context) hVar130.a();
                hVar131 = this.f320a.H;
                Executor executor5 = (Executor) hVar131.a();
                hVar132 = this.f320a.B;
                cq cqVar2 = (cq) hVar132.a();
                jyVar43 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.f.d cD2 = jyVar43.cD();
                jyVar44 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.i.b cF2 = jyVar44.cF();
                jyVar45 = this.f320a.f319a;
                hVar133 = jyVar45.cy;
                com.google.android.apps.search.assistant.verticals.newsplayer.media.j jVar3 = (com.google.android.apps.search.assistant.verticals.newsplayer.media.j) hVar133.a();
                jyVar46 = this.f320a.f319a;
                hVar134 = jyVar46.rS;
                com.google.android.apps.search.assistant.verticals.newsplayer.h.aa aaVar = (com.google.android.apps.search.assistant.verticals.newsplayer.h.aa) hVar134.a();
                jyVar47 = this.f320a.f319a;
                com.google.android.apps.search.assistant.verticals.newsplayer.h.as cE2 = jyVar47.cE();
                hVar135 = this.f320a.nn;
                KeyguardManager keyguardManager2 = (KeyguardManager) hVar135.a();
                hVar136 = this.f320a.bK;
                dj djVar2 = (dj) hVar136.a();
                jyVar48 = this.f320a.f319a;
                hVar137 = jyVar48.rO;
                jyVar49 = this.f320a.f319a;
                hVar138 = jyVar49.cz;
                return com.google.android.apps.search.assistant.verticals.newsplayer.h.y.f(a2, a3, a4, context18, executor5, cqVar2, cD2, cF2, jVar3, aaVar, cE2, keyguardManager2, djVar2, hVar137, hVar138);
            case 544:
                return new ay();
            case 545:
                jyVar50 = this.f320a.f319a;
                hVar139 = jyVar50.rR;
                Object a5 = hVar139.a();
                hVar140 = this.f320a.f;
                Context context19 = (Context) hVar140.a();
                hVar141 = this.f320a.B;
                cq cqVar3 = (cq) hVar141.a();
                hVar142 = this.f320a.B;
                cr crVar3 = (cr) hVar142.a();
                jyVar51 = this.f320a.f319a;
                hVar143 = jyVar51.cy;
                com.google.android.apps.search.assistant.verticals.newsplayer.media.j jVar4 = (com.google.android.apps.search.assistant.verticals.newsplayer.media.j) hVar143.a();
                jyVar52 = this.f320a.f319a;
                hVar144 = jyVar52.rS;
                com.google.android.apps.search.assistant.verticals.newsplayer.h.aa aaVar2 = (com.google.android.apps.search.assistant.verticals.newsplayer.h.aa) hVar144.a();
                hVar145 = this.f320a.g;
                com.google.android.libraries.g.a aVar14 = (com.google.android.libraries.g.a) hVar145.a();
                jyVar53 = this.f320a.f319a;
                hVar146 = jyVar53.cA;
                jyVar54 = this.f320a.f319a;
                hVar147 = jyVar54.rT;
                jyVar55 = this.f320a.f319a;
                hVar148 = jyVar55.rU;
                jyVar56 = this.f320a.f319a;
                hVar149 = jyVar56.cB;
                return com.google.android.apps.search.assistant.verticals.newsplayer.h.y.b(a5, context19, cqVar3, crVar3, jVar4, aaVar2, aVar14, hVar146, hVar147, hVar148, hVar149);
            case 546:
                hVar150 = this.f320a.f;
                return new com.google.android.apps.search.assistant.verticals.newsplayer.h.aa((Context) hVar150.a());
            case 547:
                jyVar57 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.c(jyVar57.sr()));
            case 548:
                jyVar58 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.m(jyVar58.sr()));
            case 549:
                jyVar59 = this.f320a.f319a;
                return Long.valueOf(h.a.a.f.a.a.h.h(jyVar59.sr()));
            case 550:
                jyVar60 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.d(jyVar60.sr()));
            case 551:
                jyVar61 = this.f320a.f319a;
                hVar151 = jyVar61.rR;
                Object a6 = hVar151.a();
                jyVar62 = this.f320a.f319a;
                hVar152 = jyVar62.rV;
                Object a7 = hVar152.a();
                hVar153 = this.f320a.f;
                Context context20 = (Context) hVar153.a();
                hVar154 = this.f320a.H;
                Executor executor6 = (Executor) hVar154.a();
                hVar155 = this.f320a.B;
                cq cqVar4 = (cq) hVar155.a();
                hVar156 = this.f320a.bK;
                dj djVar3 = (dj) hVar156.a();
                jyVar63 = this.f320a.f319a;
                hVar157 = jyVar63.rP;
                jyVar64 = this.f320a.f319a;
                hVar158 = jyVar64.rW;
                return com.google.android.apps.search.assistant.verticals.newsplayer.h.y.c(a6, a7, context20, executor6, cqVar4, djVar3, hVar157, hVar158);
            case 552:
                jyVar65 = this.f320a.f319a;
                return Boolean.valueOf(h.a.a.f.a.a.h.i(jyVar65.sr()));
            case 553:
                hVar159 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar7 = (com.google.apps.tiktok.contrib.work.b.p) hVar159.a();
                hVar160 = this.f320a.H;
                return new com.google.android.apps.search.assistant.verticals.reminders.e.f(pVar7, (Executor) hVar160.a());
            case 554:
                hVar161 = this.f320a.f;
                Context context21 = (Context) hVar161.a();
                hVar162 = this.f320a.bo;
                ag agVar4 = (ag) hVar162.a();
                jo joVar9 = this.f320a;
                com.google.android.libraries.search.account.b.b jy = joVar9.jy();
                hVar163 = joVar9.bN;
                com.google.apps.tiktok.account.data.b bVar4 = (com.google.apps.tiktok.account.data.b) hVar163.a();
                jyVar66 = this.f320a.f319a;
                ao eR = jyVar66.eR();
                hVar164 = this.f320a.W;
                com.google.android.libraries.search.t.i.y yVar2 = (com.google.android.libraries.search.t.i.y) hVar164.a();
                hVar165 = this.f320a.gK;
                return new com.google.android.apps.search.googleapp.notifications.accountsettings.g(context21, agVar4, jy, bVar4, eR, yVar2, (com.google.apps.tiktok.contrib.work.b.p) hVar165.a());
            case 555:
                return new com.google.android.apps.search.googleapp.search.suggest.sources.icing.d(new com.google.android.libraries.search.ac.b.c.f());
            case 556:
                hVar166 = this.f320a.f;
                return com.google.android.apps.search.googleapp.n.a.c((Context) hVar166.a());
            case 557:
                return com.google.android.apps.search.googleapp.n.a.b();
            case 558:
                hVar167 = this.f320a.H;
                Executor executor7 = (Executor) hVar167.a();
                jyVar67 = this.f320a.f319a;
                hVar168 = jyVar67.cJ;
                com.google.android.apps.search.podcasts.autodownload.a aVar15 = (com.google.android.apps.search.podcasts.autodownload.a) hVar168.a();
                hVar169 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar8 = (com.google.apps.tiktok.contrib.work.b.p) hVar169.a();
                jyVar68 = this.f320a.f319a;
                hVar170 = jyVar68.cI;
                com.google.android.apps.search.podcasts.l.f fVar5 = (com.google.android.apps.search.podcasts.l.f) hVar170.a();
                hVar171 = this.f320a.f;
                return new com.google.android.apps.search.podcasts.autodownload.j(executor7, aVar15, pVar8, fVar5, (Context) hVar171.a());
            case 559:
                hVar172 = this.f320a.f;
                Context context22 = (Context) hVar172.a();
                jyVar69 = this.f320a.f319a;
                hVar173 = jyVar69.cI;
                return new com.google.android.apps.search.podcasts.autodownload.a(context22, (com.google.android.apps.search.podcasts.l.f) hVar173.a());
            case 560:
                jyVar70 = this.f320a.f319a;
                hVar174 = jyVar70.rZ;
                cg cgVar3 = (cg) hVar174.a();
                jo joVar10 = this.f320a;
                com.google.apps.tiktok.account.d.h mt = joVar10.mt();
                hVar175 = joVar10.bI;
                com.google.apps.tiktok.account.data.c.c cVar3 = (com.google.apps.tiktok.account.data.c.c) hVar175.a();
                hVar176 = this.f320a.H;
                Executor executor8 = (Executor) hVar176.a();
                jyVar71 = this.f320a.f319a;
                return new com.google.android.apps.search.podcasts.l.f(cgVar3, mt, cVar3, executor8, jyVar71.qP());
            case 561:
                jo joVar11 = this.f320a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.podcasts.l.t.c();
                com.google.apps.tiktok.q.b.k nb6 = joVar11.nb();
                hVar177 = joVar11.w;
                return com.google.android.apps.search.podcasts.l.t.b(c2, nb6, (com.google.android.libraries.storage.a.j) hVar177.a());
            case 562:
                jo joVar12 = this.f320a;
                hVar178 = joVar12.f;
                hVar179 = joVar12.n;
                hVar180 = joVar12.H;
                jyVar72 = joVar12.f319a;
                hVar181 = jyVar72.sb;
                jyVar73 = this.f320a.f319a;
                hVar182 = jyVar73.sc;
                jyVar74 = this.f320a.f319a;
                hVar183 = jyVar74.se;
                jo joVar13 = this.f320a;
                hVar184 = joVar13.bN;
                jyVar75 = joVar13.f319a;
                hVar185 = jyVar75.sd;
                return new com.google.android.apps.search.soundsearch.h.h(hVar178, hVar179, hVar180, hVar181, hVar182, hVar183, hVar184, hVar185);
            case 563:
                jo joVar14 = this.f320a;
                hVar186 = joVar14.mf;
                jyVar76 = joVar14.f319a;
                hVar187 = jyVar76.sa;
                com.google.apps.tiktok.p.m mVar = (com.google.apps.tiktok.p.m) hVar187.a();
                hVar188 = this.f320a.mh;
                com.google.apps.tiktok.p.u uVar = (com.google.apps.tiktok.p.u) hVar188.a();
                hVar189 = this.f320a.mb;
                return com.google.android.apps.search.soundsearch.j.b.c.b(hVar186, mVar, uVar, (com.google.frameworks.client.data.android.d) hVar189.a(), at.i());
            case 564:
                jyVar77 = this.f320a.f319a;
                return com.google.android.apps.search.soundsearch.j.b.c.d(jyVar77.ps());
            case 565:
                hVar190 = this.f320a.n;
                cq cqVar5 = (cq) hVar190.a();
                hVar191 = this.f320a.H;
                cq cqVar6 = (cq) hVar191.a();
                hVar192 = this.f320a.bx;
                com.google.android.gms.auth.k kVar = (com.google.android.gms.auth.k) hVar192.a();
                jyVar78 = this.f320a.f319a;
                com.google.apps.tiktok.p.d eH = jyVar78.eH();
                hVar193 = this.f320a.bq;
                com.google.apps.tiktok.account.data.a.d dVar3 = (com.google.apps.tiktok.account.data.a.d) hVar193.a();
                hVar194 = this.f320a.g;
                return new com.google.apps.tiktok.p.i(cqVar5, cqVar6, kVar, eH, dVar3, (com.google.android.libraries.g.a) hVar194.a());
            case 566:
                return com.google.android.apps.search.soundsearch.j.b.c.c();
            case 567:
                hVar195 = this.f320a.fC;
                return com.google.android.libraries.search.d.y.c.b(hVar195);
            case 568:
                hVar196 = this.f320a.bM;
                com.google.android.libraries.search.account.k kVar2 = (com.google.android.libraries.search.account.k) hVar196.a();
                hVar197 = this.f320a.f;
                return new com.google.android.apps.search.widgets.stocks.a.x(kVar2, (Context) hVar197.a());
            case 569:
                jo joVar15 = this.f320a;
                com.google.apps.tiktok.q.b.h b4 = com.google.android.libraries.search.aq.c.h.b();
                com.google.apps.tiktok.q.b.k nb7 = joVar15.nb();
                hVar198 = joVar15.w;
                return com.google.android.libraries.search.aq.c.h.c(b4, nb7, (com.google.android.libraries.storage.a.j) hVar198.a());
            case 570:
                hVar199 = this.f320a.bM;
                com.google.android.libraries.search.account.k kVar3 = (com.google.android.libraries.search.account.k) hVar199.a();
                jyVar79 = this.f320a.f319a;
                com.google.android.apps.search.widgets.weather.b.w cN = jyVar79.cN();
                hVar200 = this.f320a.f;
                return new com.google.android.apps.search.widgets.weather.b.j(kVar3, cN, (Context) hVar200.a());
            case 571:
                hVar201 = this.f320a.f;
                Context context23 = (Context) hVar201.a();
                jyVar80 = this.f320a.f319a;
                hVar202 = jyVar80.sg;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.d dVar4 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.d) hVar202.a();
                jyVar81 = this.f320a.f319a;
                com.google.android.libraries.search.b.f dA = jyVar81.dA();
                jyVar82 = this.f320a.f319a;
                hVar203 = jyVar82.bN;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b bVar5 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b) hVar203.a();
                hVar204 = this.f320a.v;
                Executor executor9 = (Executor) hVar204.a();
                hVar205 = this.f320a.H;
                Executor executor10 = (Executor) hVar205.a();
                jyVar83 = this.f320a.f319a;
                hVar206 = jyVar83.bO;
                jyVar84 = this.f320a.f319a;
                hVar207 = jyVar84.rj;
                jyVar85 = this.f320a.f319a;
                hVar208 = jyVar85.bQ;
                e.a b5 = c.b(hVar208);
                jyVar86 = this.f320a.f319a;
                Optional of5 = Optional.of(jyVar86.pp());
                jyVar87 = this.f320a.f319a;
                Optional pa = jyVar87.pa();
                jyVar88 = this.f320a.f319a;
                hVar209 = jyVar88.bT;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n nVar2 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n) hVar209.a();
                jo joVar16 = this.f320a;
                com.google.android.libraries.assistant.auto.jumpboost.i.b hr = joVar16.hr();
                jyVar89 = joVar16.f319a;
                hVar210 = jyVar89.bV;
                jyVar90 = this.f320a.f319a;
                hVar211 = jyVar90.bW;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.s(context23, dVar4, dA, bVar5, executor9, executor10, hVar206, hVar207, b5, of5, pa, nVar2, hr, hVar210, hVar211);
            case 572:
                hVar212 = this.f320a.f;
                Context context24 = (Context) hVar212.a();
                hVar213 = this.f320a.W;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.d(context24, (com.google.android.libraries.search.t.i.y) hVar213.a());
            case 573:
                return Boolean.valueOf(h.a.a.b.a.a.f.d(this.f320a.UZ()));
            case 574:
                return Boolean.valueOf(h.a.a.b.a.a.f.g(this.f320a.UZ()));
            case 575:
                return new com.google.android.libraries.assistant.auto.jumpboost.caractivity.a();
            case 576:
                hVar214 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar9 = (com.google.apps.tiktok.contrib.work.b.p) hVar214.a();
                hVar215 = this.f320a.H;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.f.a(pVar9, (Executor) hVar215.a());
            case 577:
                hVar216 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar10 = (com.google.apps.tiktok.contrib.work.b.p) hVar216.a();
                hVar217 = this.f320a.H;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.f.c(pVar10, (Executor) hVar217.a());
            case 578:
                hVar218 = this.f320a.f;
                Context context25 = (Context) hVar218.a();
                hVar219 = this.f320a.um;
                MediaSessionManager mediaSessionManager = (MediaSessionManager) hVar219.a();
                hVar220 = this.f320a.bz;
                return new com.google.android.libraries.assistant.contexttrigger.j.c(context25, mediaSessionManager, (com.google.apps.tiktok.concurrent.ao) hVar220.a());
            case 579:
                jo joVar17 = this.f320a;
                com.google.apps.tiktok.q.b.h b6 = com.google.android.libraries.assistant.contexttrigger.l.s.b();
                com.google.apps.tiktok.q.b.k nb8 = joVar17.nb();
                hVar221 = joVar17.w;
                return com.google.android.libraries.assistant.contexttrigger.l.s.c(b6, nb8, (com.google.android.libraries.storage.a.j) hVar221.a());
            case 580:
                hVar222 = this.f320a.f;
                Context context26 = (Context) hVar222.a();
                hVar223 = this.f320a.hP;
                bz bzVar = (bz) hVar223.a();
                jyVar91 = this.f320a.f319a;
                at k = at.k(jyVar91.eL());
                hVar224 = this.f320a.n;
                cq cqVar7 = (cq) hVar224.a();
                jyVar92 = this.f320a.f319a;
                return new com.google.android.libraries.mdi.download.workmanager.a.b(context26, bzVar, k, cqVar7, jyVar92.qr());
            case 581:
                hVar225 = this.f320a.aD;
                com.google.android.apps.gsa.shared.util.debug.d dVar5 = (com.google.android.apps.gsa.shared.util.debug.d) hVar225.a();
                hVar226 = this.f320a.gz;
                return new com.google.android.apps.gsa.staticplugins.ar.o(dVar5, (com.google.android.libraries.gsa.h.h) hVar226.a());
            case 582:
                hVar227 = this.f320a.f;
                Context context27 = (Context) hVar227.a();
                hVar228 = this.f320a.R;
                return com.google.android.libraries.notifications.platform.internal.room.r.d(context27, (m.c.n) hVar228.a());
            case 583:
                jyVar93 = this.f320a.f319a;
                hVar229 = jyVar93.sz;
                com.google.android.libraries.notifications.platform.internal.n.f fVar6 = (com.google.android.libraries.notifications.platform.internal.n.f) hVar229.a();
                hVar230 = this.f320a.R;
                m.c.n nVar3 = (m.c.n) hVar230.a();
                jyVar94 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.x rs = jyVar94.rs();
                hVar231 = this.f320a.f;
                Context context28 = (Context) hVar231.a();
                jyVar95 = this.f320a.f319a;
                hVar232 = jyVar95.aO;
                com.google.android.libraries.notifications.platform.k.a aVar16 = (com.google.android.libraries.notifications.platform.k.a) hVar232.a();
                at k2 = at.k(true);
                jyVar96 = this.f320a.f319a;
                hVar233 = jyVar96.sy;
                boolean booleanValue = ((Boolean) hVar233.a()).booleanValue();
                jyVar97 = this.f320a.f319a;
                hVar234 = jyVar97.sn;
                return new com.google.android.libraries.notifications.platform.m.a.b(fVar6, nVar3, rs, context28, aVar16, k2, booleanValue, hVar234);
            case 584:
                jyVar98 = this.f320a.f319a;
                at k3 = at.k(jyVar98.dd());
                jyVar99 = this.f320a.f319a;
                hVar235 = jyVar99.sm;
                com.google.android.libraries.notifications.platform.internal.r.b.a.a aVar17 = (com.google.android.libraries.notifications.platform.internal.r.b.a.a) hVar235.a();
                jyVar100 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.p.a.o sc = jyVar100.sc();
                jyVar101 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.ac m126do = jyVar101.m126do();
                jyVar102 = this.f320a.f319a;
                hVar236 = jyVar102.sq;
                com.google.android.libraries.notifications.platform.internal.n.b bVar6 = (com.google.android.libraries.notifications.platform.internal.n.b) hVar236.a();
                hVar237 = this.f320a.R;
                m.c.n nVar4 = (m.c.n) hVar237.a();
                jyVar103 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.x rs2 = jyVar103.rs();
                jyVar104 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.x rt = jyVar104.rt();
                jyVar105 = this.f320a.f319a;
                hVar238 = jyVar105.st;
                com.google.android.libraries.notifications.platform.internal.n.c cVar4 = (com.google.android.libraries.notifications.platform.internal.n.c) hVar238.a();
                jyVar106 = this.f320a.f319a;
                hVar239 = jyVar106.cV;
                com.google.android.libraries.notifications.platform.internal.k.a aVar18 = (com.google.android.libraries.notifications.platform.internal.k.a) hVar239.a();
                jyVar107 = this.f320a.f319a;
                hVar240 = jyVar107.mW;
                com.google.android.libraries.notifications.platform.internal.k.e eVar = (com.google.android.libraries.notifications.platform.internal.k.e) hVar240.a();
                jyVar108 = this.f320a.f319a;
                hVar241 = jyVar108.su;
                com.google.android.libraries.notifications.platform.internal.n.a.z zVar = (com.google.android.libraries.notifications.platform.internal.n.a.z) hVar241.a();
                com.google.android.libraries.notifications.platform.internal.n.a.af afVar = new com.google.android.libraries.notifications.platform.internal.n.a.af();
                hVar242 = this.f320a.g;
                com.google.android.libraries.g.a aVar19 = (com.google.android.libraries.g.a) hVar242.a();
                jo joVar18 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b7 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar109 = joVar18.f319a;
                hVar243 = jyVar109.me;
                jyVar110 = this.f320a.f319a;
                hVar244 = jyVar110.aR;
                com.google.android.libraries.notifications.platform.internal.m.a aVar20 = (com.google.android.libraries.notifications.platform.internal.m.a) hVar244.a();
                hVar245 = this.f320a.f;
                Context context29 = (Context) hVar245.a();
                jyVar111 = this.f320a.f319a;
                hVar246 = jyVar111.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar5 = (com.google.android.libraries.notifications.platform.internal.q.c) hVar246.a();
                jyVar112 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.z sb = jyVar112.sb();
                jyVar113 = this.f320a.f319a;
                hVar247 = jyVar113.sn;
                jyVar114 = this.f320a.f319a;
                hVar248 = jyVar114.sy;
                return new com.google.android.libraries.notifications.platform.internal.n.a.p(k3, aVar17, sc, m126do, bVar6, nVar4, rs2, rt, cVar4, aVar18, eVar, zVar, afVar, aVar19, b7, hVar243, aVar20, context29, cVar5, sb, hVar247, hVar248);
            case 585:
                jyVar115 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.platform.internal.r.b.a.a(jyVar115.sc());
            case 586:
                hVar249 = this.f320a.f;
                Context context30 = (Context) hVar249.a();
                jo joVar19 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b8 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar116 = joVar19.f319a;
                jyVar116.eK();
                jo joVar20 = this.f320a;
                at i3 = at.i();
                jyVar117 = joVar20.f319a;
                at k4 = at.k(jyVar117.ru());
                jyVar118 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.o.a.a dp = jyVar118.dp();
                jyVar119 = this.f320a.f319a;
                hVar250 = jyVar119.mL;
                cq cqVar8 = (cq) hVar250.a();
                jyVar120 = this.f320a.f319a;
                hVar251 = jyVar120.sn;
                return new com.google.android.libraries.notifications.platform.internal.r.e.a.k(context30, b8, i3, k4, dp, cqVar8, hVar251);
            case 587:
                hVar252 = this.f320a.f;
                Context context31 = (Context) hVar252.a();
                jyVar121 = this.f320a.f319a;
                hVar253 = jyVar121.aO;
                return Boolean.valueOf(com.google.android.libraries.notifications.platform.internal.g.a.a.a(context31, (com.google.android.libraries.notifications.platform.k.a) hVar253.a(), com.google.android.libraries.search.integrations.j.b.b()));
            case 588:
                hVar254 = this.f320a.f;
                Context context32 = (Context) hVar254.a();
                jyVar122 = this.f320a.f319a;
                hVar255 = jyVar122.sp;
                e.a b9 = c.b(hVar255);
                jyVar123 = this.f320a.f319a;
                hVar256 = jyVar123.aR;
                return new com.google.android.libraries.notifications.platform.internal.n.a.a(context32, b9, (com.google.android.libraries.notifications.platform.internal.m.a) hVar256.a());
            case 589:
                hVar257 = this.f320a.f;
                return com.google.android.libraries.notifications.platform.internal.n.a.w.b((Context) hVar257.a());
            case 590:
                jyVar124 = this.f320a.f319a;
                hVar258 = jyVar124.ss;
                com.google.android.libraries.notifications.platform.internal.o.l lVar = (com.google.android.libraries.notifications.platform.internal.o.l) hVar258.a();
                jyVar125 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.p.a.o sc2 = jyVar125.sc();
                jyVar126 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.x rs3 = jyVar126.rs();
                jyVar127 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.x rt2 = jyVar127.rt();
                hVar259 = this.f320a.P;
                m.c.n nVar5 = (m.c.n) hVar259.a();
                hVar260 = this.f320a.R;
                m.c.n nVar6 = (m.c.n) hVar260.a();
                jyVar128 = this.f320a.f319a;
                hVar261 = jyVar128.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar6 = (com.google.android.libraries.notifications.platform.internal.q.c) hVar261.a();
                hVar262 = this.f320a.f;
                Context context33 = (Context) hVar262.a();
                hVar263 = this.f320a.g;
                com.google.android.libraries.g.a aVar21 = (com.google.android.libraries.g.a) hVar263.a();
                jyVar129 = this.f320a.f319a;
                at k5 = at.k(jyVar129.ds());
                jyVar130 = this.f320a.f319a;
                hVar264 = jyVar130.me;
                return new com.google.android.libraries.notifications.platform.internal.n.a.f(lVar, sc2, rs3, rt2, nVar5, nVar6, cVar6, context33, aVar21, k5, hVar264);
            case 591:
                jyVar131 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.h.a.a.c dk = jyVar131.dk();
                jo joVar21 = this.f320a;
                com.google.android.libraries.search.integrations.j.b.b();
                jyVar132 = joVar21.f319a;
                hVar265 = jyVar132.me;
                com.google.android.libraries.notifications.platform.internal.d.d dVar6 = (com.google.android.libraries.notifications.platform.internal.d.d) hVar265.a();
                jyVar133 = this.f320a.f319a;
                hVar266 = jyVar133.mE;
                com.google.android.libraries.notifications.platform.internal.i.a.d dVar7 = (com.google.android.libraries.notifications.platform.internal.i.a.d) hVar266.a();
                hVar267 = this.f320a.f;
                Context context34 = (Context) hVar267.a();
                jyVar134 = this.f320a.f319a;
                jyVar134.pv();
                hVar268 = this.f320a.bt;
                m.c.n nVar7 = (m.c.n) hVar268.a();
                hVar269 = this.f320a.Q;
                return new com.google.android.libraries.notifications.platform.internal.o.a.j(dk, dVar6, dVar7, context34, nVar7, (ag) hVar269.a());
            case 592:
                jyVar135 = this.f320a.f319a;
                hVar270 = jyVar135.st;
                com.google.android.libraries.notifications.platform.internal.n.c cVar7 = (com.google.android.libraries.notifications.platform.internal.n.c) hVar270.a();
                jyVar136 = this.f320a.f319a;
                hVar271 = jyVar136.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar7 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar271.a();
                hVar272 = this.f320a.R;
                m.c.n nVar8 = (m.c.n) hVar272.a();
                jyVar137 = this.f320a.f319a;
                hVar273 = jyVar137.su;
                com.google.android.libraries.notifications.platform.internal.n.a.z zVar2 = (com.google.android.libraries.notifications.platform.internal.n.a.z) hVar273.a();
                jyVar138 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.x rs4 = jyVar138.rs();
                jyVar139 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.ac m126do2 = jyVar139.m126do();
                jyVar140 = this.f320a.f319a;
                hVar274 = jyVar140.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar8 = (com.google.android.libraries.notifications.platform.internal.q.c) hVar274.a();
                hVar275 = this.f320a.f;
                Context context35 = (Context) hVar275.a();
                com.google.android.libraries.notifications.platform.internal.n.a.af afVar2 = new com.google.android.libraries.notifications.platform.internal.n.a.af();
                jyVar141 = this.f320a.f319a;
                hVar276 = jyVar141.aR;
                com.google.android.libraries.notifications.platform.internal.m.a aVar22 = (com.google.android.libraries.notifications.platform.internal.m.a) hVar276.a();
                jyVar142 = this.f320a.f319a;
                hVar277 = jyVar142.sq;
                com.google.android.libraries.notifications.platform.internal.n.b bVar8 = (com.google.android.libraries.notifications.platform.internal.n.b) hVar277.a();
                jyVar143 = this.f320a.f319a;
                hVar278 = jyVar143.mW;
                com.google.android.libraries.notifications.platform.internal.k.e eVar2 = (com.google.android.libraries.notifications.platform.internal.k.e) hVar278.a();
                jyVar144 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.n.a.h dn = jyVar144.dn();
                jo joVar22 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b10 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar145 = joVar22.f319a;
                return new com.google.android.libraries.notifications.platform.internal.n.a.v(cVar7, bVar7, nVar8, zVar2, rs4, m126do2, cVar8, context35, afVar2, aVar22, bVar8, eVar2, dn, b10, jyVar145.sb());
            case 593:
                jyVar146 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.p.a.o sc3 = jyVar146.sc();
                hVar279 = this.f320a.R;
                return new com.google.android.libraries.notifications.platform.internal.n.a.z(sc3, (m.c.n) hVar279.a());
            case 594:
                hVar280 = this.f320a.f;
                Context context36 = (Context) hVar280.a();
                jyVar147 = this.f320a.f319a;
                hVar281 = jyVar147.mw;
                com.google.android.libraries.notifications.platform.b.a.b bVar9 = (com.google.android.libraries.notifications.platform.b.a.b) hVar281.a();
                jyVar148 = this.f320a.f319a;
                hVar282 = jyVar148.aO;
                return new com.google.android.libraries.notifications.platform.internal.a.a.a(context36, bVar9, (com.google.android.libraries.notifications.platform.k.a) hVar282.a());
            case 595:
                hVar283 = this.f320a.g;
                com.google.android.libraries.g.a aVar23 = (com.google.android.libraries.g.a) hVar283.a();
                jo joVar23 = this.f320a;
                com.google.android.libraries.notifications.platform.d.c b11 = com.google.android.libraries.search.integrations.j.b.b();
                jyVar149 = joVar23.f319a;
                hVar284 = jyVar149.me;
                com.google.android.libraries.notifications.platform.internal.d.d dVar8 = (com.google.android.libraries.notifications.platform.internal.d.d) hVar284.a();
                jyVar150 = this.f320a.f319a;
                hVar285 = jyVar150.mi;
                com.google.android.libraries.notifications.platform.internal.o.n nVar9 = (com.google.android.libraries.notifications.platform.internal.o.n) hVar285.a();
                jyVar151 = this.f320a.f319a;
                hVar286 = jyVar151.so;
                return new com.google.android.libraries.notifications.platform.internal.a.a.b(aVar23, b11, dVar8, nVar9, (com.google.android.libraries.notifications.platform.internal.r.e.a) hVar286.a());
            case 596:
                return true;
            case 597:
                jyVar152 = this.f320a.f319a;
                hVar287 = jyVar152.my;
                com.google.android.libraries.notifications.internal.b.a aVar24 = (com.google.android.libraries.notifications.internal.b.a) hVar287.a();
                jyVar153 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.entrypoints.blockstatechanged.a(aVar24, jyVar153.rr());
            case 598:
                jyVar154 = this.f320a.f319a;
                com.google.android.libraries.notifications.g.a.b bVar10 = new com.google.android.libraries.notifications.g.a.b();
                bVar10.a = (com.google.android.libraries.notifications.g.a.d) jyVar154.oH.a();
                return bVar10;
            case 599:
                jyVar155 = this.f320a.f319a;
                hVar288 = jyVar155.mP;
                com.google.android.libraries.notifications.internal.i.e eVar3 = (com.google.android.libraries.notifications.internal.i.e) hVar288.a();
                jyVar156 = this.f320a.f319a;
                hVar289 = jyVar156.mq;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar5 = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar289.a();
                jyVar157 = this.f320a.f319a;
                hVar290 = jyVar157.nI;
                Set set = (Set) hVar290.a();
                jyVar158 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.entrypoints.systemtray.b(eVar3, jVar5, set, jyVar158.df());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        h hVar;
        jy jyVar;
        h hVar2;
        jy jyVar2;
        jy jyVar3;
        h hVar3;
        jy jyVar4;
        h hVar4;
        jy jyVar5;
        h hVar5;
        jy jyVar6;
        h hVar6;
        jy jyVar7;
        jy jyVar8;
        jy jyVar9;
        h hVar7;
        jy jyVar10;
        h hVar8;
        jy jyVar11;
        h hVar9;
        h hVar10;
        jy jyVar12;
        h hVar11;
        jy jyVar13;
        h hVar12;
        h hVar13;
        jy jyVar14;
        h hVar14;
        jy jyVar15;
        h hVar15;
        jy jyVar16;
        h hVar16;
        jy jyVar17;
        h hVar17;
        jy jyVar18;
        h hVar18;
        jy jyVar19;
        h hVar19;
        jy jyVar20;
        h hVar20;
        jy jyVar21;
        h hVar21;
        jy jyVar22;
        h hVar22;
        jy jyVar23;
        h hVar23;
        jy jyVar24;
        h hVar24;
        jy jyVar25;
        jy jyVar26;
        h hVar25;
        jy jyVar27;
        h hVar26;
        jy jyVar28;
        h hVar27;
        jy jyVar29;
        h hVar28;
        jy jyVar30;
        h hVar29;
        jy jyVar31;
        h hVar30;
        jy jyVar32;
        jy jyVar33;
        h hVar31;
        jy jyVar34;
        jy jyVar35;
        h hVar32;
        jy jyVar36;
        h hVar33;
        jy jyVar37;
        h hVar34;
        jy jyVar38;
        h hVar35;
        jy jyVar39;
        h hVar36;
        jy jyVar40;
        jy jyVar41;
        h hVar37;
        jy jyVar42;
        h hVar38;
        jy jyVar43;
        h hVar39;
        jy jyVar44;
        h hVar40;
        jy jyVar45;
        h hVar41;
        jy jyVar46;
        h hVar42;
        jy jyVar47;
        h hVar43;
        jy jyVar48;
        h hVar44;
        jy jyVar49;
        h hVar45;
        jy jyVar50;
        h hVar46;
        jy jyVar51;
        h hVar47;
        jy jyVar52;
        h hVar48;
        jy jyVar53;
        h hVar49;
        jy jyVar54;
        h hVar50;
        jy jyVar55;
        h hVar51;
        jy jyVar56;
        h hVar52;
        h hVar53;
        jy jyVar57;
        jy jyVar58;
        h hVar54;
        jy jyVar59;
        h hVar55;
        jy jyVar60;
        jy jyVar61;
        jy jyVar62;
        h hVar56;
        jy jyVar63;
        h hVar57;
        jy jyVar64;
        h hVar58;
        h hVar59;
        jy jyVar65;
        h hVar60;
        jy jyVar66;
        h hVar61;
        jy jyVar67;
        h hVar62;
        jy jyVar68;
        h hVar63;
        jy jyVar69;
        h hVar64;
        h hVar65;
        jy jyVar70;
        h hVar66;
        h hVar67;
        h hVar68;
        jy jyVar71;
        jy jyVar72;
        h hVar69;
        jy jyVar73;
        h hVar70;
        jy jyVar74;
        h hVar71;
        h hVar72;
        jy jyVar75;
        jy jyVar76;
        h hVar73;
        jy jyVar77;
        h hVar74;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        jy jyVar78;
        h hVar80;
        jy jyVar79;
        h hVar81;
        jy jyVar80;
        h hVar82;
        h hVar83;
        h hVar84;
        h hVar85;
        h hVar86;
        jy jyVar81;
        h hVar87;
        jy jyVar82;
        h hVar88;
        jy jyVar83;
        h hVar89;
        jy jyVar84;
        h hVar90;
        jy jyVar85;
        jy jyVar86;
        jy jyVar87;
        jy jyVar88;
        h hVar91;
        jy jyVar89;
        h hVar92;
        jy jyVar90;
        jy jyVar91;
        jy jyVar92;
        jy jyVar93;
        jy jyVar94;
        h hVar93;
        jy jyVar95;
        jy jyVar96;
        h hVar94;
        jy jyVar97;
        jy jyVar98;
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
        jy jyVar99;
        h hVar105;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        h hVar112;
        jy jyVar100;
        jy jyVar101;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        h hVar117;
        h hVar118;
        h hVar119;
        h hVar120;
        jy jyVar102;
        jy jyVar103;
        jy jyVar104;
        jy jyVar105;
        jy jyVar106;
        jy jyVar107;
        jy jyVar108;
        jy jyVar109;
        jy jyVar110;
        jy jyVar111;
        h hVar121;
        h hVar122;
        h hVar123;
        h hVar124;
        jy jyVar112;
        jy jyVar113;
        h hVar125;
        h hVar126;
        h hVar127;
        h hVar128;
        h hVar129;
        h hVar130;
        jy jyVar114;
        h hVar131;
        h hVar132;
        h hVar133;
        jy jyVar115;
        h hVar134;
        h hVar135;
        h hVar136;
        jy jyVar116;
        h hVar137;
        h hVar138;
        h hVar139;
        jy jyVar117;
        h hVar140;
        jy jyVar118;
        h hVar141;
        h hVar142;
        jy jyVar119;
        h hVar143;
        h hVar144;
        jy jyVar120;
        h hVar145;
        h hVar146;
        h hVar147;
        h hVar148;
        jy jyVar121;
        h hVar149;
        h hVar150;
        h hVar151;
        h hVar152;
        h hVar153;
        h hVar154;
        jy jyVar122;
        h hVar155;
        h hVar156;
        jy jyVar123;
        h hVar157;
        h hVar158;
        h hVar159;
        h hVar160;
        jy jyVar124;
        h hVar161;
        jy jyVar125;
        h hVar162;
        h hVar163;
        h hVar164;
        h hVar165;
        jy jyVar126;
        h hVar166;
        h hVar167;
        h hVar168;
        h hVar169;
        h hVar170;
        jy jyVar127;
        h hVar171;
        jy jyVar128;
        h hVar172;
        jy jyVar129;
        h hVar173;
        h hVar174;
        h hVar175;
        h hVar176;
        h hVar177;
        jy jyVar130;
        h hVar178;
        jy jyVar131;
        h hVar179;
        jy jyVar132;
        h hVar180;
        h hVar181;
        h hVar182;
        h hVar183;
        h hVar184;
        h hVar185;
        h hVar186;
        h hVar187;
        h hVar188;
        jy jyVar133;
        h hVar189;
        jy jyVar134;
        h hVar190;
        jy jyVar135;
        h hVar191;
        jy jyVar136;
        h hVar192;
        h hVar193;
        h hVar194;
        h hVar195;
        h hVar196;
        int i = this.b;
        switch (i) {
            case 600:
                hVar = this.f320a.f;
                Context context = (Context) hVar.a();
                jyVar = this.f320a.f319a;
                hVar2 = jyVar.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar = (com.google.android.libraries.notifications.platform.internal.p.b) hVar2.a();
                jyVar2 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.a.a.c di = jyVar2.di();
                jyVar3 = this.f320a.f319a;
                hVar3 = jyVar3.oG;
                com.google.android.libraries.notifications.platform.internal.r.a.b bVar2 = (com.google.android.libraries.notifications.platform.internal.r.a.b) hVar3.a();
                jyVar4 = this.f320a.f319a;
                hVar4 = jyVar4.sw;
                com.google.android.libraries.notifications.platform.internal.a.a aVar = (com.google.android.libraries.notifications.platform.internal.a.a) hVar4.a();
                jyVar5 = this.f320a.f319a;
                hVar5 = jyVar5.mQ;
                com.google.android.libraries.notifications.platform.internal.q.c cVar = (com.google.android.libraries.notifications.platform.internal.q.c) hVar5.a();
                jyVar6 = this.f320a.f319a;
                hVar6 = jyVar6.sx;
                com.google.android.libraries.notifications.platform.internal.a.a.b bVar3 = (com.google.android.libraries.notifications.platform.internal.a.a.b) hVar6.a();
                jyVar7 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.platform.entrypoints.accountchanged.d(context, bVar, di, bVar2, aVar, cVar, bVar3, jyVar7.qv());
            case 601:
                jyVar8 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.platform.entrypoints.localechanged.b(jyVar8.de());
            case 602:
                jyVar9 = this.f320a.f319a;
                hVar7 = jyVar9.sB;
                jyVar10 = this.f320a.f319a;
                hVar8 = jyVar10.sw;
                jyVar11 = this.f320a.f319a;
                hVar9 = jyVar11.sx;
                jo joVar = this.f320a;
                hVar10 = joVar.g;
                jyVar12 = joVar.f319a;
                hVar11 = jyVar12.nz;
                jyVar13 = this.f320a.f319a;
                hVar12 = jyVar13.sC;
                hVar13 = this.f320a.f;
                Context context2 = (Context) hVar13.a();
                jyVar14 = this.f320a.f319a;
                hVar14 = jyVar14.mQ;
                jyVar15 = this.f320a.f319a;
                hVar15 = jyVar15.sD;
                jyVar16 = this.f320a.f319a;
                hVar16 = jyVar16.sF;
                jyVar17 = this.f320a.f319a;
                hVar17 = jyVar17.sG;
                jyVar18 = this.f320a.f319a;
                hVar18 = jyVar18.mH;
                return new com.google.android.libraries.notifications.platform.entrypoints.push.o(hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, context2, hVar14, hVar15, hVar16, hVar17, hVar18);
            case 603:
                jyVar19 = this.f320a.f319a;
                hVar19 = jyVar19.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar4 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar19.a();
                jyVar20 = this.f320a.f319a;
                hVar20 = jyVar20.mE;
                return new com.google.android.libraries.notifications.platform.entrypoints.push.a.a(bVar4, (com.google.android.libraries.notifications.platform.internal.i.a.d) hVar20.a());
            case 604:
                return new com.google.android.libraries.notifications.platform.internal.b.a.a();
            case 605:
                jyVar21 = this.f320a.f319a;
                hVar21 = jyVar21.sE;
                return at.k((com.google.android.libraries.notifications.entrypoints.a.a.b) hVar21.a());
            case 606:
                jyVar22 = this.f320a.f319a;
                hVar22 = jyVar22.mP;
                com.google.android.libraries.notifications.internal.i.e eVar = (com.google.android.libraries.notifications.internal.i.e) hVar22.a();
                jyVar23 = this.f320a.f319a;
                hVar23 = jyVar23.nW;
                com.google.android.libraries.notifications.internal.m.a aVar2 = (com.google.android.libraries.notifications.internal.m.a) hVar23.a();
                jyVar24 = this.f320a.f319a;
                hVar24 = jyVar24.my;
                com.google.android.libraries.notifications.internal.b.a aVar3 = (com.google.android.libraries.notifications.internal.b.a) hVar24.a();
                jyVar25 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.j.b rr = jyVar25.rr();
                jyVar26 = this.f320a.f319a;
                hVar25 = jyVar26.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar5 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar25.a();
                jyVar27 = this.f320a.f319a;
                hVar26 = jyVar27.oL;
                com.google.android.libraries.notifications.internal.a.a.b bVar6 = (com.google.android.libraries.notifications.internal.a.a.b) hVar26.a();
                jyVar28 = this.f320a.f319a;
                hVar27 = jyVar28.mR;
                com.google.android.libraries.notifications.internal.n.g gVar = (com.google.android.libraries.notifications.internal.n.g) hVar27.a();
                jyVar29 = this.f320a.f319a;
                hVar28 = jyVar29.nI;
                e.a b = c.b(hVar28);
                jyVar30 = this.f320a.f319a;
                hVar29 = jyVar30.nL;
                com.google.android.libraries.notifications.platform.b.c cVar2 = (com.google.android.libraries.notifications.platform.b.c) hVar29.a();
                jyVar31 = this.f320a.f319a;
                hVar30 = jyVar31.nM;
                Lock lock = (Lock) hVar30.a();
                jyVar32 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.f.c rq = jyVar32.rq();
                jyVar33 = this.f320a.f319a;
                hVar31 = jyVar33.mA;
                return new com.google.android.libraries.notifications.entrypoints.a.a.b(eVar, aVar2, aVar3, rr, bVar5, bVar6, gVar, b, cVar2, lock, rq, (ScheduledExecutorService) hVar31.a());
            case 607:
                jyVar34 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.j.a.d de = jyVar34.de();
                jyVar35 = this.f320a.f319a;
                hVar32 = jyVar35.sN;
                return new com.google.android.libraries.notifications.platform.entrypoints.restart.b(de, at.k((com.google.android.libraries.notifications.entrypoints.b.a) hVar32.a()));
            case 608:
                jyVar36 = this.f320a.f319a;
                hVar33 = jyVar36.mU;
                com.google.android.libraries.notifications.i.d dVar = (com.google.android.libraries.notifications.i.d) hVar33.a();
                jyVar37 = this.f320a.f319a;
                hVar34 = jyVar37.mX;
                e.a b2 = c.b(hVar34);
                jyVar38 = this.f320a.f319a;
                hVar35 = jyVar38.sK;
                com.google.android.libraries.notifications.internal.g.a aVar4 = (com.google.android.libraries.notifications.internal.g.a) hVar35.a();
                jyVar39 = this.f320a.f319a;
                hVar36 = jyVar39.sL;
                com.google.android.libraries.notifications.entrypoints.b.a.b bVar7 = (com.google.android.libraries.notifications.entrypoints.b.a.b) hVar36.a();
                jyVar40 = this.f320a.f319a;
                com.google.android.libraries.notifications.platform.internal.k.a dm = jyVar40.dm();
                jyVar41 = this.f320a.f319a;
                hVar37 = jyVar41.sM;
                jyVar42 = this.f320a.f319a;
                hVar38 = jyVar42.mq;
                jyVar43 = this.f320a.f319a;
                hVar39 = jyVar43.mp;
                jyVar44 = this.f320a.f319a;
                hVar40 = jyVar44.mO;
                return new com.google.android.libraries.notifications.entrypoints.b.a.a(dVar, b2, aVar4, bVar7, dm, hVar37, hVar38, hVar39, hVar40);
            case 609:
                jyVar45 = this.f320a.f319a;
                hVar41 = jyVar45.mU;
                com.google.android.libraries.notifications.i.d dVar2 = (com.google.android.libraries.notifications.i.d) hVar41.a();
                jyVar46 = this.f320a.f319a;
                hVar42 = jyVar46.mW;
                e.a b3 = c.b(hVar42);
                jyVar47 = this.f320a.f319a;
                hVar43 = jyVar47.sJ;
                com.google.android.libraries.notifications.i.c cVar3 = (com.google.android.libraries.notifications.i.c) hVar43.a();
                jyVar48 = this.f320a.f319a;
                hVar44 = jyVar48.db;
                return new com.google.android.libraries.notifications.internal.g.a.d(dVar2, b3, cVar3, (com.google.android.libraries.notifications.platform.internal.k.a) hVar44.a());
            case 610:
                jyVar49 = this.f320a.f319a;
                hVar45 = jyVar49.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar8 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar45.a();
                jyVar50 = this.f320a.f319a;
                hVar46 = jyVar50.nS;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar46.a();
                jyVar51 = this.f320a.f319a;
                hVar47 = jyVar51.nL;
                com.google.android.libraries.notifications.platform.b.c cVar4 = (com.google.android.libraries.notifications.platform.b.c) hVar47.a();
                jyVar52 = this.f320a.f319a;
                hVar48 = jyVar52.sI;
                com.google.android.libraries.notifications.platform.b.c cVar5 = (com.google.android.libraries.notifications.platform.b.c) hVar48.a();
                jyVar53 = this.f320a.f319a;
                hVar49 = jyVar53.my;
                com.google.android.libraries.notifications.internal.b.a aVar5 = (com.google.android.libraries.notifications.internal.b.a) hVar49.a();
                jyVar54 = this.f320a.f319a;
                hVar50 = jyVar54.nI;
                return new com.google.android.libraries.notifications.internal.g.a.b(bVar8, jVar, cVar4, cVar5, aVar5, (Set) hVar50.a());
            case 611:
                jyVar55 = this.f320a.f319a;
                hVar51 = jyVar55.sH;
                com.google.android.libraries.notifications.platform.b.c cVar6 = (com.google.android.libraries.notifications.platform.b.c) hVar51.a();
                jyVar56 = this.f320a.f319a;
                return com.google.android.libraries.notifications.platform.internal.p.a.q.d(cVar6, jyVar56.dq());
            case 612:
                hVar52 = this.f320a.f;
                Context context3 = (Context) hVar52.a();
                hVar53 = this.f320a.R;
                return com.google.android.libraries.notifications.platform.internal.room.r.c(context3, (m.c.n) hVar53.a());
            case 613:
                jyVar57 = this.f320a.f319a;
                com.google.android.libraries.notifications.i.a.d dt = jyVar57.dt();
                jyVar58 = this.f320a.f319a;
                hVar54 = jyVar58.sJ;
                return com.google.android.libraries.notifications.internal.g.a.e.b(dt, (com.google.android.libraries.notifications.internal.g.a.b) hVar54.a());
            case 614:
                jyVar59 = this.f320a.f319a;
                hVar55 = jyVar59.aU;
                return new com.google.android.libraries.notifications.entrypoints.b.a.b((com.google.android.libraries.notifications.j.d) hVar55.a());
            case 615:
                jyVar60 = this.f320a.f319a;
                return new com.google.android.libraries.notifications.platform.entrypoints.timezonechanged.b(jyVar60.de());
            case 616:
                jyVar61 = this.f320a.f319a;
                com.google.android.libraries.notifications.internal.j.a.d de2 = jyVar61.de();
                jyVar62 = this.f320a.f319a;
                hVar56 = jyVar62.sN;
                return new com.google.android.libraries.notifications.platform.entrypoints.update.b(de2, at.k((com.google.android.libraries.notifications.entrypoints.b.a) hVar56.a()));
            case 617:
                return com.google.android.libraries.notifications.platform.entrypoints.firebase.a.b(new mj(this.f320a));
            case 618:
                return com.google.android.libraries.notifications.platform.entrypoints.job.a.c(new mj(this.f320a));
            case 619:
                return new com.google.android.libraries.notifications.platform.i.a.a.b();
            case 620:
                return new com.google.android.libraries.notifications.platform.i.a.a.b();
            case 621:
                return new com.google.android.libraries.notifications.platform.i.a.a.b();
            case 622:
                return new com.google.android.libraries.notifications.platform.i.a.a.b();
            case 623:
                return com.google.android.libraries.notifications.platform.i.a.a.a.c();
            case 624:
                return com.google.android.libraries.notifications.platform.i.a.a.a.b();
            case 625:
                jyVar63 = this.f320a.f319a;
                hVar57 = jyVar63.nW;
                com.google.android.libraries.notifications.internal.m.a aVar6 = (com.google.android.libraries.notifications.internal.m.a) hVar57.a();
                jyVar64 = this.f320a.f319a;
                hVar58 = jyVar64.mp;
                com.google.android.libraries.notifications.platform.internal.p.b bVar9 = (com.google.android.libraries.notifications.platform.internal.p.b) hVar58.a();
                hVar59 = this.f320a.bt;
                return new com.google.android.libraries.notifications.a.d.a.c(aVar6, bVar9, (m.c.n) hVar59.a());
            case 626:
                jyVar65 = this.f320a.f319a;
                hVar60 = jyVar65.mP;
                e.a b4 = c.b(hVar60);
                jyVar66 = this.f320a.f319a;
                hVar61 = jyVar66.oF;
                com.google.android.libraries.notifications.internal.a.a.c cVar7 = (com.google.android.libraries.notifications.internal.a.a.c) hVar61.a();
                jyVar67 = this.f320a.f319a;
                hVar62 = jyVar67.mq;
                com.google.android.libraries.notifications.internal.storage.impl.j jVar2 = (com.google.android.libraries.notifications.internal.storage.impl.j) hVar62.a();
                jyVar68 = this.f320a.f319a;
                hVar63 = jyVar68.oG;
                com.google.android.libraries.notifications.platform.internal.r.a.b bVar10 = (com.google.android.libraries.notifications.platform.internal.r.a.b) hVar63.a();
                jyVar69 = this.f320a.f319a;
                hVar64 = jyVar69.my;
                com.google.android.libraries.notifications.internal.b.a aVar7 = (com.google.android.libraries.notifications.internal.b.a) hVar64.a();
                hVar65 = this.f320a.g;
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) hVar65.a();
                jyVar70 = this.f320a.f319a;
                hVar66 = jyVar70.mx;
                Random random = (Random) hVar66.a();
                hVar67 = this.f320a.bt;
                return new com.google.android.libraries.notifications.a.a.a.a(b4, cVar7, jVar2, bVar10, aVar7, aVar8, random, (m.c.n) hVar67.a());
            case 627:
                hVar68 = this.f320a.f;
                Context context4 = (Context) hVar68.a();
                jyVar71 = this.f320a.f319a;
                Set qm = jyVar71.qm();
                jyVar72 = this.f320a.f319a;
                hVar69 = jyVar72.aP;
                com.google.android.libraries.notifications.platform.f.b bVar11 = (com.google.android.libraries.notifications.platform.f.b) hVar69.a();
                jyVar73 = this.f320a.f319a;
                hVar70 = jyVar73.my;
                com.google.android.libraries.notifications.internal.b.a aVar9 = (com.google.android.libraries.notifications.internal.b.a) hVar70.a();
                jyVar74 = this.f320a.f319a;
                hVar71 = jyVar74.mQ;
                return new com.google.android.libraries.notifications.entrypoints.scheduled.c(context4, qm, bVar11, aVar9, (com.google.android.libraries.notifications.platform.internal.q.c) hVar71.a());
            case 628:
                hVar72 = this.f320a.f;
                jyVar75 = this.f320a.f319a;
                jyVar75.qm();
                jyVar76 = this.f320a.f319a;
                hVar73 = jyVar76.my;
                jyVar77 = this.f320a.f319a;
                hVar74 = jyVar77.mQ;
                return new com.google.android.libraries.notifications.entrypoints.scheduled.d();
            case 629:
                hVar75 = this.f320a.v;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar75.a();
                hVar76 = this.f320a.f;
                return new com.google.android.libraries.onegoogle.consent.b.a.j(scheduledExecutorService, (Context) hVar76.a());
            case 630:
                hVar77 = this.f320a.f;
                return com.google.android.libraries.onegoogle.consent.o.c((Context) hVar77.a());
            case 631:
                hVar78 = this.f320a.f;
                return com.google.android.libraries.onegoogle.consent.o.b((Context) hVar78.a());
            case 632:
                hVar79 = this.f320a.f;
                Context context5 = (Context) hVar79.a();
                jyVar78 = this.f320a.f319a;
                hVar80 = jyVar78.sV;
                com.google.frameworks.client.data.android.l lVar = (com.google.frameworks.client.data.android.l) hVar80.a();
                jyVar79 = this.f320a.f319a;
                com.google.android.gms.auth.u rp = jyVar79.rp();
                hVar81 = this.f320a.n;
                return new com.google.android.libraries.onegoogle.consent.presentation.web.aa(context5, lVar, rp, (ExecutorService) hVar81.a());
            case 633:
                jyVar80 = this.f320a.f319a;
                hVar82 = jyVar80.aS;
                at k = at.k((com.google.frameworks.client.data.android.l) hVar82.a());
                hVar83 = this.f320a.ax;
                CronetEngine cronetEngine = (CronetEngine) hVar83.a();
                hVar84 = this.f320a.H;
                ExecutorService executorService = (ExecutorService) hVar84.a();
                hVar85 = this.f320a.v;
                return com.google.android.libraries.onegoogle.consent.o.d(k, cronetEngine, executorService, (ExecutorService) hVar85.a());
            case 634:
                hVar86 = this.f320a.f;
                Context context6 = (Context) hVar86.a();
                jyVar81 = this.f320a.f319a;
                hVar87 = jyVar81.dj;
                com.google.android.libraries.onegoogle.consent.b.a.j jVar3 = (com.google.android.libraries.onegoogle.consent.b.a.j) hVar87.a();
                jyVar82 = this.f320a.f319a;
                hVar88 = jyVar82.dm;
                com.google.android.libraries.onegoogle.consent.presentation.a.a.d dVar3 = (com.google.android.libraries.onegoogle.consent.presentation.a.a.d) hVar88.a();
                jyVar83 = this.f320a.f319a;
                hVar89 = jyVar83.sX;
                Optional optional = (Optional) hVar89.a();
                jyVar84 = this.f320a.f319a;
                hVar90 = jyVar84.sZ;
                Optional optional2 = (Optional) hVar90.a();
                jyVar85 = this.f320a.f319a;
                return new com.google.android.libraries.onegoogle.consent.h(context6, jVar3, dVar3, optional, optional2, jyVar85.pA());
            case 635:
                jo joVar2 = this.f320a;
                ci e = com.google.android.libraries.onegoogle.consent.o.e();
                jyVar86 = joVar2.f319a;
                com.google.android.libraries.onegoogle.consent.presentation.a.a.a rX = jyVar86.rX();
                jyVar87 = this.f320a.f319a;
                return new com.google.android.libraries.onegoogle.consent.presentation.a.a.d(e, rX, jyVar87.dw());
            case 636:
                jyVar88 = this.f320a.f319a;
                return Optional.of(jyVar88.du());
            case 637:
                hVar91 = this.f320a.mb;
                return com.google.android.libraries.onegoogle.consent.a.a.b((com.google.frameworks.client.data.android.d) hVar91.a());
            case 638:
                return new com.google.android.libraries.onegoogle.consent.presentation.a.a.h(com.google.android.libraries.onegoogle.consent.o.e());
            case 639:
                jyVar89 = this.f320a.f319a;
                return Optional.of(jyVar89.dv());
            case 640:
                hVar92 = this.f320a.mb;
                return com.google.android.libraries.onegoogle.consent.a.a.a.b((com.google.frameworks.client.data.android.d) hVar92.a());
            case 641:
                jyVar90 = this.f320a.f319a;
                com.google.android.libraries.search.account.a dy = jyVar90.dy();
                jyVar91 = this.f320a.f319a;
                com.google.android.libraries.search.account.a dx = jyVar91.dx();
                jyVar92 = this.f320a.f319a;
                com.google.android.apps.search.googleapp.bubbles.a.l cG = jyVar92.cG();
                jyVar93 = this.f320a.f319a;
                com.google.android.apps.gsa.configuration.b y = jyVar93.y();
                jyVar94 = this.f320a.f319a;
                hVar93 = jyVar94.ta;
                com.google.android.libraries.search.account.a aVar10 = (com.google.android.libraries.search.account.a) hVar93.a();
                jyVar95 = this.f320a.f319a;
                com.google.android.libraries.search.integrations.j.a.a.b eg = jyVar95.eg();
                jyVar96 = this.f320a.f319a;
                hVar94 = jyVar96.tb;
                jyVar97 = this.f320a.f319a;
                jyVar98 = this.f320a.f319a;
                hVar95 = this.f320a.gU;
                hVar96 = this.f320a.hl;
                return ha.w(dy, dx, cG, y, aVar10, eg, new com.google.android.libraries.search.account.a[]{(com.google.android.libraries.search.account.a) hVar94.a(), jyVar97.W(), jyVar98.cH(), (com.google.android.libraries.search.account.a) hVar95.a(), (com.google.android.libraries.search.account.a) hVar96.a()});
            case 642:
                hVar97 = this.f320a.f;
                Context context7 = (Context) hVar97.a();
                hVar98 = this.f320a.gf;
                e.a b5 = c.b(hVar98);
                hVar99 = this.f320a.gq;
                e.a b6 = c.b(hVar99);
                hVar100 = this.f320a.gt;
                e.a b7 = c.b(hVar100);
                hVar101 = this.f320a.lw;
                at k2 = at.k((fv) hVar101.a());
                hVar102 = this.f320a.bM;
                return new com.google.android.apps.gsa.opa.a(context7, b5, b6, b7, k2, c.b(hVar102));
            case 643:
                hVar103 = this.f320a.gB;
                an anVar = (an) hVar103.a();
                hVar104 = this.f320a.mw;
                return new com.google.android.apps.gsa.speech.h.a(anVar, (com.google.android.libraries.search.ai.o) hVar104.a());
            case 644:
                jyVar99 = this.f320a.f319a;
                return new op(jyVar99.cL());
            case 645:
                hVar105 = this.f320a.bH;
                com.google.apps.tiktok.account.data.aa aaVar = (com.google.apps.tiktok.account.data.aa) hVar105.a();
                hVar106 = this.f320a.v;
                return new com.google.android.libraries.search.account.d.b.c(aaVar, (cq) hVar106.a());
            case 646:
                hVar107 = this.f320a.H;
                Executor executor = (Executor) hVar107.a();
                hVar108 = this.f320a.v;
                cq cqVar = (cq) hVar108.a();
                hVar109 = this.f320a.nr;
                com.google.apps.tiktok.g.p pVar = (com.google.apps.tiktok.g.p) hVar109.a();
                hVar110 = this.f320a.f;
                Context context8 = (Context) hVar110.a();
                hVar111 = this.f320a.ez;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.e(executor, cqVar, pVar, context8, (com.google.common.v.f) hVar111.a());
            case 647:
                hVar112 = this.f320a.f;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.f((Context) hVar112.a());
            case 648:
                jo joVar3 = this.f320a;
                ce ks = joVar3.ks();
                jyVar100 = joVar3.f319a;
                aq dV = jyVar100.dV();
                jyVar101 = this.f320a.f319a;
                return new com.google.android.libraries.search.assistant.proactive.ae(ks, dV, at.k(jyVar101.dX()));
            case 649:
                return new lt(this);
            case 650:
                hVar113 = this.f320a.qh;
                com.google.android.libraries.logging.c.h hVar197 = (com.google.android.libraries.logging.c.h) hVar113.a();
                this.f320a.iR();
                Set Zw = this.f320a.Zw();
                com.google.android.libraries.logging.ve.e.e.a.a aVar11 = new com.google.android.libraries.logging.ve.e.e.a.a();
                hVar114 = this.f320a.qi;
                return new com.google.android.libraries.logging.ve.synthetic.f(hVar197, Zw, aVar11, (com.google.android.libraries.logging.b.a) hVar114.a());
            case 651:
                hVar115 = this.f320a.H;
                return new com.google.android.libraries.search.assistant.e.d.h((Executor) hVar115.a());
            case 652:
                fq i2 = fu.i(24);
                i2.i(2880, new com.google.android.libraries.search.b.a.a.c());
                i2.i(2306, new com.google.android.libraries.search.b.a.b.c());
                i2.i(7, new com.google.android.libraries.search.b.a.c.d());
                i2.i(1855, new com.google.android.libraries.search.b.a.d.d());
                i2.i(2759, new com.google.android.libraries.search.b.a.e.c());
                i2.i(2734, new com.google.android.libraries.search.b.a.f.c());
                i2.i(1808, new com.google.android.libraries.search.b.a.g.c());
                i2.i(6, new com.google.android.libraries.search.b.a.h.d());
                i2.i(1962, new com.google.android.libraries.search.b.a.i.c());
                i2.i(1869, new com.google.android.libraries.search.b.a.j.c());
                i2.i(2000, new com.google.android.libraries.search.b.a.k.c());
                i2.i(3161, new com.google.android.libraries.search.b.a.l.c());
                i2.i(1739, new com.google.android.libraries.search.b.a.m.c());
                i2.i(3132, new com.google.android.libraries.search.b.a.n.c());
                i2.i(2895, new com.google.android.libraries.search.b.a.o.c());
                i2.i(1947, new com.google.android.libraries.search.b.a.p.c());
                i2.i(2370, new com.google.android.libraries.search.b.a.q.c());
                i2.i(2478, new com.google.android.libraries.search.b.a.r.c());
                i2.i(2974, new com.google.android.libraries.search.b.a.s.c());
                i2.i(1870, new com.google.android.libraries.search.b.a.t.c());
                i2.i(1770, new com.google.android.libraries.search.b.a.u.c());
                i2.i(1673, new com.google.android.libraries.search.b.a.v.c());
                i2.i(2947, new com.google.android.libraries.search.b.a.w.c());
                i2.i(2369, new com.google.android.libraries.search.b.a.x.c());
                return i2.g();
            case 653:
                return fu.q(8, new com.google.android.libraries.search.b.h.a.c(), 2, new com.google.android.libraries.search.b.h.b.c(), 3, new com.google.android.libraries.search.b.h.c.c(), 7, new com.google.android.libraries.search.b.h.d.c(), 6, new com.google.android.libraries.search.b.h.e.c());
            case 654:
                return ha.w(new com.google.android.libraries.search.assistant.n.b.c(), new com.google.android.apps.search.assistant.surfaces.voice.i.g.d.a(), new com.google.android.apps.search.assistant.surfaces.voice.robin.x.az(), new be(1), new be(0), new com.google.android.apps.search.assistant.surfaces.voice.o.r(), new com.google.android.libraries.search.b.j.b[]{new com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.i(), new com.google.android.libraries.search.assistant.aw.d.a()});
            case 655:
                hVar116 = this.f320a.Q;
                ag agVar = (ag) hVar116.a();
                hVar117 = this.f320a.g;
                return new com.google.android.libraries.search.assistant.n.b.a.h(agVar, (com.google.android.libraries.g.a) hVar117.a());
            case 656:
                jo joVar4 = this.f320a;
                com.google.android.libraries.storage.c.e md = joVar4.md();
                hVar118 = joVar4.ez;
                com.google.common.v.f fVar = (com.google.common.v.f) hVar118.a();
                hVar119 = this.f320a.v;
                cq cqVar2 = (cq) hVar119.a();
                hVar120 = this.f320a.H;
                cr crVar = (cr) hVar120.a();
                jyVar102 = this.f320a.f319a;
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.b.z(md, fVar, cqVar2, crVar, jyVar102.qQ());
            case 657:
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.a();
            case 658:
                return new com.google.android.libraries.assistant.c.b.a.a.a(0);
            case 659:
                return new com.google.android.libraries.assistant.c.b.a.a.a(5);
            case 660:
                return new com.google.android.libraries.assistant.c.b.a.a.a(9);
            case 661:
                return new com.google.android.libraries.assistant.c.b.a.a.a(11);
            case 662:
                return new com.google.android.libraries.assistant.c.b.a.a.a(12);
            case 663:
                jyVar103 = this.f320a.f319a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.ag bj = jyVar103.bj();
                jyVar104 = this.f320a.f319a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.b bi = jyVar104.bi();
                jyVar105 = this.f320a.f319a;
                return ha.t(bj, bi, jyVar105.Y());
            case 664:
                jyVar106 = this.f320a.f319a;
                boolean qR = jyVar106.qR();
                jyVar107 = this.f320a.f319a;
                boolean qS = jyVar107.qS();
                jyVar108 = this.f320a.f319a;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.c.c.b(qR, qS, jyVar108.qT());
            case 665:
                jo joVar5 = this.f320a;
                com.google.bz.f.b.b.g gVar2 = com.google.bz.f.b.b.g.i;
                jyVar109 = joVar5.f319a;
                com.google.android.libraries.search.assistant.af.a dF = jyVar109.dF();
                jo joVar6 = this.f320a;
                com.google.bz.f.b.b.g gVar3 = com.google.bz.f.b.b.g.q;
                jyVar110 = joVar6.f319a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.af.a cp = jyVar110.cp();
                jo joVar7 = this.f320a;
                com.google.bz.f.b.b.g gVar4 = com.google.bz.f.b.b.g.d;
                jyVar111 = joVar7.f319a;
                return fu.o(gVar2, dF, gVar3, cp, gVar4, jyVar111.dW());
            case 666:
                hVar121 = this.f320a.H;
                cq cqVar3 = (cq) hVar121.a();
                hVar122 = this.f320a.vU;
                com.google.android.libraries.search.l.b.f fVar2 = (com.google.android.libraries.search.l.b.f) hVar122.a();
                hVar123 = this.f320a.bN;
                return new com.google.android.libraries.search.l.b.r(cqVar3, fVar2, (com.google.apps.tiktok.account.data.b) hVar123.a());
            case 667:
                hVar124 = this.f320a.bo;
                ag agVar2 = (ag) hVar124.a();
                jyVar112 = this.f320a.f319a;
                return new com.google.android.libraries.search.o.a(agVar2, jyVar112.rw());
            case 668:
                jyVar113 = this.f320a.f319a;
                hVar125 = jyVar113.ti;
                jo joVar8 = this.f320a;
                hVar126 = joVar8.abP;
                hVar127 = joVar8.uF;
                com.google.android.libraries.web.n.b bVar12 = (com.google.android.libraries.web.n.b) hVar127.a();
                hVar128 = this.f320a.bK;
                dj djVar = (dj) hVar128.a();
                hVar129 = this.f320a.Q;
                return new com.google.android.libraries.search.integrations.p.a.o(hVar125, hVar126, bVar12, djVar, (ag) hVar129.a());
            case 669:
                hVar130 = this.f320a.Zx;
                return com.google.android.libraries.search.integrations.p.a.d.b((io.grpc.i) hVar130.a());
            case 670:
                jyVar114 = this.f320a.f319a;
                hVar131 = jyVar114.dM;
                com.google.android.libraries.search.rendering.xuikit.b.t tVar = (com.google.android.libraries.search.rendering.xuikit.b.t) hVar131.a();
                hVar132 = this.f320a.f;
                Context context9 = (Context) hVar132.a();
                hVar133 = this.f320a.Q;
                ag agVar3 = (ag) hVar133.a();
                jyVar115 = this.f320a.f319a;
                hVar134 = jyVar115.dJ;
                return new com.google.android.libraries.search.rendering.xuikit.b.c(tVar, context9, agVar3, (com.google.android.gms.clearcut.aj) hVar134.a());
            case 671:
                hVar135 = this.f320a.f;
                Context context10 = (Context) hVar135.a();
                hVar136 = this.f320a.R;
                m.c.n nVar = (m.c.n) hVar136.a();
                jyVar116 = this.f320a.f319a;
                hVar137 = jyVar116.tj;
                cg cgVar = (cg) hVar137.a();
                hVar138 = this.f320a.g;
                com.google.android.libraries.g.a aVar12 = (com.google.android.libraries.g.a) hVar138.a();
                hVar139 = this.f320a.gK;
                com.google.apps.tiktok.contrib.work.b.p pVar2 = (com.google.apps.tiktok.contrib.work.b.p) hVar139.a();
                jyVar117 = this.f320a.f319a;
                hVar140 = jyVar117.dK;
                com.google.android.libraries.search.rendering.xuikit.c.e.n nVar2 = (com.google.android.libraries.search.rendering.xuikit.c.e.n) hVar140.a();
                jyVar118 = this.f320a.f319a;
                hVar141 = jyVar118.dL;
                return new com.google.android.libraries.search.rendering.xuikit.b.t(context10, nVar, cgVar, aVar12, pVar2, nVar2, (com.google.android.libraries.search.rendering.xuikit.c.e.s) hVar141.a());
            case 672:
                jo joVar9 = this.f320a;
                com.google.apps.tiktok.q.b.h b8 = com.google.android.libraries.search.rendering.xuikit.b.aa.b();
                com.google.apps.tiktok.q.b.k nb = joVar9.nb();
                hVar142 = joVar9.w;
                return com.google.android.libraries.search.rendering.xuikit.b.aa.d(b8, nb, (com.google.android.libraries.storage.a.j) hVar142.a());
            case 673:
                jyVar119 = this.f320a.f319a;
                hVar143 = jyVar119.dJ;
                jo joVar10 = this.f320a;
                com.google.android.libraries.search.rendering.xuikit.c.e.q rK = jy.rK();
                hVar144 = joVar10.f;
                return com.google.android.libraries.search.rendering.xuikit.c.f.c.h(hVar143, rK, (Context) hVar144.a());
            case 674:
                jyVar120 = this.f320a.f319a;
                hVar145 = jyVar120.tk;
                com.google.android.gms.clearcut.m mVar = (com.google.android.gms.clearcut.m) hVar145.a();
                hVar146 = this.f320a.H;
                return com.google.android.libraries.search.rendering.xuikit.c.f.c.i(mVar, (cr) hVar146.a());
            case 675:
                hVar147 = this.f320a.bl;
                com.google.android.gms.clearcut.a.b bVar13 = (com.google.android.gms.clearcut.a.b) hVar147.a();
                hVar148 = this.f320a.f;
                return com.google.android.libraries.search.rendering.xuikit.c.f.c.j(bVar13, (Context) hVar148.a());
            case 676:
                jyVar121 = this.f320a.f319a;
                hVar149 = jyVar121.dK;
                com.google.android.libraries.search.rendering.xuikit.c.e.n nVar3 = (com.google.android.libraries.search.rendering.xuikit.c.e.n) hVar149.a();
                jo joVar11 = this.f320a;
                at i3 = at.i();
                at rI = jy.rI();
                com.google.android.libraries.search.rendering.xuikit.c.e.q rK2 = jy.rK();
                hVar150 = joVar11.f;
                return new com.google.android.libraries.search.rendering.xuikit.c.e.s(nVar3, i3, rI, rK2, (Context) hVar150.a());
            case 677:
                hVar151 = this.f320a.kE;
                return new com.google.android.libraries.aj.a.b.a.b.a.a((com.google.android.libraries.aj.a.b.a.d) hVar151.a());
            case 678:
                hVar152 = this.f320a.bH;
                com.google.apps.tiktok.account.data.aa aaVar2 = (com.google.apps.tiktok.account.data.aa) hVar152.a();
                jo joVar12 = this.f320a;
                com.google.apps.tiktok.account.data.m mn = joVar12.mn();
                hVar153 = joVar12.H;
                return new com.google.apps.tiktok.account.data.av(aaVar2, mn, (Executor) hVar153.a());
            case 679:
                hVar154 = this.f320a.f;
                Context context11 = (Context) hVar154.a();
                jyVar122 = this.f320a.f319a;
                Set qn = jyVar122.qn();
                hVar155 = this.f320a.H;
                cq cqVar4 = (cq) hVar155.a();
                hVar156 = this.f320a.L;
                return new com.google.apps.tiktok.account.data.device.j(context11, qn, cqVar4, (com.google.apps.tiktok.concurrent.k) hVar156.a());
            case 680:
                jyVar123 = this.f320a.f319a;
                hVar157 = jyVar123.ul;
                return new androidx.work.c((androidx.work.b) hVar157.a());
            case 681:
                at k3 = at.k(this.f320a.mB());
                hVar158 = this.f320a.v;
                cr crVar2 = (cr) hVar158.a();
                hVar159 = this.f320a.R;
                m.c.n nVar4 = (m.c.n) hVar159.a();
                hVar160 = this.f320a.bz;
                com.google.apps.tiktok.concurrent.ao aoVar = (com.google.apps.tiktok.concurrent.ao) hVar160.a();
                jyVar124 = this.f320a.f319a;
                hVar161 = jyVar124.uk;
                return com.google.apps.tiktok.contrib.work.b.q.b(k3, crVar2, nVar4, aoVar, (bb) hVar161.a());
            case 682:
                jyVar125 = this.f320a.f319a;
                return com.google.android.libraries.r.a.b(jyVar125.pQ());
            case 683:
                hVar162 = this.f320a.f;
                Context context12 = (Context) hVar162.a();
                hVar163 = this.f320a.gH;
                ah ahVar = (ah) hVar163.a();
                jo joVar13 = this.f320a;
                Map rD = jy.rD();
                hVar164 = joVar13.v;
                Executor executor2 = (Executor) hVar164.a();
                hVar165 = this.f320a.H;
                return com.google.android.libraries.assistant.auto.tng.actionscache.e.e.b(context12, ahVar, rD, executor2, (Executor) hVar165.a());
            case 684:
                jyVar126 = this.f320a.f319a;
                hVar166 = jyVar126.rI;
                return com.google.android.apps.search.assistant.verticals.ambient.n.ab.c(hVar166, this.f320a.aeb());
            case 685:
                hVar167 = this.f320a.f;
                Context context13 = (Context) hVar167.a();
                hVar168 = this.f320a.gH;
                ah ahVar2 = (ah) hVar168.a();
                jo joVar14 = this.f320a;
                Map rD2 = jy.rD();
                hVar169 = joVar14.v;
                Executor executor3 = (Executor) hVar169.a();
                hVar170 = this.f320a.H;
                return com.google.android.apps.search.assistant.surfaces.voice.i.e.f.b(context13, ahVar2, rD2, executor3, (Executor) hVar170.a());
            case 686:
                jyVar127 = this.f320a.f319a;
                hVar171 = jyVar127.ru;
                return com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.ab.b(hVar171, this.f320a.aeb());
            case 687:
                jyVar128 = this.f320a.f319a;
                hVar172 = jyVar128.cK;
                return com.google.android.apps.search.podcasts.autodownload.l.c(hVar172, this.f320a.aeb());
            case 688:
                jyVar129 = this.f320a.f319a;
                hVar173 = jyVar129.th;
                return com.google.android.libraries.search.o.c.b(hVar173, this.f320a.aeb());
            case 689:
                hVar174 = this.f320a.f;
                Context context14 = (Context) hVar174.a();
                hVar175 = this.f320a.gH;
                ah ahVar3 = (ah) hVar175.a();
                jo joVar15 = this.f320a;
                Map rD3 = jy.rD();
                hVar176 = joVar15.v;
                Executor executor4 = (Executor) hVar176.a();
                hVar177 = this.f320a.H;
                return com.google.android.libraries.lens.view.f.d.b(context14, ahVar3, rD3, executor4, (Executor) hVar177.a());
            case 690:
                jyVar130 = this.f320a.f319a;
                hVar178 = jyVar130.rG;
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.g.d.b(hVar178, this.f320a.aeb());
            case 691:
                jyVar131 = this.f320a.f319a;
                hVar179 = jyVar131.rv;
                return com.google.android.apps.gsa.staticplugins.opa.smartspace.b.a.h.b(hVar179, this.f320a.aeb());
            case 692:
                jyVar132 = this.f320a.f319a;
                hVar180 = jyVar132.tl;
                return com.google.android.libraries.search.rendering.xuikit.b.aa.c(hVar180, this.f320a.aeb());
            case 693:
                hVar181 = this.f320a.f;
                Context context15 = (Context) hVar181.a();
                hVar182 = this.f320a.gH;
                ah ahVar4 = (ah) hVar182.a();
                jo joVar16 = this.f320a;
                Map rD4 = jy.rD();
                hVar183 = joVar16.v;
                Executor executor5 = (Executor) hVar183.a();
                hVar184 = this.f320a.H;
                return com.google.android.apps.search.googleapp.search.suggest.sources.a.m.d(context15, ahVar4, rD4, executor5, (Executor) hVar184.a());
            case 694:
                hVar185 = this.f320a.f;
                Context context16 = (Context) hVar185.a();
                hVar186 = this.f320a.gH;
                ah ahVar5 = (ah) hVar186.a();
                jo joVar17 = this.f320a;
                Map rD5 = jy.rD();
                hVar187 = joVar17.v;
                Executor executor6 = (Executor) hVar187.a();
                hVar188 = this.f320a.H;
                return com.google.android.apps.search.googleapp.search.suggest.plugins.c.b.o.b(context16, ahVar5, rD5, executor6, (Executor) hVar188.a());
            case 695:
                jyVar133 = this.f320a.f319a;
                hVar189 = jyVar133.sh;
                return com.google.android.libraries.assistant.auto.tng.suggestions.datastore.f.e.c(hVar189, this.f320a.aeb());
            case 696:
                jyVar134 = this.f320a.f319a;
                hVar190 = jyVar134.si;
                return com.google.android.libraries.assistant.auto.tng.suggestions.datastore.f.e.b(hVar190, this.f320a.aeb());
            case 697:
                jyVar135 = this.f320a.f319a;
                hVar191 = jyVar135.rH;
                return com.google.android.apps.search.assistant.surfaces.notification.h.c(hVar191, this.f320a.aeb());
            case 698:
                jyVar136 = this.f320a.f319a;
                hVar192 = jyVar136.rz;
                return com.google.android.apps.gsa.staticplugins.opa.smartspace.d.a.e.b(hVar192, this.f320a.aeb());
            case 699:
                hVar193 = this.f320a.f;
                Context context17 = (Context) hVar193.a();
                hVar194 = this.f320a.gH;
                ah ahVar6 = (ah) hVar194.a();
                jo joVar18 = this.f320a;
                Map rD6 = jy.rD();
                hVar195 = joVar18.v;
                Executor executor7 = (Executor) hVar195.a();
                hVar196 = this.f320a.H;
                return com.google.android.apps.search.googleapp.discover.ae.ag.d(context17, ahVar6, rD6, executor7, (Executor) hVar196.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        com.google.common.base.a k;
        int i = this.b;
        switch (i) {
            case 700:
                return com.google.android.apps.search.googleapp.bubbles.a.p.a((Context) this.f320a.f.a(), (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a());
            case 701:
                return com.google.android.libraries.search.l.e.m.a((Context) this.f320a.f.a(), (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a());
            case 702:
                Context context = (Context) this.f320a.f.a();
                return new com.google.apps.tiktok.contrib.work.b.m(context, (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a(), new com.google.android.libraries.web.contrib.h.a.q(context), "cga.libraries.web.contrib.googlesignin.internal.GoogleCookieRefreshWorker");
            case 703:
                jo joVar = this.f320a;
                return com.google.android.libraries.search.account.d.b.e.a(joVar.f319a.dr, joVar.aeb());
            case 704:
                jo joVar2 = this.f320a;
                return com.google.android.apps.search.assistant.platform.pcp.featuredata.d.n.a(joVar2.wx, joVar2.aeb());
            case 705:
                jo joVar3 = this.f320a;
                return com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ae.a(joVar3.wv, joVar3.aeb());
            case 706:
                jo joVar4 = this.f320a;
                return com.google.android.apps.search.googleapp.notifications.accountsettings.aa.d(joVar4.f319a.cE, joVar4.aeb());
            case 707:
                jo joVar5 = this.f320a;
                return com.google.android.apps.gsa.smartspace.e.e.a(joVar5.f319a.bx, joVar5.aeb());
            case 708:
                jo joVar6 = this.f320a;
                return com.google.android.libraries.search.l.b.t.a(joVar6.f319a.dH, joVar6.aeb());
            case 709:
                jo joVar7 = this.f320a;
                return com.google.android.libraries.search.assistant.proactive.ah.b(joVar7.f319a.dw, joVar7.aeb());
            case 710:
                jo joVar8 = this.f320a;
                return com.google.android.apps.gsa.staticplugins.opa.worker.g.c.a(joVar8.f319a.cl, joVar8.aeb());
            case 711:
                jo joVar9 = this.f320a;
                return com.google.android.apps.search.omnient.host.availability.l.b(joVar9.f319a.bf, joVar9.aeb());
            case 712:
                return com.google.android.apps.search.googleapp.discover.r.b.e.a((Context) this.f320a.f.a(), (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a());
            case 713:
                jo joVar10 = this.f320a;
                return com.google.android.apps.search.assistant.verticals.ambient.smartspace.oobe.g.a(joVar10.f319a.cs, joVar10.aeb());
            case 714:
                return com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.b.e.a((Context) this.f320a.f.a(), (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a());
            case 715:
                return com.google.android.apps.search.googleapp.bubbles.a.u.a((Context) this.f320a.f.a(), (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a());
            case 716:
                jo joVar11 = this.f320a;
                h hVar = joVar11.f319a.bd;
                com.google.apps.tiktok.contrib.work.b.ab aeb = joVar11.aeb();
                hVar.getClass();
                return new com.google.apps.tiktok.contrib.work.b.o(new com.google.android.libraries.search.integrations.j.a.e.e(hVar), aeb);
            case 717:
                jo joVar12 = this.f320a;
                return com.google.android.apps.gsa.staticplugins.nga.f.a.e.b.a(joVar12.f319a.cc, joVar12.aeb());
            case 718:
                jo joVar13 = this.f320a;
                return com.google.android.apps.gsa.staticplugins.nga.f.a.e.e.a(joVar13.f319a.ce, joVar13.aeb());
            case 719:
                jo joVar14 = this.f320a;
                h hVar2 = joVar14.f319a.dI;
                com.google.apps.tiktok.contrib.work.b.ab aeb2 = joVar14.aeb();
                hVar2.getClass();
                return new com.google.apps.tiktok.contrib.work.b.o(new com.google.android.libraries.search.integrations.p.a.p(hVar2), aeb2);
            case 720:
                return com.google.android.apps.search.googleapp.search.suggest.plugins.e.e.a((Context) this.f320a.f.a(), (ah) this.f320a.gH.a(), jy.rD(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a());
            case 721:
                jo joVar15 = this.f320a;
                return com.google.android.apps.gsa.staticplugins.opa.worker.g.i.a(joVar15.f319a.cm, joVar15.aeb());
            case 722:
                jo joVar16 = this.f320a;
                return com.google.android.apps.search.googleapp.searchwidget.c.f.a(joVar16.wM, joVar16.aeb());
            case 723:
                jo joVar17 = this.f320a;
                return com.google.android.apps.search.googleapp.searchwidget.c.r.a(joVar17.wO, joVar17.aeb());
            case 724:
                jo joVar18 = this.f320a;
                return com.google.android.apps.search.googleapp.searchwidget.j.m.a(joVar18.wL, joVar18.aeb());
            case 725:
                jo joVar19 = this.f320a;
                return com.google.android.apps.search.assistant.verticals.ambient.u.v.w.a(joVar19.f319a.cu, joVar19.aeb());
            case 726:
                jo joVar20 = this.f320a;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.f.e.a(joVar20.f319a.cq, joVar20.aeb());
            case 727:
                jo joVar21 = this.f320a;
                h hVar3 = joVar21.f319a.dO;
                com.google.apps.tiktok.contrib.work.b.ab aeb3 = joVar21.aeb();
                hVar3.getClass();
                return new com.google.apps.tiktok.contrib.work.b.o(new com.google.apps.tiktok.account.data.aw(hVar3), aeb3);
            case 728:
                jo joVar22 = this.f320a;
                h hVar4 = joVar22.f319a.dQ;
                com.google.apps.tiktok.contrib.work.b.ab aeb4 = joVar22.aeb();
                hVar4.getClass();
                return new com.google.apps.tiktok.contrib.work.b.o(new com.google.apps.tiktok.r.b.a.h(hVar4, 1), aeb4);
            case 729:
                com.google.apps.tiktok.r.b.d dVar = (com.google.apps.tiktok.r.b.d) this.f320a.f319a.bg.a();
                com.google.apps.tiktok.contrib.work.b.p pVar = (com.google.apps.tiktok.contrib.work.b.p) this.f320a.gK.a();
                jo joVar23 = this.f320a;
                return new com.google.apps.tiktok.r.b.a.b(dVar, pVar, joVar23.ne(), (cq) joVar23.H.a(), ((Boolean) this.f320a.ao.a()).booleanValue());
            case 730:
                jo joVar24 = this.f320a;
                h hVar5 = joVar24.f319a.dR;
                com.google.apps.tiktok.contrib.work.b.ab aeb5 = joVar24.aeb();
                hVar5.getClass();
                return new com.google.apps.tiktok.contrib.work.b.o(new com.google.apps.tiktok.r.b.a.h(hVar5, 0), aeb5);
            case 731:
                com.google.apps.tiktok.r.b.d dVar2 = (com.google.apps.tiktok.r.b.d) this.f320a.f319a.bg.a();
                com.google.apps.tiktok.contrib.work.b.p pVar2 = (com.google.apps.tiktok.contrib.work.b.p) this.f320a.gK.a();
                jo joVar25 = this.f320a;
                com.google.apps.tiktok.r.b.ai ne = joVar25.ne();
                cq cqVar = (cq) joVar25.H.a();
                jo joVar26 = this.f320a;
                return new com.google.apps.tiktok.r.b.a.g(dVar2, pVar2, ne, cqVar, joVar26.ju(), ((Boolean) joVar26.ao.a()).booleanValue());
            case 732:
                jo joVar27 = this.f320a;
                return com.google.android.apps.search.assistant.verticals.reminders.e.h.a(joVar27.f319a.cD, joVar27.aeb());
            case 733:
                jo joVar28 = this.f320a;
                return com.google.android.libraries.mdi.download.workmanager.a.d.a(joVar28.f319a.cU, joVar28.aeb());
            case 734:
                jo joVar29 = this.f320a;
                h hVar6 = joVar29.wU;
                com.google.apps.tiktok.contrib.work.b.ab aeb6 = joVar29.aeb();
                hVar6.getClass();
                return new com.google.apps.tiktok.contrib.work.b.o(new com.google.apps.tiktok.contrib.work.b.w(hVar6), aeb6);
            case 735:
                return new com.google.apps.tiktok.account.b.d((Context) this.f320a.f.a(), (com.google.apps.tiktok.account.data.ao) this.f320a.ap.a(), (cq) this.f320a.v.a());
            case 736:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.b.a.b((SharedPreferences) this.f320a.gf.a(), (Context) this.f320a.f.a());
            case 737:
                AlarmManager a2 = com.google.android.apps.gsa.shared.u.a.a((Context) this.f320a.f.a());
                a2.getClass();
                return a2;
            case 738:
                return new com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.k((com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.g) this.f320a.f319a.dW.a());
            case 739:
                return new com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.g((com.google.android.libraries.gsa.h.h) this.f320a.qY.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gv.a());
            case 740:
                return new com.google.android.apps.gsa.staticplugins.opa.util.b((an) this.f320a.gB.a(), this.f320a.f319a.aN());
            case 741:
                return com.google.android.apps.gsa.staticplugins.opa.ae.b.b.a((com.google.android.apps.gsa.staticplugins.opa.ae.b.a) this.f320a.pC.a(), c.b(this.f320a.f319a.ei));
            case 742:
                return new com.google.android.apps.gsa.staticplugins.opa.ae.a.e((lt) this.f320a.f319a.eh.a(), (at) this.f320a.pI.a(), jy.rU());
            case 743:
                return new lt(this);
            case 744:
                jy jyVar = this.f320a.f319a;
                return new com.google.android.libraries.home.coreui.devicetile.ad(jyVar.dZ, jyVar.ea, jyVar.eb, jyVar.ec, jyVar.ed, jyVar.ee);
            case 745:
                Executor executor = (Executor) this.f320a.B.a();
                executor.getClass();
                return dc.m(executor);
            case 746:
                Context context2 = (Context) this.f320a.f.a();
                jo joVar30 = this.f320a;
                return new com.google.android.libraries.home.coreui.devicetile.i(context2, joVar30.f319a.qC(), (m.c.n) joVar30.f319a.dZ.a());
            case 747:
                return new com.google.android.libraries.home.coreui.devicetile.bb();
            case 748:
                return com.google.android.libraries.home.coreui.devicetile.bb.d(Optional.empty());
            case 749:
                return com.google.android.libraries.home.coreui.devicetile.a.d.a(Optional.empty());
            case 750:
                return com.google.android.libraries.home.coreui.devicetile.b.d.a(Optional.empty());
            case 751:
                return new com.google.android.libraries.home.coreui.devicetile.bb();
            case 752:
                return new com.google.android.libraries.assistant.assistantactions.d.b.b((com.google.android.apps.gsa.shared.aa.d.i) this.f320a.f319a.ej.a());
            case 753:
                com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) this.f320a.hO.a();
                p pVar3 = (p) this.f320a.gq.a();
                com.google.android.apps.gsa.search.core.ac.t tVar = (com.google.android.apps.gsa.search.core.ac.t) this.f320a.kg.a();
                jo joVar31 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.bk.a.h(bVar, pVar3, tVar, joVar31.f319a.aL(), (com.google.android.libraries.search.t.i.y) joVar31.W.a(), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 754:
                return com.google.android.apps.gsa.staticplugins.ab.a.c.a((cn) this.f320a.f319a.em.a());
            case 755:
                return ((com.google.android.apps.gsa.staticplugins.ab.c) this.f320a.f319a.el.a()).a;
            case 756:
                return this.f320a.f319a.aj().a();
            case 757:
                return new com.google.android.apps.gsa.staticplugins.ab.a.a((com.google.android.apps.gsa.search.core.k.a.a) this.f320a.f319a.el.a());
            case 758:
                return new com.google.apps.tiktok.tracing.contrib.o.a((dj) this.f320a.bK.a());
            case 759:
                return new com.google.android.libraries.search.rendering.xuikit.a.e((com.google.android.libraries.search.rendering.xuikit.c.h.y) this.f320a.f319a.ep.a(), (Context) this.f320a.f.a(), (cq) this.f320a.n.a(), (ci) this.f320a.ft.a(), (com.google.android.libraries.search.rendering.xuikit.c.e.n) this.f320a.f319a.dK.a());
            case 760:
                ag agVar = (ag) this.f320a.f319a.eo.a();
                com.google.android.libraries.search.rendering.xuikit.c.c.d dVar3 = (com.google.android.libraries.search.rendering.xuikit.c.c.d) this.f320a.iZ.a();
                com.google.android.libraries.search.rendering.xuikit.c.h.v eu = this.f320a.f319a.eu();
                com.google.android.libraries.search.rendering.xuikit.c.h.c cVar = new com.google.android.libraries.search.rendering.xuikit.c.h.c();
                com.google.android.libraries.search.rendering.xuikit.c.h.e eVar = new com.google.android.libraries.search.rendering.xuikit.c.h.e();
                com.google.android.libraries.search.rendering.xuikit.c.h.b bVar2 = (com.google.android.libraries.search.rendering.xuikit.c.h.b) this.f320a.f319a.eq.a();
                com.google.android.libraries.search.rendering.xuikit.c.h.t tVar2 = (com.google.android.libraries.search.rendering.xuikit.c.h.t) this.f320a.f319a.er.a();
                jo joVar32 = this.f320a;
                return new com.google.android.libraries.search.rendering.xuikit.c.h.y(agVar, dVar3, eu, cVar, eVar, bVar2, tVar2, joVar32.f319a.es(), joVar32.f319a.et(), (com.google.android.libraries.search.rendering.xuikit.c.h.h) joVar32.f319a.et.a(), (ci) this.f320a.ft.a(), (com.google.android.libraries.search.rendering.xuikit.c.e.n) this.f320a.f319a.dK.a(), (Context) this.f320a.f.a());
            case 761:
                return com.google.android.libraries.search.rendering.xuikit.c.f.g.h(at.k((ag) this.f320a.bo.a()), this.f320a.v);
            case 762:
                return new com.google.android.libraries.search.rendering.xuikit.c.h.b((Context) this.f320a.f.a(), (com.google.android.libraries.search.rendering.xuikit.c.e.n) this.f320a.f319a.dK.a(), (ag) this.f320a.f319a.eo.a(), this.f320a.f319a.ep);
            case 763:
                return new com.google.android.libraries.search.rendering.xuikit.c.h.t();
            case 764:
                return com.google.android.libraries.search.rendering.xuikit.c.f.g.b((at) this.f320a.f319a.es.a(), this.f320a.f319a.sl());
            case 765:
                com.google.android.libraries.search.rendering.xuikit.c.h.ae ev = this.f320a.f319a.ev();
                if (h.a.a.av.a.a.j.e(ev.b)) {
                    com.google.common.base.bd bdVar = ev.c;
                    Context context3 = ev.b;
                    com.google.android.libraries.storage.protostore.af afVar = (com.google.android.libraries.storage.protostore.af) bdVar.a;
                    com.google.android.libraries.storage.a.a.d dVar4 = new com.google.android.libraries.storage.a.a.d(context3);
                    com.google.android.libraries.storage.a.a.e.b("xuikit");
                    dVar4.c = "xuikit";
                    dVar4.c("SrsResourceCache.pb");
                    Uri a3 = dVar4.a();
                    com.google.android.libraries.search.rendering.xuikit.c.h.ad adVar = new com.google.android.libraries.search.rendering.xuikit.c.h.ad(ev, a3);
                    dl.q(ex.k(adVar), ev.e);
                    com.google.android.libraries.storage.protostore.ab a4 = com.google.android.libraries.storage.protostore.ac.a();
                    a4.e(a3);
                    a4.d(com.google.bz.k.b.b.a.c.a);
                    k = at.k(afVar.a(a4.a()));
                } else {
                    com.google.common.f.h f = com.google.android.libraries.search.rendering.xuikit.c.h.ae.a.f();
                    f.ak(58881);
                    f.p("SRS disk cache is not enabled");
                    k = com.google.common.base.a.a;
                }
                return k;
            case 766:
                return new com.google.android.libraries.search.silk.impl.share.d((Context) this.f320a.f.a());
            case 767:
                return com.google.android.libraries.logging.ve.synthetic.l.d((com.google.android.libraries.logging.ve.synthetic.f) this.f320a.f319a.du.a());
            case 768:
                return new com.google.android.libraries.logging.ve.synthetic.l();
            case 769:
                Context context4 = (Context) this.f320a.f.a();
                com.google.android.apps.gsa.shared.util.c.a.an anVar = (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a();
                PackageManager packageManager = (PackageManager) this.f320a.h.a();
                c.b(this.f320a.nu);
                return new com.google.android.apps.gsa.shared.c.d(context4, anVar, packageManager, c.b(this.f320a.f319a.bB), c.b(this.f320a.hO));
            case 770:
                return new com.google.android.apps.gsa.staticplugins.opa.translator.b.z((Context) this.f320a.f.a());
            case 771:
                return new com.google.android.libraries.gcoreclient.n.a.k();
            case 772:
                return new com.google.android.libraries.gcoreclient.n.a.l();
            case 773:
                return new com.google.android.libraries.gcoreclient.n.a.d();
            case 774:
                return new com.google.android.libraries.gcoreclient.n.a.n();
            case 775:
                return new com.google.android.apps.gsa.staticplugins.opa.aq.a();
            case 776:
                return new com.google.android.apps.gsa.staticplugins.opa.ak.l();
            case 777:
                return com.google.android.apps.gsa.staticplugins.i.b.a.a((p) this.f320a.gq.a(), (com.google.android.apps.gsa.staticplugins.nga.ui.b.a) this.f320a.f319a.av.a(), (at) this.f320a.gS.a(), this.f320a.f319a.st().m());
            case 778:
                return new com.google.android.apps.gsa.staticplugins.opa.zerostate.u((com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), (com.google.android.apps.gsa.tasks.m) this.f320a.gP.a());
            case 779:
                Context context5 = (Context) this.f320a.f.a();
                p pVar4 = (p) this.f320a.gq.a();
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a();
                c.b(this.f320a.gV);
                e.a b = c.b(this.f320a.oZ);
                int intValue = ((Integer) this.f320a.gj.a()).intValue();
                jo joVar33 = this.f320a;
                return new com.google.android.apps.gsa.f.b.l(context5, pVar4, anVar2, b, intValue, (com.google.android.apps.gsa.f.b.f) joVar33.f319a.pk(), joVar33.f319a.C());
            case 780:
                return new com.google.android.apps.gsa.assist.f.a.c((com.google.android.apps.gsa.assist.f.a.b) this.f320a.f319a.aD.a());
            case 781:
                return new com.google.android.libraries.gcoreclient.k.a.a.a.a();
            case 782:
                return new com.google.android.libraries.gcoreclient.k.a.a.a.c();
            case 783:
                return new gn((br) this.f320a.f319a.eI.a(), (com.google.android.apps.gsa.staticplugins.opa.util.ad) this.f320a.ie.a(), this.f320a.f319a.rY());
            case 784:
                Context context6 = (Context) this.f320a.f.a();
                com.google.android.libraries.gsa.h.h hVar7 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                p pVar5 = (p) this.f320a.gq.a();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f320a.gf.a();
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f320a.g.a();
                at atVar = (at) this.f320a.qy.a();
                com.google.android.apps.gsa.assistant.shared.z zVar = (com.google.android.apps.gsa.assistant.shared.z) this.f320a.gt.a();
                e.a b2 = c.b(this.f320a.gE);
                com.google.android.apps.gsa.assist.c.a.a aVar2 = (com.google.android.apps.gsa.assist.c.a.a) this.f320a.is.a();
                com.google.android.apps.gsa.staticplugins.opa.util.br brVar = (com.google.android.apps.gsa.staticplugins.opa.util.br) this.f320a.ic.a();
                com.google.android.apps.gsa.speech.k.a aVar3 = (com.google.android.apps.gsa.speech.k.a) this.f320a.hY.a();
                com.google.android.apps.gsa.staticplugins.opa.util.ad adVar2 = (com.google.android.apps.gsa.staticplugins.opa.util.ad) this.f320a.ie.a();
                boolean booleanValue = ((Boolean) this.f320a.hi.a()).booleanValue();
                an anVar3 = (an) this.f320a.gB.a();
                jo joVar34 = this.f320a;
                cs rY = joVar34.f319a.rY();
                com.google.android.apps.gsa.staticplugins.opa.errorui.aw aw = joVar34.f319a.aw();
                Object pj = joVar34.f319a.pj();
                e.a b3 = c.b(joVar34.ld);
                jo joVar35 = this.f320a;
                Object pm = joVar35.f319a.pm();
                return new br(context6, hVar7, pVar5, sharedPreferences, aVar, atVar, zVar, b2, aVar2, brVar, aVar3, adVar2, booleanValue, anVar3, rY, aw, (com.google.android.apps.gsa.staticplugins.opa.errorui.at) pj, b3, (ax) pm, (com.google.android.apps.gsa.assist.a.k) this.f320a.io.a(), (at) this.f320a.ix.a(), at.k(c.b(this.f320a.hf)));
            case 785:
                com.google.android.apps.gsa.staticplugins.opa.util.calendar.d a5 = com.google.android.apps.gsa.staticplugins.opa.util.calendar.a.a.a(c.b(this.f320a.f319a.eN), c.b(this.f320a.f319a.eO), (com.google.android.enterprise.connectedapps.c) this.f320a.f319a.eK.a());
                a5.getClass();
                return a5;
            case 786:
                return new com.google.android.apps.gsa.staticplugins.opa.util.calendar.i((com.google.android.apps.gsa.staticplugins.opa.util.calendar.j) this.f320a.f319a.eL.a(), (com.google.android.apps.gsa.staticplugins.opa.util.calendar.j) this.f320a.f319a.eM.a(), ((com.google.android.enterprise.connectedapps.c) this.f320a.f319a.eK.a()).j());
            case 787:
                return new com.google.android.apps.gsa.staticplugins.opa.util.calendar.j((com.google.android.enterprise.connectedapps.c) this.f320a.f319a.eK.a());
            case 788:
                return com.google.android.apps.gsa.staticplugins.opa.util.calendar.c.a((Context) this.f320a.f.a());
            case 789:
                return new com.google.android.apps.gsa.staticplugins.opa.util.calendar.j((com.google.android.enterprise.connectedapps.c) this.f320a.f319a.eK.a());
            case 790:
                return new com.google.android.apps.gsa.staticplugins.opa.util.calendar.f((com.google.android.apps.gsa.staticplugins.opa.util.calendar.o) this.f320a.f319a.ci.a(), (com.google.android.apps.gsa.staticplugins.opa.util.calendar.j) this.f320a.f319a.cj.a());
            case 791:
                jo joVar36 = this.f320a;
                return new com.google.android.libraries.logging.ve.f.h(joVar36.ql, joVar36.qn, joVar36.qm);
            case 792:
                return new com.google.android.libraries.logging.ve.y((com.google.android.libraries.logging.c.h) this.f320a.qh.a(), (com.google.android.libraries.logging.b.a) this.f320a.qi.a());
            case 793:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.o.e((Context) this.f320a.f.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a(), (com.google.android.apps.gsa.staticplugins.opa.samson.o.i) this.f320a.f319a.eR.a(), (com.google.android.apps.gsa.assistant.settings.shared.f) this.f320a.nE.a(), (com.google.android.apps.gsa.staticplugins.opa.samson.o.c) this.f320a.ow.a());
            case 794:
                return new androidx.lifecycle.an();
            case 795:
                Context context7 = (Context) this.f320a.f.a();
                at atVar2 = (at) this.f320a.pI.a();
                return new com.google.android.apps.gsa.staticplugins.opa.zerostate.k.ab(context7, atVar2, (PackageManager) this.f320a.h.a());
            case 796:
                return new com.google.android.apps.gsa.shared.util.ao();
            case 797:
                return new com.google.android.apps.gsa.shared.speech.a.i((cg) this.f320a.f319a.eW.a());
            case 798:
                Context context8 = (Context) this.f320a.f.a();
                com.google.android.libraries.storage.protostore.af afVar2 = (com.google.android.libraries.storage.protostore.af) this.f320a.aA.a();
                com.google.android.libraries.storage.a.a.d dVar5 = new com.google.android.libraries.storage.a.a.d(context8);
                com.google.android.libraries.storage.a.a.e.b("hotwordcheckin");
                dVar5.c = "hotwordcheckin";
                dVar5.c("HotwordCheckin.pb");
                Uri a6 = dVar5.a();
                com.google.android.libraries.storage.protostore.ab a7 = com.google.android.libraries.storage.protostore.ac.a();
                a7.e(a6);
                a7.d(hy.a);
                a7.b = com.google.android.libraries.storage.protostore.aq.f5565a;
                return afVar2.a(a7.a());
            case 799:
                return new com.google.android.apps.gsa.staticplugins.nga.m.b((com.google.common.v.f) this.f320a.ez.a(), (Context) this.f320a.f.a(), (com.google.android.apps.gsa.shared.util.q.a) this.f320a.hh.a(), (ag) this.f320a.Q.a(), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) this.f320a.gT.a(), (com.google.android.apps.gsa.shared.util.debug.d) this.f320a.aD.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        switch (i) {
            case 800:
                return new com.google.android.apps.gsa.staticplugins.opa.an.d.a.a();
            case 801:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.a.a.a.d();
            case 802:
                return new com.google.android.apps.gsa.staticplugins.opa.p.c((com.google.android.libraries.g.a) this.f320a.g.a(), c.b(this.f320a.gf), c.b(this.f320a.gB));
            case 803:
                return new com.google.android.apps.gsa.assistant.shared.s.l((an) this.f320a.gB.a(), (com.google.android.apps.gsa.assistant.shared.au) this.f320a.pi.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a(), (com.google.android.apps.gsa.shared.util.q.a) this.f320a.hh.a(), (com.google.android.apps.gsa.assistant.settings.shared.t) this.f320a.gW.a());
            case 804:
                return new com.google.android.apps.gsa.staticplugins.opa.s.a((com.google.android.libraries.g.a) this.f320a.g.a());
            case 805:
                return new com.google.android.libraries.search.k.a.b();
            case 806:
                return new com.google.android.apps.gsa.staticplugins.opa.dt((com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), (com.google.android.apps.gsa.staticplugins.ba.ag) this.f320a.nG.a(), (com.google.android.apps.gsa.staticplugins.opa.zerostate.u) this.f320a.f319a.eF.a(), (p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 807:
                return new com.google.android.apps.gsa.staticplugins.opa.n.q((Context) this.f320a.f.a(), this.f320a.f319a.au());
            case 808:
                return new com.google.android.apps.gsa.staticplugins.opa.ao.l((p) this.f320a.gq.a());
            case 809:
                return new com.google.android.apps.gsa.staticplugins.opa.n.ad((com.google.android.apps.gsa.staticplugins.opa.n.v) this.f320a.zb.a());
            case 810:
                com.google.android.apps.gsa.shared.util.c.a.g gVar = (com.google.android.apps.gsa.shared.util.c.a.g) this.f320a.ha.a();
                c.b(this.f320a.hG);
                c.b(this.f320a.gF);
                return new com.google.android.apps.gsa.staticplugins.opa.g.b(gVar);
            case 811:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.a.b.e.a.b();
            case 812:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.a.b.h.a.b();
            case 813:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.a.b.d.a.a();
            case 814:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.a.b.g.a.a();
            case 815:
                return new com.google.android.apps.gsa.staticplugins.immersiveactions.i(this.f320a.f319a.ff);
            case 816:
                return new fb(this.f320a);
            case 817:
                return new com.google.android.apps.gsa.staticplugins.opa.bc.a.a((p) this.f320a.gq.a());
            case 818:
                return at.k((com.google.android.apps.gsa.shared.p.a.a) this.f320a.f319a.fn.a());
            case 819:
                an anVar = (an) this.f320a.gB.a();
                jy jyVar = this.f320a.f319a;
                jo joVar = jyVar.f326a;
                return new com.google.android.apps.gsa.staticplugins.cf.d(anVar, new com.google.android.apps.gsa.staticplugins.cf.c(joVar.gq, joVar.f, jyVar.fh, jyVar.fi, joVar.hx, jyVar.fj, jyVar.fk, jyVar.fl, jyVar.fm, joVar.gA, joVar.gm));
            case 820:
                return new com.google.android.libraries.gcoreclient.v.a.c.d();
            case 821:
                return new com.google.android.libraries.gcoreclient.v.a.c.e();
            case 822:
                return new com.google.android.libraries.gcoreclient.v.b.c((byte[]) null);
            case 823:
                return new com.google.android.libraries.gcoreclient.v.b.b();
            case 824:
                return new com.google.android.libraries.gcoreclient.v.a.c.i();
            case 825:
                return new com.google.android.libraries.gcoreclient.v.b.c();
            case 826:
                return new com.google.android.apps.gsa.assistant.shared.p();
            case 827:
                return new com.google.android.apps.gsa.shared.al.a();
            case 828:
                return new ae(this.f320a, 11);
            case 829:
                return new kt();
            case 830:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.g.g((Context) this.f320a.f.a(), (p) this.f320a.gq.a());
            case 831:
                Context context = (Context) this.f320a.f.a();
                p pVar = (p) this.f320a.gq.a();
                com.google.android.apps.gsa.search.core.preferences.n nVar = (com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gf.a();
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f320a.g.a();
                com.google.android.apps.gsa.staticplugins.opa.samson.g.g gVar2 = (com.google.android.apps.gsa.staticplugins.opa.samson.g.g) this.f320a.f319a.ft.a();
                jy jyVar2 = this.f320a.f319a;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.e.b(context, pVar, nVar, aVar, gVar2, new com.google.android.apps.gsa.staticplugins.opa.samson.p.c(jyVar2.fu, jyVar2.fv), (com.google.android.apps.gsa.staticplugins.opa.samson.s.c) this.f320a.f319a.fv.a());
            case 832:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.p.d();
            case 833:
                jo joVar2 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.samson.s.c(joVar2.g, joVar2.gv);
            case 834:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.j.d();
            case 835:
                return new com.google.android.apps.gsa.sidekick.shared.b.d((com.google.android.libraries.gsa.h.h) this.f320a.gv.a(), (com.google.android.apps.gsa.search.shared.service.x) this.f320a.hI.a());
            case 836:
                return new com.google.android.apps.gsa.staticplugins.opa.samson.g.f();
            case 837:
                return new com.google.android.apps.gsa.staticplugins.bisto.e.e(this.f320a.f319a.ah());
            case 838:
                return new com.google.android.apps.search.assistant.surfaces.bisto.e.g.c((Context) this.f320a.ux.a(), (com.google.android.libraries.search.account.b.b) this.f320a.gd.a(), (ag) this.f320a.Q.a());
            case 839:
                return new com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ac();
            case 840:
                return new com.google.android.apps.gsa.staticplugins.bisto.util.ak((com.google.android.apps.gsa.speech.k.a) this.f320a.hY.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.i.f) this.f320a.f319a.fF.a(), c.b(this.f320a.qP), (an) this.f320a.gB.a(), (Executor) this.f320a.v.a(), (Executor) this.f320a.H.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.i.m) this.f320a.f319a.fE.a());
            case 841:
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.i.f((com.google.android.apps.search.assistant.surfaces.bisto.a.i.m) this.f320a.f319a.fE.a(), ((com.google.apps.tiktok.experiments.e) new h.a.a.a.a.a.b.a.a.c(this.f320a.f319a.f326a.V).a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_tng_interactor.device 45658709").f());
            case 842:
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.i.m((com.google.android.libraries.assistant.c.b.c.v) this.f320a.f319a.fD.a(), (com.google.android.libraries.storage.a.j) this.f320a.as.a(), (com.google.android.libraries.assistant.c.b.a.a.a) this.f320a.f319a.dA.a(), (cr) this.f320a.v.a(), (cr) this.f320a.H.a());
            case 843:
                com.google.android.libraries.assistant.c.b.c.v a2 = com.google.android.libraries.assistant.c.b.c.y.a(this.f320a.Vf());
                a2.getClass();
                return a2;
            case 844:
                e.a b = c.b(this.f320a.qP);
                Executor executor = (Executor) this.f320a.v.a();
                com.google.android.apps.gsa.staticplugins.bq.m mVar = (com.google.android.apps.gsa.staticplugins.bq.m) this.f320a.oH.a();
                jy jyVar3 = this.f320a.f319a;
                return new com.google.android.apps.gsa.staticplugins.bisto.util.k(b, executor, mVar, new com.google.android.apps.gsa.staticplugins.bisto.util.ak((com.google.android.apps.gsa.speech.k.a) jyVar3.f326a.hY.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.i.f) jyVar3.fF.a(), c.b(jyVar3.f326a.qP), (an) jyVar3.f326a.gB.a(), (Executor) jyVar3.f326a.v.a(), (Executor) jyVar3.f326a.H.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.i.m) jyVar3.fE.a()), (com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a());
            case 845:
                return new com.google.android.apps.gsa.assistant.settings.features.payments.a(c.b(this.f320a.gf));
            case 846:
                return new cd(this.f320a, 13);
            case 847:
                jy jyVar4 = this.f320a.f319a;
                Context context2 = (Context) jyVar4.f326a.f.a();
                Executor executor2 = (Executor) jyVar4.f326a.v.a();
                com.google.apps.tiktok.q.b.g a3 = com.google.apps.tiktok.q.b.h.a();
                a3.f5883a = "DeviceIdSettings";
                com.google.android.libraries.storage.protostore.be d = com.google.android.libraries.storage.protostore.bg.d(context2, executor2);
                d.c = "GEL.GSAPrefs";
                d.c("key_send_diagnostics", "bistoRecordAudio", "bistoDeeperSocketLogging", "enableLegacyLedControl", "bistoVibrate", "otaProgressNotification", "blackboxTestLogging", "bistoSpeechTestingMode");
                d.d();
                d.e(new com.google.android.apps.search.assistant.surfaces.bisto.a.c.a());
                a3.b().h(d.a());
                a3.c(com.google.android.apps.search.assistant.surfaces.bisto.d.br.a);
                com.google.apps.tiktok.q.b.h a4 = a3.a();
                jo joVar3 = this.f320a;
                return joVar3.nc().a(a4, (com.google.android.libraries.storage.a.j) joVar3.w.a());
            case 848:
                return new com.google.android.libraries.gcoreclient.cast.impl.a();
            case 849:
                jy jyVar5 = this.f320a.f319a;
                return new com.google.android.apps.gsa.speech.hotword.c.a.a(new com.google.android.apps.gsa.speech.hotword.c.a.d((com.google.android.apps.gsa.shared.util.c.a.an) jyVar5.f326a.gy.a(), (an) jyVar5.f326a.gB.a(), (Context) jyVar5.f326a.f.a(), jyVar5.af()), (com.google.android.apps.gsa.speech.hotword.c.d) this.f320a.hX.a());
            case 850:
                return new com.google.android.apps.gsa.shared.i.b.g((com.google.android.libraries.gsa.h.h) this.f320a.gA.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a(), (com.google.android.apps.gsa.shared.v.d) this.f320a.hE.a());
            case 851:
                return at.k((com.google.android.apps.gsa.search.core.f.a.c) com.google.android.apps.gsa.shared.util.ao.b(((com.google.android.apps.gsa.shared.util.c.a.aw) this.f320a.jF.a()).a(com.google.android.apps.gsa.search.core.f.a.a.class), com.google.android.apps.gsa.search.core.f.a.c.class, (com.google.android.apps.gsa.search.core.f.a.c) ((com.google.android.apps.gsa.staticplugins.bz.a) at.k((com.google.android.apps.gsa.staticplugins.bz.a) this.f320a.f319a.fT.a()).a).a.a()));
            case 852:
                return new com.google.android.apps.gsa.staticplugins.bz.a(this.f320a.f319a.fS);
            case 853:
                com.google.android.apps.gsa.staticplugins.bl.f fVar = (com.google.android.apps.gsa.staticplugins.bl.f) this.f320a.oD.a();
                jy jyVar6 = this.f320a.f319a;
                jo joVar4 = jyVar6.f326a;
                com.google.android.apps.gsa.staticplugins.bz.a.j jVar = new com.google.android.apps.gsa.staticplugins.bz.a.j(joVar4.gy, jyVar6.fO, joVar4.gq, joVar4.gV, joVar4.gB, joVar4.oF, joVar4.pE, e.c.i.b(joVar4.hD), e.c.i.b(jyVar6.f326a.oE));
                com.google.android.apps.gsa.x.a.k kVar = (com.google.android.apps.gsa.x.a.k) this.f320a.f319a.fP.a();
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a();
                com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) this.f320a.gv.a();
                e.a b2 = c.b(this.f320a.gF);
                com.google.android.apps.gsa.shared.logger.b.h hVar2 = (com.google.android.apps.gsa.shared.logger.b.h) this.f320a.hG.a();
                e.a b3 = c.b(this.f320a.f319a.fR);
                jo joVar5 = this.f320a;
                com.google.android.apps.gsa.staticplugins.bz.b.f aU = joVar5.f319a.aU();
                return new com.google.android.apps.gsa.staticplugins.bz.a.d(fVar, jVar, kVar, anVar2, hVar, b2, hVar2, b3, aU, (com.google.android.apps.gsa.shared.v.ae) this.f320a.hJ.a());
            case 854:
                return new com.google.android.apps.gsa.speech.m.c((p) this.f320a.gq.a());
            case 855:
                return new com.google.android.apps.gsa.x.a.k((com.google.android.apps.gsa.x.a.e) this.f320a.ps.a(), (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a(), (Context) this.f320a.f.a(), c.b(this.f320a.hG));
            case 856:
                return at.k((com.google.android.apps.gsa.staticplugins.bx.a) this.f320a.f319a.fQ.a());
            case 857:
                return new com.google.android.apps.gsa.staticplugins.bx.a();
            case 858:
                com.google.android.apps.gsa.shared.util.c.a.au a5 = this.f320a.de().a("EventBus", -2);
                a5.a(new ca() { // from class: com.google.android.apps.gsa.search.core.service.a.a.a
                    public final Object a() {
                        return "Event Bus thread startup";
                    }
                }, new Runnable() { // from class: com.google.android.apps.gsa.search.core.service.a.a.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.common.f.h d2 = c.f1148a.d();
                        d2.aj(com.google.common.f.a.e.a, "EventBusThread");
                        com.google.common.f.h hVar3 = d2;
                        hVar3.ak(7341);
                        hVar3.q("Event Bus thread starting with TID %d", Process.myTid());
                    }
                });
                return a5;
            case 859:
                return new com.google.android.apps.gsa.staticplugins.bv.a.j((com.google.android.apps.gsa.store.c) this.f320a.f319a.fV.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), (an) this.f320a.gB.a(), (com.google.android.libraries.search.account.k) this.f320a.bM.a());
            case 860:
                jo joVar6 = this.f320a;
                com.google.android.apps.gsa.staticplugins.bv.b.u eL = joVar6.eL();
                ca caVar = (ca) joVar6.nA.a();
                jo joVar7 = this.f320a;
                ca nD = joVar7.nD();
                com.google.android.apps.gsa.shared.util.debug.d dVar = (com.google.android.apps.gsa.shared.util.debug.d) joVar7.aD.a();
                com.google.android.apps.gsa.staticplugins.bv.b.t a6 = eL.a("state_dump_event_content_store", com.google.android.apps.gsa.s.c.CONTENT_STORE_STATE_DUMP_EVENT, new com.google.android.apps.gsa.staticplugins.bv.b.k(nD, com.google.android.apps.gsa.staticplugins.bv.b.j.a), caVar);
                dVar.a(a6);
                return a6;
            case 861:
                return new com.google.android.apps.gsa.shared.r.a();
            case 862:
                return ((com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.xw.a()).k("Cookies thread");
            case 863:
                ((com.google.android.libraries.web.webview.f.a.b) this.f320a.wC.a()).getClass();
                return new com.google.android.libraries.web.o.w();
            case 864:
                jo joVar8 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.w.s(joVar8.f319a.eE(), joVar8.f319a.eD(), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) joVar8.gT.a(), (Executor) this.f320a.H.a());
            case 865:
                jy jyVar7 = this.f320a.f319a;
                com.google.android.libraries.web.d.b bVar = (com.google.android.libraries.web.d.b) jyVar7.fX.a();
                final com.google.android.libraries.web.n.b bVar2 = (com.google.android.libraries.web.n.b) jyVar7.f326a.uF.a();
                bVar.getClass();
                bVar2.getClass();
                com.google.apps.tiktok.q.b.g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "WebX_WebViewAccountInfo";
                a7.c(com.google.android.libraries.web.webview.a.b.f5634a);
                a7.b = at.k(new com.google.common.util.concurrent.q(bVar2) { // from class: com.google.android.libraries.web.webview.a.a

                    /* renamed from: a, reason: collision with root package name */
                    public final com.google.android.libraries.web.n.b f5633a;

                    {
                        this.f5633a = bVar2;
                    }

                    public final cn a() {
                        return dl.n(this.f5633a.a());
                    }
                });
                com.google.apps.tiktok.q.b.h a8 = a7.a();
                jo joVar9 = this.f320a;
                return joVar9.nb().a(a8, (com.google.android.libraries.storage.a.j) joVar9.w.a());
            case 866:
                Optional of = Optional.of(this.f320a.f319a.eC());
                of.isPresent();
                return of.get();
            case 867:
                return new kotlinx.coroutines.i.d();
            case 868:
                return new com.google.android.libraries.web.a.a.a();
            case 869:
                return new com.google.android.libraries.web.webview.a.f(nr.a, (Executor) this.f320a.H.a());
            case 870:
                return new com.google.android.apps.gsa.staticplugins.ah.f((com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a(), c.b(this.f320a.gF), this.f320a.f319a.gc);
            case 871:
                return new com.google.android.libraries.gcoreclient.h.a.a(com.google.android.gms.droidguard.a.a((Context) this.f320a.f.a(), "hallmonitor"));
            case 872:
                com.google.android.apps.gsa.search.core.google.ai aiVar = (com.google.android.apps.gsa.search.core.google.ai) this.f320a.hM.a();
                return new com.google.android.apps.gsa.staticplugins.w.d(aiVar);
            case 873:
                return new com.google.android.libraries.readaloud.audio.b.r((com.google.apps.tiktok.media.j) this.f320a.ne.a());
            case 874:
                return new com.google.android.libraries.readaloud.g.d(at.k((bz) this.f320a.hP.a()), at.k((com.google.android.libraries.storage.protostore.af) this.f320a.aA.a()), at.k(this.f320a.XN()), (Context) this.f320a.f.a(), (ScheduledExecutorService) this.f320a.n.a(), (cq) this.f320a.v.a(), (m.c.n) this.f320a.R.a(), (cr) this.f320a.v.a());
            case 875:
                return new com.google.android.apps.gsa.shared.util.keepalive.d((Context) this.f320a.f.a(), c.b(this.f320a.I));
            case 876:
                return new com.google.android.apps.gsa.staticplugins.nga.c();
            case 877:
                return new com.google.android.apps.gsa.search.core.google.a.d();
            case 878:
                return new com.google.android.apps.gsa.search.core.google.a.e((Context) this.f320a.f.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.search.core.ae) this.f320a.lu.a());
            case 879:
                return new com.google.android.apps.gsa.speech.c.c((p) this.f320a.gq.a(), (an) this.f320a.gB.a(), (com.google.android.apps.gsa.search.core.ae) this.f320a.lu.a(), (com.google.android.apps.gsa.assistant.settings.devices.d.b.l) this.f320a.nF.a(), c.b(this.f320a.gV), (com.google.android.apps.gsa.search.core.ac.t) this.f320a.kg.a(), c.b(this.f320a.oZ), c.b(this.f320a.gt), (at) this.f320a.ix.a());
            case 880:
                com.google.android.libraries.search.b.b a9 = ((com.google.android.libraries.search.t.a.a) this.f320a.f319a.f326a.iH.a()).a(com.google.android.libraries.search.t.c.ASSISTANT);
                a9.getClass();
                return new com.google.android.libraries.search.assistant.l.a.a.a.a(a9);
            case 881:
                return new com.google.android.apps.gsa.staticplugins.y.n();
            case 882:
                return new com.google.android.libraries.gsa.actionusermodel.a.a((com.google.android.libraries.gsa.actionusermodel.t) this.f320a.f319a.gm.a(), (Executor) this.f320a.H.a());
            case 883:
                com.google.android.libraries.gsa.actionusermodel.t g = io.grpc.j.c.g(new com.google.android.libraries.gsa.actionusermodel.s(), (io.grpc.i) this.f320a.eA.a(), io.grpc.h.a);
                g.getClass();
                return g;
            case 884:
                cq c = dl.c(Executors.newSingleThreadExecutor());
                c.getClass();
                return c;
            case 885:
                return new com.google.android.apps.gsa.shared.util.af();
            case 886:
                jo joVar10 = this.f320a;
                com.google.android.apps.gsa.speech.audio.e.a ae = joVar10.f319a.ae();
                com.google.android.apps.gsa.x.a.e eVar = (com.google.android.apps.gsa.x.a.e) joVar10.ps.a();
                com.google.android.libraries.gsa.h.h hVar3 = (com.google.android.libraries.gsa.h.h) this.f320a.gp.a();
                com.google.android.libraries.gsa.h.h hVar4 = (com.google.android.libraries.gsa.h.h) this.f320a.gA.a();
                com.google.android.libraries.gsa.h.h hVar5 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                com.google.android.apps.gsa.shared.k.c cVar = (com.google.android.apps.gsa.shared.k.c) this.f320a.gq.a();
                jo joVar11 = this.f320a;
                Vibrator o = joVar11.f319a.o();
                com.google.android.apps.gsa.shared.util.b bVar3 = (com.google.android.apps.gsa.shared.util.b) joVar11.hU.a();
                hVar3.a("Get native sample rate", new com.google.android.apps.gsa.speech.audio.e.b());
                return new com.google.android.apps.gsa.speech.audio.e.h(ae, eVar, hVar4, hVar5, cVar, o, bVar3);
            case 887:
                return new com.google.android.apps.gsa.search.core.o.a((com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gh.a());
            case 888:
                com.google.apps.tiktok.q.b.g a10 = com.google.apps.tiktok.q.b.h.a();
                a10.f5883a = "DeviceCacheProtoStore";
                a10.c(com.google.android.apps.search.assistant.surfaces.bisto.d.c.f1973a);
                com.google.apps.tiktok.q.b.h a11 = a10.a();
                jo joVar12 = this.f320a;
                return joVar12.nc().a(a11, (com.google.android.libraries.storage.a.j) joVar12.w.a());
            case 889:
                return new com.google.android.apps.gsa.shared.logger.a.a();
            case 890:
                com.google.android.apps.gsa.j.a.a aVar2 = ((p) this.f320a.gq.a()).w(com.google.android.apps.gsa.shared.k.ak.e) ? new com.google.android.apps.gsa.j.a.a() : (com.google.android.apps.gsa.j.a) c.b(this.f320a.f319a.w).a();
                aVar2.getClass();
                return aVar2;
            case 891:
                c.b(this.f320a.gX);
                return new com.google.android.apps.gsa.gcm.a.a();
            case 892:
                return new com.google.android.apps.gsa.staticplugins.r.a.a.a();
            case 893:
                jo joVar13 = this.f320a;
                List pw = joVar13.f319a.pw();
                jy jyVar8 = joVar13.f319a;
                e.a b4 = c.b(jyVar8.f326a.oZ);
                p pVar2 = (p) jyVar8.f326a.gq.a();
                com.google.android.apps.gsa.search.core.ae aeVar = (com.google.android.apps.gsa.search.core.ae) jyVar8.f326a.lu.a();
                return new com.google.android.apps.gsa.speech.c.d(pw, new com.google.android.apps.gsa.contacts.n(b4, pVar2, aeVar), (com.google.android.apps.gsa.speech.c.a) this.f320a.f319a.gu.a(), (com.google.android.apps.gsa.speech.c.e) this.f320a.f319a.gv.a(), fu.m("QueryHintedPhrases", (ca) this.f320a.f319a.gw.a()));
            case 894:
                ContentResolver contentResolver = ((Context) this.f320a.f319a.gs.a()).getContentResolver();
                contentResolver.getClass();
                return contentResolver;
            case 895:
                return com.google.android.libraries.search.x.d.a.a((Context) this.f320a.f.a(), com.google.android.libraries.search.x.b.b.TAG_CLASSIC_SERVICES_CONTACTAFFINITY);
            case 896:
                return this.f320a.f319a.z().a(1);
            case 897:
                return new com.google.android.apps.gsa.contacts.s(this.f320a.X());
            case 898:
                return this.f320a.f319a.z().a(3);
            case 899:
                return this.f320a.f319a.z().a(2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        int i = this.b;
        switch (i) {
            case 900:
                return this.f320a.Y().a(com.google.android.apps.gsa.contacts.bb.b);
            case 901:
                return this.f320a.Y().a(com.google.android.apps.gsa.contacts.bb.c);
            case 902:
                return new com.google.android.apps.gsa.speech.c.a((com.google.android.libraries.g.a) this.f320a.g.a());
            case 903:
                return new com.google.android.apps.gsa.speech.c.e((com.google.android.libraries.g.a) this.f320a.g.a());
            case 904:
                e.a b = c.b(this.f320a.oZ);
                c.b(this.f320a.gq);
                return new com.google.android.apps.gsa.speech.c.b(b);
            case 905:
                return new com.google.android.apps.gsa.search.core.ad.a.q((Context) this.f320a.f.a(), (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a(), (com.google.android.apps.gsa.shared.util.c.a.aw) this.f320a.gu.a(), (com.google.android.apps.gsa.x.a.e) this.f320a.ps.a(), (com.google.android.apps.gsa.x.a.k) this.f320a.f319a.fP.a(), (com.google.android.apps.gsa.speech.o.g) this.f320a.gV.a(), (p) this.f320a.gq.a(), c.b(this.f320a.f319a.gy), c.b(this.f320a.hG));
            case 906:
                return Optional.of((com.google.android.apps.gsa.staticplugins.bx.a) this.f320a.f319a.fQ.a());
            case 907:
                return com.google.android.apps.gsa.staticplugins.nga.a.b.b.b((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f320a.hc.a());
            case 908:
            case 941:
                return new com.google.android.apps.gsa.speech.audio.n((com.google.android.libraries.g.a) this.f320a.g.a());
            case 909:
                com.google.android.apps.gsa.speech.audio.e.h hVar = (com.google.android.apps.gsa.speech.audio.e.h) this.f320a.f319a.gq.a();
                com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) this.f320a.f319a.gA.a();
                jo joVar = this.f320a;
                return new com.google.android.apps.gsa.speech.audio.c.g(hVar, hVar2, joVar.f319a.ad(), joVar.f319a.ac(), (com.google.android.apps.gsa.shared.k.c) joVar.gq.a());
            case 910:
                return ((com.google.android.apps.gsa.shared.util.c.a.aw) this.f320a.he.a()).a(com.google.android.apps.gsa.speech.audio.c.h.class);
            case 911:
                return new com.google.android.apps.gsa.shared.notificationlistening.collection.a.f((com.google.android.libraries.g.a) this.f320a.g.a());
            case 912:
                return new com.google.android.libraries.search.assistant.proactive.storage.s((Context) this.f320a.f.a(), (com.google.android.libraries.storage.protostore.af) this.f320a.aA.a(), (Executor) this.f320a.v.a());
            case 913:
                return new com.google.android.libraries.search.assistant.proactive.surveys.n();
            case 914:
                com.google.android.apps.gsa.staticplugins.opa.at.l lVar = (com.google.android.apps.gsa.staticplugins.opa.at.l) this.f320a.f319a.gG.a();
                com.google.android.libraries.gsa.h.h hVar3 = (com.google.android.libraries.gsa.h.h) this.f320a.gp.a();
                jo joVar2 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.at.m(lVar, hVar3, joVar2.f319a.aD(), (com.google.android.libraries.gsa.h.h) joVar2.gz.a(), (com.google.android.apps.gsa.staticplugins.opa.at.l) this.f320a.f319a.gG.a(), (com.google.android.apps.gsa.opa.g.b.a) this.f320a.f319a.gF.a(), (com.google.android.apps.gsa.search.core.aa.a.c) this.f320a.ls.a());
            case 915:
                com.google.android.libraries.gsa.h.h hVar4 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                com.google.android.libraries.gsa.h.h hVar5 = (com.google.android.libraries.gsa.h.h) this.f320a.gp.a();
                jo joVar3 = this.f320a;
                com.google.android.apps.gsa.staticplugins.opa.at.b.i aD = joVar3.f319a.aD();
                com.google.android.apps.gsa.staticplugins.opa.at.a.e eVar = (com.google.android.apps.gsa.staticplugins.opa.at.a.e) joVar3.f319a.gE.a();
                com.google.android.apps.gsa.opa.g.b.a aVar = (com.google.android.apps.gsa.opa.g.b.a) this.f320a.f319a.gF.a();
                jo joVar4 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.at.l(hVar4, hVar5, aD, eVar, aVar, joVar4.f319a.S(), joVar4.f319a.aC(), joVar4.f319a.aB(), (p) joVar4.gq.a());
            case 916:
                return new com.google.android.apps.gsa.staticplugins.opa.at.a.e((r) this.f320a.oq.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.shared.util.debug.d) this.f320a.aD.a());
            case 917:
                r rVar = (r) this.f320a.oq.a();
                com.google.android.apps.gsa.staticplugins.opa.at.a.e eVar2 = (com.google.android.apps.gsa.staticplugins.opa.at.a.e) this.f320a.f319a.gE.a();
                com.google.android.libraries.gsa.h.h hVar6 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                jo joVar5 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.at.a.n(rVar, eVar2, hVar6, joVar5.f319a.S(), (Context) joVar5.f.a(), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) this.f320a.gT.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a(), (p) this.f320a.gq.a());
            case 918:
                jo joVar6 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.o.d(joVar6.et(), (com.google.android.libraries.gsa.h.h) joVar6.gp.a(), (com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q) this.f320a.oL.a());
            case 919:
                jo joVar7 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.e.g(joVar7.el(), (com.google.android.libraries.gsa.h.h) joVar7.gp.a(), (com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q) this.f320a.oL.a(), (p) this.f320a.gq.a());
            case 920:
                com.google.android.libraries.gsa.h.h hVar7 = (com.google.android.libraries.gsa.h.h) this.f320a.gp.a();
                com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q qVar = (com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q) this.f320a.oL.a();
                jo joVar8 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.opa.smartspace.f.b(hVar7, qVar, joVar8.eh(), (com.google.android.apps.gsa.shared.k.c) joVar8.gq.a());
            case 921:
                Context context = (Context) this.f320a.f.a();
                com.google.android.gms.search.i iVar = (com.google.android.gms.search.i) this.f320a.f319a.gK.a();
                com.google.android.gms.common.api.j jVar = com.google.android.gms.search.g.f2709a;
                return new com.google.android.gms.search.queries.a.f(context, iVar);
            case 922:
                return com.google.android.apps.search.assistant.verticals.ambient.k.a.a.a();
            case 923:
                ZoneId systemDefault = ZoneId.systemDefault();
                systemDefault.getClass();
                return systemDefault;
            case 924:
                com.google.android.libraries.search.d.aq aqVar = (com.google.android.libraries.search.d.aq) this.f320a.f319a.cM.a();
                aqVar.getClass();
                return at.j(aqVar);
            case 925:
                return new com.google.android.apps.gsa.assistant.shared.appactions.e.c((com.google.android.apps.gsa.shared.logger.b.h) this.f320a.hG.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a());
            case 926:
                return new com.google.android.apps.gsa.staticplugins.p.d.a((com.google.android.apps.gsa.shared.logger.b.h) this.f320a.hG.a(), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 927:
                return new com.google.android.apps.gsa.staticplugins.bi.f.b();
            case 928:
                return new com.google.android.apps.gsa.b.d.a();
            case 929:
                return new com.google.android.apps.gsa.b.f.a.c(c.b(this.f320a.go));
            case 930:
                return new com.google.android.apps.gsa.speech.audio.k();
            case 931:
                return new com.google.android.apps.gsa.b.d();
            case 932:
                return new com.google.android.apps.gsa.b.f.y();
            case 933:
                return new com.google.android.apps.gsa.speech.k.b.d.a();
            case 934:
                return new com.google.android.apps.gsa.searchbox.a.a.a.e();
            case 935:
                return com.google.android.apps.gsa.searchbox.a.a.a.a.a.b((Context) this.f320a.f.a(), (com.google.android.libraries.storage.protostore.af) this.f320a.aA.a());
            case 936:
                com.google.android.apps.gsa.shared.util.c.a.an anVar = (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a();
                p pVar = (p) this.f320a.gq.a();
                com.google.android.apps.gsa.search.core.j.g gVar = (com.google.android.apps.gsa.search.core.j.g) this.f320a.pb.a();
                jo joVar9 = this.f320a;
                return new com.google.android.apps.gsa.s3.producers.a(anVar, pVar, gVar, joVar9.f319a.T(), (com.google.android.apps.gsa.search.core.google.d.a) joVar9.f319a.gX.a(), at.k((com.google.android.apps.gsa.opa.c) this.f320a.f319a.gZ.a()), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), c.b(this.f320a.hG), (at) this.f320a.qy.a());
            case 937:
                return new com.google.android.apps.gsa.search.core.google.d.a((p) this.f320a.gq.a(), c.b(this.f320a.gB), c.b(this.f320a.f319a.fI), c.b(this.f320a.f319a.fo));
            case 938:
                p pVar2 = (p) this.f320a.gq.a();
                jo joVar10 = this.f320a;
                return b.k(pVar2, joVar10.f319a.as(), joVar10.f319a.ar());
            case 939:
                return h.a.a.f.a.a.m.e(this.f320a.f319a.sn());
            case 940:
                return new com.google.android.apps.gsa.s3.producers.e((com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a(), (p) this.f320a.gq.a(), (com.google.android.apps.gsa.search.core.j.g) this.f320a.pb.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), c.b(this.f320a.hG));
            case 942:
                return new com.google.android.apps.gsa.assist.b.c(this.f320a.f319a.q());
            case 943:
                return new com.google.android.apps.gsa.assist.a.a(com.google.android.apps.gsa.shared.util.o.f1569a);
            case 944:
                jo joVar11 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.c(joVar11.f319a.qs(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar11.nN.a());
            case 945:
                Context context2 = (Context) this.f320a.f.a();
                p pVar3 = (p) this.f320a.gq.a();
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f320a.g.a();
                com.google.android.apps.gsa.opa.smartspace.d dVar = (com.google.android.apps.gsa.opa.smartspace.d) this.f320a.oj.a();
                com.google.android.apps.gsa.opa.smartspace.p pVar4 = (com.google.android.apps.gsa.opa.smartspace.p) this.f320a.nP.a();
                com.google.android.apps.search.assistant.verticals.ambient.n.r rVar2 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f320a.nN.a();
                jo joVar12 = this.f320a;
                return new com.google.android.apps.gsa.staticplugins.smartspace.b.f(context2, pVar3, aVar2, dVar, pVar4, rVar2, joVar12.f319a.ry(), (com.google.android.apps.gsa.opa.a.a.a) joVar12.nK.a());
            case 946:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.k((p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 947:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.o((Context) this.f320a.f.a(), (com.google.android.apps.gsa.shared.t.ac) this.f320a.oo.a(), (com.google.android.apps.gsa.smartspace.k) this.f320a.ov.a(), (p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), (com.google.android.apps.gsa.opa.smartspace.p) this.f320a.nP.a(), (com.google.android.apps.gsa.opa.smartspace.d) this.f320a.oj.a());
            case 948:
                Context context3 = (Context) this.f320a.f.a();
                p pVar5 = (p) this.f320a.gq.a();
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f320a.g.a();
                com.google.android.apps.gsa.shared.util.c.a.g gVar2 = (com.google.android.apps.gsa.shared.util.c.a.g) this.f320a.ha.a();
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.m(context3, pVar5, aVar3, gVar2);
            case 949:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.a((p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 950:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.f((p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), (Context) this.f320a.f.a());
            case 951:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.d((p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), (Context) this.f320a.f.a());
            case 952:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.j((com.google.android.apps.gsa.shared.t.ac) this.f320a.oo.a(), (Context) this.f320a.f.a(), (p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), c.b(this.f320a.og));
            case 953:
                return new com.google.android.apps.gsa.staticplugins.smartspace.e.i((com.google.android.apps.gsa.shared.t.ac) this.f320a.oo.a(), (Context) this.f320a.f.a(), (p) this.f320a.gq.a(), (com.google.android.libraries.g.a) this.f320a.g.a(), c.b(this.f320a.og));
            case 954:
                return new com.google.android.apps.gsa.staticplugins.smartspace.f.a(this.f320a.f319a.aT());
            case 955:
                return new com.google.android.apps.gsa.b.b.a();
            case 956:
                ((com.google.android.apps.gsa.search.core.aa.a.k) this.f320a.hq.a()).l();
                return false;
            case 957:
                com.google.android.apps.gsa.speech.e.b.i iVar2 = (com.google.android.apps.gsa.speech.e.b.i) this.f320a.lX.a();
                p pVar6 = (p) this.f320a.gq.a();
                com.google.android.apps.gsa.shared.util.c.a.an anVar2 = (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a();
                com.google.android.apps.gsa.tasks.m mVar = (com.google.android.apps.gsa.tasks.m) this.f320a.gP.a();
                return new com.google.android.apps.gsa.speech.e.a.c(iVar2, pVar6, anVar2, mVar);
            case 958:
                return new com.google.android.apps.gsa.staticplugins.nga.p.a((p) this.f320a.gq.a());
            case 959:
                return new com.google.android.apps.gsa.staticplugins.nga.ui.c();
            case 960:
                e.a b2 = c.b(this.f320a.pm);
                e.a b3 = c.b(this.f320a.hJ);
                e.a b4 = c.b(this.f320a.gq);
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) this.f320a.g.a();
                e.a b5 = c.b(this.f320a.gF);
                com.google.android.libraries.gsa.h.h hVar8 = (com.google.android.libraries.gsa.h.h) this.f320a.gz.a();
                com.google.android.gms.clearcut.a.b bVar = (com.google.android.gms.clearcut.a.b) this.f320a.bl.a();
                Context context4 = (Context) this.f320a.f.a();
                return new com.google.android.apps.gsa.eventlogger.d(b2, b3, b4, aVar4, b5, hVar8, bVar, context4);
            case 961:
                com.google.android.apps.gsa.shared.logger.b.h hVar9 = (com.google.android.apps.gsa.shared.logger.b.h) this.f320a.hG.a();
                return new com.google.android.apps.gsa.sidekick.shared.a.b(hVar9);
            case 962:
                return new com.google.android.apps.gsa.handsfree.i((com.google.android.apps.gsa.shared.util.debug.d) this.f320a.aD.a());
            case 963:
                at.k(new com.google.android.apps.gsa.staticplugins.bk.a());
                jo joVar13 = this.f320a;
                h hVar10 = joVar13.f319a.hl;
                return com.google.android.apps.gsa.sidekick.a.d.d.c(hVar10);
            case 964:
                Context context5 = (Context) this.f320a.f.a();
                com.google.android.apps.gsa.shared.util.c.a.an anVar3 = (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a();
                jo joVar14 = this.f320a;
                return com.google.android.apps.gsa.sidekick.a.d.d.b(context5, anVar3, joVar14.f319a.pu(), c.b(joVar14.gF), (com.google.android.apps.gsa.shared.o.a.a) this.f320a.gm.a());
            case 965:
                return com.google.android.apps.gsa.sidekick.a.d.c.b((an) this.f320a.gB.a());
            case 966:
                return new com.google.android.apps.gsa.opa.c.k((Context) this.f320a.f319a.hn.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gv.a(), c.b(this.f320a.gq), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 967:
                return com.google.android.libraries.search.x.d.a.a((Context) this.f320a.f.a(), com.google.android.libraries.search.x.b.b.TAG_CLASSIC_ASSISTANT);
            case 968:
                return new com.google.android.apps.gsa.search.core.aj((com.google.android.apps.gsa.search.core.preferences.n) this.f320a.gf.a(), (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a());
            case 969:
                return new com.google.android.apps.gsa.staticplugins.ca.a.c(this.f320a.f319a.aV());
            case 970:
                return new com.google.android.libraries.t.a.a((Context) this.f320a.f.a());
            case 971:
                return new com.google.android.apps.gsa.search.core.preferences.e((Context) this.f320a.f.a(), this.f320a.cV());
            case 972:
                return "assistant";
            case 973:
                return new androidx.slice.j((Context) this.f320a.f.a());
            case 974:
                return new com.google.android.libraries.search.assistant.performer.deviceactions.c.c((com.google.android.libraries.search.t.a.a) this.f320a.iH.a());
            case 975:
                return new com.google.android.libraries.search.assistant.performer.g.a.h((cq) this.f320a.H.a());
            case 976:
                return Boolean.valueOf(this.f320a.f319a.su().p());
            case 977:
                return Boolean.valueOf(this.f320a.f319a.su().q());
            case 978:
                return new com.google.android.apps.gsa.staticplugins.opa.ah.e((an) this.f320a.gB.a(), (com.google.android.apps.gsa.staticplugins.opa.omniconsent.y) this.f320a.f10if.a());
            case 979:
                return new com.google.android.apps.gsa.staticplugins.bisto.m.e((com.google.android.apps.gsa.search.shared.service.e.e) this.f320a.jv.a(), (com.google.android.apps.gsa.shared.util.c.a.an) this.f320a.gy.a());
            case 980:
                return new com.google.android.apps.gsa.staticplugins.bisto.util.ad((com.google.android.apps.gsa.shared.f.e) this.f320a.py.a(), (com.google.android.apps.gsa.search.core.ac.t) this.f320a.kg.a());
            case 981:
                return com.google.android.apps.gsa.staticplugins.nga.a.b.b.c((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f320a.hc.a());
            case 982:
                return new bk();
            case 983:
                return new bk();
            case 984:
                return new com.google.android.apps.search.podcasts.e.j((com.google.apps.tiktok.account.b.d) this.f320a.f319a.dT.a(), (Context) this.f320a.f.a(), (com.google.apps.tiktok.account.data.a.d) this.f320a.bq.a(), (com.google.apps.tiktok.account.data.c.c) this.f320a.bI.a(), this.f320a.f319a.cM());
            case 985:
                return new com.google.android.apps.gsa.nga.shared.y.b((com.google.android.apps.gsa.nga.shared.h.a) this.f320a.f319a.hF.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a());
            case 986:
                return com.google.android.apps.gsa.staticplugins.nga.j.b.c((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f320a.hc.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a(), (com.google.android.libraries.search.b.b) this.f320a.hO.a());
            case 987:
                return new com.google.android.apps.gsa.staticplugins.nga.g.a.d((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f320a.hc.a(), c.b(this.f320a.gR), (com.google.android.libraries.gsa.h.h) this.f320a.gz.a(), (com.google.android.libraries.gsa.h.h) this.f320a.gp.a(), (com.google.android.apps.gsa.nga.shared.q.a.x) this.f320a.iF.a());
            case 988:
                Context context6 = (Context) this.f320a.f.a();
                jo joVar15 = this.f320a;
                return new com.google.android.libraries.z.a.a.b(context6, (com.google.android.libraries.z.a.a.c) joVar15.f319a.ph(), joVar15.f319a.cZ(), (com.google.android.libraries.z.b.a.a) joVar15.f319a.hH.a());
            case 989:
                return new com.google.android.libraries.z.b.a.a((Context) this.f320a.f.a());
            case 990:
                return new com.google.android.apps.search.assistant.verticals.contextdebug.a.a((Context) this.f320a.f.a());
            case 991:
                return new com.google.android.apps.gsa.staticplugins.accl.performers.j.k();
            case 992:
                return new com.google.android.apps.gsa.staticplugins.opa.m.a.a((com.google.android.libraries.search.t.i.y) this.f320a.W.a());
            case 993:
                jo joVar16 = this.f320a;
                com.google.android.apps.gsa.staticplugins.bv.b.u eL = joVar16.eL();
                ca caVar = (ca) joVar16.nA.a();
                jo joVar17 = this.f320a;
                return com.google.android.apps.gsa.staticplugins.bv.a.d.b(eL, caVar, joVar17.nD(), (com.google.android.apps.gsa.shared.util.debug.d) joVar17.aD.a());
            case 994:
                return "assistant-text";
            case 995:
                return "assistant-history-sync";
            case 996:
                return new com.google.android.libraries.lens.view.u.a(c.b(this.f320a.f319a.hO), c.b(this.f320a.f319a.hP), c.b(this.f320a.f319a.hQ), c.b(this.f320a.f319a.hR), c.b(this.f320a.f319a.hS));
            case 997:
                return new com.google.android.libraries.lens.view.u.f((PackageManager) this.f320a.h.a(), (com.google.android.libraries.g.a) this.f320a.g.a());
            case 998:
                return com.google.android.libraries.lens.view.u.d.a((Context) this.f320a.f.a(), (cr) this.f320a.H.a());
            case 999:
                return Boolean.valueOf(this.f320a.f319a.sp().d());
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        com.google.android.apps.gsa.speech.settingsui.hotword.base.a aVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return e();
            case 3:
                return f();
            case 4:
                return g();
            case 5:
                return h();
            case 6:
                return i();
            case 7:
                return j();
            case 8:
                return k();
            case 9:
                return l();
            case 10:
                return d();
            default:
                switch (i) {
                    case 1100:
                        aVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45367945").d();
                        break;
                    case 1101:
                        aVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45367946").d();
                        break;
                    case 1102:
                        aVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f320a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45370680").d();
                        break;
                    case 1103:
                        aVar = new com.google.android.libraries.assistant.auto.tng.p.a.b((Executor) this.f320a.H.a());
                        break;
                    case 1104:
                        aVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f320a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45371292").f());
                        break;
                    case 1105:
                        aVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f320a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45369942").f());
                        break;
                    case 1106:
                        aVar = -1L;
                        break;
                    case 1107:
                        aVar = false;
                        break;
                    case 1108:
                        com.google.protobuf.ba createBuilder = com.google.android.libraries.assistant.auto.tng.l.ab.f2758a.createBuilder();
                        com.google.android.libraries.assistant.auto.tng.l.aa aaVar = com.google.android.libraries.assistant.auto.tng.l.aa.c;
                        createBuilder.copyOnWrite();
                        com.google.android.libraries.assistant.auto.tng.l.ab abVar = (com.google.android.libraries.assistant.auto.tng.l.ab) createBuilder.instance;
                        abVar.c = aaVar.e;
                        abVar.b |= 1;
                        aVar = (com.google.android.libraries.assistant.auto.tng.l.ab) createBuilder.build();
                        aVar.getClass();
                        break;
                    case 1109:
                        jo joVar = this.f320a;
                        fq i2 = fu.i(12);
                        jy jyVar = joVar.f319a;
                        i2.i("CHIME_NOTIFICATION_RECEIVED", jyVar.dl());
                        i2.i("CHIME_STORE_TARGET", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.aY.a());
                        i2.i("CHIME_REMOVE_TARGET", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.aX.a());
                        i2.i("CHIME_FETCH_LATEST_THREADS", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.aV.a());
                        i2.i("CHIME_FETCH_UPDATED_THREADS", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.aW.a());
                        i2.i("CHIME_THREAD_STATE_UPDATE", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.aZ.a());
                        i2.i("CHIME_SET_USER_PREFERENCE", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.ba.a());
                        i2.i("CHIME_REFRESH_NOTIFICATIONS", jyVar.dm());
                        i2.i("CHIME_PERIODIC_JOB", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.db.a());
                        i2.i("GNP_REGISTRATION", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.cV.a());
                        i2.i("GNP_PERIODIC_REGISTRATION", jyVar.dn());
                        i2.i("CHIME_QUALITY_PERIODIC_JOB", (com.google.android.libraries.notifications.platform.internal.k.a) jyVar.aT.a());
                        fu h = i2.h(true);
                        jo joVar2 = this.f320a;
                        aVar = new com.google.android.libraries.notifications.platform.entrypoints.job.a.a.c(h, joVar2.f319a.dr(), (m.c.n) joVar2.P.a());
                        break;
                    case 1110:
                        aVar = new com.google.apps.tiktok.experiments.l(new op(new h.a.a.a.a.a.a.a.a.a()), nr.a);
                        break;
                    case 1111:
                        aVar = new com.google.apps.tiktok.experiments.l(ha.u(new h.a.a.a.a.a.c.a.a.a(1), new h.a.a.a.a.a.c.a.a.a(0), new h.a.a.a.a.a.c.a.a.a(2), new h.a.a.a.a.a.c.a.a.a(3)), nr.a);
                        break;
                    case 1112:
                        aVar = new com.google.apps.tiktok.experiments.l(ha.w(new h.a.a.b.b.a.a(1), new h.a.a.b.b.a.a(0), new h.a.a.b.b.a.a(2), new h.a.a.b.b.a.d(), new h.a.a.b.b.a.a(3), new h.a.a.b.b.a.a(4), new com.google.apps.tiktok.experiments.b[]{new h.a.a.b.b.a.a(5), new h.a.a.b.b.a.a(6), new h.a.a.b.b.a.a(7), new h.a.a.b.b.a.a(8), new h.a.a.b.b.a.a(9), new h.a.a.b.b.a.a(10), new h.a.a.b.b.a.a(11), new h.a.a.b.b.a.a(12), new h.a.a.b.b.a.a(13), new h.a.a.b.b.a.a(14), new h.a.a.b.b.a.a(15), new h.a.a.b.b.a.a(16), new h.a.a.b.b.a.a(17)}), nr.a);
                        break;
                    case 1113:
                        aVar = new com.google.apps.tiktok.experiments.l(ha.w(new h.a.a.d.b.a.a(1), new h.a.a.d.b.a.a(0), new h.a.a.d.b.a.a(2), new h.a.a.d.b.a.a(3), new h.a.a.d.b.a.a(4), new h.a.a.d.b.a.a(5), new com.google.apps.tiktok.experiments.b[]{new h.a.a.d.b.a.a(6), new h.a.a.d.b.a.a(7), new h.a.a.d.b.a.b(), new h.a.a.d.b.a.a(8), new h.a.a.d.b.a.d(), new h.a.a.d.b.a.a(9), new h.a.a.d.b.a.a(10), new h.a.a.d.b.a.a(11), new h.a.a.d.b.a.a(12), new h.a.a.d.b.a.a(13), new h.a.a.d.b.a.a(14), new h.a.a.d.b.a.a(15), new h.a.a.d.b.a.a(16), new h.a.a.d.b.a.a(17), new h.a.a.d.b.a.a(18), new h.a.a.d.b.a.h(1), new h.a.a.d.b.a.a(19), new h.a.a.d.b.a.a(20), new h.a.a.d.b.a.g(1), new h.a.a.d.b.a.g(0), new h.a.a.d.b.a.h(0), new h.a.a.d.b.a.i(), new h.a.a.d.b.a.g(2), new h.a.a.d.b.a.k(), new h.a.a.d.b.a.g(3), new h.a.a.d.b.a.m(), new h.a.a.d.b.a.h(2), new h.a.a.d.b.a.g(4), new h.a.a.d.b.a.h(3), new h.a.a.d.b.a.g(5), new h.a.a.d.b.a.g(6), new h.a.a.d.b.a.g(7), new h.a.a.d.b.a.g(8), new h.a.a.d.b.a.g(9), new h.a.a.d.b.a.h(4), new h.a.a.d.b.a.h(5), new h.a.a.d.b.a.g(10), new h.a.a.d.b.a.o(), new h.a.a.d.b.a.g(11), new h.a.a.d.b.a.g(12), new h.a.a.d.b.a.p(), new h.a.a.d.b.a.g(13), new h.a.a.d.b.a.g(14), new h.a.a.d.b.a.h(6), new h.a.a.d.b.a.g(15), new h.a.a.d.b.a.g(16), new h.a.a.d.b.a.h(7), new h.a.a.d.b.a.g(17), new h.a.a.d.b.a.g(18), new h.a.a.d.b.a.g(19), new h.a.a.d.b.a.g(20), new h.a.a.d.b.a.s(1), new h.a.a.d.b.a.s(0), new h.a.a.d.b.a.s(2), new h.a.a.d.b.a.s(3), new h.a.a.d.b.a.s(4), new h.a.a.d.b.a.s(5), new h.a.a.d.b.a.t(), new h.a.a.d.b.a.s(6), new h.a.a.d.b.a.s(7), new h.a.a.d.b.a.s(8), new h.a.a.d.b.a.s(9), new h.a.a.d.b.a.s(10), new h.a.a.d.b.a.s(11), new h.a.a.d.b.a.s(12), new h.a.a.d.b.a.s(13), new h.a.a.d.b.a.s(14), new h.a.a.d.b.a.s(15), new h.a.a.d.b.a.u(), new h.a.a.d.b.a.s(16), new h.a.a.d.b.a.w(), new h.a.a.d.b.a.s(17), new h.a.a.d.b.a.x(), new h.a.a.d.b.a.s(18), new h.a.a.d.b.a.s(19), new h.a.a.d.b.a.s(20), new h.a.a.d.b.a.aa(1), new h.a.a.d.b.a.aa(0), new h.a.a.d.b.a.h(8), new h.a.a.d.b.a.aa(2), new h.a.a.d.b.a.ab(), new h.a.a.d.b.a.aa(3), new h.a.a.d.b.a.aa(4), new h.a.a.d.b.a.aa(5), new h.a.a.d.b.a.aa(6), new h.a.a.d.b.a.ac(), new h.a.a.d.b.a.aa(7), new h.a.a.d.b.a.aa(8), new h.a.a.d.b.a.af(), new h.a.a.d.b.a.aa(9), new h.a.a.d.b.a.aa(10)}), nr.a);
                        break;
                    case 1114:
                        aVar = new com.google.apps.tiktok.experiments.l(ha.w(new h.a.a.e.a.a.a(1), new h.a.a.e.a.a.a(0), new h.a.a.e.a.a.a(2), new h.a.a.e.a.a.c(1), new h.a.a.e.a.a.a(3), new h.a.a.e.a.a.a(4), new com.google.apps.tiktok.experiments.b[]{new h.a.a.e.a.a.a(5), new h.a.a.e.a.a.a(6), new h.a.a.e.a.a.a(7), new h.a.a.e.a.a.c(0), new h.a.a.e.a.a.c(2), new h.a.a.e.a.a.a(8), new h.a.a.e.a.a.h(), new h.a.a.e.a.a.a(9), new h.a.a.e.a.a.a(10), new h.a.a.e.a.a.a(11)}), nr.a);
                        break;
                    case 1115:
                        aVar = new com.google.apps.tiktok.experiments.l(ha.w(new h.a.a.f.b.a.b(1), new h.a.a.f.b.a.b(0), new h.a.a.f.b.a.b(2), new h.a.a.f.b.a.c(1), new h.a.a.f.b.a.b(3), new h.a.a.f.b.a.c(0), new com.google.apps.tiktok.experiments.b[]{new h.a.a.f.b.a.b(4), new h.a.a.f.b.a.b(5), new h.a.a.f.b.a.b(6), new h.a.a.f.b.a.b(7), new h.a.a.f.b.a.b(8), new h.a.a.f.b.a.b(9), new h.a.a.f.b.a.c(2), new h.a.a.f.b.a.b(10), new h.a.a.f.b.a.c(3), new h.a.a.f.b.a.g(), new h.a.a.f.b.a.b(11), new h.a.a.f.b.a.b(12), new h.a.a.f.b.a.b(13), new h.a.a.f.b.a.b(14), new h.a.a.f.b.a.b(15), new h.a.a.f.b.a.b(16), new h.a.a.f.b.a.b(17), new h.a.a.f.b.a.b(18), new h.a.a.f.b.a.b(19), new h.a.a.f.b.a.b(20), new h.a.a.f.b.a.h(1), new h.a.a.f.b.a.h(0), new h.a.a.f.b.a.h(2), new h.a.a.f.b.a.h(3), new h.a.a.f.b.a.h(4), new h.a.a.f.b.a.h(5), new h.a.a.f.b.a.h(6), new h.a.a.f.b.a.h(7), new h.a.a.f.b.a.a.a(), new h.a.a.f.b.a.h(8), new h.a.a.f.b.a.h(9), new h.a.a.f.b.a.h(10), new h.a.a.f.b.a.h(11), new h.a.a.f.b.a.c(4), new h.a.a.f.b.a.h(12), new h.a.a.f.b.a.h(13), new h.a.a.f.b.a.h(14), new h.a.a.f.b.a.h(15), new h.a.a.f.b.a.c(5), new h.a.a.f.b.a.c(6), new h.a.a.f.b.a.h(16), new h.a.a.f.b.a.h(17), new h.a.a.f.b.a.c(7), new h.a.a.f.b.a.h(18), new h.a.a.f.b.a.h(19), new h.a.a.f.b.a.h(20), new h.a.a.f.b.a.l(1), new h.a.a.f.b.a.l(0), new h.a.a.f.b.a.c(8), new h.a.a.f.b.a.l(2), new h.a.a.f.b.a.l(3), new h.a.a.f.b.a.l(4)}), nr.a);
                        break;
                    case 1116:
                        aVar = new com.google.android.libraries.search.account.d.a.c((com.google.apps.tiktok.account.data.ao) this.f320a.ap.a(), (com.google.android.libraries.search.account.k) this.f320a.bM.a(), (cq) this.f320a.H.a(), (com.google.apps.tiktok.account.data.a.d) this.f320a.bq.a(), (com.google.apps.tiktok.account.data.aa) this.f320a.bH.a());
                        break;
                    case 1117:
                        aVar = new com.google.android.apps.gsa.speech.settingsui.hotword.base.a();
                        break;
                    default:
                        throw new AssertionError(i);
                }
                return aVar;
        }
    }
}
