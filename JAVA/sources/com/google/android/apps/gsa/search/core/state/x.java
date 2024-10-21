package com.google.android.apps.gsa.search.core.state;

import java.util.Observable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/x.class */
public final class x extends Observable {
    public final void a() {
        setChanged();
        notifyObservers();
    }
}
