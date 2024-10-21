package com.google.android.apps.gsa.search.shared.service.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/d/b.class */
public final class b {

    /* renamed from: a */
    public final long f1345a;
    public final String b;

    public b() {
        throw null;
    }

    public b(long j, String str) {
        this.f1345a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1345a == bVar.f1345a && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        long j = this.f1345a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SessionInfo{id=" + this.f1345a + ", type=" + this.b + "}";
    }
}
