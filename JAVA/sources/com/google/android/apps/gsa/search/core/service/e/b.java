package com.google.android.apps.gsa.search.core.service.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f1184a;
    public final long b;

    public b() {
        throw null;
    }

    public b(a aVar, long j) {
        if (aVar == null) {
            throw new NullPointerException("Null userScenario");
        }
        this.f1184a = aVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1184a.equals(bVar.f1184a) && this.b == bVar.b;
    }

    public final int hashCode() {
        int hashCode = this.f1184a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "UserScenarioChange{userScenario=" + this.f1184a.toString() + ", timestampMs=" + this.b + "}";
    }
}
