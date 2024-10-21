package com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a;

import com.google.android.apps.gsa.l.g.f;
import com.google.android.apps.gsa.opa.a.a.a;
import com.google.android.apps.gsa.opa.smartspace.p;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.search.assistant.verticals.ambient.n.r;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.protobuf.MessageLite;
import com.google.protos.ap.a.a.s;
import com.google.protos.o.b.v;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/b/g/a/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f1754a;
    public final p b;
    public final r c;
    private final f d;
    private final cq e;
    private final AtomicReference f = new AtomicReference(false);
    private final an g;

    public e(f fVar, an anVar, cq cqVar, p pVar, a aVar, r rVar) {
        this.d = fVar;
        this.g = anVar;
        this.b = pVar;
        this.e = cqVar;
        this.f1754a = aVar.b(this);
        this.c = rVar;
    }

    public final cn a(v vVar, MessageLite messageLite, String str) {
        return i.g(b(vVar, messageLite, str), ex.b(new c()), this.e);
    }

    public final cn b(v vVar, MessageLite messageLite, String str) {
        cn g;
        String r = this.g.r();
        if (r == null) {
            int i = fl.e;
            g = dl.n(ni.a);
        } else {
            cn h = i.h((cn) this.d.f366a.a(), new com.google.android.apps.gsa.l.g.d(r, vVar, str, s.a), ay.a);
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
            g = i.g(h, ex.b(new a(this, messageLite)), this.e);
        }
        if (vVar == v.ar) {
            dl.y(g, ex.h(new d(this, str, !((Boolean) this.f.getAndSet(true)).booleanValue())), this.e);
        }
        return g;
    }
}
