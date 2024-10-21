package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.assist.a.k;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.staticplugins.opa.h.a;
import com.google.android.libraries.assistant.d.c.c.m;
import com.google.android.libraries.assistant.d.c.c.q;
import com.google.common.base.at;
import com.google.common.base.bu;
import com.google.common.base.l;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.g.e.h.a.dr;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import com.google.protobuf.dh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/appintegration/p.class */
public class p implements v {
    private static final j c = j.i("com.google.android.apps.gsa.staticplugins.opa.appintegration.p");
    private final com.google.android.apps.gsa.search.core.h.p d;
    private final a e;
    private final k.a.a f;
    private final k g;
    private final an h;

    public p(com.google.android.apps.gsa.search.core.h.p pVar, an anVar, a aVar, k.a.a aVar2, k kVar) {
        this.d = pVar;
        this.h = anVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = kVar;
    }

    public static at l(String str, String str2) {
        String num = Integer.toString(com.google.android.apps.gsa.shared.util.h.a.a(str));
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str3 : bu.c(new l(';')).a().j(str2)) {
            List j = bu.c(new l(',')).j(str3);
            if (j.size() != 2) {
                h f = c.f();
                f.aj(com.google.common.f.a.e.a, "OpaAppIntegUtil");
                h hVar = f;
                hVar.ak(16478);
                hVar.s("Invalid hashed package name and values format: %s", str3);
                return com.google.common.base.a.a;
            }
            if (num.equals(j.get(0))) {
                z = true;
                if (!TextUtils.isEmpty((CharSequence) j.get(1))) {
                    arrayList.addAll(bu.c(new l('|')).a().j((CharSequence) j.get(1)));
                }
            }
        }
        return z ? at.k(arrayList) : com.google.common.base.a.a;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final at a(q qVar) {
        if (qVar != null && (qVar.b & 64) != 0) {
            com.google.android.libraries.assistant.d.c.c.n nVar = qVar.i;
            com.google.android.libraries.assistant.d.c.c.n nVar2 = nVar;
            if (nVar == null) {
                nVar2 = com.google.android.libraries.assistant.d.c.c.n.a;
            }
            for (m mVar : nVar2.b) {
                int i = mVar.b;
                if ((i & 1) != 0 && (i & 2) != 0) {
                    try {
                        if (mVar.c.equals("assistant.api.params.MessagingAppParam")) {
                            return at.k(bi.parseFrom(dr.a, mVar.d));
                        }
                        continue;
                    } catch (ce e) {
                        h f = c.f();
                        f.aj(com.google.common.f.a.e.a, "OpaAppIntegUtil");
                        h hVar = f;
                        hVar.ak(16477);
                        hVar.s("Invalid protocol buffer for %s", mVar.c);
                    }
                }
            }
        }
        return com.google.common.base.a.a;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List, java.lang.Object] */
    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final List b(String str) {
        if (!TextUtils.isEmpty(str)) {
            at l = l(str, this.d.t(az.F));
            if (l.h()) {
                return l.c();
            }
        }
        return this.d.m(az.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List, java.lang.Object] */
    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final List c(String str) {
        com.google.common.base.a k;
        if (!this.g.a()) {
            return Collections.emptyList();
        }
        String t = this.d.t(az.G);
        if (TextUtils.isEmpty(t)) {
            k = com.google.common.base.a.a;
        } else {
            at l = l(str, t);
            if (l.h()) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : l.c()) {
                    try {
                        Integer valueOf = Integer.valueOf(Integer.parseInt(str2));
                        if (!arrayList.contains(valueOf)) {
                            arrayList.add(valueOf);
                        }
                    } catch (NumberFormatException e) {
                        h f = c.f();
                        f.aj(com.google.common.f.a.e.a, "OpaAppIntegUtil");
                        h hVar = f;
                        hVar.ak(16479);
                        hVar.s("Invalid voice plate mode format: %s", str2);
                        k = com.google.common.base.a.a;
                    }
                }
                k = at.k(arrayList);
            } else {
                k = com.google.common.base.a.a;
            }
        }
        return k.h() ? k.c() : this.d.k(az.y);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean d() {
        return m("com.google.android.apps.maps");
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean e() {
        an anVar = this.h;
        List c2 = c("com.google.android.apps.maps");
        anVar.l();
        return c2.contains(1) && c2.contains(2) && this.e.i();
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean f() {
        at j = at.j(this.h.l());
        if (!this.d.w(az.eM)) {
            return false;
        }
        a aVar = this.e;
        ab abVar = com.google.common.f.a.e.a;
        return j.h() && !aVar.d() && aVar.f((Account) j.c()) == 5 && aVar.f1767a.l() && this.g.a();
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean g() {
        this.h.l();
        return ((Boolean) this.f.a()).booleanValue() && this.e.i();
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean h(String str, byte[] bArr) {
        if (!com.google.android.apps.gsa.shared.util.p.h.contains(str) || bArr == null) {
            return false;
        }
        try {
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            dh dhVar = dh.a;
            q qVar = (q) bi.parseFrom(q.a, bArr, ExtensionRegistryLite.a);
            if (qVar != null) {
                return i(qVar);
            }
            return false;
        } catch (ce e) {
            return false;
        }
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean i(q qVar) {
        if (qVar == null) {
            return false;
        }
        com.google.android.libraries.assistant.d.c.c.n nVar = qVar.i;
        com.google.android.libraries.assistant.d.c.c.n nVar2 = nVar;
        if (nVar == null) {
            nVar2 = com.google.android.libraries.assistant.d.c.c.n.a;
        }
        if (nVar2.b.size() <= 0) {
            return false;
        }
        com.google.android.libraries.assistant.d.c.c.n nVar3 = qVar.i;
        com.google.android.libraries.assistant.d.c.c.n nVar4 = nVar3;
        if (nVar3 == null) {
            nVar4 = com.google.android.libraries.assistant.d.c.c.n.a;
        }
        if ((((m) nVar4.b.get(0)).b & 1) == 0) {
            return false;
        }
        com.google.android.libraries.assistant.d.c.c.n nVar5 = qVar.i;
        com.google.android.libraries.assistant.d.c.c.n nVar6 = nVar5;
        if (nVar5 == null) {
            nVar6 = com.google.android.libraries.assistant.d.c.c.n.a;
        }
        return "assistant.api.params.ImeAppParams".equals(((m) nVar6.b.get(0)).c);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean j() {
        return this.d.w(az.Y);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.v
    public final boolean k() {
        return this.d.w(az.iN);
    }

    public final boolean m(String str) {
        return g() && c(str).contains(3);
    }
}
