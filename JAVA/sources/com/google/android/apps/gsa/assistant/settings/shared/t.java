package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.bw;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.k.cl;
import com.google.android.apps.gsa.staticplugins.opa.fv;
import com.google.android.libraries.gsa.h.h;
import com.google.android.play.core.f.q;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nr;
import com.google.common.b.qj;
import com.google.common.base.at;
import com.google.common.base.bd;
import com.google.common.f.a.e;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import e.a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/shared/t.class */
public class t {
    private static final j d = j.i("com.google.android.apps.gsa.assistant.settings.shared.t");

    /* renamed from: a, reason: collision with root package name */
    public final Context f257a;
    public final a b;
    public final a c;
    private final a e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final h j;
    private final at k;
    private final Executor l;

    public t(Context context, a aVar, Executor executor, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, at atVar, a aVar7, h hVar) {
        this.f257a = context;
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = aVar4;
        this.i = aVar5;
        this.b = aVar6;
        this.j = hVar;
        this.k = atVar;
        this.c = aVar7;
        this.l = executor;
    }

    public final fl a(String str) {
        Set<String> stringSet = ((SharedPreferences) this.e.a()).getStringSet("opa_preferred_languages:".concat(String.valueOf(str)), nr.a);
        if (stringSet == null) {
            com.google.common.f.h f = d.f();
            f.ak(1373);
            f.p("Can not access the SharedPreference to get Assistant preferred languages");
            int i = fl.e;
            return ni.a;
        }
        ha o = ha.o(stringSet);
        fg fgVar = new fg(4);
        qj j = o.j();
        while (j.hasNext()) {
            fgVar.h(Locale.forLanguageTag((String) j.next()));
        }
        return fgVar.g();
    }

    public final List b() {
        if (((c) this.f.a()).w(cl.w)) {
            return ((c) this.f.a()).m(cl.d);
        }
        fl m = ((c) this.f.a()).m(bw.b);
        fl flVar = m;
        if (m.isEmpty()) {
            flVar = ((c) this.f.a()).m(az.hC);
        }
        return flVar;
    }

    public final Locale c(String str) {
        String string = ((SharedPreferences) this.e.a()).getString("language_settings_primary_assistant_language:".concat(String.valueOf(str)), null);
        return (string == null || string.isEmpty()) ? Locale.getDefault() : Locale.forLanguageTag(string);
    }

    public final void d(String str, List list) {
        gy gyVar = new gy();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gyVar.h(((Locale) it.next()).toLanguageTag());
        }
        SharedPreferences.Editor edit = ((SharedPreferences) this.e.a()).edit();
        String valueOf = String.valueOf(str);
        edit.putStringSet("opa_preferred_languages:".concat(valueOf), gyVar.g()).apply();
        cn a2 = ((com.google.android.apps.search.assistant.platform.g.k.a.j) this.c.a()).a(this.f257a, str);
        r rVar = new r(this, list, str, 0);
        com.google.common.util.concurrent.i.g(a2, ex.b(rVar), this.l);
    }

    public final void e(String str, Locale locale) {
        Locale c = c(str);
        ((SharedPreferences) this.e.a()).edit().putString("language_settings_primary_assistant_language:".concat(String.valueOf(str)), locale.toLanguageTag()).apply();
        com.google.common.util.concurrent.i.g(((com.google.android.apps.search.assistant.platform.g.k.a.j) this.c.a()).b(this.f257a, str), ex.b(new r(this, locale, str, 1)), this.l);
        if (!c.equals(locale)) {
            this.j.n("Notify listeners about changed language", new q(this, str));
        }
        if (((c) this.f.a()).w(az.cq) && com.google.common.base.cl.K(str).equals(((an) this.g.a()).r())) {
            if (!c.equals(locale)) {
                ((z) this.h.a()).c(this.f257a);
                ((com.google.android.apps.gsa.configuration.a) this.i.a()).a();
            }
            bd bdVar = this.k;
            com.google.common.f.h d2 = fv.f1765a.d();
            d2.aj(e.a, "OpaLanguageSplitter");
            com.google.common.f.h hVar = d2;
            hVar.ak(15976);
            hVar.H("#onLanguageChange before: %s after: %s.", c, locale);
            fv fvVar = (fv) bdVar.a;
            fvVar.a(locale);
            if (c.getLanguage().equals(Locale.getDefault().getLanguage())) {
                com.google.common.f.h d3 = fv.f1765a.d();
                d3.aj(e.a, "OpaLanguageSplitter");
                com.google.common.f.h hVar2 = d3;
                hVar2.ak(15981);
                hVar2.p("isLanguageInUse: true because of same language code of device language.");
                return;
            }
            for (String str2 : ((an) fvVar.b.a()).B()) {
                if (c.getLanguage().equals(((t) fvVar.c.a()).c(str2).getLanguage())) {
                    com.google.common.f.h d4 = fv.f1765a.d();
                    d4.aj(e.a, "OpaLanguageSplitter");
                    com.google.common.f.h hVar3 = d4;
                    hVar3.ak(15980);
                    hVar3.p("isLanguageInUse: true because other accounts use it.");
                    return;
                }
            }
            com.google.common.f.h d5 = fv.f1765a.d();
            d5.aj(e.a, "OpaLanguageSplitter");
            com.google.common.f.h hVar4 = d5;
            hVar4.ak(15979);
            hVar4.p("isLanguageInUse: false");
            com.google.common.f.h d6 = fv.f1765a.d();
            d6.aj(e.a, "OpaLanguageSplitter");
            com.google.common.f.h hVar5 = d6;
            hVar5.ak(15978);
            hVar5.s("schedule language deferred uninstallation %s", c);
            q qVar = fvVar.d;
            c.getClass();
            qVar.c(fl.p(c));
        }
    }

    public final boolean f(Locale locale) {
        return ((fv) this.k.a).b(locale);
    }
}
