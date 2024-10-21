package com.google.android.apps.gsa.speech.hotword;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/hotword/a.class */
public enum a implements bo {
    AVAILABLE(0),
    LOW_RAM_DEVICE(1),
    CAPTURE_AUDIO_HOTWORD_NOT_PERMITTED(2);

    private final int e;

    a(int i) {
        this.e = i;
    }

    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
