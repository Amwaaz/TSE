package com.google.android.apps.gsa.staticplugins.nga.h;

import android.accounts.Account;
import com.google.android.apps.gsa.l.g.f;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bj;
import com.google.android.apps.gsa.staticplugins.nga.k.n;
import com.google.android.apps.gsa.staticplugins.nga.t.i;
import com.google.android.libraries.geller.h.bp;
import com.google.android.libraries.geller.h.bq;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.protos.o.b.bg;
import com.google.protos.o.b.v;
import j$.util.Collection;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/h/k.class */
public final class k implements bq {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1684a = d.j();
    public final i b;
    public final f c;
    public final h d;
    public final bj e;
    public final cg f;
    private final n g;

    public k(n nVar, i iVar, bj bjVar, f fVar, h hVar, cg cgVar) {
        this.g = nVar;
        this.b = iVar;
        this.e = bjVar;
        this.c = fVar;
        this.d = hVar;
        this.f = cgVar;
    }

    public static Optional a(fl flVar, bg bgVar) {
        return Collection._EL.stream(flVar).filter(new h()).filter(new i(bgVar)).findFirst().map(new j());
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void e(v vVar, Account account, bp bpVar) {
        if (vVar == v.cF) {
            this.d.n("[NGA] GellerCorpusSyncListener.updatePrivacySettings", new g(this, account));
        }
        this.g.j(vVar.dl);
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final /* synthetic */ void h() {
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void i(v vVar) {
    }
}
