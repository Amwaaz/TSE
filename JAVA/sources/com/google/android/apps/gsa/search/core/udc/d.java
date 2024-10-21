package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.o;
import com.google.android.apps.gsa.shared.k.ee;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.libraries.aj.a.b.a.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.base.at;
import com.google.common.f.j;
import com.google.common.o.hb;
import com.google.common.o.hs;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import e.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/udc/d.class */
public class d implements b {
    private static final j b = j.i("com.google.android.apps.gsa.search.core.udc.d");
    private static final fl c = fl.t(com.google.bn.b.a.b.b, com.google.bn.b.a.b.c, com.google.bn.b.a.b.d, com.google.bn.b.a.b.f, com.google.bn.b.a.b.g);

    /* renamed from: a, reason: collision with root package name */
    public final h f1319a;
    private final o d;
    private final a e;
    private final com.google.android.libraries.aj.a.b.a.d f;
    private final a g;
    private final Map h = new HashMap();

    public d(o oVar, a aVar, com.google.android.libraries.aj.a.b.a.d dVar, h hVar, a aVar2) {
        this.e = aVar;
        this.f = dVar;
        this.f1319a = hVar;
        this.g = aVar2;
        this.d = oVar;
    }

    public final c a(Account account) {
        return this.f.a(account);
    }

    public final void b(Account account) {
        if (this.h.containsKey(account)) {
            return;
        }
        this.h.put(account, this.f1319a.b("Ensure cached is loaded for account", new c(this, account, 0)));
    }

    public final boolean c(Account account, com.google.bn.b.a.b bVar) {
        if (account == null) {
            return false;
        }
        if (((p) this.e.a()).w(ee.l)) {
            try {
                com.google.common.f.h f = b.f();
                f.ak(8088);
                f.s("Calling isUserEligibleToConsent() on permission %s", bVar.name());
                cn g = a(account).g(bVar);
                com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                return ((Boolean) g.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                g(13);
                return false;
            }
        }
        if (((p) this.e.a()).w(ee.a)) {
            try {
                if (this.h.containsKey(account)) {
                    cn cnVar = (cn) this.h.get(account);
                    if (cnVar != null) {
                        com.google.android.apps.gsa.shared.o.a.a aVar2 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                        cnVar.get();
                    }
                    com.google.common.f.h d = b.d();
                    d.ak(8086);
                    d.s("isEligible(): ensureCachedSettingsLoaded() finished for permission %s", bVar.name());
                }
            } catch (InterruptedException | ExecutionException e2) {
                g(14);
                com.google.common.f.h f2 = b.f();
                f2.ak(8087);
                f2.s("isEligible(): ensureCachedSettingsLoaded() failed for permission %s", bVar.name());
            }
        }
        at b2 = a(account).b(bVar);
        if (!b2.h()) {
            g(5);
            b(account);
            com.google.common.f.h f3 = b.f();
            f3.ak(8085);
            f3.s("isEligible(): Absent status for permission %s. Calling ensureCachedSettingsLoaded().", bVar.name());
        }
        return ((Boolean) b2.e(true)).booleanValue();
    }

    public final boolean e(Account account, com.google.bn.b.a.b bVar) {
        if (((p) this.e.a()).w(ee.l)) {
            try {
                com.google.common.f.h f = b.f();
                f.ak(8092);
                f.s("Calling isDataRecordingEnabled() on permission %s", bVar.name());
                cn f2 = a(account).f(bVar);
                com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                return ((Boolean) f2.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                g(12);
                return false;
            }
        }
        if (((p) this.e.a()).w(ee.a)) {
            try {
                if (this.h.containsKey(account)) {
                    cn cnVar = (cn) this.h.get(account);
                    if (cnVar != null) {
                        com.google.android.apps.gsa.shared.o.a.a aVar2 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                        cnVar.get();
                    }
                    com.google.common.f.h d = b.d();
                    d.ak(8090);
                    d.s("isEnabled(): ensureCachedSettingsLoaded() finished for permission %s", bVar.name());
                }
            } catch (InterruptedException | ExecutionException e2) {
                com.google.common.f.h f3 = b.f();
                f3.ak(8091);
                f3.s("isEnabled(): ensureCachedSettingsLoaded() failed for permission %s", bVar.name());
                g(14);
            }
        }
        at a2 = a(account).a(bVar);
        if (!a2.h()) {
            g(4);
            com.google.common.f.h f4 = b.f();
            f4.ak(8089);
            f4.s("Absent status for permission %s. Calling ensureCachedSettingsLoaded().", bVar.name());
            b(account);
        }
        return ((Boolean) a2.e(false)).booleanValue();
    }

    public final boolean f() {
        return this.d.b() >= 19525000;
    }

    public final void g(int i) {
        if (((p) this.e.a()).w(ee.c)) {
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 1439;
            ba createBuilder2 = hs.a.createBuilder();
            createBuilder2.copyOnWrite();
            hs hsVar = createBuilder2.instance;
            hsVar.c = i - 1;
            hsVar.b |= 1;
            hs build = createBuilder2.build();
            createBuilder.copyOnWrite();
            hb hbVar2 = createBuilder.instance;
            build.getClass();
            hbVar2.bo = build;
            hbVar2.k |= 1048576;
            k.g(createBuilder.build(), null, null, null);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("FacsCacheProvider");
        Account l = ((an) this.g.a()).l();
        if (l == null) {
            fVar.b("account").a(new com.google.android.apps.gsa.shared.util.b.d("No Account", false));
            return;
        }
        fVar.b("account").a(new com.google.android.apps.gsa.shared.util.b.d(new com.google.android.apps.gsa.shared.util.b.b(l.name), false));
        ni niVar = c;
        int i = niVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            com.google.bn.b.a.b bVar = (com.google.bn.b.a.b) niVar.get(i2);
            boolean e = e(l, bVar);
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            fVar.b(bVar.name()).a(new com.google.android.apps.gsa.shared.util.b.d(sb.toString() + "[Eligibility = " + c(l, bVar) + "]", false));
        }
    }
}
