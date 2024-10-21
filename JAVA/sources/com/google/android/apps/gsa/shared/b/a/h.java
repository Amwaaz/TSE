package com.google.android.apps.gsa.shared.b.a;

import m.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/h.class */
public final class h extends m.c.b.a.h implements m.h.a.s {

    /* renamed from: a, reason: collision with root package name */
    Object f1377a;
    Object b;
    Object c;
    final u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, m.c.g gVar) {
        super(5, gVar);
        this.d = uVar;
    }

    public final Object b(Object obj) {
        com.google.android.libraries.search.assistant.invocation.c.a.a.b.a aVar;
        m.k.b(obj);
        Object obj2 = this.f1377a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        u uVar = this.d;
        if (((com.google.android.libraries.assistant.auto.jumpboost.p.a) uVar.e.a()).f2753a) {
            com.google.common.f.h d = u.f1390a.d();
            d.ak(8626);
            d.p("We are in the car mode.");
            aVar = com.google.android.libraries.search.assistant.invocation.c.a.a.b.a.b;
        } else if (obj4 == com.google.android.apps.gsa.assistant.shared.b.CONNECTED && com.google.android.apps.gsa.shared.util.p.f.contains(obj2) && m.a.t.aO(new com.google.android.libraries.assistant.d.b.d[]{com.google.android.libraries.assistant.d.b.d.FREE_NAVIGATION_IN_FOREGROUND, com.google.android.libraries.assistant.d.b.d.GUIDED_NAVIGATION_IN_FOREGROUND}).contains(obj3)) {
            com.google.common.f.h d2 = u.f1390a.d();
            d2.ak(8625);
            d2.p("GMM integration is active.");
            aVar = com.google.android.libraries.search.assistant.invocation.c.a.a.b.a.c;
        } else if (obj4 == com.google.android.apps.gsa.assistant.shared.b.CONNECTED && u.b.contains(obj2)) {
            com.google.common.f.h d3 = u.f1390a.d();
            d3.ak(8624);
            d3.p("Waze or Jacquard is active.");
            aVar = com.google.android.libraries.search.assistant.invocation.c.a.a.b.a.c;
        } else if (((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) uVar.f.a()).i()) {
            com.google.common.f.h d4 = u.f1390a.d();
            d4.ak(8623);
            d4.p("Morris is running.");
            aVar = com.google.android.libraries.search.assistant.invocation.c.a.a.b.a.c;
        } else {
            aVar = com.google.android.libraries.search.assistant.invocation.c.a.a.b.a.f4230a;
        }
        return aVar;
    }

    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h hVar = new h(this.d, (m.c.g) obj5);
        hVar.f1377a = (String) obj;
        hVar.b = (com.google.android.libraries.assistant.d.b.d) obj2;
        hVar.c = (com.google.android.apps.gsa.assistant.shared.b) obj3;
        return hVar.b(w.a);
    }
}
