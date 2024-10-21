package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/d.class */
public enum d implements bo {
    ESCAPE_HATCH(0),
    APP_SHORTCUTS(1),
    UNRECOGNIZED(-1);

    private final int e;

    d(int i) {
        this.e = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
