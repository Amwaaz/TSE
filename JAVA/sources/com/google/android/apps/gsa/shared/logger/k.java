package com.google.android.apps.gsa.shared.logger;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.b.y;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.libraries.g.a.d;
import com.google.apps.tiktok.i.x;
import com.google.common.b.dk;
import com.google.common.b.pq;
import com.google.common.base.at;
import com.google.common.f.am;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.o.aw;
import com.google.common.o.bl;
import com.google.common.o.bu;
import com.google.common.o.ew;
import com.google.common.o.gg;
import com.google.common.o.gr;
import com.google.common.o.hb;
import com.google.common.o.or;
import com.google.common.o.qn;
import com.google.common.o.w;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.c;
import com.google.protobuf.cb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/k.class */
public final class k {
    public volatile p b;
    public volatile p c;
    public String d;
    public final Queue e = new pq(new dk(200));
    public final b f = new b() { // from class: com.google.android.apps.gsa.shared.logger.g
        @Override // com.google.android.apps.gsa.shared.util.debug.a.b
        public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
            w wVar;
            hb hbVar;
            long epochMilli = k.a().h.f().toEpochMilli();
            com.google.android.libraries.g.a aVar = k.a().h;
            long elapsedRealtime = epochMilli - SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (k.a().e) {
                for (n nVar : k.a().e) {
                    f fVar2 = nVar.f1471a;
                    String str = nVar.c;
                    ba createBuilder = bu.a.createBuilder();
                    if (fVar2 != null && (hbVar = fVar2.f1466a) != null) {
                        String str2 = hbVar.o;
                        if (!TextUtils.isEmpty(str2)) {
                            createBuilder.copyOnWrite();
                            bu buVar = createBuilder.instance;
                            str2.getClass();
                            buVar.b |= 4;
                            buVar.e = str2;
                        }
                        hb hbVar2 = fVar2.f1466a;
                        if ((hbVar2.b & 16) != 0) {
                            long j2 = hbVar2.q;
                            createBuilder.copyOnWrite();
                            bu buVar2 = createBuilder.instance;
                            buVar2.b |= 512;
                            buVar2.k = j2;
                        }
                        hb hbVar3 = fVar2.f1466a;
                        if ((hbVar3.c & 8) != 0) {
                            or a2 = or.a(hbVar3.A);
                            or orVar = a2;
                            if (a2 == null) {
                                orVar = or.a;
                            }
                            int i = orVar.as;
                            createBuilder.copyOnWrite();
                            bu buVar3 = createBuilder.instance;
                            buVar3.b |= 8;
                            buVar3.f = i;
                        }
                        aw awVar = fVar2.f1466a.E;
                        aw awVar2 = awVar;
                        if (awVar == null) {
                            awVar2 = aw.a;
                        }
                        if ((awVar2.b & 1) != 0) {
                            aw awVar3 = fVar2.f1466a.E;
                            aw awVar4 = awVar3;
                            if (awVar3 == null) {
                                awVar4 = aw.a;
                            }
                            int i2 = awVar4.c;
                            createBuilder.copyOnWrite();
                            bu buVar4 = createBuilder.instance;
                            buVar4.b |= 16;
                            buVar4.g = i2;
                        }
                        gg ggVar = fVar2.f1466a.t;
                        gg ggVar2 = ggVar;
                        if (ggVar == null) {
                            ggVar2 = gg.a;
                        }
                        if ((ggVar2.b & 1) != 0) {
                            gg ggVar3 = fVar2.f1466a.t;
                            gg ggVar4 = ggVar3;
                            if (ggVar3 == null) {
                                ggVar4 = gg.a;
                            }
                            int i3 = ggVar4.c;
                            createBuilder.copyOnWrite();
                            bu buVar5 = createBuilder.instance;
                            buVar5.b |= 1024;
                            buVar5.l = i3;
                        }
                        gr grVar = fVar2.f1466a.ay;
                        gr grVar2 = grVar;
                        if (grVar == null) {
                            grVar2 = gr.a;
                        }
                        if ((grVar2.b & 1) != 0) {
                            gr grVar3 = fVar2.f1466a.ay;
                            gr grVar4 = grVar3;
                            if (grVar3 == null) {
                                grVar4 = gr.a;
                            }
                            String str3 = grVar4.c;
                            createBuilder.copyOnWrite();
                            bu buVar6 = createBuilder.instance;
                            str3.getClass();
                            buVar6.b |= 2048;
                            buVar6.m = str3;
                        }
                        int i4 = fVar2.f1466a.n;
                        createBuilder.copyOnWrite();
                        bu buVar7 = createBuilder.instance;
                        buVar7.b |= 2;
                        buVar7.d = i4;
                        long j3 = nVar.b;
                        createBuilder.copyOnWrite();
                        bu buVar8 = createBuilder.instance;
                        buVar8.b |= 1;
                        buVar8.c = j3 + elapsedRealtime;
                    }
                    if (fVar2 != null && (wVar = fVar2.b) != null) {
                        String str4 = wVar.c;
                        if (str4 != null) {
                            createBuilder.copyOnWrite();
                            bu buVar9 = createBuilder.instance;
                            buVar9.b |= 4;
                            buVar9.e = str4;
                        }
                        Integer num = fVar2.b.d;
                        if (num != null) {
                            int intValue = num.intValue();
                            createBuilder.copyOnWrite();
                            bu buVar10 = createBuilder.instance;
                            buVar10.b |= 32;
                            buVar10.h = intValue;
                        }
                        w wVar2 = fVar2.b;
                        String str5 = wVar2.g;
                        int i5 = wVar2.h;
                        createBuilder.copyOnWrite();
                        bu buVar11 = createBuilder.instance;
                        buVar11.b |= 2;
                        buVar11.d = i5;
                        long j4 = nVar.b;
                        createBuilder.copyOnWrite();
                        bu buVar12 = createBuilder.instance;
                        buVar12.b |= 1;
                        buVar12.c = j4 + elapsedRealtime;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        createBuilder.copyOnWrite();
                        bu buVar13 = createBuilder.instance;
                        str.getClass();
                        buVar13.b |= 256;
                        buVar13.j = str;
                    }
                    y yVar = nVar.d;
                    if (yVar != null) {
                        createBuilder.copyOnWrite();
                        bu buVar14 = createBuilder.instance;
                        buVar14.n = yVar.ff;
                        buVar14.b |= 4096;
                    }
                    arrayList.add(createBuilder.build());
                }
            }
            qn qnVar = fVar.c;
            qnVar.copyOnWrite();
            bl blVar = qnVar.instance;
            bl blVar2 = bl.a;
            blVar.i = bl.emptyProtobufList();
            qnVar.copyOnWrite();
            bl blVar3 = qnVar.instance;
            cb cbVar = blVar3.i;
            if (!cbVar.c()) {
                blVar3.i = bi.mutableCopy(cbVar);
            }
            c.addAll(arrayList, blVar3.i);
        }
    };
    final Set g = new HashSet();
    public final com.google.android.libraries.g.a h = new com.google.android.libraries.g.a.e();
    public com.google.android.apps.gsa.w.a.e i;
    private com.google.android.apps.gsa.shared.o.a.a k;
    private volatile boolean l;
    private com.google.android.apps.gsa.shared.o.c.a.a m;
    private static final j j = j.i("com.google.android.apps.gsa.shared.logger.k");

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1468a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/k$a.class */
    public interface a {
        at ns();
    }

    public static k a() {
        o oVar;
        k kVar = m.f1470a;
        if (kVar.k == null && (oVar = o.f1472a) != null) {
            at ns = ((a) x.c(oVar.b, a.class)).ns();
            if (ns.h()) {
                com.google.android.apps.gsa.shared.o.a.a aVar = oVar.c;
                com.google.android.apps.gsa.shared.o.c.a.a aVar2 = oVar.d;
                p pVar = (p) ns.c();
                k kVar2 = m.f1470a;
                kVar2.k = aVar;
                m.f1470a.m = aVar2;
                kVar2.c = pVar;
                k kVar3 = m.f1470a;
                com.google.android.apps.gsa.shared.o.a.a aVar3 = kVar3.k;
                boolean z = kVar3.l;
                k kVar4 = m.f1470a;
                kVar4.b = kVar4.c;
            }
        }
        return kVar;
    }

    public static or b(or orVar) {
        or orVar2 = orVar;
        if (orVar == null) {
            orVar2 = or.a;
        }
        return orVar2;
    }

    public static or c(or orVar, boolean z, boolean z2, boolean z3) {
        return (!z || z2) ? b(orVar) : z3 ? or.k : or.q.equals(orVar) ? or.q : or.l;
    }

    public static void d(ew ewVar, boolean z) {
        hb hbVar;
        if (ewVar != null) {
            if (z) {
                bc createBuilder = hb.a.createBuilder();
                createBuilder.copyOnWrite();
                hb hbVar2 = createBuilder.instance;
                hbVar2.b |= 2;
                hbVar2.n = 647;
                hbVar = (hb) createBuilder.build();
            } else {
                hbVar = null;
            }
            g(hbVar, ewVar, null, null);
        }
    }

    @Deprecated
    public static void e(View view) {
        d(com.google.android.libraries.logging.c.b(view, 472), false);
    }

    public static void f(int i) {
        if (a().m != null && a().k != null) {
            com.google.android.apps.gsa.shared.o.a.a aVar = a().k;
        }
        k a2 = a();
        bc createBuilder = hb.a.createBuilder();
        createBuilder.copyOnWrite();
        hb hbVar = createBuilder.instance;
        hbVar.b |= 2;
        hbVar.n = i;
        a2.j((hb) createBuilder.build(), null, null, null, null);
    }

    public static void g(hb hbVar, ew ewVar, com.google.protos.ah.b.a aVar, String str) {
        hb hbVar2 = hbVar;
        if (hbVar == null) {
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar3 = createBuilder.instance;
            hbVar3.b |= 2;
            hbVar3.n = 472;
            hbVar2 = (hb) createBuilder.build();
        }
        a().j(hbVar2, null, ewVar, aVar, str);
    }

    public static void h(w wVar) {
        if (a().b != null) {
            a().e.add(new n(a().b.b(wVar), wVar.a, null, null));
        } else {
            h f = j.f();
            f.al(am.a);
            f.ak(8826);
            f.p("No EventLoggerStore set on EventLogger, event will be ignored.Initialize EventLogger in your Application#onCreate method");
        }
    }

    public static void i(b bVar) {
        boolean z;
        synchronized (f1468a) {
            k a2 = a();
            if (h.a.a.p.b.a.f.f(a2.d, bVar.a)) {
                z = false;
            } else {
                a2.d = bVar.a;
                z = true;
            }
        }
        if (z) {
            h(new w(-4, false, (String) null, (Integer) null, bVar, (t) null));
        }
    }

    public static void k(bc bcVar, v vVar) {
        long j2 = vVar.a;
        if (j2 != 0) {
            String b = com.google.android.libraries.search.t.k.a.b(j2);
            bcVar.copyOnWrite();
            hb hbVar = bcVar.instance;
            hb hbVar2 = hb.a;
            b.getClass();
            hbVar.b |= 4;
            hbVar.o = b;
        }
        long j3 = vVar.b;
        if (j3 != 0) {
            bcVar.copyOnWrite();
            hb hbVar3 = bcVar.instance;
            hb hbVar4 = hb.a;
            hbVar3.b |= 16;
            hbVar3.q = j3;
        }
    }

    public final void j(hb hbVar, String str, ew ewVar, com.google.protos.ah.b.a aVar, String str2) {
        HashSet<l> hashSet;
        if (this.b == null) {
            h f = j.f();
            f.al(am.a);
            f.ak(8825);
            f.p("No EventLoggerStore set on EventLogger, event will be ignored.Initialize EventLogger in your Application#onCreate method");
            return;
        }
        long a2 = d.a();
        bc builder = hbVar.toBuilder();
        com.google.android.libraries.search.t.d.a.a(builder, this.h);
        synchronized (this.g) {
            hashSet = !this.g.isEmpty() ? new HashSet(this.g) : null;
        }
        hb build = builder.build();
        if (hashSet != null) {
            for (l lVar : hashSet) {
                if (lVar.b()) {
                    try {
                        lVar.a();
                    } catch (RuntimeException e) {
                        a.a.dB(j.e(), "Something went wrong in EventLoggedCallback.", (char) 8824, e);
                    }
                }
            }
        }
        f c = this.b.c(build, ewVar, aVar, str2);
        Queue queue = this.e;
        long j2 = build.ag;
        y yVar = null;
        if ((build.h & 131072) != 0) {
            w wVar = build.aK;
            w wVar2 = wVar;
            if (wVar == null) {
                wVar2 = w.a;
            }
            y a3 = y.a(wVar2.e);
            yVar = a3;
            if (a3 == null) {
                yVar = y.a;
            }
        }
        queue.add(new n(c, j2, str, yVar));
        com.google.android.apps.gsa.w.a.e eVar = this.i;
        if (eVar != null) {
            com.google.android.apps.gsa.w.b.b(eVar, a2);
        }
    }
}
