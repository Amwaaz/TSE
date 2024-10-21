package com.google.android.apps.gsa.nga.shared.j.a.a;

import com.google.android.libraries.search.account.a;
import h.a.a.p.b.a.f;
import m.b;
import m.h.b.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/x.class */
final /* synthetic */ class x implements a, i {

    /* renamed from: a */
    private final m.h.a.a f958a;

    public x(m.h.a.a aVar) {
        this.f958a = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && (obj instanceof i)) {
            return f.h(this.f958a, ((i) obj).fN());
        }
        return false;
    }

    public final b fN() {
        return this.f958a;
    }

    public final int hashCode() {
        return this.f958a.hashCode();
    }

    @Override // com.google.android.libraries.search.account.a
    public final /* synthetic */ void is() {
        this.f958a.a();
    }
}
