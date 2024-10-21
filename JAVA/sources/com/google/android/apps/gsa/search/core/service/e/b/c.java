package com.google.android.apps.gsa.search.core.service.e.b;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.service.e.b;
import com.google.android.apps.gsa.shared.k.eg;
import com.google.android.apps.gsa.shared.util.c.a.an;
import com.google.android.apps.gsa.shared.util.debug.a.a;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.oo;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/b/c.class */
public class c implements a {
    private static final j b = j.i("com.google.android.apps.gsa.search.core.service.e.b.c");
    private final fu c;
    private final com.google.android.libraries.g.a d;
    private final p e;
    private final e.a f;
    private final an h;

    /* renamed from: a, reason: collision with root package name */
    public final Set f1185a = oo.j();
    private b g = new b(com.google.android.apps.gsa.search.core.service.e.a.IDLE, 0);

    public c(an anVar, com.google.android.libraries.g.a aVar, p pVar, e.a aVar2) {
        this.h = anVar;
        this.d = aVar;
        this.e = pVar;
        fu o = pVar.o(eg.b);
        fq fqVar = new fq(4);
        for (Map.Entry entry : o.entrySet()) {
            try {
                com.google.android.apps.gsa.search.core.service.e.a aVar3 = (com.google.android.apps.gsa.search.core.service.e.a) Enum.valueOf(com.google.android.apps.gsa.search.core.service.e.a.class, (String) entry.getKey());
                Long decode = Long.decode((String) entry.getValue());
                decode.longValue();
                fqVar.i(aVar3, decode);
            } catch (IllegalArgumentException e) {
                h e2 = b.e();
                e2.aj(com.google.common.f.a.e.a, "UserAdvocateImpl");
                h hVar = e2;
                hVar.ak(7384);
                hVar.s("Invalid UserScenario: %s", entry.getKey());
            }
        }
        this.c = fqVar.h(false);
        this.f = aVar2;
    }

    private final b e() {
        b bVar;
        synchronized (this) {
            bVar = ((e) this.f.a()).b.f1188a;
            ab abVar = com.google.common.f.a.e.a;
        }
        return bVar;
    }

    private final void f(b bVar) {
        synchronized (this) {
            fu fuVar = this.c;
            com.google.android.apps.gsa.search.core.service.e.a aVar = bVar.f1184a;
            long longValue = fuVar.containsKey(aVar) ? ((Long) this.c.get(aVar)).longValue() : aVar.h;
            an anVar = this.h;
            a aVar2 = new a(this, bVar);
            Long.valueOf(longValue).getClass();
            anVar.b(aVar2, longValue);
        }
    }

    private final void g(b bVar) {
        synchronized (this) {
            if (!this.g.equals(bVar)) {
                ab abVar = com.google.common.f.a.e.a;
                this.g = bVar;
                this.h.d(new b(this, "Notify listeners for the change in UserScenario, new scenario = ".concat(bVar.f1184a.toString())));
                if (bVar.f1184a != com.google.android.apps.gsa.search.core.service.e.a.IDLE) {
                    f(bVar);
                }
            }
        }
    }

    public final com.google.android.apps.gsa.search.core.service.e.a a() {
        com.google.android.apps.gsa.search.core.service.e.a aVar;
        synchronized (this) {
            c();
            aVar = this.g.f1184a;
        }
        return aVar;
    }

    public final void b(b bVar) {
        synchronized (this) {
            if (this.g.equals(bVar)) {
                ab abVar = com.google.common.f.a.e.a;
                g(new b(com.google.android.apps.gsa.search.core.service.e.a.IDLE, this.d.a()));
            }
        }
    }

    public final void c() {
        synchronized (this) {
            b e = e();
            if (e.b > this.g.b) {
                g(e);
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("UserAdvocateImpl");
        synchronized (this) {
            fVar.b("mCurrentUserScenarioChange").a(new com.google.android.apps.gsa.shared.util.b.d(this.g, false));
        }
    }
}
