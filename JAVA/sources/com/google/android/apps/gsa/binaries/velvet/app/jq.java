package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.l.a.a.b$;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bi;
import com.google.android.apps.search.assistant.surfaces.bisto.d.ch;
import com.google.android.apps.search.assistant.surfaces.voice.j.a.d.a.f;
import com.google.android.apps.search.assistant.surfaces.voice.o.p;
import com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.a.u;
import com.google.android.apps.search.assistant.surfaces.voice.ui.response.af;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.z;
import com.google.android.apps.search.podcasts.player.impl.ab;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.k;
import com.google.android.gms.common.v;
import com.google.android.libraries.appintegration.jam.data.b.a.o;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa;
import com.google.android.libraries.assistant.auto.tng.f.d.c.b.ae;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.az;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.e.a.s;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.SuggestionDatabase;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ay;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bb;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.y;
import com.google.android.libraries.lens.view.shared.as;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.a.a.e;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.j.b.ai;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.j.b.q;
import com.google.android.libraries.search.assistant.proactive.storage.NotificationsDatabase;
import com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.db.SpokenNotificationMetadataDatabase;
import com.google.android.libraries.search.d.o.a.w;
import com.google.android.libraries.search.location.compliance.be;
import com.google.android.libraries.speech.transcription.g.ah;
import com.google.android.libraries.speech.transcription.g.ak;
import com.google.android.libraries.speech.transcription.g.al;
import com.google.android.libraries.speech.transcription.g.am;
import com.google.android.libraries.speech.transcription.g.bl;
import com.google.android.libraries.speech.transcription.g.br;
import com.google.android.libraries.speech.transcription.g.h.n;
import com.google.android.libraries.speech.transcription.recording.AudioRecordingProvider;
import com.google.android.libraries.storage.a.j;
import com.google.android.libraries.storage.protostore.bf;
import com.google.android.libraries.storage.protostore.bg;
import com.google.android.libraries.storage.protostore.ca;
import com.google.android.libraries.storage.protostore.cg;
import com.google.android.libraries.storage.protostore.x;
import com.google.android.libraries.web.o.a.a.a.aj;
import com.google.android.libraries.web.o.a.a.a.t;
import com.google.apps.tiktok.account.data.a.d;
import com.google.apps.tiktok.concurrent.ao;
import com.google.apps.tiktok.experiments.b;
import com.google.apps.tiktok.experiments.l;
import com.google.apps.tiktok.experiments.phenotype.de;
import com.google.apps.tiktok.g.ax;
import com.google.apps.tiktok.p.c;
import com.google.apps.tiktok.q.b.g;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.base.bd;
import com.google.common.base.bu;
import com.google.common.q.m;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.db;
import com.google.common.util.concurrent.dl;
import com.google.g.af.c.di;
import com.google.g.e.h.a.bq;
import com.google.g.e.i.do;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ba;
import com.google.protobuf.dz;
import com.google.speech.g.bn;
import com.google.speech.g.bp;
import e.c.h;
import h.a.a.aj.a.a.i;
import h.a.a.b.a.a.r;
import h.a.a.y.c.a.a;
import io.grpc.ar;
import io.grpc.b.a.az$;
import io.grpc.cb;
import io.grpc.cx;
import io.grpc.ep;
import j$.time.ZoneId;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.logging.Level;
import kotlinx.coroutines.ag;
import o.a.e.e.a.cn;
import org.chromium.net.NetworkException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/jq.class */
public final class jq implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f321a;
    private final int b;

    public jq(jo joVar, int i) {
        this.f321a = joVar;
        this.b = i;
    }

    private final Object b() {
        int i = this.b;
        switch (i) {
            case 0:
                return new e();
            case 1:
                return new l(jr.hQ(), nr.a);
            case 2:
                return new l(jr.hR(), nr.a);
            case 3:
                return new l(jr.hS(), nr.a);
            case 4:
                return new l(jr.hT(), nr.a);
            case 5:
                return new l(ha.w(new a(1), new a(0), new a(2), new a(3), new a(4), new a(5), new b[]{new a(6), new a(7), new a(8), new a(9), new a(10), new a(11)}), nr.a);
            case 6:
                return new l(ha.v(new h.a.a.ab.b.a.a(1), new h.a.a.ab.b.a.a(0), new h.a.a.ab.b.a.a(2), new h.a.a.ab.b.a.a(3), new h.a.a.ab.b.a.a(4)), nr.a);
            case 7:
                return new l(new op(new h.a.a.ag.a.a.a()), nr.a);
            case 8:
                return new l(new op(new h.a.a.ai.a.b.a.b()), nr.a);
            case 9:
                return new l(new op(new i()), nr.a);
            case 10:
                return new l(ha.s(new h.a.a.am.b.a.a(1), new h.a.a.am.b.a.a(0)), nr.a);
            case 11:
                return new l(new op(new h.a.a.ao.a.a.a()), nr.a);
            case 12:
                return new l(ha.u(new h.a.a.as.b.a.b(1), new h.a.a.as.b.a.b(0), new h.a.a.as.b.a.b(2), new h.a.a.as.b.a.b(3)), nr.a);
            case 13:
                jo joVar = this.f321a;
                bn a2 = com.google.android.libraries.assistant.c.e.a.a.a.a(joVar.b.bx(), (Context) joVar.f.a());
                a2.getClass();
                return a2;
            case 14:
                m a3 = com.google.android.libraries.search.n.a.a("s3.grpc.url", "speechs3proto2-pa.googleapis.com", 443);
                com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                lVar.a = a3.a;
                lVar.b = Integer.valueOf(a3.a());
                lVar.b(com.google.speech.g.d.b.e);
                return lVar.a();
            case 15:
                return new com.google.apps.tiktok.p.i((cq) this.f321a.n.a(), (cq) this.f321a.H.a(), (k) this.f321a.bx.a(), c.a("oauth2:https://www.googleapis.com/auth/assistant"), (d) this.f321a.bq.a(), (com.google.android.libraries.g.a) this.f321a.g.a());
            case 16:
                return new com.google.android.apps.search.assistant.verticals.ambient.feedback.a.a.a((com.google.android.libraries.g.a) this.f321a.g.a());
            case 17:
                Context context = (Context) this.f321a.f.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f321a.H.a();
                context.getClass();
                scheduledExecutorService.getClass();
                return new p(scheduledExecutorService, new com.google.android.libraries.ax.c(context, "STREAMZ_MOBILE_ASSISTANT", null), (Application) context);
            case 18:
                return new be();
            case 19:
                jr jrVar = this.f321a.b;
                com.google.android.libraries.web.d.b bVar = (com.google.android.libraries.web.d.b) jrVar.f322a.f319a.fX.a();
                com.google.android.libraries.web.n.b bVar2 = (com.google.android.libraries.web.n.b) jrVar.f322a.uF.a();
                bVar.getClass();
                bVar2.getClass();
                g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "WebX_GaiaCookieManager_WebViewLastVerifiedOrRefreshedAccountState";
                a4.c(aj.a);
                a4.b = at.k(new t(bVar2));
                com.google.apps.tiktok.q.b.h a5 = a4.a();
                jo joVar2 = this.f321a;
                return joVar2.nb().a(a5, (j) joVar2.w.a());
            case 20:
                return new kotlinx.coroutines.i.d();
            case 21:
                com.google.android.gms.common.e eVar = com.google.android.gms.common.e.f2608a;
                eVar.getClass();
                return eVar;
            case 22:
                return new com.google.android.apps.search.assistant.verticals.ambient.trigger.g.c(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45353439").a(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45353440").d(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45353441").a(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45353342").a());
            case 23:
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.b(com.google.at.f.a.a.b.d);
                return lVar2.a();
            case 24:
                String e = ((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("com.google.android.apps.gsa.pcp.device 1").e();
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.a = e;
                lVar3.b = 443;
                lVar3.b(com.google.aw.l.a.a.b.l);
                return lVar3.a();
            case 25:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45371867").d();
            case 26:
                f fVar = (f) this.f321a.b.v.a();
                fVar.getClass();
                return new com.google.android.apps.search.assistant.surfaces.voice.j.a.c.d(new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.a(fVar, 1), new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.a(fVar, 0), com.google.android.apps.search.assistant.surfaces.voice.j.a.d.c.f2222a);
            case 27:
                ag agVar = (ag) this.f321a.Q.a();
                jo joVar3 = this.f321a;
                return new f(agVar, joVar3.u(), (ao) joVar3.bz.a(), (dj) this.f321a.bK.a());
            case 28:
                return new com.google.android.apps.gsa.u.e.a(e.c.c.b(this.f321a.it));
            case 29:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45377900").f());
            case 30:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45377901").f());
            case 31:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.apps.search.assistant.device 45418706").f());
            case 32:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45373781").d();
            case 33:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45373884").d();
            case 34:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45381001").f());
            case 35:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45384116").b());
            case 36:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.apps.search.assistant.device 45380273").f());
            case 37:
                return new androidx.slice.j((Context) this.f321a.f.a());
            case 38:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.ip().a.a()).a("assistant_auto_tng_libraries_device 45382499").b());
            case 39:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.ip().a.a()).a("assistant_auto_tng_libraries_device 45384175").a());
            case 40:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.ip().a.a()).a("assistant_auto_tng_libraries_device 45382522").d();
            case 41:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.ip().a.a()).a("assistant_auto_tng_libraries_device 45383085").f());
            case 42:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45353765").b());
            case 43:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45381127").b());
            case 44:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45376913").d();
            case 45:
                com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                lVar4.a = "proactivebackend-pa.googleapis.com";
                lVar4.b = 443;
                lVar4.b(com.google.g.af.d.a.b.d);
                return lVar4.a();
            case 46:
                g a6 = com.google.apps.tiktok.q.b.h.a();
                a6.f5883a = "LastCalendarSync";
                a6.c(com.google.android.libraries.assistant.pcp.v.b.a.a.a);
                com.google.apps.tiktok.q.b.h a7 = a6.a();
                jo joVar4 = this.f321a;
                return joVar4.nb().a(a7, (j) joVar4.w.a());
            case 47:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.a.f(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45386805").d();
            case 48:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45531022").d();
            case 49:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.a.f(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45386804").f());
            case 50:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.a.f(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45399508").f());
            case 51:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.a.f(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45531065").b());
            case 52:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.a.f(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45625392").d();
            case 53:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45636730").d();
            case 54:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45636731").d();
            case 55:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45640708").f());
            case 56:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45643351").d();
            case 57:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45653844").f());
            case 58:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45658913").f());
            case 59:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45658914").f());
            case 60:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45659175").f());
            case 61:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eM().a.a()).a("com.google.android.apps.search.assistant.device 45659176").f());
            case 62:
                g a8 = com.google.apps.tiktok.q.b.h.a();
                a8.f5883a = "ProactiveConfig";
                a8.c(di.a);
                com.google.apps.tiktok.q.b.h a9 = a8.a();
                jo joVar5 = this.f321a;
                return joVar5.nb().a(a9, (j) joVar5.w.a());
            case 63:
                com.google.android.libraries.search.assistant.proactive.storage.b D = ((NotificationsDatabase) this.f321a.b.af.a()).D();
                D.getClass();
                return D;
            case 64:
                com.google.apps.tiktok.q.c.g a10 = com.google.apps.tiktok.q.c.h.a();
                a10.a = "opa_notifications_db";
                a10.d = new com.google.apps.tiktok.q.a.c(3, 2);
                a10.c = new com.google.apps.tiktok.q.c.a(0);
                NotificationsDatabase a11 = this.f321a.nd().a(a10.a(), NotificationsDatabase.class, new Object[0]);
                a11.getClass();
                return a11;
            case 65:
                Context context2 = (Context) this.f321a.f.a();
                Executor executor = (Executor) this.f321a.H.a();
                e.a b = e.c.c.b(this.f321a.im);
                jo joVar6 = this.f321a;
                com.google.android.libraries.search.assistant.proactive.ag kr = joVar6.kr();
                Random random = (Random) joVar6.lr.a();
                com.google.common.v.f fVar2 = (com.google.common.v.f) this.f321a.ez.a();
                jo joVar7 = this.f321a;
                return new com.google.android.libraries.search.assistant.proactive.f(context2, executor, b, kr, random, fVar2, joVar7.f319a.se(), (com.google.android.libraries.search.assistant.proactive.h.c) joVar7.in.a());
            case 66:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.c.a.c((cq) this.f321a.H.a());
            case 67:
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.f D2 = ((SuggestionDatabase) this.f321a.b.ak.a()).D();
                D2.getClass();
                return D2;
            case 68:
                SuggestionDatabase a12 = this.f321a.nd().a((com.google.apps.tiktok.q.c.h) this.f321a.b.aj.a(), SuggestionDatabase.class, new Object[0]);
                a12.getClass();
                return a12;
            case 69:
                com.google.apps.tiktok.q.c.g a13 = com.google.apps.tiktok.q.c.h.a();
                a13.a = "assistant-auto-suggestion.db";
                a13.c = new com.google.apps.tiktok.q.c.a(0);
                androidx.room.e.a[] aVarArr = com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.au.t;
                for (int i2 = 0; i2 < 19; i2++) {
                    a13.b().h(aVarArr[i2]);
                }
                return a13.a();
            case 70:
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.f fVar3 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.f) this.f321a.b.al.a();
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m mVar = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m) this.f321a.b.am.a();
                y yVar = (y) this.f321a.b.ao.a();
                ay ayVar = (ay) this.f321a.b.ap.a();
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f321a.g.a();
                Executor executor2 = (Executor) this.f321a.v.a();
                jr jrVar2 = this.f321a.b;
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.c cVar = new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.c(jrVar2.fr(), 1);
                Context context3 = (Context) this.f321a.f.a();
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar2 = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) this.f321a.b.au.a();
                jr jrVar3 = this.f321a.b;
                return new s(fVar3, mVar, yVar, ayVar, aVar, executor2, jrVar2.at, cVar, context3, eVar2, jrVar3.av, jrVar3.aw);
            case 71:
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m E = ((SuggestionDatabase) this.f321a.b.ak.a()).E();
                E.getClass();
                return E;
            case 72:
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.s F = ((SuggestionDatabase) this.f321a.b.ak.a()).F();
                F.getClass();
                return F;
            case 73:
                y G = ((SuggestionDatabase) this.f321a.b.ak.a()).G();
                G.getClass();
                return G;
            case 74:
                ay H = ((SuggestionDatabase) this.f321a.b.ak.a()).H();
                H.getClass();
                return H;
            case 75:
                bb I = ((SuggestionDatabase) this.f321a.b.ak.a()).I();
                I.getClass();
                return I;
            case 76:
                Executor executor3 = (Executor) this.f321a.v.a();
                jr jrVar4 = this.f321a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.a.b(executor3, new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.b.d(jrVar4.ar, jrVar4.as));
            case 77:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353532").e();
            case 78:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45415315").e();
            case 79:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e((com.google.android.libraries.g.a) this.f321a.g.a());
            case 80:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353525").b());
            case 81:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353519").f());
            case 82:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45360660").b());
            case 83:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sC().a.a()).a("assistant_auto_tng_libraries_device 45407322").f());
            case 84:
                return new com.google.android.gms.contextmanager.a.a();
            case 85:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45491504").f());
            case 86:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45418515").f());
            case 87:
                com.google.apps.tiktok.p.l lVar5 = new com.google.apps.tiktok.p.l();
                lVar5.a = "zerostateproxy-pa.googleapis.com";
                lVar5.b = 443;
                lVar5.b(com.google.aw.l.a.a.b.l);
                return lVar5.a();
            case 88:
                return Optional.empty();
            case 89:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a.d((cq) this.f321a.H.a());
            case 90:
                com.google.android.libraries.search.assistant.aw.c.a.a aVar2 = new com.google.android.libraries.search.assistant.aw.c.a.a();
                jr jrVar5 = this.f321a.b;
                return new com.google.android.libraries.search.assistant.aw.n.b.j(aVar2, jrVar5.aG(), (lt) jrVar5.aF.a(), (Context) this.f321a.f.a(), (Executor) this.f321a.v.a(), (ag) this.f321a.bo.a());
            case 91:
                return new com.google.android.libraries.search.assistant.aw.e.b.d(e.c.c.b(this.f321a.W), (ag) this.f321a.bo.a());
            case 92:
                return new lt(this);
            case 93:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45388421").f());
            case 94:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45628837").f());
            case 95:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45640289").d();
            case 96:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45651096").f());
            case 97:
                return this.f321a.b.ap().a();
            case 98:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45383694").f());
            case 99:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.ip().a.a()).a("assistant_auto_tng_libraries_device 45383870").f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case 100:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45387431").f());
            case 101:
                return new com.google.android.libraries.search.assistant.ai.b.c.c((com.google.android.libraries.g.a) this.f321a.g.a(), (ag) this.f321a.Q.a());
            case 102:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353804").f());
            case 103:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353760").b());
            case 104:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353801").d();
            case 105:
                cr crVar = (cr) this.f321a.v.a();
                com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e eVar = (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) this.f321a.b.au.a();
                jo joVar = this.f321a;
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) joVar.g.a();
                jr jrVar = joVar.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.e.a.c(crVar, eVar, jrVar.aL, jrVar.aM, aVar);
            case 106:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353521").f());
            case 107:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353527").b());
            case 108:
                return Optional.empty();
            case 109:
                g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "AutoAssistantSettingsTngDevicePrivacy";
                a2.c(com.google.android.libraries.assistant.auto.tng.w.e.b.a.a);
                com.google.apps.tiktok.q.b.h a3 = a2.a();
                jo joVar2 = this.f321a;
                return joVar2.nb().a(a3, (j) joVar2.w.a());
            case 110:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45400812").f());
            case 111:
                g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "AaeAssistantDeviceHotword";
                a4.c(com.google.android.libraries.assistant.auto.tng.w.c.b.a.a);
                com.google.apps.tiktok.q.b.h a5 = a4.a();
                jo joVar3 = this.f321a;
                return joVar3.nc().a(a5, (j) joVar3.w.a());
            case 112:
                g a6 = com.google.apps.tiktok.q.b.h.a();
                a6.f5883a = "AssistantGtosStates";
                a6.c(com.google.android.libraries.assistant.auto.tng.t.b.b.a.a);
                com.google.apps.tiktok.q.b.h a7 = a6.a();
                jo joVar4 = this.f321a;
                return joVar4.nc().a(a7, (j) joVar4.w.a());
            case 113:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45415599").f());
            case 114:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45644994").f());
            case 115:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.b.e.b.a.h((s) this.f321a.b.ax.a(), (com.google.android.libraries.g.a) this.f321a.g.a(), (cr) this.f321a.v.a(), this.f321a.b.aM);
            case 116:
                jr jrVar2 = this.f321a.b;
                Executor executor = (Executor) jrVar2.f322a.H.a();
                Map fv = jrVar2.fv();
                fu.m(com.google.android.libraries.appintegration.jam.b.f.a.a.e, jrVar2.aX);
                return new com.google.android.libraries.calendar.appsearch.clients.a.e(new com.google.android.libraries.appintegration.jam.b.d.a.b(executor, fv, (com.google.android.libraries.appintegration.jam.b.e.a.a) jrVar2.aY.a()), this.f321a.b.hX());
            case 117:
                jr jrVar3 = this.f321a.b;
                Context context = (Context) jrVar3.f322a.f.a();
                Executor executor2 = (Executor) jrVar3.f322a.H.a();
                Executor executor3 = (Executor) jrVar3.f322a.v.a();
                jrVar3.ad();
                com.google.android.libraries.appintegration.jam.data.source.appsearch.l lVar = new com.google.android.libraries.appintegration.jam.data.source.appsearch.l(context, executor2, executor3);
                Executor executor4 = (Executor) this.f321a.H.a();
                jo joVar5 = this.f321a;
                com.google.android.libraries.appintegration.jam.c.a.b bVar = new com.google.android.libraries.appintegration.jam.c.a.b("CalendarEvent");
                com.google.android.libraries.appintegration.jam.c.a.b bVar2 = new com.google.android.libraries.appintegration.jam.c.a.b("FileObject");
                com.google.android.libraries.appintegration.jam.c.a.b bVar3 = new com.google.android.libraries.appintegration.jam.c.a.b("ImageObject");
                com.google.android.libraries.appintegration.jam.c.a.b bVar4 = new com.google.android.libraries.appintegration.jam.c.a.b("PaymentCard");
                jr jrVar4 = joVar5.b;
                h hVar = jrVar4.aT;
                h hVar2 = jrVar4.aS;
                fu p = fu.p(bVar, jrVar4.aQ, bVar2, jrVar4.aR, bVar3, hVar2, bVar4, hVar);
                jo joVar6 = this.f321a;
                com.google.android.libraries.appintegration.jam.c.a.a aVar2 = new com.google.android.libraries.appintegration.jam.c.a.a("calendarEvent:full");
                com.google.android.libraries.appintegration.jam.c.a.a aVar3 = new com.google.android.libraries.appintegration.jam.c.a.a("unified:FullyIndexed");
                jr jrVar5 = joVar6.b;
                return new com.google.android.libraries.appintegration.jam.data.b.a.g(lVar, executor4, p, fu.n(aVar2, jrVar5.aU, aVar3, jrVar5.aV), (Context) this.f321a.f.a());
            case 118:
                return new com.google.android.libraries.appintegration.jam.data.source.appsearch.a.d.a.a((com.google.android.libraries.g.a) this.f321a.g.a());
            case 119:
                return new com.google.android.libraries.appintegration.jam.data.source.appsearch.a.a.a.a();
            case 120:
                return new com.google.android.libraries.appintegration.jam.data.source.appsearch.a.b.a.a();
            case 121:
                return new com.google.android.libraries.appintegration.jam.data.source.appsearch.a.c.a.a();
            case 122:
                return new com.google.android.libraries.appintegration.jam.data.source.appsearch.a.d.b.a();
            case 123:
                return new com.google.android.libraries.appintegration.jam.data.source.appsearch.b.a();
            case 124:
                return new com.google.android.libraries.appintegration.jam.data.b.a.a((com.google.android.libraries.appintegration.jam.data.source.a.h) this.f321a.b.aW.a());
            case 125:
                return new com.google.android.libraries.appintegration.jam.data.source.a.h((Context) this.f321a.f.a(), (Executor) this.f321a.v.a(), (com.google.android.libraries.g.a) this.f321a.g.a());
            case 126:
                return new com.google.android.libraries.appintegration.jam.b.e.a.a();
            case 127:
                g a8 = com.google.apps.tiktok.q.b.h.a();
                a8.f5883a = "AutoNewsBrowserLastAccessTime";
                a8.c(dz.a);
                com.google.apps.tiktok.q.b.h a9 = a8.a();
                jo joVar7 = this.f321a;
                return joVar7.nb().a(a9, (j) joVar7.w.a());
            case 128:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45429368").b());
            case 129:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353523").f());
            case 130:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45379589").f());
            case 131:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.y.a.b((Context) this.f321a.f.a(), this.f321a.b.aU());
            case 132:
                Context context2 = (Context) this.f321a.f.a();
                com.google.android.gms.search.h hVar3 = new com.google.android.gms.search.h();
                hVar3.f2710a = "APP_ACTIONS";
                com.google.android.gms.search.i iVar = new com.google.android.gms.search.i(hVar3);
                com.google.android.gms.common.api.j jVar = com.google.android.gms.search.g.f2709a;
                return new com.google.android.gms.search.queries.a.f(context2, iVar);
            case 133:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.m();
            case 134:
                return new com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.c.c();
            case 135:
                m b = com.google.android.libraries.search.n.a.b("assistant-s3-pa.googleapis.com");
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.a = b.a;
                lVar2.b = Integer.valueOf(b.a());
                lVar2.b(com.google.speech.g.d.b.e);
                return lVar2.a();
            case 136:
                return new db((Executor) this.f321a.n.a());
            case 137:
                return new u();
            case 138:
                return new lt(this);
            case 139:
                return new lt(this);
            case 140:
                return new lt(this);
            case 141:
                return new lt(this);
            case 142:
                Executor executor5 = (Executor) this.f321a.H.a();
                executor5.getClass();
                return new db(executor5);
            case 143:
                return new lt(this);
            case 144:
                return new com.google.android.libraries.search.assistant.invocation.f.a.m(this.f321a.Ve(), io.grpc.h.a);
            case 145:
                return new lt(this);
            case 146:
                return new com.google.android.libraries.search.assistant.invocation.s.e.a.k(this.f321a.Ve(), io.grpc.h.a);
            case 147:
                return new com.google.android.libraries.search.assistant.invocation.s.a.c.c((lt) this.f321a.b.bq.a());
            case 148:
                return new lt(this);
            case 149:
                com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c cVar = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c) this.f321a.fb.a();
                jo joVar8 = this.f321a;
                return new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.j.b.c(cVar, e.c.c.b(joVar8.b.bo), e.c.c.b(joVar8.tY));
            case 150:
                return new ai((q) this.f321a.b.bn.a(), 1);
            case 151:
                jo joVar9 = this.f321a;
                return new q(joVar9.b.eW(), (com.google.android.libraries.search.assistant.invocation.utils.e.a) joVar9.eR.a());
            case 152:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.routing.h();
            case 153:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ai.a.b((Context) this.f321a.f.a(), (com.google.android.play.core.a.d) this.f321a.b.bt.a());
            case 154:
                Context context3 = (Context) this.f321a.f.a();
                context3.getClass();
                com.google.android.play.core.a.d a10 = com.google.android.play.core.a.b.a(context3).a();
                a10.getClass();
                return a10;
            case 155:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.q.b("proactivebackend-pa.googleapis.com");
            case 156:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.q.b("staging-proactivebackend-pa.sandbox.googleapis.com");
            case 157:
                return com.google.android.apps.search.assistant.surfaces.voice.robin.y.q.b(this.f321a.b.eL().a());
            case 158:
                g a11 = com.google.apps.tiktok.q.b.h.a();
                a11.f5883a = "WeatherWidgetDataStore";
                a11.c(com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.f.c.a);
                com.google.apps.tiktok.q.b.h a12 = a11.a();
                jo joVar10 = this.f321a;
                return joVar10.nb().a(a12, (j) joVar10.w.a());
            case 159:
                ZoneId systemDefault = ZoneId.systemDefault();
                systemDefault.getClass();
                return systemDefault;
            case 160:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45477032").f());
            case 161:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45598566").f());
            case 162:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45611780").f());
            case 163:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45530921").b());
            case 164:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45379788").d();
            case 165:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45379789").d();
            case 166:
                g a13 = com.google.apps.tiktok.q.b.h.a();
                a13.f5883a = "MediaPushQuota";
                a13.c(com.google.g.c.s.a);
                com.google.apps.tiktok.q.b.h a14 = a13.a();
                jo joVar11 = this.f321a;
                return joVar11.nb().a(a14, (j) joVar11.w.a());
            case 167:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45366487").b());
            case 168:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45366488").b());
            case 169:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45366489").b());
            case 170:
                return new com.google.android.apps.search.assistant.verticals.ambient.a.c.h((com.google.common.v.f) this.f321a.ez.a());
            case 171:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45366065").d();
            case 172:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.apps.search.assistant.device 45382927").f());
            case 173:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.apps.search.assistant.device 45390717").f());
            case 174:
                g a15 = com.google.apps.tiktok.q.b.h.a();
                a15.f5883a = "MediaRecommendationsDataStore";
                a15.c(com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.c.a.a);
                com.google.apps.tiktok.q.b.h a16 = a15.a();
                jo joVar12 = this.f321a;
                return joVar12.nb().a(a16, (j) joVar12.w.a());
            case 175:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45399728").f());
            case 176:
                return new com.google.android.apps.search.assistant.verticals.ambient.crossprofile.b((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f321a.nM.a(), (Context) this.f321a.f.a(), (com.google.android.enterprise.connectedapps.c) this.f321a.wt.a());
            case 177:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f321a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45388259").f());
            case 178:
                Context context4 = (Context) this.f321a.f.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f321a.H.a();
                context4.getClass();
                scheduledExecutorService.getClass();
                return new com.google.android.libraries.search.assistant.n.b.b.b(scheduledExecutorService, new com.google.android.libraries.ax.c(context4, "STREAMZ_ANDROID_ASSISTANT", null), (Application) context4);
            case 179:
                return new com.google.android.libraries.search.assistant.aq.h.c.a.c((Context) this.f321a.f.a());
            case 180:
                return new com.google.android.libraries.search.assistant.aq.h.c.b.a((Context) this.f321a.f.a(), (Executor) this.f321a.H.a());
            case 181:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.im().a.a()).a("com.google.android.apps.search.assistant.device 45572090").f());
            case 182:
                return new com.google.android.libraries.search.assistant.aq.h.d.e();
            case 183:
                return new com.google.android.libraries.search.assistant.ao.f.a();
            case 184:
                return new com.google.android.gms.b.b.a.a();
            case 185:
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.b(com.google.frameworks.a.a.a.a.a.b.h);
                return lVar3.a();
            case 186:
                return new db((Executor) this.f321a.n.a());
            case 187:
                return new db((Executor) this.f321a.H.a());
            case 188:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45373249").f());
            case 189:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jb().a.a()).a("assistant_auto_tng_libraries_device 45391214").f());
            case 190:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45410141").f());
            case 191:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45413576").f());
            case 192:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45415506").b());
            case 193:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45477053").d();
            case 194:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45585502").a());
            case 195:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sC().a.a()).a("assistant_auto_tng_libraries_device 45401742").f());
            case 196:
                return ((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45410871").d();
            case 197:
                return 12;
            case 198:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45611716").f());
            case 199:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45613964").f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        com.google.common.base.a aVar;
        int i = this.b;
        switch (i) {
            case 200:
                return new com.google.android.libraries.assistant.auto.tng.assistant.a.a.i();
            case 201:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.a.a.c.d(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45619987").f());
            case 202:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.b.a.a.c.d(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45629220").d();
            case 203:
                return new com.google.android.libraries.search.assistant.i.e.a.f((ag) this.f321a.bo.a(), (ConnectivityManager) this.f321a.wN.a(), this.f321a.b.aU());
            case 204:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45358895").b());
            case 205:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45358942").b());
            case 206:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45361110").f());
            case 207:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45361111").b());
            case 208:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45355366").b());
            case 209:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45530942").f());
            case 210:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45628534").f());
            case 211:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45407473").f());
            case 212:
                jr jrVar = this.f321a.b;
                h hVar = jrVar.f322a.Q;
                hVar.getClass();
                if (!((Boolean) jrVar.cw.a()).booleanValue()) {
                    aVar = new com.google.android.libraries.assistant.auto.tng.x.a.a();
                    break;
                } else {
                    Set set = (Set) jrVar.cv.a();
                    ag agVar = (ag) hVar.a();
                    agVar.getClass();
                    set.getClass();
                    aVar = new com.google.android.libraries.assistant.auto.tng.y.a(agVar, set);
                    break;
                }
            case 213:
                com.google.android.libraries.assistant.auto.tng.y.c cVar = (com.google.android.libraries.assistant.auto.tng.y.c) this.f321a.b.cu.a();
                cVar.getClass();
                Set singleton = Collections.singleton(cVar);
                singleton.getClass();
                return ha.o(singleton);
            case 214:
                lt ltVar = (lt) this.f321a.b.ct.a();
                ltVar.getClass();
                Context context = (Context) ((jq) ltVar.a).f321a.f.a();
                jr jrVar2 = ((jq) ltVar.a).f321a.b;
                return new com.google.android.libraries.assistant.auto.tng.y.f(2132017631, context, new com.google.android.libraries.assistant.auto.tng.y.a.k(jrVar2.cs, jrVar2.f322a.Q), (ag) ((jq) ltVar.a).f321a.Q.a());
            case 215:
                return new lt(this);
            case 216:
                jo joVar = this.f321a;
                return new com.google.android.libraries.assistant.auto.tng.y.a.k(joVar.b.cr, joVar.Q, (byte[]) null);
            case 217:
                return new com.google.android.libraries.assistant.auto.tng.y.a.e();
            case 218:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jd().a.a()).a("assistant_auto_tng_libraries_device 45429677").f());
            case 219:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45655189").f());
            case 220:
                ah ahVar = (ah) this.f321a.b.cO.a();
                jr jrVar3 = this.f321a.b;
                return new com.google.android.libraries.speech.transcription.g.h.m(ahVar, new n((Context) jrVar3.f322a.f.a(), (com.google.android.libraries.speech.transcription.d.a) jrVar3.f322a.f319a.jd.a()), (com.google.android.libraries.speech.transcription.g.h.b) this.f321a.b.cP.a(), Optional.of((al) this.f321a.b.cR.a()), Optional.of((am) this.f321a.b.cR.a()));
            case 221:
                jo joVar2 = this.f321a;
                jr jrVar4 = joVar2.b;
                return new ah(jrVar4.cz, joVar2.g, joVar2.H, jrVar4.cL, jrVar4.cN);
            case 222:
                jr jrVar5 = this.f321a.b;
                return new com.google.android.libraries.speech.transcription.a.d(new com.google.android.libraries.speech.transcription.a.c((Context) jrVar5.f322a.f.a(), (cr) jrVar5.f322a.n.a()));
            case 223:
                bl blVar = (bl) this.f321a.b.cG.a();
                com.google.android.libraries.speech.transcription.g.t tVar = (com.google.android.libraries.speech.transcription.g.t) this.f321a.b.cK.a();
                jr jrVar6 = this.f321a.b;
                new br(jrVar6.f322a.H, jrVar6.cG, jrVar6.cK);
                return new com.google.android.libraries.speech.transcription.g.d.b(blVar, tVar);
            case 224:
                jo joVar3 = this.f321a;
                jy jyVar = joVar3.f319a;
                h hVar2 = joVar3.f;
                h hVar3 = jyVar.jd;
                jr jrVar7 = joVar3.b;
                h hVar4 = jrVar7.cA;
                h hVar5 = joVar3.v;
                h hVar6 = joVar3.H;
                h hVar7 = jyVar.jg;
                h hVar8 = jyVar.je;
                h hVar9 = jrVar7.cB;
                h hVar10 = joVar3.bK;
                h hVar11 = e.c.g.b;
                h hVar12 = e.c.g.b;
                jr jrVar8 = joVar3.b;
                return new bl(hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, jrVar8.cC, jrVar8.cD, jrVar8.cE, jrVar8.cF);
            case 225:
                return new com.google.android.libraries.speech.transcription.g.d.b((Context) this.f321a.f.a(), (cr) this.f321a.v.a());
            case 226:
                jo joVar4 = this.f321a;
                jr jrVar9 = joVar4.b;
                return new com.google.android.libraries.speech.transcription.g.t(jrVar9.cJ, jrVar9.cG, joVar4.H);
            case 227:
                jo joVar5 = this.f321a;
                return new ah(joVar5.n, joVar5.H, joVar5.b.cI, joVar5.f, joVar5.f319a.jd, (byte[]) null);
            case 228:
                jo joVar6 = this.f321a;
                bn q = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(joVar6.mf, (com.google.apps.tiktok.p.m) joVar6.b.cH.a(), (com.google.apps.tiktok.p.u) this.f321a.mh.a(), (com.google.frameworks.client.data.android.d) this.f321a.mb.a(), com.google.common.base.a.a);
                q.getClass();
                return q;
            case 229:
                m a2 = com.google.android.libraries.search.n.a.a("s3.grpc.url", "speechs3proto2-pa.googleapis.com", 443);
                com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                lVar.a = a2.a;
                lVar.b = Integer.valueOf(a2.a());
                lVar.b(com.google.speech.g.d.b.e);
                return lVar.a();
            case 230:
                jo joVar7 = this.f321a;
                return new com.google.android.libraries.speech.transcription.g.a.a.h(joVar7.fx, joVar7.f319a.cM, joVar7.dg, joVar7.b.cM, joVar7.H, joVar7.n, joVar7.cW);
            case 231:
                return new AudioRecordingProvider((Context) this.f321a.f.a());
            case 232:
                return new com.google.android.libraries.speech.transcription.g.h.b((com.google.android.libraries.g.a) this.f321a.g.a(), (cr) this.f321a.H.a());
            case 233:
                return new ak((com.google.android.libraries.search.b.b) this.f321a.b.cQ.a());
            case 234:
                com.google.android.libraries.search.b.b a3 = ((com.google.android.libraries.search.t.a.a) this.f321a.iH.a()).a(com.google.android.libraries.search.t.c.TRANSCRIPTION);
                a3.getClass();
                return a3;
            case 235:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.k((com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l) this.f321a.f9do.a(), (aa) this.f321a.dp.a(), (Executor) this.f321a.H.a());
            case 236:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sA().a.a()).a("assistant_auto_tng_libraries_device 45409396").f());
            case 237:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.c.t((Context) this.f321a.f.a(), (Executor) this.f321a.H.a());
            case 238:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45388960").b());
            case 239:
                return new com.google.apps.tiktok.s.b.a.a((Context) this.f321a.b.f322a.f.a());
            case 240:
                return new com.google.apps.tiktok.s.b.h((Context) this.f321a.f.a());
            case 241:
                return new com.google.apps.tiktok.s.b.b.a((Context) this.f321a.f.a(), 1);
            case 242:
                return new com.google.apps.tiktok.s.b.b.a((Context) this.f321a.f.a(), 0);
            case 243:
                return new com.google.apps.tiktok.s.b.c.a((com.google.apps.tiktok.s.b.d) this.f321a.b.dj.a());
            case 244:
                jo joVar8 = this.f321a;
                fq i2 = fu.i(13);
                jr jrVar10 = joVar8.b;
                i2.i(NetworkException.class, jrVar10.cV);
                i2.i(Throwable.class, jrVar10.cW);
                i2.i(com.google.android.gms.common.t.class, jrVar10.cX);
                i2.i(UserRecoverableAuthException.class, jrVar10.cY);
                i2.i(ep.class, jrVar10.cZ);
                i2.i(com.google.android.libraries.assistant.auto.tng.assistant.d.a.f.c.b.a.class, jrVar10.db);
                i2.i(com.google.android.libraries.assistant.auto.tng.assistant.d.a.f.c.c.a.class, jrVar10.dc);
                i2.i(com.google.android.libraries.assistant.auto.tng.l.a.a.class, jrVar10.dd);
                i2.i(com.google.android.libraries.assistant.auto.tng.common.l.a.class, jrVar10.de);
                i2.i(com.google.android.libraries.assistant.auto.tng.q.a.a.a.a.class, jrVar10.df);
                i2.i(com.google.android.libraries.assistant.auto.tng.s.f.d.a.class, jrVar10.dg);
                i2.i(com.google.android.libraries.assistant.auto.tng.v.b.a.m.a.a.class, jrVar10.dh);
                i2.i(com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.a.a.a.class, jrVar10.di);
                return new com.google.apps.tiktok.s.b.d(i2.h(true), this.f321a.b.ft());
            case 245:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.f.c.b.a.c((Context) this.f321a.f.a(), (com.google.android.libraries.assistant.auto.tng.common.p.a) this.f321a.b.da.a());
            case 246:
                return new com.google.android.libraries.assistant.auto.tng.common.p.a((Context) this.f321a.f.a(), (NotificationManager) this.f321a.I.a(), (PackageManager) this.f321a.h.a());
            case 247:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.a.f.c.c.a.a((Context) this.f321a.f.a());
            case 248:
                return new com.google.android.libraries.assistant.auto.tng.l.a.a.a((Context) this.f321a.f.a());
            case 249:
                return new com.google.android.libraries.assistant.auto.tng.common.l.b((Context) this.f321a.f.a());
            case 250:
                return new com.google.android.libraries.assistant.auto.tng.q.a.a.a.a.b((Context) this.f321a.f.a(), (com.google.android.libraries.assistant.auto.tng.common.p.a) this.f321a.b.da.a());
            case 251:
                return new com.google.android.libraries.assistant.auto.tng.s.f.d.a.a((Context) this.f321a.f.a());
            case 252:
                return new com.google.android.libraries.assistant.auto.tng.v.b.a.m.a.a.b((Context) this.f321a.f.a(), (com.google.android.libraries.assistant.auto.tng.common.p.a) this.f321a.b.da.a());
            case 253:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.b.a.a.a.a((Context) this.f321a.f.a());
            case 254:
            case 255:
                return com.google.apps.tiktok.s.b.a.a;
            case 256:
                return new com.google.apps.tiktok.s.b.a.b();
            case 257:
                return new com.google.apps.tiktok.s.b.i(0);
            case 258:
                return new com.google.apps.tiktok.s.b.b.b(1);
            case 259:
                return new com.google.apps.tiktok.s.b.b.b(0);
            case 260:
                return new com.google.apps.tiktok.s.b.c.b();
            case 261:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.js().a.a()).a("assistant_auto_tng_libraries_device 45622573").f());
            case 262:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.js().a.a()).a("assistant_auto_tng_libraries_device 45626844").f());
            case 263:
                com.google.android.libraries.search.d.ad.d dVar = (com.google.android.libraries.search.d.ad.d) this.f321a.b.dm.a();
                jr jrVar11 = this.f321a.b;
                h hVar13 = jrVar11.dn;
                h hVar14 = jrVar11.dq;
                h hVar15 = jrVar11.dm;
                jo joVar9 = jrVar11.f322a;
                return new com.google.android.libraries.search.d.o.a.m(dVar, new com.google.android.libraries.search.d.o.a.k(hVar13, hVar14, hVar15, joVar9.aJ, jrVar11.dr, jrVar11.ds, jrVar11.f11do, joVar9.aK, jrVar11.dp), (com.google.android.libraries.search.d.p.b) this.f321a.b.dp.a());
            case 264:
                io.grpc.i iVar = (io.grpc.i) this.f321a.eA.a();
                iVar.getClass();
                com.google.android.libraries.search.d.ad.d d = io.grpc.j.a.d(new com.google.android.libraries.search.d.ad.a(1), iVar, io.grpc.h.a);
                d.getClass();
                return d;
            case 265:
                jo joVar10 = this.f321a;
                return new com.google.android.libraries.search.d.o.a.u(joVar10.cP, joVar10.n);
            case 266:
                jo joVar11 = this.f321a;
                jr jrVar12 = joVar11.b;
                return new com.google.android.libraries.search.d.x.b.l(jrVar12.f11do, joVar11.Q, jrVar12.dp);
            case 267:
                io.grpc.i iVar2 = (io.grpc.i) this.f321a.eA.a();
                iVar2.getClass();
                com.google.android.libraries.search.d.ad.b g = io.grpc.j.c.g(new com.google.android.libraries.search.d.ad.a(0), iVar2, io.grpc.h.a);
                g.getClass();
                return g;
            case 268:
                ag agVar2 = (ag) this.f321a.Q.a();
                agVar2.getClass();
                return new com.google.android.libraries.search.d.p.b(agVar2);
            case 269:
                jo joVar12 = this.f321a;
                jr jrVar13 = joVar12.b;
                return new com.google.android.libraries.search.d.o.a.p(jrVar13.dn, jrVar13.dq, joVar12.aK, jrVar13.dm, jrVar13.dp);
            case 270:
                return new w();
            case 271:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45368330").f());
            case 272:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45632634").f());
            case 273:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sD().a.a()).a("assistant_auto_tng_libraries_device 45386625").f());
            case 274:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45427405").f());
            case 275:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45410475").d();
            case 276:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iQ().a.a()).a("assistant_auto_tng_libraries_device 45403113").f());
            case 277:
                return new com.google.android.libraries.assistant.auto.tng.assistant.b.a.b((Executor) this.f321a.H.a());
            case 278:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iQ().a.a()).a("assistant_auto_tng_libraries_device 45410909").f());
            case 279:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45401087").f());
            case 280:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jd().a.a()).a("assistant_auto_tng_libraries_device 45429680").f());
            case 281:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45619771").f());
            case 282:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45643738").f());
            case 283:
                ae aeVar = (ae) this.f321a.b.dz.a();
                return fu.n(com.google.android.libraries.assistant.auto.tng.f.d.c.b.u.a, (com.google.android.libraries.search.assistant.performer.communication.c.b.i) this.f321a.b.dA.a(), com.google.android.libraries.assistant.auto.tng.f.d.c.b.u.b, aeVar);
            case 284:
                return new ae((Executor) this.f321a.H.a());
            case 285:
                return new com.google.android.libraries.search.assistant.performer.communication.c.b.i((Executor) this.f321a.H.a());
            case 286:
                return fu.m(com.google.android.libraries.assistant.auto.tng.f.d.c.b.u.a, (com.google.android.libraries.search.assistant.performer.communication.c.b.i) this.f321a.b.dC.a());
            case 287:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.floaty.activity.g((com.google.common.v.f) this.f321a.ez.a());
            case 288:
                g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "UserAgent";
                a4.c(com.google.android.apps.search.googleapp.d.a.a.a);
                com.google.apps.tiktok.q.b.h a5 = a4.a();
                jo joVar13 = this.f321a;
                return joVar13.nb().a(a5, (j) joVar13.w.a());
            case 289:
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.b(com.google.bz.d.a.a.a.b.f);
                return lVar2.a();
            case 290:
                g a6 = com.google.apps.tiktok.q.b.h.a();
                a6.f5883a = "country_settings";
                a6.c(com.google.android.libraries.search.h.e.a);
                com.google.apps.tiktok.q.b.h a7 = a6.a();
                jo joVar14 = this.f321a;
                return joVar14.nb().a(a7, (j) joVar14.w.a());
            case 291:
                return new com.google.apps.tiktok.contrib.work.a((Context) this.f321a.f.a(), (com.google.apps.tiktok.contrib.work.a.d) this.f321a.gJ.a(), (com.google.apps.tiktok.contrib.work.b.p) this.f321a.gK.a(), (Executor) this.f321a.v.a(), (cq) this.f321a.H.a());
            case 292:
                return new com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.l((com.google.android.enterprise.connectedapps.c) this.f321a.b.dI.a());
            case 293:
                Context context2 = (Context) this.f321a.f.a();
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
                cr d2 = dl.d(scheduledThreadPoolExecutor);
                com.google.android.enterprise.connectedapps.b bVar = (com.google.android.enterprise.connectedapps.b) new com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.l(context2).a;
                bVar.f2531a = d2;
                return new com.google.android.enterprise.connectedapps.c(bVar);
            case 294:
                fu m = fu.m(com.google.android.libraries.appintegration.jam.b.f.a.a.e, this.f321a.b.dK);
                jr jrVar14 = this.f321a.b;
                return new com.google.android.libraries.appintegration.jam.b.c.a.c(m, new com.google.android.libraries.appintegration.jam.f.a.a.e(jrVar14.ae(), (Executor) jrVar14.f322a.H.a(), jrVar14.fv()), (at) this.f321a.b.dJ.a());
            case 295:
                com.google.android.libraries.appintegration.jam.data.source.a.h hVar16 = (com.google.android.libraries.appintegration.jam.data.source.a.h) this.f321a.b.aW.a();
                jo joVar15 = this.f321a;
                jr jrVar15 = joVar15.b;
                return new o(hVar16, joVar15.b.fu(), new com.google.android.libraries.appintegration.jam.data.source.appsearch.g((Context) jrVar15.f322a.f.a(), jrVar15.ad(), (Executor) jrVar15.f322a.H.a(), (Executor) jrVar15.f322a.v.a(), jrVar15.fu()), (Executor) this.f321a.H.a(), (at) this.f321a.b.dJ.a());
            case 296:
                Context context3 = (Context) this.f321a.f.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f321a.v.a();
                if (!com.google.android.libraries.appintegration.jam.f.a.a.g.a.contains(context3.getPackageName())) {
                    aVar = at.k(new com.google.android.libraries.appintegration.jam.a.a.b.b(scheduledExecutorService, new com.google.android.libraries.ax.c(context3, "STREAMZ_TOAST", null), (Application) context3));
                    break;
                } else {
                    aVar = com.google.common.base.a.a;
                    break;
                }
            case 297:
                return new com.google.android.libraries.appintegration.jam.b.b.a.b(fu.m(com.google.android.libraries.appintegration.jam.b.f.a.a.e, this.f321a.b.dK));
            case 298:
                return new com.google.android.apps.search.assistant.surfaces.bisto.a.i.p((Context) this.f321a.f.a(), (cr) this.f321a.v.a());
            case 299:
                Context context4 = (Context) this.f321a.f.a();
                return new com.google.android.libraries.assistant.c.a.a.a.e(context4, new com.google.android.libraries.assistant.c.a.a.a.c(this.f321a.b.dN), (NotificationManager) this.f321a.I.a());
            default:
                throw new AssertionError(i);
        }
        return aVar;
    }

    private final Object e() {
        at atVar;
        int i = this.b;
        switch (i) {
            case 300:
                Executor executor = (Executor) this.f321a.H.a();
                cq cqVar = (cq) this.f321a.B.a();
                Object a2 = this.f321a.b.dM.a();
                jo joVar = this.f321a;
                Object fa = joVar.b.fa();
                com.google.apps.tiktok.tracing.contrib.e.n sg = joVar.f319a.sg();
                Object fb = joVar.b.fb();
                joVar.b.hV();
                return new com.google.android.libraries.assistant.c.a.b.a.q(executor, cqVar, (com.google.android.libraries.assistant.c.a.b.a.u) fa, sg, (com.google.android.libraries.assistant.c.a.b.a.w) fb);
            case 301:
                return new com.google.android.libraries.assistant.c.a.b.a.r();
            case 302:
                jo joVar2 = this.f321a;
                return joVar2.nc().a(com.google.android.apps.search.assistant.libraries.dictation.a.h.a(), (j) joVar2.w.a());
            case 303:
                com.google.android.libraries.search.assistant.spokennotifications.autoread.notifications.db.a D = ((SpokenNotificationMetadataDatabase) this.f321a.b.dQ.a()).D();
                D.getClass();
                return D;
            case 304:
                com.google.apps.tiktok.q.c.g a3 = com.google.apps.tiktok.q.c.h.a();
                a3.a = "spoken_notification_metadata_db";
                SpokenNotificationMetadataDatabase a4 = this.f321a.nd().a(a3.a(), SpokenNotificationMetadataDatabase.class, new Object[0]);
                a4.getClass();
                return a4;
            case 305:
                return new com.google.android.libraries.search.assistant.a.a.a.d((Executor) this.f321a.v.a(), (com.google.android.libraries.search.assistant.a.a.a.a.b) this.f321a.b.dS.a());
            case 306:
                return new com.google.android.libraries.search.assistant.a.a.a.a.b((Executor) this.f321a.v.a());
            case 307:
                return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.n((com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.h) this.f321a.b.dV.a(), (com.google.android.enterprise.connectedapps.c) this.f321a.b.dU.a(), (Executor) this.f321a.H.a());
            case 308:
                return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.h((com.google.android.enterprise.connectedapps.c) this.f321a.b.dU.a());
            case 309:
                return new com.google.android.enterprise.connectedapps.c((com.google.android.enterprise.connectedapps.b) new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.h((Context) this.f321a.f.a()).a);
            case 310:
                jo joVar3 = this.f321a;
                return new z(joVar3.mo(), (Executor) joVar3.H.a());
            case 311:
                return com.google.android.apps.search.assistant.verticals.reminders.c.b.a();
            case 312:
                return com.google.android.apps.search.assistant.verticals.snapshot.a.b.a(this.f321a.b.fg());
            case 313:
                LocationManager locationManager = (LocationManager) ((Context) this.f321a.f.a()).getSystemService("location");
                locationManager.getClass();
                return locationManager;
            case 314:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eV().a.a()).a("com.google.android.libraries.search.device 45657950").f());
            case 315:
                lt ltVar = (lt) this.f321a.b.ec.a();
                com.google.android.libraries.search.rendering.xuikit.xblend.b.o oVar = (com.google.android.libraries.search.rendering.xuikit.xblend.b.o) this.f321a.b.ed.a();
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f321a.g.a();
                this.f321a.b.aK();
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.b.b.ai(ltVar, oVar, aVar);
            case 316:
                return new lt(this);
            case 317:
                return new com.google.android.libraries.search.rendering.xuikit.xblend.b.p((Context) this.f321a.f.a(), (com.google.android.libraries.search.t.a.a) this.f321a.iH.a());
            case 318:
                Context context = (Context) this.f321a.f.a();
                com.google.android.libraries.search.rendering.xuikit.c.e.s sVar = (com.google.android.libraries.search.rendering.xuikit.c.e.s) this.f321a.f319a.dL.a();
                Context context2 = context;
                if (Build.VERSION.SDK_INT >= 31) {
                    if (com.google.common.base.cl.V(Build.MANUFACTURER, "xiaomi")) {
                        context2 = context;
                    } else {
                        DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                        if (displayManager == null) {
                            com.google.common.f.h f = com.google.android.libraries.search.rendering.xuikit.bubbles.n.a.f();
                            f.aj(com.google.android.libraries.search.rendering.xuikit.c.e.s.a, sVar.a(Level.WARNING).a());
                            f.ak(58723);
                            f.p("No display manager for the application context, so we can't create WindowContext");
                            context2 = context;
                        } else {
                            Context createDisplayContext = context.createDisplayContext(displayManager.getDisplay(0));
                            if (b$.ExternalSyntheticApiModelOutline0.m(createDisplayContext) == null) {
                                com.google.common.f.h f2 = com.google.android.libraries.search.rendering.xuikit.bubbles.n.a.f();
                                f2.aj(com.google.android.libraries.search.rendering.xuikit.c.e.s.a, sVar.a(Level.WARNING).a());
                                f2.ak(58722);
                                f2.p("No display context can be created from application context");
                                context2 = context;
                            } else {
                                context2 = az$.ExternalSyntheticApiModelOutline1.m(createDisplayContext, 2038, (Bundle) null);
                            }
                        }
                    }
                }
                context2.getClass();
                return context2;
            case 319:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.f.a.p();
            case 320:
                return new com.google.android.libraries.search.rendering.xuikit.bubbles.e.h();
            case 321:
                jo joVar4 = this.f321a;
                return joVar4.nb().a(com.google.android.apps.search.omnient.b.c.a.g.a(), (j) joVar4.w.a());
            case 322:
                return new com.google.android.apps.search.googleapp.accounts.ui.b.a.h((Context) this.f321a.f.a(), (com.google.apps.tiktok.account.data.b) this.f321a.bN.a(), (ax) this.f321a.iv.a(), (cr) this.f321a.v.a());
            case 323:
                return com.google.android.apps.search.googleapp.saves.b.b.a.a(((com.google.apps.tiktok.experiments.e) this.f321a.b.iV().a.a()).a("com.google.android.libraries.search.googleapp.device 7").e(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iV().a.a()).a("com.google.android.libraries.search.googleapp.device 8").b());
            case 324:
                return new lt(this);
            case 325:
                jo joVar5 = this.f321a;
                return joVar5.nb().a(com.google.android.apps.search.googleapp.discover.p.f.a(), (j) joVar5.w.a());
            case 326:
                return com.google.android.apps.search.googleapp.discover.settings.b.c.c();
            case 327:
                return new com.google.android.libraries.play.a.b.b((cb) this.f321a.b.el.a());
            case 328:
                Context context3 = (Context) this.f321a.f.a();
                Intent intent = new Intent("com.google.android.finsky.ipcservers.external.APP_CONTENT_SERVICE").setPackage("com.android.vending");
                List<ResolveInfo> queryIntentServices = context3.getPackageManager().queryIntentServices(intent, 64);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    com.google.common.f.h f3 = com.google.android.libraries.play.a.a.a.a.f();
                    f3.ak(53394);
                    f3.s("Failed to get AppContentService for package %s.", "com.android.vending");
                    atVar = com.google.common.base.a.a;
                } else {
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ServiceInfo serviceInfo = it.next().serviceInfo;
                            if (serviceInfo != null && !TextUtils.isEmpty(((ComponentInfo) serviceInfo).packageName) && !TextUtils.isEmpty(((ComponentInfo) serviceInfo).name)) {
                                atVar = at.k(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name));
                            }
                        } else {
                            com.google.common.f.h f4 = com.google.android.libraries.play.a.a.a.a.f();
                            f4.ak(53395);
                            f4.s("Did not find valid ComponentInfo for service from package %s.", "com.android.vending");
                            atVar = com.google.common.base.a.a;
                        }
                    }
                }
                if (!atVar.h()) {
                    return null;
                }
                ar c = ar.c(new io.grpc.b.a(intent.setComponent((ComponentName) atVar.c()).cloneFilter()), context3);
                c.b.e = com.google.frameworks.client.data.android.b.g.b(context3, com.google.android.libraries.play.a.b.c.a);
                return c.a();
            case 329:
                return com.google.android.apps.search.googleapp.x.d.a.a((Context) this.f321a.f.a(), (ScheduledExecutorService) this.f321a.H.a(), new h.a.a.as.a.a.j(this.f321a.V).f());
            case 330:
                return com.google.android.libraries.search.rendering.xuikit.c.f.g.h(at.k((ag) this.f321a.Q.a()), this.f321a.H);
            case 331:
                com.google.apps.tiktok.q.b.h b = com.google.android.apps.search.googleapp.a.h.b(this.f321a.b.aM());
                jo joVar6 = this.f321a;
                return joVar6.nb().a(b, (j) joVar6.w.a());
            case 332:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45643899").f());
            case 333:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45648784").f());
            case 334:
                return com.google.android.apps.search.googleapp.discover.x.c.b.f(this.f321a.b.ju().D(), this.f321a.b.ju().C());
            case 335:
                return com.google.android.apps.search.googleapp.discover.x.c.b.e(this.f321a.b.ju().D(), this.f321a.b.ju().C());
            case 336:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.libraries.search.googleapp.device 45641864").f());
            case 337:
                return new com.google.frameworks.client.data.android.a.q(this.f321a.b.er);
            case 338:
                return new com.google.android.gms.auth.api.proxy.a.c((Context) this.f321a.f.a(), new com.google.android.gms.auth.api.d(new Bundle()));
            case 339:
                return new com.google.android.apps.search.googleapp.discover.x.a.a.a();
            case 340:
                return com.google.android.apps.search.googleapp.discover.x.c.b.d(this.f321a.b.ju().D(), this.f321a.b.ju().C());
            case 341:
                return com.google.android.apps.search.googleapp.discover.expeditions.features.streaming.d.j.b(this.f321a.b.ju().D(), this.f321a.b.ju().C());
            case 342:
                return new com.google.android.libraries.search.rendering.xuikit.c.j.e();
            case 343:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45571936").d();
            case 344:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45645505").b());
            case 345:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45645506").f());
            case 346:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45571935").d();
            case 347:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45598510").a());
            case 348:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45585368").d();
            case 349:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45585369").b());
            case 350:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45611911").b());
            case 351:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45585370").d();
            case 352:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45611758").d();
            case 353:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jk().a.a()).a("com.google.android.libraries.search.googleapp.device 45627225").f());
            case 354:
                return new com.google.android.apps.search.googleapp.discover.q.d((ConnectivityManager) this.f321a.wN.a(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.jc().a.a()).a("com.google.android.libraries.search.googleapp.device 45633468").f());
            case 355:
                jo joVar7 = this.f321a;
                return com.google.android.apps.search.googleapp.notifications.b.a.a.a(joVar7.b.fi(), joVar7.b.o());
            case 356:
                jo joVar8 = this.f321a;
                return com.google.android.apps.search.googleapp.notifications.accountsettings.aa.b(joVar8.b.fi(), joVar8.b.o());
            case 357:
                jo joVar9 = this.f321a;
                return com.google.android.apps.search.googleapp.notifications.settings.a.k.a(joVar9.b.fi(), joVar9.b.o());
            case 358:
                Executor executor2 = (Executor) this.f321a.wb.a();
                Executor executor3 = (Executor) this.f321a.vC.a();
                if (!Boolean.TRUE.equals(false)) {
                    executor2 = new com.google.android.libraries.lens.view.at.n(com.google.android.libraries.lens.view.g.d.a(executor3));
                } else if (com.google.android.libraries.aw.e.e.d(Thread.currentThread())) {
                    com.google.android.libraries.lens.view.at.at.b(true);
                } else {
                    executor2.execute(ex.k(new com.google.android.libraries.lens.view.at.m()));
                }
                executor2.getClass();
                return executor2;
            case 359:
                g a5 = com.google.apps.tiktok.q.b.h.a();
                a5.f5883a = "LensUserAgent";
                a5.c(com.google.android.libraries.search.lens.f.d.a.a.a);
                com.google.apps.tiktok.q.b.h a6 = a5.a();
                jo joVar10 = this.f321a;
                return joVar10.nb().a(a6, (j) joVar10.w.a());
            case 360:
                return new com.google.android.libraries.search.v.c.d((Context) this.f321a.f.a(), (ConnectivityManager) this.f321a.wN.a(), (com.google.android.libraries.g.a) this.f321a.g.a(), (ag) this.f321a.Q.a());
            case 361:
                return new com.google.android.gms.droidguard.a((Context) this.f321a.f.a());
            case 362:
                g a7 = com.google.apps.tiktok.q.b.h.a();
                a7.f5883a = "DeviceLevelRequestData";
                a7.c(com.google.android.libraries.search.aj.b.a.a.a);
                com.google.apps.tiktok.q.b.h a8 = a7.a();
                jo joVar11 = this.f321a;
                return joVar11.nb().a(a8, (j) joVar11.w.a());
            case 363:
                String fk = this.f321a.b.fk();
                com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                lVar.a = fk;
                lVar.b = 443;
                lVar.b(com.google.aw.g.a.a.a.c.g);
                return lVar.a();
            case 364:
                return new as((Context) this.f321a.f.a());
            case 365:
                return new com.google.android.libraries.lens.sdk.avs.data.a();
            case 366:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sq().a.a()).a("com.google.android.apps.search.lens.device 45420939").f());
            case 367:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sq().a.a()).a("com.google.android.apps.search.lens.device 45630241").a());
            case 368:
                return new com.google.android.libraries.search.assistant.invocation.s.a.a.m(new com.google.android.libraries.search.assistant.invocation.s.a.a.t(this.f321a.b.eW(), io.grpc.h.a), (cr) this.f321a.H.a(), (ag) this.f321a.Q.a());
            case 369:
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.a = "podcastsservice-pa.googleapis.com";
                lVar2.b = 443;
                lVar2.b(com.google.aw.j.a.b.c.z);
                return lVar2.a();
            case 370:
                Application a9 = e.b.a.c.a.a(this.f321a.d.a);
                a9.getClass();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f321a.H.a();
                scheduledExecutorService.getClass();
                return new com.google.android.apps.search.podcasts.p.c(scheduledExecutorService, new com.google.android.libraries.ax.c(a9, "STREAMZ_GOOGLE_PODCASTS", null), a9);
            case 371:
                return new com.google.android.apps.search.podcasts.l.u(this.f321a.b.ab());
            case 372:
                return new com.google.android.apps.search.podcasts.k.a.a((com.google.android.apps.search.podcasts.k.a.g) this.f321a.b.eS.a(), this.f321a.b.ic().a());
            case 373:
                return new com.google.android.apps.search.podcasts.k.a.g((Context) this.f321a.f.a(), (PackageManager) this.f321a.h.a(), (v) this.f321a.f319a.S.a(), (com.google.android.libraries.g.a) this.f321a.g.a(), (cr) this.f321a.H.a());
            case 374:
                return new com.google.android.apps.search.podcasts.p.f((com.google.android.libraries.search.t.i.y) this.f321a.W.a(), (com.google.android.apps.search.podcasts.p.c) this.f321a.b.eR.a(), (String) this.f321a.Y.a());
            case 375:
                return new ab((Context) this.f321a.f.a());
            case 376:
                return new com.google.android.apps.search.podcasts.player.b.a.a((Context) this.f321a.f.a());
            case 377:
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.a = "wernickeservice-pa.googleapis.com";
                lVar3.b = 443;
                lVar3.b(com.google.aw.h.b.a.c.b.k);
                return lVar3.a();
            case 378:
                return com.google.android.apps.search.podcasts.b.b.a.b(this.f321a.b.ab());
            case 379:
                return new com.google.android.apps.search.podcasts.util.e.a();
            case 380:
                return new com.google.android.apps.search.podcasts.player.impl.b();
            case 381:
                com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                lVar4.a = "finance-pa.googleapis.com";
                lVar4.b = 443;
                lVar4.b(com.google.aw.h.a.a.a.b.g);
                return lVar4.a();
            case 382:
                String e = ((com.google.apps.tiktok.experiments.e) this.f321a.b.eQ().a.a()).a("com.google.android.apps.search.googleapp_widgets.weather.device 45622767").e();
                long b2 = ((com.google.apps.tiktok.experiments.e) this.f321a.b.eQ().a.a()).a("com.google.android.apps.search.googleapp_widgets.weather.device 45622768").b();
                com.google.apps.tiktok.p.l lVar5 = new com.google.apps.tiktok.p.l();
                lVar5.a = e;
                lVar5.b = Integer.valueOf((int) b2);
                lVar5.b(com.google.aw.h.f.b.a.b.c);
                return lVar5.a();
            case 383:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.ip().a.a()).a("assistant_auto_tng_libraries_device 45383933").b());
            case 384:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353540").b());
            case 385:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45386811").f());
            case 386:
                jo joVar12 = this.f321a;
                h hVar = joVar12.b.eZ;
                Optional of = Optional.of(joVar12.f319a.cR());
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f321a.g.a();
                Context context4 = (Context) this.f321a.f.a();
                jr jrVar = this.f321a.b;
                return new com.google.android.libraries.assistant.auto.tng.suggestions.d.a.h(hVar, of, aVar2, context4, jrVar.fa, jrVar.fb, jrVar.fc, jrVar.aM, jrVar.fd, jrVar.fe, (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jrVar.au.a());
            case 387:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.a.b.f((com.google.android.libraries.g.a) this.f321a.g.a());
            case 388:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iu().a.a()).a("assistant_auto_tng_libraries_device 45353836").f());
            case 389:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353520").f());
            case 390:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45386383").f());
            case 391:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45388052").f());
            case 392:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45419559").f());
            case 393:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.l.b.a.c();
            case 394:
                return new com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.c((com.google.android.libraries.g.a) this.f321a.g.a(), this.f321a.b.eZ);
            case 395:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353518").f());
            case 396:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353522").f());
            case 397:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45380263").e();
            case 398:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353536").f());
            case 399:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45387249").d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 400:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45369827").f());
            case 401:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45371607").f());
            case 402:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.m123if().a.a()).a("com.google.android.apps.search.assistant.device 45429860").f());
            case 403:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.m123if().a.a()).a("com.google.android.apps.search.assistant.device 45461903").e();
            case 404:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.m123if().a.a()).a("com.google.android.apps.search.assistant.device 45429861").e();
            case 405:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.m123if().a.a()).a("com.google.android.apps.search.assistant.device 45429862").e();
            case 406:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.m123if().a.a()).a("com.google.android.apps.search.assistant.device 45429863").e();
            case 407:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45634985").f());
            case 408:
                Executor executor = (Executor) this.f321a.H.a();
                jr jrVar = this.f321a.b;
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.f(executor, new com.google.android.libraries.assistant.auto.jumpboost.gearhead.j.b.a.a(jrVar.fu, (com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l) jrVar.f322a.f9do.a(), (com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.s) jrVar.f322a.f319a.cP.a()));
            case 409:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45640321").f());
            case 410:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jo().a.a()).a("assistant_auto_tng_libraries_device 45430274").d();
            case 411:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jI().a.a()).a("assistant_auto_tng_libraries_device 45354771").b());
            case 412:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jo().a.a()).a("assistant_auto_tng_libraries_device 45531962").b());
            case 413:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45428127").f());
            case 414:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45428250").f());
            case 415:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45426696").d();
            case 416:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jo().a.a()).a("assistant_auto_tng_libraries_device 45440349").d();
            case 417:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45428559").d();
            case 418:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45630838").f());
            case 419:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45373056").d();
            case 420:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45381396").b());
            case 421:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45373692").b());
            case 422:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45424850").f());
            case 423:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jo().a.a()).a("assistant_auto_tng_libraries_device 45440367").f());
            case 424:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45416650").b());
            case 425:
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.a.b.a.b.a((Executor) this.f321a.H.a(), this.f321a.b.fz);
            case 426:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45426733").f());
            case 427:
                com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                lVar.a = "debugsettings-pa.googleapis.com";
                lVar.b = 443;
                lVar.b(com.google.frameworks.a.a.a.a.a.b.h);
                return lVar.a();
            case 428:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sm().a.a()).a("assistant_auto_tng_libraries_device 45627562").f());
            case 429:
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.b(com.google.protos.az.a.a.b.g);
                return lVar2.a();
            case 430:
                return new com.google.android.apps.search.omnient.host.availability.d((ag) this.f321a.Q.a(), e.c.c.b(this.f321a.f319a.be));
            case 431:
                return new com.google.android.apps.search.assistant.platform.g.i.k((cg) this.f321a.b.fF.a(), e.c.c.b(this.f321a.b.fG), (ag) this.f321a.Q.a(), (cq) this.f321a.H.a());
            case 432:
                Optional empty = Optional.empty();
                final g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "InputModalitySettingsData";
                a2.c(com.google.android.apps.search.assistant.platform.g.i.a.c.f1883a);
                empty.ifPresent(new Consumer(a2) { // from class: com.google.android.apps.search.assistant.platform.g.i.f

                    /* renamed from: a, reason: collision with root package name */
                    public final com.google.apps.tiktok.q.b.g f1884a;

                    {
                        this.f1884a = a2;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f1884a.b().h((x) obj);
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer._CC.$default$andThen(this, consumer);
                    }
                });
                com.google.apps.tiktok.q.b.h a3 = a2.a();
                jo joVar = this.f321a;
                return joVar.nc().a(a3, (j) joVar.w.a());
            case 433:
                jr jrVar2 = this.f321a.b;
                return new op(new com.google.android.apps.search.assistant.surfaces.voice.i.f.b.c((com.google.android.apps.search.assistant.surfaces.voice.i.f.a.k) jrVar2.f322a.qT.a(), (ag) jrVar2.f322a.Q.a()));
            case 434:
                g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "NavigationProperties";
                a4.c(bq.a);
                com.google.apps.tiktok.q.b.h a5 = a4.a();
                jo joVar2 = this.f321a;
                return joVar2.nc().a(a5, (j) joVar2.w.a());
            case 435:
                return new com.google.android.apps.search.assistant.surfaces.voice.j.a.b.c.j(new com.google.android.apps.search.assistant.surfaces.voice.j.a.b.c.a((lt) this.f321a.b.fJ.a()));
            case 436:
                return new lt(this);
            case 437:
                return new com.google.android.apps.search.assistant.surfaces.voice.j.a.b.g.i(new com.google.android.apps.search.assistant.surfaces.voice.j.a.b.g.a((lt) this.f321a.b.fL.a()));
            case 438:
                return new lt(this);
            case 439:
                jr jrVar3 = this.f321a.b;
                Context context = (Context) jrVar3.f322a.f.a();
                cq cqVar = (cq) jrVar3.f322a.n.a();
                g a6 = com.google.apps.tiktok.q.b.h.a();
                a6.f5883a = "SpokenNotificationsSettings";
                com.google.android.libraries.storage.protostore.be d = bg.d(context, cqVar);
                d.c = "GEL.GSAPrefs";
                d.c("bisto_spoken_notifications", "bisto_spoken_notifications_apps");
                d.d();
                d.e(new bf() { // from class: com.google.android.apps.search.assistant.surfaces.bisto.a.c.m
                    /* JADX WARN: Type inference failed for: r0v13, types: [android.content.SharedPreferences, java.lang.Object] */
                    @Override // com.google.android.libraries.storage.protostore.bf
                    public final MessageLite a(ca caVar, MessageLite messageLite) {
                        ba builder = ((com.google.android.apps.search.assistant.surfaces.bisto.d.cq) messageLite).toBuilder();
                        boolean c = caVar.c("bisto_spoken_notifications");
                        builder.copyOnWrite();
                        com.google.android.apps.search.assistant.surfaces.bisto.d.cq cqVar2 = (com.google.android.apps.search.assistant.surfaces.bisto.d.cq) builder.instance;
                        cqVar2.b |= 1;
                        cqVar2.c = c;
                        caVar.b("bisto_spoken_notifications_apps");
                        String string = caVar.b.getString("bisto_spoken_notifications_apps", "");
                        builder.copyOnWrite();
                        com.google.android.apps.search.assistant.surfaces.bisto.d.cq cqVar3 = (com.google.android.apps.search.assistant.surfaces.bisto.d.cq) builder.instance;
                        string.getClass();
                        cqVar3.b |= 2;
                        cqVar3.d = string;
                        return (com.google.android.apps.search.assistant.surfaces.bisto.d.cq) builder.build();
                    }
                });
                a6.b().h(d.a());
                a6.c(com.google.android.apps.search.assistant.surfaces.bisto.d.cq.f1974a);
                a6.f = cqVar;
                com.google.apps.tiktok.q.b.h a7 = a6.a();
                jo joVar3 = this.f321a;
                return joVar3.nc().a(a7, (j) joVar3.w.a());
            case 440:
                return new com.google.android.libraries.search.assistant.bb.a.ar((com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.a) this.f321a.b.fO.a(), (com.google.android.libraries.search.assistant.bb.a.ax) this.f321a.b.fP.a());
            case 441:
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.a();
            case 442:
                Context context2 = (Context) this.f321a.f.a();
                KeyguardManager keyguardManager = (KeyguardManager) this.f321a.nn.a();
                jo joVar4 = this.f321a;
                return new com.google.android.libraries.search.assistant.bb.a.ax(context2, keyguardManager, joVar4.kB(), (Executor) joVar4.H.a());
            case 443:
                return new com.google.android.apps.search.assistant.surfaces.voice.j.a.b.e.k(new com.google.android.apps.search.assistant.surfaces.voice.j.a.b.e.b((lt) this.f321a.b.fR.a()));
            case 444:
                return new lt(this);
            case 445:
                com.google.apps.tiktok.experiments.phenotype.x xVar = (com.google.apps.tiktok.experiments.phenotype.x) this.f321a.hn.a();
                xVar.getClass();
                return new de(xVar, 1);
            case 446:
                g a8 = com.google.apps.tiktok.q.b.h.a();
                a8.f5883a = "SpeechOutputSettingsData";
                a8.c(com.google.android.libraries.search.ad.c.a.c.a);
                com.google.apps.tiktok.q.b.h a9 = a8.a();
                jo joVar5 = this.f321a;
                return joVar5.nc().a(a9, (j) joVar5.w.a());
            case 447:
                return new com.google.android.libraries.web.webview.b.a.c((Context) this.f321a.f.a());
            case 448:
                return new com.google.android.gms.location.reporting.d((Context) this.f321a.f.a());
            case 449:
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.b(com.google.aw.c.a.a.b.d);
                return lVar3.a();
            case 450:
                return new lt(this);
            case 451:
                g a10 = com.google.apps.tiktok.q.b.h.a();
                a10.f5883a = "AcetoneDataStore";
                a10.c(com.google.android.apps.search.googleapp.launcher.c.e.a.a.a);
                com.google.apps.tiktok.q.b.h a11 = a10.a();
                jo joVar6 = this.f321a;
                return joVar6.nb().a(a11, (j) joVar6.w.a());
            case 452:
                return new com.google.android.libraries.calendar.appsearch.clients.a.f((com.google.android.libraries.calendar.appsearch.clients.a.e) this.f321a.b.aZ.a());
            case 453:
                String e = ((com.google.apps.tiktok.experiments.e) this.f321a.b.iX().a.a()).a("com.google.android.libraries.search.googleapp.device 45366612").e();
                long b = ((com.google.apps.tiktok.experiments.e) this.f321a.b.iX().a.a()).a("com.google.android.libraries.search.googleapp.device 45366613").b();
                com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                lVar4.a = e;
                lVar4.b = Integer.valueOf((int) b);
                lVar4.b(com.google.aw.k.c.d.a.a.b.c);
                return lVar4.a();
            case 454:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.b.b((com.google.apps.tiktok.g.ay) this.f321a.iu.a());
            case 455:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45364424").f());
            case 456:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.a.d((Context) this.f321a.f.a(), (Executor) this.f321a.H.a(), (com.google.android.libraries.search.assistant.notification.a.b) this.f321a.nh.a(), this.f321a.ig());
            case 457:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45376142").f());
            case 458:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45401120").f());
            case 459:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45634311").f());
            case 460:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45639317").f());
            case 461:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45408847").f());
            case 462:
                return ((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45414662").e();
            case 463:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45412912").f());
            case 464:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45430596").f());
            case 465:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45477374").f());
            case 466:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45429370").f());
            case 467:
                return new com.google.android.libraries.web.contrib.l.b((Context) this.f321a.f.a(), (cq) this.f321a.v.a());
            case 468:
                return new db((Executor) this.f321a.H.a());
            case 469:
                return new com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.d.d();
            case 470:
                return new com.google.android.apps.search.assistant.surfaces.voice.h.d.b();
            case 471:
                return new com.google.android.libraries.search.assistant.performer.communication.e.a((Context) this.f321a.f.a());
            case 472:
                jo joVar7 = this.f321a;
                com.google.frameworks.client.data.android.server.w nT = joVar7.nT();
                io.grpc.b.a c = io.grpc.b.a.c("com.google.android.apps.pixel.support", "com.google.android.apps.pixel.support.diagnosticsignalservice.server.DiagnosticSignalEndpointService");
                Context context3 = (Context) joVar7.f.a();
                context3.getClass();
                cb a12 = nT.a(c, io.grpc.b.c.a, com.google.frameworks.client.data.android.b.g.b(context3, new op("com.google.android.apps.pixel.support")), io.grpc.b.h.a);
                a12.getClass();
                return a12;
            case 473:
                return new com.google.android.libraries.search.assistant.notification.a.a.l();
            case 474:
                ch g = io.grpc.j.c.g(new bi(2), (io.grpc.i) this.f321a.eA.a(), io.grpc.h.a);
                g.getClass();
                return g;
            case 475:
                jr jrVar4 = this.f321a.b;
                Context context4 = (Context) jrVar4.f322a.f.a();
                com.google.android.libraries.assistant.c.a.a.a.e eVar = (com.google.android.libraries.assistant.c.a.a.a.e) jrVar4.dO.a();
                context4.getClass();
                eVar.getClass();
                return new com.google.android.apps.search.assistant.surfaces.voice.p.l.a.a(eVar.a(com.google.android.libraries.assistant.c.a.a.c.a(context4, 5, "AMP-ma-audio-player-session-identifier").a()));
            case 476:
                return new com.google.android.libraries.search.assistant.performer.f.j((com.google.apps.tiktok.media.j) this.f321a.ne.a(), (Context) this.f321a.f.a(), (com.google.common.v.f) this.f321a.ez.a(), (cr) this.f321a.v.a());
            case 477:
                return new com.google.android.libraries.search.assistant.performer.communication.d.b((Context) this.f321a.f.a(), (cr) this.f321a.H.a());
            case 478:
                return new com.google.android.libraries.search.assistant.ag.k((io.grpc.i) this.f321a.eA.a());
            case 479:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45389110").f());
            case 480:
                com.google.android.apps.search.assistant.platform.g.c.g gVar = (com.google.android.apps.search.assistant.platform.g.c.g) this.f321a.mP.a();
                gVar.getClass();
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.j.a(gVar, com.google.android.apps.search.assistant.platform.g.c.c.f.CC_SETTING, cn.c);
            case 481:
                io.grpc.i iVar = (io.grpc.i) this.f321a.eA.a();
                iVar.getClass();
                return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.b.a.e(iVar, io.grpc.h.a);
            case 482:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.host.p.h(new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.c(), new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.d(), com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.b);
            case 483:
                return com.google.android.apps.search.assistant.surfaces.voice.ui.host.p.h(new com.google.android.apps.search.assistant.surfaces.voice.ui.response.ah(), new com.google.android.apps.search.assistant.surfaces.voice.ui.response.ai(), af.b);
            case 484:
                return new com.google.android.libraries.search.assistant.invocation.d.b((lt) this.f321a.b.gE.a(), (Executor) this.f321a.B.a());
            case 485:
                return new lt(this);
            case 486:
                return new com.google.android.libraries.search.assistant.invocation.d.b.i((com.google.android.libraries.search.assistant.invocation.n.d.i) this.f321a.eY.a(), (com.google.android.libraries.g.a) this.f321a.g.a(), (com.google.android.libraries.search.assistant.invocation.h.d.a.d.m) this.f321a.eS.a());
            case 487:
                return new lt(this);
            case 488:
                return new com.google.android.libraries.search.assistant.invocation.d.aj((byte[]) null);
            case 489:
                return new com.google.android.libraries.search.assistant.invocation.d.aj();
            case 490:
                return new com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.defaultactivity.b();
            case 491:
                return new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.k((m.c.n) this.f321a.P.a());
            case 492:
                return new com.google.android.libraries.search.t.h.b((AtomicReference) this.f321a.bg.a());
            case 493:
                return new com.google.android.libraries.search.integrations.a.a.a.a((m.c.n) this.f321a.P.a());
            case 494:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iR().a.a()).a("com.google.android.libraries.search.googleapp.device 45641368").f());
            case 495:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.libraries.search.googleapp.device 45390359").f());
            case 496:
                cq cqVar2 = (cq) this.f321a.b.f322a.n.a();
                cqVar2.getClass();
                g a13 = com.google.apps.tiktok.q.b.h.a();
                a13.f5883a = "video_settings";
                a13.c(com.google.android.libraries.search.ad.d.e.a);
                a13.f = cqVar2;
                com.google.apps.tiktok.q.b.h a14 = a13.a();
                jo joVar8 = this.f321a;
                return joVar8.nb().a(a14, (j) joVar8.w.a());
            case 497:
                return new com.google.android.libraries.web.webview.g.a.c((m.c.n) this.f321a.P.a(), (com.google.android.libraries.web.webview.f.a.b) this.f321a.wC.a());
            case 498:
                return new com.google.android.apps.search.googleapp.search.srp.l.t((m.c.n) this.f321a.P.a());
            case 499:
                return ((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.s(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45369115").d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        switch (i) {
            case 500:
                cq cqVar = (cq) this.f321a.n.a();
                cq cqVar2 = (cq) this.f321a.H.a();
                k kVar = (k) this.f321a.bx.a();
                jo joVar = this.f321a;
                return new com.google.apps.tiktok.p.i(cqVar, cqVar2, kVar, joVar.b.aS(), (d) joVar.bq.a(), (com.google.android.libraries.g.a) this.f321a.g.a());
            case 501:
                return "https://www.googleapis.com/auth/googlenow";
            case 502:
                return com.google.android.apps.search.assistant.surfaces.c.b.a.f.a((Context) this.f321a.f.a(), (ScheduledExecutorService) this.f321a.H.a());
            case 503:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.b.f322a.V).a.a()).a("assistant_auto_tng_libraries_device 45619805").f());
            case 504:
                return new com.google.android.libraries.search.ad.c.d((cq) this.f321a.H.a(), new op(this.f321a.b.H()), (cg) this.f321a.b.fU.a());
            case 505:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353529").b());
            case 506:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353530").b());
            case 507:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353531").b());
            case 508:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353803").b());
            case 509:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45353533").e();
            case 510:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iv().a.a()).a("assistant_auto_tng_libraries_device 45400784").f());
            case 511:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45365517").f());
            case 512:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45359904").f());
            case 513:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45623032").f());
            case 514:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45353750").f());
            case 515:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jb().a.a()).a("assistant_auto_tng_libraries_device 45354335").f());
            case 516:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.b.a.a.c.d(this.f321a.b.f322a.V).a.a()).a("assistant_auto_tng_libraries_device 45415960").f());
            case 517:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45400496").f());
            case 518:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45373708").f());
            case 519:
                return new az((Context) this.f321a.f.a(), (Executor) this.f321a.v.a());
            case 520:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45409251").f());
            case 521:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45651728").e();
            case 522:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45353810").f());
            case 523:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45375643").f());
            case 524:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45364016").f());
            case 525:
                g a2 = com.google.apps.tiktok.q.b.h.a();
                a2.f5883a = "UserAgent";
                a2.c(com.google.android.libraries.assistant.auto.tng.g.a.a.a.a);
                com.google.apps.tiktok.q.b.h a3 = a2.a();
                jo joVar2 = this.f321a;
                return joVar2.nb().a(a3, (j) joVar2.w.a());
            case 526:
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.d.n.d();
            case 527:
                return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.b((ScheduledExecutorService) this.f321a.H.a(), (aa) this.f321a.dp.a());
            case 528:
                return new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.h();
            case 529:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45360034").f());
            case 530:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45360032").f());
            case 531:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45622668").f());
            case 532:
                return false;
            case 533:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45399730").f());
            case 534:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45462915").f());
            case 535:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45460336").f());
            case 536:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45369941").f());
            case 537:
                return ((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45477901").d();
            case 538:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jb().a.a()).a("assistant_auto_tng_libraries_device 45354336").f());
            case 539:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jb().a.a()).a("assistant_auto_tng_libraries_device 45354341").f());
            case 540:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jb().a.a()).a("assistant_auto_tng_libraries_device 45354928").f());
            case 541:
                Context context = (Context) this.f321a.f.a();
                bu buVar = com.google.bo.a.c.a;
                return new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.v(context);
            case 542:
                return new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.j();
            case 543:
                return new com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.k((Context) this.f321a.f.a());
            case 544:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45426572").e();
            case 545:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45426573").e();
            case 546:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45619765").f());
            case 547:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jH().a.a()).a("assistant_auto_tng_libraries_device 45639146").f());
            case 548:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45413704").f());
            case 549:
                return new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c((cg) this.f321a.b.hP.a(), (com.google.android.libraries.g.a) this.f321a.g.a(), (ScheduledExecutorService) this.f321a.H.a());
            case 550:
                g a4 = com.google.apps.tiktok.q.b.h.a();
                a4.f5883a = "AutoNewsBrowserData";
                a4.c(do.a);
                com.google.apps.tiktok.q.b.h a5 = a4.a();
                jo joVar3 = this.f321a;
                return joVar3.nb().a(a5, (j) joVar3.w.a());
            case 551:
                Context context2 = (Context) this.f321a.f.a();
                com.google.android.libraries.assistant.auto.tng.media.mediabrowser.j jVar = (com.google.android.libraries.assistant.auto.tng.media.mediabrowser.j) this.f321a.b.hU.a();
                com.google.android.libraries.assistant.auto.tng.media.mediabrowser.d.a aVar = new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.d.a((Context) this.f321a.b.f322a.f.a());
                jr jrVar = this.f321a.b;
                return com.google.android.libraries.assistant.auto.tng.media.b.a.a(context2, jVar, aVar, jrVar.hV, jrVar.hW, jrVar.hX);
            case 552:
                com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f321a.g.a();
                com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) this.f321a.W.a();
                jr jrVar2 = this.f321a.b;
                return new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.j(aVar2, yVar, jrVar2.hR, jrVar2.hS, jrVar2.hT, (com.google.android.libraries.assistant.c.a.a.a.e) jrVar2.dO.a());
            case 553:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45412661").f());
            case 554:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45634365").f());
            case 555:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45640302").f());
            case 556:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45372973").f());
            case 557:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45426934").f());
            case 558:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45420503").f());
            case 559:
                com.google.android.libraries.assistant.c.a.a.a.e eVar = (com.google.android.libraries.assistant.c.a.a.a.e) this.f321a.b.dO.a();
                com.google.android.libraries.assistant.c.a.a.c cVar = (com.google.android.libraries.assistant.c.a.a.c) this.f321a.b.hY.a();
                jr jrVar3 = this.f321a.b;
                com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.b ao = jrVar3.ao();
                com.google.android.libraries.assistant.auto.tng.media.mediabrowser.j jVar2 = (com.google.android.libraries.assistant.auto.tng.media.mediabrowser.j) jrVar3.hU.a();
                dj djVar = (dj) this.f321a.bK.a();
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f321a.wN.a();
                com.google.android.libraries.search.t.i.y yVar2 = (com.google.android.libraries.search.t.i.y) this.f321a.W.a();
                com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f321a.g.a();
                com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.t tVar = (com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.t) this.f321a.b.hZ.a();
                jo joVar4 = this.f321a;
                jr jrVar4 = joVar4.b;
                return new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.m(eVar, cVar, ao, jVar2, djVar, connectivityManager, yVar2, aVar3, tVar, jrVar4.ia, jrVar4.ib, jrVar4.ic, jrVar4.id, jrVar4.hT, (Executor) joVar4.H.a());
            case 560:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45419501").d();
            case 561:
                return new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.t((cq) this.f321a.v.a(), (Context) this.f321a.f.a(), (com.google.android.libraries.g.a) this.f321a.g.a(), (com.google.apps.tiktok.media.j) this.f321a.ne.a());
            case 562:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45372952").b());
            case 563:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45413094").f());
            case 564:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45430065").f());
            case 565:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45631617").f());
            case 566:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45364201").d();
            case 567:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45377939").f());
            case 568:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45383271").d();
            case 569:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45383272").d();
            case 570:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45476330").f());
            case 571:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45476331").d();
            case 572:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45428064").f());
            case 573:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45371865").f());
            case 574:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jD().a.a()).a("assistant_auto_tng_libraries_device 45354156").f());
            case 575:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iU().a.a()).a("assistant_auto_tng_libraries_device 45367825").f());
            case 576:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45424822").f());
            case 577:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45360037").f());
            case 578:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45360036").f());
            case 579:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45427889").f());
            case 580:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45460982").f());
            case 581:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45360035").f());
            case 582:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iZ().a.a()).a("assistant_auto_tng_libraries_device 45642243").f());
            case 583:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.iZ().a.a()).a("assistant_auto_tng_libraries_device 45643191").e();
            case 584:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45360033").f());
            case 585:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45364948").f());
            case 586:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45424357").b());
            case 587:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45428148").f());
            case 588:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45353269").b());
            case 589:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45371293").d();
            case 590:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45365225").f());
            case 591:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45414891").f());
            case 592:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45612693").f());
            case 593:
                Boolean bool = (Boolean) this.f321a.b.iI.a();
                bool.booleanValue();
                return bool;
            case 594:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eK().a.a()).a("assistant_auto_tng_libraries_device 45388944").f());
            case 595:
                return new com.google.android.libraries.assistant.auto.tng.s.f.b.a.a((com.google.android.libraries.g.a) this.f321a.g.a());
            case 596:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45384534").f());
            case 597:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45400796").f());
            case 598:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sA().a.a()).a("assistant_auto_tng_libraries_device 45389416").f());
            case 599:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45613665").d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        com.google.apps.tiktok.p.m a2;
        int i = this.b;
        switch (i) {
            case 600:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45426894").f());
            case 601:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45460981").f());
            case 602:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45517772").f());
            case 603:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45612031").d();
            case 604:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45613666").d();
            case 605:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45421897").f());
            case 606:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45426353").f());
            case 607:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45427888").f());
            case 608:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jF().a.a()).a("assistant_auto_tng_libraries_device 45423747").f());
            case 609:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45354357").b());
            case 610:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jz().a.a()).a("assistant_auto_tng_libraries_device 45357441").f());
            case 611:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45359017").f());
            case 612:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jx().a.a()).a("assistant_auto_tng_libraries_device 45369355").f());
            case 613:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iW().a.a()).a("assistant_auto_tng_libraries_device 45357439").b());
            case 614:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iW().a.a()).a("assistant_auto_tng_libraries_device 45422474").f());
            case 615:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iW().a.a()).a("assistant_auto_tng_libraries_device 45357146").f());
            case 616:
                return Long.valueOf(this.f321a.b.iW().b());
            case 617:
                com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f321a.g.a();
                return new com.google.android.libraries.assistant.auto.tng.assistant.f.a.b(aVar);
            case 618:
                return new com.google.android.libraries.assistant.auto.tng.s.c.a.a.a((com.google.android.libraries.g.a) this.f321a.g.a(), (Executor) this.f321a.H.a());
            case 619:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45429491").f());
            case 620:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jq().a.a()).a("assistant_auto_tng_libraries_device 45654714").f());
            case 621:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45382085").f());
            case 622:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45382086").d();
            case 623:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45460858").d();
            case 624:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45460725").d();
            case 625:
                com.google.android.libraries.assistant.auto.tng.assistant.f.a.b bVar = (com.google.android.libraries.assistant.auto.tng.assistant.f.a.b) this.f321a.b.jd.a();
                jr jrVar = this.f321a.b;
                return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.i.a.a.a.b(bVar, jrVar.jc, jrVar.ji, jrVar.jj);
            case 626:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45491574").b());
            case 627:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45476312").a());
            case 628:
                return Double.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45476313").a());
            case 629:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45416157").f());
            case 630:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45460381").b());
            case 631:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45356775").f());
            case 632:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45357108").f());
            case 633:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45357109").e();
            case 634:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45357110").e();
            case 635:
                return Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45357111").b());
            case 636:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45360433").f());
            case 637:
                return ((com.google.apps.tiktok.experiments.e) this.f321a.b.jh().a.a()).a("assistant_auto_tng_libraries_device 45360434").d();
            case 638:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.is().a.a()).a("assistant_auto_tng_libraries_device 45426384").f());
            case 639:
                return new com.google.android.libraries.assistant.auto.tng.common.o.a.a((ConnectivityManager) this.f321a.wN.a());
            case 640:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new r(this.f321a.V).a.a()).a("assistant_auto_tng_libraries_device 45641351").f());
            case 641:
                return com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.d.n.d();
            case 642:
                String b = com.google.android.libraries.assistant.auto.tng.q.a.a.c.a.b(this.f321a.b.fp());
                jr jrVar2 = this.f321a.b;
                String fp = jrVar2.fp();
                at aW = jrVar2.aW();
                cx cxVar = new cx();
                cxVar.g(new io.grpc.cl("X-Goog-Api-Key", cx.c), b);
                cxVar.g(new io.grpc.cl("X-Android-Package", cx.c), fp);
                if (aW.h()) {
                    cxVar.g(new io.grpc.cl("X-Android-Cert", cx.c), aW.c());
                }
                return cxVar;
            case 643:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eJ().a.a()).a("assistant_auto_tng_libraries_device 45422528").f());
            case 644:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.f.a.a.s(this.f321a.V).a.a()).a("com.google.android.apps.search.assistant.device 45651261").f());
            case 645:
                return new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.m((cr) this.f321a.v.a(), (p) this.f321a.b.o.a(), (String) this.f321a.Y.a());
            case 646:
                return new com.google.apps.tiktok.media.l((Context) this.f321a.f.a());
            case 647:
                com.google.android.libraries.assistant.d.n a3 = com.google.android.libraries.assistant.d.o.a((Context) this.f321a.f.a());
                a3.b(true);
                return new com.google.android.libraries.assistant.d.m(a3.a());
            case 648:
                return new com.google.android.apps.search.assistant.surfaces.settings.shared.e.j((Context) this.f321a.f.a());
            case 649:
                return new com.google.apps.tiktok.m.a.o((Context) this.f321a.f.a(), (cr) this.f321a.H.a(), (com.google.apps.tiktok.m.a.d) this.f321a.b.jJ.a(), (com.google.apps.tiktok.m.a.l) this.f321a.b.jK.a());
            case 650:
                Context context = (Context) this.f321a.f.a();
                cr crVar = (cr) this.f321a.H.a();
                jo joVar = this.f321a;
                return new com.google.apps.tiktok.m.a.d(context, crVar, joVar.mF(), joVar.b.jI, (d) joVar.bq.a(), (com.google.apps.tiktok.account.data.b) this.f321a.bN.a());
            case 651:
                jo joVar2 = this.f321a;
                fq i2 = fu.i(7);
                i2.i("remote_interactor_unknown_product", joVar2.b.aR());
                i2.i("traces", (com.google.apps.tiktok.h.a.h) this.f321a.cw.a());
                i2.i("apa_invocation", (com.google.apps.tiktok.h.a.h) this.f321a.uJ.a());
                i2.i("generic_appflows", this.f321a.f319a.pd());
                i2.i("generic_appflows_binary_manual", this.f321a.f319a.pc());
                i2.i("DebugServiceExport", (com.google.apps.tiktok.h.a.h) this.f321a.tK.a());
                i2.i("search_notifications", this.f321a.f319a.cK());
                return i2.h(true);
            case 652:
                return new com.google.apps.tiktok.m.a.l((com.google.android.gms.common.api.q) this.f321a.mF.a(), (Executor) this.f321a.H.a());
            case 653:
                Context context2 = (Context) this.f321a.f.a();
                Object a4 = this.f321a.b.jJ.a();
                cq cqVar = (cq) this.f321a.v.a();
                jo joVar3 = this.f321a;
                jr jrVar3 = joVar3.b;
                h hVar = joVar3.mI;
                Object a5 = jrVar3.jK.a();
                com.google.apps.tiktok.m.a.d dVar = (com.google.apps.tiktok.m.a.d) a4;
                return new com.google.apps.tiktok.m.a.o(context2, dVar, cqVar, hVar);
            case 654:
                return new com.google.android.gms.googlehelp.a.a();
            case 655:
                return new com.google.android.gms.googlehelp.a.a();
            case 656:
                return new com.google.android.apps.search.assistant.verticals.reminders.b.b((Context) this.f321a.f.a());
            case 657:
                com.google.android.apps.search.assistant.platform.g.c.g gVar = (com.google.android.apps.search.assistant.platform.g.c.g) this.f321a.mP.a();
                gVar.getClass();
                return com.google.android.apps.search.assistant.surfaces.voice.j.a.a.j.a(gVar, com.google.android.apps.search.assistant.platform.g.c.c.f.ASSISTANT_ENABLED, cn.w);
            case 658:
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.b(((com.google.apps.tiktok.experiments.e) this.f321a.b.iL().a.a()).a("com.google.android.apps.search.assistant.device 463701142").f(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iw().a.a()).a("com.google.android.apps.search.assistant.mobile.device 45426913").f(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iw().a.a()).a("com.google.android.apps.search.assistant.mobile.device 45461622").f(), (KeyguardManager) this.f321a.nn.a(), (com.google.android.libraries.search.t.i.y) this.f321a.W.a());
            case 659:
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.c(((com.google.apps.tiktok.experiments.e) this.f321a.b.iG().a.a()).a("com.google.android.apps.search.assistant.device 55373408").f(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iG().a.a()).a("com.google.android.apps.search.assistant.device 55351731").b(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iG().a.a()).a("com.google.android.apps.search.assistant.device 55373406").f(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iG().a.a()).a("com.google.android.apps.search.assistant.device 55351829").f(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iG().a.a()).a("com.google.android.apps.search.assistant.device 24645").f(), ((com.google.apps.tiktok.experiments.e) this.f321a.b.iG().a.a()).a("com.google.android.apps.search.assistant.device 45430931").f(), (com.google.android.libraries.search.t.i.y) this.f321a.W.a());
            case 660:
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.g(h.a.a.f.a.a.x.a(this.f321a.V));
            case 661:
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.d();
            case 662:
                Context context3 = (Context) this.f321a.f.a();
                ((com.google.apps.tiktok.experiments.e) this.f321a.b.iM().a.a()).a("com.google.android.apps.search.assistant.device 45382749").f();
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.e(context3);
            case 663:
                h.a.a.f.a.a.x.a(this.f321a.V);
                return new com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.f();
            case 664:
                return com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.t.a(((com.google.apps.tiktok.experiments.e) this.f321a.b.iF().a.a()).a("com.google.android.apps.search.assistant.device 45372946").e());
            case 665:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.main.ae((byte[]) null);
            case 666:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.main.ae();
            case 667:
                bp bz = this.f321a.b.bz();
                cx cxVar2 = new cx();
                cxVar2.g(new io.grpc.cl("X-Goog-Api-Key", cx.c), "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
                cxVar2.g(new io.grpc.cl("X-Android-Package", cx.c), "com.google.android.googlequicksearchbox");
                cxVar2.g(new io.grpc.cl("X-Android-Cert", cx.c), "58E1C4133F7441EC3D2C270270A14802DA47BA0E");
                bp J = bz.I(new io.grpc.l[]{new io.grpc.j.q(cxVar2)}).J(com.google.frameworks.client.data.android.d.e.a, new com.google.frameworks.client.data.android.d.h());
                J.getClass();
                return J;
            case 668:
                m a6 = com.google.android.libraries.search.n.a.a("s3.grpc.url", "speechs3proto2-pa.googleapis.com", 443);
                com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                lVar.a = a6.a;
                lVar.b = Integer.valueOf(a6.a());
                lVar.b(com.google.speech.g.d.b.e);
                return lVar.a();
            case 669:
                return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.imageinput.capture.t();
            case 670:
                com.google.common.f.a.d dVar2 = com.google.android.libraries.logging.ve.e.e.a.b.a;
                return new com.google.android.libraries.logging.ve.synthetic.l();
            case 671:
                jo joVar4 = this.f321a;
                bn by = joVar4.b.by();
                Context context4 = (Context) joVar4.f.a();
                context4.getClass();
                bn a7 = com.google.android.libraries.assistant.c.e.a.a.a.a(by, context4);
                a7.getClass();
                return a7;
            case 672:
                m a8 = com.google.android.libraries.search.n.a.a("s3.grpc.url", this.f321a.b.iP().C(), 443);
                com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                lVar2.a = a8.a;
                lVar2.b = Integer.valueOf(a8.a());
                lVar2.b(com.google.speech.g.d.b.e);
                return lVar2.a();
            case 673:
                return new ls();
            case 674:
                return new lt(this);
            case 675:
                return new com.google.android.apps.search.assistant.surfaces.c.d.b.a.d.a.g();
            case 676:
                return new com.google.android.apps.search.assistant.surfaces.c.d.b.a.b.a.f();
            case 677:
                return new com.google.android.apps.search.assistant.surfaces.c.d.b.a.c.a.i();
            case 678:
                return new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.h();
            case 679:
                return new com.google.android.apps.search.assistant.surfaces.c.d.b.a.a.a.f();
            case 680:
                return new androidx.slice.j((Context) this.f321a.f.a());
            case 681:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.V.a()).a("com.google.android.apps.search.assistant.device 45407169").f());
            case 682:
                return new com.google.android.libraries.search.a.c.b();
            case 683:
                return new com.google.android.libraries.search.a.a.a.c((m.c.n) this.f321a.R.a(), (Context) this.f321a.f.a(), (String) this.f321a.Y.a());
            case 684:
                return new com.google.common.f.b.a.l((com.google.common.f.b.a.h) this.f321a.nJ.a(), (cq) this.f321a.nI.a());
            case 685:
                return new com.google.common.f.b.a.l((com.google.common.f.b.a.h) this.f321a.nL.a(), (cq) this.f321a.v.a());
            case 686:
                long b2 = ((com.google.apps.tiktok.experiments.e) this.f321a.b.iN().a.a()).a("com.google.android.apps.search.assistant.device 45362875").b();
                com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                lVar3.b(com.google.aq.b.a.a.b.t);
                int q = com.google.common.r.k.q(b2);
                if (q == 1) {
                    lVar3.a = "preprod-googlehomefoyer-pa.sandbox.googleapis.com";
                    lVar3.b = 443;
                    a2 = lVar3.a();
                } else if (q != 2) {
                    a2 = lVar3.a();
                } else {
                    lVar3.a = "autopush-googlehomefoyer-pa.sandbox.googleapis.com";
                    lVar3.b = 443;
                    a2 = lVar3.a();
                }
                return a2;
            case 687:
                return new com.google.android.libraries.ad.a.a.a.b();
            case 688:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45368434").f());
            case 689:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45411344").f());
            case 690:
                return Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sr().a.a()).a("com.google.android.apps.search.assistant.device 45415035").f());
            case 691:
                return new com.google.android.apps.search.googleapp.accounts.ui.b.n((cg) this.f321a.b.ku.a(), (Executor) this.f321a.H.a());
            case 692:
                g a9 = com.google.apps.tiktok.q.b.h.a();
                a9.f5883a = "GoogleApp_SingletonMenuState";
                a9.c(com.google.android.apps.search.googleapp.accounts.ui.b.o.a);
                com.google.apps.tiktok.q.b.h a10 = a9.a();
                jo joVar5 = this.f321a;
                return joVar5.nb().a(a10, (j) joVar5.w.a());
            case 693:
                com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                lVar4.b(com.google.bn.b.c.a.b.p);
                return lVar4.a();
            case 694:
                com.google.android.gms.common.f fVar = com.google.android.gms.common.f.d;
                fVar.getClass();
                return fVar;
            case 695:
                return new com.google.android.gms.credential.manager.b.a.c((Context) this.f321a.f.a());
            case 696:
                Context context5 = (Context) this.f321a.f.a();
                bd k = at.k((ExecutorService) this.f321a.v.a());
                EducationDatabase educationDatabase = (EducationDatabase) this.f321a.b.kz.a();
                Executors.newCachedThreadPool(com.google.android.libraries.onegoogle.common.t.h()).getClass();
                return new com.google.android.libraries.onegoogle.accountmenu.features.education.c(context5, (ExecutorService) k.a, educationDatabase);
            case 697:
                Context context6 = (Context) this.f321a.f.a();
                bd k2 = at.k((ExecutorService) this.f321a.v.a());
                Executors.newCachedThreadPool(com.google.android.libraries.onegoogle.common.t.h()).getClass();
                EducationDatabase D = EducationDatabase.D(context6, (ExecutorService) k2.a);
                D.getClass();
                return D;
            case 698:
                jo joVar6 = this.f321a;
                return joVar6.nb().a(joVar6.b.aT(), (j) joVar6.w.a());
            case 699:
                com.google.apps.tiktok.p.l lVar5 = new com.google.apps.tiktok.p.l();
                lVar5.b(com.google.aw.k.e.a.a.a.b.d);
                return lVar5.a();
            default:
                throw new AssertionError(i);
        }
    }

    public final Object a() {
        com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.j cVar;
        String str;
        int i = this.b;
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
                        cVar = new com.google.android.apps.search.googleapp.launcher.b.c((cg) this.f321a.b.kC.a(), (Executor) this.f321a.H.a(), (ag) this.f321a.Q.a(), (com.google.common.v.f) this.f321a.ez.a(), ((com.google.apps.tiktok.experiments.e) new h.a.a.r.a.a.m(this.f321a.b.f322a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 45629632").f());
                        break;
                    case 701:
                        g a2 = com.google.apps.tiktok.q.b.h.a();
                        a2.f5883a = "LauncherDebugData";
                        a2.c(com.google.android.apps.search.googleapp.launcher.b.a.b.a);
                        com.google.apps.tiktok.q.b.h a3 = a2.a();
                        jo joVar = this.f321a;
                        cVar = joVar.nb().a(a3, (j) joVar.w.a());
                        break;
                    case 702:
                        com.google.apps.tiktok.p.l lVar = new com.google.apps.tiktok.p.l();
                        lVar.b(com.google.bn.b.c.a.b.p);
                        cVar = lVar.a();
                        break;
                    case 703:
                        jo joVar2 = this.f321a;
                        cVar = joVar2.b.aa().a(joVar2.ll());
                        break;
                    case 704:
                        cVar = new com.google.android.apps.search.googleapp.search.g.a.b();
                        break;
                    case 705:
                        cVar = new com.google.android.apps.search.googleapp.customtabs.c.a.q((com.google.android.libraries.g.a) this.f321a.g.a());
                        break;
                    case 706:
                        cVar = new com.google.android.apps.search.googleapp.customtabs.e.g((Context) this.f321a.f.a());
                        break;
                    case 707:
                        jo joVar3 = this.f321a;
                        Optional empty = Optional.empty();
                        String G = joVar3.b.jC().G();
                        empty.isPresent();
                        str = G.length() > 0 ? G : "bobaucppostmanager-pa.googleapis.com";
                        com.google.apps.tiktok.p.l lVar2 = new com.google.apps.tiktok.p.l();
                        lVar2.a = str;
                        lVar2.b = 443;
                        lVar2.b(com.google.aw.k.b.d.a.a.b.i);
                        cVar = lVar2.a();
                        break;
                    case 708:
                        cVar = new com.google.android.apps.search.googleapp.contentcreator.e.a();
                        break;
                    case 709:
                        cVar = new com.google.android.apps.search.googleapp.contentcreator.compose.pagepreview.s((ao) this.f321a.bz.a());
                        break;
                    case 710:
                        cVar = new com.google.android.apps.search.googleapp.contentcreator.j.h();
                        break;
                    case 711:
                        com.google.apps.tiktok.p.l lVar3 = new com.google.apps.tiktok.p.l();
                        lVar3.a = "bobaidentity-pa.googleapis.com";
                        lVar3.b = 443;
                        lVar3.b(com.google.aw.k.b.c.a.a.a.b.c);
                        cVar = lVar3.a();
                        break;
                    case 712:
                        jo joVar4 = this.f321a;
                        Optional empty2 = Optional.empty();
                        String G2 = joVar4.b.jC().G();
                        empty2.isPresent();
                        str = G2.length() > 0 ? G2 : "bobaucppostmanager-pa.googleapis.com";
                        com.google.apps.tiktok.p.l lVar4 = new com.google.apps.tiktok.p.l();
                        lVar4.a = str;
                        lVar4.b = 443;
                        lVar4.b(com.google.aw.k.b.d.a.a.b.i);
                        cVar = lVar4.a();
                        break;
                    case 713:
                        m a4 = com.google.android.libraries.search.n.a.a("discover.grpc.url", this.f321a.b.ju().D(), (int) this.f321a.b.ju().C());
                        com.google.apps.tiktok.p.l lVar5 = new com.google.apps.tiktok.p.l();
                        lVar5.a = a4.a;
                        lVar5.b = Integer.valueOf(a4.a());
                        lVar5.b(com.google.aw.d.b.c.a.a.b.c);
                        cVar = lVar5.a();
                        break;
                    case 714:
                        cVar = new com.google.android.libraries.search.silk.impl.f.a((com.google.android.libraries.g.a) this.f321a.g.a());
                        break;
                    case 715:
                        cVar = new com.google.android.libraries.search.rendering.xuikit.a.a.a.a.f((Context) this.f321a.f.a());
                        break;
                    case 716:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.f322a.V.a()).a("com.google.android.libraries.search.googleapp.device 45634632").f());
                        break;
                    case 717:
                        ConnectivityManager connectivityManager = (ConnectivityManager) this.f321a.wN.a();
                        ag agVar = (ag) this.f321a.Q.a();
                        m.c.n nVar = (m.c.n) this.f321a.R.a();
                        jr jrVar = this.f321a.b;
                        cVar = new com.google.android.libraries.search.v.c.a.e(connectivityManager, agVar, nVar, jrVar.aU(), jrVar.hd(), jrVar.hc());
                        break;
                    case 718:
                        cVar = new AtomicReference(Optional.empty());
                        break;
                    case 719:
                        cVar = new AtomicReference(Optional.empty());
                        break;
                    case 720:
                        cVar = com.google.common.android.a.c.a;
                        cVar.getClass();
                        break;
                    case 721:
                        cVar = com.google.common.v.d.a;
                        cVar.getClass();
                        break;
                    case 722:
                        g a5 = com.google.apps.tiktok.q.b.h.a();
                        a5.f5883a = "InAppUpdateDataStore";
                        ba createBuilder = com.google.android.libraries.search.o.b.l.a.createBuilder();
                        createBuilder.getClass();
                        a5.c = com.google.android.libraries.search.o.b.k.a(createBuilder);
                        com.google.apps.tiktok.q.b.h a6 = a5.a();
                        jo joVar5 = this.f321a;
                        cVar = joVar5.nb().a(a6, (j) joVar5.w.a());
                        break;
                    case 723:
                        cVar = new com.google.android.apps.search.googleapp.launcher.c.g.c(this.f321a.b.Y());
                        break;
                    case 724:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) new h.a.a.r.a.a.m(this.f321a.V).a.a()).a("com.google.android.libraries.search.googleapp.device 45388098").f());
                        break;
                    case 725:
                        cVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45359731").b());
                        break;
                    case 726:
                        cVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f321a.b.jx().a.a()).a("assistant_auto_tng_libraries_device 45369387").d();
                        break;
                    case 727:
                        cVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f321a.b.jx().a.a()).a("assistant_auto_tng_libraries_device 45369388").d();
                        break;
                    case 728:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jx().a.a()).a("assistant_auto_tng_libraries_device 45369389").f());
                        break;
                    case 729:
                        cVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f321a.b.jx().a.a()).a("assistant_auto_tng_libraries_device 45369390").d();
                        break;
                    case 730:
                        cVar = new com.google.android.libraries.assistant.c.e.a.b.k(this.f321a.Q);
                        break;
                    case 731:
                    case 735:
                        cVar = false;
                        break;
                    case 732:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iS().a.a()).a("assistant_auto_tng_libraries_device 45407508").f());
                        break;
                    case 733:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eK().a.a()).a("assistant_auto_tng_libraries_device 45400816").f());
                        break;
                    case 734:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.eK().a.a()).a("assistant_auto_tng_libraries_device 45400815").f());
                        break;
                    case 736:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.il().a.a()).a("assistant_auto_tng_libraries_device 45419414").f());
                        break;
                    case 737:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45355269").f());
                        break;
                    case 738:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45364136").f());
                        break;
                    case 739:
                        cVar = Double.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45357923").a());
                        break;
                    case 740:
                        cVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45370733").b());
                        break;
                    case 741:
                        cVar = Boolean.valueOf(((PackageManager) this.f321a.h.a()).hasSystemFeature("android.hardware.type.automotive"));
                        break;
                    case 742:
                        cVar = (com.google.protos.l.a.e) ((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45354363").d();
                        break;
                    case 743:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sB().a.a()).a("assistant_auto_tng_libraries_device 504679189").f());
                        break;
                    case 744:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sy().a.a()).a("assistant_auto_tng_libraries_device 45369807").f());
                        break;
                    case 745:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.iS().a.a()).a("assistant_auto_tng_libraries_device 45424362").f());
                        break;
                    case 746:
                        jr jrVar2 = this.f321a.b;
                        bn q = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(jrVar2.f322a.mf, (com.google.apps.tiktok.p.m) jrVar2.lz.a(), (com.google.apps.tiktok.p.u) jrVar2.f322a.mh.a(), (com.google.frameworks.client.data.android.d) jrVar2.f322a.mb.a(), com.google.common.base.a.a);
                        q.getClass();
                        cVar = com.google.android.libraries.assistant.c.e.a.a.a.a(q, (Context) this.f321a.f.a());
                        cVar.getClass();
                        break;
                    case 747:
                        m a7 = com.google.android.libraries.search.n.a.a("s3.grpc.url", this.f321a.b.iP().C(), 443);
                        com.google.apps.tiktok.p.l lVar6 = new com.google.apps.tiktok.p.l();
                        lVar6.a = a7.a;
                        lVar6.b = Integer.valueOf(a7.a());
                        lVar6.b(com.google.speech.g.d.b.e);
                        cVar = lVar6.a();
                        break;
                    case 748:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45360808").f());
                        break;
                    case 749:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45359794").f());
                        break;
                    case 750:
                        cVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45360004").b());
                        break;
                    case 751:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45361064").f());
                        break;
                    case 752:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45367244").f());
                        break;
                    case 753:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45366648").f());
                        break;
                    case 754:
                        cVar = Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sx().a.a()).a("assistant_auto_tng_libraries_device 45376769").b());
                        break;
                    case 755:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sA().a.a()).a("assistant_auto_tng_libraries_device 45622956").f());
                        break;
                    case 756:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.b.jA().a.a()).a("assistant_auto_tng_libraries_device 45654880").f());
                        break;
                    case 757:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sC().a.a()).a("assistant_auto_tng_libraries_device 45360362").f());
                        break;
                    case 758:
                        cVar = Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f321a.f319a.sC().a.a()).a("assistant_auto_tng_libraries_device 45409250").f());
                        break;
                    case 759:
                        cVar = new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.j((com.google.android.apps.search.assistant.surfaces.bisto.e.g.c) this.f321a.f319a.fA.a(), this.f321a.f319a.pt());
                        break;
                    default:
                        throw new AssertionError(i);
                }
                return cVar;
        }
    }
}
