package com.google.android.apps.gsa.assistant.settings.shared;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.apps.tiktok.account.data.a.d;
import com.google.apps.tiktok.account.data.c.c;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import e.a;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/shared/f.class */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f254a = j.i("com.google.android.apps.gsa.assistant.settings.shared.f");
    public final a b;
    public final a c;
    public final a d;
    public final i e;
    private final a f;
    private final a g;
    private final a h;

    public f(a aVar, a aVar2, a aVar3, a aVar4, i iVar, a aVar5, a aVar6) {
        this.b = aVar;
        this.c = aVar2;
        this.f = aVar3;
        this.d = aVar4;
        this.e = iVar;
        this.g = aVar5;
        this.h = aVar6;
    }

    public final Account a() {
        Account l;
        if (h()) {
            an anVar = (an) this.c.a();
            String d = d();
            d.getClass();
            l = anVar.k(d);
        } else {
            l = ((an) this.c.a()).l();
        }
        return l;
    }

    public final cn b(String str) {
        return str == null ? ((c) this.h.a()).a() : ((d) this.g.a()).c(str);
    }

    public final String c() {
        Account a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.name;
    }

    public final String d() {
        return ((SharedPreferences) this.b.a()).getString("assistant_settings_account", null);
    }

    public final void e(String str, PreferenceScreen preferenceScreen) {
        Context context = ((Preference) preferenceScreen).j;
        PreferenceCategory preferenceCategory = new PreferenceCategory(context);
        preferenceCategory.O(2132086189);
        preferenceScreen.ah(preferenceCategory);
        Object obj = ((u) this.f.a()).a;
        context.getClass();
        g gVar = (g) obj;
        i iVar = (i) gVar.a.a();
        iVar.getClass();
        f fVar = (f) gVar.b.a();
        fVar.getClass();
        com.google.android.apps.gsa.shared.k.c cVar = (com.google.android.apps.gsa.shared.k.c) gVar.c.a();
        cVar.getClass();
        preferenceCategory.ah(new AvailabilityPreference(context, str, iVar, fVar, cVar));
    }

    public final void f(String str, ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        i iVar = this.e;
        ha c = iVar.c(str);
        gy gyVar = new gy();
        qj j = c.j();
        while (j.hasNext()) {
            com.google.g.ar.an anVar = (com.google.g.ar.an) j.next();
            if (anVar == com.google.g.ar.an.e) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(2131235902);
                arrayList.add(2131236078);
                gyVar.j(arrayList);
            } else {
                gyVar.h(Integer.valueOf(iVar.a(anVar, null)));
            }
        }
        qj j2 = gyVar.g().j();
        while (j2.hasNext()) {
            int intValue = ((Integer) j2.next()).intValue();
            Context context = viewGroup.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166596);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setImageResource(intValue);
            viewGroup.addView(imageView);
        }
    }

    public final boolean g(String str) {
        try {
            ((an) this.c.a()).C(str);
            return true;
        } catch (AccountsException e) {
            aus.d(f254a.e(), (char) 1368, e);
            return false;
        }
    }

    public final boolean h() {
        return d() != null;
    }
}
