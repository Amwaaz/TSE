package com.google.android.apps.gsa.search.core.service.f;

import com.google.android.apps.gsa.shared.util.debug.a.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/f/a.class */
public abstract class a implements b {
    public final com.google.android.apps.gsa.s.c d;
    public final String e;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(com.google.android.apps.gsa.s.c cVar, String str) {
        this.d = cVar;
        this.e = str;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public void gR() {
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public void hq(f fVar) {
        fVar.q(getClass().getName());
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final com.google.android.apps.gsa.s.c ic() {
        return this.d;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final String id() {
        return this.e;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    @Deprecated
    public void ie() {
    }

    /* renamed from: if, reason: not valid java name */
    protected final com.google.android.apps.gsa.shared.aq.b m439if(com.google.android.apps.gsa.search.core.y.a.a aVar, String str, com.google.android.apps.gsa.s.c cVar) {
        androidx.compose.ui.l.f.e(cVar != this.d);
        return aVar.b(str, cVar, this.d);
    }
}
