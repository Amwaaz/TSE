package com.google.android.apps.gsa.d.b;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/b/a.class */
final class a {

    /* renamed from: a */
    public final int f342a;
    public final int b;
    public final int c;
    public final int d;

    public a() {
        throw null;
    }

    public a(int i, int i2, int i3, int i4) {
        this.f342a = i;
        this.d = i2;
        this.b = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f342a == aVar.f342a && this.d == aVar.d && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return ((((((this.f342a ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.d != 1 ? "CONTENT_PROVIDER" : "SERVICE";
        return "PackageNameLog{componentId=" + this.f342a + ", type=" + str + ", uid=" + this.b + ", operation=" + this.c + "}";
    }
}
