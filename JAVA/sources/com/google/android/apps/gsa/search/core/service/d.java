package com.google.android.apps.gsa.search.core.service;

import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d.class */
public final class d implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    final o f1161a;

    public d(o oVar) {
        this.f1161a = oVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f1161a.j();
    }
}
