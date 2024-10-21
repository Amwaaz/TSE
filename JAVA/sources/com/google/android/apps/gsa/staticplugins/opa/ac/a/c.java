package com.google.android.apps.gsa.staticplugins.opa.ac.a;

import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ac/a/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1732a;
    public final cg b;

    public c(cg cgVar, g gVar) {
        this.b = cgVar;
        this.f1732a = gVar.a("GrowthPDSExecutor", gVar.c);
    }

    public final cn a(String str, Integer num) {
        return i.g(this.b.d(), new a(str, num, 0), this.f1732a);
    }

    public final cn b(String str, Integer num) {
        return this.b.b(new b(str, num, 1), this.f1732a);
    }

    public final cn c() {
        return i.g(this.b.d(), new a(3), this.f1732a);
    }
}
