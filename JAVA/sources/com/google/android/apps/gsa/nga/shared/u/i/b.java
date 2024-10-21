package com.google.android.apps.gsa.nga.shared.u.i;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/u/i/b.class */
public enum b implements bo {
    SODA(0),
    S3(1),
    ROHAN_SODA(3);

    public final int d;

    b(int i) {
        this.d = i;
    }

    public static b a(int i) {
        if (i == 0) {
            return SODA;
        }
        if (i == 1) {
            return S3;
        }
        if (i != 3) {
            return null;
        }
        return ROHAN_SODA;
    }

    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
