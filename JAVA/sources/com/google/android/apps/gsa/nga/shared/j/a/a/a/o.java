package com.google.android.apps.gsa.nga.shared.j.a.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/o.class */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final n f928a;
    public final m b;

    public o(n nVar, m mVar) {
        mVar.getClass();
        this.f928a = nVar;
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.a.a.p.b.a.f.h(this.f928a, oVar.f928a) && h.a.a.p.b.a.f.h(this.b, oVar.b);
    }

    public final int hashCode() {
        return (this.f928a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConnectivityStatus(outcome=" + this.f928a + ", connectivity=" + this.b + ")";
    }
}
