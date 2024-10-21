package com.google.android.apps.gsa.nga.shared.q.a;

import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.android.apps.gsa.nga.shared.q.p;
import com.google.android.apps.gsa.nga.shared.q.q;
import com.google.android.apps.gsa.nga.shared.q.r;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.common.base.ci;
import com.google.protobuf.ba;
import j$.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/af.class */
public class af {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f975a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.shared.q.a.af");
    public final ci b;
    private final com.google.common.v.f c;
    private final com.google.android.libraries.gsa.h.h d;
    private final com.google.android.libraries.gsa.h.h e;
    private final com.google.android.apps.gsa.nga.shared.q.i f;
    private final Set g = new CopyOnWriteArraySet();

    public af(ci ciVar, com.google.common.v.f fVar, com.google.android.libraries.gsa.h.h hVar, aw awVar, com.google.android.apps.gsa.nga.shared.q.i iVar, p pVar, d dVar) {
        this.b = ciVar;
        this.c = fVar;
        this.d = hVar;
        this.e = awVar.a(ae.class);
        this.f = iVar;
        dVar.a(pVar);
    }

    public final void a(bl blVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(blVar);
        }
        this.f.b(blVar);
    }

    public final /* synthetic */ void b(bk bkVar, bj bjVar, com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        c(bkVar, new q(bjVar), ahVar);
    }

    public final void c(bk bkVar, Supplier supplier, com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        new com.google.android.apps.gsa.shared.util.c.ae(this.d.a("[NGA] produce-log-event", new ab(this, bkVar, ahVar, supplier)), this.e, "[NGA] log-event").a(new ac(this)).a(new ad());
    }

    public final void d(r rVar) {
        this.g.add(rVar);
    }

    public final void e(r rVar) {
        this.g.remove(rVar);
    }

    public final void f(bk bkVar, bj bjVar, com.google.android.apps.gsa.nga.shared.q.ah ahVar, long j, int i) {
        ci ciVar = this.b;
        Duration ofMillis = Duration.ofMillis(j);
        ba g = g(bkVar, ahVar, Duration.ofNanos(ciVar.a()));
        long millis = ofMillis.toMillis();
        g.copyOnWrite();
        bl blVar = g.instance;
        bl blVar2 = bl.a;
        blVar.b |= 8;
        blVar.f = millis;
        g.copyOnWrite();
        bl blVar3 = g.instance;
        blVar3.g = i - 1;
        blVar3.b |= 16;
        if (bjVar != null) {
            g.copyOnWrite();
            bl blVar4 = g.instance;
            blVar4.e = bjVar;
            blVar4.b |= 4;
        }
        this.e.n("[NGA] log-event", new t(this, g, 2));
    }

    public final ba g(bk bkVar, com.google.android.apps.gsa.nga.shared.q.ah ahVar, Duration duration) {
        ba createBuilder = bl.a.createBuilder();
        long epochMilli = this.c.a().toEpochMilli();
        createBuilder.copyOnWrite();
        bl blVar = createBuilder.instance;
        blVar.b |= 2;
        blVar.d = epochMilli;
        long millis = duration.toMillis();
        createBuilder.copyOnWrite();
        bl blVar2 = createBuilder.instance;
        blVar2.b |= 64;
        blVar2.i = millis;
        long nanos = duration.toNanos();
        createBuilder.copyOnWrite();
        bl blVar3 = createBuilder.instance;
        blVar3.b |= 128;
        blVar3.j = nanos;
        createBuilder.copyOnWrite();
        bl blVar4 = createBuilder.instance;
        blVar4.c = bkVar.be;
        blVar4.b |= 1;
        createBuilder.copyOnWrite();
        bl blVar5 = createBuilder.instance;
        ahVar.getClass();
        blVar5.h = ahVar;
        blVar5.b |= 32;
        return createBuilder;
    }
}
