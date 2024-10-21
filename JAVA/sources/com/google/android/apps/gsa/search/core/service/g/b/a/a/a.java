package com.google.android.apps.gsa.search.core.service.g.b.a.a;

import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a/a/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final cn f1204a;
    public final b b;

    public a() {
        throw null;
    }

    public a(cn cnVar, b bVar) {
        this.f1204a = cnVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1204a.equals(aVar.f1204a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return ((this.f1204a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        b bVar = this.b;
        return "WorkerAcquisitionResult{worker=" + this.f1204a.toString() + ", nextState=" + bVar.toString() + "}";
    }
}
