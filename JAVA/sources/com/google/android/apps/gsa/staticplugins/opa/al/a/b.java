package com.google.android.apps.gsa.staticplugins.opa.al.a;

import android.content.Context;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.apps.gsa.shared.util.as;
import com.google.android.libraries.ax.h;
import com.google.android.libraries.search.t.i.y;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/al/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final y f1734a;
    public final String b;
    public final String c;
    private final Optional d;

    public b(y yVar, Context context, a aVar, Optional optional) {
        this.f1734a = yVar;
        this.b = as.b(context);
        this.c = aVar.a();
        this.d = optional;
    }

    public final String a() {
        return ((com.google.android.apps.gsa.nga.shared.q.f.a) this.d.map(new a()).orElse(com.google.android.apps.gsa.nga.shared.q.f.a.a)).e;
    }

    public final void b(com.google.android.apps.gsa.staticplugins.opa.al.a aVar) {
        ((h) this.f1734a.W.a()).b(1L, this.b, this.c, a(), aVar.d);
    }

    public final void c(boolean z, String str) {
        ((h) this.f1734a.ad.a()).b(1L, Boolean.valueOf(z), str);
    }
}
