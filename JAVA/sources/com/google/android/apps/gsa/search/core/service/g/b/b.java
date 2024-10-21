package com.google.android.apps.gsa.search.core.service.g.b;

import com.google.android.apps.gsa.search.core.service.g.b.a.a.h;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/b.class */
public final class b implements com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.search.core.service.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1215a = j.i("com.google.android.apps.gsa.search.core.service.g.b.b");
    public final ConcurrentMap b = new ConcurrentHashMap();
    public volatile boolean c;
    private final com.google.android.apps.gsa.search.core.service.g.b.a.b d;
    private final a e;

    public b(com.google.android.apps.gsa.search.core.service.g.b.a.b bVar, a aVar) {
        this.d = bVar;
        this.e = aVar;
    }

    private final com.google.android.apps.gsa.search.core.service.g.b.a.a e(String str) {
        com.google.android.apps.gsa.search.core.service.g.b.a.a aVar = (com.google.android.apps.gsa.search.core.service.g.b.a.a) this.b.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.android.apps.gsa.search.core.service.g.b.a.b bVar = this.d;
        str.getClass();
        h hVar = (h) bVar.f1214a.a();
        hVar.getClass();
        com.google.android.apps.gsa.search.core.service.g.b.a.a aVar2 = new com.google.android.apps.gsa.search.core.service.g.b.a.a(str, hVar);
        com.google.android.apps.gsa.search.core.service.g.b.a.a aVar3 = (com.google.android.apps.gsa.search.core.service.g.b.a.a) this.b.putIfAbsent(str, aVar2);
        return aVar3 != null ? aVar3 : aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.service.b.a
    public final void a() {
        synchronized (this) {
            if (!this.c) {
                com.google.common.f.h d = f1215a.d();
                d.aj(e.a, "WorkerManager");
                com.google.common.f.h hVar = d;
                hVar.ak(7404);
                hVar.p("dispose()");
                this.c = true;
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    ((com.google.android.apps.gsa.search.core.service.g.b.a.a) ((Map.Entry) it.next()).getValue()).a();
                }
            }
        }
    }

    public final cn b(String str) {
        if (this.c) {
            ab abVar = e.a;
            return dl.m(new com.google.android.apps.gsa.search.core.service.b.b("WorkerManager is disposed"));
        }
        ab abVar2 = e.a;
        return e(str).b();
    }

    public final void c(com.google.android.apps.gsa.search.core.service.f.b bVar) {
        if (this.c) {
            ab abVar = e.a;
            return;
        }
        String id = bVar.id();
        ab abVar2 = e.a;
        e(id).c();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("WorkerManagerImpl");
        fVar.k(this.e);
        TreeMap treeMap = new TreeMap(this.b);
        fVar.b("number of workers").a(new d(Integer.valueOf(treeMap.size()), false));
        for (Map.Entry entry : treeMap.entrySet()) {
            fVar.n((String) entry.getKey(), (com.google.android.apps.gsa.shared.util.debug.a.a) entry.getValue());
        }
    }
}
