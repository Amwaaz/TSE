package com.google.android.apps.gsa.nga.engine.au.c;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/au/c/n.class */
final class n {

    /* renamed from: a */
    public final g f503a;
    public final Optional b;

    public n() {
        throw null;
    }

    public n(g gVar, Optional optional) {
        this.f503a = gVar;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f503a.equals(nVar.f503a) && this.b.equals(nVar.b);
    }

    public final int hashCode() {
        return ((this.f503a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "MddResource{resource=" + String.valueOf(this.f503a) + ", uri=" + String.valueOf(optional) + "}";
    }
}
