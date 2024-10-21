package com.google.android.apps.gsa.staticplugins.nga.b;

import android.database.ContentObserver;
import android.net.Uri;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/b/c.class */
final class c extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final e f1676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(null);
        this.f1676a = eVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f1676a.c();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f1676a.c();
    }
}
