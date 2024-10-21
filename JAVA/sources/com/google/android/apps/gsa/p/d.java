package com.google.android.apps.gsa.p;

import com.google.android.apps.gsa.shared.h.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/p/d.class */
public final class d implements a {

    /* renamed from: a */
    public final Object f1029a = new Object();
    public boolean b = false;

    @Override // com.google.android.apps.gsa.shared.h.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        b();
    }

    public final void b() {
        synchronized (this.f1029a) {
            this.b = true;
            this.f1029a.notifyAll();
        }
    }
}
