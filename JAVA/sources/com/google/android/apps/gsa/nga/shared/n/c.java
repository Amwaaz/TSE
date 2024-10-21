package com.google.android.apps.gsa.nga.shared.n;

import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/n/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f964a;
    private final a b;

    public c(a aVar, Object obj) {
        this.b = aVar;
        this.f964a = obj;
    }

    public final cn a(Object obj) {
        return com.google.android.apps.gsa.v.c.b(dl.j((Iterable) Collection._EL.stream((Set) this.b.a()).map(new b(this, obj)).collect(Collectors.toList())));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.function.Function] */
    public final cn b() {
        return com.google.android.apps.gsa.v.c.b(dl.j((Iterable) Collection._EL.stream((Set) this.b.a()).map(new a((Function) this.f964a)).collect(Collectors.toList())));
    }
}
