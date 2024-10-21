package com.google.android.apps.gsa.nga.engine.education.a;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/a/s.class */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f558a;
    public final Optional b;

    public s() {
        throw null;
    }

    public s(boolean z, Optional optional) {
        this.f558a = z;
        this.b = optional;
    }

    public static r a() {
        r rVar = new r(null);
        rVar.b(false);
        rVar.f557a = Optional.empty();
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f558a == sVar.f558a && this.b.equals(sVar.b);
    }

    public final int hashCode() {
        return (((true != this.f558a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DisclosureInfo{setShowDisclosure=" + this.f558a + ", setDisclosureLink=" + String.valueOf(this.b) + "}";
    }
}
