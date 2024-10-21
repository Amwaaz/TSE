package com.google.android.apps.gsa.assistant.settings.features.v;

import android.accounts.Account;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.l.g.f;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.libraries.geller.h.bp;
import com.google.android.libraries.geller.h.bq;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.g.e.k.a.aj;
import com.google.protos.ap.a.a.s;
import com.google.protos.o.b.l;
import com.google.protos.o.b.v;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/features/v/c.class */
public final class c implements bq {

    /* renamed from: a, reason: collision with root package name */
    public static final d f251a = d.j();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final an c;
    private final h d;
    private final f e;

    public c(f fVar, h hVar, an anVar) {
        this.e = fVar;
        this.d = hVar;
        this.c = anVar;
        for (Account account : anVar.A()) {
            b(account);
        }
    }

    private final void b(Account account) {
        if (account == null) {
            return;
        }
        f fVar = this.e;
        String str = account.name;
        str.getClass();
        new ae(fVar.a(str, v.T, "language_partner_settings", s.a, l.a), this.d, "[Nga] fetchLanguagePartnerSettings").a(new be(this) { // from class: com.google.android.apps.gsa.assistant.settings.features.v.a

            /* renamed from: a, reason: collision with root package name */
            public final c f250a;

            {
                this.f250a = this;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                Optional findFirst = Collection._EL.stream((fl) obj).findFirst();
                if (findFirst.isEmpty() || ((l) findFirst.get()).b != 14) {
                    return;
                }
                l lVar = (l) findFirst.get();
                aj ajVar = lVar.b == 14 ? (aj) lVar.c : aj.a;
                String str2 = ajVar.b ? ajVar.c : "";
                c cVar = this.f250a;
                String r = cVar.c.r();
                if (r != null) {
                    cVar.b.put(r, str2);
                }
            }
        }).a(new be() { // from class: com.google.android.apps.gsa.assistant.settings.features.v.b
            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                aus.g(c.f251a.e(), obj, "Failed fetching language partner settings.", (char) 792);
            }
        });
    }

    public final String a() {
        String r = this.c.r();
        return r == null ? "" : (String) ConcurrentMap._EL.getOrDefault(this.b, r, "");
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void e(v vVar, Account account, bp bpVar) {
        if (vVar != v.T || account == null) {
            return;
        }
        b(account);
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final /* synthetic */ void h() {
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void i(v vVar) {
    }
}
