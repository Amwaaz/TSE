package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.state.b.a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.h;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.gf;
import com.google.common.b.gl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.base.ca;
import com.google.protobuf.bc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cp.class */
public abstract class cp implements a, com.google.android.apps.gsa.shared.util.debug.a.g, ad {
    private static final com.google.common.f.j g = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.cp");

    /* renamed from: a, reason: collision with root package name */
    protected final List f1267a;
    public final fl b;
    public final fl c;
    public final as d;
    public final BitSet e;
    public cd f;
    private final String h;
    private final com.google.android.apps.gsa.search.core.h.p i;
    private final cl j;
    private final com.google.android.apps.gsa.shared.o.a.a k;
    private final cc l;
    private final ca m;
    private final e.a n;
    private boolean o;
    private boolean p;
    private int q;
    private Throwable r;
    private final com.google.android.apps.gsa.shared.o.b.a.a s;

    public cp(com.google.android.apps.gsa.search.core.h.p pVar, ha haVar, e.a aVar, cc ccVar, cc ccVar2, com.google.android.apps.gsa.shared.o.a.a aVar2, com.google.android.apps.gsa.shared.o.b.a.a aVar3, String str) {
        this.i = pVar;
        this.n = aVar;
        fl g2 = haVar.g();
        this.b = g2;
        fg fgVar = new fg(4);
        int size = g2.size();
        for (int i = 0; i < size; i++) {
            cs csVar = (cs) g2.get(i);
            fgVar.h(csVar.a());
            com.google.common.base.cl.u(ccVar.f1260a.get(csVar.a().F));
        }
        this.c = fgVar.g();
        this.l = ccVar;
        this.d = new as();
        this.k = aVar2;
        this.s = aVar3;
        this.h = str;
        this.f1267a = null;
        this.j = new cm(this.f, ccVar2);
        this.e = new BitSet(250);
        this.m = com.google.common.base.cl.d(new ca(this) { // from class: com.google.android.apps.gsa.search.core.state.cj

            /* renamed from: a, reason: collision with root package name */
            public final cp f1265a;

            {
                this.f1265a = this;
            }

            public final Object a() {
                gf gfVar = new gf();
                int i2 = 0;
                while (true) {
                    ni niVar = this.f1265a.c;
                    if (i2 >= niVar.d) {
                        return gfVar.i();
                    }
                    cq cqVar = (cq) niVar.get(i2);
                    String[] hI = cqVar.hI();
                    if (hI != null) {
                        for (String str2 : hI) {
                            gfVar.l(str2, cqVar);
                        }
                    }
                    i2++;
                }
            }
        });
    }

    @Override // com.google.android.apps.gsa.search.core.state.b.a, com.google.android.apps.gsa.search.core.state.ad
    public final void c(Bundle bundle) {
        int i = 0;
        while (true) {
            ni niVar = this.c;
            if (i >= niVar.d) {
                return;
            }
            ((cq) niVar.get(i)).u(bundle);
            i++;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.ad
    public final void e() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        if (this.k.b()) {
            h.a("VelvetEventBus.resumeNotifications", this.k);
        }
        com.google.common.base.cl.u(this.p);
        this.p = false;
        if (!this.e.isEmpty()) {
            o(-1);
        }
        if (this.k.b()) {
            h.b(this.k);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.ad
    public final void f() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.common.base.cl.u(!this.p);
        this.p = true;
    }

    @Override // com.google.android.apps.gsa.search.core.state.ad
    public final boolean g() {
        return this.p;
    }

    @Override // com.google.android.apps.gsa.search.core.state.ad
    public final void h(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
        int i2 = 0;
        while (true) {
            ni niVar = this.c;
            if (i2 >= niVar.d) {
                return;
            }
            ((cq) niVar.get(i2)).hJ(vVar, i);
            i2++;
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("VelvetEventBus");
        fVar.b("Notifications suspended").a(new d(Boolean.valueOf(this.p), false));
        com.google.android.apps.gsa.shared.util.debug.a.f d = fVar.d((Object) null);
        d.q("Observers");
        ar arVar = new ar(this.d);
        while (arVar.hasNext()) {
            co coVar = (co) arVar.next();
            String canonicalName = coVar.getClass().getCanonicalName();
            String str = canonicalName;
            if (canonicalName == null) {
                str = coVar.getClass().getName();
            }
            if (coVar instanceof com.google.android.apps.gsa.shared.util.debug.a.g) {
                d.p(str, (com.google.android.apps.gsa.shared.util.debug.a.g) coVar);
            } else {
                d.b(str).a(com.google.android.apps.gsa.shared.util.b.e.c(coVar.toString()));
            }
        }
        ArrayList arrayList = new ArrayList((Collection) this.c);
        Collections.sort(arrayList, new ck());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fVar.m((cq) arrayList.get(i));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.ad
    public final void i(bc bcVar) {
        int i = 0;
        while (true) {
            ni niVar = this.c;
            if (i >= niVar.d) {
                return;
            }
            ((cq) niVar.get(i)).hK(bcVar);
            i++;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.b.a
    public final Bundle j(Query query) {
        Bundle bundle = new Bundle();
        int i = 0;
        while (true) {
            ni niVar = this.c;
            if (i >= niVar.d) {
                return bundle;
            }
            ((cq) niVar.get(i)).hG(query, bundle);
            i++;
        }
    }

    public final gl k() {
        return (gl) this.m.a();
    }

    public final EnumMap l() {
        EnumMap enumMap = new EnumMap(com.google.android.apps.gsa.search.shared.service.c.ac.class);
        int i = 0;
        while (true) {
            ni niVar = this.c;
            if (i >= niVar.d) {
                return enumMap;
            }
            cq cqVar = (cq) niVar.get(i);
            com.google.android.apps.gsa.search.shared.service.c.ac[] ab = cqVar.ab();
            if (ab != null) {
                for (com.google.android.apps.gsa.search.shared.service.c.ac acVar : ab) {
                    com.google.common.base.cl.y(!enumMap.containsKey(acVar), "Multiple states for ClientEvent %s", acVar);
                    enumMap.put((EnumMap) acVar, (com.google.android.apps.gsa.search.shared.service.c.ac) cqVar);
                }
            }
            i++;
        }
    }

    public final void m(co coVar) {
        com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        if (this.d.c(coVar)) {
            return;
        }
        this.d.b(coVar);
        if (this.p) {
            this.e.clear();
            this.e.or(((cm) this.j).b.b());
            return;
        }
        if (this.o) {
            coVar.b(this.j);
            return;
        }
        BitSet bitSet = this.e;
        com.google.common.base.cl.v(bitSet.isEmpty(), "Pending state changes should be empty but contains ".concat(bitSet.toString()));
        this.o = true;
        try {
            try {
                coVar.b(this.j);
                this.o = false;
                if (this.e.isEmpty()) {
                    return;
                }
                o(-1);
            } catch (Error | RuntimeException e) {
                ((com.google.android.apps.gsa.shared.logger.e) this.n.a()).c(e, 65371542);
                throw e;
            }
        } catch (Throwable th) {
            this.o = false;
            throw th;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.b.a
    public final void n(int i) {
        if (this.k.b()) {
            h.a(a.a.dA(i, "VelvetEventBus.notifyStateChanged "), this.k);
        }
        com.google.common.base.cl.v(this.l.f1260a.get(i), "State " + i + " notifying changed is not in " + String.valueOf(this.l));
        this.e.set(i);
        o(i);
        if (this.k.b()) {
            h.b(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        r4.e.or(r0.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r5) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.cp.o(int):void");
    }

    public final void p(co coVar) {
        com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        as asVar = this.d;
        int indexOf = asVar.f1241a.indexOf(coVar);
        if (indexOf == -1) {
            return;
        }
        if (asVar.b == 0) {
            asVar.f1241a.remove(coVar);
        } else {
            asVar.f1241a.set(indexOf, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(cl clVar) {
        this.e.or(((cm) clVar).b.b());
        o(-1);
    }

    public final boolean r() {
        return (this.p || this.o || !this.e.isEmpty()) ? false : true;
    }
}
