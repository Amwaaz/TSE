package com.google.android.apps.gsa.staticplugins.nga.u.a;

import com.google.android.apps.gsa.search.core.h.r;
import com.google.android.libraries.phenotype.client.y;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/d.class */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1703a;
    private final int b;

    public /* synthetic */ d(Object obj, int i) {
        this.b = i;
        this.f1703a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return Function._CC.$default$andThen(this, function);
        }
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return new y(((e) this.f1703a).f1704a, (String) obj, 0L, false);
        }
        if (i == 1) {
            return Long.valueOf(((r) this.f1703a).i((com.google.android.apps.gsa.shared.k.f) obj));
        }
        if (i != 2) {
            return new com.google.android.libraries.phenotype.client.z(((e) this.f1703a).f1704a, (String) obj, false, false);
        }
        return Boolean.valueOf(((r) this.f1703a).w((com.google.android.apps.gsa.shared.k.d) obj));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return Function._CC.$default$compose(this, function);
        }
        return Function._CC.$default$compose(this, function);
    }
}
