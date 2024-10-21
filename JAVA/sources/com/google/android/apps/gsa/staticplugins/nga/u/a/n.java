package com.google.android.apps.gsa.staticplugins.nga.u.a;

import com.google.android.libraries.mdi.download.aw;
import com.google.android.libraries.mdi.download.ax;
import com.google.android.libraries.mdi.download.bz;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.oo;
import com.google.common.b.qj;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.bv;
import com.google.protobuf.c;
import com.google.protobuf.cb;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final bz f1710a;
    private final com.google.android.libraries.gsa.h.h b;

    public n(bz bzVar, com.google.android.libraries.gsa.h.h hVar) {
        this.f1710a = bzVar;
        this.b = hVar;
    }

    public final cn a() {
        aw a2 = ax.a();
        a2.d(true);
        return this.b.k(this.f1710a.h(a2.a()), "[NGA] MddBreakDownGenerator.allGroupsFuture", new com.google.android.libraries.gsa.h.d() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.j
            @Override // com.google.android.libraries.gsa.h.d
            public final Object a(Object obj) {
                fl flVar = (fl) obj;
                HashMap hashMap = new HashMap();
                int size = flVar.size();
                for (int i = 0; i < size; i++) {
                    com.google.android.libraries.mdi.e eVar = (com.google.android.libraries.mdi.e) flVar.get(i);
                    com.google.android.libraries.mdi.d a3 = com.google.android.libraries.mdi.d.a(eVar.g);
                    com.google.android.libraries.mdi.d dVar = a3;
                    if (a3 == null) {
                        dVar = com.google.android.libraries.mdi.d.UNSPECIFIED;
                    }
                    if (dVar == com.google.android.libraries.mdi.d.DOWNLOADED) {
                        ArrayList arrayList = (ArrayList) Optional.ofNullable((ArrayList) hashMap.get(eVar.c)).orElseGet(new Supplier() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.k
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        });
                        arrayList.add(eVar);
                        hashMap.put(eVar.c, arrayList);
                    }
                }
                fu fuVar = (fu) Collection._EL.stream(hashMap.entrySet()).collect(bs.e(new g(5), new g(6), new l(0)));
                gy gyVar = new gy();
                HashSet hashSet = new HashSet();
                qj j = fuVar.v().j();
                while (j.hasNext()) {
                    ha haVar = (ha) Collection._EL.stream((ha) ((Map.Entry) j.next()).getValue()).map(new g(1)).flatMap(new g(3)).collect(bs.b);
                    gyVar.j(oo.c(hashSet, haVar));
                    hashSet.addAll(haVar);
                }
                ha g = gyVar.g();
                HashMap hashMap2 = new HashMap();
                ba createBuilder = b.f1702a.createBuilder();
                ArrayList arrayList2 = new ArrayList();
                qj j2 = fuVar.v().j();
                while (j2.hasNext()) {
                    Map.Entry entry = (Map.Entry) j2.next();
                    fu fuVar2 = (fu) Collection._EL.stream((ha) entry.getValue()).flatMap(new g(7)).filter(new Predicate(new ConcurrentHashMap()) { // from class: com.google.android.apps.gsa.nga.shared.e.b

                        /* renamed from: a, reason: collision with root package name */
                        public final Map f857a;

                        {
                            this.f857a = r4;
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate._CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate negate() {
                            return Predicate._CC.$default$negate(this);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                            return Predicate._CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return !Boolean.TRUE.equals(Map._EL.putIfAbsent(this.f857a, Optional.ofNullable(((com.google.android.libraries.mdi.a) obj2).d), true));
                        }
                    }).collect(bs.e(new g(4), new g(0), new l(1)));
                    final int i2 = 0;
                    long sum = Collection._EL.stream(fuVar2.g()).mapToLong(new ToLongFunction(i2) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.m

                        /* renamed from: a, reason: collision with root package name */
                        private final int f1709a;

                        {
                            this.f1709a = i2;
                        }

                        @Override // java.util.function.ToLongFunction
                        public final long applyAsLong(Object obj2) {
                            return this.f1709a != 0 ? ((Integer) ((Map.Entry) obj2).getValue()).longValue() : ((Integer) obj2).longValue();
                        }
                    }).sum();
                    final int i3 = 1;
                    long sum2 = Collection._EL.stream(fuVar2.v()).filter(new java.util.function.Predicate(g) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.h

                        /* renamed from: a, reason: collision with root package name */
                        public final ha f1707a;

                        {
                            this.f1707a = g;
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                            return Predicate._CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate negate() {
                            return Predicate._CC.$default$negate(this);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                            return Predicate._CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return this.f1707a.contains(((Map.Entry) obj2).getKey());
                        }
                    }).mapToLong(new ToLongFunction(i3) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.m

                        /* renamed from: a, reason: collision with root package name */
                        private final int f1709a;

                        {
                            this.f1709a = i3;
                        }

                        @Override // java.util.function.ToLongFunction
                        public final long applyAsLong(Object obj2) {
                            return this.f1709a != 0 ? ((Integer) ((Map.Entry) obj2).getValue()).longValue() : ((Integer) obj2).longValue();
                        }
                    }).sum();
                    ha haVar2 = (ha) Collection._EL.stream((ha) entry.getValue()).map(new g(2)).collect(bs.b);
                    hashMap2.putAll(fuVar2);
                    ba createBuilder2 = a.f1698a.createBuilder();
                    String str = (String) entry.getKey();
                    createBuilder2.copyOnWrite();
                    a aVar = (a) createBuilder2.instance;
                    str.getClass();
                    aVar.b |= 1;
                    aVar.c = str;
                    createBuilder2.copyOnWrite();
                    a aVar2 = (a) createBuilder2.instance;
                    aVar2.b = 2 | aVar2.b;
                    aVar2.e = sum;
                    createBuilder2.copyOnWrite();
                    a aVar3 = (a) createBuilder2.instance;
                    aVar3.b |= 4;
                    aVar3.f = sum2;
                    createBuilder2.copyOnWrite();
                    a aVar4 = (a) createBuilder2.instance;
                    bv bvVar = aVar4.d;
                    if (!bvVar.c()) {
                        aVar4.d = bi.mutableCopy(bvVar);
                    }
                    c.addAll(haVar2, aVar4.d);
                    arrayList2.add((a) createBuilder2.build());
                }
                Collections.sort(arrayList2, Comparator._EL.reversed(new java.util.Comparator() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.i
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return Long.compare(((a) obj2).e, ((a) obj3).e);
                    }
                }));
                createBuilder.copyOnWrite();
                b bVar = (b) createBuilder.instance;
                cb cbVar = bVar.d;
                if (!cbVar.c()) {
                    bVar.d = bi.mutableCopy(cbVar);
                }
                c.addAll(arrayList2, bVar.d);
                final int i4 = 0;
                long sum3 = Collection._EL.stream(hashMap2.values()).mapToLong(new ToLongFunction(i4) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.m

                    /* renamed from: a, reason: collision with root package name */
                    private final int f1709a;

                    {
                        this.f1709a = i4;
                    }

                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj2) {
                        return this.f1709a != 0 ? ((Integer) ((Map.Entry) obj2).getValue()).longValue() : ((Integer) obj2).longValue();
                    }
                }).sum();
                createBuilder.copyOnWrite();
                b bVar2 = (b) createBuilder.instance;
                bVar2.b |= 1;
                bVar2.c = sum3;
                return (b) createBuilder.build();
            }
        });
    }
}
