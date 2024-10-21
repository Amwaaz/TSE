package com.google.android.apps.gsa.shared.v;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.libraries.g.a;
import com.google.common.o.bl;
import com.google.common.o.qn;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/v/ai.class */
public final class ai implements b {
    public final a b;
    public final boolean d;
    private final Queue e = new ConcurrentLinkedQueue();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1576a = new Object();
    private final SparseIntArray f = new SparseIntArray(32);
    private final SparseArray g = new SparseArray();
    private final SparseArray h = new SparseArray();
    private final SparseArray i = new SparseArray();
    private final SparseArray j = new SparseArray();
    private final SparseArray k = new SparseArray();
    private final SparseArray l = new SparseArray();
    public boolean c = false;

    public ai(a aVar, boolean z) {
        this.b = aVar;
        this.d = z;
    }

    static long a(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (true) {
            long j2 = j;
            if (!it.hasNext()) {
                return j2;
            }
            ag agVar = (ag) it.next();
            j = j2 + agVar.a.length() + agVar.b.length() + 4;
        }
    }

    static long b(String str, String str2, List list) {
        return a(list) + str2.length() + str.length() + 4;
    }

    private final void e(a aVar, SparseIntArray sparseIntArray, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, SparseArray sparseArray4, SparseArray sparseArray5, SparseArray sparseArray6) {
        synchronized (this.f1576a) {
            int i = aVar.b;
            sparseIntArray.put(i, sparseIntArray.get(i, 0) + 1);
            sparseArray3.put(i, Long.valueOf(aVar.f + ((Long) sparseArray3.get(i, 0L)).longValue()));
            sparseArray.put(i, Long.valueOf(aVar.e + ((Long) sparseArray.get(i, 0L)).longValue()));
            sparseArray4.put(i, Long.valueOf(aVar.c() + ((Long) sparseArray4.get(i, 0L)).longValue()));
            if (aVar.j != null) {
                sparseArray2.put(i, Long.valueOf(a(aVar.j.c) + ((Long) sparseArray2.get(i, 0L)).longValue()));
            }
            sparseArray5.put(i, Long.valueOf(aVar.g + ((Long) sparseArray5.get(i, 0L)).longValue()));
            sparseArray6.put(i, Long.valueOf(aVar.h + ((Long) sparseArray6.get(i, 0L)).longValue()));
        }
    }

    public final void c(a aVar) {
        synchronized (this.f1576a) {
            if (!this.c) {
                while (this.e.size() > 49) {
                    e((a) this.e.remove(), this.f, this.g, this.j, this.k, this.l, this.h, this.i);
                }
            }
            this.e.add(aVar);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        SparseIntArray clone;
        SparseArray clone2;
        SparseArray clone3;
        SparseArray clone4;
        SparseArray clone5;
        SparseArray clone6;
        SparseArray clone7;
        fVar.q("Recent HTTP requests");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f1576a) {
            clone = this.f.clone();
            clone2 = this.g.clone();
            clone3 = this.j.clone();
            clone4 = this.k.clone();
            clone5 = this.l.clone();
            clone6 = this.h.clone();
            clone7 = this.i.clone();
            for (a aVar : this.e) {
                arrayList.add(aVar);
                e(aVar, clone, clone2, clone3, clone4, clone5, clone6, clone7);
            }
        }
        int size = arrayList.size();
        qn qnVar = fVar.c;
        qnVar.copyOnWrite();
        bl blVar = qnVar.instance;
        bl blVar2 = bl.a;
        blVar.l = bl.emptyProtobufList();
        for (int i = 0; i < size; i++) {
            a aVar2 = (a) arrayList.get(i);
            aVar2.g(fVar.b(com.google.android.apps.gsa.shared.util.b.f.f(new Date(com.google.android.libraries.g.f.a(this.b, aVar2.a)))));
            synchronized (this.f1576a) {
                if (this.c) {
                    qnVar.ab(aVar2.e());
                } else {
                    qnVar.ab(aVar2.d());
                }
            }
        }
        for (int i2 = 0; i2 < clone.size(); i2++) {
            int keyAt = clone.keyAt(i2);
            fVar.s("tag %s; requests: %d; downloaded content bytes: %d; downloaded header bytes: %d; uploaded content bytes: %d; uploaded header bytes: %d; raw bytes received: %d; raw bytes sent: %d;", new e[]{new com.google.android.apps.gsa.shared.util.b.d(com.google.android.apps.gsa.plugins.a.a.a(keyAt), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(clone.get(keyAt, 0)), false), new com.google.android.apps.gsa.shared.util.b.d((Number) clone2.get(keyAt, 0L), false), new com.google.android.apps.gsa.shared.util.b.d((Number) clone3.get(keyAt, 0L), false), new com.google.android.apps.gsa.shared.util.b.d((Number) clone4.get(keyAt, 0L), false), new com.google.android.apps.gsa.shared.util.b.d((Number) clone5.get(keyAt, 0L), false), new com.google.android.apps.gsa.shared.util.b.d((Number) clone6.get(keyAt, 0L), false), new com.google.android.apps.gsa.shared.util.b.d((Number) clone7.get(keyAt, 0L), false)});
        }
    }
}
