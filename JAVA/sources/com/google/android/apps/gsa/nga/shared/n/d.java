package com.google.android.apps.gsa.nga.shared.n;

import com.google.android.apps.gsa.shared.util.c.be;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/n/d.class */
final class d implements be {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.shared.util.c.d f965a;
    private final Object b;

    public d(com.google.android.apps.gsa.shared.util.c.d dVar, Object obj) {
        this.f965a = dVar;
        this.b = obj;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.be
    public final void hf(Object obj) {
        this.f965a.a(obj, this.b);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
