package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.o;
import com.google.android.apps.gsa.shared.util.debug.j;
import com.google.android.libraries.gcoreclient.d.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/i.class */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    private final k f1110a;
    private final k b;
    private final Object c = new Object();
    private k d;

    public i(k kVar, k kVar2, o oVar, z zVar) {
        this.f1110a = kVar;
        this.b = kVar2;
        if (zVar.o()) {
            f(kVar2);
            return;
        }
        oVar.c(new h(this));
        new com.google.android.apps.gsa.search.core.l(oVar, oVar.c, new g(this)).d(new Void[0]);
    }

    private final k e() {
        k kVar;
        synchronized (this.c) {
            kVar = this.d;
        }
        return kVar;
    }

    private final void f(k kVar) {
        synchronized (this.c) {
            this.d = kVar;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final void a(String str) {
        k e = e();
        if (e != null) {
            e.a(str);
        } else {
            this.f1110a.a(str);
            this.b.a(str);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final String b(Account account, String str, j jVar) {
        k e = e();
        if (e != null) {
            try {
                jVar.a("FallingBackGoogleAuthAdapter: try chosen adapter");
                return e.b(account, str, jVar);
            } finally {
            }
        }
        try {
            try {
                jVar.a("FallingBackGoogleAuthAdapter: try GMS core");
                return this.f1110a.b(account, str, jVar);
            } catch (com.google.android.libraries.gcoreclient.d.e e2) {
                try {
                    jVar.a("FallingBackGoogleAuthAdapter: try account manager");
                    return this.b.b(account, str, jVar);
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final String c(Account account, String str, j jVar) {
        k e = e();
        if (e != null) {
            try {
                jVar.a("FallingBackGoogleAuthAdapter: try chosen adapter");
                return e.c(account, str, jVar);
            } finally {
            }
        }
        try {
            try {
                jVar.a("FallingBackGoogleAuthAdapter: try GMS core");
                return this.f1110a.c(account, str, jVar);
            } catch (d e2) {
                try {
                    jVar.a("FallingBackGoogleAuthAdapter: try account manager");
                    return this.b.c(account, str, jVar);
                } finally {
                }
            }
        } finally {
        }
    }

    public final void d(int i) {
        if (i != 0) {
            f(this.b);
        } else {
            f(this.f1110a);
        }
    }
}
