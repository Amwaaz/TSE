package com.google.android.apps.gsa.nga.engine.ac;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/c.class */
public enum c {
    IDLE,
    PREFETCHING,
    PROCESSING_RESPONSE,
    PLAYING_TTS,
    PLAYING_TTS_OUTSIDE_OF_UTTERANCE;

    public final boolean a() {
        return this == PLAYING_TTS || this == PLAYING_TTS_OUTSIDE_OF_UTTERANCE;
    }
}
