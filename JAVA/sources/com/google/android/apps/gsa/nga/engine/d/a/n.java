package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.common.b.ha;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/n.class */
final class n {

    /* renamed from: a */
    public final ha f541a;
    public final boolean b;
    public final Optional c;

    public n() {
        throw null;
    }

    public n(ha haVar, boolean z, Optional optional) {
        if (haVar == null) {
            throw new NullPointerException("Null contactNames");
        }
        this.f541a = haVar;
        this.b = z;
        this.c = optional;
    }

    public static n a(ha haVar, boolean z) {
        return new n(haVar, z, Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f541a.equals(nVar.f541a) && this.b == nVar.b && this.c.equals(nVar.c);
    }

    public final int hashCode() {
        return ((((this.f541a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "CachedBestContactNames{contactNames=" + this.f541a.toString() + ", needsRefresh=" + this.b + ", earliestRefreshTimeMillis=" + optional.toString() + "}";
    }
}
