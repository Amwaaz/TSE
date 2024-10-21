package com.google.android.apps.gsa.nga.engine.aj;

import com.google.common.b.fg;
import com.google.common.b.fl;
import j$.time.Duration;
import java.util.Arrays;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/aj/a.class */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    protected final Object[] f413a;
    protected long b;
    private final com.google.android.libraries.g.a e;
    private final long f;

    public a(com.google.android.libraries.g.a aVar, Duration duration, Duration duration2) {
        int millis = (int) (duration.toMillis() / duration2.toMillis());
        this.b = 0L;
        this.f413a = new Object[millis];
        this.e = aVar;
        this.f = duration2.toMillis();
    }

    protected final fl a(long j, long j2) {
        fl g;
        synchronized (this) {
            fg fgVar = new fg(4);
            long max = Math.max(0L, j);
            while (true) {
                long j3 = max;
                if (j3 < j2) {
                    Object obj = this.f413a[(int) (j3 % r0.length)];
                    if (obj != null) {
                        fgVar.h(obj);
                    }
                    max = j3 + 1;
                } else {
                    g = fgVar.g();
                }
            }
        }
        return g;
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.d
    public final void b() {
        synchronized (this) {
            Arrays.fill(this.f413a, (Object) null);
            this.b = 0L;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.d
    public final fl c() {
        fl a2;
        synchronized (this) {
            long epochMilli = this.e.f().toEpochMilli() / this.f;
            a2 = a((Math.max(this.b, epochMilli) - this.f413a.length) + 1, Math.min(this.b, epochMilli) + 1);
        }
        return a2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.aj.d
    public final void d(long j, Object obj) {
        synchronized (this) {
            long j2 = j / this.f;
            long j3 = this.b;
            long length = this.f413a.length;
            if (j3 - j2 >= length) {
                return;
            }
            long j4 = j3;
            if (j2 - j3 >= length) {
                b();
                this.b = j2;
                j4 = j2;
            }
            while (true) {
                j4++;
                if (j4 >= j2) {
                    this.f413a[(int) (j2 % r0.length)] = obj;
                    this.b = Math.max(this.b, j2);
                    return;
                }
                this.f413a[(int) (j4 % r0.length)] = null;
            }
        }
    }
}
