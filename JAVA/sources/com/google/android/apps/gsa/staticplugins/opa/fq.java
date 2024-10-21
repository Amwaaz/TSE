package com.google.android.apps.gsa.staticplugins.opa;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.al;
import androidx.core.app.k;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.ac.t;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.c;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.y.b;
import com.google.android.apps.gsa.staticplugins.bq.m;
import com.google.android.apps.gsa.staticplugins.opa.setupwizard.d;
import com.google.android.apps.gsa.staticplugins.opa.util.bf;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import java.util.Locale;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/fq.class */
public final class fq implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1764a;
    private final a b;
    private final e.a c;
    private final e.a d;
    private final e.a e;
    private final e.a f;
    private final e.a g;
    private final e.a h;

    public fq(Context context, a aVar, e.a aVar2, e.a aVar3, e.a aVar4, e.a aVar5, e.a aVar6, e.a aVar7) {
        this.f1764a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.g = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.h = aVar7;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, i iVar) {
        Account l;
        Account l2;
        Locale c;
        boolean isDeviceLocked = ((t) this.h.a()).b.isDeviceLocked();
        ab abVar = e.a;
        if (isDeviceLocked) {
            return;
        }
        ((z) this.b.a()).e(this.f1764a);
        if (((at) this.c.a()).h()) {
            ((d) ((at) this.c.a()).c()).a();
        }
        if (!pVar.w(br.A)) {
            an anVar = (an) this.d.a();
            com.google.android.apps.gsa.assistant.settings.shared.t tVar = (com.google.android.apps.gsa.assistant.settings.shared.t) this.f.a();
            SharedPreferences sharedPreferences = (SharedPreferences) this.e.a();
            m mVar = (m) this.g.a();
            if (!pVar.w(br.A) && sharedPreferences.contains("opa_fre_language_picker_user_selection") && (l2 = anVar.l()) != null && (c = tVar.c(l2.name)) != null) {
                String languageTag = c.toLanguageTag();
                String string = sharedPreferences.getString("opa_fre_language_picker_user_selection", "");
                sharedPreferences.edit().remove("opa_fre_language_picker_user_selection").remove("opa_fre_language_picker_shown").remove("opa_fre_language_picker_dismiss_count").remove("opa_fre_language_picker_phone_language_supported_shown").remove("opa_fre_language_picker_phone_language_supported_notification_sent").apply();
                if (TextUtils.equals(languageTag, string)) {
                    bf.e(tVar, mVar, l2, Locale.getDefault().toLanguageTag());
                }
            }
        }
        if (pVar.w(br.by)) {
            an anVar2 = (an) this.d.a();
            com.google.android.apps.gsa.assistant.settings.shared.t tVar2 = (com.google.android.apps.gsa.assistant.settings.shared.t) this.f.a();
            SharedPreferences sharedPreferences2 = (SharedPreferences) this.e.a();
            Context context = this.f1764a;
            if (!pVar.w(br.by) || (l = anVar2.l()) == null || sharedPreferences2.getBoolean("opa_fre_language_picker_phone_language_supported_notification_sent", false)) {
                return;
            }
            String string2 = sharedPreferences2.getString("opa_fre_language_picker_user_selection", "");
            if (cl.L(string2)) {
                return;
            }
            String languageTag2 = tVar2.c(l.name).toLanguageTag();
            if (!string2.equals(languageTag2) || sharedPreferences2.getBoolean("opa_fre_language_picker_phone_language_supported_shown", false)) {
                return;
            }
            String languageTag3 = Locale.getDefault().toLanguageTag();
            if (languageTag3.equals(languageTag2) || !bf.d(languageTag3, pVar)) {
                return;
            }
            String languageTag4 = Locale.getDefault().toLanguageTag();
            PendingIntent service = PendingIntent.getService(context, 0, new Intent().setClassName(context, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 256), 335544320);
            k a2 = b.a(context, (String) null);
            a2.L.icon = 2131233348;
            a2.B = context.getResources().getColor(2131103315);
            a2.C = 1;
            a2.d(16, true);
            a2.e = k.c(context.getResources().getString(2132093980));
            a2.f = k.c(context.getResources().getString(2132093978, Locale.forLanguageTag(languageTag4).getDisplayName()));
            androidx.core.app.i iVar2 = new androidx.core.app.i();
            iVar2.a = k.c(context.getResources().getString(2132093979, Locale.forLanguageTag(languageTag4).getDisplayName()));
            a2.l(iVar2);
            a2.k = 0;
            a2.g = service;
            a2.d(16, true);
            new al(context).a(null, com.google.android.apps.gsa.shared.y.a.OPA_FRE_LANGUAGE_NOW_SUPPORTED.aF, a2.a());
            sharedPreferences2.edit().putBoolean("opa_fre_language_picker_phone_language_supported_notification_sent", true).apply();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(p pVar) {
        a(pVar, i.f1123a);
    }
}
