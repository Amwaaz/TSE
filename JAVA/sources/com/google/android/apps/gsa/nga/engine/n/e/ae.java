package com.google.android.apps.gsa.nga.engine.n.e;

import com.google.android.apps.gsa.assistant.shared.ao;
import com.google.android.apps.gsa.nga.engine.ao.h;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.f.a.m;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.logger.b.e;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.v.f;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/e/ae.class */
public final class ae extends c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ao f627a;
    public final com.google.android.libraries.gsa.h.h b;
    public final com.google.android.apps.gsa.shared.util.q.a c;
    public final AtomicReference d;
    public final AtomicReference e;
    public final EnumSet f;
    private final f g;
    private final i h;
    private final m i;
    private final com.google.android.apps.gsa.nga.engine.g.a.y j;

    public ae(f fVar, ao aoVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.shared.util.q.a aVar, m mVar, n nVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar, i iVar) {
        super(nVar, ha.s(Integer.valueOf(br.aa.f1434a), Integer.valueOf(br.cj.f1451a)));
        this.d = new AtomicReference(true);
        this.e = new AtomicReference(w.UNKNOWN_EVENT);
        this.f = EnumSet.noneOf(com.google.android.apps.gsa.assistant.shared.k.c.class);
        this.g = fVar;
        this.f627a = aoVar;
        this.b = hVar;
        this.c = aVar;
        this.i = mVar;
        this.j = yVar;
        this.h = iVar;
    }

    private final cn e() {
        cn k;
        if (this.c.i(br.ad)) {
            ArrayList arrayList = new ArrayList(ao.f259a.size());
            qj j = ao.f259a.j();
            while (j.hasNext()) {
                com.google.android.apps.gsa.assistant.shared.k.c cVar = (com.google.android.apps.gsa.assistant.shared.k.c) j.next();
                arrayList.add(this.b.k(this.f627a.b(cVar), "[NGA] setShouldEnableSpeedBump", new f(this, cVar, 4)));
            }
            return dl.f(arrayList).a(new ad(), ay.a);
        }
        if (c()) {
            this.d.set(false);
            this.e.set(w.SPEED_BUMP_GRACE_PERIOD_ENABLED);
            k = dl.n(com.google.android.apps.gsa.v.c.f1836a);
        } else {
            ao aoVar = this.f627a;
            k = this.b.k(aoVar.a(aoVar.b), "[NGA] setShouldEnableSpeedBump", new i(this, 4));
        }
        return k;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.h
    public final void H(com.google.android.apps.gsa.nga.shared.f.t tVar) {
        if (com.google.android.apps.gsa.nga.shared.f.t.h.equals(tVar)) {
            e();
        }
    }

    public final void a(w wVar, com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        e eVar = new e();
        eVar.a = wVar;
        qn createBuilder = r.a.createBuilder();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        rVar.C = cVar.cF;
        rVar.c |= 32;
        eVar.b = createBuilder.build();
        this.h.a(eVar.a());
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final boolean c() {
        long millis = Duration.ofDays(this.c.d(br.cj)).toMillis();
        if (millis <= 0) {
            return false;
        }
        long j = this.i.b().m;
        Optional empty = j <= 0 ? Optional.empty() : Optional.of(Instant.ofEpochMilli(j));
        return !empty.isPresent() || Duration.between((Temporal) empty.get(), this.g.a()).toMillis() <= millis;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.j.c().f619a && this.c.i(br.aa);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return e();
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.d.set(true);
        return dl.n(com.google.android.apps.gsa.v.c.f1836a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "SpeedBumpHelper";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 72;
    }
}
