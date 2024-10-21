package com.google.android.apps.gsa.staticplugins.nga.a.a;

import androidx.lifecycle.v;
import com.google.android.libraries.gsa.h.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/ax.class */
public final /* synthetic */ class ax implements f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1656a;
    public final Object b;
    private final int c;

    public /* synthetic */ ax(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.f1656a = z;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        if (this.c != 0) {
            ((bg) this.b).r = this.f1656a;
        } else {
            ((be) this.b).f1663a.g(this.f1656a ? v.STARTED : v.CREATED);
        }
    }
}
