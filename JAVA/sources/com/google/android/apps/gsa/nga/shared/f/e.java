package com.google.android.apps.gsa.nga.shared.f;

import com.google.android.apps.gsa.nga.shared.f.a.j;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.qj;
import e.a;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/e.class */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private final a f877a;

    public e(a aVar) {
        this.f877a = aVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("NGA PDS Configuration");
        a aVar = this.f877a;
        f d = fVar.d((Object) null);
        com.google.android.apps.gsa.nga.shared.f.a.m mVar = (com.google.android.apps.gsa.nga.shared.f.a.m) aVar.a();
        com.google.android.apps.gsa.shared.util.debug.a.e b = d.b("education");
        ap apVar = mVar.b().c;
        ap apVar2 = apVar;
        if (apVar == null) {
            apVar2 = ap.a;
        }
        b.b("HomeImpressions: %d Queries: %d InvocSinceLastSuggest: %d", new com.google.android.apps.gsa.shared.util.b.e[]{new d(Integer.valueOf(apVar2.b.size()), false), new d(Integer.valueOf(mVar.b().i), false), new d(Integer.valueOf(mVar.b().l), false)});
        f d2 = d.d((Object) null);
        d2.q("Homescreen");
        com.google.android.apps.gsa.shared.util.debug.a.e b2 = d2.b("home");
        ap apVar3 = mVar.b().c;
        ap apVar4 = apVar3;
        if (apVar3 == null) {
            apVar4 = ap.a;
        }
        Stream map = Collection._EL.stream(apVar4.b).map(new com.google.android.apps.gsa.nga.shared.f.a.f(7));
        int i = fl.e;
        b2.a(new d((fl) map.collect(bs.a), false));
        qj j = ((fu) Collection._EL.stream(DesugarCollections.unmodifiableMap(mVar.b().d).entrySet()).collect(bs.e(new com.google.android.apps.gsa.nga.shared.f.a.f(3), new com.google.android.apps.gsa.nga.shared.f.a.f(4), new j()))).v().j();
        while (j.hasNext()) {
            Map.Entry entry = (Map.Entry) j.next();
            d2.b("app").b("[%s]: %s", new com.google.android.apps.gsa.shared.util.b.e[]{com.google.android.apps.gsa.shared.util.b.e.c(entry.getKey()), new d(entry.getValue(), false)});
        }
    }
}
