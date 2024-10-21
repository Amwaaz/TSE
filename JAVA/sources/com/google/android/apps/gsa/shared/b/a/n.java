package com.google.android.apps.gsa.shared.b.a;

import androidx.lifecycle.at;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/n.class */
final /* synthetic */ class n implements at, m.h.b.i {

    /* renamed from: a */
    private final m.h.a.l f1383a;

    public n(m.h.a.l lVar) {
        this.f1383a = lVar;
    }

    @Override // androidx.lifecycle.at
    public final /* synthetic */ void eY(Object obj) {
        this.f1383a.a(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof at) && (obj instanceof m.h.b.i)) {
            return h.a.a.p.b.a.f.h(this.f1383a, ((m.h.b.i) obj).fN());
        }
        return false;
    }

    public final m.b fN() {
        return this.f1383a;
    }

    public final int hashCode() {
        return this.f1383a.hashCode();
    }
}
