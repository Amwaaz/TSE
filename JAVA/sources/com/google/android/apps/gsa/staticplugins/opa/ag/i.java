package com.google.android.apps.gsa.staticplugins.opa.ag;

import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.apps.gsa.staticplugins.opa.samson.r.f;
import com.google.common.base.at;
import com.google.common.base.ca;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ag/i.class */
public final /* synthetic */ class i implements ca {

    /* renamed from: a, reason: collision with root package name */
    public final a f1733a;
    private final int b;

    public /* synthetic */ i(a aVar, int i) {
        this.b = i;
        this.f1733a = aVar;
    }

    public final Object a() {
        if (this.b == 0) {
            return Integer.valueOf(((f) this.f1733a.a()).a());
        }
        a aVar = this.f1733a;
        boolean z = false;
        if (((at) aVar.a()).h()) {
            z = false;
            if (((bg) ((at) aVar.a()).c()).a().a()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
