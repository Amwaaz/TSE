package com.google.android.apps.gsa.search.core.service.e.b;

import com.google.common.base.cl;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/b/d.class */
final class d implements Observer {

    /* renamed from: a, reason: collision with root package name */
    final e f1186a;
    private final int b;

    public d(e eVar, int i) {
        this.b = i;
        this.f1186a = eVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (this.b != 0) {
            this.f1186a.a();
            return;
        }
        cl.v(obj instanceof com.google.android.apps.gsa.search.core.service.e.c, "Passed-in object is not an instance of UserAdvocateObservable");
        com.google.android.apps.gsa.search.core.service.e.c cVar = (com.google.android.apps.gsa.search.core.service.e.c) obj;
        e eVar = this.f1186a;
        com.google.android.apps.gsa.search.core.service.e.c cVar2 = eVar.b;
        if (cVar2 != cVar) {
            cVar2.deleteObserver(eVar.f1187a);
            cVar.addObserver(eVar.f1187a);
            eVar.b = cVar;
            eVar.a();
        }
    }
}
