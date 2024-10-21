package com.google.android.apps.gsa.search.core.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/as.class */
public final class as implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final List f1241a = new ArrayList();
    public int b = 0;

    public final Object a(int i) {
        return this.f1241a.get(i);
    }

    public final void b(Object obj) {
        if (obj == null || this.f1241a.contains(obj)) {
            return;
        }
        this.f1241a.add(obj);
    }

    public final boolean c(Object obj) {
        return this.f1241a.contains(obj);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ar(this);
    }
}
