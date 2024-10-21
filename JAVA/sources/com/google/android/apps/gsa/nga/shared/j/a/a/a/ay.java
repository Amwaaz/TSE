package com.google.android.apps.gsa.nga.shared.j.a.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ay.class */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f911a;
    public final boolean b;
    private final int c;

    public ay(boolean z, boolean z2, int i) {
        this.f911a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return this.f911a == ayVar.f911a && this.b == ayVar.b && this.c == ayVar.c;
    }

    public final int hashCode() {
        return (((a.a.bN(this.f911a) * 31) + a.a.bN(this.b)) * 31) + this.c;
    }

    public final String toString() {
        return "speakerIdSupported=" + this.f911a + ", speakerIdModelPresent=" + this.b + ", revision=" + this.c;
    }
}
