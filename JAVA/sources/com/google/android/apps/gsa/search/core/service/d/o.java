package com.google.android.apps.gsa.search.core.service.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d/o.class */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final a f1169a;
    public e b;
    private final j c;

    public o(j jVar, a aVar) {
        this.c = jVar;
        this.f1169a = aVar;
    }

    public static com.google.android.apps.gsa.search.core.service.e.c a(e eVar) {
        com.google.android.apps.gsa.search.core.service.e.c a2;
        if (eVar == null) {
            a2 = new com.google.android.apps.gsa.search.core.service.e.c(new com.google.android.apps.gsa.search.core.service.e.b(com.google.android.apps.gsa.search.core.service.e.a.IDLE, 0L));
        } else {
            eVar.b("#getUserScenarioObservable");
            a2 = eVar.f1165a.a(eVar.e);
        }
        return a2;
    }

    public final void b(e eVar) {
        if (this.c.a(eVar.f) || this.b == eVar) {
            return;
        }
        this.b = eVar;
        this.f1169a.notifyObservers(a(eVar));
    }
}
