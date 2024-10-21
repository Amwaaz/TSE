package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.engine.ac.f;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.ct;
import com.google.android.apps.gsa.nga.shared.q.c.cu;
import com.google.android.apps.gsa.nga.shared.q.c.cx;
import com.google.android.apps.gsa.nga.shared.q.c.cy;
import com.google.android.apps.gsa.nga.shared.q.d.bs;
import com.google.android.apps.gsa.nga.shared.q.d.bt;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.logger.d.b;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import com.google.common.f.am;
import com.google.common.o.qn;
import com.google.common.o.r;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/av.class */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    public final x f390a;
    private final i d;
    private final com.google.android.apps.gsa.nga.shared.q.a.af e;
    private static final d b = d.j();
    private static final a f = new a();
    private static final ha c = ha.w(262211, 262221, 262222, 262225, 262226, 262216, new Integer[]{524292, 65571, 65545, 65586});

    public av(com.google.android.apps.gsa.nga.shared.q.a.af afVar, x xVar, i iVar) {
        this.e = afVar;
        this.f390a = xVar;
        this.d = iVar;
    }

    private static int c(int i) {
        if (c.contains(Integer.valueOf(i))) {
            return i;
        }
        if (b.a(i) == null) {
            return -1;
        }
        return i & (-65536);
    }

    final void a(bs bsVar, f fVar) {
        Optional ofNullable = Optional.ofNullable(fVar);
        b(bsVar, (com.google.android.apps.gsa.nga.shared.q.ah) ofNullable.map(new e(5)).map(new e(6)).orElseGet(new au(0)), (String) ofNullable.map(new e(7)).orElse(""), com.google.android.apps.gsa.nga.shared.s3.a.i.a);
    }

    public final void b(bs bsVar, com.google.android.apps.gsa.nga.shared.q.ah ahVar, String str, com.google.android.apps.gsa.nga.shared.s3.a.i iVar) {
        w wVar = w.NGA_OPA_INTERACTION_VIOLATION;
        qn createBuilder = r.a.createBuilder();
        com.google.common.o.p pVar = (com.google.common.o.p) f.le(bsVar);
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        rVar.aw = pVar.g;
        rVar.e |= 16384;
        this.d.m(wVar, ahVar, createBuilder);
        String name = bsVar.name();
        if (name == null) {
            throw new NullPointerException("Null violation");
        }
        this.f390a.b(new cy("NGA_OPA_HANDOVER_VIOLATIONS", name));
        if (this.f390a.a() != null) {
            x xVar = this.f390a;
            String a2 = xVar.a();
            if (a2 == null) {
                throw new NullPointerException("Null deviceRamGb");
            }
            String name2 = bsVar.name();
            if (name2 == null) {
                throw new NullPointerException("Null violation");
            }
            xVar.b(new cx("NGA_OPA_HANDOVER_VIOLATIONS_DEVICE_TIER", name2, a2));
        }
        if (bs.f.equals(bsVar)) {
            int size = iVar.d.size();
            int i = 0;
            int d = size > 0 ? iVar.d.d(0) : 0;
            if (size > 0) {
                i = iVar.d.d(size - 1);
            }
            this.f390a.b(new ct("NGA_OPA_HANDOVER_GRAPH_FAILED_REASON", c(d)));
            this.f390a.b(new cu("NGA_OPA_HANDOVER_GRAPH_FAILED_ROOT_CAUSE", c(i)));
        }
        com.google.android.apps.gsa.nga.shared.q.a.af afVar = this.e;
        com.google.android.apps.gsa.nga.shared.q.d.bk bkVar = com.google.android.apps.gsa.nga.shared.q.d.bk.OPA_FAILURE_DETECTED;
        com.google.protobuf.ba createBuilder2 = com.google.android.apps.gsa.nga.shared.q.d.bj.a.createBuilder();
        com.google.protobuf.ba createBuilder3 = bt.a.createBuilder();
        createBuilder3.copyOnWrite();
        bt btVar = createBuilder3.instance;
        btVar.c = bsVar.g;
        btVar.b |= 1;
        createBuilder3.copyOnWrite();
        bt btVar2 = createBuilder3.instance;
        iVar.getClass();
        btVar2.e = iVar;
        btVar2.b |= 4;
        createBuilder3.copyOnWrite();
        bt btVar3 = createBuilder3.instance;
        str.getClass();
        btVar3.b |= 2;
        btVar3.d = str;
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.q.d.bj bjVar = createBuilder2.instance;
        bt build = createBuilder3.build();
        build.getClass();
        bjVar.c = build;
        bjVar.b = 62;
        afVar.b(bkVar, (com.google.android.apps.gsa.nga.shared.q.d.bj) createBuilder2.build(), com.google.android.apps.gsa.nga.shared.q.ah.a);
        com.google.common.f.a.a e = b.e();
        e.al(am.a);
        e.ak(3677);
        e.s("OPA failure detected: %s", bsVar.name());
    }
}
