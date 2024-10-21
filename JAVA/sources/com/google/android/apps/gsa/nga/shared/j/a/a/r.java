package com.google.android.apps.gsa.nga.shared.j.a.a;

import h.a.a.p.b.a.f;
import java.util.List;
import kotlinx.coroutines.b.ct;
import kotlinx.coroutines.b.n;
import m.c.g;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/r.class */
public final class r implements ct {

    /* renamed from: a, reason: collision with root package name */
    private final ct f952a;
    private final y b;

    public r(y yVar) {
        yVar.getClass();
        this.f952a = yVar.b;
        this.b = yVar;
    }

    public final List b() {
        return this.f952a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && f.h(this.b, ((r) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object lV(n nVar, g gVar) {
        return this.f952a.lV(nVar, gVar);
    }

    public final String toString() {
        return "LegacyHotwordConsumerAccountFlow(delegate=" + this.b + ")";
    }
}
