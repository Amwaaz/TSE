package com.google.android.apps.gsa.search.core.service.g.b.a;

import com.google.android.apps.gsa.search.core.service.g.b.a.a.h;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a/a.class */
public final class a implements com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.search.core.service.b.a {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.apps.gsa.search.core.service.g.b.a.a.b f1203a;

    public a(String str, h hVar) {
        this.f1203a = hVar.a(str, ci.a);
    }

    @Override // com.google.android.apps.gsa.search.core.service.b.a
    public final void a() {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.service.g.b.a.a.b bVar = this.f1203a;
            if (bVar == null) {
                return;
            }
            bVar.a();
            this.f1203a = null;
        }
    }

    public final cn b() {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.service.g.b.a.a.b bVar = this.f1203a;
            if (bVar == null) {
                return dl.m(new com.google.android.apps.gsa.search.core.service.b.b("WorkerHandler is disposed"));
            }
            com.google.android.apps.gsa.search.core.service.g.b.a.a.a b = bVar.b();
            this.f1203a = b.b;
            return b.f1204a;
        }
    }

    public final void c() {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.service.g.b.a.a.b bVar = this.f1203a;
            if (bVar == null) {
                return;
            }
            bVar.e();
        }
    }

    public final void e() {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.service.g.b.a.a.b bVar = this.f1203a;
            if (bVar == null) {
                return;
            }
            this.f1203a = bVar.c();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        synchronized (this) {
            com.google.android.apps.gsa.search.core.service.g.b.a.a.b bVar = this.f1203a;
            if (bVar == null) {
                fVar.b("disposed").a(new d(true, false));
            } else {
                fVar.k(bVar);
            }
        }
    }
}
