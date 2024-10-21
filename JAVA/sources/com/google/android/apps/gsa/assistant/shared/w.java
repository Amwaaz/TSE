package com.google.android.apps.gsa.assistant.shared;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.search.assistant.platform.g.l.a.f;
import com.google.android.apps.search.assistant.platform.g.l.a.g;
import com.google.android.apps.search.assistant.platform.g.l.a.k;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/w.class */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f284a;
    public final a b;
    private final com.google.android.libraries.g.a c;

    public w(SharedPreferences sharedPreferences, com.google.android.libraries.g.a aVar, a aVar2) {
        this.f284a = sharedPreferences;
        this.c = aVar;
        this.b = aVar2;
    }

    public static String a(String str) {
        return "opa_last_udc_consent".concat(String.valueOf(str));
    }

    public final void b(Account account) {
        long a2 = this.c.a();
        this.f284a.edit().putLong(a(account.name), a2).apply();
        k kVar = (k) this.b.a();
        cn c = kVar.c.c(account.name);
        f fVar = new f(kVar, a2);
        cn h = i.h(c, ex.e(fVar), kVar.d);
        g gVar = new g(kVar, a2);
        dl.y(h, ex.h(gVar), kVar.d);
    }

    public final boolean c(String str) {
        return (this.f284a.getLong(a(str), -100L) == -100 || this.f284a.getBoolean("opa_upgrade_show_value_prop", false)) ? false : true;
    }
}
