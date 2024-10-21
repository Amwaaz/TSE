package com.google.android.apps.gsa.nga.engine.ui.e.h;

import androidx.core.d.e$;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Map f756a = new HashMap();
    public final com.google.android.apps.gsa.shared.util.q.a b;
    public final com.google.android.libraries.gsa.h.h c;

    public k(com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.libraries.gsa.h.h hVar) {
        this.b = aVar;
        this.c = hVar;
    }

    public final com.google.android.apps.gsa.nga.shared.s.f a(com.google.android.apps.gsa.shared.k.d dVar) {
        return b(dVar.f1434a, new i(this, dVar, 1));
    }

    public final com.google.android.apps.gsa.nga.shared.s.f b(final int i, final Supplier supplier) {
        Map map = this.f756a;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            throw new IllegalStateException(String.format("Attempting to register multiple observers for flag: %s", valueOf));
        }
        final com.google.android.apps.gsa.nga.shared.s.i iVar = new com.google.android.apps.gsa.nga.shared.s.i(e$.ExternalSyntheticApiModelOutline0.m(supplier), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
        this.f756a.put(valueOf, new Runnable(this, iVar, supplier, i) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.j

            /* renamed from: a, reason: collision with root package name */
            public final k f755a;
            public final com.google.android.apps.gsa.nga.shared.s.e b;
            public final Supplier c;
            public final int d;

            {
                this.f755a = this;
                this.b = iVar;
                this.c = supplier;
                this.d = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.gsa.nga.shared.s.ad.b(this.f755a.c, this.b, e$.ExternalSyntheticApiModelOutline0.m(this.c), String.valueOf(this.d));
            }
        });
        return iVar;
    }
}
