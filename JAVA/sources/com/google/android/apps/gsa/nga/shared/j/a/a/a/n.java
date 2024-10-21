package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f927a;
    public final Duration b;

    public n(boolean z, Duration duration) {
        this.f927a = z;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f927a == nVar.f927a && h.a.a.p.b.a.f.h(this.b, nVar.b);
    }

    public final int hashCode() {
        return (a.a.bN(this.f927a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(active=" + this.f927a + ", timestamp=" + this.b + ")";
    }
}
