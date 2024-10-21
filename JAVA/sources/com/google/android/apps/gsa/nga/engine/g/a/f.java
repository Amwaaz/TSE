package com.google.android.apps.gsa.nga.engine.g.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.ae.ao;
import com.google.android.apps.gsa.nga.engine.ao.h;
import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.shared.f.ah;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.search.account.k;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.b.ha;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/a/f.class */
public final class f extends com.google.android.apps.gsa.nga.engine.t.c implements h, i, ao {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f613a = com.google.common.f.a.d.j();
    public final com.google.android.libraries.gsa.h.h b;
    public boolean c;
    public final cg d;
    private final a e;
    private final k f;
    private final ad g;
    private final y h;

    public f(cg cgVar, a aVar, k kVar, ad adVar, com.google.android.libraries.gsa.h.h hVar, n nVar, y yVar) {
        super(nVar);
        this.c = false;
        this.d = cgVar;
        this.e = aVar;
        this.b = hVar;
        this.f = kVar;
        this.g = adVar;
        this.h = yVar;
    }

    private final cn e() {
        return this.b.k(this.d.d(), "[NGA] NgaAccessPolicy.getPersonalResultsBit", new com.google.android.libraries.gsa.h.d() { // from class: com.google.android.apps.gsa.nga.engine.g.a.d
            @Override // com.google.android.libraries.gsa.h.d
            public final Object a(Object obj) {
                return Boolean.valueOf(((ah) obj).f);
            }
        });
    }

    private final cn f() {
        return this.e.i(eu.aD) ? dl.n(false) : this.e.i(eu.dI) ? e() : dl.n(true);
    }

    private final cn j() {
        if (this.e.i(eu.aE)) {
            return dl.n(false);
        }
        cn e = this.e.i(eu.dK) ? e() : dl.n(true);
        cn cnVar = e;
        if (this.e.i(eu.dJ)) {
            cnVar = this.b.l(this.f.c(), "[NGA] NgaAccessPolicy.isAccessToPersonalContentAllowedOnUnlockedScreen", new e(e, 0));
        }
        return cnVar;
    }

    private final cn k() {
        return com.google.android.apps.gsa.v.c.b(dl.k(new cn[]{this.b.k(this.g.e() ? j() : j(), "[NGA] isAccessToPersonalContentAllowed", new e(this, 1))}));
    }

    private final void m() {
        new com.google.android.apps.gsa.shared.util.c.ae(k(), this.b, "[NGA] updateCachedValues").b(new com.google.android.libraries.gsa.h.f() { // from class: com.google.android.apps.gsa.nga.engine.g.a.b
            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
            }
        }).a(new be() { // from class: com.google.android.apps.gsa.nga.engine.g.a.c
            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                aus.g(f.f613a.f(), obj, "Access policy update failed.", (char) 2771);
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(t tVar) {
        if (tVar == t.b) {
            m();
        }
    }

    public final cn a() {
        if (this.g.e()) {
            return f();
        }
        return this.e.i(eu.dH) ? this.b.l(f(), "[NGA] NgaAccessPolicy.isAccessToCommsAllowedOnLockscreen", new j(this, 1)) : f();
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.h.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i, com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        m();
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return k();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.ao
    public final void hi(boolean z) {
        m();
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NgaAccessPolicy";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 11;
    }
}
