package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.libraries.gsa.h.f;
import com.google.common.base.ca;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/bc.class */
final class bc extends be {

    /* renamed from: a, reason: collision with root package name */
    final f f1525a;
    final ca b;

    public bc(f fVar, ca caVar) {
        this.f1525a = fVar;
        this.b = caVar;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.be
    public final String a() {
        return (String) this.b.a();
    }

    @Override // com.google.android.apps.gsa.shared.util.c.a.be
    public final void b() {
        this.f1525a.run();
    }
}
