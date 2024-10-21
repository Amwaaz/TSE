package com.google.android.apps.gsa.shared.b.a;

import kotlinx.coroutines.b.dl;
import m.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/i.class */
public final class i extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f1378a;
    final u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, m.c.g gVar) {
        super(2, gVar);
        this.b = uVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((com.google.android.libraries.search.assistant.invocation.c.a.a.b.a) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        dl dlVar;
        Object c;
        m.k.b(obj);
        com.google.android.libraries.search.assistant.invocation.c.a.a.b.a aVar = (com.google.android.libraries.search.assistant.invocation.c.a.a.b.a) this.f1378a;
        com.google.common.f.h d = u.f1390a.d();
        d.ak(8620);
        d.s("Assistant special experience changed to %s.", aVar.name());
        com.google.android.libraries.search.assistant.invocation.c.a.a.b.e eVar = (com.google.android.libraries.search.assistant.invocation.c.a.a.b.e) this.b.h.a();
        aVar.getClass();
        do {
            dlVar = eVar.d;
            c = dlVar.c();
        } while (!dlVar.h(c, aVar));
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        i iVar = new i(this.b, gVar);
        iVar.f1378a = obj;
        return iVar;
    }
}
