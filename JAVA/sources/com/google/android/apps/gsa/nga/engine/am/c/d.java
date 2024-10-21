package com.google.android.apps.gsa.nga.engine.am.c;

import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.shared.aa.a.h;
import com.google.android.apps.gsa.nga.shared.aa.a.m;
import com.google.android.apps.gsa.nga.shared.aa.f;
import com.google.android.apps.gsa.nga.shared.aa.g;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.apps.gsa.nga.shared.u.e.a.as;
import com.google.android.apps.gsa.nga.shared.u.y;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/c/d.class */
public final class d implements g, f {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.a.d f454a = com.google.common.f.a.d.j();
    private final a b;
    private final b c;
    private final ad d;
    private final com.google.android.apps.gsa.nga.engine.m.f.a.g e;

    public d(a aVar, ad adVar, b bVar, com.google.android.apps.gsa.nga.engine.m.f.a.g gVar) {
        this.d = adVar;
        this.b = aVar;
        this.c = bVar;
        this.e = gVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final cn a(Locale locale) {
        h a2;
        if (!this.b.i(eu.hu) || this.d.c()) {
            int i = fl.e;
            return dl.n(ni.a);
        }
        if (this.b.i(az.bX)) {
            com.google.android.apps.gsa.nga.shared.aa.e eVar = new com.google.android.apps.gsa.nga.shared.aa.e(m.e, 2131235972, "", "", "");
            eVar.d(89798);
            a2 = eVar.b().a();
        } else {
            com.google.android.apps.gsa.nga.shared.aa.e eVar2 = new com.google.android.apps.gsa.nga.shared.aa.e(m.e, 2131235972, this.c.a(locale).getString(2132091573, new Object[0]), "", "");
            eVar2.d(89798);
            a2 = eVar2.b().a();
        }
        return dl.n(fl.p(a2));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.f
    public final cn b(m mVar, as asVar, ah ahVar) {
        com.google.common.f.a.a d = f454a.d();
        d.ak(4248);
        d.p("Opening Activity history...");
        ba createBuilder = aa.a.createBuilder();
        y yVar = y.a;
        createBuilder.copyOnWrite();
        aa aaVar = createBuilder.instance;
        yVar.getClass();
        aaVar.c = yVar;
        aaVar.b = 15;
        return i.g(this.e.c(createBuilder.build(), Optional.empty()), new m(1), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final String c() {
        return "HistoryProvider";
    }
}
