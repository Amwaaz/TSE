package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.debug.j;
import com.google.android.libraries.gcoreclient.d.d;
import com.google.common.f.h;
import com.google.common.o.ge;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/e.class */
final class e extends com.google.android.apps.gsa.shared.util.c.aj {

    /* renamed from: a, reason: collision with root package name */
    final String f1108a;
    final Account b;
    final boolean c;
    final j d;
    final f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, Account account, boolean z, j jVar) {
        super("Get token with recovery intent", 1, 4);
        this.f1108a = str;
        this.b = account;
        this.c = z;
        this.d = jVar;
        this.e = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        m mVar;
        Account account = this.b;
        String str = this.f1108a;
        j jVar = this.d;
        if (account != null) {
            int i = 0;
            while (true) {
                if (i > 1) {
                    mVar = new m(ge.d, null);
                    break;
                }
                try {
                    try {
                        jVar.a("LoginHelperImpl: get token");
                        long uptimeMillis = SystemClock.uptimeMillis();
                        boolean z = this.c;
                        f fVar = this.e;
                        String b = z ? fVar.b.b(account, str, jVar) : fVar.b.c(account, str, jVar);
                        h d = f.f1109a.d();
                        d.ak(6964);
                        d.G("Successfully received auth token for scope: %s in time %d ms", str, SystemClock.uptimeMillis() - uptimeMillis);
                        m mVar2 = new m(b);
                        jVar.c();
                        mVar = mVar2;
                        break;
                    } catch (d e) {
                        h g = f.f1109a.f().g(e);
                        g.ak(6966);
                        g.s("User recoverable exception for scope: %s", str);
                        b.a(ge.b);
                        ge geVar = ge.b;
                        Intent intent = e.f2976a;
                        mVar = new m(geVar, intent == null ? null : new Intent(intent));
                        return mVar;
                    } catch (IOException e2) {
                        try {
                            h g2 = f.f1109a.f().g(e2);
                            g2.ak(6968);
                            g2.s("IO exception for scope: %s", str);
                            b.a(ge.d);
                            jVar.c();
                            i++;
                        } finally {
                            jVar.c();
                        }
                    }
                } catch (com.google.android.libraries.gcoreclient.d.e e3) {
                    h g3 = f.f1109a.f().g(e3);
                    g3.ak(6965);
                    g3.s("User recoverable exception for scope: %s", str);
                    b.a(ge.b);
                    mVar = new m(ge.b, null);
                    return mVar;
                } catch (com.google.android.libraries.gcoreclient.d.a e4) {
                    h g4 = f.f1109a.f().g(e4);
                    g4.ak(6967);
                    g4.s("Google auth exception for scope: %s", str);
                    b.a(ge.c);
                    mVar = new m(ge.c, null);
                    return mVar;
                }
            }
        } else {
            mVar = new m();
        }
        return mVar;
    }
}
