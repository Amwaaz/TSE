package com.google.android.apps.gsa.shared.logger.b;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/b/a.class */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.g.a f1461a;
    private final e.a b;

    public a(e.a aVar, com.google.android.libraries.g.a aVar2) {
        this.b = aVar;
        this.f1461a = aVar2;
    }

    @Override // com.google.android.apps.gsa.shared.logger.b.h, com.google.android.apps.gsa.nga.engine.v.i
    public final void a(f fVar) {
        long b = this.f1461a.b();
        ((o) this.b.a()).c(com.google.android.libraries.gsa.e.a.a.b(fVar, b, fVar.c, (String) null, fVar.d));
    }
}
