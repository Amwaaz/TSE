package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.opa.f.b;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.at;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/z.class */
public final class z {
    public final h b;
    public final at c;
    public boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final d f397a = d.c("OpaConnection");
    public cn d = dl.l();

    public z(h hVar, at atVar) {
        this.b = hVar;
        this.c = atVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.apps.gsa.opa.f.b, java.lang.Object] */
    public final b a() {
        if (!this.e) {
            this.d.cancel(false);
            this.e = true;
        }
        return this.c.a;
    }
}
