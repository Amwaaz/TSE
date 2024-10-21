package com.google.android.apps.gsa.search.core.state;

import com.google.common.b.oo;
import com.google.common.base.aw;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ar.class */
final class ar implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final as f1240a;
    private final int b;
    private int c = 0;
    private boolean d = false;

    public ar(as asVar) {
        this.f1240a = asVar;
        asVar.b++;
        this.b = asVar.f1241a.size();
    }

    private final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        as asVar = this.f1240a;
        int i = asVar.b - 1;
        asVar.b = i;
        if (i == 0) {
            oo.aL(asVar.f1241a, new aw() { // from class: com.google.android.apps.gsa.search.core.state.aq
                public final boolean a(Object obj) {
                    return obj == null;
                }
            });
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        while (i < this.b && this.f1240a.a(i) == null) {
            i++;
        }
        if (i < this.b) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        while (true) {
            int i = this.c;
            if (i >= this.b || this.f1240a.a(i) != null) {
                break;
            }
            this.c++;
        }
        int i2 = this.c;
        if (i2 >= this.b) {
            a();
            throw new NoSuchElementException();
        }
        as asVar = this.f1240a;
        this.c = i2 + 1;
        return asVar.a(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
