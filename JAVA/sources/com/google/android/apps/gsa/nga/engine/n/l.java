package com.google.android.apps.gsa.nga.engine.n;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/l.class */
public final class l implements m {

    /* renamed from: a */
    public final Optional f633a;
    private final long b;

    public l() {
        throw null;
    }

    public l(Optional optional, long j) {
        this.f633a = optional;
        this.b = j;
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.m
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f633a.equals(lVar.f633a) && this.b == lVar.b;
    }

    public final int hashCode() {
        int hashCode = this.f633a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Screenshot{bitmap=" + String.valueOf(this.f633a) + ", timestamp=" + this.b + "}";
    }
}
