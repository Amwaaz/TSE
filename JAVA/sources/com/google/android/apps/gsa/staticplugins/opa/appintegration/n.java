package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.text.TextUtils;
import androidx.lifecycle.an;
import androidx.lifecycle.as;
import com.google.android.apps.gsa.assistant.shared.c;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.r;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.libraries.assistant.d.c.c.q;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import e.a;
import j$.util.Optional;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/appintegration/n.class */
public class n implements u, c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1761a = j.i("com.google.android.apps.gsa.staticplugins.opa.appintegration.n");
    private static final fu b;
    private final a c;
    private final p d;
    private final com.google.android.apps.gsa.search.core.h.p e;
    private final com.google.android.apps.gsa.search.core.j.a f;
    private final k.a.a g;
    private final as h = new as();
    private final as i = new as();
    private final as j = new as();
    private final as k = new as();

    static {
        fq fqVar = new fq(4);
        fqVar.i("com.google.android.apps.gmm.dev", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        fqVar.i("com.google.android.apps.gmm.car", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        fqVar.i("com.google.android.apps.gmm.fishfood", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        fqVar.i("com.google.android.apps.gmm", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        fqVar.i("com.google.android.apps.gmm.qp", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        fqVar.i("com.google.android.apps.maps", "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK");
        fqVar.i("com.google.android.apps.messaging", "com.google.android.googlequicksearchbox.NEXUS_OPA_AM_FEEDBACK");
        fqVar.i("com.google.android.inputmethod.latin.dev", "com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
        fqVar.i("com.google.android.inputmethod.latin.canary", "com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
        fqVar.i("com.google.android.inputmethod.latin", "com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK");
        b = fqVar.h(false);
    }

    public n(a aVar, p pVar, com.google.android.apps.gsa.search.core.h.p pVar2, com.google.android.apps.gsa.search.core.j.a aVar2, k.a.a aVar3) {
        this.c = aVar;
        this.d = pVar;
        this.e = pVar2;
        this.f = aVar2;
        this.g = aVar3;
    }

    private final boolean w() {
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        String a2 = this.f.b.a();
        if (!TextUtils.isEmpty(a2) && a2.equals(l())) {
            ab abVar = com.google.common.f.a.e.a;
            return true;
        }
        ab abVar2 = com.google.common.f.a.e.a;
        l();
        return false;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final an a() {
        return this.i;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final an b() {
        return this.j;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final an c() {
        return this.h;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final an d() {
        return this.k;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final void e(String str) {
        this.i.i(str);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final void f(com.google.android.libraries.assistant.d.b.d dVar) {
        this.j.i(dVar);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final void g(com.google.android.apps.gsa.assistant.shared.b bVar) {
        this.h.i(bVar);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.c
    public final void h(com.google.android.libraries.assistant.d.b.e eVar) {
        this.k.i(eVar);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final int i(String str) {
        if (!str.equals(l())) {
            return 0;
        }
        if (com.google.android.apps.gsa.shared.util.p.f.contains(str)) {
            return 6;
        }
        return "com.google.android.apps.chromecast.app".equals(str) ? 7 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r6 == 2) goto L17;
     */
    @Override // com.google.android.apps.gsa.assistant.shared.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.gsa.shared.search.Query j(com.google.android.apps.gsa.shared.search.Query r5) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.w()
            if (r0 != 0) goto Ld
            r0 = r5
            r9 = r0
            goto L76
        Ld:
            r0 = r4
            e.a r0 = r0.c
            java.lang.Object r0 = r0.a()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.o r0 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.o) r0
            com.google.android.apps.gsa.assistant.shared.k.a r0 = r0.a()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.c
            r10 = r0
            r0 = r8
            com.google.android.libraries.assistant.d.c.c.q r0 = r0.d
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L3a
            com.google.android.libraries.assistant.d.c.c.q r0 = com.google.android.libraries.assistant.d.c.c.q.a
            r8 = r0
        L3a:
            r0 = r5
            r9 = r0
            r0 = r4
            r1 = r10
            r2 = r8
            boolean r0 = r0.t(r1, r2)
            if (r0 == 0) goto L76
            r0 = r8
            int r0 = r0.c
            int r0 = a.a.dm(r0)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L59
            r0 = 1
            r6 = r0
        L59:
            int r6 = r6 + (-1)
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L69
            r0 = r5
            r9 = r0
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L76
        L69:
            r0 = r5
            r1 = 1
            com.google.android.apps.gsa.shared.search.Query r0 = r0.J(r1)
            java.lang.String r1 = "android.opa.extra.MINI_PLATE_ENABLED"
            r2 = 1
            com.google.android.apps.gsa.shared.search.Query r0 = r0.X(r1, r2)
            r9 = r0
        L76:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appintegration.n.j(com.google.android.apps.gsa.shared.search.Query):com.google.android.apps.gsa.shared.search.Query");
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final q k(String str) {
        if (o(str)) {
            q qVar = ((o) this.c.a()).a().d;
            q qVar2 = qVar;
            if (qVar == null) {
                qVar2 = q.a;
            }
            return qVar2;
        }
        h d = f1761a.d();
        d.aj(com.google.common.f.a.e.a, "OpaAppIntegStatusHelper");
        h hVar = d;
        hVar.ak(16467);
        hVar.s("No voice plate params for %s", str);
        return null;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final String l() {
        return ((o) this.c.a()).a().c;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final void m(String str, q qVar, com.google.android.apps.gsa.search.shared.g.d dVar) {
        String P = com.google.android.apps.gsa.search.shared.g.e.P(dVar.a());
        if (P != null && this.e.w(az.bd) && (com.google.android.libraries.search.t.h.j.aE.a().equals(P) || com.google.android.libraries.search.t.h.j.at.a().equals(P) || com.google.android.libraries.search.t.h.j.aA.a().equals(P))) {
            return;
        }
        int dm = a.a.dm(qVar.c);
        int i = dm;
        if (dm == 0) {
            i = 1;
        }
        if (i == 2 || i == 3) {
            dVar.E = true;
            dVar.N = 268730368;
        }
        if (i == 3) {
            dVar.Z = 1;
        }
        int i2 = qVar.b;
        if ((i2 & 2) != 0) {
            dVar.ab = qVar.d;
        }
        if ((i2 & 4) != 0) {
            ArrayList arrayList = new ArrayList();
            com.google.android.libraries.assistant.d.c.c.p pVar = qVar.e;
            com.google.android.libraries.assistant.d.c.c.p pVar2 = pVar;
            if (pVar == null) {
                pVar2 = com.google.android.libraries.assistant.d.c.c.p.a;
            }
            arrayList.addAll(pVar2.b);
            if (!arrayList.isEmpty()) {
                dVar.ag = arrayList;
            }
        }
        if ((qVar.b & 32) != 0) {
            dVar.y = qVar.h;
        }
        if ("com.google.android.apps.chromecast.app".equals(str)) {
            dVar.c = 7;
            dVar.N = 268730368;
        } else if (com.google.android.apps.gsa.shared.util.p.f.contains(str)) {
            if (i == 2 || i == 3) {
                dVar.z = false;
                dVar.A = false;
            }
            dVar.c = 6;
            dVar.Y = "com.google.android.googlequicksearchbox.NEXUS_OPA_GMM_FEEDBACK";
            dVar.I = true;
            dVar.E = true;
            dVar.N = 268730368;
        } else if (com.google.android.apps.gsa.shared.util.p.g.contains(str)) {
            dVar.I = true;
        } else if (this.e.w(r.b) && "com.google.android.youtube".equals(str)) {
            dVar.N = 268730368;
        }
        dVar.W = str;
        if (this.e.w(az.H)) {
            dVar.X = qVar.toByteArray();
        }
        fu fuVar = b;
        (!fuVar.containsKey(str) ? Optional.empty() : !com.google.android.apps.gsa.shared.util.p.h.contains(str) ? Optional.of((String) fuVar.get(str)) : this.d.i(qVar) ? Optional.of("com.google.android.googlequicksearchbox.NEXUS_OPA_GBOARD_FEEDBACK") : Optional.empty()).ifPresent(new m(dVar));
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final void n(String str, com.google.android.apps.gsa.search.shared.g.d dVar) {
        com.google.android.apps.gsa.assistant.shared.k.a a2 = ((o) this.c.a()).a();
        String str2 = a2.c;
        q qVar = a2.d;
        q qVar2 = qVar;
        if (qVar == null) {
            qVar2 = q.a;
        }
        if ((this.e.m(az.v).contains(Integer.toString(com.google.android.apps.gsa.shared.util.h.a.a(str2))) || o(str)) && t(str2, qVar2)) {
            m(str2, qVar2, dVar);
        }
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean o(String str) {
        com.google.android.apps.gsa.assistant.shared.k.a a2 = ((o) this.c.a()).a();
        if (str.equals(a2.c)) {
            ab abVar = com.google.common.f.a.e.a;
            return true;
        }
        ab abVar2 = com.google.common.f.a.e.a;
        String str2 = a2.c;
        return false;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean p(String str) {
        if (!this.d.m(str)) {
            ab abVar = com.google.common.f.a.e.a;
            return false;
        }
        if (((Boolean) this.g.a()).booleanValue()) {
            return true;
        }
        ab abVar2 = com.google.common.f.a.e.a;
        return false;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean q() {
        if (this.e.w(az.cR) && s()) {
            return com.google.android.apps.gsa.shared.util.p.c.contains(l());
        }
        return false;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean r(String str) {
        com.google.android.apps.gsa.assistant.shared.k.a a2 = ((o) this.c.a()).a();
        String str2 = a2.c;
        q qVar = a2.d;
        q qVar2 = qVar;
        if (qVar == null) {
            qVar2 = q.a;
        }
        return o(str) && t(str2, qVar2) && v.b.contains(str2);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean s() {
        if (!w()) {
            return false;
        }
        return v.b.contains(l());
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean t(String str, q qVar) {
        int dm = a.a.dm(qVar.c);
        int i = dm;
        if (dm == 0) {
            i = 1;
        }
        if (this.d.c(str).contains(Integer.valueOf(i - 1))) {
            return true;
        }
        h f = f1761a.f();
        f.aj(com.google.common.f.a.e.a, "OpaAppIntegStatusHelper");
        h hVar = f;
        hVar.ak(16474);
        hVar.s("%s is not supported", str);
        return false;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean u(String str) {
        return com.google.android.apps.gsa.shared.util.p.c.contains(str);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.u
    public final boolean v(String str) {
        boolean z = false;
        if (l().equals(str)) {
            if (com.google.android.apps.gsa.shared.util.p.f.contains(str)) {
                z = true;
            } else {
                if (com.google.android.apps.gsa.shared.util.p.g.contains(str)) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }
}
