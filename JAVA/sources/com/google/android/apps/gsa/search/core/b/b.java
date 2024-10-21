package com.google.android.apps.gsa.search.core.b;

import com.google.cs.a.c.a.a.t;
import com.google.cs.a.c.a.a.v;
import com.google.cs.d.c;
import com.google.cs.d.e;
import com.google.protobuf.ba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/b/b.class */
public final class b {

    /* renamed from: a */
    private static final Comparator f1098a = new Comparator() { // from class: com.google.android.apps.gsa.search.core.b.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i;
            long j = ((com.google.cs.d.a) obj).instance.e;
            long j2 = ((com.google.cs.d.a) obj2).instance.e;
            if (j < j2) {
                i = -1;
            } else {
                if (j == j2) {
                    return 0;
                }
                i = 1;
            }
            return i;
        }
    };
    private c c;
    private final com.google.android.apps.gsa.search.core.ae.c.a d;
    private final List b = new ArrayList();
    private final Object e = new Object();

    public b(com.google.android.apps.gsa.search.core.ae.c.a aVar) {
        this.d = aVar;
    }

    private static boolean e(com.google.cs.d.a aVar) {
        return aVar.instance.g.size() > 0;
    }

    public final int a() {
        int size;
        synchronized (this.e) {
            size = this.b.size();
        }
        return size;
    }

    public final void b(com.google.cs.d.a aVar, boolean z, boolean z2) {
        if (z) {
            c();
        }
        synchronized (this.e) {
            this.b.add(aVar);
        }
        c cVar = aVar.instance;
        if ((cVar.b & 1024) != 0) {
            t tVar = cVar.i;
            t tVar2 = tVar;
            if (tVar == null) {
                tVar2 = t.a;
            }
            if (tVar2.e == 33 && z2) {
                c();
            }
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            if (!this.b.isEmpty()) {
                synchronized (this.e) {
                    Collections.sort(this.b, f1098a);
                    if (!e((com.google.cs.d.a) this.b.get(0))) {
                        int size = this.b.size();
                        int i = 1;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            com.google.cs.d.a aVar = (com.google.cs.d.a) this.b.get(i);
                            if (e(aVar)) {
                                this.b.remove(i);
                                this.b.add(0, aVar);
                                break;
                            }
                            i++;
                        }
                        if (!e((com.google.cs.d.a) this.b.get(0))) {
                            c cVar = this.c;
                            if (cVar != null) {
                                this.b.add(0, cVar.toBuilder());
                            }
                        }
                    }
                    com.google.cs.d.a aVar2 = (com.google.cs.d.a) this.b.get(0);
                    aVar2.copyOnWrite();
                    c cVar2 = aVar2.instance;
                    c cVar3 = c.a;
                    cVar2.b &= -9;
                    cVar2.f = 0L;
                    aVar2.copyOnWrite();
                    c cVar4 = aVar2.instance;
                    cVar4.i = null;
                    cVar4.b &= -1025;
                    long j = cVar4.e;
                    long j2 = cVar4.d;
                    int size2 = this.b.size();
                    for (int i2 = 1; i2 < size2; i2++) {
                        com.google.cs.d.a aVar3 = (com.google.cs.d.a) this.b.get(i2);
                        long j3 = i2;
                        aVar3.copyOnWrite();
                        c cVar5 = aVar3.instance;
                        cVar5.b |= 4;
                        cVar5.e = j3 + j;
                        long j4 = aVar2.instance.e;
                        aVar3.copyOnWrite();
                        c cVar6 = aVar3.instance;
                        cVar6.b |= 8;
                        cVar6.f = j4;
                        t tVar = cVar6.i;
                        t tVar2 = tVar;
                        if (tVar == null) {
                            tVar2 = t.a;
                        }
                        if (tVar2 != null) {
                            int i3 = tVar2.d;
                            int size3 = aVar2.instance.g.size();
                            if (i3 < 0 || i3 >= size3 || ((v) aVar2.instance.g.get(i3)).c != tVar2.c) {
                                ba builder = tVar2.toBuilder();
                                builder.copyOnWrite();
                                t tVar3 = builder.instance;
                                tVar3.b |= 2;
                                tVar3.d = -1;
                                aVar3.copyOnWrite();
                                c cVar7 = aVar3.instance;
                                t build = builder.build();
                                build.getClass();
                                cVar7.i = build;
                                cVar7.b |= 1024;
                            }
                        }
                        if (true == e(aVar3)) {
                            aVar2 = aVar3;
                        }
                        j2 = Math.max(aVar3.instance.d, j2 + 1);
                        aVar3.copyOnWrite();
                        c cVar8 = aVar3.instance;
                        cVar8.b |= 2;
                        cVar8.d = j2;
                    }
                    this.c = aVar2.build();
                }
                if (!e((com.google.cs.d.a) this.b.get(0))) {
                    return;
                }
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.cs.d.a) it.next()).build());
                }
                this.b.clear();
            }
            if (arrayList.isEmpty()) {
                return;
            }
            com.google.android.apps.gsa.search.core.ae.c.a aVar4 = this.d;
            ba createBuilder = e.a.createBuilder();
            createBuilder.copyOnWrite();
            e eVar = createBuilder.instance;
            eVar.a();
            com.google.protobuf.c.addAll(arrayList, eVar.d);
            aVar4.d(createBuilder);
        }
    }

    public final boolean d() {
        boolean isEmpty;
        synchronized (this.e) {
            isEmpty = this.b.isEmpty();
        }
        return isEmpty;
    }
}
