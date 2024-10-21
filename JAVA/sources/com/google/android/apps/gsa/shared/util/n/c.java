package com.google.android.apps.gsa.shared.util.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/n/c.class */
public enum c {
    DEFAULT("com.google.android.googlequicksearchbox"),
    AFW("com.google.android.googlequicksearchbox:afw"),
    CRASH_REPORT("com.google.android.googlequicksearchbox:crash_report"),
    CLIENT_LOGGING("com.google.android.googlequicksearchbox:client_logging"),
    DEV("com.google.android.googlequicksearchbox:dev"),
    INTERACTOR("com.google.android.googlequicksearchbox:interactor"),
    SEARCH("com.google.android.googlequicksearchbox:search"),
    UI("com.google.android.googlequicksearchbox:ui"),
    WALLPAPER_CHOOSER("com.google.android.googlequicksearchbox:wallpaper_chooser"),
    ASSISTANT("com.google.android.googlequicksearchbox:assistant"),
    TRAIN("com.google.android.googlequicksearchbox:train"),
    PLAYCORE_MISSING_SPLITS_ACTIVITY("com.google.android.googlequicksearchbox:playcore_missing_splits_activity"),
    PLAYCORE_DIALOG_WRAPPER_ACTIVITY("com.google.android.googlequicksearchbox:playcore_dialog_wrapper_activity"),
    PRIMES_LIFEBOAT("com.google.android.googlequicksearchbox:primes_lifeboat"),
    GOOGLE_APP("com.google.android.googlequicksearchbox:googleapp");

    public final String p;

    c(String str) {
        this.p = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
