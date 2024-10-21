package com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e;

import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g;
import com.google.android.apps.gsa.v.c;
import com.google.apps.tiktok.tracing.contrib.c.h;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/d/e/d.class */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Set f1742a = new CopyOnWriteArraySet();
    private final g b;

    public d(g gVar) {
        this.b = gVar;
    }

    public final com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d a() {
        return this.b.b();
    }

    public final cn b(e eVar) {
        if (eVar == null || !this.f1742a.add(eVar) || this.f1742a.size() != 1) {
            return c.b;
        }
        this.b.b().e.name();
        return this.b.c(new a(this));
    }

    public final cn c(MessageLite messageLite) {
        Stream map = Collection._EL.stream(this.f1742a).map(new b(messageLite));
        int i = fl.e;
        return h.a((Iterable) map.collect(bs.a)).a(new c(), ay.a);
    }

    public final cn e(e eVar) {
        return (this.f1742a.remove(eVar) && this.f1742a.isEmpty()) ? this.b.e() : c.b;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.l(this.b);
    }
}
