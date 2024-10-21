package com.google.android.apps.gsa.search.shared.service.b;

import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/b/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1334a;
    public final d b;
    private final h c;

    public b(d dVar, h hVar) {
        this.b = dVar;
        this.c = hVar;
    }

    public final void a(final boolean z) {
        this.c.n(true != z ? "SearchSingletonAnchor:disable" : "SearchSingletonAnchor:enable", new f(this, z) { // from class: com.google.android.apps.gsa.search.shared.service.b.a

            /* renamed from: a, reason: collision with root package name */
            public final b f1333a;
            public final boolean b;

            {
                this.f1333a = this;
                this.b = z;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                b bVar = this.f1333a;
                boolean z2 = bVar.f1334a;
                boolean z3 = this.b;
                if (z2 != z3) {
                    bVar.f1334a = z3;
                    d dVar = bVar.b;
                    if (z3) {
                        dVar.b();
                    } else {
                        dVar.a();
                    }
                }
            }
        });
    }
}
