package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.os.MessageQueue;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import androidx.core.d.e$;
import com.google.android.apps.gsa.assistant.settings.features.ao.ay;
import com.google.android.apps.gsa.contacts.bf;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.t;
import com.google.android.apps.gsa.search.shared.service.x;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.o.g;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bk;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.bu;
import com.google.android.apps.search.assistant.surfaces.dictation.service.g.af;
import com.google.android.apps.search.assistant.surfaces.voice.robin.x.bg;
import com.google.android.gms.auth.k;
import com.google.android.gms.common.v;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ad;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l;
import com.google.android.libraries.assistant.auto.tng.ui.b.a.d;
import com.google.android.libraries.assistant.auto.tng.ui.b.a.e;
import com.google.android.libraries.g.a;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.search.ah.b.e.bl;
import com.google.android.libraries.search.ah.b.e.bm;
import com.google.android.libraries.search.assistant.av.d.a.w;
import com.google.android.libraries.search.assistant.bb.a.aq;
import com.google.android.libraries.search.assistant.bb.a.ax;
import com.google.android.libraries.search.assistant.invocation.f.b.ah;
import com.google.android.libraries.search.assistant.invocation.f.b.j;
import com.google.android.libraries.search.assistant.invocation.p.bb;
import com.google.android.libraries.search.assistant.invocation.p.bv;
import com.google.android.libraries.search.assistant.invocation.u.d.al;
import com.google.android.libraries.search.assistant.invocation.u.d.ar;
import com.google.android.libraries.search.assistant.invocation.u.e.a.z;
import com.google.android.libraries.search.rendering.xuikit.bubbles.b.b.ak;
import com.google.android.libraries.search.rendering.xuikit.c.h.ac;
import com.google.android.libraries.search.rendering.xuikit.xblend.b.o;
import com.google.android.libraries.search.t.c.ai;
import com.google.android.libraries.search.t.c.u;
import com.google.android.libraries.search.t.i.y;
import com.google.android.libraries.speech.transcription.g.br;
import com.google.android.libraries.speech.transcription.voiceime.ab;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.account.api.controller.be;
import com.google.apps.tiktok.concurrent.ao;
import com.google.apps.tiktok.experiments.phenotype.ae;
import com.google.apps.tiktok.experiments.phenotype.dc;
import com.google.apps.tiktok.f.q;
import com.google.apps.tiktok.i.a.f;
import com.google.apps.tiktok.media.contrib.cronet.b;
import com.google.apps.tiktok.p.c;
import com.google.apps.tiktok.p.i;
import com.google.apps.tiktok.tracing.dj;
import com.google.bz.k.b.c.s;
import com.google.common.b.fu;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.base.ca;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.speech.g.bn;
import com.google.speech.g.bp;
import e.c.h;
import h.a.a.b.a.a.r;
import h.a.a.r.a.a.m;
import io.grpc.cb;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.ag;
import m.a.aa;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/jw.class */
public final class jw implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f324a;
    private final int b;

    public jw(jo joVar, int i) {
        this.f324a = joVar;
        this.b = i;
    }

    private final Object b() {
        Set set;
        int i = this.b;
        switch (i) {
            case 0:
                return new f(this.f324a.c.b);
            case 1:
                return new id(this.f324a);
            case 2:
                return new d((e) this.f324a.nf.a());
            case 3:
                return new i((cq) this.f324a.n.a(), (cq) this.f324a.H.a(), (k) this.f324a.bx.a(), c.a("oauth2:https://www.googleapis.com/auth/photos.image.readonly"), (com.google.apps.tiktok.account.data.a.d) this.f324a.bq.a(), (a) this.f324a.g.a());
            case 4:
                return new com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.a.a.d((com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.a.a.e) this.f324a.b.b.a());
            case 5:
                jo joVar = this.f324a;
                return new com.google.android.libraries.lens.view.geller.imageloader.e(joVar.f, joVar.H);
            case 6:
                return new com.google.apps.tiktok.account.data.a.a.h((Context) this.f324a.f.a(), 0);
            case 7:
                return new b(e.c.c.b(this.f324a.ax));
            case 8:
                jx jxVar = this.f324a.c;
                boolean f = ((com.google.apps.tiktok.experiments.e) jxVar.f325a.f319a.ss().a.a()).a("com.google.android.libraries.search.device 45652057").f();
                com.google.android.libraries.search.t.b.a.e eVar = new com.google.android.libraries.search.t.b.a.e((ai) jxVar.f325a.wf.a());
                if (f) {
                    set = Collections.singleton(eVar);
                    set.getClass();
                } else {
                    set = aa.a;
                }
                return ha.o(set);
            case 9:
                jo joVar2 = this.f324a;
                u ln = joVar2.ln();
                com.google.android.apps.search.googleapp.launcher.c.e.c Y = joVar2.b.Y();
                a aVar = (a) joVar2.g.a();
                Context context = (Context) this.f324a.f.a();
                Executor executor = (Executor) this.f324a.H.a();
                boolean f2 = ((com.google.apps.tiktok.experiments.e) new m(this.f324a.c.f325a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 42").f();
                jo joVar3 = this.f324a;
                return new com.google.android.apps.search.googleapp.launcher.c.b.c(ln, Y, aVar, context, executor, f2, joVar3.c.dK(), joVar3.c.l());
            case 10:
                x xVar = (x) this.f324a.hI.a();
                l lVar = (l) this.f324a.f9do.a();
                Context context2 = (Context) this.f324a.f.a();
                a aVar2 = (a) this.f324a.g.a();
                dj djVar = (dj) this.f324a.bK.a();
                com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa aaVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) this.f324a.dp.a();
                boolean f3 = ((com.google.apps.tiktok.experiments.e) this.f324a.c.gl().a.a()).a("assistant_auto_tng_libraries_device 45426770").f();
                xVar.getClass();
                lVar.getClass();
                context2.getClass();
                aVar2.getClass();
                djVar.getClass();
                aaVar.getClass();
                com.google.android.libraries.assistant.auto.jumpboost.b.a.h hVar = new com.google.android.libraries.assistant.auto.jumpboost.b.a.h(f3, context2, aVar2, djVar, aaVar, lVar);
                com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
                dVar.f1344a = 9117150417520352L;
                dVar.c = com.google.common.o.or.p;
                dVar.d = "car_assistant";
                return xVar.a(hVar, null, new ClientConfig(dVar));
            case 11:
                y yVar = (y) this.f324a.W.a();
                jo joVar4 = this.f324a;
                return new com.google.android.libraries.assistant.auto.jumpboost.b.a.d(yVar, joVar4.c.fX(), (t) joVar4.c.l.a(), (g) this.f324a.gV.a(), (com.google.android.apps.gsa.speech.k.a) this.f324a.hY.a(), (p) this.f324a.gq.a(), (ag) this.f324a.c.m.a());
            case 12:
                return q.b((n) this.f324a.qN.a());
            case 13:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45366324").f());
            case 14:
                return Boolean.valueOf(((p) this.f324a.gq.a()).w(com.google.android.apps.gsa.shared.k.dj.F));
            case 15:
                return Boolean.valueOf(((p) this.f324a.gq.a()).w(com.google.android.apps.gsa.shared.k.dj.u));
            case 16:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.a.a(new com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.c(this.f324a.c.f325a.iu), (a) this.f324a.g.a());
            case 17:
                return Boolean.valueOf(((p) this.f324a.gq.a()).w(com.google.android.apps.gsa.shared.k.dj.ao));
            case 18:
                return new ad();
            case 19:
                return Boolean.valueOf(((p) this.f324a.gq.a()).w(com.google.android.apps.gsa.shared.k.dj.A));
            case 20:
                return ((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45598658").d();
            case 21:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sC().a.a()).a("assistant_auto_tng_libraries_device 45355309").f());
            case 22:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.gl().a.a()).a("assistant_auto_tng_libraries_device 45412607").f());
            case 23:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.gH().a.a()).a("assistant_auto_tng_libraries_device 45355060").b());
            case 24:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("assistant_auto_tng_libraries_device 45402550").f());
            case 25:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45422825").f());
            case 26:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.gH().a.a()).a("assistant_auto_tng_libraries_device 45369770").f());
            case 27:
                return Long.valueOf(((p) this.f324a.gq.a()).i(com.google.android.apps.gsa.shared.k.dj.J));
            case 28:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.i((Context) this.f324a.f.a(), (y) this.f324a.W.a(), (cr) this.f324a.H.a(), this.f324a.c.D);
            case 29:
                return ((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45401434").d();
            case 30:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45430851").f());
            case 31:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45368875").f());
            case 32:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45382475").f());
            case 33:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45401744").f());
            case 34:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.a.a.c.d(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45648858").f());
            case 35:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45632462").f());
            case 36:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45654729").f());
            case 37:
                return new w();
            case 38:
                return new com.google.android.libraries.search.assistant.h.a.g((Context) this.f324a.f.a(), (Executor) this.f324a.v.a(), ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.b.iP().a.a()).a("com.google.android.apps.search.assistant.device 45648735").f());
            case 39:
                return new com.google.android.libraries.search.assistant.h.b.a.n((Context) this.f324a.f.a(), (Executor) this.f324a.v.a());
            case 40:
                bn a2 = com.google.android.libraries.assistant.c.e.a.a.a.a((bn) this.f324a.c.M.a(), (Context) this.f324a.f.a());
                a2.getClass();
                return a2;
            case 41:
                jo joVar5 = this.f324a;
                bn q = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(joVar5.mf, (com.google.apps.tiktok.p.m) joVar5.c.L.a(), (com.google.apps.tiktok.p.u) this.f324a.mh.a(), (com.google.frameworks.client.data.android.d) this.f324a.mb.a(), com.google.common.base.a.a);
                q.getClass();
                return q;
            case 42:
                com.google.common.q.m a3 = com.google.android.libraries.search.n.a.a("s3.grpc.url", this.f324a.b.iP().C(), 443);
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.a = a3.a;
                lVar2.b = Integer.valueOf(a3.a());
                lVar2.b(com.google.speech.g.d.b.e);
                return lVar2.a();
            case 43:
                return new com.google.android.apps.search.assistant.surfaces.e.d.f.f();
            case 44:
                h.a.a.f.a.a.w gC = this.f324a.c.gC();
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.a = gC.u();
                lVar3.b = Integer.valueOf((int) gC.s());
                lVar3.b(com.google.g.v.a.b.b.c);
                return lVar3.a();
            case 45:
                ag agVar = (ag) this.f324a.bo.a();
                jo joVar6 = this.f324a;
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.b.k(agVar, joVar6.b.aI(), joVar6.c.cZ(), joVar6.c.dd(), joVar6.c.dh());
            case 46:
                a aVar3 = (a) this.f324a.g.a();
                ag agVar2 = (ag) this.f324a.Q.a();
                com.google.android.libraries.search.assistant.bb.a.n nVar = (com.google.android.libraries.search.assistant.bb.a.n) this.f324a.c.R.a();
                com.google.android.libraries.search.assistant.invocation.u.h.a.c.c cVar = (com.google.android.libraries.search.assistant.invocation.u.h.a.c.c) this.f324a.c.T.a();
                jo joVar7 = this.f324a;
                com.google.android.libraries.search.assistant.invocation.u.h.a.b.a.b as = joVar7.c.as();
                com.google.android.libraries.search.d.c.a.e kv = joVar7.kv();
                j aq = joVar7.c.aq();
                ah ar = joVar7.c.ar();
                com.google.android.libraries.search.assistant.invocation.m.a.f fVar = (com.google.android.libraries.search.assistant.invocation.m.a.f) joVar7.fR.a();
                jo joVar8 = this.f324a;
                return new aq(aVar3, agVar2, nVar, cVar, as, kv, aq, ar, fVar, joVar8.c.av(), (ax) joVar8.b.fP.a(), ((com.google.apps.tiktok.experiments.e) this.f324a.c.gD().a.a()).a("com.google.android.apps.search.assistant.device 45517830").f(), this.f324a.c.gD().v());
            case 47:
                return new com.google.android.libraries.search.assistant.bb.a.n();
            case 48:
                z zVar = (z) this.f324a.fV.a();
                com.google.android.libraries.search.assistant.invocation.u.h.b.c.j jVar = (com.google.android.libraries.search.assistant.invocation.u.h.b.c.j) this.f324a.td.a();
                jo joVar9 = this.f324a;
                com.google.android.libraries.search.assistant.invocation.u.h.a.c.a.e at = joVar9.c.at();
                boolean f4 = ((com.google.apps.tiktok.experiments.e) joVar9.c.gD().a.a()).a("com.google.android.apps.search.assistant.device 45418244").f();
                jo joVar10 = this.f324a;
                return new com.google.android.libraries.search.assistant.invocation.u.h.a.c.a.w(zVar, jVar, at, f4, joVar10.agv(), (ag) joVar10.Q.a(), this.f324a.c.gD().v());
            case 49:
                return new com.google.android.libraries.search.assistant.bb.a.m((ag) this.f324a.Q.a());
            case 50:
                return new com.google.android.apps.search.assistant.surfaces.voice.i.g.c.j();
            case 51:
                return new com.google.android.apps.search.assistant.platform.appintegration.d.b((a) this.f324a.g.a());
            case 52:
                com.google.apps.tiktok.q.b.g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "VoiceSettingsStore";
                a4.c(com.google.android.apps.search.googleapp.search.voicesearch.d.a.i.a);
                com.google.apps.tiktok.q.b.h a5 = a4.a();
                jo joVar11 = this.f324a;
                return joVar11.nb().a(a5, (com.google.android.libraries.storage.a.j) joVar11.w.a());
            case 53:
                h.a.a.f.a.a.w gC2 = this.f324a.c.gC();
                com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                lVar4.a = gC2.u();
                lVar4.b = Integer.valueOf((int) gC2.s());
                lVar4.b(com.google.g.v.a.a.a.b.c);
                return lVar4.a();
            case 54:
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.b.c((com.google.android.apps.gsa.shared.k.c) this.f324a.gq.a(), (com.google.android.libraries.assistant.pcp.q.a.ah) this.f324a.oQ.a(), (com.google.android.libraries.assistant.pcp.q.a.k) this.f324a.om.a(), (cq) this.f324a.nO.a());
            case 55:
                return new com.google.android.apps.gsa.l.c.b((com.google.android.apps.gsa.l.b) this.f324a.ly.a(), (com.google.apps.tiktok.account.data.a.d) this.f324a.bq.a(), (cq) this.f324a.v.a());
            case 56:
                return new com.google.android.apps.gsa.l.c.e((com.google.android.apps.gsa.l.b) this.f324a.ly.a(), (com.google.apps.tiktok.account.data.a.d) this.f324a.bq.a(), (cq) this.f324a.v.a());
            case 57:
                com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.d.a.m mVar = (com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.d.a.m) this.f324a.nT.a();
                jo joVar12 = this.f324a;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.b.f(mVar, joVar12.dJ(), joVar12.dI(), (com.google.android.apps.gsa.shared.k.c) joVar12.gq.a(), (cq) this.f324a.nO.a());
            case 58:
                jo joVar13 = this.f324a;
                return new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.b.i(joVar13.dJ(), joVar13.dN(), (com.google.android.apps.gsa.shared.k.c) joVar13.gq.a(), (cq) this.f324a.nO.a());
            case 59:
                return new com.google.android.apps.gsa.staticplugins.opa.zerostate.c.b((com.google.android.apps.gsa.staticplugins.opa.bg.r) this.f324a.oO.a(), (cq) this.f324a.H.a());
            case 60:
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.ag((com.google.common.v.f) this.f324a.ez.a(), (a) this.f324a.g.a());
            case 61:
                return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.u();
            case 62:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.apps.search.assistant.device 45384097").f());
            case 63:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.apps.search.assistant.device 45532357").f());
            case 64:
                return new bu(e.c.c.b(this.f324a.uO), (com.google.common.v.f) this.f324a.ez.a());
            case 65:
                return ((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.apps.search.assistant.device 45423715").d();
            case 66:
                jo joVar14 = this.f324a;
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c(joVar14.y(), (n) joVar14.R.a());
            case 67:
                com.google.android.play.core.f.q a6 = com.google.android.play.core.f.m.a((Context) this.f324a.f.a()).a();
                a6.getClass();
                return a6;
            case 68:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.z.ai((Context) this.f324a.f.a());
            case 69:
                return new com.google.android.libraries.search.assistant.az.b.a.b.b((Context) this.f324a.f.a());
            case 70:
                InputMethodManager inputMethodManager = (InputMethodManager) ((Context) this.f324a.f.a()).getSystemService("input_method");
                inputMethodManager.getClass();
                return inputMethodManager;
            case 71:
                return new af();
            case 72:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.y.a.c();
            case 73:
                return new js();
            case 74:
                return new com.google.android.apps.search.assistant.verticals.automation.routines.d.a.b((Context) this.f324a.f.a(), (cq) this.f324a.v.a());
            case 75:
                bl blVar = bm.f3679a;
                blVar.getClass();
                return blVar;
            case 76:
                return new com.google.android.libraries.search.ah.l.c();
            case 77:
                return new com.google.android.libraries.search.ah.l.c();
            case 78:
                com.google.apps.tiktok.q.b.g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "ga_partnertab_last_tab_selection";
                a7.c(com.google.android.apps.search.googleapp.launcher.partnertab.b.f.a);
                com.google.apps.tiktok.q.b.h a8 = a7.a();
                jo joVar15 = this.f324a;
                return joVar15.nb().a(a8, (com.google.android.libraries.storage.a.j) joVar15.w.a());
            case 79:
                com.google.apps.tiktok.p.l lVar5 = new com.google.apps.tiktok.p.l();
                lVar5.b(com.google.bz.h.a.a.a.c.I);
                return lVar5.a();
            case 80:
                com.google.apps.tiktok.p.l lVar6 = new com.google.apps.tiktok.p.l();
                lVar6.b(com.google.aw.k.c.b.a.a.b.f);
                return lVar6.a();
            case 81:
                com.google.apps.tiktok.p.l lVar7 = new com.google.apps.tiktok.p.l();
                lVar7.b(com.google.aw.k.c.c.a.a.a.b.i);
                return lVar7.a();
            case 82:
                String e = ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("com.google.android.libraries.search.googleapp.device 11").e();
                long b = ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("com.google.android.libraries.search.googleapp.device 12").b();
                com.google.apps.tiktok.p.l lVar8 = new com.google.apps.tiktok.p.l();
                lVar8.a = e;
                lVar8.b = Integer.valueOf((int) b);
                lVar8.b(com.google.bz.h.a.a.a.c.I);
                return lVar8.a();
            case 83:
                com.google.apps.tiktok.p.l lVar9 = new com.google.apps.tiktok.p.l();
                lVar9.b(com.google.ch.a.a.a.a.a.b.c);
                return lVar9.a();
            case 84:
                return new com.google.android.apps.search.googleapp.saves.gallery.c.b((Context) this.f324a.f.a());
            case 85:
                return new com.google.android.apps.search.googleapp.search.srp.o.c.b.b();
            case 86:
                return new com.google.android.apps.search.googleapp.search.voicesearch.b.c((cq) this.f324a.v.a(), this.f324a.f319a.o());
            case 87:
                com.google.android.apps.search.googleapp.search.searchcatalog.b.a aVar4 = (com.google.android.apps.search.googleapp.search.searchcatalog.b.a) this.f324a.c.aB.a();
                aVar4.getClass();
                com.google.apps.tiktok.p.l lVar10 = new com.google.apps.tiktok.p.l();
                lVar10.b(com.google.aw.k.c.a.a.a.b.c);
                lVar10.a = aVar4.a;
                lVar10.b = Integer.valueOf(aVar4.b);
                return lVar10.a();
            case 88:
                return new com.google.android.apps.search.googleapp.search.searchcatalog.b.a(((com.google.apps.tiktok.experiments.e) this.f324a.c.gG().a.a()).a("com.google.android.libraries.search.googleapp.device 45633245").e(), (int) ((com.google.apps.tiktok.experiments.e) this.f324a.c.gG().a.a()).a("com.google.android.libraries.search.googleapp.device 45633246").b());
            case 89:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jg().a.a()).a("com.google.android.libraries.search.googleapp.device 45654985").f());
            case 90:
                return new com.google.android.libraries.az.a.a.h((com.google.android.libraries.az.a.a.c) this.f324a.c.aF.a());
            case 91:
                return new com.google.android.libraries.az.a.a.c(new com.google.android.libraries.az.a.a.a((com.google.android.libraries.az.a.a.g) this.f324a.c.aE.a()), new com.google.android.libraries.az.a.a.b());
            case 92:
                return new com.google.android.libraries.az.a.a.g((Context) this.f324a.f.a(), (cq) this.f324a.v.a());
            case 93:
                return new com.google.android.apps.search.googleapp.z.f();
            case 94:
                jo joVar16 = this.f324a;
                String cQ = joVar16.c.cQ();
                long s = joVar16.c.s();
                Optional empty = Optional.empty();
                com.google.apps.tiktok.p.l lVar11 = new com.google.apps.tiktok.p.l();
                lVar11.a = ((com.google.android.apps.search.googleapp.stampviewer.i.a) empty.orElse(new com.google.android.apps.search.googleapp.stampviewer.i.a(cQ))).a;
                lVar11.b = Integer.valueOf((int) s);
                lVar11.b(com.google.aw.d.b.e.a.a.b.c);
                return lVar11.a();
            case 95:
                return new com.google.android.apps.search.googleapp.stampviewer.l.n();
            case 96:
                jo joVar17 = this.f324a;
                String cQ2 = joVar17.c.cQ();
                long s2 = joVar17.c.s();
                Optional empty2 = Optional.empty();
                com.google.apps.tiktok.p.l lVar12 = new com.google.apps.tiktok.p.l();
                lVar12.a = ((com.google.android.apps.search.googleapp.stampviewer.i.a) empty2.orElse(new com.google.android.apps.search.googleapp.stampviewer.i.a(cQ2))).a;
                lVar12.b = Integer.valueOf((int) s2);
                lVar12.b(com.google.aw.d.b.d.a.a.b.d);
                return lVar12.a();
            case 97:
                com.google.common.f.a.d dVar2 = com.google.android.libraries.logging.ve.e.e.a.b.a;
                return new com.google.android.libraries.logging.ve.synthetic.i((com.google.android.libraries.logging.ve.y) this.f324a.ql.a());
            case 98:
                com.google.apps.tiktok.p.l lVar13 = new com.google.apps.tiktok.p.l();
                lVar13.a = "discover-pa.googleapis.com";
                lVar13.b = 443;
                lVar13.b(com.google.aw.d.b.d.a.a.b.d);
                return lVar13.a();
            case 99:
                return new AtomicInteger(1);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case 100:
                return new com.google.android.apps.search.omnient.searchresults.b.a.a.b((Context) this.f324a.f.a());
            case 101:
                return new com.google.android.libraries.search.lens.c.d((ag) this.f324a.Q.a());
            case 102:
                jo joVar = this.f324a;
                return new com.google.android.libraries.search.lens.g.a.b.a(joVar.c.bh(), (cr) joVar.vz.a());
            case 103:
                com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                lVar.b(com.google.translate.a.a.a.b.h);
                return lVar.a();
            case 104:
                com.google.apps.tiktok.q.b.g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "LensLanguageNameCache";
                a2.c(com.google.android.libraries.search.lens.g.a.a.b.a);
                com.google.apps.tiktok.q.b.h a3 = a2.a();
                jo joVar2 = this.f324a;
                return joVar2.nb().a(a3, (com.google.android.libraries.storage.a.j) joVar2.w.a());
            case 105:
                ag agVar = (ag) this.f324a.Q.a();
                jo joVar3 = this.f324a;
                return new com.google.android.apps.search.omnient.host.activity.t(agVar, joVar3.b.be(), (com.google.common.v.f) joVar3.ez.a());
            case 106:
                jo joVar4 = this.f324a;
                com.google.frameworks.client.data.android.server.w nT = joVar4.nT();
                io.grpc.b.a c = io.grpc.b.a.c("com.google.android.apps.pixel.agent", "com.google.android.apps.pixel.agent.server.PearlService");
                Context context = (Context) joVar4.f.a();
                cq cqVar = (cq) this.f324a.v.a();
                context.getClass();
                cqVar.getClass();
                cb a4 = nT.a(c, io.grpc.b.c.a, com.google.frameworks.client.data.android.b.g.a(context, new op("com.google.android.apps.pixel.agent"), cqVar), io.grpc.b.h.a);
                a4.getClass();
                return a4;
            case 107:
                Context context2 = (Context) this.f324a.f.a();
                context2.getClass();
                return new com.google.knowledge.e.a.a.a(new com.google.knowledge.e.a.a.a.b(context2));
            case 108:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.ab.a.a.b(this.f324a.c.f325a.V).a.a()).a("com.google.android.apps.podcasts_android.device 45414183").f());
            case 109:
                return new com.google.android.apps.search.pronunciationlearning.ui.shared.d();
            case 110:
                return new com.google.android.apps.search.pronunciationlearning.b.c((a) this.f324a.g.a());
            case 111:
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.a = "pronto-pa.googleapis.com";
                lVar2.b = 443;
                lVar2.b(com.google.aw.k.c.e.a.a.b.d);
                return lVar2.a();
            case 112:
                return new com.google.android.apps.search.pronunciationlearning.d.d((Context) this.f324a.f.a(), (cq) this.f324a.v.a());
            case 113:
                jo joVar5 = this.f324a;
                String cR = joVar5.c.cR();
                long x = joVar5.c.x();
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.a = cR;
                lVar3.b = Integer.valueOf((int) x);
                lVar3.b(g.b.a.a.a.b.i);
                return lVar3.a();
            case 114:
                com.google.apps.tiktok.q.b.g a5 = com.google.apps.tiktok.q.b.h.a();
                a5.f5883a = "ReadaloudSettings";
                a5.c(com.google.android.apps.search.readaloud.g.a.a);
                com.google.apps.tiktok.q.b.h a6 = a5.a();
                jo joVar6 = this.f324a;
                return joVar6.nb().a(a6, (com.google.android.libraries.storage.a.j) joVar6.w.a());
            case 115:
                com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                lVar4.b(com.google.protos.ap.b.a.a.b.c);
                return lVar4.a();
            case 116:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.gI().a.a()).a("assistant_auto_tng_libraries_device 45623880").f());
            case 117:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.gI().a.a()).a("assistant_auto_tng_libraries_device 45623923").f());
            case 118:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45401771").f());
            case 119:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45374043").b());
            case 120:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45387387").b());
            case 121:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45353766").b());
            case 122:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45361109").b());
            case 123:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45357013").b());
            case 124:
                e.c.c.b(this.f324a.c.bj);
                return new com.google.android.libraries.assistant.auto.tng.ac.b.a.a();
            case 125:
                return new com.google.android.libraries.assistant.auto.tng.ac.b.b.a();
            case 126:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45613731").f());
            case 127:
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance((Context) this.f324a.f.a());
                appWidgetManager.getClass();
                return appWidgetManager;
            case 128:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sC().a.a()).a("assistant_auto_tng_libraries_device 45353889").f());
            case 129:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45364994").f());
            case 130:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.gK().a.a()).a("assistant_auto_tng_libraries_device 45373865").f());
            case 131:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45423814").f());
            case 132:
                return ((com.google.apps.tiktok.experiments.e) this.f324a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45462636").d();
            case 133:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45531114").f());
            case 134:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45619402").f());
            case 135:
                String fk = this.f324a.b.fk();
                com.google.apps.tiktok.p.l lVar5 = new com.google.apps.tiktok.p.l();
                lVar5.a = fk;
                lVar5.b = 443;
                lVar5.b(com.google.aw.g.a.a.a.b.k);
                return lVar5.a();
            case 136:
                jo joVar7 = this.f324a;
                return new com.google.android.libraries.lens.view.bi.b(joVar7.vY, (Executor) joVar7.vz.a());
            case 137:
                return new com.google.android.libraries.ba.a.b();
            case 138:
                return new com.google.android.libraries.lens.view.camera.e.l((Context) this.f324a.f.a());
            case 139:
                jo joVar8 = this.f324a;
                return com.google.android.apps.k.a.a.a.d.a.a(joVar8.c.cs(), joVar8.c.ct(), ((com.google.apps.tiktok.experiments.e) joVar8.c.gx().a.a()).a("com.google.android.libraries.search.device 45428472").e(), (Context) this.f324a.f.a());
            case 140:
                String e = ((com.google.apps.tiktok.experiments.e) this.f324a.c.gx().a.a()).a("com.google.android.libraries.search.device 45428473").e();
                long b = ((com.google.apps.tiktok.experiments.e) this.f324a.c.gx().a.a()).a("com.google.android.libraries.search.device 45428474").b();
                com.google.apps.tiktok.p.l lVar6 = new com.google.apps.tiktok.p.l();
                lVar6.a = e;
                lVar6.b = Integer.valueOf((int) b);
                lVar6.b(g.b.a.a.a.b.i);
                return lVar6.a();
            case 141:
                jo joVar9 = this.f324a;
                com.google.frameworks.client.data.android.server.w nT2 = joVar9.nT();
                io.grpc.b.a c2 = io.grpc.b.a.c("com.google.android.apps.pixel.agent", "com.google.android.apps.pixel.agent.server.PearlService");
                Context context3 = (Context) joVar9.f.a();
                cq cqVar2 = (cq) this.f324a.v.a();
                context3.getClass();
                cqVar2.getClass();
                cb a7 = nT2.a(c2, io.grpc.b.c.a, com.google.frameworks.client.data.android.b.g.a(context3, new op("com.google.android.apps.pixel.agent"), cqVar2), io.grpc.b.h.a);
                a7.getClass();
                return a7;
            case 142:
                return com.google.android.libraries.lens.view.g.d.a((cr) this.f324a.vC.a());
            case 143:
                return new com.google.android.libraries.lens.view.vision.i((Executor) this.f324a.vC.a(), (Context) this.f324a.f.a());
            case 144:
                return com.google.android.libraries.lens.view.g.d.a((cr) this.f324a.vC.a());
            case 145:
                return new com.google.android.libraries.lens.view.suggest.c.b();
            case 146:
                return new com.google.android.libraries.search.assistant.fluidactions.c.a.m();
            case 147:
                return ((com.google.apps.tiktok.experiments.e) this.f324a.b.eV().a.a()).a("com.google.android.libraries.search.device 45645807").d();
            case 148:
                Context context4 = (Context) this.f324a.f.a();
                context4.getClass();
                ba createBuilder = com.google.bz.k.b.c.e.a.createBuilder();
                createBuilder.getClass();
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar = createBuilder.instance;
                eVar.g = 1;
                eVar.b |= 16;
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar2 = createBuilder.instance;
                eVar2.c = 1;
                eVar2.b = 1 | eVar2.b;
                String packageName = context4.getPackageName();
                packageName.getClass();
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar3 = createBuilder.instance;
                eVar3.b |= 32;
                eVar3.h = packageName;
                String str = context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0).versionName;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar4 = createBuilder.instance;
                eVar4.b |= 64;
                eVar4.i = str2;
                String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                valueOf.getClass();
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar5 = createBuilder.instance;
                eVar5.b |= 8;
                eVar5.f = valueOf;
                String str3 = Build.MODEL;
                str3.getClass();
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar6 = createBuilder.instance;
                eVar6.b |= 4;
                eVar6.e = str3;
                String str4 = Build.MANUFACTURER;
                str4.getClass();
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar7 = createBuilder.instance;
                eVar7.b |= 2;
                eVar7.d = str4;
                DesugarCollections.unmodifiableList(eVar7.j).getClass();
                ArrayList arrayList = new ArrayList();
                LocaleList m = e$.ExternalSyntheticApiModelOutline0.m(context4.getResources().getConfiguration());
                m.getClass();
                int m2 = e$.ExternalSyntheticApiModelOutline0.m(m);
                for (int i2 = 0; i2 < m2; i2++) {
                    String languageTag = e$.ExternalSyntheticApiModelOutline0.m(m, i2).toLanguageTag();
                    languageTag.getClass();
                    arrayList.add(languageTag);
                }
                if (arrayList.isEmpty()) {
                    String languageTag2 = Locale.getDefault().toLanguageTag();
                    languageTag2.getClass();
                    arrayList.add(languageTag2);
                }
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar8 = createBuilder.instance;
                com.google.protobuf.cb cbVar = eVar8.j;
                if (!cbVar.c()) {
                    eVar8.j = bi.mutableCopy(cbVar);
                }
                com.google.protobuf.c.addAll(arrayList, eVar8.j);
                String id = TimeZone.getDefault().getID();
                id.getClass();
                createBuilder.copyOnWrite();
                com.google.bz.k.b.c.e eVar9 = createBuilder.instance;
                eVar9.b |= 128;
                eVar9.k = id;
                return s.e(createBuilder);
            case 149:
                return new com.google.android.libraries.search.silk.impl.p.a((Context) this.f324a.f.a());
            case 150:
                return new com.google.android.libraries.search.silk.impl.k.f((Context) this.f324a.f.a(), (com.google.apps.tiktok.media.j) this.f324a.ne.a(), (ScheduledExecutorService) this.f324a.v.a());
            case 151:
                return new com.google.android.libraries.search.rendering.xuikit.xblend.e.n((a) this.f324a.g.a());
            case 152:
                return new ac((ag) this.f324a.f319a.eo.a(), (com.google.android.libraries.search.rendering.xuikit.c.h.y) this.f324a.f319a.ep.a());
            case 153:
                Context context5 = (Context) this.f324a.f.a();
                Executor executor = (Executor) this.f324a.aq.a();
                Class cls = (Class) this.f324a.c.bI.a();
                ca caVar = (ca) this.f324a.c.bJ.a();
                com.google.android.libraries.mdi.download.e.d dVar = (com.google.android.libraries.mdi.download.e.d) this.f324a.ar.a();
                com.google.android.libraries.mdi.download.e.g gVar = new com.google.android.libraries.mdi.download.e.g();
                gVar.f3235a = context5.getApplicationContext();
                gVar.d = at.k(cls);
                gVar.b(executor);
                gVar.c = at.k(dVar);
                gVar.b = com.google.common.base.cl.d(caVar);
                return gVar.a();
            case 154:
                return com.google.android.libraries.mdi.download.e.b.a.class;
            case 155:
                return new com.google.android.libraries.mdi.download.e.a.a((ScheduledExecutorService) this.f324a.n.a(), e.c.c.b(this.f324a.ax), (Context) this.f324a.f.a(), (com.google.android.libraries.mdi.download.e.d) this.f324a.ar.a(), (com.google.android.libraries.storage.a.j) this.f324a.as.a());
            case 156:
                return new com.google.android.libraries.web.e.b.a.k((a) this.f324a.g.a());
            case 157:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45656040").f());
            case 158:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45476363").f());
            case 159:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45407877").f());
            case 160:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45477012").f());
            case 161:
                Context context6 = (Context) this.f324a.f.a();
                jo joVar10 = this.f324a;
                return new com.google.android.libraries.ay.h.a.a(context6, joVar10.ax, (Executor) joVar10.n.a(), (cq) this.f324a.v.a(), (ScheduledExecutorService) this.f324a.v.a());
            case 162:
                return new com.google.android.apps.search.googleapp.contentcreator.d.d((Context) this.f324a.f.a(), (Executor) this.f324a.v.a(), (ao) this.f324a.bz.a());
            case 163:
                Context context7 = (Context) this.f324a.f.a();
                a aVar = (a) this.f324a.g.a();
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f324a.wN.a();
                TelephonyManager telephonyManager = (TelephonyManager) this.f324a.uY.a();
                jo joVar11 = this.f324a;
                return new com.google.android.libraries.search.v.c.l(context7, aVar, connectivityManager, telephonyManager, joVar11.b.x(), (ag) joVar11.bo.a(), (ag) this.f324a.Q.a(), (ScheduledExecutorService) this.f324a.H.a());
            case 164:
                String cG = this.f324a.c.cG();
                com.google.apps.tiktok.p.l lVar7 = new com.google.apps.tiktok.p.l();
                lVar7.a = cG;
                lVar7.b = 443;
                lVar7.b(com.google.aw.k.b.a.a.a.b.n);
                return lVar7.a();
            case 165:
                jo joVar12 = this.f324a;
                return new com.google.android.libraries.search.assistant.invocation.u.g.c.d(joVar12.c.cX(), (nz) joVar12.eG.a(), (al) this.f324a.kU.a(), (cr) this.f324a.H.a(), (ag) this.f324a.Q.a());
            case 166:
                return new com.google.android.libraries.search.assistant.invocation.u.e.a.ah((com.google.android.libraries.search.assistant.invocation.u.e.a.u) this.f324a.fU.a(), (ag) this.f324a.bo.a(), (Executor) this.f324a.v.a());
            case 167:
                return new com.google.android.libraries.search.assistant.invocation.u.d.au((ar) this.f324a.eD.a(), (ag) this.f324a.Q.a());
            case 168:
                return new com.google.android.libraries.search.assistant.invocation.u.f.b.s(Optional.of(com.google.android.libraries.search.assistant.invocation.u.f.b.b.c), (com.google.android.libraries.search.assistant.invocation.u.g.a.u) this.f324a.kP.a(), (ag) this.f324a.bo.a());
            case 169:
                return new com.google.android.libraries.search.assistant.invocation.u.g.a.a();
            case 170:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.a.a.c.d(this.f324a.V).a.a()).a("assistant_auto_tng_libraries_device 45621482").f());
            case 171:
                return new nz(this);
            case 172:
                return new jt();
            case 173:
                return new com.google.android.apps.search.assistant.platform.e.k.a.r();
            case 174:
                return new com.google.android.libraries.search.assistant.invocation.e.b.a.a.q();
            case 175:
                return new com.google.android.apps.search.assistant.platform.b.a.c.g((com.google.common.v.f) this.f324a.ez.a());
            case 176:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.libraries.search.soda_apa.device 45369730").b());
            case 177:
                return new com.google.android.libraries.assistant.c.c.a.n((Executor) this.f324a.H.a(), (Executor) this.f324a.v.a(), (Executor) this.f324a.n.a(), (Context) this.f324a.f.a());
            case 178:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.apps.search.assistant.device 45382514").f());
            case 179:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.apps.search.assistant.device 45491701").f());
            case 180:
                return androidx.compose.ui.platform.ca.A(this.f324a.b.iP().C());
            case 181:
                return com.google.android.apps.search.assistant.platform.d.b.c.c.a();
            case 182:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.V.a()).a("com.google.android.apps.search.assistant.device 45379615").f());
            case 183:
                return this.f324a.c.Q();
            case 184:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.p.b.a.a.b((Executor) this.f324a.H.a());
            case 185:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.p.b.a.a.b((Executor) this.f324a.H.a());
            case 186:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.p.b.a.a.b((Executor) this.f324a.H.a());
            case 187:
                return new nz(this);
            case 188:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.d.c.a.f((com.google.apps.tiktok.g.p) this.f324a.nr.a(), (dj) this.f324a.bK.a(), (Executor) this.f324a.v.a());
            case 189:
                return new com.google.android.apps.search.assistant.surfaces.dictation.service.w.a();
            case 190:
                return com.google.android.apps.search.assistant.surfaces.dictation.service.w.e.a.b(this.f324a.c.cp);
            case 191:
                jo joVar13 = this.f324a;
                bp h = com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.d.n.h(joVar13.mf, (com.google.apps.tiktok.p.m) joVar13.c.co.a(), (com.google.apps.tiktok.p.u) this.f324a.mh.a(), (com.google.frameworks.client.data.android.d) this.f324a.mb.a(), com.google.common.base.a.a);
                h.getClass();
                return h;
            case 192:
                return com.google.android.apps.search.assistant.surfaces.dictation.service.w.e.a.a();
            case 193:
                return new ju(this, 0);
            case 194:
                return new com.google.android.apps.gsa.assistant.handoff.y();
            case 195:
                MessageQueue queue = Looper.getMainLooper().getQueue();
                queue.getClass();
                return new com.google.android.apps.gsa.shared.util.c.l(queue);
            case 196:
                return new com.google.android.apps.gsa.monet.a.a.b(this.f324a.c.cu);
            case 197:
                return new kz(this.f324a);
            case 198:
                return new com.google.android.apps.gsa.shared.util.o.c((Context) this.f324a.f.a());
            case 199:
                Context context8 = (Context) this.f324a.f.a();
                jo joVar14 = this.f324a;
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.b.a.e(context8, joVar14.c.dZ(), joVar14.c.eb(), joVar14.c.ec(), joVar14.c.ed(), (com.google.android.libraries.search.account.k) joVar14.bM.a(), (com.google.android.libraries.search.account.b.b) this.f324a.gd.a(), (cq) this.f324a.H.a(), (cq) this.f324a.B.a(), this.f324a.c.ee());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        h hVar;
        jx jxVar;
        jx jxVar2;
        jx jxVar3;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        jy jyVar;
        h hVar6;
        jy jyVar2;
        h hVar7;
        h hVar8;
        h hVar9;
        h hVar10;
        h hVar11;
        h hVar12;
        h hVar13;
        jx jxVar4;
        jx jxVar5;
        h hVar14;
        jx jxVar6;
        jx jxVar7;
        h hVar15;
        h hVar16;
        jx jxVar8;
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
        jx jxVar9;
        h hVar37;
        h hVar38;
        jx jxVar10;
        h hVar39;
        jr jrVar;
        h hVar40;
        jr jrVar2;
        h hVar41;
        jx jxVar11;
        jx jxVar12;
        jx jxVar13;
        h hVar42;
        jr jrVar3;
        h hVar43;
        jr jrVar4;
        h hVar44;
        jr jrVar5;
        h hVar45;
        jx jxVar14;
        h hVar46;
        h hVar47;
        h hVar48;
        h hVar49;
        h hVar50;
        h hVar51;
        h hVar52;
        jx jxVar15;
        h hVar53;
        h hVar54;
        h hVar55;
        h hVar56;
        jy jyVar3;
        h hVar57;
        h hVar58;
        h hVar59;
        h hVar60;
        h hVar61;
        h hVar62;
        jx jxVar16;
        h hVar63;
        jx jxVar17;
        jy jyVar4;
        h hVar64;
        jr jrVar6;
        h hVar65;
        jx jxVar18;
        h hVar66;
        h hVar67;
        jx jxVar19;
        jx jxVar20;
        jx jxVar21;
        h hVar68;
        jx jxVar22;
        jx jxVar23;
        h hVar69;
        jx jxVar24;
        h hVar70;
        jx jxVar25;
        jx jxVar26;
        h hVar71;
        jx jxVar27;
        jy jyVar5;
        h hVar72;
        jx jxVar28;
        jx jxVar29;
        h hVar73;
        jx jxVar30;
        jx jxVar31;
        h hVar74;
        h hVar75;
        jr jrVar7;
        h hVar76;
        jx jxVar32;
        h hVar77;
        jx jxVar33;
        jx jxVar34;
        jx jxVar35;
        jx jxVar36;
        jx jxVar37;
        jx jxVar38;
        jx jxVar39;
        jx jxVar40;
        jx jxVar41;
        jx jxVar42;
        jx jxVar43;
        jx jxVar44;
        jx jxVar45;
        jx jxVar46;
        jx jxVar47;
        jx jxVar48;
        jx jxVar49;
        jx jxVar50;
        jx jxVar51;
        jx jxVar52;
        jx jxVar53;
        jx jxVar54;
        jx jxVar55;
        jx jxVar56;
        jx jxVar57;
        jx jxVar58;
        jx jxVar59;
        jx jxVar60;
        jx jxVar61;
        jx jxVar62;
        jx jxVar63;
        jx jxVar64;
        h hVar78;
        h hVar79;
        h hVar80;
        jx jxVar65;
        h hVar81;
        jx jxVar66;
        h hVar82;
        jx jxVar67;
        h hVar83;
        jx jxVar68;
        jy jyVar6;
        jx jxVar69;
        jr jrVar8;
        jr jrVar9;
        jx jxVar70;
        h hVar84;
        h hVar85;
        h hVar86;
        h hVar87;
        jy jyVar7;
        jx jxVar71;
        jy jyVar8;
        h hVar88;
        jx jxVar72;
        jx jxVar73;
        h hVar89;
        jx jxVar74;
        h hVar90;
        h hVar91;
        jx jxVar75;
        h hVar92;
        h hVar93;
        h hVar94;
        h hVar95;
        jx jxVar76;
        h hVar96;
        jx jxVar77;
        jx jxVar78;
        jx jxVar79;
        jx jxVar80;
        jx jxVar81;
        jx jxVar82;
        jx jxVar83;
        jx jxVar84;
        h hVar97;
        h hVar98;
        h hVar99;
        jx jxVar85;
        jx jxVar86;
        h hVar100;
        jx jxVar87;
        h hVar101;
        jx jxVar88;
        h hVar102;
        jx jxVar89;
        h hVar103;
        h hVar104;
        h hVar105;
        jx jxVar90;
        h hVar106;
        jy jyVar9;
        h hVar107;
        jx jxVar91;
        h hVar108;
        jx jxVar92;
        jx jxVar93;
        jx jxVar94;
        jx jxVar95;
        jx jxVar96;
        jx jxVar97;
        jr jrVar10;
        h hVar109;
        h hVar110;
        h hVar111;
        jx jxVar98;
        jr jrVar11;
        jr jrVar12;
        jr jrVar13;
        h hVar112;
        jr jrVar14;
        h hVar113;
        h hVar114;
        h hVar115;
        h hVar116;
        jx jxVar99;
        h hVar117;
        h hVar118;
        jx jxVar100;
        h hVar119;
        h hVar120;
        jx jxVar101;
        h hVar121;
        jx jxVar102;
        h hVar122;
        h hVar123;
        h hVar124;
        h hVar125;
        h hVar126;
        jx jxVar103;
        h hVar127;
        h hVar128;
        h hVar129;
        h hVar130;
        h hVar131;
        h hVar132;
        h hVar133;
        jy jyVar10;
        h hVar134;
        h hVar135;
        h hVar136;
        h hVar137;
        h hVar138;
        h hVar139;
        jx jxVar104;
        h hVar140;
        h hVar141;
        h hVar142;
        h hVar143;
        jx jxVar105;
        h hVar144;
        jx jxVar106;
        h hVar145;
        h hVar146;
        jr jrVar15;
        h hVar147;
        jy jyVar11;
        h hVar148;
        h hVar149;
        h hVar150;
        jx jxVar107;
        h hVar151;
        h hVar152;
        jx jxVar108;
        h hVar153;
        jx jxVar109;
        h hVar154;
        jr jrVar16;
        h hVar155;
        h hVar156;
        h hVar157;
        h hVar158;
        h hVar159;
        h hVar160;
        jx jxVar110;
        h hVar161;
        h hVar162;
        jy jyVar12;
        h hVar163;
        jx jxVar111;
        h hVar164;
        h hVar165;
        h hVar166;
        jx jxVar112;
        h hVar167;
        h hVar168;
        jx jxVar113;
        h hVar169;
        h hVar170;
        h hVar171;
        h hVar172;
        h hVar173;
        jx jxVar114;
        h hVar174;
        h hVar175;
        h hVar176;
        jy jyVar13;
        h hVar177;
        h hVar178;
        h hVar179;
        h hVar180;
        h hVar181;
        h hVar182;
        h hVar183;
        int i = this.b;
        switch (i) {
            case 200:
                hVar = this.f324a.gf;
                SharedPreferences sharedPreferences = (SharedPreferences) hVar.a();
                jxVar = this.f324a.c;
                boolean ef = jxVar.ef();
                jxVar2 = this.f324a.c;
                boolean eg = jxVar2.eg();
                jxVar3 = this.f324a.c;
                boolean eh = jxVar3.eh();
                hVar2 = this.f324a.ux;
                return new com.google.android.apps.search.assistant.surfaces.bisto.c.a(sharedPreferences, ef, eg, eh, (Context) hVar2.a());
            case 201:
                hVar3 = this.f324a.f;
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.b.a.h((Context) hVar3.a(), this.f324a.acP());
            case 202:
                hVar4 = this.f324a.f;
                Context context = (Context) hVar4.a();
                hVar5 = this.f324a.gB;
                e.a b = e.c.c.b(hVar5);
                jyVar = this.f324a.f319a;
                hVar6 = jyVar.eG;
                e.a b2 = e.c.c.b(hVar6);
                jyVar2 = this.f324a.f319a;
                hVar7 = jyVar2.eH;
                return new com.google.android.apps.gsa.search.core.s.a(context, b, b2, e.c.c.b(hVar7));
            case 203:
                jo joVar = this.f324a;
                com.google.android.libraries.assistant.pcp.q.a.ba iw = joVar.iw();
                hVar8 = joVar.iH;
                com.google.android.libraries.search.t.a.a aVar = (com.google.android.libraries.search.t.a.a) hVar8.a();
                hVar9 = this.f324a.H;
                return new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.l(iw, aVar, (Executor) hVar9.a());
            case 204:
                hVar10 = this.f324a.gI;
                return ae.c((dc) hVar10.a());
            case 205:
                hVar11 = this.f324a.bN;
                hVar12 = this.f324a.H;
                return new com.google.apps.tiktok.account.api.controller.a.a.c((Executor) hVar12.a());
            case 206:
                hVar13 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar = (com.google.apps.tiktok.account.data.ao) hVar13.a();
                jxVar4 = this.f324a.c;
                Map cU = jxVar4.cU();
                jo joVar2 = this.f324a;
                fu l = fu.l();
                jxVar5 = joVar2.c;
                Map cT = jxVar5.cT();
                op opVar = new op("pseudonymous");
                hVar14 = this.f324a.gH;
                return new be(aoVar, cU, l, cT, opVar, (com.google.apps.tiktok.account.api.controller.ah) hVar14.a());
            case 207:
                jxVar6 = this.f324a.c;
                return new com.google.android.libraries.search.assistant.b.c(jxVar6.P());
            case 208:
                jxVar7 = this.f324a.c;
                return new com.google.apps.tiktok.account.e.a.a((com.google.apps.tiktok.account.e.a.c) jxVar7.cC());
            case 209:
                hVar15 = this.f324a.f;
                Context context2 = (Context) hVar15.a();
                hVar16 = this.f324a.gH;
                com.google.apps.tiktok.account.api.controller.ah ahVar = (com.google.apps.tiktok.account.api.controller.ah) hVar16.a();
                jxVar8 = this.f324a.c;
                com.google.android.libraries.search.p.h aw = jxVar8.aw();
                hVar17 = this.f324a.H;
                return new com.google.android.libraries.search.p.a(context2, ahVar, aw, (Executor) hVar17.a());
            case 210:
                hVar18 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar2 = (com.google.apps.tiktok.account.data.ao) hVar18.a();
                hVar19 = this.f324a.bq;
                com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) hVar19.a();
                hVar20 = this.f324a.bH;
                com.google.apps.tiktok.account.data.aa aaVar = (com.google.apps.tiktok.account.data.aa) hVar20.a();
                hVar21 = this.f324a.H;
                return new com.google.android.apps.search.assistant.surfaces.settings.a.c(aoVar2, dVar, aaVar, (cq) hVar21.a());
            case 211:
                hVar22 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar3 = (com.google.apps.tiktok.account.data.ao) hVar22.a();
                hVar23 = this.f324a.bq;
                com.google.apps.tiktok.account.data.a.d dVar2 = (com.google.apps.tiktok.account.data.a.d) hVar23.a();
                hVar24 = this.f324a.bH;
                com.google.apps.tiktok.account.data.aa aaVar2 = (com.google.apps.tiktok.account.data.aa) hVar24.a();
                hVar25 = this.f324a.Q;
                return new com.google.android.apps.search.speechenroll.a.b(aoVar3, dVar2, aaVar2, (ag) hVar25.a());
            case 212:
                hVar26 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar4 = (com.google.apps.tiktok.account.data.ao) hVar26.a();
                hVar27 = this.f324a.gd;
                return new com.google.android.apps.search.assistant.platform.a.c(aoVar4, (com.google.android.libraries.search.account.b.b) hVar27.a());
            case 213:
                hVar28 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar5 = (com.google.apps.tiktok.account.data.ao) hVar28.a();
                hVar29 = this.f324a.bq;
                return new com.google.android.apps.search.assistant.verticals.family.custodio.a.b.a(aoVar5, (com.google.apps.tiktok.account.data.a.d) hVar29.a());
            case 214:
                hVar30 = this.f324a.ap;
                return new com.google.apps.tiktok.account.e.f.a();
            case 215:
                hVar31 = this.f324a.bI;
                com.google.apps.tiktok.account.data.c.c cVar = (com.google.apps.tiktok.account.data.c.c) hVar31.a();
                hVar32 = this.f324a.ap;
                return new com.google.apps.tiktok.account.data.c.a(cVar, (com.google.apps.tiktok.account.data.ao) hVar32.a());
            case 216:
                hVar33 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar6 = (com.google.apps.tiktok.account.data.ao) hVar33.a();
                hVar34 = this.f324a.bq;
                return new com.google.android.apps.search.assistant.surfaces.roti.home.bi(aoVar6, (com.google.apps.tiktok.account.data.a.d) hVar34.a());
            case 217:
                hVar35 = this.f324a.f;
                return new com.google.android.apps.search.omnient.accounttypechecking.b((Context) hVar35.a());
            case 218:
                hVar36 = this.f324a.ap;
                com.google.apps.tiktok.account.data.ao aoVar7 = (com.google.apps.tiktok.account.data.ao) hVar36.a();
                jxVar9 = this.f324a.c;
                com.google.android.libraries.search.p.h aw2 = jxVar9.aw();
                hVar37 = this.f324a.H;
                return new com.google.android.libraries.search.p.d(aoVar7, aw2, (Executor) hVar37.a());
            case 219:
                hVar38 = this.f324a.qn;
                return new bg((com.google.android.libraries.logging.ve.u) hVar38.a());
            case 220:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.a.b.f.m();
            case 221:
                jxVar10 = this.f324a.c;
                jxVar10.aa();
                return new com.google.android.apps.search.googleapp.accounts.d.a();
            case 222:
                hVar39 = this.f324a.f;
                return new com.google.android.apps.search.googleapp.x.b.a((Context) hVar39.a());
            case 223:
                jrVar = this.f324a.b;
                hVar40 = jrVar.kW;
                jrVar2 = this.f324a.b;
                hVar41 = jrVar2.kX;
                return new com.google.android.apps.search.googleapp.w.b(hVar40, hVar41);
            case 224:
                jxVar11 = this.f324a.c;
                boolean ej = jxVar11.ej();
                jxVar12 = this.f324a.c;
                com.google.protos.l.a.e be = jxVar12.be();
                jxVar13 = this.f324a.c;
                com.google.protobuf.ao aU = jxVar13.aU();
                hVar42 = this.f324a.bh;
                return new com.google.android.apps.search.googleapp.w.d(ej, be, aU, (com.google.android.libraries.search.t.h.a) hVar42.a());
            case 225:
                jrVar3 = this.f324a.b;
                hVar43 = jrVar3.ec;
                lt ltVar = (lt) hVar43.a();
                jrVar4 = this.f324a.b;
                hVar44 = jrVar4.ed;
                o oVar = (o) hVar44.a();
                jrVar5 = this.f324a.b;
                com.google.android.libraries.search.rendering.xuikit.bubbles.b.b aK = jrVar5.aK();
                hVar45 = this.f324a.g;
                return new ak(ltVar, oVar, aK, (a) hVar45.a());
            case 226:
                jxVar14 = this.f324a.c;
                boolean el = jxVar14.el();
                hVar46 = this.f324a.f;
                Context context3 = (Context) hVar46.a();
                hVar47 = this.f324a.iH;
                com.google.android.libraries.search.t.a.a aVar2 = (com.google.android.libraries.search.t.a.a) hVar47.a();
                hVar48 = this.f324a.g;
                return new com.google.android.apps.search.googleapp.launcher.c.a.a(el, context3, aVar2, (a) hVar48.a());
            case 227:
                hVar49 = this.f324a.f;
                return new com.google.android.gms.location.internal.u((Context) hVar49.a());
            case 228:
                hVar50 = this.f324a.f;
                return new com.google.android.libraries.speech.transcription.voiceime.h((Context) hVar50.a());
            case 229:
                hVar51 = this.f324a.f;
                Context context4 = (Context) hVar51.a();
                int i2 = com.google.android.libraries.search.account.b.a.a;
                return new com.google.android.apps.search.assistant.surfaces.appactions.a.a.b(context4);
            case 230:
                hVar52 = this.f324a.f;
                Context context5 = (Context) hVar52.a();
                int i3 = com.google.android.libraries.search.account.b.a.a;
                return new com.google.android.apps.search.assistant.verticals.recommend.b.b(context5);
            case 231:
                jxVar15 = this.f324a.c;
                hVar53 = jxVar15.cP;
                e.a b3 = e.c.c.b(hVar53);
                hVar54 = this.f324a.gt;
                e.a b4 = e.c.c.b(hVar54);
                hVar55 = this.f324a.qw;
                e.c.c.b(hVar55);
                hVar56 = this.f324a.hh;
                e.a b5 = e.c.c.b(hVar56);
                jyVar3 = this.f324a.f319a;
                hVar57 = jyVar3.S;
                e.a b6 = e.c.c.b(hVar57);
                hVar58 = this.f324a.f;
                Context context6 = (Context) hVar58.a();
                hVar59 = this.f324a.nl;
                return new com.google.android.apps.gsa.staticplugins.opa.aa.c(b3, b4, b5, b6, context6, (Query) hVar59.a());
            case 232:
                hVar60 = this.f324a.f;
                Context context7 = (Context) hVar60.a();
                hVar61 = this.f324a.jv;
                e.a b7 = e.c.c.b(hVar61);
                hVar62 = this.f324a.qQ;
                return new com.google.android.apps.gsa.shared.f.b(context7, b7, (com.google.android.apps.gsa.shared.f.q) hVar62.a());
            case 233:
                jxVar16 = this.f324a.c;
                boolean es = jxVar16.es();
                com.google.android.libraries.search.account.b.c cVar2 = new com.google.android.libraries.search.account.b.c();
                hVar63 = this.f324a.f;
                Context context8 = (Context) hVar63.a();
                jxVar17 = this.f324a.c;
                com.google.android.libraries.search.rendering.xuikit.bubbles.m ax = jxVar17.ax();
                jyVar4 = this.f324a.f319a;
                hVar64 = jyVar4.dL;
                com.google.android.libraries.search.rendering.xuikit.c.e.s sVar = (com.google.android.libraries.search.rendering.xuikit.c.e.s) hVar64.a();
                jrVar6 = this.f324a.b;
                return new com.google.android.apps.search.googleapp.bubbles.c.b(es, cVar2, context8, ax, sVar, jrVar6.aL());
            case 234:
                hVar65 = this.f324a.f;
                Context context9 = (Context) hVar65.a();
                jxVar18 = this.f324a.c;
                hVar66 = jxVar18.cH;
                return new com.google.android.apps.search.googleapp.contentcreator.m.b(context9, (com.google.android.libraries.search.account.b.g) hVar66.a());
            case 235:
                hVar67 = this.f324a.f;
                Context context10 = (Context) hVar67.a();
                int i4 = com.google.android.apps.search.assistant.verticals.family.custodio.a.a.a.a;
                jxVar19 = this.f324a.c;
                boolean et = jxVar19.et();
                jxVar20 = this.f324a.c;
                boolean eu = jxVar20.eu();
                jxVar21 = this.f324a.c;
                com.google.protos.l.a.e bf = jxVar21.bf();
                hVar68 = this.f324a.W;
                return new com.google.android.apps.search.assistant.verticals.family.custodio.au(context10, et, eu, bf, (y) hVar68.a());
            case 236:
                jxVar22 = this.f324a.c;
                Object cD = jxVar22.cD();
                jxVar23 = this.f324a.c;
                hVar69 = jxVar23.fQ;
                return new com.google.android.libraries.assistant.auto.jumpboost.h.f((com.google.android.libraries.assistant.auto.jumpboost.h.d) cD, hVar69);
            case 237:
                jxVar24 = this.f324a.c;
                return Boolean.valueOf(h.a.a.b.a.a.f.n(jxVar24.gK()));
            case 238:
                hVar70 = this.f324a.f;
                Context context11 = (Context) hVar70.a();
                jxVar25 = this.f324a.c;
                com.google.protos.l.a.e aW = jxVar25.aW();
                jxVar26 = this.f324a.c;
                hVar71 = jxVar26.cH;
                com.google.android.libraries.search.account.b.g gVar = (com.google.android.libraries.search.account.b.g) hVar71.a();
                jxVar27 = this.f324a.c;
                return new com.google.android.apps.search.googleapp.homescreen.a.c(context11, aW, gVar, jxVar27.ev());
            case 239:
                int i5 = com.google.android.libraries.search.account.b.a.a;
                jyVar5 = this.f324a.f319a;
                hVar72 = jyVar5.r;
                com.google.android.libraries.search.assistant.aa.e.a aVar3 = (com.google.android.libraries.search.assistant.aa.e.a) hVar72.a();
                jxVar28 = this.f324a.c;
                return new com.google.android.apps.search.assistant.surfaces.c.c.a.a.b(aVar3, jxVar28.ew());
            case 240:
                jxVar29 = this.f324a.c;
                hVar73 = jxVar29.cH;
                com.google.android.libraries.search.account.b.g gVar2 = (com.google.android.libraries.search.account.b.g) hVar73.a();
                jxVar30 = this.f324a.c;
                com.google.android.apps.search.googleapp.labs.e.a ab = jxVar30.ab();
                jxVar31 = this.f324a.c;
                return new com.google.android.apps.search.googleapp.labs.b.b(gVar2, ab, jxVar31.ex());
            case 241:
                hVar74 = this.f324a.f;
                Context context12 = (Context) hVar74.a();
                hVar75 = this.f324a.Y;
                String str = (String) hVar75.a();
                jo joVar3 = this.f324a;
                int j = joVar3.j();
                jrVar7 = joVar3.b;
                hVar76 = jrVar7.o;
                com.google.android.apps.search.assistant.surfaces.voice.o.p pVar = (com.google.android.apps.search.assistant.surfaces.voice.o.p) hVar76.a();
                jxVar32 = this.f324a.c;
                Map cV = jxVar32.cV();
                hVar77 = this.f324a.bN;
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) hVar77.a();
                int i6 = com.google.android.libraries.search.account.b.a.a;
                jxVar33 = this.f324a.c;
                boolean ey = jxVar33.ey();
                jxVar34 = this.f324a.c;
                boolean ez = jxVar34.ez();
                jxVar35 = this.f324a.c;
                boolean eB = jxVar35.eB();
                jxVar36 = this.f324a.c;
                boolean eC = jxVar36.eC();
                jxVar37 = this.f324a.c;
                boolean eD = jxVar37.eD();
                jxVar38 = this.f324a.c;
                boolean eE = jxVar38.eE();
                jxVar39 = this.f324a.c;
                String cL = jxVar39.cL();
                jxVar40 = this.f324a.c;
                boolean eF = jxVar40.eF();
                jxVar41 = this.f324a.c;
                boolean eG = jxVar41.eG();
                jxVar42 = this.f324a.c;
                boolean eH = jxVar42.eH();
                jxVar43 = this.f324a.c;
                boolean eI = jxVar43.eI();
                jxVar44 = this.f324a.c;
                boolean eJ = jxVar44.eJ();
                jxVar45 = this.f324a.c;
                com.google.protos.l.a.e aX = jxVar45.aX();
                jxVar46 = this.f324a.c;
                boolean eK = jxVar46.eK();
                jxVar47 = this.f324a.c;
                boolean eM = jxVar47.eM();
                jxVar48 = this.f324a.c;
                boolean eN = jxVar48.eN();
                jxVar49 = this.f324a.c;
                boolean eO = jxVar49.eO();
                jxVar50 = this.f324a.c;
                boolean eP = jxVar50.eP();
                jxVar51 = this.f324a.c;
                String cM = jxVar51.cM();
                jxVar52 = this.f324a.c;
                boolean eQ = jxVar52.eQ();
                jxVar53 = this.f324a.c;
                boolean eR = jxVar53.eR();
                jxVar54 = this.f324a.c;
                com.google.protobuf.ao aV = jxVar54.aV();
                jxVar55 = this.f324a.c;
                boolean eS = jxVar55.eS();
                jxVar56 = this.f324a.c;
                boolean eT = jxVar56.eT();
                jxVar57 = this.f324a.c;
                boolean eU = jxVar57.eU();
                jxVar58 = this.f324a.c;
                boolean eV = jxVar58.eV();
                jxVar59 = this.f324a.c;
                boolean eX = jxVar59.eX();
                jxVar60 = this.f324a.c;
                boolean eY = jxVar60.eY();
                jxVar61 = this.f324a.c;
                boolean eZ = jxVar61.eZ();
                jxVar62 = this.f324a.c;
                com.google.protos.l.a.e aY = jxVar62.aY();
                jxVar63 = this.f324a.c;
                boolean fa = jxVar63.fa();
                jxVar64 = this.f324a.c;
                boolean fb = jxVar64.fb();
                hVar78 = this.f324a.H;
                cq cqVar = (cq) hVar78.a();
                hVar79 = this.f324a.H;
                cr crVar = (cr) hVar79.a();
                hVar80 = this.f324a.W;
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h(context12, str, j, pVar, cV, bVar, ey, ez, eB, eC, eD, eE, cL, eF, eG, eH, eI, eJ, aX, eK, eM, eN, eO, eP, cM, eQ, eR, aV, eS, eT, eU, eV, eX, eY, eZ, aY, fa, fb, cqVar, crVar, (y) hVar80.a());
            case 242:
                int i7 = com.google.android.libraries.search.account.b.a.a;
                jxVar65 = this.f324a.c;
                return new com.google.android.apps.search.soundsearch.d.a.c(jxVar65.fc());
            case 243:
                hVar81 = this.f324a.bo;
                ag agVar = (ag) hVar81.a();
                jxVar66 = this.f324a.c;
                return new com.google.android.apps.search.omnient.host.a.c(agVar, jxVar66.af());
            case 244:
                return new com.google.android.apps.search.omnient.host.invocation.d();
            case 245:
                hVar82 = this.f324a.f;
                Context context13 = (Context) hVar82.a();
                com.google.android.libraries.search.account.b.c cVar3 = new com.google.android.libraries.search.account.b.c();
                jxVar67 = this.f324a.c;
                return new com.google.android.apps.search.omnient.education.playground.r(context13, cVar3, jxVar67.fd());
            case 246:
                hVar83 = this.f324a.f;
                Context context14 = (Context) hVar83.a();
                jxVar68 = this.f324a.c;
                boolean ff = jxVar68.ff();
                jyVar6 = this.f324a.f319a;
                com.google.android.apps.search.podcasts.e.a.a cM2 = jyVar6.cM();
                int i8 = com.google.android.libraries.search.account.b.a.a;
                jxVar69 = this.f324a.c;
                long C = jxVar69.C();
                jrVar8 = this.f324a.b;
                long w = jrVar8.w();
                jrVar9 = this.f324a.b;
                return new com.google.android.apps.search.podcasts.d.c(context14, ff, cM2, C, w, jrVar9.gl());
            case 247:
                jxVar70 = this.f324a.c;
                hVar84 = jxVar70.cH;
                com.google.android.libraries.search.account.b.g gVar3 = (com.google.android.libraries.search.account.b.g) hVar84.a();
                hVar85 = this.f324a.Y;
                return new com.google.android.apps.search.googleapp.saves.savefeature.c.d(gVar3, (String) hVar85.a());
            case 248:
                hVar86 = this.f324a.f;
                Context context15 = (Context) hVar86.a();
                hVar87 = this.f324a.bq;
                com.google.apps.tiktok.account.data.a.d dVar3 = (com.google.apps.tiktok.account.data.a.d) hVar87.a();
                int i9 = com.google.android.apps.search.assistant.surfaces.settings.a.d.a;
                jyVar7 = this.f324a.f319a;
                com.google.apps.tiktok.contrib.c.j eF2 = jyVar7.eF();
                jxVar71 = this.f324a.c;
                Map cW = jxVar71.cW();
                jyVar8 = this.f324a.f319a;
                hVar88 = jyVar8.S;
                v vVar = (v) hVar88.a();
                jxVar72 = this.f324a.c;
                com.google.protos.l.a.e aZ = jxVar72.aZ();
                jxVar73 = this.f324a.c;
                boolean fg = jxVar73.fg();
                hVar89 = this.f324a.hH;
                return new com.google.android.apps.search.assistant.surfaces.settings.b.d(context15, dVar3, eF2, cW, vVar, aZ, fg, ((Boolean) hVar89.a()).booleanValue());
            case 249:
                jxVar74 = this.f324a.c;
                hVar90 = jxVar74.cH;
                return new com.google.android.apps.search.googleapp.settingsui.d.e((com.google.android.libraries.search.account.b.g) hVar90.a(), this.f324a.gW());
            case 250:
                hVar91 = this.f324a.f;
                Context context16 = (Context) hVar91.a();
                jxVar75 = this.f324a.c;
                hVar92 = jxVar75.cH;
                com.google.android.libraries.search.account.b.g gVar4 = (com.google.android.libraries.search.account.b.g) hVar92.a();
                jo joVar4 = this.f324a;
                com.google.android.apps.search.googleapp.settingsui.b.n gW = joVar4.gW();
                hVar93 = joVar4.bq;
                com.google.apps.tiktok.account.data.a.d dVar4 = (com.google.apps.tiktok.account.data.a.d) hVar93.a();
                hVar94 = this.f324a.Q;
                return new com.google.android.apps.search.googleapp.settingsui.d.c(context16, gVar4, gW, dVar4, (ag) hVar94.a());
            case 251:
                hVar95 = this.f324a.f;
                Context context17 = (Context) hVar95.a();
                jxVar76 = this.f324a.c;
                hVar96 = jxVar76.fS;
                com.google.android.gms.common.e eVar = (com.google.android.gms.common.e) hVar96.a();
                jxVar77 = this.f324a.c;
                boolean fh = jxVar77.fh();
                jxVar78 = this.f324a.c;
                boolean fi = jxVar78.fi();
                jxVar79 = this.f324a.c;
                boolean fj = jxVar79.fj();
                jxVar80 = this.f324a.c;
                boolean fk = jxVar80.fk();
                jxVar81 = this.f324a.c;
                String cN = jxVar81.cN();
                jxVar82 = this.f324a.c;
                String cO = jxVar82.cO();
                jxVar83 = this.f324a.c;
                long D = jxVar83.D();
                jxVar84 = this.f324a.c;
                return new com.google.android.apps.search.c.c(context17, eVar, fh, fi, fj, fk, cN, cO, D, jxVar84.E());
            case 252:
                return com.google.android.apps.search.c.a.b();
            case 253:
                hVar97 = this.f324a.f;
                Context context18 = (Context) hVar97.a();
                hVar98 = this.f324a.bo;
                return new com.google.android.apps.search.omnient.host.invocation.c.d(context18, (ag) hVar98.a(), new com.google.android.libraries.search.account.b.c());
            case 254:
                hVar99 = this.f324a.ux;
                Context context19 = (Context) hVar99.a();
                int i10 = com.google.android.libraries.search.account.b.a.a;
                jxVar85 = this.f324a.c;
                boolean fl = jxVar85.fl();
                jo joVar5 = this.f324a;
                boolean abu = joVar5.abu();
                jxVar86 = joVar5.c;
                hVar100 = jxVar86.Q;
                return new com.google.android.apps.search.assistant.surfaces.bisto.c.d(context19, fl, abu, (com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.b.k) hVar100.a());
            case 255:
                int i11 = com.google.android.libraries.search.account.b.a.a;
                jxVar87 = this.f324a.c;
                return new com.google.android.apps.search.weather.b.a.c(jxVar87.fm());
            case 256:
                hVar101 = this.f324a.f;
                Context context20 = (Context) hVar101.a();
                jxVar88 = this.f324a.c;
                hVar102 = jxVar88.bF;
                com.google.android.libraries.av.a.p.a aVar4 = (com.google.android.libraries.av.a.p.a) hVar102.a();
                jxVar89 = this.f324a.c;
                hVar103 = jxVar89.fT;
                com.google.z.a.p pVar2 = (com.google.z.a.p) hVar103.a();
                hVar104 = this.f324a.g;
                a aVar5 = (a) hVar104.a();
                hVar105 = this.f324a.iH;
                return new com.google.android.apps.search.b.a.h(context20, aVar4, pVar2, aVar5, (com.google.android.libraries.search.t.a.a) hVar105.a());
            case 257:
                jxVar90 = this.f324a.c;
                return com.google.android.apps.search.b.a.i.a(jxVar90.cP());
            case 258:
                hVar106 = this.f324a.f;
                Context context21 = (Context) hVar106.a();
                jyVar9 = this.f324a.f319a;
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.n.b(context21, jyVar9.qO());
            case 259:
                hVar107 = this.f324a.f;
                Context context22 = (Context) hVar107.a();
                jxVar91 = this.f324a.c;
                hVar108 = jxVar91.cH;
                com.google.android.libraries.search.account.b.g gVar5 = (com.google.android.libraries.search.account.b.g) hVar108.a();
                jxVar92 = this.f324a.c;
                return new com.google.android.apps.search.googleapp.search.b.c(context22, gVar5, jxVar92.fn());
            case 260:
                jxVar93 = this.f324a.c;
                boolean fo = jxVar93.fo();
                int i12 = com.google.android.libraries.search.account.b.a.a;
                return new com.google.android.apps.search.assistant.verticals.reminders.d.c(fo, 1);
            case 261:
                jxVar94 = this.f324a.c;
                return new com.google.android.apps.search.assistant.verticals.reminders.d.c(jxVar94.fq(), 0);
            case 262:
                jxVar95 = this.f324a.c;
                boolean fr = jxVar95.fr();
                jxVar96 = this.f324a.c;
                boolean fs = jxVar96.fs();
                jxVar97 = this.f324a.c;
                Object cF = jxVar97.cF();
                jrVar10 = this.f324a.b;
                hVar109 = jrVar10.kF;
                return new com.google.android.apps.search.googleapp.stampviewer.j.e(fr, fs, (com.google.android.apps.search.googleapp.stampviewer.j.h) cF, (com.google.android.apps.search.googleapp.stampviewer.e.e) hVar109.a());
            case 263:
                hVar110 = this.f324a.f;
                Context context23 = (Context) hVar110.a();
                hVar111 = this.f324a.lj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) hVar111.a();
                jxVar98 = this.f324a.c;
                com.google.android.apps.search.googleapp.stampviewer.b.k ae = jxVar98.ae();
                jrVar11 = this.f324a.b;
                Optional of = Optional.of(Boolean.valueOf(jrVar11.fw()));
                jrVar12 = this.f324a.b;
                com.google.protos.l.a.e bu = jrVar12.bu();
                jrVar13 = this.f324a.b;
                hVar112 = jrVar13.kF;
                com.google.android.apps.search.googleapp.stampviewer.e.e eVar2 = (com.google.android.apps.search.googleapp.stampviewer.e.e) hVar112.a();
                jrVar14 = this.f324a.b;
                return new com.google.android.apps.search.googleapp.stampviewer.b.l(context23, extensionRegistryLite, ae, of, bu, eVar2, jrVar14.hb());
            case 264:
                return new com.google.android.apps.search.googleapp.amp.a.i();
            case 265:
                hVar113 = this.f324a.f;
                Context context24 = (Context) hVar113.a();
                hVar114 = this.f324a.Q;
                ag agVar2 = (ag) hVar114.a();
                hVar115 = this.f324a.bo;
                ag agVar3 = (ag) hVar115.a();
                hVar116 = this.f324a.R;
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.c.l(context24, agVar2, agVar3, (n) hVar116.a());
            case 266:
                jxVar99 = this.f324a.c;
                com.google.android.apps.search.assistant.surfaces.bisto.a.j.k S = jxVar99.S();
                hVar117 = this.f324a.v;
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.j.m(S, (cr) hVar117.a());
            case 267:
                hVar118 = this.f324a.f;
                return com.google.android.apps.gsa.assistant.settings.features.y.a.p.b((Context) hVar118.a());
            case 268:
                jxVar100 = this.f324a.c;
                hVar119 = jxVar100.fX;
                com.google.android.libraries.social.a.c.a aVar6 = (com.google.android.libraries.social.a.c.a) hVar119.a();
                hVar120 = this.f324a.f;
                Context context25 = (Context) hVar120.a();
                jxVar101 = this.f324a.c;
                hVar121 = jxVar101.fW;
                return com.google.android.libraries.social.peoplekit.common.analytics.b.b(aVar6, context25, (Set) hVar121.a());
            case 269:
                jxVar102 = this.f324a.c;
                hVar122 = jxVar102.fW;
                return com.google.android.libraries.social.a.c.c.b((Set) hVar122.a());
            case 270:
                hVar123 = this.f324a.f;
                return com.google.android.libraries.social.peoplekit.common.analytics.b.c((Context) hVar123.a());
            case 271:
                hVar124 = this.f324a.oH;
                com.google.android.apps.gsa.staticplugins.bq.m mVar = (com.google.android.apps.gsa.staticplugins.bq.m) hVar124.a();
                hVar125 = this.f324a.nE;
                com.google.android.apps.gsa.assistant.settings.shared.f fVar = (com.google.android.apps.gsa.assistant.settings.shared.f) hVar125.a();
                hVar126 = this.f324a.xy;
                return new com.google.android.apps.gsa.assistant.settings.features.ao.at(mVar, fVar, (com.google.android.apps.gsa.assistant.settings.shared.i) hVar126.a());
            case 272:
                jxVar103 = this.f324a.c;
                hVar127 = jxVar103.dy;
                com.google.android.apps.gsa.assistant.settings.features.ao.at atVar = (com.google.android.apps.gsa.assistant.settings.features.ao.at) hVar127.a();
                hVar128 = this.f324a.xy;
                com.google.android.apps.gsa.assistant.settings.shared.i iVar = (com.google.android.apps.gsa.assistant.settings.shared.i) hVar128.a();
                hVar129 = this.f324a.gq;
                return new ay(atVar, iVar, (p) hVar129.a());
            case 273:
                hVar130 = this.f324a.hb;
                com.google.android.apps.gsa.nga.api.aq aqVar = (com.google.android.apps.gsa.nga.api.aq) hVar130.a();
                hVar131 = this.f324a.gf;
                SharedPreferences sharedPreferences2 = (SharedPreferences) hVar131.a();
                hVar132 = this.f324a.lt;
                return new com.google.android.apps.gsa.staticplugins.nga.a.a.aa(aqVar, sharedPreferences2, (com.google.android.apps.gsa.nga.shared.al.a.b) hVar132.a());
            case 274:
                hVar133 = this.f324a.gB;
                an anVar = (an) hVar133.a();
                jyVar10 = this.f324a.f319a;
                return new com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.n(anVar, jyVar10.v());
            case 275:
                jo joVar6 = this.f324a;
                com.google.apps.tiktok.q.b.h h = com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.h();
                com.google.apps.tiktok.q.b.k nb = joVar6.nb();
                hVar134 = joVar6.w;
                return com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.d(h, nb, (com.google.android.libraries.storage.a.j) hVar134.a());
            case 276:
                jo joVar7 = this.f324a;
                com.google.apps.tiktok.q.b.h f = com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.f();
                com.google.apps.tiktok.q.b.k nb2 = joVar7.nb();
                hVar135 = joVar7.w;
                return com.google.android.apps.search.assistant.verticals.automation.routines.routineblocks.a.a.a.c(f, nb2, (com.google.android.libraries.storage.a.j) hVar135.a());
            case 277:
                hVar136 = this.f324a.gv;
                return new com.google.android.apps.gsa.search.core.w.h(hVar136);
            case 278:
                hVar137 = this.f324a.f;
                return new com.google.android.gms.auth.l((Context) hVar137.a());
            case 279:
                hVar138 = this.f324a.gB;
                an anVar2 = (an) hVar138.a();
                hVar139 = this.f324a.oH;
                com.google.android.apps.gsa.staticplugins.bq.m mVar2 = (com.google.android.apps.gsa.staticplugins.bq.m) hVar139.a();
                jxVar104 = this.f324a.c;
                com.google.android.apps.gsa.assistant.shared.appactions.h.f H = jxVar104.H();
                hVar140 = this.f324a.gv;
                com.google.android.libraries.gsa.h.h hVar184 = (com.google.android.libraries.gsa.h.h) hVar140.a();
                hVar141 = this.f324a.H;
                return new com.google.android.apps.gsa.staticplugins.opa.appactions.d.h(anVar2, mVar2, H, hVar184, (Executor) hVar141.a());
            case 280:
                hVar142 = this.f324a.gF;
                return new com.google.android.apps.gsa.staticplugins.opa.appactions.d.a(e.c.c.b(hVar142));
            case 281:
                return com.google.android.apps.search.omnient.k.a.b(this.f324a.ln());
            case 282:
                return new com.google.android.libraries.onegoogle.consent.presentation.nativeui.factory.model.n();
            case 283:
                hVar143 = this.f324a.iv;
                com.google.apps.tiktok.g.ax axVar = (com.google.apps.tiktok.g.ax) hVar143.a();
                jxVar105 = this.f324a.c;
                return new com.google.android.libraries.speech.transcription.g.b.l(axVar, jxVar105.az());
            case 284:
                hVar144 = this.f324a.B;
                cr crVar2 = (cr) hVar144.a();
                jxVar106 = this.f324a.c;
                hVar145 = jxVar106.dN;
                ab abVar = (ab) hVar145.a();
                hVar146 = this.f324a.f;
                return new com.google.android.libraries.speech.transcription.voiceime.aq(crVar2, abVar, (Context) hVar146.a());
            case 285:
                jrVar15 = this.f324a.b;
                hVar147 = jrVar15.cO;
                com.google.android.libraries.speech.transcription.g.ah ahVar2 = (com.google.android.libraries.speech.transcription.g.ah) hVar147.a();
                jyVar11 = this.f324a.f319a;
                hVar148 = jyVar11.jd;
                com.google.android.libraries.speech.transcription.d.a aVar7 = (com.google.android.libraries.speech.transcription.d.a) hVar148.a();
                hVar149 = this.f324a.iv;
                com.google.apps.tiktok.g.ax axVar2 = (com.google.apps.tiktok.g.ax) hVar149.a();
                hVar150 = this.f324a.iu;
                com.google.apps.tiktok.g.ay ayVar = (com.google.apps.tiktok.g.ay) hVar150.a();
                jxVar107 = this.f324a.c;
                hVar151 = jxVar107.dL;
                Object a2 = hVar151.a();
                br brVar = new br();
                hVar152 = this.f324a.H;
                cr crVar3 = (cr) hVar152.a();
                jxVar108 = this.f324a.c;
                hVar153 = jxVar108.fZ;
                cg cgVar = (cg) hVar153.a();
                jxVar109 = this.f324a.c;
                com.google.android.libraries.speech.transcription.voiceime.b.a.i aA = jxVar109.aA();
                hVar154 = this.f324a.g;
                return com.google.android.libraries.speech.transcription.voiceime.i.e(ahVar2, aVar7, axVar2, ayVar, a2, brVar, crVar3, cgVar, aA, (a) hVar154.a());
            case 286:
                jrVar16 = this.f324a.b;
                hVar155 = jrVar16.cQ;
                return new com.google.android.libraries.speech.transcription.voiceime.p((com.google.android.libraries.search.b.b) hVar155.a());
            case 287:
                jo joVar8 = this.f324a;
                com.google.apps.tiktok.q.b.h d = com.google.android.libraries.speech.transcription.voiceime.i.d();
                com.google.apps.tiktok.q.b.k nb3 = joVar8.nb();
                hVar156 = joVar8.w;
                return com.google.android.libraries.speech.transcription.voiceime.i.b(d, nb3, (com.google.android.libraries.storage.a.j) hVar156.a());
            case 288:
                jo joVar9 = this.f324a;
                com.google.apps.tiktok.q.b.h b8 = com.google.android.libraries.speech.transcription.voiceime.b.a.k.b();
                com.google.apps.tiktok.q.b.k nb4 = joVar9.nb();
                hVar157 = joVar9.w;
                return com.google.android.libraries.speech.transcription.voiceime.b.a.k.c(b8, nb4, (com.google.android.libraries.storage.a.j) hVar157.a());
            case 289:
                return new com.google.android.libraries.search.account.w();
            case 290:
                this.f324a.mn();
                return new com.google.apps.tiktok.account.e.g.f();
            case 291:
                this.f324a.mn();
                return new com.google.apps.tiktok.account.e.g.f((byte[]) null);
            case 292:
                jo joVar10 = this.f324a;
                hVar158 = joVar10.g;
                hVar159 = joVar10.gq;
                hVar160 = joVar10.gf;
                jxVar110 = joVar10.c;
                hVar161 = jxVar110.ga;
                jo joVar11 = this.f324a;
                hVar162 = joVar11.kg;
                jyVar12 = joVar11.f319a;
                hVar163 = jyVar12.eD;
                jxVar111 = this.f324a.c;
                hVar164 = jxVar111.gb;
                h b9 = e.c.i.b(hVar164);
                jo joVar12 = this.f324a;
                hVar165 = joVar12.mS;
                hVar166 = joVar12.f;
                jxVar112 = joVar12.c;
                hVar167 = jxVar112.gc;
                jo joVar13 = this.f324a;
                hVar168 = joVar13.qy;
                jxVar113 = joVar13.c;
                hVar169 = jxVar113.gd;
                hVar170 = this.f324a.To;
                h b10 = e.c.i.b(hVar170);
                hVar171 = this.f324a.pv;
                h b11 = e.c.i.b(hVar171);
                jo joVar14 = this.f324a;
                hVar172 = joVar14.oe;
                hVar173 = joVar14.qB;
                h b12 = e.c.i.b(hVar173);
                jxVar114 = this.f324a.c;
                hVar174 = jxVar114.dP;
                return new com.google.android.apps.gsa.staticplugins.opa.k(hVar158, hVar159, hVar160, hVar161, hVar162, hVar163, b9, hVar165, hVar166, hVar167, hVar168, hVar169, b10, b11, hVar172, b12, hVar174);
            case 293:
                hVar175 = this.f324a.ob;
                return at.k((com.google.android.apps.gsa.staticplugins.opa.util.at) hVar175.a());
            case 294:
                hVar176 = this.f324a.gf;
                return new com.google.android.apps.gsa.staticplugins.opa.util.br((SharedPreferences) hVar176.a());
            case 295:
                jyVar13 = this.f324a.f319a;
                return at.k(jyVar13.aF());
            case 296:
                hVar177 = this.f324a.iD;
                return at.k((com.google.android.apps.gsa.nga.shared.q.a.j) hVar177.a());
            case 297:
                hVar178 = this.f324a.g;
                a aVar8 = (a) hVar178.a();
                jo joVar15 = this.f324a;
                com.google.android.apps.gsa.assistant.shared.ao P = joVar15.P();
                hVar179 = joVar15.gp;
                com.google.android.libraries.gsa.h.h hVar185 = (com.google.android.libraries.gsa.h.h) hVar179.a();
                hVar180 = this.f324a.gq;
                p pVar3 = (p) hVar180.a();
                hVar181 = this.f324a.iF;
                com.google.android.apps.gsa.nga.shared.q.a.x xVar = (com.google.android.apps.gsa.nga.shared.q.a.x) hVar181.a();
                hVar182 = this.f324a.hG;
                return new com.google.android.apps.gsa.assistant.shared.ah(aVar8, P, hVar185, pVar3, xVar, e.c.c.b(hVar182));
            case 298:
                return new com.google.android.apps.gsa.staticplugins.opa.e.b();
            case 299:
                jo joVar16 = this.f324a;
                com.google.android.libraries.search.assistant.invocation.u.e.a.bl agv = joVar16.agv();
                hVar183 = joVar16.Q;
                return new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.a.a.i(agv, (ag) hVar183.a());
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        fu dVar;
        int i = this.b;
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
                dVar = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.b.d((com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.b.j) this.f324a.c.dT.a(), (ag) this.f324a.bo.a());
                break;
            case 301:
                io.grpc.i iVar = (io.grpc.i) this.f324a.eA.a();
                iVar.getClass();
                dVar = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.b.j(iVar, io.grpc.h.a);
                break;
            case 302:
                dVar = new com.google.android.apps.search.googleapp.launcher.c.f(((com.google.apps.tiktok.experiments.e) new m(this.f324a.c.f325a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 24").f(), (Context) this.f324a.f.a());
                break;
            case 303:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new m(this.f324a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 45402356").f());
                break;
            case 304:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new m(this.f324a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 44").f());
                break;
            case 305:
                y yVar = (y) this.f324a.W.a();
                yVar.ap(com.google.protobuf.b.b.c(new h.a.a.as.a.a.j(this.f324a.V).f()));
                dVar = new com.google.android.apps.search.googleapp.x.d.b(yVar);
                break;
            case 306:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new m(this.f324a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 45418807").f());
                break;
            case 307:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new m(this.f324a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 45531184").f());
                break;
            case 308:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("assistant_auto_tng_libraries_device 45612598").f());
                break;
            case 309:
                dVar = fu.n("fluid_action_debug_data_provider", (com.google.apps.tiktok.h.a.h) this.f324a.b.fA.a(), "task_graphs", (com.google.apps.tiktok.h.a.h) this.f324a.wq.a());
                break;
            case 310:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45649746").f());
                break;
            case 311:
                dVar = new com.google.android.apps.gsa.h.a((SharedPreferences) this.f324a.gf.a(), (p) this.f324a.gq.a());
                break;
            case 312:
                jo joVar = this.f324a;
                dVar = new bk(joVar.gv, joVar.c.eh);
                break;
            case 313:
                jo joVar2 = this.f324a;
                h hVar = joVar2.f319a.eY;
                h hVar2 = joVar2.gq;
                h hVar3 = joVar2.gy;
                h b = e.c.i.b(joVar2.oZ);
                h b2 = e.c.i.b(this.f324a.is);
                jo joVar3 = this.f324a;
                jx jxVar = joVar3.c;
                jy jyVar = joVar3.f319a;
                h hVar4 = jyVar.hd;
                h hVar5 = joVar3.aD;
                h hVar6 = joVar3.oY;
                h hVar7 = joVar3.gt;
                h hVar8 = jxVar.dQ;
                h hVar9 = joVar3.nW;
                h b3 = e.c.i.b(joVar3.gF);
                h b4 = e.c.i.b(this.f324a.hG);
                jo joVar4 = this.f324a;
                jx jxVar2 = joVar4.c;
                h hVar10 = joVar4.gm;
                h hVar11 = joVar4.aF;
                h hVar12 = joVar4.hI;
                h hVar13 = joVar4.nl;
                h hVar14 = joVar4.hZ;
                h hVar15 = joVar4.g;
                h hVar16 = joVar4.qu;
                h hVar17 = joVar4.kg;
                h hVar18 = joVar4.oB;
                h hVar19 = jxVar2.dR;
                h b5 = e.c.i.b(joVar4.mZ);
                jo joVar5 = this.f324a;
                h hVar20 = jyVar.ic;
                jx jxVar3 = joVar5.c;
                h hVar21 = joVar5.mW;
                h hVar22 = joVar5.iF;
                h hVar23 = jxVar3.dS;
                h hVar24 = jxVar3.ee;
                h hVar25 = jxVar3.dU;
                h hVar26 = jxVar3.eg;
                h hVar27 = joVar5.bK;
                h hVar28 = jxVar3.dP;
                dVar = new com.google.android.apps.gsa.assist.av(hVar, hVar2, hVar3, b, b2, hVar4, hVar5, hVar6, hVar7, hVar8, jyVar.aD, hVar9, hVar20, b3, b4, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, joVar4.f319a.az, hVar16, hVar17, hVar18, hVar19, b5, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28);
                break;
            case 314:
                jo joVar6 = this.f324a;
                dVar = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.a.ac(joVar6.f319a.dC(), joVar6.jN());
                break;
            case 315:
                dVar = com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.h.f.a((com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.h.b) this.f324a.c.ef.a());
                break;
            case 316:
                dVar = new jv(this);
                break;
            case 317:
                dVar = new com.google.android.apps.gsa.staticplugins.nga.vis.a.d((com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.g) this.f324a.f319a.dW.a(), (com.google.android.apps.gsa.shared.util.c.a.aw) this.f324a.he.a());
                break;
            case 318:
                dVar = new com.google.android.apps.gsa.nga.shared.q.a.d(Optional.of((com.google.android.apps.gsa.staticplugins.nga.k.n) this.f324a.hc.a()), (com.google.android.libraries.gsa.h.h) this.f324a.gz.a(), (a) this.f324a.g.a(), (com.google.android.apps.gsa.shared.logger.b.h) this.f324a.hG.a());
                break;
            case 319:
                dVar = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b.c((ag) this.f324a.Q.a(), (Executor) this.f324a.H.a());
                break;
            case 320:
                dVar = new com.google.android.apps.gsa.staticplugins.nga.vis.ac();
                break;
            case 321:
                dVar = new nz(this);
                break;
            case 322:
                dVar = new com.google.android.libraries.search.assistant.invocation.k.d.n((com.google.android.libraries.search.assistant.invocation.k.e.y) this.f324a.tA.a());
                break;
            case 323:
                dVar = new nz(this);
                break;
            case 324:
                dVar = new com.google.android.libraries.search.assistant.invocation.h.d.a.a.s((a) this.f324a.g.a(), ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45373927").d());
                break;
            case 325:
                dVar = new nz(this);
                break;
            case 326:
                jx jxVar4 = this.f324a.c;
                dVar = Optional.of(new com.google.android.apps.search.omnient.host.c.c((Context) jxVar4.f325a.f.a(), jxVar4.af()));
                break;
            case 327:
                dVar = new com.google.android.apps.gsa.tasks.au((com.google.android.apps.gsa.tasks.m) this.f324a.gP.a(), (com.google.android.apps.gsa.tasks.j) this.f324a.f319a.bE.a(), (a) this.f324a.g.a(), ((Integer) this.f324a.gj.a()).intValue());
                break;
            case 328:
                dVar = (com.google.protobuf.ao) ((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45407003").d();
                break;
            case 329:
                dVar = (com.google.protobuf.ao) ((com.google.apps.tiktok.experiments.e) this.f324a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45407004").d();
                break;
            case 330:
                dVar = new com.google.android.apps.search.soundsearch.quicksettings.j((Context) this.f324a.f.a());
                break;
            case 331:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45638093").f());
                break;
            case 332:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45368828").f());
                break;
            case 333:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45400531").f());
                break;
            case 334:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45429477").f());
                break;
            case 335:
                dVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f324a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45419686").b());
                break;
            case 336:
                dVar = new com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.f();
                break;
            case 337:
                dVar = new com.google.android.libraries.assistant.contexttrigger.interactor.a();
                break;
            case 338:
                dVar = new com.google.android.libraries.assistant.contexttrigger.interactor.b();
                break;
            case 339:
                Context context = (Context) this.f324a.f.a();
                jo joVar7 = this.f324a;
                ActivityManager v = joVar7.v();
                e.a b6 = e.c.c.b(joVar7.oz);
                jx jxVar5 = this.f324a.c;
                dVar = new com.google.android.apps.gsa.staticplugins.opa.j.a.s(context, v, b6, jxVar5.M(), new op((com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d) jxVar5.eF.a()), Optional.empty(), (com.google.android.apps.gsa.shared.util.q.a) this.f324a.hh.a(), (com.google.android.apps.gsa.shared.util.debug.d) this.f324a.aD.a(), (cr) this.f324a.H.a(), (dj) this.f324a.bK.a(), (a) this.f324a.g.a(), (com.google.android.apps.gsa.opa.a.a.a) this.f324a.nK.a());
                break;
            case 340:
                dVar = new com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e.d((com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g) this.f324a.c.eE.a());
                break;
            case 341:
                dVar = this.f324a.f319a.aq().a(2);
                break;
            case 342:
                dVar = (com.google.android.libraries.assistant.contexttrigger.d.b) io.grpc.j.c.g(new com.google.android.libraries.assistant.contexttrigger.d.a(), (io.grpc.i) this.f324a.kz.a(), io.grpc.h.a);
                dVar.getClass();
                break;
            case 343:
                dVar = new com.google.android.apps.gsa.assistant.shared.e.l(e.c.c.b(this.f324a.hh), (Context) this.f324a.f.a(), e.c.c.b(this.f324a.nk), e.c.c.b(this.f324a.jR), (com.google.android.libraries.gsa.h.h) this.f324a.gv.a(), (com.google.android.libraries.gsa.h.h) this.f324a.gz.a(), (NotificationManager) this.f324a.I.a());
                break;
            case 344:
                dVar = new com.google.android.libraries.assistant.auto.jumpboost.b.h.a();
                break;
            case 345:
                jx jxVar6 = this.f324a.c;
                dVar = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.b.i(ha.u((com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m) jxVar6.eH.a(), (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m) jxVar6.f325a.fl.a(), (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m) jxVar6.eI.a(), (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m) jxVar6.f325a.tv.a()), (lt) this.f324a.c.eK.a(), (lt) this.f324a.c.eL.a());
                break;
            case 346:
                dVar = new bb((Context) this.f324a.f.a(), (bv) this.f324a.kO.a(), new com.google.android.libraries.search.assistant.invocation.p.f((com.google.android.libraries.search.assistant.invocation.p.ad) this.f324a.c.eG.a()), (jt) this.f324a.eF.a(), (com.google.android.libraries.search.assistant.invocation.n.d.i) this.f324a.eY.a(), (a) this.f324a.g.a(), (ag) this.f324a.Q.a(), (cr) this.f324a.H.a(), ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45628358").f());
                break;
            case 347:
                com.google.android.libraries.search.account.k kVar = (com.google.android.libraries.search.account.k) this.f324a.bM.a();
                com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f324a.bN.a();
                jo joVar8 = this.f324a;
                dVar = new com.google.android.libraries.search.assistant.invocation.p.ad(kVar, bVar, joVar8.kb(), (com.google.android.libraries.search.assistant.invocation.j.a.q) joVar8.eC.a(), (ag) this.f324a.Q.a(), ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45628357").f(), (com.google.android.libraries.search.assistant.invocation.n.d.i) this.f324a.eY.a(), (a) this.f324a.g.a());
                break;
            case 348:
                dVar = new com.google.android.apps.gsa.nga.shared.j.a.a.a.h((com.google.android.apps.gsa.nga.shared.j.a.a.a.ae) this.f324a.th.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.f324a.ti.a(), (com.google.android.libraries.search.ah.e.a.e.b) this.f324a.rD.a(), new com.google.android.apps.gsa.nga.shared.j.a.a.a.y((com.google.android.apps.gsa.search.shared.service.e.e) this.f324a.c.f325a.jv.a()), ((com.google.apps.tiktok.experiments.e) this.f324a.c.f325a.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45410674").d(), (ag) this.f324a.bo.a(), (cr) this.f324a.v.a());
                break;
            case 349:
                dVar = new lt(this);
                break;
            case 350:
                dVar = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.b.e();
                break;
            case 351:
                dVar = new lt(this);
                break;
            case 352:
                com.google.android.libraries.speech.transcription.g.h.m mVar = (com.google.android.libraries.speech.transcription.g.h.m) this.f324a.b.cS.a();
                nr nrVar = nr.a;
                nrVar.getClass();
                dVar = new com.google.android.libraries.speech.transcription.g.h.v(mVar, nrVar);
                break;
            case 353:
                dVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.c.c((com.google.common.v.f) this.f324a.ez.a(), (com.google.android.apps.search.assistant.surfaces.bisto.a.c.e) this.f324a.c.eN.a(), (Executor) this.f324a.v.a());
                break;
            case 354:
                cg cgVar = (cg) this.f324a.f319a.fK.a();
                jo joVar9 = this.f324a;
                dVar = new com.google.android.apps.search.assistant.surfaces.bisto.a.c.e(cgVar, joVar9.f319a.pt(), (Executor) joVar9.v.a());
                break;
            case 355:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.a.a.a.b.a.a.c(this.f324a.V).a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_tng_interactor.device 45658492").f());
                break;
            case 356:
                dVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.s(this.f324a.V).a.a()).a("com.google.android.apps.search.assistant.device 45623390").f());
                break;
            case 357:
                dVar = new com.google.android.apps.gsa.staticplugins.bisto.notifications.h.a();
                break;
            case 358:
                dVar = new com.google.android.apps.gsa.staticplugins.bisto.k.a.a();
                break;
            case 359:
                com.google.android.apps.gsa.nga.shared.j.b.n nVar = (com.google.android.apps.gsa.nga.shared.j.b.n) this.f324a.sQ.a();
                com.google.android.apps.gsa.nga.shared.j.b.a aVar = (com.google.android.apps.gsa.nga.shared.j.b.a) this.f324a.kp.a();
                jx jxVar7 = this.f324a.c;
                jo joVar10 = jxVar7.f325a;
                Object a2 = jxVar7.eT.a();
                com.google.android.apps.gsa.nga.shared.j.b.n nVar2 = (com.google.android.apps.gsa.nga.shared.j.b.n) jxVar7.f325a.sQ.a();
                nVar2.getClass();
                com.google.common.base.cl.d(new com.google.android.apps.gsa.nga.shared.j.b.g(nVar2, 3));
                jx jxVar8 = this.f324a.c;
                com.google.android.apps.gsa.nga.shared.j.b.n nVar3 = (com.google.android.apps.gsa.nga.shared.j.b.n) jxVar8.f325a.sQ.a();
                nVar3.getClass();
                com.google.common.base.cl.d(new com.google.android.apps.gsa.nga.shared.j.b.g(nVar3, 2));
                jo joVar11 = this.f324a;
                jx jxVar9 = joVar11.c;
                h hVar29 = jxVar9.f325a.sR;
                com.google.android.libraries.search.d.d.aa kx = joVar11.kx();
                com.google.android.apps.gsa.nga.shared.j.b.k kVar2 = (com.google.android.apps.gsa.nga.shared.j.b.k) hVar29.a();
                com.google.android.apps.gsa.nga.shared.d.b bVar2 = (com.google.android.apps.gsa.nga.shared.d.b) jxVar9.f325a.kh.a();
                com.google.android.apps.gsa.nga.shared.d.d.c cVar = new com.google.android.apps.gsa.nga.shared.d.d.c(kVar2, bVar2, (com.google.android.libraries.gsa.h.h) jxVar9.f325a.ke.a(), (com.google.android.apps.gsa.nga.api.au) jxVar9.f325a.kf.a());
                dVar = new com.google.android.apps.gsa.nga.shared.j.b.h(nVar, aVar, (com.google.android.apps.gsa.nga.shared.j.b.e) a2, kx, cVar, (com.google.android.apps.gsa.shared.util.q.a) this.f324a.hh.a());
                break;
            case 360:
                dVar = new com.google.android.apps.gsa.nga.shared.j.b.e((com.google.android.apps.gsa.nga.shared.j.b.n) this.f324a.sQ.a(), (com.google.android.apps.gsa.nga.shared.j.a.a.a.s) this.f324a.c.eS.a(), (com.google.android.libraries.gsa.h.h) this.f324a.gp.a(), (com.google.android.libraries.gsa.h.h) this.f324a.ke.a(), (com.google.android.apps.gsa.nga.api.au) this.f324a.kf.a(), (com.google.android.apps.gsa.nga.shared.d.b) this.f324a.kh.a(), (com.google.android.apps.gsa.nga.shared.j.b.a) this.f324a.kp.a(), (com.google.android.apps.gsa.nga.shared.ad.a.d) this.f324a.kd.a(), (com.google.android.apps.gsa.nga.shared.ad.a.c) this.f324a.f319a.E.a(), (com.google.android.apps.gsa.shared.util.q.a) this.f324a.hh.a());
                break;
            case 361:
                jo joVar12 = this.f324a;
                dVar = new com.google.android.apps.gsa.nga.shared.j.a.a.a.s(joVar12.kj(), (com.google.android.apps.gsa.nga.shared.j.a.a.r) joVar12.sY.a(), (com.google.android.apps.gsa.nga.shared.j.b.k) this.f324a.sR.a(), (com.google.android.libraries.search.assistant.invocation.n.d.i) this.f324a.eY.a(), (a) this.f324a.g.a(), (ag) this.f324a.bo.a());
                break;
            case 362:
                dVar = new com.google.android.apps.gsa.nga.shared.d.a.a();
                break;
            case 363:
                dVar = new com.google.android.apps.gsa.staticplugins.bisto.v.a.q(Optional.of((com.google.android.apps.gsa.nga.shared.j.b.h) this.f324a.c.eU.a()), (Executor) this.f324a.v.a());
                break;
            case 364:
                dVar = new com.google.android.apps.gsa.staticplugins.bisto.util.ae((Context) this.f324a.f.a());
                break;
            case 365:
                dVar = new com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.m();
                break;
            case 366:
                dVar = ((com.google.android.libraries.gsa.c.b.k) this.f324a.hC.a()).d();
                dVar.getClass();
                break;
            case 367:
                dVar = new com.google.android.apps.gsa.staticplugins.smartspace.f((com.google.android.apps.gsa.staticplugins.opa.smartspace.k.q) this.f324a.oL.a(), (a) this.f324a.g.a(), (p) this.f324a.gq.a(), (com.google.android.apps.gsa.smartspace.k) this.f324a.ov.a());
                break;
            case 368:
                dVar = new com.google.android.apps.gsa.staticplugins.nga.v.e((com.google.android.apps.gsa.staticplugins.nga.a.a.bg) this.f324a.gR.a(), (bz) this.f324a.hP.a(), (com.google.android.libraries.gsa.h.h) this.f324a.gp.a(), (com.google.android.apps.gsa.staticplugins.nga.u.j) this.f324a.lE.a(), (com.google.android.apps.gsa.staticplugins.nga.k.n) this.f324a.hc.a(), (com.google.android.apps.gsa.staticplugins.nga.u.a.n) this.f324a.mC.a(), (com.google.android.apps.gsa.assistant.settings.shared.t) this.f324a.gW.a());
                break;
            case 369:
                jo joVar13 = this.f324a.c.f325a;
                dVar = new bf(joVar13.gL, joVar13.gM, joVar13.g, joVar13.gn).a();
                break;
            case 370:
                Context context2 = (Context) this.f324a.f.a();
                jx jxVar10 = this.f324a.c;
                Context context3 = (Context) jxVar10.f325a.f.a();
                jo joVar14 = jxVar10.f325a;
                dVar = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.a.l(context2, new com.google.android.libraries.search.assistant.notification.a.a.k(context3, new com.google.android.libraries.search.assistant.notification.b.h(joVar14.f, jxVar10.fe, joVar14.H), (Executor) jxVar10.f325a.H.a()), (Executor) this.f324a.H.a());
                break;
            case 371:
                jx jxVar11 = this.f324a.c;
                dVar = new com.google.android.libraries.search.assistant.notification.b.k(new com.google.android.libraries.search.assistant.notification.c.b((Context) jxVar11.f325a.f.a(), (com.google.apps.tiktok.g.p) jxVar11.f325a.nr.a(), (Executor) jxVar11.f325a.H.a()), (Executor) this.f324a.H.a());
                break;
            case 372:
                jr jrVar = this.f324a.b;
                dVar = fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, jrVar.dB, com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, jrVar.dD);
                break;
            default:
                throw new AssertionError(i);
        }
        return dVar;
    }
}
