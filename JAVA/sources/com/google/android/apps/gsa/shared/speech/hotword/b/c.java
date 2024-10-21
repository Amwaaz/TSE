package com.google.android.apps.gsa.shared.speech.hotword.b;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/hotword/b/c.class */
public enum c implements bo {
    UNKNOWN(0),
    OK_GOOGLE(1),
    OK_HEY_GOOGLE(2);

    public final int d;

    c(int i) {
        this.d = i;
    }

    public static c a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OK_GOOGLE;
        }
        if (i != 2) {
            return null;
        }
        return OK_HEY_GOOGLE;
    }

    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
