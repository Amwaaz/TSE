package com.google.android.apps.gsa.search.core.service.e;

import java.util.Observable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/c.class */
public final class c extends Observable {

    /* renamed from: a, reason: collision with root package name */
    public volatile b f1188a;

    public c(b bVar) {
        this.f1188a = bVar;
    }

    public final void a(b bVar) {
        synchronized (this) {
            if (this.f1188a.equals(bVar)) {
                return;
            }
            this.f1188a = bVar;
            setChanged();
            notifyObservers();
        }
    }
}
