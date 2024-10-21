package com.google.android.apps.gsa.assistant.settings.features.x.a;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.x.b;
import com.google.android.apps.gsa.search.core.google.gaia.b.a.c;
import com.google.apps.tiktok.g.ax;
import com.google.apps.tiktok.g.q;
import com.google.apps.tiktok.tracing.contrib.c.e;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/features/x/a/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f252a;
    public final ax b;
    private final c c;

    public j(c cVar, Context context, ax axVar) {
        this.c = cVar;
        this.f252a = context;
        this.b = axVar;
    }

    public final cn a() {
        cn c = c();
        b bVar = new b(3);
        return com.google.common.util.concurrent.i.g(c, ex.b(bVar), ay.a);
    }

    public final cn b() {
        cn c = c();
        b bVar = new b(1);
        return com.google.common.util.concurrent.i.g(c, ex.b(bVar), ay.a);
    }

    public final cn c() {
        return e.g(d()).i(new a(), ay.a).h(new b(0), ay.a);
    }

    public final cn d() {
        cn b = this.c.b();
        h hVar = new h(this, 1);
        return com.google.common.util.concurrent.i.g(b, ex.b(hVar), ay.a);
    }

    public final cn e(b bVar) {
        cn d = d();
        g gVar = new g(bVar);
        cn h = com.google.common.util.concurrent.i.h(d, ex.e(gVar), ay.a);
        q qVar = new q();
        qVar.a = h;
        qVar.b = "lockscreensettingsdata";
        qVar.c = new h(bVar, 0);
        return this.b.a(qVar.a());
    }
}
