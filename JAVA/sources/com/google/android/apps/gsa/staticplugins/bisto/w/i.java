package com.google.android.apps.gsa.staticplugins.bisto.w;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.UserManager;
import android.service.voice.VoiceInteractionService;
import androidx.work.r;
import com.google.android.apps.gsa.assist.a.k;
import com.google.android.apps.gsa.assistant.settings.devices.d.b.l;
import com.google.android.apps.gsa.s.c;
import com.google.android.apps.gsa.search.core.ac.af;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.service.f.a;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.c.ac;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.apps.gsa.staticplugins.bisto.t.e;
import com.google.android.apps.search.assistant.surfaces.bisto.a.i.s;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ds;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.g.b;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.g.f;
import com.google.android.libraries.gsa.h.h;
import com.google.apps.tiktok.tracing.contrib.c.g;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.o.dk;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.g.ar.fe;
import com.google.g.ar.ll;
import com.google.protobuf.ba;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/bisto/w/i.class */
public class i extends a implements com.google.android.apps.gsa.search.core.ae.o.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1633a = j.i("com.google.android.apps.gsa.staticplugins.bisto.w.i");
    public final Context b;
    public final SharedPreferences c;
    public final h f;
    public final e.a g;
    private final at h;
    private final h i;
    private final k j;
    private final af k;
    private final e l;
    private final e.a m;
    private final l n;
    private final ProxyPermissionsRequester o;
    private final cr p;
    private final com.google.android.apps.search.assistant.surfaces.bisto.a.f.l q;
    private final an r;

    static {
        Duration.ofSeconds(10L);
    }

    public i(Context context, SharedPreferences sharedPreferences, at atVar, an anVar, h hVar, h hVar2, e.a aVar, af afVar, e eVar, e.a aVar2, l lVar, k kVar, ProxyPermissionsRequester proxyPermissionsRequester, cr crVar, com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.g.e eVar2, com.google.android.apps.search.assistant.surfaces.bisto.a.f.l lVar2) {
        super(c.WORKER_BISTO, "bisto");
        new g();
        this.b = context;
        this.c = sharedPreferences;
        this.h = atVar;
        this.r = anVar;
        this.f = hVar;
        this.i = hVar2;
        this.g = aVar;
        this.k = afVar;
        this.l = eVar;
        this.m = aVar2;
        this.n = lVar;
        this.j = kVar;
        this.o = proxyPermissionsRequester;
        this.p = crVar;
        this.q = lVar2;
        f fVar = (f) eVar2;
        if (!fVar.d) {
            fVar.e.c("bistoRealServiceWakeupWorker");
            return;
        }
        com.google.common.f.h d = f.f1994a.d();
        d.aj(com.google.common.f.a.e.a, "BistoWakeManager");
        d.ak(26623);
        d.p("set up BRS wake up worker");
        com.google.apps.tiktok.contrib.work.g a2 = com.google.apps.tiktok.contrib.work.k.a(b.class);
        a2.f = at.k(new com.google.apps.tiktok.contrib.work.h(new com.google.apps.tiktok.contrib.work.i(f.b.toHours(), TimeUnit.HOURS), com.google.common.base.a.a));
        a2.c = new com.google.apps.tiktok.contrib.work.i(f.b.toHours(), TimeUnit.HOURS);
        a2.g = at.k(new com.google.apps.tiktok.contrib.work.j("bistoRealServiceWakeupWorker", r.UPDATE));
        a2.b(f.c);
        fVar.e.e(a2.a());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn a(String str) {
        return this.f.h("bisto-clear-device", new e(this, str));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn b() {
        return this.i.b("onBootOrInstall", new b(this));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn c() {
        if (!m()) {
            Intent intent = new Intent("com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED");
            intent.setPackage("com.google.android.googlequicksearchbox");
            this.b.sendBroadcast(intent);
            return com.google.android.apps.gsa.v.c.b;
        }
        com.google.common.f.h d = f1633a.d();
        d.aj(com.google.common.f.a.e.a, "BistoWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(13606);
        hVar.p("Bisto not supported");
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final cn f() {
        com.google.common.f.h e = f1633a.e();
        e.aj(com.google.common.f.a.e.a, "BistoWorker");
        com.google.common.f.h hVar = e;
        hVar.ak(13607);
        hVar.p("requestClientFollowOn - should not be received; legacy query path removed");
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void g(Intent intent) {
        com.google.common.util.concurrent.i.h(this.q.d(), ex.e(new f(this, intent)), this.p);
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void h() {
        com.google.common.f.h d = f1633a.d();
        d.aj(com.google.common.f.a.e.a, "BistoWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(13614);
        hVar.p("refreshAssistantSettings");
        Account l = this.r.l();
        com.google.common.f.h d2 = e.f1631a.d();
        d2.aj(com.google.common.f.a.e.a, "BistoVoiceSettings");
        com.google.common.f.h hVar2 = d2;
        hVar2.ak(12936);
        hVar2.p("refreshAssistantSettings");
        String str = l == null ? null : l.name;
        e eVar = this.l;
        ba createBuilder = ll.a.createBuilder();
        createBuilder.copyOnWrite();
        ll llVar = createBuilder.instance;
        llVar.b |= 134217728;
        llVar.t = true;
        dl.y(eVar.e.j(l, createBuilder.build(), fe.a, 5L, TimeUnit.SECONDS, eVar.getClass().getSimpleName()), new com.google.android.apps.gsa.staticplugins.bisto.t.c(eVar, str, "assistant_settings_preferred_voice:".concat(String.valueOf(str))), eVar.b);
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        String concat;
        ab abVar = com.google.common.f.a.e.a;
        fVar.q("BistoWorker");
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) this.b.getSystemService("activity")).getRunningServices(50);
        boolean a2 = this.j.a();
        k kVar = this.j;
        String format = String.format("GSA is Active Assistant = %b, GSA is VIS = %b", Boolean.valueOf(a2), Boolean.valueOf(VoiceInteractionService.isActiveService(kVar.f236a, kVar.b)));
        if (runningServices != null) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.service.equals(this.j.b)) {
                    concat = format + ",# crashes = " + runningServiceInfo.crashCount + ", is foreground = " + runningServiceInfo.foreground + ", started = " + runningServiceInfo.started + ", uid = " + runningServiceInfo.uid + ", is restarting = " + runningServiceInfo.restarting + ", process = " + runningServiceInfo.process;
                    break;
                }
            }
        }
        concat = String.valueOf(format).concat(", not running");
        fVar.r(new d(concat, false));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void i(String str, String str2, Bundle bundle) {
        com.google.android.apps.gsa.shared.f.k.a(com.google.android.apps.gsa.shared.f.d.a().b(str), this.c);
        ac a2 = new ae(((ds) this.g.a()).c(str), this.f, "get-device-info").a(new g(this, str, str2, bundle, 1));
        a2.b(com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.d.class, new g(this, str, str2, bundle, 0));
        a2.a(new d(2));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void j() {
        boolean ae = ((com.google.android.apps.gsa.speech.o.g) this.m.a()).ae();
        af b = this.k.a().b();
        b.c("key_personal_results_headphones_enabled", ae);
        b.b();
    }

    @Override // com.google.android.apps.gsa.search.core.ae.o.a
    public final void k() {
        Account l = this.r.l();
        if (l == null) {
            com.google.common.f.h e = f1633a.e();
            e.aj(com.google.common.f.a.e.a, "BistoWorker");
            com.google.common.f.h hVar = e;
            hVar.ak(13616);
            hVar.p("Couldn't get logged in Google account.");
            return;
        }
        l lVar = this.n;
        af afVar = this.k;
        boolean g = lVar.g(l);
        af b = afVar.a().b();
        b.c("key_personal_results_enabled", g);
        b.b();
    }

    public final void l(String str, String str2, int i, Bundle bundle) {
        if (s.z(this.b)) {
            Intent b = com.google.android.apps.gsa.shared.f.b.d.b(this.b, str, str2, i, dk.f);
            b.putExtra("deeplink_context", bundle);
            ex.o(this.b, b);
            return;
        }
        a aVar = new a(this, str, str2, i, bundle);
        com.google.common.f.h d = f1633a.d();
        d.aj(com.google.common.f.a.e.a, "BistoWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(13615);
        hVar.p("Request connect permission");
        this.o.a(new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 18, new h(aVar));
    }

    public final boolean m() {
        UserManager userManager;
        if ((this.h.h() && !((com.google.android.apps.gsa.staticplugins.opa.h.a) this.h.c()).f1767a.u()) || (userManager = (UserManager) this.b.getSystemService("user")) == null) {
            return true;
        }
        if (userManager.isSystemUser()) {
            return false;
        }
        com.google.common.f.h d = f1633a.d();
        d.aj(com.google.common.f.a.e.a, "BistoWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(13618);
        hVar.p("Not owner");
        return true;
    }
}
