package com.google.android.apps.gsa.staticplugins.nga.u.a;

import com.google.common.b.ha;
import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/l.class */
public final /* synthetic */ class l implements BinaryOperator {

    /* renamed from: a */
    private final int f1708a;

    @Override // java.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.f1708a;
        if (i != 0 && i == 1) {
            return BiFunction._CC.$default$andThen(this, function);
        }
        return BiFunction._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f1708a;
        if (i == 0) {
            return (ha) obj;
        }
        if (i == 1) {
            return (Integer) obj;
        }
        String str = (String) obj;
        com.google.common.f.a.d dVar = ai.f1701a;
        return str;
    }
}
