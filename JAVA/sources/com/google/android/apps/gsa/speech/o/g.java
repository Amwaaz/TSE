package com.google.android.apps.gsa.speech.o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.UserManager;
import com.google.android.apps.gsa.assistant.settings.shared.ab;
import com.google.android.apps.gsa.assistant.settings.shared.t;
import com.google.android.apps.gsa.assistant.shared.aa;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.h.s;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.e.e;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.k.ef;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.libraries.search.account.k;
import com.google.android.libraries.search.ai.d;
import com.google.android.libraries.search.ai.o;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.oo;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.am;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/o/g.class */
public class g {
    private static final j c = j.i("com.google.android.apps.gsa.speech.o.g");

    /* renamed from: a, reason: collision with root package name */
    public final s f1614a;
    public final i b;
    private final Context d;
    private final e.a e;
    private final p f;
    private final e.a g;
    private final e.a h;
    private final e.a i;
    private final e.a j;
    private final e.a k;
    private final e.a l;
    private final com.google.android.apps.gsa.projection.g m;
    private final e.a n;
    private final at o;
    private final ConcurrentMap p;
    private final com.google.android.libraries.search.ai.i q;
    private final o r;
    private final k s;
    private final d t;

    public g(Context context, s sVar, e.a aVar, p pVar, i iVar, e.a aVar2, e.a aVar3, e.a aVar4, e.a aVar5, e.a aVar6, e.a aVar7, com.google.android.apps.gsa.projection.g gVar, k kVar, e.a aVar8, com.google.android.libraries.search.ai.i iVar2, at atVar, o oVar, d dVar) {
        com.google.common.a.j jVar = new com.google.common.a.j();
        jVar.g(1L);
        jVar.f(10L, TimeUnit.MINUTES);
        this.p = jVar.a().a;
        this.f1614a = sVar;
        this.d = context;
        this.e = aVar;
        this.f = pVar;
        this.k = aVar6;
        this.b = iVar;
        iVar.registerObserver(new f(this));
        P();
        this.g = aVar2;
        this.h = aVar3;
        this.i = aVar4;
        this.j = aVar5;
        this.l = aVar7;
        this.m = gVar;
        this.s = kVar;
        this.n = aVar8;
        this.o = atVar;
        this.q = iVar2;
        this.r = oVar;
        this.t = dVar;
    }

    static final String ar(com.google.android.apps.gsa.shared.speech.hotword.b.c cVar, String str) {
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            return "okgoogle_dsp_supported_".concat(String.valueOf(str));
        }
        if (ordinal == 2) {
            return "xgoogle_dsp_supported_".concat(String.valueOf(str));
        }
        com.google.common.f.h e = c.e();
        e.ak(10152);
        e.s("Unknown model type %s", cVar.name());
        return null;
    }

    private final Locale at() {
        Locale j;
        return (!al() || (j = ar.j(((z) this.h.a()).b())) == null) ? Locale.getDefault() : j;
    }

    public final Locale A() {
        return at();
    }

    public final void B() {
        synchronized (this) {
            if (this.f.w(az.kO) && c() == 0 && af()) {
                L(false);
                com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
                iVar.a("lockscreen_personal_response_enable_status", 2);
                iVar.b(false);
            }
        }
    }

    public final void C(String str, long j) {
        com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
        iVar.a(String.format("last_adaptive_tts_time_%s", str), Long.valueOf(j));
        iVar.b(false);
    }

    public final void D(String str, int i) {
        com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
        iVar.a(String.format("adaptive_tts_%s", str), Integer.valueOf(i));
        iVar.b(false);
    }

    public final void E() {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
            iVar.a("nonDspToDspMigration", true);
            iVar.b(false);
        }
    }

    public final void F() {
        com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
        iVar.a("hasEverUsedVoiceSearch", true);
        iVar.b(false);
    }

    public final void G(com.google.android.libraries.search.ai.f fVar, com.google.android.libraries.search.ai.c.c cVar) {
        am.d.getClass();
        int ordinal = fVar.ordinal();
        if (ordinal == 1) {
            this.q.d(cVar);
        } else {
            if (ordinal != 2) {
                throw new IllegalArgumentException("Cannot explicitly set to ".concat(String.valueOf(String.valueOf(fVar))));
            }
            this.q.e(com.google.android.libraries.search.ai.f.DECLINED, cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.a.a] */
    public final void H(boolean z) {
        com.google.android.apps.gsa.search.core.preferences.i f = ((n) this.t.b.a()).f();
        f.a("supportsAlwaysOn", Boolean.valueOf(z));
        f.b(false);
    }

    public final void I(int i, boolean z, String str) {
        com.google.android.apps.gsa.shared.speech.hotword.b.c cVar = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE;
        com.google.android.apps.gsa.shared.speech.hotword.b.c cVar2 = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE;
        if (i == cVar2.d) {
            cVar = cVar2;
        }
        String ar = ar(cVar, str);
        if (ar != null) {
            com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
            iVar.a(ar, Boolean.valueOf(z));
            iVar.b(false);
        }
    }

    public final void J(int i) {
        int i2 = i;
        if (i != 0) {
            i2 = i;
            if (i != 1) {
                i2 = 2;
            }
        }
        com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
        iVar.a("languagePacksAutoUpdate", Integer.valueOf(i2));
        iVar.b(false);
    }

    public final void K(boolean z) {
        com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
        iVar.a("headphone_lockscreen_personal_response", Boolean.valueOf(z));
        iVar.b(false);
        com.google.android.apps.gsa.shared.f.c.a((e) this.l.a(), new ae(ac.BISTO_PR_OR_HPR_PREF_CHANGED).d());
    }

    public final void L(boolean z) {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
            iVar.a("lockscreen_personal_response", Boolean.valueOf(z));
            iVar.b(false);
            if (this.f.w(az.kO)) {
                com.google.android.apps.gsa.search.core.preferences.i iVar2 = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
                iVar2.a("lockscreen_personal_response_enable_status", Integer.valueOf(z ? 1 : 0));
                iVar2.b(false);
            }
        }
    }

    public final void M(boolean z, com.google.android.libraries.search.ai.c.c cVar) {
        com.google.common.f.h d = c.d();
        d.ak(10163);
        d.s("setOpaHotwordEnabled %b", Boolean.valueOf(z));
        if (z) {
            this.q.d(cVar);
        } else {
            this.q.e(com.google.android.libraries.search.ai.f.DECLINED, cVar);
        }
    }

    public final void N() {
        com.google.android.apps.gsa.search.core.preferences.i iVar = new com.google.android.apps.gsa.search.core.preferences.i(this.f1614a.f1127a.d());
        iVar.a("eyes_free_intro_tts_flow_started", true);
        iVar.b(false);
    }

    public final void O(boolean z, com.google.android.libraries.search.ai.c.c cVar) {
        j jVar = c;
        com.google.common.f.h d = jVar.d();
        d.ak(10166);
        d.s("isOpaHotwordEnabled: %b", Boolean.valueOf(z));
        com.google.android.libraries.search.ai.f a2 = this.q.a();
        if (!z) {
            com.google.common.f.h d2 = jVar.d();
            d2.ak(10169);
            d2.p("Disabling the hotword detector.");
            this.q.e(com.google.android.libraries.search.ai.f.DECLINED, cVar);
            return;
        }
        if (a2 == com.google.android.libraries.search.ai.f.ENROLLED) {
            com.google.common.f.h d3 = jVar.d();
            d3.ak(10168);
            d3.p("Setting VoiceMatch enabled again.");
            this.q.d(cVar);
            return;
        }
        if (a2 == com.google.android.libraries.search.ai.f.INCOMPLETE) {
            com.google.common.f.h d4 = jVar.d();
            d4.ak(10167);
            d4.p("Re-enabling the hotword detector");
            this.q.d(cVar);
        }
    }

    public final void P() {
        com.google.android.apps.gsa.speech.p.a.a(Locale.getDefault().toLanguageTag(), this.b.a());
    }

    public final boolean Q() {
        at atVar = (at) this.j.a();
        if (atVar.h()) {
            ((bg) atVar.c()).l();
        }
        this.f.m(df.bx).contains(n());
        return false;
    }

    public final boolean R() {
        return false;
    }

    public final boolean S(com.google.android.apps.gsa.shared.speech.hotword.b.c cVar, String str) {
        com.google.android.apps.gsa.shared.speech.hotword.b.c cVar2 = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE;
        if (cVar == cVar2) {
            String ar = ar(cVar2, str);
            boolean z = true;
            if (ar != null) {
                z = true;
                if (this.f1614a.f1127a.d().contains(ar)) {
                    z = this.f1614a.f1127a.d().getBoolean(ar, true);
                }
            }
            com.google.common.f.h d = c.d();
            d.ak(10173);
            d.L("isModelTypeDspSupported-%b modelType-OK_HEY_GOOGLE locale-%s", z, str);
            return z;
        }
        com.google.android.apps.gsa.shared.speech.hotword.b.c cVar3 = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE;
        boolean z2 = false;
        if (cVar == cVar3) {
            String ar2 = ar(cVar3, str);
            z2 = false;
            if (ar2 != null) {
                z2 = this.f1614a.f1127a.d().getBoolean(ar2, true);
            }
            com.google.common.f.h d2 = c.d();
            d2.ak(10172);
            d2.L("isModelTypeDspSupported-%b modelType-OK_GOOGLE locale-%s", z2, str);
        }
        return z2;
    }

    public final boolean T() {
        return ((z) this.h.a()).u() && ao();
    }

    public final boolean U() {
        return ((z) this.h.a()).u() && ao();
    }

    public final boolean V() {
        return this.f1614a.f1127a.d().getBoolean("eyes_free_intro_tts_flow_started", false);
    }

    public final boolean W() {
        return this.t.c();
    }

    public final boolean X() {
        return this.t.c() && this.r.c() && this.q.a() == com.google.android.libraries.search.ai.f.ENROLLED;
    }

    public final boolean Y() {
        if (this.f.w(ef.p) && ((at) this.j.a()).h()) {
            ((bg) ((at) this.j.a()).c()).l();
        }
        return this.f1614a.f1127a.d().getBoolean("bluetoothHeadset", false);
    }

    public final boolean Z() {
        return this.f1614a.f1127a.d().getBoolean("audioLoggingEnabled", false);
    }

    public final int a(String str) {
        return this.f1614a.f1127a.d().getInt(String.format("adaptive_tts_%s", str), 0);
    }

    public final boolean aa() {
        return this.f1614a.f1127a.d().getBoolean("hotwordDetector", true);
    }

    public final boolean ab() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.d.getPackageManager();
        for (String str : com.google.android.apps.gsa.shared.util.p.b) {
            try {
                packageInfo = packageManager.getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException e) {
            }
            if (packageInfo != null) {
                return packageInfo.versionCode >= ((int) this.f.i(dj.aR));
            }
            continue;
        }
        return false;
    }

    public final boolean ac() {
        return this.f1614a.f1127a.d().getBoolean("hotword_navigation_requirement_met", false);
    }

    public final boolean ad() {
        return this.f1614a.f1127a.d().getBoolean("hotwordInNav", true);
    }

    public final boolean ae() {
        boolean z;
        synchronized (this) {
            z = this.f1614a.f1127a.d().getBoolean("headphone_lockscreen_personal_response", false);
        }
        return z;
    }

    public final boolean af() {
        boolean z;
        synchronized (this) {
            z = this.f1614a.f1127a.d().getBoolean("lockscreen_personal_response", false);
        }
        return z;
    }

    public final boolean ag() {
        boolean z;
        synchronized (this) {
            z = this.f1614a.f1127a.d().getBoolean("nonDspToDspMigration", false);
        }
        return z;
    }

    public final boolean ah() {
        return false;
    }

    public final boolean ai() {
        return true;
    }

    public final boolean aj() {
        return this.r.c();
    }

    public final boolean ak() {
        return this.f1614a.f1127a.d().getBoolean("undecidedStateBeforeMigration", false);
    }

    public final boolean al() {
        return this.f.w(az.dO) && this.f1614a.f1127a.d().getBoolean("user_profile_lang_speaker_id_model_transition_task", false);
    }

    public final boolean am() {
        if (this.t.c()) {
            com.google.common.f.h f = c.f();
            f.ak(10177);
            f.p("isAlwaysOnHotwordAvailable but still checking isVoiceEverywhereEnabled");
        }
        return !this.t.c() && this.q.a() == com.google.android.libraries.search.ai.f.ENROLLED && this.r.c();
    }

    public final boolean an() {
        return (X() || am()) && this.r.c();
    }

    final boolean ao() {
        boolean z;
        cn n = !this.f.w(az.fE) ? dl.n(com.google.android.apps.gsa.assistant.settings.features.x.b.b) : !this.o.h() ? dl.n(com.google.android.apps.gsa.assistant.settings.features.x.b.b) : ((com.google.android.apps.gsa.assistant.settings.features.x.a.j) this.o.c()).a();
        com.google.android.apps.gsa.shared.util.debug.b.d.a();
        try {
            z = !((com.google.android.apps.gsa.assistant.settings.features.x.b) n.get()).equals(com.google.android.apps.gsa.assistant.settings.features.x.b.b);
        } catch (InterruptedException e) {
            e = e;
            com.google.common.f.h g = c.f().g(e);
            g.ak(10180);
            g.p("#shouldAllowHeadsetQuerying assistantOnLockscreenFuture failed");
            z = false;
            return z;
        } catch (NullPointerException e2) {
            e = e2;
            com.google.common.f.h g2 = c.f().g(e);
            g2.ak(10180);
            g2.p("#shouldAllowHeadsetQuerying assistantOnLockscreenFuture failed");
            z = false;
            return z;
        } catch (CancellationException e3) {
            e = e3;
            com.google.common.f.h g22 = c.f().g(e);
            g22.ak(10180);
            g22.p("#shouldAllowHeadsetQuerying assistantOnLockscreenFuture failed");
            z = false;
            return z;
        } catch (ExecutionException e4) {
            e = e4;
            com.google.common.f.h g222 = c.f().g(e);
            g222.ak(10180);
            g222.p("#shouldAllowHeadsetQuerying assistantOnLockscreenFuture failed");
            z = false;
            return z;
        }
        return z;
    }

    public final byte[] ap() {
        byte[] d;
        synchronized (this) {
            d = this.r.d();
        }
        return d;
    }

    public final void aq(int i, com.google.android.libraries.search.ai.c.c cVar) {
        if (i - 1 != 0) {
            this.q.e(com.google.android.libraries.search.ai.f.DECLINED, cVar);
        } else {
            this.q.d(cVar);
        }
    }

    public final boolean as() {
        return this.r.c();
    }

    public final int b() {
        return this.f1614a.f1127a.d().getInt("languagePacksAutoUpdate", 2);
    }

    public final int c() {
        int i;
        synchronized (this) {
            i = this.f1614a.f1127a.d().getInt("lockscreen_personal_response_enable_status", 0);
        }
        return i;
    }

    public final long d(String str) {
        return this.f1614a.f1127a.d().getLong(String.format("last_adaptive_tts_time_%s", str), -1L);
    }

    public final long e() {
        return (int) this.f.i(df.be);
    }

    public final com.google.android.apps.gsa.shared.speech.hotword.b.c f() {
        return com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE;
    }

    public final SpeakerIdModel g(String str) {
        synchronized (this) {
            byte[] ap = ap();
            if (ap == null) {
                return null;
            }
            return new SpeakerIdModel(str, ap);
        }
    }

    public final com.google.android.libraries.search.ai.e h() {
        int ordinal = this.q.a().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return com.google.android.libraries.search.ai.e.c;
            }
            if (ordinal != 3) {
                return com.google.android.libraries.search.ai.e.a;
            }
        }
        return com.google.android.libraries.search.ai.e.b;
    }

    public final com.google.android.libraries.search.ai.f i() {
        return this.q.a();
    }

    public final fu j() {
        if (this.p.containsKey(com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE)) {
            return (fu) this.p.get(com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE);
        }
        fu a2 = ((com.google.android.apps.gsa.speech.hotword.b.a) this.g.a()).a();
        if (!a2.isEmpty()) {
            this.p.put(com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE, a2);
        }
        return a2;
    }

    public final ha k() {
        return l("");
    }

    public final ha l(String str) {
        String str2;
        String str3;
        gy gyVar = new gy();
        String s = this.f.s();
        if (s != null) {
            gyVar.h(s);
        }
        gyVar.j(((com.google.android.apps.gsa.search.core.aa.a.k) this.k.a()).c());
        com.google.android.apps.gsa.projection.g gVar = this.m;
        if (com.google.android.apps.gsa.projection.g.b(str)) {
            if (gVar.f1032a == null) {
                gVar.f1032a = com.google.android.apps.gsa.projection.g.a("com.google.android.projection.gearhead");
            }
            str2 = (String) gVar.f1032a.b();
        } else {
            str2 = "";
        }
        if (!cl.L(str2)) {
            gyVar.h(str2);
        }
        com.google.android.apps.gsa.projection.g gVar2 = this.m;
        if (com.google.android.apps.gsa.projection.g.b(str)) {
            if (gVar2.b == null) {
                gVar2.b = com.google.android.apps.gsa.projection.g.a("com.google.android.gms.car");
            }
            str3 = (String) gVar2.b.b();
        } else {
            str3 = "";
        }
        if (!cl.L(str3)) {
            gyVar.h(str3);
        }
        return gyVar.g();
    }

    public final Optional m() {
        Optional ofNullable;
        synchronized (this) {
            fu o = this.f.o(df.ba);
            ab abVar = (ab) this.n.a();
            at b = ((k) abVar.b).b();
            if (b.h()) {
                Object obj = abVar.a;
                ofNullable = Optional.ofNullable(((com.google.android.apps.gsa.shared.util.q.a) obj).g("assistant_settings_preferred_voice:".concat((String) b.c()), null));
            } else {
                ofNullable = Optional.empty();
            }
            if (ofNullable.isEmpty()) {
                return Optional.empty();
            }
            String str = (String) ofNullable.get();
            if (o.containsKey(str)) {
                return Optional.of((String) o.get(str));
            }
            return Optional.empty();
        }
    }

    public final String n() {
        return al() ? ((z) this.h.a()).b() : aa.a();
    }

    public final String o() {
        return n();
    }

    public final String p() {
        return this.f1614a.f1127a.d().getString("s3SandboxOverride", null);
    }

    public final String q() {
        return (String) this.s.b().f();
    }

    public final String r() {
        return "X Google";
    }

    public final String s() {
        return (String) this.e.a();
    }

    public final String t() {
        return this.f1614a.f1127a.d().getString("debugS3Server", "");
    }

    public final String u() {
        return n();
    }

    public final String v() {
        long serialNumberForUser = ((UserManager) this.d.getSystemService("user")).getSerialNumberForUser(UserHandleCompat.a().f1498a);
        long j = serialNumberForUser;
        if (serialNumberForUser == -1) {
            com.google.common.f.h f = c.f();
            f.ak(10155);
            f.p("User does not exist!");
            j = -1;
        }
        return String.valueOf(j);
    }

    @Deprecated
    public final String w() {
        return this.f.t(en.ao);
    }

    public final List x() {
        List list;
        synchronized (this) {
            String K = cl.K(q());
            Stream map = Collection._EL.stream(((t) this.i.a()).a(K)).filter(new d(((t) this.i.a()).c(K))).map(new e());
            int i = fl.e;
            list = (List) map.collect(bs.a);
        }
        return list;
    }

    public final List y() {
        ArrayList N = oo.N(1);
        N.add(this.b.a().c);
        Iterator it = this.f.u().iterator();
        while (it.hasNext()) {
            N.add(Integer.toString(((Integer) it.next()).intValue()));
        }
        Iterator it2 = this.f.g.f.iterator();
        while (it2.hasNext()) {
            N.add(Integer.toString(((Integer) it2.next()).intValue()));
        }
        return N;
    }

    public final Locale z() {
        return at();
    }
}
