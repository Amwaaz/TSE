package com.google.android.apps.gsa.search.core.google.a.a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.gms.j.b;
import com.google.android.libraries.x.d;
import com.google.common.f.j;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/a/a/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1099a = j.i("com.google.android.apps.gsa.search.core.google.a.a.e");
    public final Context b;
    public final AtomicBoolean c = new AtomicBoolean();
    private final p d;
    private final g e;

    public e(Context context, p pVar, g gVar) {
        this.b = context;
        this.d = pVar;
        this.e = gVar;
    }

    public final cn a() {
        if (!this.d.w(az.fx)) {
            return dl.n("");
        }
        cn a2 = d.a(b.a(this.b).b());
        c cVar = new c(this);
        g gVar = this.e;
        return c.g(a2, Exception.class, cVar, gVar.a("Fetching HomeGraph Id from AGSA-C", gVar.b));
    }
}
