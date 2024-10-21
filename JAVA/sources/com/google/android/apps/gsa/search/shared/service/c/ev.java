package com.google.android.apps.gsa.search.shared.service.c;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/c/ev.class */
public enum ev implements bo {
    UNKNOWN(0),
    RESUMED(1),
    PAUSED(2),
    STOPPED(3);

    public final int e;

    ev(int i) {
        this.e = i;
    }

    public static ev a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return RESUMED;
        }
        if (i == 2) {
            return PAUSED;
        }
        if (i != 3) {
            return null;
        }
        return STOPPED;
    }

    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
