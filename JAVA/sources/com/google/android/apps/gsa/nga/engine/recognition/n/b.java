package com.google.android.apps.gsa.nga.engine.recognition.n;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/n/b.class */
public enum b implements bo {
    DEFAULT_SODA_ONLY(0),
    S3_ONLY(1),
    NETWORK_MONITORING(2),
    HYBRID(3),
    SODA_ONLY_WHEN_POSSIBLE(4),
    S3_UNLESS_OFFLINE(5),
    UNRECOGNIZED(-1);

    private final int i;

    b(int i) {
        this.i = i;
    }

    public static b a(int i) {
        if (i == 0) {
            return DEFAULT_SODA_ONLY;
        }
        if (i == 1) {
            return S3_ONLY;
        }
        if (i == 2) {
            return NETWORK_MONITORING;
        }
        if (i == 3) {
            return HYBRID;
        }
        if (i == 4) {
            return SODA_ONLY_WHEN_POSSIBLE;
        }
        if (i != 5) {
            return null;
        }
        return S3_UNLESS_OFFLINE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
