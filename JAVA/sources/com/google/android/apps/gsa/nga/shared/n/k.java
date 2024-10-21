package com.google.android.apps.gsa.nga.shared.n;

import com.google.android.apps.gsa.shared.util.c.be;
import e.a;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/n/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final a f971a;

    public k(a aVar) {
        this.f971a = aVar;
    }

    public final e a(com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.shared.util.c.d dVar) {
        return new e(hVar, dVar, this.f971a);
    }

    public final c b(BiFunction biFunction) {
        return new c(this.f971a, biFunction);
    }

    public final e c(com.google.android.libraries.gsa.h.h hVar, be beVar) {
        return new e(hVar, beVar, this.f971a);
    }

    public final c d(Function function) {
        return new c(this.f971a, function);
    }
}
