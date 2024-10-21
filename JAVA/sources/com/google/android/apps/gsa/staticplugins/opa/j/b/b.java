package com.google.android.apps.gsa.staticplugins.opa.j.b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.aa.a.a;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.libraries.assistant.contexttrigger.c.a.c;
import com.google.android.libraries.assistant.contexttrigger.c.a.d;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/j/b/b.class */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1771a = j.i("com.google.android.apps.gsa.staticplugins.opa.j.b.b");
    private final com.google.android.apps.gsa.shared.util.q.a b;
    private final d c;

    public b(com.google.android.apps.gsa.shared.util.q.a aVar, d dVar) {
        this.b = aVar;
        this.c = dVar;
    }

    @Override // com.google.android.apps.gsa.shared.aa.a.a
    public final void a(Context context) {
        ab abVar = e.a;
        cn a2 = this.c.a();
        a aVar = new a(1);
        dl.y(a2, ex.h(aVar), ay.a);
    }

    @Override // com.google.android.apps.gsa.shared.aa.a.a
    public final void b() {
        ab abVar = e.a;
        d dVar = this.c;
        Stream map = Collection._EL.stream(dVar.f2880a.g()).map(new com.google.android.libraries.assistant.contexttrigger.c.a.a());
        int i = fl.e;
        com.google.apps.tiktok.tracing.contrib.c.e h = com.google.apps.tiktok.tracing.contrib.c.e.g(dl.j((Iterable) map.collect(bs.a))).h(new c(1), dVar.b);
        a aVar = new a(0);
        dl.y(h, ex.h(aVar), ay.a);
    }

    @Override // com.google.android.apps.gsa.shared.aa.a.a
    public final boolean c() {
        return this.b.i(bc.z);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.i(26);
        ab abVar = e.a;
    }
}
