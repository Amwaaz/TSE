package com.google.android.apps.gsa.nga.shared.f.a;

import android.os.Build;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.base.ah;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/ap.class */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final Object f863a;

    public ap(a aVar) {
        this.f863a = aVar;
    }

    public ap(cg cgVar) {
        this.f863a = cgVar;
    }

    public final int a() {
        if (((a) this.f863a).i(eu.iu)) {
            return 3;
        }
        return a.a.ch(b.d(((a) this.f863a).h(eu.kW)), Build.MODEL) ? 3 : 5;
    }

    public final cn b() {
        return i.g(((cg) this.f863a).d(), new c(14), ay.a);
    }

    public final cn c(String str) {
        ah bVar = new b(str, 15);
        return c.b(((cg) this.f863a).a(bVar, ay.a));
    }
}
