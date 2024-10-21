package com.google.android.apps.gsa.staticplugins.nga.u;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.x.a;
import com.google.android.libraries.mdi.download.workmanager.workers.c;
import com.google.common.f.a.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/bq.class */
public final class bq implements a, c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1717a = d.j();
    private final bp b;

    public bq(bp bpVar) {
        this.b = bpVar;
    }

    @Override // com.google.android.apps.gsa.shared.x.a
    public final void a(String str) {
        c(str);
    }

    @Override // com.google.android.apps.gsa.shared.x.a
    public final void b(String str, Throwable th) {
        e(str, th);
    }

    @Override // com.google.android.libraries.mdi.download.workmanager.workers.c
    public final void c(String str) {
        com.google.common.f.a.a d = f1717a.d();
        d.ak(15380);
        d.s("NGA Sync: MDD Task: %s done.", str);
        d();
    }

    public final void d() {
        com.google.common.f.a.a d = f1717a.d();
        d.ak(15377);
        this.b.b();
        this.b.a();
        this.b.b();
        d.N("NGA Sync: isNgaSyncEnabled: %s; enableFileGroupPopulator: %s; requiresMddAssets: %s", false, false, false);
    }

    @Override // com.google.android.libraries.mdi.download.workmanager.workers.c
    public final void e(String str, Throwable th) {
        aus.i(f1717a.f(), "NGA Sync: MDD Task: %s failed.", str, (char) 15381, th);
        d();
    }
}
