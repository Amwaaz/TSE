package com.google.android.apps.gsa.speech.o;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.ek;
import com.google.ap.e.c.b.m;
import com.google.ap.e.c.b.u;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/o/h.class */
public final class h implements com.google.android.apps.gsa.search.core.h.c {

    /* renamed from: a, reason: collision with root package name */
    final e.a f1615a;

    public h(e.a aVar) {
        this.f1615a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, com.google.android.apps.gsa.search.core.h.i iVar) {
        i iVar2 = (i) this.f1615a.a();
        ab abVar = e.a;
        m q = pVar.q(ek.a, m.a.getParserForType());
        if (q != null) {
            u builder = i.b(iVar2.f1616a).toBuilder();
            builder.mergeFrom(q);
            m build = builder.build();
            synchronized (iVar2.b) {
                if (!build.equals(iVar2.c) && i.c(build)) {
                    iVar2.c = build;
                    iVar2.notifyChanged();
                    i.d(iVar2.d, build);
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final /* synthetic */ void iW(p pVar) {
    }
}
