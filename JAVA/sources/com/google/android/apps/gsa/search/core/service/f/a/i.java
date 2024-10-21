package com.google.android.apps.gsa.search.core.service.f.a;

import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.base.at;
import com.google.common.f.j;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/f/a/i.class */
public final class i implements com.google.android.apps.gsa.shared.util.debug.a.g {
    private static final j f = j.i("com.google.android.apps.gsa.search.core.service.f.a.i");

    /* renamed from: a, reason: collision with root package name */
    public final Object f1201a = new Object();
    public fl b;
    public final Map c;
    public final SortedMap d;
    public boolean e;
    private final g g;

    public i(g gVar, b bVar) {
        int i = fl.e;
        this.b = ni.a;
        this.c = new HashMap();
        this.d = new ConcurrentSkipListMap(new Comparator() { // from class: com.google.android.apps.gsa.search.core.service.f.a.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                int compareTo = str.compareTo(str2);
                int i2 = compareTo;
                if (compareTo != 0) {
                    if (str.equals("module")) {
                        i2 = -1;
                    } else {
                        if (str2.equals("module")) {
                            return 1;
                        }
                        i2 = compareTo;
                    }
                }
                return i2;
            }
        });
        this.e = false;
        this.g = gVar;
        b(bVar);
    }

    private final void e(com.google.android.apps.gsa.search.core.service.f.b bVar) {
        ni niVar;
        synchronized (this.f1201a) {
            niVar = this.b;
        }
        if (niVar != null) {
            for (int i = 0; i < niVar.d; i++) {
                ((com.google.android.apps.gsa.search.core.service.f.c) niVar.get(i)).a(bVar);
            }
        }
    }

    public final at a(String str) {
        if (!this.e) {
            com.google.android.apps.gsa.search.core.service.f.b.a aVar = (com.google.android.apps.gsa.search.core.service.f.b.a) this.d.get(str);
            return aVar != null ? at.k(aVar) : at.j((com.google.android.apps.gsa.search.core.service.f.b) this.c.get(str));
        }
        com.google.common.f.h e = f.e();
        e.ak(7397);
        e.p("getWorker() is called after WorkerRegistry disposal.");
        return com.google.common.base.a.a;
    }

    public final void b(com.google.android.apps.gsa.search.core.service.f.b bVar) {
        if (this.e) {
            com.google.common.f.h e = f.e();
            e.ak(7398);
            e.p("registerWorker() is called after WorkerRegistry disposal.");
            return;
        }
        String id = bVar.id();
        if (this.c.containsKey(id)) {
            return;
        }
        this.c.put(id, bVar);
        if (!(bVar instanceof com.google.android.apps.gsa.search.core.service.f.b.a)) {
            e(bVar);
            return;
        }
        g gVar = this.g;
        com.google.android.apps.gsa.search.core.service.f.b.a aVar = (com.google.android.apps.gsa.search.core.service.f.b.a) bVar;
        com.google.android.apps.gsa.search.core.af.c cVar = new com.google.android.apps.gsa.search.core.af.c(aVar, gVar.b.f(com.google.android.apps.gsa.s.a.WORKER_LATENCY_MICROS, aVar.d));
        this.d.put(id, cVar);
        e(cVar);
    }

    public final void c(com.google.android.apps.gsa.search.core.service.f.c cVar) {
        synchronized (this.f1201a) {
            ni niVar = this.b;
            if (niVar == null) {
                com.google.common.f.h e = f.e();
                e.ak(7399);
                e.p("registerWorkerLoadedListener() is called after WorkerRegistry disposal.");
            } else {
                fg h = fl.h(niVar.d + 1);
                h.i(niVar);
                h.h(cVar);
                this.b = h.g();
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkerRegistry");
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            fVar.m((com.google.android.apps.gsa.search.core.service.f.b) it.next());
        }
    }
}
