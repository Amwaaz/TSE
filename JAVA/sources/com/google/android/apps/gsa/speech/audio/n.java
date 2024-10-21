package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.b.a.a;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.common.f.ab;
import com.google.common.f.am;
import h.a.a.p.b.a.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/audio/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private a f1590a;
    private Long b;
    private Long c;
    private final com.google.android.libraries.g.a d;

    public n(com.google.android.libraries.g.a aVar) {
        this.d = aVar;
    }

    public final a a() {
        synchronized (this) {
            if (this.c != null) {
                long a2 = this.d.a();
                Long l = this.c;
                l.getClass();
                long longValue = l.longValue();
                ab abVar = com.google.common.f.a.e.a;
                if (a2 - longValue <= 30000) {
                    return this.f1590a;
                }
            }
            return null;
        }
    }

    public final void b(long j, a aVar) {
        synchronized (this) {
            ab abVar = com.google.common.f.a.e.a;
            am.d.getClass();
            this.b = Long.valueOf(j);
            this.f1590a = aVar;
            this.c = Long.valueOf(this.d.a());
        }
    }

    public final void c(long j) {
        synchronized (this) {
            ab abVar = com.google.common.f.a.e.a;
            f.f(Long.valueOf(j), this.b);
        }
    }

    @ProguardMustNotDelete
    public a getAudio(Long l) {
        synchronized (this) {
            boolean z = false;
            if (this.f1590a != null) {
                z = false;
                if (f.f(l, this.b)) {
                    z = true;
                }
            }
            ab abVar = com.google.common.f.a.e.a;
            if (!z) {
                return null;
            }
            return this.f1590a;
        }
    }
}
