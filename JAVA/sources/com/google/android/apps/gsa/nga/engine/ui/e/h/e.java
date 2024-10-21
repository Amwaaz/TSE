package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.ads.interactivemedia.v3.internal.aus;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/e.class */
public final /* synthetic */ class e implements Function {

    /* renamed from: a, reason: collision with root package name */
    public static final int f745a = 0;
    private final int b;

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        if (i != 0 && i == 1) {
            throw null;
        }
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional empty;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (Integer) ((Optional) obj).get();
            }
            throw null;
        }
        String str = (String) obj;
        try {
            empty = Optional.of(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException e) {
            aus.b(l.f757a.f(), "Could not parse string: %s", str, (char) 4739, e);
            empty = Optional.empty();
        }
        return empty;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.b;
        if (i != 0 && i == 1) {
            throw null;
        }
        return Function._CC.$default$compose(this, function);
    }
}
