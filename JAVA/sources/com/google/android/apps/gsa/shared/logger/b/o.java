package com.google.android.apps.gsa.shared.logger.b;

import androidx.compose.ui.l.f;
import androidx.core.d.e$;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.hn;
import com.google.common.b.nr;
import com.google.common.b.oo;
import com.google.common.b.qj;
import com.google.common.base.at;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.o.bl;
import com.google.common.o.bn;
import com.google.common.o.bo;
import com.google.common.o.hb;
import com.google.common.o.qn;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.c;
import com.google.protobuf.cb;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/b/o.class */
public final class o implements com.google.android.apps.gsa.shared.util.debug.a.a {
    private final v b = new v();

    /* renamed from: a, reason: collision with root package name */
    public final Set f1462a = Collections.newSetFromMap(new ConcurrentHashMap());
    private final m c = new m();
    private volatile at d = com.google.common.base.a.a;

    public o(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar != null) {
                this.f1462a.add(new WeakReference(iVar));
            }
        }
    }

    private final void e(Consumer consumer) {
        Iterator it = this.f1462a.iterator();
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar == null) {
                it.remove();
            } else {
                e$.ExternalSyntheticApiModelOutline0.m(consumer, iVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.apps.gsa.shared.logger.b.b, java.lang.Object] */
    private final void f() {
        m mVar = this.c;
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) mVar.get(i);
            this.d.c().a(nVar.a, nVar.b);
        }
        this.c.clear();
    }

    public final void a(i iVar) {
        this.f1462a.add(new WeakReference(iVar));
        iVar.c(this.b.a());
    }

    public final void b(b bVar) {
        ab abVar = e.a;
        synchronized (this.c) {
            this.d = at.k(bVar);
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [com.google.android.apps.gsa.shared.logger.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.google.android.apps.gsa.shared.logger.b.b, java.lang.Object] */
    public final void c(com.google.android.libraries.gsa.e.a.a aVar) {
        d dVar;
        ha haVar;
        d a2;
        synchronized (this.b) {
            this.b.f1463a.add(aVar);
            e(new k(aVar, 2));
            if (g.b(aVar.a)) {
                e(new k(aVar, 0));
            }
            if (g.a(aVar.a)) {
                v vVar = this.b;
                s sVar = (s) g.a.get(aVar.a);
                if (sVar != null) {
                    gy l = ha.l(sVar.b.length);
                    int i = 0;
                    while (true) {
                        w[] wVarArr = sVar.b;
                        if (i >= wVarArr.length) {
                            break;
                        }
                        l.h(wVarArr[i]);
                        i++;
                    }
                    haVar = l.g();
                } else {
                    haVar = nr.a;
                }
                f.e(!haVar.isEmpty());
                Iterator descendingIterator = vVar.f1463a.descendingIterator();
                ((com.google.android.libraries.gsa.e.a.a) oo.ai(descendingIterator, new u(aVar, 1))).getClass();
                com.google.android.libraries.gsa.e.a.a aVar2 = (com.google.android.libraries.gsa.e.a.a) oo.ai(descendingIterator, new t(aVar, haVar));
                if (aVar2 == null) {
                    c cVar = new c();
                    cVar.c(y.b);
                    cVar.d(4);
                    cVar.b = aVar;
                    cVar.b(vVar.c(aVar));
                    a2 = cVar.a();
                } else {
                    w wVar = aVar2.a;
                    w wVar2 = aVar.a;
                    if (wVar == wVar2) {
                        c cVar2 = new c();
                        cVar2.c(y.b);
                        cVar2.d(6);
                        cVar2.b = aVar;
                        cVar2.b(vVar.c(aVar));
                        a2 = cVar2.a();
                    } else {
                        y a3 = q.a(wVar, wVar2);
                        Set set = (Set) vVar.b.get(aVar2);
                        if (set != null && set.contains(a3)) {
                            c cVar3 = new c();
                            cVar3.c(a3);
                            cVar3.d(5);
                            cVar3.a = aVar2;
                            cVar3.b = aVar;
                            cVar3.b(vVar.b(aVar2, aVar));
                            a2 = cVar3.a();
                        }
                        Set set2 = (Set) vVar.b.get(aVar2);
                        Set set3 = set2;
                        if (set2 == null) {
                            set3 = new HashSet();
                            vVar.b.put(aVar2, set3);
                        }
                        set3.add(a3);
                        c cVar4 = new c();
                        cVar4.c(a3);
                        cVar4.d(2);
                        cVar4.a = aVar2;
                        cVar4.b = aVar;
                        cVar4.b(vVar.b(aVar2, aVar));
                        a2 = cVar4.a();
                    }
                }
                v vVar2 = this.b;
                dVar = a2;
                if (vVar2.f1463a.size() > 1000) {
                    int size = vVar2.f1463a.size();
                    int i2 = 0;
                    while (true) {
                        dVar = a2;
                        if (i2 >= size - 1000) {
                            break;
                        }
                        vVar2.b.remove((com.google.android.libraries.gsa.e.a.a) vVar2.f1463a.pollFirst());
                        i2++;
                    }
                }
            } else {
                dVar = null;
            }
        }
        if (!g.a(aVar.a) || dVar == null) {
            return;
        }
        String str = aVar.e;
        bc createBuilder = hb.a.createBuilder();
        createBuilder.copyOnWrite();
        hb hbVar = createBuilder.instance;
        hbVar.b |= 2;
        hbVar.n = 883;
        int i3 = dVar.e;
        com.google.common.o.w a4 = r.a(dVar);
        if (i3 == 0) {
            throw null;
        }
        if (i3 == 2) {
            com.google.android.libraries.gsa.e.a.a aVar3 = dVar.b;
            if (aVar3 != null) {
                long millis = TimeUnit.NANOSECONDS.toMillis(dVar.c.b - aVar3.b);
                createBuilder.copyOnWrite();
                hb hbVar2 = createBuilder.instance;
                hbVar2.f = 4 | hbVar2.f;
                hbVar2.ae = millis;
            }
            createBuilder.copyOnWrite();
            hb hbVar3 = createBuilder.instance;
            a4.getClass();
            hbVar3.aK = a4;
            hbVar3.h |= 131072;
            e(new l(dVar.d, createBuilder));
        } else {
            createBuilder.copyOnWrite();
            hb hbVar4 = createBuilder.instance;
            a4.getClass();
            hbVar4.aK = a4;
            hbVar4.h |= 131072;
            hn hnVar = dVar.d;
            createBuilder.build();
            e(new k(hnVar, 1));
        }
        hb build = createBuilder.build();
        if (build.aK == null) {
            com.google.common.o.w wVar3 = com.google.common.o.w.a;
        }
        ab abVar = e.a;
        if (this.d.h()) {
            this.d.c().a(build, str);
            return;
        }
        synchronized (this.c) {
            if (this.d.h()) {
                f();
                this.d.c().a(build, str);
            } else {
                if (this.c.size() > 10) {
                    m mVar = this.c;
                    mVar.removeRange(0, mVar.size() - 10);
                }
                this.c.add(new n(build, str));
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        for (com.google.android.libraries.gsa.e.a.a aVar : this.b.f1463a.descendingSet()) {
            ba createBuilder = bo.a.createBuilder();
            com.google.common.o.v c = aVar.c();
            createBuilder.copyOnWrite();
            bo boVar = createBuilder.instance;
            c.getClass();
            boVar.c = c;
            boVar.b |= 1;
            qj j = aVar.d.v().j();
            while (j.hasNext()) {
                Map.Entry entry = (Map.Entry) j.next();
                ba createBuilder2 = bn.a.createBuilder();
                String str = (String) entry.getKey();
                createBuilder2.copyOnWrite();
                bn bnVar = createBuilder2.instance;
                str.getClass();
                bnVar.b |= 1;
                bnVar.c = str;
                String str2 = (String) entry.getValue();
                createBuilder2.copyOnWrite();
                bn bnVar2 = createBuilder2.instance;
                str2.getClass();
                bnVar2.b |= 2;
                bnVar2.d = str2;
                bn build = createBuilder2.build();
                createBuilder.copyOnWrite();
                bo boVar2 = createBuilder.instance;
                build.getClass();
                cb cbVar = boVar2.d;
                if (!cbVar.c()) {
                    boVar2.d = bi.mutableCopy(cbVar);
                }
                boVar2.d.add(build);
            }
            com.google.common.o.r rVar = aVar.c().e;
            com.google.common.o.r rVar2 = rVar;
            if (rVar == null) {
                rVar2 = com.google.common.o.r.a;
            }
            cb cbVar2 = rVar2.g;
            createBuilder.copyOnWrite();
            bo boVar3 = createBuilder.instance;
            cb cbVar3 = boVar3.e;
            if (!cbVar3.c()) {
                boVar3.e = bi.mutableCopy(cbVar3);
            }
            qn qnVar = fVar.c;
            c.addAll(cbVar2, boVar3.e);
            bo build2 = createBuilder.build();
            qnVar.copyOnWrite();
            bl blVar = qnVar.instance;
            bl blVar2 = bl.a;
            build2.getClass();
            cb cbVar4 = blVar.m;
            if (!cbVar4.c()) {
                blVar.m = bi.mutableCopy(cbVar4);
            }
            blVar.m.add(build2);
        }
    }
}
