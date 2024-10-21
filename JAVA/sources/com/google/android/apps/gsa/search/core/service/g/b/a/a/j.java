package com.google.android.apps.gsa.search.core.service.g.b.a.a;

import com.google.common.o.hb;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.bs;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/g/b/a/a/j.class */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1212a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.service.g.b.a.a.j");
    private final e.a b;

    public j(e.a aVar) {
        this.b = aVar;
    }

    public final cn a(final com.google.android.apps.gsa.search.core.service.f.b bVar, final boolean z) {
        return ((com.google.android.libraries.gsa.h.h) this.b.a()).h("Unloading worker [" + bVar.id() + "]", new com.google.android.libraries.gsa.h.g(this, bVar, z) { // from class: com.google.android.apps.gsa.search.core.service.g.b.a.a.i

            /* renamed from: a, reason: collision with root package name */
            public final j f1211a;
            public final com.google.android.apps.gsa.search.core.service.f.b b;
            public final boolean c;

            {
                this.f1211a = this;
                this.b = bVar;
                this.c = z;
            }

            @Override // com.google.android.libraries.gsa.h.g
            public final void run() {
                j jVar = this.f1211a;
                com.google.android.apps.gsa.search.core.service.f.b bVar2 = this.b;
                try {
                    jVar.b(bVar2, this.c);
                } catch (Throwable th) {
                    com.google.common.f.h g = j.f1212a.e().g(th);
                    g.ak(7422);
                    g.s("Error occurred while unloading worker [%s]", bVar2.id());
                }
            }
        });
    }

    public final void b(com.google.android.apps.gsa.search.core.service.f.b bVar, boolean z) {
        bVar.gR();
        if (z) {
            com.google.android.apps.gsa.s.c ic = bVar.ic();
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 760;
            createBuilder.copyOnWrite();
            hb hbVar2 = createBuilder.instance;
            ic.getClass();
            bs bsVar = hbVar2.az;
            if (!bsVar.c()) {
                hbVar2.az = bi.mutableCopy(bsVar);
            }
            hbVar2.az.g(ic.sd);
            com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
        }
    }

    public final boolean c(com.google.android.apps.gsa.search.core.service.f.b bVar) {
        return bVar.e();
    }
}
