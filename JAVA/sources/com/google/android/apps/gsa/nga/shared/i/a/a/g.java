package com.google.android.apps.gsa.nga.shared.i.a.a;

import com.google.android.apps.gsa.nga.shared.f.a.f;
import com.google.android.apps.gsa.nga.shared.f.a.m;
import com.google.android.apps.gsa.nga.shared.f.aj;
import com.google.android.apps.gsa.nga.shared.i.a.h;
import com.google.android.apps.gsa.nga.shared.i.a.i;
import com.google.android.apps.gsa.nga.shared.u.d.a.c;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.gl;
import com.google.common.b.qj;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cn;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/i/a/a/g.class */
public final class g implements i {
    public static final int c = 0;
    public final m b;
    private final bj d = new bj();

    public g(m mVar) {
        this.b = mVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final fl a(l lVar, boolean z) {
        fl e = this.b.e(lVar.g, z);
        if (!z) {
            return e;
        }
        Stream sorted = Stream._CC.concat(Collection._EL.stream(e), Collection._EL.stream(this.b.e(lVar.g, false))).sorted();
        int i = fl.e;
        return (fl) sorted.collect(bs.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final fl b() {
        gl g = this.b.g(true);
        HashMap hashMap = new HashMap();
        qj j = g.map.v().j();
        while (j.hasNext()) {
            Map.Entry entry = (Map.Entry) j.next();
            c a2 = h.a((com.google.android.apps.gsa.assistant.shared.k.c) entry.getKey());
            if (!hashMap.containsKey(a2)) {
                hashMap.put(a2, 0);
            }
            hashMap.put(a2, Integer.valueOf(((Integer) hashMap.get(a2)).intValue() + ((java.util.Collection) entry.getValue()).size()));
        }
        Stream filter = Collection._EL.stream(hashMap.entrySet()).sorted(Comparator._CC.comparingInt(new b())).map(new c()).filter(new d());
        int i = fl.e;
        return (fl) filter.collect(bs.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final cn c() {
        return this.d.b(new f(this), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final cn d(Instant instant, l lVar, boolean z) {
        return this.d.b(new a(this, instant, lVar, z, 0), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final cn e(Instant instant, com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        return this.d.b(new e(this, instant, cVar, 0), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final cn f(Instant instant, com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        return this.d.b(new e(this, instant, cVar, 1), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final cn g(Instant instant, l lVar, boolean z) {
        return this.d.b(new a(this, instant, lVar, z, 1), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final Instant h() {
        long j = this.b.b().r;
        return (Instant) (j <= 0 ? Optional.empty() : Optional.of(Instant.ofEpochMilli(j))).orElse(Instant.now());
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.i
    public final fl i(l lVar) {
        aj ajVar = this.b.b().p;
        aj ajVar2 = ajVar;
        if (ajVar == null) {
            ajVar2 = aj.a;
        }
        Stream map = Collection._EL.stream(ajVar2.b).filter(new com.google.android.apps.gsa.nga.shared.f.a.g(lVar.g, 0)).map(new f(2)).map(new f(5));
        int i = fl.e;
        return (fl) map.collect(bs.a);
    }
}
