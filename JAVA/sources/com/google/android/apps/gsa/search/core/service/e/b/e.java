package com.google.android.apps.gsa.search.core.service.e.b;

import com.google.android.apps.gsa.search.core.service.d.a;
import com.google.android.apps.gsa.search.core.service.e.b;
import java.util.Observer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/b/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Observer f1187a = new d(this, 1);
    public com.google.android.apps.gsa.search.core.service.e.c b;
    private final a c;
    private final Observer d;
    private b e;
    private final c f;

    public e(c cVar, a aVar) {
        d dVar = new d(this, 0);
        this.d = dVar;
        this.b = new com.google.android.apps.gsa.search.core.service.e.c(new b(com.google.android.apps.gsa.search.core.service.e.a.IDLE, 0L));
        this.e = new b(com.google.android.apps.gsa.search.core.service.e.a.IDLE, 0L);
        this.f = cVar;
        this.c = aVar;
        aVar.addObserver(dVar);
    }

    public final void a() {
        b bVar = this.b.f1188a;
        if (this.e.equals(bVar)) {
            return;
        }
        this.e = bVar;
        this.f.c();
    }
}
