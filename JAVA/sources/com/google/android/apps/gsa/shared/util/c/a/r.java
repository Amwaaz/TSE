package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.util.concurrent.bq;
import java.lang.Thread;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/r.class */
final class r implements bq {
    public final void gJ(Throwable th) {
        Thread currentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public final void gK(Object obj) {
    }
}
