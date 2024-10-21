package com.google.android.apps.gsa.nga.engine.am.c;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.shared.aa.a.m;
import com.google.android.apps.gsa.nga.shared.aa.f;
import com.google.android.apps.gsa.nga.shared.aa.g;
import com.google.android.apps.gsa.nga.shared.ak.c;
import com.google.android.apps.gsa.nga.shared.f.a.t;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.u.e.a.as;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/c/p.class */
public final class p implements g, f {
    private static final com.google.common.f.a.d k = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final Context f456a;
    public final a b;
    public final com.google.android.apps.gsa.shared.util.q.a c;
    public final h d;
    public final com.google.common.v.f e;
    public final com.google.android.apps.search.lens.c.e f;
    public final AtomicReference g = new AtomicReference(Optional.empty());
    public final com.google.android.apps.gsa.nga.engine.m.f.a.g h;
    public final t i;
    public final com.google.android.apps.gsa.nga.engine.n.e.a j;
    private final b l;
    private final a m;
    private final ad n;

    public p(Context context, a aVar, com.google.android.apps.gsa.nga.engine.m.f.a.g gVar, h hVar, com.google.android.apps.gsa.shared.util.q.a aVar2, com.google.common.v.f fVar, t tVar, com.google.android.apps.gsa.nga.engine.n.e.a aVar3, b bVar, com.google.android.apps.search.lens.c.e eVar, a aVar4, ad adVar) {
        this.h = gVar;
        this.d = hVar;
        this.f456a = context;
        this.b = aVar;
        this.c = aVar2;
        this.e = fVar;
        this.i = tVar;
        this.j = aVar3;
        this.l = bVar;
        this.m = aVar4;
        this.f = eVar;
        this.n = adVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final cn a(Locale locale) {
        if (this.c.i(eu.hv)) {
            return this.d.l(this.i.a(), "[NGA] LensSuggestionProvider getLensChipLastUsageTimestampMs", new n(this, locale));
        }
        int i = fl.e;
        return dl.n(ni.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.f
    public final cn b(m mVar, as asVar, ah ahVar) {
        com.google.common.f.a.a d = k.d();
        d.ak(4256);
        d.p("Opening Lens...");
        return this.d.b("[NGA] LensSuggestionProvider.onSuggestionClicked", new j(this, 2));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final String c() {
        return "LensSuggestionProvider";
    }

    public final fl d(boolean z, Locale locale, long j) {
        if (!z || this.n.c() || (this.c.i(eu.ht) && !((com.google.android.apps.gsa.nga.shared.ak.e) this.m.a()).b().equals(c.b))) {
            int i = fl.e;
            return ni.a;
        }
        if (this.c.i(eu.hs)) {
            if (this.e.a().minusMillis(j).toEpochMilli() > Duration.ofHours(this.c.d(eu.jr)).toMillis()) {
                com.google.android.apps.gsa.nga.shared.aa.e eVar = new com.google.android.apps.gsa.nga.shared.aa.e(m.f, 2131235731, this.l.a(locale).getString(2132091574, new Object[0]), "", "");
                eVar.d(110370);
                return fl.p(eVar.b().a());
            }
        }
        com.google.android.apps.gsa.nga.shared.aa.e eVar2 = new com.google.android.apps.gsa.nga.shared.aa.e(m.f, 2131235731, "", "", "");
        eVar2.d(110370);
        return fl.p(eVar2.b().a());
    }
}
