package com.google.android.apps.gsa.search.core.service.d;

import java.util.Observable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d/a.class */
public final class a extends Observable {
    @Override // java.util.Observable
    public final void notifyObservers(Object obj) {
        synchronized (this) {
            setChanged();
            super.notifyObservers(obj);
        }
    }
}
