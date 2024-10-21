package com.google.android.apps.gsa.search.core.service.d;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.y;
import com.google.android.apps.gsa.shared.util.debug.a.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d/e.class */
public final class e implements com.google.android.apps.gsa.shared.util.debug.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final g f1165a;
    public final b b;
    public final d c;
    public final com.google.android.apps.gsa.search.core.service.d.a.c d;
    public final com.google.android.libraries.g.a e;
    public final String f;
    public volatile Long g = -1L;
    public volatile boolean h;
    public volatile boolean i;
    public final p j;
    public final com.google.android.apps.gsa.w.a k;
    private final com.google.android.apps.gsa.shared.logger.e l;

    public e(g gVar, b bVar, d dVar, com.google.android.apps.gsa.search.core.service.d.a.c cVar, String str, com.google.android.libraries.g.a aVar, com.google.android.apps.gsa.shared.logger.e eVar, p pVar, com.google.android.apps.gsa.w.a aVar2) {
        this.f1165a = gVar;
        this.b = bVar;
        this.c = dVar;
        this.d = cVar;
        this.f = str;
        this.e = aVar;
        this.l = eVar;
        this.j = pVar;
        this.k = aVar2;
        if (pVar.w(y.k)) {
            c(str, gVar);
        }
    }

    public static void c(String str, g gVar) {
        boolean isAnnotationPresent = gVar.getClass().isAnnotationPresent(com.google.android.apps.gsa.search.core.v.a.a.class);
        if (com.google.android.apps.gsa.search.shared.service.d.a.a(str) && !isAnnotationPresent) {
            throw new AssertionError("Session type " + str + " is marked as handling untrusted data via method canHandleUntrustedDeeplinkData();this requires that you apply @HandlesUntrustedDeeplinkData annotation to itsSession Controller as well, which is " + gVar.getClass().getSimpleName());
        }
        if (com.google.android.apps.gsa.search.shared.service.d.a.a(str) || !isAnnotationPresent) {
            return;
        }
        throw new AssertionError("SessionController" + gVar.getClass().getSimpleName() + " is marked with the @HandlesUntrustedDeeplinkData annotation; this requires that you ensure canHandleUntrustedDeeplinkData() method returns true for its session type as well.");
    }

    private final void e(boolean z, int i, String str, Object... objArr) {
        if (z) {
            return;
        }
        this.l.c(new IllegalStateException(String.format(str, objArr)), i);
    }

    public final void a(String str) {
        e(this.h, 129873411, "%s called..Session is not started", str);
    }

    public final void b(String str) {
        e(!this.i, 129872165, "%s called..Session with sessionId = %s is already destroyed", str, this.g);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.m(this.f1165a);
    }
}
