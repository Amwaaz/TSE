package com.google.android.apps.gsa.binaries.velvet.app;

import android.accounts.AccountManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import androidx.g.a.bc;
import com.google.android.apps.search.assistant.platform.pcp.j.aj;
import com.google.android.apps.search.assistant.surfaces.b.a.c.a;
import com.google.android.apps.search.assistant.surfaces.b.b.a.c;
import com.google.android.apps.search.assistant.surfaces.b.b.a.e;
import com.google.android.apps.search.assistant.surfaces.bisto.a.f.l;
import com.google.android.apps.search.assistant.surfaces.bisto.d.ar;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bf;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bg;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bj;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bm;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.de;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ea;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.c.bl;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.c.bn;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.c.cf;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.be;
import com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ao.ad;
import com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.dg;
import com.google.android.apps.search.assistant.surfaces.voice.robin.m.a.ak;
import com.google.android.apps.search.assistant.surfaces.voice.robin.r.am;
import com.google.android.apps.search.assistant.surfaces.voice.robin.routing.aa;
import com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.al;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.f.ab;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.f.bd;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.db;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.dm;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.a.ae;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.floaty.activity.u;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.j.v;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.j.z;
import com.google.android.apps.search.assistant.surfaces.voice.robin.x.ac;
import com.google.android.apps.search.googleapp.discover.x.bh;
import com.google.android.apps.search.googleapp.discover.x.bs;
import com.google.android.apps.search.googleapp.discover.x.cm;
import com.google.android.apps.search.googleapp.discover.x.ct;
import com.google.android.apps.search.googleapp.discover.z.ap;
import com.google.android.apps.search.googleapp.labs.af;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.aq;
import com.google.android.apps.search.podcasts.b.b.ah;
import com.google.android.libraries.assistant.auto.jumpboost.i.b;
import com.google.android.libraries.assistant.auto.tng.actionscache.storage.ResponseCacheDatabase;
import com.google.android.libraries.assistant.auto.tng.assistant.d.a.c.o;
import com.google.android.libraries.assistant.auto.tng.assistant.d.a.c.p;
import com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.w;
import com.google.android.libraries.assistant.auto.tng.l.ba;
import com.google.android.libraries.assistant.auto.tng.l.bk;
import com.google.android.libraries.assistant.auto.tng.p.a.m;
import com.google.android.libraries.assistant.auto.tng.suggestions.c.a.f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.e.a.s;
import com.google.android.libraries.assistant.auto.tng.suggestions.e.a.d;
import com.google.android.libraries.assistant.auto.tng.suggestions.g.a.i;
import com.google.android.libraries.logging.ve.j;
import com.google.android.libraries.logging.ve.y;
import com.google.android.libraries.search.ac.b.ai;
import com.google.android.libraries.search.ac.b.c.x;
import com.google.android.libraries.search.ah.i.b.dc;
import com.google.android.libraries.search.assistant.bb.a.bb;
import com.google.android.libraries.search.assistant.invocation.p.bx;
import com.google.android.libraries.search.assistant.p.a.d.g;
import com.google.android.libraries.search.assistant.performer.communication.by;
import com.google.android.libraries.search.lens.query.b.as;
import com.google.android.libraries.search.rendering.xuikit.c.h.t;
import com.google.android.libraries.search.t.l.k;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.an;
import com.google.apps.tiktok.experiments.phenotype.bv;
import com.google.apps.tiktok.g.ax;
import com.google.apps.tiktok.g.ay;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.base.ci;
import com.google.common.o.im;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ao;
import com.google.speech.g.bp;
import e.c.h;
import h.a.a.d.b.a.r;
import io.grpc.cx;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.ag;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/it.class */
public final class it implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f309a;
    public final ik b;
    private final int c;

    public it(jo joVar, ik ikVar, int i) {
        this.f309a = joVar;
        this.b = ikVar;
        this.c = i;
    }

    private final Object b() {
        h hVar;
        jj jjVar;
        jj jjVar2;
        h hVar2;
        jj jjVar3;
        h hVar3;
        h hVar4;
        jj jjVar4;
        h hVar5;
        jj jjVar5;
        jj jjVar6;
        h hVar6;
        jr jrVar;
        h hVar7;
        jj jjVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        jr jrVar2;
        jr jrVar3;
        jr jrVar4;
        h hVar11;
        h hVar12;
        jr jrVar5;
        jr jrVar6;
        jr jrVar7;
        h hVar13;
        jr jrVar8;
        jj jjVar8;
        jy jyVar;
        h hVar14;
        jr jrVar9;
        h hVar15;
        h hVar16;
        h hVar17;
        h hVar18;
        h hVar19;
        jr jrVar10;
        jr jrVar11;
        h hVar20;
        h hVar21;
        h hVar22;
        jr jrVar12;
        h hVar23;
        jr jrVar13;
        h hVar24;
        jj jjVar9;
        jr jrVar14;
        h hVar25;
        h hVar26;
        jj jjVar10;
        h hVar27;
        jj jjVar11;
        h hVar28;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        jj jjVar12;
        jj jjVar13;
        jr jrVar15;
        jr jrVar16;
        jr jrVar17;
        h hVar33;
        jj jjVar14;
        jj jjVar15;
        jr jrVar18;
        jj jjVar16;
        h hVar34;
        jr jrVar19;
        jr jrVar20;
        jj jjVar17;
        jj jjVar18;
        jr jrVar21;
        jj jjVar19;
        h hVar35;
        h hVar36;
        jj jjVar20;
        jj jjVar21;
        jr jrVar22;
        h hVar37;
        h hVar38;
        jr jrVar23;
        h hVar39;
        jr jrVar24;
        h hVar40;
        h hVar41;
        h hVar42;
        h hVar43;
        h hVar44;
        jr jrVar25;
        h hVar45;
        h hVar46;
        jy jyVar2;
        h hVar47;
        jj jjVar22;
        h hVar48;
        jj jjVar23;
        h hVar49;
        h hVar50;
        jj jjVar24;
        jr jrVar26;
        h hVar51;
        jj jjVar25;
        jj jjVar26;
        h hVar52;
        jj jjVar27;
        jj jjVar28;
        h hVar53;
        jj jjVar29;
        h hVar54;
        h hVar55;
        jj jjVar30;
        h hVar56;
        jr jrVar27;
        h hVar57;
        h hVar58;
        h hVar59;
        jr jrVar28;
        h hVar60;
        jj jjVar31;
        h hVar61;
        jj jjVar32;
        jj jjVar33;
        jj jjVar34;
        jj jjVar35;
        jj jjVar36;
        jr jrVar29;
        jj jjVar37;
        h hVar62;
        jj jjVar38;
        h hVar63;
        jj jjVar39;
        h hVar64;
        jj jjVar40;
        jj jjVar41;
        jr jrVar30;
        jr jrVar31;
        h hVar65;
        h hVar66;
        jj jjVar42;
        jj jjVar43;
        jj jjVar44;
        jj jjVar45;
        jj jjVar46;
        jj jjVar47;
        jj jjVar48;
        jr jrVar32;
        jr jrVar33;
        jj jjVar49;
        h hVar67;
        h hVar68;
        jj jjVar50;
        h hVar69;
        h hVar70;
        jy jyVar3;
        jr jrVar34;
        jj jjVar51;
        h hVar71;
        h hVar72;
        jy jyVar4;
        jj jjVar52;
        jj jjVar53;
        jj jjVar54;
        jj jjVar55;
        jj jjVar56;
        h hVar73;
        jj jjVar57;
        h hVar74;
        h hVar75;
        jj jjVar58;
        h hVar76;
        h hVar77;
        jj jjVar59;
        h hVar78;
        h hVar79;
        h hVar80;
        h hVar81;
        h hVar82;
        jj jjVar60;
        jj jjVar61;
        h hVar83;
        h hVar84;
        h hVar85;
        h hVar86;
        jj jjVar62;
        jr jrVar35;
        jj jjVar63;
        h hVar87;
        h hVar88;
        h hVar89;
        jj jjVar64;
        jj jjVar65;
        jj jjVar66;
        jj jjVar67;
        jj jjVar68;
        jj jjVar69;
        jj jjVar70;
        h hVar90;
        h hVar91;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        h hVar96;
        jj jjVar71;
        h hVar97;
        jj jjVar72;
        h hVar98;
        jj jjVar73;
        jr jrVar36;
        h hVar99;
        jj jjVar74;
        jj jjVar75;
        jj jjVar76;
        h hVar100;
        h hVar101;
        jj jjVar77;
        jj jjVar78;
        jj jjVar79;
        h hVar102;
        jj jjVar80;
        jj jjVar81;
        jj jjVar82;
        jj jjVar83;
        h hVar103;
        jj jjVar84;
        jj jjVar85;
        jj jjVar86;
        jr jrVar37;
        h hVar104;
        jj jjVar87;
        jj jjVar88;
        h hVar105;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        jr jrVar38;
        h hVar110;
        h hVar111;
        jj jjVar89;
        h hVar112;
        h hVar113;
        jj jjVar90;
        h hVar114;
        h hVar115;
        jj jjVar91;
        jj jjVar92;
        jj jjVar93;
        jj jjVar94;
        jj jjVar95;
        jj jjVar96;
        h hVar116;
        jj jjVar97;
        jj jjVar98;
        h hVar117;
        h hVar118;
        jj jjVar99;
        h hVar119;
        jj jjVar100;
        h hVar120;
        h hVar121;
        jj jjVar101;
        h hVar122;
        h hVar123;
        h hVar124;
        jj jjVar102;
        jj jjVar103;
        h hVar125;
        jr jrVar39;
        h hVar126;
        h hVar127;
        jj jjVar104;
        jj jjVar105;
        jj jjVar106;
        jj jjVar107;
        jj jjVar108;
        h hVar128;
        h hVar129;
        h hVar130;
        jj jjVar109;
        jj jjVar110;
        jr jrVar40;
        jj jjVar111;
        jj jjVar112;
        jj jjVar113;
        h hVar131;
        jj jjVar114;
        jj jjVar115;
        jj jjVar116;
        jj jjVar117;
        jj jjVar118;
        h hVar132;
        jj jjVar119;
        h hVar133;
        jj jjVar120;
        h hVar134;
        jj jjVar121;
        jj jjVar122;
        jj jjVar123;
        h hVar135;
        jj jjVar124;
        jj jjVar125;
        h hVar136;
        h hVar137;
        h hVar138;
        jj jjVar126;
        jj jjVar127;
        h hVar139;
        jj jjVar128;
        h hVar140;
        h hVar141;
        jj jjVar129;
        h hVar142;
        h hVar143;
        h hVar144;
        jj jjVar130;
        jj jjVar131;
        jj jjVar132;
        jj jjVar133;
        jj jjVar134;
        h hVar145;
        h hVar146;
        jj jjVar135;
        jj jjVar136;
        jj jjVar137;
        jj jjVar138;
        jj jjVar139;
        jj jjVar140;
        jj jjVar141;
        jj jjVar142;
        jj jjVar143;
        jj jjVar144;
        int i = this.c;
        switch (i) {
            case 0:
                hVar = this.f309a.ea;
                e eVar = (e) hVar.a();
                jjVar = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.b.d.e eVar2 = (com.google.android.apps.search.assistant.surfaces.b.d.e) jj.gL(jjVar).a();
                jjVar2 = this.b.f308a;
                a aVar = (a) jj.gp(jjVar2).a();
                hVar2 = this.f309a.Q;
                ag agVar = (ag) hVar2.a();
                jjVar3 = this.b.f308a;
                return new c(eVar, eVar2, aVar, agVar, jjVar3.ne());
            case 1:
                hVar3 = this.f309a.ea;
                e eVar3 = (e) hVar3.a();
                hVar4 = this.b.kz;
                com.google.android.libraries.search.assistant.q.a.b.a.c cVar = (com.google.android.libraries.search.assistant.q.a.b.a.c) hVar4.a();
                jjVar4 = this.b.f308a;
                com.google.android.libraries.search.assistant.i.c.h ep = jjVar4.ep();
                hVar5 = this.f309a.Q;
                ag agVar2 = (ag) hVar5.a();
                jjVar5 = this.b.f308a;
                a aVar2 = (a) jj.gp(jjVar5).a();
                ik ikVar = this.b;
                g b = com.google.android.apps.search.assistant.surfaces.b.f.a.b();
                jjVar6 = ikVar.f308a;
                return new com.google.android.apps.search.assistant.surfaces.b.d.e(eVar3, cVar, ep, agVar2, aVar2, b, jjVar6.eo());
            case 2:
                hVar6 = this.f309a.fx;
                com.google.android.libraries.search.d.e.a.c cVar2 = (com.google.android.libraries.search.d.e.a.c) hVar6.a();
                jrVar = this.f309a.b;
                int intValue = ((Integer) jr.cK(jrVar).a()).intValue();
                hVar7 = this.f309a.Q;
                ag agVar3 = (ag) hVar7.a();
                jjVar7 = this.b.f308a;
                Map mS = jjVar7.mS();
                hVar8 = this.b.dH;
                return new com.google.android.libraries.search.assistant.i.a.a.e(cVar2, intValue, agVar3, mS, (Map) hVar8.a());
            case 3:
                hVar9 = this.f309a.f;
                Context context = (Context) hVar9.a();
                hVar10 = this.f309a.H;
                Executor executor = (Executor) hVar10.a();
                jrVar2 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar4 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar2).a();
                jrVar3 = this.f309a.b;
                s sVar = (s) jr.eB(jrVar3).a();
                jo joVar = this.f309a;
                b hr = joVar.hr();
                jrVar4 = joVar.b;
                h cu = jr.cu(jrVar4);
                hVar11 = this.b.cm;
                com.google.android.libraries.assistant.pcp.b bVar = (com.google.android.libraries.assistant.pcp.b) hVar11.a();
                hVar12 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar12.a();
                jrVar5 = this.f309a.b;
                h ct = jr.ct(jrVar5);
                jrVar6 = this.f309a.b;
                return new f(context, executor, eVar4, sVar, hr, cu, bVar, gVar, ct, jr.cv(jrVar6));
            case 4:
                jrVar7 = this.f309a.b;
                s sVar2 = (s) jr.eB(jrVar7).a();
                hVar13 = this.f309a.v;
                Executor executor2 = (Executor) hVar13.a();
                jrVar8 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar5 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar8).a();
                jjVar8 = this.b.f308a;
                return new d(sVar2, executor2, eVar5, (i) jj.lx(jjVar8).a());
            case 5:
                jyVar = this.f309a.f319a;
                com.google.android.libraries.logging.ve.synthetic.f fVar = (com.google.android.libraries.logging.ve.synthetic.f) jy.nS(jyVar).a();
                hVar14 = this.f309a.qm;
                j jVar = (j) hVar14.a();
                jrVar9 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar6 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar9).a();
                hVar15 = this.b.g;
                AccountId accountId = (AccountId) hVar15.a();
                hVar16 = this.f309a.H;
                Executor executor3 = (Executor) hVar16.a();
                hVar17 = this.f309a.ql;
                y yVar = (y) hVar17.a();
                hVar18 = this.f309a.qr;
                return new i(fVar, jVar, eVar6, accountId, executor3, yVar, (k) hVar18.a(), this.b.gU());
            case 6:
                hVar19 = this.f309a.f;
                Context context2 = (Context) hVar19.a();
                jrVar10 = this.f309a.b;
                return com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.h.b.b.a.b(context2, e.c.c.b(jr.ep(jrVar10)));
            case 7:
                jrVar11 = this.f309a.b;
                return Optional.of((com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.k) jr.eF(jrVar11).a());
            case 8:
                jo joVar2 = this.f309a;
                hVar20 = joVar2.f;
                hVar21 = joVar2.v;
                hVar22 = joVar2.H;
                jrVar12 = joVar2.b;
                h cK = jr.cK(jrVar12);
                ik ikVar2 = this.b;
                jo joVar3 = this.f309a;
                hVar23 = ikVar2.dH;
                jrVar13 = joVar3.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.b.a.j(hVar20, hVar21, hVar22, cK, hVar23, jr.eb(jrVar13));
            case 9:
                hVar24 = this.f309a.ko;
                com.google.android.libraries.search.d.q.f.a.b bVar2 = (com.google.android.libraries.search.d.q.f.a.b) hVar24.a();
                jjVar9 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.b.a.e.a.b bVar3 = (com.google.android.apps.search.assistant.surfaces.b.a.e.a.b) jj.hv(jjVar9).a();
                jrVar14 = this.f309a.b;
                h cF = jr.cF(jrVar14);
                hVar25 = this.f309a.ea;
                e eVar7 = (e) hVar25.a();
                jo joVar4 = this.f309a;
                Optional empty = Optional.empty();
                hVar26 = joVar4.Q;
                ag agVar4 = (ag) hVar26.a();
                jjVar10 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.b.a.c.a.c(bVar2, bVar3, cF, eVar7, empty, agVar4, (com.google.android.libraries.assistant.auto.tng.assistant.d.a.b.a.j) jj.gk(jjVar10).a());
            case 10:
                hVar27 = this.f309a.eA;
                return com.google.android.apps.search.assistant.surfaces.b.a.e.a.i.b((io.grpc.i) hVar27.a());
            case 11:
                jjVar11 = this.b.f308a;
                h hf = jj.hf(jjVar11);
                jo joVar5 = this.f309a;
                ik ikVar3 = this.b;
                hVar28 = joVar5.H;
                hVar29 = ikVar3.eh;
                hVar30 = ikVar3.aG;
                hVar31 = ikVar3.ed;
                hVar32 = ikVar3.ef;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.e(hf, hVar28, hVar29, hVar30, hVar31, hVar32);
            case 12:
                jjVar12 = this.b.f308a;
                return new com.google.apps.tiktok.s.b.e((com.google.apps.tiktok.s.b.d) jj.hd(jjVar12).a());
            case 13:
                jjVar13 = this.b.f308a;
                Map mR = jjVar13.mR();
                jrVar15 = this.f309a.b;
                return new com.google.apps.tiktok.s.b.d(mR, jrVar15.ft());
            case 14:
                jrVar16 = this.f309a.b;
                h da = jr.da(jrVar16);
                jrVar17 = this.f309a.b;
                h db = jr.db(jrVar17);
                hVar33 = this.f309a.Q;
                ag agVar5 = (ag) hVar33.a();
                jjVar14 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.i.b.a.c.d(da, db, agVar5, jjVar14.en());
            case 15:
                return new io(this, 1);
            case 16:
                return new io(this, 0);
            case 17:
                jjVar15 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.j.c.c.c.e(Optional.of(jjVar15.dQ()));
            case 18:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.g.b.b.a(new lz(this.f309a, this.b));
            case 19:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.g.a.b.a(new lz(this.f309a, this.b));
            case 20:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.g.c.b.a(new lz(this.f309a, this.b));
            case 21:
                jrVar18 = this.f309a.b;
                h bZ = jr.bZ(jrVar18);
                jjVar16 = this.b.f308a;
                h gm = jj.gm(jjVar16);
                hVar34 = this.f309a.H;
                Executor executor4 = (Executor) hVar34.a();
                jrVar19 = this.f309a.b;
                boolean booleanValue = jrVar19.eY().booleanValue();
                jrVar20 = this.f309a.b;
                return new p(bZ, gm, executor4, booleanValue, jr.cG(jrVar20));
            case 22:
                jjVar17 = this.b.f308a;
                h gn = jj.gn(jjVar17);
                jjVar18 = this.b.f308a;
                h go = jj.go(jjVar18);
                jrVar21 = this.f309a.b;
                h ci = jr.ci(jrVar21);
                jjVar19 = this.b.f308a;
                h ir = jj.ir(jjVar19);
                jo joVar6 = this.f309a;
                ik ikVar4 = this.b;
                hVar35 = joVar6.fx;
                hVar36 = joVar6.H;
                jjVar20 = ikVar4.f308a;
                h gk = jj.gk(jjVar20);
                jjVar21 = this.b.f308a;
                h iK = jj.iK(jjVar21);
                jrVar22 = this.f309a.b;
                h cK2 = jr.cK(jrVar22);
                ik ikVar5 = this.b;
                jo joVar7 = this.f309a;
                hVar37 = ikVar5.dH;
                hVar38 = ikVar5.dK;
                jrVar23 = joVar7.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.c.h(gn, go, ci, ir, hVar35, hVar36, gk, iK, cK2, hVar37, hVar38, jr.cG(jrVar23));
            case 23:
                ik ikVar6 = this.b;
                jo joVar8 = this.f309a;
                hVar39 = ikVar6.dH;
                jrVar24 = joVar8.b;
                h ci2 = jr.ci(jrVar24);
                hVar40 = this.f309a.H;
                return new o(hVar39, ci2, hVar40);
            case 24:
                hVar41 = this.f309a.H;
                Executor executor5 = (Executor) hVar41.a();
                hVar42 = this.f309a.n;
                Executor executor6 = (Executor) hVar42.a();
                hVar43 = this.b.dH;
                Map map = (Map) hVar43.a();
                hVar44 = this.f309a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar44.a();
                jrVar25 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.c.a.i(executor5, executor6, map, aVar3, jr.ec(jrVar25));
            case 25:
                hVar45 = this.f309a.f;
                Context context3 = (Context) hVar45.a();
                hVar46 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.a.c(context3, (Executor) hVar46.a());
            case 26:
                jyVar2 = this.f309a.f319a;
                com.google.android.libraries.search.integrations.f.a.a aVar4 = (com.google.android.libraries.search.integrations.f.a.a) jy.hN(jyVar2).a();
                hVar47 = this.f309a.bo;
                ag agVar6 = (ag) hVar47.a();
                jjVar22 = this.b.f308a;
                return new com.google.android.libraries.search.integrations.f.b.b.e(aVar4, agVar6, jjVar22.eM());
            case 27:
                ik ikVar7 = this.b;
                jo joVar9 = this.f309a;
                com.google.apps.tiktok.q.b.h c = com.google.android.libraries.search.integrations.f.b.b.a.i.c();
                com.google.apps.tiktok.account.d.b.f kf = ikVar7.kf();
                hVar48 = joVar9.w;
                return com.google.android.libraries.search.integrations.f.b.b.a.i.b(c, kf, (com.google.android.libraries.storage.a.j) hVar48.a());
            case 28:
                jjVar23 = this.b.f308a;
                p pVar = (p) jj.gq(jjVar23).a();
                hVar49 = this.b.eg;
                com.google.android.libraries.assistant.auto.tng.assistant.d.d.d dVar = (com.google.android.libraries.assistant.auto.tng.assistant.d.d.d) hVar49.a();
                hVar50 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar2 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar50.a();
                jjVar24 = this.b.f308a;
                h kd = jj.kd(jjVar24);
                jrVar26 = this.f309a.b;
                h di = jr.di(jrVar26);
                hVar51 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.jumpboost.e.d(pVar, dVar, gVar2, kd, di, (Executor) hVar51.a());
            case 29:
                jjVar25 = this.b.f308a;
                return Boolean.valueOf(h.a.a.b.b.a.f.g(jjVar25.rN()));
            case 30:
                jjVar26 = this.b.f308a;
                return Optional.of((com.google.android.apps.search.assistant.surfaces.b.a.c.a.c) jj.gp(jjVar26).a());
            case 31:
                hVar52 = this.b.dO;
                com.google.android.libraries.assistant.auto.tng.assistant.a.a.f fVar2 = (com.google.android.libraries.assistant.auto.tng.assistant.a.a.f) hVar52.a();
                jjVar27 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.a.a.e dE = jjVar27.dE();
                jjVar28 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.ag agVar7 = (com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.ag) jj.kT(jjVar28).a();
                hVar53 = this.f309a.ea;
                e eVar8 = (e) hVar53.a();
                jjVar29 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.b.d.e eVar9 = (com.google.android.apps.search.assistant.surfaces.b.d.e) jj.gL(jjVar29).a();
                hVar54 = this.b.dT;
                com.google.android.libraries.search.assistant.i.g.g gVar3 = (com.google.android.libraries.search.assistant.i.g.g) hVar54.a();
                hVar55 = this.b.dS;
                com.google.android.libraries.assistant.auto.tng.assistant.b.a.d dVar2 = (com.google.android.libraries.assistant.auto.tng.assistant.b.a.d) hVar55.a();
                jjVar30 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.a.a.a(fVar2, dE, agVar7, eVar8, eVar9, gVar3, dVar2, (com.google.android.apps.search.assistant.surfaces.b.a.d.a.a) jj.gc(jjVar30).a());
            case 32:
                ik ikVar8 = this.b;
                jo joVar10 = this.f309a;
                hVar56 = ikVar8.dO;
                jrVar27 = joVar10.b;
                h eG = jr.eG(jrVar27);
                ik ikVar9 = this.b;
                jo joVar11 = this.f309a;
                hVar57 = ikVar9.dH;
                hVar58 = ikVar9.dP;
                hVar59 = ikVar9.dQ;
                jrVar28 = joVar11.b;
                h ef = jr.ef(jrVar28);
                jo joVar12 = this.f309a;
                ik ikVar10 = this.b;
                hVar60 = joVar12.dq;
                jjVar31 = ikVar10.f308a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.a.a.k(hVar56, eG, hVar57, hVar58, hVar59, ef, hVar60, jj.iR(jjVar31));
            case 33:
                return Optional.of(this.b.bf());
            case 34:
                hVar61 = this.f309a.H;
                Executor executor7 = (Executor) hVar61.a();
                jjVar32 = this.b.f308a;
                h gq = jj.gq(jjVar32);
                jjVar33 = this.b.f308a;
                h hI = jj.hI(jjVar33);
                jjVar34 = this.b.f308a;
                h he = jj.he(jjVar34);
                jjVar35 = this.b.f308a;
                h iJ = jj.iJ(jjVar35);
                jjVar36 = this.b.f308a;
                h iM = jj.iM(jjVar36);
                jrVar29 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.assistant.b.a.b bVar4 = (com.google.android.libraries.assistant.auto.tng.assistant.b.a.b) jr.bC(jrVar29).a();
                jjVar37 = this.b.f308a;
                Map mU = jjVar37.mU();
                hVar62 = this.b.dH;
                Map map2 = (Map) hVar62.a();
                ik ikVar11 = this.b;
                m fR = ikVar11.fR();
                jjVar38 = ikVar11.f308a;
                com.google.android.libraries.assistant.auto.tng.b.b bVar5 = (com.google.android.libraries.assistant.auto.tng.b.b) jj.hK(jjVar38).a();
                hVar63 = this.f309a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar63.a();
                jjVar39 = this.b.f308a;
                w dP = jjVar39.dP();
                hVar64 = this.b.eg;
                com.google.android.libraries.assistant.auto.tng.assistant.d.d.d dVar3 = (com.google.android.libraries.assistant.auto.tng.assistant.d.d.d) hVar64.a();
                jjVar40 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.c.f fVar3 = (com.google.android.libraries.assistant.auto.tng.c.f) jj.gt(jjVar40).a();
                jjVar41 = this.b.f308a;
                h js = jj.js(jjVar41);
                jrVar30 = this.f309a.b;
                h dH = jr.dH(jrVar30);
                jrVar31 = this.f309a.b;
                h cJ = jr.cJ(jrVar31);
                hVar65 = this.f309a.f;
                Context context4 = (Context) hVar65.a();
                hVar66 = this.f309a.uY;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.ag(executor7, gq, hI, he, iJ, iM, bVar4, mU, map2, fR, bVar5, aVar5, dP, dVar3, fVar3, js, dH, cJ, context4, hVar66);
            case 35:
                jjVar42 = this.b.f308a;
                h lN = jj.lN(jjVar42);
                jjVar43 = this.b.f308a;
                h lz = jj.lz(jjVar43);
                jjVar44 = this.b.f308a;
                h lu = jj.lu(jjVar44);
                jjVar45 = this.b.f308a;
                h gz = jj.gz(jjVar45);
                jjVar46 = this.b.f308a;
                h iq = jj.iq(jjVar46);
                jjVar47 = this.b.f308a;
                Optional of = Optional.of(jj.lE(jjVar47));
                jjVar48 = this.b.f308a;
                h iL = jj.iL(jjVar48);
                jrVar32 = this.f309a.b;
                h dh = jr.dh(jrVar32);
                jrVar33 = this.f309a.b;
                h dl = jr.dl(jrVar33);
                jjVar49 = this.b.f308a;
                Optional optional = (Optional) jj.iH(jjVar49).a();
                hVar67 = this.b.dH;
                Map map3 = (Map) hVar67.a();
                hVar68 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.b.a.c(lN, lz, lu, gz, iq, of, iL, dh, dl, optional, map3, (Executor) hVar68.a());
            case 36:
                jo joVar13 = this.f309a;
                ik ikVar12 = this.b;
                lz lzVar = new lz(joVar13, ikVar12);
                jjVar50 = ikVar12.f308a;
                Object mC = jjVar50.mC();
                hVar69 = this.f309a.wr;
                com.google.cj.i.f fVar4 = (com.google.cj.i.f) hVar69.a();
                ik ikVar13 = this.b;
                jo joVar14 = this.f309a;
                m fR2 = ikVar13.fR();
                hVar70 = joVar14.H;
                Executor executor8 = (Executor) hVar70.a();
                jyVar3 = this.f309a.f319a;
                h lk = jy.lk(jyVar3);
                jrVar34 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.i.a.b(lzVar, (com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.i.a.g) mC, fVar4, fR2, executor8, lk, (com.google.android.libraries.assistant.auto.tng.y.c) jr.ef(jrVar34).a());
            case 37:
                jo joVar15 = this.f309a;
                ik ikVar14 = this.b;
                lz lzVar2 = new lz(joVar15, ikVar14);
                jjVar51 = ikVar14.f308a;
                Object mB = jjVar51.mB();
                ik ikVar15 = this.b;
                jo joVar16 = this.f309a;
                m fR3 = ikVar15.fR();
                hVar71 = joVar16.wr;
                com.google.cj.i.f fVar5 = (com.google.cj.i.f) hVar71.a();
                hVar72 = this.f309a.H;
                Executor executor9 = (Executor) hVar72.a();
                jyVar4 = this.f309a.f319a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.g.a.b(lzVar2, (com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.g.a.f) mB, fR3, fVar5, executor9, jy.lk(jyVar4));
            case 38:
                jjVar52 = this.b.f308a;
                h lN2 = jj.lN(jjVar52);
                jjVar53 = this.b.f308a;
                h lz2 = jj.lz(jjVar53);
                jjVar54 = this.b.f308a;
                at k = at.k(jj.lt(jjVar54));
                jjVar55 = this.b.f308a;
                h lx = jj.lx(jjVar55);
                jjVar56 = this.b.f308a;
                Object mz = jjVar56.mz();
                jo joVar17 = this.f309a;
                lz lzVar3 = new lz(joVar17, this.b);
                hVar73 = joVar17.wr;
                com.google.cj.i.f fVar6 = (com.google.cj.i.f) hVar73.a();
                jjVar57 = this.b.f308a;
                com.google.android.libraries.search.assistant.az.a.b.a.c.a.a.a eG2 = jjVar57.eG();
                hVar74 = this.b.dH;
                Map map4 = (Map) hVar74.a();
                hVar75 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.f.a.e(lN2, lz2, k, lx, (com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.f.a.i) mz, lzVar3, fVar6, eG2, map4, (Executor) hVar75.a());
            case 39:
                jjVar58 = this.b.f308a;
                Object mg = jjVar58.mg();
                jo joVar18 = this.f309a;
                lz lzVar4 = new lz(joVar18, this.b);
                hVar76 = joVar18.wr;
                com.google.cj.i.f fVar7 = (com.google.cj.i.f) hVar76.a();
                hVar77 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.a.a.b((com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.a.a.f) mg, lzVar4, fVar7, (Executor) hVar77.a());
            case 40:
                jjVar59 = this.b.f308a;
                Object mr = jjVar59.mr();
                jo joVar19 = this.f309a;
                mm mmVar = new mm(joVar19, this.b);
                hVar78 = joVar19.nq;
                com.google.android.libraries.assistant.auto.tng.f.d.e.c cVar3 = (com.google.android.libraries.assistant.auto.tng.f.d.e.c) hVar78.a();
                ik ikVar16 = this.b;
                Map rm = ikVar16.rm();
                m fR4 = ikVar16.fR();
                hVar79 = ikVar16.ax;
                com.google.android.libraries.search.b.b bVar6 = (com.google.android.libraries.search.b.b) hVar79.a();
                hVar80 = this.f309a.wr;
                com.google.cj.i.f fVar8 = (com.google.cj.i.f) hVar80.a();
                hVar81 = this.f309a.H;
                Executor executor10 = (Executor) hVar81.a();
                hVar82 = this.b.dG;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.c.a.c((com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.c.a.g) mr, mmVar, cVar3, rm, fR4, bVar6, fVar8, executor10, (com.google.android.libraries.assistant.auto.tng.f.d.a.c.h) hVar82.a());
            case 41:
                jjVar60 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.h.a.a(jjVar60.dK());
            case 42:
                jjVar61 = this.b.f308a;
                return Optional.of((com.google.android.libraries.assistant.auto.jumpboost.e.d) jj.gy(jjVar61).a());
            case 43:
                return new com.google.android.libraries.assistant.auto.jumpboost.o.a.a();
            case 44:
                return new com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.o();
            case 45:
                hVar83 = this.f309a.eA;
                return com.google.android.libraries.assistant.auto.tng.b.g.b((io.grpc.i) hVar83.a());
            case 46:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.d.d();
            case 47:
                hVar84 = this.f309a.lT;
                return Optional.of((com.google.android.apps.gsa.languagepack.c.g) hVar84.a());
            case 48:
                hVar85 = this.b.aG;
                return Optional.of((com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar85.a());
            case 49:
                hVar86 = this.f309a.bo;
                ag agVar8 = (ag) hVar86.a();
                jjVar62 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.x.i ec = jjVar62.ec();
                jrVar35 = this.f309a.b;
                h dg = jr.dg(jrVar35);
                jjVar63 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.x.k(agVar8, ec, dg, jjVar63.eb());
            case 50:
                hVar87 = this.f309a.H;
                Executor executor11 = (Executor) hVar87.a();
                hVar88 = this.f309a.Q;
                ag agVar9 = (ag) hVar88.a();
                hVar89 = this.b.ej;
                com.google.android.libraries.assistant.k.a.a.c cVar4 = (com.google.android.libraries.assistant.k.a.a.c) hVar89.a();
                jjVar64 = this.b.f308a;
                h jN = jj.jN(jjVar64);
                jjVar65 = this.b.f308a;
                h jO = jj.jO(jjVar65);
                jjVar66 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.c.f(executor11, agVar9, cVar4, jN, jO, jj.jT(jjVar66));
            case 51:
                jjVar67 = this.b.f308a;
                return h.a.a.b.b.a.c.s(jjVar67.sf());
            case 52:
                jjVar68 = this.b.f308a;
                return h.a.a.b.b.a.c.t(jjVar68.sf());
            case 53:
                jjVar69 = this.b.f308a;
                return h.a.a.b.b.a.c.u(jjVar69.sf());
            case 54:
                jjVar70 = this.b.f308a;
                return Boolean.valueOf(h.a.a.b.b.a.c.q(jjVar70.sf()));
            case 55:
                return new com.google.android.apps.search.assistant.surfaces.b.a.d.a.a();
            case 56:
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.h.j.b(this.b.qg());
            case 57:
                return com.google.android.apps.search.assistant.surfaces.voice.h.a.f.a.b(this.b.qh());
            case 58:
                ik ikVar17 = this.b;
                jo joVar20 = this.f309a;
                hVar90 = ikVar17.g;
                hVar91 = joVar20.bN;
                com.google.apps.tiktok.account.data.b bVar7 = (com.google.apps.tiktok.account.data.b) hVar91.a();
                hVar92 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar92.a();
                hVar93 = this.b.ek;
                com.google.android.libraries.search.assistant.aj.d.b.e eVar10 = (com.google.android.libraries.search.assistant.aj.d.b.e) hVar93.a();
                hVar94 = this.f309a.wn;
                com.google.android.libraries.search.assistant.aj.d.a.g gVar4 = (com.google.android.libraries.search.assistant.aj.d.a.g) hVar94.a();
                hVar95 = this.b.ak;
                Optional of2 = Optional.of((com.google.android.apps.search.assistant.platform.g.j.c) hVar95.a());
                hVar96 = this.f309a.nn;
                return new com.google.android.libraries.search.assistant.aj.e.a.a.g(hVar90, bVar7, dVar4, eVar10, gVar4, of2, (KeyguardManager) hVar96.a());
            case 59:
                jjVar71 = this.b.f308a;
                return at.k(jjVar71.U());
            case 60:
                hVar97 = this.f309a.f;
                Context context5 = (Context) hVar97.a();
                jjVar72 = this.b.f308a;
                Set ng = jjVar72.ng();
                hVar98 = this.b.bZ;
                aa aaVar = (aa) hVar98.a();
                jjVar73 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ao.a.a bb = jjVar73.bb();
                jrVar36 = this.f309a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar2 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar36).a();
                hVar99 = this.b.g;
                AccountId accountId2 = (AccountId) hVar99.a();
                ik ikVar18 = this.b;
                boolean uN = ikVar18.uN();
                jjVar74 = ikVar18.f308a;
                boolean qa = jjVar74.qa();
                jjVar75 = this.b.f308a;
                boolean qI = jjVar75.qI();
                jjVar76 = this.b.f308a;
                boolean qP = jjVar76.qP();
                hVar100 = this.f309a.Q;
                ag agVar10 = (ag) hVar100.a();
                hVar101 = this.f309a.Y;
                String str = (String) hVar101.a();
                jjVar77 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ac.a.i aT = jjVar77.aT();
                jjVar78 = this.b.f308a;
                boolean rf = jjVar78.rf();
                jjVar79 = this.b.f308a;
                boolean booleanValue2 = ((Boolean) jj.jz(jjVar79).a()).booleanValue();
                hVar102 = this.b.cD;
                boolean booleanValue3 = ((Boolean) hVar102.a()).booleanValue();
                jjVar80 = this.b.f308a;
                boolean nj = jjVar80.nj();
                jjVar81 = this.b.f308a;
                long j = jjVar81.j();
                jjVar82 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d dVar5 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d) jj.gI(jjVar82).a();
                jjVar83 = this.b.f308a;
                boolean ns = jjVar83.ns();
                hVar103 = this.b.aV;
                com.google.android.libraries.search.b.b bVar8 = (com.google.android.libraries.search.b.b) hVar103.a();
                jjVar84 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.a br = jjVar84.br();
                jjVar85 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.b bVar9 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.b) jj.le(jjVar85).a();
                jjVar86 = this.b.f308a;
                boolean nt = jjVar86.nt();
                jrVar37 = this.f309a.b;
                boolean hG = jrVar37.hG();
                hVar104 = this.b.aO;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) hVar104.a();
                jjVar87 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ao.d ba = jjVar87.ba();
                jjVar88 = this.b.f308a;
                u bj = jjVar88.bj();
                hVar105 = this.b.aa;
                com.google.apps.tiktok.g.p pVar3 = (com.google.apps.tiktok.g.p) hVar105.a();
                hVar106 = this.f309a.v;
                return new ad(context5, ng, aaVar, bb, pVar2, accountId2, uN, qa, qI, qP, agVar10, str, aT, rf, booleanValue2, booleanValue3, nj, j, dVar5, ns, bVar8, br, bVar9, nt, hG, kVar, ba, bj, pVar3, (Executor) hVar106.a());
            case 61:
                hVar107 = this.f309a.bt;
                n nVar = (n) hVar107.a();
                hVar108 = this.f309a.bu;
                ag agVar11 = (ag) hVar108.a();
                hVar109 = this.f309a.f;
                Context context6 = (Context) hVar109.a();
                jo joVar21 = this.f309a;
                AccountManager u = joVar21.u();
                jrVar38 = joVar21.b;
                q qVar = (q) jr.bA(jrVar38).a();
                hVar110 = this.b.g;
                AccountId accountId3 = (AccountId) hVar110.a();
                hVar111 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar6 = (com.google.apps.tiktok.account.data.a.d) hVar111.a();
                jjVar89 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.g(nVar, agVar11, context6, u, qVar, accountId3, dVar6, jjVar89.qT());
            case 62:
                return Boolean.valueOf(r.f(this.b.ym()));
            case 63:
                hVar112 = this.f309a.f;
                Context context7 = (Context) hVar112.a();
                hVar113 = this.b.g;
                AccountId accountId4 = (AccountId) hVar113.a();
                jjVar90 = this.b.f308a;
                nz sH = jjVar90.sH();
                hVar114 = this.f309a.Q;
                ag agVar12 = (ag) hVar114.a();
                ik ikVar19 = this.b;
                jo joVar22 = this.f309a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.execution.d.g ch = ikVar19.ch();
                hVar115 = joVar22.nn;
                KeyguardManager keyguardManager = (KeyguardManager) hVar115.a();
                jjVar91 = this.b.f308a;
                boolean nn = jjVar91.nn();
                jjVar92 = this.b.f308a;
                boolean no = jjVar92.no();
                jjVar93 = this.b.f308a;
                boolean np = jjVar93.np();
                jjVar94 = this.b.f308a;
                boolean nq = jjVar94.nq();
                jjVar95 = this.b.f308a;
                return new ae(context7, accountId4, sH, agVar12, ch, keyguardManager, nn, no, np, nq, jjVar95.nr());
            case 64:
                return new nz(this);
            case 65:
                jjVar96 = this.b.f308a;
                lt ltVar = (lt) jj.hm(jjVar96).a();
                hVar116 = this.f309a.Q;
                ag agVar13 = (ag) hVar116.a();
                jjVar97 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d(ltVar, agVar13, jjVar97.ro());
            case 66:
                return new lt(this);
            case 67:
                jjVar98 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.m.a.h aI = jjVar98.aI();
                hVar117 = this.f309a.ez;
                com.google.common.v.f fVar9 = (com.google.common.v.f) hVar117.a();
                hVar118 = this.b.bp;
                am amVar = (am) hVar118.a();
                jjVar99 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.m.a.n aJ = jjVar99.aJ();
                hVar119 = this.f309a.Q;
                ag agVar14 = (ag) hVar119.a();
                jjVar100 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.m.a.aa(aI, fVar9, amVar, aJ, agVar14, (ak) jj.lA(jjVar100).a(), this.b.wv());
            case 68:
                hVar120 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar120.a();
                hVar121 = this.b.cX;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.f fVar10 = (com.google.android.apps.search.assistant.surfaces.voice.robin.x.f) hVar121.a();
                jjVar101 = this.b.f308a;
                v bp = jjVar101.bp();
                hVar122 = this.b.cX;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.f fVar11 = (com.google.android.apps.search.assistant.surfaces.voice.robin.x.f) hVar122.a();
                hVar123 = this.f309a.ez;
                com.google.common.v.f fVar12 = (com.google.common.v.f) hVar123.a();
                ik ikVar20 = this.b;
                jo joVar23 = this.f309a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.h bl = ikVar20.bl();
                hVar124 = joVar23.Q;
                ag agVar15 = (ag) hVar124.a();
                jjVar102 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.j.r bo = jjVar102.bo();
                jjVar103 = this.b.f308a;
                boolean nl = jjVar103.nl();
                hVar125 = this.f309a.Y;
                String str2 = (String) hVar125.a();
                jrVar39 = this.f309a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.j(auVar, fVar10, bp, fVar11, fVar12, bl, agVar15, bo, nl, str2, (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar39).a());
            case 69:
                ik ikVar21 = this.b;
                jo joVar24 = this.f309a;
                com.google.apps.tiktok.q.b.h c2 = z.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar21.kf();
                hVar126 = joVar24.w;
                return z.b(c2, kf2, (com.google.android.libraries.storage.a.j) hVar126.a());
            case 70:
                hVar127 = this.f309a.Q;
                return new ak((ag) hVar127.a());
            case 71:
                jjVar104 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.b.a.q aF = jjVar104.aF();
                ik ikVar22 = this.b;
                Optional empty2 = Optional.empty();
                jjVar105 = ikVar22.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.b.a(aF, empty2, jjVar105.az());
            case 72:
                jjVar106 = this.b.f308a;
                boolean nL = jjVar106.nL();
                jjVar107 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.a.ak aD = jjVar107.aD();
                jjVar108 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.b.a.i(nL, aD, jjVar108.aE(), 1);
            case 73:
                hVar128 = this.f309a.Y;
                String str3 = (String) hVar128.a();
                hVar129 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar129.a();
                hVar130 = this.f309a.Q;
                ag agVar16 = (ag) hVar130.a();
                ik ikVar23 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.e cQ = ikVar23.cQ();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.p cN = ikVar23.cN();
                ac ct2 = ikVar23.ct();
                jjVar109 = ikVar23.f308a;
                boolean nQ = jjVar109.nQ();
                jjVar110 = this.b.f308a;
                boolean nT = jjVar110.nT();
                jrVar40 = this.f309a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar4 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar40).a();
                jjVar111 = this.b.f308a;
                boolean nU = jjVar111.nU();
                jjVar112 = this.b.f308a;
                ao fI = jjVar112.fI();
                jjVar113 = this.b.f308a;
                boolean nX = jjVar113.nX();
                ik ikVar24 = this.b;
                jo joVar25 = this.f309a;
                boolean tv = ikVar24.tv();
                hVar131 = joVar25.g;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.a.ac(str3, auVar2, agVar16, cQ, cN, ct2, nQ, nT, pVar4, nU, fI, nX, tv, (com.google.android.libraries.g.a) hVar131.a());
            case 74:
                return new lt(this);
            case 75:
                jjVar114 = this.b.f308a;
                boolean nL2 = jjVar114.nL();
                jjVar115 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.a.q aC = jjVar115.aC();
                jjVar116 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.b.a.i(nL2, aC, jjVar116.aE(), 0);
            case 76:
                jjVar117 = this.b.f308a;
                boolean nL3 = jjVar117.nL();
                jjVar118 = this.b.f308a;
                boolean oY = jjVar118.oY();
                hVar132 = this.b.bA;
                com.google.android.apps.search.assistant.surfaces.voice.robin.y.au auVar3 = (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) hVar132.a();
                jjVar119 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.b.a.j(nL3, oY, auVar3, jjVar119.aE());
            case 77:
                return new lt(this);
            case 78:
                return new lt(this);
            case 79:
                return new ls();
            case 80:
                return new lt(this);
            case 81:
                return new dg(this.b.ct());
            case 82:
                ik ikVar25 = this.b;
                jo joVar26 = this.f309a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.j.a.i.a.g.c();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar25.kf();
                hVar133 = joVar26.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.j.a.i.a.g.b(c3, kf3, (com.google.android.libraries.storage.a.j) hVar133.a());
            case 83:
                jjVar120 = this.b.f308a;
                boolean qQ = jjVar120.qQ();
                hVar134 = this.f309a.Q;
                ag agVar17 = (ag) hVar134.a();
                jjVar121 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.g.d aS = jjVar121.aS();
                jjVar122 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.g(qQ, agVar17, aS, jjVar122.aR());
            case 84:
                jjVar123 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.g gVar5 = (com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.g) jj.kE(jjVar123).a();
                hVar135 = this.f309a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k(gVar5, (ag) hVar135.a());
            case 85:
                return new lt(this);
            case 86:
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.c.b bVar10 = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.c.b();
                dm dmVar = new dm();
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.input.a.b bVar11 = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.input.a.b();
                jjVar124 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.i(bVar10, dmVar, bVar11, jjVar124.bm(), new db());
            case 87:
                jjVar125 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.ui.i.a.b.h bn = jjVar125.bn();
                hVar136 = this.f309a.vx;
                com.google.android.libraries.search.ai.i iVar = (com.google.android.libraries.search.ai.i) hVar136.a();
                hVar137 = this.f309a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.i.a.j(bn, iVar, (ag) hVar137.a(), this.b.jI());
            case 88:
                ik ikVar26 = this.b;
                jo joVar27 = this.f309a;
                com.google.apps.tiktok.q.b.h b2 = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.i.a.b.k.b();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar26.kf();
                hVar138 = joVar27.w;
                return com.google.android.apps.search.assistant.surfaces.voice.robin.ui.i.a.b.k.c(b2, kf4, (com.google.android.libraries.storage.a.j) hVar138.a());
            case 89:
                jjVar126 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.au(jj.gB(jjVar126));
            case 90:
                jjVar127 = this.b.f308a;
                ab bc = jjVar127.bc();
                hVar139 = this.f309a.Q;
                return new bd(bc, (ag) hVar139.a());
            case 91:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.e();
            case 92:
                jjVar128 = this.b.f308a;
                long l = jjVar128.l();
                hVar140 = this.f309a.f;
                Context context8 = (Context) hVar140.a();
                hVar141 = this.f309a.bu;
                ag agVar18 = (ag) hVar141.a();
                jjVar129 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b.m X = jjVar129.X();
                hVar142 = this.f309a.ez;
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b.h(l, context8, agVar18, X, (com.google.common.v.f) hVar142.a());
            case 93:
                hVar143 = this.f309a.f;
                Context context9 = (Context) hVar143.a();
                hVar144 = this.f309a.Q;
                ag agVar19 = (ag) hVar144.a();
                jjVar130 = this.b.f308a;
                boolean qW = jjVar130.qW();
                jjVar131 = this.b.f308a;
                double a2 = jjVar131.a();
                jjVar132 = this.b.f308a;
                double d = jjVar132.d();
                jjVar133 = this.b.f308a;
                double e = jjVar133.e();
                jjVar134 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.d.c(context9, agVar19, qW, a2, d, e, jjVar134.aW());
            case 94:
                hVar145 = this.f309a.f;
                Context context10 = (Context) hVar145.a();
                hVar146 = this.b.bx;
                bp bpVar = (bp) hVar146.a();
                ik ikVar27 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.e cQ2 = ikVar27.cQ();
                jjVar135 = ikVar27.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.a.o aY = jjVar135.aY();
                jjVar136 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.a.e aX = jjVar136.aX();
                jjVar137 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.c.y yVar2 = (com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.c.y) jj.jl(jjVar137).a();
                ik ikVar28 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.robin.x.bd cw = ikVar28.cw();
                jjVar138 = ikVar28.f308a;
                boolean qX = jjVar138.qX();
                jjVar139 = this.b.f308a;
                boolean qY = jjVar139.qY();
                jjVar140 = this.b.f308a;
                boolean qZ = jjVar140.qZ();
                jjVar141 = this.b.f308a;
                lt ltVar2 = (lt) jj.hg(jjVar141).a();
                jjVar142 = this.b.f308a;
                boolean rc = jjVar142.rc();
                jjVar143 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.v(context10, bpVar, cQ2, aY, aX, yVar2, cw, qX, qY, qZ, ltVar2, rc, jjVar143.aW());
            case 95:
                jjVar144 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.c.ab(jjVar144.aZ(), 0);
            case 96:
                return Boolean.valueOf(r.g(this.b.ys()));
            case 97:
                return Boolean.valueOf(r.i(this.b.ys()));
            case 98:
                return Boolean.valueOf(r.h(this.b.ys()));
            case 99:
                return Boolean.valueOf(r.j(this.b.ys()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.c;
        switch (i) {
            case 100:
                return new lt(this);
            case 101:
                com.google.frameworks.client.data.android.server.tiktok.ac acVar = (com.google.frameworks.client.data.android.server.tiktok.ac) this.f309a.em.a();
                io.grpc.i qh = this.b.qh();
                acVar.getClass();
                com.google.android.libraries.search.ah.at e = acVar.e(new com.google.android.libraries.search.ah.at(qh, io.grpc.h.a), "conversational-soda");
                e.getClass();
                return e;
            case 102:
                return new lt(this);
            case 103:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.c.aa.a(this.b.f308a.aZ());
            case 104:
                return new lt(this);
            case 105:
                return new lt(this);
            case 106:
                return new lt(this);
            case 107:
                return new lt(this);
            case 108:
                return new lt(this);
            case 109:
                ag agVar = (ag) this.f309a.Q.a();
                com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.c cVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.c) this.b.by.a();
                ik ikVar = this.b;
                return new al(agVar, cVar, ikVar.cS(), ikVar.cw(), (lt) ikVar.f308a.Y.a(), this.b.f308a.rg());
            case 110:
                return new lt(this);
            case 111:
                return new lt(this);
            case 112:
                return new lt(this);
            case 113:
                return new lt(this);
            case 114:
                return new lt(this);
            case 115:
                return new il(this, 0);
            case 116:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.b((ag) this.f309a.Q.a());
            case 117:
                return at.k((com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d) this.b.f308a.Q.a());
            case 118:
                com.google.android.libraries.search.ac.b.c.i iVar = (com.google.android.libraries.search.ac.b.c.i) this.b.f308a.ar.a();
                cq cqVar = (cq) this.f309a.H.a();
                jj jjVar = this.b.f308a;
                return new com.google.android.apps.search.googleapp.search.suggest.b.j(iVar, cqVar, jjVar.ni(), jjVar.nG(), jjVar.fc(), jjVar.nM());
            case 119:
                com.google.android.libraries.search.ac.b.c.h hVar = (com.google.android.apps.search.googleapp.search.suggest.c.g) this.b.f308a.an.a();
                com.google.android.libraries.search.ac.b.c.w wVar = (x) this.b.f308a.ap.a();
                lt ltVar = (lt) this.b.f308a.aq.a();
                boolean nu = this.b.f308a.nu();
                hVar.getClass();
                wVar.getClass();
                ltVar.getClass();
                if (nu) {
                    hVar = ltVar.aC(wVar);
                }
                return hVar;
            case 120:
                return new com.google.android.apps.search.googleapp.search.suggest.c.g((com.google.android.libraries.g.a) this.f309a.g.a(), (com.google.android.apps.search.googleapp.search.suggest.f.c) this.b.f308a.am.a());
            case 121:
                return new com.google.android.apps.search.googleapp.search.suggest.f.c((com.google.android.libraries.g.a) this.f309a.g.a(), (cq) this.f309a.H.a(), (cq) this.f309a.v.a());
            case 122:
                com.google.android.libraries.search.ac.b.c.w wVar2 = (com.google.android.apps.search.googleapp.search.suggest.f.c) this.b.f308a.am.a();
                lt ltVar2 = (lt) this.b.f308a.ao.a();
                boolean nu2 = this.b.f308a.nu();
                wVar2.getClass();
                ltVar2.getClass();
                if (nu2) {
                    wVar2 = ltVar2.aD();
                }
                return wVar2;
            case 123:
                return new lt(this);
            case 124:
                return new lt(this);
            case 125:
                return new im(this, 0);
            case 126:
                com.google.android.libraries.search.ad.a.h rp = jj.rp(this.b.f308a);
                rp.a();
                rp.b(2);
                rp.c = new op("enable_corpus_com.google.android.gms/internal.3p:MobileApplication");
                rp.b = false;
                rp.c(new com.google.android.apps.search.googleapp.search.suggest.g.z());
                com.google.android.libraries.search.ad.a.k kVar = new com.google.android.libraries.search.ad.a.k(rp);
                com.google.apps.tiktok.q.b.g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "AppSuggestionsSetting";
                a2.c(com.google.android.apps.search.googleapp.search.suggest.g.a.a);
                a2.b().h(kVar);
                return this.b.kf().a(a2.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 127:
                com.google.apps.tiktok.q.b.g a3 = com.google.apps.tiktok.q.b.h.a();
                a3.f5883a = "SourceControlSuggestSetting";
                a3.c(com.google.android.apps.search.googleapp.search.suggest.g.x.a);
                return this.b.kf().a(a3.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 128:
                return new in(this, 0);
            case 129:
                return new lt(this);
            case 130:
                return new com.google.android.apps.search.googleapp.search.suggest.plugins.c.b.j((Context) this.f309a.f.a(), (cg) this.b.f308a.as.a(), (n) this.f309a.P.a(), (com.google.android.libraries.g.a) this.f309a.g.a(), ((Boolean) this.b.f308a.at.a()).booleanValue(), ((com.google.apps.tiktok.experiments.e) this.b.f308a.si().a.a()).a("com.google.android.libraries.search.googleapp.user 45390918").d(), ((com.google.apps.tiktok.experiments.e) this.b.f308a.si().a.a()).a("com.google.android.libraries.search.googleapp.user 45390919").d());
            case 131:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "ContactRankingSignalsStore";
                a4.c(com.google.android.apps.search.googleapp.search.suggest.plugins.c.b.q.a);
                return this.b.kf().a(a4.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 132:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.si().a.a()).a("com.google.android.libraries.search.googleapp.user 45388845").f());
            case 133:
                return new lt(this);
            case 134:
                return com.google.apps.tiktok.cache.d.a((Executor) this.f309a.H.a(), com.google.apps.tiktok.cache.f.a().a(), (com.google.android.libraries.g.a) this.f309a.g.a());
            case 135:
                return new ls();
            case 136:
                return new lt(this);
            case 137:
                return new ip(this, 0);
            case 138:
                jr jrVar = this.f309a.b;
                return new com.google.android.libraries.search.ap.b.b(jrVar.hH(), jrVar.fe(), jrVar.bm(), jrVar.bn());
            case 139:
                return com.google.android.libraries.search.v.b.a.b((com.google.android.libraries.search.trust.c.m) this.b.M.a());
            case 140:
                return new com.google.android.apps.search.googleapp.d.f((String) this.f309a.Y.a(), (Context) this.f309a.f.a(), (cg) this.f309a.b.dF.a(), (ag) this.f309a.Q.a(), ((com.google.apps.tiktok.experiments.e) this.b.f308a.sp().a.a()).a("com.google.android.libraries.search.googleapp.user 308").e(), this.b.f308a.by(), (PackageManager) this.f309a.h.a());
            case 141:
                return ((com.google.android.libraries.search.f.h) this.b.f308a.aG.a()).a(this.f309a.YB());
            case 142:
                return new com.google.android.libraries.search.f.h(this.b.el, this.f309a.H);
            case 143:
                return new op(this.b.f308a.rr());
            case 144:
                boolean q = this.f309a.b.jg().q();
                com.google.protos.ac.b d = ((com.google.apps.tiktok.experiments.e) this.f309a.b.jg().a.a()).a("com.google.android.libraries.search.googleapp.device 45409775").d();
                cg cgVar = (cg) this.b.f308a.aH.a();
                n nVar = (n) this.f309a.P.a();
                ao d2 = ((com.google.apps.tiktok.experiments.e) this.f309a.b.jg().a.a()).a("com.google.android.libraries.search.googleapp.device 45406949").d();
                boolean m = this.f309a.b.jg().m();
                boolean f = ((com.google.apps.tiktok.experiments.e) this.f309a.b.jg().a.a()).a("com.google.android.libraries.search.googleapp.device 45641925").f();
                ag agVar2 = (ag) this.f309a.Q.a();
                com.google.apps.tiktok.concurrent.k kVar2 = (com.google.apps.tiktok.concurrent.k) this.f309a.L.a();
                com.google.apps.tiktok.p.b.c cVar2 = (com.google.apps.tiktok.p.b.c) this.b.X.a();
                com.google.common.v.f fVar = (com.google.common.v.f) this.f309a.ez.a();
                jj jjVar2 = this.b.f308a;
                h hVar2 = jjVar2.aI;
                com.google.android.apps.search.googleapp.labs.b cm = jjVar2.cm();
                com.google.android.apps.search.googleapp.labs.a.o cn = jjVar2.cn();
                af afVar = (af) hVar2.a();
                com.google.android.libraries.phenotype.client.a.i iVar2 = (com.google.android.libraries.phenotype.client.a.i) this.f309a.x.a();
                jj jjVar3 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.labs.g.z(q, d, cgVar, nVar, d2, m, f, agVar2, kVar2, cVar2, fVar, cm, cn, afVar, iVar2, jjVar3.cq(), jjVar3.co());
            case 145:
                return this.b.kf().a(com.google.android.apps.search.googleapp.labs.g.b.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 146:
                return this.b.kf().a(com.google.android.apps.search.googleapp.labs.a.x.c(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 147:
                return this.b.kf().a(com.google.android.apps.search.googleapp.labs.a.x.b(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 148:
                return new af();
            case 149:
                com.google.apps.tiktok.q.b.a a5 = com.google.apps.tiktok.q.b.b.a();
                a5.a = "ClientResponse";
                com.google.android.apps.search.googleapp.labs.i.a.a aVar = com.google.android.apps.search.googleapp.labs.i.a.a.a;
                if (aVar == null) {
                    throw new NullPointerException("Null schema");
                }
                a5.b = aVar;
                com.google.apps.tiktok.q.b.b a6 = a5.a();
                ik ikVar2 = this.b;
                MessageLite messageLite = a6.c;
                com.google.apps.tiktok.account.d.b.b fv = ikVar2.f308a.fv();
                messageLite.getClass();
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry.getClass();
                bc bcVar = new bc(messageLite, generatedRegistry);
                Optional optional = a6.e;
                optional.getClass();
                androidx.g.a.a.b bVar = (androidx.g.a.a.b) optional.orElse((Object) null);
                fl flVar = a6.b;
                flVar.getClass();
                return androidx.g.a.k.b(bcVar, bVar, flVar, fv.a, new com.google.apps.tiktok.account.d.b.a(fv, a6));
            case 150:
                com.google.apps.tiktok.q.b.g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "LabsConsistencyToken";
                a7.c(com.google.bz.c.a.a.ah.a.a);
                return this.b.kf().a(a7.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 151:
                com.google.android.libraries.search.b.b a8 = ((com.google.android.libraries.search.t.a.a) this.b.J.a()).a(com.google.android.libraries.search.t.c.GOOGLE_APP);
                a8.getClass();
                return a8;
            case 152:
                com.google.apps.tiktok.q.b.g a9 = com.google.apps.tiktok.q.b.h.a();
                a9.f5883a = "ZeroPrefixData";
                a9.c(com.google.android.libraries.search.ac.a.k.a);
                return this.b.kf().a(a9.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 153:
                return new com.google.android.apps.search.googleapp.search.suggest.c.d();
            case 154:
                com.google.apps.tiktok.q.b.g a10 = com.google.apps.tiktok.q.b.h.a();
                a10.f5883a = "PreviousQueryData";
                a10.c(com.google.android.libraries.search.ac.a.b.a);
                return this.b.kf().a(a10.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 155:
                lt ltVar3 = (lt) this.b.f308a.aN.a();
                com.google.android.libraries.search.ac.b.c.w wVar3 = (x) this.b.f308a.ap.a();
                com.google.android.libraries.search.ac.b.c.h hVar3 = (com.google.android.libraries.search.ac.b.c.i) this.b.f308a.ar.a();
                com.google.android.libraries.search.ac.b.c.m mVar = (com.google.android.libraries.search.ac.b.c.m) this.b.f308a.aP.a();
                com.google.android.apps.search.googleapp.search.suggest.sources.a.f fVar2 = (com.google.android.apps.search.googleapp.search.suggest.sources.a.f) this.b.f308a.aS.a();
                boolean nu3 = this.b.f308a.nu();
                ltVar3.getClass();
                wVar3.getClass();
                hVar3.getClass();
                mVar.getClass();
                fVar2.getClass();
                return nu3 ? ltVar3.aA(wVar3, hVar3, mVar) : fVar2;
            case 156:
                return new lt(this);
            case 157:
                ls lsVar = (ls) this.b.f308a.aO.a();
                com.google.android.libraries.search.b.b bVar2 = (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a();
                lsVar.getClass();
                bVar2.getClass();
                return new com.google.android.libraries.search.ac.b.c.m(bVar2);
            case 158:
                return new ls();
            case 159:
                return new com.google.android.apps.search.googleapp.search.suggest.sources.a.f((com.google.android.libraries.g.a) this.f309a.g.a(), (com.google.android.apps.search.googleapp.search.suggest.f.c) this.b.f308a.am.a(), (com.google.android.apps.search.googleapp.search.suggest.c.g) this.b.f308a.an.a(), new com.google.android.libraries.search.ac.b.c.f(), (com.google.android.apps.search.googleapp.search.suggest.c.k) this.b.f308a.aR.a());
            case 160:
                return new com.google.android.apps.search.googleapp.search.suggest.c.k((com.google.android.libraries.search.b.b) this.b.f308a.aJ.a(), this.b.f308a.cF());
            case 161:
                ik ikVar3 = this.b;
                return com.google.android.apps.search.googleapp.x.a.d.b(ikVar3.jt(), Optional.of((com.google.android.libraries.search.t.e.j) ikVar3.F.a()));
            case 162:
                return new com.google.android.libraries.search.rendering.xuikit.c.h.v((t) this.f309a.f319a.er.a(), (com.google.android.libraries.search.rendering.xuikit.c.h.g) this.b.f308a.aU.a());
            case 163:
                return new com.google.android.libraries.search.rendering.xuikit.c.h.g((com.google.android.libraries.search.rendering.xuikit.c.h.h) this.f309a.f319a.et.a());
            case 164:
                return com.google.apps.tiktok.cache.d.a((Executor) this.f309a.H.a(), com.google.apps.tiktok.cache.f.a().a(), (com.google.android.libraries.g.a) this.f309a.g.a());
            case 165:
                return new com.google.android.apps.search.googleapp.search.suggest.sources.a.b.m();
            case 166:
                com.google.apps.tiktok.q.b.g a11 = com.google.apps.tiktok.q.b.h.a();
                a11.f5883a = "AutocompleteWithTrendingSearchesSetting";
                a11.c(com.google.android.libraries.search.ac.b.g.i.g.a);
                return this.b.kf().a(a11.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 167:
                com.google.apps.tiktok.q.b.g a12 = com.google.apps.tiktok.q.b.h.a();
                a12.f5883a = "SuggestInContextControl";
                a12.c(com.google.android.libraries.search.ac.b.g.e.g.a);
                return this.b.kf().a(a12.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 168:
                com.google.apps.tiktok.q.b.g a13 = com.google.apps.tiktok.q.b.h.a();
                a13.f5883a = "InlineSurvey";
                a13.c(com.google.android.apps.search.googleapp.search.suggest.plugins.f.a.a.a);
                return this.b.kf().a(a13.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 169:
                return new lt(this);
            case 170:
                com.google.apps.tiktok.q.b.g a14 = com.google.apps.tiktok.q.b.h.a();
                a14.d = new com.google.apps.tiktok.q.a.c(2, 2);
                a14.f5883a = "CompleteServerZeroPrefixCache";
                a14.c(ai.a);
                return this.b.kf().a(a14.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 171:
                return new com.google.android.apps.search.googleapp.x.a.b(this.b.f308a.eP());
            case 172:
                com.google.apps.tiktok.q.b.g a15 = com.google.apps.tiktok.q.b.h.a();
                a15.f5883a = "SuggestUsageDataStore";
                a15.c(com.google.android.apps.search.googleapp.search.suggest.b.e.f.a);
                return this.b.kf().a(a15.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 173:
                Optional of = Optional.of(this.b.f308a.cV());
                n nVar2 = (n) this.f309a.P.a();
                jj jjVar4 = this.b.f308a;
                h hVar4 = jjVar4.aZ;
                com.google.android.apps.search.googleapp.search.suggest.g.o cQ = jjVar4.cQ();
                com.google.android.apps.search.googleapp.search.suggest.sources.a.a.g gVar = (com.google.android.apps.search.googleapp.search.suggest.sources.a.a.g) hVar4.a();
                ik ikVar4 = this.b;
                jo joVar = this.f309a;
                com.google.android.libraries.search.ac.b.g.b.d fh = ikVar4.f308a.fh();
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) joVar.g.a();
                ik ikVar5 = this.b;
                jo joVar2 = this.f309a;
                jj jjVar5 = ikVar5.f308a;
                return new com.google.android.apps.search.googleapp.search.suggest.sources.a.a.n(of, nVar2, cQ, gVar, fh, aVar2, jjVar5.fM(), jjVar5.n(), jjVar5.ny(), jjVar5.nz(), jjVar5.o(), jjVar5.nA(), jjVar5.nB(), jjVar5.fN(), jjVar5.fO(), jjVar5.nC(), jjVar5.nD(), jjVar5.fP(), jjVar5.p(), jjVar5.nE(), (Context) joVar2.f.a());
            case 174:
                com.google.apps.tiktok.q.b.g a16 = com.google.apps.tiktok.q.b.h.a();
                a16.f5883a = "OfflineSuggestSetting";
                a16.c(com.google.android.apps.search.googleapp.search.suggest.g.p.a);
                return this.b.kf().a(a16.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 175:
                return new com.google.android.apps.search.googleapp.search.suggest.sources.a.a.g();
            case 176:
                com.google.apps.tiktok.q.b.g a17 = com.google.apps.tiktok.q.b.h.a();
                a17.f5883a = "SourceControlSuggest";
                a17.c(com.google.android.apps.search.googleapp.search.suggest.plugins.h.j.a);
                return this.b.kf().a(a17.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 177:
                return new com.google.android.libraries.search.ac.b.d.a(((com.google.apps.tiktok.experiments.e) this.b.f308a.ma().a.a()).a("com.google.android.libraries.search.searchbox.user 45633900").f());
            case 178:
                return new com.google.android.apps.search.googleapp.search.suggest.plugins.f.j();
            case 179:
                return new com.google.android.apps.search.googleapp.search.suggest.plugins.f.a();
            case 180:
                return new com.google.android.apps.search.googleapp.search.suggest.c.e();
            case 181:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45531746").f());
            case 182:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45628522").f());
            case 183:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.b.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45648329").f());
            case 184:
                return new lt(this);
            case 185:
                return new ls();
            case 186:
                return com.google.android.libraries.search.v.b.a.d((com.google.android.libraries.search.trust.c.m) this.b.M.a());
            case 187:
                return new com.google.android.apps.search.googleapp.search.suggest.b.c((com.google.android.apps.search.googleapp.search.suggest.sources.a.a.n) this.b.f308a.ba.a(), (com.google.android.apps.search.googleapp.search.suggest.b.af) this.b.f308a.mx(), (ag) this.f309a.Q.a());
            case 188:
                return this.b.kg().a(com.google.android.apps.search.assistant.surfaces.voice.b.b.a.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 189:
                return new com.google.android.apps.search.assistant.surfaces.voice.b.a.h(this.b.qg(), io.grpc.h.a);
            case 190:
                return this.b.kg().a(com.google.android.apps.search.assistant.libraries.dictation.b.a.g.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 191:
                com.google.android.apps.search.assistant.libraries.dictation.e.g a18 = com.google.android.apps.search.assistant.libraries.dictation.e.k.a(this.b.qh());
                a18.getClass();
                return a18;
            case 192:
                jj jjVar6 = this.b.f308a;
                h hVar5 = jjVar6.bs;
                com.google.android.apps.search.assistant.surfaces.voice.l.a.a.h aw = jjVar6.aw();
                com.google.android.libraries.assistant.c.b.c.d dVar = (com.google.android.libraries.assistant.c.b.c.d) hVar5.a();
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f309a.wN.a();
                cr crVar = (cr) this.f309a.H.a();
                Context context = (Context) this.f309a.f.a();
                jj jjVar7 = this.b.f308a;
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.u(aw, dVar, connectivityManager, crVar, context, jjVar7.B(), (com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.d) jjVar7.mA());
            case 193:
                return new com.google.android.libraries.assistant.c.b.f.a.d((com.google.android.libraries.assistant.c.b.f.a.d) this.b.f308a.mq(), (cr) this.f309a.H.a());
            case 194:
                com.google.android.libraries.assistant.c.b.c.a aVar3 = this.b.f308a.rY().k() ? com.google.android.libraries.assistant.c.b.c.a.TMP_MODEL_PROMPT : com.google.android.libraries.assistant.c.b.c.a.TNG_INIT_DOWNLOAD;
                aVar3.getClass();
                return aVar3;
            case 195:
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.al(this.b.f308a.ax(), (lt) this.f309a.vS.a(), h.a.a.f.b.a.n.c(this.b.l), h.a.a.f.b.a.n.d(this.b.l));
            case 196:
                ag agVar3 = (ag) this.f309a.Q.a();
                lt ltVar4 = (lt) this.f309a.vT.a();
                boolean k = h.a.a.f.b.a.n.k(this.b.l);
                ik ikVar6 = this.b;
                jj jjVar8 = ikVar6.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.d(agVar3, ltVar4, k, jjVar8.mO(), jjVar8.fW(), jjVar8.nR(), ikVar6.aR(), h.a.a.f.b.a.n.l(ikVar6.l));
            case 197:
                com.google.android.libraries.assistant.c.b.c.d d3 = io.grpc.j.a.d(new com.google.android.libraries.assistant.c.b.c.b(), this.b.qh(), io.grpc.h.a);
                d3.getClass();
                return d3;
            case 198:
                return new aj(((com.google.apps.tiktok.experiments.e) this.b.f308a.lY().a.a()).a("com.google.android.apps.gsa.pcp.user 4").d(), ((com.google.apps.tiktok.experiments.e) this.b.f308a.lY().a.a()).a("com.google.android.apps.gsa.pcp.user 12").b());
            case 199:
                return new com.google.android.apps.search.assistant.platform.g.d.a.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.c;
        switch (i) {
            case 200:
                return this.b.kg().a(com.google.android.apps.search.assistant.platform.g.d.a.b.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 201:
                return this.b.kf().a(com.google.android.apps.search.assistant.platform.g.l.a.a.a(this.b.f308a.F()), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 202:
                return ha.s(new com.google.android.libraries.assistant.contexttrigger.a.d(this.b.f308a.b.gn()), this.b.f308a.E());
            case 203:
                com.google.android.apps.search.assistant.platform.g.g.b.c cVar = (com.google.android.apps.search.assistant.platform.g.g.b.c) this.b.aj.a();
                ag agVar = (ag) this.f309a.Q.a();
                ag agVar2 = (ag) this.f309a.bo.a();
                cr crVar = (cr) this.f309a.v.a();
                Context context = (Context) this.f309a.f.a();
                ik ikVar = this.b;
                jo joVar = this.f309a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.p(cVar, agVar, agVar2, crVar, context, (l) ikVar.f308a.mi(), ikVar.f308a.bx, (ag) joVar.bu.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.i.n) this.f309a.b.dL.a(), this.f309a.b.fB());
            case 204:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds(this.b.f308a.M(), (Executor) this.f309a.v.a());
            case 205:
                return new de((n) this.f309a.R.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.room.a) this.f309a.qM.a(), this.b.f308a.N(), (ea) this.f309a.qO.a(), (com.google.common.v.f) this.f309a.ez.a(), (com.google.android.libraries.search.t.i.y) this.f309a.W.a());
            case 206:
                ag agVar3 = (ag) this.f309a.bu.a();
                cr crVar2 = (cr) this.f309a.H.a();
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.d.a.i iVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.d.a.i) this.b.f308a.bA.a();
                ik ikVar2 = this.b;
                jo joVar2 = this.f309a;
                jr jrVar = joVar2.b;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.i.b O = ikVar2.f308a.O();
                boolean fC = jrVar.fC();
                Context context2 = (Context) joVar2.ux.a();
                jo joVar3 = this.f309a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.d.o(agVar3, crVar2, iVar, O, fC, context2, joVar3.f319a.rC(), (com.google.android.libraries.search.assistant.ae.a.c) joVar3.ru.a());
            case 207:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.d.a.i((com.google.android.libraries.search.assistant.ap.al) this.b.f308a.bz.a(), (Context) this.f309a.f.a(), (com.google.apps.tiktok.account.data.a.d) this.f309a.bq.a(), (AccountId) this.b.g.a());
            case 208:
                return new com.google.android.libraries.search.assistant.ap.al(this.b.qh(), io.grpc.h.a);
            case 209:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.a.a.j(this.b.ic(), (ag) this.f309a.Q.a());
            case 210:
                com.google.android.libraries.search.assistant.n.a.e.b.a.j jVar = (com.google.android.libraries.search.assistant.n.a.e.b.a.j) this.b.cI.a();
                ik ikVar3 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.e(jVar, ikVar3.hQ(), ikVar3.hR(), (ag) this.f309a.Q.a(), this.f309a.b.fD());
            case 211:
                Context context3 = (Context) this.f309a.f.a();
                this.b.f308a.rw();
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.a.h(context3, this.b.f308a.J());
            case 212:
                bj a2 = bm.a(this.b.qh());
                a2.getClass();
                return a2;
            case 213:
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.grpc.a.a.a.a(this.b.qg());
            case 214:
                bf a3 = bg.a(this.b.qg());
                a3.getClass();
                return a3;
            case 215:
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f309a.g.a();
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.f309a.lj.a();
                cq cqVar = (cq) this.f309a.H.a();
                jo joVar4 = this.f309a;
                ik ikVar4 = this.b;
                return new an(new com.google.apps.tiktok.cache.a(ikVar4.ye()), "SqliteKeyValueCache:BistoDeviceStatusCache", -1, aVar, extensionRegistryLite, joVar4.md(), joVar4.mx(), cqVar, com.google.android.apps.search.assistant.surfaces.bisto.e.b.a.b());
            case 216:
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f309a.g.a();
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) this.f309a.lj.a();
                cq cqVar2 = (cq) this.f309a.H.a();
                jo joVar5 = this.f309a;
                return com.google.android.apps.search.assistant.surfaces.bisto.e.b.f.a(aVar2, extensionRegistryLite2, cqVar2, joVar5.mx(), joVar5.md(), com.google.android.apps.search.assistant.surfaces.bisto.e.b.a.a(), this.b.ye());
            case 217:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "OobeLoggerStateProtoStore";
                a4.c(com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.k.a);
                return this.b.kf().a(a4.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 218:
                lt ltVar = (lt) this.b.f308a.bI.a();
                com.google.frameworks.client.data.android.server.tiktok.ac acVar = (com.google.frameworks.client.data.android.server.tiktok.ac) this.f309a.em.a();
                io.grpc.i qh = this.b.qh();
                ltVar.getClass();
                acVar.getClass();
                return new com.google.android.libraries.search.assistant.invocation.k.b.b.b(ltVar, acVar, qh);
            case 219:
                return new lt(this);
            case 220:
                return new op(this.b.f308a.C());
            case 221:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45629329").f());
            case 222:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45629330").f());
            case 223:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45654481").f());
            case 224:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45634345").f());
            case 225:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45629328").f());
            case 226:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45627034").f());
            case 227:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.lT().a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user 45633311").b());
            case 228:
                com.google.apps.tiktok.q.b.g a5 = com.google.apps.tiktok.q.b.h.a();
                a5.f5883a = "ProactiveCardPreference";
                a5.c(com.google.android.apps.search.assistant.surfaces.settings.features.main.b.c.a);
                return this.b.kf().a(a5.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 229:
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f309a.g.a();
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) this.f309a.lj.a();
                cq cqVar3 = (cq) this.f309a.H.a();
                jo joVar6 = this.f309a;
                com.google.apps.tiktok.cache.ab mx = joVar6.mx();
                com.google.android.libraries.storage.c.e md = joVar6.md();
                com.google.apps.tiktok.cache.p a6 = com.google.apps.tiktok.cache.q.a();
                a6.e(com.google.android.apps.search.assistant.surfaces.settings.features.main.b.a.a);
                a6.c(3);
                a6.d(0);
                a6.b(TimeUnit.SECONDS.toMillis(14400L));
                return new an(new com.google.apps.tiktok.cache.a(this.b.ye()), "SqliteKeyValueCache:MainPageDataServiceCacheTNG", -1, aVar3, extensionRegistryLite3, md, mx, cqVar3, a6.a());
            case 230:
                return new com.google.android.libraries.search.assistant.ab.d((ag) this.f309a.bo.a(), (com.google.android.libraries.search.assistant.ab.t) this.b.cJ.a());
            case 231:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b(this.b.f308a.nS());
            case 232:
                return new com.google.android.apps.search.assistant.surfaces.voice.feedback.a.c();
            case 233:
                com.google.apps.tiktok.q.b.g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "FloatyDraggingData";
                a7.c(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.floaty.ui.d.a.a.f2433a);
                return this.b.kg().a(a7.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 234:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45477038").f());
            case 235:
                ik ikVar5 = this.b;
                jj jjVar = ikVar5.f308a;
                boolean nY = jjVar.nY();
                boolean nZ = jjVar.nZ();
                boolean oa = jjVar.oa();
                boolean ob = jjVar.ob();
                boolean oc = jjVar.oc();
                boolean od = jjVar.od();
                boolean oe = jjVar.oe();
                boolean of = jjVar.of();
                boolean j = new h.a.a.d.b.a.ag(ikVar5.l).j();
                ik ikVar6 = this.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.d.n(nY, nZ, oa, ob, oc, od, oe, of, j, ikVar6.f308a.og(), ((Boolean) ikVar6.cD.a()).booleanValue(), (cg) this.b.y.a());
            case 236:
                cg cgVar = (cg) this.b.f308a.bW.a();
                jo joVar7 = this.f309a;
                return new com.google.android.libraries.search.assistant.aj.b.c(cgVar, joVar7.jK(), (Executor) joVar7.H.a(), this.b.f308a.sv().Q());
            case 237:
                com.google.apps.tiktok.q.b.g a8 = com.google.apps.tiktok.q.b.h.a();
                a8.f5883a = "ChipsTooltip";
                a8.c(com.google.protos.ab.a.a.b.a.a.b.b.a.a);
                return this.b.kf().a(a8.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 238:
                com.google.apps.tiktok.q.b.g a9 = com.google.apps.tiktok.q.b.h.a();
                a9.f5883a = "UserCohortStore";
                a9.c(com.google.android.apps.search.assistant.surfaces.voice.robin.t.a.e.f2417a);
                return this.b.kf().a(a9.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 239:
                com.google.apps.tiktok.q.b.g a10 = com.google.apps.tiktok.q.b.h.a();
                a10.f5883a = "DefaultAssistAppStatusProtoDataStore";
                a10.c(com.google.android.apps.search.assistant.surfaces.voice.o.a.a.a.a);
                return this.b.kf().a(a10.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 240:
                return new com.google.android.apps.search.assistant.surfaces.notification.l(this.b.gm(), (Executor) this.f309a.H.a(), (com.google.common.v.f) this.f309a.ez.a());
            case 241:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.t.e(this.b.qh(), io.grpc.h.a);
            case 242:
                al alVar = (al) this.b.f308a.Z.a();
                jj jjVar2 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.service.i(alVar, jjVar2.bq(), jjVar2.br(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.b) jjVar2.aj.a(), this.b.f308a.ay());
            case 243:
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.c.b((com.google.android.libraries.search.t.a.a) this.b.J.a());
            case 244:
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.a.ad((com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.db.a) this.f309a.b.dR.a(), (cq) this.f309a.v.a());
            case 245:
                return this.b.kg().a((com.google.apps.tiktok.q.b.h) this.b.f308a.ce.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 246:
                com.google.apps.tiktok.q.b.g a11 = com.google.apps.tiktok.q.b.h.a();
                a11.f5883a = "AipTopEntitiesCorpusMetadataStore";
                a11.c(com.google.android.libraries.search.assistant.appactions.d.e.a.a);
                return a11.a();
            case 247:
                com.google.android.libraries.search.assistant.p.a.d.c d = io.grpc.j.a.d(new com.google.android.libraries.search.assistant.p.a.d.a(), this.b.qh(), io.grpc.h.a);
                d.getClass();
                return d;
            case 248:
                return Optional.of((com.google.android.libraries.search.assistant.a.a.a.d) this.f309a.b.dT.a());
            case 249:
                jo joVar8 = this.f309a;
                jj jjVar3 = this.b.f308a;
                jr jrVar2 = joVar8.b;
                boolean fI = jrVar2.fI();
                h hVar = jjVar3.cf;
                h hVar2 = jrVar2.dW;
                com.google.apps.tiktok.r.f fVar = com.google.android.apps.search.assistant.verticals.calendar.localcalendar.x.a;
                com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.a aVar4 = fI ? (com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.a) hVar2.a() : (com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.a) hVar.a();
                aVar4.getClass();
                return aVar4;
            case 250:
                return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.k((Context) this.f309a.f.a(), (com.google.apps.tiktok.g.p) this.b.aa.a(), (Executor) this.f309a.H.a(), (com.google.common.v.f) this.f309a.ez.a(), this.f309a.f319a.c());
            case 251:
                return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.c((Executor) this.f309a.H.a(), (AccountId) this.b.g.a(), (com.google.android.apps.search.assistant.verticals.calendar.localcalendar.z) this.b.f308a.mj(), (com.google.apps.tiktok.account.data.a.d) this.f309a.bq.a());
            case 252:
                return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.z((Executor) this.f309a.H.a(), this.b.f308a.mj());
            case 253:
                ik ikVar7 = this.b;
                h hVar3 = ikVar7.X;
                com.google.g.ak.a.a.b fz = ikVar7.f308a.fz();
                return new com.google.android.apps.search.assistant.verticals.reminders.c.a(fz);
            case 254:
                com.google.apps.tiktok.q.b.g a12 = com.google.apps.tiktok.q.b.h.a();
                a12.f5883a = "NotificationProto";
                a12.c(com.google.android.apps.search.assistant.verticals.reminders.e.b.a);
                return this.b.kf().a(a12.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 255:
                ik ikVar8 = this.b;
                jo joVar9 = this.f309a;
                com.google.android.apps.search.assistant.platform.pcp.api.l H = ikVar8.H();
                com.google.android.apps.search.assistant.verticals.ambient.g.a aVar5 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar9.nM.a();
                Executor executor = (Executor) this.f309a.H.a();
                Context context4 = (Context) this.f309a.f.a();
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f309a.bN.a();
                AccountId accountId = (AccountId) this.b.g.a();
                ik ikVar9 = this.b;
                return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.c(H, aVar5, executor, context4, bVar, accountId, ikVar9.ey(), ikVar9.eC(), this.f309a.b.hy());
            case 256:
                return new lt(this);
            case 257:
                ik ikVar10 = this.b;
                jy jyVar = this.f309a.f319a;
                jj jjVar4 = ikVar10.f308a;
                return new com.google.android.libraries.search.rendering.xuikit.xblend.j.q(jjVar4.cm, jjVar4.cn, jyVar.dL, jjVar4.co);
            case 258:
                return Optional.of(this.b.f308a.eY());
            case 259:
                return Optional.of(this.b.f308a.eX());
            case 260:
                return new lt(this);
            case 261:
                com.google.android.libraries.storage.protostore.d.g ft = this.b.f308a.ft();
                com.google.apps.tiktok.q.b.g a13 = com.google.apps.tiktok.q.b.h.a();
                a13.f5883a = "XBlendAutobubble";
                a13.c(com.google.android.libraries.search.rendering.xuikit.bubbles.c.d.d.a);
                a13.b().h(ft);
                return this.b.kf().a(a13.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
            case 262:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.k((Context) this.f309a.f.a(), (com.google.android.libraries.search.rendering.xuikit.bubbles.p) this.b.f308a.cH.a(), e.c.c.b(this.b.f308a.cI), this.b.f308a.eT());
            case 263:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.p((com.google.android.libraries.g.a) this.f309a.g.a(), (lt) this.b.f308a.cG.a());
            case 264:
                return new lt(this);
            case 265:
                return new lt(this);
            case 266:
                return new lt(this);
            case 267:
                return new lt(this);
            case 268:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.f.b.a();
            case 269:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.f.b.a.a((com.google.android.libraries.search.rendering.xuikit.c.e.s) this.f309a.f319a.dL.a());
            case 270:
                return new lt(this);
            case 271:
                return new com.google.apps.tiktok.tracing.contrib.o.a((dj) this.b.q.a());
            case 272:
                return new lt(this);
            case 273:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.e.d((Context) this.f309a.f.a());
            case 274:
                return new iq(this);
            case 275:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.b.f((lt) this.b.f308a.cE.a());
            case 276:
                return new lt(this);
            case 277:
                return new ir(this, 1);
            case 278:
                return new com.google.android.libraries.search.rendering.xuikit.xblend.b.m((Context) this.f309a.f.a(), (com.google.android.libraries.search.t.a.a) this.b.J.a());
            case 279:
                return new ir(this, 0);
            case 280:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.f.ab((Context) this.f309a.b.ee.a(), (com.google.android.libraries.search.rendering.xuikit.c.k.m) this.b.f308a.cw.a());
            case 281:
                return new is(this);
            case 282:
                com.google.android.apps.search.googleapp.customtabs.b.z zVar = (com.google.android.apps.search.googleapp.customtabs.b.z) this.f309a.wy.a();
                cr crVar3 = (cr) this.f309a.H.a();
                jj jjVar5 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.customtabs.c.l(zVar, crVar3, jjVar5.bz(), new op(new com.google.android.apps.search.googleapp.customtabs.b.l(jjVar5.f7do)), (com.google.android.libraries.search.b.b) this.b.f308a.aJ.a(), ((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45377104").f());
            case 283:
                jo joVar10 = this.f309a;
                jj jjVar6 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.customtabs.c.a.n(joVar10.v, joVar10.H, jjVar6.cN, jjVar6.da, joVar10.f, jjVar6.db, jjVar6.dc, jjVar6.dd, jjVar6.de, jjVar6.df, jjVar6.dg);
            case 284:
                jo joVar11 = this.f309a;
                ik ikVar11 = this.b;
                h hVar4 = joVar11.g;
                jj jjVar7 = ikVar11.f308a;
                return new com.google.android.apps.search.googleapp.customtabs.c.a.b.b(hVar4, jjVar7.aQ, jjVar7.cJ, jjVar7.cK, jjVar7.cL, jjVar7.cM);
            case 285:
                return new com.google.android.apps.search.googleapp.urlhandler.b.a((com.google.android.libraries.search.b.b) this.b.f308a.aJ.a());
            case 286:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.rU().a.a()).a("com.google.android.libraries.search.googleapp.user 45387288").f());
            case 287:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45531223").f());
            case 288:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45633013").f());
            case 289:
                jj jjVar8 = this.b.f308a;
                return ha.s(jjVar8.mm(), jjVar8.mu());
            case 290:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 147").f());
            case 291:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45358981").f());
            case 292:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45379617").f());
            case 293:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 259").b());
            case 294:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 260").f());
            case 295:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45399395").f());
            case 296:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45400306").f());
            case 297:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45461972").f());
            case 298:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45428255").f());
            case 299:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.sQ().a.a()).a("com.google.android.libraries.search.googleapp.user 45461458").f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        jj jjVar;
        jj jjVar2;
        jj jjVar3;
        jj jjVar4;
        jj jjVar5;
        jj jjVar6;
        jj jjVar7;
        jj jjVar8;
        h hVar;
        h hVar2;
        h hVar3;
        jy jyVar;
        h hVar4;
        jj jjVar9;
        h hVar5;
        jj jjVar10;
        jj jjVar11;
        jj jjVar12;
        jj jjVar13;
        jj jjVar14;
        jj jjVar15;
        jj jjVar16;
        jj jjVar17;
        jj jjVar18;
        jj jjVar19;
        jj jjVar20;
        jj jjVar21;
        jj jjVar22;
        h hVar6;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        jy jyVar2;
        h hVar12;
        h hVar13;
        h hVar14;
        jj jjVar23;
        jj jjVar24;
        jj jjVar25;
        jj jjVar26;
        jj jjVar27;
        h hVar15;
        h hVar16;
        jj jjVar28;
        jj jjVar29;
        h hVar17;
        jj jjVar30;
        jj jjVar31;
        jj jjVar32;
        h hVar18;
        h hVar19;
        h hVar20;
        h hVar21;
        jj jjVar33;
        jj jjVar34;
        jj jjVar35;
        jj jjVar36;
        jj jjVar37;
        h hVar22;
        jr jrVar;
        h hVar23;
        h hVar24;
        h hVar25;
        h hVar26;
        jj jjVar38;
        jj jjVar39;
        jj jjVar40;
        jj jjVar41;
        jj jjVar42;
        jj jjVar43;
        h hVar27;
        jj jjVar44;
        jj jjVar45;
        jj jjVar46;
        jj jjVar47;
        h hVar28;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        h hVar33;
        h hVar34;
        h hVar35;
        h hVar36;
        jj jjVar48;
        jj jjVar49;
        jj jjVar50;
        jj jjVar51;
        jj jjVar52;
        jj jjVar53;
        h hVar37;
        jj jjVar54;
        jj jjVar55;
        h hVar38;
        h hVar39;
        h hVar40;
        h hVar41;
        h hVar42;
        jj jjVar56;
        h hVar43;
        jr jrVar2;
        h hVar44;
        h hVar45;
        h hVar46;
        jj jjVar57;
        h hVar47;
        jj jjVar58;
        jj jjVar59;
        h hVar48;
        h hVar49;
        jr jrVar3;
        jj jjVar60;
        jj jjVar61;
        jj jjVar62;
        jj jjVar63;
        jj jjVar64;
        jj jjVar65;
        jr jrVar4;
        jj jjVar66;
        h hVar50;
        h hVar51;
        h hVar52;
        h hVar53;
        h hVar54;
        h hVar55;
        jr jrVar5;
        h hVar56;
        jr jrVar6;
        h hVar57;
        jr jrVar7;
        jr jrVar8;
        jr jrVar9;
        h hVar58;
        jj jjVar67;
        h hVar59;
        jj jjVar68;
        jr jrVar10;
        h hVar60;
        h hVar61;
        h hVar62;
        jj jjVar69;
        jj jjVar70;
        jj jjVar71;
        jr jrVar11;
        jj jjVar72;
        jy jyVar3;
        h hVar63;
        h hVar64;
        h hVar65;
        jj jjVar73;
        h hVar66;
        jr jrVar12;
        jj jjVar74;
        jj jjVar75;
        jj jjVar76;
        jj jjVar77;
        jj jjVar78;
        jr jrVar13;
        jr jrVar14;
        h hVar67;
        h hVar68;
        jr jrVar15;
        jj jjVar79;
        jj jjVar80;
        h hVar69;
        h hVar70;
        h hVar71;
        h hVar72;
        jj jjVar81;
        jj jjVar82;
        h hVar73;
        h hVar74;
        jj jjVar83;
        jj jjVar84;
        jj jjVar85;
        jj jjVar86;
        jr jrVar16;
        jj jjVar87;
        jr jrVar17;
        h hVar75;
        jj jjVar88;
        jj jjVar89;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        jj jjVar90;
        jj jjVar91;
        jr jrVar18;
        jr jrVar19;
        jj jjVar92;
        h hVar80;
        jj jjVar93;
        h hVar81;
        jj jjVar94;
        h hVar82;
        h hVar83;
        jj jjVar95;
        jj jjVar96;
        jr jrVar20;
        h hVar84;
        jj jjVar97;
        jj jjVar98;
        h hVar85;
        jj jjVar99;
        jj jjVar100;
        jj jjVar101;
        jj jjVar102;
        jj jjVar103;
        jj jjVar104;
        h hVar86;
        h hVar87;
        h hVar88;
        jj jjVar105;
        h hVar89;
        jj jjVar106;
        jr jrVar21;
        jr jrVar22;
        jr jrVar23;
        jj jjVar107;
        jj jjVar108;
        jj jjVar109;
        jj jjVar110;
        jj jjVar111;
        jj jjVar112;
        h hVar90;
        jj jjVar113;
        jj jjVar114;
        jr jrVar24;
        jr jrVar25;
        jj jjVar115;
        jj jjVar116;
        jj jjVar117;
        h hVar91;
        h hVar92;
        jj jjVar118;
        jr jrVar26;
        jr jrVar27;
        jj jjVar119;
        jj jjVar120;
        jj jjVar121;
        jj jjVar122;
        jj jjVar123;
        jj jjVar124;
        h hVar93;
        jr jrVar28;
        jj jjVar125;
        jj jjVar126;
        jj jjVar127;
        h hVar94;
        jj jjVar128;
        jj jjVar129;
        jj jjVar130;
        jj jjVar131;
        jr jrVar29;
        jj jjVar132;
        jj jjVar133;
        jj jjVar134;
        jj jjVar135;
        h hVar95;
        h hVar96;
        jj jjVar136;
        jj jjVar137;
        jj jjVar138;
        jr jrVar30;
        jj jjVar139;
        jj jjVar140;
        jj jjVar141;
        jj jjVar142;
        jj jjVar143;
        h hVar97;
        h hVar98;
        h hVar99;
        jj jjVar144;
        jj jjVar145;
        jr jrVar31;
        h hVar100;
        h hVar101;
        jr jrVar32;
        h hVar102;
        jj jjVar146;
        jj jjVar147;
        jj jjVar148;
        h hVar103;
        jj jjVar149;
        jj jjVar150;
        h hVar104;
        jr jrVar33;
        jj jjVar151;
        h hVar105;
        jj jjVar152;
        h hVar106;
        h hVar107;
        h hVar108;
        h hVar109;
        jj jjVar153;
        h hVar110;
        jj jjVar154;
        h hVar111;
        h hVar112;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        jr jrVar34;
        h hVar117;
        jj jjVar155;
        jj jjVar156;
        jr jrVar35;
        h hVar118;
        h hVar119;
        jj jjVar157;
        jj jjVar158;
        jj jjVar159;
        jj jjVar160;
        jj jjVar161;
        jj jjVar162;
        h hVar120;
        jj jjVar163;
        jj jjVar164;
        int i = this.c;
        switch (i) {
            case 300:
                jjVar = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.m(jjVar.sQ()));
            case 301:
                jjVar2 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.q(jjVar2.sQ()));
            case 302:
                jjVar3 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.j(jjVar3.sQ()));
            case 303:
                jjVar4 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.p(jjVar4.sQ()));
            case 304:
                jjVar5 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.f(jjVar5.sQ()));
            case 305:
                jjVar6 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.g(jjVar6.sQ()));
            case 306:
                jjVar7 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.l(jjVar7.sQ()));
            case 307:
                jjVar8 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.k(jjVar8.sQ()));
            case 308:
                hVar = this.f309a.f;
                Context context = (Context) hVar.a();
                hVar2 = this.f309a.lq;
                com.google.android.apps.search.lens.c.e eVar = (com.google.android.apps.search.lens.c.e) hVar2.a();
                hVar3 = this.f309a.ne;
                com.google.apps.tiktok.media.j jVar = (com.google.apps.tiktok.media.j) hVar3.a();
                jyVar = this.f309a.f319a;
                com.google.apps.tiktok.account.b.d dVar = (com.google.apps.tiktok.account.b.d) jy.hD(jyVar).a();
                hVar4 = this.b.g;
                AccountId accountId = (AccountId) hVar4.a();
                jjVar9 = this.b.f308a;
                com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.b.d dVar2 = (com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.b.d) jj.hB(jjVar9).a();
                hVar5 = this.f309a.H;
                cq cqVar = (cq) hVar5.a();
                jjVar10 = this.b.f308a;
                boolean booleanValue = ((Boolean) jj.jy(jjVar10).a()).booleanValue();
                jjVar11 = this.b.f308a;
                boolean booleanValue2 = ((Boolean) jj.ju(jjVar11).a()).booleanValue();
                jjVar12 = this.b.f308a;
                boolean booleanValue3 = ((Boolean) jj.jx(jjVar12).a()).booleanValue();
                jjVar13 = this.b.f308a;
                boolean os = jjVar13.os();
                jjVar14 = this.b.f308a;
                boolean ot = jjVar14.ot();
                jjVar15 = this.b.f308a;
                boolean booleanValue4 = ((Boolean) jj.jx(jjVar15).a()).booleanValue();
                jjVar16 = this.b.f308a;
                long r = jjVar16.r();
                jjVar17 = this.b.f308a;
                boolean ou = jjVar17.ou();
                jjVar18 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a.j(context, eVar, jVar, dVar, accountId, dVar2, cqVar, booleanValue, booleanValue2, booleanValue3, os, ot, booleanValue4, r, ou, jjVar18.ov());
            case 309:
                return new com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.b.d();
            case 310:
                jjVar19 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.r(jjVar19.sQ()));
            case 311:
                jjVar20 = this.b.f308a;
                com.google.apps.tiktok.cache.o oVar = (com.google.apps.tiktok.cache.o) jj.kh(jjVar20).a();
                jjVar21 = this.b.f308a;
                Object ml = jjVar21.ml();
                jjVar22 = this.b.f308a;
                Object mk = jjVar22.mk();
                hVar6 = this.f309a.iv;
                return new com.google.android.apps.search.googleapp.s.a.d(oVar, (com.google.android.apps.search.googleapp.s.a.i) ml, (com.google.android.apps.search.googleapp.s.a.a) mk, (ax) hVar6.a());
            case 312:
                hVar7 = this.f309a.g;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) hVar7.a();
                hVar8 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar8.a();
                hVar9 = this.f309a.H;
                cq cqVar2 = (cq) hVar9.a();
                jo joVar = this.f309a;
                return com.google.android.apps.search.googleapp.s.a.l.c(aVar, extensionRegistryLite, cqVar2, joVar.mx(), joVar.md(), com.google.android.apps.search.googleapp.s.a.l.b(), this.b.ye());
            case 313:
                ik ikVar = this.b;
                jo joVar2 = this.f309a;
                hVar10 = ikVar.g;
                hVar11 = joVar2.qr;
                jyVar2 = joVar2.f319a;
                h nS = jy.nS(jyVar2);
                jo joVar3 = this.f309a;
                ik ikVar2 = this.b;
                hVar12 = joVar3.ql;
                hVar13 = joVar3.qm;
                hVar14 = ikVar2.G;
                jjVar23 = ikVar2.f308a;
                h ju = jj.ju(jjVar23);
                jjVar24 = this.b.f308a;
                h jy = jj.jy(jjVar24);
                jjVar25 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.e(hVar10, hVar11, nS, hVar12, hVar13, hVar14, ju, jy, jj.je(jjVar25));
            case 314:
                jjVar26 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.d(jjVar26.sQ()));
            case 315:
                jjVar27 = this.b.f308a;
                com.google.android.apps.search.googleapp.customtabs.c.l lVar = (com.google.android.apps.search.googleapp.customtabs.c.l) jj.hL(jjVar27).a();
                hVar15 = this.f309a.Q;
                ag agVar = (ag) hVar15.a();
                hVar16 = this.f309a.R;
                return new com.google.android.apps.search.googleapp.customtabs.a.e(lVar, agVar, (n) hVar16.a());
            case 316:
                jjVar28 = this.b.f308a;
                com.google.android.apps.search.googleapp.labs.g.z zVar = (com.google.android.apps.search.googleapp.labs.g.z) jj.hV(jjVar28).a();
                jjVar29 = this.b.f308a;
                boolean booleanValue5 = ((Boolean) jj.ju(jjVar29).a()).booleanValue();
                hVar17 = this.f309a.H;
                return new com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ak(zVar, booleanValue5, (Executor) hVar17.a());
            case 317:
                jjVar30 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.k(jjVar30.ow());
            case 318:
                jjVar31 = this.b.f308a;
                return Long.valueOf(h.a.a.r.b.a.f.h(jjVar31.sQ()));
            case 319:
                jjVar32 = this.b.f308a;
                return Optional.of(jjVar32.df());
            case 320:
                hVar18 = this.b.g;
                AccountId accountId2 = (AccountId) hVar18.a();
                hVar19 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) hVar19.a();
                hVar20 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar3 = (com.google.apps.tiktok.account.data.a.d) hVar20.a();
                hVar21 = this.f309a.bx;
                com.google.android.gms.auth.k kVar = (com.google.android.gms.auth.k) hVar21.a();
                jjVar33 = this.b.f308a;
                boolean ox = jjVar33.ox();
                jjVar34 = this.b.f308a;
                boolean oy = jjVar34.oy();
                jjVar35 = this.b.f308a;
                boolean oz = jjVar35.oz();
                jjVar36 = this.b.f308a;
                boolean oA = jjVar36.oA();
                jjVar37 = this.b.f308a;
                boolean oC = jjVar37.oC();
                hVar22 = this.f309a.bC;
                com.google.android.libraries.onegoogle.owners.i iVar = (com.google.android.libraries.onegoogle.owners.i) hVar22.a();
                jrVar = this.f309a.b;
                com.google.android.apps.search.googleapp.accounts.ui.b.a.a aVar2 = (com.google.android.apps.search.googleapp.accounts.ui.b.a.a) jr.cs(jrVar).a();
                hVar23 = this.f309a.f;
                Context context2 = (Context) hVar23.a();
                hVar24 = this.f309a.Q;
                ag agVar2 = (ag) hVar24.a();
                hVar25 = this.f309a.bt;
                n nVar = (n) hVar25.a();
                hVar26 = this.f309a.R;
                return new com.google.android.apps.search.omnient.b.a.k(accountId2, bVar, dVar3, kVar, ox, oy, oz, oA, oC, iVar, aVar2, context2, agVar2, nVar, (n) hVar26.a());
            case 321:
                jjVar38 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.e(jjVar38.sQ()));
            case 322:
                jjVar39 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.o(jjVar39.sQ()));
            case 323:
                jjVar40 = this.b.f308a;
                boolean oD = jjVar40.oD();
                jjVar41 = this.b.f308a;
                long s = jjVar41.s();
                jjVar42 = this.b.f308a;
                boolean oE = jjVar42.oE();
                jjVar43 = this.b.f308a;
                boolean oF = jjVar43.oF();
                hVar27 = this.f309a.Y;
                String str = (String) hVar27.a();
                jjVar44 = this.b.f308a;
                com.google.apps.tiktok.cache.o oVar2 = (com.google.apps.tiktok.cache.o) jj.ki(jjVar44).a();
                jjVar45 = this.b.f308a;
                com.google.android.apps.search.googleapp.saves.b.a.j cA = jjVar45.cA();
                jjVar46 = this.b.f308a;
                com.google.bz.h.a.a.au ga = jjVar46.ga();
                jjVar47 = this.b.f308a;
                Set nf = jjVar47.nf();
                hVar28 = this.f309a.H;
                Executor executor = (Executor) hVar28.a();
                hVar29 = this.f309a.iu;
                ay ayVar = (ay) hVar29.a();
                hVar30 = this.f309a.g;
                return new com.google.android.apps.search.googleapp.saves.b.n(oD, s, oE, oF, str, oVar2, cA, ga, nf, executor, ayVar, (com.google.android.libraries.g.a) hVar30.a());
            case 324:
                hVar31 = this.f309a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar31.a();
                hVar32 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) hVar32.a();
                hVar33 = this.f309a.H;
                cq cqVar3 = (cq) hVar33.a();
                jo joVar4 = this.f309a;
                return com.google.android.apps.search.googleapp.saves.b.a.a.f(aVar3, extensionRegistryLite2, cqVar3, joVar4.mx(), joVar4.md(), com.google.android.apps.search.googleapp.saves.b.a.a.c(), this.b.ye());
            case 325:
                ik ikVar3 = this.b;
                jo joVar5 = this.f309a;
                com.google.apps.tiktok.q.b.h d = com.google.android.apps.search.googleapp.saves.b.a.a.d();
                com.google.apps.tiktok.account.d.b.f kf = ikVar3.kf();
                hVar34 = joVar5.w;
                return com.google.android.apps.search.googleapp.saves.b.a.a.b(d, kf, (com.google.android.libraries.storage.a.j) hVar34.a());
            case 326:
                hVar35 = this.b.g;
                AccountId accountId3 = (AccountId) hVar35.a();
                hVar36 = this.f309a.f;
                return new com.google.android.apps.search.googleapp.customtabs.features.buttons.b.f(accountId3, (Context) hVar36.a());
            case 327:
                jjVar48 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.v(jjVar48.sQ()));
            case 328:
                jjVar49 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.s(jjVar49.sQ()));
            case 329:
                jjVar50 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.u(jjVar50.sQ()));
            case 330:
                jjVar51 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.t(jjVar51.sQ()));
            case 331:
                jjVar52 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.i(jjVar52.sQ()));
            case 332:
                jjVar53 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.n(jjVar53.sQ()));
            case 333:
                return new lt(this);
            case 334:
                return new lt(this);
            case 335:
                return new lt(this);
            case 336:
                return new lt(this);
            case 337:
                return new lt(this);
            case 338:
                return new lt(this);
            case 339:
                return new lt(this);
            case 340:
                hVar37 = this.f309a.qN;
                return com.google.apps.tiktok.f.g.f((n) hVar37.a());
            case 341:
                jjVar54 = this.b.f308a;
                cg cgVar = (cg) jj.km(jjVar54).a();
                jjVar55 = this.b.f308a;
                com.google.android.apps.search.googleapp.customtabs.c.l lVar2 = (com.google.android.apps.search.googleapp.customtabs.c.l) jj.hL(jjVar55).a();
                hVar38 = this.f309a.wy;
                com.google.android.apps.search.googleapp.customtabs.b.z zVar2 = (com.google.android.apps.search.googleapp.customtabs.b.z) hVar38.a();
                hVar39 = this.f309a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar39.a();
                hVar40 = this.f309a.H;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar40.a();
                hVar41 = this.f309a.v;
                return new com.google.android.apps.search.googleapp.customtabs.b.j(cgVar, lVar2, zVar2, aVar4, scheduledExecutorService, (Executor) hVar41.a());
            case 342:
                ik ikVar4 = this.b;
                jo joVar6 = this.f309a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.googleapp.customtabs.b.aa.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar4.kf();
                hVar42 = joVar6.w;
                return com.google.android.apps.search.googleapp.customtabs.b.aa.b(c, kf2, (com.google.android.libraries.storage.a.j) hVar42.a());
            case 343:
                jjVar56 = this.b.f308a;
                com.google.android.apps.search.googleapp.d.f fVar = (com.google.android.apps.search.googleapp.d.f) jj.lI(jjVar56).a();
                hVar43 = this.f309a.P;
                return new com.google.android.apps.search.googleapp.discover.x.ab(fVar, (n) hVar43.a(), Optional.empty());
            case 344:
                return new com.google.android.apps.i.a.a.a();
            case 345:
                jrVar2 = this.f309a.b;
                cg cgVar2 = (cg) jr.eg(jrVar2).a();
                hVar44 = this.f309a.H;
                Executor executor2 = (Executor) hVar44.a();
                hVar45 = this.f309a.P;
                n nVar2 = (n) hVar45.a();
                hVar46 = this.f309a.ez;
                return new com.google.android.apps.search.googleapp.discover.p.d(cgVar2, executor2, nVar2, (com.google.common.v.f) hVar46.a());
            case 346:
                jjVar57 = this.b.f308a;
                com.google.apps.tiktok.q.b.h fy = jjVar57.fy();
                ik ikVar5 = this.b;
                jo joVar7 = this.f309a;
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar5.kf();
                hVar47 = joVar7.w;
                return com.google.android.apps.search.googleapp.discover.settings.b.u.b(fy, kf3, (com.google.android.libraries.storage.a.j) hVar47.a());
            case 347:
                jjVar58 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.settings.b.d cc = jjVar58.cc();
                jjVar59 = this.b.f308a;
                com.google.protos.ap.b.a.b fY = jjVar59.fY();
                hVar48 = this.b.X;
                com.google.apps.tiktok.p.b.c cVar = (com.google.apps.tiktok.p.b.c) hVar48.a();
                hVar49 = this.f309a.g;
                return com.google.android.apps.search.googleapp.discover.settings.b.u.c(cc, fY, cVar, (com.google.android.libraries.g.a) hVar49.a());
            case 348:
                return new lt(this);
            case 349:
                jrVar3 = this.f309a.b;
                com.google.android.libraries.play.a.b.b bVar2 = (com.google.android.libraries.play.a.b.b) jr.bH(jrVar3).a();
                jjVar60 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.r.c.c.d bQ = jjVar60.bQ();
                jjVar61 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.r.c.a.f bO = jjVar61.bO();
                jjVar62 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.r.c.a.a bN = jjVar62.bN();
                jjVar63 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.r.a.b bVar3 = (com.google.android.apps.search.googleapp.discover.r.a.b) jj.iy(jjVar63).a();
                jjVar64 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.r.c.e bM = jjVar64.bM();
                jjVar65 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.r.c.b.c bP = jjVar65.bP();
                jrVar4 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.r.c.h(bVar2, bQ, bO, bN, bVar3, bM, bP, jrVar4.fQ());
            case 350:
                jjVar66 = this.b.f308a;
                cg cgVar3 = (cg) jj.kn(jjVar66).a();
                hVar50 = this.f309a.H;
                cr crVar = (cr) hVar50.a();
                hVar51 = this.f309a.iu;
                ay ayVar2 = (ay) hVar51.a();
                hVar52 = this.f309a.Q;
                ag agVar3 = (ag) hVar52.a();
                hVar53 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar53.a();
                hVar54 = this.b.g;
                AccountId accountId4 = (AccountId) hVar54.a();
                hVar55 = this.f309a.f;
                Context context3 = (Context) hVar55.a();
                jrVar5 = this.f309a.b;
                com.google.android.libraries.play.a.b.b bVar4 = (com.google.android.libraries.play.a.b.b) jr.bH(jrVar5).a();
                hVar56 = this.f309a.g;
                com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) hVar56.a();
                jrVar6 = this.f309a.b;
                com.google.protos.l.a.e bo = jrVar6.bo();
                hVar57 = this.f309a.iv;
                ax axVar = (ax) hVar57.a();
                jrVar7 = this.f309a.b;
                boolean fL = jrVar7.fL();
                jrVar8 = this.f309a.b;
                boolean fM = jrVar8.fM();
                jrVar9 = this.f309a.b;
                boolean fO = jrVar9.fO();
                hVar58 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar5 = (com.google.apps.tiktok.account.data.b) hVar58.a();
                jjVar67 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.settings.c.o(cgVar3, crVar, ayVar2, agVar3, dVar4, accountId4, context3, bVar4, aVar5, bo, axVar, fL, fM, fO, bVar5, jjVar67.bR());
            case 351:
                ik ikVar6 = this.b;
                jo joVar8 = this.f309a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.googleapp.discover.settings.c.x.c();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar6.kf();
                hVar59 = joVar8.w;
                return com.google.android.apps.search.googleapp.discover.settings.c.x.b(c2, kf4, (com.google.android.libraries.storage.a.j) hVar59.a());
            case 352:
                jjVar68 = this.b.f308a;
                com.google.android.libraries.search.b.b bVar6 = (com.google.android.libraries.search.b.b) jj.hz(jjVar68).a();
                jrVar10 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.r.a.b(bVar6, jrVar10.fP());
            case 353:
                ik ikVar7 = this.b;
                jo joVar9 = this.f309a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.apps.search.googleapp.discover.r.c.i.c();
                com.google.apps.tiktok.account.d.b.f kf5 = ikVar7.kf();
                hVar60 = joVar9.w;
                return com.google.android.apps.search.googleapp.discover.r.c.i.b(c3, kf5, (com.google.android.libraries.storage.a.j) hVar60.a());
            case 354:
                ik ikVar8 = this.b;
                jo joVar10 = this.f309a;
                com.google.apps.tiktok.q.b.h b = com.google.android.apps.search.googleapp.discover.r.g.ab.b();
                com.google.apps.tiktok.account.d.b.f kf6 = ikVar8.kf();
                hVar61 = joVar10.w;
                return com.google.android.apps.search.googleapp.discover.r.g.ab.e(b, kf6, (com.google.android.libraries.storage.a.j) hVar61.a());
            case 355:
                ik ikVar9 = this.b;
                jo joVar11 = this.f309a;
                com.google.apps.tiktok.q.b.h c4 = com.google.android.apps.search.googleapp.discover.r.g.ab.c();
                com.google.apps.tiktok.account.d.b.f kf7 = ikVar9.kf();
                hVar62 = joVar11.w;
                return com.google.android.apps.search.googleapp.discover.r.g.ab.d(c4, kf7, (com.google.android.libraries.storage.a.j) hVar62.a());
            case 356:
                jjVar69 = this.b.f308a;
                com.google.android.libraries.search.rendering.xuikit.c.g.h eW = jjVar69.eW();
                jjVar70 = this.b.f308a;
                com.google.apps.tiktok.cache.o oVar3 = (com.google.apps.tiktok.cache.o) jj.kj(jjVar70).a();
                jjVar71 = this.b.f308a;
                return com.google.android.apps.search.googleapp.discover.k.d.c(eW, oVar3, jjVar71.eV());
            case 357:
                jrVar11 = this.f309a.b;
                h dG = jr.dG(jrVar11);
                jjVar72 = this.b.f308a;
                h lB = jj.lB(jjVar72);
                jyVar3 = this.f309a.f319a;
                return new com.google.android.libraries.search.rendering.xuikit.c.g.q(dG, lB, jy.oQ(jyVar3));
            case 358:
                hVar63 = this.f309a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar63.a();
                hVar64 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) hVar64.a();
                hVar65 = this.f309a.H;
                cq cqVar4 = (cq) hVar65.a();
                jo joVar12 = this.f309a;
                ik ikVar10 = this.b;
                com.google.apps.tiktok.cache.ab mx = joVar12.mx();
                com.google.android.libraries.storage.c.e md = joVar12.md();
                jjVar73 = ikVar10.f308a;
                return com.google.android.apps.search.googleapp.discover.k.d.d(aVar6, extensionRegistryLite3, cqVar4, mx, md, jjVar73.fw(), this.b.ye());
            case 359:
                hVar66 = this.b.g;
                AccountId accountId5 = (AccountId) hVar66.a();
                jrVar12 = this.f309a.b;
                com.google.apps.tiktok.contrib.work.a aVar7 = (com.google.apps.tiktok.contrib.work.a) jr.bB(jrVar12).a();
                jjVar74 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ae.f ch = jjVar74.ch();
                jjVar75 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ae.m mVar = (com.google.android.apps.search.googleapp.discover.ae.m) jj.gT(jjVar75).a();
                jjVar76 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.f.c bD = jjVar76.bD();
                jjVar77 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ae.ac ci = jjVar77.ci();
                ik ikVar11 = this.b;
                Optional empty = Optional.empty();
                jjVar78 = ikVar11.f308a;
                boolean oH = jjVar78.oH();
                jrVar13 = this.f309a.b;
                boolean fR = jrVar13.fR();
                jrVar14 = this.f309a.b;
                jrVar14.X();
                hVar67 = this.f309a.Q;
                ag agVar4 = (ag) hVar67.a();
                hVar68 = this.f309a.P;
                n nVar3 = (n) hVar68.a();
                jrVar15 = this.f309a.b;
                com.google.android.apps.search.googleapp.x.d.b bVar7 = (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar15).a();
                jjVar79 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.ae.x(accountId5, aVar7, ch, mVar, bD, ci, empty, oH, fR, agVar4, nVar3, bVar7, (com.google.android.apps.search.googleapp.discover.z.m) jj.hs(jjVar79).a());
            case 360:
                jjVar80 = this.b.f308a;
                cg cgVar4 = (cg) jj.ko(jjVar80).a();
                hVar69 = this.f309a.P;
                return new com.google.android.apps.search.googleapp.discover.ae.m(cgVar4, (n) hVar69.a());
            case 361:
                ik ikVar12 = this.b;
                jo joVar13 = this.f309a;
                com.google.apps.tiktok.q.b.h c5 = com.google.android.apps.search.googleapp.discover.ae.ag.c();
                com.google.apps.tiktok.account.d.b.f kf8 = ikVar12.kf();
                hVar70 = joVar13.w;
                return com.google.android.apps.search.googleapp.discover.ae.ag.e(c5, kf8, (com.google.android.libraries.storage.a.j) hVar70.a());
            case 362:
                ik ikVar13 = this.b;
                jo joVar14 = this.f309a;
                com.google.apps.tiktok.q.b.h c6 = com.google.android.apps.search.googleapp.discover.f.m.c();
                com.google.apps.tiktok.account.d.b.f kf9 = ikVar13.kf();
                hVar71 = joVar14.w;
                return com.google.android.apps.search.googleapp.discover.f.m.b(c6, kf9, (com.google.android.libraries.storage.a.j) hVar71.a());
            case 363:
                ik ikVar14 = this.b;
                jo joVar15 = this.f309a;
                com.google.apps.tiktok.q.b.h b2 = com.google.android.apps.search.googleapp.discover.ae.ag.b();
                com.google.apps.tiktok.account.d.b.f kf10 = ikVar14.kf();
                hVar72 = joVar15.w;
                return com.google.android.apps.search.googleapp.discover.ae.ag.f(b2, kf10, (com.google.android.libraries.storage.a.j) hVar72.a());
            case 364:
                jjVar81 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.bf bfVar = (com.google.android.apps.search.googleapp.discover.z.bf) jj.lK(jjVar81).a();
                jjVar82 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.au auVar = (com.google.android.apps.search.googleapp.discover.z.au) jj.kU(jjVar82).a();
                hVar73 = this.f309a.P;
                n nVar4 = (n) hVar73.a();
                hVar74 = this.f309a.Q;
                ag agVar5 = (ag) hVar74.a();
                jjVar83 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.av cb = jjVar83.cb();
                jjVar84 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a aVar8 = (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar84).a();
                jjVar85 = this.b.f308a;
                Optional optional = (Optional) jj.iT(jjVar85).a();
                jjVar86 = this.b.f308a;
                boolean oJ = jjVar86.oJ();
                jrVar16 = this.f309a.b;
                long l = jrVar16.l();
                jjVar87 = this.b.f308a;
                long u = jjVar87.u();
                jrVar17 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.z.m(bfVar, auVar, nVar4, agVar5, cb, aVar8, optional, oJ, l, u, ((Boolean) jr.dn(jrVar17).a()).booleanValue());
            case 365:
                hVar75 = this.f309a.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar75.a();
                jjVar88 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.z.bf(fVar2, (com.google.android.apps.search.googleapp.discover.z.ao) jj.iX(jjVar88).a());
            case 366:
                jjVar89 = this.b.f308a;
                h ht = jj.ht(jjVar89);
                jo joVar16 = this.f309a;
                ik ikVar15 = this.b;
                hVar76 = joVar16.lj;
                hVar77 = joVar16.ez;
                hVar78 = joVar16.P;
                hVar79 = joVar16.Q;
                jjVar90 = ikVar15.f308a;
                h hb = jj.hb(jjVar90);
                jjVar91 = this.b.f308a;
                h jI = jj.jI(jjVar91);
                jrVar18 = this.f309a.b;
                h dn = jr.dn(jrVar18);
                jrVar19 = this.f309a.b;
                h dd = jr.dd(jrVar19);
                jjVar92 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.z.ao(ht, hVar76, hVar77, hVar78, hVar79, hb, jI, dn, dd, jj.jA(jjVar92));
            case 367:
                hVar80 = this.f309a.Q;
                ag agVar6 = (ag) hVar80.a();
                jjVar93 = this.b.f308a;
                com.google.android.libraries.storage.c.ai aiVar = (com.google.android.libraries.storage.c.ai) jj.jh(jjVar93).a();
                hVar81 = this.f309a.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar81.a();
                jjVar94 = this.b.f308a;
                long t = jjVar94.t();
                hVar82 = this.f309a.P;
                n nVar5 = (n) hVar82.a();
                hVar83 = this.f309a.H;
                Executor executor3 = (Executor) hVar83.a();
                jjVar95 = this.b.f308a;
                cg cgVar5 = (cg) jj.kp(jjVar95).a();
                jjVar96 = this.b.f308a;
                ao fR2 = jjVar96.fR();
                jrVar20 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.z.v(agVar6, aiVar, fVar3, t, nVar5, executor3, cgVar5, fR2, (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar20).a());
            case 368:
                return ap.d(this.b.ye());
            case 369:
                ik ikVar16 = this.b;
                jo joVar17 = this.f309a;
                com.google.apps.tiktok.q.b.h b3 = ap.b();
                com.google.apps.tiktok.account.d.b.f kf11 = ikVar16.kf();
                hVar84 = joVar17.w;
                return ap.c(b3, kf11, (com.google.android.libraries.storage.a.j) hVar84.a());
            case 370:
                return new com.google.android.apps.search.googleapp.discover.z.a();
            case 371:
                jjVar97 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.c(jjVar97.sD()));
            case 372:
                jjVar98 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.f.b(jjVar98.sD()));
            case 373:
                hVar85 = this.f309a.P;
                n nVar6 = (n) hVar85.a();
                jjVar99 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.an rq = jjVar99.rq();
                jjVar100 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.bf bfVar2 = (com.google.android.apps.search.googleapp.discover.z.bf) jj.lK(jjVar100).a();
                jjVar101 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ag.b.g cl = jjVar101.cl();
                jjVar102 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ag.a.g ck = jjVar102.ck();
                jjVar103 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.ao aoVar = (com.google.android.apps.search.googleapp.discover.z.ao) jj.iX(jjVar103).a();
                jjVar104 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.z.au(nVar6, rq, bfVar2, cl, ck, aoVar, (com.google.android.apps.search.googleapp.discover.z.a) jj.hb(jjVar104).a());
            case 374:
                ik ikVar17 = this.b;
                jo joVar18 = this.f309a;
                com.google.apps.tiktok.q.b.h c7 = com.google.android.apps.search.googleapp.discover.ag.b.i.c();
                com.google.apps.tiktok.account.d.b.f kf12 = ikVar17.kf();
                hVar86 = joVar18.w;
                return com.google.android.apps.search.googleapp.discover.ag.b.i.b(c7, kf12, (com.google.android.libraries.storage.a.j) hVar86.a());
            case 375:
                hVar87 = this.b.Y;
                com.google.android.libraries.search.integrations.c.a.c cVar2 = (com.google.android.libraries.search.integrations.c.a.c) hVar87.a();
                hVar88 = this.f309a.H;
                Executor executor4 = (Executor) hVar88.a();
                jjVar105 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.ai.b.f(cVar2, executor4, (com.google.android.libraries.search.t.c.ak) jj.hA(jjVar105).a());
            case 376:
                ik ikVar18 = this.b;
                jo joVar19 = this.f309a;
                com.google.apps.tiktok.q.b.h c8 = com.google.android.apps.search.googleapp.discover.ag.a.h.c();
                com.google.apps.tiktok.account.d.b.f kf13 = ikVar18.kf();
                hVar89 = joVar19.w;
                return com.google.android.apps.search.googleapp.discover.ag.a.h.b(c8, kf13, (com.google.android.libraries.storage.a.j) hVar89.a());
            case 377:
                jjVar106 = this.b.f308a;
                boolean oI = jjVar106.oI();
                jrVar21 = this.f309a.b;
                boolean fS = jrVar21.fS();
                jrVar22 = this.f309a.b;
                boolean fT = jrVar22.fT();
                jrVar23 = this.f309a.b;
                boolean fU = jrVar23.fU();
                jjVar107 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a(oI, fS, fT, fU, jjVar107.bI());
            case 378:
                jjVar108 = this.b.f308a;
                return com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.e.b((com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar108).a());
            case 379:
                jjVar109 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.m mVar2 = (com.google.android.apps.search.googleapp.discover.z.m) jj.hs(jjVar109).a();
                jjVar110 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ag.o cj = jjVar110.cj();
                jjVar111 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ad.h hVar121 = (com.google.android.apps.search.googleapp.discover.ad.h) jj.iV(jjVar111).a();
                jjVar112 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ad.v cg = jjVar112.cg();
                hVar90 = this.f309a.P;
                n nVar7 = (n) hVar90.a();
                jjVar113 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.s.j jVar2 = (com.google.android.apps.search.googleapp.discover.s.j) jj.iZ(jjVar113).a();
                jjVar114 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a aVar9 = (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar114).a();
                jrVar24 = this.f309a.b;
                com.google.android.apps.search.googleapp.x.d.b bVar8 = (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar24).a();
                jrVar25 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.ad.af(mVar2, cj, hVar121, cg, nVar7, jVar2, aVar9, bVar8, ((Boolean) jr.dn(jrVar25).a()).booleanValue());
            case 380:
                jjVar115 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.m mVar3 = (com.google.android.apps.search.googleapp.discover.z.m) jj.hs(jjVar115).a();
                jjVar116 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ag.b.g cl2 = jjVar116.cl();
                jjVar117 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ag.a.g ck2 = jjVar117.ck();
                hVar91 = this.f309a.ez;
                com.google.common.v.f fVar4 = (com.google.common.v.f) hVar91.a();
                hVar92 = this.f309a.P;
                n nVar8 = (n) hVar92.a();
                jjVar118 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a aVar10 = (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar118).a();
                jrVar26 = this.f309a.b;
                boolean fV = jrVar26.fV();
                jrVar27 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.ag.o(mVar3, cl2, ck2, fVar4, nVar8, aVar10, fV, (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar27).a());
            case 381:
                jjVar119 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ag.o oVar4 = (com.google.android.apps.search.googleapp.discover.ag.o) jj.lF(jjVar119).a();
                com.google.android.apps.search.googleapp.discover.h.b.d(oVar4);
                return oVar4;
            case 382:
                jjVar120 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.e.g gVar = (com.google.android.apps.search.googleapp.discover.e.g) jj.gP(jjVar120).a();
                jjVar121 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.e.ag agVar7 = (com.google.android.apps.search.googleapp.discover.e.ag) jj.kJ(jjVar121).a();
                jjVar122 = this.b.f308a;
                ct bZ = jjVar122.bZ();
                jjVar123 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.w.f fVar5 = (com.google.android.apps.search.googleapp.discover.w.f) jj.jd(jjVar123).a();
                jjVar124 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ad.s sVar = (com.google.android.apps.search.googleapp.discover.ad.s) jj.kL(jjVar124).a();
                hVar93 = this.f309a.iu;
                ay ayVar3 = (ay) hVar93.a();
                jrVar28 = this.f309a.b;
                boolean gd = jrVar28.gd();
                jjVar125 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a aVar11 = (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar125).a();
                jjVar126 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.ad.h(gVar, agVar7, bZ, fVar5, sVar, ayVar3, gd, aVar11, jjVar126.bL());
            case 383:
                jjVar127 = this.b.f308a;
                com.google.android.libraries.search.b.b bVar9 = (com.google.android.libraries.search.b.b) jj.hz(jjVar127).a();
                hVar94 = this.f309a.g;
                return new com.google.android.apps.search.googleapp.discover.e.g(bVar9, (com.google.android.libraries.g.a) hVar94.a());
            case 384:
                jjVar128 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.e.ag((com.google.android.libraries.search.b.b) jj.hz(jjVar128).a());
            case 385:
                jjVar129 = this.b.f308a;
                com.google.aw.d.b.b.a.b fE = jjVar129.fE();
                jjVar130 = this.b.f308a;
                com.google.aw.d.a.a.c fD = jjVar130.fD();
                jjVar131 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.al bW = jjVar131.bW();
                jrVar29 = this.f309a.b;
                boolean fW = jrVar29.fW();
                jjVar132 = this.b.f308a;
                boolean oK = jjVar132.oK();
                jjVar133 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.y bV = jjVar133.bV();
                jjVar134 = this.b.f308a;
                boolean oL = jjVar134.oL();
                jjVar135 = this.b.f308a;
                cg cgVar6 = (cg) jj.ks(jjVar135).a();
                hVar95 = this.f309a.H;
                Executor executor5 = (Executor) hVar95.a();
                hVar96 = this.f309a.P;
                n nVar9 = (n) hVar96.a();
                jjVar136 = this.b.f308a;
                com.google.frameworks.client.data.android.d.f fVar6 = (com.google.frameworks.client.data.android.d.f) jj.jQ(jjVar136).a();
                jjVar137 = this.b.f308a;
                boolean oM = jjVar137.oM();
                jjVar138 = this.b.f308a;
                String mE = jjVar138.mE();
                jrVar30 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.x.cg(fE, fD, bW, fW, oK, bV, oL, cgVar6, executor5, nVar9, fVar6, oM, mE, jrVar30.fX());
            case 386:
                jjVar139 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.r bU = jjVar139.bU();
                jjVar140 = this.b.f308a;
                String mD = jjVar140.mD();
                jjVar141 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.e.ag agVar8 = (com.google.android.apps.search.googleapp.discover.e.ag) jj.kJ(jjVar141).a();
                jjVar142 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.e.g gVar2 = (com.google.android.apps.search.googleapp.discover.e.g) jj.gP(jjVar142).a();
                jjVar143 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.am amVar = (com.google.android.apps.search.googleapp.discover.x.am) jj.hp(jjVar143).a();
                hVar97 = this.f309a.P;
                n nVar10 = (n) hVar97.a();
                hVar98 = this.b.g;
                AccountId accountId6 = (AccountId) hVar98.a();
                hVar99 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar10 = (com.google.apps.tiktok.account.data.b) hVar99.a();
                jjVar144 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.l.b bG = jjVar144.bG();
                jjVar145 = this.b.f308a;
                com.google.android.libraries.search.f.g eI = jjVar145.eI();
                jrVar31 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.x.al(bU, mD, agVar8, gVar2, amVar, nVar10, accountId6, bVar10, bG, eI, (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar31).a());
            case 387:
                hVar100 = this.f309a.Q;
                ag agVar9 = (ag) hVar100.a();
                hVar101 = this.f309a.P;
                n nVar11 = (n) hVar101.a();
                jrVar32 = this.f309a.b;
                com.google.android.libraries.search.h.d aJ = jrVar32.aJ();
                hVar102 = this.b.u;
                com.google.android.libraries.search.account.e.b bVar11 = (com.google.android.libraries.search.account.e.b) hVar102.a();
                jjVar146 = this.b.f308a;
                com.google.android.apps.search.googleapp.y.a.b cr = jjVar146.cr();
                jjVar147 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.ab abVar = (com.google.android.apps.search.googleapp.discover.x.ab) jj.gW(jjVar147).a();
                jjVar148 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.settings.b.k ce = jjVar148.ce();
                hVar103 = this.f309a.f;
                Context context4 = (Context) hVar103.a();
                jjVar149 = this.b.f308a;
                com.google.android.apps.i.a.a.a aVar12 = (com.google.android.apps.i.a.a.a) jj.kD(jjVar149).a();
                jjVar150 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.o bT = jjVar150.bT();
                hVar104 = this.b.W;
                com.google.android.libraries.search.trust.b.y yVar = (com.google.android.libraries.search.trust.b.y) hVar104.a();
                jrVar33 = this.f309a.b;
                boolean booleanValue6 = ((Boolean) jr.dt(jrVar33).a()).booleanValue();
                jjVar151 = this.b.f308a;
                return new cm(agVar9, nVar11, aJ, bVar11, cr, abVar, ce, context4, aVar12, bT, yVar, booleanValue6, jjVar151.fu());
            case 388:
                hVar105 = this.f309a.ez;
                com.google.common.v.f fVar7 = (com.google.common.v.f) hVar105.a();
                jjVar152 = this.b.f308a;
                cg cgVar7 = (cg) jj.kq(jjVar152).a();
                hVar106 = this.f309a.P;
                n nVar12 = (n) hVar106.a();
                hVar107 = this.f309a.H;
                Executor executor6 = (Executor) hVar107.a();
                hVar108 = this.f309a.Q;
                return new com.google.android.apps.search.googleapp.discover.x.am(fVar7, cgVar7, nVar12, executor6, (ag) hVar108.a());
            case 389:
                ik ikVar19 = this.b;
                jo joVar20 = this.f309a;
                com.google.apps.tiktok.q.b.h b4 = com.google.android.apps.search.googleapp.discover.x.ap.b();
                com.google.apps.tiktok.account.d.b.f kf14 = ikVar19.kf();
                hVar109 = joVar20.w;
                return com.google.android.apps.search.googleapp.discover.x.ap.f(b4, kf14, (com.google.android.libraries.storage.a.j) hVar109.a());
            case 390:
                jjVar153 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.al alVar = (com.google.android.apps.search.googleapp.discover.x.al) jj.hq(jjVar153).a();
                com.google.android.apps.search.googleapp.discover.h.b.c(alVar);
                return alVar;
            case 391:
                hVar110 = this.f309a.ez;
                com.google.common.v.f fVar8 = (com.google.common.v.f) hVar110.a();
                jjVar154 = this.b.f308a;
                cg cgVar8 = (cg) jj.kr(jjVar154).a();
                hVar111 = this.f309a.P;
                n nVar13 = (n) hVar111.a();
                hVar112 = this.f309a.H;
                Executor executor7 = (Executor) hVar112.a();
                hVar113 = this.f309a.Q;
                return new bh(fVar8, cgVar8, nVar13, executor7, (ag) hVar113.a());
            case 392:
                ik ikVar20 = this.b;
                jo joVar21 = this.f309a;
                com.google.apps.tiktok.q.b.h d2 = com.google.android.apps.search.googleapp.discover.x.ap.d();
                com.google.apps.tiktok.account.d.b.f kf15 = ikVar20.kf();
                hVar114 = joVar21.w;
                return com.google.android.apps.search.googleapp.discover.x.ap.g(d2, kf15, (com.google.android.libraries.storage.a.j) hVar114.a());
            case 393:
                ik ikVar21 = this.b;
                jo joVar22 = this.f309a;
                com.google.apps.tiktok.q.b.h e = com.google.android.apps.search.googleapp.discover.x.ap.e();
                com.google.apps.tiktok.account.d.b.f kf16 = ikVar21.kf();
                hVar115 = joVar22.w;
                return com.google.android.apps.search.googleapp.discover.x.ap.h(e, kf16, (com.google.android.libraries.storage.a.j) hVar115.a());
            case 394:
                hVar116 = this.b.X;
                com.google.apps.tiktok.p.b.c cVar3 = (com.google.apps.tiktok.p.b.c) hVar116.a();
                jrVar34 = this.f309a.b;
                return com.google.android.apps.search.googleapp.discover.x.c.b.c(cVar3, (com.google.frameworks.client.data.android.a.q) jr.ex(jrVar34).a());
            case 395:
                hVar117 = this.f309a.P;
                n nVar14 = (n) hVar117.a();
                jjVar155 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.o bT2 = jjVar155.bT();
                jjVar156 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.a.c.b.j jVar3 = (com.google.android.apps.search.googleapp.discover.a.c.b.j) jj.ge(jjVar156).a();
                jrVar35 = this.f309a.b;
                com.google.android.apps.search.googleapp.discover.x.a.a.a aVar13 = (com.google.android.apps.search.googleapp.discover.x.a.a.a) jr.bV(jrVar35).a();
                hVar118 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar12 = (com.google.apps.tiktok.account.data.b) hVar118.a();
                hVar119 = this.b.g;
                AccountId accountId7 = (AccountId) hVar119.a();
                jjVar157 = this.b.f308a;
                bs bX = jjVar157.bX();
                jjVar158 = this.b.f308a;
                h jg = jj.jg(jjVar158);
                jjVar159 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.a.c.a.i iVar2 = (com.google.android.apps.search.googleapp.discover.a.c.a.i) jj.gg(jjVar159).a();
                jjVar160 = this.b.f308a;
                com.google.android.apps.search.googleapp.labs.g.z zVar3 = (com.google.android.apps.search.googleapp.labs.g.z) jj.hV(jjVar160).a();
                jjVar161 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.x.au(nVar14, bT2, jVar3, aVar13, bVar12, accountId7, bX, jg, iVar2, zVar3, jjVar161.oV());
            case 396:
                jjVar162 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.a.c.b.j((com.google.android.libraries.storage.c.ai) jj.ji(jjVar162).a());
            case 397:
                return com.google.android.apps.search.googleapp.discover.a.c.b.k.b(this.b.ye());
            case 398:
                ik ikVar22 = this.b;
                jo joVar23 = this.f309a;
                com.google.apps.tiktok.q.b.h j = com.google.android.apps.search.googleapp.discover.x.ap.j();
                com.google.apps.tiktok.account.d.b.f kf17 = ikVar22.kf();
                hVar120 = joVar23.w;
                return com.google.android.apps.search.googleapp.discover.x.ap.i(j, kf17, (com.google.android.libraries.storage.a.j) hVar120.a());
            case 399:
                ik ikVar23 = this.b;
                Set ru = jj.ru();
                jjVar163 = ikVar23.f308a;
                Map mY = jjVar163.mY();
                jjVar164 = this.b.f308a;
                return com.google.android.apps.search.googleapp.discover.x.ap.c(ru, mY, (com.google.android.apps.i.a.a.a) jj.kD(jjVar164).a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        jr jrVar;
        jr jrVar2;
        jr jrVar3;
        jr jrVar4;
        jr jrVar5;
        jr jrVar6;
        h hVar;
        jj jjVar;
        jj jjVar2;
        jj jjVar3;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        jr jrVar7;
        h hVar6;
        h hVar7;
        jj jjVar4;
        jj jjVar5;
        jr jrVar8;
        jj jjVar6;
        h hVar8;
        jj jjVar7;
        jj jjVar8;
        jj jjVar9;
        jr jrVar9;
        jj jjVar10;
        jr jrVar10;
        jj jjVar11;
        h hVar9;
        h hVar10;
        jj jjVar12;
        jj jjVar13;
        h hVar11;
        jj jjVar14;
        jj jjVar15;
        jj jjVar16;
        jj jjVar17;
        jr jrVar11;
        h hVar12;
        jj jjVar18;
        jj jjVar19;
        jj jjVar20;
        jr jrVar12;
        h hVar13;
        jj jjVar21;
        jj jjVar22;
        jj jjVar23;
        jr jrVar13;
        jj jjVar24;
        h hVar14;
        h hVar15;
        jr jrVar14;
        jj jjVar25;
        jj jjVar26;
        jj jjVar27;
        jj jjVar28;
        h hVar16;
        jj jjVar29;
        h hVar17;
        h hVar18;
        jj jjVar30;
        jj jjVar31;
        jj jjVar32;
        h hVar19;
        jj jjVar33;
        jj jjVar34;
        jj jjVar35;
        h hVar20;
        jj jjVar36;
        jj jjVar37;
        jj jjVar38;
        jr jrVar15;
        jr jrVar16;
        jr jrVar17;
        h hVar21;
        h hVar22;
        jj jjVar39;
        jr jrVar18;
        h hVar23;
        jj jjVar40;
        jj jjVar41;
        jj jjVar42;
        h hVar24;
        jj jjVar43;
        h hVar25;
        h hVar26;
        h hVar27;
        jj jjVar44;
        h hVar28;
        jj jjVar45;
        h hVar29;
        h hVar30;
        h hVar31;
        h hVar32;
        jj jjVar46;
        jj jjVar47;
        jj jjVar48;
        jj jjVar49;
        jj jjVar50;
        jj jjVar51;
        jr jrVar19;
        h hVar33;
        h hVar34;
        h hVar35;
        h hVar36;
        h hVar37;
        jj jjVar52;
        jj jjVar53;
        jj jjVar54;
        jj jjVar55;
        jj jjVar56;
        jj jjVar57;
        h hVar38;
        h hVar39;
        h hVar40;
        h hVar41;
        h hVar42;
        h hVar43;
        h hVar44;
        h hVar45;
        jj jjVar58;
        jj jjVar59;
        jj jjVar60;
        jj jjVar61;
        jj jjVar62;
        jj jjVar63;
        jj jjVar64;
        jj jjVar65;
        h hVar46;
        h hVar47;
        jj jjVar66;
        jy jyVar;
        h hVar48;
        h hVar49;
        jr jrVar20;
        jj jjVar67;
        jj jjVar68;
        h hVar50;
        h hVar51;
        jr jrVar21;
        jr jrVar22;
        jr jrVar23;
        jj jjVar69;
        jj jjVar70;
        jj jjVar71;
        h hVar52;
        jj jjVar72;
        h hVar53;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        jj jjVar73;
        jj jjVar74;
        jj jjVar75;
        jj jjVar76;
        h hVar58;
        h hVar59;
        jj jjVar77;
        jj jjVar78;
        h hVar60;
        jj jjVar79;
        jr jrVar24;
        jj jjVar80;
        jj jjVar81;
        jj jjVar82;
        jj jjVar83;
        jj jjVar84;
        jj jjVar85;
        jj jjVar86;
        jj jjVar87;
        jj jjVar88;
        jj jjVar89;
        jj jjVar90;
        jj jjVar91;
        jj jjVar92;
        jj jjVar93;
        jj jjVar94;
        jj jjVar95;
        jj jjVar96;
        jj jjVar97;
        jj jjVar98;
        jj jjVar99;
        jj jjVar100;
        jj jjVar101;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        jj jjVar102;
        jj jjVar103;
        jj jjVar104;
        jj jjVar105;
        jj jjVar106;
        jj jjVar107;
        jr jrVar25;
        jj jjVar108;
        jj jjVar109;
        jj jjVar110;
        jr jrVar26;
        jj jjVar111;
        jj jjVar112;
        h hVar65;
        jj jjVar113;
        h hVar66;
        jr jrVar27;
        h hVar67;
        h hVar68;
        h hVar69;
        jj jjVar114;
        jj jjVar115;
        h hVar70;
        jj jjVar116;
        jj jjVar117;
        jj jjVar118;
        jj jjVar119;
        jj jjVar120;
        jj jjVar121;
        h hVar71;
        jj jjVar122;
        h hVar72;
        jj jjVar123;
        h hVar73;
        h hVar74;
        h hVar75;
        h hVar76;
        jr jrVar28;
        h hVar77;
        jj jjVar124;
        jj jjVar125;
        jj jjVar126;
        jj jjVar127;
        jj jjVar128;
        jj jjVar129;
        jj jjVar130;
        jj jjVar131;
        jj jjVar132;
        jj jjVar133;
        jj jjVar134;
        h hVar78;
        jj jjVar135;
        jj jjVar136;
        jj jjVar137;
        jj jjVar138;
        h hVar79;
        jj jjVar139;
        jj jjVar140;
        jj jjVar141;
        jr jrVar29;
        jj jjVar142;
        jj jjVar143;
        jj jjVar144;
        jj jjVar145;
        jj jjVar146;
        jj jjVar147;
        jj jjVar148;
        jj jjVar149;
        jj jjVar150;
        jj jjVar151;
        jj jjVar152;
        jj jjVar153;
        jj jjVar154;
        jj jjVar155;
        jj jjVar156;
        jj jjVar157;
        jj jjVar158;
        jj jjVar159;
        jj jjVar160;
        jj jjVar161;
        jj jjVar162;
        h hVar80;
        jj jjVar163;
        h hVar81;
        h hVar82;
        h hVar83;
        jj jjVar164;
        jj jjVar165;
        jj jjVar166;
        jj jjVar167;
        jj jjVar168;
        jj jjVar169;
        jj jjVar170;
        jj jjVar171;
        jj jjVar172;
        jj jjVar173;
        jj jjVar174;
        jj jjVar175;
        jj jjVar176;
        jj jjVar177;
        jj jjVar178;
        jj jjVar179;
        jj jjVar180;
        jr jrVar30;
        jj jjVar181;
        jj jjVar182;
        jr jrVar31;
        jr jrVar32;
        jr jrVar33;
        jj jjVar183;
        jj jjVar184;
        jj jjVar185;
        jj jjVar186;
        jj jjVar187;
        jj jjVar188;
        jj jjVar189;
        jj jjVar190;
        jj jjVar191;
        jj jjVar192;
        jj jjVar193;
        jj jjVar194;
        h hVar84;
        h hVar85;
        h hVar86;
        jj jjVar195;
        jj jjVar196;
        jy jyVar2;
        h hVar87;
        jy jyVar3;
        h hVar88;
        jy jyVar4;
        h hVar89;
        h hVar90;
        h hVar91;
        jy jyVar5;
        h hVar92;
        h hVar93;
        h hVar94;
        jj jjVar197;
        jr jrVar34;
        h hVar95;
        h hVar96;
        jr jrVar35;
        jr jrVar36;
        h hVar97;
        jj jjVar198;
        h hVar98;
        h hVar99;
        jj jjVar199;
        jj jjVar200;
        h hVar100;
        jr jrVar37;
        jr jrVar38;
        jj jjVar201;
        jj jjVar202;
        h hVar101;
        jj jjVar203;
        h hVar102;
        jj jjVar204;
        jj jjVar205;
        h hVar103;
        jr jrVar39;
        h hVar104;
        h hVar105;
        int i = this.c;
        switch (i) {
            case 400:
                jrVar = this.f309a.b;
                boolean fY = jrVar.fY();
                jrVar2 = this.f309a.b;
                boolean fZ = jrVar2.fZ();
                jrVar3 = this.f309a.b;
                boolean ga = jrVar3.ga();
                jrVar4 = this.f309a.b;
                com.google.protos.i.a.a.a.b.b.a.a.a.b bh = jrVar4.bh();
                jrVar5 = this.f309a.b;
                com.google.protos.i.a.a.a.b.b.a.a.a.b bi = jrVar5.bi();
                jrVar6 = this.f309a.b;
                com.google.protos.i.a.a.a.b.b.a.a.a.b bj = jrVar6.bj();
                hVar = this.f309a.f;
                return new com.google.android.apps.search.googleapp.discover.af.a(fY, fZ, ga, bh, bi, bj, (Context) hVar.a());
            case 401:
                jjVar = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.m.e(jjVar.sk()));
            case 402:
                jjVar2 = this.b.f308a;
                return Boolean.valueOf(h.a.a.r.b.a.m.i(jjVar2.sz()));
            case 403:
                jjVar3 = this.b.f308a;
                cg cgVar = (cg) jj.kt(jjVar3).a();
                hVar2 = this.f309a.H;
                Executor executor = (Executor) hVar2.a();
                hVar3 = this.f309a.P;
                return new com.google.android.apps.search.googleapp.discover.a.c.a.i(cgVar, executor, (n) hVar3.a());
            case 404:
                ik ikVar = this.b;
                jo joVar = this.f309a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.googleapp.discover.a.c.a.k.c();
                com.google.apps.tiktok.account.d.b.f kf = ikVar.kf();
                hVar4 = joVar.w;
                return com.google.android.apps.search.googleapp.discover.a.c.a.k.b(c, kf, (com.google.android.libraries.storage.a.j) hVar4.a());
            case 405:
                ik ikVar2 = this.b;
                jo joVar2 = this.f309a;
                hVar5 = ikVar2.V;
                jrVar7 = joVar2.b;
                com.google.apps.tiktok.p.m mVar = (com.google.apps.tiktok.p.m) jr.cy(jrVar7).a();
                hVar6 = this.f309a.mh;
                com.google.apps.tiktok.p.u uVar = (com.google.apps.tiktok.p.u) hVar6.a();
                hVar7 = this.f309a.mb;
                return com.google.android.apps.search.googleapp.discover.x.c.b.b(hVar5, mVar, uVar, (com.google.frameworks.client.data.android.d) hVar7.a(), at.i());
            case 406:
                jjVar4 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.e.t((com.google.android.libraries.search.b.b) jj.hz(jjVar4).a(), (byte[]) null, (byte[]) null);
            case 407:
                jjVar5 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a aVar = (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar5).a();
                jrVar8 = this.f309a.b;
                ao bb = jrVar8.bb();
                jjVar6 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.au bK = jjVar6.bK();
                hVar8 = this.f309a.Q;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.bd(aVar, bb, bK, (ag) hVar8.a());
            case 408:
                jjVar7 = this.b.f308a;
                com.google.aw.d.b.f.a.g fF = jjVar7.fF();
                jjVar8 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.y bV = jjVar8.bV();
                jjVar9 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.d.h bJ = jjVar9.bJ();
                jrVar9 = this.f309a.b;
                ao bc = jrVar9.bc();
                jjVar10 = this.b.f308a;
                com.google.frameworks.client.data.android.d.f fVar = (com.google.frameworks.client.data.android.d.f) jj.jQ(jjVar10).a();
                jrVar10 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.d.i(fF, bV, bJ, bc, fVar, jrVar10.gc());
            case 409:
                ik ikVar3 = this.b;
                Map rv = jj.rv();
                jjVar11 = ikVar3.f308a;
                com.google.android.apps.search.googleapp.discover.w.e eVar = (com.google.android.apps.search.googleapp.discover.w.e) jj.gO(jjVar11).a();
                hVar9 = this.f309a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar9.a();
                hVar10 = this.f309a.ez;
                com.google.common.v.f fVar2 = (com.google.common.v.f) hVar10.a();
                jjVar12 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.w.f(rv, eVar, aVar2, fVar2, (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar12).a());
            case 410:
                return new com.google.android.apps.search.googleapp.discover.w.e();
            case 411:
                jjVar13 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.b.b(jj.hz(jjVar13));
            case 412:
                jo joVar3 = this.f309a;
                ik ikVar4 = this.b;
                hVar11 = joVar3.Q;
                jjVar14 = ikVar4.f308a;
                h kL = jj.kL(jjVar14);
                jjVar15 = this.b.f308a;
                h hs = jj.hs(jjVar15);
                jjVar16 = this.b.f308a;
                h lm = jj.lm(jjVar16);
                jjVar17 = this.b.f308a;
                h gg = jj.gg(jjVar17);
                jrVar11 = this.f309a.b;
                h dY = jr.dY(jrVar11);
                hVar12 = this.f309a.iu;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.q(hVar11, kL, hs, lm, gg, dY, hVar12);
            case 413:
                jjVar18 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.m mVar2 = (com.google.android.apps.search.googleapp.discover.z.m) jj.hs(jjVar18).a();
                jjVar19 = this.b.f308a;
                bs bX = jjVar19.bX();
                jjVar20 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.f.j bE = jjVar20.bE();
                jrVar12 = this.f309a.b;
                com.google.android.apps.search.googleapp.x.d.b bVar = (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar12).a();
                hVar13 = this.f309a.P;
                n nVar = (n) hVar13.a();
                jjVar21 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.k.b.a aVar3 = (com.google.android.apps.search.googleapp.discover.k.b.a) jj.gX(jjVar21).a();
                jjVar22 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.ad.s(mVar2, bX, bE, bVar, nVar, aVar3, (com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.c.a) jj.lm(jjVar22).a());
            case 414:
                jjVar23 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.k.b.a(jjVar23.eU());
            case 415:
                jrVar13 = this.f309a.b;
                return new com.google.android.libraries.search.rendering.xuikit.a.p((com.google.android.libraries.search.rendering.xuikit.c.j.e) jr.ed(jrVar13).a());
            case 416:
                jjVar24 = this.b.f308a;
                com.google.frameworks.client.data.android.l lVar = (com.google.frameworks.client.data.android.l) jj.jF(jjVar24).a();
                hVar14 = this.f309a.Q;
                ag agVar = (ag) hVar14.a();
                hVar15 = this.f309a.P;
                n nVar2 = (n) hVar15.a();
                jrVar14 = this.f309a.b;
                com.google.android.apps.search.googleapp.x.d.b bVar2 = (com.google.android.apps.search.googleapp.x.d.b) jr.bR(jrVar14).a();
                jjVar25 = this.b.f308a;
                com.google.android.apps.search.googleapp.y.a.b cr = jjVar25.cr();
                jjVar26 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.ab abVar = (com.google.android.apps.search.googleapp.discover.x.ab) jj.gW(jjVar26).a();
                jjVar27 = this.b.f308a;
                com.google.android.libraries.search.f.g eI = jjVar27.eI();
                jjVar28 = this.b.f308a;
                com.google.protos.l.a.e fX = jjVar28.fX();
                hVar16 = this.f309a.ez;
                com.google.common.v.f fVar3 = (com.google.common.v.f) hVar16.a();
                jjVar29 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.x.o bT = jjVar29.bT();
                hVar17 = this.f309a.wH;
                return new com.google.android.apps.search.googleapp.discover.k.e.e(lVar, agVar, nVar2, bVar2, cr, abVar, eI, fX, fVar3, bT, (com.google.android.libraries.search.trust.c.t) hVar17.a());
            case 417:
                jo joVar4 = this.f309a;
                ik ikVar5 = this.b;
                hVar18 = joVar4.Q;
                jjVar30 = ikVar5.f308a;
                h iZ = jj.iZ(jjVar30);
                jjVar31 = this.b.f308a;
                h lF = jj.lF(jjVar31);
                jjVar32 = this.b.f308a;
                h gx = jj.gx(jjVar32);
                jo joVar5 = this.f309a;
                ik ikVar6 = this.b;
                hVar19 = joVar5.ez;
                jjVar33 = ikVar6.f308a;
                h hr = jj.hr(jjVar33);
                jjVar34 = this.b.f308a;
                h ge = jj.ge(jjVar34);
                jjVar35 = this.b.f308a;
                h gg2 = jj.gg(jjVar35);
                jo joVar6 = this.f309a;
                ik ikVar7 = this.b;
                hVar20 = joVar6.P;
                jjVar36 = ikVar7.f308a;
                h gW = jj.gW(jjVar36);
                jjVar37 = this.b.f308a;
                h hs2 = jj.hs(jjVar37);
                jjVar38 = this.b.f308a;
                h gf = jj.gf(jjVar38);
                jrVar15 = this.f309a.b;
                h dn = jr.dn(jrVar15);
                jrVar16 = this.f309a.b;
                h dJ = jr.dJ(jrVar16);
                jrVar17 = this.f309a.b;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.ae(hVar18, iZ, lF, gx, hVar19, hr, ge, gg2, hVar20, gW, hs2, gf, dn, dJ, jr.dc(jrVar17));
            case 418:
                hVar21 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar3 = (com.google.apps.tiktok.account.data.b) hVar21.a();
                hVar22 = this.b.g;
                AccountId accountId = (AccountId) hVar22.a();
                jjVar39 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.s.b bS = jjVar39.bS();
                jrVar18 = this.f309a.b;
                com.google.android.gms.common.e eVar2 = (com.google.android.gms.common.e) jr.dy(jrVar18).a();
                hVar23 = this.f309a.f;
                Context context = (Context) hVar23.a();
                jjVar40 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.l.b bG = jjVar40.bG();
                jjVar41 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.t.j jVar = (com.google.android.apps.search.googleapp.discover.t.j) jj.gU(jjVar41).a();
                jjVar42 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.m mVar3 = (com.google.android.apps.search.googleapp.discover.z.m) jj.hs(jjVar42).a();
                hVar24 = this.f309a.P;
                return new com.google.android.apps.search.googleapp.discover.s.j(bVar3, accountId, bS, eVar2, context, bG, jVar, mVar3, (n) hVar24.a());
            case 419:
                jjVar43 = this.b.f308a;
                cg cgVar2 = (cg) jj.ku(jjVar43).a();
                hVar25 = this.f309a.Q;
                ag agVar2 = (ag) hVar25.a();
                hVar26 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar4 = (com.google.apps.tiktok.account.data.b) hVar26.a();
                hVar27 = this.b.g;
                return new com.google.android.apps.search.googleapp.discover.t.j(cgVar2, agVar2, bVar4, (AccountId) hVar27.a(), this.b.uE());
            case 420:
                jjVar44 = this.b.f308a;
                com.google.apps.tiktok.q.b.h hVar106 = (com.google.apps.tiktok.q.b.h) jj.jq(jjVar44).a();
                ik ikVar8 = this.b;
                jo joVar7 = this.f309a;
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar8.kf();
                hVar28 = joVar7.w;
                return com.google.android.apps.search.googleapp.discover.t.q.c(hVar106, kf2, (com.google.android.libraries.storage.a.j) hVar28.a());
            case 421:
                jjVar45 = this.b.f308a;
                com.google.android.libraries.search.ad.a.h fn = jjVar45.fn();
                hVar29 = this.b.g;
                AccountId accountId2 = (AccountId) hVar29.a();
                hVar30 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar30.a();
                hVar31 = this.f309a.v;
                return com.google.android.apps.search.googleapp.discover.t.q.b(fn, accountId2, dVar, (Executor) hVar31.a());
            case 422:
                hVar32 = this.f309a.ez;
                com.google.common.v.f fVar4 = (com.google.common.v.f) hVar32.a();
                jjVar46 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.e.t tVar = (com.google.android.apps.search.googleapp.discover.e.t) jj.ho(jjVar46).a();
                jjVar47 = this.b.f308a;
                ao fS = jjVar47.fS();
                jjVar48 = this.b.f308a;
                Duration mc = jjVar48.mc();
                jjVar49 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.ac.d(fVar4, tVar, fS, mc, jjVar49.fT());
            case 423:
                jjVar50 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.e.t((com.google.android.libraries.search.b.b) jj.hz(jjVar50).a());
            case 424:
                jjVar51 = this.b.f308a;
                cg cgVar3 = (cg) jj.kv(jjVar51).a();
                jrVar19 = this.f309a.b;
                long n = jrVar19.n();
                hVar33 = this.f309a.H;
                Executor executor2 = (Executor) hVar33.a();
                hVar34 = this.f309a.Q;
                ag agVar3 = (ag) hVar34.a();
                hVar35 = this.f309a.ez;
                return new com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.at(cgVar3, n, executor2, agVar3, (com.google.common.v.f) hVar35.a());
            case 425:
                ik ikVar9 = this.b;
                jo joVar8 = this.f309a;
                com.google.apps.tiktok.q.b.h e = com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.e.e();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar9.kf();
                hVar36 = joVar8.w;
                return com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.e.e.c(e, kf3, (com.google.android.libraries.storage.a.j) hVar36.a());
            case 426:
                return new lt(this);
            case 427:
                hVar37 = this.f309a.P;
                n nVar3 = (n) hVar37.a();
                jjVar52 = this.b.f308a;
                ct bZ = jjVar52.bZ();
                jjVar53 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.m mVar4 = (com.google.android.apps.search.googleapp.discover.z.m) jj.hs(jjVar53).a();
                jjVar54 = this.b.f308a;
                Optional md = jjVar54.md();
                jjVar55 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.z.g ca = jjVar55.ca();
                jjVar56 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.discover.ad.v(nVar3, bZ, mVar4, md, ca, jjVar56.cf());
            case 428:
                jjVar57 = this.b.f308a;
                com.google.android.apps.search.googleapp.discover.ad.v vVar = (com.google.android.apps.search.googleapp.discover.ad.v) jj.kV(jjVar57).a();
                com.google.android.apps.search.googleapp.discover.h.b.b(vVar);
                return vVar;
            case 429:
                hVar38 = this.f309a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar38.a();
                hVar39 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar39.a();
                hVar40 = this.f309a.H;
                cq cqVar = (cq) hVar40.a();
                jo joVar9 = this.f309a;
                return com.google.android.apps.search.googleapp.compliance.a.a.a.e(aVar4, extensionRegistryLite, cqVar, joVar9.mx(), joVar9.md(), com.google.android.apps.search.googleapp.compliance.a.a.a.c(), this.b.ye());
            case 430:
                hVar41 = this.f309a.f;
                Context context2 = (Context) hVar41.a();
                hVar42 = this.f309a.lj;
                return new com.google.android.apps.search.googleapp.silkpane.b.a(context2, (ExtensionRegistryLite) hVar42.a());
            case 431:
                return new com.google.android.apps.search.googleapp.notifications.b.b.ac(this.b.ye());
            case 432:
                ik ikVar10 = this.b;
                jo joVar10 = this.f309a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.googleapp.notifications.d.f.c();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar10.kf();
                hVar43 = joVar10.w;
                return com.google.android.apps.search.googleapp.notifications.d.f.b(c2, kf4, (com.google.android.libraries.storage.a.j) hVar43.a());
            case 433:
                ik ikVar11 = this.b;
                jo joVar11 = this.f309a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.apps.search.googleapp.notifications.accountsettings.e.c();
                com.google.apps.tiktok.account.d.b.f kf5 = ikVar11.kf();
                hVar44 = joVar11.w;
                return com.google.android.apps.search.googleapp.notifications.accountsettings.e.d(c3, kf5, (com.google.android.libraries.storage.a.j) hVar44.a());
            case 434:
                ik ikVar12 = this.b;
                jo joVar12 = this.f309a;
                com.google.apps.tiktok.account.d.u ye = ikVar12.ye();
                hVar45 = joVar12.W;
                return new com.google.android.apps.search.googleapp.notifications.b.b.z(ye, (com.google.android.libraries.search.t.i.y) hVar45.a());
            case 435:
                jjVar58 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.notifications.e.i((com.google.android.libraries.search.b.b) jj.hz(jjVar58).a());
            case 436:
                jjVar59 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.notifications.h.e(jjVar59.oW());
            case 437:
                int i2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.j.a;
                jjVar60 = this.b.f308a;
                aq rB = jjVar60.rB();
                jjVar61 = this.b.f308a;
                com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.a cK = jjVar61.cK();
                jjVar62 = this.b.f308a;
                com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.c cL = jjVar62.cL();
                jjVar63 = this.b.f308a;
                boolean oX = jjVar63.oX();
                jjVar64 = this.b.f308a;
                return new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.i(rB, cK, cL, oX, jjVar64.cM());
            case 438:
                jjVar65 = this.b.f308a;
                com.google.apps.tiktok.q.b.h hVar107 = (com.google.apps.tiktok.q.b.h) jj.jX(jjVar65).a();
                ik ikVar13 = this.b;
                jo joVar13 = this.f309a;
                com.google.apps.tiktok.account.d.b.f kf6 = ikVar13.kf();
                hVar46 = joVar13.w;
                return com.google.android.apps.search.googleapp.searchwidget.b.a.c(hVar107, kf6, (com.google.android.libraries.storage.a.j) hVar46.a());
            case 439:
                return com.google.android.apps.search.googleapp.searchwidget.b.a.e();
            case 440:
                hVar47 = this.f309a.f;
                Context context3 = (Context) hVar47.a();
                jjVar66 = this.b.f308a;
                com.google.android.libraries.lens.sdk.avs.a.i iVar = (com.google.android.libraries.lens.sdk.avs.a.i) jj.iz(jjVar66).a();
                jyVar = this.f309a.f319a;
                com.google.android.gms.common.v vVar2 = (com.google.android.gms.common.v) jy.lJ(jyVar).a();
                hVar48 = this.f309a.n;
                cq cqVar2 = (cq) hVar48.a();
                hVar49 = this.f309a.vz;
                Executor executor3 = (Executor) hVar49.a();
                jrVar20 = this.f309a.b;
                com.google.protos.l.a.e bp = jrVar20.bp();
                jjVar67 = this.b.f308a;
                Object mf = jjVar67.mf();
                jjVar68 = this.b.f308a;
                com.google.android.libraries.lens.sdk.avs.d.a.c cVar = (com.google.android.libraries.lens.sdk.avs.d.a.c) jj.gA(jjVar68).a();
                hVar50 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar2 = (com.google.apps.tiktok.account.data.a.d) hVar50.a();
                hVar51 = this.f309a.vD;
                com.google.android.libraries.lens.view.g.a aVar5 = (com.google.android.libraries.lens.view.g.a) hVar51.a();
                jrVar21 = this.f309a.b;
                com.google.android.libraries.lens.sdk.avs.data.a aVar6 = (com.google.android.libraries.lens.sdk.avs.data.a) jr.bG(jrVar21).a();
                jrVar22 = this.f309a.b;
                boolean booleanValue = ((Boolean) jr.cU(jrVar22).a()).booleanValue();
                jrVar23 = this.f309a.b;
                double doubleValue = ((Double) jr.dZ(jrVar23).a()).doubleValue();
                jjVar69 = this.b.f308a;
                boolean booleanValue2 = ((Boolean) jj.jv(jjVar69).a()).booleanValue();
                jjVar70 = this.b.f308a;
                return new com.google.android.libraries.lens.sdk.avs.au(context3, iVar, vVar2, cqVar2, executor3, bp, (com.google.android.libraries.lens.sdk.avs.d) mf, cVar, dVar2, aVar5, aVar6, booleanValue, doubleValue, booleanValue2, ((Boolean) jj.jt(jjVar70).a()).booleanValue());
            case 441:
                jjVar71 = this.b.f308a;
                com.google.android.libraries.lens.sdk.avs.a.h eh = jjVar71.eh();
                hVar52 = this.f309a.f;
                Context context4 = (Context) hVar52.a();
                jjVar72 = this.b.f308a;
                im imVar = (im) jj.gQ(jjVar72).a();
                hVar53 = this.f309a.g;
                return new com.google.android.libraries.lens.sdk.avs.a.i(eh, context4, imVar, (com.google.android.libraries.g.a) hVar53.a());
            case 442:
                hVar54 = this.f309a.f;
                Context context5 = (Context) hVar54.a();
                hVar55 = this.f309a.Y;
                String str = (String) hVar55.a();
                ik ikVar14 = this.b;
                jo joVar14 = this.f309a;
                com.google.android.libraries.search.b.l hE = ikVar14.hE();
                hVar56 = joVar14.bl;
                com.google.android.gms.clearcut.a.b bVar5 = (com.google.android.gms.clearcut.a.b) hVar56.a();
                ik ikVar15 = this.b;
                jo joVar15 = this.f309a;
                Map qY = ikVar15.qY();
                hVar57 = joVar15.bj;
                return new com.google.android.libraries.search.t.a.g(context5, str, hE, bVar5, qY);
            case 443:
                jjVar73 = this.b.f308a;
                boolean oZ = jjVar73.oZ();
                jjVar74 = this.b.f308a;
                return com.google.android.libraries.lens.view.shared.e.a.b(oZ, ((Boolean) jj.gj(jjVar74).a()).booleanValue());
            case 444:
                jjVar75 = this.b.f308a;
                boolean pa = jjVar75.pa();
                jjVar76 = this.b.f308a;
                boolean pb = jjVar76.pb();
                hVar58 = this.f309a.vE;
                return Boolean.valueOf(com.google.android.libraries.lens.view.shared.e.a.c(pa, pb, (com.google.android.libraries.lens.view.shared.e.c) hVar58.a()));
            case 445:
                jo joVar16 = this.f309a;
                ik ikVar16 = this.b;
                hVar59 = joVar16.f;
                jjVar77 = ikVar16.f308a;
                h kO = jj.kO(jjVar77);
                jjVar78 = this.b.f308a;
                h iN = jj.iN(jjVar78);
                jo joVar17 = this.f309a;
                ik ikVar17 = this.b;
                hVar60 = joVar17.wb;
                jjVar79 = ikVar17.f308a;
                h ic = jj.ic(jjVar79);
                jrVar24 = this.f309a.b;
                h en = jr.en(jrVar24);
                jjVar80 = this.b.f308a;
                h kP = jj.kP(jjVar80);
                jjVar81 = this.b.f308a;
                h jL = jj.jL(jjVar81);
                jjVar82 = this.b.f308a;
                h hY = jj.hY(jjVar82);
                jjVar83 = this.b.f308a;
                h hX = jj.hX(jjVar83);
                jjVar84 = this.b.f308a;
                h lL = jj.lL(jjVar84);
                jjVar85 = this.b.f308a;
                h ia = jj.ia(jjVar85);
                jjVar86 = this.b.f308a;
                h m118if = jj.m118if(jjVar86);
                jjVar87 = this.b.f308a;
                h lk = jj.lk(jjVar87);
                jjVar88 = this.b.f308a;
                h lj = jj.lj(jjVar88);
                jjVar89 = this.b.f308a;
                h gF = jj.gF(jjVar89);
                jjVar90 = this.b.f308a;
                h jZ = jj.jZ(jjVar90);
                jjVar91 = this.b.f308a;
                h jY = jj.jY(jjVar91);
                jjVar92 = this.b.f308a;
                h ke = jj.ke(jjVar92);
                jjVar93 = this.b.f308a;
                h jr = jj.jr(jjVar93);
                jjVar94 = this.b.f308a;
                h jJ = jj.jJ(jjVar94);
                jjVar95 = this.b.f308a;
                h jn = jj.jn(jjVar95);
                jjVar96 = this.b.f308a;
                h jG = jj.jG(jjVar96);
                jjVar97 = this.b.f308a;
                h jH = jj.jH(jjVar97);
                jjVar98 = this.b.f308a;
                h jf = jj.jf(jjVar98);
                jjVar99 = this.b.f308a;
                h kb = jj.kb(jjVar99);
                jjVar100 = this.b.f308a;
                return new com.google.android.libraries.search.lens.query.b.av(hVar59, kO, iN, hVar60, ic, en, kP, jL, hY, hX, lL, ia, m118if, lk, lj, gF, jZ, jY, ke, jr, jJ, jn, jG, jH, jf, kb, jj.hZ(jjVar100));
            case 446:
                jjVar101 = this.b.f308a;
                return new as((com.google.android.libraries.search.lens.query.b.z) jjVar101.mv());
            case 447:
                hVar61 = this.f309a.wb;
                return new com.google.android.libraries.lens.view.j.e((Executor) hVar61.a());
            case 448:
                hVar62 = this.f309a.f;
                Context context6 = (Context) hVar62.a();
                hVar63 = this.f309a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar63.a();
                hVar64 = this.f309a.vE;
                com.google.android.libraries.lens.view.shared.e.c cVar2 = (com.google.android.libraries.lens.view.shared.e.c) hVar64.a();
                jjVar102 = this.b.f308a;
                boolean booleanValue3 = ((Boolean) jj.gj(jjVar102).a()).booleanValue();
                jjVar103 = this.b.f308a;
                boolean pc = jjVar103.pc();
                jjVar104 = this.b.f308a;
                boolean pd = jjVar104.pd();
                jjVar105 = this.b.f308a;
                boolean pe = jjVar105.pe();
                jjVar106 = this.b.f308a;
                long v = jjVar106.v();
                jjVar107 = this.b.f308a;
                boolean pf = jjVar107.pf();
                jrVar25 = this.f309a.b;
                double b = jrVar25.b();
                jjVar108 = this.b.f308a;
                boolean booleanValue4 = ((Boolean) jj.jr(jjVar108).a()).booleanValue();
                jjVar109 = this.b.f308a;
                return new com.google.android.libraries.search.lens.query.b.ax(context6, aVar7, cVar2, booleanValue3, pc, pd, pe, v, pf, b, booleanValue4, jjVar109.pg());
            case 449:
                jjVar110 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.j(jjVar110.sg()));
            case 450:
                jrVar26 = this.f309a.b;
                boolean gf2 = jrVar26.gf();
                jjVar111 = this.b.f308a;
                h hW = jj.hW(jjVar111);
                jjVar112 = this.b.f308a;
                return com.google.android.libraries.lens.view.ai.q.c(gf2, hW, jj.jK(jjVar112));
            case 451:
                hVar65 = this.f309a.vz;
                e.a b2 = e.c.c.b(hVar65);
                jjVar113 = this.b.f308a;
                com.google.android.libraries.search.b.b bVar6 = (com.google.android.libraries.search.b.b) jj.jK(jjVar113).a();
                hVar66 = this.f309a.g;
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) hVar66.a();
                jrVar27 = this.f309a.b;
                return new com.google.android.libraries.lens.view.ai.l(b2, bVar6, aVar8, jrVar27.gg());
            case 452:
                hVar67 = this.b.J;
                return com.google.android.libraries.lens.view.ai.q.b((com.google.android.libraries.search.t.a.a) hVar67.a());
            case 453:
                hVar68 = this.f309a.f;
                Context context7 = (Context) hVar68.a();
                hVar69 = this.f309a.H;
                return com.google.android.libraries.lens.view.ai.q.d(context7, (cr) hVar69.a());
            case 454:
                jjVar114 = this.b.f308a;
                return com.google.android.libraries.lens.view.ap.w.i(jj.gd(jjVar114).a());
            case 455:
                jo joVar18 = this.f309a;
                ik ikVar18 = this.b;
                Object Wu = joVar18.Wu();
                jjVar115 = ikVar18.f308a;
                return com.google.android.libraries.lens.view.ap.w.c(Wu, (cg) jj.kw(jjVar115).a());
            case 456:
                ik ikVar19 = this.b;
                jo joVar19 = this.f309a;
                com.google.apps.tiktok.q.b.h b3 = com.google.android.libraries.lens.view.ap.w.b();
                com.google.apps.tiktok.account.d.b.f kf7 = ikVar19.kf();
                hVar70 = joVar19.w;
                return com.google.android.libraries.lens.view.ap.w.f(b3, kf7, (com.google.android.libraries.storage.a.j) hVar70.a());
            case 457:
                jjVar116 = this.b.f308a;
                return new com.google.android.libraries.search.lens.query.b.ay(jjVar116.ph());
            case 458:
                jjVar117 = this.b.f308a;
                e.a b4 = e.c.c.b(jj.gE(jjVar117));
                jjVar118 = this.b.f308a;
                e.a b5 = e.c.c.b(jj.gr(jjVar118));
                jjVar119 = this.b.f308a;
                com.google.android.libraries.search.lens.f.d.e eVar3 = (com.google.android.libraries.search.lens.f.d.e) jj.lJ(jjVar119).a();
                jjVar120 = this.b.f308a;
                com.google.android.libraries.search.v.n rs = jjVar120.rs();
                jjVar121 = this.b.f308a;
                com.google.android.libraries.search.v.a.h eR = jjVar121.eR();
                hVar71 = this.f309a.vC;
                Executor executor4 = (Executor) hVar71.a();
                jjVar122 = this.b.f308a;
                return new com.google.android.libraries.search.lens.query.b.m(b4, b5, eVar3, rs, eR, executor4, jjVar122.mF());
            case 459:
                hVar72 = this.f309a.f;
                Context context8 = (Context) hVar72.a();
                jjVar123 = this.b.f308a;
                com.google.android.libraries.lens.view.v.d dVar3 = (com.google.android.libraries.lens.view.v.d) jj.kQ(jjVar123).a();
                hVar73 = this.f309a.vC;
                return new com.google.android.libraries.lens.view.shared.f(context8, dVar3, (Executor) hVar73.a());
            case 460:
                jo joVar20 = this.f309a;
                ik ikVar20 = this.b;
                bv mJ = joVar20.mJ();
                bv kr = ikVar20.kr();
                hVar74 = joVar20.vC;
                return com.google.android.libraries.lens.view.v.e.b(mJ, kr, (Executor) hVar74.a());
            case 461:
                hVar75 = this.f309a.Y;
                String str2 = (String) hVar75.a();
                hVar76 = this.f309a.f;
                Context context9 = (Context) hVar76.a();
                jrVar28 = this.f309a.b;
                cg cgVar4 = (cg) jr.eh(jrVar28).a();
                hVar77 = this.f309a.Q;
                ag agVar4 = (ag) hVar77.a();
                jjVar124 = this.b.f308a;
                boolean pi = jjVar124.pi();
                jjVar125 = this.b.f308a;
                return new com.google.android.libraries.search.lens.f.d.e(str2, context9, cgVar4, agVar4, pi, jjVar125.pj());
            case 462:
                return new nz(this);
            case 463:
                jjVar126 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.d(jjVar126.rV()));
            case 464:
                jjVar127 = this.b.f308a;
                String mG = jjVar127.mG();
                jjVar128 = this.b.f308a;
                com.google.android.libraries.lens.view.ai.b bVar7 = (com.google.android.libraries.lens.view.ai.b) jj.hJ(jjVar128).a();
                jjVar129 = this.b.f308a;
                com.google.android.libraries.search.lens.f.c.f fVar5 = (com.google.android.libraries.search.lens.f.c.f) jj.lj(jjVar129).a();
                jjVar130 = this.b.f308a;
                String mM = jjVar130.mM();
                jjVar131 = this.b.f308a;
                boolean pw = jjVar131.pw();
                jjVar132 = this.b.f308a;
                boolean pB = jjVar132.pB();
                jjVar133 = this.b.f308a;
                return new com.google.android.libraries.search.lens.query.b.r(mG, bVar7, fVar5, mM, pw, pB, jjVar133.pC());
            case 465:
                jjVar134 = this.b.f308a;
                com.google.android.libraries.search.b.b bVar8 = (com.google.android.libraries.search.b.b) jj.jL(jjVar134).a();
                hVar78 = this.f309a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar78.a();
                jjVar135 = this.b.f308a;
                return new com.google.android.libraries.lens.view.ai.b(bVar8, aVar9, (com.google.android.libraries.lens.view.ai.ae) jj.kF(jjVar135).a());
            case 466:
                jjVar136 = this.b.f308a;
                return new com.google.android.libraries.lens.view.ai.ae(jjVar136.pk());
            case 467:
                jjVar137 = this.b.f308a;
                com.google.android.libraries.search.lens.f.c.g gVar = (com.google.android.libraries.search.lens.f.c.g) jj.lk(jjVar137).a();
                jjVar138 = this.b.f308a;
                com.google.android.libraries.lens.view.ai.p pVar = (com.google.android.libraries.lens.view.ai.p) jj.hY(jjVar138).a();
                hVar79 = this.f309a.bh;
                com.google.android.libraries.search.t.h.a aVar10 = (com.google.android.libraries.search.t.h.a) hVar79.a();
                jjVar139 = this.b.f308a;
                com.google.android.libraries.search.lens.f.c.d dVar4 = (com.google.android.libraries.search.lens.f.c.d) jj.gF(jjVar139).a();
                jjVar140 = this.b.f308a;
                boolean pr = jjVar140.pr();
                jjVar141 = this.b.f308a;
                boolean ps = jjVar141.ps();
                jrVar29 = this.f309a.b;
                String ff = jrVar29.ff();
                jjVar142 = this.b.f308a;
                boolean pt = jjVar142.pt();
                jjVar143 = this.b.f308a;
                boolean pu = jjVar143.pu();
                jjVar144 = this.b.f308a;
                boolean pv = jjVar144.pv();
                jjVar145 = this.b.f308a;
                boolean pw2 = jjVar145.pw();
                jjVar146 = this.b.f308a;
                String mJ2 = jjVar146.mJ();
                jjVar147 = this.b.f308a;
                String mK = jjVar147.mK();
                jjVar148 = this.b.f308a;
                String mL = jjVar148.mL();
                jjVar149 = this.b.f308a;
                boolean px = jjVar149.px();
                jjVar150 = this.b.f308a;
                boolean py = jjVar150.py();
                jjVar151 = this.b.f308a;
                boolean pz = jjVar151.pz();
                jjVar152 = this.b.f308a;
                boolean pA = jjVar152.pA();
                jjVar153 = this.b.f308a;
                jjVar153.pn();
                jjVar154 = this.b.f308a;
                jjVar154.po();
                jjVar155 = this.b.f308a;
                jjVar155.pp();
                jjVar156 = this.b.f308a;
                jjVar156.pq();
                jjVar157 = this.b.f308a;
                return new com.google.android.libraries.search.lens.f.c.f(gVar, pVar, aVar10, dVar4, pr, ps, ff, pt, pu, pv, pw2, mJ2, mK, mL, px, py, pz, pA, ((Boolean) jj.jf(jjVar157).a()).booleanValue());
            case 468:
                jjVar158 = this.b.f308a;
                com.google.android.libraries.search.ap.b.b bVar9 = (com.google.android.libraries.search.ap.b.b) jj.hC(jjVar158).a();
                jjVar159 = this.b.f308a;
                String mH = jjVar159.mH();
                jjVar160 = this.b.f308a;
                String mI = jjVar160.mI();
                jjVar161 = this.b.f308a;
                boolean pl = jjVar161.pl();
                jjVar162 = this.b.f308a;
                boolean pm = jjVar162.pm();
                hVar80 = this.f309a.g;
                return new com.google.android.libraries.search.lens.f.c.g(bVar9, mH, mI, pl, pm, (com.google.android.libraries.g.a) hVar80.a());
            case 469:
                jjVar163 = this.b.f308a;
                com.google.android.libraries.search.aj.b.a.i fs = jjVar163.fs();
                hVar81 = this.f309a.f;
                Context context10 = (Context) hVar81.a();
                hVar82 = this.f309a.Q;
                ag agVar5 = (ag) hVar82.a();
                hVar83 = this.f309a.vC;
                Executor executor5 = (Executor) hVar83.a();
                jjVar164 = this.b.f308a;
                boolean pn = jjVar164.pn();
                jjVar165 = this.b.f308a;
                boolean po = jjVar165.po();
                jjVar166 = this.b.f308a;
                boolean pp = jjVar166.pp();
                jjVar167 = this.b.f308a;
                return new com.google.android.libraries.search.lens.f.c.d(fs, context10, agVar5, executor5, pn, po, pp, jjVar167.pq());
            case 470:
                jjVar168 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.b(jjVar168.rV()));
            case 471:
                jjVar169 = this.b.f308a;
                return Long.valueOf(h.a.a.u.b.a.c.n(jjVar169.sg()));
            case 472:
                jjVar170 = this.b.f308a;
                return h.a.a.u.b.a.c.m(jjVar170.sg());
            case 473:
                jjVar171 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.o(jjVar171.sg()));
            case 474:
                jjVar172 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.f(jjVar172.rV()));
            case 475:
                jjVar173 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.c(jjVar173.rV()));
            case 476:
                jjVar174 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.e(jjVar174.rV()));
            case 477:
                jjVar175 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.g(jjVar175.rV()));
            case 478:
                jjVar176 = this.b.f308a;
                return new com.google.android.libraries.search.lens.query.b.t(jj.jP(jjVar176));
            case 479:
                jjVar177 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.l(jjVar177.sg()));
            case 480:
                jjVar178 = this.b.f308a;
                com.google.aw.g.a.a.am fG = jjVar178.fG();
                jjVar179 = this.b.f308a;
                com.google.frameworks.client.data.android.d.f fC = jjVar179.fC();
                jjVar180 = this.b.f308a;
                return com.google.android.libraries.lens.view.ag.w.b(fG, fC, jjVar180.mb());
            case 481:
                jrVar30 = this.f309a.b;
                return new com.google.android.libraries.lens.view.shared.at((com.google.android.libraries.lens.view.shared.as) jr.co(jrVar30).a());
            case 482:
                jjVar181 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.k(jjVar181.sg()));
            case 483:
                jjVar182 = this.b.f308a;
                return new com.google.android.libraries.lens.sdk.avs.d.a.c((com.google.android.libraries.lens.sdk.avs.d.a.a.b) jj.ix(jjVar182).a());
            case 484:
                jrVar31 = this.f309a.b;
                boolean gh = jrVar31.gh();
                jrVar32 = this.f309a.b;
                boolean gi = jrVar32.gi();
                jrVar33 = this.f309a.b;
                double c4 = jrVar33.c();
                jjVar183 = this.b.f308a;
                boolean pD = jjVar183.pD();
                jjVar184 = this.b.f308a;
                boolean pE = jjVar184.pE();
                jjVar185 = this.b.f308a;
                boolean pF = jjVar185.pF();
                jjVar186 = this.b.f308a;
                double g = jjVar186.g();
                jjVar187 = this.b.f308a;
                boolean pG = jjVar187.pG();
                jjVar188 = this.b.f308a;
                boolean pH = jjVar188.pH();
                jjVar189 = this.b.f308a;
                double h = jjVar189.h();
                jjVar190 = this.b.f308a;
                double i3 = jjVar190.i();
                jjVar191 = this.b.f308a;
                double b6 = jjVar191.b();
                jjVar192 = this.b.f308a;
                return new com.google.android.libraries.lens.sdk.avs.d.a.a.b(gh, gi, c4, pD, pE, pF, g, pG, pH, h, i3, b6, jjVar192.c());
            case 485:
                jjVar193 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.h(jjVar193.sb()));
            case 486:
                jjVar194 = this.b.f308a;
                return Boolean.valueOf(h.a.a.w.b.a.e.b(jjVar194.sd()));
            case 487:
                return new nz(this);
            case 488:
                jo joVar21 = this.f309a;
                ik ikVar21 = this.b;
                hVar84 = joVar21.f;
                hVar85 = joVar21.n;
                hVar86 = joVar21.H;
                jjVar195 = ikVar21.f308a;
                h jC = jj.jC(jjVar195);
                jjVar196 = this.b.f308a;
                h iG = jj.iG(jjVar196);
                jyVar2 = this.f309a.f319a;
                h mz = jy.mz(jyVar2);
                jo joVar22 = this.f309a;
                hVar87 = joVar22.bN;
                jyVar3 = joVar22.f319a;
                return new com.google.android.apps.search.soundsearch.h.h(hVar84, hVar85, hVar86, jC, iG, mz, hVar87, jy.na(jyVar3));
            case 489:
                ik ikVar22 = this.b;
                jo joVar23 = this.f309a;
                hVar88 = ikVar22.V;
                jyVar4 = joVar23.f319a;
                com.google.apps.tiktok.p.m mVar5 = (com.google.apps.tiktok.p.m) jy.lK(jyVar4).a();
                hVar89 = this.f309a.mh;
                com.google.apps.tiktok.p.u uVar2 = (com.google.apps.tiktok.p.u) hVar89.a();
                hVar90 = this.f309a.mb;
                return com.google.android.apps.search.soundsearch.j.b.c.b(hVar88, mVar5, uVar2, (com.google.frameworks.client.data.android.d) hVar90.a(), at.i());
            case 490:
                hVar91 = this.b.g;
                return Optional.of((AccountId) hVar91.a());
            case 491:
                jyVar5 = this.f309a.f319a;
                h nh = jy.nh(jyVar5);
                jo joVar24 = this.f309a;
                hVar92 = joVar24.H;
                hVar93 = joVar24.n;
                return new com.google.android.apps.search.soundsearch.a.f(nh, hVar92, hVar93);
            case 492:
                hVar94 = this.f309a.Q;
                ag agVar6 = (ag) hVar94.a();
                jjVar197 = this.b.f308a;
                com.google.android.libraries.search.assistant.invocation.s.a.a.p pVar2 = (com.google.android.libraries.search.assistant.invocation.s.a.a.p) jj.gS(jjVar197).a();
                jrVar34 = this.f309a.b;
                ao be = jrVar34.be();
                hVar95 = this.f309a.ez;
                return new com.google.android.apps.search.omnient.host.b.u(agVar6, pVar2, be, (com.google.common.v.f) hVar95.a());
            case 493:
                hVar96 = this.f309a.fn;
                com.google.android.libraries.search.assistant.invocation.s.b.a aVar11 = (com.google.android.libraries.search.assistant.invocation.s.b.a) hVar96.a();
                jrVar35 = this.f309a.b;
                lt ltVar = (lt) jr.bT(jrVar35).a();
                jrVar36 = this.f309a.b;
                return new com.google.android.libraries.search.assistant.invocation.s.a.a.p(aVar11, ltVar, jrVar36.aA());
            case 494:
                ik ikVar23 = this.b;
                jo joVar25 = this.f309a;
                com.google.apps.tiktok.q.b.h c5 = com.google.android.apps.search.omnient.c.y.c();
                com.google.apps.tiktok.account.d.b.f kf8 = ikVar23.kf();
                hVar97 = joVar25.w;
                return com.google.android.apps.search.omnient.c.y.b(c5, kf8, (com.google.android.libraries.storage.a.j) hVar97.a());
            case 495:
                jjVar198 = this.b.f308a;
                cg cgVar5 = (cg) jj.kx(jjVar198).a();
                hVar98 = this.f309a.g;
                com.google.android.libraries.g.a aVar12 = (com.google.android.libraries.g.a) hVar98.a();
                hVar99 = this.f309a.H;
                Executor executor6 = (Executor) hVar99.a();
                jjVar199 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.e eVar4 = (com.google.android.apps.search.podcasts.h.e) jj.iY(jjVar199).a();
                jjVar200 = this.b.f308a;
                com.google.android.apps.search.podcasts.util.b.b dw = jjVar200.dw();
                hVar100 = this.f309a.iu;
                ay ayVar = (ay) hVar100.a();
                jrVar37 = this.f309a.b;
                com.google.android.apps.search.podcasts.l.u uVar3 = (com.google.android.apps.search.podcasts.l.u) jr.et(jrVar37).a();
                jrVar38 = this.f309a.b;
                boolean gj = jrVar38.gj();
                jjVar201 = this.b.f308a;
                return new com.google.android.apps.search.podcasts.l.ae(cgVar5, aVar12, executor6, eVar4, dw, ayVar, uVar3, gj, jjVar201.pI());
            case 496:
                jjVar202 = this.b.f308a;
                com.google.apps.tiktok.q.b.h hVar108 = (com.google.apps.tiktok.q.b.h) jj.jS(jjVar202).a();
                ik ikVar24 = this.b;
                jo joVar26 = this.f309a;
                com.google.apps.tiktok.account.d.b.f kf9 = ikVar24.kf();
                hVar101 = joVar26.w;
                return com.google.android.apps.search.podcasts.l.t.d(hVar108, kf9, (com.google.android.libraries.storage.a.j) hVar101.a());
            case 497:
                return com.google.android.apps.search.podcasts.l.t.e();
            case 498:
                jjVar203 = this.b.f308a;
                com.google.aw.j.a.au auVar = (com.google.aw.j.a.au) jj.jD(jjVar203).a();
                hVar102 = this.b.X;
                jjVar204 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.a dk = jjVar204.dk();
                jjVar205 = this.b.f308a;
                return new com.google.android.apps.search.podcasts.h.e(auVar, dk, jjVar205.rE());
            case 499:
                ik ikVar25 = this.b;
                jo joVar27 = this.f309a;
                hVar103 = ikVar25.V;
                jrVar39 = joVar27.b;
                com.google.apps.tiktok.p.m mVar6 = (com.google.apps.tiktok.p.m) jr.dz(jrVar39).a();
                hVar104 = this.f309a.mh;
                com.google.apps.tiktok.p.u uVar4 = (com.google.apps.tiktok.p.u) hVar104.a();
                hVar105 = this.f309a.mb;
                return com.google.android.apps.search.podcasts.h.b.b(hVar103, mVar6, uVar4, (com.google.frameworks.client.data.android.d) hVar105.a(), at.i());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        h hVar;
        h hVar2;
        jj jjVar;
        h hVar3;
        jj jjVar2;
        jj jjVar3;
        jj jjVar4;
        jj jjVar5;
        h hVar4;
        jr jrVar;
        jr jrVar2;
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
        jj jjVar6;
        jj jjVar7;
        jr jrVar3;
        h hVar16;
        jj jjVar8;
        h hVar17;
        h hVar18;
        h hVar19;
        jj jjVar9;
        jr jrVar4;
        h hVar20;
        jj jjVar10;
        jj jjVar11;
        jr jrVar5;
        jr jrVar6;
        jr jrVar7;
        h hVar21;
        h hVar22;
        h hVar23;
        jj jjVar12;
        jj jjVar13;
        jr jrVar8;
        jj jjVar14;
        jr jrVar9;
        jj jjVar15;
        h hVar24;
        h hVar25;
        h hVar26;
        jj jjVar16;
        jj jjVar17;
        h hVar27;
        jj jjVar18;
        jj jjVar19;
        jj jjVar20;
        jj jjVar21;
        jj jjVar22;
        jj jjVar23;
        jj jjVar24;
        jj jjVar25;
        jr jrVar10;
        jj jjVar26;
        jr jrVar11;
        jr jrVar12;
        jr jrVar13;
        jr jrVar14;
        jy jyVar;
        jr jrVar15;
        h hVar28;
        h hVar29;
        h hVar30;
        jj jjVar27;
        jr jrVar16;
        h hVar31;
        h hVar32;
        h hVar33;
        h hVar34;
        jj jjVar28;
        jj jjVar29;
        jr jrVar17;
        h hVar35;
        jj jjVar30;
        jj jjVar31;
        h hVar36;
        jj jjVar32;
        jj jjVar33;
        jj jjVar34;
        jr jrVar18;
        h hVar37;
        jy jyVar2;
        h hVar38;
        h hVar39;
        h hVar40;
        h hVar41;
        jj jjVar35;
        jj jjVar36;
        jr jrVar19;
        jr jrVar20;
        h hVar42;
        jj jjVar37;
        jr jrVar21;
        jj jjVar38;
        jr jrVar22;
        jr jrVar23;
        h hVar43;
        h hVar44;
        jr jrVar24;
        jj jjVar39;
        jj jjVar40;
        h hVar45;
        jj jjVar41;
        jj jjVar42;
        h hVar46;
        jj jjVar43;
        jj jjVar44;
        h hVar47;
        h hVar48;
        h hVar49;
        h hVar50;
        h hVar51;
        h hVar52;
        jj jjVar45;
        h hVar53;
        jj jjVar46;
        jj jjVar47;
        jj jjVar48;
        h hVar54;
        h hVar55;
        h hVar56;
        h hVar57;
        h hVar58;
        jr jrVar25;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        jj jjVar49;
        jj jjVar50;
        h hVar65;
        jj jjVar51;
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
        jj jjVar52;
        jj jjVar53;
        h hVar77;
        h hVar78;
        h hVar79;
        jj jjVar54;
        h hVar80;
        jj jjVar55;
        h hVar81;
        h hVar82;
        h hVar83;
        jj jjVar56;
        h hVar84;
        h hVar85;
        h hVar86;
        h hVar87;
        h hVar88;
        h hVar89;
        jj jjVar57;
        h hVar90;
        jr jrVar26;
        jj jjVar58;
        jr jrVar27;
        jj jjVar59;
        jj jjVar60;
        jr jrVar28;
        jj jjVar61;
        jj jjVar62;
        h hVar91;
        jj jjVar63;
        h hVar92;
        h hVar93;
        h hVar94;
        jr jrVar29;
        jr jrVar30;
        jr jrVar31;
        jj jjVar64;
        h hVar95;
        h hVar96;
        h hVar97;
        h hVar98;
        jr jrVar32;
        h hVar99;
        h hVar100;
        h hVar101;
        h hVar102;
        jr jrVar33;
        h hVar103;
        h hVar104;
        jr jrVar34;
        h hVar105;
        h hVar106;
        jr jrVar35;
        jr jrVar36;
        jr jrVar37;
        jj jjVar65;
        h hVar107;
        h hVar108;
        h hVar109;
        h hVar110;
        h hVar111;
        h hVar112;
        jj jjVar66;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        h hVar117;
        h hVar118;
        h hVar119;
        h hVar120;
        h hVar121;
        jj jjVar67;
        jj jjVar68;
        h hVar122;
        h hVar123;
        h hVar124;
        h hVar125;
        jr jrVar38;
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
        jr jrVar39;
        jj jjVar69;
        h hVar136;
        jy jyVar3;
        jj jjVar70;
        jr jrVar40;
        h hVar137;
        h hVar138;
        h hVar139;
        h hVar140;
        h hVar141;
        jr jrVar41;
        jr jrVar42;
        jr jrVar43;
        jr jrVar44;
        jr jrVar45;
        h hVar142;
        jj jjVar71;
        jj jjVar72;
        jj jjVar73;
        jj jjVar74;
        h hVar143;
        jj jjVar75;
        h hVar144;
        h hVar145;
        h hVar146;
        h hVar147;
        h hVar148;
        h hVar149;
        jr jrVar46;
        jr jrVar47;
        h hVar150;
        jr jrVar48;
        jr jrVar49;
        jr jrVar50;
        jr jrVar51;
        jr jrVar52;
        h hVar151;
        jr jrVar53;
        h hVar152;
        h hVar153;
        h hVar154;
        h hVar155;
        h hVar156;
        jr jrVar54;
        jr jrVar55;
        jj jjVar76;
        jj jjVar77;
        h hVar157;
        jr jrVar56;
        h hVar158;
        h hVar159;
        h hVar160;
        jj jjVar78;
        h hVar161;
        jj jjVar79;
        h hVar162;
        h hVar163;
        h hVar164;
        h hVar165;
        jj jjVar80;
        h hVar166;
        h hVar167;
        h hVar168;
        jj jjVar81;
        jj jjVar82;
        jj jjVar83;
        jj jjVar84;
        jj jjVar85;
        jj jjVar86;
        h hVar169;
        h hVar170;
        jj jjVar87;
        h hVar171;
        h hVar172;
        jj jjVar88;
        h hVar173;
        jj jjVar89;
        h hVar174;
        h hVar175;
        h hVar176;
        jj jjVar90;
        h hVar177;
        jj jjVar91;
        jj jjVar92;
        h hVar178;
        h hVar179;
        h hVar180;
        jj jjVar93;
        jr jrVar57;
        h hVar181;
        jj jjVar94;
        jj jjVar95;
        jj jjVar96;
        h hVar182;
        jj jjVar97;
        h hVar183;
        h hVar184;
        h hVar185;
        jj jjVar98;
        jj jjVar99;
        jj jjVar100;
        jj jjVar101;
        jj jjVar102;
        jj jjVar103;
        jj jjVar104;
        h hVar186;
        jj jjVar105;
        jj jjVar106;
        jj jjVar107;
        jj jjVar108;
        jj jjVar109;
        jj jjVar110;
        jj jjVar111;
        jj jjVar112;
        h hVar187;
        jj jjVar113;
        jj jjVar114;
        jj jjVar115;
        jj jjVar116;
        h hVar188;
        jj jjVar117;
        h hVar189;
        jj jjVar118;
        jj jjVar119;
        jj jjVar120;
        h hVar190;
        jr jrVar58;
        h hVar191;
        jy jyVar4;
        jj jjVar121;
        jj jjVar122;
        jj jjVar123;
        jr jrVar59;
        h hVar192;
        jj jjVar124;
        jj jjVar125;
        jj jjVar126;
        h hVar193;
        jj jjVar127;
        jj jjVar128;
        jj jjVar129;
        jj jjVar130;
        jj jjVar131;
        jj jjVar132;
        h hVar194;
        h hVar195;
        jj jjVar133;
        jj jjVar134;
        jj jjVar135;
        jj jjVar136;
        jj jjVar137;
        jj jjVar138;
        h hVar196;
        h hVar197;
        h hVar198;
        jj jjVar139;
        jj jjVar140;
        jj jjVar141;
        jj jjVar142;
        h hVar199;
        h hVar200;
        jj jjVar143;
        h hVar201;
        h hVar202;
        h hVar203;
        h hVar204;
        jj jjVar144;
        h hVar205;
        h hVar206;
        h hVar207;
        jj jjVar145;
        jj jjVar146;
        jj jjVar147;
        jj jjVar148;
        jj jjVar149;
        jj jjVar150;
        jj jjVar151;
        jj jjVar152;
        jj jjVar153;
        h hVar208;
        h hVar209;
        h hVar210;
        h hVar211;
        jj jjVar154;
        h hVar212;
        h hVar213;
        h hVar214;
        h hVar215;
        h hVar216;
        h hVar217;
        h hVar218;
        h hVar219;
        h hVar220;
        jj jjVar155;
        jj jjVar156;
        jj jjVar157;
        jj jjVar158;
        h hVar221;
        h hVar222;
        jj jjVar159;
        h hVar223;
        h hVar224;
        h hVar225;
        h hVar226;
        jr jrVar60;
        h hVar227;
        h hVar228;
        h hVar229;
        jj jjVar160;
        jj jjVar161;
        h hVar230;
        jj jjVar162;
        jj jjVar163;
        h hVar231;
        jj jjVar164;
        jj jjVar165;
        h hVar232;
        jj jjVar166;
        jj jjVar167;
        h hVar233;
        jj jjVar168;
        h hVar234;
        h hVar235;
        h hVar236;
        jj jjVar169;
        jj jjVar170;
        jj jjVar171;
        h hVar237;
        h hVar238;
        jj jjVar172;
        h hVar239;
        jj jjVar173;
        jj jjVar174;
        h hVar240;
        int i = this.c;
        switch (i) {
            case 500:
                hVar = this.f309a.H;
                Executor executor = (Executor) hVar.a();
                hVar2 = this.f309a.wN;
                ConnectivityManager connectivityManager = (ConnectivityManager) hVar2.a();
                jjVar = this.b.f308a;
                com.google.android.apps.search.podcasts.n.g ds = jjVar.ds();
                hVar3 = this.f309a.g;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) hVar3.a();
                jjVar2 = this.b.f308a;
                com.google.android.apps.search.podcasts.a.b di = jjVar2.di();
                jjVar3 = this.b.f308a;
                ah ahVar = (ah) jj.hc(jjVar3).a();
                jjVar4 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.g.u uVar = (com.google.android.apps.search.podcasts.b.g.u) jj.hn(jjVar4).a();
                jjVar5 = this.b.f308a;
                com.google.android.apps.search.podcasts.l.ae aeVar = (com.google.android.apps.search.podcasts.l.ae) jj.ly(jjVar5).a();
                hVar4 = this.f309a.uY;
                TelephonyManager telephonyManager = (TelephonyManager) hVar4.a();
                jrVar = this.f309a.b;
                com.google.protos.l.a.b bk = jrVar.bk();
                jrVar2 = this.f309a.b;
                return new com.google.android.apps.search.podcasts.autodownload.f(executor, connectivityManager, ds, aVar, di, ahVar, uVar, aeVar, telephonyManager, bk, jrVar2.gk());
            case 501:
                hVar5 = this.f309a.g;
                return new com.google.android.apps.search.podcasts.b.a.i((com.google.android.libraries.g.a) hVar5.a(), this.b.ye());
            case 502:
                hVar6 = this.f309a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar6.a();
                hVar7 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar7.a();
                hVar8 = this.f309a.H;
                cq cqVar = (cq) hVar8.a();
                jo joVar = this.f309a;
                return com.google.android.apps.search.podcasts.n.h.j(aVar2, extensionRegistryLite, cqVar, joVar.mx(), joVar.md(), com.google.android.apps.search.podcasts.n.h.d(), this.b.ye());
            case 503:
                hVar9 = this.f309a.g;
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) hVar9.a();
                hVar10 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite2 = (ExtensionRegistryLite) hVar10.a();
                hVar11 = this.f309a.H;
                cq cqVar2 = (cq) hVar11.a();
                jo joVar2 = this.f309a;
                return com.google.android.apps.search.podcasts.n.h.h(aVar3, extensionRegistryLite2, cqVar2, joVar2.mx(), joVar2.md(), com.google.android.apps.search.podcasts.n.h.c(), this.b.ye());
            case 504:
                hVar12 = this.f309a.g;
                com.google.android.libraries.g.a aVar4 = (com.google.android.libraries.g.a) hVar12.a();
                hVar13 = this.f309a.lj;
                ExtensionRegistryLite extensionRegistryLite3 = (ExtensionRegistryLite) hVar13.a();
                hVar14 = this.f309a.H;
                cq cqVar3 = (cq) hVar14.a();
                jo joVar3 = this.f309a;
                return com.google.android.apps.search.podcasts.n.h.i(aVar4, extensionRegistryLite3, cqVar3, joVar3.mx(), joVar3.md(), com.google.android.apps.search.podcasts.n.h.b(), this.b.ye());
            case 505:
                hVar15 = this.f309a.H;
                Executor executor2 = (Executor) hVar15.a();
                jjVar6 = this.b.f308a;
                com.google.android.apps.search.podcasts.util.b.b dw = jjVar6.dw();
                jjVar7 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.e eVar = (com.google.android.apps.search.podcasts.h.e) jj.iY(jjVar7).a();
                jrVar3 = this.f309a.b;
                com.google.android.apps.search.podcasts.b.d.d ab = jrVar3.ab();
                hVar16 = this.f309a.iu;
                ay ayVar = (ay) hVar16.a();
                jjVar8 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.a.l dj = jjVar8.dj();
                com.google.android.apps.search.podcasts.b.f.a aVar5 = new com.google.android.apps.search.podcasts.b.f.a();
                hVar17 = this.f309a.g;
                return new com.google.android.apps.search.podcasts.b.f.r(executor2, dw, eVar, ab, ayVar, dj, aVar5, (com.google.android.libraries.g.a) hVar17.a());
            case 506:
                hVar18 = this.f309a.H;
                Executor executor3 = (Executor) hVar18.a();
                hVar19 = this.f309a.iu;
                ay ayVar2 = (ay) hVar19.a();
                jjVar9 = this.b.f308a;
                com.google.android.apps.search.podcasts.util.b.b dw2 = jjVar9.dw();
                jrVar4 = this.f309a.b;
                com.google.android.apps.search.podcasts.b.d.d ab2 = jrVar4.ab();
                hVar20 = this.f309a.g;
                com.google.android.libraries.g.a aVar6 = (com.google.android.libraries.g.a) hVar20.a();
                jjVar10 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.e eVar2 = (com.google.android.apps.search.podcasts.h.e) jj.iY(jjVar10).a();
                jjVar11 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.a.i iVar = (com.google.android.apps.search.podcasts.b.a.i) jj.ha(jjVar11).a();
                jrVar5 = this.f309a.b;
                at k = at.k((com.google.android.apps.search.podcasts.k.a.a) jr.cn(jrVar5).a());
                jrVar6 = this.f309a.b;
                return new com.google.android.apps.search.podcasts.b.g.u(executor3, ayVar2, dw2, ab2, aVar6, eVar2, iVar, k, jrVar6.gl());
            case 507:
                jrVar7 = this.f309a.b;
                com.google.android.apps.search.podcasts.p.f fVar = (com.google.android.apps.search.podcasts.p.f) jr.cr(jrVar7).a();
                hVar21 = this.f309a.f;
                Context context = (Context) hVar21.a();
                hVar22 = this.f309a.iu;
                ay ayVar3 = (ay) hVar22.a();
                hVar23 = this.b.q;
                dj djVar = (dj) hVar23.a();
                jjVar12 = this.b.f308a;
                h jB = jj.jB(jjVar12);
                jjVar13 = this.b.f308a;
                Optional of = Optional.of(jj.jR(jjVar13));
                jrVar8 = this.f309a.b;
                com.google.android.apps.search.podcasts.player.impl.ab abVar = (com.google.android.apps.search.podcasts.player.impl.ab) jr.cq(jrVar8).a();
                jjVar14 = this.b.f308a;
                com.google.android.apps.search.podcasts.player.impl.ah rD = jjVar14.rD();
                jrVar9 = this.f309a.b;
                Optional of2 = Optional.of(e.c.c.b(jr.bJ(jrVar9)));
                jjVar15 = this.b.f308a;
                com.google.android.apps.search.podcasts.player.b.c m119do = jjVar15.m119do();
                hVar24 = this.f309a.H;
                cr crVar = (cr) hVar24.a();
                hVar25 = this.f309a.B;
                cr crVar2 = (cr) hVar25.a();
                hVar26 = this.f309a.g;
                com.google.android.libraries.g.a aVar7 = (com.google.android.libraries.g.a) hVar26.a();
                jjVar16 = this.b.f308a;
                e.a b = e.c.c.b(jj.jb(jjVar16));
                jjVar17 = this.b.f308a;
                e.a b2 = e.c.c.b(jj.hc(jjVar17));
                hVar27 = this.f309a.B;
                Executor executor4 = (Executor) hVar27.a();
                jjVar18 = this.b.f308a;
                com.google.android.apps.search.podcasts.player.c.f dr = jjVar18.dr();
                jjVar19 = this.b.f308a;
                com.google.android.apps.search.podcasts.player.a.g dn = jjVar19.dn();
                jjVar20 = this.b.f308a;
                com.google.apps.tiktok.tracing.contrib.e.n rK = jjVar20.rK();
                jjVar21 = this.b.f308a;
                com.google.android.apps.search.podcasts.l.ae aeVar2 = (com.google.android.apps.search.podcasts.l.ae) jj.ly(jjVar21).a();
                jjVar22 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.g.u uVar2 = (com.google.android.apps.search.podcasts.b.g.u) jj.hn(jjVar22).a();
                jjVar23 = this.b.f308a;
                com.google.android.apps.search.podcasts.player.impl.ag dq = jjVar23.dq();
                jjVar24 = this.b.f308a;
                com.google.android.apps.search.podcasts.player.impl.aa dp = jjVar24.dp();
                jjVar25 = this.b.f308a;
                com.google.android.apps.search.podcasts.j.e dm = jjVar25.dm();
                jrVar10 = this.f309a.b;
                boolean gr = jrVar10.gr();
                jjVar26 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.c.b bVar = (com.google.android.apps.search.podcasts.b.c.b) jj.ip(jjVar26).a();
                jrVar11 = this.f309a.b;
                boolean gs = jrVar11.gs();
                jrVar12 = this.f309a.b;
                boolean gq = jrVar12.gq();
                jrVar13 = this.f309a.b;
                boolean gt = jrVar13.gt();
                jrVar14 = this.f309a.b;
                com.google.android.apps.search.podcasts.player.impl.b bVar2 = (com.google.android.apps.search.podcasts.player.impl.b) jr.cj(jrVar14).a();
                jyVar = this.f309a.f319a;
                boolean qP = jyVar.qP();
                jrVar15 = this.f309a.b;
                return new com.google.android.apps.search.podcasts.player.impl.x(fVar, context, ayVar3, djVar, jB, of, abVar, rD, of2, m119do, crVar, crVar2, aVar7, b, b2, executor4, dr, dn, rK, aeVar2, uVar2, dq, dp, dm, gr, bVar, gs, gq, gt, bVar2, qP, jrVar15.gu());
            case 508:
                hVar28 = this.f309a.f;
                Context context2 = (Context) hVar28.a();
                hVar29 = this.f309a.H;
                Executor executor5 = (Executor) hVar29.a();
                hVar30 = this.f309a.Y;
                String str = (String) hVar30.a();
                jjVar27 = this.b.f308a;
                com.google.android.apps.search.podcasts.util.a dv = jjVar27.dv();
                jrVar16 = this.f309a.b;
                return com.google.android.apps.search.podcasts.player.a.b(context2, executor5, str, dv, jrVar16.gm());
            case 509:
                hVar31 = this.f309a.f;
                return com.google.android.apps.search.podcasts.player.b.a.b((Context) hVar31.a());
            case 510:
                hVar32 = this.f309a.f;
                hVar33 = this.f309a.H;
                Executor executor6 = (Executor) hVar33.a();
                hVar34 = this.f309a.iu;
                ay ayVar4 = (ay) hVar34.a();
                jjVar28 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.a.l dj2 = jjVar28.dj();
                jjVar29 = this.b.f308a;
                com.google.android.apps.search.podcasts.util.b.b dw3 = jjVar29.dw();
                jrVar17 = this.f309a.b;
                com.google.android.apps.search.podcasts.b.d.d ab3 = jrVar17.ab();
                hVar35 = this.f309a.g;
                com.google.android.libraries.g.a aVar8 = (com.google.android.libraries.g.a) hVar35.a();
                jjVar30 = this.b.f308a;
                return new com.google.android.apps.search.podcasts.b.e.t(executor6, ayVar4, dj2, dw3, ab3, aVar8, (com.google.android.apps.search.podcasts.h.h) jj.lQ(jjVar30).a(), this.f309a.j());
            case 511:
                jjVar31 = this.b.f308a;
                com.google.aw.h.b.a.d fH = jjVar31.fH();
                hVar36 = this.b.X;
                jjVar32 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.a dk = jjVar32.dk();
                jjVar33 = this.b.f308a;
                com.google.android.apps.search.podcasts.p.f rE = jjVar33.rE();
                jjVar34 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.e dl = jjVar34.dl();
                jrVar18 = this.f309a.b;
                return new com.google.android.apps.search.podcasts.h.h(fH, dk, rE, dl, jrVar18.gn());
            case 512:
                hVar37 = this.f309a.f;
                Context context3 = (Context) hVar37.a();
                jyVar2 = this.f309a.f319a;
                com.google.frameworks.client.data.android.l lVar = (com.google.frameworks.client.data.android.l) jy.lN(jyVar2).a();
                hVar38 = this.f309a.H;
                cr crVar3 = (cr) hVar38.a();
                hVar39 = this.f309a.v;
                cr crVar4 = (cr) hVar39.a();
                hVar40 = this.f309a.g;
                com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) hVar40.a();
                hVar41 = this.f309a.iu;
                ay ayVar5 = (ay) hVar41.a();
                jjVar35 = this.b.f308a;
                com.google.android.apps.search.podcasts.l.ae aeVar3 = (com.google.android.apps.search.podcasts.l.ae) jj.ly(jjVar35).a();
                jjVar36 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.e.t tVar = (com.google.android.apps.search.podcasts.b.e.t) jj.jb(jjVar36).a();
                jrVar19 = this.f309a.b;
                com.google.android.apps.search.podcasts.b.d.f fVar2 = (com.google.android.apps.search.podcasts.b.d.f) jr.cV(jrVar19).a();
                jrVar20 = this.f309a.b;
                com.google.android.apps.search.podcasts.p.f fVar3 = (com.google.android.apps.search.podcasts.p.f) jr.cr(jrVar20).a();
                hVar42 = this.f309a.Y;
                String str2 = (String) hVar42.a();
                jjVar37 = this.b.f308a;
                com.google.android.apps.search.podcasts.util.a dv2 = jjVar37.dv();
                jrVar21 = this.f309a.b;
                boolean gm = jrVar21.gm();
                jjVar38 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.c.b bVar3 = (com.google.android.apps.search.podcasts.b.c.b) jj.ip(jjVar38).a();
                jrVar22 = this.f309a.b;
                jrVar23 = this.f309a.b;
                boolean go = jrVar23.go();
                hVar43 = this.f309a.wH;
                return new ah(context3, lVar, crVar3, crVar4, aVar9, ayVar5, aeVar3, tVar, fVar2, fVar3, str2, dv2, gm, bVar3, go, (com.google.android.libraries.search.trust.c.t) hVar43.a());
            case 513:
                hVar44 = this.f309a.iu;
                ay ayVar6 = (ay) hVar44.a();
                jrVar24 = this.f309a.b;
                return new com.google.android.apps.search.podcasts.b.c.b(ayVar6, jrVar24.gm());
            case 514:
                jjVar39 = this.b.f308a;
                com.google.android.apps.search.podcasts.b.a.i iVar2 = (com.google.android.apps.search.podcasts.b.a.i) jj.ha(jjVar39).a();
                jjVar40 = this.b.f308a;
                return new com.google.android.apps.search.podcasts.n.o(iVar2, jjVar40.di(), (byte[]) null);
            case 515:
                return com.google.android.apps.search.podcasts.j.c.b(this.b.jt());
            case 516:
                hVar45 = this.f309a.H;
                Executor executor7 = (Executor) hVar45.a();
                jjVar41 = this.b.f308a;
                cg cgVar = (cg) jj.ky(jjVar41).a();
                jjVar42 = this.b.f308a;
                com.google.android.apps.search.podcasts.h.e eVar3 = (com.google.android.apps.search.podcasts.h.e) jj.iY(jjVar42).a();
                hVar46 = this.f309a.g;
                com.google.android.libraries.g.a aVar10 = (com.google.android.libraries.g.a) hVar46.a();
                jjVar43 = this.b.f308a;
                return new com.google.android.apps.search.podcasts.o.l(executor7, cgVar, eVar3, aVar10, jjVar43.dw());
            case 517:
                jjVar44 = this.b.f308a;
                com.google.apps.tiktok.q.b.h hVar241 = (com.google.apps.tiktok.q.b.h) jj.jU(jjVar44).a();
                ik ikVar = this.b;
                jo joVar4 = this.f309a;
                com.google.apps.tiktok.account.d.b.f kf = ikVar.kf();
                hVar47 = joVar4.w;
                return com.google.android.apps.search.podcasts.o.v.c(hVar241, kf, (com.google.android.libraries.storage.a.j) hVar47.a());
            case 518:
                return com.google.android.apps.search.podcasts.o.v.b();
            case 519:
                hVar48 = this.b.J;
                return new com.google.android.apps.search.soundsearch.g.a.a.a((com.google.android.libraries.search.t.a.a) hVar48.a());
            case 520:
                hVar49 = this.b.J;
                return new com.google.android.apps.search.soundsearch.g.a.a.b((com.google.android.libraries.search.t.a.a) hVar49.a());
            case 521:
                hVar50 = this.b.g;
                AccountId accountId = (AccountId) hVar50.a();
                hVar51 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar51.a();
                hVar52 = this.f309a.ma;
                com.google.frameworks.client.data.android.a.d dVar2 = (com.google.frameworks.client.data.android.a.d) hVar52.a();
                jjVar45 = this.b.f308a;
                com.google.android.libraries.assistant.speakerid.a.s sVar = (com.google.android.libraries.assistant.speakerid.a.s) jj.la(jjVar45).a();
                hVar53 = this.f309a.mk;
                com.google.android.libraries.assistant.speakerid.a.r rVar = (com.google.android.libraries.assistant.speakerid.a.r) hVar53.a();
                jjVar46 = this.b.f308a;
                com.google.android.libraries.search.ah.i.c fp = jjVar46.fp();
                jjVar47 = this.b.f308a;
                com.google.android.libraries.search.ah.d.b bVar4 = (com.google.android.libraries.search.ah.d.b) jj.gZ(jjVar47).a();
                jjVar48 = this.b.f308a;
                com.google.android.libraries.search.ah.i.a.b bVar5 = (com.google.android.libraries.search.ah.i.a.b) jj.hF(jjVar48).a();
                hVar54 = this.f309a.vx;
                com.google.android.libraries.search.ai.i iVar3 = (com.google.android.libraries.search.ai.i) hVar54.a();
                hVar55 = this.b.Z;
                com.google.android.apps.search.assistant.platform.g.k.a.d dVar3 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar55.a();
                hVar56 = this.f309a.bo;
                ag agVar = (ag) hVar56.a();
                hVar57 = this.f309a.Q;
                ag agVar2 = (ag) hVar57.a();
                hVar58 = this.f309a.iu;
                ay ayVar7 = (ay) hVar58.a();
                jo joVar5 = this.f309a;
                com.google.android.apps.gsa.speech.settingsui.hotword.a.e dq2 = joVar5.dq();
                Optional empty = Optional.empty();
                jrVar25 = joVar5.b;
                com.google.android.libraries.search.b.b ax = jrVar25.ax();
                jo joVar6 = this.f309a;
                return new com.google.android.apps.search.speechenroll.pages.combinedconsent.k(accountId, dVar, dVar2, sVar, rVar, fp, bVar4, bVar5, iVar3, dVar3, agVar, agVar2, ayVar7, dq2, empty, ax, joVar6.abB(), joVar6.abC());
            case 522:
                hVar59 = this.f309a.f;
                Context context4 = (Context) hVar59.a();
                hVar60 = this.f309a.gV;
                com.google.android.apps.gsa.speech.o.g gVar = (com.google.android.apps.gsa.speech.o.g) hVar60.a();
                jo joVar7 = this.f309a;
                hVar61 = joVar7.hP;
                hVar62 = joVar7.as;
                com.google.android.libraries.storage.a.j jVar = (com.google.android.libraries.storage.a.j) hVar62.a();
                hVar63 = this.f309a.mm;
                com.google.android.apps.gsa.speech.e.c.t tVar2 = (com.google.android.apps.gsa.speech.e.c.t) hVar63.a();
                hVar64 = this.f309a.gq;
                com.google.android.apps.gsa.search.core.h.p pVar = (com.google.android.apps.gsa.search.core.h.p) hVar64.a();
                jjVar49 = this.b.f308a;
                com.google.android.libraries.search.ah.d.b bVar6 = (com.google.android.libraries.search.ah.d.b) jj.gZ(jjVar49).a();
                jo joVar8 = this.f309a;
                ik ikVar2 = this.b;
                boolean abB = joVar8.abB();
                jjVar50 = ikVar2.f308a;
                com.google.android.libraries.search.ah.i.a.b bVar7 = (com.google.android.libraries.search.ah.i.a.b) jj.hF(jjVar50).a();
                hVar65 = this.f309a.H;
                return new com.google.android.apps.gsa.speech.hotword.enrollmentutils.f(context4, gVar, hVar61, jVar, tVar2, pVar, bVar6, abB, bVar7, (Executor) hVar65.a());
            case 523:
                jjVar51 = this.b.f308a;
                com.google.android.libraries.search.ah.i.c fp2 = jjVar51.fp();
                hVar66 = this.f309a.gV;
                com.google.android.apps.gsa.speech.o.g gVar2 = (com.google.android.apps.gsa.speech.o.g) hVar66.a();
                jo joVar9 = this.f309a;
                boolean abA = joVar9.abA();
                hVar67 = joVar9.bo;
                return new com.google.android.libraries.search.ah.d.b(fp2, gVar2, abA, (ag) hVar67.a());
            case 524:
                jo joVar10 = this.f309a;
                ik ikVar3 = this.b;
                hVar68 = joVar10.mp;
                hVar69 = ikVar3.dd;
                hVar70 = joVar10.hQ;
                hVar71 = joVar10.Y;
                hVar72 = joVar10.H;
                hVar73 = joVar10.Q;
                hVar74 = joVar10.v;
                hVar75 = joVar10.bo;
                return new dc(hVar68, hVar69, hVar70, hVar71, hVar72, hVar73, hVar74, hVar75);
            case 525:
                hVar76 = this.f309a.H;
                Executor executor8 = (Executor) hVar76.a();
                jjVar52 = this.b.f308a;
                return new com.google.android.libraries.search.ah.i.a.b(executor8, jjVar52.fp());
            case 526:
                jjVar53 = this.b.f308a;
                cg cgVar2 = (cg) jj.kz(jjVar53).a();
                hVar77 = this.f309a.P;
                n nVar = (n) hVar77.a();
                hVar78 = this.f309a.H;
                Executor executor9 = (Executor) hVar78.a();
                hVar79 = this.f309a.f;
                Context context5 = (Context) hVar79.a();
                jjVar54 = this.b.f308a;
                com.google.android.apps.search.widgets.stocks.a.a.a dx = jjVar54.dx();
                hVar80 = this.f309a.ez;
                com.google.common.v.f fVar4 = (com.google.common.v.f) hVar80.a();
                jjVar55 = this.b.f308a;
                return new com.google.android.apps.search.widgets.stocks.a.u(cgVar2, nVar, executor9, context5, dx, fVar4, jjVar55.dy());
            case 527:
                ik ikVar4 = this.b;
                jo joVar11 = this.f309a;
                com.google.apps.tiktok.q.b.h c = com.google.android.apps.search.widgets.stocks.a.y.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar4.kf();
                hVar81 = joVar11.w;
                return com.google.android.apps.search.widgets.stocks.a.y.b(c, kf2, (com.google.android.libraries.storage.a.j) hVar81.a());
            case 528:
                hVar82 = this.b.X;
                return com.google.android.apps.search.widgets.stocks.a.a.b.b((com.google.apps.tiktok.p.b.c) hVar82.a());
            case 529:
                hVar83 = this.b.X;
                return com.google.android.apps.search.widgets.weather.b.b.b.b((com.google.apps.tiktok.p.b.c) hVar83.a());
            case 530:
                jjVar56 = this.b.f308a;
                com.google.apps.tiktok.q.b.h hVar242 = (com.google.apps.tiktok.q.b.h) jj.kf(jjVar56).a();
                ik ikVar5 = this.b;
                jo joVar12 = this.f309a;
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar5.kf();
                hVar84 = joVar12.w;
                return com.google.android.apps.search.widgets.weather.b.a.b.c(hVar242, kf3, (com.google.android.libraries.storage.a.j) hVar84.a());
            case 531:
                return com.google.android.apps.search.widgets.weather.b.a.b.b();
            case 532:
                hVar85 = this.f309a.H;
                Executor executor10 = (Executor) hVar85.a();
                hVar86 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar3 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar86.a();
                jo joVar13 = this.f309a;
                mg mgVar = new mg(joVar13, this.b);
                hVar87 = joVar13.wr;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ah(executor10, gVar3, mgVar, (com.google.cj.i.f) hVar87.a());
            case 533:
                hVar88 = this.f309a.H;
                Executor executor11 = (Executor) hVar88.a();
                hVar89 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar4 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar89.a();
                jjVar57 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ae(executor11, gVar4, (com.google.android.libraries.assistant.auto.tng.suggestions.m.a) jj.lw(jjVar57).a(), 2);
            case 534:
                hVar90 = this.f309a.g;
                com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) hVar90.a();
                jrVar26 = this.f309a.b;
                e.a b3 = e.c.c.b(jr.eB(jrVar26));
                jjVar58 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.b.a ef = jjVar58.ef();
                jrVar27 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar4 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar27).a();
                jjVar59 = this.b.f308a;
                e.a b4 = e.c.c.b(jj.ja(jjVar59));
                jjVar60 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a aVar12 = (com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a) jj.lv(jjVar60).a();
                jrVar28 = this.f309a.b;
                e.a b5 = e.c.c.b(jr.bP(jrVar28));
                jjVar61 = this.b.f308a;
                e.a b6 = e.c.c.b(jj.kc(jjVar61));
                jjVar62 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.b.g ed = jjVar62.ed();
                hVar91 = this.b.aJ;
                e.a b7 = e.c.c.b(hVar91);
                jjVar63 = this.b.f308a;
                i iVar4 = (i) jj.lx(jjVar63).a();
                ik ikVar6 = this.b;
                jo joVar14 = this.f309a;
                hVar92 = ikVar6.aI;
                hVar93 = joVar14.v;
                Executor executor12 = (Executor) hVar93.a();
                hVar94 = this.f309a.H;
                Executor executor13 = (Executor) hVar94.a();
                jrVar29 = this.f309a.b;
                h dS = jr.dS(jrVar29);
                jrVar30 = this.f309a.b;
                h dx2 = jr.dx(jrVar30);
                jrVar31 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.m.a.v(aVar11, b3, ef, eVar4, b4, aVar12, b5, b6, ed, b7, iVar4, hVar92, executor12, executor13, dS, dx2, jr.dw(jrVar31));
            case 535:
                jjVar64 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a aVar13 = (com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a) jj.lv(jjVar64).a();
                hVar95 = this.b.aA;
                com.google.android.libraries.assistant.auto.tng.common.a.f fVar5 = (com.google.android.libraries.assistant.auto.tng.common.a.f) hVar95.a();
                hVar96 = this.b.g;
                AccountId accountId2 = (AccountId) hVar96.a();
                hVar97 = this.b.aG;
                com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar5 = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar97.a();
                hVar98 = this.f309a.v;
                Executor executor14 = (Executor) hVar98.a();
                jrVar32 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.h.b.a.d(aVar13, fVar5, accountId2, gVar5, executor14, (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar32).a());
            case 536:
                hVar99 = this.f309a.v;
                cr crVar5 = (cr) hVar99.a();
                hVar100 = this.f309a.H;
                Executor executor15 = (Executor) hVar100.a();
                hVar101 = this.b.cl;
                com.google.android.libraries.assistant.pcp.h.e eVar5 = (com.google.android.libraries.assistant.pcp.h.e) hVar101.a();
                hVar102 = this.b.cm;
                com.google.android.libraries.assistant.pcp.b bVar8 = (com.google.android.libraries.assistant.pcp.b) hVar102.a();
                jrVar33 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar6 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar33).a();
                hVar103 = this.f309a.g;
                com.google.android.libraries.g.a aVar14 = (com.google.android.libraries.g.a) hVar103.a();
                hVar104 = this.f309a.ez;
                com.google.common.v.f fVar6 = (com.google.common.v.f) hVar104.a();
                jrVar34 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.g(crVar5, executor15, eVar5, bVar8, eVar6, aVar14, fVar6, jr.dT(jrVar34));
            case 537:
                hVar105 = this.f309a.ez;
                com.google.common.v.f fVar7 = (com.google.common.v.f) hVar105.a();
                hVar106 = this.f309a.v;
                cr crVar6 = (cr) hVar106.a();
                jrVar35 = this.f309a.b;
                h dx3 = jr.dx(jrVar35);
                jrVar36 = this.f309a.b;
                h dU = jr.dU(jrVar36);
                jrVar37 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar7 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jr.eA(jrVar37).a();
                jjVar65 = this.b.f308a;
                return com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.a.b(fVar7, crVar6, dx3, dU, eVar7, jjVar65.ee());
            case 538:
                hVar107 = this.b.J;
                return com.google.android.libraries.assistant.auto.tng.suggestions.g.b.a.b((com.google.android.libraries.search.t.a.a) hVar107.a());
            case 539:
                hVar108 = this.b.g;
                AccountId accountId3 = (AccountId) hVar108.a();
                hVar109 = this.f309a.H;
                Executor executor16 = (Executor) hVar109.a();
                hVar110 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar6 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar110.a();
                hVar111 = this.f309a.vU;
                com.google.android.libraries.search.l.b.f fVar8 = (com.google.android.libraries.search.l.b.f) hVar111.a();
                hVar112 = this.b.P;
                com.google.android.libraries.search.l.p pVar2 = (com.google.android.libraries.search.l.p) hVar112.a();
                jjVar66 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.al(accountId3, executor16, gVar6, fVar8, pVar2, jj.lD(jjVar66));
            case 540:
                hVar113 = this.f309a.ez;
                com.google.common.v.f fVar9 = (com.google.common.v.f) hVar113.a();
                hVar114 = this.f309a.f;
                Context context6 = (Context) hVar114.a();
                hVar115 = this.f309a.v;
                Executor executor17 = (Executor) hVar115.a();
                hVar116 = this.f309a.H;
                Executor executor18 = (Executor) hVar116.a();
                hVar117 = this.b.aa;
                com.google.apps.tiktok.g.p pVar3 = (com.google.apps.tiktok.g.p) hVar117.a();
                ik ikVar7 = this.b;
                jo joVar15 = this.f309a;
                boolean uB = ikVar7.uB();
                hVar118 = joVar15.kF;
                com.google.br.f.e.a.a.h hVar243 = (com.google.br.f.e.a.a.h) hVar118.a();
                hVar119 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar119.a();
                hVar120 = this.b.g;
                AccountId accountId4 = (AccountId) hVar120.a();
                hVar121 = this.f309a.g;
                com.google.android.libraries.g.a aVar15 = (com.google.android.libraries.g.a) hVar121.a();
                jjVar67 = this.b.f308a;
                boolean pJ = jjVar67.pJ();
                jjVar68 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.az.c.au(fVar9, context6, executor17, executor18, pVar3, uB, hVar243, dVar4, accountId4, aVar15, pJ, jjVar68.pK());
            case 541:
                hVar122 = this.f309a.H;
                Executor executor19 = (Executor) hVar122.a();
                hVar123 = this.f309a.v;
                Executor executor20 = (Executor) hVar123.a();
                hVar124 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar7 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar124.a();
                hVar125 = this.b.aG;
                com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar8 = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar125.a();
                jrVar38 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ai(executor19, executor20, gVar7, gVar8, (com.google.android.libraries.search.assistant.aw.n.b.j) jr.eC(jrVar38).a(), 1);
            case 542:
                return Boolean.valueOf(h.a.a.b.b.a.c.o(this.b.yA()));
            case 543:
                hVar126 = this.b.aG;
                com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar9 = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar126.a();
                hVar127 = this.f309a.H;
                Executor executor21 = (Executor) hVar127.a();
                hVar128 = this.f309a.v;
                Executor executor22 = (Executor) hVar128.a();
                hVar129 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar10 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar129.a();
                hVar130 = this.b.eq;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ai(gVar9, executor21, executor22, gVar10, (com.google.android.libraries.search.assistant.az.a.b.a.b.b.a.j) hVar130.a(), 0);
            case 544:
                hVar131 = this.f309a.H;
                Executor executor23 = (Executor) hVar131.a();
                hVar132 = this.b.ea;
                com.google.android.libraries.search.assistant.ad.f fVar10 = (com.google.android.libraries.search.assistant.ad.f) hVar132.a();
                hVar133 = this.b.ax;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ae(executor23, fVar10, (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar133.a(), 0);
            case 545:
                hVar134 = this.f309a.H;
                Executor executor24 = (Executor) hVar134.a();
                hVar135 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar11 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar135.a();
                jrVar39 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ae(executor24, gVar11, (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.f) jr.bI(jrVar39).a(), 1);
            case 546:
                jjVar69 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.m.a aVar16 = (com.google.android.libraries.assistant.auto.tng.suggestions.m.a) jj.lw(jjVar69).a();
                jo joVar16 = this.f309a;
                com.google.android.libraries.assistant.pcp.q.a.ag iu = joVar16.iu();
                hVar136 = joVar16.f9do;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l lVar2 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l) hVar136.a();
                jyVar3 = this.f309a.f319a;
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n nVar2 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n) jy.fF(jyVar3).a();
                jjVar70 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.j.a.b bVar9 = (com.google.android.libraries.assistant.auto.tng.suggestions.j.a.b) jj.id(jjVar70).a();
                jrVar40 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.c.c.a.c cVar = (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.c.a.c) jr.ck(jrVar40).a();
                hVar137 = this.b.in;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a.b bVar10 = (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a.b) hVar137.a();
                hVar138 = this.b.ip;
                com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.a.f fVar11 = (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.a.f) hVar138.a();
                hVar139 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar12 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar139.a();
                hVar140 = this.f309a.v;
                Executor executor25 = (Executor) hVar140.a();
                hVar141 = this.f309a.H;
                Executor executor26 = (Executor) hVar141.a();
                jrVar41 = this.f309a.b;
                h cL = jr.cL(jrVar41);
                jrVar42 = this.f309a.b;
                h cR = jr.cR(jrVar42);
                jrVar43 = this.f309a.b;
                h cS = jr.cS(jrVar43);
                jrVar44 = this.f309a.b;
                h cN = jr.cN(jrVar44);
                jrVar45 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.j.s(aVar16, iu, lVar2, nVar2, bVar9, cVar, bVar10, fVar11, gVar12, executor25, executor26, cL, cR, cS, cN, jr.ea(jrVar45));
            case 547:
                hVar142 = this.f309a.oQ;
                com.google.android.libraries.assistant.pcp.q.a.ah ahVar2 = (com.google.android.libraries.assistant.pcp.q.a.ah) hVar142.a();
                jjVar71 = this.b.f308a;
                i iVar5 = (i) jj.lx(jjVar71).a();
                jjVar72 = this.b.f308a;
                Object a2 = jj.hy(jjVar72).a();
                jjVar73 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.a eg = jjVar73.eg();
                jjVar74 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.ac acVar = (com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.ac) jj.io(jjVar74).a();
                hVar143 = this.f309a.om;
                com.google.android.libraries.assistant.pcp.q.a.k kVar = (com.google.android.libraries.assistant.pcp.q.a.k) hVar143.a();
                jjVar75 = this.b.f308a;
                Object a3 = jj.in(jjVar75).a();
                jo joVar17 = this.f309a;
                ik ikVar8 = this.b;
                com.google.android.libraries.assistant.pcp.q.o iq = joVar17.iq();
                hVar144 = ikVar8.aI;
                com.google.android.libraries.assistant.auto.tng.w.e.a.b bVar11 = (com.google.android.libraries.assistant.auto.tng.w.e.a.b) hVar144.a();
                hVar145 = this.f309a.W;
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) hVar145.a();
                hVar146 = this.f309a.g;
                com.google.android.libraries.g.a aVar17 = (com.google.android.libraries.g.a) hVar146.a();
                hVar147 = this.f309a.v;
                Executor executor27 = (Executor) hVar147.a();
                hVar148 = this.f309a.H;
                Executor executor28 = (Executor) hVar148.a();
                hVar149 = this.f309a.v;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar149.a();
                jrVar46 = this.f309a.b;
                h cO = jr.cO(jrVar46);
                jrVar47 = this.f309a.b;
                h cQ = jr.cQ(jrVar47);
                jo joVar18 = this.f309a;
                hVar150 = joVar18.oS;
                jrVar48 = joVar18.b;
                h cM = jr.cM(jrVar48);
                jrVar49 = this.f309a.b;
                h cC = jr.cC(jrVar49);
                jrVar50 = this.f309a.b;
                h cP = jr.cP(jrVar50);
                jrVar51 = this.f309a.b;
                h dP = jr.dP(jrVar51);
                jrVar52 = this.f309a.b;
                return com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.r.b(ahVar2, iVar5, a2, eg, acVar, kVar, a3, iq, bVar11, yVar, aVar17, executor27, executor28, scheduledExecutorService, cO, cQ, hVar150, cM, cC, cP, dP, jr.cX(jrVar52));
            case 548:
                hVar151 = this.f309a.g;
                com.google.android.libraries.g.a aVar18 = (com.google.android.libraries.g.a) hVar151.a();
                jrVar53 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.b(aVar18, jr.dR(jrVar53));
            case 549:
                hVar152 = this.b.aH;
                com.google.android.libraries.assistant.auto.tng.media.a.e.k kVar2 = (com.google.android.libraries.assistant.auto.tng.media.a.e.k) hVar152.a();
                hVar153 = this.f309a.f;
                Context context7 = (Context) hVar153.a();
                hVar154 = this.f309a.bz;
                com.google.apps.tiktok.concurrent.ao aoVar = (com.google.apps.tiktok.concurrent.ao) hVar154.a();
                hVar155 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.ac(kVar2, context7, aoVar, (cq) hVar155.a());
            case 550:
                hVar156 = this.f309a.ez;
                com.google.common.v.f fVar12 = (com.google.common.v.f) hVar156.a();
                jrVar54 = this.f309a.b;
                h cH = jr.cH(jrVar54);
                jrVar55 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.j.a.a.z(fVar12, cH, jr.dP(jrVar55));
            case 551:
                jjVar76 = this.b.f308a;
                return com.google.android.libraries.assistant.auto.tng.actionscache.storage.l.b((ResponseCacheDatabase) jj.jW(jjVar76).a());
            case 552:
                jjVar77 = this.b.f308a;
                return com.google.android.libraries.assistant.auto.tng.actionscache.storage.l.d((com.google.apps.tiktok.q.c.h) jj.jV(jjVar77).a(), this.b.kh());
            case 553:
                return com.google.android.libraries.assistant.auto.tng.actionscache.storage.l.c();
            case 554:
                hVar157 = this.f309a.f;
                return new com.google.android.libraries.assistant.auto.tng.actionscache.b.b((Context) hVar157.a(), Optional.empty());
            case 555:
                jrVar56 = this.f309a.b;
                com.google.apps.tiktok.h.a.h hVar244 = (com.google.apps.tiktok.h.a.h) jr.bX(jrVar56).a();
                hVar158 = this.f309a.wq;
                return fu.n("fluid_action_debug_data_provider", hVar244, "task_graphs", (com.google.apps.tiktok.h.a.h) hVar158.a());
            case 556:
                hVar159 = this.b.g;
                return new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.f((AccountId) hVar159.a());
            case 557:
                hVar160 = this.b.X;
                return com.google.android.libraries.assistant.auto.tng.z.a.a.a.a.b();
            case 558:
                jjVar78 = this.b.f308a;
                com.google.protos.az.a.c fZ = jjVar78.fZ();
                hVar161 = this.b.X;
                return com.google.android.libraries.p.a.d.k.b(fZ, (com.google.apps.tiktok.p.b.c) hVar161.a());
            case 559:
                return new nz(this);
            case 560:
                jjVar79 = this.b.f308a;
                return Boolean.valueOf(h.a.a.u.b.a.c.i(jjVar79.sg()));
            case 561:
                hVar162 = this.b.g;
                AccountId accountId5 = (AccountId) hVar162.a();
                hVar163 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar12 = (com.google.apps.tiktok.account.data.b) hVar163.a();
                hVar164 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar5 = (com.google.apps.tiktok.account.data.a.d) hVar164.a();
                hVar165 = this.f309a.Q;
                return com.google.android.libraries.search.assistant.s.f.b(accountId5, bVar12, dVar5, (ag) hVar165.a());
            case 562:
                jjVar80 = this.b.f308a;
                com.google.android.libraries.search.assistant.invocation.g.a.a.f eu = jjVar80.eu();
                hVar166 = this.f309a.sO;
                com.google.android.libraries.search.assistant.invocation.g.a.a.s sVar2 = (com.google.android.libraries.search.assistant.invocation.g.a.a.s) hVar166.a();
                hVar167 = this.f309a.Q;
                ag agVar3 = (ag) hVar167.a();
                hVar168 = this.f309a.eC;
                return new com.google.android.libraries.search.assistant.invocation.g.a.h(eu, sVar2, agVar3, (com.google.android.libraries.search.assistant.invocation.j.a.q) hVar168.a());
            case 563:
                jjVar81 = this.b.f308a;
                h kW = jj.kW(jjVar81);
                jjVar82 = this.b.f308a;
                return new bx(kW, (lt) jj.hj(jjVar82).a());
            case 564:
                ik ikVar9 = this.b;
                gy l = ha.l(4);
                jjVar83 = ikVar9.f308a;
                l.j(jjVar83.na());
                jjVar84 = this.b.f308a;
                l.h((com.google.android.libraries.search.assistant.invocation.p.l) jj.hH(jjVar84).a());
                jjVar85 = this.b.f308a;
                l.h((com.google.android.libraries.search.assistant.invocation.p.l) jj.lM(jjVar85).a());
                jjVar86 = this.b.f308a;
                l.h((com.google.android.libraries.search.assistant.invocation.p.l) jj.lO(jjVar86).a());
                return l.g();
            case 565:
                hVar169 = this.f309a.f;
                Context context8 = (Context) hVar169.a();
                hVar170 = this.f309a.bo;
                ag agVar4 = (ag) hVar170.a();
                jjVar87 = this.b.f308a;
                boolean pL = jjVar87.pL();
                hVar171 = this.f309a.abJ;
                return new com.google.android.libraries.search.assistant.incallservice.d(context8, agVar4, pL, (com.google.android.libraries.search.assistant.incallservice.ac) hVar171.a());
            case 566:
                hVar172 = this.b.ai;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ap apVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ap) hVar172.a();
                jjVar88 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.b bVar13 = (com.google.android.apps.search.assistant.surfaces.voice.i.g.b) jj.ig(jjVar88).a();
                hVar173 = this.b.cV;
                com.google.android.apps.search.assistant.surfaces.voice.e.i.b bVar14 = (com.google.android.apps.search.assistant.surfaces.voice.e.i.b) hVar173.a();
                jjVar89 = this.b.f308a;
                Optional of3 = Optional.of(jjVar89.as());
                hVar174 = this.f309a.Q;
                ag agVar5 = (ag) hVar174.a();
                hVar175 = this.f309a.bo;
                ag agVar6 = (ag) hVar175.a();
                hVar176 = this.b.ba;
                com.google.android.libraries.search.b.b bVar15 = (com.google.android.libraries.search.b.b) hVar176.a();
                jjVar90 = this.b.f308a;
                bn bnVar = (bn) jj.lC(jjVar90).a();
                hVar177 = this.b.ki;
                com.google.android.apps.search.assistant.surfaces.voice.i.e.g gVar13 = (com.google.android.apps.search.assistant.surfaces.voice.i.e.g) hVar177.a();
                ik ikVar10 = this.b;
                Optional empty2 = Optional.empty();
                jjVar91 = ikVar10.f308a;
                boolean qB = jjVar91.qB();
                jjVar92 = this.b.f308a;
                com.google.android.libraries.search.assistant.ab.d dVar6 = (com.google.android.libraries.search.assistant.ab.d) jj.gh(jjVar92).a();
                hVar178 = this.f309a.f;
                Context context9 = (Context) hVar178.a();
                hVar179 = this.f309a.W;
                com.google.android.libraries.search.t.i.y yVar2 = (com.google.android.libraries.search.t.i.y) hVar179.a();
                hVar180 = this.f309a.Y;
                String str3 = (String) hVar180.a();
                jjVar93 = this.b.f308a;
                boolean qC = jjVar93.qC();
                jrVar57 = this.f309a.b;
                com.google.apps.tiktok.contrib.work.a aVar19 = (com.google.apps.tiktok.contrib.work.a) jr.bB(jrVar57).a();
                hVar181 = this.b.g;
                AccountId accountId6 = (AccountId) hVar181.a();
                jjVar94 = this.b.f308a;
                boolean qD = jjVar94.qD();
                jjVar95 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.robin.t.j aN = jjVar95.aN();
                jjVar96 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.e.t(apVar, bVar13, bVar14, of3, agVar5, agVar6, bVar15, bnVar, gVar13, empty2, qB, dVar6, context9, yVar2, str3, qC, aVar19, accountId6, qD, aN, jjVar96.fV());
            case 567:
                hVar182 = this.f309a.f;
                Context context10 = (Context) hVar182.a();
                jjVar97 = this.b.f308a;
                boolean pM = jjVar97.pM();
                hVar183 = this.f309a.Q;
                ag agVar7 = (ag) hVar183.a();
                hVar184 = this.f309a.P;
                n nVar3 = (n) hVar184.a();
                hVar185 = this.f309a.bo;
                ag agVar8 = (ag) hVar185.a();
                jjVar98 = this.b.f308a;
                com.google.android.libraries.search.assistant.invocation.u.a.c cVar2 = (com.google.android.libraries.search.assistant.invocation.u.a.c) jj.lp(jjVar98).a();
                jjVar99 = this.b.f308a;
                nz nzVar = (nz) jj.hh(jjVar99).a();
                jjVar100 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.h.a.i iVar6 = (com.google.android.apps.search.assistant.surfaces.voice.h.a.i) jj.hS(jjVar100).a();
                jjVar101 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.a.a.e eVar8 = (com.google.android.apps.search.assistant.surfaces.voice.a.a.e) jj.hT(jjVar101).a();
                jjVar102 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.c.t Y = jjVar102.Y();
                jjVar103 = this.b.f308a;
                cf ab4 = jjVar103.ab();
                jjVar104 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.d.l lVar3 = (com.google.android.apps.search.assistant.surfaces.voice.i.d.l) jj.hQ(jjVar104).a();
                hVar186 = this.f309a.aco;
                com.google.android.apps.search.assistant.surfaces.voice.i.f.b.d dVar7 = (com.google.android.apps.search.assistant.surfaces.voice.i.f.b.d) hVar186.a();
                jjVar105 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.c.bp aa = jjVar105.aa();
                jjVar106 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.c.aa Z = jjVar106.Z();
                jjVar107 = this.b.f308a;
                boolean qk = jjVar107.qk();
                jjVar108 = this.b.f308a;
                be beVar = (be) jj.hP(jjVar108).a();
                jjVar109 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.g gVar14 = (com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.g) jj.ld(jjVar109).a();
                jjVar110 = this.b.f308a;
                bn bnVar2 = (bn) jj.lC(jjVar110).a();
                jjVar111 = this.b.f308a;
                com.google.android.libraries.search.assistant.an.c cVar3 = (com.google.android.libraries.search.assistant.an.c) jj.gu(jjVar111).a();
                jjVar112 = this.b.f308a;
                boolean ql = jjVar112.ql();
                hVar187 = this.f309a.uZ;
                e.a b8 = e.c.c.b(hVar187);
                jjVar113 = this.b.f308a;
                boolean qm = jjVar113.qm();
                jjVar114 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.c.b au = jjVar114.au();
                jjVar115 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.i.f af = jjVar115.af();
                jjVar116 = this.b.f308a;
                long y = jjVar116.y();
                hVar188 = this.b.ah;
                com.google.android.apps.search.assistant.platform.g.c.g gVar15 = (com.google.android.apps.search.assistant.platform.g.c.g) hVar188.a();
                jjVar117 = this.b.f308a;
                bb eH = jjVar117.eH();
                hVar189 = this.b.cF;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar4 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar189.a();
                jo joVar19 = this.f309a;
                ik ikVar11 = this.b;
                com.google.android.libraries.search.d.k.a.h kB = joVar19.kB();
                jjVar118 = ikVar11.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.f.a aVar20 = (com.google.android.apps.search.assistant.surfaces.voice.i.g.f.a) jj.hM(jjVar118).a();
                jjVar119 = this.b.f308a;
                boolean qn = jjVar119.qn();
                jjVar120 = this.b.f308a;
                ao fU = jjVar120.fU();
                hVar190 = this.f309a.W;
                com.google.android.libraries.search.t.i.y yVar3 = (com.google.android.libraries.search.t.i.y) hVar190.a();
                jrVar58 = this.f309a.b;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar4 = (com.google.android.apps.search.assistant.surfaces.voice.o.p) jr.bE(jrVar58).a();
                hVar191 = this.f309a.ft;
                ci ciVar = (ci) hVar191.a();
                jyVar4 = this.f309a.f319a;
                com.google.android.apps.search.assistant.surfaces.voice.contextawareness.m mVar = (com.google.android.apps.search.assistant.surfaces.voice.contextawareness.m) jy.fe(jyVar4).a();
                jjVar121 = this.b.f308a;
                boolean qo = jjVar121.qo();
                jjVar122 = this.b.f308a;
                boolean qp = jjVar122.qp();
                jjVar123 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.contextawareness.r W = jjVar123.W();
                jrVar59 = this.f309a.b;
                com.google.android.libraries.search.assistant.bb.a.u aI = jrVar59.aI();
                hVar192 = this.b.aP;
                Optional of4 = Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ao.ak) hVar192.a());
                jjVar124 = this.b.f308a;
                boolean qq = jjVar124.qq();
                jjVar125 = this.b.f308a;
                boolean qr = jjVar125.qr();
                jjVar126 = this.b.f308a;
                boolean qs = jjVar126.qs();
                hVar193 = this.f309a.Y;
                String str4 = (String) hVar193.a();
                jjVar127 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.e.f fVar13 = (com.google.android.apps.search.assistant.surfaces.voice.i.g.e.f) jj.kH(jjVar127).a();
                jjVar128 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ai aiVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ai) jj.ie(jjVar128).a();
                jjVar129 = this.b.f308a;
                boolean qc = jjVar129.qc();
                jjVar130 = this.b.f308a;
                boolean qu = jjVar130.qu();
                jjVar131 = this.b.f308a;
                e.a b9 = e.c.c.b(jj.hR(jjVar131));
                jjVar132 = this.b.f308a;
                boolean qv = jjVar132.qv();
                hVar194 = this.b.bX;
                com.google.android.apps.search.assistant.surfaces.voice.robin.p.i iVar7 = (com.google.android.apps.search.assistant.surfaces.voice.robin.p.i) hVar194.a();
                hVar195 = this.b.gX;
                e.a b10 = e.c.c.b(hVar195);
                jjVar133 = this.b.f308a;
                boolean qw = jjVar133.qw();
                jjVar134 = this.b.f308a;
                return new bl(context10, pM, agVar7, nVar3, agVar8, cVar2, nzVar, iVar6, eVar8, Y, ab4, lVar3, dVar7, aa, Z, qk, beVar, gVar14, bnVar2, cVar3, ql, b8, qm, au, af, y, gVar15, eH, aeVar4, kB, aVar20, qn, fU, yVar3, pVar4, ciVar, mVar, qo, qp, W, aI, of4, qq, qr, qs, str4, fVar13, aiVar, qc, qu, b9, qv, iVar7, b10, qw, jjVar134.qj());
            case 568:
                return com.google.android.libraries.search.assistant.invocation.u.b.d.b.b(this.b.qf());
            case 569:
                return new nz(this);
            case 570:
                return com.google.android.apps.search.assistant.surfaces.voice.h.a.f.b.b(this.b.qh());
            case 571:
                return com.google.android.apps.search.assistant.surfaces.voice.a.a.b.a.b(this.b.qh());
            case 572:
                jjVar135 = this.b.f308a;
                Set mZ = jjVar135.mZ();
                jjVar136 = this.b.f308a;
                Set nd = jjVar136.nd();
                jjVar137 = this.b.f308a;
                boolean pM2 = jjVar137.pM();
                jjVar138 = this.b.f308a;
                boolean pU = jjVar138.pU();
                hVar196 = this.f309a.Q;
                ag agVar9 = (ag) hVar196.a();
                hVar197 = this.f309a.R;
                n nVar4 = (n) hVar197.a();
                hVar198 = this.f309a.lh;
                com.google.android.apps.gsa.assistant.shared.n nVar5 = (com.google.android.apps.gsa.assistant.shared.n) hVar198.a();
                jjVar139 = this.b.f308a;
                Optional of5 = Optional.of(jjVar139.ac());
                ik ikVar12 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.e aY = ikVar12.aY();
                jjVar140 = ikVar12.f308a;
                boolean pN = jjVar140.pN();
                jjVar141 = this.b.f308a;
                boolean pV = jjVar141.pV();
                jjVar142 = this.b.f308a;
                boolean pT = jjVar142.pT();
                hVar199 = this.f309a.W;
                com.google.android.libraries.search.t.i.y yVar4 = (com.google.android.libraries.search.t.i.y) hVar199.a();
                hVar200 = this.f309a.Y;
                String str5 = (String) hVar200.a();
                jjVar143 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.g(mZ, nd, pM2, pU, agVar9, nVar4, nVar5, of5, aY, pN, pV, pT, yVar4, str5, (com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.bh) jj.hN(jjVar143).a());
            case 573:
                ik ikVar13 = this.b;
                jo joVar20 = this.f309a;
                com.google.apps.tiktok.q.b.h b11 = com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.a.a.g.b();
                com.google.apps.tiktok.account.d.b.a.b kg = ikVar13.kg();
                hVar201 = joVar20.w;
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.a.a.g.c(b11, kg, (com.google.android.libraries.storage.a.j) hVar201.a());
            case 574:
                hVar202 = this.f309a.ez;
                com.google.common.v.f fVar14 = (com.google.common.v.f) hVar202.a();
                hVar203 = this.f309a.W;
                com.google.android.libraries.search.t.i.y yVar5 = (com.google.android.libraries.search.t.i.y) hVar203.a();
                hVar204 = this.f309a.lh;
                com.google.android.apps.gsa.assistant.shared.n nVar6 = (com.google.android.apps.gsa.assistant.shared.n) hVar204.a();
                jjVar144 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.at atVar = (com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.at) jj.hO(jjVar144).a();
                hVar205 = this.f309a.Y;
                String str6 = (String) hVar205.a();
                hVar206 = this.f309a.Q;
                ag agVar10 = (ag) hVar206.a();
                hVar207 = this.f309a.H;
                Executor executor29 = (Executor) hVar207.a();
                jjVar145 = this.b.f308a;
                boolean pQ = jjVar145.pQ();
                jjVar146 = this.b.f308a;
                boolean pR = jjVar146.pR();
                jjVar147 = this.b.f308a;
                boolean pS = jjVar147.pS();
                jjVar148 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.ao(fVar14, yVar5, nVar6, atVar, str6, agVar10, executor29, pQ, pR, pS, jjVar148.pO());
            case 575:
                jjVar149 = this.b.f308a;
                cg cgVar3 = (cg) jj.kA(jjVar149).a();
                jjVar150 = this.b.f308a;
                cg cgVar4 = (cg) jj.kB(jjVar150).a();
                jjVar151 = this.b.f308a;
                Optional of6 = Optional.of(jjVar151.ac());
                ik ikVar14 = this.b;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.d.e aY2 = ikVar14.aY();
                jjVar152 = ikVar14.f308a;
                boolean pN2 = jjVar152.pN();
                jjVar153 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.at(cgVar3, cgVar4, of6, aY2, pN2, jjVar153.pO());
            case 576:
                ik ikVar15 = this.b;
                jo joVar21 = this.f309a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.aq.c();
                com.google.apps.tiktok.account.d.b.f kf4 = ikVar15.kf();
                hVar208 = joVar21.w;
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.aq.d(c2, kf4, (com.google.android.libraries.storage.a.j) hVar208.a());
            case 577:
                ik ikVar16 = this.b;
                jo joVar22 = this.f309a;
                com.google.apps.tiktok.q.b.h b12 = com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.aq.b();
                com.google.apps.tiktok.account.d.b.f kf5 = ikVar16.kf();
                hVar209 = joVar22.w;
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.aq.e(b12, kf5, (com.google.android.libraries.storage.a.j) hVar209.a());
            case 578:
                return new nz(this);
            case 579:
                return com.google.android.apps.search.assistant.surfaces.voice.l.d.b.b.b(this.b.qh());
            case 580:
                hVar210 = this.f309a.lg;
                e.a b13 = e.c.c.b(hVar210);
                hVar211 = this.f309a.H;
                Executor executor30 = (Executor) hVar211.a();
                jjVar154 = this.b.f308a;
                boolean pX = jjVar154.pX();
                hVar212 = this.f309a.W;
                com.google.android.libraries.search.t.i.y yVar6 = (com.google.android.libraries.search.t.i.y) hVar212.a();
                hVar213 = this.f309a.Y;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.a.k(b13, executor30, pX, yVar6, (String) hVar213.a());
            case 581:
                hVar214 = this.f309a.Q;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.c.i((ag) hVar214.a());
            case 582:
                hVar215 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.s.c((com.google.android.apps.search.assistant.platform.g.c.g) hVar215.a());
            case 583:
                ik ikVar17 = this.b;
                jo joVar23 = this.f309a;
                com.google.apps.tiktok.q.b.h b14 = com.google.android.apps.search.assistant.surfaces.voice.j.b.d.b.j.b();
                com.google.apps.tiktok.account.d.b.f kf6 = ikVar17.kf();
                hVar216 = joVar23.w;
                return com.google.android.apps.search.assistant.surfaces.voice.j.b.d.b.j.c(b14, kf6, (com.google.android.libraries.storage.a.j) hVar216.a());
            case 584:
                hVar217 = this.f309a.Q;
                ag agVar11 = (ag) hVar217.a();
                hVar218 = this.f309a.bo;
                ag agVar12 = (ag) hVar218.a();
                hVar219 = this.b.bM;
                lt ltVar = (lt) hVar219.a();
                hVar220 = this.f309a.P;
                n nVar7 = (n) hVar220.a();
                jjVar155 = this.b.f308a;
                boolean qh = jjVar155.qh();
                jjVar156 = this.b.f308a;
                boolean qi = jjVar156.qi();
                jjVar157 = this.b.f308a;
                boolean qj = jjVar157.qj();
                jjVar158 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.d.l(agVar11, agVar12, ltVar, nVar7, qh, qi, qj, (com.google.android.apps.search.assistant.surfaces.voice.i.d.a.h) jj.kK(jjVar158).a());
            case 585:
                return com.google.android.apps.search.assistant.surfaces.voice.i.d.c.b.b(this.b.qh());
            case 586:
                hVar221 = this.f309a.Q;
                ag agVar13 = (ag) hVar221.a();
                hVar222 = this.f309a.fQ;
                com.google.android.libraries.search.assistant.invocation.l.h hVar245 = (com.google.android.libraries.search.assistant.invocation.l.h) hVar222.a();
                jjVar159 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.ap apVar2 = (com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.ap) jj.hN(jjVar159).a();
                hVar223 = this.f309a.ez;
                return new be(agVar13, hVar245, apVar2, (com.google.common.v.f) hVar223.a());
            case 587:
                return new bn();
            case 588:
                return com.google.android.apps.search.assistant.surfaces.voice.i.g.d.b.a(Optional.empty());
            case 589:
                return new lt(this);
            case 590:
                return com.google.android.libraries.search.assistant.bb.b.b.b(this.b.qg());
            case 591:
                hVar224 = this.f309a.Q;
                ag agVar14 = (ag) hVar224.a();
                hVar225 = this.f309a.bo;
                ag agVar15 = (ag) hVar225.a();
                hVar226 = this.f309a.fQ;
                com.google.android.libraries.search.assistant.invocation.l.h hVar246 = (com.google.android.libraries.search.assistant.invocation.l.h) hVar226.a();
                jo joVar24 = this.f309a;
                com.google.android.libraries.search.assistant.y.a.l jK = joVar24.jK();
                jrVar60 = joVar24.b;
                com.google.android.libraries.search.assistant.invocation.s.c.b hL = jrVar60.hL();
                hVar227 = this.b.ba;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.f.h(agVar14, agVar15, hVar246, jK, hL, (com.google.android.libraries.search.b.b) hVar227.a());
            case 592:
                hVar228 = this.f309a.bo;
                ag agVar16 = (ag) hVar228.a();
                hVar229 = this.f309a.fQ;
                com.google.android.libraries.search.assistant.invocation.l.h hVar247 = (com.google.android.libraries.search.assistant.invocation.l.h) hVar229.a();
                jjVar160 = this.b.f308a;
                com.google.android.libraries.search.assistant.an.c cVar4 = (com.google.android.libraries.search.assistant.an.c) jj.gu(jjVar160).a();
                jjVar161 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.e.f(agVar16, hVar247, cVar4, jjVar161.qt());
            case 593:
                hVar230 = this.f309a.Q;
                ag agVar17 = (ag) hVar230.a();
                jjVar162 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.f ag = jjVar162.ag();
                jjVar163 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b.a ak = jjVar163.ak();
                hVar231 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar16 = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar231.a();
                jjVar164 = this.b.f308a;
                q qVar = (q) jj.gl(jjVar164).a();
                jjVar165 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.ai(agVar17, ag, ak, bVar16, qVar, (lt) jj.hi(jjVar165).a());
            case 594:
                return new lt(this);
            case 595:
                hVar232 = this.f309a.Q;
                ag agVar18 = (ag) hVar232.a();
                jjVar166 = this.b.f308a;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.j jVar2 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.j) jj.gs(jjVar166).a();
                jjVar167 = this.b.f308a;
                e.a b15 = e.c.c.b(jj.kX(jjVar167));
                hVar233 = this.f309a.H;
                cq cqVar4 = (cq) hVar233.a();
                jjVar168 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.e.n nVar8 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e.n) jj.iu(jjVar168).a();
                hVar234 = this.f309a.g;
                com.google.android.libraries.g.a aVar21 = (com.google.android.libraries.g.a) hVar234.a();
                ik ikVar18 = this.b;
                jo joVar25 = this.f309a;
                hVar235 = ikVar18.cE;
                hVar236 = joVar25.ez;
                com.google.common.v.f fVar15 = (com.google.common.v.f) hVar236.a();
                jjVar169 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.a.b.h(agVar18, jVar2, b15, cqVar4, nVar8, aVar21, hVar235, fVar15, (com.google.android.libraries.search.assistant.spokennotifications.autoread.c.f) jj.lg(jjVar169).a());
            case 596:
                ik ikVar19 = this.b;
                com.google.android.libraries.search.assistant.ai.c.l ii = ikVar19.ii();
                jjVar170 = ikVar19.f308a;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.c.b bVar17 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.c.b) jj.lf(jjVar170).a();
                jjVar171 = this.b.f308a;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.c.f fVar16 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.c.f) jj.lg(jjVar171).a();
                hVar237 = this.f309a.H;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.j(ii, bVar17, fVar16, (cq) hVar237.a());
            case 597:
                hVar238 = this.b.aV;
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.b((com.google.android.libraries.search.b.b) hVar238.a());
            case 598:
                jjVar172 = this.b.f308a;
                return new op((com.google.android.libraries.search.assistant.spokennotifications.a.b.a) jj.li(jjVar172).a());
            case 599:
                hVar239 = this.f309a.f;
                Context context11 = (Context) hVar239.a();
                jjVar173 = this.b.f308a;
                com.google.android.libraries.search.assistant.spokennotifications.a.b bVar18 = (com.google.android.libraries.search.assistant.spokennotifications.a.b) jj.gH(jjVar173).a();
                jjVar174 = this.b.f308a;
                com.google.android.libraries.search.assistant.spokennotifications.autoread.a.b.e eVar9 = (com.google.android.libraries.search.assistant.spokennotifications.autoread.a.b.e) jj.hx(jjVar174).a();
                hVar240 = this.f309a.H;
                return new com.google.android.libraries.search.assistant.spokennotifications.autoread.a.c.p(context11, bVar18, eVar9, (Executor) hVar240.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        h hVar;
        h hVar2;
        jj jjVar;
        jj jjVar2;
        jj jjVar3;
        jj jjVar4;
        jj jjVar5;
        jj jjVar6;
        jj jjVar7;
        jj jjVar8;
        h hVar3;
        h hVar4;
        h hVar5;
        jj jjVar9;
        jj jjVar10;
        jj jjVar11;
        h hVar6;
        h hVar7;
        jj jjVar12;
        h hVar8;
        h hVar9;
        jj jjVar13;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        jj jjVar14;
        h hVar14;
        h hVar15;
        h hVar16;
        jj jjVar15;
        h hVar17;
        jj jjVar16;
        jj jjVar17;
        h hVar18;
        jr jrVar;
        h hVar19;
        h hVar20;
        jj jjVar18;
        jj jjVar19;
        h hVar21;
        jj jjVar20;
        h hVar22;
        h hVar23;
        h hVar24;
        h hVar25;
        h hVar26;
        jj jjVar21;
        h hVar27;
        jr jrVar2;
        jr jrVar3;
        jj jjVar22;
        jj jjVar23;
        h hVar28;
        h hVar29;
        jj jjVar24;
        h hVar30;
        h hVar31;
        h hVar32;
        jj jjVar25;
        jj jjVar26;
        h hVar33;
        h hVar34;
        h hVar35;
        h hVar36;
        jj jjVar27;
        jj jjVar28;
        jj jjVar29;
        jy jyVar;
        h hVar37;
        jj jjVar30;
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
        jj jjVar31;
        jr jrVar4;
        h hVar49;
        h hVar50;
        h hVar51;
        h hVar52;
        jj jjVar32;
        jj jjVar33;
        h hVar53;
        h hVar54;
        jj jjVar34;
        jj jjVar35;
        jj jjVar36;
        h hVar55;
        h hVar56;
        h hVar57;
        h hVar58;
        h hVar59;
        h hVar60;
        jj jjVar37;
        jj jjVar38;
        h hVar61;
        h hVar62;
        h hVar63;
        h hVar64;
        h hVar65;
        h hVar66;
        h hVar67;
        jj jjVar39;
        jj jjVar40;
        h hVar68;
        jj jjVar41;
        h hVar69;
        jj jjVar42;
        h hVar70;
        h hVar71;
        h hVar72;
        h hVar73;
        h hVar74;
        jj jjVar43;
        h hVar75;
        h hVar76;
        h hVar77;
        h hVar78;
        h hVar79;
        h hVar80;
        jj jjVar44;
        jr jrVar5;
        jj jjVar45;
        jj jjVar46;
        h hVar81;
        h hVar82;
        h hVar83;
        jj jjVar47;
        jj jjVar48;
        h hVar84;
        h hVar85;
        h hVar86;
        h hVar87;
        h hVar88;
        jr jrVar6;
        h hVar89;
        h hVar90;
        jj jjVar49;
        h hVar91;
        jj jjVar50;
        h hVar92;
        jj jjVar51;
        jj jjVar52;
        jj jjVar53;
        jj jjVar54;
        jj jjVar55;
        jy jyVar2;
        jj jjVar56;
        jj jjVar57;
        jy jyVar3;
        jj jjVar58;
        jy jyVar4;
        jj jjVar59;
        h hVar93;
        h hVar94;
        jj jjVar60;
        jy jyVar5;
        jy jyVar6;
        jy jyVar7;
        h hVar95;
        h hVar96;
        jy jyVar8;
        jy jyVar9;
        jy jyVar10;
        jy jyVar11;
        jy jyVar12;
        h hVar97;
        h hVar98;
        h hVar99;
        jy jyVar13;
        jy jyVar14;
        jy jyVar15;
        jy jyVar16;
        jy jyVar17;
        h hVar100;
        h hVar101;
        jy jyVar18;
        h hVar102;
        jj jjVar61;
        jj jjVar62;
        jj jjVar63;
        jj jjVar64;
        jj jjVar65;
        jj jjVar66;
        jj jjVar67;
        jj jjVar68;
        jj jjVar69;
        jj jjVar70;
        jj jjVar71;
        jj jjVar72;
        jr jrVar7;
        jr jrVar8;
        jj jjVar73;
        jj jjVar74;
        h hVar103;
        h hVar104;
        jj jjVar75;
        h hVar105;
        jj jjVar76;
        h hVar106;
        h hVar107;
        jj jjVar77;
        jj jjVar78;
        h hVar108;
        h hVar109;
        jy jyVar19;
        jj jjVar79;
        h hVar110;
        h hVar111;
        jr jrVar9;
        jr jrVar10;
        h hVar112;
        jj jjVar80;
        jj jjVar81;
        jj jjVar82;
        h hVar113;
        jj jjVar83;
        jj jjVar84;
        jr jrVar11;
        h hVar114;
        h hVar115;
        jj jjVar85;
        jj jjVar86;
        jr jrVar12;
        jr jrVar13;
        jr jrVar14;
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
        jj jjVar87;
        jj jjVar88;
        jr jrVar15;
        jj jjVar89;
        h hVar127;
        jr jrVar16;
        h hVar128;
        h hVar129;
        h hVar130;
        jj jjVar90;
        jj jjVar91;
        jj jjVar92;
        h hVar131;
        jj jjVar93;
        h hVar132;
        h hVar133;
        jj jjVar94;
        jj jjVar95;
        jj jjVar96;
        jj jjVar97;
        jj jjVar98;
        jj jjVar99;
        h hVar134;
        h hVar135;
        jj jjVar100;
        h hVar136;
        jj jjVar101;
        jj jjVar102;
        int i = this.c;
        switch (i) {
            case 600:
                hVar = this.f309a.f;
                return new com.google.android.libraries.search.assistant.spokennotifications.a.b((Context) hVar.a());
            case 601:
                return com.google.android.libraries.search.assistant.spokennotifications.autoread.a.f.b(this.b.qh());
            case 602:
                hVar2 = this.f309a.Q;
                ag agVar = (ag) hVar2.a();
                jjVar = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.f ag = jjVar.ag();
                jjVar2 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.n ah = jjVar2.ah();
                jjVar3 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.c.k al = jjVar3.al();
                jjVar4 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.g.j an = jjVar4.an();
                jjVar5 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.e.f ar = jjVar5.ar();
                jjVar6 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.p ai = jjVar6.ai();
                jjVar7 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.e.a am = jjVar7.am();
                jjVar8 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.r aj = jjVar8.aj();
                hVar3 = this.b.i;
                com.google.android.apps.search.assistant.surfaces.voice.j.d.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) hVar3.a();
                hVar4 = this.f309a.ez;
                com.google.common.v.f fVar = (com.google.common.v.f) hVar4.a();
                hVar5 = this.b.cE;
                boolean booleanValue = ((Boolean) hVar5.a()).booleanValue();
                jjVar9 = this.b.f308a;
                boolean qz = jjVar9.qz();
                jjVar10 = this.b.f308a;
                boolean qA = jjVar10.qA();
                jjVar11 = this.b.f308a;
                lt ltVar = (lt) jj.hi(jjVar11).a();
                hVar6 = this.b.cF;
                com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) hVar6.a();
                ik ikVar = this.b;
                jo joVar = this.f309a;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR = ikVar.aR();
                hVar7 = joVar.sZ;
                com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b bVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) hVar7.a();
                jjVar12 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.e.n(agVar, ag, ah, al, an, ar, ai, am, aj, bVar, fVar, booleanValue, qz, qA, ltVar, aeVar, aR, bVar2, jjVar12.qx());
            case 603:
                hVar8 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.s.b((com.google.android.apps.search.assistant.platform.g.c.g) hVar8.a());
            case 604:
                hVar9 = this.f309a.Q;
                ag agVar2 = (ag) hVar9.a();
                jjVar13 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.e.d(agVar2, jj.hE(jjVar13));
            case 605:
                hVar10 = this.f309a.bz;
                com.google.apps.tiktok.concurrent.ao aoVar = (com.google.apps.tiktok.concurrent.ao) hVar10.a();
                hVar11 = this.f309a.Q;
                ag agVar3 = (ag) hVar11.a();
                hVar12 = this.b.q;
                dj djVar = (dj) hVar12.a();
                hVar13 = this.f309a.cZ;
                AudioManager audioManager = (AudioManager) hVar13.a();
                jjVar14 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.c.a.a.e(aoVar, agVar3, djVar, audioManager, jjVar14.av());
            case 606:
                hVar14 = this.f309a.ux;
                Context context = (Context) hVar14.a();
                hVar15 = this.f309a.H;
                cq cqVar = (cq) hVar15.a();
                hVar16 = this.f309a.v;
                cq cqVar2 = (cq) hVar16.a();
                jjVar15 = this.b.f308a;
                ar arVar = (ar) jj.hw(jjVar15).a();
                hVar17 = this.b.Y;
                jjVar16 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.bisto.a.c.n K = jjVar16.K();
                jjVar17 = this.b.f308a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.e.d.h(context, cqVar, cqVar2, arVar, K, (l) jjVar17.mi());
            case 607:
                hVar18 = this.f309a.Q;
                ag agVar4 = (ag) hVar18.a();
                jrVar = this.f309a.b;
                return new com.google.android.apps.search.assistant.surfaces.voice.j.b.e.t(agVar4, jr.ca(jrVar));
            case 608:
                hVar19 = this.f309a.H;
                Executor executor = (Executor) hVar19.a();
                hVar20 = this.f309a.Q;
                ag agVar5 = (ag) hVar20.a();
                jjVar18 = this.b.f308a;
                cg cgVar = (cg) jj.kC(jjVar18).a();
                jjVar19 = this.b.f308a;
                Set nh = jjVar19.nh();
                hVar21 = this.f309a.iu;
                ay ayVar = (ay) hVar21.a();
                jjVar20 = this.b.f308a;
                return new com.google.android.apps.search.assistant.platform.g.q.a.o(executor, agVar5, cgVar, nh, ayVar, jjVar20.eE());
            case 609:
                ik ikVar2 = this.b;
                jo joVar2 = this.f309a;
                com.google.apps.tiktok.q.b.h b = com.google.android.apps.search.assistant.platform.g.q.a.p.b();
                com.google.apps.tiktok.account.d.b.a.b kg = ikVar2.kg();
                hVar22 = joVar2.w;
                return com.google.android.apps.search.assistant.platform.g.q.a.p.c(b, kg, (com.google.android.libraries.storage.a.j) hVar22.a());
            case 610:
                hVar23 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.s.e((com.google.android.apps.search.assistant.platform.g.c.g) hVar23.a());
            case 611:
                hVar24 = this.b.ah;
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.s.f((com.google.android.apps.search.assistant.platform.g.c.g) hVar24.a());
            case 612:
                return com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.oobe.c.e.b(this.b.qh());
            case 613:
                hVar25 = this.f309a.v;
                Executor executor2 = (Executor) hVar25.a();
                hVar26 = this.f309a.f;
                Context context2 = (Context) hVar26.a();
                jjVar21 = this.b.f308a;
                com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.p pVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.p) jj.gG(jjVar21).a();
                hVar27 = this.b.q;
                dj djVar2 = (dj) hVar27.a();
                jrVar2 = this.f309a.b;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.t(executor2, context2, pVar, djVar2, jrVar2.gv());
            case 614:
                return new lt(this);
            case 615:
                jrVar3 = this.f309a.b;
                com.google.apps.tiktok.experiments.phenotype.e eVar = (com.google.apps.tiktok.experiments.phenotype.e) jr.cA(jrVar3).a();
                jjVar22 = this.b.f308a;
                return new com.google.apps.tiktok.experiments.phenotype.a.d(eVar, jjVar22.fx());
            case 616:
                jjVar23 = this.b.f308a;
                return new com.google.android.apps.gsa.u.e.a(e.c.c.b(jj.iF(jjVar23)));
            case 617:
                hVar28 = this.f309a.gf;
                SharedPreferences sharedPreferences = (SharedPreferences) hVar28.a();
                hVar29 = this.f309a.g;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) hVar29.a();
                jjVar24 = this.b.f308a;
                return new com.google.android.apps.gsa.assistant.shared.w(sharedPreferences, aVar, e.c.c.b(jj.iE(jjVar24)));
            case 618:
                hVar30 = this.f309a.f;
                Context context3 = (Context) hVar30.a();
                hVar31 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar31.a();
                hVar32 = this.f309a.H;
                cq cqVar3 = (cq) hVar32.a();
                jjVar25 = this.b.f308a;
                return new com.google.android.apps.search.assistant.platform.g.l.a.k(context3, dVar, cqVar3, jj.kY(jjVar25));
            case 619:
                jjVar26 = this.b.f308a;
                return new op(jjVar26.D());
            case 620:
                return new ls();
            case 621:
                hVar33 = this.b.aa;
                com.google.apps.tiktok.g.p pVar2 = (com.google.apps.tiktok.g.p) hVar33.a();
                hVar34 = this.f309a.v;
                return new com.google.android.libraries.search.assistant.performer.communication.impl.h(pVar2, (cq) hVar34.a());
            case 622:
                hVar35 = this.b.dJ;
                com.google.android.libraries.search.assistant.aw.b.a.b bVar3 = (com.google.android.libraries.search.assistant.aw.b.a.b) hVar35.a();
                hVar36 = this.b.f2do;
                com.google.android.libraries.search.assistant.aw.n.d.b bVar4 = (com.google.android.libraries.search.assistant.aw.n.d.b) hVar36.a();
                jjVar27 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.performer.n.v(bVar3, bVar4, jjVar27.es());
            case 623:
                jjVar28 = this.b.f308a;
                com.google.android.libraries.search.assistant.performer.deviceactions.a.a.y ey = jjVar28.ey();
                jjVar29 = this.b.f308a;
                com.google.android.libraries.search.assistant.performer.deviceactions.a.a.v ex = jjVar29.ex();
                jyVar = this.f309a.f319a;
                com.google.android.libraries.search.assistant.performer.deviceactions.c.c cVar = (com.google.android.libraries.search.assistant.performer.deviceactions.c.c) jy.nf(jyVar).a();
                hVar37 = this.f309a.H;
                cq cqVar4 = (cq) hVar37.a();
                jjVar30 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.r(ey, ex, cVar, cqVar4, jjVar30.mW());
            case 624:
                hVar38 = this.f309a.f;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.b((Context) hVar38.a());
            case 625:
                hVar39 = this.f309a.h;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.at((PackageManager) hVar39.a());
            case 626:
                hVar40 = this.f309a.H;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.av((cr) hVar40.a());
            case 627:
                hVar41 = this.f309a.Q;
                ag agVar6 = (ag) hVar41.a();
                hVar42 = this.b.u;
                return new com.google.android.libraries.search.assistant.performer.e.f(agVar6, (com.google.android.libraries.search.account.e.b) hVar42.a());
            case 628:
                hVar43 = this.f309a.H;
                Executor executor3 = (Executor) hVar43.a();
                hVar44 = this.f309a.v;
                cq cqVar5 = (cq) hVar44.a();
                hVar45 = this.b.aa;
                com.google.apps.tiktok.g.p pVar3 = (com.google.apps.tiktok.g.p) hVar45.a();
                hVar46 = this.f309a.f;
                Context context4 = (Context) hVar46.a();
                hVar47 = this.f309a.ez;
                return new com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.e(executor3, cqVar5, pVar3, context4, (com.google.common.v.f) hVar47.a());
            case 629:
                hVar48 = this.f309a.f;
                Context context5 = (Context) hVar48.a();
                jjVar31 = this.b.f308a;
                com.google.android.libraries.search.assistant.performer.h.d.j ez = jjVar31.ez();
                jrVar4 = this.f309a.b;
                Optional of = Optional.of(jrVar4.hM());
                hVar49 = this.f309a.H;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar49.a();
                hVar50 = this.f309a.bz;
                return new com.google.android.libraries.search.assistant.performer.h.d.i(context5, ez, of, scheduledExecutorService, (com.google.apps.tiktok.concurrent.ao) hVar50.a());
            case 630:
                jo joVar3 = this.f309a;
                ik ikVar3 = this.b;
                hVar51 = joVar3.f;
                hVar52 = joVar3.H;
                jjVar32 = ikVar3.f308a;
                h ih = jj.ih(jjVar32);
                jjVar33 = this.b.f308a;
                h b2 = e.c.i.b(jj.ii(jjVar33));
                hVar53 = this.f309a.h;
                h b3 = e.c.i.b(hVar53);
                jo joVar4 = this.f309a;
                ik ikVar4 = this.b;
                hVar54 = joVar4.g;
                jjVar34 = ikVar4.f308a;
                h iO = jj.iO(jjVar34);
                jjVar35 = this.b.f308a;
                h iP = jj.iP(jjVar35);
                jjVar36 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.performer.h.e.a.v(hVar51, hVar52, ih, b2, b3, hVar54, iO, iP, jj.ij(jjVar36));
            case 631:
                hVar55 = this.f309a.f;
                Context context6 = (Context) hVar55.a();
                hVar56 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar5 = (com.google.apps.tiktok.account.data.b) hVar56.a();
                hVar57 = this.b.g;
                AccountId accountId = (AccountId) hVar57.a();
                hVar58 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar2 = (com.google.apps.tiktok.account.data.a.d) hVar58.a();
                hVar59 = this.f309a.H;
                return new com.google.android.libraries.search.assistant.performer.h.b(context6, bVar5, accountId, dVar2, (Executor) hVar59.a());
            case 632:
                hVar60 = this.f309a.bz;
                return new com.google.android.libraries.search.assistant.performer.h.e.d((com.google.apps.tiktok.concurrent.ao) hVar60.a(), this.b.kD());
            case 633:
                jjVar37 = this.b.f308a;
                return Optional.of(jjVar37.eA());
            case 634:
                jjVar38 = this.b.f308a;
                h ik = jj.ik(jjVar38);
                hVar61 = this.f309a.H;
                return new com.google.android.libraries.search.assistant.aq.o.e(ik, hVar61);
            case 635:
                hVar62 = this.f309a.Q;
                ag agVar7 = (ag) hVar62.a();
                ik ikVar5 = this.b;
                jo joVar5 = this.f309a;
                hVar63 = ikVar5.g;
                hVar64 = joVar5.f;
                Context context7 = (Context) hVar64.a();
                hVar65 = this.f309a.bN;
                com.google.apps.tiktok.account.data.b bVar6 = (com.google.apps.tiktok.account.data.b) hVar65.a();
                hVar66 = this.f309a.h;
                PackageManager packageManager = (PackageManager) hVar66.a();
                hVar67 = this.b.jG;
                com.google.android.libraries.search.assistant.aq.u.g gVar = (com.google.android.libraries.search.assistant.aq.u.g) hVar67.a();
                jjVar39 = this.b.f308a;
                com.google.android.libraries.search.assistant.aq.i.a.e eVar2 = (com.google.android.libraries.search.assistant.aq.i.a.e) jj.jm(jjVar39).a();
                ik ikVar6 = this.b;
                com.google.android.libraries.search.assistant.aq.i.a.e xZ = ikVar6.xZ();
                jjVar40 = ikVar6.f308a;
                return new com.google.android.libraries.search.assistant.aq.o.m(agVar7, hVar63, context7, bVar6, packageManager, gVar, eVar2, xZ, jjVar40.eD());
            case 636:
                hVar68 = this.b.kw;
                return new com.google.android.libraries.search.assistant.aq.i.a.e((cg) hVar68.a());
            case 637:
                jjVar41 = this.b.f308a;
                return com.google.android.libraries.search.assistant.performer.h.e.b.a.b((com.google.android.libraries.search.assistant.performer.h.e.a.v) jj.il(jjVar41).a());
            case 638:
                hVar69 = this.f309a.Q;
                ag agVar8 = (ag) hVar69.a();
                jjVar42 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.performer.i.b(agVar8, jjVar42.er());
            case 639:
                ik ikVar7 = this.b;
                jo joVar6 = this.f309a;
                hVar70 = ikVar7.aa;
                hVar71 = joVar6.f;
                hVar72 = joVar6.H;
                hVar73 = joVar6.h;
                hVar74 = joVar6.bz;
                jjVar43 = ikVar7.f308a;
                return new com.google.android.libraries.search.assistant.performer.communication.ci(hVar70, hVar71, hVar72, hVar73, hVar74, jj.iI(jjVar43), (byte[]) null, (byte[]) null);
            case 640:
                return Optional.of(this.b.il());
            case 641:
                return new lt(this);
            case 642:
                jo joVar7 = this.f309a;
                ik ikVar8 = this.b;
                hVar75 = joVar7.f;
                hVar76 = ikVar8.bJ;
                hVar77 = joVar7.H;
                hVar78 = joVar7.bz;
                hVar79 = joVar7.v;
                hVar80 = joVar7.h;
                jjVar44 = ikVar8.f308a;
                h it = jj.it(jjVar44);
                jrVar5 = this.f309a.b;
                h cp = jr.cp(jrVar5);
                jjVar45 = this.b.f308a;
                h kM = jj.kM(jjVar45);
                jjVar46 = this.b.f308a;
                return new com.google.android.libraries.search.assistant.performer.communication.ah(hVar75, hVar76, hVar77, hVar78, hVar79, hVar80, it, cp, kM, jj.hk(jjVar46));
            case 643:
                hVar81 = this.f309a.f;
                Context context8 = (Context) hVar81.a();
                hVar82 = this.f309a.v;
                cq cqVar6 = (cq) hVar82.a();
                hVar83 = this.f309a.g;
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) hVar83.a();
                jjVar47 = this.b.f308a;
                jjVar47.rx();
                jjVar48 = this.b.f308a;
                return new by(context8, cqVar6, aVar2, (com.google.android.libraries.search.assistant.performer.communication.bf) jjVar48.mn());
            case 644:
                return new ls();
            case 645:
                hVar84 = this.f309a.eA;
                return com.google.android.libraries.search.assistant.incallservice.v.e((io.grpc.i) hVar84.a());
            case 646:
                return new lt(this);
            case 647:
                hVar85 = this.f309a.MT;
                com.google.android.libraries.search.l.aa aaVar = (com.google.android.libraries.search.l.aa) hVar85.a();
                hVar86 = this.f309a.bq;
                com.google.apps.tiktok.account.data.a.d dVar3 = (com.google.apps.tiktok.account.data.a.d) hVar86.a();
                hVar87 = this.b.g;
                AccountId accountId2 = (AccountId) hVar87.a();
                hVar88 = this.f309a.bo;
                return new com.google.android.libraries.search.assistant.aq.d.a.d(aaVar, dVar3, accountId2, (ag) hVar88.a());
            case 648:
                return new lt(this);
            case 649:
                return Boolean.valueOf(h.a.a.b.b.a.c.n(this.b.yA()));
            case 650:
                jrVar6 = this.f309a.b;
                return com.google.android.libraries.assistant.auto.tng.media.d.d.a.a.b(jrVar6.bq());
            case 651:
                hVar89 = this.f309a.v;
                cr crVar = (cr) hVar89.a();
                hVar90 = this.f309a.H;
                cq cqVar7 = (cq) hVar90.a();
                jjVar49 = this.b.f308a;
                e.a b4 = e.c.c.b(jj.ii(jjVar49));
                hVar91 = this.b.aH;
                return new com.google.android.libraries.assistant.auto.tng.media.a.e.i(crVar, cqVar7, b4, (com.google.android.libraries.assistant.auto.tng.media.a.e.k) hVar91.a());
            case 652:
                return Boolean.valueOf(h.a.a.b.b.a.f.c(this.b.pS()));
            case 653:
                return Boolean.valueOf(h.a.a.b.b.a.c.p(this.b.yA()));
            case 654:
                return Boolean.valueOf(h.a.a.b.b.a.c.m(this.b.yA()));
            case 655:
                jjVar50 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.l.bx rF = jjVar50.rF();
                hVar92 = this.b.dH;
                Map map = (Map) hVar92.a();
                jjVar51 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.l.g gVar2 = (com.google.android.libraries.assistant.auto.tng.l.g) jj.jj(jjVar51).a();
                jjVar52 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.c.a.a.a(rF, map, gVar2, jj.hG(jjVar52));
            case 656:
                return new com.google.android.libraries.assistant.auto.tng.l.be();
            case 657:
                jjVar53 = this.b.f308a;
                bk dU = jjVar53.dU();
                jjVar54 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.l.bp rR = jjVar54.rR();
                jjVar55 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.l.g gVar3 = (com.google.android.libraries.assistant.auto.tng.l.g) jj.jj(jjVar55).a();
                jyVar2 = this.f309a.f319a;
                e.a b5 = e.c.c.b(jy.lU(jyVar2));
                jjVar56 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.l.ap dR = jjVar56.dR();
                jjVar57 = this.b.f308a;
                ba dS = jjVar57.dS();
                jyVar3 = this.f309a.f319a;
                h ly = jy.ly(jyVar3);
                jjVar58 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.l.bd dT = jjVar58.dT();
                jyVar4 = this.f309a.f319a;
                return new com.google.android.libraries.assistant.auto.tng.l.x(dU, rR, gVar3, b5, dR, dS, ly, dT, ((Boolean) jy.nk(jyVar4).a()).booleanValue());
            case 658:
                jjVar59 = this.b.f308a;
                return Optional.of(jjVar59.dF());
            case 659:
                hVar93 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.l.g((Executor) hVar93.a());
            case 660:
                hVar94 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.l.aw(hVar94, (byte[]) null);
            case 661:
                jjVar60 = this.b.f308a;
                h kI = jj.kI(jjVar60);
                jyVar5 = this.f309a.f319a;
                h mh = jy.mh(jyVar5);
                jyVar6 = this.f309a.f319a;
                h ll = jy.ll(jyVar6);
                jyVar7 = this.f309a.f319a;
                h lO = jy.lO(jyVar7);
                hVar95 = this.f309a.g;
                return new com.google.android.libraries.assistant.auto.tng.l.bx(kI, mh, ll, lO, hVar95);
            case 662:
                jo joVar8 = this.f309a;
                hVar96 = joVar8.g;
                jyVar8 = joVar8.f319a;
                h mf = jy.mf(jyVar8);
                jyVar9 = this.f309a.f319a;
                h md = jy.md(jyVar9);
                jyVar10 = this.f309a.f319a;
                h me = jy.me(jyVar10);
                jyVar11 = this.f309a.f319a;
                h mg = jy.mg(jyVar11);
                jyVar12 = this.f309a.f319a;
                h mc = jy.mc(jyVar12);
                hVar97 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.l.bs(hVar96, mf, md, me, mg, mc, hVar97);
            case 663:
                jo joVar9 = this.f309a;
                hVar98 = joVar9.H;
                hVar99 = joVar9.g;
                jyVar13 = joVar9.f319a;
                h lo = jy.lo(jyVar13);
                jyVar14 = this.f309a.f319a;
                h ls = jy.ls(jyVar14);
                jyVar15 = this.f309a.f319a;
                h mo = jy.mo(jyVar15);
                jyVar16 = this.f309a.f319a;
                h lr = jy.lr(jyVar16);
                jyVar17 = this.f309a.f319a;
                return new com.google.android.libraries.assistant.auto.tng.l.bp(hVar98, hVar99, lo, ls, mo, lr, jy.fw(jyVar17));
            case 664:
                jo joVar10 = this.f309a;
                hVar100 = joVar10.H;
                hVar101 = joVar10.g;
                jyVar18 = joVar10.f319a;
                return new com.google.android.libraries.assistant.auto.tng.l.bp(hVar100, hVar101, jy.lp(jyVar18));
            case 665:
                hVar102 = this.f309a.H;
                Executor executor4 = (Executor) hVar102.a();
                jjVar61 = this.b.f308a;
                h iC = jj.iC(jjVar61);
                jjVar62 = this.b.f308a;
                h iB = jj.iB(jjVar62);
                jjVar63 = this.b.f308a;
                h iw = jj.iw(jjVar63);
                jjVar64 = this.b.f308a;
                h lb = jj.lb(jjVar64);
                jjVar65 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.actionscache.c.q dC = jjVar65.dC();
                jjVar66 = this.b.f308a;
                Object mp = jjVar66.mp();
                jjVar67 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.actionscache.d.j jVar = (com.google.android.libraries.assistant.auto.tng.actionscache.d.j) jj.gw(jjVar67).a();
                jjVar68 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.a.c dO = jjVar68.dO();
                jjVar69 = this.b.f308a;
                Object mo2 = jjVar69.mo();
                jjVar70 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.c.f fVar2 = (com.google.android.libraries.assistant.auto.tng.c.f) jj.gt(jjVar70).a();
                jjVar71 = this.b.f308a;
                h js = jj.js(jjVar71);
                jjVar72 = this.b.f308a;
                h ka = jj.ka(jjVar72);
                jrVar7 = this.f309a.b;
                h cZ = jr.cZ(jrVar7);
                jrVar8 = this.f309a.b;
                h cY = jr.cY(jrVar8);
                jjVar73 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.l.c.s(executor4, iC, iB, iw, lb, dC, (com.google.android.libraries.assistant.auto.tng.l.c.ai) mp, jVar, dO, (com.google.android.libraries.assistant.auto.tng.l.c.ab) mo2, fVar2, js, ka, cZ, cY, jj.iQ(jjVar73));
            case 666:
                jjVar74 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.c.b.a.i dJ = jjVar74.dJ();
                jo joVar11 = this.f309a;
                lz lzVar = new lz(joVar11, this.b);
                hVar103 = joVar11.wr;
                com.google.cj.i.f fVar3 = (com.google.cj.i.f) hVar103.a();
                hVar104 = this.f309a.H;
                Executor executor5 = (Executor) hVar104.a();
                jjVar75 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.c.b.a.b(dJ, lzVar, fVar3, executor5, jj.iD(jjVar75));
            case 667:
                hVar105 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.c.b.a.e((Executor) hVar105.a());
            case 668:
                jjVar76 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.c.a.f dI = jjVar76.dI();
                jo joVar12 = this.f309a;
                lz lzVar2 = new lz(joVar12, this.b);
                hVar106 = joVar12.wr;
                com.google.cj.i.f fVar4 = (com.google.cj.i.f) hVar106.a();
                hVar107 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.c.a.b(dI, lzVar2, fVar4, (Executor) hVar107.a());
            case 669:
                jjVar77 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.b.e dH = jjVar77.dH();
                jo joVar13 = this.f309a;
                ik ikVar9 = this.b;
                mm mmVar = new mm(joVar13, ikVar9);
                jjVar78 = ikVar9.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.b.a.c cVar2 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.b.a.c) jj.iv(jjVar78).a();
                hVar108 = this.f309a.wr;
                com.google.cj.i.f fVar5 = (com.google.cj.i.f) hVar108.a();
                hVar109 = this.f309a.H;
                Executor executor6 = (Executor) hVar109.a();
                jyVar19 = this.f309a.f319a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.b.b(dH, mmVar, cVar2, fVar5, executor6, jy.lk(jyVar19));
            case 670:
                jjVar79 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.c.b.g dG = jjVar79.dG();
                ik ikVar10 = this.b;
                com.google.android.libraries.assistant.auto.tng.g.a.a.a.f fH = ikVar10.fH();
                hVar110 = ikVar10.aG;
                com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar4 = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar110.a();
                hVar111 = this.f309a.H;
                cr crVar2 = (cr) hVar111.a();
                jrVar9 = this.f309a.b;
                h cZ2 = jr.cZ(jrVar9);
                jrVar10 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.c.b.e(dG, fH, gVar4, crVar2, cZ2, jr.dI(jrVar10));
            case 671:
                hVar112 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.b.a.c((Executor) hVar112.a());
            case 672:
                jjVar80 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.s.f.e.v vVar = (com.google.android.libraries.assistant.auto.tng.s.f.e.v) jj.lc(jjVar80).a();
                jjVar81 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.s.f.e.b(vVar, jjVar81.ea());
            case 673:
                jjVar82 = this.b.f308a;
                com.google.speech.i.c.d dVar4 = (com.google.speech.i.c.d) jj.kN(jjVar82).a();
                hVar113 = this.b.aG;
                com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar5 = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar113.a();
                jjVar83 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.s.f.b dZ = jjVar83.dZ();
                jjVar84 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.s.f.a dY = jjVar84.dY();
                jrVar11 = this.f309a.b;
                com.google.android.libraries.assistant.auto.tng.s.f.b.a.a aVar3 = (com.google.android.libraries.assistant.auto.tng.s.f.b.a.a) jr.ew(jrVar11).a();
                hVar114 = this.f309a.v;
                Executor executor7 = (Executor) hVar114.a();
                hVar115 = this.f309a.H;
                Executor executor8 = (Executor) hVar115.a();
                ik ikVar11 = this.b;
                Optional empty = Optional.empty();
                jjVar85 = ikVar11.f308a;
                h jo = jj.jo(jjVar85);
                jjVar86 = this.b.f308a;
                h jp = jj.jp(jjVar86);
                jrVar12 = this.f309a.b;
                h dQ = jr.dQ(jrVar12);
                jrVar13 = this.f309a.b;
                h cD = jr.cD(jrVar13);
                jrVar14 = this.f309a.b;
                h dD = jr.dD(jrVar14);
                hVar116 = this.b.ax;
                return new com.google.android.libraries.assistant.auto.tng.s.f.e.v(dVar4, gVar5, dZ, dY, aVar3, executor7, executor8, empty, jo, jp, dQ, cD, dD, (com.google.android.libraries.search.b.b) hVar116.a(), new com.google.android.libraries.assistant.auto.tng.s.f.a.b());
            case 674:
                hVar117 = this.f309a.kz;
                return com.google.android.libraries.assistant.soda.f.o.b((io.grpc.i) hVar117.a());
            case 675:
                hVar118 = this.f309a.f;
                Context context9 = (Context) hVar118.a();
                hVar119 = this.f309a.ml;
                e.a b6 = e.c.c.b(hVar119);
                jo joVar14 = this.f309a;
                hVar120 = joVar14.lS;
                hVar121 = joVar14.v;
                Executor executor9 = (Executor) hVar121.a();
                hVar122 = this.f309a.H;
                Executor executor10 = (Executor) hVar122.a();
                hVar123 = this.f309a.QS;
                return new com.google.android.libraries.assistant.auto.tng.s.f.c.a.d(context9, b6, hVar120, executor9, executor10, hVar123);
            case 676:
                hVar124 = this.f309a.f;
                Context context10 = (Context) hVar124.a();
                hVar125 = this.f309a.v;
                Executor executor11 = (Executor) hVar125.a();
                hVar126 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.s.f.f.a.e(context10, executor11, (Executor) hVar126.a(), new com.google.android.libraries.assistant.auto.tng.s.f.a.b());
            case 677:
                jjVar87 = this.b.f308a;
                return Boolean.valueOf(h.a.a.b.b.a.f.e(jjVar87.rN()));
            case 678:
                jjVar88 = this.b.f308a;
                return Boolean.valueOf(h.a.a.b.b.a.f.f(jjVar88.rN()));
            case 679:
                jrVar15 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.actionscache.a.c(jr.cI(jrVar15));
            case 680:
                jjVar89 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.actionscache.a.c cVar3 = (com.google.android.libraries.assistant.auto.tng.actionscache.a.c) jj.gM(jjVar89).a();
                hVar127 = this.b.ax;
                com.google.android.libraries.assistant.auto.tng.p.a.g gVar6 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar127.a();
                jrVar16 = this.f309a.b;
                return new com.google.android.libraries.assistant.auto.tng.actionscache.d.d(cVar3, gVar6, jr.dW(jrVar16));
            case 681:
                hVar128 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.actionscache.d.j((Executor) hVar128.a());
            case 682:
                ik ikVar12 = this.b;
                jo joVar15 = this.f309a;
                com.google.apps.tiktok.q.b.h c = com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.b.a.a.c();
                com.google.apps.tiktok.account.d.b.f kf = ikVar12.kf();
                hVar129 = joVar15.w;
                return com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.b.a.a.b(c, kf, (com.google.android.libraries.storage.a.j) hVar129.a());
            case 683:
                ik ikVar13 = this.b;
                jo joVar16 = this.f309a;
                com.google.apps.tiktok.q.b.h c2 = com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.b.b.a.c();
                com.google.apps.tiktok.account.d.b.f kf2 = ikVar13.kf();
                hVar130 = joVar16.w;
                return com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.b.b.a.b(c2, kf2, (com.google.android.libraries.storage.a.j) hVar130.a());
            case 684:
                jjVar90 = this.b.f308a;
                return h.a.a.b.b.a.c.r(jjVar90.sf());
            case 685:
                jjVar91 = this.b.f308a;
                return Boolean.valueOf(h.a.a.b.b.a.c.l(jjVar91.se()));
            case 686:
                jjVar92 = this.b.f308a;
                return Optional.of(jjVar92.dW());
            case 687:
                hVar131 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.c.a.a.d((Executor) hVar131.a());
            case 688:
                return com.google.android.libraries.assistant.auto.tng.ab.a.a.b();
            case 689:
                return h.a.a.b.b.a.f.d(this.b.xY());
            case 690:
                jjVar93 = this.b.f308a;
                return com.google.android.libraries.assistant.auto.tng.ab.a.a.c(jjVar93.qE());
            case 691:
                return Boolean.valueOf(h.a.a.b.b.a.c.d(this.b.yx()));
            case 692:
                return Boolean.valueOf(h.a.a.b.b.a.c.c(this.b.yx()));
            case 693:
                hVar132 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.b.a.a.e((Executor) hVar132.a());
            case 694:
                ik ikVar14 = this.b;
                jo joVar17 = this.f309a;
                com.google.apps.tiktok.q.b.h c3 = com.google.android.libraries.assistant.auto.tng.assistant.d.a.d.a.g.c();
                com.google.apps.tiktok.account.d.b.f kf3 = ikVar14.kf();
                hVar133 = joVar17.w;
                return com.google.android.libraries.assistant.auto.tng.assistant.d.a.d.a.g.b(c3, kf3, (com.google.android.libraries.storage.a.j) hVar133.a());
            case 695:
                jjVar94 = this.b.f308a;
                Object mh2 = jjVar94.mh();
                jjVar95 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.c.u dN = jjVar95.dN();
                jjVar96 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.a.i dL = jjVar96.dL();
                jjVar97 = this.b.f308a;
                Map mV = jjVar97.mV();
                jjVar98 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.b.a.a.e eVar3 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.b.a.a.e) jj.gJ(jjVar98).a();
                jjVar99 = this.b.f308a;
                h gR = jj.gR(jjVar99);
                hVar134 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.a.b((com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.a.f) mh2, dN, dL, mV, eVar3, gR, (Executor) hVar134.a(), this.b.fv());
            case 696:
                hVar135 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.c.w((Executor) hVar135.a());
            case 697:
                jjVar100 = this.b.f308a;
                com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.a.c dO2 = jjVar100.dO();
                hVar136 = this.f309a.H;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.a.m(dO2, (Executor) hVar136.a());
            case 698:
                jjVar101 = this.b.f308a;
                return Boolean.valueOf(h.a.a.b.b.a.f.h(jjVar101.rS()));
            case 699:
                jjVar102 = this.b.f308a;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.i.a.a.a.a(Optional.of((f) jj.gY(jjVar102).a()));
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        fu oVar;
        int i = this.c;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            default:
                switch (i) {
                    case 700:
                        jj jjVar = this.b.f308a;
                        h hVar = jjVar.gD;
                        com.google.android.libraries.assistant.auto.tng.l.bx rF = jjVar.rF();
                        Object a2 = hVar.a();
                        jo joVar = jjVar.f316a;
                        oVar = new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.b.o(rF, (com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.b.l) a2, new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.b.a.b(new mk(joVar), (com.google.cj.i.f) joVar.wr.a()), (com.google.android.libraries.assistant.auto.tng.l.g) this.b.f308a.gj.a(), (Executor) this.f309a.H.a(), (Map) this.b.dH.a());
                        break;
                    case 701:
                        Context context = (Context) this.f309a.f.a();
                        jj jjVar2 = this.b.f308a;
                        com.google.android.libraries.assistant.assistantactions.c.k kVar = new com.google.android.libraries.assistant.assistantactions.c.k(jjVar2.gA, (Context) jjVar2.f316a.f.a());
                        lt ltVar = (lt) this.b.f308a.gc.a();
                        jj jjVar3 = this.b.f308a;
                        com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.a.b bVar = new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.a.b((cg) jjVar3.gB.a(), (Executor) jjVar3.f316a.H.a());
                        Map map = (Map) this.b.dH.a();
                        Executor executor = (Executor) this.f309a.H.a();
                        jo joVar2 = this.f309a;
                        ik ikVar = this.b;
                        jr jrVar = joVar2.b;
                        oVar = new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.b.l(context, kVar, ltVar, bVar, map, executor, jrVar.jq, jrVar.jr, jrVar.js, jrVar.jt, jrVar.ju, jrVar.jv, jrVar.jw, jrVar.fz, ikVar.f308a.gC);
                        break;
                    case 702:
                        oVar = new nt(this.f309a);
                        break;
                    case 703:
                        com.google.apps.tiktok.q.b.g a3 = com.google.apps.tiktok.q.b.h.a();
                        a3.f5883a = "FluidActionsStore";
                        a3.c(com.google.android.libraries.assistant.assistantactions.c.a.c.a);
                        oVar = this.b.kf().a(a3.a(), (com.google.android.libraries.storage.a.j) this.f309a.w.a());
                        break;
                    case 704:
                        oVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45460753").f());
                        break;
                    case 705:
                        oVar = new com.google.android.libraries.assistant.auto.tng.f.a.a.a.b((ag) this.f309a.Q.a());
                        break;
                    case 706:
                        oVar = new com.google.android.libraries.assistant.auto.tng.q.a.a.b.l((cq) this.f309a.H.a(), this.b.f308a.gI, this.f309a.b.jC);
                        break;
                    case 707:
                        jj jjVar4 = this.b.f308a;
                        com.google.speech.g.bn q = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(jjVar4.b.V, (com.google.apps.tiktok.p.m) jjVar4.f316a.b.jA.a(), (com.google.apps.tiktok.p.u) jjVar4.f316a.mh.a(), (com.google.frameworks.client.data.android.d) jjVar4.f316a.mb.a(), com.google.common.base.a.a);
                        q.getClass();
                        oVar = (com.google.speech.g.bn) q.I(new io.grpc.l[]{new io.grpc.j.q((cx) this.f309a.b.jB.a())}).J(com.google.frameworks.client.data.android.d.e.a, new com.google.frameworks.client.data.android.d.h());
                        oVar.getClass();
                        break;
                    case 708:
                        oVar = new com.google.android.libraries.assistant.auto.jumpboost.f.d((com.google.android.libraries.assistant.auto.jumpboost.f.b) this.b.f308a.gK.a());
                        break;
                    case 709:
                        com.google.android.libraries.search.assistant.aq.g.a.g gVar = new com.google.android.libraries.search.assistant.aq.g.a.g(this.f309a.f319a.ea());
                        com.google.android.libraries.search.assistant.aq.i.b.d dVar = (com.google.android.libraries.search.assistant.aq.i.b.d) this.f309a.kw.a();
                        jo joVar3 = this.f309a;
                        h hVar2 = this.b.ax;
                        com.google.android.gms.search.queries.d cO = joVar3.f319a.cO();
                        com.google.android.libraries.assistant.auto.tng.p.a.g gVar2 = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar2.a();
                        jr jrVar2 = this.f309a.b;
                        oVar = new com.google.android.libraries.assistant.auto.jumpboost.f.b(gVar, dVar, cO, gVar2, jrVar2.lc, jrVar2.ld, jrVar2.le, jrVar2.lf);
                        break;
                    case 710:
                        oVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45531754").f());
                        break;
                    case 711:
                        jo joVar4 = this.f309a;
                        oVar = new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.c.b.b.a.a(new mg(joVar4, this.b), (com.google.cj.i.f) joVar4.wr.a(), (Map) this.b.dH.a());
                        break;
                    case 712:
                        jo joVar5 = this.f309a;
                        oVar = new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.c.b.a.a(new mg(joVar5, this.b), (com.google.cj.i.f) joVar5.wr.a(), (Map) this.b.dH.a());
                        break;
                    case 713:
                        oVar = new com.google.android.libraries.assistant.auto.tng.s.c.c.a.a((NotificationManager) this.f309a.I.a(), (Context) this.f309a.f.a(), this.f309a.b.lp);
                        break;
                    case 714:
                        jj jjVar5 = this.b.f308a;
                        Optional empty = Optional.empty();
                        Optional empty2 = Optional.empty();
                        jjVar5.dX();
                        jj jjVar6 = this.b.f308a;
                        jo joVar6 = jjVar6.f316a;
                        com.google.android.libraries.assistant.auto.tng.s.e.c.a.d dX = jjVar6.dX();
                        Executor executor2 = (Executor) joVar6.H.a();
                        jr jrVar3 = jjVar6.f316a.b;
                        com.google.android.libraries.assistant.auto.tng.s.e.a.a.d dVar2 = new com.google.android.libraries.assistant.auto.tng.s.e.a.a.d(jrVar3.lr, jrVar3.ls, dX, executor2);
                        jj jjVar7 = this.b.f308a;
                        com.google.android.libraries.assistant.auto.tng.s.e.a.e.h hVar3 = new com.google.android.libraries.assistant.auto.tng.s.e.a.e.h((PackageManager) jjVar7.f316a.h.a(), jjVar7.dX(), (Executor) jjVar7.f316a.H.a());
                        jj jjVar8 = this.b.f308a;
                        jo joVar7 = jjVar8.f316a;
                        e.a b = e.c.c.b(joVar7.h);
                        jo joVar8 = jjVar8.f316a;
                        com.google.android.libraries.assistant.auto.tng.s.e.c.a.d dX2 = jjVar8.dX();
                        Executor executor3 = (Executor) joVar8.H.a();
                        jr jrVar4 = joVar7.b;
                        com.google.android.libraries.assistant.auto.tng.s.e.a.f.d dVar3 = new com.google.android.libraries.assistant.auto.tng.s.e.a.f.d(jrVar4.lt, jrVar4.lu, b, dX2, executor3);
                        jj jjVar9 = this.b.f308a;
                        com.google.android.libraries.assistant.auto.tng.s.e.a.d.k kVar2 = new com.google.android.libraries.assistant.auto.tng.s.e.a.d.k((Executor) jjVar9.f316a.H.a(), (PackageManager) jjVar9.f316a.h.a(), jjVar9.dX(), new com.google.android.libraries.assistant.auto.tng.s.e.d.d(Optional.of(jjVar9.dV())), new com.google.android.libraries.assistant.auto.tng.s.e.d.i(Optional.of(jjVar9.dV()), (Executor) jjVar9.f316a.H.a(), (com.google.android.libraries.assistant.auto.tng.w.e.a.b) jjVar9.b.aI.a()));
                        jj jjVar10 = this.b.f308a;
                        oVar = new com.google.android.libraries.assistant.auto.tng.s.e.a.b.g(empty, empty2, dVar2, hVar3, dVar3, kVar2, new com.google.android.libraries.assistant.auto.tng.s.e.a.c.c(jjVar10.dX(), (Executor) jjVar10.f316a.H.a()), new com.google.android.libraries.assistant.auto.tng.s.e.a.g.b((Executor) this.b.f308a.f316a.H.a()), (Executor) this.f309a.H.a(), (com.google.android.libraries.assistant.auto.tng.s.c.a.a.a) this.f309a.b.jb.a());
                        break;
                    case 715:
                        oVar = false;
                        break;
                    case 716:
                        oVar = new com.google.android.libraries.assistant.auto.tng.assistant.d.b.d.c.a.c(this.b.f308a.mT(), (Executor) this.f309a.H.a());
                        break;
                    case 717:
                        oVar = com.google.speech.recognizer.a.z.k;
                        oVar.getClass();
                        break;
                    case 718:
                        oVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45621613").b());
                        break;
                    case 719:
                        oVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.b.l).a.a()).a("assistant_auto_tng_libraries_user 45630060").f());
                        break;
                    case 720:
                        oVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.b.f308a.b.l.a()).a("assistant_auto_tng_libraries_user 45368869").f());
                        break;
                    case 721:
                        oVar = new com.google.android.libraries.assistant.auto.jumpboost.f.c((com.google.android.libraries.g.a) this.f309a.g.a(), 0);
                        break;
                    case 722:
                        oVar = new com.google.android.libraries.assistant.auto.jumpboost.f.c((com.google.android.libraries.assistant.auto.jumpboost.f.d) this.b.f308a.gL.a(), 1);
                        break;
                    case 723:
                        oVar = fu.m(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, this.b.gq);
                        break;
                    default:
                        throw new AssertionError(i);
                }
                return oVar;
        }
    }
}
