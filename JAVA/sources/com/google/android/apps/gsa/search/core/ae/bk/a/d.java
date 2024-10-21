package com.google.android.apps.gsa.search.core.ae.bk.a;

import android.app.Notification;
import com.google.android.apps.gsa.search.core.ae.bk.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.ssb.b;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bk/a/d.class */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1074a;

    public d(e.a aVar) {
        this.f1074a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void a(long j) {
        ((h) this.f1074a.a()).c(new a(j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void c() {
        ((h) this.f1074a.a()).c(new b());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void f() {
        ((h) this.f1074a.a()).c(new c());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void g(long j) {
        ((h) this.f1074a.a()).c(new e(j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void h(b bVar) {
        ((h) this.f1074a.a()).c(new f(bVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void i(long j, boolean z) {
        ((h) this.f1074a.a()).c(new g(j, z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void j(boolean z) {
        ((h) this.f1074a.a()).c(new h(z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void k(Query query, List list, CardDecision cardDecision, int i) {
        ((h) this.f1074a.a()).c(new i(query, list, cardDecision, i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void l() {
        ((h) this.f1074a.a()).c(new l());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void m(int i) {
        ((h) this.f1074a.a()).c(new n(i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void n(Notification notification) {
        ((h) this.f1074a.a()).c(new j(notification));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void o(boolean z) {
        ((h) this.f1074a.a()).c(new k(z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void p(Notification notification) {
        ((h) this.f1074a.a()).c(new m(notification));
    }
}
