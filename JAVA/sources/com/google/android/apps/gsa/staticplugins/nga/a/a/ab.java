package com.google.android.apps.gsa.staticplugins.nga.a.a;

import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/ab.class */
public final /* synthetic */ class ab implements Supplier {

    /* renamed from: a */
    public final Object f1642a;
    private final int b;

    public /* synthetic */ ab(Object obj, int i) {
        this.b = i;
        this.f1642a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [e.a, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        return this.b != 0 ? ae.h(this.f1642a) : ((ae) this.f1642a).b();
    }
}
