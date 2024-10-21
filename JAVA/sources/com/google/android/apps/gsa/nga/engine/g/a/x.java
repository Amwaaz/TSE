package com.google.android.apps.gsa.nga.engine.g.a;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/a/x.class */
final class x {

    /* renamed from: a */
    public final Optional f614a;
    public final Optional b;

    public x() {
        throw null;
    }

    public x(Optional optional, Optional optional2) {
        if (optional == null) {
            throw new NullPointerException("Null accountId");
        }
        this.f614a = optional;
        this.b = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f614a.equals(xVar.f614a) && this.b.equals(xVar.b);
    }

    public final int hashCode() {
        return ((this.f614a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "AccountState{accountId=" + this.f614a.toString() + ", accountName=" + optional.toString() + "}";
    }
}
