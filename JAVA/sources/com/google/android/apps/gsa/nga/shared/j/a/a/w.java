package com.google.android.apps.gsa.nga.shared.j.a.a;

import com.google.common.f.a.e;
import m.c.b.a.h;
import m.c.g;
import m.h.a.p;
import m.k;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/w.class */
final class w extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f957a;

    public w(g gVar) {
        super(2, gVar);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((Throwable) obj, (g) obj2).b(m.w.a);
    }

    public final Object b(Object obj) {
        k.b(obj);
        Throwable th = (Throwable) this.f957a;
        com.google.common.f.h e = y.f959a.e();
        e.aj(e.a, "TRG.HotwordLegacyAccount");
        com.google.common.f.h g = e.g(th);
        g.ak(5151);
        g.p("Retrying legacy hotword consumer account flow after failure.");
        return m.w.a;
    }

    public final g c(Object obj, g gVar) {
        w wVar = new w(gVar);
        wVar.f957a = obj;
        return wVar;
    }
}
