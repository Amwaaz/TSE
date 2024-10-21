package com.google.android.apps.gsa.nga.engine.d.a;

import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/a.class */
public final /* synthetic */ class a implements BiFunction {
    @Override // java.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Double.valueOf(Math.max(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
    }
}
