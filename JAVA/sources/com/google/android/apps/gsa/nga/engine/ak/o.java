package com.google.android.apps.gsa.nga.engine.ak;

import com.google.android.apps.gsa.nga.engine.ad.a;
import com.google.android.apps.gsa.nga.engine.annotators.m;
import com.google.android.apps.gsa.nga.engine.annotators.v;
import com.google.android.apps.gsa.nga.engine.q.e;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import com.google.common.v.c;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/o.class */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f434a = 0;
    private final e b;
    private final m c;
    private final a d;
    private final ap e;

    static {
        int i = h.f427a;
    }

    public o(e eVar, m mVar, ap apVar, a aVar) {
        this.b = eVar;
        this.c = mVar;
        this.e = apVar;
        this.d = aVar;
    }

    public final cn a(u uVar) {
        com.google.android.apps.gsa.nga.engine.v.u a2 = this.e.a(34, uVar.j.c());
        try {
            String trim = uVar.b().trim();
            m mVar = this.c;
            v d = com.google.android.apps.gsa.nga.engine.annotators.u.d(uVar.j);
            Optional.empty();
            cn g = i.g(mVar.b(trim, d), new n(trim, uVar), ay.a);
            a2.b(g);
            a2.a();
            return g;
        } catch (Throwable th) {
            try {
                a2.a();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional b(ah ahVar, Instant instant, boolean z) {
        List i = this.b.i(ahVar);
        if (i.isEmpty()) {
            return Optional.empty();
        }
        com.google.android.apps.gsa.nga.shared.u.f.o oVar = (com.google.android.apps.gsa.nga.shared.u.f.o) i.get(0);
        return (z || this.d.f() || c.d(oVar.g).plusSeconds(20L).isAfter(instant)) ? Optional.of(oVar) : Optional.empty();
    }

    public final List c(u uVar, boolean z) {
        Stream stream = (Stream) b(uVar.j.c(), uVar.a, z).map(new i(3)).orElseGet(new aa(1));
        int i = fl.e;
        return (List) stream.collect(bs.a);
    }
}
