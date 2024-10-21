package com.google.android.apps.gsa.nga.engine.ae;

import android.database.ContentObserver;
import android.net.Uri;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/r.class */
final class r extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final u f411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar) {
        super(null);
        this.f411a = uVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f411a.f.n("[NGA] onChange volume change", new ai(this, 1));
    }
}
