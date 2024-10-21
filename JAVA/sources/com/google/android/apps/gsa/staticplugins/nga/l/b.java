package com.google.android.apps.gsa.staticplugins.nga.l;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.at;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.j;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/l/b.class */
public class b implements com.google.android.apps.gsa.search.core.g.b.a, at {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1694a = j.i("com.google.android.apps.gsa.staticplugins.nga.l.b");
    private NgaState b = null;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final com.google.android.apps.gsa.nga.shared.n.e d;
    private final com.google.android.apps.gsa.nga.shared.n.e e;
    private final com.google.android.apps.gsa.nga.shared.n.e f;

    public b(h hVar, k kVar, k kVar2) {
        final int i = 1;
        this.d = kVar2.c(hVar, new be(i) { // from class: com.google.android.apps.gsa.staticplugins.nga.l.a

            /* renamed from: a, reason: collision with root package name */
            private final int f1693a;

            {
                this.f1693a = i;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                int i2 = this.f1693a;
                if (i2 == 0) {
                    ((c) obj).b();
                } else if (i2 != 1) {
                    ((c) obj).c();
                } else {
                    ((e) obj).i();
                }
            }
        });
        final int i2 = 0;
        this.e = kVar.c(hVar, new be(i2) { // from class: com.google.android.apps.gsa.staticplugins.nga.l.a

            /* renamed from: a, reason: collision with root package name */
            private final int f1693a;

            {
                this.f1693a = i2;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                int i22 = this.f1693a;
                if (i22 == 0) {
                    ((c) obj).b();
                } else if (i22 != 1) {
                    ((c) obj).c();
                } else {
                    ((e) obj).i();
                }
            }
        });
        final int i3 = 2;
        this.f = kVar.c(hVar, new be(i3) { // from class: com.google.android.apps.gsa.staticplugins.nga.l.a

            /* renamed from: a, reason: collision with root package name */
            private final int f1693a;

            {
                this.f1693a = i3;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                int i22 = this.f1693a;
                if (i22 == 0) {
                    ((c) obj).b();
                } else if (i22 != 1) {
                    ((c) obj).c();
                } else {
                    ((e) obj).i();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.apps.gsa.shared.util.c.be, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.apps.gsa.shared.util.c.be, java.lang.Object] */
    private final void c(NgaState ngaState) {
        synchronized (this) {
            NgaState ngaState2 = this.b;
            NgaState ngaState3 = NgaState.DISABLED;
            if (ngaState != ngaState3 && (ngaState2 == null || ngaState2 == ngaState3)) {
                com.google.android.apps.gsa.nga.shared.n.e eVar = this.e;
                eVar.d(eVar.f966a);
            } else if (ngaState2 != ngaState && ngaState2 != null && ngaState == ngaState3) {
                com.google.android.apps.gsa.nga.shared.n.e eVar2 = this.f;
                eVar2.d(eVar2.f966a);
            }
            this.b = ngaState;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.apps.gsa.shared.util.c.be, java.lang.Object] */
    private final void d() {
        if (this.c.compareAndSet(false, true)) {
            com.google.android.apps.gsa.nga.shared.n.e eVar = this.d;
            eVar.d(eVar.f966a);
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void a(NgaState ngaState) {
        throw null;
    }

    @Override // com.google.android.apps.gsa.search.core.g.b.a
    public final void b(boolean z, boolean z2) {
        d();
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void ir(NgaState ngaState, boolean z) {
        if (!z) {
            d();
            c(ngaState);
        } else {
            com.google.common.f.h d = f1694a.d();
            d.ak(15124);
            d.p("Skipped search init as TNG is active");
        }
    }
}
