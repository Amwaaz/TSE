package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.apps.gsa.shared.util.c.e;
import com.google.android.libraries.gsa.h.a.f;
import com.google.android.libraries.gsa.h.a.l;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.co;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/ba.class */
public final class ba implements com.google.android.libraries.gsa.h.h {

    /* renamed from: a, reason: collision with root package name */
    public final q f1523a;

    public ba(q qVar) {
        this.f1523a = qVar;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn a(String str, com.google.android.libraries.gsa.h.c cVar) {
        e eVar = new e(cVar.getClass(), null, str);
        Runnable coVar = new co(new ay(cVar, 1));
        this.f1523a.a(eVar, coVar);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return coVar;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn b(String str, com.google.android.libraries.gsa.h.c cVar) {
        cn s = dl.s(new f(cVar), new o(this, new e(cVar.getClass(), null, str), 4));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return s;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final /* synthetic */ cn c(String str, long j, com.google.android.libraries.gsa.h.c cVar) {
        return com.google.android.libraries.gsa.h.b.a(this, str, j, cVar);
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn d(String str, Duration duration, com.google.android.libraries.gsa.h.c cVar) {
        cn s = dl.s(new f(cVar), new ax(this, new e(cVar.getClass(), null, str), duration, 0));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return s;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn e(String str, Duration duration, com.google.android.libraries.gsa.h.c cVar) {
        e eVar = new e(cVar.getClass(), null, str);
        cVar.getClass();
        Runnable coVar = new co(new ay(cVar, 1));
        this.f1523a.b(eVar, coVar, duration.toMillis());
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return coVar;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn f(cn cnVar, String str, Class cls, com.google.android.libraries.gsa.h.d dVar) {
        cn h = com.google.common.util.concurrent.c.h(cnVar, cls, new az(dVar, 1), new o(this, new e(dVar.getClass(), null, str), 3));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return h;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn g(cn cnVar, String str, Class cls, com.google.android.libraries.gsa.h.d dVar) {
        cn h = com.google.common.util.concurrent.c.h(cnVar, cls, new com.google.android.libraries.gsa.h.a.g(dVar), new o(this, new e(dVar.getClass(), null, str), 6));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return h;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn h(String str, com.google.android.libraries.gsa.h.g gVar) {
        e eVar = new e(gVar.getClass(), null, str);
        Runnable coVar = new co(new ay(gVar, 2));
        this.f1523a.a(eVar, coVar);
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return coVar;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final /* synthetic */ cn i(String str, long j, com.google.android.libraries.gsa.h.g gVar) {
        return com.google.android.libraries.gsa.h.b.b(this, str, j, gVar);
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn j(String str, Duration duration, com.google.android.libraries.gsa.h.g gVar) {
        e eVar = new e(gVar.getClass(), null, str);
        Runnable coVar = new co(new ay(gVar, 0));
        this.f1523a.b(eVar, coVar, duration.toMillis());
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return coVar;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn k(cn cnVar, String str, com.google.android.libraries.gsa.h.d dVar) {
        cn h = com.google.common.util.concurrent.i.h(cnVar, new az(dVar, 0), new o(this, new e(dVar.getClass(), null, str), 2));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return h;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final cn l(cn cnVar, String str, com.google.android.libraries.gsa.h.d dVar) {
        cn h = com.google.common.util.concurrent.i.h(cnVar, new com.google.android.libraries.gsa.h.a.g(dVar), new o(this, new e(dVar.getClass(), null, str), 5));
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return h;
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final void m(cn cnVar, String str, com.google.android.libraries.gsa.h.e eVar) {
        dl.y(cnVar, new l(eVar), new n(this, new e(eVar.getClass(), null, str), 5));
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final void n(String str, com.google.android.libraries.gsa.h.f fVar) {
        e eVar = new e(fVar.getClass(), null, str);
        this.f1523a.a(eVar, new bc(fVar, eVar));
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final /* synthetic */ void o(String str, long j, com.google.android.libraries.gsa.h.f fVar) {
        com.google.android.libraries.gsa.h.b.c(this, str, j, fVar);
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final void p(String str, Duration duration, com.google.android.libraries.gsa.h.f fVar) {
        e eVar = new e(fVar.getClass(), null, str);
        this.f1523a.b(eVar, new bc(fVar, eVar), duration.toMillis());
    }

    @Override // com.google.android.libraries.gsa.h.h
    public final /* synthetic */ void r(com.google.android.libraries.gsa.h.c cVar) {
        com.google.android.libraries.gsa.h.b.d(this, cVar);
    }
}
