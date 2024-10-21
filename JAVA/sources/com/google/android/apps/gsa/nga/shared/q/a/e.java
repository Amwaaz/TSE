package com.google.android.apps.gsa.nga.shared.q.a;

import com.google.android.apps.gsa.nga.api.NgaState;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/e.class */
final class e implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.g.z.w.e apply(NgaState ngaState) {
        NgaState ngaState2 = NgaState.ENABLED_IN_PAUSED_MODE;
        int ordinal = ngaState.ordinal();
        if (ordinal == 0) {
            return com.google.g.z.w.e.b;
        }
        if (ordinal == 1) {
            return com.google.g.z.w.e.c;
        }
        if (ordinal == 2) {
            return com.google.g.z.w.e.d;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ngaState))));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function._CC.$default$compose(this, function);
    }
}
