package com.google.android.apps.gsa.search.core.state;

import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bz.class */
public final class bz implements cs {

    /* renamed from: a, reason: collision with root package name */
    private final by f1257a;
    private final w b;
    private final w c;
    private final w d;
    private final w e;
    private final w f;
    private final w g;

    public bz(by byVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        this.f1257a = byVar;
        this.b = new w(aVar);
        this.c = new w(aVar2);
        this.d = new w(aVar3);
        this.e = new w(aVar4);
        this.f = new w(aVar5);
        this.g = new w(aVar6);
    }

    @Override // com.google.android.apps.gsa.search.core.state.cs
    public final /* synthetic */ cq a() {
        return this.f1257a;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cs
    public final void b(cl clVar) {
        boolean h;
        this.b.b(clVar);
        this.c.b(clVar);
        this.d.b(clVar);
        this.e.b(clVar);
        this.f.b(clVar);
        this.g.b(clVar);
        w wVar = this.b;
        if (wVar.f1313a || this.c.f1313a || this.d.f1313a || this.e.f1313a || this.f.f1313a || this.g.f1313a) {
            by byVar = this.f1257a;
            w wVar2 = this.c;
            w wVar3 = this.d;
            w wVar4 = this.e;
            w wVar5 = this.f;
            w wVar6 = this.g;
            boolean a2 = byVar.a();
            if (wVar.f1313a) {
                byVar.c.h(4L, ((i) wVar.a()).f1302a);
            }
            if (wVar2.f1313a || wVar4.f1313a || wVar5.f1313a || wVar6.f1313a) {
                h = byVar.c.h(1L, (byVar.b && ((com.google.android.apps.gsa.search.core.state.d.ae) wVar4.a()).z() && !((j) wVar2.a()).f1303a.y() && ((bk) wVar5.a()).D()) ? ((TtsState) wVar6.a()).y() : false);
            } else {
                h = false;
            }
            long j = ((l) wVar3.a()).f1305a;
            boolean a3 = byVar.a();
            long j2 = byVar.d;
            if (j2 != j) {
                if (a3) {
                    byVar.f1256a.i(j, true);
                }
                if (a2) {
                    byVar.f1256a.i(j2, false);
                }
                byVar.d = j;
            } else if (a2 != a3) {
                byVar.f1256a.i(j2, a3);
            }
            if (h) {
                this.f1257a.an();
            }
        }
    }
}
