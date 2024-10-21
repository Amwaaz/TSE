package com.google.android.apps.gsa.nga.shared.u.d.a;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/u/d/a/l.class */
public enum l implements bo {
    FLOW_ID_UNKNOWN(0),
    SWIPE_EDUCATION(1),
    APP_OPEN(2),
    GENERIC_TRY_SAYING(3),
    APP_EDUCATION(4),
    MULTI_STEP_TRY_SAYING(5);

    public final int g;

    l(int i) {
        this.g = i;
    }

    public static l a(int i) {
        if (i == 0) {
            return FLOW_ID_UNKNOWN;
        }
        if (i == 1) {
            return SWIPE_EDUCATION;
        }
        if (i == 2) {
            return APP_OPEN;
        }
        if (i == 3) {
            return GENERIC_TRY_SAYING;
        }
        if (i == 4) {
            return APP_EDUCATION;
        }
        if (i != 5) {
            return null;
        }
        return MULTI_STEP_TRY_SAYING;
    }

    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
