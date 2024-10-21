package com.google.android.apps.gsa.binaries.b;

import android.content.pm.PackageManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/b/c.class */
public final class c implements e.a {

    /* renamed from: a, reason: collision with root package name */
    final d f288a;

    public c(d dVar) {
        this.f288a = dVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return this.f288a.getPackageManager().getPackageInfo(this.f288a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
