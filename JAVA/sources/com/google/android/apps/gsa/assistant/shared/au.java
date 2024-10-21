package com.google.android.apps.gsa.assistant.shared;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.common.n.c.l;
import com.google.common.n.c.r;
import com.google.common.util.concurrent.cn;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/au.class */
public class au {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f263a = com.google.common.f.j.i("com.google.android.apps.gsa.assistant.shared.au");
    public final SharedPreferences b;
    public final an c;
    private final com.google.android.libraries.gsa.h.h d;

    public au(SharedPreferences sharedPreferences, an anVar, com.google.android.libraries.gsa.h.h hVar) {
        this.b = sharedPreferences;
        this.c = anVar;
        this.d = hVar;
    }

    public static String d(String str, Account account) {
        return String.format(str, account.name);
    }

    private final void h(Account account) {
        String str = account.name;
        this.d.m(this.c.m(account, "uca"), "Get Unicorn Status", new as(this, account, 1));
        this.d.m(this.c.m(account, "usm"), "Get Supervised Status", new as(this, account, 0));
        this.d.m(c(account, 0, 1, 2), "Update Cached SupervisedAccountTypes", new at());
    }

    public final int a(Account account) {
        int i = this.b.getInt(d("opa_supervised_status_%s", account), 0);
        String str = account.name;
        if (i != 0) {
            return i;
        }
        h(account);
        return 0;
    }

    public final int b(Account account) {
        int i = this.b.getInt(d("opa_unicorn_status_%s", account), 0);
        String str = account.name;
        if (i != 0) {
            return i;
        }
        h(account);
        return 0;
    }

    public final cn c(Account account, int... iArr) {
        return this.d.f(this.d.k(ag.c(this.d, "isAccountOneOf retryWrapper", new ap(this, iArr, account), new l(r.e(Duration.ofMillis(250L)), 2.0d, 5)), "isAccountOneOf transform", new aq(this, iArr, account)), "isAccountOneOf catching", Exception.class, new ar(this, iArr, account));
    }

    public final void e() {
        for (Account account : this.c.A()) {
            h(account);
        }
    }

    public final boolean f(Account account) {
        return a(account) == 1;
    }

    public final boolean g(Account account) {
        return b(account) == 1;
    }
}
