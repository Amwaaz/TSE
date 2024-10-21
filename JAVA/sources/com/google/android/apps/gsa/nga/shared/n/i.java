package com.google.android.apps.gsa.nga.shared.n;

import com.google.common.f.a.a;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/n/i.class */
public final class i implements com.google.android.libraries.gsa.h.e {
    @Override // com.google.android.libraries.gsa.h.e
    public final void gJ(Throwable th) {
        a g = j.b.b(Level.SEVERE).g(th);
        g.ak(5212);
        g.s("Crash calling notifyListeners on %s", this);
    }

    @Override // com.google.android.libraries.gsa.h.e
    public final /* bridge */ /* synthetic */ void gK(Object obj) {
    }
}
