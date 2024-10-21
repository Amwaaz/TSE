package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import j$.time.Duration;
import m.h.a.p;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/d.class */
final class d extends m.c.b.a.h implements p {

    /* renamed from: a, reason: collision with root package name */
    final h f918a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, m.c.g gVar) {
        super(2, gVar);
        this.f918a = hVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((kotlinx.coroutines.ag) obj, (m.c.g) obj2).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        Duration c = com.google.protobuf.b.a.a.c(this.f918a.f922a);
        if (c.isNegative()) {
            com.google.common.f.h d = i.f923a.d();
            d.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
            d.ak(5154);
            d.p("Negative delay, not notifying Bisto.");
        } else {
            com.google.common.f.h d2 = i.f923a.d();
            d2.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
            d2.ak(5153);
            d2.s("Scheduling notification to Bisto with delay %s.", c);
            h hVar = this.f918a;
            com.google.android.libraries.search.assistant.r.v.f(com.google.android.libraries.search.assistant.r.v.a(hVar.c, c, new c(hVar)), com.google.common.util.concurrent.ay.a, f.b);
        }
        return m.w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        return new d(this.f918a, gVar);
    }
}
