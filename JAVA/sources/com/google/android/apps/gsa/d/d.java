package com.google.android.apps.gsa.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/d.class */
final class d {

    /* renamed from: a */
    public final com.google.android.apps.gsa.s.a f344a;
    public final int b;

    public d() {
        throw null;
    }

    public d(com.google.android.apps.gsa.s.a aVar, int i) {
        if (aVar == null) {
            throw new NullPointerException("Null metricType");
        }
        this.f344a = aVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f344a.equals(dVar.f344a) && this.b == dVar.b;
    }

    public final int hashCode() {
        return ((this.f344a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "BufferedLog{metricType=" + Integer.toString(this.f344a.kI) + ", id=" + this.b + "}";
    }
}
