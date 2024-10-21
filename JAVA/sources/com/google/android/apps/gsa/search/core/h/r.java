package com.google.android.apps.gsa.search.core.h;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.k.aa;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.k.g;
import com.google.android.apps.gsa.shared.util.aj;
import com.google.android.apps.gsa.w.a;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.oo;
import com.google.common.f.j;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ba;
import com.google.protobuf.cb;
import com.google.protobuf.ce;
import com.google.protobuf.df;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/r.class */
public class r implements com.google.android.apps.gsa.shared.k.c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1126a = j.i("com.google.android.apps.gsa.search.core.h.r");
    public static volatile a e = null;
    private volatile boolean b = false;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public volatile Map f = new HashMap();
    public volatile e g = e.f1120a;
    public volatile e h = e.f1120a;

    private final void a(int i) {
        a aVar = e;
        if (!this.b || aVar == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (concurrentHashMap.get(valueOf) == null && this.c.putIfAbsent(valueOf, true) == null) {
            com.google.android.apps.gsa.s.a aVar2 = com.google.android.apps.gsa.s.a.EXPERIMENT_FLAG_ACCESS_COUNT;
            com.google.android.apps.gsa.s.c cVar = com.google.android.apps.gsa.s.c.CLASSIC_USAGE_ANALYSIS;
            aVar.h(aVar2, cVar, cVar, i).g(1L);
        }
    }

    private final boolean b(com.google.android.apps.gsa.shared.k.d dVar) {
        f fVar = (f) this.f.get(Integer.valueOf(dVar.f1434a));
        return fVar != null ? fVar.c == 2 ? ((Boolean) fVar.d).booleanValue() : false : dVar.b;
    }

    protected static final void z(String str, int i, RuntimeException runtimeException) {
        com.google.common.f.h g = f1126a.f().g(runtimeException);
        g.ak(6629);
        g.F("Failed to decode %s for flag: %d", str, i);
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final double h(com.google.android.apps.gsa.shared.k.e eVar) {
        a(eVar.f1441a);
        f fVar = (f) this.f.get(Integer.valueOf(eVar.f1441a));
        return fVar != null ? fVar.c == 7 ? ((Double) fVar.d).doubleValue() : 0.0d : eVar.b;
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final long i(com.google.android.apps.gsa.shared.k.f fVar) {
        a(fVar.f1451a);
        f fVar2 = (f) this.f.get(Integer.valueOf(fVar.f1451a));
        return fVar2 != null ? fVar2.c == 4 ? ((Long) fVar2.d).longValue() : 0L : fVar.b;
    }

    public final e j() {
        ba createBuilder = e.f1120a.createBuilder();
        long j = this.g.d;
        createBuilder.copyOnWrite();
        e eVar = (e) createBuilder.instance;
        eVar.b |= 1;
        eVar.d = j;
        createBuilder.bV(u());
        createBuilder.bW(this.f.values());
        return (e) createBuilder.build();
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final fl k(com.google.android.apps.gsa.shared.k.h hVar) {
        fl b;
        a(hVar.f1453a);
        try {
            fl flVar = (fl) this.d.get(Integer.valueOf(hVar.f1453a));
            if (flVar != null) {
                if (!flVar.isEmpty()) {
                }
                return flVar;
            }
        } catch (ClassCastException e2) {
            aus.b(f1126a.f(), "Wrong cached type for flag %s", hVar, (char) 6623, e2);
        }
        f fVar = (f) this.f.get(Integer.valueOf(hVar.f1453a));
        if (fVar != null) {
            try {
                b = b.b(fVar.c == 3 ? (String) fVar.d : "");
            } catch (RuntimeException e3) {
                z("int array", hVar.f1453a, e3);
            }
            this.d.put(Integer.valueOf(hVar.f1453a), b);
            return b;
        }
        b = b.b(hVar.b);
        this.d.put(Integer.valueOf(hVar.f1453a), b);
        return b;
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final fl l(com.google.android.apps.gsa.shared.k.h hVar) {
        fl c;
        a(hVar.f1453a);
        try {
            fl flVar = (fl) this.d.get(Integer.valueOf(hVar.f1453a));
            if (flVar != null) {
                if (!flVar.isEmpty()) {
                }
                return flVar;
            }
        } catch (ClassCastException e2) {
            aus.b(f1126a.f(), "Wrong cached type for flag %s", hVar, (char) 6624, e2);
        }
        f fVar = (f) this.f.get(Integer.valueOf(hVar.f1453a));
        if (fVar != null) {
            try {
                c = b.c(fVar.c == 3 ? (String) fVar.d : "");
            } catch (NumberFormatException e3) {
                z("long array", hVar.f1453a, e3);
            }
            this.d.put(Integer.valueOf(hVar.f1453a), c);
            return c;
        }
        c = b.c(hVar.b);
        this.d.put(Integer.valueOf(hVar.f1453a), c);
        return c;
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final fl m(com.google.android.apps.gsa.shared.k.h hVar) {
        a(hVar.f1453a);
        try {
            fl flVar = (fl) this.d.get(Integer.valueOf(hVar.f1453a));
            if (flVar != null) {
                if (!flVar.isEmpty()) {
                }
                return flVar;
            }
        } catch (ClassCastException e2) {
            aus.b(f1126a.f(), "Wrong cached type for flag %s", hVar, (char) 6625, e2);
        }
        f fVar = (f) this.f.get(Integer.valueOf(hVar.f1453a));
        String str = fVar != null ? fVar.c == 3 ? (String) fVar.d : "" : hVar.b;
        Map map = this.d;
        fl d = b.d(str);
        map.put(Integer.valueOf(hVar.f1453a), d);
        return d;
    }

    public final fu n(com.google.android.apps.gsa.shared.k.h hVar) {
        fu fuVar;
        fu b;
        a(hVar.f1453a);
        try {
            fuVar = (fu) this.d.get(Integer.valueOf(hVar.f1453a));
        } catch (ClassCastException e2) {
            aus.b(f1126a.f(), "Wrong cached type for flag %s", hVar, (char) 6626, e2);
            fuVar = null;
        }
        fu fuVar2 = fuVar;
        if (fuVar == null) {
            f fVar = (f) this.f.get(Integer.valueOf(hVar.f1453a));
            if (fVar != null) {
                try {
                    b = b.f1407a.b(fVar.c == 3 ? (String) fVar.d : "");
                } catch (RuntimeException e3) {
                    z("Integer Map", hVar.f1453a, e3);
                }
                this.d.put(Integer.valueOf(hVar.f1453a), b);
                fuVar2 = b;
            }
            b = b.f1407a.b(hVar.b);
            this.d.put(Integer.valueOf(hVar.f1453a), b);
            fuVar2 = b;
        }
        return fuVar2;
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final fu o(com.google.android.apps.gsa.shared.k.h hVar) {
        fu fuVar;
        fu a2;
        a(hVar.f1453a);
        try {
            fuVar = (fu) this.d.get(Integer.valueOf(hVar.f1453a));
        } catch (ClassCastException e2) {
            aus.b(f1126a.f(), "Wrong cached type for flag %s", hVar, (char) 6627, e2);
            fuVar = null;
        }
        fu fuVar2 = fuVar;
        if (fuVar == null) {
            f fVar = (f) this.f.get(Integer.valueOf(hVar.f1453a));
            if (fVar != null) {
                try {
                    a2 = b.f1407a.a(fVar.c == 3 ? (String) fVar.d : "");
                } catch (RuntimeException e3) {
                    z("String Map", hVar.f1453a, e3);
                }
                this.d.put(Integer.valueOf(hVar.f1453a), a2);
                fuVar2 = a2;
            }
            a2 = b.f1407a.a(hVar.b);
            this.d.put(Integer.valueOf(hVar.f1453a), a2);
            fuVar2 = a2;
        }
        return fuVar2;
    }

    public final com.google.protobuf.v p(g gVar) {
        f fVar = (f) this.f.get(Integer.valueOf(gVar.f1452a));
        if (fVar == null) {
            return null;
        }
        return fVar.c == 6 ? (com.google.protobuf.v) fVar.d : com.google.protobuf.v.b;
    }

    public final MessageLite q(g gVar, df dfVar) {
        a(gVar.f1452a);
        MessageLite messageLite = (MessageLite) this.d.get(Integer.valueOf(gVar.f1452a));
        if (messageLite != null) {
            return messageLite;
        }
        f fVar = (f) this.f.get(Integer.valueOf(gVar.f1452a));
        if (fVar == null) {
            return null;
        }
        try {
            MessageLite messageLite2 = (MessageLite) dfVar.j(fVar.c == 6 ? (com.google.protobuf.v) fVar.d : com.google.protobuf.v.b, ExtensionRegistryLite.getGeneratedRegistry());
            this.d.put(Integer.valueOf(gVar.f1452a), messageLite2);
            return messageLite2;
        } catch (ce e2) {
            com.google.common.f.h e3 = f1126a.e();
            e3.ak(6628);
            e3.q("Malformed proto data from Heterodyne for flag %s.", gVar.f1452a);
            return null;
        }
    }

    public final String r() {
        e eVar = this.h;
        if ((eVar.b & 2) == 0) {
            e eVar2 = this.g;
            eVar = eVar2;
            if ((eVar2.b & 2) == 0) {
                return null;
            }
        }
        return eVar.g;
    }

    public final String s() {
        if (this.g.e.size() == 0 || w(en.b)) {
            return this.g.g;
        }
        return null;
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final String t(com.google.android.apps.gsa.shared.k.h hVar) {
        a(hVar.f1453a);
        f fVar = (f) this.f.get(Integer.valueOf(hVar.f1453a));
        return fVar != null ? fVar.c == 3 ? (String) fVar.d : "" : hVar.b;
    }

    @Deprecated
    public final List u() {
        e eVar = this.h;
        return eVar.e.size() > 0 ? eVar.e : this.g.e;
    }

    public final Supplier v(e eVar, e eVar2) {
        final HashMap B = oo.B(eVar.c.size() + eVar2.c.size());
        for (f fVar : eVar.c) {
            B.put(Integer.valueOf(fVar.f), fVar);
        }
        for (f fVar2 : eVar2.c) {
            B.put(Integer.valueOf(fVar2.f), fVar2);
        }
        final cb cbVar = this.h.c;
        final Map map = this.f;
        Supplier supplier = new Supplier(cbVar, B, map) { // from class: com.google.android.apps.gsa.search.core.h.q

            /* renamed from: a, reason: collision with root package name */
            public final List f1125a;
            public final Map b;
            public final Map c;

            {
                this.f1125a = cbVar;
                this.b = B;
                this.c = map;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                Map map2;
                gy gyVar = new gy();
                gy gyVar2 = new gy();
                Iterator it = this.f1125a.iterator();
                while (true) {
                    map2 = this.b;
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar3 = (f) it.next();
                    if (!map2.containsKey(Integer.valueOf(fVar3.f))) {
                        gyVar2.h(Integer.valueOf(fVar3.f));
                    }
                }
                for (f fVar4 : map2.values()) {
                    Map map3 = this.c;
                    f fVar5 = (f) map3.get(Integer.valueOf(fVar4.f));
                    if (fVar5 == null) {
                        gyVar.h(Integer.valueOf(fVar4.f));
                    } else {
                        if (fVar4.c == 2) {
                            if (((Boolean) fVar4.d).booleanValue() != (fVar5.c == 2 ? ((Boolean) fVar5.d).booleanValue() : false)) {
                                gyVar2.h(Integer.valueOf(fVar4.f));
                            }
                        }
                        if (fVar4.c == 4) {
                            if (((Long) fVar4.d).longValue() != (fVar5.c == 4 ? ((Long) fVar5.d).longValue() : 0L)) {
                                gyVar2.h(Integer.valueOf(fVar4.f));
                            }
                        }
                        if (fVar4.c == 3) {
                            if (!((String) fVar4.d).equals(fVar5.c == 3 ? (String) fVar5.d : "")) {
                                gyVar2.h(Integer.valueOf(fVar4.f));
                            }
                        }
                        if (fVar4.c == 6) {
                            if (!((com.google.protobuf.v) fVar4.d).equals(fVar5.c == 6 ? (com.google.protobuf.v) fVar5.d : com.google.protobuf.v.b)) {
                                gyVar2.h(Integer.valueOf(fVar4.f));
                            }
                        }
                        if (fVar4.c == 7) {
                            if (((Double) fVar4.d).doubleValue() != (fVar5.c == 7 ? ((Double) fVar5.d).doubleValue() : 0.0d)) {
                                gyVar2.h(Integer.valueOf(fVar4.f));
                            }
                        }
                    }
                }
                return new i(gyVar.g(), gyVar2.g());
            }
        };
        this.g = eVar;
        this.h = eVar2;
        this.f = B;
        this.d.clear();
        this.b = b(aa.h);
        return supplier;
    }

    @Override // com.google.android.apps.gsa.shared.k.c
    public final boolean w(com.google.android.apps.gsa.shared.k.d dVar) {
        a(dVar.f1434a);
        return b(dVar);
    }

    public final boolean x() {
        return this.g.c.size() > 0;
    }

    public final boolean y(String str) {
        if (str == null) {
            return false;
        }
        return aj.b(str, m(en.e));
    }
}
