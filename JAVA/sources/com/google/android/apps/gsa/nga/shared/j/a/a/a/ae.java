package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import java.util.List;
import kotlinx.coroutines.b.ct;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ae.class */
public final class ae implements ct {

    /* renamed from: a, reason: collision with root package name */
    private final ct f892a;
    private final ah b;

    public ae(ah ahVar) {
        ahVar.getClass();
        this.f892a = ahVar.b;
        this.b = ahVar;
    }

    public final List b() {
        return this.f892a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && h.a.a.p.b.a.f.h(this.b, ((ae) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object lV(kotlinx.coroutines.b.n nVar, m.c.g gVar) {
        return this.f892a.lV(nVar, gVar);
    }

    public final String toString() {
        return "LegacyExternalHotwordConsumerConfigurationFlow(delegate=" + this.b + ")";
    }
}
