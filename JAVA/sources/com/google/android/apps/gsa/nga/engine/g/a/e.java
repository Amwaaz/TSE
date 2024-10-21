package com.google.android.apps.gsa.nga.engine.g.a;

import com.google.common.base.at;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/a/e.class */
public final /* synthetic */ class e implements com.google.android.libraries.gsa.h.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f612a;
    private final int b;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.f612a = obj;
    }

    @Override // com.google.android.libraries.gsa.h.d
    public final Object a(Object obj) {
        if (this.b == 0) {
            return ((at) obj).h() ? this.f612a : dl.n(false);
        }
        ((f) this.f612a).c = ((Boolean) obj).booleanValue();
        return com.google.android.apps.gsa.v.c.f1836a;
    }
}
