package com.google.android.apps.gsa.search.core.google.gaia;

import j$.util.function.Predicate;
import java.util.function.Predicate;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/w.class */
public final /* synthetic */ class w implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final an f1116a;

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate._CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        return Predicate._CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return Predicate._CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f1116a.w((String) obj);
    }
}
