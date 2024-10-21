package com.google.android.apps.gsa.search.core.service.f.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/f/a/a.class */
final class a implements com.google.android.libraries.gsa.h.e {

    /* renamed from: a, reason: collision with root package name */
    final String f1194a;
    final b b;

    public a(b bVar, String str) {
        this.f1194a = str;
        this.b = bVar;
    }

    @Override // com.google.android.libraries.gsa.h.e
    public final void gJ(Throwable th) {
        b bVar = this.b;
        if (bVar.c()) {
            return;
        }
        bVar.f1195a.f1276a.put(this.f1194a, 6);
    }

    @Override // com.google.android.libraries.gsa.h.e
    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        com.google.android.apps.gsa.search.core.service.f.b bVar = (com.google.android.apps.gsa.search.core.service.f.b) obj;
        b bVar2 = this.b;
        if (bVar2.c()) {
            return;
        }
        String id = bVar.id();
        ((i) bVar2.b.a()).b(bVar);
        bVar2.f1195a.f1276a.put(id, 3);
    }
}
