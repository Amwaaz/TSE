package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.binaries.velvet.app.os;
import com.google.android.apps.gsa.shared.ai.b;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.libraries.search.t.a.a.a.e;
import e.b.a.c.b.l;
import e.b.b.c;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/q.class */
abstract class q extends b implements c {

    /* renamed from: a, reason: collision with root package name */
    private volatile l f1219a;
    private final Object b = new Object();
    private boolean c = false;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l gU() {
        if (this.f1219a == null) {
            synchronized (this.b) {
                if (this.f1219a == null) {
                    this.f1219a = new l(this);
                }
            }
        }
        return this.f1219a;
    }

    public final Object jJ() {
        return gU().jJ();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            SearchService searchService = (SearchService) this;
            os osVar = (os) gU().jJ();
            searchService.b = (com.google.android.apps.gsa.shared.util.debug.d) osVar.b.aD.a();
            searchService.c = (a) osVar.b.gm.a();
            searchService.g = (com.google.android.apps.gsa.search.shared.service.b.d) osVar.b.hF.a();
            searchService.d = (e) osVar.b.f319a.az.a();
            searchService.e = (com.google.android.libraries.g.a) osVar.b.g.a();
        }
        super.onCreate();
    }
}
