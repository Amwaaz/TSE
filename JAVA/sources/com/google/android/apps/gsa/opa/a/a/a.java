package com.google.android.apps.gsa.opa.a.a;

import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.f.b.a.h;
import com.google.common.f.b.ae;
import com.google.frameworks.client.a.a.a.a.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/a/a/a.class */
public final class a {

    /* renamed from: a */
    private final h f1021a;

    public a(h hVar) {
        this.f1021a = hVar;
    }

    public final d a(String str) {
        return new d(new j(str, fl.q(ae.d(str), this.f1021a)));
    }

    public final d b(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        return new d(new j(simpleName, fl.q(ae.d(simpleName), this.f1021a)));
    }
}
