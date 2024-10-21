package com.google.android.apps.gsa.shared.util.debug;

import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import e.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/debug/d.class */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final a f1554a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    public d(a aVar) {
        this.f1554a = aVar;
    }

    public final void a(b bVar) {
        synchronized (this.b) {
            this.b.add(bVar);
        }
    }

    public final void b(b bVar) {
        synchronized (this.b) {
            this.b.remove(bVar);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        ArrayList arrayList;
        Iterator it = ((Set) this.f1554a.a()).iterator();
        while (it.hasNext()) {
            fVar.l((b) it.next());
        }
        if (fVar.v()) {
            return;
        }
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fVar.l((b) arrayList.get(i));
        }
    }
}
