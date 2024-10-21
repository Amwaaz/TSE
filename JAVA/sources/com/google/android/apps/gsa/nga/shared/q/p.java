package com.google.android.apps.gsa.nga.shared.q;

import android.util.Base64;
import com.google.android.apps.gsa.nga.shared.q.d.bm;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/p.class */
public final class p implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f999a;
    public final com.google.android.apps.gsa.nga.shared.q.e.a b;
    private final i c;

    public p(i iVar, c cVar, com.google.android.apps.gsa.nga.shared.q.e.a aVar) {
        this.c = iVar;
        this.f999a = cVar;
        this.b = aVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        f d = fVar.d((Object) null);
        d.q("NGA Events");
        Stream filter = Collection._EL.stream(this.c.a(d.u())).filter(new o(this, d));
        int i = fl.e;
        fl flVar = (fl) filter.collect(bs.a);
        d.a("Last 2 NGA queries").a(new d((List) Collection._EL.stream(((Map) Collection._EL.stream(flVar).filter(new n(1)).collect(Collectors.toMap(new k(1), new k(0), new l()))).values()).sorted(new m()).map(new k(2)).filter(new n(0)).limit(2L).collect(Collectors.toList()), false));
        fl flVar2 = (fl) Collection._EL.stream(flVar).map(new j(this, d)).collect(bs.a);
        ba createBuilder = bm.a.createBuilder();
        createBuilder.copyOnWrite();
        bm bmVar = createBuilder.instance;
        cb cbVar = bmVar.b;
        if (!cbVar.c()) {
            bmVar.b = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(flVar2, bmVar.b);
        d.s("nga_events_log(%s)", new e[]{new d(Base64.encodeToString(createBuilder.build().toByteArray(), 2), false)});
    }
}
