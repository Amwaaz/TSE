package com.google.android.apps.gsa.nga.engine.d.a;

import j$.util.function.Function;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/f.class */
public final /* synthetic */ class f implements Function {
    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function._CC.$default$compose(this, function);
    }
}
