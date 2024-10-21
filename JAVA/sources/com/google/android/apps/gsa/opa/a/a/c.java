package com.google.android.apps.gsa.opa.a.a;

import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.b.a.i;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.logging.Level;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/a/a/c.class */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1024a = j.i("com.google.android.apps.gsa.opa.a.a.c");
    public boolean b = false;

    public c(cn cnVar) {
        b bVar = new b(this);
        dl.y(cnVar, ex.h(bVar), ay.a);
    }

    public final int a() {
        return 4;
    }

    public final int b() {
        return 2097152;
    }

    public final String c() {
        return "logging";
    }

    public final String d() {
        return "aa_logs.txt";
    }

    public final boolean e() {
        return false;
    }

    public final boolean f(Level level) {
        return this.b;
    }
}
