package com.google.android.apps.gsa.search.core.h;

import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.common.b.mu;
import com.google.common.f.j;
import com.google.common.o.bl;
import com.google.common.o.bt;
import com.google.common.o.bv;
import com.google.common.o.qn;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.cb;
import com.google.protobuf.ce;
import e.a;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/p.class */
public class p extends r implements b {
    public static final int d = 0;
    private static final j i = j.i("com.google.android.apps.gsa.search.core.h.p");

    /* renamed from: a, reason: collision with root package name */
    protected final List f1124a = new ArrayList();
    public final a b;
    public final n c;
    private final com.google.android.libraries.gsa.h.h j;

    public p(n nVar, a aVar, com.google.android.libraries.gsa.h.h hVar, Optional optional) {
        optional.isPresent();
        this.c = nVar;
        this.b = aVar;
        this.j = hVar;
        v(A(), a());
        hVar.p("ConfigFlagsListener.whenFlagsFirstAvailable delayed", Duration.ofMillis(1000L), new n(this));
    }

    private final e A() {
        byte[] e = this.c.e("gsa_config_server", null);
        if (e == null) {
            return e.f1120a;
        }
        try {
            return (e) bi.parseFrom(e.f1120a, e, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (ce e2) {
            a.a.dB(i.e(), "Couldn't load default configuration.", (char) 6620, e2);
            return e.f1120a;
        }
    }

    private static String B(Object obj, String str, boolean z) {
        String concat;
        if (obj == null) {
            concat = str.concat("null");
        } else if (obj instanceof String) {
            concat = str + "\"" + obj.toString() + "\"";
        } else {
            concat = str.concat(obj.toString());
        }
        String str2 = concat;
        if (z) {
            str2 = a.a.dC(concat, " [", "]");
        }
        return str2;
    }

    private static void C(StringBuilder sb, List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str);
            sb.append(':');
            sb.append(intValue);
        }
    }

    public static String b(Integer num, Object obj, Object obj2, Object obj3, Object obj4) {
        String concat;
        if (h.a.a.p.b.a.f.f(obj2, obj4)) {
            String concat2 = "".concat(B(obj4, "Local: ", false));
            String str = concat2;
            if (obj3 != null) {
                str = concat2.concat(B(obj3, "Server: ", true));
            }
            concat = str.concat(B(obj, "Default: ", true));
        } else if (h.a.a.p.b.a.f.f(obj2, obj3)) {
            concat = "".concat(B(obj3, "Server: ", false)).concat(B(obj, "Default: ", true));
        } else if (h.a.a.p.b.a.f.f(obj2, obj)) {
            concat = "".concat(B(obj, "Default: ", false));
        } else {
            com.google.common.f.h f = i.f();
            f.ak(6622);
            f.H("Source for flag %d value %s is unknown", num, obj2);
            String concat3 = "".concat(B(obj2, "UNKNOWN SOURCE: ", false));
            String str2 = concat3;
            if (obj4 != null) {
                str2 = concat3.concat(B(obj4, "Local: ", true));
            }
            String str3 = str2;
            if (obj3 != null) {
                str3 = str2.concat(B(obj3, "Server: ", true));
            }
            concat = str3.concat(B(obj, "Default: ", true));
        }
        return concat;
    }

    public final e a() {
        byte[] e = this.c.e("gsa_config_overrides", null);
        if (e == null) {
            return e.f1120a;
        }
        try {
            return (e) bi.parseFrom(e.f1120a, e, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (ce e2) {
            a.a.dB(i.e(), "Couldn't load local configuration.", (char) 6621, e2);
            return e.f1120a;
        }
    }

    public final void c(o oVar) {
        synchronized (this.f1124a) {
            this.f1124a.add(oVar);
        }
    }

    public final void e(Supplier supplier, e eVar) {
        ArrayList arrayList;
        synchronized (this.f1124a) {
            arrayList = new ArrayList(this.f1124a);
        }
        this.j.n("GsaConfigFlags.notifyListenerAndSave", new m(this, supplier, arrayList, eVar));
    }

    public final void f(o oVar) {
        synchronized (this.f1124a) {
            this.f1124a.remove(oVar);
        }
    }

    public final void g() {
        e(v(A(), a()), null);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        ba createBuilder = bv.a.createBuilder();
        List k = mu.a.k(u());
        createBuilder.copyOnWrite();
        bv bvVar = createBuilder.instance;
        bs bsVar = bvVar.c;
        if (!bsVar.c()) {
            bvVar.c = bi.mutableCopy(bsVar);
        }
        com.google.protobuf.c.addAll(k, bvVar.c);
        List k2 = mu.a.k(this.g.f);
        createBuilder.copyOnWrite();
        bv bvVar2 = createBuilder.instance;
        bs bsVar2 = bvVar2.d;
        if (!bsVar2.c()) {
            bvVar2.d = bi.mutableCopy(bsVar2);
        }
        com.google.protobuf.c.addAll(k2, bvVar2.d);
        HashMap hashMap = new HashMap();
        for (f fVar2 : this.g.c) {
            hashMap.put(Integer.valueOf(fVar2.f), fVar2);
        }
        HashMap hashMap2 = new HashMap();
        for (f fVar3 : this.h.c) {
            hashMap2.put(Integer.valueOf(fVar3.f), fVar3);
        }
        List list = (List) Collection._EL.stream(this.f.values()).filter(new j()).map(new k(hashMap, hashMap2)).sorted(Comparator._CC.comparing(new l())).collect(Collectors.toList());
        createBuilder.copyOnWrite();
        bv bvVar3 = createBuilder.instance;
        cb cbVar = bvVar3.b;
        if (!cbVar.c()) {
            bvVar3.b = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(list, bvVar3.b);
        bv build = createBuilder.build();
        ba createBuilder2 = bt.a.createBuilder();
        createBuilder2.copyOnWrite();
        bt btVar = createBuilder2.instance;
        build.getClass();
        btVar.c = build;
        btVar.b |= 1;
        String s = s();
        if (s != null) {
            createBuilder2.copyOnWrite();
            bt btVar2 = createBuilder2.instance;
            btVar2.b |= 2;
            btVar2.f = s;
        }
        bt build2 = createBuilder2.build();
        qn qnVar = fVar.c;
        qnVar.copyOnWrite();
        bl blVar = qnVar.instance;
        bl blVar2 = bl.a;
        build2.getClass();
        blVar.f = build2;
        blVar.b |= 4;
        StringBuilder sb = new StringBuilder();
        C(sb, build2.d, "gws");
        bv bvVar4 = build2.c;
        bv bvVar5 = bvVar4;
        if (bvVar4 == null) {
            bvVar5 = bv.a;
        }
        C(sb, bvVar5.c, "client");
        C(sb, this.g.f, "trigger");
        fVar.j("experiments", sb.toString());
    }
}
