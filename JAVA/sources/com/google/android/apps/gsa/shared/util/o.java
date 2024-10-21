package com.google.android.apps.gsa.shared.util;

import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/o.class */
public final class o {

    /* renamed from: a */
    public static final o f1569a = new o();
    private final AtomicReference c = new AtomicReference();
    private long d = -1;
    public final Random b = new Random();

    private o() {
    }

    public final long a() {
        Random random = (Random) this.c.get();
        Random random2 = random;
        if (random == null) {
            random2 = new Random(SystemClock.elapsedRealtimeNanos() + (SystemClock.currentThreadTimeMillis() << 24));
            this.c.set(random2);
        }
        return (this.b.nextLong() ^ random2.nextLong()) ^ System.nanoTime();
    }

    public final long b() {
        long j = this.d;
        long j2 = j;
        if (j == -1) {
            j2 = System.currentTimeMillis();
        }
        this.d = 1 + j2;
        return j2;
    }
}
