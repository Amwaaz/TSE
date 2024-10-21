package com.google.android.apps.gsa.shared.logger.b;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/b/h.class */
public abstract class h {
    public abstract void a(f fVar);

    public final void b(w wVar) {
        e eVar = new e();
        eVar.a = wVar;
        a(eVar.a());
    }

    public final void p(w wVar, long j) {
        e eVar = new e();
        eVar.a = wVar;
        eVar.c = j;
        a(eVar.a());
    }
}
