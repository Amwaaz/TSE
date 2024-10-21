package com.google.android.apps.gsa.assist.c;

import com.google.android.apps.gsa.assist.c.a.a;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.at;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assist/c/d.class */
public final class d implements a, at {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f237a;
    private final e.a b;
    private NgaState c = NgaState.DISABLED;

    public d(e.a aVar, e.a aVar2) {
        this.f237a = aVar;
        this.b = aVar2;
    }

    private final a h() {
        return this.c.b() ? (a) this.f237a.a() : (a) this.b.a();
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void a(NgaState ngaState) {
        throw null;
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final void c() {
        h().c();
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final boolean d() {
        return h().d();
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final boolean e() {
        return h().e();
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final boolean f() {
        return h().f();
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final boolean g() {
        return h().g();
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final void go(boolean z) {
        h().go(z);
    }

    @Override // com.google.android.apps.gsa.assist.c.a.a
    public final void gp() {
        h().gp();
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final /* synthetic */ void ir(NgaState ngaState, boolean z) {
        this.c = ngaState;
    }
}
