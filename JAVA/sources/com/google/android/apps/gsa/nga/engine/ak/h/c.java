package com.google.android.apps.gsa.nga.engine.ak.h;

import android.database.ContentObserver;
import android.net.Uri;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/h/c.class */
final class c extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final f f429a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar) {
        super(null);
        this.f429a = fVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f429a.b();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f429a.b();
    }
}
