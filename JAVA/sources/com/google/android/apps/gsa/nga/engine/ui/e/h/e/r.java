package com.google.android.apps.gsa.nga.engine.ui.e.h.e;

import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/e/r.class */
public final class r {

    /* renamed from: a */
    public final String f750a;
    public final cn b;
    public final Optional c;

    public r() {
        throw null;
    }

    public r(String str, cn cnVar, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null inputKey");
        }
        this.f750a = str;
        if (cnVar == null) {
            throw new NullPointerException("Null listenableFuture");
        }
        this.b = cnVar;
        this.c = optional;
    }

    public static r a() {
        return new r("", dl.l(), Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f750a.equals(rVar.f750a) && this.b.equals(rVar.b) && this.c.equals(rVar.c);
    }

    public final int hashCode() {
        return ((((this.f750a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "Status{inputKey=" + this.f750a + ", listenableFuture=" + this.b.toString() + ", contentTask=" + optional.toString() + "}";
    }
}
