package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.apps.gsa.speech.helper.a.b;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.gy;
import com.google.common.b.oo;
import com.google.common.f.j;
import com.google.common.o.ge;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/f.class */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1109a = j.i("com.google.android.apps.gsa.search.core.google.gaia.f");
    public final k b;
    private final k.a.a c;
    private final e.a d;
    private final h e;
    private final com.google.android.apps.gsa.shared.util.c.a.an f;

    public f(k.a.a aVar, k kVar, e.a aVar2, com.google.android.apps.gsa.shared.util.c.a.an anVar, h hVar) {
        this.c = aVar;
        this.b = kVar;
        this.d = aVar2;
        this.f = anVar;
        this.e = hVar;
    }

    private final List k(String str, com.google.android.apps.gsa.shared.util.debug.j jVar, boolean z) {
        com.google.android.apps.gsa.shared.util.debug.j jVar2;
        Account[] l = l();
        ArrayList arrayList = new ArrayList();
        for (Account account : l) {
            synchronized (jVar.f1556a) {
                if (jVar.b == null) {
                    jVar.b = oo.M(1);
                }
                jVar2 = new com.google.android.apps.gsa.shared.util.debug.j();
                jVar.b.add(jVar2);
            }
            arrayList.add(d(str, account, jVar2, z));
        }
        return arrayList;
    }

    private final Account[] l() {
        return ((an) this.c.a()).A();
    }

    private static final Object m(Future future, Duration duration, boolean z, com.google.android.apps.gsa.shared.util.debug.j jVar, e.a aVar) {
        try {
            return ag.h(future, duration);
        } catch (InterruptedException e) {
            a.a.dB(f1109a.f(), "InterruptedException while waiting for token.", (char) 6969, e);
            b.a(ge.f);
            if (!z) {
                return null;
            }
            future.cancel(true);
            return null;
        } catch (ExecutionException e2) {
            a.a.dB(f1109a.f(), "ExecutionException while waiting for token.", (char) 6970, e2);
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
            ((com.google.android.apps.gsa.shared.logger.e) aVar.a()).c(null, 10070063);
            return null;
        } catch (TimeoutException e3) {
            b.a(ge.e);
            a.a.dB(f1109a.f(), "TimeoutException while waiting for token.", (char) 6971, e3);
            com.google.android.apps.gsa.shared.util.debug.a.f f = com.google.android.apps.gsa.shared.util.debug.a.f.f(1L);
            jVar.b(f, SystemClock.elapsedRealtime());
            com.google.common.f.h f2 = f1109a.f();
            f2.ak(6972);
            f2.s("%s", f);
            if (!z) {
                return null;
            }
            future.cancel(true);
            return null;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final cn a(String str, long j) {
        fl o;
        List k;
        com.google.android.apps.gsa.shared.util.debug.j jVar = new com.google.android.apps.gsa.shared.util.debug.j();
        synchronized (this) {
            o = fl.o(l());
            k = k(str, jVar, true);
        }
        return com.google.common.util.concurrent.i.g(ag.e(dl.t(k), Duration.ofMillis(j), this.e), new o(o, 1), ay.a);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final cn b(String str, Account account, com.google.android.apps.gsa.shared.util.debug.j jVar) {
        return d(str, account, jVar, true);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final cn c(String str, Account account, boolean z, com.google.android.apps.gsa.shared.util.debug.j jVar) {
        return this.f.c(new e(this, str, account, z, jVar));
    }

    public final cn d(String str, Account account, com.google.android.apps.gsa.shared.util.debug.j jVar, boolean z) {
        cn g = com.google.common.util.concurrent.i.g(c(str, account, z, jVar), new d(), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return g;
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final String e(String str, long j) {
        return f(((an) this.c.a()).l(), str, j);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final String f(Account account, String str, long j) {
        com.google.android.apps.gsa.shared.util.b.f.d();
        if (account == null) {
            return null;
        }
        com.google.android.apps.gsa.shared.util.debug.j jVar = new com.google.android.apps.gsa.shared.util.debug.j();
        return (String) m(d(str, account, jVar, true), Duration.ofMillis(j), true, jVar, this.d);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final Set g(String str, long j) {
        return h(str, j, true);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final Set h(String str, long j, boolean z) {
        fl o;
        List k;
        com.google.android.apps.gsa.shared.util.b.f.d();
        com.google.android.apps.gsa.shared.util.debug.j jVar = new com.google.android.apps.gsa.shared.util.debug.j();
        synchronized (this) {
            o = fl.o(l());
            k = k(str, jVar, z);
        }
        m(dl.t(k), Duration.ofMillis(j), false, jVar, this.d);
        gy gyVar = new gy();
        for (int i = 0; i < k.size(); i++) {
            cn cnVar = (cn) k.get(i);
            String str2 = null;
            if (cnVar.isDone()) {
                str2 = null;
                if (!cnVar.isCancelled()) {
                    try {
                        str2 = (String) dl.w(cnVar);
                    } catch (ExecutionException e) {
                        a.a.dB(f1109a.e(), "Token future has unexpectedly thrown exception.", (char) 6973, e);
                        str2 = null;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                ba createBuilder = b.a.createBuilder();
                String str3 = ((Account) o.get(i)).name;
                createBuilder.copyOnWrite();
                b bVar = createBuilder.instance;
                str3.getClass();
                bVar.b |= 1;
                bVar.c = str3;
                createBuilder.copyOnWrite();
                b bVar2 = createBuilder.instance;
                str2.getClass();
                bVar2.b |= 2;
                bVar2.d = str2;
                gyVar.h(createBuilder.build());
            }
        }
        return gyVar.g();
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final void i(String str) {
        this.b.a(str);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final void j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i(((b) it.next()).d);
        }
    }
}
