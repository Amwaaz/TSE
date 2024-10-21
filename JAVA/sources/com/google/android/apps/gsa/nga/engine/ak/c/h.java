package com.google.android.apps.gsa.nga.engine.ak.c;

import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/c/h.class */
public final /* synthetic */ class h implements Function {

    /* renamed from: a */
    public final Long f424a;

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((Long) obj).longValue() - this.f424a.longValue());
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function._CC.$default$compose(this, function);
    }
}
