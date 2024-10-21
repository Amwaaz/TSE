package com.google.android.apps.gsa.speech.k;

import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.a.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/d.class */
public final class d implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final BitFlags f1608a;

    public d() {
        this.f1608a = new BitFlags(d.class, "FLAG_", 0L);
    }

    public d(d dVar) {
        this.f1608a = new BitFlags(d.class, "FLAG_", dVar.f1608a.b);
    }

    private static long g(long j) {
        return (j ^ (-1)) & Long.MAX_VALUE;
    }

    public final boolean a() {
        boolean f;
        synchronized (this) {
            f = BitFlags.f(this.f1608a.b, 5L);
        }
        return f;
    }

    public final boolean b() {
        boolean d;
        synchronized (this) {
            d = this.f1608a.d();
        }
        return !d;
    }

    public final boolean c() {
        boolean c;
        synchronized (this) {
            c = this.f1608a.c(g(5L), 5L);
        }
        return c;
    }

    public final boolean e() {
        boolean g;
        synchronized (this) {
            g = this.f1608a.g();
        }
        return g;
    }

    public final boolean f() {
        boolean c;
        synchronized (this) {
            c = this.f1608a.c(g(1L), 1L);
        }
        return c;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        synchronized (this) {
            fVar.q("MicroDetectionMode");
            fVar.b("Detection Mode").a(new com.google.android.apps.gsa.shared.util.b.d(this.f1608a.b(), false));
        }
    }

    public final String toString() {
        String str;
        synchronized (this) {
            str = "[mDetectionMode: " + this.f1608a.b() + "]";
        }
        return str;
    }
}
