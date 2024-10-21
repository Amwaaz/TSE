package com.google.android.apps.gsa.nga.shared.j.a.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final n f926a;
    public final n b;

    public m(n nVar, n nVar2) {
        nVar.getClass();
        this.f926a = nVar;
        this.b = nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.a.a.p.b.a.f.h(this.f926a, mVar.f926a) && h.a.a.p.b.a.f.h(this.b, mVar.b);
    }

    public final int hashCode() {
        return (this.f926a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(subscription=" + this.f926a + ", polling=" + this.b + ")";
    }
}
