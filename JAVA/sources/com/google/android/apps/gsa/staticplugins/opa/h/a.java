package com.google.android.apps.gsa.staticplugins.opa.h;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assist.a.k;
import com.google.android.apps.gsa.assistant.shared.w;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.o;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.ce;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.aq;
import com.google.android.apps.gsa.staticplugins.opa.util.ad;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/h/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final z f1767a;
    private final Context b;
    private final w c;
    private final p d;
    private final e.a e;
    private final e.a f;
    private final k g;
    private final ad h;

    public a(Context context, z zVar, w wVar, ad adVar, p pVar, e.a aVar, e.a aVar2, k kVar) {
        this.b = context;
        this.f1767a = zVar;
        this.c = wVar;
        this.h = adVar;
        this.d = pVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = kVar;
    }

    public final boolean a(Account account) {
        ab abVar = e.a;
        int f = f(account);
        return h(f) || f == 3;
    }

    public final boolean b() {
        if (((Boolean) this.e.a()).booleanValue() || !this.f1767a.u() || !this.f1767a.w() || !this.g.a() || !((o) this.f.a()).f()) {
            return false;
        }
        this.h.l();
        return true;
    }

    public final boolean c() {
        ab abVar = e.a;
        return this.f1767a.u();
    }

    public final boolean d() {
        return aq.a(this.b, UserHandleCompat.a());
    }

    public final int e(int i) {
        ab abVar = e.a;
        if (h(i)) {
            return 1;
        }
        this.f1767a.r();
        if (!this.f1767a.r() || i == 1) {
            return 2;
        }
        return this.d.w(dj.be) ? 1 : 3;
    }

    public final int f(Account account) {
        return g(account == null ? null : account.name);
    }

    public final int g(String str) {
        int i;
        if (!this.f1767a.u()) {
            ab abVar = e.a;
            return 1;
        }
        boolean w = this.f1767a.w();
        boolean c = str != null ? this.c.c(str) : false;
        if (str == null) {
            ab abVar2 = e.a;
        }
        ab abVar3 = e.a;
        if (c) {
            if (!w) {
                return 4;
            }
            i = 5;
        } else {
            if (!w) {
                return 2;
            }
            if (((Boolean) this.e.a()).booleanValue()) {
                i = 7;
            } else {
                if (this.d.w(az.dH) && this.h.h(str)) {
                    return 6;
                }
                i = 3;
            }
        }
        return i;
    }

    public final boolean h(int i) {
        boolean z;
        ab abVar = e.a;
        if (this.d.w(ce.f1423a) && i == 3) {
            i = 3;
            z = true;
        } else {
            z = false;
        }
        return i == 5 || z || i == 6 || i == 7;
    }

    public final boolean i() {
        ab abVar = e.a;
        if (d()) {
            return false;
        }
        return b();
    }
}
