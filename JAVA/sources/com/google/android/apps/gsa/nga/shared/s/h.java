package com.google.android.apps.gsa.nga.shared.s;

import com.google.android.apps.gsa.shared.util.c.be;
import com.google.common.b.fl;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/h.class */
public final class h implements be {

    /* renamed from: a, reason: collision with root package name */
    final Object f1002a;
    private final int b;

    public /* synthetic */ h(a aVar, int i) {
        this.b = i;
        this.f1002a = aVar;
    }

    public h(i iVar, int i) {
        this.b = i;
        this.f1002a = iVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.be
    public final void hf(Object obj) {
        if (this.b == 0) {
            if (h.a.a.p.b.a.f.f(((i) this.f1002a).b.getAndSet(obj), obj)) {
                return;
            }
            Iterator it = ((i) this.f1002a).f1003a.iterator();
            while (it.hasNext()) {
                ((be) it.next()).hf(obj);
            }
            return;
        }
        Object obj2 = this.f1002a;
        synchronized (((a) obj2).f1000a) {
            Object b = ((a) obj2).b();
            if (!h.a.a.p.b.a.f.f(((a) obj2).d.getAndSet(b), b)) {
                fl m = fl.m(((a) obj2).b);
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    ((be) m.get(i)).hf(b);
                }
            }
        }
    }
}
