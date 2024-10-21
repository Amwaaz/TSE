package com.google.android.apps.gsa.publicsearch;

import com.google.android.apps.gsa.binaries.velvet.app.jo;
import com.google.android.apps.gsa.binaries.velvet.app.os;
import com.google.android.apps.gsa.smartspace.c.e;
import e.b.a.c.b.l;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/publicsearch/a.class */
abstract class a extends com.google.android.apps.gsa.shared.ai.b implements e.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private volatile l f1034a;
    private final Object b = new Object();
    private boolean c = false;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l gU() {
        if (this.f1034a == null) {
            synchronized (this.b) {
                if (this.f1034a == null) {
                    this.f1034a = new l(this);
                }
            }
        }
        return this.f1034a;
    }

    public final Object jJ() {
        return gU().jJ();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            PublicSearchService publicSearchService = (PublicSearchService) this;
            os osVar = (os) gU().jJ();
            publicSearchService.c = e.c.c.b(osVar.b.f319a.S);
            publicSearchService.d = new com.google.android.apps.search.lens.e.j(osVar.b.f, osVar.j, osVar.k);
            jo joVar = osVar.b;
            publicSearchService.e = new e(joVar.hI, joVar.gv);
        }
        super.onCreate();
    }
}
